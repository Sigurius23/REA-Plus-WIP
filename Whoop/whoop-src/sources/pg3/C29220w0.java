package pg3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: pg3.w0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C29220w0 implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final Object[] f118276a = new Object[0];

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Class f118277b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29224y0 f118278c;

    public C29220w0(C29224y0 c29224y0, Class cls) {
        this.f118278c = c29224y0;
        this.f118277b = cls;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AbstractC29217v abstractC29217vM88722b;
        AbstractC29217v abstractC29217v;
        Class cls = this.f118277b;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f118276a;
        }
        Object[] objArr2 = objArr;
        C29173b c29173b = AbstractC29204o0.f118201b;
        if (c29173b.mo88671e(method)) {
            return c29173b.mo88670d(method, cls, obj, objArr2);
        }
        C29224y0 c29224y0 = this.f118278c;
        while (true) {
            Object objPutIfAbsent = c29224y0.f118288a.get(method);
            if (!(objPutIfAbsent instanceof AbstractC29217v)) {
                if (objPutIfAbsent == null) {
                    Object obj2 = new Object();
                    synchronized (obj2) {
                        try {
                            objPutIfAbsent = c29224y0.f118288a.putIfAbsent(method, obj2);
                            if (objPutIfAbsent == null) {
                                try {
                                    abstractC29217vM88722b = AbstractC29217v.m88722b(c29224y0, cls, method);
                                    c29224y0.f118288a.put(method, abstractC29217vM88722b);
                                } catch (Throwable th3) {
                                    c29224y0.f118288a.remove(method);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
                synchronized (objPutIfAbsent) {
                    try {
                        Object obj3 = c29224y0.f118288a.get(method);
                        if (obj3 != null) {
                            abstractC29217v = (AbstractC29217v) obj3;
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                break;
            }
            abstractC29217vM88722b = (AbstractC29217v) objPutIfAbsent;
            abstractC29217v = abstractC29217vM88722b;
        }
        return abstractC29217v.mo88716a(new C29174b0(abstractC29217v.f118266a, obj, objArr2, abstractC29217v.f118267b, abstractC29217v.f118268c), objArr2);
    }
}
