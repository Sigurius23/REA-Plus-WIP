package cz1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.milestonepill.api.MilestonePillApi;
import com.whoop.milestonepill.domain.model.MilestonePillResponse;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: cz1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010$¨\u0006%"}, m65681d2 = {"Lcz1/d;", "", "Lcom/whoop/milestonepill/api/MilestonePillApi;", "api", "Lcz1/e;", "previousDataStoreHandler", "Lcz1/a;", "analyticsHelper", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/milestonepill/api/MilestonePillApi;Lcz1/e;Lcz1/a;Ltr2/n;)V", "", "path", "Lcz1/c;", "prevState", "d", "(Ljava/lang/String;Lcz1/c;Lq83/d;)Ljava/lang/Object;", "previousCount", "currentCount", "", "e", "(Ljava/lang/String;Ljava/lang/String;)Z", "g", "(Lcz1/c;)Lcz1/c;", "Lec3/l;", "Lcz1/b;", "upstream", "f", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/milestonepill/api/MilestonePillApi;", "b", "Lcz1/e;", "c", "Lcz1/a;", "Ltr2/n;", "milestone-pill-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11263d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final MilestonePillApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C11264e previousDataStoreHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C11260a analyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: cz1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.milestonepill.domain.MilestonePillInteractor", m100430f = "MilestonePillInteractor.kt", m100431l = {26, 38, 40}, m100432m = "fetchPillData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f36146E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f36147F;

        /* JADX INFO: renamed from: H */
        int f36149H;

        /* JADX INFO: renamed from: w */
        Object f36150w;

        /* JADX INFO: renamed from: x */
        Object f36151x;

        /* JADX INFO: renamed from: y */
        Object f36152y;

        /* JADX INFO: renamed from: z */
        Object f36153z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f36147F = obj;
            this.f36149H |= Integer.MIN_VALUE;
            return C11263d.this.m30436d(null, null, this);
        }
    }

    /* JADX INFO: renamed from: cz1.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.milestonepill.domain.MilestonePillInteractor$fetchPillData$result$1", m100430f = "MilestonePillInteractor.kt", m100431l = {30}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f36154w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f36156y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f36156y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C11263d.this.new b(this.f36156y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f36154w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MilestonePillApi milestonePillApi = C11263d.this.api;
            String str = this.f36156y;
            this.f36154w = 1;
            Object milestonePill = milestonePillApi.getMilestonePill(str, this);
            return milestonePill == enumC31071a ? enumC31071a : milestonePill;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super MilestonePillResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: cz1.d$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.milestonepill.domain.MilestonePillInteractor$interact$1", m100430f = "MilestonePillInteractor.kt", m100431l = {C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lcz1/c;", "prevState", "Lcz1/b;", "action", "<anonymous>", "(Lcz1/c;Lcz1/b;)Lcz1/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f36157w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f36158x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f36159y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C11262c c11262c, AbstractC11261b abstractC11261b, InterfaceC30057d<? super C11262c> interfaceC30057d) {
            c cVar = C11263d.this.new c(interfaceC30057d);
            cVar.f36158x = c11262c;
            cVar.f36159y = abstractC11261b;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C11262c c11262c = (C11262c) this.f36158x;
            AbstractC11261b abstractC11261b = (AbstractC11261b) this.f36159y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f36157w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(abstractC11261b instanceof AbstractC11261b.b)) {
                    if (abstractC11261b instanceof AbstractC11261b.a) {
                        return C11263d.this.m30438g(c11262c);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                C11263d c11263d = C11263d.this;
                String path = ((AbstractC11261b.b) abstractC11261b).getPath();
                this.f36158x = null;
                this.f36159y = null;
                this.f36157w = 1;
                obj = c11263d.m30436d(path, c11262c, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (C11262c) obj;
        }
    }

    public C11263d(MilestonePillApi api, C11264e previousDataStoreHandler, C11260a analyticsHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(previousDataStoreHandler, "previousDataStoreHandler");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.previousDataStoreHandler = previousDataStoreHandler;
        this.analyticsHelper = analyticsHelper;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: d */
    public final Object m30436d(String str, C11262c c11262c, InterfaceC30057d<? super C11262c> interfaceC30057d) {
        a aVar;
        C11262c c11262c2;
        MilestonePillResponse milestonePillResponse;
        String str2;
        MilestonePillResponse milestonePillResponse2;
        String count;
        String str3;
        String str4;
        C11264e c11264e;
        String count2;
        MilestonePillResponse milestonePillResponse3;
        String str5 = str;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f36149H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f36149H = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f36147F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f36149H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(str5, null);
            aVar2.f36150w = str5;
            c11262c2 = c11262c;
            aVar2.f36151x = c11262c2;
            aVar2.f36149H = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch milestone pill data", bVar, aVar2, 2, null);
            if (objM108729b != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            C11262c c11262c3 = (C11262c) aVar2.f36151x;
            String str6 = (String) aVar2.f36150w;
            AbstractC34132o.m107864I(objM108729b);
            c11262c2 = c11262c3;
            str5 = str6;
        } else {
            if (i14 == 2) {
                milestonePillResponse2 = (MilestonePillResponse) aVar2.f36153z;
                str2 = (String) aVar2.f36150w;
                AbstractC34132o.m107864I(objM108729b);
                str3 = (String) objM108729b;
                milestonePillResponse = milestonePillResponse2;
                str4 = str3;
                c11264e = this.previousDataStoreHandler;
                count2 = milestonePillResponse.getCount();
                aVar2.f36150w = null;
                aVar2.f36151x = null;
                aVar2.f36152y = null;
                aVar2.f36153z = milestonePillResponse;
                aVar2.f36146E = str4;
                aVar2.f36149H = 3;
                if (c11264e.m30442b(str2, count2, aVar2) != enumC31071a) {
                    milestonePillResponse3 = milestonePillResponse;
                }
                return enumC31071a;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str4 = (String) aVar2.f36146E;
            MilestonePillResponse milestonePillResponse4 = (MilestonePillResponse) aVar2.f36153z;
            AbstractC34132o.m107864I(objM108729b);
            milestonePillResponse3 = milestonePillResponse4;
        }
        boolean zM30437e = m30437e(str4, milestonePillResponse3.getCount());
        this.analyticsHelper.m30425c(str4, milestonePillResponse3);
        return new C11262c(false, false, milestonePillResponse3, zM30437e, 3, null);
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return new C11262c(false, true, null, false, 13, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        milestonePillResponse = (MilestonePillResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
        MilestonePillResponse data = c11262c2.getData();
        if (data == null || (count = data.getCount()) == null) {
            C11264e c11264e2 = this.previousDataStoreHandler;
            aVar2.f36150w = str5;
            aVar2.f36151x = null;
            aVar2.f36152y = null;
            aVar2.f36153z = milestonePillResponse;
            aVar2.f36149H = 2;
            Object objM30441a = c11264e2.m30441a(str5, aVar2);
            if (objM30441a != enumC31071a) {
                str2 = str5;
                milestonePillResponse2 = milestonePillResponse;
                objM108729b = objM30441a;
                str3 = (String) objM108729b;
                milestonePillResponse = milestonePillResponse2;
                str4 = str3;
                c11264e = this.previousDataStoreHandler;
                count2 = milestonePillResponse.getCount();
                aVar2.f36150w = null;
                aVar2.f36151x = null;
                aVar2.f36152y = null;
                aVar2.f36153z = milestonePillResponse;
                aVar2.f36146E = str4;
                aVar2.f36149H = 3;
                if (c11264e.m30442b(str2, count2, aVar2) != enumC31071a) {
                    milestonePillResponse3 = milestonePillResponse;
                    boolean zM30437e2 = m30437e(str4, milestonePillResponse3.getCount());
                    this.analyticsHelper.m30425c(str4, milestonePillResponse3);
                    return new C11262c(false, false, milestonePillResponse3, zM30437e2, 3, null);
                }
            }
        } else {
            str3 = count;
            str2 = str5;
            str4 = str3;
            c11264e = this.previousDataStoreHandler;
            count2 = milestonePillResponse.getCount();
            aVar2.f36150w = null;
            aVar2.f36151x = null;
            aVar2.f36152y = null;
            aVar2.f36153z = milestonePillResponse;
            aVar2.f36146E = str4;
            aVar2.f36149H = 3;
            if (c11264e.m30442b(str2, count2, aVar2) != enumC31071a) {
                milestonePillResponse3 = milestonePillResponse;
                boolean zM30437e3 = m30437e(str4, milestonePillResponse3.getCount());
                this.analyticsHelper.m30425c(str4, milestonePillResponse3);
                return new C11262c(false, false, milestonePillResponse3, zM30437e3, 3, null);
            }
        }
        return enumC31071a;
    }

    /* JADX INFO: renamed from: e */
    private final boolean m30437e(String previousCount, String currentCount) {
        Long lM125933R = previousCount != null ? AbstractC39421y.m125933R(previousCount) : null;
        Long lM125933R2 = AbstractC39421y.m125933R(currentCount);
        return (lM125933R == null || lM125933R2 == null || lM125933R.longValue() < lM125933R2.longValue()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final C11262c m30438g(C11262c prevState) {
        return C11262c.m30427b(prevState, false, false, null, true, 7, null);
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m30439f(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C11262c(true, false, null, false, 14, null), upstream, new c(null));
    }

    public /* synthetic */ C11263d(MilestonePillApi milestonePillApi, C11264e c11264e, C11260a c11260a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(milestonePillApi, c11264e, c11260a, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("MilestonePillInteractor") : interfaceC34116n);
    }
}
