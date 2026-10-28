package o23;

import ac3.C0746b;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.call.RetrofitCall;
import java.util.Map;
import live.hms.video.factories.C24148c;
import nr0.C27072e;
import ny0.C27266m;
import p047c9.C4312c;
import p133f1.C13990x;
import p279kd.C22379f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29938w0;
import q83.InterfaceC30057d;
import r23.C30893c;
import r23.InterfaceC30894d;

/* JADX INFO: renamed from: o23.f */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC27476f {

    /* JADX INFO: renamed from: a */
    public static final C27266m f110684a = new C27266m(15);

    /* JADX INFO: renamed from: a */
    public static final C27481k m82903a(InterfaceC27474d interfaceC27474d, InterfaceC2994c0 scope, InterfaceC4351m interfaceC4351m) {
        AbstractC22676k.m65750j(interfaceC27474d, "<this>");
        AbstractC22676k.m65750j(scope, "scope");
        return new C27481k(interfaceC27474d, scope, interfaceC4351m);
    }

    /* JADX INFO: renamed from: b */
    public static final C27481k m82904b(InterfaceC27474d interfaceC27474d, InterfaceC2994c0 scope, Function1 function1) {
        AbstractC22676k.m65750j(interfaceC27474d, "<this>");
        AbstractC22676k.m65750j(scope, "scope");
        return new C27481k(interfaceC27474d, scope, function1, 1);
    }

    /* JADX INFO: renamed from: c */
    public static void m82905c(RetrofitCall retrofitCall) {
        retrofitCall.enqueue(new C24148c(20));
    }

    /* JADX INFO: renamed from: d */
    public static void m82906d(InterfaceC27474d interfaceC27474d, Function1 function1) {
        AbstractC22676k.m65750j(interfaceC27474d, "<this>");
        interfaceC27474d.enqueue(new C4312c(23, f110684a, function1));
    }

    /* JADX INFO: renamed from: e */
    public static final C27478h m82907e(InterfaceC27474d interfaceC27474d, Function1 function1) {
        AbstractC22676k.m65750j(interfaceC27474d, "<this>");
        return new C27478h(interfaceC27474d, function1);
    }

    /* JADX INFO: renamed from: f */
    public static final void m82908f(InterfaceC27474d interfaceC27474d, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC3006f0.m8732z(scope, null, null, new C22379f(interfaceC27474d, (InterfaceC30057d) null, 18), 3);
    }

    /* JADX INFO: renamed from: g */
    public static final C27485o m82909g(InterfaceC27474d interfaceC27474d, Function1 function1) {
        AbstractC22676k.m65750j(interfaceC27474d, "<this>");
        return new C27485o(interfaceC27474d, function1);
    }

    /* JADX INFO: renamed from: h */
    public static final C27487q m82910h(InterfaceC27474d interfaceC27474d, InterfaceC2994c0 scope, InterfaceC4351m interfaceC4351m) {
        AbstractC22676k.m65750j(scope, "scope");
        return new C27487q(interfaceC27474d, scope, interfaceC4351m);
    }

    /* JADX INFO: renamed from: i */
    public static final C30893c m82911i(InterfaceC27474d interfaceC27474d, InterfaceC2994c0 scope, InterfaceC30894d retryPolicy) {
        AbstractC22676k.m65750j(interfaceC27474d, "<this>");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(retryPolicy, "retryPolicy");
        return new C30893c(interfaceC27474d, scope, new C29938w0(retryPolicy));
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC27474d m82912j(InterfaceC27474d interfaceC27474d, InterfaceC2994c0 scope, InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(interfaceC27474d, "<this>");
        AbstractC22676k.m65750j(scope, "scope");
        C27488r c27488r = (C27488r) scope.getCoroutineContext().get(C27488r.f110725x);
        if (c27488r == null) {
            return interfaceC27474d;
        }
        C0746b c0746b = c27488r.f110726w;
        int iIntValue = ((Number) interfaceC4339a.invoke()).intValue();
        InterfaceC27474d interfaceC27474d2 = (InterfaceC27474d) ((Map) c0746b.m1814a()).get(Integer.valueOf(iIntValue));
        if (interfaceC27474d2 == null) {
            interfaceC27474d2 = null;
        }
        if (interfaceC27474d2 != null) {
            return interfaceC27474d2;
        }
        C27480j c27480j = new C27480j(scope, new C27072e(interfaceC27474d, 9), new C13990x(c27488r, iIntValue, 5));
        ((Map) c0746b.m1814a()).put(Integer.valueOf(iIntValue), c27480j);
        return c27480j;
    }

    /* JADX INFO: renamed from: k */
    public static final C27485o m82913k(InterfaceC27474d interfaceC27474d) {
        AbstractC22676k.m65750j(interfaceC27474d, "<this>");
        return m82909g(interfaceC27474d, C27475e.f110683w);
    }

    /* JADX INFO: renamed from: l */
    public static final C27481k m82914l(InterfaceC27474d interfaceC27474d, InterfaceC2994c0 scope, Function1 function1) {
        AbstractC22676k.m65750j(interfaceC27474d, "<this>");
        AbstractC22676k.m65750j(scope, "scope");
        return new C27481k(interfaceC27474d, scope, function1, 2);
    }
}
