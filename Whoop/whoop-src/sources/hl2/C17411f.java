package hl2;

import c93.InterfaceC4351m;
import com.whoop.hrZones.network.Zone;
import com.whoop.training.data.network.api.HrSettingsApi;
import com.whoop.training.data.network.request.hrsettings.CustomHrZonesRequest;
import com.whoop.training.data.network.request.maxhr.MaxHrRequest;
import com.whoop.training.data.network.response.hrsettings.HeartRateEntryRow;
import com.whoop.training.data.network.response.hrsettings.HrSettingsResponse;
import com.whoop.training.data.network.response.hrsettings.HrSettingsZonesResponse;
import com.whoop.training.data.network.response.hrsettings.ManualHeartRateZonesForm;
import com.whoop.training.data.network.response.hrsettings.ZoneRow;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import eq1.C13562a;
import gl2.C15971a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25267u;
import m83.C25271y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.EnumC33227v1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: hl2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001KB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001e\u001a\u00020\u001d*\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH\u0082@¢\u0006\u0004\b!\u0010\"J \u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u000eH\u0082@¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J.\u0010-\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u00192\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010 \u001a\u00020\u000eH\u0082@¢\u0006\u0004\b-\u0010.J \u00101\u001a\u00020\u000e2\u0006\u00100\u001a\u00020/2\u0006\u0010 \u001a\u00020\u000eH\u0082@¢\u0006\u0004\b1\u00102J%\u00103\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010 \u001a\u00020\u000e2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b3\u00104J'\u00106\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u00100\u001a\u00020/2\u0006\u00105\u001a\u00020/H\u0002¢\u0006\u0004\b6\u00107J'\u0010:\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u00109\u001a\u0002082\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b:\u0010;J\u0013\u0010<\u001a\u00020\u000e*\u00020\u000eH\u0002¢\u0006\u0004\b<\u0010=J\u001b\u0010?\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0011\u001a\u00020>H\u0002¢\u0006\u0004\b?\u0010@J\u001b\u0010B\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0011\u001a\u00020AH\u0002¢\u0006\u0004\bB\u0010CJ\u001b\u0010E\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010D\u001a\u00020\u0019H\u0002¢\u0006\u0004\bE\u0010FJ!\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000e0G2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00100G¢\u0006\u0004\bI\u0010JR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006W"}, m65681d2 = {"Lhl2/f;", "", "Ltr2/n;", "logger", "Lcom/whoop/training/data/network/api/HrSettingsApi;", "api", "Lhl2/h;", "hrZoneAdjuster", "Leq1/a;", "hrZonesRepository", "Lgl2/a;", "analyticsHelper", "<init>", "(Ltr2/n;Lcom/whoop/training/data/network/api/HrSettingsApi;Lhl2/h;Leq1/a;Lgl2/a;)V", "Lhl2/d;", "previousState", "Lhl2/c;", "domainAction", "m", "(Lhl2/d;Lhl2/c;Lq83/d;)Ljava/lang/Object;", "Lhl2/c$d;", "i", "(Lhl2/d;Lhl2/c$d;)Lhl2/d;", "", "id", "", "value", "Lsz0/v1;", "type", "Lhl2/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lhl2/d;Ljava/lang/String;ILsz0/v1;)Lhl2/a;", "domainState", "k", "(Lhl2/d;Lq83/d;)Ljava/lang/Object;", "maxHeartRate", "t", "(ILhl2/d;Lq83/d;)Ljava/lang/Object;", "Lhl2/b;", "dialogType", "q", "(Lhl2/d;Lhl2/b;)Lhl2/d;", "", "Lcom/whoop/hrZones/network/Zone;", "zones", "p", "(ILjava/util/List;Lhl2/d;Lq83/d;)Ljava/lang/Object;", "", "useDefaultZones", "s", "(ZLhl2/d;Lq83/d;)Ljava/lang/Object;", "l", "(Lhl2/d;Z)Ljava/util/List;", "isNetworkError", "n", "(Lhl2/d;ZZ)Lhl2/d;", "Lcom/whoop/training/data/network/response/hrsettings/HrSettingsZonesResponse;", "data", "u", "(Lhl2/d;Lcom/whoop/training/data/network/response/hrsettings/HrSettingsZonesResponse;Z)Lhl2/d;", "j", "(Lhl2/d;)Lhl2/d;", "Lhl2/c$g;", "o", "(Lhl2/d;Lhl2/c$g;)Lhl2/d;", "Lhl2/c$l;", "g", "(Lhl2/d;Lhl2/c$l;)Lhl2/d;", "selectedValue", "v", "(Lhl2/d;I)Lhl2/d;", "Lec3/l;", "upstream", "r", "(Lec3/l;)Lec3/l;", "a", "Ltr2/n;", "b", "Lcom/whoop/training/data/network/api/HrSettingsApi;", "c", "Lhl2/h;", "getHrZoneAdjuster", "()Lhl2/h;", "d", "Leq1/a;", "e", "Lgl2/a;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17411f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final HrSettingsApi api;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C17413h hrZoneAdjuster;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C13562a hrZonesRepository;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C15971a analyticsHelper;

    /* JADX INFO: renamed from: hl2.f$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lhl2/f$a;", "", "a", "b", "c", "Lhl2/f$a$a;", "Lhl2/f$a$b;", "Lhl2/f$a$c;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a {

        /* JADX INFO: renamed from: hl2.f$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lhl2/f$a$a;", "Lhl2/f$a;", "Lhl2/c;", "domainAction", "<init>", "(Lhl2/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhl2/c;", "()Lhl2/c;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41697a implements a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final AbstractC17408c domainAction;

            public C41697a(AbstractC17408c domainAction) {
                AbstractC22676k.m65750j(domainAction, "domainAction");
                this.domainAction = domainAction;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AbstractC17408c getDomainAction() {
                return this.domainAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C41697a) && AbstractC22676k.m65745e(this.domainAction, ((C41697a) other).domainAction);
            }

            public int hashCode() {
                return this.domainAction.hashCode();
            }

            public String toString() {
                return "GenericInternalAction(domainAction=" + this.domainAction + ")";
            }
        }

        /* JADX INFO: renamed from: hl2.f$a$b */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhl2/f$a$b;", "Lhl2/f$a;", "<init>", "()V", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements a {

            /* JADX INFO: renamed from: a */
            public static final b f67438a = new b();

            private b() {
            }
        }

        /* JADX INFO: renamed from: hl2.f$a$c */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhl2/f$a$c;", "Lhl2/f$a;", "<init>", "()V", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c implements a {

            /* JADX INFO: renamed from: a */
            public static final c f67439a = new c();

            private c() {
            }
        }
    }

    /* JADX INFO: renamed from: hl2.f$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.training.hrsettings.domain.HrSettingsInteractor", m100430f = "HrSettingsInteractor.kt", m100431l = {133}, m100432m = "getBffHrSettingsScreen", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f67440w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f67441x;

        /* JADX INFO: renamed from: z */
        int f67443z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f67441x = obj;
            this.f67443z |= Integer.MIN_VALUE;
            return C17411f.this.m49401k(null, this);
        }
    }

    /* JADX INFO: renamed from: hl2.f$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.training.hrsettings.domain.HrSettingsInteractor$getBffHrSettingsScreen$2", m100430f = "HrSettingsInteractor.kt", m100431l = {134}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f67444w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C17411f.this.new c(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f67444w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HrSettingsApi hrSettingsApi = C17411f.this.api;
            this.f67444w = 1;
            Object objFetchHrSettings = hrSettingsApi.fetchHrSettings(this);
            return objFetchHrSettings == enumC31071a ? enumC31071a : objFetchHrSettings;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super HrSettingsResponse> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: hl2.f$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.training.hrsettings.domain.HrSettingsInteractor", m100430f = "HrSettingsInteractor.kt", m100431l = {179}, m100432m = "handleMaxHrSuccess", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f67446E;

        /* JADX INFO: renamed from: F */
        Object f67447F;

        /* JADX INFO: renamed from: G */
        Object f67448G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f67449H;

        /* JADX INFO: renamed from: J */
        int f67451J;

        /* JADX INFO: renamed from: w */
        int f67452w;

        /* JADX INFO: renamed from: x */
        Object f67453x;

        /* JADX INFO: renamed from: y */
        Object f67454y;

        /* JADX INFO: renamed from: z */
        Object f67455z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f67449H = obj;
            this.f67451J |= Integer.MIN_VALUE;
            return C17411f.this.m49406p(0, null, null, this);
        }
    }

    /* JADX INFO: renamed from: hl2.f$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.training.hrsettings.domain.HrSettingsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "HrSettingsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f67456w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f67457x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f67458y;

        public e(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC17408c abstractC17408c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f67457x = interfaceC13062m;
            eVar.f67458y = abstractC17408c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C13084s1 c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f67456w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f67457x;
                AbstractC17408c abstractC17408c = (AbstractC17408c) this.f67458y;
                if (AbstractC22676k.m65745e(abstractC17408c, AbstractC17408c.f.f67409a)) {
                    c13084s1 = new C13084s1(new f(abstractC17408c, null));
                } else if ((abstractC17408c instanceof AbstractC17408c.i) || (abstractC17408c instanceof AbstractC17408c.h)) {
                    c13084s1 = new C13084s1(new g(abstractC17408c, null));
                } else {
                    c13084s1 = abstractC17408c instanceof AbstractC17408c.j ? new C13084s1(new h(abstractC17408c, null)) : new C13084s1(new i(abstractC17408c, null));
                }
                this.f67457x = null;
                this.f67458y = null;
                this.f67456w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC17408c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: hl2.f$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.training.hrsettings.domain.HrSettingsInteractor$interact$1$1", m100430f = "HrSettingsInteractor.kt", m100431l = {36, 37}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lhl2/f$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f67459w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f67460x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC17408c f67461y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC17408c abstractC17408c, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f67461y = abstractC17408c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(this.f67461y, interfaceC30057d);
            fVar.f67460x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r0.emit(r6, r5) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f67460x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f67459w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L43
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L30
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                hl2.f$a$b r6 = hl2.C17411f.a.b.f67438a
                r5.f67460x = r0
                r5.f67459w = r4
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L30
                goto L42
            L30:
                hl2.f$a$a r6 = new hl2.f$a$a
                hl2.c r2 = r5.f67461y
                r6.<init>(r2)
                r2 = 0
                r5.f67460x = r2
                r5.f67459w = r3
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L43
            L42:
                return r1
            L43:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: hl2.C17411f.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: hl2.f$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.training.hrsettings.domain.HrSettingsInteractor$interact$1$2", m100430f = "HrSettingsInteractor.kt", m100431l = {44, 45}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lhl2/f$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f67462w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f67463x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC17408c f67464y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AbstractC17408c abstractC17408c, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f67464y = abstractC17408c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = new g(this.f67464y, interfaceC30057d);
            gVar.f67463x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r0.emit(r6, r5) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f67463x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f67462w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L43
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L30
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                hl2.f$a$c r6 = hl2.C17411f.a.c.f67439a
                r5.f67463x = r0
                r5.f67462w = r4
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L30
                goto L42
            L30:
                hl2.f$a$a r6 = new hl2.f$a$a
                hl2.c r2 = r5.f67464y
                r6.<init>(r2)
                r2 = 0
                r5.f67463x = r2
                r5.f67462w = r3
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L43
            L42:
                return r1
            L43:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: hl2.C17411f.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: hl2.f$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.training.hrsettings.domain.HrSettingsInteractor$interact$1$3", m100430f = "HrSettingsInteractor.kt", m100431l = {51, 52}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lhl2/f$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f67465w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f67466x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC17408c f67467y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AbstractC17408c abstractC17408c, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f67467y = abstractC17408c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(this.f67467y, interfaceC30057d);
            hVar.f67466x = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r0.emit(r6, r5) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f67466x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f67465w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L43
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L30
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                hl2.f$a$b r6 = hl2.C17411f.a.b.f67438a
                r5.f67466x = r0
                r5.f67465w = r4
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L30
                goto L42
            L30:
                hl2.f$a$a r6 = new hl2.f$a$a
                hl2.c r2 = r5.f67467y
                r6.<init>(r2)
                r2 = 0
                r5.f67466x = r2
                r5.f67465w = r3
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L43
            L42:
                return r1
            L43:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: hl2.C17411f.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: hl2.f$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.training.hrsettings.domain.HrSettingsInteractor$interact$1$4", m100430f = "HrSettingsInteractor.kt", m100431l = {56}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lhl2/f$a$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f67468w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f67469x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC17408c f67470y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(AbstractC17408c abstractC17408c, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f67470y = abstractC17408c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = new i(this.f67470y, interfaceC30057d);
            iVar.f67469x = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f67469x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f67468w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                a.C41697a c41697a = new a.C41697a(this.f67470y);
                this.f67469x = null;
                this.f67468w = 1;
                if (interfaceC13062m.emit(c41697a, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hl2.f$j */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.training.hrsettings.domain.HrSettingsInteractor$interact$2", m100430f = "HrSettingsInteractor.kt", m100431l = {60}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lhl2/d;", "previousState", "Lhl2/f$a;", "internalAction", "<anonymous>", "(Lhl2/d;Lhl2/f$a;)Lhl2/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f67471w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f67472x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f67473y;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C17409d c17409d, a aVar, InterfaceC30057d<? super C17409d> interfaceC30057d) {
            j jVar = C17411f.this.new j(interfaceC30057d);
            jVar.f67472x = c17409d;
            jVar.f67473y = aVar;
            return jVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C17409d c17409d = (C17409d) this.f67472x;
            a aVar = (a) this.f67473y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f67471w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(aVar instanceof a.C41697a)) {
                    if (AbstractC22676k.m65745e(aVar, a.b.f67438a)) {
                        return C17409d.m49383b(c17409d, InterfaceC17407b.g.f67390a, null, null, null, null, 30, null);
                    }
                    if (AbstractC22676k.m65745e(aVar, a.c.f67439a)) {
                        return C17409d.m49383b(c17409d, InterfaceC17407b.p.f67398a, null, null, null, null, 30, null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                C17411f c17411f = C17411f.this;
                AbstractC17408c domainAction = ((a.C41697a) aVar).getDomainAction();
                this.f67472x = null;
                this.f67473y = null;
                this.f67471w = 1;
                obj = c17411f.m49403m(c17409d, domainAction, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (C17409d) obj;
        }
    }

    /* JADX INFO: renamed from: hl2.f$k */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.training.hrsettings.domain.HrSettingsInteractor", m100430f = "HrSettingsInteractor.kt", m100431l = {195, 205}, m100432m = "postManualHrZones", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f67475E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f67476F;

        /* JADX INFO: renamed from: H */
        int f67478H;

        /* JADX INFO: renamed from: w */
        boolean f67479w;

        /* JADX INFO: renamed from: x */
        Object f67480x;

        /* JADX INFO: renamed from: y */
        Object f67481y;

        /* JADX INFO: renamed from: z */
        Object f67482z;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f67476F = obj;
            this.f67478H |= Integer.MIN_VALUE;
            return C17411f.this.m49408s(false, null, this);
        }
    }

    /* JADX INFO: renamed from: hl2.f$l */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.training.hrsettings.domain.HrSettingsInteractor$postManualHrZones$2", m100430f = "HrSettingsInteractor.kt", m100431l = {196}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/training/data/network/response/hrsettings/HrSettingsZonesResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f67483w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f67485y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ List<Zone> f67486z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(boolean z4, List<Zone> list, InterfaceC30057d<? super l> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f67485y = z4;
            this.f67486z = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C17411f.this.new l(this.f67485y, this.f67486z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f67483w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HrSettingsApi hrSettingsApi = C17411f.this.api;
            CustomHrZonesRequest customHrZonesRequest = new CustomHrZonesRequest(!this.f67485y, this.f67486z);
            this.f67483w = 1;
            Object objPostCustomZones = hrSettingsApi.postCustomZones(customHrZonesRequest, this);
            return objPostCustomZones == enumC31071a ? enumC31071a : objPostCustomZones;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super HrSettingsZonesResponse> interfaceC30057d) {
            return ((l) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: hl2.f$m */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.training.hrsettings.domain.HrSettingsInteractor", m100430f = "HrSettingsInteractor.kt", m100431l = {154, 160}, m100432m = "postMaxHr", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f67487E;

        /* JADX INFO: renamed from: G */
        int f67489G;

        /* JADX INFO: renamed from: w */
        int f67490w;

        /* JADX INFO: renamed from: x */
        int f67491x;

        /* JADX INFO: renamed from: y */
        Object f67492y;

        /* JADX INFO: renamed from: z */
        Object f67493z;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f67487E = obj;
            this.f67489G |= Integer.MIN_VALUE;
            return C17411f.this.m49409t(0, null, this);
        }
    }

    /* JADX INFO: renamed from: hl2.f$n */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.training.hrsettings.domain.HrSettingsInteractor$postMaxHr$2", m100430f = "HrSettingsInteractor.kt", m100431l = {155}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/training/data/network/response/hrsettings/HrSettingsZonesResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f67494w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f67496y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(int i13, InterfaceC30057d<? super n> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f67496y = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C17411f.this.new n(this.f67496y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f67494w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HrSettingsApi hrSettingsApi = C17411f.this.api;
            MaxHrRequest maxHrRequest = new MaxHrRequest(this.f67496y);
            this.f67494w = 1;
            Object objUpdateMaxHr = hrSettingsApi.updateMaxHr(maxHrRequest, this);
            return objUpdateMaxHr == enumC31071a ? enumC31071a : objUpdateMaxHr;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super HrSettingsZonesResponse> interfaceC30057d) {
            return ((n) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C17411f(InterfaceC34116n logger, HrSettingsApi api, C17413h hrZoneAdjuster, C13562a hrZonesRepository, C15971a analyticsHelper) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(hrZoneAdjuster, "hrZoneAdjuster");
        AbstractC22676k.m65750j(hrZonesRepository, "hrZonesRepository");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.logger = logger;
        this.api = api;
        this.hrZoneAdjuster = hrZoneAdjuster;
        this.hrZonesRepository = hrZonesRepository;
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: renamed from: g */
    private final C17409d m49397g(C17409d c17409d, AbstractC17408c.l lVar) {
        for (HeartRateEntryRow heartRateEntryRow : c17409d.getSuccessResponse().getHeartRateEntryRow()) {
            if (AbstractC22676k.m65745e(heartRateEntryRow.getId(), "MAX_HR")) {
                return AbstractC22676k.m65745e(c17409d.getSaveEnabled(), Boolean.TRUE) ? C17409d.m49383b(c17409d, new InterfaceC17407b.b(lVar.getValue()), null, null, null, null, 28, null) : C17409d.m49383b(c17409d, null, new InterfaceC17406a.a(lVar.getValue(), heartRateEntryRow.getMinValue(), heartRateEntryRow.getMaxValue()), null, null, Boolean.FALSE, 12, null);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: h */
    private final InterfaceC17406a m49398h(C17409d c17409d, String str, int i13, EnumC33227v1 enumC33227v1) {
        C23465k c23465kM49428g = this.hrZoneAdjuster.m49428g(str, enumC33227v1, c17409d.getSuccessResponse().getHeartRateEntryRow().get(1).getValue(), c17409d.getSuccessResponse().getHeartRateEntryRow().get(0).getValue());
        return new InterfaceC17406a.b(str, i13, ((Number) c23465kM49428g.f92937w).intValue(), ((Number) c23465kM49428g.f92938x).intValue(), enumC33227v1);
    }

    /* JADX INFO: renamed from: i */
    private final C17409d m49399i(C17409d c17409d, AbstractC17408c.d dVar) {
        HrSettingsResponse successResponse = c17409d.getSuccessResponse();
        for (HeartRateEntryRow heartRateEntryRow : successResponse.getHeartRateEntryRow()) {
            if (AbstractC22676k.m65745e(heartRateEntryRow.getId(), "MAX_HR")) {
                return C17409d.m49383b(c17409d, null, new InterfaceC17406a.a(dVar.getValue(), heartRateEntryRow.getMinValue(), heartRateEntryRow.getMaxValue()), null, successResponse.getManualHeartRateZonesForm().getZoneRows(), Boolean.FALSE, 4, null);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: j */
    private final C17409d m49400j(C17409d c17409d) {
        HrSettingsResponse successResponse = c17409d.getSuccessResponse();
        return C17409d.m49383b(c17409d, null, null, HrSettingsResponse.copy$default(successResponse, null, null, null, null, ManualHeartRateZonesForm.copy$default(successResponse.getManualHeartRateZonesForm(), true, null, null, null, null, null, null, null, 254, null), 15, null), successResponse.getManualHeartRateZonesForm().getZoneRows(), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: k */
    public final Object m49401k(C17409d c17409d, InterfaceC30057d<? super C17409d> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f67443z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f67443z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM108729b = bVar2.f67441x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f67443z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            c cVar = new c(null);
            bVar2.f67440w = c17409d;
            bVar2.f67443z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch hr settings screen", cVar, bVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c17409d = (C17409d) bVar2.f67440w;
            AbstractC34132o.m107864I(objM108729b);
        }
        C17409d c17409d2 = c17409d;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b.a) {
            return C17409d.m49383b(c17409d2, InterfaceC17407b.e.f67388a, null, null, null, null, 30, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
            return C17409d.m49383b(c17409d2, InterfaceC17407b.d.f67387a, null, null, null, null, 30, null);
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC34385a.c cVar2 = (InterfaceC34385a.c) interfaceC34385a;
        return C17409d.m49383b(c17409d2, null, null, (HrSettingsResponse) cVar2.m108735a(), ((HrSettingsResponse) cVar2.m108735a()).getManualHeartRateZonesForm().getZoneRows(), Boolean.FALSE, 2, null);
    }

    /* JADX INFO: renamed from: l */
    private final List<Zone> m49402l(C17409d domainState, boolean useDefaultZones) {
        List<Zone> listM49419e;
        List<ZoneRow> defaultHrZones = useDefaultZones ? domainState.getSuccessResponse().getDefaultHrZones() : domainState.m49387e();
        return (defaultHrZones == null || (listM49419e = AbstractC17412g.m49419e(defaultHrZones)) == null) ? C25271y.f99162w : listM49419e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final Object m49403m(C17409d c17409d, AbstractC17408c abstractC17408c, InterfaceC30057d<? super C17409d> interfaceC30057d) {
        if (AbstractC22676k.m65745e(abstractC17408c, AbstractC17408c.f.f67409a)) {
            this.analyticsHelper.m45116f();
            return m49401k(c17409d, interfaceC30057d);
        }
        if (AbstractC22676k.m65745e(abstractC17408c, AbstractC17408c.c.f67404a)) {
            return C17409d.m49383b(c17409d, null, null, null, null, null, 30, null);
        }
        if (abstractC17408c instanceof AbstractC17408c.a) {
            this.analyticsHelper.m45119j();
            return m49400j(c17409d);
        }
        if (abstractC17408c instanceof AbstractC17408c.j) {
            this.analyticsHelper.m45118i();
            return m49408s(true, c17409d, interfaceC30057d);
        }
        if (AbstractC22676k.m65745e(abstractC17408c, AbstractC17408c.k.f67417a)) {
            return C17409d.m49383b(c17409d, InterfaceC17407b.a.f67385a, null, null, null, null, 30, null);
        }
        if (AbstractC22676k.m65745e(abstractC17408c, AbstractC17408c.n.f67422a)) {
            this.analyticsHelper.m45114b("max_hr");
            return C17409d.m49383b(c17409d, InterfaceC17407b.h.f67391a, null, null, null, null, 30, null);
        }
        if (AbstractC22676k.m65745e(abstractC17408c, AbstractC17408c.p.f67424a)) {
            this.analyticsHelper.m45114b("rhr");
            return C17409d.m49383b(c17409d, InterfaceC17407b.m.f67395a, null, null, null, null, 30, null);
        }
        if (AbstractC22676k.m65745e(abstractC17408c, AbstractC17408c.o.f67423a)) {
            return C17409d.m49383b(c17409d, InterfaceC17407b.l.f67394a, null, null, null, null, 30, null);
        }
        if (AbstractC22676k.m65745e(abstractC17408c, AbstractC17408c.m.f67421a)) {
            return C17409d.m49383b(c17409d, InterfaceC17407b.f.f67389a, null, null, null, null, 30, null);
        }
        if (abstractC17408c instanceof AbstractC17408c.l) {
            return m49397g(c17409d, (AbstractC17408c.l) abstractC17408c);
        }
        if (abstractC17408c instanceof AbstractC17408c.e) {
            AbstractC17408c.e eVar = (AbstractC17408c.e) abstractC17408c;
            return C17409d.m49383b(c17409d, null, m49398h(c17409d, eVar.getId(), eVar.getValue(), eVar.getType()), null, null, null, 29, null);
        }
        if (abstractC17408c instanceof AbstractC17408c.i) {
            return m49409t(((AbstractC17408c.i) abstractC17408c).getValue(), c17409d, interfaceC30057d);
        }
        if (AbstractC22676k.m65745e(abstractC17408c, AbstractC17408c.b.f67403a)) {
            return C17409d.m49383b(c17409d, null, null, null, null, null, 29, null);
        }
        if (abstractC17408c instanceof AbstractC17408c.q) {
            return m49411v(c17409d, ((AbstractC17408c.q) abstractC17408c).getSelectedValue());
        }
        if (!(abstractC17408c instanceof AbstractC17408c.g)) {
            if (AbstractC22676k.m65745e(abstractC17408c, AbstractC17408c.h.f67414a)) {
                return m49408s(false, c17409d, interfaceC30057d);
            }
            if (abstractC17408c instanceof AbstractC17408c.d) {
                return m49399i(c17409d, (AbstractC17408c.d) abstractC17408c);
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC17406a currentBottomSheet = c17409d.getCurrentBottomSheet();
        AbstractC22676k.m65748h(currentBottomSheet, "null cannot be cast to non-null type com.whoop.training.hrsettings.domain.BottomSheetState.BottomSheetZoneDomainState");
        InterfaceC17406a.b bVar = (InterfaceC17406a.b) currentBottomSheet;
        AbstractC17408c.g gVar = (AbstractC17408c.g) abstractC17408c;
        this.analyticsHelper.m45115c(bVar.getType(), bVar.getId(), String.valueOf(gVar.getSelectedValue()), gVar.getIsOutOfRange());
        return m49405o(c17409d, gVar);
    }

    /* JADX INFO: renamed from: n */
    private final C17409d m49404n(C17409d domainState, boolean useDefaultZones, boolean isNetworkError) {
        InterfaceC17407b interfaceC17407b;
        this.analyticsHelper.m45117g("error");
        if (isNetworkError) {
            interfaceC17407b = useDefaultZones ? InterfaceC17407b.r.f67400a : InterfaceC17407b.n.f67396a;
        } else {
            interfaceC17407b = useDefaultZones ? InterfaceC17407b.s.f67401a : InterfaceC17407b.o.f67397a;
        }
        return C17409d.m49383b(domainState, interfaceC17407b, null, null, null, null, 28, null);
    }

    /* JADX INFO: renamed from: o */
    private final C17409d m49405o(C17409d c17409d, AbstractC17408c.g gVar) {
        C17409d c17409d2;
        List<ZoneRow> listM49387e = c17409d.m49387e();
        if (listM49387e != null) {
            List<ZoneRow> listM49427c = this.hrZoneAdjuster.m49427c(gVar.getSelectedValue(), gVar.getZoneValueType(), listM49387e, gVar.getZoneId());
            C17409d c17409dM49383b = C17409d.m49383b(c17409d, null, null, null, listM49427c, Boolean.valueOf(!AbstractC22676k.m65745e(listM49427c, c17409d.getSuccessResponse().getDefaultHrZones())), 4, null);
            c17409d2 = c17409d;
            if (c17409dM49383b != null) {
                return c17409dM49383b;
            }
        } else {
            c17409d2 = c17409d;
        }
        return C17409d.m49383b(c17409d2, InterfaceC17407b.e.f67388a, null, null, null, null, 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: p */
    public final Object m49406p(int i13, List<Zone> list, C17409d c17409d, InterfaceC30057d<? super C17409d> interfaceC30057d) {
        d dVar;
        List<ZoneRow> list2;
        List<HeartRateEntryRow> list3;
        List<ZoneRow> list4;
        C17409d c17409d2;
        ManualHeartRateZonesForm manualHeartRateZonesForm;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i14 = dVar.f67451J;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f67451J = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f67449H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = dVar.f67451J;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            List<HeartRateEntryRow> listM49417c = AbstractC17412g.m49417c(c17409d.getSuccessResponse().getHeartRateEntryRow(), i13);
            List<ZoneRow> listM49418d = AbstractC17412g.m49418d(list, c17409d.getSuccessResponse().getManualHeartRateZonesForm().getZoneRows());
            List<ZoneRow> listM49420f = c17409d.getSuccessResponse().getManualHeartRateZonesForm().getToggleValue() ? AbstractC17412g.m49420f(c17409d.getSuccessResponse().getManualHeartRateZonesForm().getZoneRows(), list) : listM49418d;
            ManualHeartRateZonesForm manualHeartRateZonesFormCopy$default = ManualHeartRateZonesForm.copy$default(c17409d.getSuccessResponse().getManualHeartRateZonesForm(), false, null, null, null, null, null, null, listM49420f, 127, null);
            List<ZoneRow> list5 = listM49420f;
            C13562a c13562a = this.hrZonesRepository;
            List<Zone> listM49416b = AbstractC17412g.m49416b(AbstractC17412g.m49419e(list5));
            dVar.f67453x = null;
            dVar.f67454y = c17409d;
            dVar.f67455z = listM49417c;
            dVar.f67446E = listM49418d;
            dVar.f67447F = list5;
            dVar.f67448G = manualHeartRateZonesFormCopy$default;
            dVar.f67452w = i13;
            dVar.f67451J = 1;
            if (c13562a.m38285p(listM49416b, dVar) == enumC31071a) {
                return enumC31071a;
            }
            list2 = listM49418d;
            list3 = listM49417c;
            list4 = list5;
            c17409d2 = c17409d;
            manualHeartRateZonesForm = manualHeartRateZonesFormCopy$default;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ManualHeartRateZonesForm manualHeartRateZonesForm2 = (ManualHeartRateZonesForm) dVar.f67448G;
            List<ZoneRow> list6 = (List) dVar.f67447F;
            list2 = (List) dVar.f67446E;
            List<HeartRateEntryRow> list7 = (List) dVar.f67455z;
            C17409d c17409d3 = (C17409d) dVar.f67454y;
            AbstractC34132o.m107864I(obj);
            list4 = list6;
            list3 = list7;
            c17409d2 = c17409d3;
            manualHeartRateZonesForm = manualHeartRateZonesForm2;
        }
        return C17409d.m49383b(c17409d2, null, null, HrSettingsResponse.copy$default(c17409d2.getSuccessResponse(), null, null, list3, list2, manualHeartRateZonesForm, 3, null), list4, null, 16, null);
    }

    /* JADX INFO: renamed from: q */
    private final C17409d m49407q(C17409d domainState, InterfaceC17407b dialogType) {
        this.analyticsHelper.m45113a();
        return C17409d.m49383b(domainState, dialogType, null, null, null, null, 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: s */
    public final Object m49408s(boolean z4, C17409d c17409d, InterfaceC30057d<? super C17409d> interfaceC30057d) {
        k kVar;
        C17409d c17409d2;
        InterfaceC34385a interfaceC34385a;
        if (interfaceC30057d instanceof k) {
            kVar = (k) interfaceC30057d;
            int i13 = kVar.f67478H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                kVar.f67478H = i13 - Integer.MIN_VALUE;
            } else {
                kVar = new k(interfaceC30057d);
            }
        } else {
            kVar = new k(interfaceC30057d);
        }
        k kVar2 = kVar;
        Object objM108729b = kVar2.f67476F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = kVar2.f67478H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            List<Zone> listM49402l = m49402l(c17409d, z4);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            l lVar = new l(z4, listM49402l, null);
            kVar2.f67480x = c17409d;
            kVar2.f67481y = null;
            kVar2.f67479w = z4;
            kVar2.f67478H = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to post manual hr zones", lVar, kVar2, 2, null);
            if (objM108729b != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            z4 = kVar2.f67479w;
            c17409d = (C17409d) kVar2.f67480x;
            AbstractC34132o.m107864I(objM108729b);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = kVar2.f67479w;
            interfaceC34385a = (InterfaceC34385a) kVar2.f67482z;
            c17409d2 = (C17409d) kVar2.f67480x;
            AbstractC34132o.m107864I(objM108729b);
        }
        return m49410u(c17409d2, (HrSettingsZonesResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), z4);
        InterfaceC34385a interfaceC34385a2 = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a2 instanceof InterfaceC34385a.b.a) {
            return m49404n(c17409d, z4, false);
        }
        if (interfaceC34385a2 instanceof InterfaceC34385a.b.C42432b) {
            return m49404n(c17409d, z4, true);
        }
        if (!(interfaceC34385a2 instanceof InterfaceC34385a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!z4) {
            this.analyticsHelper.m45117g("success");
        }
        C13562a c13562a = this.hrZonesRepository;
        List<Zone> zones = ((HrSettingsZonesResponse) ((InterfaceC34385a.c) interfaceC34385a2).m108735a()).getZones();
        kVar2.f67480x = c17409d;
        kVar2.f67481y = null;
        kVar2.f67482z = interfaceC34385a2;
        kVar2.f67479w = z4;
        kVar2.f67475E = 0;
        kVar2.f67478H = 2;
        if (c13562a.m38285p(zones, kVar2) != enumC31071a) {
            c17409d2 = c17409d;
            interfaceC34385a = interfaceC34385a2;
            return m49410u(c17409d2, (HrSettingsZonesResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), z4);
        }
        return enumC31071a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r14 == r0) goto L32;
     */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m49409t(int r12, hl2.C17409d r13, q83.InterfaceC30057d<? super hl2.C17409d> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof hl2.C17411f.m
            if (r0 == 0) goto L14
            r0 = r14
            hl2.f$m r0 = (hl2.C17411f.m) r0
            int r1 = r0.f67489G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f67489G = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            hl2.f$m r0 = new hl2.f$m
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f67487E
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f67489G
            r9 = 2
            r2 = 1
            r10 = 0
            if (r1 == 0) goto L47
            if (r1 == r2) goto L3d
            if (r1 != r9) goto L35
            java.lang.Object r12 = r6.f67493z
            u02.a r12 = (u02.InterfaceC34385a) r12
            java.lang.Object r12 = r6.f67492y
            hl2.d r12 = (hl2.C17409d) r12
            p505ts.AbstractC34132o.m107864I(r14)
            goto La6
        L35:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3d:
            int r12 = r6.f67490w
            java.lang.Object r13 = r6.f67492y
            hl2.d r13 = (hl2.C17409d) r13
            p505ts.AbstractC34132o.m107864I(r14)
            goto L66
        L47:
            p505ts.AbstractC34132o.m107864I(r14)
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            r14 = r2
            tr2.n r2 = r11.logger
            hl2.f$n r5 = new hl2.f$n
            r5.<init>(r12, r10)
            r6.f67492y = r13
            r6.f67490w = r12
            r6.f67489G = r14
            r3 = 0
            java.lang.String r4 = "Failed to post max hr"
            r7 = 2
            r8 = 0
            java.lang.Object r14 = u02.InterfaceC34385a.Companion.m108729b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r14 != r0) goto L66
            goto La5
        L66:
            u02.a r14 = (u02.InterfaceC34385a) r14
            boolean r1 = r14 instanceof u02.InterfaceC34385a.b.a
            if (r1 == 0) goto L76
            hl2.b$j r14 = new hl2.b$j
            r14.<init>(r12)
            hl2.d r12 = r11.m49407q(r13, r14)
            return r12
        L76:
            boolean r1 = r14 instanceof u02.InterfaceC34385a.b.C42432b
            if (r1 == 0) goto L84
            hl2.b$i r14 = new hl2.b$i
            r14.<init>(r12)
            hl2.d r12 = r11.m49407q(r13, r14)
            return r12
        L84:
            boolean r1 = r14 instanceof u02.InterfaceC34385a.c
            if (r1 == 0) goto La9
            u02.a$c r14 = (u02.InterfaceC34385a.c) r14
            java.lang.Object r14 = r14.m108735a()
            com.whoop.training.data.network.response.hrsettings.HrSettingsZonesResponse r14 = (com.whoop.training.data.network.response.hrsettings.HrSettingsZonesResponse) r14
            java.util.List r14 = r14.getZones()
            r6.f67492y = r10
            r6.f67493z = r10
            r6.f67490w = r12
            r1 = 0
            r6.f67491x = r1
            r6.f67489G = r9
            java.lang.Object r14 = r11.m49406p(r12, r14, r13, r6)
            if (r14 != r0) goto La6
        La5:
            return r0
        La6:
            hl2.d r14 = (hl2.C17409d) r14
            return r14
        La9:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: hl2.C17411f.m49409t(int, hl2.d, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: u */
    private final C17409d m49410u(C17409d domainState, HrSettingsZonesResponse data, boolean useDefaultZones) {
        HeartRateEntryRow maxHrEntryField;
        List<HeartRateEntryRow> heartRateEntryRow = domainState.getSuccessResponse().getHeartRateEntryRow();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(heartRateEntryRow, 10));
        for (HeartRateEntryRow heartRateEntryRow2 : heartRateEntryRow) {
            if (AbstractC22676k.m65745e(heartRateEntryRow2.getId(), "MAX_HR") && (maxHrEntryField = data.getMaxHrEntryField()) != null) {
                heartRateEntryRow2 = maxHrEntryField;
            }
            arrayList.add(heartRateEntryRow2);
        }
        ManualHeartRateZonesForm manualHeartRateZonesFormCopy$default = ManualHeartRateZonesForm.copy$default(domainState.getSuccessResponse().getManualHeartRateZonesForm(), !useDefaultZones, null, null, null, null, null, null, AbstractC17412g.m49418d(data.getZones(), domainState.getSuccessResponse().getManualHeartRateZonesForm().getZoneRows()), 126, null);
        return domainState.m49384a(null, null, HrSettingsResponse.copy$default(domainState.getSuccessResponse(), null, null, arrayList, null, manualHeartRateZonesFormCopy$default, 11, null), manualHeartRateZonesFormCopy$default.getZoneRows(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: v */
    private final C17409d m49411v(C17409d c17409d, int i13) {
        InterfaceC17406a currentBottomSheet = c17409d.getCurrentBottomSheet();
        if (currentBottomSheet instanceof InterfaceC17406a.b) {
            currentBottomSheet = InterfaceC17406a.b.m49362b((InterfaceC17406a.b) currentBottomSheet, null, i13, 0, 0, null, 29, null);
        } else if (currentBottomSheet instanceof InterfaceC17406a.a) {
            currentBottomSheet = InterfaceC17406a.a.m49357b((InterfaceC17406a.a) currentBottomSheet, i13, 0, 0, 6, null);
        }
        return C17409d.m49383b(c17409d, null, currentBottomSheet, null, null, null, 29, null);
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC13058l m49412r(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C17409d(null, null, null, null, null, 31, null), AbstractC13091v.m36590P(upstream, new e(null)), new j(null));
    }
}
