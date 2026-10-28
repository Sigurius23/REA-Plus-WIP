package hd1;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import androidx.core.app.FrameMetricsAggregator;
import c93.InterfaceC4352n;
import fc0.C14361e;
import gd1.AbstractC15715b;
import hb1.C17085h;
import id1.AbstractC18410a;
import id1.C18414e;
import java.util.List;
import l83.C23454a0;
import p088dc.AbstractC11895b;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p353o0.C27317b;
import p353o0.C27323g;
import p353o0.InterfaceC27326j;
import p353o0.InterfaceC27335s;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import se.AbstractC32417h;

/* JADX INFO: renamed from: hd1.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lid1/e;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Lid1/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17198b {

    /* JADX INFO: renamed from: hd1.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f66027w = new a();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC25312u interfaceC25312u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: hd1.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f66028w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f66029x;

        public b(Function1 function1, List list) {
            this.f66028w = function1;
            this.f66029x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m48563a(int i13) {
            return this.f66028w.invoke(this.f66029x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m48563a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: hd1.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f66030w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f66031x;

        public c(List list, Function1 function1) {
            this.f66030w = list;
            this.f66031x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m48564a(InterfaceC27326j interfaceC27326j, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC27326j) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f66030w.get(i13);
            c28655q.m87150e0(1390580278);
            AbstractC25303l.m74291r(interfaceC25312u, AbstractC15715b.m44298c(), null, this.f66031x, c28655q, C25307p.f99300b << 3, 4);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m48564a((InterfaceC27326j) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hd1.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f66032w = new d();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC25312u interfaceC25312u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: hd1.b$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f66033w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f66034x;

        public e(Function1 function1, List list) {
            this.f66033w = function1;
            this.f66034x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m48566a(int i13) {
            return this.f66033w.invoke(this.f66034x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m48566a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: hd1.b$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f66035w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f66036x;

        public f(List list, Function1 function1) {
            this.f66035w = list;
            this.f66036x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m48567a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f66035w.get(i13);
            c28655q.m87150e0(140404684);
            AbstractC25303l.m74291r(interfaceC25312u, AbstractC15715b.m44298c(), null, this.f66036x, c28655q, C25307p.f99300b << 3, 4);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m48567a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0096  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:59:0x0105  */
    /* JADX WARN: Code duplicated, block: B:62:0x0110  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m48557e(final C18414e state, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        final Function1 function4;
        AbstractC18410a abstractC18410aM52996b;
        final Function1 function5;
        boolean zM87157i;
        Object objM87133R;
        boolean zM87157i2;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1493176949);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q2.m87157i(state) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C17085h(6);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                abstractC18410aM52996b = state.getLayout();
                if (abstractC18410aM52996b instanceof AbstractC18410a.a) {
                    c28655q2.m87150e0(-423965617);
                    C27317b c27317b = new C27317b(((AbstractC18410a.a) abstractC18410aM52996b).getColumns());
                    zM87157i2 = c28655q2.m87157i(state) | ((i15 & 112) == 32);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87157i2 || objM87133R2 == c28676v0) {
                        final int i17 = 0;
                        objM87133R2 = new Function1() { // from class: hd1.a
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i17) {
                                    case 0:
                                        return AbstractC17198b.m48559g(state, function4, (InterfaceC27335s) obj);
                                    default:
                                        return AbstractC17198b.m48560h(state, function4, (InterfaceC26064q) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R2);
                    }
                    c28655q = c28655q2;
                    AbstractC32417h.m101202k(c27317b, null, null, null, null, null, null, false, null, (Function1) objM87133R2, c28655q, 0, 1022);
                    c28655q.m87173q(false);
                    function5 = function4;
                } else {
                    function5 = function4;
                    if (AbstractC22676k.m65745e(abstractC18410aM52996b, AbstractC18410a.b.f71609a)) {
                        throw AbstractC11895b.m32003v(-423967719, c28655q2, false);
                    }
                    c28655q2.m87150e0(-423957154);
                    zM87157i = c28655q2.m87157i(state) | ((i15 & 112) == 32);
                    objM87133R = c28655q2.m87133R();
                    if (zM87157i || objM87133R == c28676v0) {
                        final int i18 = 1;
                        objM87133R = new Function1() { // from class: hd1.a
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i18) {
                                    case 0:
                                        return AbstractC17198b.m48559g(state, function5, (InterfaceC27335s) obj);
                                    default:
                                        return AbstractC17198b.m48560h(state, function5, (InterfaceC26064q) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R);
                    }
                    AbstractC22674j.m65717c(null, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q2, 0, FrameMetricsAggregator.EVERY_DURATION);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                }
                function3 = function5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14361e(state, i13, function3, i14, 19);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C17085h(6);
                    c28655q2.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            abstractC18410aM52996b = state.getLayout();
            if (abstractC18410aM52996b instanceof AbstractC18410a.a) {
                c28655q2.m87150e0(-423965617);
                C27317b c27317b2 = new C27317b(((AbstractC18410a.a) abstractC18410aM52996b).getColumns());
                zM87157i2 = c28655q2.m87157i(state) | ((i15 & 112) == 32);
                objM87133R2 = c28655q2.m87133R();
                if (zM87157i2) {
                    final int i19 = 0;
                    objM87133R2 = new Function1() { // from class: hd1.a
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i19) {
                                case 0:
                                    return AbstractC17198b.m48559g(state, function4, (InterfaceC27335s) obj);
                                default:
                                    return AbstractC17198b.m48560h(state, function4, (InterfaceC26064q) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    final int i110 = 0;
                    objM87133R2 = new Function1() { // from class: hd1.a
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i110) {
                                case 0:
                                    return AbstractC17198b.m48559g(state, function4, (InterfaceC27335s) obj);
                                default:
                                    return AbstractC17198b.m48560h(state, function4, (InterfaceC26064q) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R2);
                }
                c28655q = c28655q2;
                AbstractC32417h.m101202k(c27317b2, null, null, null, null, null, null, false, null, (Function1) objM87133R2, c28655q, 0, 1022);
                c28655q.m87173q(false);
                function5 = function4;
            } else {
                function5 = function4;
                if (AbstractC22676k.m65745e(abstractC18410aM52996b, AbstractC18410a.b.f71609a)) {
                    throw AbstractC11895b.m32003v(-423967719, c28655q2, false);
                }
                c28655q2.m87150e0(-423957154);
                zM87157i = c28655q2.m87157i(state) | ((i15 & 112) == 32);
                objM87133R = c28655q2.m87133R();
                if (zM87157i) {
                    final int i111 = 1;
                    objM87133R = new Function1() { // from class: hd1.a
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i111) {
                                case 0:
                                    return AbstractC17198b.m48559g(state, function5, (InterfaceC27335s) obj);
                                default:
                                    return AbstractC17198b.m48560h(state, function5, (InterfaceC26064q) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R);
                } else {
                    final int i112 = 1;
                    objM87133R = new Function1() { // from class: hd1.a
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i112) {
                                case 0:
                                    return AbstractC17198b.m48559g(state, function5, (InterfaceC27335s) obj);
                                default:
                                    return AbstractC17198b.m48560h(state, function5, (InterfaceC26064q) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC22674j.m65717c(null, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q2, 0, FrameMetricsAggregator.EVERY_DURATION);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            function3 = function5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14361e(state, i13, function3, i14, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m48558f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m48559g(C18414e c18414e, Function1 function1, InterfaceC27335s LazyVerticalGrid) {
        AbstractC22676k.m65750j(LazyVerticalGrid, "$this$LazyVerticalGrid");
        List<InterfaceC25312u> listM52995a = c18414e.m52995a();
        C27323g c27323g = (C27323g) LazyVerticalGrid;
        c27323g.m82467q(listM52995a.size(), new b(a.f66027w, listM52995a), new C37816b(new c(listM52995a, function1), true, -1117249557));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m48560h(C18414e c18414e, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<InterfaceC25312u> listM52995a = c18414e.m52995a();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM52995a.size(), null, new e(d.f66032w, listM52995a), new C37816b(new f(listM52995a, function1), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m48561i(C18414e c18414e, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m48557e(c18414e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
