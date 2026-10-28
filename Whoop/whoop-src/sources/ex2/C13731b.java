package ex2;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.remote.api.FileDownloaderApi;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.whooplabs.data.domain.LabsCampaign;
import com.whoop.whooplabs.data.network.WhoopLabsApi;
import com.whoop.whooplabs.data.network.WhoopLabsBffApi;
import com.whoop.whooplabs.data.remote.domain.dto.ScreeningResponse;
import com.whoop.whooplabs.data.remote.domain.dto.ScreeningSubmissionDto;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignDetailsScreenResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignExtendedDetailsResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignListScreenResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignScheduleScreenResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignScreeningResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepsScreenResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CompletedCampaignsScreenResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.ScreeningSubmissionResponse;
import fx2.InterfaceC14849a;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import od1.C27858u;
import oh2.C27940c;
import oh2.C27942e;
import oh2.InterfaceC27939b;
import or2.C28144a0;
import oy2.C28484j;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import td1.InterfaceC33704b;
import tr2.InterfaceC34116n;
import u02.AbstractC34386b;
import u02.InterfaceC34385a;
import vy2.InterfaceC36603a;
import w02.AbstractC36685b;
import z92.InterfaceC40205a;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: ex2.b */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 B2\u00020\u0001:\u00014Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010 H\u0086@¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010$\u001a\u00020#H\u0086@¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010$\u001a\u00020#H\u0086@¢\u0006\u0004\b)\u0010'J&\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010$\u001a\u00020#2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010#H\u0086@¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010$\u001a\u00020#H\u0086@¢\u0006\u0004\b/\u0010'J0\u00104\u001a\u0002032\u0006\u0010$\u001a\u00020#2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00102\u001a\u0004\u0018\u000100H\u0086@¢\u0006\u0004\b4\u00105J\u0018\u00106\u001a\u0002032\u0006\u0010$\u001a\u00020#H\u0086@¢\u0006\u0004\b6\u0010'J\u0018\u00108\u001a\u0002072\u0006\u0010$\u001a\u00020#H\u0086@¢\u0006\u0004\b8\u0010'J\u0018\u00109\u001a\u0002072\u0006\u0010*\u001a\u00020#H\u0086@¢\u0006\u0004\b9\u0010'J4\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010*\u001a\u00020#2\u0018\u0010<\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u0002000;0:H\u0086@¢\u0006\u0004\b>\u0010?J\u001c\u0010B\u001a\u0004\u0018\u00010A2\b\b\u0002\u0010@\u001a\u000200H\u0086@¢\u0006\u0004\bB\u0010CJ#\u0010H\u001a\u0002072\u0012\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0E0DH\u0002¢\u0006\u0004\bH\u0010IJ%\u0010K\u001a\u00020J*\u0014\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u0002000;0:H\u0002¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010MR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010ZR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010[R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\\R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010]R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010^R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010_R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010`¨\u0006a"}, m65681d2 = {"Lex2/b;", "", "Lod1/u;", "userContext", "Lin2/d;", "dispatcherFactory", "Lrr2/c;", "crashReporter", "Ltr2/n;", "logger", "Lfx2/a;", "labsDao", "Lcom/whoop/whooplabs/data/network/WhoopLabsApi;", "whoopLabsApi", "Ltd1/b;", "whoopStrapProxy", "Lcom/whoop/data/remote/api/FileDownloaderApi;", "fileDownloaderApi", "Lor2/a0;", "fileManager", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lcom/whoop/whooplabs/data/network/WhoopLabsBffApi;", "bffApi", "Lzr2/a;", "dateAndTimeProvider", "Lz92/a;", "userInfoAccessor", "Loy2/j;", "inputConfigMapper", "<init>", "(Lod1/u;Lin2/d;Lrr2/c;Ltr2/n;Lfx2/a;Lcom/whoop/whooplabs/data/network/WhoopLabsApi;Ltd1/b;Lcom/whoop/data/remote/api/FileDownloaderApi;Lor2/a0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lcom/whoop/whooplabs/data/network/WhoopLabsBffApi;Lzr2/a;Lz92/a;Loy2/j;)V", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignListScreenResponse;", "j", "(Lq83/d;)Ljava/lang/Object;", "", "campaignId", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(ILq83/d;)Ljava/lang/Object;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;", "i", "sessionId", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;", "n", "(ILjava/lang/Integer;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;", "k", "", "reason", "additionalFeedback", "", "a", "(ILjava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "q", "Lvy2/a;", "l", "m", "", "", "responses", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;", "r", "(ILjava/util/Map;Lq83/d;)Ljava/lang/Object;", "campaignFilter", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CompletedCampaignsScreenResponse;", "o", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lu02/a;", "Lpg3/v0;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;", "result", "p", "(Lu02/a;)Lvy2/a;", "Lcom/whoop/whooplabs/data/remote/domain/dto/ScreeningSubmissionDto;", "s", "(Ljava/util/Map;)Lcom/whoop/whooplabs/data/remote/domain/dto/ScreeningSubmissionDto;", "Lod1/u;", "b", "Lin2/d;", "c", "Lrr2/c;", "d", "Ltr2/n;", "e", "Lfx2/a;", "f", "Lcom/whoop/whooplabs/data/network/WhoopLabsApi;", "g", "Ltd1/b;", "Lcom/whoop/data/remote/api/FileDownloaderApi;", "Lor2/a0;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lcom/whoop/whooplabs/data/network/WhoopLabsBffApi;", "Lzr2/a;", "Lz92/a;", "Loy2/j;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13731b {

    /* JADX INFO: renamed from: p */
    public static final int f48808p = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27858u userContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcherFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC14849a labsDao;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final WhoopLabsApi whoopLabsApi;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC33704b whoopStrapProxy;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final FileDownloaderApi fileDownloaderApi;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C28144a0 fileManager;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final WhoopLabsBffApi bffApi;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C28484j inputConfigMapper;

    /* JADX INFO: renamed from: ex2.b$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository", m100430f = "LabsCampaignsRepository.kt", m100431l = {381}, m100432m = "abandonCampaign", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f48824F;

        /* JADX INFO: renamed from: w */
        int f48825w;

        /* JADX INFO: renamed from: x */
        Object f48826x;

        /* JADX INFO: renamed from: y */
        Object f48827y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f48828z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f48828z = obj;
            this.f48824F |= Integer.MIN_VALUE;
            return C13731b.this.m38970a(0, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ex2.b$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository$abandonCampaign$result$1", m100430f = "LabsCampaignsRepository.kt", m100431l = {383, 388}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f48829E;

        /* JADX INFO: renamed from: w */
        int f48830w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f48831x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C13731b f48832y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ int f48833z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, C13731b c13731b, int i13, String str2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f48831x = str;
            this.f48832y = c13731b;
            this.f48833z = i13;
            this.f48829E = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f48831x, this.f48832y, this.f48833z, this.f48829E, interfaceC30057d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        
            if (r7 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        
            if (r7 == r0) goto L19;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r6.f48830w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r7)
                goto L51
            L10:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L18:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L3d
            L1c:
                p505ts.AbstractC34132o.m107864I(r7)
                java.lang.String r7 = r6.f48831x
                if (r7 == 0) goto L40
                ex2.b r7 = r6.f48832y
                com.whoop.whooplabs.data.network.WhoopLabsApi r7 = ex2.C13731b.m38966f(r7)
                int r1 = r6.f48833z
                com.whoop.whooplabs.data.remote.domain.dto.AbandonCampaignBody r2 = new com.whoop.whooplabs.data.remote.domain.dto.AbandonCampaignBody
                java.lang.String r4 = r6.f48831x
                java.lang.String r5 = r6.f48829E
                r2.<init>(r4, r5)
                r6.f48830w = r3
                java.lang.Object r7 = r7.abandonCampaign(r1, r2, r6)
                if (r7 != r0) goto L3d
                goto L50
            L3d:
                pg3.v0 r7 = (pg3.C29218v0) r7
                return r7
            L40:
                ex2.b r7 = r6.f48832y
                com.whoop.whooplabs.data.network.WhoopLabsApi r7 = ex2.C13731b.m38966f(r7)
                int r1 = r6.f48833z
                r6.f48830w = r2
                java.lang.Object r7 = r7.abandonCampaign(r1, r6)
                if (r7 != r0) goto L51
            L50:
                return r0
            L51:
                pg3.v0 r7 = (pg3.C29218v0) r7
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ex2.C13731b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ex2.b$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository", m100430f = "LabsCampaignsRepository.kt", m100431l = {128}, m100432m = "fetchCampaignDetailsScreen", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f48834E;

        /* JADX INFO: renamed from: w */
        int f48835w;

        /* JADX INFO: renamed from: x */
        Object f48836x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f48837y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f48837y = obj;
            this.f48834E |= Integer.MIN_VALUE;
            return C13731b.this.m38971h(0, this);
        }
    }

    /* JADX INFO: renamed from: ex2.b$e */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository$fetchCampaignDetailsScreen$2", m100430f = "LabsCampaignsRepository.kt", m100431l = {129, 143}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ WhoopStrapInfo f48839E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ int f48840F;

        /* JADX INFO: renamed from: w */
        Object f48841w;

        /* JADX INFO: renamed from: x */
        Object f48842x;

        /* JADX INFO: renamed from: y */
        int f48843y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(WhoopStrapInfo whoopStrapInfo, int i13, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f48839E = whoopStrapInfo;
            this.f48840F = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C13731b.this.new e(this.f48839E, this.f48840F, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objFetchCampaignDetailsScreen;
            C27942e sigProcVersion;
            InterfaceC27939b bluetoothVersion;
            InterfaceC27939b maximVersion;
            C27940c hardwareVersion;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48843y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                WhoopLabsBffApi whoopLabsBffApi = C13731b.this.bffApi;
                WhoopStrapInfo whoopStrapInfo = this.f48839E;
                String strM84332d = (whoopStrapInfo == null || (hardwareVersion = whoopStrapInfo.getHardwareVersion()) == null) ? null : hardwareVersion.m84332d();
                WhoopStrapInfo whoopStrapInfo2 = this.f48839E;
                String strMo84319a = (whoopStrapInfo2 == null || (maximVersion = whoopStrapInfo2.getMaximVersion()) == null) ? null : maximVersion.mo84319a();
                WhoopStrapInfo whoopStrapInfo3 = this.f48839E;
                String strMo84319a2 = (whoopStrapInfo3 == null || (bluetoothVersion = whoopStrapInfo3.getBluetoothVersion()) == null) ? null : bluetoothVersion.mo84319a();
                WhoopStrapInfo whoopStrapInfo4 = this.f48839E;
                String strM84360f = (whoopStrapInfo4 == null || (sigProcVersion = whoopStrapInfo4.getSigProcVersion()) == null) ? null : sigProcVersion.m84360f();
                WhoopStrapInfo whoopStrapInfo5 = this.f48839E;
                String rawSerialNumber = whoopStrapInfo5 != null ? whoopStrapInfo5.getRawSerialNumber() : null;
                int i14 = this.f48840F;
                this.f48843y = 1;
                objFetchCampaignDetailsScreen = whoopLabsBffApi.fetchCampaignDetailsScreen(i14, strM84332d, strMo84319a, strMo84319a2, strM84360f, rawSerialNumber, this);
                if (objFetchCampaignDetailsScreen != enumC31071a) {
                }
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CampaignDetailsScreenResponse campaignDetailsScreenResponse = (CampaignDetailsScreenResponse) this.f48841w;
                AbstractC34132o.m107864I(obj);
                return campaignDetailsScreenResponse;
            }
            AbstractC34132o.m107864I(obj);
            objFetchCampaignDetailsScreen = obj;
            CampaignDetailsScreenResponse campaignDetailsScreenResponse2 = (CampaignDetailsScreenResponse) objFetchCampaignDetailsScreen;
            int i15 = this.f48840F;
            String description = campaignDetailsScreenResponse2.getDescription();
            if (description == null) {
                description = "";
            }
            LabsCampaign labsCampaign = new LabsCampaign(i15, description, campaignDetailsScreenResponse2.getTitle(), null, null, null, null, null, null, null, 984, null);
            InterfaceC14849a interfaceC14849a = C13731b.this.labsDao;
            this.f48841w = campaignDetailsScreenResponse2;
            this.f48842x = null;
            this.f48843y = 2;
            return interfaceC14849a.mo42775g(labsCampaign, this) == enumC31071a ? enumC31071a : campaignDetailsScreenResponse2;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super CampaignDetailsScreenResponse> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ex2.b$f */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository", m100430f = "LabsCampaignsRepository.kt", m100431l = {155}, m100432m = "fetchCampaignExtendedDetailsScreen", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f48845E;

        /* JADX INFO: renamed from: w */
        int f48846w;

        /* JADX INFO: renamed from: x */
        Object f48847x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f48848y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f48848y = obj;
            this.f48845E |= Integer.MIN_VALUE;
            return C13731b.this.m38972i(0, this);
        }
    }

    /* JADX INFO: renamed from: ex2.b$g */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository$fetchCampaignExtendedDetailsScreen$2", m100430f = "LabsCampaignsRepository.kt", m100431l = {156}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f48850w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ WhoopStrapInfo f48852y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ int f48853z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(WhoopStrapInfo whoopStrapInfo, int i13, InterfaceC30057d<? super g> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f48852y = whoopStrapInfo;
            this.f48853z = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C13731b.this.new g(this.f48852y, this.f48853z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C27942e sigProcVersion;
            InterfaceC27939b bluetoothVersion;
            InterfaceC27939b maximVersion;
            C27940c hardwareVersion;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48850w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WhoopLabsBffApi whoopLabsBffApi = C13731b.this.bffApi;
            WhoopStrapInfo whoopStrapInfo = this.f48852y;
            String strM84332d = (whoopStrapInfo == null || (hardwareVersion = whoopStrapInfo.getHardwareVersion()) == null) ? null : hardwareVersion.m84332d();
            WhoopStrapInfo whoopStrapInfo2 = this.f48852y;
            String strMo84319a = (whoopStrapInfo2 == null || (maximVersion = whoopStrapInfo2.getMaximVersion()) == null) ? null : maximVersion.mo84319a();
            WhoopStrapInfo whoopStrapInfo3 = this.f48852y;
            String strMo84319a2 = (whoopStrapInfo3 == null || (bluetoothVersion = whoopStrapInfo3.getBluetoothVersion()) == null) ? null : bluetoothVersion.mo84319a();
            WhoopStrapInfo whoopStrapInfo4 = this.f48852y;
            String strM84360f = (whoopStrapInfo4 == null || (sigProcVersion = whoopStrapInfo4.getSigProcVersion()) == null) ? null : sigProcVersion.m84360f();
            WhoopStrapInfo whoopStrapInfo5 = this.f48852y;
            String rawSerialNumber = whoopStrapInfo5 != null ? whoopStrapInfo5.getRawSerialNumber() : null;
            int i14 = this.f48853z;
            this.f48850w = 1;
            Object objFetchCampaignExtendedDetailsScreen = whoopLabsBffApi.fetchCampaignExtendedDetailsScreen(i14, strM84332d, strMo84319a, strMo84319a2, strM84360f, rawSerialNumber, this);
            return objFetchCampaignExtendedDetailsScreen == enumC31071a ? enumC31071a : objFetchCampaignExtendedDetailsScreen;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super CampaignExtendedDetailsResponse> interfaceC30057d) {
            return ((g) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ex2.b$h */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository", m100430f = "LabsCampaignsRepository.kt", m100431l = {97, 115}, m100432m = "fetchCampaignListScreen", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f48854E;

        /* JADX INFO: renamed from: F */
        Object f48855F;

        /* JADX INFO: renamed from: G */
        Object f48856G;

        /* JADX INFO: renamed from: H */
        Object f48857H;

        /* JADX INFO: renamed from: I */
        Object f48858I;

        /* JADX INFO: renamed from: J */
        Object f48859J;

        /* JADX INFO: renamed from: K */
        Object f48860K;

        /* JADX INFO: renamed from: L */
        Object f48861L;

        /* JADX INFO: renamed from: M */
        Object f48862M;

        /* JADX INFO: renamed from: N */
        int f48863N;

        /* JADX INFO: renamed from: O */
        int f48864O;

        /* JADX INFO: renamed from: P */
        int f48865P;

        /* JADX INFO: renamed from: Q */
        int f48866Q;

        /* JADX INFO: renamed from: R */
        int f48867R;

        /* JADX INFO: renamed from: S */
        /* synthetic */ Object f48868S;

        /* JADX INFO: renamed from: U */
        int f48870U;

        /* JADX INFO: renamed from: w */
        Object f48871w;

        /* JADX INFO: renamed from: x */
        Object f48872x;

        /* JADX INFO: renamed from: y */
        Object f48873y;

        /* JADX INFO: renamed from: z */
        Object f48874z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f48868S = obj;
            this.f48870U |= Integer.MIN_VALUE;
            return C13731b.this.m38973j(this);
        }
    }

    /* JADX INFO: renamed from: ex2.b$i */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository$fetchCampaignListScreen$2", m100430f = "LabsCampaignsRepository.kt", m100431l = {98}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignListScreenResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f48875w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ WhoopStrapInfo f48877y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(WhoopStrapInfo whoopStrapInfo, InterfaceC30057d<? super i> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f48877y = whoopStrapInfo;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C13731b.this.new i(this.f48877y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C27942e sigProcVersion;
            InterfaceC27939b bluetoothVersion;
            InterfaceC27939b maximVersion;
            C27940c hardwareVersion;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48875w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WhoopLabsBffApi whoopLabsBffApi = C13731b.this.bffApi;
            WhoopStrapInfo whoopStrapInfo = this.f48877y;
            String strM84332d = (whoopStrapInfo == null || (hardwareVersion = whoopStrapInfo.getHardwareVersion()) == null) ? null : hardwareVersion.m84332d();
            WhoopStrapInfo whoopStrapInfo2 = this.f48877y;
            String strMo84319a = (whoopStrapInfo2 == null || (maximVersion = whoopStrapInfo2.getMaximVersion()) == null) ? null : maximVersion.mo84319a();
            WhoopStrapInfo whoopStrapInfo3 = this.f48877y;
            String strMo84319a2 = (whoopStrapInfo3 == null || (bluetoothVersion = whoopStrapInfo3.getBluetoothVersion()) == null) ? null : bluetoothVersion.mo84319a();
            WhoopStrapInfo whoopStrapInfo4 = this.f48877y;
            String strM84360f = (whoopStrapInfo4 == null || (sigProcVersion = whoopStrapInfo4.getSigProcVersion()) == null) ? null : sigProcVersion.m84360f();
            WhoopStrapInfo whoopStrapInfo5 = this.f48877y;
            String rawSerialNumber = whoopStrapInfo5 != null ? whoopStrapInfo5.getRawSerialNumber() : null;
            this.f48875w = 1;
            Object objFetchCampaignListScreen = whoopLabsBffApi.fetchCampaignListScreen(strM84332d, strMo84319a, strMo84319a2, strM84360f, rawSerialNumber, this);
            return objFetchCampaignListScreen == enumC31071a ? enumC31071a : objFetchCampaignListScreen;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super CampaignListScreenResponse> interfaceC30057d) {
            return ((i) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ex2.b$j */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository", m100430f = "LabsCampaignsRepository.kt", m100431l = {345}, m100432m = "fetchCampaignScheduleScreen", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f48878E;

        /* JADX INFO: renamed from: w */
        int f48879w;

        /* JADX INFO: renamed from: x */
        Object f48880x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f48881y;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f48881y = obj;
            this.f48878E |= Integer.MIN_VALUE;
            return C13731b.this.m38974k(0, this);
        }
    }

    /* JADX INFO: renamed from: ex2.b$k */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository$fetchCampaignScheduleScreen$2", m100430f = "LabsCampaignsRepository.kt", m100431l = {346}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f48883w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ WhoopStrapInfo f48885y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ int f48886z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(WhoopStrapInfo whoopStrapInfo, int i13, InterfaceC30057d<? super k> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f48885y = whoopStrapInfo;
            this.f48886z = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C13731b.this.new k(this.f48885y, this.f48886z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C27942e sigProcVersion;
            InterfaceC27939b bluetoothVersion;
            InterfaceC27939b maximVersion;
            C27940c hardwareVersion;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48883w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WhoopLabsBffApi whoopLabsBffApi = C13731b.this.bffApi;
            WhoopStrapInfo whoopStrapInfo = this.f48885y;
            String strM84360f = null;
            String strM84332d = (whoopStrapInfo == null || (hardwareVersion = whoopStrapInfo.getHardwareVersion()) == null) ? null : hardwareVersion.m84332d();
            WhoopStrapInfo whoopStrapInfo2 = this.f48885y;
            String strMo84319a = (whoopStrapInfo2 == null || (maximVersion = whoopStrapInfo2.getMaximVersion()) == null) ? null : maximVersion.mo84319a();
            WhoopStrapInfo whoopStrapInfo3 = this.f48885y;
            String strMo84319a2 = (whoopStrapInfo3 == null || (bluetoothVersion = whoopStrapInfo3.getBluetoothVersion()) == null) ? null : bluetoothVersion.mo84319a();
            WhoopStrapInfo whoopStrapInfo4 = this.f48885y;
            if (whoopStrapInfo4 != null && (sigProcVersion = whoopStrapInfo4.getSigProcVersion()) != null) {
                strM84360f = sigProcVersion.m84360f();
            }
            int i14 = this.f48886z;
            this.f48883w = 1;
            Object objFetchCampaignScheduleScreen = whoopLabsBffApi.fetchCampaignScheduleScreen(i14, strM84332d, strMo84319a, strMo84319a2, strM84360f, this);
            return objFetchCampaignScheduleScreen == enumC31071a ? enumC31071a : objFetchCampaignScheduleScreen;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super CampaignScheduleScreenResponse> interfaceC30057d) {
            return ((k) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ex2.b$l */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository", m100430f = "LabsCampaignsRepository.kt", m100431l = {424}, m100432m = "fetchCampaignScreening", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f48887E;

        /* JADX INFO: renamed from: w */
        int f48888w;

        /* JADX INFO: renamed from: x */
        Object f48889x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f48890y;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f48890y = obj;
            this.f48887E |= Integer.MIN_VALUE;
            return C13731b.this.m38975l(0, this);
        }
    }

    /* JADX INFO: renamed from: ex2.b$m */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository$fetchCampaignScreening$result$1", m100430f = "LabsCampaignsRepository.kt", m100431l = {425}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class m extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f48892w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ WhoopStrapInfo f48894y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ int f48895z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(WhoopStrapInfo whoopStrapInfo, int i13, InterfaceC30057d<? super m> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f48894y = whoopStrapInfo;
            this.f48895z = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C13731b.this.new m(this.f48894y, this.f48895z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C27942e sigProcVersion;
            InterfaceC27939b bluetoothVersion;
            C27940c hardwareVersion;
            InterfaceC27939b maximVersion;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48892w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WhoopLabsBffApi whoopLabsBffApi = C13731b.this.bffApi;
            WhoopStrapInfo whoopStrapInfo = this.f48894y;
            String strMo84319a = (whoopStrapInfo == null || (maximVersion = whoopStrapInfo.getMaximVersion()) == null) ? null : maximVersion.mo84319a();
            WhoopStrapInfo whoopStrapInfo2 = this.f48894y;
            String strM84332d = (whoopStrapInfo2 == null || (hardwareVersion = whoopStrapInfo2.getHardwareVersion()) == null) ? null : hardwareVersion.m84332d();
            WhoopStrapInfo whoopStrapInfo3 = this.f48894y;
            String strMo84319a2 = (whoopStrapInfo3 == null || (bluetoothVersion = whoopStrapInfo3.getBluetoothVersion()) == null) ? null : bluetoothVersion.mo84319a();
            WhoopStrapInfo whoopStrapInfo4 = this.f48894y;
            String strM84360f = (whoopStrapInfo4 == null || (sigProcVersion = whoopStrapInfo4.getSigProcVersion()) == null) ? null : sigProcVersion.m84360f();
            WhoopStrapInfo whoopStrapInfo5 = this.f48894y;
            String rawSerialNumber = whoopStrapInfo5 != null ? whoopStrapInfo5.getRawSerialNumber() : null;
            int i14 = this.f48895z;
            this.f48892w = 1;
            Object objFetchCampaignScreening = whoopLabsBffApi.fetchCampaignScreening(i14, strM84332d, strMo84319a, strMo84319a2, strM84360f, rawSerialNumber, this);
            return objFetchCampaignScreening == enumC31071a ? enumC31071a : objFetchCampaignScreening;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<CampaignScreeningResponse>> interfaceC30057d) {
            return ((m) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ex2.b$n */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository", m100430f = "LabsCampaignsRepository.kt", m100431l = {439}, m100432m = "fetchCampaignScreeningBySessionId", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f48896E;

        /* JADX INFO: renamed from: w */
        int f48897w;

        /* JADX INFO: renamed from: x */
        Object f48898x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f48899y;

        public n(InterfaceC30057d<? super n> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f48899y = obj;
            this.f48896E |= Integer.MIN_VALUE;
            return C13731b.this.m38976m(0, this);
        }
    }

    /* JADX INFO: renamed from: ex2.b$o */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository$fetchCampaignScreeningBySessionId$result$1", m100430f = "LabsCampaignsRepository.kt", m100431l = {440}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScreeningResponse;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f48901w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ WhoopStrapInfo f48903y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ int f48904z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(WhoopStrapInfo whoopStrapInfo, int i13, InterfaceC30057d<? super o> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f48903y = whoopStrapInfo;
            this.f48904z = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C13731b.this.new o(this.f48903y, this.f48904z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C27942e sigProcVersion;
            InterfaceC27939b bluetoothVersion;
            C27940c hardwareVersion;
            InterfaceC27939b maximVersion;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48901w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WhoopLabsBffApi whoopLabsBffApi = C13731b.this.bffApi;
            WhoopStrapInfo whoopStrapInfo = this.f48903y;
            String strMo84319a = (whoopStrapInfo == null || (maximVersion = whoopStrapInfo.getMaximVersion()) == null) ? null : maximVersion.mo84319a();
            WhoopStrapInfo whoopStrapInfo2 = this.f48903y;
            String strM84332d = (whoopStrapInfo2 == null || (hardwareVersion = whoopStrapInfo2.getHardwareVersion()) == null) ? null : hardwareVersion.m84332d();
            WhoopStrapInfo whoopStrapInfo3 = this.f48903y;
            String strMo84319a2 = (whoopStrapInfo3 == null || (bluetoothVersion = whoopStrapInfo3.getBluetoothVersion()) == null) ? null : bluetoothVersion.mo84319a();
            WhoopStrapInfo whoopStrapInfo4 = this.f48903y;
            String strM84360f = (whoopStrapInfo4 == null || (sigProcVersion = whoopStrapInfo4.getSigProcVersion()) == null) ? null : sigProcVersion.m84360f();
            WhoopStrapInfo whoopStrapInfo5 = this.f48903y;
            String rawSerialNumber = whoopStrapInfo5 != null ? whoopStrapInfo5.getRawSerialNumber() : null;
            int i14 = this.f48904z;
            this.f48901w = 1;
            Object objFetchCampaignScreeningBySessionId = whoopLabsBffApi.fetchCampaignScreeningBySessionId(i14, strM84332d, strMo84319a, strMo84319a2, strM84360f, rawSerialNumber, this);
            return objFetchCampaignScreeningBySessionId == enumC31071a ? enumC31071a : objFetchCampaignScreeningBySessionId;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<CampaignScreeningResponse>> interfaceC30057d) {
            return ((o) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ex2.b$p */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository", m100430f = "LabsCampaignsRepository.kt", m100431l = {174, 200, 290, 325, 333}, m100432m = "fetchCampaignStepsScreen", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f48905E;

        /* JADX INFO: renamed from: F */
        Object f48906F;

        /* JADX INFO: renamed from: G */
        Object f48907G;

        /* JADX INFO: renamed from: H */
        Object f48908H;

        /* JADX INFO: renamed from: I */
        Object f48909I;

        /* JADX INFO: renamed from: J */
        Object f48910J;

        /* JADX INFO: renamed from: K */
        Object f48911K;

        /* JADX INFO: renamed from: L */
        /* synthetic */ Object f48912L;

        /* JADX INFO: renamed from: N */
        int f48914N;

        /* JADX INFO: renamed from: w */
        int f48915w;

        /* JADX INFO: renamed from: x */
        int f48916x;

        /* JADX INFO: renamed from: y */
        int f48917y;

        /* JADX INFO: renamed from: z */
        Object f48918z;

        public p(InterfaceC30057d<? super p> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f48912L = obj;
            this.f48914N |= Integer.MIN_VALUE;
            return C13731b.this.m38977n(0, null, this);
        }
    }

    /* JADX INFO: renamed from: ex2.b$q */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository$fetchCampaignStepsScreen$2", m100430f = "LabsCampaignsRepository.kt", m100431l = {204, 210, 225, 237, 252, 267}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class q extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f48919E;

        /* JADX INFO: renamed from: F */
        Object f48920F;

        /* JADX INFO: renamed from: G */
        Object f48921G;

        /* JADX INFO: renamed from: H */
        Object f48922H;

        /* JADX INFO: renamed from: I */
        Object f48923I;

        /* JADX INFO: renamed from: J */
        Object f48924J;

        /* JADX INFO: renamed from: K */
        Object f48925K;

        /* JADX INFO: renamed from: L */
        int f48926L;

        /* JADX INFO: renamed from: M */
        int f48927M;

        /* JADX INFO: renamed from: N */
        int f48928N;

        /* JADX INFO: renamed from: O */
        int f48929O;

        /* JADX INFO: renamed from: P */
        int f48930P;

        /* JADX INFO: renamed from: Q */
        int f48931Q;

        /* JADX INFO: renamed from: R */
        int f48932R;

        /* JADX INFO: renamed from: S */
        final /* synthetic */ CampaignStepsScreenResponse f48933S;

        /* JADX INFO: renamed from: T */
        final /* synthetic */ int f48934T;

        /* JADX INFO: renamed from: U */
        final /* synthetic */ C13731b f48935U;

        /* JADX INFO: renamed from: w */
        Object f48936w;

        /* JADX INFO: renamed from: x */
        Object f48937x;

        /* JADX INFO: renamed from: y */
        Object f48938y;

        /* JADX INFO: renamed from: z */
        Object f48939z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(CampaignStepsScreenResponse campaignStepsScreenResponse, int i13, C13731b c13731b, InterfaceC30057d<? super q> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f48933S = campaignStepsScreenResponse;
            this.f48934T = i13;
            this.f48935U = c13731b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new q(this.f48933S, this.f48934T, this.f48935U, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:26:0x0168  */
        /* JADX WARN: Code duplicated, block: B:41:0x01e2  */
        /* JADX WARN: Code duplicated, block: B:47:0x023e  */
        /* JADX WARN: Code duplicated, block: B:52:0x0285  */
        /* JADX WARN: Code duplicated, block: B:54:0x0289  */
        /* JADX WARN: Code duplicated, block: B:57:0x02d0  */
        /* JADX WARN: Code duplicated, block: B:59:0x02da A[ADDED_TO_REGION] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0160 -> B:24:0x0164). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x01dd -> B:25:0x0165). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x023a -> B:63:0x02e3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x02cd -> B:63:0x02e3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x02d8 -> B:63:0x02e3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x02da -> B:63:0x02e3). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r28) {
            /*
                Method dump skipped, instruction units count: 764
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ex2.C13731b.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ex2.b$r */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository$fetchCampaignStepsScreen$3", m100430f = "LabsCampaignsRepository.kt", m100431l = {292, 300}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class r extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ int f48940E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ CampaignStepsScreenResponse f48941F;

        /* JADX INFO: renamed from: w */
        Object f48942w;

        /* JADX INFO: renamed from: x */
        int f48943x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f48944y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(int i13, CampaignStepsScreenResponse campaignStepsScreenResponse, InterfaceC30057d<? super r> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f48940E = i13;
            this.f48941F = campaignStepsScreenResponse;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            r rVar = C13731b.this.new r(this.f48940E, this.f48941F, interfaceC30057d);
            rVar.f48944y = obj;
            return rVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((r) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
        
            if (r1.mo42775g(r3, r19) == r2) goto L19;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = r0.f48944y
                bc3.c0 r1 = (bc3.InterfaceC2994c0) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r0.f48943x
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L29
                if (r3 == r5) goto L23
                if (r3 != r4) goto L1b
                java.lang.Object r1 = r0.f48942w
                com.whoop.whooplabs.data.domain.LabsCampaign r1 = (com.whoop.whooplabs.data.domain.LabsCampaign) r1
                p505ts.AbstractC34132o.m107864I(r20)
                goto Lad
            L1b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L23:
                p505ts.AbstractC34132o.m107864I(r20)
                r1 = r20
                goto L3f
            L29:
                p505ts.AbstractC34132o.m107864I(r20)
                ex2.b r3 = ex2.C13731b.this
                fx2.a r3 = ex2.C13731b.m38964d(r3)
                int r6 = r0.f48940E
                r0.f48944y = r1
                r0.f48943x = r5
                java.lang.Object r1 = r3.mo42782o(r6, r0)
                if (r1 != r2) goto L3f
                goto Lac
            L3f:
                com.whoop.whooplabs.data.domain.LabsCampaign r1 = (com.whoop.whooplabs.data.domain.LabsCampaign) r1
                if (r1 != 0) goto L5b
                int r6 = r0.f48940E
                com.whoop.whooplabs.data.domain.LabsCampaign r5 = new com.whoop.whooplabs.data.domain.LabsCampaign
                r16 = 984(0x3d8, float:1.379E-42)
                r17 = 0
                java.lang.String r7 = ""
                java.lang.String r8 = ""
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                r6 = r5
                goto L5c
            L5b:
                r6 = r1
            L5c:
                ex2.b r1 = ex2.C13731b.this
                fx2.a r1 = ex2.C13731b.m38964d(r1)
                com.whoop.whooplabs.data.domain.LabsSession r3 = new com.whoop.whooplabs.data.domain.LabsSession
                com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepsScreenResponse r5 = r0.f48941F
                com.whoop.whooplabs.data.remote.domain.dto.bff.SessionResponse r5 = r5.getSession()
                int r5 = r5.getId()
                r3.<init>(r5)
                com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepsScreenResponse r5 = r0.f48941F
                com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepConfigResponse r5 = r5.getConfig()
                java.lang.Integer r13 = r5.getAdditionalDataCollection()
                com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepsScreenResponse r5 = r0.f48941F
                com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepConfigResponse r5 = r5.getConfig()
                java.lang.Integer r14 = r5.getBthrAdditionalDataCollection()
                com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepsScreenResponse r5 = r0.f48941F
                com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepConfigResponse r5 = r5.getConfig()
                java.util.List r15 = r5.getDataTypes()
                r17 = 63
                r18 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r16 = r3
                com.whoop.whooplabs.data.domain.LabsCampaign r3 = com.whoop.whooplabs.data.domain.LabsCampaign.copy$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                r5 = 0
                r0.f48944y = r5
                r0.f48942w = r5
                r0.f48943x = r4
                java.lang.Object r1 = r1.mo42775g(r3, r0)
                if (r1 != r2) goto Lad
            Lac:
                return r2
            Lad:
                l83.a0 r1 = l83.C23454a0.f92919a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ex2.C13731b.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ex2.b$s */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository$fetchCampaignStepsScreen$apiResult$1", m100430f = "LabsCampaignsRepository.kt", m100431l = {176, 187}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class s extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ int f48946E;

        /* JADX INFO: renamed from: w */
        int f48947w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Integer f48948x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C13731b f48949y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ WhoopStrapInfo f48950z;

        /* JADX INFO: renamed from: ex2.b$s$a */
        @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository$fetchCampaignStepsScreen$apiResult$1$1", m100430f = "LabsCampaignsRepository.kt", m100431l = {177}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f48951w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13731b f48952x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ WhoopStrapInfo f48953y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ Integer f48954z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C13731b c13731b, WhoopStrapInfo whoopStrapInfo, Integer num, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f48952x = c13731b;
                this.f48953y = whoopStrapInfo;
                this.f48954z = num;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f48952x, this.f48953y, this.f48954z, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C27942e sigProcVersion;
                InterfaceC27939b bluetoothVersion;
                InterfaceC27939b maximVersion;
                C27940c hardwareVersion;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f48951w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                WhoopLabsBffApi whoopLabsBffApi = this.f48952x.bffApi;
                WhoopStrapInfo whoopStrapInfo = this.f48953y;
                String strM84332d = (whoopStrapInfo == null || (hardwareVersion = whoopStrapInfo.getHardwareVersion()) == null) ? null : hardwareVersion.m84332d();
                WhoopStrapInfo whoopStrapInfo2 = this.f48953y;
                String strMo84319a = (whoopStrapInfo2 == null || (maximVersion = whoopStrapInfo2.getMaximVersion()) == null) ? null : maximVersion.mo84319a();
                WhoopStrapInfo whoopStrapInfo3 = this.f48953y;
                String strMo84319a2 = (whoopStrapInfo3 == null || (bluetoothVersion = whoopStrapInfo3.getBluetoothVersion()) == null) ? null : bluetoothVersion.mo84319a();
                WhoopStrapInfo whoopStrapInfo4 = this.f48953y;
                String strM84360f = (whoopStrapInfo4 == null || (sigProcVersion = whoopStrapInfo4.getSigProcVersion()) == null) ? null : sigProcVersion.m84360f();
                WhoopStrapInfo whoopStrapInfo5 = this.f48953y;
                String rawSerialNumber = whoopStrapInfo5 != null ? whoopStrapInfo5.getRawSerialNumber() : null;
                int iIntValue = this.f48954z.intValue();
                this.f48951w = 1;
                Object objFetchCampaignStepsScreenBySessionId = whoopLabsBffApi.fetchCampaignStepsScreenBySessionId(iIntValue, strM84332d, strMo84319a, strMo84319a2, strM84360f, rawSerialNumber, this);
                return objFetchCampaignStepsScreenBySessionId == enumC31071a ? enumC31071a : objFetchCampaignStepsScreenBySessionId;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super CampaignStepsScreenResponse> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX INFO: renamed from: ex2.b$s$b */
        @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository$fetchCampaignStepsScreen$apiResult$1$2", m100430f = "LabsCampaignsRepository.kt", m100431l = {188}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f48955w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13731b f48956x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ WhoopStrapInfo f48957y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ int f48958z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C13731b c13731b, WhoopStrapInfo whoopStrapInfo, int i13, InterfaceC30057d<? super b> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f48956x = c13731b;
                this.f48957y = whoopStrapInfo;
                this.f48958z = i13;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f48956x, this.f48957y, this.f48958z, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C27942e sigProcVersion;
                InterfaceC27939b bluetoothVersion;
                InterfaceC27939b maximVersion;
                C27940c hardwareVersion;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f48955w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                WhoopLabsBffApi whoopLabsBffApi = this.f48956x.bffApi;
                WhoopStrapInfo whoopStrapInfo = this.f48957y;
                String strM84332d = (whoopStrapInfo == null || (hardwareVersion = whoopStrapInfo.getHardwareVersion()) == null) ? null : hardwareVersion.m84332d();
                WhoopStrapInfo whoopStrapInfo2 = this.f48957y;
                String strMo84319a = (whoopStrapInfo2 == null || (maximVersion = whoopStrapInfo2.getMaximVersion()) == null) ? null : maximVersion.mo84319a();
                WhoopStrapInfo whoopStrapInfo3 = this.f48957y;
                String strMo84319a2 = (whoopStrapInfo3 == null || (bluetoothVersion = whoopStrapInfo3.getBluetoothVersion()) == null) ? null : bluetoothVersion.mo84319a();
                WhoopStrapInfo whoopStrapInfo4 = this.f48957y;
                String strM84360f = (whoopStrapInfo4 == null || (sigProcVersion = whoopStrapInfo4.getSigProcVersion()) == null) ? null : sigProcVersion.m84360f();
                WhoopStrapInfo whoopStrapInfo5 = this.f48957y;
                String rawSerialNumber = whoopStrapInfo5 != null ? whoopStrapInfo5.getRawSerialNumber() : null;
                int i14 = this.f48958z;
                this.f48955w = 1;
                Object objFetchCampaignStepsScreen = whoopLabsBffApi.fetchCampaignStepsScreen(i14, strM84332d, strMo84319a, strMo84319a2, strM84360f, rawSerialNumber, this);
                return objFetchCampaignStepsScreen == enumC31071a ? enumC31071a : objFetchCampaignStepsScreen;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super CampaignStepsScreenResponse> interfaceC30057d) {
                return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Integer num, C13731b c13731b, WhoopStrapInfo whoopStrapInfo, int i13, InterfaceC30057d<? super s> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f48948x = num;
            this.f48949y = c13731b;
            this.f48950z = whoopStrapInfo;
            this.f48946E = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new s(this.f48948x, this.f48949y, this.f48950z, this.f48946E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super CampaignStepsScreenResponse> interfaceC30057d) {
            return ((s) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
        
            if (r13 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
        
            if (r13 == r0) goto L19;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r12.f48947w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1d
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r13)
                goto L73
            L10:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L18:
                p505ts.AbstractC34132o.m107864I(r13)
                r6 = r12
                goto L47
            L1d:
                p505ts.AbstractC34132o.m107864I(r13)
                java.lang.Integer r13 = r12.f48948x
                r1 = 0
                if (r13 == 0) goto L50
                u02.a$a r4 = u02.InterfaceC34385a.INSTANCE
                ex2.b r13 = r12.f48949y
                tr2.n r5 = ex2.C13731b.m38965e(r13)
                ex2.b$s$a r8 = new ex2.b$s$a
                ex2.b r13 = r12.f48949y
                com.whoop.domain.model.WhoopStrapInfo r2 = r12.f48950z
                java.lang.Integer r6 = r12.f48948x
                r8.<init>(r13, r2, r6, r1)
                r12.f48947w = r3
                r6 = 0
                r7 = 0
                r10 = 6
                r11 = 0
                r9 = r12
                java.lang.Object r13 = u02.InterfaceC34385a.Companion.m108729b(r4, r5, r6, r7, r8, r9, r10, r11)
                r6 = r9
                if (r13 != r0) goto L47
                goto L72
            L47:
                u02.a r13 = (u02.InterfaceC34385a) r13
                java.lang.Object r13 = u02.AbstractC34386b.m108737b(r13)
                com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepsScreenResponse r13 = (com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepsScreenResponse) r13
                return r13
            L50:
                r6 = r12
                r13 = r1
                u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
                ex2.b r3 = r6.f48949y
                tr2.n r3 = ex2.C13731b.m38965e(r3)
                ex2.b$s$b r5 = new ex2.b$s$b
                ex2.b r4 = r6.f48949y
                com.whoop.domain.model.WhoopStrapInfo r7 = r6.f48950z
                int r8 = r6.f48946E
                r5.<init>(r4, r7, r8, r13)
                r6.f48947w = r2
                r2 = r3
                r3 = 0
                r4 = 0
                r7 = 6
                r8 = 0
                java.lang.Object r13 = u02.InterfaceC34385a.Companion.m108729b(r1, r2, r3, r4, r5, r6, r7, r8)
                if (r13 != r0) goto L73
            L72:
                return r0
            L73:
                u02.a r13 = (u02.InterfaceC34385a) r13
                java.lang.Object r13 = u02.AbstractC34386b.m108737b(r13)
                com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepsScreenResponse r13 = (com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepsScreenResponse) r13
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: ex2.C13731b.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ex2.b$t */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository", m100430f = "LabsCampaignsRepository.kt", m100431l = {527}, m100432m = "fetchCompletedCampaigns", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f48959E;

        /* JADX INFO: renamed from: w */
        Object f48960w;

        /* JADX INFO: renamed from: x */
        Object f48961x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f48962y;

        public t(InterfaceC30057d<? super t> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f48962y = obj;
            this.f48959E |= Integer.MIN_VALUE;
            return C13731b.this.m38978o(null, this);
        }
    }

    /* JADX INFO: renamed from: ex2.b$u */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository$fetchCompletedCampaigns$result$1", m100430f = "LabsCampaignsRepository.kt", m100431l = {528}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CompletedCampaignsScreenResponse;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class u extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f48964w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ WhoopStrapInfo f48966y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f48967z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(WhoopStrapInfo whoopStrapInfo, String str, InterfaceC30057d<? super u> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f48966y = whoopStrapInfo;
            this.f48967z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C13731b.this.new u(this.f48966y, this.f48967z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C27942e sigProcVersion;
            InterfaceC27939b bluetoothVersion;
            InterfaceC27939b maximVersion;
            C27940c hardwareVersion;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48964w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WhoopLabsBffApi whoopLabsBffApi = C13731b.this.bffApi;
            WhoopStrapInfo whoopStrapInfo = this.f48966y;
            String strM84332d = (whoopStrapInfo == null || (hardwareVersion = whoopStrapInfo.getHardwareVersion()) == null) ? null : hardwareVersion.m84332d();
            WhoopStrapInfo whoopStrapInfo2 = this.f48966y;
            String strMo84319a = (whoopStrapInfo2 == null || (maximVersion = whoopStrapInfo2.getMaximVersion()) == null) ? null : maximVersion.mo84319a();
            WhoopStrapInfo whoopStrapInfo3 = this.f48966y;
            String strMo84319a2 = (whoopStrapInfo3 == null || (bluetoothVersion = whoopStrapInfo3.getBluetoothVersion()) == null) ? null : bluetoothVersion.mo84319a();
            WhoopStrapInfo whoopStrapInfo4 = this.f48966y;
            String strM84360f = (whoopStrapInfo4 == null || (sigProcVersion = whoopStrapInfo4.getSigProcVersion()) == null) ? null : sigProcVersion.m84360f();
            WhoopStrapInfo whoopStrapInfo5 = this.f48966y;
            String rawSerialNumber = whoopStrapInfo5 != null ? whoopStrapInfo5.getRawSerialNumber() : null;
            String str = this.f48967z;
            this.f48964w = 1;
            Object objFetchCompletedCampaigns = whoopLabsBffApi.fetchCompletedCampaigns(strM84332d, strMo84319a, strMo84319a2, strM84360f, rawSerialNumber, str, this);
            return objFetchCompletedCampaigns == enumC31071a ? enumC31071a : objFetchCompletedCampaigns;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<CompletedCampaignsScreenResponse>> interfaceC30057d) {
            return ((u) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ex2.b$v */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository", m100430f = "LabsCampaignsRepository.kt", m100431l = {406}, m100432m = "stopStudy", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        int f48968w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f48969x;

        /* JADX INFO: renamed from: z */
        int f48971z;

        public v(InterfaceC30057d<? super v> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f48969x = obj;
            this.f48971z |= Integer.MIN_VALUE;
            return C13731b.this.m38979q(0, this);
        }
    }

    /* JADX INFO: renamed from: ex2.b$w */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository$stopStudy$result$1", m100430f = "LabsCampaignsRepository.kt", m100431l = {407}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class w extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f48972w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f48974y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(int i13, InterfaceC30057d<? super w> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f48974y = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C13731b.this.new w(this.f48974y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48972w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WhoopLabsApi whoopLabsApi = C13731b.this.whoopLabsApi;
            int i14 = this.f48974y;
            this.f48972w = 1;
            Object objStopStudy = whoopLabsApi.stopStudy(i14, this);
            return objStopStudy == enumC31071a ? enumC31071a : objStopStudy;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((w) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ex2.b$x */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository", m100430f = "LabsCampaignsRepository.kt", m100431l = {455}, m100432m = "submitScreening", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f48976F;

        /* JADX INFO: renamed from: w */
        int f48977w;

        /* JADX INFO: renamed from: x */
        Object f48978x;

        /* JADX INFO: renamed from: y */
        Object f48979y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f48980z;

        public x(InterfaceC30057d<? super x> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f48980z = obj;
            this.f48976F |= Integer.MIN_VALUE;
            return C13731b.this.m38980r(0, null, this);
        }
    }

    /* JADX INFO: renamed from: ex2.b$y */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository$submitScreening$result$1", m100430f = "LabsCampaignsRepository.kt", m100431l = {456}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ int f48981E;

        /* JADX INFO: renamed from: w */
        int f48982w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ WhoopStrapInfo f48984y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Map<Integer, List<String>> f48985z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public y(WhoopStrapInfo whoopStrapInfo, Map<Integer, ? extends List<String>> map, int i13, InterfaceC30057d<? super y> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f48984y = whoopStrapInfo;
            this.f48985z = map;
            this.f48981E = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C13731b.this.new y(this.f48984y, this.f48985z, this.f48981E, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C27942e sigProcVersion;
            InterfaceC27939b bluetoothVersion;
            C27940c hardwareVersion;
            InterfaceC27939b maximVersion;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48982w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WhoopLabsBffApi whoopLabsBffApi = C13731b.this.bffApi;
            WhoopStrapInfo whoopStrapInfo = this.f48984y;
            String strMo84319a = (whoopStrapInfo == null || (maximVersion = whoopStrapInfo.getMaximVersion()) == null) ? null : maximVersion.mo84319a();
            WhoopStrapInfo whoopStrapInfo2 = this.f48984y;
            String strM84332d = (whoopStrapInfo2 == null || (hardwareVersion = whoopStrapInfo2.getHardwareVersion()) == null) ? null : hardwareVersion.m84332d();
            WhoopStrapInfo whoopStrapInfo3 = this.f48984y;
            String strMo84319a2 = (whoopStrapInfo3 == null || (bluetoothVersion = whoopStrapInfo3.getBluetoothVersion()) == null) ? null : bluetoothVersion.mo84319a();
            WhoopStrapInfo whoopStrapInfo4 = this.f48984y;
            String strM84360f = (whoopStrapInfo4 == null || (sigProcVersion = whoopStrapInfo4.getSigProcVersion()) == null) ? null : sigProcVersion.m84360f();
            WhoopStrapInfo whoopStrapInfo5 = this.f48984y;
            String rawSerialNumber = whoopStrapInfo5 != null ? whoopStrapInfo5.getRawSerialNumber() : null;
            ScreeningSubmissionDto screeningSubmissionDtoM38969s = C13731b.this.m38969s(this.f48985z);
            int i14 = this.f48981E;
            this.f48982w = 1;
            Object objSubmitScreening = whoopLabsBffApi.submitScreening(i14, strM84332d, strMo84319a, strMo84319a2, strM84360f, rawSerialNumber, screeningSubmissionDtoM38969s, this);
            return objSubmitScreening == enumC31071a ? enumC31071a : objSubmitScreening;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ScreeningSubmissionResponse> interfaceC30057d) {
            return ((y) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C13731b(C27858u userContext, InterfaceC18732d dispatcherFactory, InterfaceC31766c crashReporter, InterfaceC34116n logger, InterfaceC14849a labsDao, WhoopLabsApi whoopLabsApi, InterfaceC33704b whoopStrapProxy, FileDownloaderApi fileDownloaderApi, C28144a0 fileManager, FeatureFlagChecker featureFlagChecker, WhoopLabsBffApi bffApi, InterfaceC41070a dateAndTimeProvider, InterfaceC40205a userInfoAccessor, C28484j inputConfigMapper) {
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(labsDao, "labsDao");
        AbstractC22676k.m65750j(whoopLabsApi, "whoopLabsApi");
        AbstractC22676k.m65750j(whoopStrapProxy, "whoopStrapProxy");
        AbstractC22676k.m65750j(fileDownloaderApi, "fileDownloaderApi");
        AbstractC22676k.m65750j(fileManager, "fileManager");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(bffApi, "bffApi");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(inputConfigMapper, "inputConfigMapper");
        this.userContext = userContext;
        this.dispatcherFactory = dispatcherFactory;
        this.crashReporter = crashReporter;
        this.logger = logger;
        this.labsDao = labsDao;
        this.whoopLabsApi = whoopLabsApi;
        this.whoopStrapProxy = whoopStrapProxy;
        this.fileDownloaderApi = fileDownloaderApi;
        this.fileManager = fileManager;
        this.featureFlagChecker = featureFlagChecker;
        this.bffApi = bffApi;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.userInfoAccessor = userInfoAccessor;
        this.inputConfigMapper = inputConfigMapper;
    }

    /* JADX INFO: renamed from: p */
    private final InterfaceC36603a m38968p(InterfaceC34385a<C29218v0<CampaignScreeningResponse>> result) {
        if ((result instanceof InterfaceC34385a.b.a) || (result instanceof InterfaceC34385a.b.C42432b)) {
            return InterfaceC36603a.b.f156807a;
        }
        if (!(result instanceof InterfaceC34385a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        CampaignScreeningResponse campaignScreeningResponse = (CampaignScreeningResponse) ((C29218v0) ((InterfaceC34385a.c) result).m108735a()).f118270b;
        return campaignScreeningResponse == null ? InterfaceC36603a.c.f156808a : new InterfaceC36603a.a(campaignScreeningResponse.toDomain());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final ScreeningSubmissionDto m38969s(Map<Integer, ? extends List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<Integer, ? extends List<String>> entry : map.entrySet()) {
            arrayList.add(new ScreeningResponse(entry.getKey().intValue(), entry.getValue()));
        }
        return new ScreeningSubmissionDto(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: a */
    public final Object m38970a(int i13, String str, String str2, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        b bVar;
        Object objM108729b;
        int i14;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i15 = bVar.f48824F;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                bVar.f48824F = i15 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f48828z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = bVar2.f48824F;
        boolean z4 = true;
        if (i16 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            c cVar = new c(str, this, i13, str2, null);
            bVar2.f48826x = null;
            bVar2.f48827y = null;
            bVar2.f48825w = i13;
            bVar2.f48824F = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, cVar, bVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
            i14 = i13;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i14 = bVar2.f48825w;
            AbstractC34132o.m107864I(obj);
            objM108729b = obj;
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if ((interfaceC34385a instanceof InterfaceC34385a.b.a) || (interfaceC34385a instanceof InterfaceC34385a.b.C42432b)) {
            this.logger.mo85222m("Error removing from campaign, campaignId: " + i14 + ", error: " + interfaceC34385a, new AbstractC30556a.a[0]);
            z4 = false;
        } else {
            if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            this.logger.mo85228t(AbstractC2875y.m8295h(i14, "Removed from campaign successfully, campaignId: "), new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(z4);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: h */
    public final Object m38971h(int i13, InterfaceC30057d<? super CampaignDetailsScreenResponse> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i14 = dVar.f48834E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f48834E = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object objM108729b = dVar2.f48837y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = dVar2.f48834E;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(objM108729b);
                WhoopStrapInfo whoopStrapInfoMo106493f = this.whoopStrapProxy.mo106493f();
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = this.logger;
                e eVar = new e(whoopStrapInfoMo106493f, i13, null);
                dVar2.f48836x = null;
                dVar2.f48835w = i13;
                dVar2.f48834E = 1;
                objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, eVar, dVar2, 6, null);
                if (objM108729b == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM108729b);
            }
            return (CampaignDetailsScreenResponse) AbstractC34386b.m108737b((InterfaceC34385a) objM108729b);
        } catch (Exception e5) {
            AbstractC36685b.m117759a(e5, "Unable to fetch campaign details bff for user", this.logger, this.crashReporter);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: i */
    public final Object m38972i(int i13, InterfaceC30057d<? super CampaignExtendedDetailsResponse> interfaceC30057d) {
        f fVar;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i14 = fVar.f48845E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f48845E = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        f fVar2 = fVar;
        Object objM108729b = fVar2.f48848y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = fVar2.f48845E;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(objM108729b);
                WhoopStrapInfo whoopStrapInfoMo106493f = this.whoopStrapProxy.mo106493f();
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = this.logger;
                g gVar = new g(whoopStrapInfoMo106493f, i13, null);
                fVar2.f48847x = null;
                fVar2.f48846w = i13;
                fVar2.f48845E = 1;
                objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, gVar, fVar2, 6, null);
                if (objM108729b == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM108729b);
            }
            return (CampaignExtendedDetailsResponse) AbstractC34386b.m108737b((InterfaceC34385a) objM108729b);
        } catch (Exception e5) {
            AbstractC36685b.m117759a(e5, "Unable to fetch campaign extended details bff for user", this.logger, this.crashReporter);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ba A[Catch: Exception -> 0x0065, TryCatch #0 {Exception -> 0x0065, blocks: (B:14:0x0060, B:37:0x00d2, B:39:0x00d8, B:41:0x00ed, B:43:0x00f3, B:45:0x0100, B:47:0x0107, B:32:0x00b4, B:34:0x00ba, B:36:0x00c6, B:51:0x0166, B:21:0x0074, B:27:0x009b, B:29:0x00a6, B:31:0x00ac, B:24:0x0081), top: B:55:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d8 A[Catch: Exception -> 0x0065, TryCatch #0 {Exception -> 0x0065, blocks: (B:14:0x0060, B:37:0x00d2, B:39:0x00d8, B:41:0x00ed, B:43:0x00f3, B:45:0x0100, B:47:0x0107, B:32:0x00b4, B:34:0x00ba, B:36:0x00c6, B:51:0x0166, B:21:0x0074, B:27:0x009b, B:29:0x00a6, B:31:0x00ac, B:24:0x0081), top: B:55:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ed A[Catch: Exception -> 0x0065, TryCatch #0 {Exception -> 0x0065, blocks: (B:14:0x0060, B:37:0x00d2, B:39:0x00d8, B:41:0x00ed, B:43:0x00f3, B:45:0x0100, B:47:0x0107, B:32:0x00b4, B:34:0x00ba, B:36:0x00c6, B:51:0x0166, B:21:0x0074, B:27:0x009b, B:29:0x00a6, B:31:0x00ac, B:24:0x0081), top: B:55:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:45:0x0100 A[Catch: Exception -> 0x0065, TryCatch #0 {Exception -> 0x0065, blocks: (B:14:0x0060, B:37:0x00d2, B:39:0x00d8, B:41:0x00ed, B:43:0x00f3, B:45:0x0100, B:47:0x0107, B:32:0x00b4, B:34:0x00ba, B:36:0x00c6, B:51:0x0166, B:21:0x0074, B:27:0x009b, B:29:0x00a6, B:31:0x00ac, B:24:0x0081), top: B:55:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0106  */
    /* JADX WARN: Code duplicated, block: B:57:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[LOOP:0: B:37:0x00d2->B:60:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c6 -> B:37:0x00d2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:39:0x00d8
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: j */
    public final java.lang.Object m38973j(q83.InterfaceC30057d<? super com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignListScreenResponse> r28) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ex2.C13731b.m38973j(q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: k */
    public final Object m38974k(int i13, InterfaceC30057d<? super CampaignScheduleScreenResponse> interfaceC30057d) {
        j jVar;
        if (interfaceC30057d instanceof j) {
            jVar = (j) interfaceC30057d;
            int i14 = jVar.f48878E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f48878E = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(interfaceC30057d);
            }
        } else {
            jVar = new j(interfaceC30057d);
        }
        j jVar2 = jVar;
        Object objM108729b = jVar2.f48881y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = jVar2.f48878E;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(objM108729b);
                WhoopStrapInfo whoopStrapInfoMo106493f = this.whoopStrapProxy.mo106493f();
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = this.logger;
                k kVar = new k(whoopStrapInfoMo106493f, i13, null);
                jVar2.f48880x = null;
                jVar2.f48879w = i13;
                jVar2.f48878E = 1;
                objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, kVar, jVar2, 6, null);
                if (objM108729b == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM108729b);
            }
            return (CampaignScheduleScreenResponse) AbstractC34386b.m108737b((InterfaceC34385a) objM108729b);
        } catch (Exception e5) {
            AbstractC36685b.m117759a(e5, "Unable to fetch campaign schedule bff for user", this.logger, this.crashReporter);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: l */
    public final Object m38975l(int i13, InterfaceC30057d<? super InterfaceC36603a> interfaceC30057d) {
        l lVar;
        if (interfaceC30057d instanceof l) {
            lVar = (l) interfaceC30057d;
            int i14 = lVar.f48887E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f48887E = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(interfaceC30057d);
            }
        } else {
            lVar = new l(interfaceC30057d);
        }
        l lVar2 = lVar;
        Object objM108729b = lVar2.f48890y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = lVar2.f48887E;
        if (i15 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            WhoopStrapInfo whoopStrapInfoMo106493f = this.whoopStrapProxy.mo106493f();
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            String strM8295h = AbstractC2875y.m8295h(i13, "Error fetching campaign screening by campaignId:");
            m mVar = new m(whoopStrapInfoMo106493f, i13, null);
            lVar2.f48889x = null;
            lVar2.f48888w = i13;
            lVar2.f48887E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, strM8295h, mVar, lVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        return m38968p((InterfaceC34385a) objM108729b);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: m */
    public final Object m38976m(int i13, InterfaceC30057d<? super InterfaceC36603a> interfaceC30057d) {
        n nVar;
        if (interfaceC30057d instanceof n) {
            nVar = (n) interfaceC30057d;
            int i14 = nVar.f48896E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f48896E = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(interfaceC30057d);
            }
        } else {
            nVar = new n(interfaceC30057d);
        }
        n nVar2 = nVar;
        Object objM108729b = nVar2.f48899y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = nVar2.f48896E;
        if (i15 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            WhoopStrapInfo whoopStrapInfoMo106493f = this.whoopStrapProxy.mo106493f();
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            String strM8295h = AbstractC2875y.m8295h(i13, "Error fetching campaign screening by sessionId:");
            o oVar = new o(whoopStrapInfoMo106493f, i13, null);
            nVar2.f48898x = null;
            nVar2.f48897w = i13;
            nVar2.f48896E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, strM8295h, oVar, nVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        return m38968p((InterfaceC34385a) objM108729b);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0094 A[PHI: r1 r3
      0x0094: PHI (r1v12 int) = (r1v11 int), (r1v19 int) binds: [B:50:0x0124, B:29:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x0094: PHI (r3v8 com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepsScreenResponse) = 
      (r3v7 com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepsScreenResponse)
      (r3v19 com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepsScreenResponse)
     binds: [B:50:0x0124, B:29:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x015b, code lost:
    
        if (r0.mo42783p(r15, r6) == r7) goto L60;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m38977n(int r30, java.lang.Integer r31, q83.InterfaceC30057d<? super com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepsScreenResponse> r32) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ex2.C13731b.m38977n(int, java.lang.Integer, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: o */
    public final Object m38978o(String str, InterfaceC30057d<? super CompletedCampaignsScreenResponse> interfaceC30057d) {
        t tVar;
        if (interfaceC30057d instanceof t) {
            tVar = (t) interfaceC30057d;
            int i13 = tVar.f48959E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                tVar.f48959E = i13 - Integer.MIN_VALUE;
            } else {
                tVar = new t(interfaceC30057d);
            }
        } else {
            tVar = new t(interfaceC30057d);
        }
        t tVar2 = tVar;
        Object objM108729b = tVar2.f48962y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = tVar2.f48959E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            WhoopStrapInfo whoopStrapInfoMo106493f = this.whoopStrapProxy.mo106493f();
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            u uVar = new u(whoopStrapInfoMo106493f, str, null);
            tVar2.f48960w = null;
            tVar2.f48961x = null;
            tVar2.f48959E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, uVar, tVar2, 6, null);
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
            C29218v0 c29218v0 = (C29218v0) AbstractC34386b.m108737b(interfaceC34385a);
            if (c29218v0 != null) {
                return (CompletedCampaignsScreenResponse) c29218v0.f118270b;
            }
            return null;
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        this.logger.mo85222m(AbstractC11266d.m30461o("Error getting completed campaigns screen: ", ((InterfaceC34385a.b) interfaceC34385a).getErrorMessage()), new AbstractC30556a.a[0]);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: q */
    public final Object m38979q(int i13, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        v vVar;
        if (interfaceC30057d instanceof v) {
            vVar = (v) interfaceC30057d;
            int i14 = vVar.f48971z;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                vVar.f48971z = i14 - Integer.MIN_VALUE;
            } else {
                vVar = new v(interfaceC30057d);
            }
        } else {
            vVar = new v(interfaceC30057d);
        }
        v vVar2 = vVar;
        Object objM108729b = vVar2.f48969x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = vVar2.f48971z;
        boolean z4 = true;
        if (i15 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            w wVar = new w(i13, null);
            vVar2.f48968w = i13;
            vVar2.f48971z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, wVar, vVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = vVar2.f48968w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            this.logger.mo85222m("Error stopping study, campaignId: " + i13 + ", error: " + interfaceC34385a, new AbstractC30556a.a[0]);
            z4 = false;
        } else {
            if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            this.logger.mo85228t(AbstractC2875y.m8295h(i13, "Stopped study successfully, campaignId: "), new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(z4);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: r */
    public final Object m38980r(int i13, Map<Integer, ? extends List<String>> map, InterfaceC30057d<? super ScreeningSubmissionResponse> interfaceC30057d) {
        x xVar;
        int i14;
        if (interfaceC30057d instanceof x) {
            xVar = (x) interfaceC30057d;
            int i15 = xVar.f48976F;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                xVar.f48976F = i15 - Integer.MIN_VALUE;
            } else {
                xVar = new x(interfaceC30057d);
            }
        } else {
            xVar = new x(interfaceC30057d);
        }
        x xVar2 = xVar;
        Object objM108729b = xVar2.f48980z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = xVar2.f48976F;
        if (i16 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            WhoopStrapInfo whoopStrapInfoMo106493f = this.whoopStrapProxy.mo106493f();
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            y yVar = new y(whoopStrapInfoMo106493f, map, i13, null);
            xVar2.f48978x = null;
            xVar2.f48979y = null;
            xVar2.f48977w = i13;
            xVar2.f48976F = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, yVar, xVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
            i14 = i13;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i14 = xVar2.f48977w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            this.logger.mo85222m(AbstractC11266d.m30456j(i14, "Error submitting screening, sessionId: ", ", error: ", ((InterfaceC34385a.b) interfaceC34385a).getErrorMessage()), new AbstractC30556a.a[0]);
            return null;
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        this.logger.mo85228t(AbstractC2875y.m8295h(i14, "Screening submitted successfully, sessionId: "), new AbstractC30556a.a[0]);
        return (ScreeningSubmissionResponse) AbstractC34386b.m108737b(interfaceC34385a);
    }
}
