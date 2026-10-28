package f70;

import com.whoop.activation.domain.ActivationApi;
import com.whoop.activation.domain.ActivationAuthenticatedApi;
import com.whoop.activation.domain.models.PostPairingEmailResponse;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: f70.v0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ:\u0010\u0012\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lf70/v0;", "", "Lcom/whoop/activation/domain/ActivationApi;", "activationApi", "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "activationAuthenticatedApi", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Ltr2/n;)V", "", "accessToken", "strapSignature", "", "specifiedIndex", "Lf70/q0;", "memberInfo", "Lf70/e;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lf70/q0;Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/activation/domain/ActivationApi;", "b", "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14211v0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ActivationApi activationApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ActivationAuthenticatedApi activationAuthenticatedApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f70.v0$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.PostPairingHelper", m100430f = "PostPairingHelper.kt", m100431l = {26, 33}, m100432m = "fetchPostPairingEmailScreen", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f51705E;

        /* JADX INFO: renamed from: F */
        int f51706F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f51707G;

        /* JADX INFO: renamed from: I */
        int f51709I;

        /* JADX INFO: renamed from: w */
        Object f51710w;

        /* JADX INFO: renamed from: x */
        Object f51711x;

        /* JADX INFO: renamed from: y */
        Object f51712y;

        /* JADX INFO: renamed from: z */
        Object f51713z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51707G = obj;
            this.f51709I |= Integer.MIN_VALUE;
            return C14211v0.this.m40614c(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: f70.v0$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.PostPairingHelper$fetchPostPairingEmailScreen$response$1$1", m100430f = "PostPairingHelper.kt", m100431l = {27}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/activation/domain/models/PostPairingEmailResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51714w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f51716y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51716y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14211v0.this.new b(this.f51716y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51714w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivationAuthenticatedApi activationAuthenticatedApi = C14211v0.this.activationAuthenticatedApi;
            String str = this.f51716y;
            this.f51714w = 1;
            Object postPairingAuthScreens = activationAuthenticatedApi.getPostPairingAuthScreens(str, this);
            return postPairingAuthScreens == enumC31071a ? enumC31071a : postPairingAuthScreens;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super PostPairingEmailResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: f70.v0$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.PostPairingHelper$fetchPostPairingEmailScreen$response$2$1", m100430f = "PostPairingHelper.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/activation/domain/models/PostPairingEmailResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51717w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f51719y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51719y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14211v0.this.new c(this.f51719y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51717w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivationApi activationApi = C14211v0.this.activationApi;
            String str = this.f51719y;
            this.f51717w = 1;
            Object postPairingScreens = activationApi.getPostPairingScreens(str, this);
            return postPairingScreens == enumC31071a ? enumC31071a : postPairingScreens;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super PostPairingEmailResponse> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C14211v0(ActivationApi activationApi, ActivationAuthenticatedApi activationAuthenticatedApi, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(activationApi, "activationApi");
        AbstractC22676k.m65750j(activationAuthenticatedApi, "activationAuthenticatedApi");
        AbstractC22676k.m65750j(logger, "logger");
        this.activationApi = activationApi;
        this.activationAuthenticatedApi = activationAuthenticatedApi;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:42:0x0108  */
    /* JADX WARN: Code duplicated, block: B:45:0x0125  */
    /* JADX WARN: Code duplicated, block: B:46:0x016e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0197  */
    /* JADX WARN: Code duplicated, block: B:51:0x019b  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        if (r5 == null) goto L27;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m40614c(java.lang.String r53, java.lang.String r54, java.lang.Integer r55, f70.C14201q0 r56, q83.InterfaceC30057d<? super f70.InterfaceC14176e> r57) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f70.C14211v0.m40614c(java.lang.String, java.lang.String, java.lang.Integer, f70.q0, q83.d):java.lang.Object");
    }
}
