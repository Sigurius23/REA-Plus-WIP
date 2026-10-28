package ju1;

import androidx.core.app.NotificationCompat;
import bc3.InterfaceC2994c0;
import ch.C4588i;
import ci2.InterfaceC4733b;
import com.mapbox.common.logger.LogPriority;
import com.whoop.labradorService.domain.exception.LabradorServiceException;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13054k;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import fu1.InterfaceC14782a;
import fu1.InterfaceC14783b;
import fu1.InterfaceC14784c;
import fu1.InterfaceC14785d;
import gu1.C16213a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import sj2.InterfaceC32564a;
import st0.C32970n;
import st0.EnumC32978v;
import tr2.InterfaceC34116n;
import ts0.InterfaceC34141f;
import vk0.InterfaceC36079e;
import vk0.InterfaceC36083i;
import vk0.InterfaceC36084j;
import vk0.InterfaceC36085k;
import xj0.C38347f0;
import xj0.C38365l0;
import xj0.C38381s;
import xj0.C38385u;
import xj0.EnumC38387v;
import xj0.EnumC38389w;
import zj0.C40727h;

/* JADX INFO: renamed from: ju1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u001e\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160\u001b2\u0006\u0010\"\u001a\u00020!H\u0096@¢\u0006\u0004\b#\u0010$J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160\u001b2\u0006\u0010&\u001a\u00020%H\u0096@¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010-R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u00101\u001a\u0004\b2\u00103R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R \u0010>\u001a\b\u0012\u0004\u0012\u000209088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\"\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b@\u0010=R\u0016\u0010E\u001a\u0004\u0018\u00010B8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020F0)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010,¨\u0006H"}, m65681d2 = {"Lju1/a;", "Lfu1/b;", "Lvk0/j;", "Lci2/b;", "whoopStrapProvider", "Lgu1/a;", "labradorSyncService", "Lbc3/c0;", "scope", "Ltr2/n;", "logger", "", "taskName", "<init>", "(Lci2/b;Lgu1/a;Lbc3/c0;Ltr2/n;Ljava/lang/String;)V", "Ll83/a0;", "j", "()V", "Lxj0/d1;", "selection", "Lvk0/i;", "gattService", "Lfu1/a;", "m", "(Lxj0/d1;Lvk0/i;Lq83/d;)Ljava/lang/Object;", "Lxj0/v;", "toggle", "Ll83/n;", "r", "(Lxj0/v;Lvk0/i;Lq83/d;)Ljava/lang/Object;", "n", "q", "(Lvk0/i;Lq83/d;)Ljava/lang/Object;", "Lfu1/d;", NotificationCompat.CATEGORY_STATUS, "a", "(Lfu1/d;Lq83/d;)Ljava/lang/Object;", "Lfu1/c;", "labradorServiceToggle", "b", "(Lfu1/c;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "Lts0/f;", "d", "()Lec3/l;", "Lci2/b;", "Lgu1/a;", "c", "Lbc3/c0;", "Ltr2/n;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ltr2/n;", "e", "Ljava/lang/String;", "F", "()Ljava/lang/String;", "Lec3/p1;", "Lvk0/k;", "f", "Lec3/p1;", "o", "()Lec3/p1;", "serviceFlow", "g", "l", "iGattService", "Ljk0/d;", "k", "()Ljk0/d;", "strap", "Ldk0/j;", "realtimeEcgDataFlow", "labrador-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21961a implements InterfaceC14783b, InterfaceC36084j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C16213a labradorSyncService;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String taskName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC13075p1 serviceFlow;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC13075p1 iGattService;

    /* JADX INFO: renamed from: ju1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f84924a;

        static {
            int[] iArr = new int[EnumC38387v.values().length];
            try {
                iArr[EnumC38387v.STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f84924a = iArr;
        }
    }

    /* JADX INFO: renamed from: ju1.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.labradorService.domain.LabradorServiceImpl", m100430f = "LabradorServiceImpl.kt", m100431l = {97, 98, LogPriority.NONE, 103}, m100432m = "prepEcgCRP", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f84925E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f84926F;

        /* JADX INFO: renamed from: H */
        int f84928H;

        /* JADX INFO: renamed from: w */
        Object f84929w;

        /* JADX INFO: renamed from: x */
        Object f84930x;

        /* JADX INFO: renamed from: y */
        Object f84931y;

        /* JADX INFO: renamed from: z */
        Object f84932z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f84926F = obj;
            this.f84928H |= Integer.MIN_VALUE;
            return C21961a.this.m62704m(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ju1.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.labradorService.domain.LabradorServiceImpl", m100430f = "LabradorServiceImpl.kt", m100431l = {70}, m100432m = "selectWristAndPrepEcg-gIAlu-s", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f84933w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f84934x;

        /* JADX INFO: renamed from: z */
        int f84936z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f84934x = obj;
            this.f84936z |= Integer.MIN_VALUE;
            Object objMo42416a = C21961a.this.mo42416a(null, this);
            return objMo42416a == EnumC31071a.f128113w ? objMo42416a : new C23468n(objMo42416a);
        }
    }

    /* JADX INFO: renamed from: ju1.a$d */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f84937w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC14785d f84938x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C21961a f84939y;

        /* JADX INFO: renamed from: ju1.a$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f84940w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC14785d f84941x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C21961a f84942y;

            /* JADX INFO: renamed from: ju1.a$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.labradorService.domain.LabradorServiceImpl$selectWristAndPrepEcg-gIAlu-s$$inlined$map$1$2", m100430f = "LabradorServiceImpl.kt", m100431l = {52, 59, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41860a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f84943E;

                /* JADX INFO: renamed from: F */
                Object f84944F;

                /* JADX INFO: renamed from: G */
                Object f84945G;

                /* JADX INFO: renamed from: H */
                Object f84946H;

                /* JADX INFO: renamed from: I */
                Object f84947I;

                /* JADX INFO: renamed from: J */
                Object f84948J;

                /* JADX INFO: renamed from: K */
                Object f84949K;

                /* JADX INFO: renamed from: L */
                Object f84950L;

                /* JADX INFO: renamed from: M */
                int f84951M;

                /* JADX INFO: renamed from: N */
                int f84952N;

                /* JADX INFO: renamed from: O */
                int f84953O;

                /* JADX INFO: renamed from: P */
                int f84954P;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f84955w;

                /* JADX INFO: renamed from: x */
                int f84956x;

                /* JADX INFO: renamed from: y */
                Object f84957y;

                public C41860a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f84955w = obj;
                    this.f84956x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, InterfaceC14785d interfaceC14785d, C21961a c21961a) {
                this.f84940w = interfaceC13062m;
                this.f84941x = interfaceC14785d;
                this.f84942y = c21961a;
            }

            /* JADX WARN: Code duplicated, block: B:43:0x00d2  */
            /* JADX WARN: Code duplicated, block: B:44:0x00d6  */
            /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
            /* JADX WARN: Code duplicated, block: B:62:0x0119  */
            /* JADX WARN: Code duplicated, block: B:63:0x011d  */
            /* JADX WARN: Code duplicated, block: B:65:0x0120  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:68:0x0144, code lost:
            
                if (r2.emit(r4, r0) == r1) goto L69;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r10, q83.InterfaceC30057d r11) {
                /*
                    Method dump skipped, instruction units count: 337
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ju1.C21961a.d.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public d(InterfaceC13058l interfaceC13058l, InterfaceC14785d interfaceC14785d, C21961a c21961a) {
            this.f84937w = interfaceC13058l;
            this.f84938x = interfaceC14785d;
            this.f84939y = c21961a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f84937w.collect(new a(interfaceC13062m, this.f84938x, this.f84939y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ju1.a$e */
    @InterfaceC32271e(m100429c = "com.whoop.labradorService.domain.LabradorServiceImpl", m100430f = "LabradorServiceImpl.kt", m100431l = {126, 127}, m100432m = "startOrRestartEcg", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f84959E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f84960F;

        /* JADX INFO: renamed from: H */
        int f84962H;

        /* JADX INFO: renamed from: w */
        Object f84963w;

        /* JADX INFO: renamed from: x */
        Object f84964x;

        /* JADX INFO: renamed from: y */
        Object f84965y;

        /* JADX INFO: renamed from: z */
        Object f84966z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f84960F = obj;
            this.f84962H |= Integer.MIN_VALUE;
            return C21961a.this.m62705n(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ju1.a$f */
    @InterfaceC32271e(m100429c = "com.whoop.labradorService.domain.LabradorServiceImpl", m100430f = "LabradorServiceImpl.kt", m100431l = {140, 141, 142, 148, 148}, m100432m = "stopHistoricalAndRealtimeEcgCRP", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f84967E;

        /* JADX INFO: renamed from: G */
        int f84969G;

        /* JADX INFO: renamed from: w */
        Object f84970w;

        /* JADX INFO: renamed from: x */
        Object f84971x;

        /* JADX INFO: renamed from: y */
        Object f84972y;

        /* JADX INFO: renamed from: z */
        int f84973z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f84967E = obj;
            this.f84969G |= Integer.MIN_VALUE;
            return C21961a.this.m62706q(null, this);
        }
    }

    /* JADX INFO: renamed from: ju1.a$g */
    @InterfaceC32271e(m100429c = "com.whoop.labradorService.domain.LabradorServiceImpl", m100430f = "LabradorServiceImpl.kt", m100431l = {114, 118}, m100432m = "toggleEcgCRP-0E7RQCE", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f84974E;

        /* JADX INFO: renamed from: F */
        int f84975F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f84976G;

        /* JADX INFO: renamed from: I */
        int f84978I;

        /* JADX INFO: renamed from: w */
        Object f84979w;

        /* JADX INFO: renamed from: x */
        Object f84980x;

        /* JADX INFO: renamed from: y */
        Object f84981y;

        /* JADX INFO: renamed from: z */
        Object f84982z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f84976G = obj;
            this.f84978I |= Integer.MIN_VALUE;
            Object objM62707r = C21961a.this.m62707r(null, null, this);
            return objM62707r == EnumC31071a.f128113w ? objM62707r : new C23468n(objM62707r);
        }
    }

    /* JADX INFO: renamed from: ju1.a$h */
    @InterfaceC32271e(m100429c = "com.whoop.labradorService.domain.LabradorServiceImpl", m100430f = "LabradorServiceImpl.kt", m100431l = {82}, m100432m = "toggleEcgRealtime-gIAlu-s", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f84983w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f84984x;

        /* JADX INFO: renamed from: z */
        int f84986z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f84984x = obj;
            this.f84986z |= Integer.MIN_VALUE;
            Object objMo42417b = C21961a.this.mo42417b(null, this);
            return objMo42417b == EnumC31071a.f128113w ? objMo42417b : new C23468n(objMo42417b);
        }
    }

    /* JADX INFO: renamed from: ju1.a$i */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f84987w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC14784c f84988x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C21961a f84989y;

        /* JADX INFO: renamed from: ju1.a$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f84990w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC14784c f84991x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C21961a f84992y;

            /* JADX INFO: renamed from: ju1.a$i$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.labradorService.domain.LabradorServiceImpl$toggleEcgRealtime-gIAlu-s$$inlined$map$1$2", m100430f = "LabradorServiceImpl.kt", m100431l = {52, 53, 54, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41861a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f84993E;

                /* JADX INFO: renamed from: F */
                Object f84994F;

                /* JADX INFO: renamed from: G */
                Object f84995G;

                /* JADX INFO: renamed from: H */
                Object f84996H;

                /* JADX INFO: renamed from: I */
                Object f84997I;

                /* JADX INFO: renamed from: J */
                Object f84998J;

                /* JADX INFO: renamed from: K */
                int f84999K;

                /* JADX INFO: renamed from: L */
                int f85000L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f85001w;

                /* JADX INFO: renamed from: x */
                int f85002x;

                /* JADX INFO: renamed from: y */
                Object f85003y;

                public C41861a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f85001w = obj;
                    this.f85002x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, InterfaceC14784c interfaceC14784c, C21961a c21961a) {
                this.f84990w = interfaceC13062m;
                this.f84991x = interfaceC14784c;
                this.f84992y = c21961a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
            
                if (r12 == r1) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
            
                r11 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00b8, code lost:
            
                if (r12 == r1) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x00df, code lost:
            
                if (r12 == r1) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00fd, code lost:
            
                if (r2.emit(r4, r0) == r1) goto L36;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r11, q83.InterfaceC30057d r12) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 265
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ju1.C21961a.i.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public i(InterfaceC13058l interfaceC13058l, InterfaceC14784c interfaceC14784c, C21961a c21961a) {
            this.f84987w = interfaceC13058l;
            this.f84988x = interfaceC14784c;
            this.f84989y = c21961a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f84987w.collect(new a(interfaceC13062m, this.f84988x, this.f84989y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C21961a(InterfaceC4733b whoopStrapProvider, C16213a labradorSyncService, InterfaceC2994c0 scope, InterfaceC34116n logger, String taskName) {
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(labradorSyncService, "labradorSyncService");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(taskName, "taskName");
        this.whoopStrapProvider = whoopStrapProvider;
        this.labradorSyncService = labradorSyncService;
        this.scope = scope;
        this.logger = logger;
        this.taskName = taskName;
        this.serviceFlow = AbstractC13091v.m36593c(InterfaceC36085k.a.f154178a);
        this.iGattService = AbstractC13091v.m36593c(null);
    }

    /* JADX INFO: renamed from: j */
    private final void m62702j() {
        getLogger().mo85216g("Enqueueing LabradorService on CRP", new AbstractC30556a.a[0]);
        InterfaceC21750d interfaceC21750dM62703k = m62703k();
        if (interfaceC21750dM62703k != null) {
            interfaceC21750dM62703k.mo24749u(this, InterfaceC32564a.a.f134904a);
        }
    }

    /* JADX INFO: renamed from: k */
    private final InterfaceC21750d m62703k() {
        return (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x011a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0141  */
    /* JADX WARN: Code duplicated, block: B:47:0x0142  */
    /* JADX WARN: Code duplicated, block: B:50:0x0149  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016e, code lost:
    
        if (l83.C23454a0.f92919a == r1) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m62704m(xj0.EnumC38342d1 r19, vk0.InterfaceC36083i r20, q83.InterfaceC30057d<? super fu1.InterfaceC14782a> r21) throws com.whoop.labradorService.domain.exception.LabradorServiceException.StrapNotConnected, com.whoop.labradorService.domain.exception.LabradorServiceException.StrapIncompatible {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ju1.C21961a.m62704m(xj0.d1, vk0.i, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: n */
    public final Object m62705n(EnumC38387v enumC38387v, InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super InterfaceC14782a> interfaceC30057d) {
        e eVar;
        C21961a c21961a;
        EnumC38387v enumC38387v2;
        InterfaceC36083i interfaceC36083i2;
        Object obj;
        int i13;
        C40727h[] c40727hArr;
        Object[] objArr;
        Object objM114608r0;
        C40727h[] c40727hArr2;
        Object[] objArr2;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i14 = eVar.f84962H;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f84962H = i14 - Integer.MIN_VALUE;
                c21961a = this;
            } else {
                c21961a = this;
                eVar = c21961a.new e(interfaceC30057d);
            }
        } else {
            c21961a = this;
            eVar = c21961a.new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object obj2 = eVar2.f84960F;
        Object obj3 = EnumC31071a.f128113w;
        int i15 = eVar2.f84962H;
        int i16 = 1;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj2);
            C40727h[] c40727hArr3 = new C40727h[2];
            InterfaceC21750d interfaceC21750dM62703k = c21961a.m62703k();
            AbstractC22676k.m65747g(interfaceC21750dM62703k);
            C38381s c38381s = new C38381s(interfaceC21750dM62703k.mo24752w0());
            enumC38387v2 = enumC38387v;
            eVar2.f84963w = enumC38387v2;
            eVar2.f84964x = interfaceC36083i;
            eVar2.f84965y = c40727hArr3;
            eVar2.f84966z = c40727hArr3;
            eVar2.f84959E = 0;
            eVar2.f84962H = 1;
            Object objM114608r1 = InterfaceC36083i.m114608r0(interfaceC36083i, c38381s, 0L, false, eVar2, 6, null);
            if (objM114608r1 != obj3) {
                interfaceC36083i2 = interfaceC36083i;
                C40727h[] c40727hArr4 = c40727hArr3;
                obj = objM114608r1;
                i13 = 0;
                c40727hArr = c40727hArr4;
                objArr = c40727hArr4;
            }
            return obj3;
        }
        if (i15 == 1) {
            int i17 = eVar2.f84959E;
            Object[] objArr3 = (C40727h[]) eVar2.f84966z;
            C40727h[] c40727hArr5 = (C40727h[]) eVar2.f84965y;
            InterfaceC36083i interfaceC36083i3 = (InterfaceC36083i) eVar2.f84964x;
            EnumC38387v enumC38387v3 = (EnumC38387v) eVar2.f84963w;
            AbstractC34132o.m107864I(obj2);
            obj = ((C23468n) obj2).f92940w;
            c40727hArr = c40727hArr5;
            enumC38387v2 = enumC38387v3;
            objArr = objArr3;
            i13 = i17;
            interfaceC36083i2 = interfaceC36083i3;
        } else {
            if (i15 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i16 = eVar2.f84959E;
            Object[] objArr4 = (C40727h[]) eVar2.f84966z;
            C40727h[] c40727hArr6 = (C40727h[]) eVar2.f84965y;
            AbstractC34132o.m107864I(obj2);
            objM114608r0 = ((C23468n) obj2).f92940w;
            objArr2 = objArr4;
            c40727hArr2 = c40727hArr6;
        }
        objArr2[i16] = objM114608r0 instanceof C23467m ? null : objM114608r0;
        return AbstractC21962b.m62708a(c40727hArr2);
        if (obj instanceof C23467m) {
            obj = null;
        }
        objArr[i13] = obj;
        C38385u c38385u = new C38385u(enumC38387v2);
        eVar2.f84963w = null;
        eVar2.f84964x = null;
        eVar2.f84965y = c40727hArr;
        eVar2.f84966z = c40727hArr;
        eVar2.f84959E = 1;
        eVar2.f84962H = 2;
        objM114608r0 = InterfaceC36083i.m114608r0(interfaceC36083i2, c38385u, 0L, false, eVar2, 6, null);
        if (objM114608r0 != obj3) {
            C40727h[] c40727hArr7 = c40727hArr;
            c40727hArr2 = c40727hArr7;
            objArr2 = c40727hArr7;
            objArr2[i16] = objM114608r0 instanceof C23467m ? null : objM114608r0;
            return AbstractC21962b.m62708a(c40727hArr2);
        }
        return obj3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:49:0x0125  */
    /* JADX WARN: Code duplicated, block: B:52:0x0145  */
    /* JADX WARN: Code duplicated, block: B:53:0x0146  */
    /* JADX WARN: Code duplicated, block: B:56:0x014e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0176 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX INFO: renamed from: q */
    public final Object m62706q(InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super InterfaceC14782a> interfaceC30057d) throws Throwable {
        f fVar;
        C21961a c21961a;
        int i13;
        ?? r15;
        int i14;
        InterfaceC36083i interfaceC36083i2;
        Object obj;
        C40727h[] c40727hArr;
        int i15;
        ?? r16;
        ?? r10;
        ?? r14;
        Object obj2;
        int i16;
        ?? r17;
        C40727h[] c40727hArr2;
        boolean z4;
        ?? r18;
        Object objM114608r0;
        Object obj3;
        int i17;
        ?? r19;
        C40727h[] c40727hArr3;
        boolean z13;
        ?? r24;
        InterfaceC14782a interfaceC14782aM62708a;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i18 = fVar.f84969G;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                fVar.f84969G = i18 - Integer.MIN_VALUE;
                c21961a = this;
            } else {
                c21961a = this;
                fVar = c21961a.new f(interfaceC30057d);
            }
        } else {
            c21961a = this;
            fVar = c21961a.new f(interfaceC30057d);
        }
        f fVar2 = fVar;
        Object obj4 = fVar2.f84967E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i19 = fVar2.f84969G;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj5 = null;
        try {
            try {
                if (i19 == 0) {
                    AbstractC34132o.m107864I(obj4);
                    C40727h[] c40727hArr4 = new C40727h[3];
                    C38385u c38385u = new C38385u(EnumC38387v.STOP);
                    fVar2.f84970w = interfaceC36083i;
                    fVar2.f84971x = c40727hArr4;
                    fVar2.f84972y = c40727hArr4;
                    fVar2.f84973z = 0;
                    fVar2.f84969G = 1;
                    i13 = 1;
                    r15 = 0;
                    i14 = 2;
                    try {
                        Object objM114608r1 = InterfaceC36083i.m114608r0(interfaceC36083i, c38385u, 0L, false, fVar2, 6, null);
                        if (objM114608r1 != enumC31071a) {
                            interfaceC36083i2 = interfaceC36083i;
                            C40727h[] c40727hArr5 = c40727hArr4;
                            obj = objM114608r1;
                            c40727hArr = c40727hArr5;
                            i15 = 0;
                            r10 = c40727hArr5;
                            r16 = r15;
                        }
                        return enumC31071a;
                    } catch (NullPointerException unused) {
                        throw new LabradorServiceException.StrapNotConnected(r15, i13, r15);
                    }
                }
                if (i19 == 1) {
                    int i24 = fVar2.f84973z;
                    C40727h[] c40727hArr6 = (C40727h[]) fVar2.f84972y;
                    C40727h[] c40727hArr7 = (C40727h[]) fVar2.f84971x;
                    InterfaceC36083i interfaceC36083i3 = (InterfaceC36083i) fVar2.f84970w;
                    AbstractC34132o.m107864I(obj4);
                    i13 = 1;
                    r16 = 0;
                    c40727hArr = c40727hArr7;
                    i14 = 2;
                    obj = ((C23468n) obj4).f92940w;
                    i15 = i24;
                    interfaceC36083i2 = interfaceC36083i3;
                    r10 = c40727hArr6;
                } else {
                    if (i19 == 2) {
                        int i25 = fVar2.f84973z;
                        C40727h[] c40727hArr8 = (C40727h[]) fVar2.f84972y;
                        C40727h[] c40727hArr9 = (C40727h[]) fVar2.f84971x;
                        InterfaceC36083i interfaceC36083i4 = (InterfaceC36083i) fVar2.f84970w;
                        AbstractC34132o.m107864I(obj4);
                        i13 = 1;
                        r17 = 0;
                        i14 = 2;
                        obj2 = ((C23468n) obj4).f92940w;
                        i16 = i25;
                        interfaceC36083i2 = interfaceC36083i4;
                        c40727hArr2 = c40727hArr9;
                        r14 = c40727hArr8;
                        z4 = obj2 instanceof C23467m;
                        r18 = obj2;
                        if (z4) {
                            r18 = r17;
                        }
                        r14[i16] = r18;
                        C38365l0 c38365l0 = new C38365l0(EnumC38389w.DISABLE);
                        fVar2.f84970w = r17;
                        fVar2.f84971x = c40727hArr2;
                        fVar2.f84972y = c40727hArr2;
                        fVar2.f84973z = i14;
                        fVar2.f84969G = 3;
                        objM114608r0 = InterfaceC36083i.m114608r0(interfaceC36083i2, c38365l0, 0L, false, fVar2, 6, null);
                        if (objM114608r0 == enumC31071a) {
                            C40727h[] c40727hArr10 = c40727hArr2;
                            obj3 = objM114608r0;
                            i17 = i14;
                            r19 = c40727hArr10;
                            c40727hArr3 = c40727hArr10;
                            r15 = r17;
                        }
                        return enumC31071a;
                    }
                    if (i19 != 3) {
                        if (i19 == 4) {
                            InterfaceC14782a interfaceC14782a = (InterfaceC14782a) fVar2.f84971x;
                            AbstractC34132o.m107864I(obj4);
                            return interfaceC14782a;
                        }
                        if (i19 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th3 = (Throwable) fVar2.f84971x;
                        AbstractC34132o.m107864I(obj4);
                        throw th3;
                    }
                    i17 = fVar2.f84973z;
                    C40727h[] c40727hArr11 = (C40727h[]) fVar2.f84972y;
                    C40727h[] c40727hArr12 = (C40727h[]) fVar2.f84971x;
                    AbstractC34132o.m107864I(obj4);
                    i13 = 1;
                    r15 = 0;
                    obj3 = ((C23468n) obj4).f92940w;
                    r19 = c40727hArr11;
                    c40727hArr3 = c40727hArr12;
                }
                z13 = obj3 instanceof C23467m;
                r24 = obj3;
                if (z13) {
                    r24 = r15;
                }
                r19[i17] = r24;
                interfaceC14782aM62708a = AbstractC21962b.m62708a(c40727hArr3);
                c21961a.getLogger().mo85216g("Finishing Labrador Service", new AbstractC30556a.a[0]);
                InterfaceC13075p1 serviceFlow = c21961a.getServiceFlow();
                InterfaceC36085k.b bVar = InterfaceC36085k.b.f154179a;
                fVar2.f84970w = r15;
                fVar2.f84971x = interfaceC14782aM62708a;
                fVar2.f84972y = r15;
                fVar2.f84969G = 4;
                ((C13045h2) serviceFlow).emit(bVar, fVar2);
                if (c23454a0 != enumC31071a) {
                    return enumC31071a;
                }
                return interfaceC14782aM62708a;
                boolean z14 = obj instanceof C23467m;
                ?? r25 = obj;
                if (z14) {
                    r25 = r16;
                }
                r10[i15] = r25;
                C38347f0 c38347f0 = new C38347f0(EnumC38389w.DISABLE);
                fVar2.f84970w = interfaceC36083i2;
                fVar2.f84971x = c40727hArr;
                fVar2.f84972y = c40727hArr;
                fVar2.f84973z = i13;
                fVar2.f84969G = i14;
                C40727h[] c40727hArr13 = c40727hArr;
                Object objM114608r2 = InterfaceC36083i.m114608r0(interfaceC36083i2, c38347f0, 0L, false, fVar2, 6, null);
                if (objM114608r2 != enumC31071a) {
                    r14 = c40727hArr13;
                    obj2 = objM114608r2;
                    i16 = i13;
                    c40727hArr2 = c40727hArr13;
                    r17 = r16;
                    z4 = obj2 instanceof C23467m;
                    r18 = obj2;
                    if (z4) {
                        r18 = r17;
                    }
                    r14[i16] = r18;
                    C38365l0 c38365l1 = new C38365l0(EnumC38389w.DISABLE);
                    fVar2.f84970w = r17;
                    fVar2.f84971x = c40727hArr2;
                    fVar2.f84972y = c40727hArr2;
                    fVar2.f84973z = i14;
                    fVar2.f84969G = 3;
                    objM114608r0 = InterfaceC36083i.m114608r0(interfaceC36083i2, c38365l1, 0L, false, fVar2, 6, null);
                    if (objM114608r0 == enumC31071a) {
                        C40727h[] c40727hArr14 = c40727hArr2;
                        obj3 = objM114608r0;
                        i17 = i14;
                        r19 = c40727hArr14;
                        c40727hArr3 = c40727hArr14;
                        r15 = r17;
                        z13 = obj3 instanceof C23467m;
                        r24 = obj3;
                        if (z13) {
                            r24 = r15;
                        }
                        r19[i17] = r24;
                        interfaceC14782aM62708a = AbstractC21962b.m62708a(c40727hArr3);
                        c21961a.getLogger().mo85216g("Finishing Labrador Service", new AbstractC30556a.a[0]);
                        InterfaceC13075p1 serviceFlow2 = c21961a.getServiceFlow();
                        InterfaceC36085k.b bVar2 = InterfaceC36085k.b.f154179a;
                        fVar2.f84970w = r15;
                        fVar2.f84971x = interfaceC14782aM62708a;
                        fVar2.f84972y = r15;
                        fVar2.f84969G = 4;
                        ((C13045h2) serviceFlow2).emit(bVar2, fVar2);
                        if (c23454a0 != enumC31071a) {
                            return interfaceC14782aM62708a;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                c21961a.getLogger().mo85216g("Finishing Labrador Service", new AbstractC30556a.a[0]);
                InterfaceC13075p1 serviceFlow3 = c21961a.getServiceFlow();
                InterfaceC36085k.b bVar3 = InterfaceC36085k.b.f154179a;
                fVar2.f84970w = obj5;
                fVar2.f84971x = th;
                fVar2.f84972y = obj5;
                fVar2.f84969G = 5;
                ((C13045h2) serviceFlow3).emit(bVar3, fVar2);
                if (c23454a0 != enumC31071a) {
                    throw th;
                }
            }
        } catch (NullPointerException unused2) {
            i13 = 1;
            r15 = 0;
        } catch (Throwable th5) {
            th = th5;
            obj5 = null;
            c21961a.getLogger().mo85216g("Finishing Labrador Service", new AbstractC30556a.a[0]);
            InterfaceC13075p1 serviceFlow4 = c21961a.getServiceFlow();
            InterfaceC36085k.b bVar4 = InterfaceC36085k.b.f154179a;
            fVar2.f84970w = obj5;
            fVar2.f84971x = th;
            fVar2.f84972y = obj5;
            fVar2.f84969G = 5;
            ((C13045h2) serviceFlow4).emit(bVar4, fVar2);
            if (c23454a0 != enumC31071a) {
                throw th;
            }
        }
        return enumC31071a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b9, code lost:
    
        if (r9 == r1) goto L42;
     */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m62707r(xj0.EnumC38387v r7, vk0.InterfaceC36083i r8, q83.InterfaceC30057d<? super l83.C23468n> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ju1.C21961a.m62707r(xj0.v, vk0.i, q83.d):java.lang.Object");
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fu1.InterfaceC14783b
    /* JADX INFO: renamed from: a */
    public Object mo42416a(InterfaceC14785d interfaceC14785d, InterfaceC30057d<? super C23468n> interfaceC30057d) {
        c cVar;
        EnumC32978v enumC32978vMo24752w0;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f84936z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f84936z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM36575A = cVar.f84934x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f84936z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36575A);
            InterfaceC21750d interfaceC21750dM62703k = m62703k();
            if (!AbstractC22676k.m65745e(interfaceC21750dM62703k != null ? interfaceC21750dM62703k.getConnectionState() : null, C32970n.f137298a)) {
                return AbstractC34132o.m107888l(new LabradorServiceException.StrapNotConnected("Strap not Connected"));
            }
            InterfaceC21750d interfaceC21750dM62703k2 = m62703k();
            if (interfaceC21750dM62703k2 != null && (enumC32978vMo24752w0 = interfaceC21750dM62703k2.mo24752w0()) != null && !enumC32978vMo24752w0.isMaverick()) {
                return AbstractC34132o.m107888l(new LabradorServiceException.StrapIncompatible("StrapIncompatible"));
            }
            m62702j();
            d dVar = new d(new C4588i(getIGattService(), 2), interfaceC14785d, this);
            cVar.f84933w = null;
            cVar.f84936z = 1;
            objM36575A = AbstractC13091v.m36575A(dVar, cVar);
            if (objM36575A == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM36575A);
        }
        return ((C23468n) objM36575A).f92940w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fu1.InterfaceC14783b
    /* JADX INFO: renamed from: b */
    public Object mo42417b(InterfaceC14784c interfaceC14784c, InterfaceC30057d<? super C23468n> interfaceC30057d) {
        h hVar;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f84986z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f84986z = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object objM36575A = hVar.f84984x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = hVar.f84986z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36575A);
            if (m62703k() == null) {
                return AbstractC34132o.m107888l(new LabradorServiceException.StrapNotConnected(null, 1, null));
            }
            i iVar = new i(new C4588i(getIGattService(), 2), interfaceC14784c, this);
            hVar.f84983w = null;
            hVar.f84986z = 1;
            objM36575A = AbstractC13091v.m36575A(iVar, hVar);
            if (objM36575A == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM36575A);
        }
        return ((C23468n) objM36575A).f92940w;
    }

    @Override // fu1.InterfaceC14783b
    /* JADX INFO: renamed from: c */
    public InterfaceC13058l mo42418c() {
        InterfaceC13058l interfaceC13058lMo24692H0;
        InterfaceC21750d interfaceC21750dM62703k = m62703k();
        return (interfaceC21750dM62703k == null || (interfaceC13058lMo24692H0 = interfaceC21750dM62703k.mo24692H0()) == null) ? C13054k.f45116w : interfaceC13058lMo24692H0;
    }

    @Override // fu1.InterfaceC14783b
    /* JADX INFO: renamed from: d */
    public InterfaceC13058l mo42419d() {
        this.labradorSyncService.m45904c();
        return new C0456u(InterfaceC34141f.a.f143081a, 1);
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

    public /* synthetic */ C21961a(InterfaceC4733b interfaceC4733b, C16213a c16213a, InterfaceC2994c0 interfaceC2994c0, InterfaceC34116n interfaceC34116n, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC4733b, c16213a, interfaceC2994c0, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("LabradorService") : interfaceC34116n, (i13 & 16) != 0 ? "Labrador Service" : str);
    }
}
