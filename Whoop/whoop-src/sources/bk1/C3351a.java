package bk1;

import c93.InterfaceC4352n;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import l83.C23471q;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sl1.AbstractC32703b;
import xj1.C38399c;
import xj1.C38400d;
import xj1.EnumC38402f;
import yg2.AbstractC39529d;

/* JADX INFO: renamed from: bk1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u001e\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00050\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lbk1/a;", "", "<init>", "()V", "Lec3/l;", "Ll83/q;", "Lxj1/c;", "Lyg2/d;", "Lsl1/b;", "combinedFlow", "b", "(Lec3/l;)Lec3/l;", "healthMonitorDomainFlow", "liveHrStateFlow", "connectivityTileFlow", "a", "(Lec3/l;Lec3/l;Lec3/l;)Lec3/l;", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3351a {

    /* JADX INFO: renamed from: bk1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthmonitor.presentation.reducers.ComposableHealthMonitorCombiner$combineFlows$combinedFlow$1", m100430f = "ComposableHealthMonitorCombiner.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m65681d2 = {"Lxj1/c;", "newDomainResult", "Lyg2/d;", "newHrState", "Lsl1/b;", "tile", "Ll83/q;", "<anonymous>", "(Lxj1/c;Lyg2/d;Lsl1/b;)Ll83/q;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        int f13012w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f13013x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f13014y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f13015z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(4, interfaceC30057d);
        }

        @Override // c93.InterfaceC4352n
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C38399c c38399c, AbstractC39529d abstractC39529d, AbstractC32703b abstractC32703b, InterfaceC30057d<? super C23471q> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f13013x = c38399c;
            bVar.f13014y = abstractC39529d;
            bVar.f13015z = abstractC32703b;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C38399c c38399c = (C38399c) this.f13013x;
            AbstractC39529d abstractC39529d = (AbstractC39529d) this.f13014y;
            AbstractC32703b abstractC32703b = (AbstractC32703b) this.f13015z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f13012w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C23471q(c38399c, abstractC39529d, abstractC32703b);
        }
    }

    /* JADX INFO: renamed from: bk1.a$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f13016w;

        /* JADX INFO: renamed from: bk1.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f13017w;

            /* JADX INFO: renamed from: bk1.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.healthmonitor.presentation.reducers.ComposableHealthMonitorCombiner$useLiveHrOnceActive$$inlined$map$1$2", m100430f = "ComposableHealthMonitorCombiner.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41308a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f13018E;

                /* JADX INFO: renamed from: F */
                Object f13019F;

                /* JADX INFO: renamed from: G */
                Object f13020G;

                /* JADX INFO: renamed from: H */
                int f13021H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f13022w;

                /* JADX INFO: renamed from: x */
                int f13023x;

                /* JADX INFO: renamed from: y */
                Object f13024y;

                public C41308a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f13022w = obj;
                    this.f13023x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f13017w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41308a c41308a;
                if (interfaceC30057d instanceof C41308a) {
                    c41308a = (C41308a) interfaceC30057d;
                    int i13 = c41308a.f13023x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41308a.f13023x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41308a = new C41308a(interfaceC30057d);
                    }
                } else {
                    c41308a = new C41308a(interfaceC30057d);
                }
                Object obj2 = c41308a.f13022w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41308a.f13023x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f13017w;
                    C38399c lastDomainResult = ((a) obj).getLastDomainResult();
                    c41308a.f13024y = null;
                    c41308a.f13018E = null;
                    c41308a.f13019F = null;
                    c41308a.f13020G = null;
                    c41308a.f13021H = 0;
                    c41308a.f13023x = 1;
                    if (interfaceC13062m.emit(lastDomainResult, c41308a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l) {
            this.f13016w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f13016w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bk1.a$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthmonitor.presentation.reducers.ComposableHealthMonitorCombiner$useLiveHrOnceActive$1", m100430f = "ComposableHealthMonitorCombiner.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m65681d2 = {"Lbk1/a$a;", "accumulation", "Ll83/q;", "Lxj1/c;", "Lyg2/d;", "Lsl1/b;", "<destruct>", "<anonymous>", "(Lbk1/a$a;Ll83/q;)Lbk1/a$a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f13026w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f13027x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f13028y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a aVar, C23471q c23471q, InterfaceC30057d<? super a> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f13027x = aVar;
            dVar.f13028y = c23471q;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            a aVar = (a) this.f13027x;
            C23471q c23471q = (C23471q) this.f13028y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f13026w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C38399c c38399c = (C38399c) c23471q.f92947w;
            AbstractC39529d abstractC39529d = (AbstractC39529d) c23471q.f92948x;
            AbstractC32703b abstractC32703b = (AbstractC32703b) c23471q.f92949y;
            boolean z4 = aVar.getHasHadActiveHr() || (abstractC39529d instanceof AbstractC39529d.a);
            return new a(C38399c.m122974b(c38399c, null, null, null, abstractC32703b, (z4 || !c38399c.getLiveHrState().getIsFromNavigation()) ? new C38400d(abstractC39529d, false) : c38399c.getLiveHrState(), null, 39, null), z4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    private final InterfaceC13058l m9668b(InterfaceC13058l combinedFlow) {
        return new c(AbstractC13091v.m36612v(new C13060l1(new a(null, false, 3, 0 == true ? 1 : 0), combinedFlow, new d(null)), 1));
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m9669a(InterfaceC13058l healthMonitorDomainFlow, InterfaceC13058l liveHrStateFlow, InterfaceC13058l connectivityTileFlow) {
        AbstractC22676k.m65750j(healthMonitorDomainFlow, "healthMonitorDomainFlow");
        AbstractC22676k.m65750j(liveHrStateFlow, "liveHrStateFlow");
        AbstractC22676k.m65750j(connectivityTileFlow, "connectivityTileFlow");
        return m9668b(AbstractC13091v.m36606p(healthMonitorDomainFlow, liveHrStateFlow, connectivityTileFlow, new b(null)));
    }

    /* JADX INFO: renamed from: bk1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lbk1/a$a;", "", "Lxj1/c;", "lastDomainResult", "", "hasHadActiveHr", "<init>", "(Lxj1/c;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lxj1/c;", "b", "()Lxj1/c;", "Z", "()Z", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C38399c lastDomainResult;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean hasHadActiveHr;

        public a(C38399c lastDomainResult, boolean z4) {
            AbstractC22676k.m65750j(lastDomainResult, "lastDomainResult");
            this.lastDomainResult = lastDomainResult;
            this.hasHadActiveHr = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getHasHadActiveHr() {
            return this.hasHadActiveHr;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C38399c getLastDomainResult() {
            return this.lastDomainResult;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.lastDomainResult, aVar.lastDomainResult) && this.hasHadActiveHr == aVar.hasHadActiveHr;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hasHadActiveHr) + (this.lastDomainResult.hashCode() * 31);
        }

        public String toString() {
            return "CombinerAccumulation(lastDomainResult=" + this.lastDomainResult + ", hasHadActiveHr=" + this.hasHadActiveHr + ")";
        }

        public /* synthetic */ a(C38399c c38399c, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? new C38399c(null, null, EnumC38402f.LOADING, null, null, null, 59, null) : c38399c, (i13 & 2) != 0 ? false : z4);
        }
    }
}
