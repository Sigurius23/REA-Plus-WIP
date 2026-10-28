package qp1;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.hormonalinsights.api.EnablePregnancyCoachingBody;
import com.whoop.hormonalinsights.api.HormonalInsightsApi;
import com.whoop.hormonalinsights.api.HormonalSettingsRequest;
import com.whoop.hormonalinsights.api.ToggleCycleTrendsOverlayRequest;
import com.whoop.hormonalinsights.api.UpdateGoalsRequest;
import com.whoop.hormonalinsights.onboarding.domain.models.ContraceptionType;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsSettingsResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import in2.InterfaceC18732d;
import java.util.List;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import u92.C34660d;

/* JADX INFO: renamed from: qp1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0015\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0017\u0010\u0013J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001e\u001a\u00020\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001cH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b!\u0010\u000fJ#\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, m65681d2 = {"Lqp1/f;", "Lod1/g;", "Lqp1/d;", "Lqp1/e;", "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;", "api", "Lu92/d;", "sharedPreferences", "Lin2/d;", "dispatcher", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Lu92/d;Lin2/d;Ltr2/n;)V", "m", "(Lq83/d;)Ljava/lang/Object;", "", "dueDate", "q", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "mode", "n", NotificationCompat.CATEGORY_STATUS, "o", "", "enabled", "p", "(ZLq83/d;)Ljava/lang/Object;", "", "selectedValues", "r", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lqp1/g$a;", "l", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;", "b", "Lu92/d;", "c", "Lin2/d;", "d", "Ltr2/n;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30537f implements InterfaceC27844g<AbstractC30535d, AbstractC30536e> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HormonalInsightsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C34660d sharedPreferences;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: qp1.f$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor", m100430f = "HormonalSettingsInteractor.kt", m100431l = {156}, m100432m = "dismissUpsell", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f125570w;

        /* JADX INFO: renamed from: y */
        int f125572y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f125570w = obj;
            this.f125572y |= Integer.MIN_VALUE;
            return C30537f.this.m93617l(this);
        }
    }

    /* JADX INFO: renamed from: qp1.f$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor$dismissUpsell$2", m100430f = "HormonalSettingsInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f125573w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C30537f.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f125573w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C30537f.this.sharedPreferences.m109538q(SharedPreferenceConstants.KEY_SHOW_UPSELL_HORMONAL_SETTINGS, false);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qp1.f$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "HormonalSettingsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f125575w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f125576x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f125577y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C30537f f125578z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C30537f c30537f) {
            super(3, interfaceC30057d);
            this.f125578z = c30537f;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC30535d abstractC30535d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f125578z);
            cVar.f125576x = interfaceC13062m;
            cVar.f125577y = abstractC30535d;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C13084s1 c13084s1;
            C13084s1 c13084s2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f125575w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f125576x;
                AbstractC30535d abstractC30535d = (AbstractC30535d) this.f125577y;
                if (abstractC30535d instanceof AbstractC30535d.b) {
                    c13084s2 = new C13084s1(this.f125578z.new d(null));
                } else {
                    if (abstractC30535d instanceof AbstractC30535d.f) {
                        c13084s1 = new C13084s1(this.f125578z.new e(abstractC30535d, null));
                    } else if (abstractC30535d instanceof AbstractC30535d.c) {
                        c13084s1 = new C13084s1(this.f125578z.new f(abstractC30535d, null));
                    } else if (abstractC30535d instanceof AbstractC30535d.d) {
                        c13084s1 = new C13084s1(this.f125578z.new g(abstractC30535d, null));
                    } else if (abstractC30535d instanceof AbstractC30535d.e) {
                        c13084s1 = new C13084s1(this.f125578z.new h(abstractC30535d, null));
                    } else if (abstractC30535d instanceof AbstractC30535d.a) {
                        c13084s2 = new C13084s1(this.f125578z.new i(null));
                    } else {
                        if (!(abstractC30535d instanceof AbstractC30535d.g)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c13084s1 = new C13084s1(this.f125578z.new j(abstractC30535d, null));
                    }
                    c13084s2 = c13084s1;
                }
                this.f125576x = null;
                this.f125577y = null;
                this.f125575w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s2, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC30535d) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: qp1.f$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor$interact$1$1", m100430f = "HormonalSettingsInteractor.kt", m100431l = {35, 35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lqp1/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f125579w;

        /* JADX INFO: renamed from: x */
        int f125580x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f125581y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C30537f.this.new d(interfaceC30057d);
            dVar.f125581y = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f125581y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f125580x
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L25
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L15
                p505ts.AbstractC34132o.m107864I(r7)
                goto L44
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                java.lang.Object r0 = r6.f125579w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L37
            L25:
                p505ts.AbstractC34132o.m107864I(r7)
                qp1.f r7 = qp1.C30537f.this
                r6.f125581y = r5
                r6.f125579w = r0
                r6.f125580x = r4
                java.lang.Object r7 = qp1.C30537f.m93611f(r7, r6)
                if (r7 != r1) goto L37
                goto L43
            L37:
                r6.f125581y = r5
                r6.f125579w = r5
                r6.f125580x = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L44
            L43:
                return r1
            L44:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: qp1.C30537f.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: qp1.f$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor$interact$1$2", m100430f = "HormonalSettingsInteractor.kt", m100431l = {38, 39}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lqp1/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f125583w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f125584x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC30535d f125586z;

        /* JADX INFO: renamed from: qp1.f$e$a */
        @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor$interact$1$2$1", m100430f = "HormonalSettingsInteractor.kt", m100431l = {40, 40}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ AbstractC30535d f125587E;

            /* JADX INFO: renamed from: w */
            Object f125588w;

            /* JADX INFO: renamed from: x */
            int f125589x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13062m f125590y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C30537f f125591z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC13062m interfaceC13062m, C30537f c30537f, AbstractC30535d abstractC30535d, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f125590y = interfaceC13062m;
                this.f125591z = c30537f;
                this.f125587E = abstractC30535d;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f125590y, this.f125591z, this.f125587E, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
            
                if (r1.emit(r6, r5) == r0) goto L15;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r5.f125589x
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L10
                    p505ts.AbstractC34132o.m107864I(r6)
                    goto L46
                L10:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L18:
                    java.lang.Object r1 = r5.f125588w
                    ec3.m r1 = (ec3.InterfaceC13062m) r1
                    p505ts.AbstractC34132o.m107864I(r6)
                    goto L3a
                L20:
                    p505ts.AbstractC34132o.m107864I(r6)
                    ec3.m r1 = r5.f125590y
                    qp1.f r6 = r5.f125591z
                    qp1.d r4 = r5.f125587E
                    qp1.d$f r4 = (qp1.AbstractC30535d.f) r4
                    java.lang.String r4 = r4.getDueDate()
                    r5.f125588w = r1
                    r5.f125589x = r3
                    java.lang.Object r6 = qp1.C30537f.m93615j(r6, r4, r5)
                    if (r6 != r0) goto L3a
                    goto L45
                L3a:
                    r3 = 0
                    r5.f125588w = r3
                    r5.f125589x = r2
                    java.lang.Object r6 = r1.emit(r6, r5)
                    if (r6 != r0) goto L46
                L45:
                    return r0
                L46:
                    l83.a0 r6 = l83.C23454a0.f92919a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: qp1.C30537f.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC30535d abstractC30535d, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f125586z = abstractC30535d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C30537f.this.new e(this.f125586z, interfaceC30057d);
            eVar.f125584x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (or2.AbstractC28190p0.m85321a(1000, r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f125584x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f125583w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r7)
                goto L47
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L30
            L20:
                p505ts.AbstractC34132o.m107864I(r7)
                qp1.e$e r7 = qp1.AbstractC30536e.e.f125563a
                r6.f125584x = r0
                r6.f125583w = r4
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L30
                goto L46
            L30:
                qp1.f$e$a r7 = new qp1.f$e$a
                qp1.f r2 = qp1.C30537f.this
                qp1.d r4 = r6.f125586z
                r5 = 0
                r7.<init>(r0, r2, r4, r5)
                r6.f125584x = r5
                r6.f125583w = r3
                r2 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r7 = or2.AbstractC28190p0.m85321a(r2, r7, r6)
                if (r7 != r1) goto L47
            L46:
                return r1
            L47:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: qp1.C30537f.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: qp1.f$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor$interact$1$3", m100430f = "HormonalSettingsInteractor.kt", m100431l = {45, 46}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lqp1/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f125592w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f125593x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC30535d f125595z;

        /* JADX INFO: renamed from: qp1.f$f$a */
        @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor$interact$1$3$1", m100430f = "HormonalSettingsInteractor.kt", m100431l = {47, 47}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ AbstractC30535d f125596E;

            /* JADX INFO: renamed from: w */
            Object f125597w;

            /* JADX INFO: renamed from: x */
            int f125598x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13062m f125599y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C30537f f125600z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC13062m interfaceC13062m, C30537f c30537f, AbstractC30535d abstractC30535d, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f125599y = interfaceC13062m;
                this.f125600z = c30537f;
                this.f125596E = abstractC30535d;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f125599y, this.f125600z, this.f125596E, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
            
                if (r1.emit(r6, r5) == r0) goto L15;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r5.f125598x
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L10
                    p505ts.AbstractC34132o.m107864I(r6)
                    goto L46
                L10:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L18:
                    java.lang.Object r1 = r5.f125597w
                    ec3.m r1 = (ec3.InterfaceC13062m) r1
                    p505ts.AbstractC34132o.m107864I(r6)
                    goto L3a
                L20:
                    p505ts.AbstractC34132o.m107864I(r6)
                    ec3.m r1 = r5.f125599y
                    qp1.f r6 = r5.f125600z
                    qp1.d r4 = r5.f125596E
                    qp1.d$c r4 = (qp1.AbstractC30535d.c) r4
                    java.lang.String r4 = r4.getMode()
                    r5.f125597w = r1
                    r5.f125598x = r3
                    java.lang.Object r6 = qp1.C30537f.m93612g(r6, r4, r5)
                    if (r6 != r0) goto L3a
                    goto L45
                L3a:
                    r3 = 0
                    r5.f125597w = r3
                    r5.f125598x = r2
                    java.lang.Object r6 = r1.emit(r6, r5)
                    if (r6 != r0) goto L46
                L45:
                    return r0
                L46:
                    l83.a0 r6 = l83.C23454a0.f92919a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: qp1.C30537f.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC30535d abstractC30535d, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f125595z = abstractC30535d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = C30537f.this.new f(this.f125595z, interfaceC30057d);
            fVar.f125593x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (or2.AbstractC28190p0.m85321a(1000, r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f125593x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f125592w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r7)
                goto L47
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L30
            L20:
                p505ts.AbstractC34132o.m107864I(r7)
                qp1.e$e r7 = qp1.AbstractC30536e.e.f125563a
                r6.f125593x = r0
                r6.f125592w = r4
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L30
                goto L46
            L30:
                qp1.f$f$a r7 = new qp1.f$f$a
                qp1.f r2 = qp1.C30537f.this
                qp1.d r4 = r6.f125595z
                r5 = 0
                r7.<init>(r0, r2, r4, r5)
                r6.f125593x = r5
                r6.f125592w = r3
                r2 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r7 = or2.AbstractC28190p0.m85321a(r2, r7, r6)
                if (r7 != r1) goto L47
            L46:
                return r1
            L47:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: qp1.C30537f.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: qp1.f$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor$interact$1$4", m100430f = "HormonalSettingsInteractor.kt", m100431l = {51, 52}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lqp1/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f125601w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f125602x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC30535d f125604z;

        /* JADX INFO: renamed from: qp1.f$g$a */
        @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor$interact$1$4$1", m100430f = "HormonalSettingsInteractor.kt", m100431l = {53, 53}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ AbstractC30535d f125605E;

            /* JADX INFO: renamed from: w */
            Object f125606w;

            /* JADX INFO: renamed from: x */
            int f125607x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13062m f125608y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C30537f f125609z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC13062m interfaceC13062m, C30537f c30537f, AbstractC30535d abstractC30535d, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f125608y = interfaceC13062m;
                this.f125609z = c30537f;
                this.f125605E = abstractC30535d;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f125608y, this.f125609z, this.f125605E, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
            
                if (r1.emit(r6, r5) == r0) goto L15;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r5.f125607x
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L10
                    p505ts.AbstractC34132o.m107864I(r6)
                    goto L46
                L10:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L18:
                    java.lang.Object r1 = r5.f125606w
                    ec3.m r1 = (ec3.InterfaceC13062m) r1
                    p505ts.AbstractC34132o.m107864I(r6)
                    goto L3a
                L20:
                    p505ts.AbstractC34132o.m107864I(r6)
                    ec3.m r1 = r5.f125608y
                    qp1.f r6 = r5.f125609z
                    qp1.d r4 = r5.f125605E
                    qp1.d$d r4 = (qp1.AbstractC30535d.d) r4
                    java.lang.String r4 = r4.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String()
                    r5.f125606w = r1
                    r5.f125607x = r3
                    java.lang.Object r6 = qp1.C30537f.m93613h(r6, r4, r5)
                    if (r6 != r0) goto L3a
                    goto L45
                L3a:
                    r3 = 0
                    r5.f125606w = r3
                    r5.f125607x = r2
                    java.lang.Object r6 = r1.emit(r6, r5)
                    if (r6 != r0) goto L46
                L45:
                    return r0
                L46:
                    l83.a0 r6 = l83.C23454a0.f92919a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: qp1.C30537f.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AbstractC30535d abstractC30535d, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f125604z = abstractC30535d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = C30537f.this.new g(this.f125604z, interfaceC30057d);
            gVar.f125602x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (or2.AbstractC28190p0.m85321a(1000, r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f125602x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f125601w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r7)
                goto L47
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L30
            L20:
                p505ts.AbstractC34132o.m107864I(r7)
                qp1.e$e r7 = qp1.AbstractC30536e.e.f125563a
                r6.f125602x = r0
                r6.f125601w = r4
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L30
                goto L46
            L30:
                qp1.f$g$a r7 = new qp1.f$g$a
                qp1.f r2 = qp1.C30537f.this
                qp1.d r4 = r6.f125604z
                r5 = 0
                r7.<init>(r0, r2, r4, r5)
                r6.f125602x = r5
                r6.f125601w = r3
                r2 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r7 = or2.AbstractC28190p0.m85321a(r2, r7, r6)
                if (r7 != r1) goto L47
            L46:
                return r1
            L47:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: qp1.C30537f.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: qp1.f$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor$interact$1$5", m100430f = "HormonalSettingsInteractor.kt", m100431l = {57, 58}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lqp1/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f125610w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f125611x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC30535d f125613z;

        /* JADX INFO: renamed from: qp1.f$h$a */
        @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor$interact$1$5$1", m100430f = "HormonalSettingsInteractor.kt", m100431l = {59, 59}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ AbstractC30535d f125614E;

            /* JADX INFO: renamed from: w */
            Object f125615w;

            /* JADX INFO: renamed from: x */
            int f125616x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13062m f125617y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C30537f f125618z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC13062m interfaceC13062m, C30537f c30537f, AbstractC30535d abstractC30535d, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f125617y = interfaceC13062m;
                this.f125618z = c30537f;
                this.f125614E = abstractC30535d;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f125617y, this.f125618z, this.f125614E, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
            
                if (r1.emit(r6, r5) == r0) goto L15;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r5.f125616x
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L10
                    p505ts.AbstractC34132o.m107864I(r6)
                    goto L46
                L10:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L18:
                    java.lang.Object r1 = r5.f125615w
                    ec3.m r1 = (ec3.InterfaceC13062m) r1
                    p505ts.AbstractC34132o.m107864I(r6)
                    goto L3a
                L20:
                    p505ts.AbstractC34132o.m107864I(r6)
                    ec3.m r1 = r5.f125617y
                    qp1.f r6 = r5.f125618z
                    qp1.d r4 = r5.f125614E
                    qp1.d$e r4 = (qp1.AbstractC30535d.e) r4
                    boolean r4 = r4.getEnabled()
                    r5.f125615w = r1
                    r5.f125616x = r3
                    java.lang.Object r6 = qp1.C30537f.m93614i(r6, r4, r5)
                    if (r6 != r0) goto L3a
                    goto L45
                L3a:
                    r3 = 0
                    r5.f125615w = r3
                    r5.f125616x = r2
                    java.lang.Object r6 = r1.emit(r6, r5)
                    if (r6 != r0) goto L46
                L45:
                    return r0
                L46:
                    l83.a0 r6 = l83.C23454a0.f92919a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: qp1.C30537f.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AbstractC30535d abstractC30535d, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f125613z = abstractC30535d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = C30537f.this.new h(this.f125613z, interfaceC30057d);
            hVar.f125611x = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (or2.AbstractC28190p0.m85321a(1000, r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f125611x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f125610w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r7)
                goto L47
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L30
            L20:
                p505ts.AbstractC34132o.m107864I(r7)
                qp1.e$e r7 = qp1.AbstractC30536e.e.f125563a
                r6.f125611x = r0
                r6.f125610w = r4
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L30
                goto L46
            L30:
                qp1.f$h$a r7 = new qp1.f$h$a
                qp1.f r2 = qp1.C30537f.this
                qp1.d r4 = r6.f125613z
                r5 = 0
                r7.<init>(r0, r2, r4, r5)
                r6.f125611x = r5
                r6.f125610w = r3
                r2 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r7 = or2.AbstractC28190p0.m85321a(r2, r7, r6)
                if (r7 != r1) goto L47
            L46:
                return r1
            L47:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: qp1.C30537f.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: qp1.f$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor$interact$1$6", m100430f = "HormonalSettingsInteractor.kt", m100431l = {63, 63}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lqp1/g$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f125619w;

        /* JADX INFO: renamed from: x */
        int f125620x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f125621y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = C30537f.this.new i(interfaceC30057d);
            iVar.f125621y = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f125621y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f125620x
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L25
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L15
                p505ts.AbstractC34132o.m107864I(r7)
                goto L44
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                java.lang.Object r0 = r6.f125619w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L37
            L25:
                p505ts.AbstractC34132o.m107864I(r7)
                qp1.f r7 = qp1.C30537f.this
                r6.f125621y = r5
                r6.f125619w = r0
                r6.f125620x = r4
                java.lang.Object r7 = qp1.C30537f.m93608c(r7, r6)
                if (r7 != r1) goto L37
                goto L43
            L37:
                r6.f125621y = r5
                r6.f125619w = r5
                r6.f125620x = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L44
            L43:
                return r1
            L44:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: qp1.C30537f.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: qp1.f$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor$interact$1$7", m100430f = "HormonalSettingsInteractor.kt", m100431l = {66, 67}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lqp1/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f125623w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f125624x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC30535d f125626z;

        /* JADX INFO: renamed from: qp1.f$j$a */
        @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor$interact$1$7$1", m100430f = "HormonalSettingsInteractor.kt", m100431l = {68, 68}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ AbstractC30535d f125627E;

            /* JADX INFO: renamed from: w */
            Object f125628w;

            /* JADX INFO: renamed from: x */
            int f125629x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13062m f125630y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C30537f f125631z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC13062m interfaceC13062m, C30537f c30537f, AbstractC30535d abstractC30535d, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f125630y = interfaceC13062m;
                this.f125631z = c30537f;
                this.f125627E = abstractC30535d;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f125630y, this.f125631z, this.f125627E, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
            
                if (r1.emit(r6, r5) == r0) goto L15;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r5.f125629x
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L10
                    p505ts.AbstractC34132o.m107864I(r6)
                    goto L46
                L10:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L18:
                    java.lang.Object r1 = r5.f125628w
                    ec3.m r1 = (ec3.InterfaceC13062m) r1
                    p505ts.AbstractC34132o.m107864I(r6)
                    goto L3a
                L20:
                    p505ts.AbstractC34132o.m107864I(r6)
                    ec3.m r1 = r5.f125630y
                    qp1.f r6 = r5.f125631z
                    qp1.d r4 = r5.f125627E
                    qp1.d$g r4 = (qp1.AbstractC30535d.g) r4
                    java.util.List r4 = r4.m93603a()
                    r5.f125628w = r1
                    r5.f125629x = r3
                    java.lang.Object r6 = qp1.C30537f.m93616k(r6, r4, r5)
                    if (r6 != r0) goto L3a
                    goto L45
                L3a:
                    r3 = 0
                    r5.f125628w = r3
                    r5.f125629x = r2
                    java.lang.Object r6 = r1.emit(r6, r5)
                    if (r6 != r0) goto L46
                L45:
                    return r0
                L46:
                    l83.a0 r6 = l83.C23454a0.f92919a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: qp1.C30537f.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(AbstractC30535d abstractC30535d, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f125626z = abstractC30535d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            j jVar = C30537f.this.new j(this.f125626z, interfaceC30057d);
            jVar.f125624x = obj;
            return jVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (or2.AbstractC28190p0.m85321a(1000, r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f125624x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f125623w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r7)
                goto L47
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L30
            L20:
                p505ts.AbstractC34132o.m107864I(r7)
                qp1.e$e r7 = qp1.AbstractC30536e.e.f125563a
                r6.f125624x = r0
                r6.f125623w = r4
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L30
                goto L46
            L30:
                qp1.f$j$a r7 = new qp1.f$j$a
                qp1.f r2 = qp1.C30537f.this
                qp1.d r4 = r6.f125626z
                r5 = 0
                r7.<init>(r0, r2, r4, r5)
                r6.f125624x = r5
                r6.f125623w = r3
                r2 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r7 = or2.AbstractC28190p0.m85321a(r2, r7, r6)
                if (r7 != r1) goto L47
            L46:
                return r1
            L47:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: qp1.C30537f.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: qp1.f$k */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor$interact$2", m100430f = "HormonalSettingsInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lqp1/e;", "previousState", "", "currentAction", "<anonymous>", "(Lqp1/e;Ljava/lang/Object;)Lqp1/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f125632w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f125633x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f125634y;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC30536e abstractC30536e, Object obj, InterfaceC30057d<? super AbstractC30536e> interfaceC30057d) {
            k kVar = new k(interfaceC30057d);
            kVar.f125633x = abstractC30536e;
            kVar.f125634y = obj;
            return kVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC30536e abstractC30536e = (AbstractC30536e) this.f125633x;
            Object obj2 = this.f125634y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f125632w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (obj2 instanceof AbstractC30538g.a) {
                AbstractC22676k.m65748h(abstractC30536e, "null cannot be cast to non-null type com.whoop.hormonalinsights.settings.domain.HormonalSettingsDomainResult.Success");
                return AbstractC30536e.f.m93604b((AbstractC30536e.f) abstractC30536e, null, false, 1, null);
            }
            AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type com.whoop.hormonalinsights.settings.domain.HormonalSettingsDomainResult");
            return (AbstractC30536e) obj2;
        }
    }

    /* JADX INFO: renamed from: qp1.f$l */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor", m100430f = "HormonalSettingsInteractor.kt", m100431l = {80}, m100432m = "loadData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f125635w;

        /* JADX INFO: renamed from: y */
        int f125637y;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f125635w = obj;
            this.f125637y |= Integer.MIN_VALUE;
            return C30537f.this.m93618m(this);
        }
    }

    /* JADX INFO: renamed from: qp1.f$m */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor$loadData$response$1", m100430f = "HormonalSettingsInteractor.kt", m100431l = {81}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f125638w;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C30537f.this.new m(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f125638w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HormonalInsightsApi hormonalInsightsApi = C30537f.this.api;
            this.f125638w = 1;
            Object hormonalSettings = hormonalInsightsApi.getHormonalSettings(this);
            return hormonalSettings == enumC31071a ? enumC31071a : hormonalSettings;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super HormonalInsightsSettingsResponse> interfaceC30057d) {
            return ((m) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: qp1.f$n */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor", m100430f = "HormonalSettingsInteractor.kt", m100431l = {106, 110}, m100432m = "turnOffHormonalInsights", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f125640w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f125641x;

        /* JADX INFO: renamed from: z */
        int f125643z;

        public n(InterfaceC30057d<? super n> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f125641x = obj;
            this.f125643z |= Integer.MIN_VALUE;
            return C30537f.this.m93619n(null, this);
        }
    }

    /* JADX INFO: renamed from: qp1.f$o */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor$turnOffHormonalInsights$response$1", m100430f = "HormonalSettingsInteractor.kt", m100431l = {107}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f125644w;

        public o(InterfaceC30057d<? super o> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C30537f.this.new o(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f125644w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HormonalInsightsApi hormonalInsightsApi = C30537f.this.api;
            this.f125644w = 1;
            Object objEndContraception = hormonalInsightsApi.endContraception(this);
            return objEndContraception == enumC31071a ? enumC31071a : objEndContraception;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((o) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: qp1.f$p */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor$turnOffHormonalInsights$response$2", m100430f = "HormonalSettingsInteractor.kt", m100431l = {111}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class p extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f125646w;

        public p(InterfaceC30057d<? super p> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C30537f.this.new p(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f125646w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HormonalInsightsApi hormonalInsightsApi = C30537f.this.api;
            this.f125646w = 1;
            Object obj2 = hormonalInsightsApi.togglePregnancyCoachingOff(this);
            return obj2 == enumC31071a ? enumC31071a : obj2;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((p) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: qp1.f$q */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor", m100430f = "HormonalSettingsInteractor.kt", m100431l = {124}, m100432m = "updateContraceptionStatus", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f125648E;

        /* JADX INFO: renamed from: w */
        Object f125649w;

        /* JADX INFO: renamed from: x */
        Object f125650x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f125651y;

        public q(InterfaceC30057d<? super q> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f125651y = obj;
            this.f125648E |= Integer.MIN_VALUE;
            return C30537f.this.m93620o(null, this);
        }
    }

    /* JADX INFO: renamed from: qp1.f$r */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor$updateContraceptionStatus$response$1", m100430f = "HormonalSettingsInteractor.kt", m100431l = {125}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class r extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f125653w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ContraceptionType f125655y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ContraceptionType contraceptionType, InterfaceC30057d<? super r> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f125655y = contraceptionType;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C30537f.this.new r(this.f125655y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f125653w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HormonalInsightsApi hormonalInsightsApi = C30537f.this.api;
            HormonalSettingsRequest hormonalSettingsRequest = new HormonalSettingsRequest(this.f125655y);
            this.f125653w = 1;
            Object objUpdateSettings = hormonalInsightsApi.updateSettings(hormonalSettingsRequest, this);
            return objUpdateSettings == enumC31071a ? enumC31071a : objUpdateSettings;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((r) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: qp1.f$s */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor", m100430f = "HormonalSettingsInteractor.kt", m100431l = {135}, m100432m = "updateCycleTrendsOverlay", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        boolean f125656w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f125657x;

        /* JADX INFO: renamed from: z */
        int f125659z;

        public s(InterfaceC30057d<? super s> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f125657x = obj;
            this.f125659z |= Integer.MIN_VALUE;
            return C30537f.this.m93621p(false, this);
        }
    }

    /* JADX INFO: renamed from: qp1.f$t */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor$updateCycleTrendsOverlay$response$1", m100430f = "HormonalSettingsInteractor.kt", m100431l = {136}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class t extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f125660w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f125662y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(boolean z4, InterfaceC30057d<? super t> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f125662y = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C30537f.this.new t(this.f125662y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f125660w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HormonalInsightsApi hormonalInsightsApi = C30537f.this.api;
            ToggleCycleTrendsOverlayRequest toggleCycleTrendsOverlayRequest = new ToggleCycleTrendsOverlayRequest(this.f125662y);
            this.f125660w = 1;
            Object obj2 = hormonalInsightsApi.toggleCycleTrendsOverlay(toggleCycleTrendsOverlayRequest, this);
            return obj2 == enumC31071a ? enumC31071a : obj2;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((t) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: qp1.f$u */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor", m100430f = "HormonalSettingsInteractor.kt", m100431l = {94}, m100432m = "updateDueDate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f125663w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f125664x;

        /* JADX INFO: renamed from: z */
        int f125666z;

        public u(InterfaceC30057d<? super u> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f125664x = obj;
            this.f125666z |= Integer.MIN_VALUE;
            return C30537f.this.m93622q(null, this);
        }
    }

    /* JADX INFO: renamed from: qp1.f$v */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor$updateDueDate$response$1", m100430f = "HormonalSettingsInteractor.kt", m100431l = {95}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class v extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f125667w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f125669y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str, InterfaceC30057d<? super v> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f125669y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C30537f.this.new v(this.f125669y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f125667w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                HormonalInsightsApi hormonalInsightsApi = C30537f.this.api;
                EnablePregnancyCoachingBody enablePregnancyCoachingBody = new EnablePregnancyCoachingBody(this.f125669y);
                this.f125667w = 1;
                if (hormonalInsightsApi.updateDueDate(enablePregnancyCoachingBody, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((v) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: qp1.f$w */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor", m100430f = "HormonalSettingsInteractor.kt", m100431l = {146}, m100432m = "updateGoals", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f125670w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f125671x;

        /* JADX INFO: renamed from: z */
        int f125673z;

        public w(InterfaceC30057d<? super w> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f125671x = obj;
            this.f125673z |= Integer.MIN_VALUE;
            return C30537f.this.m93623r(null, this);
        }
    }

    /* JADX INFO: renamed from: qp1.f$x */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor$updateGoals$response$1", m100430f = "HormonalSettingsInteractor.kt", m100431l = {147}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class x extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f125674w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ List<String> f125676y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(List<String> list, InterfaceC30057d<? super x> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f125676y = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C30537f.this.new x(this.f125676y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f125674w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HormonalInsightsApi hormonalInsightsApi = C30537f.this.api;
            UpdateGoalsRequest updateGoalsRequest = new UpdateGoalsRequest(this.f125676y);
            this.f125674w = 1;
            Object objUpdateGoals = hormonalInsightsApi.updateGoals(updateGoalsRequest, this);
            return objUpdateGoals == enumC31071a ? enumC31071a : objUpdateGoals;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((x) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C30537f(HormonalInsightsApi api, C34660d sharedPreferences, InterfaceC18732d dispatcher, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(sharedPreferences, "sharedPreferences");
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.sharedPreferences = sharedPreferences;
        this.dispatcher = dispatcher;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m93617l(InterfaceC30057d<? super AbstractC30538g.a> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f125572y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f125572y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f125570w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f125572y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC30063j interfaceC30063jMo54465b = this.dispatcher.mo54465b();
            b bVar = new b(null);
            aVar.f125572y = 1;
            if (AbstractC3006f0.m8705K(interfaceC30063jMo54465b, bVar, aVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return AbstractC30538g.a.f125677a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: m */
    public final Object m93618m(InterfaceC30057d<? super AbstractC30536e> interfaceC30057d) {
        l lVar;
        if (interfaceC30057d instanceof l) {
            lVar = (l) interfaceC30057d;
            int i13 = lVar.f125637y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lVar.f125637y = i13 - Integer.MIN_VALUE;
            } else {
                lVar = new l(interfaceC30057d);
            }
        } else {
            lVar = new l(interfaceC30057d);
        }
        l lVar2 = lVar;
        Object objM108729b = lVar2.f125635w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = lVar2.f125637y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            m mVar = new m(null);
            lVar2.f125637y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, mVar, lVar2, 6, null);
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
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC30536e.f((HormonalInsightsSettingsResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), this.sharedPreferences.m109528e(SharedPreferenceConstants.KEY_SHOW_UPSELL_HORMONAL_SETTINGS, true));
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC30536e.a.f125559a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r11 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        if (r11 == r0) goto L25;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m93619n(java.lang.String r10, q83.InterfaceC30057d<? super qp1.AbstractC30536e> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof qp1.C30537f.n
            if (r0 == 0) goto L14
            r0 = r11
            qp1.f$n r0 = (qp1.C30537f.n) r0
            int r1 = r0.f125643z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f125643z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            qp1.f$n r0 = new qp1.f$n
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f125641x
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f125643z
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r10 = r6.f125640w
            java.lang.String r10 = (java.lang.String) r10
            p505ts.AbstractC34132o.m107864I(r11)
            goto L80
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            java.lang.Object r10 = r6.f125640w
            java.lang.String r10 = (java.lang.String) r10
            p505ts.AbstractC34132o.m107864I(r11)
            goto L64
        L40:
            p505ts.AbstractC34132o.m107864I(r11)
            java.lang.String r11 = "MENSTRUATING"
            boolean r10 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r10, r11)
            r11 = 0
            if (r10 == 0) goto L67
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            tr2.n r2 = r9.logger
            qp1.f$o r5 = new qp1.f$o
            r5.<init>(r11)
            r6.f125640w = r11
            r6.f125643z = r3
            r3 = 0
            r4 = 0
            r7 = 6
            r8 = 0
            java.lang.Object r11 = u02.InterfaceC34385a.Companion.m108729b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 != r0) goto L64
            goto L7f
        L64:
            u02.a r11 = (u02.InterfaceC34385a) r11
            goto L82
        L67:
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            r10 = r2
            tr2.n r2 = r9.logger
            qp1.f$p r5 = new qp1.f$p
            r5.<init>(r11)
            r6.f125640w = r11
            r6.f125643z = r10
            r3 = 0
            r4 = 0
            r7 = 6
            r8 = 0
            java.lang.Object r11 = u02.InterfaceC34385a.Companion.m108729b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 != r0) goto L80
        L7f:
            return r0
        L80:
            u02.a r11 = (u02.InterfaceC34385a) r11
        L82:
            boolean r10 = r11 instanceof u02.InterfaceC34385a.c
            if (r10 == 0) goto L89
            qp1.e$d r10 = qp1.AbstractC30536e.d.f125562a
            return r10
        L89:
            boolean r10 = r11 instanceof u02.InterfaceC34385a.b
            if (r10 == 0) goto L90
            qp1.e$c r10 = qp1.AbstractC30536e.c.f125561a
            return r10
        L90:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: qp1.C30537f.m93619n(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: o */
    public final Object m93620o(String str, InterfaceC30057d<? super AbstractC30536e> interfaceC30057d) {
        q qVar;
        ContraceptionType contraceptionType;
        if (interfaceC30057d instanceof q) {
            qVar = (q) interfaceC30057d;
            int i13 = qVar.f125648E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                qVar.f125648E = i13 - Integer.MIN_VALUE;
            } else {
                qVar = new q(interfaceC30057d);
            }
        } else {
            qVar = new q(interfaceC30057d);
        }
        q qVar2 = qVar;
        Object objM108729b = qVar2.f125651y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = qVar2.f125648E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            ContraceptionType[] contraceptionTypeArrValues = ContraceptionType.values();
            int length = contraceptionTypeArrValues.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length) {
                    contraceptionType = null;
                    break;
                }
                contraceptionType = contraceptionTypeArrValues[i15];
                if (AbstractC22676k.m65745e(contraceptionType.name(), str)) {
                    break;
                }
                i15++;
            }
            if (contraceptionType == null) {
                return AbstractC30536e.a.f125559a;
            }
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            r rVar = new r(contraceptionType, null);
            qVar2.f125649w = null;
            qVar2.f125650x = null;
            qVar2.f125648E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, rVar, qVar2, 6, null);
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
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return AbstractC30536e.d.f125562a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC30536e.c.f125561a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: p */
    public final Object m93621p(boolean z4, InterfaceC30057d<? super AbstractC30536e> interfaceC30057d) {
        s sVar;
        if (interfaceC30057d instanceof s) {
            sVar = (s) interfaceC30057d;
            int i13 = sVar.f125659z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                sVar.f125659z = i13 - Integer.MIN_VALUE;
            } else {
                sVar = new s(interfaceC30057d);
            }
        } else {
            sVar = new s(interfaceC30057d);
        }
        s sVar2 = sVar;
        Object objM108729b = sVar2.f125657x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = sVar2.f125659z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            t tVar = new t(z4, null);
            sVar2.f125656w = z4;
            sVar2.f125659z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, tVar, sVar2, 6, null);
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
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return AbstractC30536e.d.f125562a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC30536e.c.f125561a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: q */
    public final Object m93622q(String str, InterfaceC30057d<? super AbstractC30536e> interfaceC30057d) {
        u uVar;
        if (interfaceC30057d instanceof u) {
            uVar = (u) interfaceC30057d;
            int i13 = uVar.f125666z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                uVar.f125666z = i13 - Integer.MIN_VALUE;
            } else {
                uVar = new u(interfaceC30057d);
            }
        } else {
            uVar = new u(interfaceC30057d);
        }
        u uVar2 = uVar;
        Object objM108729b = uVar2.f125664x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = uVar2.f125666z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            v vVar = new v(str, null);
            uVar2.f125663w = null;
            uVar2.f125666z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, vVar, uVar2, 6, null);
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
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return AbstractC30536e.d.f125562a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC30536e.c.f125561a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: r */
    public final Object m93623r(List<String> list, InterfaceC30057d<? super AbstractC30536e> interfaceC30057d) {
        w wVar;
        if (interfaceC30057d instanceof w) {
            wVar = (w) interfaceC30057d;
            int i13 = wVar.f125673z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wVar.f125673z = i13 - Integer.MIN_VALUE;
            } else {
                wVar = new w(interfaceC30057d);
            }
        } else {
            wVar = new w(interfaceC30057d);
        }
        w wVar2 = wVar;
        Object objM108729b = wVar2.f125671x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = wVar2.f125673z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            x xVar = new x(list, null);
            wVar2.f125670w = null;
            wVar2.f125673z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, xVar, wVar2, 6, null);
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
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return AbstractC30536e.d.f125562a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC30536e.c.f125561a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(AbstractC30536e.b.f125560a, AbstractC13091v.m36590P(upstream, new c(null, this)), new k(null));
    }

    public /* synthetic */ C30537f(HormonalInsightsApi hormonalInsightsApi, C34660d c34660d, InterfaceC18732d interfaceC18732d, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(hormonalInsightsApi, c34660d, interfaceC18732d, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("HormonalSettingsInteractor") : interfaceC34116n);
    }
}
