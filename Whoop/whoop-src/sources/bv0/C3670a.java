package bv0;

import av0.C2093a;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bt2.C3627b;
import ca2.InterfaceC4368h;
import ch.C4588i;
import ci2.InterfaceC4733b;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.domain.model.WhoopStrapInfo;
import cv0.C11143a;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ev0.C13680b;
import fi0.InterfaceC14515a;
import fy1.InterfaceC14871g;
import hc3.C17171d;
import iy1.InterfaceC21030c;
import j93.InterfaceC21461d;
import java.time.Clock;
import java.util.List;
import java.util.Locale;
import jk0.InterfaceC21750d;
import jt0.InterfaceC21934a;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import mu0.InterfaceC25949a;
import nd1.InterfaceC26584j;
import oh2.InterfaceC27939b;
import p007a6.InterfaceC0422g;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import q83.InterfaceC30057d;
import qf3.C30330b;
import r83.EnumC31071a;
import rf3.C31362a;
import rf3.C31365d;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import td1.InterfaceC33704b;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import us0.InterfaceC35205a;
import vf3.C35953c;
import wf3.C37247a;
import xf3.C38266c;
import yu0.C39784a;
import yu0.C39785b;
import yu0.C39787d;
import zr2.InterfaceC41070a;
import zu0.C41147a;

/* JADX INFO: renamed from: bv0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lbv0/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "connectivity-analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3670a implements InterfaceC26584j {

    /* JADX INFO: renamed from: bv0.a$a */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f14928w;

        /* JADX INFO: renamed from: bv0.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41326a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f14929w;

            /* JADX INFO: renamed from: bv0.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.di.ConnectivityAnalyticsModule$define$lambda$0$6$$inlined$map$1$2", m100430f = "ConnectivityAnalyticsModule.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41327a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f14930E;

                /* JADX INFO: renamed from: F */
                Object f14931F;

                /* JADX INFO: renamed from: G */
                Object f14932G;

                /* JADX INFO: renamed from: H */
                int f14933H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f14934w;

                /* JADX INFO: renamed from: x */
                int f14935x;

                /* JADX INFO: renamed from: y */
                Object f14936y;

                public C41327a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f14934w = obj;
                    this.f14935x |= Integer.MIN_VALUE;
                    return C41326a.this.emit(null, this);
                }
            }

            public C41326a(InterfaceC13062m interfaceC13062m) {
                this.f14929w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41327a c41327a;
                if (interfaceC30057d instanceof C41327a) {
                    c41327a = (C41327a) interfaceC30057d;
                    int i13 = c41327a.f14935x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41327a.f14935x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41327a = new C41327a(interfaceC30057d);
                    }
                } else {
                    c41327a = new C41327a(interfaceC30057d);
                }
                Object obj2 = c41327a.f14934w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41327a.f14935x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f14929w;
                    String lowerCase = ((InterfaceC21750d) obj).mo24752w0().getCodeName().toLowerCase(Locale.ROOT);
                    AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                    c41327a.f14936y = null;
                    c41327a.f14930E = null;
                    c41327a.f14931F = null;
                    c41327a.f14932G = null;
                    c41327a.f14933H = 0;
                    c41327a.f14935x = 1;
                    if (interfaceC13062m.emit(lowerCase, c41327a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l) {
            this.f14928w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f14928w.collect(new C41326a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bv0.a$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f14938w;

        /* JADX INFO: renamed from: bv0.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f14939w;

            /* JADX INFO: renamed from: bv0.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.di.ConnectivityAnalyticsModule$define$lambda$0$6$$inlined$map$2$2", m100430f = "ConnectivityAnalyticsModule.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41328a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f14940E;

                /* JADX INFO: renamed from: F */
                Object f14941F;

                /* JADX INFO: renamed from: G */
                Object f14942G;

                /* JADX INFO: renamed from: H */
                int f14943H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f14944w;

                /* JADX INFO: renamed from: x */
                int f14945x;

                /* JADX INFO: renamed from: y */
                Object f14946y;

                public C41328a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f14944w = obj;
                    this.f14945x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f14939w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41328a c41328a;
                String strMo84319a;
                InterfaceC27939b maximVersion;
                if (interfaceC30057d instanceof C41328a) {
                    c41328a = (C41328a) interfaceC30057d;
                    int i13 = c41328a.f14945x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41328a.f14945x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41328a = new C41328a(interfaceC30057d);
                    }
                } else {
                    c41328a = new C41328a(interfaceC30057d);
                }
                Object obj2 = c41328a.f14944w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41328a.f14945x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f14939w;
                    WhoopStrapInfo whoopStrapInfo = ((InterfaceC21750d) obj).get_strapInfo();
                    if (whoopStrapInfo == null || (maximVersion = whoopStrapInfo.getMaximVersion()) == null || (strMo84319a = maximVersion.mo84319a()) == null) {
                        strMo84319a = "unknown";
                    }
                    c41328a.f14946y = null;
                    c41328a.f14940E = null;
                    c41328a.f14941F = null;
                    c41328a.f14942G = null;
                    c41328a.f14943H = 0;
                    c41328a.f14945x = 1;
                    if (interfaceC13062m.emit(strMo84319a, c41328a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l) {
            this.f14938w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f14938w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: h */
    private static final C23454a0 m11344h(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C3627b c3627b = new C3627b(10);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C39787d.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c3627b, 2)), false);
        C3627b c3627b2 = new C3627b(11);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(InterfaceC21934a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c3627b2, 2)), false);
        C3627b c3627b3 = new C3627b(12);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C13680b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c3627b3, 2)), false);
        C3627b c3627b4 = new C3627b(13);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C11143a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c3627b4, 2)), false);
        C3627b c3627b5 = new C3627b(14);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C39785b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c3627b5, 2)), false);
        C3627b c3627b6 = new C3627b(15);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(InterfaceC35205a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass6, null, c3627b6, 1)), false);
        C3627b c3627b7 = new C3627b(16);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C2093a.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass7, null, c3627b7, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C39787d m11345i(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C39787d((FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC21934a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21934a.class), null), (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final InterfaceC21934a m11346j(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("ConnectivityAnalyticsImpl");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C39784a(interfaceC34116nM107848a, (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (C13680b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C13680b.class), null), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (C11143a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C11143a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C13680b m11347k(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("StrapDisconnectMonitor");
        C17171d c17171dM8708b = AbstractC3006f0.m8708b(AbstractC3050q0.f12077a.plus(AbstractC3006f0.m8710d()));
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C13680b(interfaceC34116nM107848a, c17171dM8708b, (InterfaceC33704b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C11143a m11348l(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C11143a((InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (InterfaceC31766c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), AbstractC3006f0.m8708b(AbstractC3050q0.f12077a.plus(AbstractC3006f0.m8710d())), (InterfaceC14871g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14871g.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C39785b m11349m(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C39785b((InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), (InterfaceC25949a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC25949a.class), null), null, (InterfaceC0422g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null), null, 20, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final InterfaceC35205a m11350n(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22365e c22365e = AbstractC3050q0.f12077a;
        C17171d c17171dM8708b = AbstractC3006f0.m8708b(ExecutorC22364d.f87316w.plus(AbstractC3006f0.m8710d()));
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC0422g interfaceC0422g = (InterfaceC0422g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null);
        Clock clockSystemUTC = Clock.systemUTC();
        AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
        return new C41147a(c17171dM8708b, interfaceC0422g, clockSystemUTC, (InterfaceC21030c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), (InterfaceC4733b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), InterfaceC34116n.INSTANCE.m107848a("BackgroundUsageAggregator"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C2093a m11351o(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC33704b interfaceC33704b = (InterfaceC33704b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null);
        InterfaceC4733b interfaceC4733b = (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null);
        return new C2093a((InterfaceC31766c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), AbstractC3006f0.m8708b(AbstractC3050q0.f12077a.plus(AbstractC3006f0.m8710d())), interfaceC33704b.mo106503r(), new a(new C4588i(interfaceC4733b.getNewWhoopStrapFlow(), 2)), new b(new C4588i(interfaceC4733b.getNewWhoopStrapFlow(), 2)), (C39785b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C39785b.class), null), (InterfaceC4368h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4368h.class), null));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m11344h(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ List<InterfaceC26584j> getDependencies() {
        return super.getDependencies();
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
