package i70;

import c80.AbstractC4300a;
import com.mapbox.common.logger.LogPriority;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.domain.model.WhoopStrapInfo;
import ec3.InterfaceC13062m;
import f70.C14164a;
import f70.C14167b;
import f70.C14170c;
import f70.C14171c0;
import f70.C14174d0;
import f70.C14175d1;
import f70.C14177e0;
import f70.C14189k0;
import f70.C14192m;
import f70.C14194n;
import f70.C14196o;
import f70.C14197o0;
import f70.C14198p;
import f70.C14199p0;
import f70.C14201q0;
import f70.C14211v0;
import f70.C14212w;
import f70.C14216y;
import f70.C14218z;
import f70.EnumC14168b0;
import f70.InterfaceC14173d;
import f70.InterfaceC14176e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j70.C21391c;
import n70.C26418e;
import od1.C27847j;
import p505ts.AbstractC34132o;
import p70.InterfaceC28954b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s70.AbstractC32238a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: i70.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b*\b\u0001\u0018\u0000 C2\u00020\u0001:\u0001SB·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J.\u00106\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000201H\u0086@¢\u0006\u0004\b6\u00107J&\u00109\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00108\u001a\u000201H\u0082@¢\u0006\u0004\b9\u0010:J\u001e\u0010;\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020100H\u0082@¢\u0006\u0004\b;\u0010<J&\u0010=\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00108\u001a\u000201H\u0082@¢\u0006\u0004\b=\u0010:J&\u0010>\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00108\u001a\u000201H\u0082@¢\u0006\u0004\b>\u0010:J&\u0010?\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00108\u001a\u000201H\u0082@¢\u0006\u0004\b?\u0010:J&\u0010@\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00108\u001a\u000201H\u0082@¢\u0006\u0004\b@\u0010:J&\u0010A\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00108\u001a\u000201H\u0082@¢\u0006\u0004\bA\u0010:J&\u0010B\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00108\u001a\u000201H\u0082@¢\u0006\u0004\bB\u0010:J&\u0010C\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00108\u001a\u000201H\u0082@¢\u0006\u0004\bC\u0010:J&\u0010D\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00108\u001a\u000201H\u0082@¢\u0006\u0004\bD\u0010:J&\u0010E\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00108\u001a\u000201H\u0082@¢\u0006\u0004\bE\u0010:J0\u0010H\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00108\u001a\u0002012\b\u0010G\u001a\u0004\u0018\u00010FH\u0082@¢\u0006\u0004\bH\u0010IJ&\u0010J\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00108\u001a\u000201H\u0082@¢\u0006\u0004\bJ\u0010:J&\u0010K\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00108\u001a\u000201H\u0082@¢\u0006\u0004\bK\u0010:J&\u0010L\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00108\u001a\u000201H\u0082@¢\u0006\u0004\bL\u0010:J&\u0010M\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00108\u001a\u000201H\u0082@¢\u0006\u0004\bM\u0010:J\u001e\u0010N\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020100H\u0082@¢\u0006\u0004\bN\u0010<J\u0017\u0010Q\u001a\u00020P2\u0006\u0010O\u001a\u000201H\u0002¢\u0006\u0004\bQ\u0010RR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010uR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010vR\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010wR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010xR\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010y¨\u0006z"}, m65681d2 = {"Li70/a;", "", "Lf70/w;", "deviceEducationFetcher", "Lf70/y;", "enterEmailFetcher", "Lf70/z;", "enterYourPasswordFetcher", "Lf70/b;", "accountCreationScreensHelper", "Lf70/a;", "accountActivationFetcher", "Lf70/v0;", "postPairingHelper", "Lf70/e0;", "hwOnlyProfileHelper", "Lf70/d0;", "hwOnlyPermissionsHelper", "Lf70/c0;", "hwOnlyActivationHelper", "Lf70/p0;", "medicarePermissionsHelper", "Lf70/o0;", "medicareAfterActivationHelper", "Lf70/m;", "afterActivationFinalScreensHelper", "Lf70/p;", "alProfileHelper", "Lf70/o;", "alPermissionsHelper", "Lf70/n;", "alAfterActivationHelper", "Lf70/c;", "accountTransitionLegacyAfterActivationHelper", "Lf70/d1;", "upcycleUpdateInfoHelper", "Lf70/k0;", "iajfV2BffFetcher", "Lp70/b;", "whoopStrapInfoProvider", "Lod1/j;", "pendingUserSessionRepository", "Lj70/c;", "nextScreenAnalyticsTracker", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "ffChecker", "<init>", "(Lf70/w;Lf70/y;Lf70/z;Lf70/b;Lf70/a;Lf70/v0;Lf70/e0;Lf70/d0;Lf70/c0;Lf70/p0;Lf70/o0;Lf70/m;Lf70/p;Lf70/o;Lf70/n;Lf70/c;Lf70/d1;Lf70/k0;Lp70/b;Lod1/j;Lj70/c;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lec3/m;", "Lf70/e;", "collector", "Lf70/d$a;", "action", "prev", "r", "(Lec3/m;Lf70/d$a;Lf70/e;Lq83/d;)Ljava/lang/Object;", "prevDomainResult", "A", "(Lec3/m;Lf70/e;Lq83/d;)Ljava/lang/Object;", "B", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "C", "s", "u", "I", "E", "D", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "H", "G", "", "source", "v", "(Lec3/m;Lf70/e;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "z", "y", "x", "t", "F", "result", "Ll83/a0;", "J", "(Lf70/e;)V", "a", "Lf70/w;", "b", "Lf70/y;", "c", "Lf70/z;", "d", "Lf70/b;", "e", "Lf70/a;", "f", "Lf70/v0;", "g", "Lf70/e0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lf70/d0;", "i", "Lf70/c0;", "j", "Lf70/p0;", "k", "Lf70/o0;", "l", "Lf70/m;", "m", "Lf70/p;", "n", "Lf70/o;", "o", "Lf70/n;", "p", "Lf70/c;", "q", "Lf70/d1;", "Lf70/k0;", "Lp70/b;", "Lod1/j;", "Lj70/c;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18196a {

    /* JADX INFO: renamed from: x */
    public static final int f70579x = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C14212w deviceEducationFetcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C14216y enterEmailFetcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C14218z enterYourPasswordFetcher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C14167b accountCreationScreensHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C14164a accountActivationFetcher;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C14211v0 postPairingHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C14177e0 hwOnlyProfileHelper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C14174d0 hwOnlyPermissionsHelper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C14171c0 hwOnlyActivationHelper;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C14199p0 medicarePermissionsHelper;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C14197o0 medicareAfterActivationHelper;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C14192m afterActivationFinalScreensHelper;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C14198p alProfileHelper;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C14196o alPermissionsHelper;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C14194n alAfterActivationHelper;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C14170c accountTransitionLegacyAfterActivationHelper;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final C14175d1 upcycleUpdateInfoHelper;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final C14189k0 iajfV2BffFetcher;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final InterfaceC28954b whoopStrapInfoProvider;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final C27847j pendingUserSessionRepository;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final C21391c nextScreenAnalyticsTracker;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final FeatureFlagChecker ffChecker;

    /* JADX INFO: renamed from: i70.a$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.fetch.ScreenFetchDispatcher", m100430f = "ScreenFetchDispatcher.kt", m100431l = {122, 123}, m100432m = "fetchAccountCreationScreens", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f70602E;

        /* JADX INFO: renamed from: w */
        Object f70603w;

        /* JADX INFO: renamed from: x */
        Object f70604x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f70605y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f70605y = obj;
            this.f70602E |= Integer.MIN_VALUE;
            return C18196a.this.m52245s(null, null, this);
        }
    }

    /* JADX INFO: renamed from: i70.a$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.fetch.ScreenFetchDispatcher", m100430f = "ScreenFetchDispatcher.kt", m100431l = {252, 254, 256}, m100432m = "fetchAccountTransitionLegacyAfterActivationScreens", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f70607E;

        /* JADX INFO: renamed from: G */
        int f70609G;

        /* JADX INFO: renamed from: w */
        Object f70610w;

        /* JADX INFO: renamed from: x */
        Object f70611x;

        /* JADX INFO: renamed from: y */
        Object f70612y;

        /* JADX INFO: renamed from: z */
        Object f70613z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f70607E = obj;
            this.f70609G |= Integer.MIN_VALUE;
            return C18196a.this.m52246t(null, null, this);
        }
    }

    /* JADX INFO: renamed from: i70.a$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.fetch.ScreenFetchDispatcher", m100430f = "ScreenFetchDispatcher.kt", m100431l = {138, 139}, m100432m = "fetchActivateAccountScreens", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f70614E;

        /* JADX INFO: renamed from: w */
        Object f70615w;

        /* JADX INFO: renamed from: x */
        Object f70616x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f70617y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f70617y = obj;
            this.f70614E |= Integer.MIN_VALUE;
            return C18196a.this.m52247u(null, null, this);
        }
    }

    /* JADX INFO: renamed from: i70.a$e */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.fetch.ScreenFetchDispatcher", m100430f = "ScreenFetchDispatcher.kt", m100431l = {213, 215}, m100432m = "fetchAfterActivationFinalScreens", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f70619E;

        /* JADX INFO: renamed from: G */
        int f70621G;

        /* JADX INFO: renamed from: w */
        Object f70622w;

        /* JADX INFO: renamed from: x */
        Object f70623x;

        /* JADX INFO: renamed from: y */
        Object f70624y;

        /* JADX INFO: renamed from: z */
        Object f70625z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f70619E = obj;
            this.f70621G |= Integer.MIN_VALUE;
            return C18196a.this.m52248v(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: i70.a$f */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.fetch.ScreenFetchDispatcher", m100430f = "ScreenFetchDispatcher.kt", m100431l = {185, 187}, m100432m = "fetchAfterActivationScreens", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f70627F;

        /* JADX INFO: renamed from: w */
        Object f70628w;

        /* JADX INFO: renamed from: x */
        Object f70629x;

        /* JADX INFO: renamed from: y */
        Object f70630y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f70631z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f70631z = obj;
            this.f70627F |= Integer.MIN_VALUE;
            return C18196a.this.m52249w(null, null, this);
        }
    }

    /* JADX INFO: renamed from: i70.a$g */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.fetch.ScreenFetchDispatcher", m100430f = "ScreenFetchDispatcher.kt", m100431l = {243, 245}, m100432m = "fetchAlAfterActivationScreens", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f70633F;

        /* JADX INFO: renamed from: w */
        Object f70634w;

        /* JADX INFO: renamed from: x */
        Object f70635x;

        /* JADX INFO: renamed from: y */
        Object f70636y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f70637z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f70637z = obj;
            this.f70633F |= Integer.MIN_VALUE;
            return C18196a.this.m52250x(null, null, this);
        }
    }

    /* JADX INFO: renamed from: i70.a$h */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.fetch.ScreenFetchDispatcher", m100430f = "ScreenFetchDispatcher.kt", m100431l = {234, 236}, m100432m = "fetchAlPermissionsScreens", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f70639F;

        /* JADX INFO: renamed from: w */
        Object f70640w;

        /* JADX INFO: renamed from: x */
        Object f70641x;

        /* JADX INFO: renamed from: y */
        Object f70642y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f70643z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f70643z = obj;
            this.f70639F |= Integer.MIN_VALUE;
            return C18196a.this.m52251y(null, null, this);
        }
    }

    /* JADX INFO: renamed from: i70.a$i */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.fetch.ScreenFetchDispatcher", m100430f = "ScreenFetchDispatcher.kt", m100431l = {225, 227}, m100432m = "fetchAlProfileScreens", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f70645F;

        /* JADX INFO: renamed from: w */
        Object f70646w;

        /* JADX INFO: renamed from: x */
        Object f70647x;

        /* JADX INFO: renamed from: y */
        Object f70648y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f70649z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f70649z = obj;
            this.f70645F |= Integer.MIN_VALUE;
            return C18196a.this.m52252z(null, null, this);
        }
    }

    /* JADX INFO: renamed from: i70.a$j */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.fetch.ScreenFetchDispatcher", m100430f = "ScreenFetchDispatcher.kt", m100431l = {92, LogPriority.NONE}, m100432m = "fetchDeviceEducationScreens", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f70651F;

        /* JADX INFO: renamed from: w */
        Object f70652w;

        /* JADX INFO: renamed from: x */
        Object f70653x;

        /* JADX INFO: renamed from: y */
        Object f70654y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f70655z;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f70655z = obj;
            this.f70651F |= Integer.MIN_VALUE;
            return C18196a.this.m52218A(null, null, this);
        }
    }

    /* JADX INFO: renamed from: i70.a$k */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.fetch.ScreenFetchDispatcher", m100430f = "ScreenFetchDispatcher.kt", m100431l = {106, 107}, m100432m = "fetchEnterEmailScreen", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f70656w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f70657x;

        /* JADX INFO: renamed from: z */
        int f70659z;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f70657x = obj;
            this.f70659z |= Integer.MIN_VALUE;
            return C18196a.this.m52219B(null, this);
        }
    }

    /* JADX INFO: renamed from: i70.a$l */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.fetch.ScreenFetchDispatcher", m100430f = "ScreenFetchDispatcher.kt", m100431l = {114, 115}, m100432m = "fetchEnterPasswordScreen", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f70660E;

        /* JADX INFO: renamed from: w */
        Object f70661w;

        /* JADX INFO: renamed from: x */
        Object f70662x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f70663y;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f70663y = obj;
            this.f70660E |= Integer.MIN_VALUE;
            return C18196a.this.m52220C(null, null, this);
        }
    }

    /* JADX INFO: renamed from: i70.a$m */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.fetch.ScreenFetchDispatcher", m100430f = "ScreenFetchDispatcher.kt", m100431l = {176, 178}, m100432m = "fetchHwOnlyPermissionsScreens", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f70666F;

        /* JADX INFO: renamed from: w */
        Object f70667w;

        /* JADX INFO: renamed from: x */
        Object f70668x;

        /* JADX INFO: renamed from: y */
        Object f70669y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f70670z;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f70670z = obj;
            this.f70666F |= Integer.MIN_VALUE;
            return C18196a.this.m52221D(null, null, this);
        }
    }

    /* JADX INFO: renamed from: i70.a$n */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.fetch.ScreenFetchDispatcher", m100430f = "ScreenFetchDispatcher.kt", m100431l = {167, 169}, m100432m = "fetchHwOnlyProfileScreens", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f70672F;

        /* JADX INFO: renamed from: w */
        Object f70673w;

        /* JADX INFO: renamed from: x */
        Object f70674x;

        /* JADX INFO: renamed from: y */
        Object f70675y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f70676z;

        public n(InterfaceC30057d<? super n> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f70676z = obj;
            this.f70672F |= Integer.MIN_VALUE;
            return C18196a.this.m52222E(null, null, this);
        }
    }

    /* JADX INFO: renamed from: i70.a$o */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.fetch.ScreenFetchDispatcher", m100430f = "ScreenFetchDispatcher.kt", m100431l = {269, 270}, m100432m = "fetchInAppJoinFlowV2Bff", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f70677w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f70678x;

        /* JADX INFO: renamed from: z */
        int f70680z;

        public o(InterfaceC30057d<? super o> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f70678x = obj;
            this.f70680z |= Integer.MIN_VALUE;
            return C18196a.this.m52223F(null, this);
        }
    }

    /* JADX INFO: renamed from: i70.a$p */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.fetch.ScreenFetchDispatcher", m100430f = "ScreenFetchDispatcher.kt", m100431l = {203, 205}, m100432m = "fetchMedicareAfterActivationScreens", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f70682F;

        /* JADX INFO: renamed from: w */
        Object f70683w;

        /* JADX INFO: renamed from: x */
        Object f70684x;

        /* JADX INFO: renamed from: y */
        Object f70685y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f70686z;

        public p(InterfaceC30057d<? super p> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f70686z = obj;
            this.f70682F |= Integer.MIN_VALUE;
            return C18196a.this.m52224G(null, null, this);
        }
    }

    /* JADX INFO: renamed from: i70.a$q */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.fetch.ScreenFetchDispatcher", m100430f = "ScreenFetchDispatcher.kt", m100431l = {194, 196}, m100432m = "fetchMedicarePermissionsScreens", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f70688F;

        /* JADX INFO: renamed from: w */
        Object f70689w;

        /* JADX INFO: renamed from: x */
        Object f70690x;

        /* JADX INFO: renamed from: y */
        Object f70691y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f70692z;

        public q(InterfaceC30057d<? super q> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f70692z = obj;
            this.f70688F |= Integer.MIN_VALUE;
            return C18196a.this.m52225H(null, null, this);
        }
    }

    /* JADX INFO: renamed from: i70.a$r */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.fetch.ScreenFetchDispatcher", m100430f = "ScreenFetchDispatcher.kt", m100431l = {150, 155}, m100432m = "fetchPostPairingEmailScreen", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f70693E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f70694F;

        /* JADX INFO: renamed from: H */
        int f70696H;

        /* JADX INFO: renamed from: w */
        Object f70697w;

        /* JADX INFO: renamed from: x */
        Object f70698x;

        /* JADX INFO: renamed from: y */
        Object f70699y;

        /* JADX INFO: renamed from: z */
        Object f70700z;

        public r(InterfaceC30057d<? super r> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f70694F = obj;
            this.f70696H |= Integer.MIN_VALUE;
            return C18196a.this.m52226I(null, null, this);
        }
    }

    public C18196a(C14212w deviceEducationFetcher, C14216y enterEmailFetcher, C14218z enterYourPasswordFetcher, C14167b accountCreationScreensHelper, C14164a accountActivationFetcher, C14211v0 postPairingHelper, C14177e0 hwOnlyProfileHelper, C14174d0 hwOnlyPermissionsHelper, C14171c0 hwOnlyActivationHelper, C14199p0 medicarePermissionsHelper, C14197o0 medicareAfterActivationHelper, C14192m afterActivationFinalScreensHelper, C14198p alProfileHelper, C14196o alPermissionsHelper, C14194n alAfterActivationHelper, C14170c accountTransitionLegacyAfterActivationHelper, C14175d1 upcycleUpdateInfoHelper, C14189k0 iajfV2BffFetcher, InterfaceC28954b whoopStrapInfoProvider, C27847j pendingUserSessionRepository, C21391c nextScreenAnalyticsTracker, FeatureFlagChecker ffChecker) {
        AbstractC22676k.m65750j(deviceEducationFetcher, "deviceEducationFetcher");
        AbstractC22676k.m65750j(enterEmailFetcher, "enterEmailFetcher");
        AbstractC22676k.m65750j(enterYourPasswordFetcher, "enterYourPasswordFetcher");
        AbstractC22676k.m65750j(accountCreationScreensHelper, "accountCreationScreensHelper");
        AbstractC22676k.m65750j(accountActivationFetcher, "accountActivationFetcher");
        AbstractC22676k.m65750j(postPairingHelper, "postPairingHelper");
        AbstractC22676k.m65750j(hwOnlyProfileHelper, "hwOnlyProfileHelper");
        AbstractC22676k.m65750j(hwOnlyPermissionsHelper, "hwOnlyPermissionsHelper");
        AbstractC22676k.m65750j(hwOnlyActivationHelper, "hwOnlyActivationHelper");
        AbstractC22676k.m65750j(medicarePermissionsHelper, "medicarePermissionsHelper");
        AbstractC22676k.m65750j(medicareAfterActivationHelper, "medicareAfterActivationHelper");
        AbstractC22676k.m65750j(afterActivationFinalScreensHelper, "afterActivationFinalScreensHelper");
        AbstractC22676k.m65750j(alProfileHelper, "alProfileHelper");
        AbstractC22676k.m65750j(alPermissionsHelper, "alPermissionsHelper");
        AbstractC22676k.m65750j(alAfterActivationHelper, "alAfterActivationHelper");
        AbstractC22676k.m65750j(accountTransitionLegacyAfterActivationHelper, "accountTransitionLegacyAfterActivationHelper");
        AbstractC22676k.m65750j(upcycleUpdateInfoHelper, "upcycleUpdateInfoHelper");
        AbstractC22676k.m65750j(iajfV2BffFetcher, "iajfV2BffFetcher");
        AbstractC22676k.m65750j(whoopStrapInfoProvider, "whoopStrapInfoProvider");
        AbstractC22676k.m65750j(pendingUserSessionRepository, "pendingUserSessionRepository");
        AbstractC22676k.m65750j(nextScreenAnalyticsTracker, "nextScreenAnalyticsTracker");
        AbstractC22676k.m65750j(ffChecker, "ffChecker");
        this.deviceEducationFetcher = deviceEducationFetcher;
        this.enterEmailFetcher = enterEmailFetcher;
        this.enterYourPasswordFetcher = enterYourPasswordFetcher;
        this.accountCreationScreensHelper = accountCreationScreensHelper;
        this.accountActivationFetcher = accountActivationFetcher;
        this.postPairingHelper = postPairingHelper;
        this.hwOnlyProfileHelper = hwOnlyProfileHelper;
        this.hwOnlyPermissionsHelper = hwOnlyPermissionsHelper;
        this.hwOnlyActivationHelper = hwOnlyActivationHelper;
        this.medicarePermissionsHelper = medicarePermissionsHelper;
        this.medicareAfterActivationHelper = medicareAfterActivationHelper;
        this.afterActivationFinalScreensHelper = afterActivationFinalScreensHelper;
        this.alProfileHelper = alProfileHelper;
        this.alPermissionsHelper = alPermissionsHelper;
        this.alAfterActivationHelper = alAfterActivationHelper;
        this.accountTransitionLegacyAfterActivationHelper = accountTransitionLegacyAfterActivationHelper;
        this.upcycleUpdateInfoHelper = upcycleUpdateInfoHelper;
        this.iajfV2BffFetcher = iajfV2BffFetcher;
        this.whoopStrapInfoProvider = whoopStrapInfoProvider;
        this.pendingUserSessionRepository = pendingUserSessionRepository;
        this.nextScreenAnalyticsTracker = nextScreenAnalyticsTracker;
        this.ffChecker = ffChecker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: A */
    public final Object m52218A(InterfaceC13062m interfaceC13062m, InterfaceC14176e interfaceC14176e, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        j jVar;
        InterfaceC14176e interfaceC14176e2;
        C26418e c26418e;
        if (interfaceC30057d instanceof j) {
            jVar = (j) interfaceC30057d;
            int i13 = jVar.f70651F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jVar.f70651F = i13 - Integer.MIN_VALUE;
            } else {
                jVar = new j(interfaceC30057d);
            }
        } else {
            jVar = new j(interfaceC30057d);
        }
        Object obj = jVar.f70655z;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = jVar.f70651F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Object bVar = new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.LOADING, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            jVar.f70652w = null;
            interfaceC14176e2 = interfaceC14176e;
            jVar.f70653x = interfaceC14176e2;
            jVar.f70651F = 1;
            if (interfaceC13062m.emit(bVar, jVar) != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        InterfaceC14176e interfaceC14176e3 = (InterfaceC14176e) jVar.f70653x;
        AbstractC34132o.m107864I(obj);
        interfaceC14176e2 = interfaceC14176e3;
        if (this.whoopStrapInfoProvider.mo87912a() != null && this.ffChecker.isFeatureEnabled(OnboardingFeatureFlag.SKIP_PAIRING_IF_ALREADY_PAIRED)) {
            return AbstractC32238a.m100308c();
        }
        InterfaceC14176e.b bVar2 = interfaceC14176e2 instanceof InterfaceC14176e.b ? (InterfaceC14176e.b) interfaceC14176e2 : null;
        Integer num = (bVar2 == null || (c26418e = bVar2.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String()) == null) ? null : new Integer(c26418e.getCurrentStepIndex());
        C14212w c14212w = this.deviceEducationFetcher;
        jVar.f70652w = null;
        jVar.f70653x = null;
        jVar.f70654y = null;
        jVar.f70651F = 2;
        Object objM40627i = c14212w.m40627i(num, jVar);
        return objM40627i == obj2 ? obj2 : objM40627i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: B */
    public final Object m52219B(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        k kVar;
        if (interfaceC30057d instanceof k) {
            kVar = (k) interfaceC30057d;
            int i13 = kVar.f70659z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                kVar.f70659z = i13 - Integer.MIN_VALUE;
            } else {
                kVar = new k(interfaceC30057d);
            }
        } else {
            kVar = new k(interfaceC30057d);
        }
        Object obj = kVar.f70657x;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = kVar.f70659z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Object bVar = new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.LOADING, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            kVar.f70656w = null;
            kVar.f70659z = 1;
            if (interfaceC13062m.emit(bVar, kVar) != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        AbstractC34132o.m107864I(obj);
        C14216y c14216y = this.enterEmailFetcher;
        kVar.f70656w = null;
        kVar.f70659z = 2;
        Object objM40656c = c14216y.m40656c(kVar);
        return objM40656c == obj2 ? obj2 : objM40656c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: C */
    public final Object m52220C(InterfaceC13062m interfaceC13062m, InterfaceC14176e interfaceC14176e, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        l lVar;
        InterfaceC14176e interfaceC14176e2;
        if (interfaceC30057d instanceof l) {
            lVar = (l) interfaceC30057d;
            int i13 = lVar.f70660E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lVar.f70660E = i13 - Integer.MIN_VALUE;
            } else {
                lVar = new l(interfaceC30057d);
            }
        } else {
            lVar = new l(interfaceC30057d);
        }
        Object obj = lVar.f70663y;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = lVar.f70660E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Object bVar = new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.LOADING, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            lVar.f70661w = null;
            interfaceC14176e2 = interfaceC14176e;
            lVar.f70662x = interfaceC14176e2;
            lVar.f70660E = 1;
            if (interfaceC13062m.emit(bVar, lVar) != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        InterfaceC14176e interfaceC14176e3 = (InterfaceC14176e) lVar.f70662x;
        AbstractC34132o.m107864I(obj);
        interfaceC14176e2 = interfaceC14176e3;
        C14218z c14218z = this.enterYourPasswordFetcher;
        lVar.f70661w = null;
        lVar.f70662x = null;
        lVar.f70660E = 2;
        Object objM40660b = c14218z.m40660b(interfaceC14176e2, lVar);
        return objM40660b == obj2 ? obj2 : objM40660b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: D */
    public final Object m52221D(InterfaceC13062m interfaceC13062m, InterfaceC14176e interfaceC14176e, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        m mVar;
        InterfaceC14176e interfaceC14176e2;
        if (interfaceC30057d instanceof m) {
            mVar = (m) interfaceC30057d;
            int i13 = mVar.f70666F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                mVar.f70666F = i13 - Integer.MIN_VALUE;
            } else {
                mVar = new m(interfaceC30057d);
            }
        } else {
            mVar = new m(interfaceC30057d);
        }
        Object obj = mVar.f70670z;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = mVar.f70666F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Object bVar = new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.LOADING, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            mVar.f70667w = null;
            interfaceC14176e2 = interfaceC14176e;
            mVar.f70668x = interfaceC14176e2;
            mVar.f70666F = 1;
            if (interfaceC13062m.emit(bVar, mVar) != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        InterfaceC14176e interfaceC14176e3 = (InterfaceC14176e) mVar.f70668x;
        AbstractC34132o.m107864I(obj);
        interfaceC14176e2 = interfaceC14176e3;
        InterfaceC14176e.b bVar2 = interfaceC14176e2 instanceof InterfaceC14176e.b ? (InterfaceC14176e.b) interfaceC14176e2 : null;
        C14201q0 memberInfo = bVar2 != null ? bVar2.getMemberInfo() : null;
        C14174d0 c14174d0 = this.hwOnlyPermissionsHelper;
        mVar.f70667w = null;
        mVar.f70668x = null;
        mVar.f70669y = null;
        mVar.f70666F = 2;
        Object objM40410e = c14174d0.m40410e(memberInfo, mVar);
        return objM40410e == obj2 ? obj2 : objM40410e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: E */
    public final Object m52222E(InterfaceC13062m interfaceC13062m, InterfaceC14176e interfaceC14176e, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        n nVar;
        InterfaceC14176e interfaceC14176e2;
        if (interfaceC30057d instanceof n) {
            nVar = (n) interfaceC30057d;
            int i13 = nVar.f70672F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                nVar.f70672F = i13 - Integer.MIN_VALUE;
            } else {
                nVar = new n(interfaceC30057d);
            }
        } else {
            nVar = new n(interfaceC30057d);
        }
        Object obj = nVar.f70676z;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = nVar.f70672F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Object bVar = new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.LOADING, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            nVar.f70673w = null;
            interfaceC14176e2 = interfaceC14176e;
            nVar.f70674x = interfaceC14176e2;
            nVar.f70672F = 1;
            if (interfaceC13062m.emit(bVar, nVar) != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        InterfaceC14176e interfaceC14176e3 = (InterfaceC14176e) nVar.f70674x;
        AbstractC34132o.m107864I(obj);
        interfaceC14176e2 = interfaceC14176e3;
        InterfaceC14176e.b bVar2 = interfaceC14176e2 instanceof InterfaceC14176e.b ? (InterfaceC14176e.b) interfaceC14176e2 : null;
        C14201q0 memberInfo = bVar2 != null ? bVar2.getMemberInfo() : null;
        C14177e0 c14177e0 = this.hwOnlyProfileHelper;
        nVar.f70673w = null;
        nVar.f70674x = null;
        nVar.f70675y = null;
        nVar.f70672F = 2;
        Object objM40436b = c14177e0.m40436b(memberInfo, nVar);
        return objM40436b == obj2 ? obj2 : objM40436b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        if (r1 == r3) goto L21;
     */
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m52223F(ec3.InterfaceC13062m r29, q83.InterfaceC30057d<? super f70.InterfaceC14176e> r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r30
            boolean r2 = r1 instanceof i70.C18196a.o
            if (r2 == 0) goto L17
            r2 = r1
            i70.a$o r2 = (i70.C18196a.o) r2
            int r3 = r2.f70680z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f70680z = r3
            goto L1c
        L17:
            i70.a$o r2 = new i70.a$o
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f70678x
            r83.a r3 = r83.EnumC31071a.f128113w
            int r4 = r2.f70680z
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L43
            if (r4 == r7) goto L3b
            if (r4 != r6) goto L33
            java.lang.Object r2 = r2.f70677w
            ec3.m r2 = (ec3.InterfaceC13062m) r2
            p505ts.AbstractC34132o.m107864I(r1)
            goto L86
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            java.lang.Object r4 = r2.f70677w
            ec3.m r4 = (ec3.InterfaceC13062m) r4
            p505ts.AbstractC34132o.m107864I(r1)
            goto L79
        L43:
            p505ts.AbstractC34132o.m107864I(r1)
            f70.e$b r8 = new f70.e$b
            f70.b0 r13 = f70.EnumC14168b0.LOADING
            com.whoop.activation.iajf.domain.SignUpSource r22 = com.whoop.activation.iajf.domain.SignUpSource.IAJF_V2
            r26 = 122863(0x1dfef, float:1.72168E-40)
            r27 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r2.f70677w = r5
            r2.f70680z = r7
            r1 = r29
            java.lang.Object r1 = r1.emit(r8, r2)
            if (r1 != r3) goto L79
            goto L85
        L79:
            f70.k0 r1 = r0.iajfV2BffFetcher
            r2.f70677w = r5
            r2.f70680z = r6
            java.lang.Object r1 = r1.m40503e(r2)
            if (r1 != r3) goto L86
        L85:
            return r3
        L86:
            f70.e r1 = (f70.InterfaceC14176e) r1
            r0.m52227J(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i70.C18196a.m52223F(ec3.m, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: G */
    public final Object m52224G(InterfaceC13062m interfaceC13062m, InterfaceC14176e interfaceC14176e, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        p pVar;
        InterfaceC14176e interfaceC14176e2;
        if (interfaceC30057d instanceof p) {
            pVar = (p) interfaceC30057d;
            int i13 = pVar.f70682F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                pVar.f70682F = i13 - Integer.MIN_VALUE;
            } else {
                pVar = new p(interfaceC30057d);
            }
        } else {
            pVar = new p(interfaceC30057d);
        }
        Object obj = pVar.f70686z;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = pVar.f70682F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Object bVar = new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.LOADING, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            pVar.f70683w = null;
            interfaceC14176e2 = interfaceC14176e;
            pVar.f70684x = interfaceC14176e2;
            pVar.f70682F = 1;
            if (interfaceC13062m.emit(bVar, pVar) != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        InterfaceC14176e interfaceC14176e3 = (InterfaceC14176e) pVar.f70684x;
        AbstractC34132o.m107864I(obj);
        interfaceC14176e2 = interfaceC14176e3;
        InterfaceC14176e.b bVar2 = interfaceC14176e2 instanceof InterfaceC14176e.b ? (InterfaceC14176e.b) interfaceC14176e2 : null;
        C14201q0 memberInfo = bVar2 != null ? bVar2.getMemberInfo() : null;
        C14197o0 c14197o0 = this.medicareAfterActivationHelper;
        pVar.f70683w = null;
        pVar.f70684x = null;
        pVar.f70685y = null;
        pVar.f70682F = 2;
        Object objM40528b = c14197o0.m40528b(memberInfo, pVar);
        return objM40528b == obj2 ? obj2 : objM40528b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: H */
    public final Object m52225H(InterfaceC13062m interfaceC13062m, InterfaceC14176e interfaceC14176e, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        q qVar;
        InterfaceC14176e interfaceC14176e2;
        if (interfaceC30057d instanceof q) {
            qVar = (q) interfaceC30057d;
            int i13 = qVar.f70688F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                qVar.f70688F = i13 - Integer.MIN_VALUE;
            } else {
                qVar = new q(interfaceC30057d);
            }
        } else {
            qVar = new q(interfaceC30057d);
        }
        Object obj = qVar.f70692z;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = qVar.f70688F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Object bVar = new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.LOADING, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            qVar.f70689w = null;
            interfaceC14176e2 = interfaceC14176e;
            qVar.f70690x = interfaceC14176e2;
            qVar.f70688F = 1;
            if (interfaceC13062m.emit(bVar, qVar) != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        InterfaceC14176e interfaceC14176e3 = (InterfaceC14176e) qVar.f70690x;
        AbstractC34132o.m107864I(obj);
        interfaceC14176e2 = interfaceC14176e3;
        InterfaceC14176e.b bVar2 = interfaceC14176e2 instanceof InterfaceC14176e.b ? (InterfaceC14176e.b) interfaceC14176e2 : null;
        C14201q0 memberInfo = bVar2 != null ? bVar2.getMemberInfo() : null;
        C14199p0 c14199p0 = this.medicarePermissionsHelper;
        qVar.f70689w = null;
        qVar.f70690x = null;
        qVar.f70691y = null;
        qVar.f70688F = 2;
        Object objM40532b = c14199p0.m40532b(memberInfo, qVar);
        return objM40532b == obj2 ? obj2 : objM40532b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: I */
    public final Object m52226I(InterfaceC13062m interfaceC13062m, InterfaceC14176e interfaceC14176e, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        r rVar;
        InterfaceC14176e interfaceC14176e2;
        C26418e c26418e;
        if (interfaceC30057d instanceof r) {
            rVar = (r) interfaceC30057d;
            int i13 = rVar.f70696H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                rVar.f70696H = i13 - Integer.MIN_VALUE;
            } else {
                rVar = new r(interfaceC30057d);
            }
        } else {
            rVar = new r(interfaceC30057d);
        }
        r rVar2 = rVar;
        Object obj = rVar2.f70694F;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = rVar2.f70696H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Object bVar = new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.LOADING, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            rVar2.f70697w = null;
            interfaceC14176e2 = interfaceC14176e;
            rVar2.f70698x = interfaceC14176e2;
            rVar2.f70696H = 1;
            if (interfaceC13062m.emit(bVar, rVar2) != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        InterfaceC14176e interfaceC14176e3 = (InterfaceC14176e) rVar2.f70698x;
        AbstractC34132o.m107864I(obj);
        interfaceC14176e2 = interfaceC14176e3;
        WhoopStrapInfo whoopStrapInfoMo87912a = this.whoopStrapInfoProvider.mo87912a();
        if (whoopStrapInfoMo87912a == null) {
            return new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
        }
        boolean z4 = interfaceC14176e2 instanceof InterfaceC14176e.b;
        InterfaceC14176e.b bVar2 = z4 ? (InterfaceC14176e.b) interfaceC14176e2 : null;
        Integer num = (bVar2 == null || (c26418e = bVar2.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String()) == null) ? null : new Integer(c26418e.getCurrentStepIndex());
        InterfaceC14176e.b bVar3 = z4 ? (InterfaceC14176e.b) interfaceC14176e2 : null;
        C14201q0 memberInfo = bVar3 != null ? bVar3.getMemberInfo() : null;
        C14211v0 c14211v0 = this.postPairingHelper;
        String accessToken = this.pendingUserSessionRepository.getAccessToken();
        String strapSignature = whoopStrapInfoMo87912a.getStrapSignature();
        if (strapSignature == null) {
            strapSignature = "";
        }
        rVar2.f70697w = null;
        rVar2.f70698x = null;
        rVar2.f70699y = null;
        rVar2.f70700z = null;
        rVar2.f70693E = null;
        rVar2.f70696H = 2;
        Object objM40614c = c14211v0.m40614c(accessToken, strapSignature, num, memberInfo, rVar2);
        return objM40614c == obj2 ? obj2 : objM40614c;
    }

    /* JADX INFO: renamed from: J */
    private final void m52227J(InterfaceC14176e result) {
        InterfaceC14176e.b bVar = result instanceof InterfaceC14176e.b ? (InterfaceC14176e.b) result : null;
        if (bVar == null || !AbstractC4300a.m13542a(bVar.getSignUpSource()) || bVar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getStepTotal() <= 0) {
            return;
        }
        this.nextScreenAnalyticsTracker.m60041b(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: s */
    public final Object m52245s(InterfaceC13062m interfaceC13062m, InterfaceC14176e interfaceC14176e, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        b bVar;
        InterfaceC14176e interfaceC14176e2;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f70602E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f70602E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f70605y;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = bVar.f70602E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Object bVar2 = new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.LOADING, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            bVar.f70603w = null;
            interfaceC14176e2 = interfaceC14176e;
            bVar.f70604x = interfaceC14176e2;
            bVar.f70602E = 1;
            if (interfaceC13062m.emit(bVar2, bVar) != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        InterfaceC14176e interfaceC14176e3 = (InterfaceC14176e) bVar.f70604x;
        AbstractC34132o.m107864I(obj);
        interfaceC14176e2 = interfaceC14176e3;
        C14167b c14167b = this.accountCreationScreensHelper;
        bVar.f70603w = null;
        bVar.f70604x = null;
        bVar.f70602E = 2;
        Object objM40359d = c14167b.m40359d(interfaceC14176e2, bVar);
        return objM40359d == obj2 ? obj2 : objM40359d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00df, code lost:
    
        if (r1 == r3) goto L35;
     */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m52246t(ec3.InterfaceC13062m r30, f70.InterfaceC14176e r31, q83.InterfaceC30057d<? super f70.InterfaceC14176e> r32) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i70.C18196a.m52246t(ec3.m, f70.e, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: u */
    public final Object m52247u(InterfaceC13062m interfaceC13062m, InterfaceC14176e interfaceC14176e, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        d dVar;
        Object objM40350b = interfaceC14176e;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f70614E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f70614E = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f70617y;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = dVar.f70614E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (objM40350b instanceof InterfaceC14176e.b) {
                InterfaceC14176e.b bVar = (InterfaceC14176e.b) objM40350b;
                if (bVar.getFullScreenState() != EnumC14168b0.CONTENT || bVar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentStepIndex() <= 0) {
                    Object objM40416b = InterfaceC14176e.b.m40416b(bVar, null, null, null, null, EnumC14168b0.LOADING, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
                    dVar.f70615w = null;
                    dVar.f70616x = objM40350b;
                    dVar.f70614E = 1;
                    if (interfaceC13062m.emit(objM40416b, dVar) != obj2) {
                    }
                }
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        objM40350b = (InterfaceC14176e) dVar.f70616x;
        AbstractC34132o.m107864I(obj);
        dVar.f70615w = null;
        dVar.f70616x = null;
        dVar.f70614E = 2;
        objM40350b = this.accountActivationFetcher.m40350b((InterfaceC14176e.b) objM40350b, dVar);
        return objM40350b == obj2 ? obj2 : objM40350b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: v */
    public final Object m52248v(InterfaceC13062m interfaceC13062m, InterfaceC14176e interfaceC14176e, String str, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        e eVar;
        InterfaceC14176e interfaceC14176e2;
        String str2;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f70621G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f70621G = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object obj = eVar.f70619E;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = eVar.f70621G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Object bVar = new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.LOADING, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            eVar.f70622w = null;
            interfaceC14176e2 = interfaceC14176e;
            eVar.f70623x = interfaceC14176e2;
            str2 = str;
            eVar.f70624y = str2;
            eVar.f70621G = 1;
            if (interfaceC13062m.emit(bVar, eVar) != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        str2 = (String) eVar.f70624y;
        InterfaceC14176e interfaceC14176e3 = (InterfaceC14176e) eVar.f70623x;
        AbstractC34132o.m107864I(obj);
        interfaceC14176e2 = interfaceC14176e3;
        InterfaceC14176e.b bVar2 = interfaceC14176e2 instanceof InterfaceC14176e.b ? (InterfaceC14176e.b) interfaceC14176e2 : null;
        C14201q0 memberInfo = bVar2 != null ? bVar2.getMemberInfo() : null;
        C14192m c14192m = this.afterActivationFinalScreensHelper;
        eVar.f70622w = null;
        eVar.f70623x = null;
        eVar.f70624y = null;
        eVar.f70625z = null;
        eVar.f70621G = 2;
        Object objM40507b = c14192m.m40507b(str2, memberInfo, eVar);
        return objM40507b == obj2 ? obj2 : objM40507b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: w */
    public final Object m52249w(InterfaceC13062m interfaceC13062m, InterfaceC14176e interfaceC14176e, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        f fVar;
        InterfaceC14176e interfaceC14176e2;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f70627F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f70627F = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object obj = fVar.f70631z;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = fVar.f70627F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Object bVar = new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.LOADING, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            fVar.f70628w = null;
            interfaceC14176e2 = interfaceC14176e;
            fVar.f70629x = interfaceC14176e2;
            fVar.f70627F = 1;
            if (interfaceC13062m.emit(bVar, fVar) != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        InterfaceC14176e interfaceC14176e3 = (InterfaceC14176e) fVar.f70629x;
        AbstractC34132o.m107864I(obj);
        interfaceC14176e2 = interfaceC14176e3;
        InterfaceC14176e.b bVar2 = interfaceC14176e2 instanceof InterfaceC14176e.b ? (InterfaceC14176e.b) interfaceC14176e2 : null;
        C14201q0 memberInfo = bVar2 != null ? bVar2.getMemberInfo() : null;
        C14171c0 c14171c0 = this.hwOnlyActivationHelper;
        fVar.f70628w = null;
        fVar.f70629x = null;
        fVar.f70630y = null;
        fVar.f70627F = 2;
        Object objM40367b = c14171c0.m40367b(memberInfo, fVar);
        return objM40367b == obj2 ? obj2 : objM40367b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: x */
    public final Object m52250x(InterfaceC13062m interfaceC13062m, InterfaceC14176e interfaceC14176e, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        g gVar;
        InterfaceC14176e interfaceC14176e2;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f70633F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f70633F = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object obj = gVar.f70637z;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = gVar.f70633F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Object bVar = new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.LOADING, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            gVar.f70634w = null;
            interfaceC14176e2 = interfaceC14176e;
            gVar.f70635x = interfaceC14176e2;
            gVar.f70633F = 1;
            if (interfaceC13062m.emit(bVar, gVar) != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        InterfaceC14176e interfaceC14176e3 = (InterfaceC14176e) gVar.f70635x;
        AbstractC34132o.m107864I(obj);
        interfaceC14176e2 = interfaceC14176e3;
        InterfaceC14176e.b bVar2 = interfaceC14176e2 instanceof InterfaceC14176e.b ? (InterfaceC14176e.b) interfaceC14176e2 : null;
        C14201q0 memberInfo = bVar2 != null ? bVar2.getMemberInfo() : null;
        C14194n c14194n = this.alAfterActivationHelper;
        gVar.f70634w = null;
        gVar.f70635x = null;
        gVar.f70636y = null;
        gVar.f70633F = 2;
        Object objM40523b = c14194n.m40523b(memberInfo, gVar);
        return objM40523b == obj2 ? obj2 : objM40523b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: y */
    public final Object m52251y(InterfaceC13062m interfaceC13062m, InterfaceC14176e interfaceC14176e, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        h hVar;
        InterfaceC14176e interfaceC14176e2;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f70639F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f70639F = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object obj = hVar.f70643z;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = hVar.f70639F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Object bVar = new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.LOADING, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            hVar.f70640w = null;
            interfaceC14176e2 = interfaceC14176e;
            hVar.f70641x = interfaceC14176e2;
            hVar.f70639F = 1;
            if (interfaceC13062m.emit(bVar, hVar) != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        InterfaceC14176e interfaceC14176e3 = (InterfaceC14176e) hVar.f70641x;
        AbstractC34132o.m107864I(obj);
        interfaceC14176e2 = interfaceC14176e3;
        InterfaceC14176e.b bVar2 = interfaceC14176e2 instanceof InterfaceC14176e.b ? (InterfaceC14176e.b) interfaceC14176e2 : null;
        C14201q0 memberInfo = bVar2 != null ? bVar2.getMemberInfo() : null;
        C14196o c14196o = this.alPermissionsHelper;
        hVar.f70640w = null;
        hVar.f70641x = null;
        hVar.f70642y = null;
        hVar.f70639F = 2;
        Object objM40525b = c14196o.m40525b(memberInfo, hVar);
        return objM40525b == obj2 ? obj2 : objM40525b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: z */
    public final Object m52252z(InterfaceC13062m interfaceC13062m, InterfaceC14176e interfaceC14176e, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        i iVar;
        InterfaceC14176e interfaceC14176e2;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f70645F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f70645F = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        Object obj = iVar.f70649z;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = iVar.f70645F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Object bVar = new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.LOADING, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            iVar.f70646w = null;
            interfaceC14176e2 = interfaceC14176e;
            iVar.f70647x = interfaceC14176e2;
            iVar.f70645F = 1;
            if (interfaceC13062m.emit(bVar, iVar) != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        InterfaceC14176e interfaceC14176e3 = (InterfaceC14176e) iVar.f70647x;
        AbstractC34132o.m107864I(obj);
        interfaceC14176e2 = interfaceC14176e3;
        InterfaceC14176e.b bVar2 = interfaceC14176e2 instanceof InterfaceC14176e.b ? (InterfaceC14176e.b) interfaceC14176e2 : null;
        C14201q0 memberInfo = bVar2 != null ? bVar2.getMemberInfo() : null;
        C14198p c14198p = this.alProfileHelper;
        iVar.f70646w = null;
        iVar.f70647x = null;
        iVar.f70648y = null;
        iVar.f70645F = 2;
        Object objM40530b = c14198p.m40530b(memberInfo, iVar);
        return objM40530b == obj2 ? obj2 : objM40530b;
    }

    /* JADX INFO: renamed from: r */
    public final Object m52253r(InterfaceC13062m interfaceC13062m, InterfaceC14173d.a aVar, InterfaceC14176e interfaceC14176e, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        if (aVar instanceof InterfaceC14173d.o) {
            return m52218A(interfaceC13062m, interfaceC14176e, interfaceC30057d);
        }
        if (aVar instanceof InterfaceC14173d.p) {
            return m52219B(interfaceC13062m, interfaceC30057d);
        }
        if (aVar instanceof InterfaceC14173d.q) {
            return m52220C(interfaceC13062m, interfaceC14176e, interfaceC30057d);
        }
        if (aVar instanceof InterfaceC14173d.h) {
            return m52245s(interfaceC13062m, interfaceC14176e, interfaceC30057d);
        }
        if (aVar instanceof InterfaceC14173d.g) {
            return m52247u(interfaceC13062m, interfaceC14176e, interfaceC30057d);
        }
        if (aVar instanceof InterfaceC14173d.w) {
            return m52226I(interfaceC13062m, interfaceC14176e, interfaceC30057d);
        }
        if (aVar instanceof InterfaceC14173d.s) {
            return m52222E(interfaceC13062m, interfaceC14176e, interfaceC30057d);
        }
        if (aVar instanceof InterfaceC14173d.r) {
            return m52221D(interfaceC13062m, interfaceC14176e, interfaceC30057d);
        }
        if (aVar instanceof InterfaceC14173d.j) {
            return m52249w(interfaceC13062m, interfaceC14176e, interfaceC30057d);
        }
        if (aVar instanceof InterfaceC14173d.v) {
            return m52225H(interfaceC13062m, interfaceC14176e, interfaceC30057d);
        }
        if (aVar instanceof InterfaceC14173d.u) {
            return m52224G(interfaceC13062m, interfaceC14176e, interfaceC30057d);
        }
        if (aVar instanceof InterfaceC14173d.k) {
            return m52248v(interfaceC13062m, interfaceC14176e, ((InterfaceC14173d.k) aVar).getSource(), interfaceC30057d);
        }
        if (aVar instanceof InterfaceC14173d.n) {
            return m52252z(interfaceC13062m, interfaceC14176e, interfaceC30057d);
        }
        if (aVar instanceof InterfaceC14173d.m) {
            return m52251y(interfaceC13062m, interfaceC14176e, interfaceC30057d);
        }
        if (aVar instanceof InterfaceC14173d.l) {
            return m52250x(interfaceC13062m, interfaceC14176e, interfaceC30057d);
        }
        if (aVar instanceof InterfaceC14173d.i) {
            return m52246t(interfaceC13062m, interfaceC14176e, interfaceC30057d);
        }
        if (aVar instanceof InterfaceC14173d.t) {
            return m52223F(interfaceC13062m, interfaceC30057d);
        }
        throw new NoWhenBranchMatchedException();
    }
}
