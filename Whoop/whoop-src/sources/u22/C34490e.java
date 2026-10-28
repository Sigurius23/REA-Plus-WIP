package u22;

import a32.C0346a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.payments.feature.paymentmethodmanagement.domain.GetPaymentMethodManagementRequest;
import com.whoop.payments.feature.paymentmethodmanagement.domain.models.PaymentMethodManagementDismissModalContentModel;
import com.whoop.payments.feature.paymentmethodmanagement.domain.models.PaymentMethodManagementDismissModalModel;
import com.whoop.payments.feature.paymentmethodmanagement.domain.models.PaymentMethodManagementLeftButtonModel;
import com.whoop.payments.feature.paymentmethodmanagement.domain.models.PaymentMethodManagementModels;
import com.whoop.payments.feature.paymentmethodmanagement.domain.models.PaymentMethodManagementNavigationBarModel;
import com.whoop.payments.stripebottomsheettile.domain.StripeBottomSheetTileApi;
import com.whoop.payments.stripebottomsheettile.domain.models.UpdateDefaultPaymentMethodRequest;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import pm0.AbstractC29355b;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import qw2.AbstractC30694b;
import qw2.C30695c;
import qw2.C30698f;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;
import x22.InterfaceC37862a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: u22.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0017\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\b\b\u0002\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u001d\u0010,\u001a\u00020\u00032\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002¢\u0006\u0004\b,\u0010-J#\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006A"}, m65681d2 = {"Lu22/e;", "Lod1/g;", "Lu22/c;", "Lu22/d;", "Lnm0/e;", "cachedApiSource", "Lqw2/c;", "actionInteractor", "Liy1/c;", "metricWriter", "Lcom/whoop/payments/stripebottomsheettile/domain/StripeBottomSheetTileApi;", "api", "La32/a;", "analyticsHelper", "Lu22/a;", "onDefaultPaymentMethodSet", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "<init>", "(Lnm0/e;Lqw2/c;Liy1/c;Lcom/whoop/payments/stripebottomsheettile/domain/StripeBottomSheetTileApi;La32/a;Lu22/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V", "previousState", "action", "n", "(Lu22/d;Lu22/c;)Lu22/d;", "Lu22/c$f;", "Lec3/l;", "Lu22/g;", "r", "(Lu22/c$f;)Lec3/l;", "", "paymentMethodId", "postalCode", "screenName", "m", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lec3/l;", "", "manualRefresh", "p", "(Z)Lec3/l;", "Lpm0/a$c;", "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;", "cacheResult", "o", "(Lpm0/a$c;)Lu22/d;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Lqw2/c;", "c", "Liy1/c;", "d", "Lcom/whoop/payments/stripebottomsheettile/domain/StripeBottomSheetTileApi;", "e", "La32/a;", "f", "Lu22/a;", "g", "Lcom/whoop/data/repositories/FeatureFlagChecker;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ltr2/n;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34490e implements InterfaceC27844g<AbstractC34488c, C34489d> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C30695c actionInteractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final StripeBottomSheetTileApi api;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C0346a analyticsHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34486a onDefaultPaymentMethodSet;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: u22.e$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.feature.paymentmethodmanagement.domain.PaymentMethodManagementInteractor$callSetDefaultPaymentMethod$1", m100430f = "PaymentMethodManagementInteractor.kt", m100431l = {151, 152, 155, 167, 170, 171, 174, 177, 178, 181, 184, 185}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lu22/g;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f144896E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f144897F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f144898G;

        /* JADX INFO: renamed from: w */
        Object f144899w;

        /* JADX INFO: renamed from: x */
        int f144900x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f144901y;

        /* JADX INFO: renamed from: u22.e$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.payments.feature.paymentmethodmanagement.domain.PaymentMethodManagementInteractor$callSetDefaultPaymentMethod$1$result$1", m100430f = "PaymentMethodManagementInteractor.kt", m100431l = {156}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42437a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ String f144903E;

            /* JADX INFO: renamed from: w */
            int f144904w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34490e f144905x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f144906y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f144907z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42437a(C34490e c34490e, String str, String str2, String str3, InterfaceC30057d<? super C42437a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f144905x = c34490e;
                this.f144906y = str;
                this.f144907z = str2;
                this.f144903E = str3;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new C42437a(this.f144905x, this.f144906y, this.f144907z, this.f144903E, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f144904w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                StripeBottomSheetTileApi stripeBottomSheetTileApi = this.f144905x.api;
                UpdateDefaultPaymentMethodRequest updateDefaultPaymentMethodRequest = new UpdateDefaultPaymentMethodRequest(this.f144906y, this.f144907z, this.f144903E);
                this.f144904w = 1;
                Object objUpdateDefaultPaymentMethod = stripeBottomSheetTileApi.updateDefaultPaymentMethod(updateDefaultPaymentMethodRequest, this);
                return objUpdateDefaultPaymentMethod == enumC31071a ? enumC31071a : objUpdateDefaultPaymentMethod;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((C42437a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f144896E = str;
            this.f144897F = str2;
            this.f144898G = str3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C34490e.this.new a(this.f144896E, this.f144897F, this.f144898G, interfaceC30057d);
            aVar.f144901y = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:25:0x00cc A[PHI: r9 r13
          0x00cc: PHI (r9v3 u22.e$a) = (r9v2 u22.e$a), (r9v4 u22.e$a) binds: [B:23:0x00c8, B:13:0x005a] A[DONT_GENERATE, DONT_INLINE]
          0x00cc: PHI (r13v11 java.lang.Object) = (r13v10 java.lang.Object), (r13v0 java.lang.Object) binds: [B:23:0x00c8, B:13:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:27:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:30:0x00fa A[PHI: r9
          0x00fa: PHI (r9v5 u22.e$a) = (r9v3 u22.e$a), (r9v6 u22.e$a) binds: [B:28:0x00f6, B:12:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:33:0x010f A[PHI: r9
          0x010f: PHI (r9v7 u22.e$a) = (r9v5 u22.e$a), (r9v8 u22.e$a) binds: [B:31:0x010b, B:11:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:36:0x0125  */
        /* JADX WARN: Code duplicated, block: B:38:0x0129  */
        /* JADX WARN: Code duplicated, block: B:41:0x0148 A[PHI: r9
          0x0148: PHI (r9v10 u22.e$a) = (r9v3 u22.e$a), (r9v11 u22.e$a) binds: [B:39:0x0144, B:9:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:44:0x0159 A[PHI: r9
          0x0159: PHI (r9v12 u22.e$a) = (r9v10 u22.e$a), (r9v13 u22.e$a) binds: [B:42:0x0156, B:8:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:47:0x016f  */
        /* JADX WARN: Code duplicated, block: B:49:0x0173  */
        /* JADX WARN: Code duplicated, block: B:52:0x019d A[PHI: r9
          0x019d: PHI (r9v14 u22.e$a) = (r9v3 u22.e$a), (r9v15 u22.e$a) binds: [B:50:0x019a, B:7:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:55:0x01ae A[PHI: r9
          0x01ae: PHI (r9v16 u22.e$a) = (r9v14 u22.e$a), (r9v17 u22.e$a) binds: [B:53:0x01ab, B:6:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:60:0x01c7  */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0121, code lost:
        
            if (r0.emit(r13, r12) == r1) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x016c, code lost:
        
            if (r0.emit(r13, r12) == r1) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x01c1, code lost:
        
            if (r0.emit(r13, r12) == r1) goto L57;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 492
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: u22.C34490e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: u22.e$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.feature.paymentmethodmanagement.domain.PaymentMethodManagementInteractor$interact$$inlined$flatMapLatest$1", m100430f = "PaymentMethodManagementInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f144908w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f144909x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f144910y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C34490e f144911z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C34490e c34490e) {
            super(3, interfaceC30057d);
            this.f144911z = c34490e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC34488c abstractC34488c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f144911z);
            bVar.f144909x = interfaceC13062m;
            bVar.f144910y = abstractC34488c;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f144908w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f144909x;
                AbstractC34488c abstractC34488c = (AbstractC34488c) this.f144910y;
                if (abstractC34488c instanceof AbstractC34488c.g) {
                    c13084s1 = AbstractC13091v.m36590P(C34490e.m109020q(this.f144911z, false, 1, null), new i(null));
                } else if (abstractC34488c instanceof AbstractC34488c.f) {
                    c13084s1 = this.f144911z.m109021r((AbstractC34488c.f) abstractC34488c);
                } else if (abstractC34488c instanceof AbstractC34488c.e) {
                    if (this.f144911z.featureFlagChecker.isFeatureEnabled("stripe-tile-owns-set-default-android")) {
                        c13084s1 = new C13084s1(new d(abstractC34488c, null));
                    } else {
                        AbstractC34488c.e eVar = (AbstractC34488c.e) abstractC34488c;
                        c13084s1 = this.f144911z.m109016m(eVar.getPaymentMethodId(), eVar.getPostalCode(), eVar.getScreenName());
                    }
                } else if (abstractC34488c instanceof AbstractC34488c.a) {
                    c13084s1 = new C13084s1(this.f144911z.new e(null));
                } else {
                    c13084s1 = abstractC34488c instanceof AbstractC34488c.h ? new C13084s1(new f(abstractC34488c, null)) : new C13084s1(new g(abstractC34488c, null));
                }
                this.f144909x = null;
                this.f144910y = null;
                this.f144908w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC34488c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: u22.e$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.feature.paymentmethodmanagement.domain.PaymentMethodManagementInteractor$interact$1$internalActionFlow$1$1", m100430f = "PaymentMethodManagementInteractor.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lu22/g;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f144912w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f144913x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C34489d f144914y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C34489d c34489d, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f144914y = c34489d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f144914y, interfaceC30057d);
            cVar.f144913x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f144913x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f144912w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC34492g.b bVar = new AbstractC34492g.b(this.f144914y);
                this.f144913x = null;
                this.f144912w = 1;
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

    /* JADX INFO: renamed from: u22.e$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.feature.paymentmethodmanagement.domain.PaymentMethodManagementInteractor$interact$1$internalActionFlow$2", m100430f = "PaymentMethodManagementInteractor.kt", m100431l = {63}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lu22/g;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f144915w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f144916x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC34488c f144917y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC34488c abstractC34488c, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f144917y = abstractC34488c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f144917y, interfaceC30057d);
            dVar.f144916x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f144916x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f144915w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC34492g.a aVar = new AbstractC34492g.a(this.f144917y);
                this.f144916x = null;
                this.f144915w = 1;
                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: u22.e$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.feature.paymentmethodmanagement.domain.PaymentMethodManagementInteractor$interact$1$internalActionFlow$3", m100430f = "PaymentMethodManagementInteractor.kt", m100431l = {70, 71}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lu22/g;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f144918w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f144919x;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C34490e.this.new e(interfaceC30057d);
            eVar.f144919x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
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
                java.lang.Object r0 = r5.f144919x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f144918w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L47
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L34
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                u22.e r6 = u22.C34490e.this
                u22.a r6 = u22.C34490e.m109012i(r6)
                r5.f144919x = r0
                r5.f144918w = r4
                java.lang.Object r6 = r6.mo95014a(r5)
                if (r6 != r1) goto L34
                goto L46
            L34:
                u22.g$d r6 = new u22.g$d
                u22.b$i r2 = u22.InterfaceC34487b.i.f144871a
                r6.<init>(r2)
                r2 = 0
                r5.f144919x = r2
                r5.f144918w = r3
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L47
            L46:
                return r1
            L47:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: u22.C34490e.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: u22.e$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.feature.paymentmethodmanagement.domain.PaymentMethodManagementInteractor$interact$1$internalActionFlow$4", m100430f = "PaymentMethodManagementInteractor.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lu22/g;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f144921w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f144922x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC34488c f144923y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC34488c abstractC34488c, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f144923y = abstractC34488c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(this.f144923y, interfaceC30057d);
            fVar.f144922x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f144922x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f144921w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC34492g.a aVar = new AbstractC34492g.a(this.f144923y);
                this.f144922x = null;
                this.f144921w = 1;
                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: u22.e$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.feature.paymentmethodmanagement.domain.PaymentMethodManagementInteractor$interact$1$internalActionFlow$5", m100430f = "PaymentMethodManagementInteractor.kt", m100431l = {78}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lu22/g;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f144924w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f144925x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC34488c f144926y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AbstractC34488c abstractC34488c, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f144926y = abstractC34488c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = new g(this.f144926y, interfaceC30057d);
            gVar.f144925x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f144925x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f144924w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC34492g.a aVar = new AbstractC34492g.a(this.f144926y);
                this.f144925x = null;
                this.f144924w = 1;
                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: u22.e$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.feature.paymentmethodmanagement.domain.PaymentMethodManagementInteractor$interact$2", m100430f = "PaymentMethodManagementInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lu22/d;", "previousState", "Lu22/g;", "action", "<anonymous>", "(Lu22/d;Lu22/g;)Lu22/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f144927w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f144928x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f144929y;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C34489d c34489d, AbstractC34492g abstractC34492g, InterfaceC30057d<? super C34489d> interfaceC30057d) {
            h hVar = C34490e.this.new h(interfaceC30057d);
            hVar.f144928x = c34489d;
            hVar.f144929y = abstractC34492g;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C34489d c34489d = (C34489d) this.f144928x;
            AbstractC34492g abstractC34492g = (AbstractC34492g) this.f144929y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f144927w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC34492g instanceof AbstractC34492g.a) {
                return C34490e.this.m109017n(c34489d, ((AbstractC34492g.a) abstractC34492g).getDomainAction());
            }
            if (abstractC34492g instanceof AbstractC34492g.b) {
                return ((AbstractC34492g.b) abstractC34492g).getDomainState();
            }
            if (abstractC34492g instanceof AbstractC34492g.d) {
                return C34489d.m108998b(c34489d, ((AbstractC34492g.d) abstractC34492g).getDialogType(), null, false, false, null, false, 62, null);
            }
            if (abstractC34492g instanceof AbstractC34492g.c) {
                return C34489d.m108998b(c34489d, null, null, false, false, null, false, 31, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: u22.e$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.feature.paymentmethodmanagement.domain.PaymentMethodManagementInteractor$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "PaymentMethodManagementInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f144931w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f144932x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f144933y;

        public i(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C34489d c34489d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            i iVar = new i(interfaceC30057d);
            iVar.f144932x = interfaceC13062m;
            iVar.f144933y = c34489d;
            return iVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f144931w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f144932x;
                C13084s1 c13084s1 = new C13084s1(new c((C34489d) this.f144933y, null));
                this.f144932x = null;
                this.f144933y = null;
                this.f144931w = 1;
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
            return invoke((InterfaceC13062m) obj, (C34489d) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: u22.e$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.feature.paymentmethodmanagement.domain.PaymentMethodManagementInteractor$loadPaymentMethodManagementCache$$inlined$cacheAPI$1", m100430f = "PaymentMethodManagementInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f144934w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f144935x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f144936y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f144937z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f144937z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            j jVar = new j(interfaceC30057d, this.f144937z);
            jVar.f144935x = interfaceC13062m;
            jVar.f144936y = c26832c;
            return jVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f144934w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f144935x;
                C26832c c26832c = (C26832c) this.f144936y;
                InterfaceC26834e interfaceC26834e = this.f144937z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(PaymentMethodManagementModels.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(PaymentMethodManagementModels.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f144935x = null;
                this.f144936y = null;
                this.f144934w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: u22.e$k */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f144938w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f144939x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C34490e f144940y;

        /* JADX INFO: renamed from: u22.e$k$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f144941w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ boolean f144942x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C34490e f144943y;

            /* JADX INFO: renamed from: u22.e$k$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.payments.feature.paymentmethodmanagement.domain.PaymentMethodManagementInteractor$loadPaymentMethodManagementCache$$inlined$map$1$2", m100430f = "PaymentMethodManagementInteractor.kt", m100431l = {60, 67, 79, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42438a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f144944E;

                /* JADX INFO: renamed from: F */
                Object f144945F;

                /* JADX INFO: renamed from: G */
                Object f144946G;

                /* JADX INFO: renamed from: H */
                Object f144947H;

                /* JADX INFO: renamed from: I */
                Object f144948I;

                /* JADX INFO: renamed from: J */
                Object f144949J;

                /* JADX INFO: renamed from: K */
                int f144950K;

                /* JADX INFO: renamed from: L */
                int f144951L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f144952w;

                /* JADX INFO: renamed from: x */
                int f144953x;

                /* JADX INFO: renamed from: y */
                Object f144954y;

                public C42438a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f144952w = obj;
                    this.f144953x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, boolean z4, C34490e c34490e) {
                this.f144941w = interfaceC13062m;
                this.f144942x = z4;
                this.f144943y = c34490e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:63:0x0215, code lost:
            
                if (r1.emit(r12, r2) == r3) goto L64;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r22, q83.InterfaceC30057d r23) {
                /*
                    Method dump skipped, instruction units count: 545
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: u22.C34490e.k.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public k(InterfaceC13058l interfaceC13058l, boolean z4, C34490e c34490e) {
            this.f144938w = interfaceC13058l;
            this.f144939x = z4;
            this.f144940y = c34490e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f144938w.collect(new a(interfaceC13062m, this.f144939x, this.f144940y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: u22.e$l */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.feature.paymentmethodmanagement.domain.PaymentMethodManagementInteractor$performAction$$inlined$flatMapLatest$1", m100430f = "PaymentMethodManagementInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f144956w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f144957x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f144958y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C34490e f144959z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC30057d interfaceC30057d, C34490e c34490e) {
            super(3, interfaceC30057d);
            this.f144959z = c34490e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC30694b abstractC30694b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            l lVar = new l(interfaceC30057d, this.f144959z);
            lVar.f144957x = interfaceC13062m;
            lVar.f144958y = abstractC30694b;
            return lVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            C0456u c0456u2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f144956w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f144957x;
                AbstractC30694b abstractC30694b = (AbstractC30694b) this.f144958y;
                if (abstractC30694b instanceof AbstractC30694b.f) {
                    c0456u = new m(C34490e.m109020q(this.f144959z, false, 1, null));
                } else if ((abstractC30694b instanceof AbstractC30694b.c) || (abstractC30694b instanceof AbstractC30694b.i)) {
                    c0456u = new C0456u(new AbstractC34492g.d(InterfaceC34487b.c.f144866a), 1);
                } else if (abstractC30694b instanceof AbstractC30694b.n) {
                    c0456u = new C0456u(new AbstractC34492g.d(InterfaceC34487b.i.f144871a), 1);
                } else {
                    if (abstractC30694b instanceof AbstractC30694b.d) {
                        c0456u2 = new C0456u(new AbstractC34492g.b(new C34489d(null, null, false, false, new InterfaceC37862a.b(((AbstractC30694b.d) abstractC30694b).getDestination()), false, 47, null)), 1);
                    } else if (abstractC30694b instanceof AbstractC30694b.a) {
                        c0456u2 = new C0456u(new AbstractC34492g.d(AbstractC39414r.m125876U(((AbstractC30694b.a) abstractC30694b).getMessage(), "network", true) ? InterfaceC34487b.d.f144867a : InterfaceC34487b.f.f144868a), 1);
                    } else {
                        if (!(abstractC30694b instanceof AbstractC30694b.m) && !(abstractC30694b instanceof AbstractC30694b.l) && !(abstractC30694b instanceof AbstractC30694b.k) && !(abstractC30694b instanceof AbstractC30694b.j) && !(abstractC30694b instanceof AbstractC30694b.g) && !(abstractC30694b instanceof AbstractC30694b.e) && !(abstractC30694b instanceof AbstractC30694b.h) && !(abstractC30694b instanceof AbstractC30694b.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c0456u = new C0456u(new AbstractC34492g.d(null), 1);
                    }
                    c0456u = c0456u2;
                }
                this.f144957x = null;
                this.f144958y = null;
                this.f144956w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c0456u, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC30694b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: u22.e$m */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f144960w;

        /* JADX INFO: renamed from: u22.e$m$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f144961w;

            /* JADX INFO: renamed from: u22.e$m$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.payments.feature.paymentmethodmanagement.domain.PaymentMethodManagementInteractor$performAction$lambda$0$$inlined$map$1$2", m100430f = "PaymentMethodManagementInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42439a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f144962E;

                /* JADX INFO: renamed from: F */
                Object f144963F;

                /* JADX INFO: renamed from: G */
                Object f144964G;

                /* JADX INFO: renamed from: H */
                int f144965H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f144966w;

                /* JADX INFO: renamed from: x */
                int f144967x;

                /* JADX INFO: renamed from: y */
                Object f144968y;

                public C42439a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f144966w = obj;
                    this.f144967x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f144961w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42439a c42439a;
                if (interfaceC30057d instanceof C42439a) {
                    c42439a = (C42439a) interfaceC30057d;
                    int i13 = c42439a.f144967x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42439a.f144967x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42439a = new C42439a(interfaceC30057d);
                    }
                } else {
                    c42439a = new C42439a(interfaceC30057d);
                }
                Object obj2 = c42439a.f144966w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42439a.f144967x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f144961w;
                    AbstractC34492g.b bVar = new AbstractC34492g.b((C34489d) obj);
                    c42439a.f144968y = null;
                    c42439a.f144962E = null;
                    c42439a.f144963F = null;
                    c42439a.f144964G = null;
                    c42439a.f144965H = 0;
                    c42439a.f144967x = 1;
                    if (interfaceC13062m.emit(bVar, c42439a) == enumC31071a) {
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

        public m(InterfaceC13058l interfaceC13058l) {
            this.f144960w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f144960w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C34490e(InterfaceC26834e cachedApiSource, C30695c actionInteractor, InterfaceC21030c metricWriter, StripeBottomSheetTileApi api, C0346a analyticsHelper, InterfaceC34486a onDefaultPaymentMethodSet, FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(actionInteractor, "actionInteractor");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(onDefaultPaymentMethodSet, "onDefaultPaymentMethodSet");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.cachedApiSource = cachedApiSource;
        this.actionInteractor = actionInteractor;
        this.metricWriter = metricWriter;
        this.api = api;
        this.analyticsHelper = analyticsHelper;
        this.onDefaultPaymentMethodSet = onDefaultPaymentMethodSet;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final InterfaceC13058l m109016m(String paymentMethodId, String postalCode, String screenName) {
        return new C13084s1(new a(screenName, paymentMethodId, postalCode, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final C34489d m109017n(C34489d previousState, AbstractC34488c action) {
        PaymentMethodManagementNavigationBarModel navigationBar;
        PaymentMethodManagementLeftButtonModel leftButton;
        PaymentMethodManagementDismissModalModel dismissModal;
        if (action instanceof AbstractC34488c.g) {
            return previousState;
        }
        if (action instanceof AbstractC34488c.d) {
            PaymentMethodManagementModels response = previousState.getResponse();
            PaymentMethodManagementDismissModalContentModel content = (response == null || (navigationBar = response.getNavigationBar()) == null || (leftButton = navigationBar.getLeftButton()) == null || (dismissModal = leftButton.getDismissModal()) == null) ? null : dismissModal.getContent();
            return content != null ? C34489d.m108998b(previousState, new InterfaceC34487b.a(content), null, false, false, null, false, 62, null) : C34489d.m108998b(previousState, null, null, false, false, InterfaceC37862a.j.f162094a, false, 47, null);
        }
        if (action instanceof AbstractC34488c.c) {
            return C34489d.m108998b(previousState, null, null, false, false, InterfaceC37862a.j.f162094a, false, 46, null);
        }
        if (action instanceof AbstractC34488c.b) {
            return C34489d.m108998b(previousState, null, null, false, false, null, false, 62, null);
        }
        return action instanceof AbstractC34488c.h ? C34489d.m108998b(previousState, null, null, false, false, null, true, 30, null) : previousState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final C34489d m109018o(InterfaceC29354a.c<PaymentMethodManagementModels> cacheResult) {
        return AbstractC29355b.m89462a(cacheResult) ? new C34489d(InterfaceC34487b.f.f144868a, null, false, false, null, false, 62, null) : new C34489d(InterfaceC34487b.d.f144867a, null, false, false, null, false, 62, null);
    }

    /* JADX INFO: renamed from: p */
    private final InterfaceC13058l m109019p(boolean manualRefresh) {
        return new k(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetPaymentMethodManagementRequest(), 1), AbstractC12350b.m34570S("payment_method_management_SCOPE"), null, 2, null), new j(null, this.cachedApiSource)), manualRefresh, this);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ InterfaceC13058l m109020q(C34490e c34490e, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        return c34490e.m109019p(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final InterfaceC13058l m109021r(AbstractC34488c.f action) {
        return AbstractC13091v.m36590P(this.actionInteractor.interact(new C0456u(new C30698f(action.getAction()), 1)), new l(null, this));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C34489d(InterfaceC34487b.c.f144866a, null, false, false, null, false, 62, null), AbstractC13091v.m36590P(upstream, new b(null, this)), new h(null));
    }

    public /* synthetic */ C34490e(InterfaceC26834e interfaceC26834e, C30695c c30695c, InterfaceC21030c interfaceC21030c, StripeBottomSheetTileApi stripeBottomSheetTileApi, C0346a c0346a, InterfaceC34486a interfaceC34486a, FeatureFlagChecker featureFlagChecker, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC26834e, c30695c, interfaceC21030c, stripeBottomSheetTileApi, c0346a, interfaceC34486a, featureFlagChecker, (i13 & 128) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PaymentMethodManagementInteractor") : interfaceC34116n);
    }
}
