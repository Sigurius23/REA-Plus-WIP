package xd1;

import ad3.AbstractC0757c;
import com.whoop.addactivity.network.CoreDetailsActivityResponse;
import com.whoop.addactivity.network.EditedActivityPayload;
import com.whoop.common.network.api.AddActivitiesApi;
import com.whoop.common.network.api.StrapLocationServiceApi;
import com.whoop.common.network.model.ActivityOverlapError;
import com.whoop.common.network.model.GarmentItemDto;
import com.whoop.connectivityCore.dataSyncService.models.ProcessNowSource;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.edit.network.model.EditSleepModel;
import dt0.InterfaceC12362e;
import ia0.C18292a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.SerializationException;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import org.joda.time.LocalDateTime;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
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
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import ud3.AbstractC34799a1;
import ud3.C34850x0;
import wd1.AbstractC37164a;
import wd1.C37165b;
import wd1.C37166c;
import xm0.C38458b;
import zd1.EnumC40550e;
import zd1.InterfaceC40551f;
import zd1.InterfaceC40553h;

/* JADX INFO: renamed from: xd1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b+\b\u0007\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010!\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u001d\u001a\u00020 H\u0082@¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020#*\u00020\u001aH\u0002¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020#*\u00020 H\u0002¢\u0006\u0004\b&\u0010'J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0082@¢\u0006\u0004\b*\u0010+J#\u0010.\u001a\b\u0012\u0004\u0012\u00020-0(2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u0004\u0018\u000106*\u00020-H\u0002¢\u0006\u0004\b7\u00108J\u0018\u00109\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b9\u0010:J\u0018\u0010;\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b;\u0010:J \u0010=\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010<2\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b=\u0010:J\u001e\u0010?\u001a\b\u0012\u0004\u0012\u00020>0<2\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b?\u0010:J\u0017\u0010A\u001a\u00020@2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\bA\u0010BJ+\u0010F\u001a\u00020E2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010C\u001a\u0004\u0018\u0001002\b\u0010D\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\bF\u0010GJ\u0018\u0010H\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\bH\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bA\u0010a\u001a\u0004\bb\u0010cR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bF\u0010d\u001a\u0004\be\u0010fR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b9\u0010g\u001a\u0004\bh\u0010iR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b;\u0010j\u001a\u0004\bk\u0010lR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b?\u0010m\u001a\u0004\bn\u0010o¨\u0006p"}, m65681d2 = {"Lxd1/c;", "", "Lcom/whoop/common/network/api/StrapLocationServiceApi;", "strapLocationServiceApi", "Ltr2/n;", "logger", "Lcom/whoop/common/network/api/AddActivitiesApi;", "activitiesApi", "Lia0/a;", "activityTypesRepository", "Lad3/c;", "json", "Lpp0/a;", "activityDateValidator", "Lwd1/c;", "analyticHelper", "Lpp0/c;", "garmentStrapFilterHelper", "Lpp0/e;", "strapBodyLocationDataStoreHandler", "Ldt0/e;", "processNowApi", "Lxm0/b;", "cacheUpdater", "<init>", "(Lcom/whoop/common/network/api/StrapLocationServiceApi;Ltr2/n;Lcom/whoop/common/network/api/AddActivitiesApi;Lia0/a;Lad3/c;Lpp0/a;Lwd1/c;Lpp0/c;Lpp0/e;Ldt0/e;Lxm0/b;)V", "Lxd1/b;", "domainState", "Lxd1/a;", "domainAction", "q", "(Lxd1/b;Lxd1/a;Lq83/d;)Ljava/lang/Object;", "Lxd1/a$k;", "r", "(Lxd1/b;Lxd1/a$k;Lq83/d;)Ljava/lang/Object;", "Lwd1/b;", "t", "(Lxd1/b;)Lwd1/b;", "s", "(Lxd1/a$k;)Lwd1/b;", "", "Lcom/whoop/common/network/model/GarmentItemDto;", "l", "(Lq83/d;)Ljava/lang/Object;", "garmentsList", "Lsp0/j;", "u", "(Ljava/util/List;)Ljava/util/List;", "", "isCancel", "o", "(Lxd1/b;Z)Lxd1/b;", "p", "(Lxd1/b;)Lxd1/b;", "", "x", "(Lsp0/j;)Ljava/lang/Integer;", "i", "(Lxd1/b;Lq83/d;)Ljava/lang/Object;", "j", "Lpg3/v0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/a0;", "k", "Lcom/whoop/addactivity/network/EditedActivityPayload;", "g", "(Lxd1/b;)Lcom/whoop/addactivity/network/EditedActivityPayload;", "isResolveOverLap", "isGdcFlow", "Lcom/whoop/edit/network/model/EditSleepModel;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lxd1/b;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/edit/network/model/EditSleepModel;", "v", "a", "Lcom/whoop/common/network/api/StrapLocationServiceApi;", "n", "()Lcom/whoop/common/network/api/StrapLocationServiceApi;", "b", "Ltr2/n;", "getLogger", "()Ltr2/n;", "c", "Lcom/whoop/common/network/api/AddActivitiesApi;", "m", "()Lcom/whoop/common/network/api/AddActivitiesApi;", "d", "Lia0/a;", "getActivityTypesRepository", "()Lia0/a;", "e", "Lad3/c;", "getJson", "()Lad3/c;", "f", "Lpp0/a;", "getActivityDateValidator", "()Lpp0/a;", "Lwd1/c;", "getAnalyticHelper", "()Lwd1/c;", "Lpp0/c;", "getGarmentStrapFilterHelper", "()Lpp0/c;", "Lpp0/e;", "getStrapBodyLocationDataStoreHandler", "()Lpp0/e;", "Ldt0/e;", "getProcessNowApi", "()Ldt0/e;", "Lxm0/b;", "getCacheUpdater", "()Lxm0/b;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38204c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final StrapLocationServiceApi strapLocationServiceApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AddActivitiesApi activitiesApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C18292a activityTypesRepository;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C29423a activityDateValidator;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C37166c analyticHelper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C29425c garmentStrapFilterHelper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C29427e strapBodyLocationDataStoreHandler;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC12362e processNowApi;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C38458b cacheUpdater;

    /* JADX INFO: renamed from: xd1.c$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f163654a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f163655b;

        static {
            int[] iArr = new int[EnumC32863c.values().length];
            try {
                iArr[EnumC32863c.SELECT_ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f163654a = iArr;
            int[] iArr2 = new int[EnumC32861a.values().length];
            try {
                iArr2[EnumC32861a.CARDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[EnumC32861a.RECOVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC32861a.SLEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f163655b = iArr2;
        }
    }

    /* JADX INFO: renamed from: xd1.c$b */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.edit.domain.EditActivityInteractor", m100430f = "EditActivityInteractor.kt", m100431l = {182}, m100432m = "deleteSleepActivity", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f163656w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f163657x;

        /* JADX INFO: renamed from: z */
        int f163659z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f163657x = obj;
            this.f163659z |= Integer.MIN_VALUE;
            return C38204c.this.m122393i(null, this);
        }
    }

    /* JADX INFO: renamed from: xd1.c$c */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.edit.domain.EditActivityInteractor$deleteSleepActivity$response$1", m100430f = "EditActivityInteractor.kt", m100431l = {183}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f163660w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C38203b f163662y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C38203b c38203b, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f163662y = c38203b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C38204c.this.new c(this.f163662y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f163660w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AddActivitiesApi activitiesApi = C38204c.this.getActivitiesApi();
            String activityId = this.f163662y.getActivityId();
            this.f163660w = 1;
            Object objDeleteSleep = activitiesApi.deleteSleep(activityId, this);
            return objDeleteSleep == enumC31071a ? enumC31071a : objDeleteSleep;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: xd1.c$d */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.edit.domain.EditActivityInteractor", m100430f = "EditActivityInteractor.kt", m100431l = {208, 210, 213}, m100432m = "editActivity", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f163663E;

        /* JADX INFO: renamed from: w */
        Object f163664w;

        /* JADX INFO: renamed from: x */
        Object f163665x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f163666y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f163666y = obj;
            this.f163663E |= Integer.MIN_VALUE;
            return C38204c.this.m122394j(null, this);
        }
    }

    /* JADX INFO: renamed from: xd1.c$e */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.edit.domain.EditActivityInteractor", m100430f = "EditActivityInteractor.kt", m100431l = {144}, m100432m = "fetchStrapLocations", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f163668w;

        /* JADX INFO: renamed from: y */
        int f163670y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f163668w = obj;
            this.f163670y |= Integer.MIN_VALUE;
            return C38204c.this.m122396l(this);
        }
    }

    /* JADX INFO: renamed from: xd1.c$f */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.edit.domain.EditActivityInteractor$fetchStrapLocations$garments$1", m100430f = "EditActivityInteractor.kt", m100431l = {145}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "", "Lcom/whoop/common/network/model/GarmentItemDto;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f163671w;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C38204c.this.new f(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f163671w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            StrapLocationServiceApi strapLocationServiceApi = C38204c.this.getStrapLocationServiceApi();
            this.f163671w = 1;
            Object garmentsList = strapLocationServiceApi.getGarmentsList(this);
            return garmentsList == enumC31071a ? enumC31071a : garmentsList;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super List<GarmentItemDto>> interfaceC30057d) {
            return ((f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: xd1.c$g */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.edit.domain.EditActivityInteractor", m100430f = "EditActivityInteractor.kt", m100431l = {58, 63, 82, 89, AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB}, m100432m = "interact", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f163673E;

        /* JADX INFO: renamed from: w */
        Object f163674w;

        /* JADX INFO: renamed from: x */
        Object f163675x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f163676y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f163676y = obj;
            this.f163673E |= Integer.MIN_VALUE;
            return C38204c.this.m122408q(null, null, this);
        }
    }

    /* JADX INFO: renamed from: xd1.c$h */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.edit.domain.EditActivityInteractor", m100430f = "EditActivityInteractor.kt", m100431l = {105, 113, 114}, m100432m = "loadActivityDomainState", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f163678E;

        /* JADX INFO: renamed from: F */
        Object f163679F;

        /* JADX INFO: renamed from: G */
        Object f163680G;

        /* JADX INFO: renamed from: H */
        Object f163681H;

        /* JADX INFO: renamed from: I */
        Object f163682I;

        /* JADX INFO: renamed from: J */
        /* synthetic */ Object f163683J;

        /* JADX INFO: renamed from: L */
        int f163685L;

        /* JADX INFO: renamed from: w */
        Object f163686w;

        /* JADX INFO: renamed from: x */
        Object f163687x;

        /* JADX INFO: renamed from: y */
        Object f163688y;

        /* JADX INFO: renamed from: z */
        Object f163689z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f163683J = obj;
            this.f163685L |= Integer.MIN_VALUE;
            return C38204c.this.m122399r(null, null, this);
        }
    }

    /* JADX INFO: renamed from: xd1.c$i */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.edit.domain.EditActivityInteractor", m100430f = "EditActivityInteractor.kt", m100431l = {312}, m100432m = "resolveOverlapSleep", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f163690w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f163691x;

        /* JADX INFO: renamed from: z */
        int f163693z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f163691x = obj;
            this.f163693z |= Integer.MIN_VALUE;
            return C38204c.this.m122403v(null, this);
        }
    }

    /* JADX INFO: renamed from: xd1.c$j */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.edit.domain.EditActivityInteractor$resolveOverlapSleep$response$1", m100430f = "EditActivityInteractor.kt", m100431l = {313}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f163694w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C38203b f163696y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C38203b c38203b, InterfaceC30057d<? super j> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f163696y = c38203b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C38204c.this.new j(this.f163696y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f163694w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AddActivitiesApi activitiesApi = C38204c.this.getActivitiesApi();
            String activityId = this.f163696y.getActivityId();
            EditSleepModel editSleepModelM122392h = C38204c.this.m122392h(this.f163696y, null, null);
            this.f163694w = 1;
            Object objEditSleep = activitiesApi.editSleep(activityId, editSleepModelM122392h, this);
            return objEditSleep == enumC31071a ? enumC31071a : objEditSleep;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((j) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C38204c(StrapLocationServiceApi strapLocationServiceApi, InterfaceC34116n logger, AddActivitiesApi activitiesApi, C18292a activityTypesRepository, AbstractC0757c json, C29423a activityDateValidator, C37166c analyticHelper, C29425c garmentStrapFilterHelper, C29427e strapBodyLocationDataStoreHandler, InterfaceC12362e processNowApi, C38458b cacheUpdater) {
        AbstractC22676k.m65750j(strapLocationServiceApi, "strapLocationServiceApi");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(activitiesApi, "activitiesApi");
        AbstractC22676k.m65750j(activityTypesRepository, "activityTypesRepository");
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(activityDateValidator, "activityDateValidator");
        AbstractC22676k.m65750j(analyticHelper, "analyticHelper");
        AbstractC22676k.m65750j(garmentStrapFilterHelper, "garmentStrapFilterHelper");
        AbstractC22676k.m65750j(strapBodyLocationDataStoreHandler, "strapBodyLocationDataStoreHandler");
        AbstractC22676k.m65750j(processNowApi, "processNowApi");
        AbstractC22676k.m65750j(cacheUpdater, "cacheUpdater");
        this.strapLocationServiceApi = strapLocationServiceApi;
        this.logger = logger;
        this.activitiesApi = activitiesApi;
        this.activityTypesRepository = activityTypesRepository;
        this.json = json;
        this.activityDateValidator = activityDateValidator;
        this.analyticHelper = analyticHelper;
        this.garmentStrapFilterHelper = garmentStrapFilterHelper;
        this.strapBodyLocationDataStoreHandler = strapBodyLocationDataStoreHandler;
        this.processNowApi = processNowApi;
        this.cacheUpdater = cacheUpdater;
    }

    /* JADX INFO: renamed from: g */
    private final EditedActivityPayload m122391g(C38203b domainState) {
        String activityInternalName = domainState.getActivityInternalName();
        C32870j strapLocation = domainState.getStrapLocation();
        return new EditedActivityPayload(activityInternalName, strapLocation != null ? m122405x(strapLocation) : null, AbstractC29424b.m89697a(domainState.getStartTimeValue()), AbstractC29424b.m89697a(domainState.getEndTimeValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final EditSleepModel m122392h(C38203b domainState, Boolean isResolveOverLap, Boolean isGdcFlow) {
        C32870j strapLocation = domainState.getStrapLocation();
        return new EditSleepModel(AbstractC29424b.m89697a(domainState.getStartTimeValue()), AbstractC29424b.m89697a(domainState.getEndTimeValue()), strapLocation != null ? m122405x(strapLocation) : null, isResolveOverLap, isGdcFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: i */
    public final Object m122393i(C38203b c38203b, InterfaceC30057d<? super C38203b> interfaceC30057d) {
        b bVar;
        C38203b c38203b2 = c38203b;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f163659z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f163659z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM108729b = bVar2.f163657x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f163659z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            c cVar = new c(c38203b2, null);
            bVar2.f163656w = c38203b2;
            bVar2.f163659z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, cVar, bVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c38203b2 = (C38203b) bVar2.f163656w;
            AbstractC34132o.m107864I(objM108729b);
        }
        C38203b c38203b3 = c38203b2;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
            return C38203b.m122366b(c38203b3, null, null, null, null, null, null, null, null, null, null, new InterfaceC40553h.i(InterfaceC40551f.a.f174614a, EnumC40550e.CLOSE_MODAL), null, null, null, null, null, null, false, 261119, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b.a) {
            return C38203b.m122366b(c38203b3, null, null, null, null, null, null, null, null, null, null, new InterfaceC40553h.f(InterfaceC40551f.a.f174614a, EnumC40550e.CLOSE_MODAL), null, null, null, null, null, null, false, 261119, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return C38203b.m122366b(c38203b3, null, null, null, null, null, null, null, null, null, null, InterfaceC40553h.k.f174627a, null, null, null, null, null, null, false, 261119, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00dc A[Catch: HttpException -> 0x0119, IOException -> 0x011c, TryCatch #8 {IOException -> 0x011c, HttpException -> 0x0119, blocks: (B:44:0x00a5, B:46:0x00dc, B:48:0x00e5, B:52:0x011f), top: B:81:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: j */
    public final Object m122394j(C38203b c38203b, InterfaceC30057d<? super C38203b> interfaceC30057d) {
        d dVar;
        C38203b c38203b2;
        C38203b c38203b3;
        C38203b c38203b4;
        AbstractC34799a1 abstractC34799a1;
        String strM109860m;
        C29218v0 c29218v0;
        C38203b c38203b5;
        C38458b c38458b;
        C38203b c38203b6;
        C38203b c38203b7 = c38203b;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f163663E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f163663E = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM122404w = dVar.f163666y;
        Object obj = EnumC31071a.f128113w;
        int i14 = dVar.f163663E;
        try {
            try {
                if (i14 == 0) {
                    AbstractC34132o.m107864I(objM122404w);
                    dVar.f163664w = c38203b7;
                    dVar.f163663E = 1;
                    objM122404w = m122404w(c38203b7, dVar);
                    if (objM122404w != obj) {
                    }
                    return obj;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c29218v0 = (C29218v0) dVar.f163665x;
                        C38203b c38203b8 = (C38203b) dVar.f163664w;
                        try {
                            AbstractC34132o.m107864I(objM122404w);
                            c38203b6 = c38203b8;
                            try {
                                Object obj2 = c29218v0.f118270b;
                                this.analyticHelper.m119113h(new AbstractC37164a.e(m122401t(c38203b6), c38203b6.getStartTime(), c38203b6.getEndTime(), AbstractC29424b.m89697a(c38203b6.getStartTimeValue()), AbstractC29424b.m89697a(c38203b6.getEndTimeValue()), c38203b6.getActivityId()));
                                this.processNowApi.mo34626a(ProcessNowSource.EDIT_ACTIVITY);
                                return ((obj2 instanceof CoreDetailsActivityResponse) || !((CoreDetailsActivityResponse) obj2).getStrengthTrainerLinkable()) ? C38203b.m122366b(c38203b6, null, null, null, null, null, null, null, null, null, null, InterfaceC40553h.k.f174627a, null, null, null, null, null, null, false, 261119, null) : C38203b.m122366b(c38203b6, null, null, null, null, null, null, null, null, null, null, new InterfaceC40553h.h(((CoreDetailsActivityResponse) obj2).getActivityResponse().getId()), null, null, null, null, null, null, false, 261119, null);
                            } catch (IOException unused) {
                                c38203b3 = c38203b6;
                                return C38203b.m122366b(c38203b3, null, null, null, null, null, null, null, null, null, null, new InterfaceC40553h.i(InterfaceC40551f.a.f174614a, EnumC40550e.CLOSE_MODAL), null, null, null, null, null, null, false, 261119, null);
                            } catch (HttpException unused2) {
                                c38203b2 = c38203b6;
                                return C38203b.m122366b(c38203b2, null, null, null, null, null, null, null, null, null, null, new InterfaceC40553h.f(InterfaceC40551f.a.f174614a, EnumC40550e.CLOSE_MODAL), null, null, null, null, null, null, false, 261119, null);
                            }
                        } catch (IOException unused3) {
                            c38203b3 = c38203b8;
                            return C38203b.m122366b(c38203b3, null, null, null, null, null, null, null, null, null, null, new InterfaceC40553h.i(InterfaceC40551f.a.f174614a, EnumC40550e.CLOSE_MODAL), null, null, null, null, null, null, false, 261119, null);
                        } catch (HttpException unused4) {
                            c38203b2 = c38203b8;
                            return C38203b.m122366b(c38203b2, null, null, null, null, null, null, null, null, null, null, new InterfaceC40553h.f(InterfaceC40551f.a.f174614a, EnumC40550e.CLOSE_MODAL), null, null, null, null, null, null, false, 261119, null);
                        }
                    }
                    c29218v0 = (C29218v0) dVar.f163665x;
                    c38203b5 = (C38203b) dVar.f163664w;
                    try {
                        AbstractC34132o.m107864I(objM122404w);
                        c38458b = this.cacheUpdater;
                        dVar.f163664w = c38203b5;
                        dVar.f163665x = c29218v0;
                        dVar.f163663E = 3;
                        if (c38458b.m123247a("core_details_activity", dVar) != obj) {
                            c38203b6 = c38203b5;
                            Object obj3 = c29218v0.f118270b;
                            this.analyticHelper.m119113h(new AbstractC37164a.e(m122401t(c38203b6), c38203b6.getStartTime(), c38203b6.getEndTime(), AbstractC29424b.m89697a(c38203b6.getStartTimeValue()), AbstractC29424b.m89697a(c38203b6.getEndTimeValue()), c38203b6.getActivityId()));
                            this.processNowApi.mo34626a(ProcessNowSource.EDIT_ACTIVITY);
                            if (obj3 instanceof CoreDetailsActivityResponse) {
                            }
                        }
                        return obj;
                    } catch (IOException unused5) {
                        c38203b3 = c38203b5;
                        return C38203b.m122366b(c38203b3, null, null, null, null, null, null, null, null, null, null, new InterfaceC40553h.i(InterfaceC40551f.a.f174614a, EnumC40550e.CLOSE_MODAL), null, null, null, null, null, null, false, 261119, null);
                    } catch (HttpException unused6) {
                        c38203b2 = c38203b5;
                        return C38203b.m122366b(c38203b2, null, null, null, null, null, null, null, null, null, null, new InterfaceC40553h.f(InterfaceC40551f.a.f174614a, EnumC40550e.CLOSE_MODAL), null, null, null, null, null, null, false, 261119, null);
                    }
                }
                c38203b7 = (C38203b) dVar.f163664w;
                AbstractC34132o.m107864I(objM122404w);
                C29218v0 c29218v1 = (C29218v0) objM122404w;
                C34850x0 c34850x0 = c29218v1.f118269a;
                if (!c34850x0.f146788Q) {
                    if (c34850x0.f146792z != 409 || (abstractC34799a1 = c29218v1.f118271c) == null || (strM109860m = abstractC34799a1.m109860m()) == null) {
                        return C38203b.m122366b(c38203b4, null, null, null, null, null, null, null, null, null, null, new InterfaceC40553h.i(InterfaceC40551f.a.f174614a, EnumC40550e.CLOSE_MODAL), null, null, null, null, null, null, false, 261119, null);
                    }
                    try {
                        AbstractC0757c abstractC0757c = this.json;
                        abstractC0757c.getClass();
                        ActivityOverlapError activityOverlapError = (ActivityOverlapError) abstractC0757c.m1831b(ActivityOverlapError.INSTANCE.serializer(), strM109860m);
                        this.analyticHelper.m119113h(new AbstractC37164a.d(m122401t(c38203b4), activityOverlapError.getOverlappingActivities()));
                        return C38203b.m122366b(c38203b4, null, null, null, null, null, null, null, null, null, null, new InterfaceC40553h.c(activityOverlapError), null, null, null, activityOverlapError.getOverlappingActivities(), null, null, false, 244735, null);
                    } catch (NullPointerException unused7) {
                        return C38203b.m122366b(c38203b4, null, null, null, null, null, null, null, null, null, null, InterfaceC40553h.j.f174626a, null, null, null, null, null, null, false, 261119, null);
                    } catch (SerializationException unused8) {
                        return C38203b.m122366b(c38203b4, null, null, null, null, null, null, null, null, null, null, InterfaceC40553h.j.f174626a, null, null, null, null, null, null, false, 261119, null);
                    }
                }
                C18292a c18292a = this.activityTypesRepository;
                dVar.f163664w = c38203b4;
                dVar.f163665x = c29218v1;
                dVar.f163663E = 2;
                if (c18292a.m52659d(dVar) != obj) {
                    c29218v0 = c29218v1;
                    c38203b5 = c38203b4;
                    c38458b = this.cacheUpdater;
                    dVar.f163664w = c38203b5;
                    dVar.f163665x = c29218v0;
                    dVar.f163663E = 3;
                    if (c38458b.m123247a("core_details_activity", dVar) != obj) {
                        c38203b6 = c38203b5;
                        Object obj4 = c29218v0.f118270b;
                        this.analyticHelper.m119113h(new AbstractC37164a.e(m122401t(c38203b6), c38203b6.getStartTime(), c38203b6.getEndTime(), AbstractC29424b.m89697a(c38203b6.getStartTimeValue()), AbstractC29424b.m89697a(c38203b6.getEndTimeValue()), c38203b6.getActivityId()));
                        this.processNowApi.mo34626a(ProcessNowSource.EDIT_ACTIVITY);
                        if (obj4 instanceof CoreDetailsActivityResponse) {
                        }
                    }
                }
                return obj;
            } catch (IOException unused9) {
                c38203b3 = c38203b4;
                return C38203b.m122366b(c38203b3, null, null, null, null, null, null, null, null, null, null, new InterfaceC40553h.i(InterfaceC40551f.a.f174614a, EnumC40550e.CLOSE_MODAL), null, null, null, null, null, null, false, 261119, null);
            } catch (HttpException unused10) {
                c38203b2 = c38203b4;
                return C38203b.m122366b(c38203b2, null, null, null, null, null, null, null, null, null, null, new InterfaceC40553h.f(InterfaceC40551f.a.f174614a, EnumC40550e.CLOSE_MODAL), null, null, null, null, null, null, false, 261119, null);
            }
            c38203b4 = c38203b7;
        } catch (IOException unused11) {
            c38203b3 = c38203b7;
        } catch (HttpException unused12) {
            c38203b2 = c38203b7;
        }
    }

    /* JADX INFO: renamed from: k */
    private final Object m122395k(C38203b c38203b, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
        return this.activitiesApi.editSleep(c38203b.getActivityId(), m122392h(c38203b, null, Boolean.valueOf(AbstractC22676k.m65745e(c38203b.getFlow(), "SPLIT_SLEEP"))), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: l */
    public final Object m122396l(InterfaceC30057d<? super List<GarmentItemDto>> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f163670y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f163670y = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object objM108729b = eVar2.f163668w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar2.f163670y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            f fVar = new f(null);
            eVar2.f163670y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, fVar, eVar2, 6, null);
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

    /* JADX INFO: renamed from: o */
    private final C38203b m122397o(C38203b domainState, boolean isCancel) {
        if (isCancel) {
            this.analyticHelper.m119113h(new AbstractC37164a.a(m122401t(domainState)));
        }
        return a.f163654a[domainState.getDataState().ordinal()] == 1 ? C38203b.m122366b(domainState, null, null, null, null, null, null, null, null, null, EnumC32863c.EDIT_ACTIVITY, null, null, null, null, null, null, null, false, 261631, null) : C38203b.m122366b(domainState, null, null, null, null, null, null, null, null, null, null, InterfaceC40553h.b.f174616a, null, null, null, null, null, null, false, 261119, null);
    }

    /* JADX INFO: renamed from: p */
    private final C38203b m122398p(C38203b domainState) {
        return C38203b.m122366b(domainState, null, null, null, null, null, null, null, null, null, null, InterfaceC40553h.a.f174615a, null, null, null, null, null, null, false, 261119, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:31:0x0127  */
    /* JADX WARN: Code duplicated, block: B:33:0x012b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: r */
    public final Object m122399r(C38203b c38203b, InterfaceC38202a.k kVar, InterfaceC30057d<? super C38203b> interfaceC30057d) {
        h hVar;
        C38203b c38203b2;
        InterfaceC38202a.k kVar2;
        Object objM122396l;
        LocalDateTime localDateTimeM89698b;
        String endDate;
        C38203b c38203b3;
        String str;
        LocalDateTime localDateTime;
        C32870j c32870j;
        Object objM122396l2;
        LocalDateTime localDateTime2;
        LocalDateTime localDateTime3;
        C38204c c38204c;
        C32870j c32870j2;
        InterfaceC38202a.k kVar3;
        String str2;
        C38203b c38203b4;
        String str3;
        EnumC32863c enumC32863c;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f163685L;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f163685L = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object obj = hVar.f163683J;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = hVar.f163685L;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c38203b2 = c38203b;
            hVar.f163686w = c38203b2;
            kVar2 = kVar;
            hVar.f163687x = kVar2;
            hVar.f163685L = 1;
            objM122396l = m122396l(hVar);
            if (objM122396l != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            kVar2 = (InterfaceC38202a.k) hVar.f163687x;
            C38203b c38203b5 = (C38203b) hVar.f163686w;
            AbstractC34132o.m107864I(obj);
            objM122396l = obj;
            c38203b2 = c38203b5;
        } else {
            if (i14 == 2) {
                String str4 = (String) hVar.f163680G;
                str = (String) hVar.f163679F;
                localDateTime = (LocalDateTime) hVar.f163678E;
                localDateTimeM89698b = (LocalDateTime) hVar.f163689z;
                InterfaceC38202a.k kVar4 = (InterfaceC38202a.k) hVar.f163687x;
                c38203b3 = (C38203b) hVar.f163686w;
                AbstractC34132o.m107864I(obj);
                endDate = str4;
                kVar2 = kVar4;
                c32870j = (C32870j) obj;
                hVar.f163686w = c38203b3;
                hVar.f163687x = kVar2;
                hVar.f163688y = null;
                hVar.f163689z = localDateTimeM89698b;
                hVar.f163678E = localDateTime;
                hVar.f163679F = str;
                hVar.f163680G = endDate;
                hVar.f163681H = c32870j;
                hVar.f163682I = this;
                hVar.f163685L = 3;
                objM122396l2 = m122396l(hVar);
                if (objM122396l2 != enumC31071a) {
                    LocalDateTime localDateTime4 = localDateTimeM89698b;
                    localDateTime2 = localDateTime;
                    localDateTime3 = localDateTime4;
                    c38204c = this;
                    c32870j2 = c32870j;
                    obj = objM122396l2;
                    kVar3 = kVar2;
                    str2 = str;
                    c38203b4 = c38203b3;
                    str3 = endDate;
                }
                return enumC31071a;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c38204c = (C38204c) hVar.f163682I;
            C32870j c32870j3 = (C32870j) hVar.f163681H;
            String str5 = (String) hVar.f163680G;
            str2 = (String) hVar.f163679F;
            LocalDateTime localDateTime5 = (LocalDateTime) hVar.f163678E;
            localDateTime3 = (LocalDateTime) hVar.f163689z;
            InterfaceC38202a.k kVar5 = (InterfaceC38202a.k) hVar.f163687x;
            c38203b4 = (C38203b) hVar.f163686w;
            AbstractC34132o.m107864I(obj);
            c32870j2 = c32870j3;
            str3 = str5;
            kVar3 = kVar5;
            localDateTime2 = localDateTime5;
        }
        List<C32870j> listM122402u = c38204c.m122402u((List) obj);
        String internalName = kVar3.getInternalName();
        EnumC32861a activityType = kVar3.getActivityType();
        String activityId = kVar3.getActivityId();
        if (AbstractC22676k.m65745e(kVar3.getInternalName(), "activity")) {
            enumC32863c = EnumC32863c.SELECT_ACTIVITY;
        } else {
            enumC32863c = EnumC32863c.EDIT_ACTIVITY;
        }
        return C38203b.m122366b(c38203b4, str2, str3, null, null, internalName, localDateTime3, localDateTime2, c32870j2, listM122402u, enumC32863c, null, activityType, activityId, this.activityDateValidator.m89696d(localDateTime3, localDateTime2, kVar3.getActivityType()), null, kVar3.getFlow(), null, kVar3.getIsDeletable(), 82956, null);
        localDateTimeM89698b = AbstractC29424b.m89698b(kVar2.getStartDate());
        LocalDateTime localDateTimeM89698b2 = AbstractC29424b.m89698b(kVar2.getEndDate());
        String startDate = kVar2.getStartDate();
        endDate = kVar2.getEndDate();
        C29427e c29427e = this.strapBodyLocationDataStoreHandler;
        hVar.f163686w = c38203b2;
        hVar.f163687x = kVar2;
        hVar.f163688y = null;
        hVar.f163689z = localDateTimeM89698b;
        hVar.f163678E = localDateTimeM89698b2;
        hVar.f163679F = startDate;
        hVar.f163680G = endDate;
        hVar.f163685L = 2;
        Object objM89703b = c29427e.m89703b((List) objM122396l, hVar);
        if (objM89703b != enumC31071a) {
            c38203b3 = c38203b2;
            obj = objM89703b;
            str = startDate;
            localDateTime = localDateTimeM89698b2;
            c32870j = (C32870j) obj;
            hVar.f163686w = c38203b3;
            hVar.f163687x = kVar2;
            hVar.f163688y = null;
            hVar.f163689z = localDateTimeM89698b;
            hVar.f163678E = localDateTime;
            hVar.f163679F = str;
            hVar.f163680G = endDate;
            hVar.f163681H = c32870j;
            hVar.f163682I = this;
            hVar.f163685L = 3;
            objM122396l2 = m122396l(hVar);
            if (objM122396l2 != enumC31071a) {
                LocalDateTime localDateTime6 = localDateTimeM89698b;
                localDateTime2 = localDateTime;
                localDateTime3 = localDateTime6;
                c38204c = this;
                c32870j2 = c32870j;
                obj = objM122396l2;
                kVar3 = kVar2;
                str2 = str;
                c38203b4 = c38203b3;
                str3 = endDate;
                List<C32870j> listM122402u2 = c38204c.m122402u((List) obj);
                String internalName2 = kVar3.getInternalName();
                EnumC32861a activityType2 = kVar3.getActivityType();
                String activityId2 = kVar3.getActivityId();
                if (AbstractC22676k.m65745e(kVar3.getInternalName(), "activity")) {
                    enumC32863c = EnumC32863c.SELECT_ACTIVITY;
                } else {
                    enumC32863c = EnumC32863c.EDIT_ACTIVITY;
                }
                return C38203b.m122366b(c38203b4, str2, str3, null, null, internalName2, localDateTime3, localDateTime2, c32870j2, listM122402u2, enumC32863c, null, activityType2, activityId2, this.activityDateValidator.m89696d(localDateTime3, localDateTime2, kVar3.getActivityType()), null, kVar3.getFlow(), null, kVar3.getIsDeletable(), 82956, null);
            }
        }
        return enumC31071a;
    }

    /* JADX INFO: renamed from: s */
    private final C37165b m122400s(InterfaceC38202a.k kVar) {
        return new C37165b(kVar.getInternalName(), kVar.getFlow(), EnumC32861a.INSTANCE.m103131b(kVar.getActivityType()), kVar.getFlow());
    }

    /* JADX INFO: renamed from: t */
    private final C37165b m122401t(C38203b c38203b) {
        return new C37165b(c38203b.getActivityInternalName(), c38203b.getFlow(), EnumC32861a.INSTANCE.m103131b(c38203b.getActivityType()), c38203b.getFlow());
    }

    /* JADX INFO: renamed from: u */
    private final List<C32870j> m122402u(List<GarmentItemDto> garmentsList) {
        List<GarmentItemDto> list = garmentsList;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (GarmentItemDto garmentItemDto : list) {
            Integer id4 = garmentItemDto.getId();
            arrayList.add(new C32870j(id4 != null ? id4.intValue() : 0, AbstractC8693b.m21278l(garmentItemDto.getName())));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: v */
    public final Object m122403v(C38203b c38203b, InterfaceC30057d<? super C38203b> interfaceC30057d) {
        i iVar;
        C38203b c38203b2 = c38203b;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f163693z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f163693z = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        i iVar2 = iVar;
        Object objM108729b = iVar2.f163691x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar2.f163693z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            j jVar = new j(c38203b2, null);
            iVar2.f163690w = c38203b2;
            iVar2.f163693z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, jVar, iVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c38203b2 = (C38203b) iVar2.f163690w;
            AbstractC34132o.m107864I(objM108729b);
        }
        C38203b c38203b3 = c38203b2;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b.a) {
            return C38203b.m122366b(c38203b3, null, null, null, null, null, null, null, null, null, null, new InterfaceC40553h.f(InterfaceC40551f.a.f174614a, EnumC40550e.CLOSE_MODAL), null, null, null, null, null, null, false, 261119, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
            return C38203b.m122366b(c38203b3, null, null, null, null, null, null, null, null, null, null, new InterfaceC40553h.i(InterfaceC40551f.a.f174614a, EnumC40550e.CLOSE_MODAL), null, null, null, null, null, null, false, 261119, null);
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        List<String> listM122378m = c38203b3.m122378m();
        if (listM122378m != null) {
            this.analyticHelper.m119113h(new AbstractC37164a.f(m122401t(c38203b3), listM122378m));
        }
        return C38203b.m122366b(c38203b3, null, null, null, null, null, null, null, null, null, null, InterfaceC40553h.l.f174628a, null, null, null, null, null, null, false, 261119, null);
    }

    /* JADX INFO: renamed from: w */
    private final Object m122404w(C38203b c38203b, InterfaceC30057d<? super C29218v0<? extends Object>> interfaceC30057d) {
        int i13 = a.f163655b[c38203b.getActivityType().ordinal()];
        if (i13 == 1) {
            Object objEditCardioActivity = this.activitiesApi.editCardioActivity(c38203b.getActivityId(), m122391g(c38203b), interfaceC30057d);
            return objEditCardioActivity == EnumC31071a.f128113w ? objEditCardioActivity : (C29218v0) objEditCardioActivity;
        }
        if (i13 == 2) {
            Object objEditRecoveryActivity = this.activitiesApi.editRecoveryActivity(c38203b.getActivityId(), m122391g(c38203b), interfaceC30057d);
            return objEditRecoveryActivity == EnumC31071a.f128113w ? objEditRecoveryActivity : (C29218v0) objEditRecoveryActivity;
        }
        if (i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Object objM122395k = m122395k(c38203b, interfaceC30057d);
        return objM122395k == EnumC31071a.f128113w ? objM122395k : (C29218v0) objM122395k;
    }

    /* JADX INFO: renamed from: x */
    private final Integer m122405x(C32870j c32870j) {
        if (c32870j.getStrapLocationId() == 0) {
            return null;
        }
        return Integer.valueOf(c32870j.getStrapLocationId());
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final AddActivitiesApi getActivitiesApi() {
        return this.activitiesApi;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final StrapLocationServiceApi getStrapLocationServiceApi() {
        return this.strapLocationServiceApi;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: q */
    public final Object m122408q(C38203b c38203b, InterfaceC38202a interfaceC38202a, InterfaceC30057d<? super C38203b> interfaceC30057d) {
        g gVar;
        C38203b c38203b2;
        InterfaceC38202a interfaceC38202a2;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f163673E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f163673E = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object obj = gVar.f163676y;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = gVar.f163673E;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 == 2) {
                    interfaceC38202a2 = (InterfaceC38202a) gVar.f163675x;
                    C38203b c38203b3 = (C38203b) gVar.f163674w;
                    AbstractC34132o.m107864I(obj);
                    c38203b2 = c38203b3;
                } else if (i14 != 3 && i14 != 4 && i14 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        AbstractC34132o.m107864I(obj);
        if (interfaceC38202a instanceof InterfaceC38202a.k) {
            InterfaceC38202a.k kVar = (InterfaceC38202a.k) interfaceC38202a;
            this.analyticHelper.m119113h(new AbstractC37164a.c(m122400s(kVar)));
            gVar.f163674w = null;
            gVar.f163675x = null;
            gVar.f163673E = 1;
            Object objM122399r = m122399r(c38203b, kVar, gVar);
            if (objM122399r != obj2) {
                return objM122399r;
            }
        } else {
            if (interfaceC38202a instanceof InterfaceC38202a.n) {
                return C38203b.m122366b(c38203b, null, null, null, null, null, null, null, null, null, null, null, ((InterfaceC38202a.n) interfaceC38202a).getActivityType(), null, null, null, null, null, false, 260095, null);
            }
            if (AbstractC22676k.m65745e(interfaceC38202a, InterfaceC38202a.j.f163608a)) {
                return C38203b.m122366b(c38203b, null, null, null, null, null, null, null, null, null, EnumC32863c.SELECT_ACTIVITY, null, null, null, null, null, null, null, false, 261631, null);
            }
            if (interfaceC38202a instanceof InterfaceC38202a.s) {
                C29427e c29427e = this.strapBodyLocationDataStoreHandler;
                int strapLocationId = ((InterfaceC38202a.s) interfaceC38202a).getStrapLocation().getStrapLocationId();
                gVar.f163674w = c38203b;
                gVar.f163675x = interfaceC38202a;
                gVar.f163673E = 2;
                if (c29427e.m89704c(strapLocationId, gVar) != obj2) {
                    c38203b2 = c38203b;
                    interfaceC38202a2 = interfaceC38202a;
                }
            } else {
                if (interfaceC38202a instanceof InterfaceC38202a.r) {
                    InterfaceC38202a.r rVar = (InterfaceC38202a.r) interfaceC38202a;
                    return C38203b.m122366b(c38203b, null, null, null, null, null, rVar.getStartTime(), null, null, null, null, null, null, null, this.activityDateValidator.m89696d(rVar.getStartTime(), c38203b.getEndTimeValue(), c38203b.getActivityType()), null, null, null, false, 253919, null);
                }
                if (interfaceC38202a instanceof InterfaceC38202a.q) {
                    InterfaceC38202a.q qVar = (InterfaceC38202a.q) interfaceC38202a;
                    return C38203b.m122366b(c38203b, null, null, null, null, null, null, qVar.getEndTime(), null, null, null, null, null, null, this.activityDateValidator.m89696d(c38203b.getStartTimeValue(), qVar.getEndTime(), c38203b.getActivityType()), null, null, null, false, 253887, null);
                }
                if (interfaceC38202a instanceof InterfaceC38202a.o) {
                    return C38203b.m122366b(c38203b, null, null, null, null, null, null, null, null, null, null, InterfaceC40553h.m.f174629a, null, null, null, null, null, null, false, 261119, null);
                }
                if (interfaceC38202a instanceof InterfaceC38202a.a) {
                    return C38203b.m122366b(c38203b, null, null, null, null, ((InterfaceC38202a.a) interfaceC38202a).getInternalName(), null, null, null, null, EnumC32863c.EDIT_ACTIVITY, null, null, null, null, null, null, null, false, 261615, null);
                }
                if (interfaceC38202a instanceof InterfaceC38202a.i) {
                    return m122398p(c38203b);
                }
                if (interfaceC38202a instanceof InterfaceC38202a.h) {
                    return m122397o(c38203b, ((InterfaceC38202a.h) interfaceC38202a).getIsCancel());
                }
                if (AbstractC22676k.m65745e(interfaceC38202a, InterfaceC38202a.l.f163616a)) {
                    gVar.f163674w = null;
                    gVar.f163675x = null;
                    gVar.f163673E = 3;
                    Object objM122394j = m122394j(c38203b, gVar);
                    if (objM122394j != obj2) {
                        return objM122394j;
                    }
                } else {
                    if (AbstractC22676k.m65745e(interfaceC38202a, InterfaceC38202a.g.f163605a)) {
                        this.analyticHelper.m119113h(new AbstractC37164a.a(m122401t(c38203b)));
                        return C38203b.m122366b(c38203b, null, null, null, null, null, null, null, null, null, null, InterfaceC40553h.b.f174616a, null, null, null, null, null, null, false, 261119, null);
                    }
                    if (AbstractC22676k.m65745e(interfaceC38202a, InterfaceC38202a.b.f163600a)) {
                        return C38203b.m122366b(c38203b, null, null, null, null, null, null, null, null, null, null, InterfaceC40553h.a.f174615a, null, null, null, null, null, null, false, 261119, null);
                    }
                    if (AbstractC22676k.m65745e(interfaceC38202a, InterfaceC38202a.p.f163620a)) {
                        return C38203b.m122366b(c38203b, null, null, null, null, null, null, null, null, null, null, InterfaceC40553h.n.f174630a, null, null, null, null, null, null, false, 261119, null);
                    }
                    if (AbstractC22676k.m65745e(interfaceC38202a, InterfaceC38202a.e.f163603a)) {
                        gVar.f163674w = null;
                        gVar.f163675x = null;
                        gVar.f163673E = 4;
                        Object objM122403v = m122403v(c38203b, gVar);
                        if (objM122403v != obj2) {
                            return objM122403v;
                        }
                    } else {
                        if (AbstractC22676k.m65745e(interfaceC38202a, InterfaceC38202a.c.f163601a)) {
                            List<String> listM122378m = c38203b.m122378m();
                            if (listM122378m != null) {
                                this.analyticHelper.m119113h(new AbstractC37164a.b(m122401t(c38203b), listM122378m));
                            }
                            return C38203b.m122366b(c38203b, null, null, null, null, null, null, null, null, null, null, InterfaceC40553h.a.f174615a, null, null, null, null, null, null, false, 261119, null);
                        }
                        if (interfaceC38202a instanceof InterfaceC38202a.m) {
                            return C38203b.m122366b(c38203b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((InterfaceC38202a.m) interfaceC38202a).getSelectedSection(), false, 196607, null);
                        }
                        if (!AbstractC22676k.m65745e(interfaceC38202a, InterfaceC38202a.d.f163602a)) {
                            if (AbstractC22676k.m65745e(interfaceC38202a, InterfaceC38202a.f.f163604a)) {
                                return C38203b.m122366b(c38203b, null, null, null, null, null, null, null, null, null, null, InterfaceC40553h.d.f174618a, null, null, null, null, null, null, false, 261119, null);
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        gVar.f163674w = null;
                        gVar.f163675x = null;
                        gVar.f163673E = 5;
                        Object objM122393i = m122393i(c38203b, gVar);
                        if (objM122393i != obj2) {
                            return objM122393i;
                        }
                    }
                }
            }
        }
        return obj2;
        return C38203b.m122366b(c38203b2, null, null, null, null, null, null, null, ((InterfaceC38202a.s) interfaceC38202a2).getStrapLocation(), null, null, null, null, null, null, null, null, null, false, 262015, null);
    }
}
