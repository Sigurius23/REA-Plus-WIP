package sz;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.C1601k1;
import b10.C2273z0;
import com.google.android.gms.tasks.Task;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.InvalidRequestException;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.C13084s1;
import java.util.Locale;
import l83.C23468n;
import org.json.JSONObject;
import p096dq.C12268l;
import p096dq.C12269m;
import p096dq.C12272p;
import p479s4.AbstractC32126g;
import p479s4.AbstractC32128i;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p529uo.AbstractC35135w;
import p537ux.C35340k;
import p537ux.C35344m;
import p537ux.C35350p;
import p537ux.C35352q;
import p537ux.EnumC35342l;
import p537ux.EnumC35346n;
import p537ux.EnumC35348o;
import p664yy.C39857f;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s40.C32139c0;
import s83.AbstractC32269c;
import y00.C38809d5;
import y00.C38915o4;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: sz.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C33150p0 extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E */
    public final C35352q f138242E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC33152q0 f138243F;

    /* JADX INFO: renamed from: G */
    public final C1601k1 f138244G;

    /* JADX INFO: renamed from: H */
    public final C13045h2 f138245H;

    /* JADX INFO: renamed from: I */
    public final C13081r1 f138246I;

    /* JADX INFO: renamed from: w */
    public final C12272p f138247w;

    /* JADX INFO: renamed from: x */
    public final C39857f f138248x;

    /* JADX INFO: renamed from: y */
    public final C33142l0 f138249y;

    /* JADX INFO: renamed from: z */
    public final C2273z0 f138250z;

    public C33150p0(C12272p paymentsClient, C39857f c39857f, C33142l0 args, C2273z0 c2273z0, C35352q googlePayJsonFactory, InterfaceC33152q0 googlePayRepository, C1601k1 c1601k1) {
        AbstractC22676k.m65750j(paymentsClient, "paymentsClient");
        AbstractC22676k.m65750j(args, "args");
        AbstractC22676k.m65750j(googlePayJsonFactory, "googlePayJsonFactory");
        AbstractC22676k.m65750j(googlePayRepository, "googlePayRepository");
        this.f138247w = paymentsClient;
        this.f138248x = c39857f;
        this.f138249y = args;
        this.f138250z = c2273z0;
        this.f138242E = googlePayJsonFactory;
        this.f138243F = googlePayRepository;
        this.f138244G = c1601k1;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        this.f138245H = c13045h2M36593c;
        this.f138246I = AbstractC13091v.m36598h(c13045h2M36593c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m105017g(C12268l c12268l, AbstractC32269c abstractC32269c) {
        C33146n0 c33146n0;
        Object objM7093p;
        if (abstractC32269c instanceof C33146n0) {
            c33146n0 = (C33146n0) abstractC32269c;
            int i13 = c33146n0.f138235y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c33146n0.f138235y = i13 - Integer.MIN_VALUE;
            } else {
                c33146n0 = new C33146n0(this, abstractC32269c);
            }
        } else {
            c33146n0 = new C33146n0(this, abstractC32269c);
        }
        Object obj = c33146n0.f138233w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c33146n0.f138235y;
        int i15 = 1;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C38809d5 c38809d5M106267i = C33647p.m106267i(new JSONObject(c12268l.f41078G), this.f138249y.f138223H);
            c33146n0.f138235y = 1;
            objM7093p = this.f138250z.m7093p(c38809d5M106267i, this.f138248x, c33146n0);
            if (objM7093p == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objM7093p = ((C23468n) obj).f92940w;
        }
        Throwable thM68037a = C23468n.m68037a(objM7093p);
        if (thM68037a == null) {
            return new C33128e0((C38915o4) objM7093p);
        }
        if (thM68037a instanceof APIConnectionException) {
            i15 = 3;
        } else if (thM68037a instanceof InvalidRequestException) {
            i15 = 2;
        }
        return new C33130f0(i15, thM68037a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: j */
    public final Object m105018j(AbstractC32269c abstractC32269c) {
        C33148o0 c33148o0;
        C33150p0 c33150p0;
        C35350p c35350p;
        if (abstractC32269c instanceof C33148o0) {
            c33148o0 = (C33148o0) abstractC32269c;
            int i13 = c33148o0.f138239z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c33148o0.f138239z = i13 - Integer.MIN_VALUE;
            } else {
                c33148o0 = new C33148o0(this, abstractC32269c);
            }
        } else {
            c33148o0 = new C33148o0(this, abstractC32269c);
        }
        Object objM36575A = c33148o0.f138237x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c33148o0.f138239z;
        InterfaceC30057d interfaceC30057d = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36575A);
            c33148o0.f138236w = this;
            c33148o0.f138239z = 1;
            C33125d c33125d = (C33125d) this.f138243F;
            c33125d.getClass();
            objM36575A = AbstractC13091v.m36575A(new C13084s1(new C32139c0(c33125d, interfaceC30057d, 2)), c33148o0);
            if (objM36575A != enumC31071a) {
                c33150p0 = this;
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM36575A);
            return objM36575A;
        }
        c33150p0 = c33148o0.f138236w;
        AbstractC34132o.m107864I(objM36575A);
        if (!((Boolean) objM36575A).booleanValue()) {
            throw new IllegalStateException("Google Pay is unavailable.");
        }
        C12272p c12272p = c33150p0.f138247w;
        C35352q c35352q = c33150p0.f138242E;
        C33142l0 args = c33150p0.f138249y;
        AbstractC22676k.m65750j(args, "args");
        C33124c0 c33124c0 = args.f138225w;
        long j7 = args.f138227y;
        if ((AbstractC39421y.m125921F(c33124c0.f138176x, Locale.US.getCountry(), true) || AbstractC39421y.m125921F(c33124c0.f138176x, Locale.CANADA.getCountry(), true)) && j7 == 0) {
            String currencyCode = args.f138226x;
            EnumC35348o enumC35348o = EnumC35348o.NotCurrentlyKnown;
            String str = c33124c0.f138176x;
            String str2 = args.f138220E;
            String str3 = args.f138228z;
            EnumC35346n enumC35346n = EnumC35346n.Default;
            AbstractC22676k.m65750j(currencyCode, "currencyCode");
            c35350p = new C35350p(currencyCode, enumC35348o, str, str2, null, str3, enumC35346n);
        } else {
            c35350p = new C35350p(args.f138226x, EnumC35348o.Estimated, c33124c0.f138176x, args.f138220E, Long.valueOf(j7), args.f138228z, EnumC35346n.Default);
        }
        String string = C35352q.m112194c(c35352q, c35350p, new C35340k(c33124c0.f138177y, new C35344m(args.f138224I ? EnumC35342l.Elements : EnumC35342l.Launcher)), AbstractC32126g.m100040e(c33124c0.f138171E), c33124c0.f138178z, Boolean.valueOf(c33124c0.f138173G)).toString();
        C12269m c12269m = new C12269m();
        c12269m.f41088I = true;
        AbstractC35135w.m111095g(string, "paymentDataRequestJson cannot be null!");
        c12269m.f41089J = string;
        Task taskM34185c = c12272p.m34185c(c12269m);
        AbstractC22676k.m65749i(taskM34185c, "loadPaymentData(...)");
        c33148o0.f138236w = null;
        c33148o0.f138239z = 2;
        Object objM100049c = AbstractC32128i.m100049c(taskM34185c, c33148o0);
        return objM100049c == enumC31071a ? enumC31071a : objM100049c;
    }
}
