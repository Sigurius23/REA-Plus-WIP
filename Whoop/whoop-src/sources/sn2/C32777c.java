package sn2;

import ao2.C1876a;
import c93.InterfaceC4351m;
import com.mapbox.common.logger.LogPriority;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.universalcheckout.features.buynow.domain.BuyNowApi;
import com.whoop.universalcheckout.features.buynow.domain.BuyNowPlaceOrderRequest;
import com.whoop.universalcheckout.features.buynow.domain.BuyNowRequest;
import com.whoop.universalcheckout.features.buynow.domain.InvalidBuyNowResponseException;
import com.whoop.universalcheckout.features.buynow.domain.models.BuyNowResponse;
import com.whoop.universalcheckout.features.checkout.domain.models.CheckoutSuccessResponse;
import ec3.AbstractC13091v;
import ec3.C13054k;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jo2.C21838a;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s82.C32266a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: sn2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BW\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ;\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030!2\u0006\u0010\u001c\u001a\u00020\u00032\u001c\u0010 \u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001dH\u0002¢\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020$H\u0082@¢\u0006\u0004\b%\u0010&J\u0018\u0010)\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'H\u0082@¢\u0006\u0004\b)\u0010*J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b.\u0010/J\u0013\u00101\u001a\u000200*\u00020$H\u0002¢\u0006\u0004\b1\u00102J#\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030!2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00020!H\u0016¢\u0006\u0004\b4\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006H"}, m65681d2 = {"Lsn2/c;", "Lod1/g;", "Lsn2/a;", "Lsn2/b;", "Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowApi;", "api", "Lsn2/e;", "presentation", "Lsn2/g;", "resolver", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ls82/a;", "seonManager", "Lao2/a;", "cartIndicatorRepository", "Ljo2/a;", "errorParser", "Lrr2/c;", "crashReporter", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowApi;Lsn2/e;Lsn2/g;Lcom/whoop/data/repositories/FeatureFlagChecker;Ls82/a;Lao2/a;Ljo2/a;Lrr2/c;Ltr2/n;)V", "action", "", "j", "(Lsn2/a;)Z", "inProgress", "Lkotlin/Function1;", "Lq83/d;", "", "request", "Lec3/l;", "k", "(Lsn2/b;Lkotlin/jvm/functions/Function1;)Lec3/l;", "Lsn2/a$c;", "n", "(Lsn2/a$c;Lq83/d;)Ljava/lang/Object;", "Lsn2/d;", "order", "m", "(Lsn2/d;Lq83/d;)Ljava/lang/Object;", "", "reason", "Lsn2/b$b;", "l", "(Ljava/lang/String;)Lsn2/b$b;", "Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;", "o", "(Lsn2/a$c;)Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowApi;", "b", "Lsn2/e;", "c", "Lsn2/g;", "d", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "e", "Ls82/a;", "f", "Lao2/a;", "g", "Ljo2/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lrr2/c;", "i", "Ltr2/n;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32777c implements InterfaceC27844g<InterfaceC32775a, InterfaceC32776b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final BuyNowApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C32779e presentation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C32781g resolver;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C32266a seonManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C1876a cartIndicatorRepository;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C21838a errorParser;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: sn2.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.buynow.domain.BuyNowInteractor$admittedRequest$1", m100430f = "BuyNowInteractor.kt", m100431l = {56, 57, 61}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lsn2/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Function1 f136383E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C32777c f136384F;

        /* JADX INFO: renamed from: w */
        Object f136385w;

        /* JADX INFO: renamed from: x */
        int f136386x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f136387y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC32776b f136388z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC32776b interfaceC32776b, Function1 function1, C32777c c32777c, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f136388z = interfaceC32776b;
            this.f136383E = function1;
            this.f136384F = c32777c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f136388z, this.f136383E, this.f136384F, interfaceC30057d);
            aVar.f136387y = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0061  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L27;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f136387y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f136386x
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L2d
                if (r2 == r5) goto L29
                if (r2 == r4) goto L23
                if (r2 != r3) goto L1b
                java.lang.Object r0 = r6.f136385w
                sn2.b r0 = (sn2.InterfaceC32776b) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L6f
            L1b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L23:
                p505ts.AbstractC34132o.m107864I(r7)     // Catch: java.lang.Throwable -> L27
                goto L4a
            L27:
                r7 = move-exception
                goto L72
            L29:
                p505ts.AbstractC34132o.m107864I(r7)     // Catch: java.lang.Throwable -> L27
                goto L3d
            L2d:
                p505ts.AbstractC34132o.m107864I(r7)
                sn2.b r7 = r6.f136388z     // Catch: java.lang.Throwable -> L27
                r6.f136387y = r0     // Catch: java.lang.Throwable -> L27
                r6.f136386x = r5     // Catch: java.lang.Throwable -> L27
                java.lang.Object r7 = r0.emit(r7, r6)     // Catch: java.lang.Throwable -> L27
                if (r7 != r1) goto L3d
                goto L6e
            L3d:
                kotlin.jvm.functions.Function1 r7 = r6.f136383E     // Catch: java.lang.Throwable -> L27
                r6.f136387y = r0     // Catch: java.lang.Throwable -> L27
                r6.f136386x = r4     // Catch: java.lang.Throwable -> L27
                java.lang.Object r7 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L27
                if (r7 != r1) goto L4a
                goto L6e
            L4a:
                sn2.b r7 = (sn2.InterfaceC32776b) r7     // Catch: java.lang.Throwable -> L27
                sn2.c r2 = r6.f136384F
                sn2.e r2 = sn2.C32777c.m102800f(r2)
                r2.m102816d()
                sn2.c r2 = r6.f136384F
                sn2.e r2 = sn2.C32777c.m102800f(r2)
                boolean r2 = r2.m102818f()
                if (r2 != 0) goto L6f
                r2 = 0
                r6.f136387y = r2
                r6.f136385w = r2
                r6.f136386x = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L6f
            L6e:
                return r1
            L6f:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            L72:
                sn2.c r0 = r6.f136384F
                sn2.e r0 = sn2.C32777c.m102800f(r0)
                r0.m102816d()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: sn2.C32777c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: sn2.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.buynow.domain.BuyNowInteractor$interact$$inlined$flatMapLatest$1", m100430f = "BuyNowInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f136389w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f136390x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f136391y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C32777c f136392z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C32777c c32777c) {
            super(3, interfaceC30057d);
            this.f136392z = c32777c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC32775a interfaceC32775a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f136392z);
            bVar.f136390x = interfaceC13062m;
            bVar.f136391y = interfaceC32775a;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM102805k;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f136389w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f136390x;
                InterfaceC32775a interfaceC32775a = (InterfaceC32775a) this.f136391y;
                if (interfaceC32775a instanceof InterfaceC32775a.c) {
                    C32777c c32777c = this.f136392z;
                    interfaceC13058lM102805k = c32777c.m102805k(InterfaceC32776b.c.f136367a, c32777c.new d(interfaceC32775a, null));
                } else if (interfaceC32775a instanceof InterfaceC32775a.b) {
                    C32777c c32777c2 = this.f136392z;
                    interfaceC13058lM102805k = c32777c2.m102805k(InterfaceC32776b.f.f136372a, c32777c2.new e(interfaceC32775a, null));
                } else {
                    if (!AbstractC22676k.m65745e(interfaceC32775a, InterfaceC32775a.a.f136360a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC13058lM102805k = C13054k.f45116w;
                }
                this.f136390x = null;
                this.f136391y = null;
                this.f136389w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM102805k, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC32775a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: sn2.c$c */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.buynow.domain.BuyNowInteractor$interact$$inlined$transform$1", m100430f = "BuyNowInteractor.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f136393w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f136394x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f136395y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C32777c f136396z;

        /* JADX INFO: renamed from: sn2.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f136397w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C32777c f136398x;

            /* JADX INFO: renamed from: sn2.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.buynow.domain.BuyNowInteractor$interact$$inlined$transform$1$1", m100430f = "BuyNowInteractor.kt", m100431l = {39}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42332a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f136399E;

                /* JADX INFO: renamed from: F */
                Object f136400F;

                /* JADX INFO: renamed from: G */
                Object f136401G;

                /* JADX INFO: renamed from: H */
                int f136402H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f136403w;

                /* JADX INFO: renamed from: x */
                int f136404x;

                /* JADX INFO: renamed from: z */
                Object f136406z;

                public C42332a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f136403w = obj;
                    this.f136404x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C32777c c32777c) {
                this.f136398x = c32777c;
                this.f136397w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(T t14, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C42332a c42332a;
                if (interfaceC30057d instanceof C42332a) {
                    c42332a = (C42332a) interfaceC30057d;
                    int i13 = c42332a.f136404x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42332a.f136404x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42332a = new C42332a(interfaceC30057d);
                    }
                } else {
                    c42332a = new C42332a(interfaceC30057d);
                }
                Object obj = c42332a.f136403w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42332a.f136404x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = this.f136397w;
                    InterfaceC32775a interfaceC32775a = (InterfaceC32775a) t14;
                    if (this.f136398x.m102804j(interfaceC32775a)) {
                        c42332a.f136406z = null;
                        c42332a.f136399E = null;
                        c42332a.f136400F = null;
                        c42332a.f136401G = null;
                        c42332a.f136402H = 0;
                        c42332a.f136404x = 1;
                        if (interfaceC13062m.emit(interfaceC32775a, c42332a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d, C32777c c32777c) {
            super(2, interfaceC30057d);
            this.f136395y = interfaceC13058l;
            this.f136396z = c32777c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f136395y, interfaceC30057d, this.f136396z);
            cVar.f136394x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f136393w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f136394x;
                InterfaceC13058l interfaceC13058l = this.f136395y;
                a aVar = new a(interfaceC13062m, this.f136396z);
                this.f136394x = null;
                this.f136393w = 1;
                if (interfaceC13058l.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: sn2.c$d */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.buynow.domain.BuyNowInteractor$interact$2$1", m100430f = "BuyNowInteractor.kt", m100431l = {37}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lsn2/b;", "<anonymous>", "()Lsn2/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f136407w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC32775a f136409y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC32775a interfaceC32775a, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f136409y = interfaceC32775a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C32777c.this.new d(this.f136409y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Exception {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f136407w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C32777c c32777c = C32777c.this;
            InterfaceC32775a.c cVar = (InterfaceC32775a.c) this.f136409y;
            this.f136407w = 1;
            Object objM102808n = c32777c.m102808n(cVar, this);
            return objM102808n == enumC31071a ? enumC31071a : objM102808n;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super InterfaceC32776b> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: sn2.c$e */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.buynow.domain.BuyNowInteractor$interact$2$2", m100430f = "BuyNowInteractor.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lsn2/b;", "<anonymous>", "()Lsn2/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f136410w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC32775a f136412y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC32775a interfaceC32775a, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f136412y = interfaceC32775a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C32777c.this.new e(this.f136412y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Exception {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f136410w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C32777c c32777c = C32777c.this;
            C32778d order = ((InterfaceC32775a.b) this.f136412y).getOrder();
            this.f136410w = 1;
            Object objM102807m = c32777c.m102807m(order, this);
            return objM102807m == enumC31071a ? enumC31071a : objM102807m;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super InterfaceC32776b> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: sn2.c$f */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.buynow.domain.BuyNowInteractor", m100430f = "BuyNowInteractor.kt", m100431l = {92, 94}, m100432m = "placeOrder", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f136413E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f136414F;

        /* JADX INFO: renamed from: H */
        int f136416H;

        /* JADX INFO: renamed from: w */
        Object f136417w;

        /* JADX INFO: renamed from: x */
        Object f136418x;

        /* JADX INFO: renamed from: y */
        Object f136419y;

        /* JADX INFO: renamed from: z */
        Object f136420z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f136414F = obj;
            this.f136416H |= Integer.MIN_VALUE;
            return C32777c.this.m102807m(null, this);
        }
    }

    /* JADX INFO: renamed from: sn2.c$g */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.buynow.domain.BuyNowInteractor$placeOrder$apiResult$1", m100430f = "BuyNowInteractor.kt", m100431l = {LogPriority.NONE}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/universalcheckout/features/checkout/domain/models/CheckoutSuccessResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f136421w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C32778d f136423y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ BuyNowPlaceOrderRequest f136424z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C32778d c32778d, BuyNowPlaceOrderRequest buyNowPlaceOrderRequest, InterfaceC30057d<? super g> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f136423y = c32778d;
            this.f136424z = buyNowPlaceOrderRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C32777c.this.new g(this.f136423y, this.f136424z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f136421w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            BuyNowApi buyNowApi = C32777c.this.api;
            String strM125898q0 = AbstractC39414r.m125898q0(this.f136423y.getCheckoutPath(), "/");
            BuyNowPlaceOrderRequest buyNowPlaceOrderRequest = this.f136424z;
            this.f136421w = 1;
            Object objPlaceOrder = buyNowApi.placeOrder(strM125898q0, buyNowPlaceOrderRequest, this);
            return objPlaceOrder == enumC31071a ? enumC31071a : objPlaceOrder;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super CheckoutSuccessResponse> interfaceC30057d) {
            return ((g) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: sn2.c$h */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.buynow.domain.BuyNowInteractor", m100430f = "BuyNowInteractor.kt", m100431l = {65}, m100432m = "resolve", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f136425w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f136426x;

        /* JADX INFO: renamed from: z */
        int f136428z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f136426x = obj;
            this.f136428z |= Integer.MIN_VALUE;
            return C32777c.this.m102808n(null, this);
        }
    }

    /* JADX INFO: renamed from: sn2.c$i */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.buynow.domain.BuyNowInteractor$resolve$apiResult$1", m100430f = "BuyNowInteractor.kt", m100431l = {70}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f136429w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC32775a.c f136431y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC32775a.c cVar, InterfaceC30057d<? super i> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f136431y = cVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C32777c.this.new i(this.f136431y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f136429w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            BuyNowApi buyNowApi = C32777c.this.api;
            BuyNowRequest buyNowRequestM102809o = C32777c.this.m102809o(this.f136431y);
            this.f136429w = 1;
            Object objBuyNow = buyNowApi.buyNow(buyNowRequestM102809o, this);
            return objBuyNow == enumC31071a ? enumC31071a : objBuyNow;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super BuyNowResponse> interfaceC30057d) {
            return ((i) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C32777c(BuyNowApi api, C32779e presentation, C32781g resolver, FeatureFlagChecker featureFlagChecker, C32266a seonManager, C1876a cartIndicatorRepository, C21838a errorParser, InterfaceC31766c interfaceC31766c, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(presentation, "presentation");
        AbstractC22676k.m65750j(resolver, "resolver");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(seonManager, "seonManager");
        AbstractC22676k.m65750j(cartIndicatorRepository, "cartIndicatorRepository");
        AbstractC22676k.m65750j(errorParser, "errorParser");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.presentation = presentation;
        this.resolver = resolver;
        this.featureFlagChecker = featureFlagChecker;
        this.seonManager = seonManager;
        this.cartIndicatorRepository = cartIndicatorRepository;
        this.errorParser = errorParser;
        this.crashReporter = interfaceC31766c;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final boolean m102804j(InterfaceC32775a action) {
        if ((action instanceof InterfaceC32775a.c) || (action instanceof InterfaceC32775a.b)) {
            return this.presentation.m102820h();
        }
        if (!AbstractC22676k.m65745e(action, InterfaceC32775a.a.f136360a)) {
            throw new NoWhenBranchMatchedException();
        }
        this.presentation.m102815c();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final InterfaceC13058l m102805k(InterfaceC32776b inProgress, Function1 request) {
        return new C13084s1(new a(inProgress, request, this, null));
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC32776b.b m102806l(String reason) {
        InvalidBuyNowResponseException invalidBuyNowResponseException = new InvalidBuyNowResponseException(reason);
        this.logger.mo85230v(AbstractC11266d.m30461o("Buy Now response failed validation: ", reason), invalidBuyNowResponseException, new AbstractC30556a.a[0]);
        InterfaceC31766c interfaceC31766c = this.crashReporter;
        if (interfaceC31766c != null) {
            interfaceC31766c.mo98631p(invalidBuyNowResponseException);
        }
        return new InterfaceC32776b.b(invalidBuyNowResponseException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cf, code lost:
    
        if (r15 == r0) goto L27;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m102807m(sn2.C32778d r14, q83.InterfaceC30057d<? super sn2.InterfaceC32776b> r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sn2.C32777c.m102807m(sn2.d, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: n */
    public final Object m102808n(InterfaceC32775a.c cVar, InterfaceC30057d<? super InterfaceC32776b> interfaceC30057d) throws Exception {
        h hVar;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f136428z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f136428z = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        h hVar2 = hVar;
        Object objM108730a = hVar2.f136426x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = hVar2.f136428z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108730a);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            InterfaceC31766c interfaceC31766c = this.crashReporter;
            String strM8300m = AbstractC2875y.m8300m("buy now resolve failed (storeDomain=", cVar.getStoreDomain(), ", idempotencyKey=", this.presentation.getIdempotencyKey(), ")");
            i iVar = new i(cVar, null);
            hVar2.f136425w = null;
            hVar2.f136428z = 1;
            objM108730a = companion.m108730a(interfaceC34116n, interfaceC31766c, strM8300m, iVar, hVar2);
            if (objM108730a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108730a);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108730a;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return new InterfaceC32776b.b(((InterfaceC34385a.b) interfaceC34385a).getException());
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC32780f interfaceC32780fM102828b = this.resolver.m102828b((BuyNowResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        if (interfaceC32780fM102828b instanceof InterfaceC32780f.a) {
            InterfaceC32780f.a aVar = (InterfaceC32780f.a) interfaceC32780fM102828b;
            this.cartIndicatorRepository.m5653i(aVar.getCartId());
            return new InterfaceC32776b.a(aVar.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String());
        }
        if (interfaceC32780fM102828b instanceof InterfaceC32780f.c) {
            return new InterfaceC32776b.g(((InterfaceC32780f.c) interfaceC32780fM102828b).getContent());
        }
        if (interfaceC32780fM102828b instanceof InterfaceC32780f.b) {
            return m102806l(((InterfaceC32780f.b) interfaceC32780fM102828b).getReason());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final BuyNowRequest m102809o(InterfaceC32775a.c cVar) {
        return new BuyNowRequest(this.presentation.getIdempotencyKey(), cVar.getStoreDomain(), cVar.getSelection().getSku(), cVar.getSelection().getPackSku(), cVar.getSelection().m102830b(), cVar.getSelection().getWywSku(), cVar.getSelection().getBandSku(), cVar.getSelection().getClaspSku(), cVar.getSelection().getHookSku(), cVar.getSelection().getFastLinkSku());
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(new C13084s1(new c(upstream, null, this)), new b(null, this));
    }

    public /* synthetic */ C32777c(BuyNowApi buyNowApi, C32779e c32779e, C32781g c32781g, FeatureFlagChecker featureFlagChecker, C32266a c32266a, C1876a c1876a, C21838a c21838a, InterfaceC31766c interfaceC31766c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(buyNowApi, c32779e, c32781g, featureFlagChecker, c32266a, c1876a, (i13 & 64) != 0 ? new C21838a(null, null, 3, null) : c21838a, (i13 & 128) != 0 ? null : interfaceC31766c, (i13 & 256) != 0 ? InterfaceC34116n.INSTANCE.m107848a("BuyNowInteractor") : interfaceC34116n);
    }
}
