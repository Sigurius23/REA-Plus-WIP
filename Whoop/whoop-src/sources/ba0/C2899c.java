package ba0;

import aa0.C0591a;
import ad3.AbstractC0757c;
import com.whoop.addactivity.network.CoreDetailsActivityResponse;
import com.whoop.addactivity.network.CreateActivityRequestV1;
import com.whoop.addactivity.network.model.ScoreType;
import com.whoop.common.network.api.StrapLocationServiceApi;
import com.whoop.common.network.model.ActivityOverlapError;
import com.whoop.common.network.model.GarmentItemDto;
import com.whoop.connectivityCore.dataSyncService.models.ProcessNowSource;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.service.network.ActivitiesApi;
import dt0.InterfaceC12362e;
import ha0.C17051d;
import ia0.C18292a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.SerializationException;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import n82.EnumC26455a;
import org.joda.time.LocalDateTime;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import pp0.AbstractC29424b;
import pp0.C29423a;
import pp0.C29425c;
import pp0.C29427e;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import retrofit2.HttpException;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sp0.C32870j;
import sp0.EnumC32861a;
import sp0.EnumC32863c;
import sp0.EnumC32866f;
import sp0.InterfaceC32867g;
import sp0.InterfaceC32869i;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import u92.C34660d;
import ud3.AbstractC34799a1;
import ud3.C34850x0;

/* JADX INFO: renamed from: ba0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b)\b\u0007\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0082@¢\u0006\u0004\b$\u0010%J\u001c\u0010(\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&H\u0082@¢\u0006\u0004\b(\u0010)J \u0010,\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010+\u001a\u00020*H\u0082@¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b.\u0010/J \u00102\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u00101\u001a\u000200H\u0086@¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b(\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b6\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b,\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b.\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b2\u0010V\u001a\u0004\bW\u0010X¨\u0006Y"}, m65681d2 = {"Lba0/c;", "", "Lcom/whoop/common/network/api/StrapLocationServiceApi;", "strapLocationServiceApi", "Ltr2/n;", "logger", "Lcom/whoop/service/network/ActivitiesApi;", "activitiesApi", "Lia0/a;", "activityTypesRepository", "Lad3/c;", "json", "Laa0/a;", "addActivityAnalyticHelper", "Lpp0/a;", "activityDateValidator", "Lu92/d;", "prefsStore", "Lpp0/c;", "garmentStrapFilterHelper", "Lpp0/e;", "strapBodyLocationDataStoreHandler", "Ldt0/e;", "processNowApi", "<init>", "(Lcom/whoop/common/network/api/StrapLocationServiceApi;Ltr2/n;Lcom/whoop/service/network/ActivitiesApi;Lia0/a;Lad3/c;Laa0/a;Lpp0/a;Lu92/d;Lpp0/c;Lpp0/e;Ldt0/e;)V", "", "Lcom/whoop/common/network/model/GarmentItemDto;", "f", "(Lq83/d;)Ljava/lang/Object;", "garmentsList", "Lsp0/j;", "l", "(Ljava/util/List;)Ljava/util/List;", "Lba0/b;", "domainState", "e", "(Lba0/b;Lq83/d;)Ljava/lang/Object;", "", "activityInternalName", "g", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "isCancel", "i", "(Lba0/b;ZLq83/d;)Ljava/lang/Object;", "j", "(Lba0/b;)Lba0/b;", "Lba0/a;", "domainAction", "k", "(Lba0/b;Lba0/a;Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/common/network/api/StrapLocationServiceApi;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/common/network/api/StrapLocationServiceApi;", "b", "Ltr2/n;", "getLogger", "()Ltr2/n;", "c", "Lcom/whoop/service/network/ActivitiesApi;", "getActivitiesApi", "()Lcom/whoop/service/network/ActivitiesApi;", "d", "Lia0/a;", "getActivityTypesRepository", "()Lia0/a;", "Lad3/c;", "getJson", "()Lad3/c;", "Laa0/a;", "getAddActivityAnalyticHelper", "()Laa0/a;", "Lpp0/a;", "getActivityDateValidator", "()Lpp0/a;", "Lu92/d;", "getPrefsStore", "()Lu92/d;", "Lpp0/c;", "getGarmentStrapFilterHelper", "()Lpp0/c;", "Lpp0/e;", "getStrapBodyLocationDataStoreHandler", "()Lpp0/e;", "Ldt0/e;", "getProcessNowApi", "()Ldt0/e;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C2899c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final StrapLocationServiceApi strapLocationServiceApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ActivitiesApi activitiesApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C18292a activityTypesRepository;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C0591a addActivityAnalyticHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C29423a activityDateValidator;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C34660d prefsStore;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C29425c garmentStrapFilterHelper;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C29427e strapBodyLocationDataStoreHandler;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC12362e processNowApi;

    /* JADX INFO: renamed from: ba0.c$a */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11640a;

        static {
            int[] iArr = new int[EnumC32863c.values().length];
            try {
                iArr[EnumC32863c.SELECT_ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f11640a = iArr;
        }
    }

    /* JADX INFO: renamed from: ba0.c$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.add.activity.domain.AddActivityInteractor", m100430f = "AddActivityInteractor.kt", m100431l = {123, 134, 136}, m100432m = "createActivity", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f11641E;

        /* JADX INFO: renamed from: G */
        int f11643G;

        /* JADX INFO: renamed from: w */
        Object f11644w;

        /* JADX INFO: renamed from: x */
        Object f11645x;

        /* JADX INFO: renamed from: y */
        Object f11646y;

        /* JADX INFO: renamed from: z */
        boolean f11647z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f11641E = obj;
            this.f11643G |= Integer.MIN_VALUE;
            return C2899c.this.m8487e(null, this);
        }
    }

    /* JADX INFO: renamed from: ba0.c$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.add.activity.domain.AddActivityInteractor", m100430f = "AddActivityInteractor.kt", m100431l = {AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB}, m100432m = "fetchStrapLocations", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f11648w;

        /* JADX INFO: renamed from: y */
        int f11650y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f11648w = obj;
            this.f11650y |= Integer.MIN_VALUE;
            return C2899c.this.m8488f(this);
        }
    }

    /* JADX INFO: renamed from: ba0.c$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.add.activity.domain.AddActivityInteractor$fetchStrapLocations$garments$1", m100430f = "AddActivityInteractor.kt", m100431l = {101}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "", "Lcom/whoop/common/network/model/GarmentItemDto;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f11651w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C2899c.this.new d(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f11651w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            StrapLocationServiceApi strapLocationServiceApi = C2899c.this.getStrapLocationServiceApi();
            this.f11651w = 1;
            Object garmentsList = strapLocationServiceApi.getGarmentsList(this);
            return garmentsList == enumC31071a ? enumC31071a : garmentsList;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super List<GarmentItemDto>> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ba0.c$e */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.add.activity.domain.AddActivityInteractor", m100430f = "AddActivityInteractor.kt", m100431l = {181}, m100432m = "getActivityTypeString", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f11653w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f11654x;

        /* JADX INFO: renamed from: z */
        int f11656z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f11654x = obj;
            this.f11656z |= Integer.MIN_VALUE;
            return C2899c.this.m8489g(null, this);
        }
    }

    /* JADX INFO: renamed from: ba0.c$f */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.add.activity.domain.AddActivityInteractor", m100430f = "AddActivityInteractor.kt", m100431l = {191}, m100432m = "goBack", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f11657E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f11658F;

        /* JADX INFO: renamed from: H */
        int f11660H;

        /* JADX INFO: renamed from: w */
        Object f11661w;

        /* JADX INFO: renamed from: x */
        Object f11662x;

        /* JADX INFO: renamed from: y */
        Object f11663y;

        /* JADX INFO: renamed from: z */
        boolean f11664z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f11658F = obj;
            this.f11660H |= Integer.MIN_VALUE;
            return C2899c.this.m8490i(null, false, this);
        }
    }

    /* JADX INFO: renamed from: ba0.c$g */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.add.activity.domain.AddActivityInteractor", m100430f = "AddActivityInteractor.kt", m100431l = {50, 56, 61, 71, 77, 83, 93, 94}, m100432m = "interact", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f11665E;

        /* JADX INFO: renamed from: F */
        Object f11666F;

        /* JADX INFO: renamed from: G */
        Object f11667G;

        /* JADX INFO: renamed from: H */
        Object f11668H;

        /* JADX INFO: renamed from: I */
        Object f11669I;

        /* JADX INFO: renamed from: J */
        Object f11670J;

        /* JADX INFO: renamed from: K */
        Object f11671K;

        /* JADX INFO: renamed from: L */
        Object f11672L;

        /* JADX INFO: renamed from: M */
        boolean f11673M;

        /* JADX INFO: renamed from: N */
        int f11674N;

        /* JADX INFO: renamed from: O */
        /* synthetic */ Object f11675O;

        /* JADX INFO: renamed from: Q */
        int f11677Q;

        /* JADX INFO: renamed from: w */
        Object f11678w;

        /* JADX INFO: renamed from: x */
        Object f11679x;

        /* JADX INFO: renamed from: y */
        Object f11680y;

        /* JADX INFO: renamed from: z */
        Object f11681z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f11675O = obj;
            this.f11677Q |= Integer.MIN_VALUE;
            return C2899c.this.m8494k(null, null, this);
        }
    }

    public C2899c(StrapLocationServiceApi strapLocationServiceApi, InterfaceC34116n logger, ActivitiesApi activitiesApi, C18292a activityTypesRepository, AbstractC0757c json, C0591a addActivityAnalyticHelper, C29423a activityDateValidator, C34660d prefsStore, C29425c garmentStrapFilterHelper, C29427e strapBodyLocationDataStoreHandler, InterfaceC12362e processNowApi) {
        AbstractC22676k.m65750j(strapLocationServiceApi, "strapLocationServiceApi");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(activitiesApi, "activitiesApi");
        AbstractC22676k.m65750j(activityTypesRepository, "activityTypesRepository");
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(addActivityAnalyticHelper, "addActivityAnalyticHelper");
        AbstractC22676k.m65750j(activityDateValidator, "activityDateValidator");
        AbstractC22676k.m65750j(prefsStore, "prefsStore");
        AbstractC22676k.m65750j(garmentStrapFilterHelper, "garmentStrapFilterHelper");
        AbstractC22676k.m65750j(strapBodyLocationDataStoreHandler, "strapBodyLocationDataStoreHandler");
        AbstractC22676k.m65750j(processNowApi, "processNowApi");
        this.strapLocationServiceApi = strapLocationServiceApi;
        this.logger = logger;
        this.activitiesApi = activitiesApi;
        this.activityTypesRepository = activityTypesRepository;
        this.json = json;
        this.addActivityAnalyticHelper = addActivityAnalyticHelper;
        this.activityDateValidator = activityDateValidator;
        this.prefsStore = prefsStore;
        this.garmentStrapFilterHelper = garmentStrapFilterHelper;
        this.strapBodyLocationDataStoreHandler = strapBodyLocationDataStoreHandler;
        this.processNowApi = processNowApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x00e7 A[Catch: Exception -> 0x0160, IOException -> 0x0163, TRY_LEAVE, TryCatch #12 {IOException -> 0x0163, Exception -> 0x0160, blocks: (B:41:0x00df, B:43:0x00e7, B:58:0x0166, B:61:0x016c, B:63:0x0170, B:65:0x0176, B:71:0x01e5, B:72:0x01ea, B:67:0x01ab, B:69:0x01c8), top: B:81:0x00df, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:49:0x010e A[Catch: IOException -> 0x013f, Exception -> 0x01ef, TryCatch #10 {IOException -> 0x013f, Exception -> 0x01ef, blocks: (B:47:0x00fa, B:49:0x010e, B:51:0x0114, B:54:0x0142), top: B:84:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0166 A[Catch: Exception -> 0x0160, IOException -> 0x0163, TRY_ENTER, TRY_LEAVE, TryCatch #12 {IOException -> 0x0163, Exception -> 0x0160, blocks: (B:41:0x00df, B:43:0x00e7, B:58:0x0166, B:61:0x016c, B:63:0x0170, B:65:0x0176, B:71:0x01e5, B:72:0x01ea, B:67:0x01ab, B:69:0x01c8), top: B:81:0x00df, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:85:0x016c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final Object m8487e(C2898b c2898b, InterfaceC30057d<? super C2898b> interfaceC30057d) {
        b bVar;
        C0591a c0591a;
        boolean isGdcFlow;
        String activityInternalName;
        C2898b c2898b2;
        CreateActivityRequestV1 createActivityRequestV1;
        C2898b c2898b3;
        C2898b c2898b4;
        C2898b c2898b5;
        C29218v0 c29218v0;
        C34850x0 c34850x0;
        AbstractC34799a1 abstractC34799a1;
        String strM109860m;
        C18292a c18292a;
        C29218v0 c29218v1;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f11643G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f11643G = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM8489g = bVar.f11641E;
        Object obj = EnumC31071a.f128113w;
        int i14 = bVar.f11643G;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM8489g);
                c0591a = this.addActivityAnalyticHelper;
                isGdcFlow = c2898b.getIsGdcFlow();
                activityInternalName = c2898b.getActivityInternalName();
                String activityInternalName2 = c2898b.getActivityInternalName();
                c2898b2 = c2898b;
                bVar.f11644w = c2898b2;
                bVar.f11645x = c0591a;
                bVar.f11646y = activityInternalName;
                bVar.f11647z = isGdcFlow;
                bVar.f11643G = 1;
                objM8489g = m8489g(activityInternalName2, bVar);
                if (objM8489g != obj) {
                }
                return obj;
            }
            if (i14 == 1) {
                isGdcFlow = bVar.f11647z;
                activityInternalName = (String) bVar.f11646y;
                c0591a = (C0591a) bVar.f11645x;
                c2898b2 = (C2898b) bVar.f11644w;
                AbstractC34132o.m107864I(objM8489g);
            } else {
                if (i14 == 2) {
                    C2898b c2898b6 = (C2898b) bVar.f11644w;
                    try {
                        AbstractC34132o.m107864I(objM8489g);
                        c2898b5 = c2898b6;
                        try {
                            c29218v0 = (C29218v0) objM8489g;
                            c34850x0 = c29218v0.f118269a;
                            if (c34850x0.f146788Q) {
                                if (c34850x0.f146792z == 409) {
                                    try {
                                        abstractC34799a1 = c29218v0.f118271c;
                                        if (abstractC34799a1 != null && (strM109860m = abstractC34799a1.m109860m()) != null) {
                                            AbstractC0757c abstractC0757c = this.json;
                                            abstractC0757c.getClass();
                                            return C2898b.m8470b(c2898b5, null, null, null, null, null, null, null, null, null, new InterfaceC32869i.a((ActivityOverlapError) abstractC0757c.m1831b(ActivityOverlapError.INSTANCE.serializer(), strM109860m)), null, false, null, 7679, null);
                                        }
                                    } catch (NullPointerException unused) {
                                        return C2898b.m8470b(c2898b5, null, null, null, null, null, null, null, null, null, InterfaceC32869i.i.f136917a, null, false, null, 7679, null);
                                    } catch (SerializationException unused2) {
                                        return C2898b.m8470b(c2898b5, null, null, null, null, null, null, null, null, null, InterfaceC32869i.i.f136917a, null, false, null, 7679, null);
                                    }
                                }
                                throw new HttpException(c29218v0);
                            }
                            c18292a = this.activityTypesRepository;
                            bVar.f11644w = c2898b5;
                            bVar.f11645x = null;
                            bVar.f11646y = c29218v0;
                            bVar.f11643G = 3;
                            if (c18292a.m52659d(bVar) != obj) {
                                c29218v1 = c29218v0;
                                c2898b3 = c2898b5;
                                CoreDetailsActivityResponse coreDetailsActivityResponse = (CoreDetailsActivityResponse) c29218v1.f118270b;
                                this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_ACTIVITY_COMPLETED, true);
                                this.processNowApi.mo34626a(ProcessNowSource.ADD_ACTIVITY);
                                if (coreDetailsActivityResponse == null) {
                                }
                            }
                            return obj;
                        } catch (IOException unused3) {
                            c2898b4 = c2898b5;
                        } catch (Exception unused4) {
                            c2898b3 = c2898b5;
                            return C2898b.m8470b(c2898b3, null, null, null, null, null, null, null, null, null, new InterfaceC32869i.e(InterfaceC32867g.a.f136906a, EnumC32866f.CLOSE_MODAL), null, false, null, 7679, null);
                        }
                    } catch (IOException unused5) {
                        c2898b4 = c2898b6;
                    } catch (Exception unused6) {
                        c2898b3 = c2898b6;
                        return C2898b.m8470b(c2898b3, null, null, null, null, null, null, null, null, null, new InterfaceC32869i.e(InterfaceC32867g.a.f136906a, EnumC32866f.CLOSE_MODAL), null, false, null, 7679, null);
                    }
                    return C2898b.m8470b(c2898b4, null, null, null, null, null, null, null, null, null, new InterfaceC32869i.h(InterfaceC32867g.a.f136906a, EnumC32866f.CLOSE_MODAL), null, false, null, 7679, null);
                }
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c29218v1 = (C29218v0) bVar.f11646y;
                c2898b4 = (C2898b) bVar.f11644w;
                try {
                    AbstractC34132o.m107864I(objM8489g);
                    c2898b3 = c2898b4;
                    try {
                        CoreDetailsActivityResponse coreDetailsActivityResponse2 = (CoreDetailsActivityResponse) c29218v1.f118270b;
                        this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_ACTIVITY_COMPLETED, true);
                        this.processNowApi.mo34626a(ProcessNowSource.ADD_ACTIVITY);
                        return (coreDetailsActivityResponse2 == null && coreDetailsActivityResponse2.getStrengthTrainerLinkable()) ? C2898b.m8470b(c2898b3, null, null, null, null, null, null, null, null, null, new InterfaceC32869i.g(coreDetailsActivityResponse2.getActivityResponse().getId()), null, false, null, 7679, null) : C2898b.m8470b(c2898b3, null, null, null, null, null, null, null, null, null, InterfaceC32869i.j.f136918a, null, false, null, 7679, null);
                    } catch (IOException unused7) {
                        c2898b4 = c2898b3;
                    } catch (Exception unused8) {
                        return C2898b.m8470b(c2898b3, null, null, null, null, null, null, null, null, null, new InterfaceC32869i.e(InterfaceC32867g.a.f136906a, EnumC32866f.CLOSE_MODAL), null, false, null, 7679, null);
                    }
                } catch (IOException unused9) {
                } catch (Exception unused10) {
                    c2898b3 = c2898b4;
                    return C2898b.m8470b(c2898b3, null, null, null, null, null, null, null, null, null, new InterfaceC32869i.e(InterfaceC32867g.a.f136906a, EnumC32866f.CLOSE_MODAL), null, false, null, 7679, null);
                }
            }
            ActivitiesApi activitiesApi = this.activitiesApi;
            bVar.f11644w = c2898b2;
            bVar.f11645x = null;
            bVar.f11646y = null;
            bVar.f11643G = 2;
            objM8489g = activitiesApi.createActivity(createActivityRequestV1, bVar);
            if (objM8489g != obj) {
                c2898b5 = c2898b2;
                c29218v0 = (C29218v0) objM8489g;
                c34850x0 = c29218v0.f118269a;
                if (c34850x0.f146788Q) {
                    if (c34850x0.f146792z == 409) {
                        abstractC34799a1 = c29218v0.f118271c;
                        if (abstractC34799a1 != null) {
                            AbstractC0757c abstractC0757c2 = this.json;
                            abstractC0757c2.getClass();
                            return C2898b.m8470b(c2898b5, null, null, null, null, null, null, null, null, null, new InterfaceC32869i.a((ActivityOverlapError) abstractC0757c2.m1831b(ActivityOverlapError.INSTANCE.serializer(), strM109860m)), null, false, null, 7679, null);
                        }
                    }
                    throw new HttpException(c29218v0);
                }
                c18292a = this.activityTypesRepository;
                bVar.f11644w = c2898b5;
                bVar.f11645x = null;
                bVar.f11646y = c29218v0;
                bVar.f11643G = 3;
                if (c18292a.m52659d(bVar) != obj) {
                    c29218v1 = c29218v0;
                    c2898b3 = c2898b5;
                    CoreDetailsActivityResponse coreDetailsActivityResponse3 = (CoreDetailsActivityResponse) c29218v1.f118270b;
                    this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_ACTIVITY_COMPLETED, true);
                    this.processNowApi.mo34626a(ProcessNowSource.ADD_ACTIVITY);
                    if (coreDetailsActivityResponse3 == null) {
                    }
                }
                return C2898b.m8470b(c2898b4, null, null, null, null, null, null, null, null, null, new InterfaceC32869i.h(InterfaceC32867g.a.f136906a, EnumC32866f.CLOSE_MODAL), null, false, null, 7679, null);
            }
            return obj;
        } catch (IOException unused11) {
            c2898b4 = c2898b2;
        } catch (Exception unused12) {
            c2898b3 = c2898b2;
            return C2898b.m8470b(c2898b3, null, null, null, null, null, null, null, null, null, new InterfaceC32869i.e(InterfaceC32867g.a.f136906a, EnumC32866f.CLOSE_MODAL), null, false, null, 7679, null);
        }
        String str = (String) objM8489g;
        if (str == null) {
            str = "";
        }
        c0591a.m1546b(isGdcFlow, activityInternalName, str);
        String activityInternalName3 = c2898b2.getActivityInternalName();
        C32870j strapLocation = c2898b2.getStrapLocation();
        createActivityRequestV1 = new CreateActivityRequestV1(activityInternalName3, strapLocation != null ? strapLocation.getStrapLocationId() : 0, AbstractC29424b.m89697a(c2898b2.getStartTimeValue()), AbstractC29424b.m89697a(c2898b2.getEndTimeValue()), false, (List) null, 32, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: f */
    public final Object m8488f(InterfaceC30057d<? super List<GarmentItemDto>> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f11650y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f11650y = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM108729b = cVar2.f11648w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f11650y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            d dVar = new d(null);
            cVar2.f11650y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, dVar, cVar2, 6, null);
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
        boolean z4 = interfaceC34385a instanceof InterfaceC34385a.b.C42432b;
        List<GarmentItemDto> list = C25271y.f99162w;
        if (!z4 && !(interfaceC34385a instanceof InterfaceC34385a.b.a)) {
            if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            list = (List) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
        }
        return list.isEmpty() ? list : this.garmentStrapFilterHelper.m89700a(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m8489g(String str, InterfaceC30057d<? super String> interfaceC30057d) {
        e eVar;
        Object next;
        ScoreType scoreType;
        String strName;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f11656z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f11656z = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object objM52661f = eVar.f11654x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f11656z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM52661f);
            C18292a c18292a = this.activityTypesRepository;
            eVar.f11653w = str;
            eVar.f11656z = 1;
            objM52661f = c18292a.m52661f(eVar);
            if (objM52661f == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) eVar.f11653w;
            AbstractC34132o.m107864I(objM52661f);
        }
        Iterator it = ((Iterable) objM52661f).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(str, ((C17051d) next).getInternalName()));
        C17051d c17051d = (C17051d) next;
        if (c17051d == null || (scoreType = c17051d.getScoreType()) == null || (strName = scoreType.name()) == null) {
            return null;
        }
        Locale locale = Locale.getDefault();
        AbstractC22676k.m65749i(locale, "getDefault(...)");
        String lowerCase = strName.toLowerCase(locale);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        if (lowerCase.length() <= 0) {
            return lowerCase;
        }
        StringBuilder sb4 = new StringBuilder();
        String strValueOf = String.valueOf(lowerCase.charAt(0));
        AbstractC22676k.m65748h(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        sb4.append((Object) upperCase);
        String strSubstring = lowerCase.substring(1);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        sb4.append(strSubstring);
        return sb4.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x008c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: i */
    public final Object m8490i(C2898b c2898b, boolean z4, InterfaceC30057d<? super C2898b> interfaceC30057d) {
        f fVar;
        C2898b c2898b2;
        C0591a c0591a;
        boolean z13;
        String str;
        C2898b c2898b3;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f11660H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f11660H = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object obj = fVar.f11658F;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = fVar.f11660H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (z4) {
                c0591a = this.addActivityAnalyticHelper;
                boolean isGdcFlow = c2898b.getIsGdcFlow();
                String activityInternalName = c2898b.getActivityInternalName();
                String activityInternalName2 = c2898b.getActivityInternalName();
                fVar.f11661w = c2898b;
                fVar.f11662x = c0591a;
                fVar.f11663y = activityInternalName;
                fVar.f11664z = z4;
                fVar.f11657E = isGdcFlow;
                fVar.f11660H = 1;
                Object objM8489g = m8489g(activityInternalName2, fVar);
                if (objM8489g == obj2) {
                    return obj2;
                }
                obj = objM8489g;
                z13 = isGdcFlow;
                str = activityInternalName;
                c2898b3 = c2898b;
            } else {
                c2898b2 = c2898b;
            }
            return a.f11640a[c2898b2.getDataState().ordinal()] == 1 ? C2898b.m8470b(c2898b2, null, null, null, null, null, null, null, null, EnumC32863c.EDIT_ACTIVITY, null, null, false, null, 7935, null) : C2898b.m8470b(c2898b2, null, null, null, null, null, null, null, null, null, InterfaceC32869i.c.f136909a, null, false, null, 7679, null);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z13 = fVar.f11657E;
        str = (String) fVar.f11663y;
        c0591a = (C0591a) fVar.f11662x;
        c2898b3 = (C2898b) fVar.f11661w;
        AbstractC34132o.m107864I(obj);
        String str2 = (String) obj;
        if (str2 == null) {
            str2 = "";
        }
        c0591a.m1545a(z13, str, str2);
        c2898b2 = c2898b3;
        if (a.f11640a[c2898b2.getDataState().ordinal()] == 1) {
        }
    }

    /* JADX INFO: renamed from: j */
    private final C2898b m8491j(C2898b domainState) {
        return C2898b.m8470b(domainState, null, null, null, null, null, null, null, null, null, InterfaceC32869i.b.f136908a, null, false, null, 7679, null);
    }

    /* JADX INFO: renamed from: l */
    private final List<C32870j> m8492l(List<GarmentItemDto> garmentsList) {
        List<GarmentItemDto> list = garmentsList;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (GarmentItemDto garmentItemDto : list) {
            Integer id4 = garmentItemDto.getId();
            arrayList.add(new C32870j(id4 != null ? id4.intValue() : 0, AbstractC8693b.m21278l(garmentItemDto.getName())));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final StrapLocationServiceApi getStrapLocationServiceApi() {
        return this.strapLocationServiceApi;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0150  */
    /* JADX WARN: Code duplicated, block: B:35:0x0196  */
    /* JADX WARN: Code duplicated, block: B:38:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x0262  */
    /* JADX WARN: Code duplicated, block: B:61:0x0265  */
    /* JADX WARN: Code duplicated, block: B:64:0x026b  */
    /* JADX WARN: Code duplicated, block: B:74:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: k */
    public final Object m8494k(C2898b c2898b, InterfaceC2897a interfaceC2897a, InterfaceC30057d<? super C2898b> interfaceC30057d) {
        g gVar;
        LocalDateTime endTime;
        C29423a c29423a;
        LocalDateTime endTime2;
        C2898b c2898b2;
        LocalDateTime localDateTime;
        int i13;
        LocalDateTime startTime;
        C29423a c29423a2;
        C2898b c2898b3;
        LocalDateTime localDateTime2;
        LocalDateTime localDateTime3;
        int i14;
        C2898b c2898b4;
        InterfaceC2897a interfaceC2897a2;
        List<GarmentItemDto> list;
        LocalDateTime localDateTimeM89698b;
        LocalDateTime localDateTimeM89698b2;
        Object objM89703b;
        InterfaceC2897a interfaceC2897a3;
        LocalDateTime localDateTime4;
        C32870j c32870j;
        List<C32870j> listM8492l;
        String internalName;
        EnumC26455a initialScreenType;
        boolean isGdcFlow;
        C29423a c29423a3;
        Object objM8489g;
        C2898b c2898b5;
        LocalDateTime localDateTime5;
        String str;
        EnumC26455a enumC26455a;
        LocalDateTime localDateTime6;
        LocalDateTime localDateTime7;
        boolean z4;
        C29423a c29423a4;
        boolean z13;
        boolean z14;
        C2898b c2898b6 = c2898b;
        InterfaceC2897a interfaceC2897a4 = interfaceC2897a;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i15 = gVar.f11677Q;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                gVar.f11677Q = i15 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object objM8488f = gVar.f11675O;
        Object obj = EnumC31071a.f128113w;
        switch (gVar.f11677Q) {
            case 0:
                AbstractC34132o.m107864I(objM8488f);
                if (interfaceC2897a4 instanceof InterfaceC2897a.g) {
                    gVar.f11678w = c2898b6;
                    gVar.f11679x = interfaceC2897a4;
                    gVar.f11677Q = 1;
                    objM8488f = m8488f(gVar);
                    if (objM8488f != obj) {
                        list = (List) objM8488f;
                        InterfaceC2897a.g gVar2 = (InterfaceC2897a.g) interfaceC2897a4;
                        localDateTimeM89698b = AbstractC29424b.m89698b(gVar2.getStartDate());
                        localDateTimeM89698b2 = AbstractC29424b.m89698b(gVar2.getEndDate());
                        C29427e c29427e = this.strapBodyLocationDataStoreHandler;
                        gVar.f11678w = c2898b6;
                        gVar.f11679x = interfaceC2897a4;
                        gVar.f11680y = list;
                        gVar.f11681z = localDateTimeM89698b;
                        gVar.f11665E = localDateTimeM89698b2;
                        gVar.f11677Q = 2;
                        objM89703b = c29427e.m89703b(list, gVar);
                        if (objM89703b != obj) {
                            interfaceC2897a3 = interfaceC2897a4;
                            localDateTime4 = localDateTimeM89698b2;
                            objM8488f = objM89703b;
                            c32870j = (C32870j) objM8488f;
                            listM8492l = m8492l(list);
                            InterfaceC2897a.g gVar3 = (InterfaceC2897a.g) interfaceC2897a3;
                            internalName = gVar3.getInternalName();
                            initialScreenType = gVar3.getInitialScreenType();
                            isGdcFlow = gVar3.getIsGdcFlow();
                            c29423a3 = this.activityDateValidator;
                            String activityInternalName = c2898b6.getActivityInternalName();
                            gVar.f11678w = c2898b6;
                            gVar.f11679x = null;
                            gVar.f11680y = null;
                            gVar.f11681z = localDateTimeM89698b;
                            gVar.f11665E = localDateTime4;
                            gVar.f11666F = c32870j;
                            gVar.f11667G = listM8492l;
                            gVar.f11668H = internalName;
                            gVar.f11669I = initialScreenType;
                            gVar.f11670J = c29423a3;
                            gVar.f11671K = localDateTimeM89698b;
                            gVar.f11672L = localDateTime4;
                            gVar.f11673M = isGdcFlow;
                            gVar.f11677Q = 3;
                            objM8489g = m8489g(activityInternalName, gVar);
                            if (objM8489g != obj) {
                                c2898b5 = c2898b6;
                                localDateTime5 = localDateTime4;
                                str = internalName;
                                objM8488f = objM8489g;
                                enumC26455a = initialScreenType;
                                localDateTime6 = localDateTimeM89698b;
                                localDateTime7 = localDateTime6;
                                z4 = isGdcFlow;
                                c29423a4 = c29423a3;
                                String str2 = (String) objM8488f;
                                return C2898b.m8470b(c2898b5, null, null, null, str, localDateTime7, localDateTime5, c32870j, listM8492l, null, null, enumC26455a, z4, c29423a4.m89696d(localDateTime6, localDateTime4, str2 != null ? EnumC32861a.INSTANCE.m103130a(str2) : null), 775, null);
                            }
                        }
                    }
                } else {
                    if (interfaceC2897a4 instanceof InterfaceC2897a.f) {
                        return C2898b.m8470b(c2898b6, null, null, null, null, null, null, null, null, EnumC32863c.SELECT_ACTIVITY, null, ((InterfaceC2897a.f) interfaceC2897a4).getScreenType(), false, null, 6911, null);
                    }
                    if (interfaceC2897a4 instanceof InterfaceC2897a.l) {
                        C29427e c29427e2 = this.strapBodyLocationDataStoreHandler;
                        int strapLocationId = ((InterfaceC2897a.l) interfaceC2897a4).getStrapLocation().getStrapLocationId();
                        gVar.f11678w = c2898b6;
                        gVar.f11679x = interfaceC2897a4;
                        gVar.f11677Q = 4;
                        if (c29427e2.m89704c(strapLocationId, gVar) != obj) {
                            c2898b4 = c2898b6;
                            interfaceC2897a2 = interfaceC2897a4;
                            return C2898b.m8470b(c2898b4, null, null, null, null, null, null, ((InterfaceC2897a.l) interfaceC2897a2).getStrapLocation(), null, null, null, null, false, null, 8127, null);
                        }
                    } else if (interfaceC2897a4 instanceof InterfaceC2897a.k) {
                        InterfaceC2897a.k kVar = (InterfaceC2897a.k) interfaceC2897a4;
                        startTime = kVar.getStartTime();
                        c29423a2 = this.activityDateValidator;
                        LocalDateTime startTime2 = kVar.getStartTime();
                        LocalDateTime endTimeValue = c2898b6.getEndTimeValue();
                        String activityInternalName2 = c2898b6.getActivityInternalName();
                        gVar.f11678w = null;
                        gVar.f11679x = null;
                        gVar.f11680y = c2898b6;
                        gVar.f11681z = startTime;
                        gVar.f11665E = c29423a2;
                        gVar.f11666F = startTime2;
                        gVar.f11667G = endTimeValue;
                        gVar.f11674N = 0;
                        gVar.f11677Q = 5;
                        Object objM8489g2 = m8489g(activityInternalName2, gVar);
                        if (objM8489g2 != obj) {
                            c2898b3 = c2898b6;
                            localDateTime2 = startTime2;
                            localDateTime3 = endTimeValue;
                            objM8488f = objM8489g2;
                            i14 = 0;
                            LocalDateTime localDateTime8 = startTime;
                            if (i14 != 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            String str3 = (String) objM8488f;
                            return C2898b.m8470b(c2898b3, null, null, null, null, localDateTime8, null, null, null, null, null, null, z13, c29423a2.m89696d(localDateTime2, localDateTime3, str3 != null ? EnumC32861a.INSTANCE.m103130a(str3) : null), 4079, null);
                        }
                    } else if (interfaceC2897a4 instanceof InterfaceC2897a.j) {
                        InterfaceC2897a.j jVar = (InterfaceC2897a.j) interfaceC2897a4;
                        endTime = jVar.getEndTime();
                        c29423a = this.activityDateValidator;
                        LocalDateTime startTimeValue = c2898b6.getStartTimeValue();
                        endTime2 = jVar.getEndTime();
                        String activityInternalName3 = c2898b6.getActivityInternalName();
                        gVar.f11678w = null;
                        gVar.f11679x = null;
                        gVar.f11680y = c2898b6;
                        gVar.f11681z = endTime;
                        gVar.f11665E = c29423a;
                        gVar.f11666F = startTimeValue;
                        gVar.f11667G = endTime2;
                        gVar.f11674N = 0;
                        gVar.f11677Q = 6;
                        Object objM8489g3 = m8489g(activityInternalName3, gVar);
                        if (objM8489g3 != obj) {
                            c2898b2 = c2898b6;
                            localDateTime = startTimeValue;
                            objM8488f = objM8489g3;
                            i13 = 0;
                            LocalDateTime localDateTime9 = endTime;
                            if (i13 != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            String str4 = (String) objM8488f;
                            return C2898b.m8470b(c2898b2, null, null, null, null, null, localDateTime9, null, null, null, null, null, z14, c29423a.m89696d(localDateTime, endTime2, str4 != null ? EnumC32861a.INSTANCE.m103130a(str4) : null), 4063, null);
                        }
                    } else {
                        if (interfaceC2897a4 instanceof InterfaceC2897a.i) {
                            return C2898b.m8470b(c2898b6, null, null, null, null, null, null, null, null, null, InterfaceC32869i.k.f136919a, null, false, null, 7679, null);
                        }
                        if (interfaceC2897a4 instanceof InterfaceC2897a.a) {
                            return C2898b.m8470b(c2898b, null, null, null, ((InterfaceC2897a.a) interfaceC2897a4).getInternalName(), null, null, null, null, EnumC32863c.EDIT_ACTIVITY, null, null, false, null, 7927, null);
                        }
                        if (interfaceC2897a4 instanceof InterfaceC2897a.e) {
                            return m8491j(c2898b);
                        }
                        if (interfaceC2897a4 instanceof InterfaceC2897a.d) {
                            boolean isCancel = ((InterfaceC2897a.d) interfaceC2897a4).getIsCancel();
                            gVar.f11678w = null;
                            gVar.f11679x = null;
                            gVar.f11677Q = 7;
                            Object objM8490i = m8490i(c2898b, isCancel, gVar);
                            if (objM8490i != obj) {
                                return objM8490i;
                            }
                        } else {
                            if (!AbstractC22676k.m65745e(interfaceC2897a4, InterfaceC2897a.h.f11610a)) {
                                if (AbstractC22676k.m65745e(interfaceC2897a4, InterfaceC2897a.c.f11601a)) {
                                    return C2898b.m8470b(c2898b, null, null, null, null, null, null, null, null, null, InterfaceC32869i.c.f136909a, null, false, null, 7679, null);
                                }
                                if (AbstractC22676k.m65745e(interfaceC2897a4, InterfaceC2897a.b.f11600a)) {
                                    return C2898b.m8470b(c2898b, null, null, null, null, null, null, null, null, null, InterfaceC32869i.b.f136908a, null, false, null, 7679, null);
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            gVar.f11678w = null;
                            gVar.f11679x = null;
                            gVar.f11677Q = 8;
                            Object objM8487e = m8487e(c2898b, gVar);
                            if (objM8487e != obj) {
                                return objM8487e;
                            }
                        }
                    }
                }
                return obj;
            case 1:
                InterfaceC2897a interfaceC2897a5 = (InterfaceC2897a) gVar.f11679x;
                C2898b c2898b7 = (C2898b) gVar.f11678w;
                AbstractC34132o.m107864I(objM8488f);
                interfaceC2897a4 = interfaceC2897a5;
                c2898b6 = c2898b7;
                list = (List) objM8488f;
                InterfaceC2897a.g gVar4 = (InterfaceC2897a.g) interfaceC2897a4;
                localDateTimeM89698b = AbstractC29424b.m89698b(gVar4.getStartDate());
                localDateTimeM89698b2 = AbstractC29424b.m89698b(gVar4.getEndDate());
                C29427e c29427e3 = this.strapBodyLocationDataStoreHandler;
                gVar.f11678w = c2898b6;
                gVar.f11679x = interfaceC2897a4;
                gVar.f11680y = list;
                gVar.f11681z = localDateTimeM89698b;
                gVar.f11665E = localDateTimeM89698b2;
                gVar.f11677Q = 2;
                objM89703b = c29427e3.m89703b(list, gVar);
                if (objM89703b != obj) {
                    interfaceC2897a3 = interfaceC2897a4;
                    localDateTime4 = localDateTimeM89698b2;
                    objM8488f = objM89703b;
                    c32870j = (C32870j) objM8488f;
                    listM8492l = m8492l(list);
                    InterfaceC2897a.g gVar5 = (InterfaceC2897a.g) interfaceC2897a3;
                    internalName = gVar5.getInternalName();
                    initialScreenType = gVar5.getInitialScreenType();
                    isGdcFlow = gVar5.getIsGdcFlow();
                    c29423a3 = this.activityDateValidator;
                    String activityInternalName4 = c2898b6.getActivityInternalName();
                    gVar.f11678w = c2898b6;
                    gVar.f11679x = null;
                    gVar.f11680y = null;
                    gVar.f11681z = localDateTimeM89698b;
                    gVar.f11665E = localDateTime4;
                    gVar.f11666F = c32870j;
                    gVar.f11667G = listM8492l;
                    gVar.f11668H = internalName;
                    gVar.f11669I = initialScreenType;
                    gVar.f11670J = c29423a3;
                    gVar.f11671K = localDateTimeM89698b;
                    gVar.f11672L = localDateTime4;
                    gVar.f11673M = isGdcFlow;
                    gVar.f11677Q = 3;
                    objM8489g = m8489g(activityInternalName4, gVar);
                    if (objM8489g != obj) {
                        c2898b5 = c2898b6;
                        localDateTime5 = localDateTime4;
                        str = internalName;
                        objM8488f = objM8489g;
                        enumC26455a = initialScreenType;
                        localDateTime6 = localDateTimeM89698b;
                        localDateTime7 = localDateTime6;
                        z4 = isGdcFlow;
                        c29423a4 = c29423a3;
                        String str5 = (String) objM8488f;
                        return C2898b.m8470b(c2898b5, null, null, null, str, localDateTime7, localDateTime5, c32870j, listM8492l, null, null, enumC26455a, z4, c29423a4.m89696d(localDateTime6, localDateTime4, str5 != null ? EnumC32861a.INSTANCE.m103130a(str5) : null), 775, null);
                    }
                }
                return obj;
            case 2:
                LocalDateTime localDateTime10 = (LocalDateTime) gVar.f11665E;
                LocalDateTime localDateTime11 = (LocalDateTime) gVar.f11681z;
                list = (List) gVar.f11680y;
                InterfaceC2897a interfaceC2897a6 = (InterfaceC2897a) gVar.f11679x;
                C2898b c2898b8 = (C2898b) gVar.f11678w;
                AbstractC34132o.m107864I(objM8488f);
                localDateTime4 = localDateTime10;
                c2898b6 = c2898b8;
                interfaceC2897a3 = interfaceC2897a6;
                localDateTimeM89698b = localDateTime11;
                c32870j = (C32870j) objM8488f;
                listM8492l = m8492l(list);
                InterfaceC2897a.g gVar6 = (InterfaceC2897a.g) interfaceC2897a3;
                internalName = gVar6.getInternalName();
                initialScreenType = gVar6.getInitialScreenType();
                isGdcFlow = gVar6.getIsGdcFlow();
                c29423a3 = this.activityDateValidator;
                String activityInternalName5 = c2898b6.getActivityInternalName();
                gVar.f11678w = c2898b6;
                gVar.f11679x = null;
                gVar.f11680y = null;
                gVar.f11681z = localDateTimeM89698b;
                gVar.f11665E = localDateTime4;
                gVar.f11666F = c32870j;
                gVar.f11667G = listM8492l;
                gVar.f11668H = internalName;
                gVar.f11669I = initialScreenType;
                gVar.f11670J = c29423a3;
                gVar.f11671K = localDateTimeM89698b;
                gVar.f11672L = localDateTime4;
                gVar.f11673M = isGdcFlow;
                gVar.f11677Q = 3;
                objM8489g = m8489g(activityInternalName5, gVar);
                if (objM8489g != obj) {
                    c2898b5 = c2898b6;
                    localDateTime5 = localDateTime4;
                    str = internalName;
                    objM8488f = objM8489g;
                    enumC26455a = initialScreenType;
                    localDateTime6 = localDateTimeM89698b;
                    localDateTime7 = localDateTime6;
                    z4 = isGdcFlow;
                    c29423a4 = c29423a3;
                    String str6 = (String) objM8488f;
                    return C2898b.m8470b(c2898b5, null, null, null, str, localDateTime7, localDateTime5, c32870j, listM8492l, null, null, enumC26455a, z4, c29423a4.m89696d(localDateTime6, localDateTime4, str6 != null ? EnumC32861a.INSTANCE.m103130a(str6) : null), 775, null);
                }
                return obj;
            case 3:
                boolean z15 = gVar.f11673M;
                localDateTime4 = (LocalDateTime) gVar.f11672L;
                localDateTime6 = (LocalDateTime) gVar.f11671K;
                c29423a4 = (C29423a) gVar.f11670J;
                EnumC26455a enumC26455a2 = (EnumC26455a) gVar.f11669I;
                String str7 = (String) gVar.f11668H;
                listM8492l = (List) gVar.f11667G;
                c32870j = (C32870j) gVar.f11666F;
                LocalDateTime localDateTime12 = (LocalDateTime) gVar.f11665E;
                LocalDateTime localDateTime13 = (LocalDateTime) gVar.f11681z;
                C2898b c2898b9 = (C2898b) gVar.f11678w;
                AbstractC34132o.m107864I(objM8488f);
                z4 = z15;
                enumC26455a = enumC26455a2;
                str = str7;
                localDateTime5 = localDateTime12;
                localDateTime7 = localDateTime13;
                c2898b5 = c2898b9;
                String str8 = (String) objM8488f;
                return C2898b.m8470b(c2898b5, null, null, null, str, localDateTime7, localDateTime5, c32870j, listM8492l, null, null, enumC26455a, z4, c29423a4.m89696d(localDateTime6, localDateTime4, str8 != null ? EnumC32861a.INSTANCE.m103130a(str8) : null), 775, null);
            case 4:
                interfaceC2897a2 = (InterfaceC2897a) gVar.f11679x;
                C2898b c2898b10 = (C2898b) gVar.f11678w;
                AbstractC34132o.m107864I(objM8488f);
                c2898b4 = c2898b10;
                return C2898b.m8470b(c2898b4, null, null, null, null, null, null, ((InterfaceC2897a.l) interfaceC2897a2).getStrapLocation(), null, null, null, null, false, null, 8127, null);
            case 5:
                i14 = gVar.f11674N;
                localDateTime3 = (LocalDateTime) gVar.f11667G;
                localDateTime2 = (LocalDateTime) gVar.f11666F;
                c29423a2 = (C29423a) gVar.f11665E;
                startTime = (LocalDateTime) gVar.f11681z;
                c2898b3 = (C2898b) gVar.f11680y;
                AbstractC34132o.m107864I(objM8488f);
                LocalDateTime localDateTime14 = startTime;
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                String str9 = (String) objM8488f;
                return C2898b.m8470b(c2898b3, null, null, null, null, localDateTime14, null, null, null, null, null, null, z13, c29423a2.m89696d(localDateTime2, localDateTime3, str9 != null ? EnumC32861a.INSTANCE.m103130a(str9) : null), 4079, null);
            case 6:
                i13 = gVar.f11674N;
                endTime2 = (LocalDateTime) gVar.f11667G;
                localDateTime = (LocalDateTime) gVar.f11666F;
                c29423a = (C29423a) gVar.f11665E;
                endTime = (LocalDateTime) gVar.f11681z;
                c2898b2 = (C2898b) gVar.f11680y;
                AbstractC34132o.m107864I(objM8488f);
                LocalDateTime localDateTime15 = endTime;
                if (i13 != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                String str10 = (String) objM8488f;
                return C2898b.m8470b(c2898b2, null, null, null, null, null, localDateTime15, null, null, null, null, null, z14, c29423a.m89696d(localDateTime, endTime2, str10 != null ? EnumC32861a.INSTANCE.m103130a(str10) : null), 4063, null);
            case 7:
            case 8:
                AbstractC34132o.m107864I(objM8488f);
                return objM8488f;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
