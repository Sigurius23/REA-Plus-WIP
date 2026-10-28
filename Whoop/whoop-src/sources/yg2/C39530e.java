package yg2;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import c93.InterfaceC4353o;
import ci2.InterfaceC4733b;
import com.mapbox.common.logger.LogPriority;
import com.whoop.data.repositories.FeatureFlagChecker;
import dq1.C12288a;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13021b2;
import ec3.C13045h2;
import ec3.C13052j1;
import ec3.C13078q1;
import ec3.C13084s1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import eq1.C13562a;
import fc3.C14380k;
import fi0.InterfaceC14515a;
import gt0.InterfaceC16183e;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Set;
import jk0.EnumC21747a;
import jk0.InterfaceC21750d;
import jt0.EnumC21935b;
import jt0.InterfaceC21934a;
import l83.C23454a0;
import m83.C25235a0;
import m83.C25271y;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rt0.InterfaceC31799a;
import rt0.InterfaceC31800b;
import rt0.InterfaceC31801c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.EnumC32978v;
import us0.InterfaceC35211g;
import wu0.InterfaceC37639b;

/* JADX INFO: renamed from: yg2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010)\u001a\u00020(2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0018H\u0002¢\u0006\u0004\b+\u0010\u001aJ\u000f\u0010,\u001a\u00020\u0018H\u0002¢\u0006\u0004\b,\u0010\u001aJ-\u00102\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u001c2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\n\b\u0002\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020I0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010S\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001000P0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\u001f0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010UR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001f0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010UR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020!0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010UR\u001c\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010UR \u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010UR\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020(0T8\u0006¢\u0006\f\n\u0004\b2\u0010U\u001a\u0004\bQ\u0010[R\u0016\u0010^\u001a\u0004\u0018\u00010#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010]¨\u0006_"}, m65681d2 = {"Lyg2/e;", "", "Lci2/b;", "whoopStrapProvider", "Lwu0/b;", "strapBodyStatusNotifier", "Lgt0/e;", "firmwareUpdateApi", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lrt0/c;", "realTimeStreamSdk", "Leq1/a;", "hrZonesRepository", "Lbc3/c0;", "coroutineScope", "Lfi0/a;", "baseAnalytics", "Lus0/g;", "liveHrZeroAnalytics", "Ljt0/a;", "connectivityAnalytics", "<init>", "(Lci2/b;Lwu0/b;Lgt0/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Lrt0/c;Leq1/a;Lbc3/c0;Lfi0/a;Lus0/g;Ljt0/a;)V", "Ll83/a0;", "q", "()V", "r", "", "n", "()Z", "", "heartRate", "Ljk0/a;", "strapBodyStatus", "Ljk0/d;", "whoopStrap", "", "Ldq1/a;", "hrZones", "Lyg2/d;", "k", "(ILjk0/a;Ljk0/d;Ljava/util/List;)Lyg2/d;", "o", "p", "enable", "", "source", "Lyg2/a;", "owner", "s", "(ZLjava/lang/String;Lyg2/a;)V", "a", "Lci2/b;", "b", "Lwu0/b;", "c", "Lgt0/e;", "d", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "e", "Lrt0/c;", "f", "Leq1/a;", "g", "Lbc3/c0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lfi0/a;", "i", "Lus0/g;", "j", "Ljt0/a;", "Lec3/o1;", "Lyg2/b;", "Lec3/o1;", "hrActionFlow", "l", "Ljava/lang/String;", "displaySource", "Lec3/p1;", "", "m", "Lec3/p1;", "activeOwners", "Lec3/l;", "Lec3/l;", "toggleHrFlow", "hrFlow", "strapBodyStatusFlow", "whoopStrapFlow", "hrZonesFlow", "()Lec3/l;", "liveHrCombinedFlow", "()Ljk0/d;", "iWhoopStrap", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39530e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC37639b strapBodyStatusNotifier;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC16183e firmwareUpdateApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC31801c realTimeStreamSdk;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C13562a hrZonesRepository;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC35211g liveHrZeroAnalytics;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC21934a connectivityAnalytics;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC13072o1 hrActionFlow;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private String displaySource;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC13075p1 activeOwners;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final InterfaceC13058l toggleHrFlow;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final InterfaceC13058l hrFlow;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final InterfaceC13058l strapBodyStatusFlow;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final InterfaceC13058l whoopStrapFlow;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final InterfaceC13058l hrZonesFlow;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final InterfaceC13058l liveHrCombinedFlow;

    /* JADX INFO: renamed from: yg2.e$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f170014a;

        static {
            int[] iArr = new int[EnumC32978v.values().length];
            try {
                iArr[EnumC32978v.PUFFIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32978v.MONUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC32978v.SYMPHONY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC32978v.GEN_4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC32978v.GOOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC32978v.MAVERICK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f170014a = iArr;
        }
    }

    /* JADX INFO: renamed from: yg2.e$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.state.LiveHrStateCombiner$hrFlow$1", m100430f = "LiveHrStateCombiner.kt", m100431l = {105}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f170015w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f170016x;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f170016x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f170016x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f170015w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Integer num = new Integer(0);
                this.f170016x = null;
                this.f170015w = 1;
                if (interfaceC13062m.emit(num, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: yg2.e$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.state.LiveHrStateCombiner$hrZonesFlow$1", m100430f = "LiveHrStateCombiner.kt", m100431l = {118}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lec3/m;", "", "Ldq1/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f170017w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f170018x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(interfaceC30057d);
            cVar.f170018x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f170018x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f170017w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f170018x = null;
                this.f170017w = 1;
                if (interfaceC13062m.emit(C25271y.f99162w, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: yg2.e$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.state.LiveHrStateCombiner$liveHrCombinedFlow$1", m100430f = "LiveHrStateCombiner.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\n¢\u0006\u0004\b\n\u0010\u000b"}, m65681d2 = {"", "heartRate", "Ljk0/a;", "strapBodyStatus", "Ljk0/d;", "whoopStrap", "", "Ldq1/a;", "hrZones", "Lyg2/d;", "<anonymous>", "(ILjk0/a;Ljk0/d;Ljava/util/List;)Lyg2/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4353o {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f170019E;

        /* JADX INFO: renamed from: w */
        int f170021w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ int f170022x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f170023y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f170024z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(5, interfaceC30057d);
        }

        /* JADX INFO: renamed from: f */
        public final Object m126279f(int i13, EnumC21747a enumC21747a, InterfaceC21750d interfaceC21750d, List<C12288a> list, InterfaceC30057d<? super AbstractC39529d> interfaceC30057d) {
            d dVar = C39530e.this.new d(interfaceC30057d);
            dVar.f170022x = i13;
            dVar.f170023y = enumC21747a;
            dVar.f170024z = interfaceC21750d;
            dVar.f170019E = list;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // c93.InterfaceC4353o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return m126279f(((Number) obj).intValue(), (EnumC21747a) obj2, (InterfaceC21750d) obj3, (List) obj4, (InterfaceC30057d) obj5);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            int i13 = this.f170022x;
            EnumC21747a enumC21747a = (EnumC21747a) this.f170023y;
            InterfaceC21750d interfaceC21750d = (InterfaceC21750d) this.f170024z;
            List list = (List) this.f170019E;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f170021w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C39530e.this.m126269k(i13, enumC21747a, interfaceC21750d, list);
        }
    }

    /* JADX INFO: renamed from: yg2.e$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.state.LiveHrStateCombiner$liveHrCombinedFlow$2", m100430f = "LiveHrStateCombiner.kt", m100431l = {128}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lyg2/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f170025w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f170026x;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f170026x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f170026x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f170025w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC39529d.b bVar = AbstractC39529d.b.f169991b;
                this.f170026x = null;
                this.f170025w = 1;
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

    /* JADX INFO: renamed from: yg2.e$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.state.LiveHrStateCombiner$liveHrCombinedFlow$3", m100430f = "LiveHrStateCombiner.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lyg2/d;", "it", "Ll83/a0;", "<anonymous>", "(Lyg2/d;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f170027w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f170028x;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = C39530e.this.new f(interfaceC30057d);
            fVar.f170028x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC39529d abstractC39529d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(abstractC39529d, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC39529d abstractC39529d = (AbstractC39529d) this.f170028x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f170027w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC39529d instanceof AbstractC39529d.a) {
                InterfaceC35211g interfaceC35211g = C39530e.this.liveHrZeroAnalytics;
                int heartRate = ((AbstractC39529d.a) abstractC39529d).getHeartRate();
                String str = C39530e.this.displaySource;
                if (str == null) {
                    str = "unknown";
                }
                interfaceC35211g.mo71194a(heartRate, str);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yg2.e$g */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f170030w;

        /* JADX INFO: renamed from: yg2.e$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f170031w;

            /* JADX INFO: renamed from: yg2.e$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.state.LiveHrStateCombiner$special$$inlined$filter$1$2", m100430f = "LiveHrStateCombiner.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42695a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f170033F;

                /* JADX INFO: renamed from: G */
                Object f170034G;

                /* JADX INFO: renamed from: H */
                int f170035H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f170036w;

                /* JADX INFO: renamed from: x */
                int f170037x;

                /* JADX INFO: renamed from: y */
                Object f170038y;

                /* JADX INFO: renamed from: z */
                Object f170039z;

                public C42695a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f170036w = obj;
                    this.f170037x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f170031w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42695a c42695a;
                if (interfaceC30057d instanceof C42695a) {
                    c42695a = (C42695a) interfaceC30057d;
                    int i13 = c42695a.f170037x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42695a.f170037x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42695a = new C42695a(interfaceC30057d);
                    }
                } else {
                    c42695a = new C42695a(interfaceC30057d);
                }
                Object obj2 = c42695a.f170036w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42695a.f170037x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f170031w;
                    if (((EnumC21747a) obj) != EnumC21747a.UNKNOWN) {
                        c42695a.f170038y = null;
                        c42695a.f170039z = null;
                        c42695a.f170033F = null;
                        c42695a.f170034G = null;
                        c42695a.f170035H = 0;
                        c42695a.f170037x = 1;
                        if (interfaceC13062m.emit(obj, c42695a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l) {
            this.f170030w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f170030w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yg2.e$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.state.LiveHrStateCombiner$special$$inlined$flatMapLatest$1", m100430f = "LiveHrStateCombiner.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f170040w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f170041x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f170042y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C39530e f170043z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC30057d interfaceC30057d, C39530e c39530e) {
            super(3, interfaceC30057d);
            this.f170043z = c39530e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC39527b abstractC39527b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            h hVar = new h(interfaceC30057d, this.f170043z);
            hVar.f170041x = interfaceC13062m;
            hVar.f170042y = abstractC39527b;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f170040w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f170041x;
                AbstractC39527b abstractC39527b = (AbstractC39527b) this.f170042y;
                if (abstractC39527b instanceof AbstractC39527b.b) {
                    c13084s1 = new m(new l(new C13052j1(this.f170043z.realTimeStreamSdk.mo36106a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC31800b.a.class), true), this.f170043z.new j(null), 0)));
                } else {
                    if (!(abstractC39527b instanceof AbstractC39527b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c13084s1 = new C13084s1(this.f170043z.new k(null));
                }
                this.f170041x = null;
                this.f170042y = null;
                this.f170040w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC39527b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: yg2.e$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.state.LiveHrStateCombiner$strapBodyStatusFlow$1", m100430f = "LiveHrStateCombiner.kt", m100431l = {109}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ljk0/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f170044w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f170045x;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = new i(interfaceC30057d);
            iVar.f170045x = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f170045x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f170044w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                EnumC21747a enumC21747a = EnumC21747a.STRAP_ON_BODY;
                this.f170045x = null;
                this.f170044w = 1;
                if (interfaceC13062m.emit(enumC21747a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: yg2.e$j */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.state.LiveHrStateCombiner$toggleHrFlow$1$1", m100430f = "LiveHrStateCombiner.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lrt0/a;", "Lrt0/b$a;", "realTimeStreamResult", "Ll83/a0;", "<anonymous>", "(Lrt0/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f170046w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f170047x;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            j jVar = C39530e.this.new j(interfaceC30057d);
            jVar.f170047x = obj;
            return jVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC31799a<? extends InterfaceC31800b.a> interfaceC31799a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC31799a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC31799a interfaceC31799a = (InterfaceC31799a) this.f170047x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f170046w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (interfaceC31799a instanceof InterfaceC31799a.b) {
                C39530e.this.m126272o();
            } else if (interfaceC31799a instanceof InterfaceC31799a.c) {
                C39530e.this.m126273p();
            } else if (!(interfaceC31799a instanceof InterfaceC31799a.d) && !AbstractC22676k.m65745e(interfaceC31799a, InterfaceC31799a.a.f131703a)) {
                throw new NoWhenBranchMatchedException();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yg2.e$k */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.state.LiveHrStateCombiner$toggleHrFlow$1$3", m100430f = "LiveHrStateCombiner.kt", m100431l = {98, LogPriority.NONE}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f170049w;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39530e.this.new k(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (rt0.AbstractC31802d.m98793a(r7, r6) == r0) goto L15;
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
                int r1 = r6.f170049w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r7)
                goto L4e
            L10:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L18:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L32
            L1c:
                p505ts.AbstractC34132o.m107864I(r7)
                kotlin.time.Duration$Companion r7 = p715kotlin.time.Duration.INSTANCE
                r7 = 10
                kotlin.time.DurationUnit r1 = p715kotlin.time.DurationUnit.SECONDS
                long r4 = p715kotlin.time.DurationKt.toDuration(r7, r1)
                r6.f170049w = r3
                java.lang.Object r7 = bc3.AbstractC3034m0.m8783c(r4, r6)
                if (r7 != r0) goto L32
                goto L4d
            L32:
                yg2.e r7 = yg2.C39530e.this
                rt0.c r7 = yg2.C39530e.m126263e(r7)
                java.lang.Class<rt0.b$a> r1 = rt0.InterfaceC31800b.a.class
                kotlin.jvm.internal.i0 r3 = p715kotlin.jvm.internal.AbstractC22671h0.f89337a
                j93.d r1 = r3.getOrCreateKotlinClass(r1)
                r3 = 0
                ec3.l r7 = r7.mo36106a(r1, r3)
                r6.f170049w = r2
                java.lang.Object r7 = rt0.AbstractC31802d.m98793a(r7, r6)
                if (r7 != r0) goto L4e
            L4d:
                return r0
            L4e:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: yg2.C39530e.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: yg2.e$l */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f170051w;

        /* JADX INFO: renamed from: yg2.e$l$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f170052w;

            /* JADX INFO: renamed from: yg2.e$l$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.state.LiveHrStateCombiner$toggleHrFlow$lambda$0$$inlined$filterIsInstance$1$2", m100430f = "LiveHrStateCombiner.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42696a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f170054F;

                /* JADX INFO: renamed from: G */
                Object f170055G;

                /* JADX INFO: renamed from: H */
                int f170056H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f170057w;

                /* JADX INFO: renamed from: x */
                int f170058x;

                /* JADX INFO: renamed from: y */
                Object f170059y;

                /* JADX INFO: renamed from: z */
                Object f170060z;

                public C42696a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f170057w = obj;
                    this.f170058x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f170052w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42696a c42696a;
                if (interfaceC30057d instanceof C42696a) {
                    c42696a = (C42696a) interfaceC30057d;
                    int i13 = c42696a.f170058x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42696a.f170058x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42696a = new C42696a(interfaceC30057d);
                    }
                } else {
                    c42696a = new C42696a(interfaceC30057d);
                }
                Object obj2 = c42696a.f170057w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42696a.f170058x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f170052w;
                    if (obj instanceof InterfaceC31799a.d) {
                        c42696a.f170059y = null;
                        c42696a.f170060z = null;
                        c42696a.f170054F = null;
                        c42696a.f170055G = null;
                        c42696a.f170056H = 0;
                        c42696a.f170058x = 1;
                        if (interfaceC13062m.emit(obj, c42696a) == enumC31071a) {
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

        public l(InterfaceC13058l interfaceC13058l) {
            this.f170051w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f170051w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yg2.e$m */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f170061w;

        /* JADX INFO: renamed from: yg2.e$m$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f170062w;

            /* JADX INFO: renamed from: yg2.e$m$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.state.LiveHrStateCombiner$toggleHrFlow$lambda$0$$inlined$map$1$2", m100430f = "LiveHrStateCombiner.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42697a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f170063E;

                /* JADX INFO: renamed from: F */
                Object f170064F;

                /* JADX INFO: renamed from: G */
                Object f170065G;

                /* JADX INFO: renamed from: H */
                int f170066H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f170067w;

                /* JADX INFO: renamed from: x */
                int f170068x;

                /* JADX INFO: renamed from: y */
                Object f170069y;

                public C42697a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f170067w = obj;
                    this.f170068x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f170062w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42697a c42697a;
                if (interfaceC30057d instanceof C42697a) {
                    c42697a = (C42697a) interfaceC30057d;
                    int i13 = c42697a.f170068x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42697a.f170068x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42697a = new C42697a(interfaceC30057d);
                    }
                } else {
                    c42697a = new C42697a(interfaceC30057d);
                }
                Object obj2 = c42697a.f170067w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42697a.f170068x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f170062w;
                    InterfaceC31800b packet = ((InterfaceC31799a.d) obj).getPacket();
                    AbstractC22676k.m65748h(packet, "null cannot be cast to non-null type com.whoop.connectivityCore.sdk.RealTimeDataType.HR");
                    Integer num = new Integer(((InterfaceC31800b.a) packet).getHeartRate());
                    c42697a.f170069y = null;
                    c42697a.f170063E = null;
                    c42697a.f170064F = null;
                    c42697a.f170065G = null;
                    c42697a.f170066H = 0;
                    c42697a.f170068x = 1;
                    if (interfaceC13062m.emit(num, c42697a) == enumC31071a) {
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

        public m(InterfaceC13058l interfaceC13058l) {
            this.f170061w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f170061w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yg2.e$n */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.state.LiveHrStateCombiner$toggleHrStream$1", m100430f = "LiveHrStateCombiner.kt", m100431l = {154, 159}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f170071w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f170072x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C39530e f170073y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f170074z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(boolean z4, C39530e c39530e, String str, InterfaceC30057d<? super n> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f170072x = z4;
            this.f170073y = c39530e;
            this.f170074z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new n(this.f170072x, this.f170073y, this.f170074z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((n) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
        
            return r0;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.f170071w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L15:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L6a
            L19:
                p505ts.AbstractC34132o.m107864I(r5)
                boolean r5 = r4.f170072x
                if (r5 == 0) goto L3d
                yg2.e r5 = r4.f170073y
                java.lang.String r1 = r4.f170074z
                yg2.C39530e.m126266h(r5, r1)
                yg2.e r5 = r4.f170073y
                yg2.C39530e.m126267i(r5)
                yg2.e r5 = r4.f170073y
                ec3.o1 r5 = yg2.C39530e.m126261c(r5)
                yg2.b$b r1 = yg2.AbstractC39527b.b.f169984a
                r4.f170071w = r3
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L6a
                goto L69
            L3d:
                yg2.e r5 = r4.f170073y
                java.lang.String r5 = yg2.C39530e.m126260b(r5)
                if (r5 == 0) goto L4e
                yg2.e r1 = r4.f170073y
                us0.g r1 = yg2.C39530e.m126262d(r1)
                r1.mo71195b(r5)
            L4e:
                yg2.e r5 = r4.f170073y
                yg2.C39530e.m126268j(r5)
                yg2.e r5 = r4.f170073y
                r1 = 0
                yg2.C39530e.m126266h(r5, r1)
                yg2.e r5 = r4.f170073y
                ec3.o1 r5 = yg2.C39530e.m126261c(r5)
                yg2.b$a r1 = yg2.AbstractC39527b.a.f169983a
                r4.f170071w = r2
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L6a
            L69:
                return r0
            L6a:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: yg2.C39530e.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: yg2.e$o */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.state.LiveHrStateCombiner$whoopStrapFlow$1", m100430f = "LiveHrStateCombiner.kt", m100431l = {114}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ljk0/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f170075w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f170076x;

        public o(InterfaceC30057d<? super o> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            o oVar = new o(interfaceC30057d);
            oVar.f170076x = obj;
            return oVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((o) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f170076x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f170075w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f170076x = null;
                this.f170075w = 1;
                if (interfaceC13062m.emit(null, this) == enumC31071a) {
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

    public C39530e(InterfaceC4733b whoopStrapProvider, InterfaceC37639b strapBodyStatusNotifier, InterfaceC16183e firmwareUpdateApi, FeatureFlagChecker featureFlagChecker, InterfaceC31801c realTimeStreamSdk, C13562a hrZonesRepository, InterfaceC2994c0 coroutineScope, InterfaceC14515a baseAnalytics, InterfaceC35211g liveHrZeroAnalytics, InterfaceC21934a connectivityAnalytics) {
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(strapBodyStatusNotifier, "strapBodyStatusNotifier");
        AbstractC22676k.m65750j(firmwareUpdateApi, "firmwareUpdateApi");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(realTimeStreamSdk, "realTimeStreamSdk");
        AbstractC22676k.m65750j(hrZonesRepository, "hrZonesRepository");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        AbstractC22676k.m65750j(liveHrZeroAnalytics, "liveHrZeroAnalytics");
        AbstractC22676k.m65750j(connectivityAnalytics, "connectivityAnalytics");
        this.whoopStrapProvider = whoopStrapProvider;
        this.strapBodyStatusNotifier = strapBodyStatusNotifier;
        this.firmwareUpdateApi = firmwareUpdateApi;
        this.featureFlagChecker = featureFlagChecker;
        this.realTimeStreamSdk = realTimeStreamSdk;
        this.hrZonesRepository = hrZonesRepository;
        this.coroutineScope = coroutineScope;
        this.baseAnalytics = baseAnalytics;
        this.liveHrZeroAnalytics = liveHrZeroAnalytics;
        this.connectivityAnalytics = connectivityAnalytics;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(1, 0, null, 6);
        this.hrActionFlow = c13096w1M36592b;
        this.activeOwners = AbstractC13091v.m36593c(C25235a0.f99113w);
        C14380k c14380kM36590P = AbstractC13091v.m36590P(c13096w1M36592b, new h(null, this));
        this.toggleHrFlow = c14380kM36590P;
        C13015a0 c13015a0 = new C13015a0(new b(null), c14380kM36590P);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(c13015a0, coroutineScope, c13021b2, 1);
        this.hrFlow = c13078q1M36586L;
        C13078q1 c13078q1M36586L2 = AbstractC13091v.m36586L(new g(new C13015a0(new i(null), strapBodyStatusNotifier.mo120963b(false))), coroutineScope, c13021b2, 1);
        this.strapBodyStatusFlow = c13078q1M36586L2;
        C13078q1 c13078q1M36586L3 = AbstractC13091v.m36586L(new C13015a0(new o(null), whoopStrapProvider.mo14818b()), coroutineScope, c13021b2, 1);
        this.whoopStrapFlow = c13078q1M36586L3;
        C13078q1 c13078q1M36586L4 = AbstractC13091v.m36586L(new C13015a0(new c(null), hrZonesRepository.m38283l()), coroutineScope, c13021b2, 1);
        this.hrZonesFlow = c13078q1M36586L4;
        this.liveHrCombinedFlow = AbstractC13091v.m36586L(new C13052j1(new C13015a0(new e(null), AbstractC13091v.m36605o(c13078q1M36586L, c13078q1M36586L2, c13078q1M36586L3, c13078q1M36586L4, new d(null))), new f(null), 0), coroutineScope, c13021b2, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final AbstractC39529d m126269k(int heartRate, EnumC21747a strapBodyStatus, InterfaceC21750d whoopStrap, List<C12288a> hrZones) {
        if (whoopStrap == null) {
            return AbstractC39529d.d.f169993b;
        }
        if (m126271n()) {
            return AbstractC39529d.e.f169994b;
        }
        if (heartRate == 0 && strapBodyStatus == EnumC21747a.STRAP_ON_BODY) {
            return AbstractC39529d.b.f169991b;
        }
        if (strapBodyStatus == EnumC21747a.STRAP_OFF_BODY) {
            return AbstractC39529d.c.f169992b;
        }
        return (strapBodyStatus != EnumC21747a.STRAP_ON_BODY || heartRate <= 0) ? AbstractC39529d.d.f169993b : new AbstractC39529d.a(heartRate, this.hrZonesRepository.m38284n(hrZones, heartRate));
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC21750d m126270l() {
        return (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
    }

    /* JADX INFO: renamed from: n */
    private final boolean m126271n() {
        return this.firmwareUpdateApi.mo45720a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final void m126272o() {
        this.baseAnalytics.mo41422d("Failure", null, null, "Real Time Heart Rate Stream", null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final void m126273p() {
        this.baseAnalytics.mo41422d("Stopped", null, null, "Real Time Heart Rate Stream", null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final void m126274q() {
        if (this.featureFlagChecker.isFeatureEnabled("droid-hrm-connectivity-analytics")) {
            InterfaceC21750d interfaceC21750dM126270l = m126270l();
            EnumC32978v enumC32978vMo24752w0 = interfaceC21750dM126270l != null ? interfaceC21750dM126270l.mo24752w0() : null;
            switch (enumC32978vMo24752w0 == null ? -1 : a.f170014a[enumC32978vMo24752w0.ordinal()]) {
                case -1:
                case 1:
                case 2:
                case 3:
                    return;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 4:
                    this.connectivityAnalytics.mo62488b(EnumC21935b.REALTIME_R10);
                    return;
                case 5:
                case 6:
                    this.connectivityAnalytics.mo62488b(EnumC21935b.REALTIME_HR, EnumC21935b.REALTIME_IMU);
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final void m126275r() {
        if (this.featureFlagChecker.isFeatureEnabled("droid-hrm-connectivity-analytics")) {
            this.connectivityAnalytics.mo62487a("Heart Rate Monitor");
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m126276t(C39530e c39530e, boolean z4, String str, EnumC39526a enumC39526a, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        if ((i13 & 4) != 0) {
            enumC39526a = null;
        }
        c39530e.m126278s(z4, str, enumC39526a);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final InterfaceC13058l getLiveHrCombinedFlow() {
        return this.liveHrCombinedFlow;
    }

    /* JADX INFO: renamed from: s */
    public final void m126278s(boolean enable, String source, EnumC39526a owner) {
        C13045h2 c13045h2;
        Object value;
        Set set;
        C13045h2 c13045h3;
        Object value2;
        if (owner != null) {
            if (enable) {
                InterfaceC13075p1 interfaceC13075p1 = this.activeOwners;
                do {
                    c13045h3 = (C13045h2) interfaceC13075p1;
                    value2 = c13045h3.getValue();
                    set = (Set) value2;
                } while (!c13045h3.m36569i(value2, AbstractC12350b.m34555D(owner, set)));
            } else {
                InterfaceC13075p1 interfaceC13075p2 = this.activeOwners;
                do {
                    c13045h2 = (C13045h2) interfaceC13075p2;
                    value = c13045h2.getValue();
                    set = (Set) value;
                } while (!c13045h2.m36569i(value, AbstractC12350b.m34604y(owner, set)));
            }
            if (!(enable ? set.isEmpty() : AbstractC12350b.m34604y(owner, set).isEmpty())) {
                return;
            }
        }
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new n(enable, this, source, null), 3);
    }
}
