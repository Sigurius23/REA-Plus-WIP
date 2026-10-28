package zg1;

import ci2.InterfaceC4733b;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.domain.model.WhoopStrapInfo;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13100y;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import el1.C13319b;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Clock;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.LinkedHashMap;
import jk0.InterfaceC21750d;
import kh2.AbstractC22486a;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import oh2.InterfaceC27939b;
import org.joda.time.DateTimeConstants;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p138f6.C14132d;
import p218ic.AbstractC18386u;
import p218ic.C18380r;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sj2.InterfaceC32564a;
import st0.EnumC32978v;
import tr2.InterfaceC34116n;
import vk0.AbstractC36080f;
import vk0.InterfaceC36079e;
import vk0.InterfaceC36083i;
import vk0.InterfaceC36084j;
import vk0.InterfaceC36085k;
import xj0.AbstractC38334b;

/* JADX INFO: renamed from: zg1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001-Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u001cH\u0082@¢\u0006\u0004\b\u001d\u0010\u001bJ\u001e\u0010 \u001a\u00020\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001cH\u0082@¢\u0006\u0004\b \u0010!J \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001fH\u0082@¢\u0006\u0004\b%\u0010&J!\u0010)\u001a\u0004\u0018\u00010\u001f2\u0006\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u001fH\u0002¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020$H\u0082@¢\u0006\u0004\b+\u0010\u001bJ\u0010\u0010-\u001a\u00020,H\u0096@¢\u0006\u0004\b-\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010;R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010<\u001a\u0004\b=\u0010>R\"\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010?\u001a\u0004\b@\u0010AR \u0010E\u001a\b\u0012\u0004\u0012\u00020B0\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010?\u001a\u0004\bD\u0010AR\u0016\u0010H\u001a\u0004\u0018\u00010F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010G¨\u0006I"}, m65681d2 = {"Lzg1/b;", "Lzg1/a;", "Lvk0/j;", "Lci2/b;", "whoopStrapProvider", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "La6/g;", "Lf6/f;", "dataStorePreferences", "Lfi0/a;", "baseAnalytics", "Ljava/time/Clock;", "clock", "Ltr2/n;", "logger", "Lel1/b;", "historySyncStatusHook", "", "taskName", "Lec3/p1;", "Lvk0/i;", "iGattService", "<init>", "(Lci2/b;Lcom/whoop/data/repositories/FeatureFlagChecker;La6/g;Lfi0/a;Ljava/time/Clock;Ltr2/n;Lel1/b;Ljava/lang/String;Lec3/p1;)V", "", "k", "(Lq83/d;)Ljava/lang/Object;", "", "i", "featureFlagList", "", "n", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "numberOfFeatureFlags", "setFFSuccess", "Ll83/a0;", "m", "(IILq83/d;)Ljava/lang/Object;", "total", "successful", "g", "(II)Ljava/lang/Integer;", "q", "Lic/u;", "a", "Lci2/b;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "c", "La6/g;", "d", "Lfi0/a;", "e", "Ljava/time/Clock;", "f", "Ltr2/n;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ltr2/n;", "Lel1/b;", "Ljava/lang/String;", "F", "()Ljava/lang/String;", "Lec3/p1;", "l", "()Lec3/p1;", "Lvk0/k;", "j", "o", "serviceFlow", "Ljk0/d;", "()Ljk0/d;", "whoopStrap", "firmware-feature-flag_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40632b implements InterfaceC40631a, InterfaceC36084j {

    /* JADX INFO: renamed from: l */
    private static final C14132d f175235l = AbstractC15751g.m44429I("firmware-feature-flag-last-sync");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC0422g dataStorePreferences;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C13319b historySyncStatusHook;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String taskName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC13075p1 iGattService;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC13075p1 serviceFlow;

    /* JADX INFO: renamed from: zg1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f175246w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC38334b f175247x;

        /* JADX INFO: renamed from: zg1.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f175248w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ AbstractC38334b f175249x;

            /* JADX INFO: renamed from: zg1.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.firmwarefeatureflag.services.FirmwareFeatureFlagUpdateServiceImpl$getFeatureFlagStringsFromStrap$$inlined$sendCommandViaCrp$default$1$2", m100430f = "FirmwareFeatureFlagUpdateServiceImpl.kt", m100431l = {51, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42753a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f175250E;

                /* JADX INFO: renamed from: F */
                Object f175251F;

                /* JADX INFO: renamed from: G */
                Object f175252G;

                /* JADX INFO: renamed from: H */
                Object f175253H;

                /* JADX INFO: renamed from: I */
                Object f175254I;

                /* JADX INFO: renamed from: J */
                int f175255J;

                /* JADX INFO: renamed from: K */
                int f175256K;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f175258w;

                /* JADX INFO: renamed from: x */
                int f175259x;

                /* JADX INFO: renamed from: y */
                Object f175260y;

                /* JADX INFO: renamed from: z */
                Object f175261z;

                public C42753a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f175258w = obj;
                    this.f175259x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, AbstractC38334b abstractC38334b) {
                this.f175248w = interfaceC13062m;
                this.f175249x = abstractC38334b;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x0014  */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
            
                if (r1.emit((zj0.C40769z0) r14, r6) == r0) goto L29;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r13, q83.InterfaceC30057d r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof zg1.C40632b.b.a.C42753a
                    if (r0 == 0) goto L14
                    r0 = r14
                    zg1.b$b$a$a r0 = (zg1.C40632b.b.a.C42753a) r0
                    int r1 = r0.f175259x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L14
                    int r1 = r1 - r2
                    r0.f175259x = r1
                L12:
                    r6 = r0
                    goto L1a
                L14:
                    zg1.b$b$a$a r0 = new zg1.b$b$a$a
                    r0.<init>(r14)
                    goto L12
                L1a:
                    java.lang.Object r14 = r6.f175258w
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r6.f175259x
                    r9 = 2
                    r2 = 1
                    r10 = 0
                    if (r1 == 0) goto L5c
                    if (r1 == r2) goto L3e
                    if (r1 != r9) goto L36
                    java.lang.Object r13 = r6.f175251F
                    ec3.m r13 = (ec3.InterfaceC13062m) r13
                    java.lang.Object r13 = r6.f175261z
                    zg1.b$b$a$a r13 = (zg1.C40632b.b.a.C42753a) r13
                    p505ts.AbstractC34132o.m107864I(r14)
                    goto Lb0
                L36:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L3e:
                    int r13 = r6.f175255J
                    java.lang.Object r1 = r6.f175254I
                    vk0.i r1 = (vk0.InterfaceC36083i) r1
                    java.lang.Object r1 = r6.f175253H
                    q83.d r1 = (q83.InterfaceC30057d) r1
                    java.lang.Object r1 = r6.f175252G
                    ec3.m r1 = (ec3.InterfaceC13062m) r1
                    java.lang.Object r2 = r6.f175251F
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r2 = r6.f175261z
                    zg1.b$b$a$a r2 = (zg1.C40632b.b.a.C42753a) r2
                    p505ts.AbstractC34132o.m107864I(r14)
                    l83.n r14 = (l83.C23468n) r14
                    java.lang.Object r14 = r14.f92940w
                    goto L8b
                L5c:
                    p505ts.AbstractC34132o.m107864I(r14)
                    ec3.m r14 = r12.f175248w
                    r1 = r13
                    vk0.i r1 = (vk0.InterfaceC36083i) r1
                    r13 = r2
                    xj0.b r2 = r12.f175249x
                    r6.f175260y = r10
                    r6.f175261z = r10
                    r6.f175250E = r10
                    r6.f175251F = r10
                    r6.f175252G = r14
                    r6.f175253H = r10
                    r6.f175254I = r10
                    r11 = 0
                    r6.f175255J = r11
                    r6.f175256K = r11
                    r6.f175259x = r13
                    r3 = 0
                    r5 = 0
                    r7 = 6
                    r8 = 0
                    java.lang.Object r13 = vk0.InterfaceC36083i.m114608r0(r1, r2, r3, r5, r6, r7, r8)
                    if (r13 != r0) goto L88
                    goto Laf
                L88:
                    r1 = r14
                    r14 = r13
                    r13 = r11
                L8b:
                    boolean r2 = r14 instanceof l83.C23467m
                    if (r2 == 0) goto L90
                    r14 = r10
                L90:
                    boolean r2 = r14 instanceof zj0.C40769z0
                    if (r2 != 0) goto L95
                    r14 = r10
                L95:
                    zj0.z0 r14 = (zj0.C40769z0) r14
                    r6.f175260y = r10
                    r6.f175261z = r10
                    r6.f175250E = r10
                    r6.f175251F = r10
                    r6.f175252G = r10
                    r6.f175253H = r10
                    r6.f175254I = r10
                    r6.f175255J = r13
                    r6.f175259x = r9
                    java.lang.Object r13 = r1.emit(r14, r6)
                    if (r13 != r0) goto Lb0
                Laf:
                    return r0
                Lb0:
                    l83.a0 r13 = l83.C23454a0.f92919a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: zg1.C40632b.b.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public b(InterfaceC13058l interfaceC13058l, AbstractC38334b abstractC38334b) {
            this.f175246w = interfaceC13058l;
            this.f175247x = abstractC38334b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f175246w.collect(new a(interfaceC13062m, this.f175247x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zg1.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwarefeatureflag.services.FirmwareFeatureFlagUpdateServiceImpl", m100430f = "FirmwareFeatureFlagUpdateServiceImpl.kt", m100431l = {205, 226}, m100432m = "getFeatureFlagStringsFromStrap", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f175262E;

        /* JADX INFO: renamed from: F */
        Object f175263F;

        /* JADX INFO: renamed from: G */
        Object f175264G;

        /* JADX INFO: renamed from: H */
        Object f175265H;

        /* JADX INFO: renamed from: I */
        Object f175266I;

        /* JADX INFO: renamed from: J */
        Object f175267J;

        /* JADX INFO: renamed from: K */
        Object f175268K;

        /* JADX INFO: renamed from: L */
        Object f175269L;

        /* JADX INFO: renamed from: M */
        int f175270M;

        /* JADX INFO: renamed from: N */
        int f175271N;

        /* JADX INFO: renamed from: O */
        int f175272O;

        /* JADX INFO: renamed from: P */
        int f175273P;

        /* JADX INFO: renamed from: Q */
        int f175274Q;

        /* JADX INFO: renamed from: R */
        int f175275R;

        /* JADX INFO: renamed from: S */
        int f175276S;

        /* JADX INFO: renamed from: T */
        int f175277T;

        /* JADX INFO: renamed from: U */
        /* synthetic */ Object f175278U;

        /* JADX INFO: renamed from: W */
        int f175280W;

        /* JADX INFO: renamed from: w */
        Object f175281w;

        /* JADX INFO: renamed from: x */
        Object f175282x;

        /* JADX INFO: renamed from: y */
        Object f175283y;

        /* JADX INFO: renamed from: z */
        Object f175284z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f175278U = obj;
            this.f175280W |= Integer.MIN_VALUE;
            return C40632b.this.m131868i(this);
        }
    }

    /* JADX INFO: renamed from: zg1.b$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f175285w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC38334b f175286x;

        /* JADX INFO: renamed from: zg1.b$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f175287w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ AbstractC38334b f175288x;

            /* JADX INFO: renamed from: zg1.b$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.firmwarefeatureflag.services.FirmwareFeatureFlagUpdateServiceImpl$getFeatureFlagStringsFromStrap$lambda$0$0$$inlined$sendCommandViaCrp$default$1$2", m100430f = "FirmwareFeatureFlagUpdateServiceImpl.kt", m100431l = {51, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42754a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f175289E;

                /* JADX INFO: renamed from: F */
                Object f175290F;

                /* JADX INFO: renamed from: G */
                Object f175291G;

                /* JADX INFO: renamed from: H */
                Object f175292H;

                /* JADX INFO: renamed from: I */
                Object f175293I;

                /* JADX INFO: renamed from: J */
                int f175294J;

                /* JADX INFO: renamed from: K */
                int f175295K;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f175297w;

                /* JADX INFO: renamed from: x */
                int f175298x;

                /* JADX INFO: renamed from: y */
                Object f175299y;

                /* JADX INFO: renamed from: z */
                Object f175300z;

                public C42754a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f175297w = obj;
                    this.f175298x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, AbstractC38334b abstractC38334b) {
                this.f175287w = interfaceC13062m;
                this.f175288x = abstractC38334b;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x0014  */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
            
                if (r1.emit((zj0.C40757t0) r14, r6) == r0) goto L29;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r13, q83.InterfaceC30057d r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof zg1.C40632b.d.a.C42754a
                    if (r0 == 0) goto L14
                    r0 = r14
                    zg1.b$d$a$a r0 = (zg1.C40632b.d.a.C42754a) r0
                    int r1 = r0.f175298x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L14
                    int r1 = r1 - r2
                    r0.f175298x = r1
                L12:
                    r6 = r0
                    goto L1a
                L14:
                    zg1.b$d$a$a r0 = new zg1.b$d$a$a
                    r0.<init>(r14)
                    goto L12
                L1a:
                    java.lang.Object r14 = r6.f175297w
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r6.f175298x
                    r9 = 2
                    r2 = 1
                    r10 = 0
                    if (r1 == 0) goto L5c
                    if (r1 == r2) goto L3e
                    if (r1 != r9) goto L36
                    java.lang.Object r13 = r6.f175290F
                    ec3.m r13 = (ec3.InterfaceC13062m) r13
                    java.lang.Object r13 = r6.f175300z
                    zg1.b$d$a$a r13 = (zg1.C40632b.d.a.C42754a) r13
                    p505ts.AbstractC34132o.m107864I(r14)
                    goto Lb0
                L36:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L3e:
                    int r13 = r6.f175294J
                    java.lang.Object r1 = r6.f175293I
                    vk0.i r1 = (vk0.InterfaceC36083i) r1
                    java.lang.Object r1 = r6.f175292H
                    q83.d r1 = (q83.InterfaceC30057d) r1
                    java.lang.Object r1 = r6.f175291G
                    ec3.m r1 = (ec3.InterfaceC13062m) r1
                    java.lang.Object r2 = r6.f175290F
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r2 = r6.f175300z
                    zg1.b$d$a$a r2 = (zg1.C40632b.d.a.C42754a) r2
                    p505ts.AbstractC34132o.m107864I(r14)
                    l83.n r14 = (l83.C23468n) r14
                    java.lang.Object r14 = r14.f92940w
                    goto L8b
                L5c:
                    p505ts.AbstractC34132o.m107864I(r14)
                    ec3.m r14 = r12.f175287w
                    r1 = r13
                    vk0.i r1 = (vk0.InterfaceC36083i) r1
                    r13 = r2
                    xj0.b r2 = r12.f175288x
                    r6.f175299y = r10
                    r6.f175300z = r10
                    r6.f175289E = r10
                    r6.f175290F = r10
                    r6.f175291G = r14
                    r6.f175292H = r10
                    r6.f175293I = r10
                    r11 = 0
                    r6.f175294J = r11
                    r6.f175295K = r11
                    r6.f175298x = r13
                    r3 = 0
                    r5 = 0
                    r7 = 6
                    r8 = 0
                    java.lang.Object r13 = vk0.InterfaceC36083i.m114608r0(r1, r2, r3, r5, r6, r7, r8)
                    if (r13 != r0) goto L88
                    goto Laf
                L88:
                    r1 = r14
                    r14 = r13
                    r13 = r11
                L8b:
                    boolean r2 = r14 instanceof l83.C23467m
                    if (r2 == 0) goto L90
                    r14 = r10
                L90:
                    boolean r2 = r14 instanceof zj0.C40757t0
                    if (r2 != 0) goto L95
                    r14 = r10
                L95:
                    zj0.t0 r14 = (zj0.C40757t0) r14
                    r6.f175299y = r10
                    r6.f175300z = r10
                    r6.f175289E = r10
                    r6.f175290F = r10
                    r6.f175291G = r10
                    r6.f175292H = r10
                    r6.f175293I = r10
                    r6.f175294J = r13
                    r6.f175298x = r9
                    java.lang.Object r13 = r1.emit(r14, r6)
                    if (r13 != r0) goto Lb0
                Laf:
                    return r0
                Lb0:
                    l83.a0 r13 = l83.C23454a0.f92919a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: zg1.C40632b.d.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public d(InterfaceC13058l interfaceC13058l, AbstractC38334b abstractC38334b) {
            this.f175285w = interfaceC13058l;
            this.f175286x = abstractC38334b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f175285w.collect(new a(interfaceC13062m, this.f175286x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zg1.b$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwarefeatureflag.services.FirmwareFeatureFlagUpdateServiceImpl", m100430f = "FirmwareFeatureFlagUpdateServiceImpl.kt", m100431l = {112, 113, 116, 117}, m100432m = "performUpdate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f175301E;

        /* JADX INFO: renamed from: w */
        Object f175302w;

        /* JADX INFO: renamed from: x */
        int f175303x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f175304y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f175304y = obj;
            this.f175301E |= Integer.MIN_VALUE;
            return C40632b.this.m131870k(this);
        }
    }

    /* JADX INFO: renamed from: zg1.b$f */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f175306w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C40632b f175307x;

        /* JADX INFO: renamed from: zg1.b$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f175308w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C40632b f175309x;

            /* JADX INFO: renamed from: zg1.b$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.firmwarefeatureflag.services.FirmwareFeatureFlagUpdateServiceImpl$requestUpdate$$inlined$map$1$2", m100430f = "FirmwareFeatureFlagUpdateServiceImpl.kt", m100431l = {52, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42755a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f175310E;

                /* JADX INFO: renamed from: F */
                Object f175311F;

                /* JADX INFO: renamed from: G */
                Object f175312G;

                /* JADX INFO: renamed from: H */
                Object f175313H;

                /* JADX INFO: renamed from: I */
                Object f175314I;

                /* JADX INFO: renamed from: J */
                Object f175315J;

                /* JADX INFO: renamed from: K */
                int f175316K;

                /* JADX INFO: renamed from: L */
                int f175317L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f175318w;

                /* JADX INFO: renamed from: x */
                int f175319x;

                /* JADX INFO: renamed from: y */
                Object f175320y;

                public C42755a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f175318w = obj;
                    this.f175319x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C40632b c40632b) {
                this.f175308w = interfaceC13062m;
                this.f175309x = c40632b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
            
                if (r2.emit(r9, r0) == r1) goto L31;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, q83.InterfaceC30057d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof zg1.C40632b.f.a.C42755a
                    if (r0 == 0) goto L13
                    r0 = r9
                    zg1.b$f$a$a r0 = (zg1.C40632b.f.a.C42755a) r0
                    int r1 = r0.f175319x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f175319x = r1
                    goto L18
                L13:
                    zg1.b$f$a$a r0 = new zg1.b$f$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f175318w
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f175319x
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L56
                    if (r2 == r4) goto L3c
                    if (r2 != r3) goto L34
                    java.lang.Object r8 = r0.f175312G
                    ec3.m r8 = (ec3.InterfaceC13062m) r8
                    java.lang.Object r8 = r0.f175310E
                    zg1.b$f$a$a r8 = (zg1.C40632b.f.a.C42755a) r8
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto Lbb
                L34:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3c:
                    int r8 = r0.f175316K
                    java.lang.Object r2 = r0.f175315J
                    vk0.k r2 = (vk0.InterfaceC36085k) r2
                    java.lang.Object r2 = r0.f175314I
                    q83.d r2 = (q83.InterfaceC30057d) r2
                    java.lang.Object r2 = r0.f175313H
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r4 = r0.f175312G
                    ec3.m r4 = (ec3.InterfaceC13062m) r4
                    java.lang.Object r4 = r0.f175310E
                    zg1.b$f$a$a r4 = (zg1.C40632b.f.a.C42755a) r4
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L80
                L56:
                    p505ts.AbstractC34132o.m107864I(r9)
                    ec3.m r2 = r7.f175308w
                    vk0.k r8 = (vk0.InterfaceC36085k) r8
                    boolean r9 = r8 instanceof vk0.InterfaceC36085k.d
                    r6 = 0
                    if (r9 == 0) goto L82
                    zg1.b r8 = r7.f175309x
                    r0.f175320y = r5
                    r0.f175310E = r5
                    r0.f175311F = r5
                    r0.f175312G = r5
                    r0.f175313H = r2
                    r0.f175314I = r5
                    r0.f175315J = r5
                    r0.f175316K = r6
                    r0.f175317L = r6
                    r0.f175319x = r4
                    java.lang.Object r9 = zg1.C40632b.m131864d(r8, r0)
                    if (r9 != r1) goto L7f
                    goto Lba
                L7f:
                    r8 = r6
                L80:
                    r6 = r8
                    goto La2
                L82:
                    boolean r8 = r8 instanceof vk0.InterfaceC36085k.c
                    if (r8 == 0) goto L9e
                    zg1.b r8 = r7.f175309x
                    tr2.n r8 = r8.getLogger()
                    java.lang.String r9 = "Firmware FF update was interrupted; cancelling right now, will retry later"
                    qr2.a$a[] r4 = new qr2.AbstractC30556a.a[r6]
                    r8.mo85222m(r9, r4)
                    zg1.b r8 = r7.f175309x
                    jk0.d r8 = zg1.C40632b.m131863c(r8)
                    if (r8 == 0) goto L9e
                    r8.mo24702P0()
                L9e:
                    java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
                La2:
                    r0.f175320y = r5
                    r0.f175310E = r5
                    r0.f175311F = r5
                    r0.f175312G = r5
                    r0.f175313H = r5
                    r0.f175314I = r5
                    r0.f175315J = r5
                    r0.f175316K = r6
                    r0.f175319x = r3
                    java.lang.Object r8 = r2.emit(r9, r0)
                    if (r8 != r1) goto Lbb
                Lba:
                    return r1
                Lbb:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: zg1.C40632b.f.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public f(InterfaceC13058l interfaceC13058l, C40632b c40632b) {
            this.f175306w = interfaceC13058l;
            this.f175307x = c40632b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f175306w.collect(new a(interfaceC13062m, this.f175307x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zg1.b$g */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f175322w;

        /* JADX INFO: renamed from: zg1.b$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f175323w;

            /* JADX INFO: renamed from: zg1.b$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.firmwarefeatureflag.services.FirmwareFeatureFlagUpdateServiceImpl$requestUpdate$$inlined$map$2$2", m100430f = "FirmwareFeatureFlagUpdateServiceImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42756a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f175324E;

                /* JADX INFO: renamed from: F */
                Object f175325F;

                /* JADX INFO: renamed from: G */
                Object f175326G;

                /* JADX INFO: renamed from: H */
                int f175327H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f175328w;

                /* JADX INFO: renamed from: x */
                int f175329x;

                /* JADX INFO: renamed from: y */
                Object f175330y;

                public C42756a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f175328w = obj;
                    this.f175329x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f175323w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42756a c42756a;
                Object c18380r;
                if (interfaceC30057d instanceof C42756a) {
                    c42756a = (C42756a) interfaceC30057d;
                    int i13 = c42756a.f175329x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42756a.f175329x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42756a = new C42756a(interfaceC30057d);
                    }
                } else {
                    c42756a = new C42756a(interfaceC30057d);
                }
                Object obj2 = c42756a.f175328w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42756a.f175329x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f175323w;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    if (zBooleanValue) {
                        c18380r = AbstractC18386u.m52885b();
                    } else {
                        if (zBooleanValue) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c18380r = new C18380r();
                    }
                    c42756a.f175330y = null;
                    c42756a.f175324E = null;
                    c42756a.f175325F = null;
                    c42756a.f175326G = null;
                    c42756a.f175327H = 0;
                    c42756a.f175329x = 1;
                    if (interfaceC13062m.emit(c18380r, c42756a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l) {
            this.f175322w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f175322w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zg1.b$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwarefeatureflag.services.FirmwareFeatureFlagUpdateServiceImpl$requestUpdate$4", m100430f = "FirmwareFeatureFlagUpdateServiceImpl.kt", m100431l = {92}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m65681d2 = {"Lec3/m;", "Lic/u;", "Lkotlin/jvm/internal/EnhancedNullability;", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f175332w;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return C40632b.this.new h(interfaceC30057d).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f175332w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13075p1 serviceFlow = C40632b.this.getServiceFlow();
                InterfaceC36085k.b bVar = InterfaceC36085k.b.f154179a;
                this.f175332w = 1;
                ((C13045h2) serviceFlow).emit(bVar, this);
                if (c23454a0 == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: zg1.b$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwarefeatureflag.services.FirmwareFeatureFlagUpdateServiceImpl", m100430f = "FirmwareFeatureFlagUpdateServiceImpl.kt", m100431l = {163}, m100432m = "sendSegmentEvent", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f175334E;

        /* JADX INFO: renamed from: w */
        int f175335w;

        /* JADX INFO: renamed from: x */
        int f175336x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f175337y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f175337y = obj;
            this.f175334E |= Integer.MIN_VALUE;
            return C40632b.this.m131871m(0, 0, this);
        }
    }

    /* JADX INFO: renamed from: zg1.b$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwarefeatureflag.services.FirmwareFeatureFlagUpdateServiceImpl", m100430f = "FirmwareFeatureFlagUpdateServiceImpl.kt", m100431l = {208}, m100432m = "updateFeatureFlagStatusOnStrap", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f175339E;

        /* JADX INFO: renamed from: F */
        Object f175340F;

        /* JADX INFO: renamed from: G */
        Object f175341G;

        /* JADX INFO: renamed from: H */
        Object f175342H;

        /* JADX INFO: renamed from: I */
        int f175343I;

        /* JADX INFO: renamed from: J */
        int f175344J;

        /* JADX INFO: renamed from: K */
        int f175345K;

        /* JADX INFO: renamed from: L */
        int f175346L;

        /* JADX INFO: renamed from: M */
        boolean f175347M;

        /* JADX INFO: renamed from: N */
        /* synthetic */ Object f175348N;

        /* JADX INFO: renamed from: P */
        int f175350P;

        /* JADX INFO: renamed from: w */
        Object f175351w;

        /* JADX INFO: renamed from: x */
        Object f175352x;

        /* JADX INFO: renamed from: y */
        Object f175353y;

        /* JADX INFO: renamed from: z */
        Object f175354z;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f175348N = obj;
            this.f175350P |= Integer.MIN_VALUE;
            return C40632b.this.m131872n(null, this);
        }
    }

    /* JADX INFO: renamed from: zg1.b$k */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f175355w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC38334b f175356x;

        /* JADX INFO: renamed from: zg1.b$k$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f175357w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ AbstractC38334b f175358x;

            /* JADX INFO: renamed from: zg1.b$k$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.firmwarefeatureflag.services.FirmwareFeatureFlagUpdateServiceImpl$updateFeatureFlagStatusOnStrap$lambda$0$$inlined$sendCommandViaCrp$default$1$2", m100430f = "FirmwareFeatureFlagUpdateServiceImpl.kt", m100431l = {51, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42757a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f175359E;

                /* JADX INFO: renamed from: F */
                Object f175360F;

                /* JADX INFO: renamed from: G */
                Object f175361G;

                /* JADX INFO: renamed from: H */
                Object f175362H;

                /* JADX INFO: renamed from: I */
                Object f175363I;

                /* JADX INFO: renamed from: J */
                int f175364J;

                /* JADX INFO: renamed from: K */
                int f175365K;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f175367w;

                /* JADX INFO: renamed from: x */
                int f175368x;

                /* JADX INFO: renamed from: y */
                Object f175369y;

                /* JADX INFO: renamed from: z */
                Object f175370z;

                public C42757a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f175367w = obj;
                    this.f175368x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, AbstractC38334b abstractC38334b) {
                this.f175357w = interfaceC13062m;
                this.f175358x = abstractC38334b;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x0014  */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
            
                if (r1.emit((zj0.C40765x0) r14, r6) == r0) goto L29;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r13, q83.InterfaceC30057d r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof zg1.C40632b.k.a.C42757a
                    if (r0 == 0) goto L14
                    r0 = r14
                    zg1.b$k$a$a r0 = (zg1.C40632b.k.a.C42757a) r0
                    int r1 = r0.f175368x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L14
                    int r1 = r1 - r2
                    r0.f175368x = r1
                L12:
                    r6 = r0
                    goto L1a
                L14:
                    zg1.b$k$a$a r0 = new zg1.b$k$a$a
                    r0.<init>(r14)
                    goto L12
                L1a:
                    java.lang.Object r14 = r6.f175367w
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r6.f175368x
                    r9 = 2
                    r2 = 1
                    r10 = 0
                    if (r1 == 0) goto L5c
                    if (r1 == r2) goto L3e
                    if (r1 != r9) goto L36
                    java.lang.Object r13 = r6.f175360F
                    ec3.m r13 = (ec3.InterfaceC13062m) r13
                    java.lang.Object r13 = r6.f175370z
                    zg1.b$k$a$a r13 = (zg1.C40632b.k.a.C42757a) r13
                    p505ts.AbstractC34132o.m107864I(r14)
                    goto Lb0
                L36:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L3e:
                    int r13 = r6.f175364J
                    java.lang.Object r1 = r6.f175363I
                    vk0.i r1 = (vk0.InterfaceC36083i) r1
                    java.lang.Object r1 = r6.f175362H
                    q83.d r1 = (q83.InterfaceC30057d) r1
                    java.lang.Object r1 = r6.f175361G
                    ec3.m r1 = (ec3.InterfaceC13062m) r1
                    java.lang.Object r2 = r6.f175360F
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r2 = r6.f175370z
                    zg1.b$k$a$a r2 = (zg1.C40632b.k.a.C42757a) r2
                    p505ts.AbstractC34132o.m107864I(r14)
                    l83.n r14 = (l83.C23468n) r14
                    java.lang.Object r14 = r14.f92940w
                    goto L8b
                L5c:
                    p505ts.AbstractC34132o.m107864I(r14)
                    ec3.m r14 = r12.f175357w
                    r1 = r13
                    vk0.i r1 = (vk0.InterfaceC36083i) r1
                    r13 = r2
                    xj0.b r2 = r12.f175358x
                    r6.f175369y = r10
                    r6.f175370z = r10
                    r6.f175359E = r10
                    r6.f175360F = r10
                    r6.f175361G = r14
                    r6.f175362H = r10
                    r6.f175363I = r10
                    r11 = 0
                    r6.f175364J = r11
                    r6.f175365K = r11
                    r6.f175368x = r13
                    r3 = 0
                    r5 = 0
                    r7 = 6
                    r8 = 0
                    java.lang.Object r13 = vk0.InterfaceC36083i.m114608r0(r1, r2, r3, r5, r6, r7, r8)
                    if (r13 != r0) goto L88
                    goto Laf
                L88:
                    r1 = r14
                    r14 = r13
                    r13 = r11
                L8b:
                    boolean r2 = r14 instanceof l83.C23467m
                    if (r2 == 0) goto L90
                    r14 = r10
                L90:
                    boolean r2 = r14 instanceof zj0.C40765x0
                    if (r2 != 0) goto L95
                    r14 = r10
                L95:
                    zj0.x0 r14 = (zj0.C40765x0) r14
                    r6.f175369y = r10
                    r6.f175370z = r10
                    r6.f175359E = r10
                    r6.f175360F = r10
                    r6.f175361G = r10
                    r6.f175362H = r10
                    r6.f175363I = r10
                    r6.f175364J = r13
                    r6.f175368x = r9
                    java.lang.Object r13 = r1.emit(r14, r6)
                    if (r13 != r0) goto Lb0
                Laf:
                    return r0
                Lb0:
                    l83.a0 r13 = l83.C23454a0.f92919a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: zg1.C40632b.k.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public k(InterfaceC13058l interfaceC13058l, AbstractC38334b abstractC38334b) {
            this.f175355w = interfaceC13058l;
            this.f175356x = abstractC38334b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f175355w.collect(new a(interfaceC13062m, this.f175356x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C40632b(InterfaceC4733b whoopStrapProvider, FeatureFlagChecker featureFlagChecker, InterfaceC0422g dataStorePreferences, InterfaceC14515a baseAnalytics, Clock clock, InterfaceC34116n logger, C13319b historySyncStatusHook, String taskName, InterfaceC13075p1 iGattService) {
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(dataStorePreferences, "dataStorePreferences");
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(historySyncStatusHook, "historySyncStatusHook");
        AbstractC22676k.m65750j(taskName, "taskName");
        AbstractC22676k.m65750j(iGattService, "iGattService");
        this.whoopStrapProvider = whoopStrapProvider;
        this.featureFlagChecker = featureFlagChecker;
        this.dataStorePreferences = dataStorePreferences;
        this.baseAnalytics = baseAnalytics;
        this.clock = clock;
        this.logger = logger;
        this.historySyncStatusHook = historySyncStatusHook;
        this.taskName = taskName;
        this.iGattService = iGattService;
        this.serviceFlow = AbstractC13091v.m36593c(InterfaceC36085k.a.f154178a);
    }

    /* JADX INFO: renamed from: g */
    private final Integer m131867g(int total, int successful) {
        if (total > 0) {
            return Integer.valueOf(AbstractC12889b.m36257W((((double) successful) / ((double) total)) * ((double) 100)));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:36:0x014e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0153 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009f, code lost:
    
        if (r0 == r3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0129, code lost:
    
        if (r5 == r3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x012b, code lost:
    
        return r3;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0129 -> B:27:0x012c). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m131868i(q83.InterfaceC30057d<? super java.util.List<java.lang.String>> r18) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zg1.C40632b.m131868i(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final InterfaceC21750d m131869j() {
        return (InterfaceC21750d) this.whoopStrapProvider.mo14817a().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:52:0x0107  */
    /* JADX WARN: Code duplicated, block: B:53:0x0108  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0113, code lost:
    
        if (m131873q(r1) == r2) goto L56;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m131870k(q83.InterfaceC30057d<? super java.lang.Boolean> r12) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zg1.C40632b.m131870k(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m131871m(int i13, int i14, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        i iVar;
        EnumC32978v enumC32978vMo24752w0;
        InterfaceC27939b bluetoothVersion;
        InterfaceC27939b maximVersion;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i15 = iVar.f175334E;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                iVar.f175334E = i15 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        Object objM36575A = iVar.f175337y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = iVar.f175334E;
        if (i16 == 0) {
            AbstractC34132o.m107864I(objM36575A);
            InterfaceC13058l data = this.dataStorePreferences.getData();
            iVar.f175335w = i13;
            iVar.f175336x = i14;
            iVar.f175334E = 1;
            objM36575A = AbstractC13091v.m36575A(data, iVar);
            if (objM36575A == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i14 = iVar.f175336x;
            i13 = iVar.f175335w;
            AbstractC34132o.m107864I(objM36575A);
        }
        Long l7 = (Long) ((AbstractC14134f) objM36575A).mo40227b(f175235l);
        int iM36257W = AbstractC12889b.m36257W(Instant.now(this.clock).minus(l7 != null ? l7.longValue() : 0L, (TemporalUnit) ChronoUnit.MILLIS).toEpochMilli() / ((double) DateTimeConstants.MILLIS_PER_MINUTE));
        Integer numM131867g = m131867g(i13, i14);
        getLogger().mo85216g("Firmware FF update with " + numM131867g + "% success rate", new AbstractC30556a.a[0]);
        InterfaceC21750d interfaceC21750dM131869j = m131869j();
        String strM104089b = null;
        WhoopStrapInfo whoopStrapInfo = interfaceC21750dM131869j != null ? interfaceC21750dM131869j.get_strapInfo() : null;
        C23465k c23465k = new C23465k("Frequency", new Integer(iM36257W));
        C23465k c23465k2 = new C23465k("Number of Feature Flag", new Integer(i13));
        C23465k c23465k3 = new C23465k("Maxim Version", (whoopStrapInfo == null || (maximVersion = whoopStrapInfo.getMaximVersion()) == null) ? null : maximVersion.mo84319a());
        C23465k c23465k4 = new C23465k("Nordic Version", (whoopStrapInfo == null || (bluetoothVersion = whoopStrapInfo.getBluetoothVersion()) == null) ? null : bluetoothVersion.mo84319a());
        InterfaceC21750d interfaceC21750dM131869j2 = m131869j();
        if (interfaceC21750dM131869j2 != null && (enumC32978vMo24752w0 = interfaceC21750dM131869j2.mo24752w0()) != null) {
            strM104089b = EnumC32978v.INSTANCE.m104089b(enumC32978vMo24752w0);
        }
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(c23465k, c23465k2, c23465k3, c23465k4, new C23465k("Strap Generation", strM104089b), new C23465k("New Firmware Feature Flag Service", Boolean.TRUE));
        if (numM131867g != null) {
            linkedHashMapM73993b0.putAll(AbstractC25247g0.m73989X(new C23465k("Set FF Command Success Rate", numM131867g)));
        }
        InterfaceC14515a.m41418i(this.baseAnalytics, "Connectivity", null, null, "Firmware Feature Flags", null, linkedHashMapM73993b0, 22, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00db  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b3 -> B:25:0x00b6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: n */
    public final java.lang.Object m131872n(java.util.List<java.lang.String> r13, q83.InterfaceC30057d<? super java.lang.Integer> r14) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zg1.C40632b.m131872n(java.util.List, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: q */
    private final Object m131873q(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM64987c = AbstractC22486a.m64987c(this.dataStorePreferences, f175235l, new Long(Instant.now(this.clock).toEpochMilli()), interfaceC30057d);
        return objM64987c == EnumC31071a.f128113w ? objM64987c : C23454a0.f92919a;
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: F, reason: from getter */
    public String getTaskName() {
        return this.taskName;
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: H */
    public /* bridge */ Object mo23651H(InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return super.mo23651H(interfaceC36083i, interfaceC30057d);
    }

    @Override // zg1.InterfaceC40631a
    /* JADX INFO: renamed from: a */
    public Object mo131861a(InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
        if (m131869j() == null) {
            getLogger().mo85222m("No strap connected, cannot update FW feature flags", new AbstractC30556a.a[0]);
            return new C18380r();
        }
        getLogger().mo85216g("Submitted FirmwareFeatureFlagUpdateService task to CRP", new AbstractC30556a.a[0]);
        InterfaceC21750d interfaceC21750dM131869j = m131869j();
        if (interfaceC21750dM131869j != null) {
            interfaceC21750dM131869j.mo24749u(this, InterfaceC32564a.b.f134906a);
        }
        return AbstractC13091v.m36575A(new C13100y(new g(new f(AbstractC36080f.m114589b(getServiceFlow()), this)), new h(null)), interfaceC30057d);
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: h, reason: from getter */
    public InterfaceC34116n getLogger() {
        return this.logger;
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: l, reason: from getter */
    public InterfaceC13075p1 getIGattService() {
        return this.iGattService;
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: o, reason: from getter */
    public InterfaceC13075p1 getServiceFlow() {
        return this.serviceFlow;
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: x */
    public /* bridge */ Object mo23655x(InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super InterfaceC36079e> interfaceC30057d) {
        return super.mo23655x(interfaceC36083i, interfaceC30057d);
    }

    public /* synthetic */ C40632b(InterfaceC4733b interfaceC4733b, FeatureFlagChecker featureFlagChecker, InterfaceC0422g interfaceC0422g, InterfaceC14515a interfaceC14515a, Clock clock, InterfaceC34116n interfaceC34116n, C13319b c13319b, String str, InterfaceC13075p1 interfaceC13075p1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC4733b, featureFlagChecker, interfaceC0422g, interfaceC14515a, clock, interfaceC34116n, c13319b, (i13 & 128) != 0 ? "FirmwareFeatureFlagUpdateService" : str, (i13 & 256) != 0 ? AbstractC13091v.m36593c(null) : interfaceC13075p1);
    }
}
