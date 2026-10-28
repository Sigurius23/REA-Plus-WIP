package p459rf;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3076z;
import bc3.C2990b0;
import bc3.C3003e1;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import n20.C26175j;
import n43.C26285a;
import ne3.InterfaceC26618i;
import ne3.InterfaceC26633p0;
import p326mf.AbstractC25491k;
import p326mf.AbstractC25492l;
import p326mf.C25494n;
import p368og.EnumC27905b;
import p550vd.AbstractC35903f;
import p647yf.AbstractC39497j;
import p679zf.C40604e;
import p679zf.C40606g;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r70.C31050b;
import r83.EnumC31071a;
import s30.AbstractC32100b;
import s83.AbstractC32275i;
import ud3.AbstractC34846v0;
import ud3.C34818h0;
import va3.AbstractC35854l;

/* JADX INFO: renamed from: rf.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C31353x extends AbstractC34846v0 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f128998c = 0;

    /* JADX INFO: renamed from: a */
    public final AbstractC25492l f128999a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC30063j f129000b;

    public C31353x(AbstractC25492l body, InterfaceC30063j callContext) {
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(callContext, "callContext");
        this.f128999a = body;
        this.f129000b = callContext;
        if ((body instanceof C25494n) || (body instanceof AbstractC25491k)) {
            return;
        }
        throw new IllegalArgumentException(("Invalid streaming body " + body).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final Object m96422a(C31353x c31353x, InterfaceC26618i interfaceC26618i, AbstractC32275i abstractC32275i) throws IOException {
        AbstractC25492l abstractC25492l = c31353x.f128999a;
        boolean z4 = abstractC25492l instanceof C25494n;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (z4) {
            Object objM126158c = AbstractC39497j.m126158c(((C25494n) abstractC25492l).f99829b, interfaceC26618i instanceof C40606g ? ((C40606g) interfaceC26618i).f174969w : new C40604e(interfaceC26618i), abstractC32275i);
            return objM126158c == EnumC31071a.f128113w ? objM126158c : c23454a0;
        }
        if (!(abstractC25492l instanceof AbstractC25491k)) {
            throw new IllegalStateException(("unexpected HttpBody type " + abstractC25492l).toString());
        }
        InterfaceC26633p0 interfaceC26633p0M99874x = AbstractC32100b.m99874x(((AbstractC25491k) abstractC25492l).mo74903d());
        try {
            interfaceC26618i.mo79189N0(interfaceC26633p0M99874x);
            interfaceC26633p0M99874x.close();
            return c23454a0;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC35854l.m113829i(interfaceC26633p0M99874x, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m96423b(InterfaceC26618i interfaceC26618i) throws Throwable {
        String str;
        InterfaceC30063j interfaceC30063j = this.f129000b;
        AbstractC22676k.m65750j(interfaceC30063j, "<this>");
        C2990b0 c2990b0 = (C2990b0) interfaceC30063j.get(C2990b0.f11996x);
        InterfaceC30063j interfaceC30063jPlus = interfaceC30063j.plus((c2990b0 == null || (str = c2990b0.f11997w) == null) ? new C2990b0("send-request-body") : new C2990b0(str.concat(":send-request-body")));
        InterfaceC30057d interfaceC30057d = null;
        if (!this.f128999a.mo74904b()) {
            AbstractC3006f0.m8699E(interfaceC30063jPlus.minusKey(AbstractC3076z.Key), new C26175j(this, interfaceC26618i, interfaceC30057d, 25));
        } else {
            C22365e c22365e = AbstractC3050q0.f12077a;
            AbstractC3006f0.m8732z(C3003e1.f12012w, interfaceC30063jPlus.plus(ExecutorC22364d.f87316w), null, new C26285a(interfaceC26618i, this, interfaceC30057d, 16), 2);
        }
    }

    @Override // ud3.AbstractC34846v0
    public final long contentLength() {
        Long lMo74901a = this.f128999a.mo74901a();
        if (lMo74901a != null) {
            return lMo74901a.longValue();
        }
        return -1L;
    }

    @Override // ud3.AbstractC34846v0
    /* JADX INFO: renamed from: contentType */
    public final C34818h0 getContentType() {
        return null;
    }

    @Override // ud3.AbstractC34846v0
    public final boolean isDuplex() {
        return this.f128999a.mo74904b();
    }

    @Override // ud3.AbstractC34846v0
    public final boolean isOneShot() {
        return this.f128999a.mo74902c();
    }

    @Override // ud3.AbstractC34846v0
    public final void writeTo(InterfaceC26618i interfaceC26618i) throws Exception {
        try {
            m96423b(interfaceC26618i);
        } catch (Exception e5) {
            if (!(e5 instanceof CancellationException)) {
                if (!(e5 instanceof IOException)) {
                    throw new IOException(e5);
                }
                throw e5;
            }
            C31050b c31050b = new C31050b(29);
            EnumC27905b enumC27905b = EnumC27905b.f112502E;
            String qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31353x.class).getQualifiedName();
            if (qualifiedName == null) {
                throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
            }
            AbstractC35903f.m113983A(this.f129000b, enumC27905b, qualifiedName, null, c31050b);
        }
    }
}
