package org.test.threadlocal;

public class TestNum {  
    // ��ͨ�������ڲ��า��ThreadLocal��initialValue()������ָ����ʼֵ  
    private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>() {  
        public Integer initialValue() {  
            return 0;  
        }  
    };  
  
    // �ڻ�ȡ��һ������ֵ  
    public int getNextNum() {  
        seqNum.set(seqNum.get() + 1);  
        return seqNum.get();  
    }  
  
    public static void main(String[] args) {  
        TestNum sn = new TestNum();  
        // �� 3���̹߳���sn�����Բ������к�  
        TestClient t1 = new TestClient(sn);  
        TestClient t2 = new TestClient(sn);  
        TestClient t3 = new TestClient(sn);  
        t1.start();  
        try {
        	Thread.sleep(200);
        	t2.start();  
        	Thread.sleep(200);
        	t3.start();  
        	Thread.sleep(200);
			
		} catch (Exception e) {
		}
    }  
  
    private static class TestClient extends Thread {  
        private TestNum sn;  
  
        public TestClient(TestNum sn) {  
            this.sn = sn;  
        }  
  
        public void run() {  
            for (int i = 0; i < 3; i++) {  
                // ��ÿ���̴߳��3������ֵ  
                System.out.println("thread[" + Thread.currentThread().getName() + "] --> sn["  
                         + sn.getNextNum() + "]");  
            }  
        }  
    }  
}  
