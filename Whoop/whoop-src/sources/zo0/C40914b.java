package zo0;

import androidx.core.app.NotificationCompat;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import c93.InterfaceC4353o;
import com.whoop.coacheverywherecommon.models.AiContextMetadataBottomRow;
import com.whoop.coacheverywherecommon.models.CoachEntry;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.navigation.DrawerPresentation;
import dp0.AbstractC12248d;
import dp0.AbstractC12249e;
import dp0.InterfaceC12251g;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13052j1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import ep0.AbstractC13405k;
import ep0.C13398d;
import ep0.C13402h;
import ep0.C13404j;
import ep0.InterfaceC13399e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21155m0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.media.tracks.HMSTrackSource;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import po0.C29397a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: zo0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u0017J\u000f\u0010\u001d\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u0017J+\u0010$\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0015H\u0016¢\u0006\u0004\b&\u0010\u0017J\u000f\u0010'\u001a\u00020\u0015H\u0016¢\u0006\u0004\b'\u0010\u0017J\u000f\u0010(\u001a\u00020\u0015H\u0016¢\u0006\u0004\b(\u0010\u0017J\u000f\u0010)\u001a\u00020\u0015H\u0016¢\u0006\u0004\b)\u0010\u0017J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00152\u0006\u0010-\u001a\u00020 H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0015H\u0016¢\u0006\u0004\b0\u0010\u0017J\u0017\u00103\u001a\u00020\u00152\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J!\u00107\u001a\u00020\u00152\u0006\u00105\u001a\u00020*2\b\u00106\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b7\u00108J\u0019\u0010:\u001a\u00020\u00152\b\u00109\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b:\u0010/J\u001a\u0010=\u001a\u00020\u00152\b\u0010<\u001a\u0004\u0018\u00010;H\u0096@¢\u0006\u0004\b=\u0010>J\u0019\u0010?\u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b?\u0010/J\u0017\u0010B\u001a\u00020\u00152\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ \u0010F\u001a\u00020\u00152\u0006\u0010D\u001a\u00020 2\u0006\u0010E\u001a\u00020 H\u0096@¢\u0006\u0004\bF\u0010GJ \u0010I\u001a\u00020\u00152\u0006\u0010H\u001a\u00020 2\u0006\u0010E\u001a\u00020 H\u0096@¢\u0006\u0004\bI\u0010GJ\u000f\u0010J\u001a\u00020\u0015H\u0016¢\u0006\u0004\bJ\u0010\u0017J\u000f\u0010K\u001a\u00020\u0015H\u0016¢\u0006\u0004\bK\u0010\u0017J!\u0010M\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010L\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\bM\u0010NJ!\u0010O\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010L\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\bO\u0010NJ\u000f\u0010P\u001a\u00020\u0015H\u0002¢\u0006\u0004\bP\u0010\u0017J\u000f\u0010Q\u001a\u00020*H\u0002¢\u0006\u0004\bQ\u0010,J\u0017\u0010S\u001a\u00020\u00152\u0006\u0010R\u001a\u00020 H\u0002¢\u0006\u0004\bS\u0010/J\u0019\u0010U\u001a\u0004\u0018\u00010\"2\u0006\u0010T\u001a\u00020 H\u0002¢\u0006\u0004\bU\u0010VJ\u0019\u0010X\u001a\u0004\u0018\u00010 2\u0006\u0010W\u001a\u00020 H\u0002¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u0015H\u0002¢\u0006\u0004\bZ\u0010\u0017J\u0017\u0010]\u001a\u00020\u00152\u0006\u0010\\\u001a\u00020[H\u0002¢\u0006\u0004\b]\u0010^R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010_R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010`R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010gR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010hR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020j0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010kR\u001c\u0010m\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010kR\u0018\u0010p\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010r\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010qR\u0018\u0010s\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010qR\u0016\u0010u\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010tR\"\u0010z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010w0v8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010x\u001a\u0004\bc\u0010yR \u0010}\u001a\b\u0012\u0004\u0012\u00020{0v8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010x\u001a\u0004\b|\u0010yR\u0018\u0010\u007f\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010~R\u001d\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00020 0\u0080\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b.\u0010\u0081\u0001R\u0019\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0016\u0010\u0087\u0001\u001a\u00020*8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010,R\u001d\u0010\u008a\u0001\u001a\u00020**\u0004\u0018\u00010\"8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001d\u0010\u008c\u0001\u001a\u00020**\u0004\u0018\u00010\"8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u0089\u0001¨\u0006\u008d\u0001"}, m65681d2 = {"Lzo0/b;", "Ldp0/g;", "Lzo0/c;", "Lpo0/a;", "coachEverywhereAnalyticHelper", "Lbc3/c0;", "coroutineScope", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lzo0/a;", "bottomNavResolver", "Lzo0/j;", "contextMap", "Lzo0/f;", "proactiveCoordinator", "Lzo0/k;", "voiceInputController", "Ltr2/n;", "logger", "<init>", "(Lpo0/a;Lbc3/c0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lzo0/a;Lzo0/j;Lzo0/f;Lzo0/k;Ltr2/n;)V", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()V", "Lj02/m0;", HMSTrackSource.SCREEN, "z", "(Lj02/m0;)V", "l", "b", "Lh2/b;", "fabPosition", "", "bottomNavTab", "Lep0/j;", "overrideContext", "g", "(JLjava/lang/String;Lep0/j;)V", "x", "m", "j", "c", "", "o", "()Z", "fingerprint", "r", "(Ljava/lang/String;)V", "d", "Ldp0/e;", NotificationCompat.CATEGORY_EVENT, "n", "(Ldp0/e;)V", "fabVisible", "context", "t", "(ZLep0/j;)V", "screenContextKey", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;", "aiContextMetadata", "q", "(Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;Lq83/d;)Ljava/lang/Object;", "i", "", "clearancePx", "a", "(F)V", "previewText", "messageId", "p", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "conversationId", "v", "u", "s", "screenContext", "M", "(JLep0/j;)V", "N", "C", "H", "promotedKey", "D", "tab", "L", "(Ljava/lang/String;)Lep0/j;", "tabId", "J", "(Ljava/lang/String;)Ljava/lang/String;", "K", "Lep0/e;", "proactiveAnimationState", "E", "(Lep0/e;)V", "Lpo0/a;", "Lbc3/c0;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lzo0/a;", "e", "Lzo0/j;", "f", "Lzo0/f;", "Lzo0/k;", "Ltr2/n;", "Lec3/p1;", "Lzo0/e;", "Lec3/p1;", "localStateFlow", "lastNavigatedScreenFlow", "k", "Lep0/j;", "screenContextBeforeOverride", "Ljava/lang/String;", "foregroundBottomNavTab", "promotedBottomNavTabKey", "Z", "isInlineDrawerVisible", "Lec3/f2;", "", "Lec3/f2;", "()Lec3/f2;", "ttfmtStartTimeMs", "Lep0/d;", "getState", "state", "Ljava/lang/Boolean;", "lastKnownDynamicBdnState", "", "Ljava/util/Set;", "bottomSheetContextKeys", "y", "()Lj02/m0;", "lastNavigatedScreen", "I", "isDynamicBdnDeeplinkEnabled", "G", "(Lep0/j;)Z", "isBffScreen", "F", "hasCoachSurface", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40914b implements InterfaceC12251g, InterfaceC40915c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C29397a coachEverywhereAnalyticHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C40913a bottomNavResolver;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C40922j contextMap;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C40918f proactiveCoordinator;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C40923k voiceInputController;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC13075p1 localStateFlow;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC13075p1 lastNavigatedScreenFlow;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private C13404j screenContextBeforeOverride;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private String foregroundBottomNavTab;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private String promotedBottomNavTabKey;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean isInlineDrawerVisible;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final InterfaceC13037f2 ttfmtStartTimeMs;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final InterfaceC13037f2 state;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private Boolean lastKnownDynamicBdnState;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final Set<String> bottomSheetContextKeys;

    /* JADX INFO: renamed from: zo0.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.presentation.GlobalCoachManagerImpl$state$1", m100430f = "GlobalCoachManagerImpl.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lep0/e;", "it", "Ll83/a0;", "<anonymous>", "(Lep0/e;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f176348w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f176349x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C40914b.this.new a(interfaceC30057d);
            aVar.f176349x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13399e interfaceC13399e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13399e, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13399e interfaceC13399e = (InterfaceC13399e) this.f176349x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f176348w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C40914b.this.m132611E(interfaceC13399e);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zo0.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.presentation.GlobalCoachManagerImpl$state$2", m100430f = "GlobalCoachManagerImpl.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, m65681d2 = {"Lzo0/e;", "local", "Lep0/e;", "animation", "", "isPrefetchEnabled", "isPreviewCollapsed", "Lep0/d;", "<anonymous>", "(Lzo0/e;Lep0/e;ZZ)Lep0/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4353o {

        /* JADX INFO: renamed from: E */
        /* synthetic */ boolean f176351E;

        /* JADX INFO: renamed from: w */
        int f176352w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f176353x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f176354y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ boolean f176355z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(5, interfaceC30057d);
        }

        /* JADX INFO: renamed from: f */
        public final Object m132629f(C40917e c40917e, InterfaceC13399e interfaceC13399e, boolean z4, boolean z13, InterfaceC30057d<? super C13398d> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f176353x = c40917e;
            bVar.f176354y = interfaceC13399e;
            bVar.f176355z = z4;
            bVar.f176351E = z13;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // c93.InterfaceC4353o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return m132629f((C40917e) obj, (InterfaceC13399e) obj2, ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue(), (InterfaceC30057d) obj5);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C40917e c40917e = (C40917e) this.f176353x;
            InterfaceC13399e interfaceC13399eM37832b = (InterfaceC13399e) this.f176354y;
            boolean z4 = this.f176355z;
            boolean z13 = this.f176351E;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f176352w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (interfaceC13399eM37832b instanceof InterfaceC13399e.a) {
                interfaceC13399eM37832b = InterfaceC13399e.a.m37832b((InterfaceC13399e.a) interfaceC13399eM37832b, null, null, null, null, null, z13, 31, null);
            }
            return new C13398d(c40917e.getIsBottomSheetVisible(), c40917e.getIsFabVisible(), c40917e.getLastFabPosition(), c40917e.getCurrentScreenContext(), c40917e.getOpenConversationFingerprint(), new C13402h(z4, interfaceC13399eM37832b), null, c40917e.getCoachBarNavClearancePx(), 64, null);
        }
    }

    public C40914b(C29397a coachEverywhereAnalyticHelper, InterfaceC2994c0 coroutineScope, FeatureFlagChecker featureFlagChecker, C40913a bottomNavResolver, C40922j contextMap, C40918f proactiveCoordinator, C40923k voiceInputController, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(coachEverywhereAnalyticHelper, "coachEverywhereAnalyticHelper");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(bottomNavResolver, "bottomNavResolver");
        AbstractC22676k.m65750j(contextMap, "contextMap");
        AbstractC22676k.m65750j(proactiveCoordinator, "proactiveCoordinator");
        AbstractC22676k.m65750j(voiceInputController, "voiceInputController");
        AbstractC22676k.m65750j(logger, "logger");
        this.coachEverywhereAnalyticHelper = coachEverywhereAnalyticHelper;
        this.coroutineScope = coroutineScope;
        this.featureFlagChecker = featureFlagChecker;
        this.bottomNavResolver = bottomNavResolver;
        this.contextMap = contextMap;
        this.proactiveCoordinator = proactiveCoordinator;
        this.voiceInputController = voiceInputController;
        this.logger = logger;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C40917e(false, false, 0L, null, null, 0.0f, 63, null));
        this.localStateFlow = c13045h2M36593c;
        this.lastNavigatedScreenFlow = AbstractC13091v.m36593c(null);
        this.ttfmtStartTimeMs = proactiveCoordinator.getTtfmtStartTimeMs();
        this.state = AbstractC13091v.m36587M(AbstractC13091v.m36605o(c13045h2M36593c, new C13052j1(proactiveCoordinator.getAnimationState(), new a(null), 0), proactiveCoordinator.getIsPrefetchEnabled(), proactiveCoordinator.getIsPreviewCollapsed(), new b(null)), coroutineScope, C13105z1.f45288a, new C13398d(false, false, 0L, null, null, null, null, 0.0f, 255, null));
        this.bottomSheetContextKeys = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: C */
    private final void m132609C() {
        CoachEntry coachEntry;
        if (!AbstractC12248d.m34112e(this.featureFlagChecker) || ((C40917e) ((C13045h2) this.localStateFlow).getValue()).getIsBottomSheetVisible() || m132614H()) {
            return;
        }
        String str = this.foregroundBottomNavTab;
        C13404j c13404jM132618L = str != null ? m132618L(str) : null;
        String str2 = this.promotedBottomNavTabKey;
        if (c13404jM132618L == null || (coachEntry = c13404jM132618L.getCoachEntry()) == null || !coachEntry.getHasSurface()) {
            this.promotedBottomNavTabKey = null;
            if (str2 != null) {
                m132610D(str2);
                return;
            }
            return;
        }
        String strM37870b = AbstractC13405k.m37870b(c13404jM132618L);
        C13404j currentScreenContext = ((C40917e) ((C13045h2) this.localStateFlow).getValue()).getCurrentScreenContext();
        if (currentScreenContext == null || AbstractC22676k.m65745e(AbstractC13405k.m37870b(currentScreenContext), strM37870b) || AbstractC22676k.m65745e(AbstractC13405k.m37870b(currentScreenContext), str2)) {
            if (AbstractC22676k.m65745e(str2, strM37870b) && AbstractC22676k.m65745e(currentScreenContext, c13404jM132618L)) {
                return;
            }
            if (str2 != null && !str2.equals(strM37870b)) {
                m132610D(str2);
            }
            this.promotedBottomNavTabKey = strM37870b;
            mo34145t(true, c13404jM132618L);
        }
    }

    /* JADX INFO: renamed from: D */
    private final void m132610D(String promotedKey) {
        C13045h2 c13045h2;
        Object value;
        C13404j currentScreenContext = ((C40917e) ((C13045h2) this.localStateFlow).getValue()).getCurrentScreenContext();
        if (AbstractC22676k.m65745e(currentScreenContext != null ? AbstractC13405k.m37870b(currentScreenContext) : null, promotedKey)) {
            this.proactiveCoordinator.m132689y();
            InterfaceC13075p1 interfaceC13075p1 = this.localStateFlow;
            do {
                c13045h2 = (C13045h2) interfaceC13075p1;
                value = c13045h2.getValue();
            } while (!c13045h2.m36569i(value, C40917e.m132653b((C40917e) value, false, false, 0L, null, null, 0.0f, 53, null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final void m132611E(InterfaceC13399e proactiveAnimationState) {
        this.proactiveCoordinator.m132677l(proactiveAnimationState, ((C40917e) ((C13045h2) this.localStateFlow).getValue()).getIsBottomSheetVisible(), m132613G(((C40917e) ((C13045h2) this.localStateFlow).getValue()).getCurrentScreenContext()));
    }

    /* JADX INFO: renamed from: F */
    private final boolean m132612F(C13404j c13404j) {
        CoachEntry coachEntry;
        return (c13404j != null && c13404j.getIsWceEnabled()) || !(c13404j == null || (coachEntry = c13404j.getCoachEntry()) == null || !coachEntry.getHasSurface());
    }

    /* JADX INFO: renamed from: G */
    private final boolean m132613G(C13404j c13404j) {
        String fingerprint = c13404j != null ? c13404j.getFingerprint() : null;
        return !(fingerprint == null || fingerprint.length() == 0);
    }

    /* JADX INFO: renamed from: H */
    private final boolean m132614H() {
        return this.isInlineDrawerVisible || this.proactiveCoordinator.m132683r();
    }

    /* JADX INFO: renamed from: I */
    private final boolean m132615I() {
        C13045h2 c13045h2;
        Object value;
        boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled("wce-dynamic-bdn-deeplink-support");
        Boolean bool = this.lastKnownDynamicBdnState;
        if (bool != null && !AbstractC22676k.m65745e(bool, Boolean.valueOf(zIsFeatureEnabled))) {
            this.contextMap.m132720a();
            this.bottomNavResolver.m132607d(null);
            InterfaceC13075p1 interfaceC13075p1 = this.localStateFlow;
            do {
                c13045h2 = (C13045h2) interfaceC13075p1;
                value = c13045h2.getValue();
            } while (!c13045h2.m36569i(value, C40917e.m132653b((C40917e) value, false, false, 0L, null, null, 0.0f, 53, null)));
        }
        this.lastKnownDynamicBdnState = Boolean.valueOf(zIsFeatureEnabled);
        return zIsFeatureEnabled;
    }

    /* JADX INFO: renamed from: J */
    private final String m132616J(String tabId) {
        switch (tabId) {
            case "community":
                return "COMMUNITY";
            case "health":
                return "HEALTH";
            case "home":
                return "HOME";
            case "menu":
                return "SETTINGS";
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: K */
    private final void m132617K() {
        Iterator<T> it = this.bottomNavResolver.m132604a().iterator();
        while (it.hasNext()) {
            C13404j c13404j = (C13404j) ((C23465k) it.next()).f92938x;
            C40922j.a aVarM132725f = this.contextMap.m132725f(AbstractC13405k.m37870b(c13404j), c13404j);
            if (aVarM132725f instanceof C40922j.a.C42770a) {
                m132619M(0L, ((C40922j.a.C42770a) aVarM132725f).getOverride());
            }
        }
    }

    /* JADX INFO: renamed from: L */
    private final C13404j m132618L(String tab) {
        C13404j c13404jM132606c = this.bottomNavResolver.m132606c(tab);
        if (c13404jM132606c != null) {
            return c13404jM132606c;
        }
        String strM132616J = m132616J(tab);
        if (strM132616J != null) {
            return this.bottomNavResolver.m132606c(strM132616J);
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    private final void m132619M(long fabPosition, C13404j screenContext) {
        C13045h2 c13045h2;
        Object value;
        InterfaceC13075p1 interfaceC13075p1 = this.localStateFlow;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, C40917e.m132653b((C40917e) value, true, false, fabPosition, screenContext, null, 0.0f, 32, null)));
    }

    /* JADX INFO: renamed from: N */
    private final void m132620N(long fabPosition, C13404j screenContext) {
        C13045h2 c13045h2;
        Object value;
        String screenId;
        String source;
        C29397a c29397a = this.coachEverywhereAnalyticHelper;
        C13404j currentScreenContext = screenContext == null ? ((C40917e) ((C13045h2) this.localStateFlow).getValue()).getCurrentScreenContext() : screenContext;
        String str = null;
        if (currentScreenContext != null && (source = currentScreenContext.getSource()) != null && !AbstractC39414r.m125890i0(source)) {
            str = source;
        }
        c29397a.m89573b(str, ((Boolean) this.proactiveCoordinator.getIsPrefetchEnabled().getValue()).booleanValue() ? this.proactiveCoordinator.m132679n() : InterfaceC13399e.d.f46941a);
        if (screenContext != null && (screenId = screenContext.getScreenId()) != null) {
            this.bottomSheetContextKeys.add(screenId);
        }
        this.proactiveCoordinator.m132684t();
        InterfaceC13075p1 interfaceC13075p1 = this.localStateFlow;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, C40917e.m132653b((C40917e) value, true, false, fabPosition, screenContext, null, 0.0f, 32, null)));
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: a */
    public void mo34134a(float clearancePx) {
        float f13;
        InterfaceC13075p1 interfaceC13075p1 = this.localStateFlow;
        while (true) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            Object value = c13045h2.getValue();
            C40917e c40917eM132653b = (C40917e) value;
            if (c40917eM132653b.getCoachBarNavClearancePx() == clearancePx) {
                f13 = clearancePx;
            } else {
                f13 = clearancePx;
                c40917eM132653b = C40917e.m132653b(c40917eM132653b, false, false, 0L, null, null, f13, 31, null);
            }
            if (c13045h2.m36569i(value, c40917eM132653b)) {
                return;
            } else {
                clearancePx = f13;
            }
        }
    }

    @Override // zo0.InterfaceC40915c
    /* JADX INFO: renamed from: b */
    public void mo132621b() {
        boolean z4 = this.isInlineDrawerVisible;
        this.isInlineDrawerVisible = false;
        if (z4) {
            this.proactiveCoordinator.m132675j();
        }
        m132609C();
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: c */
    public void mo34135c() {
        C13045h2 c13045h2;
        Object value;
        C13045h2 c13045h3;
        Object value2;
        boolean z4 = !this.featureFlagChecker.isFeatureEnabled("aix-coach-bar-fab") && this.proactiveCoordinator.m132673C(((C40917e) ((C13045h2) this.localStateFlow).getValue()).getCurrentScreenContext());
        if (!m132615I()) {
            boolean zM132612F = m132612F(((C40917e) ((C13045h2) this.localStateFlow).getValue()).getCurrentScreenContext());
            this.proactiveCoordinator.m132672B(z4);
            InterfaceC13075p1 interfaceC13075p1 = this.localStateFlow;
            do {
                c13045h2 = (C13045h2) interfaceC13075p1;
                value = c13045h2.getValue();
            } while (!c13045h2.m36569i(value, C40917e.m132653b((C40917e) value, false, zM132612F, 0L, null, null, 0.0f, 44, null)));
            m132609C();
            return;
        }
        C13404j c13404j = this.screenContextBeforeOverride;
        this.screenContextBeforeOverride = null;
        C13404j currentScreenContext = ((C40917e) ((C13045h2) this.localStateFlow).getValue()).getCurrentScreenContext();
        String screenId = currentScreenContext != null ? currentScreenContext.getScreenId() : null;
        C13404j c13404jM132721b = screenId != null ? this.contextMap.m132721b(screenId) : null;
        C13404j c13404j2 = ((c13404jM132721b == null || !c13404jM132721b.getIsWceEnabled()) && ((c13404j != null && c13404j.getIsWceEnabled()) || c13404jM132721b == null)) ? c13404j : c13404jM132721b;
        boolean zM132612F2 = m132612F(c13404j2);
        this.proactiveCoordinator.m132671A();
        this.proactiveCoordinator.m132672B(z4);
        InterfaceC13075p1 interfaceC13075p2 = this.localStateFlow;
        do {
            c13045h3 = (C13045h2) interfaceC13075p2;
            value2 = c13045h3.getValue();
        } while (!c13045h3.m36569i(value2, C40917e.m132653b((C40917e) value2, false, zM132612F2, 0L, c13404j2, null, 0.0f, 36, null)));
        m132609C();
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: d */
    public void mo34136d() {
        C13045h2 c13045h2;
        Object value;
        C40917e c40917eM132653b;
        InterfaceC13075p1 interfaceC13075p1 = this.localStateFlow;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            c40917eM132653b = (C40917e) value;
            if (c40917eM132653b.getOpenConversationFingerprint() != null) {
                c40917eM132653b = C40917e.m132653b(c40917eM132653b, false, false, 0L, null, null, 0.0f, 47, null);
            }
        } while (!c13045h2.m36569i(value, c40917eM132653b));
    }

    @Override // zo0.InterfaceC40915c
    /* JADX INFO: renamed from: e, reason: from getter */
    public InterfaceC13037f2 getTtfmtStartTimeMs() {
        return this.ttfmtStartTimeMs;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: g */
    public void mo34137g(long fabPosition, String bottomNavTab, C13404j overrideContext) {
        this.proactiveCoordinator.m132684t();
        if (!m132615I()) {
            m132620N(fabPosition, bottomNavTab != null ? this.bottomNavResolver.m132605b(bottomNavTab) : this.contextMap.m132723d());
            return;
        }
        C13404j c13404jM132721b = null;
        if (overrideContext == null) {
            if (bottomNavTab != null) {
                c13404jM132721b = this.bottomNavResolver.m132606c(bottomNavTab);
            } else {
                C13404j currentScreenContext = ((C40917e) ((C13045h2) this.localStateFlow).getValue()).getCurrentScreenContext();
                String screenId = currentScreenContext != null ? currentScreenContext.getScreenId() : null;
                if (screenId != null) {
                    c13404jM132721b = this.contextMap.m132721b(screenId);
                }
            }
            m132619M(fabPosition, c13404jM132721b);
            return;
        }
        C13404j currentScreenContext2 = ((C40917e) ((C13045h2) this.localStateFlow).getValue()).getCurrentScreenContext();
        if (!AbstractC22676k.m65745e(currentScreenContext2 != null ? currentScreenContext2.getScreenId() : null, overrideContext.getScreenId()) && this.screenContextBeforeOverride == null) {
            this.screenContextBeforeOverride = currentScreenContext2;
        }
        String screenId2 = overrideContext.getScreenId();
        if (screenId2 != null) {
            this.contextMap.m132726g(screenId2, overrideContext);
            m132619M(fabPosition, overrideContext);
            return;
        }
        String screenId3 = currentScreenContext2 != null ? currentScreenContext2.getScreenId() : null;
        if (screenId3 == null) {
            screenId3 = this.contextMap.m132724e();
        }
        if (screenId3 != null && this.contextMap.m132722c(screenId3) != null) {
            this.contextMap.m132726g(screenId3, overrideContext);
        }
        m132619M(fabPosition, overrideContext);
    }

    @Override // dp0.InterfaceC12251g
    public InterfaceC13037f2 getState() {
        return this.state;
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: h */
    public void mo34138h(String screenContextKey) {
        C13045h2 c13045h2;
        Object value;
        C13045h2 c13045h3;
        Object value2;
        String strM132724e = screenContextKey == null ? this.contextMap.m132724e() : screenContextKey;
        if (strM132724e != null && this.contextMap.m132722c(strM132724e) == null) {
            this.logger.mo85216g(AbstractC11895b.m31996o("clearScreenContext: no entry for screenContextKey=", strM132724e, " (likely stale clear after same-screenId nav)"), new AbstractC30556a.a[0]);
        }
        if (strM132724e != null) {
            this.contextMap.m132727h(strM132724e);
            this.bottomSheetContextKeys.remove(strM132724e);
        }
        this.proactiveCoordinator.m132689y();
        C40917e c40917e = (C40917e) ((C13045h2) this.localStateFlow).getValue();
        if (!m132615I()) {
            C13404j c13404jM132723d = this.contextMap.m132723d();
            boolean z4 = m132612F(c13404jM132723d) && !c40917e.getIsBottomSheetVisible();
            InterfaceC13075p1 interfaceC13075p1 = this.localStateFlow;
            do {
                c13045h2 = (C13045h2) interfaceC13075p1;
                value = c13045h2.getValue();
            } while (!c13045h2.m36569i(value, C40917e.m132653b((C40917e) value, false, z4, 0L, c13404jM132723d, null, 0.0f, 53, null)));
            return;
        }
        C13404j currentScreenContext = ((C40917e) ((C13045h2) this.localStateFlow).getValue()).getCurrentScreenContext();
        C13404j c13404jM132721b = null;
        String screenId = currentScreenContext != null ? currentScreenContext.getScreenId() : null;
        if (screenId != null && !screenId.equals(strM132724e)) {
            c13404jM132721b = this.contextMap.m132721b(screenId);
        }
        C13404j c13404j = c13404jM132721b;
        boolean z13 = m132612F(c13404j) && !c40917e.getIsBottomSheetVisible();
        InterfaceC13075p1 interfaceC13075p2 = this.localStateFlow;
        do {
            c13045h3 = (C13045h2) interfaceC13075p2;
            value2 = c13045h3.getValue();
        } while (!c13045h3.m36569i(value2, C40917e.m132653b((C40917e) value2, false, z13, 0L, c13404j, null, 0.0f, 53, null)));
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: i */
    public void mo34139i(String bottomNavTab) {
        this.foregroundBottomNavTab = bottomNavTab;
        m132609C();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    @Override // zo0.InterfaceC40915c
    /* JADX INFO: renamed from: j */
    public void mo132623j() {
        String str;
        String source;
        C13404j currentScreenContext = ((C40917e) ((C13045h2) this.localStateFlow).getValue()).getCurrentScreenContext();
        C40918f c40918f = this.proactiveCoordinator;
        String fingerprint = currentScreenContext != null ? currentScreenContext.getFingerprint() : null;
        if (currentScreenContext == null || (source = currentScreenContext.getSource()) == null) {
            str = "";
        } else {
            str = AbstractC39414r.m125890i0(source) ? null : source;
            if (str == null) {
                str = "";
            }
        }
        c40918f.m132687w(fingerprint, str);
    }

    @Override // zo0.InterfaceC40915c
    /* JADX INFO: renamed from: l */
    public void mo132624l() {
        this.isInlineDrawerVisible = true;
        this.proactiveCoordinator.m132684t();
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: m */
    public void mo34140m() {
        this.proactiveCoordinator.m132675j();
        m132609C();
    }

    @Override // zo0.InterfaceC40915c
    /* JADX INFO: renamed from: n */
    public void mo132625n(AbstractC12249e event) {
        AbstractC22676k.m65750j(event, "event");
        this.coachEverywhereAnalyticHelper.m89575k(event);
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: o */
    public boolean mo34141o() {
        return ((C40917e) ((C13045h2) this.localStateFlow).getValue()).getIsBottomSheetVisible();
    }

    @Override // zo0.InterfaceC40915c
    /* JADX INFO: renamed from: p */
    public Object mo132626p(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM132685u = this.proactiveCoordinator.m132685u(str, str2, ((C40917e) ((C13045h2) this.localStateFlow).getValue()).getCurrentScreenContext(), ((C40917e) ((C13045h2) this.localStateFlow).getValue()).getIsBottomSheetVisible(), interfaceC30057d);
        return objM132685u == EnumC31071a.f128113w ? objM132685u : C23454a0.f92919a;
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: q */
    public Object mo34142q(AiContextMetadataBottomRow aiContextMetadataBottomRow, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.bottomNavResolver.m132607d(aiContextMetadataBottomRow);
        if (m132615I()) {
            m132617K();
        }
        m132609C();
        return C23454a0.f92919a;
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: r */
    public void mo34143r(String fingerprint) {
        C13045h2 c13045h2;
        Object value;
        C40917e c40917eM132653b;
        AbstractC22676k.m65750j(fingerprint, "fingerprint");
        if (AbstractC39414r.m125890i0(fingerprint)) {
            fingerprint = null;
        }
        String str = fingerprint;
        InterfaceC13075p1 interfaceC13075p1 = this.localStateFlow;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            c40917eM132653b = (C40917e) value;
            if (!AbstractC22676k.m65745e(c40917eM132653b.getOpenConversationFingerprint(), str)) {
                c40917eM132653b = C40917e.m132653b(c40917eM132653b, false, false, 0L, null, str, 0.0f, 47, null);
            }
        } while (!c13045h2.m36569i(value, c40917eM132653b));
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: s */
    public void mo34144s() {
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: t */
    public void mo34145t(boolean fabVisible, C13404j context) {
        C13404j c13404j;
        DrawerPresentation drawerPresentation;
        C13404j override;
        C13404j c13404j2;
        if (context != null) {
            C40921i c40921iM132722c = this.contextMap.m132722c(AbstractC13405k.m37870b(context));
            if (c40921iM132722c == null || (c13404j2 = c40921iM132722c.getLive.hms.video.utils.HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY java.lang.String()) == null || (drawerPresentation = c13404j2.getDrawerPresentation()) == null) {
                drawerPresentation = (c40921iM132722c == null || (override = c40921iM132722c.getOverride()) == null) ? null : override.getDrawerPresentation();
            }
            DrawerPresentation drawerPresentation2 = context.getDrawerPresentation();
            DrawerPresentation drawerPresentation3 = drawerPresentation2 == null ? drawerPresentation : drawerPresentation2;
            c13404j = context;
            C13404j c13404jM37844b = C13404j.m37844b(c13404j, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, drawerPresentation3, null, false, 7340031, null);
            C40922j.a aVarM132725f = this.contextMap.m132725f(AbstractC13405k.m37870b(c13404jM37844b), c13404jM37844b);
            if (m132615I() && (aVarM132725f instanceof C40922j.a.C42770a)) {
                m132619M(0L, ((C40922j.a.C42770a) aVarM132725f).getOverride());
                return;
            }
        } else {
            c13404j = context;
        }
        boolean z4 = fabVisible && !((C40917e) ((C13045h2) this.localStateFlow).getValue()).getIsBottomSheetVisible() && m132612F(c13404j);
        this.proactiveCoordinator.m132672B(false);
        InterfaceC13075p1 interfaceC13075p1 = this.localStateFlow;
        while (true) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            Object value = c13045h2.getValue();
            boolean z13 = z4;
            if (c13045h2.m36569i(value, C40917e.m132653b((C40917e) value, false, z13, 0L, context, null, 0.0f, 53, null))) {
                this.proactiveCoordinator.m132690z(context);
                return;
            }
            z4 = z13;
        }
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: u */
    public void mo34146u() {
        this.proactiveCoordinator.m132674i();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    @Override // zo0.InterfaceC40915c
    /* JADX INFO: renamed from: v */
    public Object mo132627v(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        String str3;
        String source;
        this.logger.mo85228t(AbstractC31061c.m95640p("Dismissing preview: conversationId=", str, ", messageId=", str2), new AbstractC30556a.a[0]);
        C13404j currentScreenContext = ((C40917e) ((C13045h2) this.localStateFlow).getValue()).getCurrentScreenContext();
        C40918f c40918f = this.proactiveCoordinator;
        String fingerprint = currentScreenContext != null ? currentScreenContext.getFingerprint() : null;
        if (currentScreenContext == null || (source = currentScreenContext.getSource()) == null) {
            str3 = "";
        } else {
            str3 = AbstractC39414r.m125890i0(source) ? null : source;
            if (str3 == null) {
                str3 = "";
            }
        }
        Object objM132686v = c40918f.m132686v(str, str2, fingerprint, str3, interfaceC30057d);
        return objM132686v == EnumC31071a.f128113w ? objM132686v : C23454a0.f92919a;
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: w */
    public void mo34147w() {
        this.proactiveCoordinator.m132688x();
        this.logger.mo85216g("Resetting global coach state on logout", new AbstractC30556a.a[0]);
        this.contextMap.m132720a();
        this.bottomNavResolver.m132607d(null);
        this.voiceInputController.m132729a();
        this.proactiveCoordinator.m132671A();
        this.screenContextBeforeOverride = null;
        this.foregroundBottomNavTab = null;
        this.promotedBottomNavTabKey = null;
        this.isInlineDrawerVisible = false;
        this.bottomSheetContextKeys.clear();
        ((C13045h2) this.lastNavigatedScreenFlow).m36570j(null);
        InterfaceC13075p1 interfaceC13075p1 = this.localStateFlow;
        C40917e c40917e = new C40917e(false, false, 0L, null, null, 0.0f, 63, null);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, c40917e);
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: x */
    public void mo34148x() {
        this.proactiveCoordinator.m132674i();
        m132609C();
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: y */
    public AbstractC21155m0 mo34149y() {
        return (AbstractC21155m0) ((C13045h2) this.lastNavigatedScreenFlow).getValue();
    }

    @Override // dp0.InterfaceC12251g
    /* JADX INFO: renamed from: z */
    public void mo34150z(AbstractC21155m0 screen) {
        ((C13045h2) this.lastNavigatedScreenFlow).m36570j(screen);
    }

    public /* synthetic */ C40914b(C29397a c29397a, InterfaceC2994c0 interfaceC2994c0, FeatureFlagChecker featureFlagChecker, C40913a c40913a, C40922j c40922j, C40918f c40918f, C40923k c40923k, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c29397a, interfaceC2994c0, featureFlagChecker, c40913a, c40922j, c40918f, c40923k, (i13 & 128) != 0 ? InterfaceC34116n.INSTANCE.m107848a("GlobalCoachManagerImpl") : interfaceC34116n);
    }
}
