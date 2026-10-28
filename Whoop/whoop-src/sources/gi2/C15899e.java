package gi2;

import com.whoop.strava.domain.StravaApi;
import com.whoop.strava.domain.models.StravaAuthorizeRequest;
import com.whoop.strava.domain.models.StravaBffSettingsResponse;
import com.whoop.strava.domain.models.StravaDefaultResponse;
import com.whoop.strava.domain.models.StravaUserSettingsInformationRequest;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ji2.C21724c;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: gi2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0013\u0010\nJ\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lgi2/e;", "", "Lcom/whoop/strava/domain/StravaApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/strava/domain/StravaApi;Ltr2/n;)V", "Lgi2/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lq83/d;)Ljava/lang/Object;", "Lgi2/b$i;", "userSettingsInformation", "j", "(Lgi2/b$i;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;", "authorizeRequest", "f", "(Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;Lq83/d;)Ljava/lang/Object;", "g", "Lgi2/b;", "domainAction", "i", "(Lgi2/b;Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/strava/domain/StravaApi;", "b", "Ltr2/n;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15899e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final StravaApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: gi2.e$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strava.domain.StravaInteractor", m100430f = "StravaInteractor.kt", m100431l = {58}, m100432m = "authorize", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f60096w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f60097x;

        /* JADX INFO: renamed from: z */
        int f60099z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f60097x = obj;
            this.f60099z |= Integer.MIN_VALUE;
            return C15899e.this.m44873f(null, this);
        }
    }

    /* JADX INFO: renamed from: gi2.e$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strava.domain.StravaInteractor$authorize$2", m100430f = "StravaInteractor.kt", m100431l = {59}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/strava/domain/models/StravaDefaultResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f60100w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ StravaAuthorizeRequest f60102y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(StravaAuthorizeRequest stravaAuthorizeRequest, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f60102y = stravaAuthorizeRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C15899e.this.new b(this.f60102y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f60100w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            StravaApi stravaApi = C15899e.this.api;
            StravaAuthorizeRequest stravaAuthorizeRequest = this.f60102y;
            this.f60100w = 1;
            Object objAuthorize = stravaApi.authorize(stravaAuthorizeRequest, this);
            return objAuthorize == enumC31071a ? enumC31071a : objAuthorize;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super StravaDefaultResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: gi2.e$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strava.domain.StravaInteractor", m100430f = "StravaInteractor.kt", m100431l = {67}, m100432m = "deauthorize", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f60103w;

        /* JADX INFO: renamed from: y */
        int f60105y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f60103w = obj;
            this.f60105y |= Integer.MIN_VALUE;
            return C15899e.this.m44874g(this);
        }
    }

    /* JADX INFO: renamed from: gi2.e$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strava.domain.StravaInteractor$deauthorize$2", m100430f = "StravaInteractor.kt", m100431l = {68, 69}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f60106w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C15899e.this.new d(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f60106w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                StravaApi stravaApi = C15899e.this.api;
                this.f60106w = 1;
                if (stravaApi.deauthorize(this) != enumC31071a) {
                }
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            StravaApi stravaApi2 = C15899e.this.api;
            this.f60106w = 2;
            Object bffSettings = stravaApi2.getBffSettings(this);
            return bffSettings == enumC31071a ? enumC31071a : bffSettings;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super StravaBffSettingsResponse> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: gi2.e$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strava.domain.StravaInteractor", m100430f = "StravaInteractor.kt", m100431l = {25}, m100432m = "getBffSettings", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f60108w;

        /* JADX INFO: renamed from: y */
        int f60110y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f60108w = obj;
            this.f60110y |= Integer.MIN_VALUE;
            return C15899e.this.m44875h(this);
        }
    }

    /* JADX INFO: renamed from: gi2.e$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strava.domain.StravaInteractor$getBffSettings$2", m100430f = "StravaInteractor.kt", m100431l = {26}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f60111w;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C15899e.this.new f(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f60111w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            StravaApi stravaApi = C15899e.this.api;
            this.f60111w = 1;
            Object bffSettings = stravaApi.getBffSettings(this);
            return bffSettings == enumC31071a ? enumC31071a : bffSettings;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super StravaBffSettingsResponse> interfaceC30057d) {
            return ((f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: gi2.e$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strava.domain.StravaInteractor", m100430f = "StravaInteractor.kt", m100431l = {34}, m100432m = "upsertSettings", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f60113w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f60114x;

        /* JADX INFO: renamed from: z */
        int f60116z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f60114x = obj;
            this.f60116z |= Integer.MIN_VALUE;
            return C15899e.this.m44876j(null, this);
        }
    }

    /* JADX INFO: renamed from: gi2.e$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strava.domain.StravaInteractor$upsertSettings$2", m100430f = "StravaInteractor.kt", m100431l = {35, 50}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f60117w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC15896b.i f60119y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AbstractC15896b.i iVar, InterfaceC30057d<? super h> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f60119y = iVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C15899e.this.new h(this.f60119y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            List arrayList;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f60117w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                StravaApi stravaApi = C15899e.this.api;
                boolean shareToStrava = this.f60119y.getShareToStrava();
                boolean shareAllActivities = this.f60119y.getShareAllActivities();
                String templateName = this.f60119y.getTemplateName();
                if (this.f60119y.getShareAllActivities()) {
                    arrayList = C25271y.f99162w;
                } else {
                    List<C21724c> listM44845e = this.f60119y.m44845e();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : listM44845e) {
                        if (((C21724c) obj2).getSelected()) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((C21724c) it.next()).getActivityNameInternal());
                    }
                }
                StravaUserSettingsInformationRequest stravaUserSettingsInformationRequest = new StravaUserSettingsInformationRequest(shareToStrava, shareAllActivities, templateName, arrayList, Boolean.valueOf(this.f60119y.getImportActivities()));
                this.f60117w = 1;
                if (stravaApi.upsertSettings(stravaUserSettingsInformationRequest, this) != enumC31071a) {
                }
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            StravaApi stravaApi2 = C15899e.this.api;
            this.f60117w = 2;
            Object bffSettings = stravaApi2.getBffSettings(this);
            return bffSettings == enumC31071a ? enumC31071a : bffSettings;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super StravaBffSettingsResponse> interfaceC30057d) {
            return ((h) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C15899e(StravaApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: f */
    public final Object m44873f(StravaAuthorizeRequest stravaAuthorizeRequest, InterfaceC30057d<? super AbstractC15898d> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f60099z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f60099z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f60097x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f60099z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(stravaAuthorizeRequest, null);
            aVar2.f60096w = null;
            aVar2.f60099z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "authorize", bVar, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC15898d.c.f60085a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC15898d.a((StravaDefaultResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public final Object m44874g(InterfaceC30057d<? super AbstractC15898d> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f60105y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f60105y = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM108729b = cVar2.f60103w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f60105y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            d dVar = new d(null);
            cVar2.f60105y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "deauthorize", dVar, cVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC15898d.c.f60085a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC15898d.g((StravaBffSettingsResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: h */
    public final Object m44875h(InterfaceC30057d<? super AbstractC15898d> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f60110y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f60110y = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object objM108729b = eVar2.f60108w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar2.f60110y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            f fVar = new f(null);
            eVar2.f60110y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "getBffSettings", fVar, eVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC15898d.c.f60085a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC15898d.g((StravaBffSettingsResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: j */
    public final Object m44876j(AbstractC15896b.i iVar, InterfaceC30057d<? super AbstractC15898d> interfaceC30057d) {
        g gVar;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f60116z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f60116z = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        g gVar2 = gVar;
        Object objM108729b = gVar2.f60114x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar2.f60116z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            h hVar = new h(iVar, null);
            gVar2.f60113w = null;
            gVar2.f60116z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "upsertSettings", hVar, gVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC15898d.c.f60085a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC15898d.g((StravaBffSettingsResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: i */
    public final Object m44877i(AbstractC15896b abstractC15896b, InterfaceC30057d<? super AbstractC15898d> interfaceC30057d) {
        if (abstractC15896b instanceof AbstractC15896b.b) {
            return m44875h(interfaceC30057d);
        }
        if (abstractC15896b instanceof AbstractC15896b.i) {
            return m44876j((AbstractC15896b.i) abstractC15896b, interfaceC30057d);
        }
        if (abstractC15896b instanceof AbstractC15896b.a) {
            return m44873f(((AbstractC15896b.a) abstractC15896b).getAuthorizeRequest(), interfaceC30057d);
        }
        if (AbstractC22676k.m65745e(abstractC15896b, AbstractC15896b.c.f60024a)) {
            return m44874g(interfaceC30057d);
        }
        if ((abstractC15896b instanceof AbstractC15896b.f) || (abstractC15896b instanceof AbstractC15896b.e) || (abstractC15896b instanceof AbstractC15896b.g) || (abstractC15896b instanceof AbstractC15896b.h) || (abstractC15896b instanceof AbstractC15896b.d)) {
            return AbstractC15898d.c.f60085a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
