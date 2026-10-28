package p218ic;

import android.os.Trace;
import androidx.lifecycle.C1630u0;
import c93.InterfaceC4339a;
import m83.C25271y;
import p080d4.C11650i;
import p249jc.AbstractC21598x;
import p294l3.C23285v0;
import p392p3.InterfaceC28770h;
import p493t3.C33491c;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p668z1.AbstractC39957f;
import p668z1.AbstractC39963l;
import p668z1.C39949b;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: ic.h0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC18361h0 implements Runnable {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f71487E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f71488F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f71489w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f71490x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f71491y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f71492z;

    public /* synthetic */ RunnableC18361h0(C18391y c18391y, String str, InterfaceC4339a interfaceC4339a, C1630u0 c1630u0, C11650i c11650i) {
        this.f71491y = c18391y;
        this.f71490x = str;
        this.f71492z = interfaceC4339a;
        this.f71487E = c1630u0;
        this.f71488F = c11650i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C39949b c39949bMo128121C;
        switch (this.f71489w) {
            case 0:
                C18391y c18391y = (C18391y) this.f71491y;
                String label = this.f71490x;
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) this.f71492z;
                C1630u0 c1630u0 = (C1630u0) this.f71487E;
                C11650i c11650i = (C11650i) this.f71488F;
                c18391y.getClass();
                boolean zM88496E = AbstractC29125c.m88496E();
                if (zM88496E) {
                    try {
                        c18391y.getClass();
                        AbstractC22676k.m65750j(label, "label");
                        Trace.beginSection(AbstractC29125c.m88517Z(label));
                    } catch (Throwable th3) {
                        if (zM88496E) {
                            Trace.endSection();
                        }
                        throw th3;
                    }
                }
                try {
                    interfaceC4339a.invoke();
                    C18353d0 c18353d0 = InterfaceC18355e0.f71474a;
                    c1630u0.postValue(c18353d0);
                    c11650i.m31068a(c18353d0);
                    break;
                } catch (Throwable th4) {
                    c1630u0.postValue(new C18349b0(th4));
                    c11650i.m31069b(th4);
                    break;
                }
                if (zM88496E) {
                    Trace.endSection();
                    return;
                }
                return;
            default:
                C23285v0 c23285v0 = (C23285v0) this.f71491y;
                EnumC39181m enumC39181m = (EnumC39181m) this.f71492z;
                String str = this.f71490x;
                InterfaceC39171c interfaceC39171c = (InterfaceC39171c) this.f71487E;
                InterfaceC28770h interfaceC28770h = (InterfaceC28770h) this.f71488F;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    AbstractC39957f abstractC39957fM128171k = AbstractC39963l.m128171k();
                    C39949b c39949b = abstractC39957fM128171k instanceof C39949b ? (C39949b) abstractC39957fM128171k : null;
                    if (c39949b == null || (c39949bMo128121C = c39949b.mo128121C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        AbstractC39957f abstractC39957fM128153j = c39949bMo128121C.m128153j();
                        try {
                            C23285v0 c23285v0M60695p0 = AbstractC21598x.m60695p0(c23285v0, enumC39181m);
                            C25271y c25271y = C25271y.f99162w;
                            new C33491c(str, c23285v0M60695p0, c25271y, c25271y, interfaceC28770h, interfaceC39171c).mo1619c();
                            AbstractC39957f.m128151q(abstractC39957fM128153j);
                            c39949bMo128121C.mo128127w().mo128155d();
                            c39949bMo128121C.mo128122c();
                            Trace.endSection();
                            return;
                        } catch (Throwable th5) {
                            AbstractC39957f.m128151q(abstractC39957fM128153j);
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        try {
                            throw th6;
                        } catch (Throwable th7) {
                            c39949bMo128121C.mo128122c();
                            throw th7;
                        }
                    }
                } catch (Throwable th8) {
                    Trace.endSection();
                    throw th8;
                }
        }
    }

    public /* synthetic */ RunnableC18361h0(C23285v0 c23285v0, EnumC39181m enumC39181m, String str, InterfaceC39171c interfaceC39171c, InterfaceC28770h interfaceC28770h) {
        this.f71491y = c23285v0;
        this.f71492z = enumC39181m;
        this.f71490x = str;
        this.f71487E = interfaceC39171c;
        this.f71488F = interfaceC28770h;
    }
}
