package b32;

import a32.C0346a;
import a32.C0348c;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.payments.stripebottomsheettile.domain.StripeBottomSheetTileApi;
import com.whoop.payments.stripebottomsheettile.domain.models.SetupIntentResponse;
import com.whoop.payments.stripebottomsheettile.domain.models.UpdateDefaultPaymentMethodRequest;
import dc3.InterfaceC11927l;
import e32.AbstractC12614a;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import h20.AbstractC16632b4;
import h20.C16626a4;
import h20.C16769y3;
import h20.C16775z3;
import io.getstream.chat.android.models.MessageType;
import iy1.InterfaceC21030c;
import jy1.C22047a;
import l83.C23454a0;
import live.hms.video.media.tracks.HMSTrackSource;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: b32.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ*\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, m65681d2 = {"Lb32/d;", "Lod1/g;", "Lb32/b;", "Lb32/c;", "Lcom/whoop/payments/stripebottomsheettile/domain/StripeBottomSheetTileApi;", "api", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Liy1/c;", "metricWriter", "La32/a;", "analyticsHelper", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/payments/stripebottomsheettile/domain/StripeBottomSheetTileApi;Lcom/whoop/data/repositories/FeatureFlagChecker;Liy1/c;La32/a;Ltr2/n;)V", "state", "Lh20/b4;", "result", "", HMSTrackSource.SCREEN, "j", "(Lb32/c;Lh20/b4;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "paymentMethodId", "postalCode", "screenName", "k", "(Lb32/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "Ly00/o4;", "paymentMethod", "Lh20/e;", "i", "(Ly00/o4;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/payments/stripebottomsheettile/domain/StripeBottomSheetTileApi;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "c", "Liy1/c;", "d", "La32/a;", "e", "Ltr2/n;", "Ldc3/l;", "f", "Ldc3/l;", "internalActions", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C2678d implements InterfaceC27844g<AbstractC2676b, C2677c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final StripeBottomSheetTileApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C0346a analyticsHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC11927l internalActions;

    /* JADX INFO: renamed from: b32.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.stripebottomsheettile.domain.StripeBottomSheetTileInteractor", m100430f = "StripeBottomSheetTileInteractor.kt", m100431l = {102, 106, 109, 114, 120, 132, 143}, m100432m = "createSetupIntent", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f10496E;

        /* JADX INFO: renamed from: G */
        int f10498G;

        /* JADX INFO: renamed from: w */
        Object f10499w;

        /* JADX INFO: renamed from: x */
        Object f10500x;

        /* JADX INFO: renamed from: y */
        Object f10501y;

        /* JADX INFO: renamed from: z */
        Object f10502z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f10496E = obj;
            this.f10498G |= Integer.MIN_VALUE;
            return C2678d.this.m7570i(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: b32.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.stripebottomsheettile.domain.StripeBottomSheetTileInteractor$createSetupIntent$setupResult$1", m100430f = "StripeBottomSheetTileInteractor.kt", m100431l = {107}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/payments/stripebottomsheettile/domain/models/SetupIntentResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f10503w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C2678d.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f10503w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            StripeBottomSheetTileApi stripeBottomSheetTileApi = C2678d.this.api;
            this.f10503w = 1;
            Object objCreateSetupIntent = stripeBottomSheetTileApi.createSetupIntent(this);
            return objCreateSetupIntent == enumC31071a ? enumC31071a : objCreateSetupIntent;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super SetupIntentResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: b32.d$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.stripebottomsheettile.domain.StripeBottomSheetTileInteractor$interact$1", m100430f = "StripeBottomSheetTileInteractor.kt", m100431l = {53, 62, 74}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lb32/c;", "state", "Lb32/b;", "action", "<anonymous>", "(Lb32/c;Lb32/b;)Lb32/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f10505E;

        /* JADX INFO: renamed from: w */
        Object f10507w;

        /* JADX INFO: renamed from: x */
        Object f10508x;

        /* JADX INFO: renamed from: y */
        int f10509y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f10510z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C2677c c2677c, AbstractC2676b abstractC2676b, InterfaceC30057d<? super C2677c> interfaceC30057d) {
            c cVar = C2678d.this.new c(interfaceC30057d);
            cVar.f10510z = c2677c;
            cVar.f10505E = abstractC2676b;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00f0, code lost:
        
            if (r12 == r7) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x012a, code lost:
        
            if (r4.mo32219t(r5, r11) == r7) goto L50;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 349
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: b32.C2678d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: b32.d$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.stripebottomsheettile.domain.StripeBottomSheetTileInteractor", m100430f = "StripeBottomSheetTileInteractor.kt", m100431l = {187}, m100432m = "processPaymentResult", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f10511E;

        /* JADX INFO: renamed from: F */
        Object f10512F;

        /* JADX INFO: renamed from: G */
        Object f10513G;

        /* JADX INFO: renamed from: H */
        Object f10514H;

        /* JADX INFO: renamed from: I */
        int f10515I;

        /* JADX INFO: renamed from: J */
        /* synthetic */ Object f10516J;

        /* JADX INFO: renamed from: L */
        int f10518L;

        /* JADX INFO: renamed from: w */
        Object f10519w;

        /* JADX INFO: renamed from: x */
        Object f10520x;

        /* JADX INFO: renamed from: y */
        Object f10521y;

        /* JADX INFO: renamed from: z */
        Object f10522z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f10516J = obj;
            this.f10518L |= Integer.MIN_VALUE;
            return C2678d.this.m7568j(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: b32.d$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.stripebottomsheettile.domain.StripeBottomSheetTileInteractor", m100430f = "StripeBottomSheetTileInteractor.kt", m100431l = {235, 236, 248, 259, 273}, m100432m = "setDefaultPaymentMethod", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f10523E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f10524F;

        /* JADX INFO: renamed from: H */
        int f10526H;

        /* JADX INFO: renamed from: w */
        Object f10527w;

        /* JADX INFO: renamed from: x */
        Object f10528x;

        /* JADX INFO: renamed from: y */
        Object f10529y;

        /* JADX INFO: renamed from: z */
        Object f10530z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f10524F = obj;
            this.f10526H |= Integer.MIN_VALUE;
            return C2678d.this.m7569k(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: b32.d$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.stripebottomsheettile.domain.StripeBottomSheetTileInteractor$setDefaultPaymentMethod$result$1", m100430f = "StripeBottomSheetTileInteractor.kt", m100431l = {237}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f10531E;

        /* JADX INFO: renamed from: w */
        int f10532w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f10534y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f10535z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, String str2, String str3, InterfaceC30057d<? super f> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f10534y = str;
            this.f10535z = str2;
            this.f10531E = str3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C2678d.this.new f(this.f10534y, this.f10535z, this.f10531E, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f10532w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            StripeBottomSheetTileApi stripeBottomSheetTileApi = C2678d.this.api;
            UpdateDefaultPaymentMethodRequest updateDefaultPaymentMethodRequest = new UpdateDefaultPaymentMethodRequest(this.f10534y, this.f10535z, this.f10531E);
            this.f10532w = 1;
            Object objUpdateDefaultPaymentMethod = stripeBottomSheetTileApi.updateDefaultPaymentMethod(updateDefaultPaymentMethodRequest, this);
            return objUpdateDefaultPaymentMethod == enumC31071a ? enumC31071a : objUpdateDefaultPaymentMethod;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C2678d(StripeBottomSheetTileApi api, FeatureFlagChecker featureFlagChecker, InterfaceC21030c metricWriter, C0346a analyticsHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.featureFlagChecker = featureFlagChecker;
        this.metricWriter = metricWriter;
        this.analyticsHelper = analyticsHelper;
        this.logger = logger;
        this.internalActions = AbstractC30060g.m92111d(Integer.MAX_VALUE, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: j */
    public final Object m7568j(C2677c c2677c, AbstractC16632b4 abstractC16632b4, String str, InterfaceC30057d<? super C2677c> interfaceC30057d) {
        d dVar;
        Long l7;
        String str2;
        String simpleName;
        C2677c c2677c2;
        String str3;
        C2675a c2675a;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f10518L;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f10518L = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object obj = dVar2.f10516J;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f10518L;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Long confirmAttemptTimestamp = c2677c.getConfirmAttemptTimestamp();
            if (confirmAttemptTimestamp != null) {
                l7 = new Long(System.currentTimeMillis() - confirmAttemptTimestamp.longValue());
            } else {
                l7 = null;
            }
            boolean z4 = abstractC16632b4 instanceof C16775z3;
            if (z4) {
                str2 = "succeeded";
            } else if (abstractC16632b4 instanceof C16769y3) {
                str2 = "canceled";
            } else {
                if (!(abstractC16632b4 instanceof C16626a4)) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = MessageType.FAILED;
            }
            boolean z13 = abstractC16632b4 instanceof C16626a4;
            if (z13) {
                simpleName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(((C16626a4) abstractC16632b4).m47223b().getClass()).getSimpleName();
            } else {
                simpleName = null;
            }
            InterfaceC21030c interfaceC21030c = this.metricWriter;
            Long l12 = l7;
            C0348c c0348c = C0348c.f1219a;
            interfaceC21030c.mo58701b(c0348c.m905e(str, str2, simpleName));
            if (l12 != null) {
                this.metricWriter.mo58701b(c0348c.m906f(str, str2, l12.longValue(), simpleName));
            }
            if (!z4) {
                if (abstractC16632b4 instanceof C16769y3) {
                    this.analyticsHelper.m889b();
                    return C2677c.m7554b(c2677c, AbstractC2679e.a.f10536a, null, null, null, null, null, 56, null);
                }
                if (!z13) {
                    throw new NoWhenBranchMatchedException();
                }
                this.analyticsHelper.m891d();
                return C2677c.m7554b(c2677c, new AbstractC2679e.c(((C16626a4) abstractC16632b4).m47223b()), null, null, null, null, null, 56, null);
            }
            C2677c c2677cM7554b = C2677c.m7554b(c2677c, null, null, null, null, null, null, 57, null);
            int i15 = (!AbstractC22676k.m65745e(str, "PAYMENT_V2") || this.featureFlagChecker.isFeatureEnabled("stripe-tile-owns-set-default-android")) ? 1 : 0;
            if (i15 == 0) {
                return C2677c.m7554b(c2677cM7554b, new AbstractC2679e.b(c2677c.getPendingPaymentMethodInfo(), str), null, null, null, null, null, 62, null);
            }
            C2675a pendingPaymentMethodInfo = c2677c.getPendingPaymentMethodInfo();
            if (pendingPaymentMethodInfo == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            InterfaceC11927l interfaceC11927l = this.internalActions;
            AbstractC2676b.g gVar = new AbstractC2676b.g(pendingPaymentMethodInfo.getPaymentMethodId(), pendingPaymentMethodInfo.getPostalCode(), str);
            dVar2.f10519w = null;
            dVar2.f10520x = null;
            dVar2.f10521y = str;
            dVar2.f10522z = null;
            dVar2.f10511E = null;
            dVar2.f10512F = null;
            dVar2.f10513G = c2677cM7554b;
            dVar2.f10514H = pendingPaymentMethodInfo;
            dVar2.f10515I = i15;
            dVar2.f10518L = 1;
            if (interfaceC11927l.mo32219t(gVar, dVar2) == enumC31071a) {
                return enumC31071a;
            }
            c2677c2 = c2677cM7554b;
            str3 = str;
            c2675a = pendingPaymentMethodInfo;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C2675a c2675a2 = (C2675a) dVar2.f10514H;
            C2677c c2677c3 = (C2677c) dVar2.f10513G;
            String str4 = (String) dVar2.f10521y;
            AbstractC34132o.m107864I(obj);
            c2675a = c2675a2;
            c2677c2 = c2677c3;
            str3 = str4;
        }
        return C2677c.m7554b(c2677c2, AbstractC2679e.h.f10544a, null, null, c2675a, str3, AbstractC12614a.b.f43066a, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x0121  */
    /* JADX WARN: Code duplicated, block: B:38:0x0142  */
    /* JADX WARN: Code duplicated, block: B:41:0x0157  */
    /* JADX WARN: Code duplicated, block: B:43:0x015b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0178  */
    /* JADX WARN: Code duplicated, block: B:49:0x0199  */
    /* JADX WARN: Code duplicated, block: B:51:0x019d  */
    /* JADX WARN: Code duplicated, block: B:54:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:57:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: k */
    public final Object m7569k(C2677c c2677c, String str, String str2, String str3, InterfaceC30057d<? super C2677c> interfaceC30057d) {
        e eVar;
        String str4;
        String str5;
        String str6;
        C2677c c2677c2;
        String str7;
        C2677c c2677c3;
        Integer num;
        Object objM108729b;
        InterfaceC34385a interfaceC34385a;
        InterfaceC21030c interfaceC21030c;
        C22047a c22047aM903c;
        InterfaceC34385a interfaceC34385a2;
        InterfaceC21030c interfaceC21030c2;
        C22047a c22047aM903c2;
        InterfaceC34385a interfaceC34385a3;
        InterfaceC21030c interfaceC21030c3;
        C22047a c22047aM904d;
        String str8;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f10526H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f10526H = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object obj = eVar2.f10524F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar2.f10526H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            this.analyticsHelper.m888a();
            InterfaceC21030c interfaceC21030c4 = this.metricWriter;
            C22047a c22047aM907g = C0348c.f1219a.m907g(str3);
            eVar2.f10527w = c2677c;
            eVar2.f10528x = str;
            eVar2.f10529y = str2;
            eVar2.f10530z = str3;
            eVar2.f10526H = 1;
            if (interfaceC21030c4.mo58700a(c22047aM907g, eVar2) != enumC31071a) {
                str4 = str;
                str5 = str2;
                str6 = str3;
                c2677c2 = c2677c;
            }
            return enumC31071a;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 == 3) {
                    str8 = (String) eVar2.f10528x;
                    c2677c3 = (C2677c) eVar2.f10527w;
                    AbstractC34132o.m107864I(obj);
                    return C2677c.m7554b(c2677c3, new AbstractC2679e.g(str8), null, null, null, null, AbstractC12614a.c.f43067a, 6, null);
                }
                if (i14 == 4) {
                    interfaceC34385a3 = (InterfaceC34385a) eVar2.f10523E;
                    c2677c3 = (C2677c) eVar2.f10527w;
                    AbstractC34132o.m107864I(obj);
                    return C2677c.m7554b(c2677c3, new AbstractC2679e.f(new RuntimeException(((InterfaceC34385a.b.C42432b) interfaceC34385a3).getErrorMessage())), null, null, null, null, AbstractC12614a.a.f43065a, 30, null);
                }
                if (i14 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC34385a2 = (InterfaceC34385a) eVar2.f10523E;
                c2677c3 = (C2677c) eVar2.f10527w;
                AbstractC34132o.m107864I(obj);
                return C2677c.m7554b(c2677c3, new AbstractC2679e.f(new RuntimeException(((InterfaceC34385a.b.a) interfaceC34385a2).getErrorMessage())), null, null, null, null, AbstractC12614a.a.f43065a, 30, null);
            }
            str7 = (String) eVar2.f10530z;
            String str9 = (String) eVar2.f10528x;
            C2677c c2677c4 = (C2677c) eVar2.f10527w;
            AbstractC34132o.m107864I(obj);
            objM108729b = obj;
            str4 = str9;
            c2677c3 = c2677c4;
            num = null;
            interfaceC34385a = (InterfaceC34385a) objM108729b;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                this.analyticsHelper.m892e();
                interfaceC21030c3 = this.metricWriter;
                c22047aM904d = C0348c.f1219a.m904d(str7, "set_default");
                eVar2.f10527w = c2677c3;
                eVar2.f10528x = str4;
                eVar2.f10529y = num;
                eVar2.f10530z = num;
                eVar2.f10523E = num;
                eVar2.f10526H = 3;
                if (interfaceC21030c3.mo58700a(c22047aM904d, eVar2) != enumC31071a) {
                    str8 = str4;
                    return C2677c.m7554b(c2677c3, new AbstractC2679e.g(str8), null, null, null, null, AbstractC12614a.c.f43067a, 6, null);
                }
            } else if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
                interfaceC21030c2 = this.metricWriter;
                c22047aM903c2 = C0348c.f1219a.m903c(str7, "set_default", "network", num);
                eVar2.f10527w = c2677c3;
                eVar2.f10528x = num;
                eVar2.f10529y = num;
                eVar2.f10530z = num;
                eVar2.f10523E = interfaceC34385a;
                eVar2.f10526H = 4;
                if (interfaceC21030c2.mo58700a(c22047aM903c2, eVar2) != enumC31071a) {
                    interfaceC34385a3 = interfaceC34385a;
                    return C2677c.m7554b(c2677c3, new AbstractC2679e.f(new RuntimeException(((InterfaceC34385a.b.C42432b) interfaceC34385a3).getErrorMessage())), null, null, null, null, AbstractC12614a.a.f43065a, 30, null);
                }
            } else {
                if (interfaceC34385a instanceof InterfaceC34385a.b.a) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC21030c = this.metricWriter;
                c22047aM903c = C0348c.f1219a.m903c(str7, "set_default", "http", new Integer(((InterfaceC34385a.b.a) interfaceC34385a).getErrorCode()));
                eVar2.f10527w = c2677c3;
                eVar2.f10528x = num;
                eVar2.f10529y = num;
                eVar2.f10530z = num;
                eVar2.f10523E = interfaceC34385a;
                eVar2.f10526H = 5;
                if (interfaceC21030c.mo58700a(c22047aM903c, eVar2) != enumC31071a) {
                    interfaceC34385a2 = interfaceC34385a;
                    return C2677c.m7554b(c2677c3, new AbstractC2679e.f(new RuntimeException(((InterfaceC34385a.b.a) interfaceC34385a2).getErrorMessage())), null, null, null, null, AbstractC12614a.a.f43065a, 30, null);
                }
            }
            return enumC31071a;
        }
        String str10 = (String) eVar2.f10530z;
        str5 = (String) eVar2.f10529y;
        String str11 = (String) eVar2.f10528x;
        C2677c c2677c5 = (C2677c) eVar2.f10527w;
        AbstractC34132o.m107864I(obj);
        str4 = str11;
        c2677c2 = c2677c5;
        str6 = str10;
        InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
        InterfaceC34116n interfaceC34116n = this.logger;
        f fVar = new f(str4, str5, str6, null);
        str7 = str6;
        eVar2.f10527w = c2677c2;
        eVar2.f10528x = str4;
        eVar2.f10529y = null;
        eVar2.f10530z = str7;
        eVar2.f10526H = 2;
        c2677c3 = c2677c2;
        num = null;
        objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "updateDefaultPaymentMethod failed", fVar, eVar2, 2, null);
        if (objM108729b != enumC31071a) {
            interfaceC34385a = (InterfaceC34385a) objM108729b;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                this.analyticsHelper.m892e();
                interfaceC21030c3 = this.metricWriter;
                c22047aM904d = C0348c.f1219a.m904d(str7, "set_default");
                eVar2.f10527w = c2677c3;
                eVar2.f10528x = str4;
                eVar2.f10529y = num;
                eVar2.f10530z = num;
                eVar2.f10523E = num;
                eVar2.f10526H = 3;
                if (interfaceC21030c3.mo58700a(c22047aM904d, eVar2) != enumC31071a) {
                    str8 = str4;
                    return C2677c.m7554b(c2677c3, new AbstractC2679e.g(str8), null, null, null, null, AbstractC12614a.c.f43067a, 6, null);
                }
            } else if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
                interfaceC21030c2 = this.metricWriter;
                c22047aM903c2 = C0348c.f1219a.m903c(str7, "set_default", "network", num);
                eVar2.f10527w = c2677c3;
                eVar2.f10528x = num;
                eVar2.f10529y = num;
                eVar2.f10530z = num;
                eVar2.f10523E = interfaceC34385a;
                eVar2.f10526H = 4;
                if (interfaceC21030c2.mo58700a(c22047aM903c2, eVar2) != enumC31071a) {
                    interfaceC34385a3 = interfaceC34385a;
                    return C2677c.m7554b(c2677c3, new AbstractC2679e.f(new RuntimeException(((InterfaceC34385a.b.C42432b) interfaceC34385a3).getErrorMessage())), null, null, null, null, AbstractC12614a.a.f43065a, 30, null);
                }
            } else {
                if (interfaceC34385a instanceof InterfaceC34385a.b.a) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC21030c = this.metricWriter;
                c22047aM903c = C0348c.f1219a.m903c(str7, "set_default", "http", new Integer(((InterfaceC34385a.b.a) interfaceC34385a).getErrorCode()));
                eVar2.f10527w = c2677c3;
                eVar2.f10528x = num;
                eVar2.f10529y = num;
                eVar2.f10530z = num;
                eVar2.f10523E = interfaceC34385a;
                eVar2.f10526H = 5;
                if (interfaceC21030c.mo58700a(c22047aM903c, eVar2) != enumC31071a) {
                    interfaceC34385a2 = interfaceC34385a;
                    return C2677c.m7554b(c2677c3, new AbstractC2679e.f(new RuntimeException(((InterfaceC34385a.b.a) interfaceC34385a2).getErrorMessage())), null, null, null, null, AbstractC12614a.a.f43065a, 30, null);
                }
            }
        }
        return enumC31071a;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0139  */
    /* JADX WARN: Code duplicated, block: B:47:0x015c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0166  */
    /* JADX WARN: Code duplicated, block: B:53:0x0181  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:61:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:73:0x0227  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a4, code lost:
    
        if (r15.mo32219t(r1, r6) == r0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d6, code lost:
    
        if (r14.mo58700a(r13, r6) == r0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0213, code lost:
    
        if (r14.mo58700a(r13, r6) == r0) goto L70;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7570i(y00.C38915o4 r12, java.lang.String r13, java.lang.String r14, q83.InterfaceC30057d<? super h20.InterfaceC16645e> r15) {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b32.C2678d.m7570i(y00.o4, java.lang.String, java.lang.String, q83.d):java.lang.Object");
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36612v(new C13060l1(new C2677c(null, null, null, null, null, null, 63, null), AbstractC13091v.m36584J(upstream, AbstractC13091v.m36585K(this.internalActions)), new c(null)), 1);
    }

    public /* synthetic */ C2678d(StripeBottomSheetTileApi stripeBottomSheetTileApi, FeatureFlagChecker featureFlagChecker, InterfaceC21030c interfaceC21030c, C0346a c0346a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripeBottomSheetTileApi, featureFlagChecker, interfaceC21030c, c0346a, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("StripeBottomSheetTileInteractor") : interfaceC34116n);
    }
}
