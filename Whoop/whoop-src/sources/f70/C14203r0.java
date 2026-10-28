package f70;

import b80.C2792c;
import c80.AbstractC4300a;
import com.whoop.activation.iajf.domain.SignUpSource;
import com.whoop.data.datastore.EmailDataStoreHelper;
import com.whoop.domain.model.UnitSystem;
import d21.C11503a;
import d70.C11750d;
import d70.C11751e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: f70.r0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010=\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020<H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020AH\u0002¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020DH\u0002¢\u0006\u0004\bE\u0010FJ \u0010H\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020GH\u0086@¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bJ\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010M¨\u0006N"}, m65681d2 = {"Lf70/r0;", "", "Lcom/whoop/data/datastore/EmailDataStoreHelper;", "emailDataStoreHelper", "Lb80/c;", "iajfAnalyticsHelper", "<init>", "(Lcom/whoop/data/datastore/EmailDataStoreHelper;Lb80/c;)V", "Lf70/e$b;", "prevDomainResult", "Lf70/d$y$b;", "action", "Lf70/e;", "m", "(Lf70/e$b;Lf70/d$y$b;)Lf70/e;", "Lf70/d$y$s;", "v", "(Lf70/e$b;Lf70/d$y$s;)Lf70/e;", "Lf70/d$y$f;", "j", "(Lf70/e$b;Lf70/d$y$f;Lq83/d;)Ljava/lang/Object;", "Ld70/e;", "password", "", "filledViaCredentialManager", "p", "(Lf70/e$b;Ld70/e;Z)Lf70/e;", "Lf70/d$y$j;", "o", "(Lf70/e$b;Lf70/d$y$j;)Lf70/e;", "Lf70/d$y$e;", "i", "(Lf70/e$b;Lf70/d$y$e;)Lf70/e;", "Lf70/d$y$n;", "t", "(Lf70/e$b;Lf70/d$y$n;)Lf70/e;", "Lf70/d$y$d;", "f", "(Lf70/e$b;Lf70/d$y$d;)Lf70/e;", "Lf70/d$y$h;", "k", "(Lf70/e$b;Lf70/d$y$h;)Lf70/e;", "Lf70/d$y$g;", "l", "(Lf70/e$b;Lf70/d$y$g;)Lf70/e;", "Lf70/d$y$o;", "u", "(Lf70/e$b;Lf70/d$y$o;)Lf70/e;", "Lf70/d$y$c;", "e", "(Lf70/e$b;Lf70/d$y$c;)Lf70/e;", "Lf70/d$y$m;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lf70/e$b;Lf70/d$y$m;)Lf70/e;", "Lf70/d$y$l;", "q", "(Lf70/e$b;Lf70/d$y$l;)Lf70/e;", "Lf70/d$y$p;", "r", "(Lf70/e$b;Lf70/d$y$p;)Lf70/e;", "Lf70/d$y$q;", "s", "(Lf70/e$b;Lf70/d$y$q;)Lf70/e;", "d", "(Lf70/e$b;)Lf70/e$b;", "Lf70/d$y$r;", "g", "(Lf70/e$b;Lf70/d$y$r;)Lf70/e$b;", "Lf70/d$y$i;", "n", "(Lf70/e$b;Lf70/d$y$i;)Lf70/e$b;", "Lf70/d$y;", "b", "(Lf70/e;Lf70/d$y;Lq83/d;)Ljava/lang/Object;", "c", "a", "Lcom/whoop/data/datastore/EmailDataStoreHelper;", "Lb80/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14203r0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EmailDataStoreHelper emailDataStoreHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C2792c iajfAnalyticsHelper;

    /* JADX INFO: renamed from: f70.r0$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.MemberInfoHandler", m100430f = "MemberInfoHandler.kt", m100431l = {164}, m100432m = "storeEmail", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f51653E;

        /* JADX INFO: renamed from: w */
        Object f51654w;

        /* JADX INFO: renamed from: x */
        Object f51655x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f51656y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51656y = obj;
            this.f51653E |= Integer.MIN_VALUE;
            return C14203r0.this.m40583j(null, null, this);
        }
    }

    public C14203r0(EmailDataStoreHelper emailDataStoreHelper, C2792c iajfAnalyticsHelper) {
        AbstractC22676k.m65750j(emailDataStoreHelper, "emailDataStoreHelper");
        AbstractC22676k.m65750j(iajfAnalyticsHelper, "iajfAnalyticsHelper");
        this.emailDataStoreHelper = emailDataStoreHelper;
        this.iajfAnalyticsHelper = iajfAnalyticsHelper;
    }

    /* JADX INFO: renamed from: d */
    private final InterfaceC14176e.b m40577d(InterfaceC14176e.b prevDomainResult) {
        return InterfaceC14176e.b.m40416b(prevDomainResult, null, null, null, C14201q0.m40542b(prevDomainResult.getMemberInfo(), null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, 0, false, false, false, 1073740799, null), null, false, null, false, null, false, false, null, null, null, null, null, null, 131063, null);
    }

    /* JADX INFO: renamed from: e */
    private final InterfaceC14176e m40578e(InterfaceC14176e.b prevDomainResult, InterfaceC14173d.y.c action) {
        return InterfaceC14176e.b.m40416b(prevDomainResult, null, null, null, C14201q0.m40542b(prevDomainResult.getMemberInfo(), null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, action.getBillingFrequency(), null, null, null, false, false, false, null, null, null, null, 0, false, false, false, 1073709055, null), null, false, null, false, null, false, false, null, null, null, null, null, null, 131063, null);
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC14176e m40579f(InterfaceC14176e.b prevDomainResult, InterfaceC14173d.y.d action) {
        return InterfaceC14176e.b.m40416b(prevDomainResult, null, null, null, C14201q0.m40542b(prevDomainResult.getMemberInfo(), null, null, null, null, null, null, null, action.getBirthday(), false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, 0, false, false, false, 1073741695, null), null, false, null, false, null, false, false, null, null, null, null, null, null, 131063, null);
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC14176e.b m40580g(InterfaceC14176e.b prevDomainResult, InterfaceC14173d.y.r action) {
        return InterfaceC14176e.b.m40416b(prevDomainResult, null, null, null, C14201q0.m40542b(prevDomainResult.getMemberInfo(), null, null, null, null, null, null, null, null, false, false, false, null, null, null, action.getCard(), null, null, null, null, false, false, false, null, null, null, null, 0, false, false, false, 1073725439, null), null, false, null, false, null, false, false, null, null, null, null, null, null, 131063, null);
    }

    /* JADX INFO: renamed from: h */
    private final InterfaceC14176e m40581h(InterfaceC14176e.b prevDomainResult, InterfaceC14173d.y.m action) {
        return InterfaceC14176e.b.m40416b(prevDomainResult, null, null, null, C14201q0.m40542b(prevDomainResult.getMemberInfo(), null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, action.getCommitmentType(), null, null, false, false, false, null, null, null, null, 0, false, false, false, 1073676287, null), null, false, null, false, null, false, false, null, null, null, null, null, null, 131063, null);
    }

    /* JADX INFO: renamed from: i */
    private final InterfaceC14176e m40582i(InterfaceC14176e.b prevDomainResult, InterfaceC14173d.y.e action) {
        return InterfaceC14176e.b.m40416b(prevDomainResult, null, null, null, C14201q0.m40542b(prevDomainResult.getMemberInfo(), null, null, null, null, null, action.getCountry(), null, null, false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, AbstractC22676k.m65745e(action.getCountry(), "US") ? UnitSystem.IMPERIAL : UnitSystem.METRIC, 0, false, false, false, 1040187359, null), null, false, null, false, null, false, false, null, null, null, null, null, null, 131063, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: j */
    public final Object m40583j(InterfaceC14176e.b bVar, InterfaceC14173d.y.f fVar, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        a aVar;
        InterfaceC14176e.b bVar2;
        InterfaceC14173d.y.f fVar2;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f51653E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f51653E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f51656y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f51653E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            EmailDataStoreHelper emailDataStoreHelper = this.emailDataStoreHelper;
            String value = fVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String().getValue();
            aVar.f51654w = bVar;
            aVar.f51655x = fVar;
            aVar.f51653E = 1;
            if (emailDataStoreHelper.saveEmail(value, aVar) == enumC31071a) {
                return enumC31071a;
            }
            bVar2 = bVar;
            fVar2 = fVar;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar2 = (InterfaceC14173d.y.f) aVar.f51655x;
            InterfaceC14176e.b bVar3 = (InterfaceC14176e.b) aVar.f51654w;
            AbstractC34132o.m107864I(obj);
            bVar2 = bVar3;
        }
        return InterfaceC14176e.b.m40416b(bVar2, null, null, null, C14201q0.m40542b(bVar2.getMemberInfo(), fVar2.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String(), null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, 0, false, false, false, 1073740798, null), null, false, null, false, null, false, false, null, null, null, null, null, null, 131063, null);
    }

    /* JADX INFO: renamed from: k */
    private final InterfaceC14176e m40584k(InterfaceC14176e.b prevDomainResult, InterfaceC14173d.y.h action) {
        return InterfaceC14176e.b.m40416b(prevDomainResult, null, null, null, C14201q0.m40542b(prevDomainResult.getMemberInfo(), null, null, null, null, null, null, null, null, false, false, false, action.getType(), null, null, null, null, null, null, null, false, false, false, null, null, null, null, 0, false, false, false, 1073739775, null), null, false, null, false, null, false, false, null, null, null, null, null, null, 131063, null);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC14176e m40585l(InterfaceC14176e.b prevDomainResult, InterfaceC14173d.y.g action) {
        return InterfaceC14176e.b.m40416b(prevDomainResult, null, null, null, C14201q0.m40542b(prevDomainResult.getMemberInfo(), null, null, null, null, null, null, null, null, false, false, false, null, action.getType(), null, null, null, null, null, null, false, false, false, null, null, null, null, 0, false, false, false, 1073737727, null), null, false, null, false, null, false, false, null, null, null, null, null, null, 131063, null);
    }

    /* JADX INFO: renamed from: m */
    private final InterfaceC14176e m40586m(InterfaceC14176e.b prevDomainResult, InterfaceC14173d.y.b action) {
        return InterfaceC14176e.b.m40416b(prevDomainResult, null, null, null, C14201q0.m40542b(prevDomainResult.getMemberInfo(), null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, Integer.valueOf(action.getUnitSystem() == UnitSystem.IMPERIAL ? C11503a.f37005a.m30912a(action.getCentimeters()) : action.getCentimeters()), action.getUnitSystem(), 0, false, false, false, 1023410175, null), null, false, null, false, null, false, false, null, null, null, null, null, null, 131063, null);
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC14176e.b m40587n(InterfaceC14176e.b prevDomainResult, InterfaceC14173d.y.i action) {
        return InterfaceC14176e.b.m40416b(prevDomainResult, null, null, null, C14201q0.m40542b(prevDomainResult.getMemberInfo(), null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, action.getOptedIn(), false, null, null, null, null, 0, false, false, false, 1072693247, null), null, false, null, false, null, false, false, null, null, null, null, null, null, 131063, null);
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC14176e m40588o(InterfaceC14176e.b prevDomainResult, InterfaceC14173d.y.j action) {
        C14201q0 memberInfo = prevDomainResult.getMemberInfo();
        C11750d firstName = action.getFirstName();
        if (firstName == null) {
            firstName = prevDomainResult.getMemberInfo().getFirstName();
        }
        C11750d c11750d = firstName;
        C11750d lastName = action.getLastName();
        if (lastName == null) {
            lastName = prevDomainResult.getMemberInfo().getLastName();
        }
        C11750d c11750d2 = lastName;
        String userName = action.getUserName();
        if (userName == null) {
            userName = prevDomainResult.getMemberInfo().getUserName();
        }
        return InterfaceC14176e.b.m40416b(prevDomainResult, null, null, null, C14201q0.m40542b(memberInfo, null, null, c11750d, c11750d2, userName, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, 0, false, false, false, 1073741795, null), null, false, null, false, null, false, false, null, null, null, null, null, null, 131063, null);
    }

    /* JADX INFO: renamed from: p */
    private final InterfaceC14176e m40589p(InterfaceC14176e.b prevDomainResult, C11751e password, boolean filledViaCredentialManager) {
        return InterfaceC14176e.b.m40416b(prevDomainResult, null, null, null, C14201q0.m40542b(prevDomainResult.getMemberInfo(), null, password, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, 0, false, false, filledViaCredentialManager, 536870909, null), null, false, null, false, null, false, false, null, null, null, null, null, null, 98263, null);
    }

    /* JADX INFO: renamed from: q */
    private final InterfaceC14176e m40590q(InterfaceC14176e.b prevDomainResult, InterfaceC14173d.y.l action) {
        return InterfaceC14176e.b.m40416b(prevDomainResult, null, null, null, C14201q0.m40542b(prevDomainResult.getMemberInfo(), null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, Integer.valueOf(action.getPaymentMethodIndex()), null, false, false, false, null, null, null, null, 0, false, false, false, 1073610751, null), null, false, null, false, null, false, false, null, null, null, null, null, null, 131063, null);
    }

    /* JADX INFO: renamed from: r */
    private final InterfaceC14176e m40591r(InterfaceC14176e.b prevDomainResult, InterfaceC14173d.y.p action) {
        return InterfaceC14176e.b.m40416b(prevDomainResult, null, null, null, C14201q0.m40542b(prevDomainResult.getMemberInfo(), null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, action.getConsentsAccepted(), action.getMarketingOptIn(), action.getRecommendationOptIn(), action.m40393a(), null, null, null, 0, false, false, false, 1065877503, null), null, false, null, false, null, false, false, null, null, null, null, null, null, 131063, null);
    }

    /* JADX INFO: renamed from: s */
    private final InterfaceC14176e m40592s(InterfaceC14176e.b prevDomainResult, InterfaceC14173d.y.q action) {
        return InterfaceC14176e.b.m40416b(prevDomainResult, null, null, null, C14201q0.m40542b(prevDomainResult.getMemberInfo(), null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, action.getSelectedRafCodesAmount(), false, false, false, 1006632959, null), null, false, null, false, null, false, false, null, null, null, null, null, null, 131063, null);
    }

    /* JADX INFO: renamed from: t */
    private final InterfaceC14176e m40593t(InterfaceC14176e.b prevDomainResult, InterfaceC14173d.y.n action) {
        return InterfaceC14176e.b.m40416b(prevDomainResult, null, null, null, C14201q0.m40542b(prevDomainResult.getMemberInfo(), null, null, null, null, null, null, action.getState(), null, false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, 0, false, false, false, 1073741759, null), null, false, null, false, null, false, false, null, null, null, null, null, null, 131063, null);
    }

    /* JADX INFO: renamed from: u */
    private final InterfaceC14176e m40594u(InterfaceC14176e.b prevDomainResult, InterfaceC14173d.y.o action) {
        return InterfaceC14176e.b.m40416b(prevDomainResult, null, null, null, C14201q0.m40542b(prevDomainResult.getMemberInfo(), null, null, null, null, null, null, null, null, false, false, false, null, null, action.getStripeToken(), null, null, null, null, null, false, false, false, null, null, null, null, 0, false, false, false, 1073733631, null), null, false, null, false, null, false, false, null, null, null, null, null, null, 131063, null);
    }

    /* JADX INFO: renamed from: v */
    private final InterfaceC14176e m40595v(InterfaceC14176e.b prevDomainResult, InterfaceC14173d.y.s action) {
        return InterfaceC14176e.b.m40416b(prevDomainResult, null, null, null, C14201q0.m40542b(prevDomainResult.getMemberInfo(), null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, Integer.valueOf(action.getUnitSystem() == UnitSystem.IMPERIAL ? action.getPounds() : C11503a.f37005a.m30927p(action.getPounds())), null, action.getUnitSystem(), 0, false, false, false, 1031798783, null), null, false, null, false, null, false, false, null, null, null, null, null, null, 131063, null);
    }

    /* JADX INFO: renamed from: b */
    public final Object m40596b(InterfaceC14176e interfaceC14176e, InterfaceC14173d.y yVar, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        if (!(interfaceC14176e instanceof InterfaceC14176e.b)) {
            return interfaceC14176e;
        }
        InterfaceC14176e.b bVar = (InterfaceC14176e.b) interfaceC14176e;
        SignUpSource signUpSource = bVar.getSignUpSource();
        if (yVar instanceof InterfaceC14173d.y.f) {
            InterfaceC14173d.y.f fVar = (InterfaceC14173d.y.f) yVar;
            this.iajfAnalyticsHelper.m7943k(fVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String().getValue(), signUpSource);
            return m40583j(bVar, fVar, interfaceC30057d);
        }
        if (yVar instanceof InterfaceC14173d.y.k) {
            InterfaceC14173d.y.k kVar = (InterfaceC14173d.y.k) yVar;
            return m40589p(bVar, kVar.getPassword(), kVar.getFilledViaCredentialManager());
        }
        if (yVar instanceof InterfaceC14173d.y.j) {
            return m40588o(bVar, (InterfaceC14173d.y.j) yVar);
        }
        if (yVar instanceof InterfaceC14173d.y.e) {
            InterfaceC14173d.y.e eVar = (InterfaceC14173d.y.e) yVar;
            this.iajfAnalyticsHelper.m7939g(eVar.getCountry(), signUpSource);
            return m40582i(bVar, eVar);
        }
        if (yVar instanceof InterfaceC14173d.y.n) {
            InterfaceC14173d.y.n nVar = (InterfaceC14173d.y.n) yVar;
            this.iajfAnalyticsHelper.m7951s(nVar.getState(), signUpSource);
            return m40593t(bVar, nVar);
        }
        if (yVar instanceof InterfaceC14173d.y.d) {
            return m40579f(bVar, (InterfaceC14173d.y.d) yVar);
        }
        if (yVar instanceof InterfaceC14173d.y.h) {
            return m40584k(bVar, (InterfaceC14173d.y.h) yVar);
        }
        if (yVar instanceof InterfaceC14173d.y.o) {
            return m40594u(bVar, (InterfaceC14173d.y.o) yVar);
        }
        if (yVar instanceof InterfaceC14173d.y.c) {
            return m40578e(bVar, (InterfaceC14173d.y.c) yVar);
        }
        if (yVar instanceof InterfaceC14173d.y.m) {
            if (AbstractC4300a.m13542a(signUpSource)) {
                this.iajfAnalyticsHelper.m7946n(((InterfaceC14173d.y.m) yVar).getCommitmentType(), bVar.getMemberInfo(), signUpSource);
            }
            return m40581h(bVar, (InterfaceC14173d.y.m) yVar);
        }
        if (yVar instanceof InterfaceC14173d.y.l) {
            return m40590q(bVar, (InterfaceC14173d.y.l) yVar);
        }
        if (yVar instanceof InterfaceC14173d.y.g) {
            return m40585l(bVar, (InterfaceC14173d.y.g) yVar);
        }
        if (yVar instanceof InterfaceC14173d.y.s) {
            return m40595v(bVar, (InterfaceC14173d.y.s) yVar);
        }
        if (yVar instanceof InterfaceC14173d.y.b) {
            return m40586m(bVar, (InterfaceC14173d.y.b) yVar);
        }
        if (yVar instanceof InterfaceC14173d.y.p) {
            return m40591r(bVar, (InterfaceC14173d.y.p) yVar);
        }
        if (yVar instanceof InterfaceC14173d.y.q) {
            return m40592s(bVar, (InterfaceC14173d.y.q) yVar);
        }
        if (yVar instanceof InterfaceC14173d.y.a) {
            return m40577d(bVar);
        }
        if (yVar instanceof InterfaceC14173d.y.r) {
            return m40580g(bVar, (InterfaceC14173d.y.r) yVar);
        }
        if (!(yVar instanceof InterfaceC14173d.y.i)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC14173d.y.i iVar = (InterfaceC14173d.y.i) yVar;
        this.iajfAnalyticsHelper.m7945m(iVar.getOptedIn(), signUpSource);
        return m40587n(bVar, iVar);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC14176e.b m40597c(InterfaceC14176e.b prevDomainResult) {
        AbstractC22676k.m65750j(prevDomainResult, "prevDomainResult");
        return InterfaceC14176e.b.m40416b(prevDomainResult, null, null, null, C14201q0.m40542b(prevDomainResult.getMemberInfo(), null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, 0, false, false, false, 1073741759, null), null, false, null, false, null, false, false, null, null, null, null, null, null, 131063, null);
    }
}
