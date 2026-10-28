package ul1;

import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ci2.InterfaceC4733b;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.LanguageRepositoryKt;
import com.whoop.design.util.AbstractC8693b;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fc3.AbstractC14371b;
import fn0.EnumC14640b;
import gk2.EnumC15932g;
import gk2.InterfaceC15928c;
import gt0.InterfaceC16186h;
import il1.AbstractC18638o;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import ks0.AbstractC22820a;
import l83.C23454a0;
import ml1.C25673b;
import ml1.C25675d;
import nl1.C26813a;
import od1.InterfaceC27844g;
import or2.C28162g;
import p007a6.C0456u;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rr2.AbstractC31768e;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sx1.C33067c;
import tr2.InterfaceC34116n;
import vv1.C36530a;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: ul1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001Bm\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b&\u0010%J#\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\"2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\"H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010:R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010;R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010<R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006C"}, m65681d2 = {"Lul1/a;", "Lod1/g;", "Lil1/o;", "Lul1/b;", "Lci2/b;", "whoopStrapProvider", "Lgk2/c;", "tombstoneManager", "Lor2/g;", "buildConfigProvider", "Lml1/b;", "companionDeviceHandler", "Lsx1/c;", "reactivationModalCoordinator", "Lvv1/a;", "dunningBottomSheetCoordinator", "Lzr2/a;", "dateAndTimeProvider", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "La6/g;", "Lf6/f;", "prefsDataStore", "Lnl1/a;", "newFirmwareUpdateMonitor", "Lul1/d;", "homeLanguageModalStringsFetcher", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lci2/b;Lgk2/c;Lor2/g;Lml1/b;Lsx1/c;Lvv1/a;Lzr2/a;Lcom/whoop/data/local/prefs/PreferenceHelper;La6/g;Lnl1/a;Lul1/d;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Ll83/a0;", "k", "()V", "Lec3/l;", "", "j", "()Lec3/l;", "i", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lci2/b;", "b", "Lgk2/c;", "c", "Lor2/g;", "d", "Lml1/b;", "e", "Lsx1/c;", "f", "Lvv1/a;", "g", "Lzr2/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/data/local/prefs/PreferenceHelper;", "La6/g;", "Lnl1/a;", "Lul1/d;", "l", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ltr2/n;", "m", "Ltr2/n;", "logger", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35064a implements InterfaceC27844g<AbstractC18638o, AbstractC35065b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC15928c tombstoneManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C28162g buildConfigProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C25673b companionDeviceHandler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C33067c reactivationModalCoordinator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C36530a dunningBottomSheetCoordinator;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final PreferenceHelper preferenceHelper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC0422g prefsDataStore;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C26813a newFirmwareUpdateMonitor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C35067d homeLanguageModalStringsFetcher;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ul1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f148580w;

        /* JADX INFO: renamed from: ul1.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42485a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f148581w;

            /* JADX INFO: renamed from: ul1.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.domain.dialog.DialogStateCombiner$appCrashFlow$$inlined$map$1$2", m100430f = "DialogStateCombiner.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42486a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f148582E;

                /* JADX INFO: renamed from: F */
                Object f148583F;

                /* JADX INFO: renamed from: G */
                Object f148584G;

                /* JADX INFO: renamed from: H */
                int f148585H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f148586w;

                /* JADX INFO: renamed from: x */
                int f148587x;

                /* JADX INFO: renamed from: y */
                Object f148588y;

                public C42486a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f148586w = obj;
                    this.f148587x |= Integer.MIN_VALUE;
                    return C42485a.this.emit(null, this);
                }
            }

            public C42485a(InterfaceC13062m interfaceC13062m) {
                this.f148581w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42486a c42486a;
                if (interfaceC30057d instanceof C42486a) {
                    c42486a = (C42486a) interfaceC30057d;
                    int i13 = c42486a.f148587x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42486a.f148587x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42486a = new C42486a(interfaceC30057d);
                    }
                } else {
                    c42486a = new C42486a(interfaceC30057d);
                }
                Object obj2 = c42486a.f148586w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42486a.f148587x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f148581w;
                    Boolean boolValueOf = Boolean.valueOf(AbstractC22676k.m65745e(((AbstractC14134f) obj).mo40227b(AbstractC31768e.m98639b()), Boolean.TRUE));
                    c42486a.f148588y = null;
                    c42486a.f148582E = null;
                    c42486a.f148583F = null;
                    c42486a.f148584G = null;
                    c42486a.f148585H = 0;
                    c42486a.f148587x = 1;
                    if (interfaceC13062m.emit(boolValueOf, c42486a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC13058l interfaceC13058l) {
            this.f148580w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f148580w.collect(new C42485a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ul1.a$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f148590w;

        /* JADX INFO: renamed from: ul1.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f148591w;

            /* JADX INFO: renamed from: ul1.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.domain.dialog.DialogStateCombiner$dataStoreFlow$$inlined$map$1$2", m100430f = "DialogStateCombiner.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42487a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f148592E;

                /* JADX INFO: renamed from: F */
                Object f148593F;

                /* JADX INFO: renamed from: G */
                Object f148594G;

                /* JADX INFO: renamed from: H */
                int f148595H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f148596w;

                /* JADX INFO: renamed from: x */
                int f148597x;

                /* JADX INFO: renamed from: y */
                Object f148598y;

                public C42487a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f148596w = obj;
                    this.f148597x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f148591w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42487a c42487a;
                if (interfaceC30057d instanceof C42487a) {
                    c42487a = (C42487a) interfaceC30057d;
                    int i13 = c42487a.f148597x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42487a.f148597x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42487a = new C42487a(interfaceC30057d);
                    }
                } else {
                    c42487a = new C42487a(interfaceC30057d);
                }
                Object obj2 = c42487a.f148596w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42487a.f148597x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f148591w;
                    Boolean boolValueOf = Boolean.valueOf(AbstractC22676k.m65745e(((AbstractC14134f) obj).mo40227b(LanguageRepositoryKt.getKEY_SHOW_LANGUAGE_MODAL()), Boolean.TRUE));
                    c42487a.f148598y = null;
                    c42487a.f148592E = null;
                    c42487a.f148593F = null;
                    c42487a.f148594G = null;
                    c42487a.f148595H = 0;
                    c42487a.f148597x = 1;
                    if (interfaceC13062m.emit(boolValueOf, c42487a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public b(InterfaceC13058l interfaceC13058l) {
            this.f148590w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f148590w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ul1.a$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l[] f148600w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35064a f148601x;

        /* JADX INFO: renamed from: ul1.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l[] f148602w;

            public a(InterfaceC13058l[] interfaceC13058lArr) {
                this.f148602w = interfaceC13058lArr;
            }

            @Override // c93.InterfaceC4339a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object[] invoke() {
                return new Object[this.f148602w.length];
            }
        }

        /* JADX INFO: renamed from: ul1.a$c$b */
        @InterfaceC32271e(m100429c = "com.whoop.home.domain.dialog.DialogStateCombiner$interact$$inlined$combine$1$3", m100430f = "DialogStateCombiner.kt", m100431l = {246, 247, 234}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m65681d2 = {"R", "T", "Lec3/m;", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Lkotlin/Array;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements Function3 {

            /* JADX INFO: renamed from: E */
            Object f148603E;

            /* JADX INFO: renamed from: F */
            Object f148604F;

            /* JADX INFO: renamed from: G */
            int f148605G;

            /* JADX INFO: renamed from: H */
            final /* synthetic */ C35064a f148606H;

            /* JADX INFO: renamed from: I */
            Object f148607I;

            /* JADX INFO: renamed from: J */
            Object f148608J;

            /* JADX INFO: renamed from: K */
            Object f148609K;

            /* JADX INFO: renamed from: L */
            Object f148610L;

            /* JADX INFO: renamed from: M */
            Object f148611M;

            /* JADX INFO: renamed from: N */
            Object f148612N;

            /* JADX INFO: renamed from: O */
            int f148613O;

            /* JADX INFO: renamed from: P */
            boolean f148614P;

            /* JADX INFO: renamed from: Q */
            boolean f148615Q;

            /* JADX INFO: renamed from: w */
            int f148616w;

            /* JADX INFO: renamed from: x */
            private /* synthetic */ Object f148617x;

            /* JADX INFO: renamed from: y */
            /* synthetic */ Object f148618y;

            /* JADX INFO: renamed from: z */
            Object f148619z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC30057d interfaceC30057d, C35064a c35064a) {
                super(3, interfaceC30057d);
                this.f148606H = c35064a;
            }

            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(InterfaceC13062m interfaceC13062m, Object[] objArr, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                b bVar = new b(interfaceC30057d, this.f148606H);
                bVar.f148617x = interfaceC13062m;
                bVar.f148618y = objArr;
                return bVar.invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code duplicated, block: B:57:0x02b4  */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0145, code lost:
            
                if (r5 == r1) goto L61;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x02d5, code lost:
            
                if (r2.emit(r8, r16) == r1) goto L61;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                /*
                    Method dump skipped, instruction units count: 731
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ul1.C35064a.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public c(InterfaceC13058l[] interfaceC13058lArr, C35064a c35064a) {
            this.f148600w = interfaceC13058lArr;
            this.f148601x = c35064a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            InterfaceC13058l[] interfaceC13058lArr = this.f148600w;
            Object objM41038a = AbstractC14371b.m41038a(new a(interfaceC13058lArr), interfaceC13062m, new b(null, this.f148601x), interfaceC30057d, interfaceC13058lArr);
            return objM41038a == EnumC31071a.f128113w ? objM41038a : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ul1.a$d */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.dialog.DialogStateCombiner$interact$1", m100430f = "DialogStateCombiner.kt", m100431l = {65}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lgk2/g;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f148620w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f148621x;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f148621x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f148621x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f148620w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                EnumC15932g enumC15932g = EnumC15932g.VALID;
                this.f148621x = null;
                this.f148620w = 1;
                if (interfaceC13062m.emit(enumC15932g, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ul1.a$e */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.dialog.DialogStateCombiner$interact$2", m100430f = "DialogStateCombiner.kt", m100431l = {66}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lml1/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f148622w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f148623x;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f148623x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f148623x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f148622w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C25675d c25675d = new C25675d(EnumC14640b.NO_CDM_DIALOG);
                this.f148623x = null;
                this.f148622w = 1;
                if (interfaceC13062m.emit(c25675d, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ul1.a$f */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.dialog.DialogStateCombiner$interact$3", m100430f = "DialogStateCombiner.kt", m100431l = {70}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lgt0/h;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f148624w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f148625x;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(interfaceC30057d);
            fVar.f148625x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f148625x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f148624w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC16186h.h hVar = InterfaceC16186h.h.f61490b;
                this.f148625x = null;
                this.f148624w = 1;
                if (interfaceC13062m.emit(hVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ul1.a$g */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.dialog.DialogStateCombiner$interact$5", m100430f = "DialogStateCombiner.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lul1/b;", "state", "Lil1/o;", "action", "<anonymous>", "(Lul1/b;Lil1/o;)Lul1/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f148626w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f148627x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f148628y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC35065b abstractC35065b, AbstractC18638o abstractC18638o, InterfaceC30057d<? super AbstractC35065b> interfaceC30057d) {
            g gVar = C35064a.this.new g(interfaceC30057d);
            gVar.f148627x = abstractC35065b;
            gVar.f148628y = abstractC18638o;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC35065b abstractC35065b = (AbstractC35065b) this.f148627x;
            AbstractC18638o abstractC18638o = (AbstractC18638o) this.f148628y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f148626w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC22676k.m65745e(abstractC18638o, AbstractC18638o.c.f72958a)) {
                if (abstractC35065b.getIsDismissable()) {
                    return AbstractC35065b.b.f148645m;
                }
            } else {
                if (abstractC18638o instanceof AbstractC18638o.a) {
                    C35064a.this.logger.mo85228t("CDM: CDM Continue", new AbstractC30556a.a[0]);
                    C35064a.this.m110879k();
                    C35064a.this.companionDeviceHandler.m75596e(((AbstractC18638o.a) abstractC18638o).getCallback());
                    return AbstractC35065b.b.f148645m;
                }
                if (abstractC18638o instanceof AbstractC18638o.d) {
                    return new AbstractC35065b.f(AbstractC8693b.m21277k(AbstractC22820a.f89923d), AbstractC8693b.m21277k(AbstractC22820a.f89921b), AbstractC8693b.m21277k(AbstractC22820a.f89922c));
                }
            }
            return abstractC35065b;
        }
    }

    /* JADX INFO: renamed from: ul1.a$h */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.dialog.DialogStateCombiner$interact$6", m100430f = "DialogStateCombiner.kt", m100431l = {185}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lul1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f148630w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f148631x;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(interfaceC30057d);
            hVar.f148631x = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f148631x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f148630w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC35065b.b bVar = AbstractC35065b.b.f148645m;
                this.f148631x = null;
                this.f148630w = 1;
                if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
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

    public C35064a(InterfaceC4733b whoopStrapProvider, InterfaceC15928c tombstoneManager, C28162g buildConfigProvider, C25673b companionDeviceHandler, C33067c reactivationModalCoordinator, C36530a dunningBottomSheetCoordinator, InterfaceC41070a dateAndTimeProvider, PreferenceHelper preferenceHelper, InterfaceC0422g prefsDataStore, C26813a newFirmwareUpdateMonitor, C35067d homeLanguageModalStringsFetcher, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(tombstoneManager, "tombstoneManager");
        AbstractC22676k.m65750j(buildConfigProvider, "buildConfigProvider");
        AbstractC22676k.m65750j(companionDeviceHandler, "companionDeviceHandler");
        AbstractC22676k.m65750j(reactivationModalCoordinator, "reactivationModalCoordinator");
        AbstractC22676k.m65750j(dunningBottomSheetCoordinator, "dunningBottomSheetCoordinator");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
        AbstractC22676k.m65750j(prefsDataStore, "prefsDataStore");
        AbstractC22676k.m65750j(newFirmwareUpdateMonitor, "newFirmwareUpdateMonitor");
        AbstractC22676k.m65750j(homeLanguageModalStringsFetcher, "homeLanguageModalStringsFetcher");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.whoopStrapProvider = whoopStrapProvider;
        this.tombstoneManager = tombstoneManager;
        this.buildConfigProvider = buildConfigProvider;
        this.companionDeviceHandler = companionDeviceHandler;
        this.reactivationModalCoordinator = reactivationModalCoordinator;
        this.dunningBottomSheetCoordinator = dunningBottomSheetCoordinator;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.preferenceHelper = preferenceHelper;
        this.prefsDataStore = prefsDataStore;
        this.newFirmwareUpdateMonitor = newFirmwareUpdateMonitor;
        this.homeLanguageModalStringsFetcher = homeLanguageModalStringsFetcher;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("DialogStateCombiner");
    }

    /* JADX INFO: renamed from: i */
    private final InterfaceC13058l m110877i() {
        return this.featureFlagChecker.isFeatureEnabled("app-crash-dialog") ? AbstractC13091v.m36610t(new a(this.prefsDataStore.getData())) : new C0456u(Boolean.FALSE, 1);
    }

    /* JADX INFO: renamed from: j */
    private final InterfaceC13058l m110878j() {
        return this.featureFlagChecker.isFeatureEnabled("disable-language-modal2") ? new C0456u(Boolean.FALSE, 1) : AbstractC13091v.m36610t(new b(this.prefsDataStore.getData()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final void m110879k() {
        this.preferenceHelper.putLongValueIntoMainPrefs(SharedPreferenceConstants.KEY_LAST_PROMPTED_COMPANION_DEVICE_MODAL, this.dateAndTimeProvider.mo133364c().getMillis());
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13015a0(new h(null), new C13060l1(new c(new InterfaceC13058l[]{new C13015a0(new d(null), this.tombstoneManager.getTombstoneStateSharedFlow()), new C13015a0(new e(null), this.companionDeviceHandler.getCdmDialogFlow()), m110878j(), m110877i(), this.reactivationModalCoordinator.getReactivationModalFlow(), new C13015a0(new f(null), this.newFirmwareUpdateMonitor.getStrapFwUpdateMonitorFlow()), this.dunningBottomSheetCoordinator.getStateFlow()}, this), upstream, new g(null), 1));
    }
}
