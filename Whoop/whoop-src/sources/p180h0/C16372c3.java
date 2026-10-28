package p180h0;

import android.view.ViewTreeObserver;
import androidx.compose.foundation.gestures.AbstractC1097b;
import androidx.compose.p018ui.platform.AndroidComposeView;
import c93.InterfaceC4351m;
import g20.C15270p;
import gm1.C15992b;
import java.lang.reflect.Method;
import l83.C23454a0;
import p005a3.AbstractC0201g;
import p007a6.C0428i;
import p007a6.C0438l0;
import p132f0.C13798k;
import p132f0.EnumC13840z0;
import p181h2.C16617b;
import p492t2.C33316d;
import p492t2.C33319g;
import p505ts.AbstractC34132o;
import p636y3.C39185q;
import p715kotlin.jvm.internal.C22667f0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h0.c3 */
/* JADX INFO: loaded from: classes.dex */
public final class C16372c3 {

    /* JADX INFO: renamed from: a */
    public InterfaceC16478x2 f62936a;

    /* JADX INFO: renamed from: b */
    public C13798k f62937b;

    /* JADX INFO: renamed from: c */
    public InterfaceC16432o1 f62938c;

    /* JADX INFO: renamed from: d */
    public EnumC16377d2 f62939d;

    /* JADX INFO: renamed from: e */
    public boolean f62940e;

    /* JADX INFO: renamed from: f */
    public C33316d f62941f;

    /* JADX INFO: renamed from: g */
    public final C16473w2 f62942g;

    /* JADX INFO: renamed from: h */
    public final C0438l0 f62943h;

    /* JADX INFO: renamed from: i */
    public boolean f62944i;

    /* JADX INFO: renamed from: j */
    public int f62945j = 1;

    /* JADX INFO: renamed from: k */
    public InterfaceC16413k2 f62946k = AbstractC1097b.f4539b;

    /* JADX INFO: renamed from: l */
    public final C16360a3 f62947l = new C16360a3(this);

    /* JADX INFO: renamed from: m */
    public final C0428i f62948m = new C0428i(this, 17);

    public C16372c3(InterfaceC16478x2 interfaceC16478x2, C13798k c13798k, InterfaceC16432o1 interfaceC16432o1, EnumC16377d2 enumC16377d2, boolean z4, C33316d c33316d, C16473w2 c16473w2, C0438l0 c0438l0) {
        this.f62936a = interfaceC16478x2;
        this.f62937b = c13798k;
        this.f62938c = interfaceC16432o1;
        this.f62939d = enumC16377d2;
        this.f62940e = z4;
        this.f62941f = c33316d;
        this.f62942g = c16473w2;
        this.f62943h = c0438l0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m46568a(long j7, AbstractC32269c abstractC32269c) throws Throwable {
        C16483y2 c16483y2;
        C16372c3 c16372c3;
        Throwable th3;
        C22667f0 c22667f0;
        if (abstractC32269c instanceof C16483y2) {
            c16483y2 = (C16483y2) abstractC32269c;
            int i13 = c16483y2.f63348z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16483y2.f63348z = i13 - Integer.MIN_VALUE;
            } else {
                c16483y2 = new C16483y2(this, abstractC32269c);
            }
        } else {
            c16483y2 = new C16483y2(this, abstractC32269c);
        }
        Object obj = c16483y2.f63346x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c16483y2.f63348z;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22667f0 = c16483y2.f63345w;
            try {
                AbstractC34132o.m107864I(obj);
                c16372c3 = this;
                c16372c3.f62944i = false;
                return C39185q.m124810a(c22667f0.f89335w);
            } catch (Throwable th4) {
                th3 = th4;
                c16372c3 = this;
                c16372c3.f62944i = false;
                throw th3;
            }
        }
        AbstractC34132o.m107864I(obj);
        C22667f0 c22667f1 = new C22667f0();
        c22667f1.f89335w = j7;
        this.f62944i = true;
        try {
            EnumC13840z0 enumC13840z0 = EnumC13840z0.f49374w;
            c16372c3 = this;
            try {
                C16488z2 c16488z2 = new C16488z2(c16372c3, c22667f1, j7, null);
                c16483y2.f63345w = c22667f1;
                c16483y2.f63348z = 1;
                if (m46573f(enumC13840z0, c16488z2, c16483y2) == enumC31071a) {
                    return enumC31071a;
                }
                c22667f0 = c22667f1;
                c16372c3.f62944i = false;
                return C39185q.m124810a(c22667f0.f89335w);
            } catch (Throwable th5) {
                th = th5;
                th3 = th;
                c16372c3.f62944i = false;
                throw th3;
            }
        } catch (Throwable th6) {
            th = th6;
            c16372c3 = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:6:0x000b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0012  */
    /* JADX INFO: renamed from: b */
    public final Object m46569b(long j7, boolean z4, AbstractC32275i abstractC32275i) {
        int i13;
        long jM124811b;
        C16366b3 c16366b3;
        C13798k c13798k;
        Object objInvoke;
        if (z4) {
            InterfaceC16432o1 interfaceC16432o1 = this.f62938c;
            C15992b c15992b = AbstractC1097b.f4538a;
            if (!(interfaceC16432o1 instanceof C16363b0)) {
                if (this.f62939d == EnumC16377d2.f62972x) {
                    i13 = 1;
                } else {
                    i13 = 2;
                }
                jM124811b = C39185q.m124811b(0.0f, 0.0f, j7, i13);
                c16366b3 = new C16366b3(this, null);
                c13798k = this.f62937b;
                if (c13798k == null && (this.f62936a.mo39183d() || this.f62936a.mo39182c())) {
                    Object objM39162b = c13798k.m39162b(jM124811b, c16366b3, abstractC32275i);
                    if (objM39162b == EnumC31071a.f128113w) {
                        return objM39162b;
                    }
                } else {
                    objInvoke = c16366b3.invoke(C39185q.m124810a(jM124811b), abstractC32275i);
                    if (objInvoke == EnumC31071a.f128113w) {
                        return objInvoke;
                    }
                }
            }
        } else {
            if (this.f62939d == EnumC16377d2.f62972x) {
                i13 = 1;
            } else {
                i13 = 2;
            }
            jM124811b = C39185q.m124811b(0.0f, 0.0f, j7, i13);
            c16366b3 = new C16366b3(this, null);
            c13798k = this.f62937b;
            if (c13798k == null) {
                objInvoke = c16366b3.invoke(C39185q.m124810a(jM124811b), abstractC32275i);
                if (objInvoke == EnumC31071a.f128113w) {
                    return objInvoke;
                }
            } else {
                objInvoke = c16366b3.invoke(C39185q.m124810a(jM124811b), abstractC32275i);
                if (objInvoke == EnumC31071a.f128113w) {
                    return objInvoke;
                }
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final long m46570c(InterfaceC16413k2 interfaceC16413k2, long j7, int i13) {
        C33319g c33319g = this.f62941f.f138977a;
        C33319g c33319g2 = null;
        C33319g c33319g3 = (c33319g == null || !c33319g.f9141N) ? null : (C33319g) AbstractC0201g.m507g(c33319g);
        long jMo29341l0 = c33319g3 != null ? c33319g3.mo29341l0(j7, i13) : 0L;
        long jM47191g = C16617b.m47191g(j7, jMo29341l0);
        long jM46572e = m46572e(m46575h(interfaceC16413k2.mo29373a(m46574g(m46572e(this.f62939d == EnumC16377d2.f62972x ? C16617b.m47185a(0.0f, 0.0f, jM47191g, 1) : C16617b.m47185a(0.0f, 0.0f, jM47191g, 2))))));
        C16473w2 c16473w2 = this.f62942g;
        if (c16473w2.f9141N) {
            ViewTreeObserver viewTreeObserver = ((AndroidComposeView) AbstractC0201g.m517q(c16473w2)).getViewTreeObserver();
            try {
                if (AndroidComposeView.f4891m1 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    AndroidComposeView.f4891m1 = declaredMethod;
                }
                Method method = AndroidComposeView.f4891m1;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long jM47191g2 = C16617b.m47191g(jM47191g, jM46572e);
        C33319g c33319g4 = this.f62941f.f138977a;
        if (c33319g4 != null && c33319g4.f9141N) {
            c33319g2 = (C33319g) AbstractC0201g.m507g(c33319g4);
        }
        C33319g c33319g5 = c33319g2;
        return C16617b.m47192h(C16617b.m47192h(jMo29341l0, jM46572e), c33319g5 != null ? c33319g5.mo9761J(jM46572e, jM47191g2, i13) : 0L);
    }

    /* JADX INFO: renamed from: d */
    public final float m46571d(float f13) {
        return this.f62940e ? f13 * (-1) : f13;
    }

    /* JADX INFO: renamed from: e */
    public final long m46572e(long j7) {
        return this.f62940e ? C16617b.m47193i(-1.0f, j7) : j7;
    }

    /* JADX INFO: renamed from: f */
    public final Object m46573f(EnumC13840z0 enumC13840z0, InterfaceC4351m interfaceC4351m, AbstractC32269c abstractC32269c) {
        Object objMo9764a = this.f62936a.mo9764a(enumC13840z0, new C15270p(this, interfaceC4351m, (InterfaceC30057d) null, 10), abstractC32269c);
        return objMo9764a == EnumC31071a.f128113w ? objMo9764a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public final float m46574g(long j7) {
        return Float.intBitsToFloat((int) (this.f62939d == EnumC16377d2.f62972x ? j7 >> 32 : j7 & 4294967295L));
    }

    /* JADX INFO: renamed from: h */
    public final long m46575h(float f13) {
        long jFloatToRawIntBits;
        long j7;
        if (f13 == 0.0f) {
            return 0L;
        }
        if (this.f62939d == EnumC16377d2.f62972x) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f13);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j7 = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(f13);
            j7 = jFloatToRawIntBits3 << 32;
        }
        return j7 | (jFloatToRawIntBits & 4294967295L);
    }
}
