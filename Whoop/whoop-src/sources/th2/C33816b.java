package th2;

import com.whoop.strapauth.client.StrapUnlockApi;
import com.whoop.strapauth.client.StrapUnlockRequest;
import com.whoop.strapauth.client.StrapUnlockResponse;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: th2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lth2/b;", "Lth2/a;", "Lcom/whoop/strapauth/client/StrapUnlockApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/strapauth/client/StrapUnlockApi;Ltr2/n;)V", "", "strapSerial", "Lcom/whoop/strapauth/client/StrapUnlockRequest;", "body", "Lu02/a;", "Lcom/whoop/strapauth/client/StrapUnlockResponse;", "c", "(Ljava/lang/String;Lcom/whoop/strapauth/client/StrapUnlockRequest;Lq83/d;)Ljava/lang/Object;", "strapSignature", "Lth2/c;", "a", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/strapauth/client/StrapUnlockApi;", "b", "Ltr2/n;", "strap-auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33816b implements InterfaceC33815a {

    /* JADX INFO: renamed from: c */
    private static final a f141620c = new a(null);

    /* JADX INFO: renamed from: d */
    private static final long[] f141621d = {1000, 2000, 4000};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final StrapUnlockApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: th2.b$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lth2/b$a;", "", "<init>", "()V", "strap-auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: th2.b$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strapauth.client.StrapUnlockClientImpl", m100430f = "StrapUnlockClientImpl.kt", m100431l = {16, 30}, m100432m = "fetchToken", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f141624E;

        /* JADX INFO: renamed from: F */
        int f141625F;

        /* JADX INFO: renamed from: G */
        int f141626G;

        /* JADX INFO: renamed from: H */
        int f141627H;

        /* JADX INFO: renamed from: I */
        /* synthetic */ Object f141628I;

        /* JADX INFO: renamed from: K */
        int f141630K;

        /* JADX INFO: renamed from: w */
        Object f141631w;

        /* JADX INFO: renamed from: x */
        Object f141632x;

        /* JADX INFO: renamed from: y */
        Object f141633y;

        /* JADX INFO: renamed from: z */
        Object f141634z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f141628I = obj;
            this.f141630K |= Integer.MIN_VALUE;
            return C33816b.this.mo106973a(null, null, this);
        }
    }

    /* JADX INFO: renamed from: th2.b$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strapauth.client.StrapUnlockClientImpl$requestToken$2", m100430f = "StrapUnlockClientImpl.kt", m100431l = {39}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/strapauth/client/StrapUnlockResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f141635w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f141637y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ StrapUnlockRequest f141638z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, StrapUnlockRequest strapUnlockRequest, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f141637y = str;
            this.f141638z = strapUnlockRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C33816b.this.new c(this.f141637y, this.f141638z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f141635w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            StrapUnlockApi strapUnlockApi = C33816b.this.api;
            String str = this.f141637y;
            StrapUnlockRequest strapUnlockRequest = this.f141638z;
            this.f141635w = 1;
            Object unlockToken = strapUnlockApi.getUnlockToken(str, strapUnlockRequest, this);
            return unlockToken == enumC31071a ? enumC31071a : unlockToken;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super StrapUnlockResponse> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C33816b(StrapUnlockApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: c */
    private final Object m106975c(String str, StrapUnlockRequest strapUnlockRequest, InterfaceC30057d<? super InterfaceC34385a<StrapUnlockResponse>> interfaceC30057d) {
        return InterfaceC34385a.Companion.m108729b(InterfaceC34385a.INSTANCE, this.logger, null, "Failed to fetch strap unlock token", new c(str, strapUnlockRequest, null), interfaceC30057d, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    /* JADX WARN: Code duplicated, block: B:21:0x009a  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:47:0x010f  */
    /* JADX WARN: Code duplicated, block: B:49:0x011b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f2 -> B:42:0x00f5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00fa -> B:44:0x00fd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // th2.InterfaceC33815a
    /* JADX INFO: renamed from: a */
    public java.lang.Object mo106973a(java.lang.String r18, java.lang.String r19, q83.InterfaceC30057d<? super th2.InterfaceC33817c> r20) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: th2.C33816b.mo106973a(java.lang.String, java.lang.String, q83.d):java.lang.Object");
    }

    public /* synthetic */ C33816b(StrapUnlockApi strapUnlockApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(strapUnlockApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("StrapUnlockClient") : interfaceC34116n);
    }
}
