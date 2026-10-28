package io.ktor.utils.p228io;

import bc3.InterfaceC3070x;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import l83.C23467m;
import m83.AbstractC25260n;
import p026b2.C2298d;
import p249jc.AbstractC21598x;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.ktor.utils.io.x */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20031x {

    /* JADX INFO: renamed from: a */
    public static final int f75143a = m55863a(-1, Throwable.class);

    /* JADX INFO: renamed from: b */
    public static final ReentrantReadWriteLock f75144b = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c */
    public static final WeakHashMap f75145c = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public static final int m55863a(int i13, Class cls) {
        Object objM107888l;
        AbstractC21598x.m60666V(cls);
        int i14 = 0;
        do {
            try {
                Field[] declaredFields = cls.getDeclaredFields();
                AbstractC22676k.m65749i(declaredFields, "declaredFields");
                int i15 = 0;
                for (Field field : declaredFields) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i15++;
                    }
                }
                i14 += i15;
                cls = cls.getSuperclass();
            } catch (Throwable th3) {
                objM107888l = AbstractC34132o.m107888l(th3);
            }
        } while (cls != null);
        objM107888l = Integer.valueOf(i14);
        Object objValueOf = Integer.valueOf(i13);
        if (objM107888l instanceof C23467m) {
            objM107888l = objValueOf;
        }
        return ((Number) objM107888l).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0112 A[EDGE_INSN: B:105:0x0112->B:64:0x0112 BREAK  A[LOOP:3: B:41:0x00b1->B:108:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[LOOP:3: B:41:0x00b1->B:108:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final Throwable m55864b(Throwable exception, Throwable cause) {
        Object objM107888l;
        C20029v c20029v;
        WeakHashMap weakHashMap = f75145c;
        AbstractC22676k.m65750j(exception, "exception");
        AbstractC22676k.m65750j(cause, "cause");
        if (exception instanceof InterfaceC3070x) {
            try {
                objM107888l = ((InterfaceC3070x) exception).mo8826a();
            } catch (Throwable th3) {
                objM107888l = AbstractC34132o.m107888l(th3);
            }
            return (Throwable) (objM107888l instanceof C23467m ? null : objM107888l);
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f75144b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            Function1 function1 = (Function1) weakHashMap.get(exception.getClass());
            lock.unlock();
            if (function1 != null) {
                return (Throwable) function1.invoke(exception);
            }
            int i13 = 0;
            if (f75143a != m55863a(0, exception.getClass())) {
                ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i14 = 0; i14 < readHoldCount; i14++) {
                    lock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    weakHashMap.put(exception.getClass(), C20030w.f75140x);
                    while (i13 < readHoldCount) {
                        lock2.lock();
                        i13++;
                    }
                    return null;
                } finally {
                    while (i13 < readHoldCount) {
                        lock2.lock();
                        i13++;
                    }
                    writeLock.unlock();
                }
            }
            Constructor<?>[] constructors = exception.getClass().getConstructors();
            AbstractC22676k.m65749i(constructors, "exception.javaClass.constructors");
            C20029v c20029v2 = null;
            for (Constructor constructor : AbstractC25260n.m74041Q0(constructors, new C2298d(14))) {
                AbstractC22676k.m65749i(constructor, "constructor");
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length = parameterTypes.length;
                if (length != 0) {
                    if (length == 1) {
                        Class<?> cls = parameterTypes[0];
                        if (AbstractC22676k.m65745e(cls, Throwable.class)) {
                            c20029v = new C20029v(constructor, 1);
                        } else if (AbstractC22676k.m65745e(cls, String.class)) {
                            c20029v = new C20029v(constructor, 2);
                        } else {
                            c20029v2 = null;
                        }
                    } else if (length == 2 && AbstractC22676k.m65745e(parameterTypes[0], String.class) && AbstractC22676k.m65745e(parameterTypes[1], Throwable.class)) {
                        c20029v = new C20029v(constructor, 0);
                    } else {
                        c20029v2 = null;
                    }
                    if (c20029v2 != null) {
                        break;
                    }
                } else {
                    c20029v = new C20029v(constructor, 3);
                }
                c20029v2 = c20029v;
                if (c20029v2 != null) {
                    break;
                    break;
                }
            }
            ReentrantReadWriteLock.ReadLock lock3 = reentrantReadWriteLock.readLock();
            int readHoldCount2 = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i15 = 0; i15 < readHoldCount2; i15++) {
                lock3.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock.writeLock();
            writeLock2.lock();
            try {
                weakHashMap.put(exception.getClass(), c20029v2 == null ? C20030w.f75141y : c20029v2);
                while (i13 < readHoldCount2) {
                    lock3.lock();
                    i13++;
                }
                writeLock2.unlock();
                if (c20029v2 != null) {
                    return (Throwable) c20029v2.invoke(cause);
                }
                return null;
            } catch (Throwable th4) {
                while (i13 < readHoldCount2) {
                    lock3.lock();
                    i13++;
                }
                writeLock2.unlock();
                throw th4;
            }
        } catch (Throwable th5) {
            lock.unlock();
            throw th5;
        }
    }
}
