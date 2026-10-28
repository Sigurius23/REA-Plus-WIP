package sz;

import android.content.Context;
import b20.C2326f;
import b20.EnumC2323c;
import b20.EnumC2325e;
import bc3.AbstractC3028k2;
import cd.C4421a;
import com.stripe.android.core.exception.StripeException;
import java.util.List;
import l83.C23467m;
import l83.C23468n;
import l83.C23470p;
import m83.C25271y;
import p096dq.C12262f;
import p442qy.C30765d;
import p479s4.AbstractC32123d;
import p505ts.AbstractC34132o;
import p529uo.AbstractC35135w;
import p537ux.C35338j;
import p537ux.C35352q;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p550vd.AbstractC35903f;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s40.C32139c0;
import s83.AbstractC32269c;
import sc0.C32355c;

/* JADX INFO: renamed from: sz.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C33125d implements InterfaceC33152q0 {

    /* JADX INFO: renamed from: a */
    public final EnumC33131g f138179a;

    /* JADX INFO: renamed from: b */
    public final C35338j f138180b;

    /* JADX INFO: renamed from: c */
    public final boolean f138181c;

    /* JADX INFO: renamed from: d */
    public final boolean f138182d;

    /* JADX INFO: renamed from: e */
    public final C33127e f138183e;

    /* JADX INFO: renamed from: f */
    public final C2326f f138184f;

    /* JADX INFO: renamed from: g */
    public final C30765d f138185g;

    /* JADX INFO: renamed from: h */
    public final C35352q f138186h;

    /* JADX INFO: renamed from: i */
    public final C23470p f138187i;

    public C33125d(Context context, EnumC33131g environment, C35338j c35338j, boolean z4, boolean z13, C33127e c33127e, C2326f errorReporter, C30765d logger, InterfaceC35320a cardBrandFilter, InterfaceC35322b cardFundingFilter, List additionalEnabledNetworks) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(environment, "environment");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
        AbstractC22676k.m65750j(cardFundingFilter, "cardFundingFilter");
        AbstractC22676k.m65750j(additionalEnabledNetworks, "additionalEnabledNetworks");
        this.f138179a = environment;
        this.f138180b = c35338j;
        this.f138181c = z4;
        this.f138182d = z13;
        this.f138183e = c33127e;
        this.f138184f = errorReporter;
        this.f138185g = logger;
        this.f138186h = new C35352q(new C4421a(context), additionalEnabledNetworks, cardBrandFilter, cardFundingFilter, 2);
        this.f138187i = AbstractC30060g.m92088H(new C32355c(this, 4));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m105016a(C33125d c33125d, AbstractC32269c abstractC32269c) {
        C33123c c33123c;
        Object objM107888l;
        C33125d c33125d2;
        Throwable th3;
        Object objM107888l2;
        boolean zBooleanValue;
        if (abstractC32269c instanceof C33123c) {
            c33123c = (C33123c) abstractC32269c;
            int i13 = c33123c.f138166E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c33123c.f138166E = i13 - Integer.MIN_VALUE;
            } else {
                c33123c = new C33123c(c33125d, abstractC32269c);
            }
        } else {
            c33123c = new C33123c(c33125d, abstractC32269c);
        }
        Object objM8751e = c33123c.f138169y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c33123c.f138166E;
        InterfaceC30057d interfaceC30057d = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8751e);
            try {
                String string = c33125d.f138186h.m112196b(c33125d.f138180b, Boolean.valueOf(c33125d.f138181c), Boolean.valueOf(c33125d.f138182d)).toString();
                C12262f c12262f = new C12262f();
                AbstractC35135w.m111095g(string, "isReadyToPayRequestJson cannot be null!");
                c12262f.f41042F = string;
                objM107888l = c12262f;
            } catch (Throwable th4) {
                objM107888l = AbstractC34132o.m107888l(th4);
            }
            Throwable thM68037a = C23468n.m68037a(objM107888l);
            if (thM68037a != null) {
                C2326f c2326f = c33125d.f138184f;
                EnumC2325e enumC2325e = EnumC2325e.GOOGLE_PAY_JSON_REQUEST_PARSING;
                int i15 = StripeException.f22154E;
                AbstractC35903f.m113990H(c2326f, enumC2325e, AbstractC32123d.m100024d(thM68037a), null, 4);
                c33125d.f138185g.m94512b("Google Pay json parsing failed.", thM68037a);
                return Boolean.FALSE;
            }
            C12262f c12262f2 = (C12262f) objM107888l;
            try {
                Duration.Companion companion = Duration.INSTANCE;
                long duration = DurationKt.toDuration(30, DurationUnit.SECONDS);
                C32139c0 c32139c0 = new C32139c0(c33125d, c12262f2, interfaceC30057d, 3);
                c33123c.f138167w = c33125d;
                c33123c.f138168x = c33125d;
                c33123c.f138166E = 1;
                objM8751e = AbstractC3028k2.m8751e(duration, c32139c0, c33123c);
                if (objM8751e == enumC31071a) {
                    return enumC31071a;
                }
                c33125d2 = c33125d;
            } catch (Throwable th5) {
                c33125d2 = c33125d;
                th3 = th5;
                objM107888l2 = AbstractC34132o.m107888l(th3);
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33125d = c33123c.f138168x;
            c33125d2 = c33123c.f138167w;
            try {
                AbstractC34132o.m107864I(objM8751e);
            } catch (Throwable th6) {
                th3 = th6;
                objM107888l2 = AbstractC34132o.m107888l(th3);
            }
        }
        Boolean bool = (Boolean) objM8751e;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            AbstractC35903f.m113990H(c33125d.f138184f, EnumC2323c.GOOGLE_PAY_IS_READY_TIMEOUT, null, null, 6);
            zBooleanValue = false;
        }
        objM107888l2 = Boolean.valueOf(zBooleanValue);
        Throwable thM68037a2 = C23468n.m68037a(objM107888l2);
        if (thM68037a2 != null) {
            C2326f c2326f2 = c33125d2.f138184f;
            EnumC2323c enumC2323c = EnumC2323c.GOOGLE_PAY_IS_READY_API_CALL;
            int i16 = StripeException.f22154E;
            AbstractC35903f.m113990H(c2326f2, enumC2323c, AbstractC32123d.m100024d(thM68037a2), null, 4);
            c33125d2.f138185g.m94512b("Google Pay check failed.", thM68037a2);
        }
        Boolean bool2 = Boolean.FALSE;
        if (objM107888l2 instanceof C23467m) {
            objM107888l2 = bool2;
        }
        Boolean bool3 = (Boolean) objM107888l2;
        boolean zBooleanValue2 = bool3.booleanValue();
        c33125d2.f138185g.m94513c("Google Pay ready? " + zBooleanValue2);
        return bool3;
    }

    public /* synthetic */ C33125d(Context context, EnumC33131g enumC33131g, C35338j c35338j, boolean z4, boolean z13, C2326f c2326f, C30765d c30765d, InterfaceC35320a interfaceC35320a, InterfaceC35322b interfaceC35322b) {
        this(context, enumC33131g, c35338j, z4, z13, new C33127e(context), c2326f, c30765d, interfaceC35320a, interfaceC35322b, C25271y.f99162w);
    }
}
