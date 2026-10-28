package kx2;

import ax2.InterfaceC2121a;
import com.whoop.whooplabs.C10823a;
import ex2.C13731b;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import zw2.C41178b;

/* JADX INFO: renamed from: kx2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lkx2/c;", "Lax2/a;", "Ll83/a0;", "", "campaignId", "Lex2/b;", "labsCampaignRepository", "Lzw2/b;", "analytics", "Lcom/whoop/whooplabs/a;", "labsServiceConnector", "Ltr2/n;", "logger", "<init>", "(ILex2/b;Lzw2/b;Lcom/whoop/whooplabs/a;Ltr2/n;)V", "Lax2/b;", "a", "(Lq83/d;)Ljava/lang/Object;", "I", "b", "Lex2/b;", "c", "Lzw2/b;", "d", "Lcom/whoop/whooplabs/a;", "e", "Ltr2/n;", "f", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22886c implements InterfaceC2121a<C23454a0> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    public static final int f90353g = 8;

    /* JADX INFO: renamed from: h */
    private static final String f90354h = "CancelTaskCampaignDetailsCommand";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int campaignId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C13731b labsCampaignRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C41178b analytics;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C10823a labsServiceConnector;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: kx2.c$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lkx2/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m66516a() {
            return C22886c.f90354h;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: kx2.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaigndetails.commands.CancelTaskCampaignDetailsCommand", m100430f = "CancelTaskCampaignDetailsCommand.kt", m100431l = {24, 26, 27, 29}, m100432m = "execute", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f90361F;

        /* JADX INFO: renamed from: w */
        boolean f90362w;

        /* JADX INFO: renamed from: x */
        boolean f90363x;

        /* JADX INFO: renamed from: y */
        Object f90364y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f90365z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f90365z = obj;
            this.f90361F |= Integer.MIN_VALUE;
            return C22886c.this.mo6691a(this);
        }
    }

    public C22886c(int i13, C13731b labsCampaignRepository, C41178b analytics, C10823a labsServiceConnector, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(labsCampaignRepository, "labsCampaignRepository");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(labsServiceConnector, "labsServiceConnector");
        AbstractC22676k.m65750j(logger, "logger");
        this.campaignId = i13;
        this.labsCampaignRepository = labsCampaignRepository;
        this.analytics = analytics;
        this.labsServiceConnector = labsServiceConnector;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a4 A[PHI: r2 r4 r12
      0x00a4: PHI (r2v9 boolean) = (r2v8 boolean), (r2v11 boolean) binds: [B:30:0x00a1, B:17:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r4v3 com.whoop.whooplabs.WhoopLabsService) = (r4v2 com.whoop.whooplabs.WhoopLabsService), (r4v5 com.whoop.whooplabs.WhoopLabsService) binds: [B:30:0x00a1, B:17:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r12v14 java.lang.Object) = (r12v13 java.lang.Object), (r12v1 java.lang.Object) binds: [B:30:0x00a1, B:17:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
    
        if (r4.m28469i(r0) == r1) goto L36;
     */
    @Override // ax2.InterfaceC2121a
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo6691a(q83.InterfaceC30057d<? super ax2.InterfaceC2122b<? extends l83.C23454a0>> r12) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kx2.C22886c.mo6691a(q83.d):java.lang.Object");
    }
}
