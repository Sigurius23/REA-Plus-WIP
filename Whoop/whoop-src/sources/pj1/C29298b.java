package pj1;

import android.os.RemoteException;
import com.mapbox.common.logger.LogPriority;
import com.whoop.data.repositories.FeatureFlagChecker;
import ij1.C18596a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21461d;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.C25235a0;
import p030b7.InterfaceC2773b;
import p030b7.InterfaceC2774c;
import p098dt.AbstractC12350b;
import p274k7.AbstractC22238b;
import p322m7.C25127a;
import p322m7.C25129a1;
import p322m7.C25130b;
import p322m7.C25131b0;
import p322m7.C25133c;
import p322m7.C25136d;
import p322m7.C25137d0;
import p322m7.C25138d1;
import p322m7.C25139e;
import p322m7.C25141e1;
import p322m7.C25142f;
import p322m7.C25144f1;
import p322m7.C25147g1;
import p322m7.C25148h;
import p322m7.C25149h0;
import p322m7.C25154j0;
import p322m7.C25155k;
import p322m7.C25160m0;
import p322m7.C25161n;
import p322m7.C25162n0;
import p322m7.C25163o;
import p322m7.C25164o0;
import p322m7.C25168q0;
import p322m7.C25172s0;
import p322m7.C25174t0;
import p322m7.C25179w;
import p322m7.C25182x0;
import p322m7.C25184y0;
import p322m7.C25185z;
import p322m7.InterfaceC25170r0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qj1.C30429b;
import qj1.C30430c;
import qj1.C30431d;
import qj1.C30432e;
import qj1.C30433f;
import qj1.C30434g;
import qj1.C30435h;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: pj1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0007\u0018\u0000 02\u00020\u0001:\u00017B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001e\u001a\u00020\u001d2\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001aH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010$\u001a\u00020#\"\b\b\u0000\u0010 *\u00020\u001b2\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001a2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0082@¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u001d¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u001d¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b+\u0010*J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,H\u0086@¢\u0006\u0004\b.\u0010*J\u0010\u0010/\u001a\u00020#H\u0086@¢\u0006\u0004\b/\u0010*J\u0010\u00100\u001a\u00020#H\u0086@¢\u0006\u0004\b0\u0010*J\u0010\u00101\u001a\u00020#H\u0086@¢\u0006\u0004\b1\u0010*J\u0010\u00102\u001a\u00020#H\u0086@¢\u0006\u0004\b2\u0010*J\u0010\u00103\u001a\u00020#H\u0086@¢\u0006\u0004\b3\u0010*J\u0010\u00104\u001a\u00020#H\u0086@¢\u0006\u0004\b4\u0010*J\u0010\u00105\u001a\u00020#H\u0086@¢\u0006\u0004\b5\u0010*J\u0010\u00106\u001a\u00020#H\u0086@¢\u0006\u0004\b6\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010=R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010>R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010?R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010@R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010AR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010BR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010CR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010D¨\u0006E"}, m65681d2 = {"Lpj1/b;", "", "Lij1/a;", "healthConnectClientWrapper", "Lqj1/c;", "healthConnectExerciseSessionManager", "Lqj1/d;", "healthConnectHeightManager", "Lqj1/h;", "healthConnectWeightManager", "Lqj1/g;", "healthConnectNutritionManager", "Lqj1/f;", "healthConnectMenstruationFlowManager", "Lqj1/e;", "healthConnectLeanBodyMassManager", "Lqj1/b;", "healthConnectBodyFatManager", "Lpj1/c;", "healthConnectWhoopRecordsWriter", "Ltr2/n;", "logger", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lij1/a;Lqj1/c;Lqj1/d;Lqj1/h;Lqj1/g;Lqj1/f;Lqj1/e;Lqj1/b;Lpj1/c;Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lj93/d;", "Lm7/r0;", "recordType", "", "i", "(Lj93/d;Lq83/d;)Ljava/lang/Object;", "T", "Lqj1/a;", "reader", "Ll83/a0;", "p", "(Lj93/d;Lqj1/a;Lq83/d;)Ljava/lang/Object;", "g", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "(Lq83/d;)Ljava/lang/Object;", "r", "", "", "e", "k", "l", "q", "o", "n", "m", "j", "d", "a", "Lij1/a;", "b", "Lqj1/c;", "c", "Lqj1/d;", "Lqj1/h;", "Lqj1/g;", "Lqj1/f;", "Lqj1/e;", "Lqj1/b;", "Lpj1/c;", "Ltr2/n;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29298b {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m */
    public static final int f118563m = 8;

    /* JADX INFO: renamed from: n */
    private static final Set<String> f118564n;

    /* JADX INFO: renamed from: o */
    private static final Set<String> f118565o;

    /* JADX INFO: renamed from: p */
    private static final Set<String> f118566p;

    /* JADX INFO: renamed from: q */
    private static final Set<String> f118567q;

    /* JADX INFO: renamed from: r */
    private static final Set<String> f118568r;

    /* JADX INFO: renamed from: s */
    private static final Set<String> f118569s;

    /* JADX INFO: renamed from: t */
    private static final String f118570t;

    /* JADX INFO: renamed from: u */
    private static final Set<String> f118571u;

    /* JADX INFO: renamed from: v */
    private static final Set<String> f118572v;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C18596a healthConnectClientWrapper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C30430c healthConnectExerciseSessionManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C30431d healthConnectHeightManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C30435h healthConnectWeightManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C30434g healthConnectNutritionManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C30433f healthConnectMenstruationFlowManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C30432e healthConnectLeanBodyMassManager;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C30429b healthConnectBodyFatManager;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C29299c healthConnectWhoopRecordsWriter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: pj1.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lpj1/b$a;", "", "<init>", "()V", "", "", "rockyPermissionsRequested", "Ljava/util/Set;", "a", "()Ljava/util/Set;", "workoutPermissions", "bodyMeasurementPermissions", "sleepPermissions", "vitalsPermissions", "dietaryPermissions", "activityPermissions", "stepsPermissions", "Ljava/lang/String;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Set<String> m88936a() {
            return C29298b.f118572v;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: pj1.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.healthconnect.repository.HealthConnectRepository", m100430f = "HealthConnectRepository.kt", m100431l = {121, 120}, m100432m = "fetchAndMutateWhoopRecords", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f118585F;

        /* JADX INFO: renamed from: w */
        Object f118586w;

        /* JADX INFO: renamed from: x */
        Object f118587x;

        /* JADX INFO: renamed from: y */
        int f118588y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f118589z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f118589z = obj;
            this.f118585F |= Integer.MIN_VALUE;
            return C29298b.this.m88923d(this);
        }
    }

    /* JADX INFO: renamed from: pj1.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.healthconnect.repository.HealthConnectRepository", m100430f = "HealthConnectRepository.kt", m100431l = {79}, m100432m = "getHealthConnectGrantedPermissions", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f118590E;

        /* JADX INFO: renamed from: w */
        Object f118591w;

        /* JADX INFO: renamed from: x */
        int f118592x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f118593y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f118593y = obj;
            this.f118590E |= Integer.MIN_VALUE;
            return C29298b.this.m88924e(this);
        }
    }

    /* JADX INFO: renamed from: pj1.b$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthconnect.repository.HealthConnectRepository", m100430f = "HealthConnectRepository.kt", m100431l = {68}, m100432m = "isHealthConnectConnected", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f118595w;

        /* JADX INFO: renamed from: y */
        int f118597y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f118595w = obj;
            this.f118597y |= Integer.MIN_VALUE;
            return C29298b.this.m88925f(this);
        }
    }

    /* JADX INFO: renamed from: pj1.b$e */
    @InterfaceC32271e(m100429c = "com.whoop.healthconnect.repository.HealthConnectRepository", m100430f = "HealthConnectRepository.kt", m100431l = {93}, m100432m = "isPermissionGranted", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f118598E;

        /* JADX INFO: renamed from: w */
        Object f118599w;

        /* JADX INFO: renamed from: x */
        Object f118600x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f118601y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f118601y = obj;
            this.f118598E |= Integer.MIN_VALUE;
            return C29298b.this.m88921i(null, this);
        }
    }

    /* JADX INFO: renamed from: pj1.b$f */
    @InterfaceC32271e(m100429c = "com.whoop.healthconnect.repository.HealthConnectRepository", m100430f = "HealthConnectRepository.kt", m100431l = {98, LogPriority.NONE}, m100432m = "readRecordsOfType", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f<T extends InterfaceC25170r0> extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f118603E;

        /* JADX INFO: renamed from: G */
        int f118605G;

        /* JADX INFO: renamed from: w */
        Object f118606w;

        /* JADX INFO: renamed from: x */
        Object f118607x;

        /* JADX INFO: renamed from: y */
        Object f118608y;

        /* JADX INFO: renamed from: z */
        int f118609z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f118603E = obj;
            this.f118605G |= Integer.MIN_VALUE;
            return C29298b.this.m88922p(null, null, this);
        }
    }

    /* JADX INFO: renamed from: pj1.b$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthconnect.repository.HealthConnectRepository", m100430f = "HealthConnectRepository.kt", m100431l = {72}, m100432m = "wereAllPermissionsGranted", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f118610w;

        /* JADX INFO: renamed from: y */
        int f118612y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f118610w = obj;
            this.f118612y |= Integer.MIN_VALUE;
            return C29298b.this.m88935r(this);
        }
    }

    static {
        Object obj = AbstractC22238b.f86659a;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Set<String> setM74059b1 = AbstractC25260n.m74059b1(new String[]{AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25127a.class)), AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25161n.class)), AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25163o.class)), AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25179w.class)), AbstractC21478l0.m60403I(c22673i0.getOrCreateKotlinClass(C25127a.class)), AbstractC21478l0.m60403I(c22673i0.getOrCreateKotlinClass(C25179w.class))});
        f118564n = setM74059b1;
        Set<String> setM74059b2 = AbstractC25260n.m74059b1(new String[]{AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25130b.class)), AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25133c.class)), AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25136d.class)), AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25139e.class)), AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25142f.class)), AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25148h.class)), AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25155k.class)), AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25131b0.class)), AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25149h0.class)), AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25154j0.class)), AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25162n0.class)), AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25147g1.class)), AbstractC21478l0.m60403I(c22673i0.getOrCreateKotlinClass(C25149h0.class)), AbstractC21478l0.m60403I(c22673i0.getOrCreateKotlinClass(C25147g1.class))});
        f118565o = setM74059b2;
        Set<String> setM74059b3 = AbstractC25260n.m74059b1(new String[]{AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25182x0.class)), AbstractC21478l0.m60403I(c22673i0.getOrCreateKotlinClass(C25182x0.class)), AbstractC21478l0.m60403I(c22673i0.getOrCreateKotlinClass(C25184y0.class))});
        f118566p = setM74059b3;
        Set<String> setM74059b4 = AbstractC25260n.m74059b1(new String[]{AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25185z.class)), AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25164o0.class)), AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25172s0.class)), AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25174t0.class)), AbstractC21478l0.m60403I(c22673i0.getOrCreateKotlinClass(C25185z.class)), AbstractC21478l0.m60403I(c22673i0.getOrCreateKotlinClass(C25164o0.class)), AbstractC21478l0.m60403I(c22673i0.getOrCreateKotlinClass(C25172s0.class)), AbstractC21478l0.m60403I(c22673i0.getOrCreateKotlinClass(C25174t0.class))});
        f118567q = setM74059b4;
        Set<String> setM74059b5 = AbstractC25260n.m74059b1(new String[]{AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25137d0.class)), AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25160m0.class))});
        f118568r = setM74059b5;
        Set<String> setM74059b6 = AbstractC25260n.m74059b1(new String[]{AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25168q0.class)), AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25129a1.class)), AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25141e1.class)), AbstractC21478l0.m60401G(c22673i0.getOrCreateKotlinClass(C25144f1.class))});
        f118569s = setM74059b6;
        String strM60403I = AbstractC21478l0.m60403I(c22673i0.getOrCreateKotlinClass(C25138d1.class));
        f118570t = strM60403I;
        LinkedHashSet linkedHashSetM34556E = AbstractC12350b.m34556E(AbstractC12350b.m34556E(AbstractC12350b.m34556E(AbstractC12350b.m34556E(AbstractC12350b.m34556E(setM74059b6, setM74059b2), setM74059b5), setM74059b3), setM74059b4), setM74059b1);
        f118571u = linkedHashSetM34556E;
        f118572v = AbstractC12350b.m34555D(strM60403I, linkedHashSetM34556E);
    }

    public C29298b(C18596a healthConnectClientWrapper, C30430c healthConnectExerciseSessionManager, C30431d healthConnectHeightManager, C30435h healthConnectWeightManager, C30434g healthConnectNutritionManager, C30433f healthConnectMenstruationFlowManager, C30432e healthConnectLeanBodyMassManager, C30429b healthConnectBodyFatManager, C29299c healthConnectWhoopRecordsWriter, InterfaceC34116n logger, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(healthConnectClientWrapper, "healthConnectClientWrapper");
        AbstractC22676k.m65750j(healthConnectExerciseSessionManager, "healthConnectExerciseSessionManager");
        AbstractC22676k.m65750j(healthConnectHeightManager, "healthConnectHeightManager");
        AbstractC22676k.m65750j(healthConnectWeightManager, "healthConnectWeightManager");
        AbstractC22676k.m65750j(healthConnectNutritionManager, "healthConnectNutritionManager");
        AbstractC22676k.m65750j(healthConnectMenstruationFlowManager, "healthConnectMenstruationFlowManager");
        AbstractC22676k.m65750j(healthConnectLeanBodyMassManager, "healthConnectLeanBodyMassManager");
        AbstractC22676k.m65750j(healthConnectBodyFatManager, "healthConnectBodyFatManager");
        AbstractC22676k.m65750j(healthConnectWhoopRecordsWriter, "healthConnectWhoopRecordsWriter");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.healthConnectClientWrapper = healthConnectClientWrapper;
        this.healthConnectExerciseSessionManager = healthConnectExerciseSessionManager;
        this.healthConnectHeightManager = healthConnectHeightManager;
        this.healthConnectWeightManager = healthConnectWeightManager;
        this.healthConnectNutritionManager = healthConnectNutritionManager;
        this.healthConnectMenstruationFlowManager = healthConnectMenstruationFlowManager;
        this.healthConnectLeanBodyMassManager = healthConnectLeanBodyMassManager;
        this.healthConnectBodyFatManager = healthConnectBodyFatManager;
        this.healthConnectWhoopRecordsWriter = healthConnectWhoopRecordsWriter;
        this.logger = logger;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m88921i(InterfaceC21461d interfaceC21461d, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        e eVar;
        String strM60401G;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f118598E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f118598E = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object objM88924e = eVar.f118601y;
        Object obj = EnumC31071a.f128113w;
        int i14 = eVar.f118598E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM88924e);
            Object obj2 = AbstractC22238b.f86659a;
            strM60401G = AbstractC21478l0.m60401G(interfaceC21461d);
            eVar.f118599w = null;
            eVar.f118600x = strM60401G;
            eVar.f118598E = 1;
            objM88924e = m88924e(eVar);
            if (objM88924e == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            strM60401G = (String) eVar.f118600x;
            AbstractC34132o.m107864I(objM88924e);
        }
        return Boolean.valueOf(((Set) objM88924e).contains(strM60401G));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x007d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
    
        if (r9.m93050h(r10, 30, r0) == r1) goto L26;
     */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T extends p322m7.InterfaceC25170r0> java.lang.Object m88922p(j93.InterfaceC21461d r8, qj1.AbstractC30428a<T> r9, q83.InterfaceC30057d<? super l83.C23454a0> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof pj1.C29298b.f
            if (r0 == 0) goto L13
            r0 = r10
            pj1.b$f r0 = (pj1.C29298b.f) r0
            int r1 = r0.f118605G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f118605G = r1
            goto L18
        L13:
            pj1.b$f r0 = new pj1.b$f
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f118603E
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f118605G
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L55
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r8 = r0.f118608y
            b7.b r8 = (p030b7.InterfaceC2773b) r8
            java.lang.Object r8 = r0.f118607x
            qj1.a r8 = (qj1.AbstractC30428a) r8
            java.lang.Object r8 = r0.f118606w
            j93.d r8 = (j93.InterfaceC21461d) r8
            p505ts.AbstractC34132o.m107864I(r10)
            goto L90
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3f:
            int r8 = r0.f118609z
            java.lang.Object r9 = r0.f118608y
            b7.b r9 = (p030b7.InterfaceC2773b) r9
            java.lang.Object r2 = r0.f118607x
            qj1.a r2 = (qj1.AbstractC30428a) r2
            java.lang.Object r4 = r0.f118606w
            j93.d r4 = (j93.InterfaceC21461d) r4
            p505ts.AbstractC34132o.m107864I(r10)
            r6 = r10
            r10 = r9
            r9 = r2
            r2 = r6
            goto L75
        L55:
            p505ts.AbstractC34132o.m107864I(r10)
            ij1.a r10 = r7.healthConnectClientWrapper
            b7.b r10 = r10.m53813a()
            if (r10 == 0) goto L90
            r0.f118606w = r5
            r0.f118607x = r9
            r0.f118608y = r10
            r2 = 0
            r0.f118609z = r2
            r0.f118605G = r4
            java.lang.Object r8 = r7.m88921i(r8, r0)
            if (r8 != r1) goto L72
            goto L8f
        L72:
            r6 = r2
            r2 = r8
            r8 = r6
        L75:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L90
            r0.f118606w = r5
            r0.f118607x = r5
            r0.f118608y = r5
            r0.f118609z = r8
            r0.f118605G = r3
            r2 = 30
            java.lang.Object r8 = r9.m93050h(r10, r2, r0)
            if (r8 != r1) goto L90
        L8f:
            return r1
        L90:
            l83.a0 r8 = l83.C23454a0.f92919a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pj1.C29298b.m88922p(j93.d, qj1.a, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r4.m88943e(r5, (java.util.Set) r9, r0) == r1) goto L24;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m88923d(q83.InterfaceC30057d<? super l83.C23454a0> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof pj1.C29298b.b
            if (r0 == 0) goto L13
            r0 = r9
            pj1.b$b r0 = (pj1.C29298b.b) r0
            int r1 = r0.f118585F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f118585F = r1
            goto L18
        L13:
            pj1.b$b r0 = new pj1.b$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f118589z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f118585F
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.f118586w
            b7.b r0 = (p030b7.InterfaceC2773b) r0
            p505ts.AbstractC34132o.m107864I(r9)
            goto L76
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L36:
            int r2 = r0.f118588y
            java.lang.Object r4 = r0.f118587x
            pj1.c r4 = (pj1.C29299c) r4
            java.lang.Object r5 = r0.f118586w
            b7.b r5 = (p030b7.InterfaceC2773b) r5
            p505ts.AbstractC34132o.m107864I(r9)
            goto L64
        L44:
            p505ts.AbstractC34132o.m107864I(r9)
            ij1.a r9 = r8.healthConnectClientWrapper
            b7.b r5 = r9.m53813a()
            if (r5 == 0) goto L76
            pj1.c r9 = r8.healthConnectWhoopRecordsWriter
            r0.f118586w = r5
            r0.f118587x = r9
            r2 = 0
            r0.f118588y = r2
            r0.f118585F = r4
            java.lang.Object r4 = r8.m88924e(r0)
            if (r4 != r1) goto L61
            goto L75
        L61:
            r7 = r4
            r4 = r9
            r9 = r7
        L64:
            java.util.Set r9 = (java.util.Set) r9
            r6 = 0
            r0.f118586w = r6
            r0.f118587x = r6
            r0.f118588y = r2
            r0.f118585F = r3
            java.lang.Object r9 = r4.m88943e(r5, r9, r0)
            if (r9 != r1) goto L76
        L75:
            return r1
        L76:
            l83.a0 r9 = l83.C23454a0.f92919a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pj1.C29298b.m88923d(q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m88924e(InterfaceC30057d<? super Set<String>> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f118590E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f118590E = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f118593y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f118590E;
        try {
            if (i14 != 0) {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC2773b interfaceC2773bM53813a = this.healthConnectClientWrapper.m53813a();
            if (interfaceC2773bM53813a != null) {
                InterfaceC2774c interfaceC2774cMo7840e = interfaceC2773bM53813a.mo7840e();
                cVar.f118591w = null;
                cVar.f118592x = 0;
                cVar.f118590E = 1;
                Object objMo7843d = interfaceC2774cMo7840e.mo7843d(cVar);
                return objMo7843d == enumC31071a ? enumC31071a : objMo7843d;
            }
            return C25235a0.f99113w;
        } catch (RemoteException e5) {
            this.logger.mo85230v("IPC Failures", e5, new AbstractC30556a.a[0]);
        } catch (IOException e13) {
            this.logger.mo85230v("Input/Output error", e13, new AbstractC30556a.a[0]);
        } catch (IllegalStateException e14) {
            this.logger.mo85230v("Google Health Connect not available", e14, new AbstractC30556a.a[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m88925f(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f118597y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f118597y = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM88924e = dVar.f118595w;
        Object obj = EnumC31071a.f128113w;
        int i14 = dVar.f118597y;
        boolean z4 = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM88924e);
            dVar.f118597y = 1;
            objM88924e = m88924e(dVar);
            if (objM88924e == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM88924e);
        }
        Iterable iterable = (Iterable) objM88924e;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            z4 = false;
        } else {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (f118572v.contains((String) it.next())) {
                }
            }
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m88926g() {
        return this.healthConnectClientWrapper.m53814b();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m88927h() {
        return this.healthConnectClientWrapper.m53815c();
    }

    /* JADX INFO: renamed from: j */
    public final Object m88928j(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM88922p = m88922p(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25142f.class), this.healthConnectBodyFatManager, interfaceC30057d);
        return objM88922p == EnumC31071a.f128113w ? objM88922p : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public final Object m88929k(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM88922p = m88922p(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25179w.class), this.healthConnectExerciseSessionManager, interfaceC30057d);
        return objM88922p == EnumC31071a.f128113w ? objM88922p : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public final Object m88930l(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM88922p = m88922p(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25131b0.class), this.healthConnectHeightManager, interfaceC30057d);
        return objM88922p == EnumC31071a.f128113w ? objM88922p : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public final Object m88931m(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM88922p = m88922p(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25149h0.class), this.healthConnectLeanBodyMassManager, interfaceC30057d);
        return objM88922p == EnumC31071a.f128113w ? objM88922p : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    public final Object m88932n(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM88922p = m88922p(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25154j0.class), this.healthConnectMenstruationFlowManager, interfaceC30057d);
        return objM88922p == EnumC31071a.f128113w ? objM88922p : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public final Object m88933o(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM88922p = m88922p(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25160m0.class), this.healthConnectNutritionManager, interfaceC30057d);
        return objM88922p == EnumC31071a.f128113w ? objM88922p : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public final Object m88934q(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM88922p = m88922p(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25147g1.class), this.healthConnectWeightManager, interfaceC30057d);
        return objM88922p == EnumC31071a.f128113w ? objM88922p : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public final Object m88935r(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        g gVar;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f118612y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f118612y = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object objM88924e = gVar.f118610w;
        Object obj = EnumC31071a.f128113w;
        int i14 = gVar.f118612y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM88924e);
            gVar.f118612y = 1;
            objM88924e = m88924e(gVar);
            if (objM88924e == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM88924e);
        }
        return Boolean.valueOf(((Set) objM88924e).containsAll(f118572v));
    }
}
