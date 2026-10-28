package jh3;

import gh3.C15859d;
import p249jc.C21567b;

/* JADX INFO: renamed from: jh3.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21700a {

    /* JADX INFO: renamed from: a */
    public static volatile C15859d f83331a = new C15859d(1);

    /* JADX INFO: renamed from: b */
    public static volatile C21567b f83332b = new C21567b(5);

    /* JADX INFO: renamed from: a */
    public static void m61126a(Throwable th3) {
        try {
            f83331a.mo9472b(th3);
        } catch (Throwable th4) {
            System.err.println("The onError handler threw an Exception. It shouldn't. => " + th4.getMessage());
            th4.printStackTrace();
            Thread threadCurrentThread = Thread.currentThread();
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th4);
            Thread threadCurrentThread2 = Thread.currentThread();
            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Throwable m61127b(Throwable th3) {
        return (Throwable) f83332b.mo1678b(th3);
    }
}
