package df0;

import android.net.Uri;
import c93.InterfaceC4351m;
import com.whoop.advancedlabs.domain.AdvancedLabsApi;
import com.whoop.advancedlabs.domain.models.ClinicalIntakeStatusResponse;
import com.whoop.advancedlabs.multiconsentscreen.domain.models.ConsentAction;
import com.whoop.advancedlabs.multiconsentscreen.domain.models.MultiConsentResponse;
import ec3.AbstractC13091v;
import ec3.C13054k;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.Locale;
import js0.AbstractC21909c;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p088dc.AbstractC11895b;
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
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: df0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002,.B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0082@¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\u001b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0082@¢\u0006\u0004\b\u001b\u0010\u0010J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u001e\u0010\u0012J'\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010#J\u0019\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b(\u0010)J#\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0016¢\u0006\u0004\b+\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, m65681d2 = {"Ldf0/c;", "Lod1/g;", "Ldf0/a;", "Ldf0/b;", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "api", "Ljs0/c;", "configurationRepository", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Ljs0/c;Ltr2/n;)V", "", "testTokenId", "testType", "o", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "m", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "n", "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;", "u", "(Ljava/lang/String;)Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;", "consentAction", "consentRequiredResult", "q", "(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;Ljava/lang/String;Ldf0/b;Lq83/d;)Ljava/lang/Object;", "l", "Lu02/a;", "Lcom/whoop/advancedlabs/domain/models/ClinicalIntakeStatusResponse;", "p", "Lec3/l;", "t", "(Ljava/lang/String;Ljava/lang/String;)Lec3/l;", "r", "(Lec3/l;)Lec3/l;", "v", "Landroid/net/Uri;", "uri", "", "s", "(Landroid/net/Uri;)Z", "upstream", "interact", "a", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "b", "Ljs0/c;", "c", "Ltr2/n;", "d", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11999c implements InterfaceC27844g<AbstractC11997a, AbstractC11998b> {

    /* JADX INFO: renamed from: e */
    public static final int f39505e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AdvancedLabsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: df0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.typeformwebview.domain.AdvancedLabsTypeformWebviewInteractor", m100430f = "AdvancedLabsTypeformWebviewInteractor.kt", m100431l = {171}, m100432m = "checkClinicalIntakeStatusAfterSubmission", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f39513E;

        /* JADX INFO: renamed from: w */
        Object f39514w;

        /* JADX INFO: renamed from: x */
        Object f39515x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f39516y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f39516y = obj;
            this.f39513E |= Integer.MIN_VALUE;
            return C11999c.this.m33058l(null, null, this);
        }
    }

    /* JADX INFO: renamed from: df0.c$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.typeformwebview.domain.AdvancedLabsTypeformWebviewInteractor", m100430f = "AdvancedLabsTypeformWebviewInteractor.kt", m100431l = {101}, m100432m = "checkInitialClinicalIntakeStatus", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f39518E;

        /* JADX INFO: renamed from: w */
        Object f39519w;

        /* JADX INFO: renamed from: x */
        Object f39520x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f39521y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f39521y = obj;
            this.f39518E |= Integer.MIN_VALUE;
            return C11999c.this.m33061o(null, null, this);
        }
    }

    /* JADX INFO: renamed from: df0.c$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.typeformwebview.domain.AdvancedLabsTypeformWebviewInteractor$fetchClinicalIntakeStatus$2", m100430f = "AdvancedLabsTypeformWebviewInteractor.kt", m100431l = {187}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/advancedlabs/domain/models/ClinicalIntakeStatusResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f39523w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f39525y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f39525y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C11999c.this.new e(this.f39525y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39523w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AdvancedLabsApi advancedLabsApi = C11999c.this.api;
            String str = this.f39525y;
            this.f39523w = 1;
            Object clinicalIntakeStatus = advancedLabsApi.getClinicalIntakeStatus(str, this);
            return clinicalIntakeStatus == enumC31071a ? enumC31071a : clinicalIntakeStatus;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ClinicalIntakeStatusResponse> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: df0.c$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.typeformwebview.domain.AdvancedLabsTypeformWebviewInteractor", m100430f = "AdvancedLabsTypeformWebviewInteractor.kt", m100431l = {150}, m100432m = "fetchConsentStatus", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f39527F;

        /* JADX INFO: renamed from: w */
        Object f39528w;

        /* JADX INFO: renamed from: x */
        Object f39529x;

        /* JADX INFO: renamed from: y */
        Object f39530y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f39531z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f39531z = obj;
            this.f39527F |= Integer.MIN_VALUE;
            return C11999c.this.m33063q(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: df0.c$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.typeformwebview.domain.AdvancedLabsTypeformWebviewInteractor$fetchConsentStatus$response$1", m100430f = "AdvancedLabsTypeformWebviewInteractor.kt", m100431l = {151}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f39532w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ConsentAction f39534y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f39535z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ConsentAction consentAction, String str, InterfaceC30057d<? super g> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f39534y = consentAction;
            this.f39535z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C11999c.this.new g(this.f39534y, this.f39535z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39532w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AdvancedLabsApi advancedLabsApi = C11999c.this.api;
            ConsentAction consentAction = this.f39534y;
            String str = this.f39535z;
            this.f39532w = 1;
            Object multiConsent = advancedLabsApi.getMultiConsent(consentAction, str, this);
            return multiConsent == enumC31071a ? enumC31071a : multiConsent;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super MultiConsentResponse> interfaceC30057d) {
            return ((g) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: df0.c$h */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f39536w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C11999c f39537x;

        /* JADX INFO: renamed from: df0.c$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f39538w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11999c f39539x;

            /* JADX INFO: renamed from: df0.c$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.typeformwebview.domain.AdvancedLabsTypeformWebviewInteractor$filterForCompletionUrls$$inlined$filter$1$2", m100430f = "AdvancedLabsTypeformWebviewInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41466a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f39541F;

                /* JADX INFO: renamed from: G */
                Object f39542G;

                /* JADX INFO: renamed from: H */
                int f39543H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f39544w;

                /* JADX INFO: renamed from: x */
                int f39545x;

                /* JADX INFO: renamed from: y */
                Object f39546y;

                /* JADX INFO: renamed from: z */
                Object f39547z;

                public C41466a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f39544w = obj;
                    this.f39545x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C11999c c11999c) {
                this.f39538w = interfaceC13062m;
                this.f39539x = c11999c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41466a c41466a;
                if (interfaceC30057d instanceof C41466a) {
                    c41466a = (C41466a) interfaceC30057d;
                    int i13 = c41466a.f39545x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41466a.f39545x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41466a = new C41466a(interfaceC30057d);
                    }
                } else {
                    c41466a = new C41466a(interfaceC30057d);
                }
                Object obj2 = c41466a.f39544w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41466a.f39545x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f39538w;
                    AbstractC11997a abstractC11997a = (AbstractC11997a) obj;
                    if (!(abstractC11997a instanceof AbstractC11997a.f) || this.f39539x.m33065s(((AbstractC11997a.f) abstractC11997a).getUri())) {
                        c41466a.f39546y = null;
                        c41466a.f39547z = null;
                        c41466a.f39541F = null;
                        c41466a.f39542G = null;
                        c41466a.f39543H = 0;
                        c41466a.f39545x = 1;
                        if (interfaceC13062m.emit(obj, c41466a) == enumC31071a) {
                            return enumC31071a;
                        }
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

        public h(InterfaceC13058l interfaceC13058l, C11999c c11999c) {
            this.f39536w = interfaceC13058l;
            this.f39537x = c11999c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f39536w.collect(new a(interfaceC13062m, this.f39537x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: df0.c$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.typeformwebview.domain.AdvancedLabsTypeformWebviewInteractor$interact$1", m100430f = "AdvancedLabsTypeformWebviewInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ldf0/c$b;", "previousState", "Ldf0/a;", "action", "<anonymous>", "(Ldf0/c$b;Ldf0/a;)Ldf0/c$b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f39548w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f39549x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f39550y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b bVar, AbstractC11997a abstractC11997a, InterfaceC30057d<? super b> interfaceC30057d) {
            i iVar = new i(interfaceC30057d);
            iVar.f39549x = bVar;
            iVar.f39550y = abstractC11997a;
            return iVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            b bVar = (b) this.f39549x;
            AbstractC11997a abstractC11997a = (AbstractC11997a) this.f39550y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f39548w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC11997a instanceof AbstractC11997a.h) {
                AbstractC11997a.h hVar = (AbstractC11997a.h) abstractC11997a;
                String testTokenId = hVar.getTestTokenId();
                String testType = hVar.getTestType();
                if (testType == null) {
                    testType = bVar.getTestType();
                }
                return b.m33069b(bVar, testTokenId, testType, abstractC11997a, false, 8, null);
            }
            if (!(abstractC11997a instanceof AbstractC11997a.a)) {
                return abstractC11997a instanceof AbstractC11997a.g ? b.m33069b(bVar, null, null, abstractC11997a, true, 3, null) : b.m33069b(bVar, null, null, abstractC11997a, false, 11, null);
            }
            String testType2 = ((AbstractC11997a.a) abstractC11997a).getTestType();
            if (testType2 == null) {
                testType2 = bVar.getTestType();
            }
            return b.m33069b(bVar, null, testType2, abstractC11997a, false, 9, null);
        }
    }

    /* JADX INFO: renamed from: df0.c$j */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.typeformwebview.domain.AdvancedLabsTypeformWebviewInteractor$interact$2", m100430f = "AdvancedLabsTypeformWebviewInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ldf0/c$b;", "internalState", "Lec3/l;", "Ldf0/b;", "<anonymous>", "(Ldf0/c$b;)Lec3/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f39551w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f39552x;

        /* JADX INFO: renamed from: df0.c$j$a */
        @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.typeformwebview.domain.AdvancedLabsTypeformWebviewInteractor$interact$2$1", m100430f = "AdvancedLabsTypeformWebviewInteractor.kt", m100431l = {65, 66, 66}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldf0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ b f39554E;

            /* JADX INFO: renamed from: w */
            Object f39555w;

            /* JADX INFO: renamed from: x */
            int f39556x;

            /* JADX INFO: renamed from: y */
            private /* synthetic */ Object f39557y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C11999c f39558z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C11999c c11999c, b bVar, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f39558z = c11999c;
                this.f39554E = bVar;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f39558z, this.f39554E, interfaceC30057d);
                aVar.f39557y = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
            
                if (r0.emit(r8, r7) == r1) goto L20;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = r7.f39557y
                    ec3.m r0 = (ec3.InterfaceC13062m) r0
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r7.f39556x
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    r6 = 0
                    if (r2 == 0) goto L2c
                    if (r2 == r5) goto L28
                    if (r2 == r4) goto L20
                    if (r2 != r3) goto L18
                    p505ts.AbstractC34132o.m107864I(r8)
                    goto L64
                L18:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L20:
                    java.lang.Object r0 = r7.f39555w
                    ec3.m r0 = (ec3.InterfaceC13062m) r0
                    p505ts.AbstractC34132o.m107864I(r8)
                    goto L57
                L28:
                    p505ts.AbstractC34132o.m107864I(r8)
                    goto L3c
                L2c:
                    p505ts.AbstractC34132o.m107864I(r8)
                    df0.b$c r8 = df0.AbstractC11998b.c.f39498a
                    r7.f39557y = r0
                    r7.f39556x = r5
                    java.lang.Object r8 = r0.emit(r8, r7)
                    if (r8 != r1) goto L3c
                    goto L63
                L3c:
                    df0.c r8 = r7.f39558z
                    df0.c$b r2 = r7.f39554E
                    java.lang.String r2 = r2.getTestTokenId()
                    df0.c$b r5 = r7.f39554E
                    java.lang.String r5 = r5.getTestType()
                    r7.f39557y = r6
                    r7.f39555w = r0
                    r7.f39556x = r4
                    java.lang.Object r8 = df0.C11999c.m33052f(r8, r2, r5, r7)
                    if (r8 != r1) goto L57
                    goto L63
                L57:
                    r7.f39557y = r6
                    r7.f39555w = r6
                    r7.f39556x = r3
                    java.lang.Object r8 = r0.emit(r8, r7)
                    if (r8 != r1) goto L64
                L63:
                    return r1
                L64:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: df0.C11999c.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: df0.c$j$b */
        @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.typeformwebview.domain.AdvancedLabsTypeformWebviewInteractor$interact$2$2", m100430f = "AdvancedLabsTypeformWebviewInteractor.kt", m100431l = {72, 73}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldf0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f39559w;

            /* JADX INFO: renamed from: x */
            private /* synthetic */ Object f39560x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C11999c f39561y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ b f39562z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C11999c c11999c, b bVar, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f39561y = c11999c;
                this.f39562z = bVar;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                b bVar = new b(this.f39561y, this.f39562z, interfaceC30057d);
                bVar.f39560x = obj;
                return bVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
            
                if (ec3.AbstractC13091v.m36613w(r0, r6, r5) == r1) goto L15;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = r5.f39560x
                    ec3.m r0 = (ec3.InterfaceC13062m) r0
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r5.f39559w
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L20
                    if (r2 == r4) goto L1c
                    if (r2 != r3) goto L14
                    p505ts.AbstractC34132o.m107864I(r6)
                    goto L4e
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
                    df0.b$c r6 = df0.AbstractC11998b.c.f39498a
                    r5.f39560x = r0
                    r5.f39559w = r4
                    java.lang.Object r6 = r0.emit(r6, r5)
                    if (r6 != r1) goto L30
                    goto L4d
                L30:
                    df0.c r6 = r5.f39561y
                    df0.c$b r2 = r5.f39562z
                    java.lang.String r2 = r2.getTestTokenId()
                    df0.c$b r4 = r5.f39562z
                    java.lang.String r4 = r4.getTestType()
                    ec3.l r6 = df0.C11999c.m33057k(r6, r2, r4)
                    r2 = 0
                    r5.f39560x = r2
                    r5.f39559w = r3
                    java.lang.Object r6 = ec3.AbstractC13091v.m36613w(r0, r6, r5)
                    if (r6 != r1) goto L4e
                L4d:
                    return r1
                L4e:
                    l83.a0 r6 = l83.C23454a0.f92919a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: df0.C11999c.j.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: df0.c$j$c */
        @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.typeformwebview.domain.AdvancedLabsTypeformWebviewInteractor$interact$2$3", m100430f = "AdvancedLabsTypeformWebviewInteractor.kt", m100431l = {87, 88, 88}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldf0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class c extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ b f39563E;

            /* JADX INFO: renamed from: w */
            Object f39564w;

            /* JADX INFO: renamed from: x */
            int f39565x;

            /* JADX INFO: renamed from: y */
            private /* synthetic */ Object f39566y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C11999c f39567z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C11999c c11999c, b bVar, InterfaceC30057d<? super c> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f39567z = c11999c;
                this.f39563E = bVar;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                c cVar = new c(this.f39567z, this.f39563E, interfaceC30057d);
                cVar.f39566y = obj;
                return cVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
            
                if (r0.emit(r8, r7) == r1) goto L20;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = r7.f39566y
                    ec3.m r0 = (ec3.InterfaceC13062m) r0
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r7.f39565x
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    r6 = 0
                    if (r2 == 0) goto L2c
                    if (r2 == r5) goto L28
                    if (r2 == r4) goto L20
                    if (r2 != r3) goto L18
                    p505ts.AbstractC34132o.m107864I(r8)
                    goto L5e
                L18:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L20:
                    java.lang.Object r0 = r7.f39564w
                    ec3.m r0 = (ec3.InterfaceC13062m) r0
                    p505ts.AbstractC34132o.m107864I(r8)
                    goto L51
                L28:
                    p505ts.AbstractC34132o.m107864I(r8)
                    goto L3c
                L2c:
                    p505ts.AbstractC34132o.m107864I(r8)
                    df0.b$c r8 = df0.AbstractC11998b.c.f39498a
                    r7.f39566y = r0
                    r7.f39565x = r5
                    java.lang.Object r8 = r0.emit(r8, r7)
                    if (r8 != r1) goto L3c
                    goto L5d
                L3c:
                    df0.c r8 = r7.f39567z
                    df0.c$b r2 = r7.f39563E
                    java.lang.String r2 = r2.getTestType()
                    r7.f39566y = r6
                    r7.f39564w = r0
                    r7.f39565x = r4
                    java.lang.Object r8 = df0.C11999c.m33050d(r8, r2, r7)
                    if (r8 != r1) goto L51
                    goto L5d
                L51:
                    r7.f39566y = r6
                    r7.f39564w = r6
                    r7.f39565x = r3
                    java.lang.Object r8 = r0.emit(r8, r7)
                    if (r8 != r1) goto L5e
                L5d:
                    return r1
                L5e:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: df0.C11999c.j.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: df0.c$j$d */
        @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.typeformwebview.domain.AdvancedLabsTypeformWebviewInteractor$interact$2$4", m100430f = "AdvancedLabsTypeformWebviewInteractor.kt", m100431l = {93, 94, 94}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldf0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class d extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ b f39568E;

            /* JADX INFO: renamed from: w */
            Object f39569w;

            /* JADX INFO: renamed from: x */
            int f39570x;

            /* JADX INFO: renamed from: y */
            private /* synthetic */ Object f39571y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C11999c f39572z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(C11999c c11999c, b bVar, InterfaceC30057d<? super d> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f39572z = c11999c;
                this.f39568E = bVar;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                d dVar = new d(this.f39572z, this.f39568E, interfaceC30057d);
                dVar.f39571y = obj;
                return dVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
            
                if (r0.emit(r8, r7) == r1) goto L20;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = r7.f39571y
                    ec3.m r0 = (ec3.InterfaceC13062m) r0
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r7.f39570x
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    r6 = 0
                    if (r2 == 0) goto L2c
                    if (r2 == r5) goto L28
                    if (r2 == r4) goto L20
                    if (r2 != r3) goto L18
                    p505ts.AbstractC34132o.m107864I(r8)
                    goto L5e
                L18:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L20:
                    java.lang.Object r0 = r7.f39569w
                    ec3.m r0 = (ec3.InterfaceC13062m) r0
                    p505ts.AbstractC34132o.m107864I(r8)
                    goto L51
                L28:
                    p505ts.AbstractC34132o.m107864I(r8)
                    goto L3c
                L2c:
                    p505ts.AbstractC34132o.m107864I(r8)
                    df0.b$c r8 = df0.AbstractC11998b.c.f39498a
                    r7.f39571y = r0
                    r7.f39570x = r5
                    java.lang.Object r8 = r0.emit(r8, r7)
                    if (r8 != r1) goto L3c
                    goto L5d
                L3c:
                    df0.c r8 = r7.f39572z
                    df0.c$b r2 = r7.f39568E
                    java.lang.String r2 = r2.getTestType()
                    r7.f39571y = r6
                    r7.f39569w = r0
                    r7.f39570x = r4
                    java.lang.Object r8 = df0.C11999c.m33051e(r8, r2, r7)
                    if (r8 != r1) goto L51
                    goto L5d
                L51:
                    r7.f39571y = r6
                    r7.f39569w = r6
                    r7.f39570x = r3
                    java.lang.Object r8 = r0.emit(r8, r7)
                    if (r8 != r1) goto L5e
                L5d:
                    return r1
                L5e:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: df0.C11999c.j.d.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            j jVar = C11999c.this.new j(interfaceC30057d);
            jVar.f39552x = obj;
            return jVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b bVar, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            return ((j) create(bVar, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            b bVar = (b) this.f39552x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f39551w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC11997a action = bVar.getAction();
            if (action instanceof AbstractC11997a.h) {
                return new C13084s1(new a(C11999c.this, bVar, null));
            }
            if ((action instanceof AbstractC11997a.f) || (action instanceof AbstractC11997a.e)) {
                return new C13084s1(new b(C11999c.this, bVar, null));
            }
            if (action instanceof AbstractC11997a.d) {
                return new C0456u(AbstractC11998b.c.f39498a, 1);
            }
            if (action instanceof AbstractC11997a.b) {
                return new C0456u(AbstractC11998b.b.f39497a, 1);
            }
            if (action instanceof AbstractC11997a.c) {
                return C13054k.f45116w;
            }
            if (action instanceof AbstractC11997a.a) {
                return new C13084s1(new c(C11999c.this, bVar, null));
            }
            if (action instanceof AbstractC11997a.g) {
                return new C13084s1(new d(C11999c.this, bVar, null));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: df0.c$k */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.typeformwebview.domain.AdvancedLabsTypeformWebviewInteractor$pollClinicalIntakeStatus$1", m100430f = "AdvancedLabsTypeformWebviewInteractor.kt", m100431l = {204, 207, 212, 218}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldf0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        long f39573E;

        /* JADX INFO: renamed from: F */
        long f39574F;

        /* JADX INFO: renamed from: G */
        long f39575G;

        /* JADX INFO: renamed from: H */
        int f39576H;

        /* JADX INFO: renamed from: I */
        private /* synthetic */ Object f39577I;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ String f39579K;

        /* JADX INFO: renamed from: L */
        final /* synthetic */ String f39580L;

        /* JADX INFO: renamed from: w */
        Object f39581w;

        /* JADX INFO: renamed from: x */
        int f39582x;

        /* JADX INFO: renamed from: y */
        int f39583y;

        /* JADX INFO: renamed from: z */
        int f39584z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, String str2, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f39579K = str;
            this.f39580L = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            k kVar = C11999c.this.new k(this.f39579K, this.f39580L, interfaceC30057d);
            kVar.f39577I = obj;
            return kVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0214  */
        /* JADX WARN: Code duplicated, block: B:103:0x022f  */
        /* JADX WARN: Code duplicated, block: B:19:0x0094  */
        /* JADX WARN: Code duplicated, block: B:53:0x0145  */
        /* JADX WARN: Code duplicated, block: B:87:0x01c9  */
        /* JADX WARN: Code duplicated, block: B:88:0x01cb  */
        /* JADX WARN: Code duplicated, block: B:92:0x01eb  */
        /* JADX WARN: Code duplicated, block: B:95:0x01f8  */
        /* JADX WARN: Code duplicated, block: B:98:0x0211  */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x022c, code lost:
        
            if (r1.emit(r7, r20) == r2) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x0259, code lost:
        
            if (bc3.AbstractC3034m0.m8782b(r7, r20) == r2) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x020e, code lost:
        
            if (r1.emit(r11, r20) == r2) goto L105;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x0259 -> B:9:0x0029). Please report as a decompilation issue!!! */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 631
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: df0.C11999c.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: df0.c$l */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.typeformwebview.domain.AdvancedLabsTypeformWebviewInteractor$validateAndTransformInitialization$1", m100430f = "AdvancedLabsTypeformWebviewInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ldf0/a;", "action", "Lec3/l;", "<anonymous>", "(Ldf0/a;)Lec3/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f39585w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f39586x;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            l lVar = new l(interfaceC30057d);
            lVar.f39586x = obj;
            return lVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC11997a abstractC11997a, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            return ((l) create(abstractC11997a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC11997a abstractC11997a = (AbstractC11997a) this.f39586x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f39585w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!(abstractC11997a instanceof AbstractC11997a.c)) {
                return new C0456u(abstractC11997a, 1);
            }
            AbstractC11997a.c cVar = (AbstractC11997a.c) abstractC11997a;
            return (cVar.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String() == null || cVar.getTestTokenId() == null) ? new C0456u(AbstractC11997a.b.f39486a, 1) : new C0456u(new AbstractC11997a.h(cVar.getTestTokenId(), cVar.getTestType()), 1);
        }
    }

    public C11999c(AdvancedLabsApi api, AbstractC21909c configurationRepository, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.configurationRepository = configurationRepository;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m33058l(String str, String str2, InterfaceC30057d<? super AbstractC11998b> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f39513E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f39513E = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM33062p = cVar.f39516y;
        Object obj = EnumC31071a.f128113w;
        int i14 = cVar.f39513E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM33062p);
            cVar.f39514w = null;
            cVar.f39515x = str2;
            cVar.f39513E = 1;
            objM33062p = m33062p(str, cVar);
            if (objM33062p == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) cVar.f39515x;
            AbstractC34132o.m107864I(objM33062p);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM33062p;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return ((ClinicalIntakeStatusResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).getHasCompletedClinicalIntake() ? new AbstractC11998b.e(str2) : AbstractC11998b.g.f39503a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC11998b.g.f39503a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final Object m33059m(String str, InterfaceC30057d<? super AbstractC11998b> interfaceC30057d) {
        ConsentAction consentActionM33067u = m33067u(str);
        return m33063q(consentActionM33067u, str, new AbstractC11998b.d(consentActionM33067u, str), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final Object m33060n(String str, InterfaceC30057d<? super AbstractC11998b> interfaceC30057d) {
        return m33063q(m33067u(str), str, AbstractC11998b.f.f39502a, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m33061o(String str, String str2, InterfaceC30057d<? super AbstractC11998b> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f39518E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f39518E = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM33062p = dVar.f39521y;
        Object obj = EnumC31071a.f128113w;
        int i14 = dVar.f39518E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM33062p);
            dVar.f39519w = null;
            dVar.f39520x = str2;
            dVar.f39518E = 1;
            objM33062p = m33062p(str, dVar);
            if (objM33062p == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) dVar.f39520x;
            AbstractC34132o.m107864I(objM33062p);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM33062p;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return ((ClinicalIntakeStatusResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).getHasCompletedClinicalIntake() ? new AbstractC11998b.e(str2) : AbstractC11998b.a.f39496a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC11998b.a.f39496a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: p */
    private final Object m33062p(String str, InterfaceC30057d<? super InterfaceC34385a<ClinicalIntakeStatusResponse>> interfaceC30057d) {
        return InterfaceC34385a.Companion.m108729b(InterfaceC34385a.INSTANCE, this.logger, null, null, new e(str, null), interfaceC30057d, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: q */
    public final Object m33063q(ConsentAction consentAction, String str, AbstractC11998b abstractC11998b, InterfaceC30057d<? super AbstractC11998b> interfaceC30057d) {
        f fVar;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f39527F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f39527F = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        f fVar2 = fVar;
        Object objM108729b = fVar2.f39531z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar2.f39527F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            g gVar = new g(consentAction, str, null);
            fVar2.f39528w = null;
            fVar2.f39529x = null;
            fVar2.f39530y = abstractC11998b;
            fVar2.f39527F = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, gVar, fVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC11998b = (AbstractC11998b) fVar2.f39530y;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            MultiConsentResponse multiConsentResponse = (MultiConsentResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
            return (multiConsentResponse == null || multiConsentResponse.getConsentModels().isEmpty()) ? AbstractC11998b.a.f39496a : abstractC11998b;
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        this.logger.mo85222m(AbstractC11266d.m30461o("Failed to fetch consent status: ", ((InterfaceC34385a.b) interfaceC34385a).getErrorMessage()), new AbstractC30556a.a[0]);
        return AbstractC11998b.a.f39496a;
    }

    /* JADX INFO: renamed from: r */
    private final InterfaceC13058l m33064r(InterfaceC13058l interfaceC13058l) {
        return new h(interfaceC13058l, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final boolean m33065s(Uri uri) {
        String string;
        if (uri == null || (string = uri.toString()) == null) {
            return false;
        }
        return AbstractC39414r.m125876U(string, "complete-submission", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final InterfaceC13058l m33066t(String testTokenId, String testType) {
        return new C13084s1(new k(testTokenId, testType, null));
    }

    /* JADX INFO: renamed from: u */
    private final ConsentAction m33067u(String testType) {
        String upperCase;
        if (testType != null) {
            upperCase = testType.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        return AbstractC22676k.m65745e(upperCase, "GALLERI") ? ConsentAction.GALLERI_SCHEDULING : ConsentAction.SCHEDULING;
    }

    /* JADX INFO: renamed from: v */
    private final InterfaceC13058l m33068v(InterfaceC13058l interfaceC13058l) {
        return AbstractC13091v.m36578D(new l(null), interfaceC13058l);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36578D(new j(null), new C13060l1(new b(null, null, null, false, 15, null), m33068v(m33064r(upstream)), new i(null)));
    }

    /* JADX INFO: renamed from: df0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Ldf0/c$b;", "", "", "testTokenId", "testType", "Ldf0/a;", "action", "", "hasCompletedConsentCheck", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ldf0/a;Z)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ldf0/a;Z)Ldf0/c$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "e", "c", "Ldf0/a;", "()Ldf0/a;", "Z", "getHasCompletedConsentCheck", "()Z", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String testTokenId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String testType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final AbstractC11997a action;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean hasCompletedConsentCheck;

        public b(String testTokenId, String str, AbstractC11997a action, boolean z4) {
            AbstractC22676k.m65750j(testTokenId, "testTokenId");
            AbstractC22676k.m65750j(action, "action");
            this.testTokenId = testTokenId;
            this.testType = str;
            this.action = action;
            this.hasCompletedConsentCheck = z4;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ b m33069b(b bVar, String str, String str2, AbstractC11997a abstractC11997a, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = bVar.testTokenId;
            }
            if ((i13 & 2) != 0) {
                str2 = bVar.testType;
            }
            if ((i13 & 4) != 0) {
                abstractC11997a = bVar.action;
            }
            if ((i13 & 8) != 0) {
                z4 = bVar.hasCompletedConsentCheck;
            }
            return bVar.m33070a(str, str2, abstractC11997a, z4);
        }

        /* JADX INFO: renamed from: a */
        public final b m33070a(String testTokenId, String testType, AbstractC11997a action, boolean hasCompletedConsentCheck) {
            AbstractC22676k.m65750j(testTokenId, "testTokenId");
            AbstractC22676k.m65750j(action, "action");
            return new b(testTokenId, testType, action, hasCompletedConsentCheck);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AbstractC11997a getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTestTokenId() {
            return this.testTokenId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTestType() {
            return this.testType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.testTokenId, bVar.testTokenId) && AbstractC22676k.m65745e(this.testType, bVar.testType) && AbstractC22676k.m65745e(this.action, bVar.action) && this.hasCompletedConsentCheck == bVar.hasCompletedConsentCheck;
        }

        public int hashCode() {
            int iHashCode = this.testTokenId.hashCode() * 31;
            String str = this.testType;
            return Boolean.hashCode(this.hasCompletedConsentCheck) + ((this.action.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public String toString() {
            String str = this.testTokenId;
            String str2 = this.testType;
            AbstractC11997a abstractC11997a = this.action;
            boolean z4 = this.hasCompletedConsentCheck;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("InternalState(testTokenId=", str, ", testType=", str2, ", action=");
            sbM32001t.append(abstractC11997a);
            sbM32001t.append(", hasCompletedConsentCheck=");
            sbM32001t.append(z4);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        public /* synthetic */ b(String str, String str2, AbstractC11997a abstractC11997a, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? AbstractC11997a.d.f39490a : abstractC11997a, (i13 & 8) != 0 ? false : z4);
        }
    }

    public /* synthetic */ C11999c(AdvancedLabsApi advancedLabsApi, AbstractC21909c abstractC21909c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(advancedLabsApi, abstractC21909c, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AdvancedLabsTypeformWebviewInteractor") : interfaceC34116n);
    }
}
