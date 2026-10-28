package nc0;

import c93.InterfaceC4351m;
import com.mapbox.common.logger.LogPriority;
import com.whoop.advancedlabs.feature.marketingconsent.domain.GetMarketingConsentRequest;
import com.whoop.advancedlabs.feature.marketingconsent.domain.models.MarketingConsentScreenResponse;
import com.whoop.privacyconsent.api.AllowRecommendationRequest;
import com.whoop.privacyconsent.api.PrivacyConsentApi;
import com.whoop.privacyconsent.api.PrivacyConsentSettingsResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import oc0.EnumC27816a;
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
import pm0.AbstractC29355b;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import qc0.InterfaceC30214a;
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
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: nc0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\r\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b \u0010!J#\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, m65681d2 = {"Lnc0/d;", "Lod1/g;", "Lnc0/b;", "Lnc0/c;", "Lnm0/e;", "cachedApiSource", "Lqw2/c;", "actionInteractor", "Lcom/whoop/privacyconsent/api/PrivacyConsentApi;", "privacyConsentApi", "<init>", "(Lnm0/e;Lqw2/c;Lcom/whoop/privacyconsent/api/PrivacyConsentApi;)V", "previousState", "action", "j", "(Lnc0/c;Lnc0/b;)Lnc0/c;", "Loc0/a;", "clickAction", "Lec3/l;", "Lnc0/e;", "i", "(Loc0/a;)Lec3/l;", "Lnc0/b$c;", "n", "(Lnc0/b$c;)Lec3/l;", "", "manualRefresh", "l", "(Z)Lec3/l;", "Lpm0/a$c;", "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;", "cacheResult", "k", "(Lpm0/a$c;)Lnc0/c;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Lqw2/c;", "c", "Lcom/whoop/privacyconsent/api/PrivacyConsentApi;", "Ltr2/n;", "d", "Ltr2/n;", "logger", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26566d implements InterfaceC27844g<AbstractC26564b, C26565c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C30695c actionInteractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final PrivacyConsentApi privacyConsentApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: nc0.d$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f105600a;

        static {
            int[] iArr = new int[EnumC27816a.values().length];
            try {
                iArr[EnumC27816a.SKIP_CONSENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC27816a.SAVE_CONSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC27816a.DISMISS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC27816a.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f105600a = iArr;
        }
    }

    /* JADX INFO: renamed from: nc0.d$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.marketingconsent.domain.MarketingConsentInteractor$handleCtaClicked$1", m100430f = "MarketingConsentInteractor.kt", m100431l = {98, LogPriority.NONE, 103, 104, 105}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnc0/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f105601w;

        /* JADX INFO: renamed from: x */
        int f105602x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f105603y;

        /* JADX INFO: renamed from: nc0.d$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.marketingconsent.domain.MarketingConsentInteractor$handleCtaClicked$1$result$1", m100430f = "MarketingConsentInteractor.kt", m100431l = {AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f105605w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C26566d f105606x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C26566d c26566d, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f105606x = c26566d;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f105606x, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f105605w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                PrivacyConsentApi privacyConsentApi = this.f105606x.privacyConsentApi;
                AllowRecommendationRequest allowRecommendationRequest = new AllowRecommendationRequest(true);
                this.f105605w = 1;
                Object objUpdateAllowRecommendationV2 = privacyConsentApi.updateAllowRecommendationV2(allowRecommendationRequest, this);
                return objUpdateAllowRecommendationV2 == enumC31071a ? enumC31071a : objUpdateAllowRecommendationV2;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super PrivacyConsentSettingsResponse> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C26566d.this.new b(interfaceC30057d);
            bVar.f105603y = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0071  */
        /* JADX WARN: Code duplicated, block: B:26:0x0085  */
        /* JADX WARN: Code duplicated, block: B:28:0x0089  */
        /* JADX WARN: Code duplicated, block: B:31:0x009d  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
        
            if (r8.emit(r0, r14) == r9) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
        
            if (r8.emit(r0, r14) == r9) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
        
            if (r8.emit(r0, r14) == r9) goto L35;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.f105603y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r14.f105602x
                r10 = 5
                r11 = 4
                r12 = 3
                r1 = 2
                r2 = 1
                r13 = 0
                if (r0 == 0) goto L36
                if (r0 == r2) goto L32
                if (r0 == r1) goto L2d
                if (r0 == r12) goto L24
                if (r0 == r11) goto L24
                if (r0 != r10) goto L1c
                goto L24
            L1c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L24:
                java.lang.Object r0 = r14.f105601w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r15)
                goto Lb5
            L2d:
                p505ts.AbstractC34132o.m107864I(r15)
                r0 = r15
                goto L6b
            L32:
                p505ts.AbstractC34132o.m107864I(r15)
                goto L4b
            L36:
                p505ts.AbstractC34132o.m107864I(r15)
                nc0.e$c r0 = new nc0.e$c
                nc0.a$b r3 = nc0.InterfaceC26563a.b.f105577a
                r0.<init>(r3)
                r14.f105603y = r8
                r14.f105602x = r2
                java.lang.Object r0 = r8.emit(r0, r14)
                if (r0 != r9) goto L4b
                goto Lb4
            L4b:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                nc0.d r2 = nc0.C26566d.this
                tr2.n r2 = nc0.C26566d.m78703c(r2)
                nc0.d$b$a r4 = new nc0.d$b$a
                nc0.d r3 = nc0.C26566d.this
                r4.<init>(r3, r13)
                r14.f105603y = r8
                r14.f105602x = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                r5 = r14
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L6b
                goto Lb4
            L6b:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L85
                nc0.e$e r0 = new nc0.e$e
                nc0.f r1 = nc0.EnumC26568f.OPTED_IN_CONFIRMATION
                r0.<init>(r1)
                r14.f105603y = r13
                r14.f105601w = r13
                r14.f105602x = r12
                java.lang.Object r0 = r8.emit(r0, r14)
                if (r0 != r9) goto Lb5
                goto Lb4
            L85:
                boolean r1 = r0 instanceof u02.InterfaceC34385a.b.C42432b
                if (r1 == 0) goto L9d
                nc0.e$c r0 = new nc0.e$c
                nc0.a$c r1 = nc0.InterfaceC26563a.c.f105578a
                r0.<init>(r1)
                r14.f105603y = r13
                r14.f105601w = r13
                r14.f105602x = r11
                java.lang.Object r0 = r8.emit(r0, r14)
                if (r0 != r9) goto Lb5
                goto Lb4
            L9d:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto Lb8
                nc0.e$c r0 = new nc0.e$c
                nc0.a$d r1 = nc0.InterfaceC26563a.d.f105579a
                r0.<init>(r1)
                r14.f105603y = r13
                r14.f105601w = r13
                r14.f105602x = r10
                java.lang.Object r0 = r8.emit(r0, r14)
                if (r0 != r9) goto Lb5
            Lb4:
                return r9
            Lb5:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            Lb8:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: nc0.C26566d.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: nc0.d$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.marketingconsent.domain.MarketingConsentInteractor$interact$$inlined$flatMapLatest$1", m100430f = "MarketingConsentInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f105607w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f105608x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f105609y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C26566d f105610z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C26566d c26566d) {
            super(3, interfaceC30057d);
            this.f105610z = c26566d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC26564b abstractC26564b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f105610z);
            cVar.f105608x = interfaceC13062m;
            cVar.f105609y = abstractC26564b;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM78709i;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f105607w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f105608x;
                AbstractC26564b abstractC26564b = (AbstractC26564b) this.f105609y;
                if (abstractC26564b instanceof AbstractC26564b.e) {
                    interfaceC13058lM78709i = AbstractC13091v.m36590P(C26566d.m78713m(this.f105610z, false, 1, null), new j(null));
                } else if (abstractC26564b instanceof AbstractC26564b.c) {
                    interfaceC13058lM78709i = this.f105610z.m78714n((AbstractC26564b.c) abstractC26564b);
                } else if (abstractC26564b instanceof AbstractC26564b.d) {
                    interfaceC13058lM78709i = new C13084s1(new e(abstractC26564b, null));
                } else if (abstractC26564b instanceof AbstractC26564b.b) {
                    interfaceC13058lM78709i = new C13084s1(new f(null));
                } else if (abstractC26564b instanceof AbstractC26564b.f) {
                    interfaceC13058lM78709i = new C13084s1(new g(abstractC26564b, null));
                } else {
                    interfaceC13058lM78709i = abstractC26564b instanceof AbstractC26564b.a ? this.f105610z.m78709i(((AbstractC26564b.a) abstractC26564b).getClickAction()) : new C13084s1(new h(abstractC26564b, null));
                }
                this.f105608x = null;
                this.f105609y = null;
                this.f105607w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM78709i, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC26564b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: nc0.d$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.marketingconsent.domain.MarketingConsentInteractor$interact$1$internalActionFlow$1$1", m100430f = "MarketingConsentInteractor.kt", m100431l = {44}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnc0/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f105611w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f105612x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C26565c f105613y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C26565c c26565c, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f105613y = c26565c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f105613y, interfaceC30057d);
            dVar.f105612x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f105612x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f105611w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC26567e.b bVar = new AbstractC26567e.b(this.f105613y);
                this.f105612x = null;
                this.f105611w = 1;
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

    /* JADX INFO: renamed from: nc0.d$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.marketingconsent.domain.MarketingConsentInteractor$interact$1$internalActionFlow$2", m100430f = "MarketingConsentInteractor.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnc0/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f105614w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f105615x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC26564b f105616y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC26564b abstractC26564b, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f105616y = abstractC26564b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f105616y, interfaceC30057d);
            eVar.f105615x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f105615x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f105614w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC26567e.d dVar = new AbstractC26567e.d(((AbstractC26564b.d) this.f105616y).getModal());
                this.f105615x = null;
                this.f105614w = 1;
                if (interfaceC13062m.emit(dVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: nc0.d$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.marketingconsent.domain.MarketingConsentInteractor$interact$1$internalActionFlow$3", m100430f = "MarketingConsentInteractor.kt", m100431l = {57}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnc0/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f105617w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f105618x;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(interfaceC30057d);
            fVar.f105618x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f105618x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f105617w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC26567e.d dVar = new AbstractC26567e.d(null);
                this.f105618x = null;
                this.f105617w = 1;
                if (interfaceC13062m.emit(dVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: nc0.d$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.marketingconsent.domain.MarketingConsentInteractor$interact$1$internalActionFlow$4", m100430f = "MarketingConsentInteractor.kt", m100431l = {61}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnc0/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f105619w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f105620x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC26564b f105621y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AbstractC26564b abstractC26564b, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f105621y = abstractC26564b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = new g(this.f105621y, interfaceC30057d);
            gVar.f105620x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f105620x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f105619w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC26567e.f fVar = new AbstractC26567e.f(((AbstractC26564b.f) this.f105621y).getIsEnabled());
                this.f105620x = null;
                this.f105619w = 1;
                if (interfaceC13062m.emit(fVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: nc0.d$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.marketingconsent.domain.MarketingConsentInteractor$interact$1$internalActionFlow$5", m100430f = "MarketingConsentInteractor.kt", m100431l = {68}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnc0/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f105622w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f105623x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC26564b f105624y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AbstractC26564b abstractC26564b, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f105624y = abstractC26564b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(this.f105624y, interfaceC30057d);
            hVar.f105623x = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f105623x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f105622w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC26567e.a aVar = new AbstractC26567e.a(this.f105624y);
                this.f105623x = null;
                this.f105622w = 1;
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

    /* JADX INFO: renamed from: nc0.d$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.marketingconsent.domain.MarketingConsentInteractor$interact$2", m100430f = "MarketingConsentInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lnc0/c;", "previousState", "Lnc0/e;", "action", "<anonymous>", "(Lnc0/c;Lnc0/e;)Lnc0/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f105625w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f105626x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f105627y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C26565c c26565c, AbstractC26567e abstractC26567e, InterfaceC30057d<? super C26565c> interfaceC30057d) {
            i iVar = C26566d.this.new i(interfaceC30057d);
            iVar.f105626x = c26565c;
            iVar.f105627y = abstractC26567e;
            return iVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C26565c c26565c = (C26565c) this.f105626x;
            AbstractC26567e abstractC26567e = (AbstractC26567e) this.f105627y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f105625w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC26567e instanceof AbstractC26567e.a) {
                return C26566d.this.m78710j(c26565c, ((AbstractC26567e.a) abstractC26567e).getDomainAction());
            }
            if (abstractC26567e instanceof AbstractC26567e.b) {
                return ((AbstractC26567e.b) abstractC26567e).getDomainState();
            }
            if (abstractC26567e instanceof AbstractC26567e.c) {
                return C26565c.m78693b(c26565c, ((AbstractC26567e.c) abstractC26567e).getDialogType(), null, false, false, null, null, false, null, 254, null);
            }
            if (abstractC26567e instanceof AbstractC26567e.d) {
                return C26565c.m78693b(c26565c, null, null, false, false, null, ((AbstractC26567e.d) abstractC26567e).getModal(), false, null, 223, null);
            }
            if (abstractC26567e instanceof AbstractC26567e.f) {
                return C26565c.m78693b(c26565c, null, null, false, false, null, null, ((AbstractC26567e.f) abstractC26567e).getIsEnabled(), null, 191, null);
            }
            if (abstractC26567e instanceof AbstractC26567e.e) {
                return C26565c.m78693b(c26565c, null, null, false, false, null, null, false, ((AbstractC26567e.e) abstractC26567e).getStep(), 126, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: nc0.d$j */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.marketingconsent.domain.MarketingConsentInteractor$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "MarketingConsentInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f105629w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f105630x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f105631y;

        public j(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26565c c26565c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            j jVar = new j(interfaceC30057d);
            jVar.f105630x = interfaceC13062m;
            jVar.f105631y = c26565c;
            return jVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f105629w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f105630x;
                C13084s1 c13084s1 = new C13084s1(new d((C26565c) this.f105631y, null));
                this.f105630x = null;
                this.f105631y = null;
                this.f105629w = 1;
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
            return invoke((InterfaceC13062m) obj, (C26565c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: nc0.d$k */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.marketingconsent.domain.MarketingConsentInteractor$loadMarketingConsentCache$$inlined$cacheAPI$1", m100430f = "MarketingConsentInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f105632w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f105633x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f105634y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f105635z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f105635z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            k kVar = new k(interfaceC30057d, this.f105635z);
            kVar.f105633x = interfaceC13062m;
            kVar.f105634y = c26832c;
            return kVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f105632w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f105633x;
                C26832c c26832c = (C26832c) this.f105634y;
                InterfaceC26834e interfaceC26834e = this.f105635z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(MarketingConsentScreenResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(MarketingConsentScreenResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f105633x = null;
                this.f105634y = null;
                this.f105632w = 1;
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

    /* JADX INFO: renamed from: nc0.d$l */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f105636w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f105637x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C26566d f105638y;

        /* JADX INFO: renamed from: nc0.d$l$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f105639w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ boolean f105640x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C26566d f105641y;

            /* JADX INFO: renamed from: nc0.d$l$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.marketingconsent.domain.MarketingConsentInteractor$loadMarketingConsentCache$$inlined$map$1$2", m100430f = "MarketingConsentInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42046a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f105642E;

                /* JADX INFO: renamed from: F */
                Object f105643F;

                /* JADX INFO: renamed from: G */
                Object f105644G;

                /* JADX INFO: renamed from: H */
                int f105645H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f105646w;

                /* JADX INFO: renamed from: x */
                int f105647x;

                /* JADX INFO: renamed from: y */
                Object f105648y;

                public C42046a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f105646w = obj;
                    this.f105647x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, boolean z4, C26566d c26566d) {
                this.f105639w = interfaceC13062m;
                this.f105640x = z4;
                this.f105641y = c26566d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42046a c42046a;
                C26565c c26565cM78711k;
                if (interfaceC30057d instanceof C42046a) {
                    c42046a = (C42046a) interfaceC30057d;
                    int i13 = c42046a.f105647x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42046a.f105647x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42046a = new C42046a(interfaceC30057d);
                    }
                } else {
                    c42046a = new C42046a(interfaceC30057d);
                }
                Object obj2 = c42046a.f105646w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42046a.f105647x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f105639w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        c26565cM78711k = new C26565c(InterfaceC26563a.b.f105577a, null, false, false, null, null, false, null, 254, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        c26565cM78711k = new C26565c(null, (MarketingConsentScreenResponse) ((InterfaceC29354a.a.b) interfaceC29354a).getData(), this.f105640x, true, null, null, false, null, 241, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        c26565cM78711k = new C26565c(null, (MarketingConsentScreenResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData(), false, false, null, null, false, null, 253, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                        c26565cM78711k = new C26565c(null, (MarketingConsentScreenResponse) ((InterfaceC29354a.d) interfaceC29354a).getData(), false, false, null, null, false, null, 253, null);
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c26565cM78711k = this.f105641y.m78711k((InterfaceC29354a.c) interfaceC29354a);
                    }
                    c42046a.f105648y = null;
                    c42046a.f105642E = null;
                    c42046a.f105643F = null;
                    c42046a.f105644G = null;
                    c42046a.f105645H = 0;
                    c42046a.f105647x = 1;
                    if (interfaceC13062m.emit(c26565cM78711k, c42046a) == enumC31071a) {
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

        public l(InterfaceC13058l interfaceC13058l, boolean z4, C26566d c26566d) {
            this.f105636w = interfaceC13058l;
            this.f105637x = z4;
            this.f105638y = c26566d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f105636w.collect(new a(interfaceC13062m, this.f105637x, this.f105638y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nc0.d$m */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.marketingconsent.domain.MarketingConsentInteractor$performAction$$inlined$flatMapLatest$1", m100430f = "MarketingConsentInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class m extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f105650w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f105651x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f105652y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C26566d f105653z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC30057d interfaceC30057d, C26566d c26566d) {
            super(3, interfaceC30057d);
            this.f105653z = c26566d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC30694b abstractC30694b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            m mVar = new m(interfaceC30057d, this.f105653z);
            mVar.f105651x = interfaceC13062m;
            mVar.f105652y = abstractC30694b;
            return mVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            C0456u c0456u2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f105650w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f105651x;
                AbstractC30694b abstractC30694b = (AbstractC30694b) this.f105652y;
                if (abstractC30694b instanceof AbstractC30694b.f) {
                    c0456u = new n(C26566d.m78713m(this.f105653z, false, 1, null));
                } else if ((abstractC30694b instanceof AbstractC30694b.c) || (abstractC30694b instanceof AbstractC30694b.i)) {
                    c0456u = new C0456u(new AbstractC26567e.c(InterfaceC26563a.b.f105577a), 1);
                } else if (abstractC30694b instanceof AbstractC30694b.n) {
                    c0456u = new C0456u(new AbstractC26567e.c(InterfaceC26563a.e.f105580a), 1);
                } else {
                    if (abstractC30694b instanceof AbstractC30694b.d) {
                        c0456u2 = new C0456u(new AbstractC26567e.b(new C26565c(null, null, false, false, new InterfaceC30214a.a(((AbstractC30694b.d) abstractC30694b).getDestination()), null, false, null, 239, null)), 1);
                    } else if ((abstractC30694b instanceof AbstractC30694b.m) || (abstractC30694b instanceof AbstractC30694b.l) || (abstractC30694b instanceof AbstractC30694b.k) || (abstractC30694b instanceof AbstractC30694b.j) || (abstractC30694b instanceof AbstractC30694b.g) || (abstractC30694b instanceof AbstractC30694b.e) || (abstractC30694b instanceof AbstractC30694b.h) || (abstractC30694b instanceof AbstractC30694b.b)) {
                        c0456u = new C0456u(new AbstractC26567e.c(null), 1);
                    } else {
                        if (!(abstractC30694b instanceof AbstractC30694b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c0456u2 = new C0456u(new AbstractC26567e.c(AbstractC39414r.m125876U(((AbstractC30694b.a) abstractC30694b).getMessage(), "network", true) ? InterfaceC26563a.c.f105578a : InterfaceC26563a.d.f105579a), 1);
                    }
                    c0456u = c0456u2;
                }
                this.f105651x = null;
                this.f105652y = null;
                this.f105650w = 1;
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

    /* JADX INFO: renamed from: nc0.d$n */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f105654w;

        /* JADX INFO: renamed from: nc0.d$n$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f105655w;

            /* JADX INFO: renamed from: nc0.d$n$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.marketingconsent.domain.MarketingConsentInteractor$performAction$lambda$0$$inlined$map$1$2", m100430f = "MarketingConsentInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42047a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f105656E;

                /* JADX INFO: renamed from: F */
                Object f105657F;

                /* JADX INFO: renamed from: G */
                Object f105658G;

                /* JADX INFO: renamed from: H */
                int f105659H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f105660w;

                /* JADX INFO: renamed from: x */
                int f105661x;

                /* JADX INFO: renamed from: y */
                Object f105662y;

                public C42047a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f105660w = obj;
                    this.f105661x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f105655w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42047a c42047a;
                if (interfaceC30057d instanceof C42047a) {
                    c42047a = (C42047a) interfaceC30057d;
                    int i13 = c42047a.f105661x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42047a.f105661x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42047a = new C42047a(interfaceC30057d);
                    }
                } else {
                    c42047a = new C42047a(interfaceC30057d);
                }
                Object obj2 = c42047a.f105660w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42047a.f105661x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f105655w;
                    AbstractC26567e.b bVar = new AbstractC26567e.b((C26565c) obj);
                    c42047a.f105662y = null;
                    c42047a.f105656E = null;
                    c42047a.f105657F = null;
                    c42047a.f105658G = null;
                    c42047a.f105659H = 0;
                    c42047a.f105661x = 1;
                    if (interfaceC13062m.emit(bVar, c42047a) == enumC31071a) {
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

        public n(InterfaceC13058l interfaceC13058l) {
            this.f105654w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f105654w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C26566d(InterfaceC26834e cachedApiSource, C30695c actionInteractor, PrivacyConsentApi privacyConsentApi) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(actionInteractor, "actionInteractor");
        AbstractC22676k.m65750j(privacyConsentApi, "privacyConsentApi");
        this.cachedApiSource = cachedApiSource;
        this.actionInteractor = actionInteractor;
        this.privacyConsentApi = privacyConsentApi;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("MarketingConsentInteractor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final InterfaceC13058l m78709i(EnumC27816a clickAction) {
        int i13 = a.f105600a[clickAction.ordinal()];
        if (i13 == 1) {
            return new C0456u(new AbstractC26567e.e(EnumC26568f.SKIPPED_CONFIRMATION), 1);
        }
        if (i13 == 2) {
            return new C13084s1(new b(null));
        }
        if (i13 == 3 || i13 == 4) {
            return new C0456u(new AbstractC26567e.b(new C26565c(null, null, false, false, InterfaceC30214a.d.f123676a, null, false, null, 239, null)), 1);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final C26565c m78710j(C26565c previousState, AbstractC26564b action) {
        return previousState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final C26565c m78711k(InterfaceC29354a.c<MarketingConsentScreenResponse> cacheResult) {
        return AbstractC29355b.m89462a(cacheResult) ? new C26565c(InterfaceC26563a.d.f105579a, null, false, false, null, null, false, null, 254, null) : new C26565c(InterfaceC26563a.c.f105578a, null, false, false, null, null, false, null, 254, null);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m78712l(boolean manualRefresh) {
        return new l(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetMarketingConsentRequest(), 1), AbstractC12350b.m34570S("marketing_consent_SCOPE"), null, 2, null), new k(null, this.cachedApiSource)), manualRefresh, this);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ InterfaceC13058l m78713m(C26566d c26566d, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        return c26566d.m78712l(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final InterfaceC13058l m78714n(AbstractC26564b.c action) {
        return AbstractC13091v.m36590P(this.actionInteractor.interact(new C0456u(new C30698f(action.getAction()), 1)), new m(null, this));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C26565c(InterfaceC26563a.b.f105577a, null, false, false, null, null, false, null, 254, null), AbstractC13091v.m36590P(upstream, new c(null, this)), new i(null));
    }
}
