package ny1;

import android.content.Context;
import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import fy1.InterfaceC14865a;
import iy1.InterfaceC21030c;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: ny1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0015B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lny1/d;", "", "Liy1/c;", "metricWriter", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Landroid/content/Context;", "context", "Lfy1/a;", "bffCacheSizeProvider", "Lq83/j;", "ioContext", "<init>", "(Liy1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Landroid/content/Context;Lfy1/a;Lq83/j;)V", "Lny1/e;", "snapshot", "Ll83/a0;", "e", "(Lny1/e;Lq83/d;)Ljava/lang/Object;", "d", "(Lq83/d;)Ljava/lang/Object;", "a", "Liy1/c;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "c", "Landroid/content/Context;", "Lfy1/a;", "Lq83/j;", "f", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27297d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC14865a bffCacheSizeProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC30063j ioContext;

    /* JADX INFO: renamed from: ny1.d$b */
    @InterfaceC32271e(m100429c = "com.whoop.metrics.storage.StorageMetricsCollector", m100430f = "StorageMetricsCollector.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER, 29}, m100432m = "collectAndEmit", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f109292w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f109293x;

        /* JADX INFO: renamed from: z */
        int f109295z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f109293x = obj;
            this.f109295z |= Integer.MIN_VALUE;
            return C27297d.this.m82356d(this);
        }
    }

    /* JADX INFO: renamed from: ny1.d$c */
    @InterfaceC32271e(m100429c = "com.whoop.metrics.storage.StorageMetricsCollector$collectAndEmit$snapshot$1", m100430f = "StorageMetricsCollector.kt", m100431l = {26}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lny1/e;", "<anonymous>", "(Lbc3/c0;)Lny1/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f109296w;

        /* JADX INFO: renamed from: x */
        Object f109297x;

        /* JADX INFO: renamed from: y */
        int f109298y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27297d.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C27298e> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C27298e.Companion companion;
            Context context;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f109298y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                companion = C27298e.INSTANCE;
                Context context2 = C27297d.this.context;
                InterfaceC14865a interfaceC14865a = C27297d.this.bffCacheSizeProvider;
                this.f109296w = companion;
                this.f109297x = context2;
                this.f109298y = 1;
                Object objMo42890a = interfaceC14865a.mo42890a(this);
                if (objMo42890a == enumC31071a) {
                    return enumC31071a;
                }
                context = context2;
                obj = objMo42890a;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                context = (Context) this.f109297x;
                companion = (C27298e.Companion) this.f109296w;
                AbstractC34132o.m107864I(obj);
            }
            return companion.m82366b(context, ((Number) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: ny1.d$d */
    @InterfaceC32271e(m100429c = "com.whoop.metrics.storage.StorageMetricsCollector", m100430f = "StorageMetricsCollector.kt", m100431l = {34, 42, 52, 61}, m100432m = "emitMetrics", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f109300E;

        /* JADX INFO: renamed from: F */
        int f109301F;

        /* JADX INFO: renamed from: G */
        int f109302G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f109303H;

        /* JADX INFO: renamed from: J */
        int f109305J;

        /* JADX INFO: renamed from: w */
        Object f109306w;

        /* JADX INFO: renamed from: x */
        Object f109307x;

        /* JADX INFO: renamed from: y */
        Object f109308y;

        /* JADX INFO: renamed from: z */
        Object f109309z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f109303H = obj;
            this.f109305J |= Integer.MIN_VALUE;
            return C27297d.this.m82355e(null, this);
        }
    }

    public C27297d(InterfaceC21030c metricWriter, FeatureFlagChecker featureFlagChecker, Context context, InterfaceC14865a bffCacheSizeProvider, InterfaceC30063j ioContext) {
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(bffCacheSizeProvider, "bffCacheSizeProvider");
        AbstractC22676k.m65750j(ioContext, "ioContext");
        this.metricWriter = metricWriter;
        this.featureFlagChecker = featureFlagChecker;
        this.context = context;
        this.bffCacheSizeProvider = bffCacheSizeProvider;
        this.ioContext = ioContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:30:0x0135  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0135 -> B:31:0x013a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: e */
    public final java.lang.Object m82355e(ny1.C27298e r32, q83.InterfaceC30057d<? super l83.C23454a0> r33) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ny1.C27297d.m82355e(ny1.e, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m82356d(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f109295z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f109295z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM8705K = bVar.f109293x;
        Object obj = EnumC31071a.f128113w;
        int i14 = bVar.f109295z;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 != 0) {
            if (i14 == 1) {
                AbstractC34132o.m107864I(objM8705K);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM8705K);
            }
        }
        AbstractC34132o.m107864I(objM8705K);
        if (!this.featureFlagChecker.isFeatureEnabled("android-oom-observability-storage")) {
            return c23454a0;
        }
        InterfaceC30063j interfaceC30063j = this.ioContext;
        c cVar = new c(null);
        bVar.f109295z = 1;
        objM8705K = AbstractC3006f0.m8705K(interfaceC30063j, cVar, bVar);
        if (objM8705K != obj) {
        }
        bVar.f109292w = null;
        bVar.f109295z = 2;
        return m82355e((C27298e) objM8705K, bVar) == obj ? obj : c23454a0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C27297d(InterfaceC21030c interfaceC21030c, FeatureFlagChecker featureFlagChecker, Context context, InterfaceC14865a interfaceC14865a, InterfaceC30063j interfaceC30063j, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 16) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC30063j = ExecutorC22364d.f87316w;
        }
        this(interfaceC21030c, featureFlagChecker, context, interfaceC14865a, interfaceC30063j);
    }
}
