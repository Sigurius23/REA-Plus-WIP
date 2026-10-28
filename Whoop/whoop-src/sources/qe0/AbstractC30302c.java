package qe0;

import a81.C0557h;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c41.C4126u1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import fy1.AbstractC14874j;
import gb1.AbstractC15689q;
import gy0.AbstractC16276e;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import hy0.C17736e;
import java.util.Iterator;
import java.util.List;
import k11.AbstractC22122e;
import k11.C22123f;
import kd0.InterfaceC22381a;
import l83.C23454a0;
import lf0.C23908d1;
import md0.AbstractC25448c;
import ne0.AbstractC26596a;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26970r0;
import nx1.C27225g;
import ny0.C27256h;
import o72.C27640a;
import oe0.AbstractC27868c;
import oe0.AbstractC27870e;
import oe0.C27867b;
import ox0.C28448b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22971k;
import p291l0.C23010x;
import p291l0.InterfaceC23001u;
import p329n0.AbstractC26071x;
import p329n0.C26053f;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p602x1.C37816b;
import p62.C28947h;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p718lz1.C24823a;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import q11.C29793c;
import q83.InterfaceC30057d;
import qb0.C30179a;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uv0.AbstractC35283c;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: qe0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aY\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aC\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\f2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a9\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0004*\u00020\u0016H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a+\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Loe0/e;", "viewState", "Lkotlin/Function1;", "Lne0/a;", "Ll83/a0;", "onNavigationEvent", "Lkd0/a$c;", "onAnalyticsEvent", "Loe0/c;", "onViewEvent", "G", "(Loe0/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Loe0/e$c;", "t", "(Loe0/e$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ln0/u;", "listState", "", "Loe0/b;", "sections", "A", "(Ln0/u;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ll0/u;", "r", "(Ll0/u;Landroidx/compose/runtime/Composer;I)V", "", "viewEvent", "M", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30302c {

    /* JADX INFO: renamed from: qe0.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f123995w;

        public a(Function1 function1) {
            this.f123995w = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m92646a(Object viewEvent) {
            AbstractC22676k.m65750j(viewEvent, "viewEvent");
            AbstractC30302c.m92619M(viewEvent, this.f123995w);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m92646a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qe0.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f123996w = new b();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC25312u interfaceC25312u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: qe0.c$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f123997w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f123998x;

        public c(Function1 function1, List list) {
            this.f123997w = function1;
            this.f123998x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m92648a(int i13) {
            return this.f123997w.invoke(this.f123998x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m92648a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: qe0.c$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f123999w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f124000x;

        public d(Function1 function1, List list) {
            this.f123999w = function1;
            this.f124000x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m92649a(int i13) {
            return this.f123999w.invoke(this.f124000x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m92649a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: qe0.c$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f124001w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f124002x;

        public e(List list, Function1 function1) {
            this.f124001w = list;
            this.f124002x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m92650a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f124001w.get(i13);
            c28655q.m87150e0(1918149063);
            C25307p c25307pM74678B0 = AbstractC25448c.m74678B0();
            boolean zM87153g = c28655q.m87153g(this.f124002x);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new a(this.f124002x);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312u, c25307pM74678B0, null, (Function1) objM87133R, c28655q, C25307p.f99300b << 3, 4);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m92650a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qe0.c$f */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testhistory.view.TestHistoryScreenKt$TestHistoryScreen$6$1", m100430f = "TestHistoryScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f124003w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f124004x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC27870e f124005y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function1 function1, AbstractC27870e abstractC27870e, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f124004x = function1;
            this.f124005y = abstractC27870e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f124004x, this.f124005y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f124003w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f124004x.invoke(new InterfaceC22381a.e1(((AbstractC27870e.c) this.f124005y).getAnalyticsData()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: A */
    private static final void m92607A(C26068u c26068u, List<C27867b> list, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1238399701);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(c26068u) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(list) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, AbstractC1136a.m3599a(C2314t.f9131w, "test_history_list_tag")), 0.0f, 0.0f, 0.0f, 6 * 8, 7);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(2 * 4);
            C2305k c2305k = C2299e.f9111N;
            boolean zM87157i = c28655q.m87157i(list) | ((i14 & 896) == 256);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C0557h(list, 4, function1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22674j.m65717c(modifierM3398t, c26068u, null, c22971kM66746i, c2305k, null, false, null, (Function1) objM87133R, c28655q, ((i14 << 3) & 112) | 221190, 460);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g(c26068u, list, function1, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m92608B(List list, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C27867b c27867b = (C27867b) it.next();
            InterfaceC26064q.m77556b(LazyColumn, c27867b.getId(), new C37816b(new C24823a(c27867b, 18), true, 1679954548), 2);
            List<InterfaceC25312u> listM84116b = c27867b.m84116b();
            C30301b c30301b = new C30301b(1);
            b bVar = b.f123996w;
            ((C26053f) LazyColumn).m77529r(listM84116b.size(), new c(c30301b, listM84116b), new d(bVar, listM84116b), new C37816b(new e(listM84116b, function1), true, 802480018));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m92609C(C27867b c27867b, InterfaceC1103a item, Composer composer, int i13) {
        C23454a0 c23454a0;
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 17) != 16);
        C23454a0 c23454a1 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a1;
        }
        C17736e c17736eM84117c = c27867b.getSectionHeader();
        if (c17736eM84117c == null) {
            c28655q.m87150e0(-1727917574);
            c28655q.m87173q(false);
            c23454a0 = null;
        } else {
            c28655q.m87150e0(-1727917573);
            AbstractC25303l.m74291r(c17736eM84117c, null, new C26970r0(25), null, c28655q, C17736e.f68939d, 10);
            c28655q.m87173q(false);
            c23454a0 = c23454a1;
        }
        if (c23454a0 == null) {
            c28655q.m87150e0(-471378541);
            AbstractC31061c.m95650z(2, 4, C2314t.f9131w, c28655q, false);
            return c23454a1;
        }
        c28655q.m87150e0(-471381951);
        c28655q.m87173q(false);
        return c23454a1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final Modifier m92610D(C17736e it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1406664527);
        Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 1 * 4, 1);
        c28655q.m87173q(false);
        return modifierM3396r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final Object m92611E(InterfaceC25312u item) {
        AbstractC22676k.m65750j(item, "item");
        if (item instanceof C23908d1) {
            return ((C23908d1) item).getId();
        }
        return item instanceof C22123f ? ((C22123f) item).getId() : Integer.valueOf(item.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m92612F(C26068u c26068u, List list, Function1 function1, int i13, Composer composer, int i14) {
        m92607A(c26068u, list, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:108:0x021f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0227  */
    /* JADX WARN: Code duplicated, block: B:113:0x0233  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:71:0x0107  */
    /* JADX WARN: Code duplicated, block: B:72:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x011e  */
    /* JADX WARN: Code duplicated, block: B:77:0x012c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0166  */
    /* JADX WARN: Code duplicated, block: B:82:0x016b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0198  */
    /* JADX WARN: Code duplicated, block: B:88:0x019f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ea  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public static final void m92613G(AbstractC27870e viewState, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13, int i14) {
        int i15;
        Function1 function4;
        int i16;
        Function1 function5;
        int i17;
        int i18;
        Function1 function6;
        int i19;
        boolean z4;
        Function1 function7;
        Function1 function8;
        Function1 function9;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function10;
        Function1 function11;
        int i24;
        List list;
        Function1 function12;
        boolean z13;
        boolean z14;
        Object objM87133R;
        Function1 function13;
        boolean z15;
        Object objM87133R2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-928761654);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i25 = i14 & 2;
        if (i25 == 0) {
            if ((i13 & 48) == 0) {
                function4 = function1;
                i15 |= c28655q.m87157i(function4) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function5 = function2;
                    if (c28655q.m87157i(function5)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        function6 = function3;
                        if (c28655q.m87157i(function6)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 1171) != 1170) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i25 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C30301b(0);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function10 = (Function1) objM87133R5;
                        } else {
                            function10 = function4;
                        }
                        if (i16 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C30301b(2);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function5 = (Function1) objM87133R4;
                        }
                        if (i18 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C30301b(3);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function11 = (Function1) objM87133R3;
                        } else {
                            function11 = function6;
                        }
                        i24 = i15 & 14;
                        AbstractC14874j.m42904c(viewState, "advanced_labs_test_history", c28655q, i24 | 48);
                        if (viewState instanceof AbstractC27870e.b) {
                            c28655q.m87150e0(-558698111);
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            list = null;
                            objArr3 = 0;
                            objArr2 = 0;
                            objArr = 0;
                            if (viewState instanceof AbstractC27870e.a) {
                                c28655q.m87150e0(-558315137);
                                int i26 = 2;
                                AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i26, objArr == true ? 1 : 0), false, null, 6, null);
                                TextResource textResourceM21267a = AbstractC8693b.m21267a();
                                TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i26, objArr3 == true ? 1 : 0);
                                z15 = (i15 & 112) == 32;
                                objM87133R2 = c28655q.m87133R();
                                if (z15 || objM87133R2 == c28676v0) {
                                    objM87133R2 = new C28947h(function10, 26);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688b, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                function12 = function5;
                                if (viewState instanceof AbstractC27870e.c) {
                                    throw AbstractC11895b.m32003v(813260358, c28655q, false);
                                }
                                c28655q.m87150e0(-557898714);
                                if ((i15 & 896) == 256) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                z14 = (i24 == 4) | z13;
                                objM87133R = c28655q.m87133R();
                                if (z14 || objM87133R == c28676v0) {
                                    objM87133R = new f(function12, viewState, null);
                                    c28655q.m87172p0(objM87133R);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                                function4 = function10;
                                function13 = function11;
                                m92639t((AbstractC27870e.c) viewState, function4, function13, c28655q, (i15 & 126) | ((i15 >> 3) & 896), 0);
                                c28655q.m87173q(false);
                            }
                            function8 = function13;
                            function7 = function12;
                        }
                        function12 = function5;
                        function4 = function10;
                        function13 = function11;
                        function8 = function13;
                        function7 = function12;
                    } else {
                        c28655q.m87138X();
                        function7 = function5;
                        function8 = function6;
                    }
                    function9 = function4;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C27640a((Object) viewState, function9, function7, (Object) function8, i13, i14, 14);
                    }
                }
                i15 |= 3072;
                function6 = function3;
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C30301b(0);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C30301b(2);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function5 = (Function1) objM87133R4;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C30301b(3);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function11 = (Function1) objM87133R3;
                    } else {
                        function11 = function6;
                    }
                    i24 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "advanced_labs_test_history", c28655q, i24 | 48);
                    if (viewState instanceof AbstractC27870e.b) {
                        c28655q.m87150e0(-558698111);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        list = null;
                        objArr3 = 0;
                        objArr2 = 0;
                        objArr = 0;
                        if (viewState instanceof AbstractC27870e.a) {
                            c28655q.m87150e0(-558315137);
                            int i27 = 2;
                            AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i27, objArr == true ? 1 : 0), false, null, 6, null);
                            TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i27, objArr3 == true ? 1 : 0);
                            if ((i15 & 112) == 32) {
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z15) {
                                objM87133R2 = new C28947h(function10, 26);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C28947h(function10, 26);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC33199m0.m105214F(bVar2, textResourceM21267a2, null, c8688b2, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function12 = function5;
                            if (viewState instanceof AbstractC27870e.c) {
                                throw AbstractC11895b.m32003v(813260358, c28655q, false);
                            }
                            c28655q.m87150e0(-557898714);
                            if ((i15 & 896) == 256) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = (i24 == 4) | z13;
                            objM87133R = c28655q.m87133R();
                            if (z14) {
                                objM87133R = new f(function12, viewState, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new f(function12, viewState, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                            function4 = function10;
                            function13 = function11;
                            m92639t((AbstractC27870e.c) viewState, function4, function13, c28655q, (i15 & 126) | ((i15 >> 3) & 896), 0);
                            c28655q.m87173q(false);
                        }
                        function8 = function13;
                        function7 = function12;
                    }
                    function12 = function5;
                    function4 = function10;
                    function13 = function11;
                    function8 = function13;
                    function7 = function12;
                } else {
                    c28655q.m87138X();
                    function7 = function5;
                    function8 = function6;
                }
                function9 = function4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C27640a((Object) viewState, function9, function7, (Object) function8, i13, i14, 14);
                }
            }
            i15 |= 384;
            function5 = function2;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C30301b(0);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C30301b(2);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function5 = (Function1) objM87133R4;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C30301b(3);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function11 = (Function1) objM87133R3;
                    } else {
                        function11 = function6;
                    }
                    i24 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "advanced_labs_test_history", c28655q, i24 | 48);
                    if (viewState instanceof AbstractC27870e.b) {
                        c28655q.m87150e0(-558698111);
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        list = null;
                        objArr3 = 0;
                        objArr2 = 0;
                        objArr = 0;
                        if (viewState instanceof AbstractC27870e.a) {
                            c28655q.m87150e0(-558315137);
                            int i28 = 2;
                            AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i28, objArr == true ? 1 : 0), false, null, 6, null);
                            TextResource textResourceM21267a3 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i28, objArr3 == true ? 1 : 0);
                            if ((i15 & 112) == 32) {
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z15) {
                                objM87133R2 = new C28947h(function10, 26);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C28947h(function10, 26);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC33199m0.m105214F(bVar3, textResourceM21267a3, null, c8688b3, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function12 = function5;
                            if (viewState instanceof AbstractC27870e.c) {
                                throw AbstractC11895b.m32003v(813260358, c28655q, false);
                            }
                            c28655q.m87150e0(-557898714);
                            if ((i15 & 896) == 256) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = (i24 == 4) | z13;
                            objM87133R = c28655q.m87133R();
                            if (z14) {
                                objM87133R = new f(function12, viewState, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new f(function12, viewState, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                            function4 = function10;
                            function13 = function11;
                            m92639t((AbstractC27870e.c) viewState, function4, function13, c28655q, (i15 & 126) | ((i15 >> 3) & 896), 0);
                            c28655q.m87173q(false);
                        }
                        function8 = function13;
                        function7 = function12;
                    }
                    function12 = function5;
                    function4 = function10;
                    function13 = function11;
                    function8 = function13;
                    function7 = function12;
                } else {
                    c28655q.m87138X();
                    function7 = function5;
                    function8 = function6;
                }
                function9 = function4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C27640a((Object) viewState, function9, function7, (Object) function8, i13, i14, 14);
                }
            }
            i15 |= 3072;
            function6 = function3;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C30301b(0);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function10 = (Function1) objM87133R5;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C30301b(2);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function5 = (Function1) objM87133R4;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C30301b(3);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function11 = (Function1) objM87133R3;
                } else {
                    function11 = function6;
                }
                i24 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "advanced_labs_test_history", c28655q, i24 | 48);
                if (viewState instanceof AbstractC27870e.b) {
                    c28655q.m87150e0(-558698111);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    list = null;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (viewState instanceof AbstractC27870e.a) {
                        c28655q.m87150e0(-558315137);
                        int i29 = 2;
                        AbstractC33208p0.b bVar4 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i29, objArr == true ? 1 : 0), false, null, 6, null);
                        TextResource textResourceM21267a4 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i29, objArr3 == true ? 1 : 0);
                        if ((i15 & 112) == 32) {
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z15) {
                            objM87133R2 = new C28947h(function10, 26);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C28947h(function10, 26);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC33199m0.m105214F(bVar4, textResourceM21267a4, null, c8688b4, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function12 = function5;
                        if (viewState instanceof AbstractC27870e.c) {
                            throw AbstractC11895b.m32003v(813260358, c28655q, false);
                        }
                        c28655q.m87150e0(-557898714);
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = (i24 == 4) | z13;
                        objM87133R = c28655q.m87133R();
                        if (z14) {
                            objM87133R = new f(function12, viewState, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new f(function12, viewState, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                        function4 = function10;
                        function13 = function11;
                        m92639t((AbstractC27870e.c) viewState, function4, function13, c28655q, (i15 & 126) | ((i15 >> 3) & 896), 0);
                        c28655q.m87173q(false);
                    }
                    function8 = function13;
                    function7 = function12;
                }
                function12 = function5;
                function4 = function10;
                function13 = function11;
                function8 = function13;
                function7 = function12;
            } else {
                c28655q.m87138X();
                function7 = function5;
                function8 = function6;
            }
            function9 = function4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27640a((Object) viewState, function9, function7, (Object) function8, i13, i14, 14);
            }
        }
        i15 |= 48;
        function4 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function5 = function2;
                if (c28655q.m87157i(function5)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C30301b(0);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C30301b(2);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function5 = (Function1) objM87133R4;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C30301b(3);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function11 = (Function1) objM87133R3;
                    } else {
                        function11 = function6;
                    }
                    i24 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "advanced_labs_test_history", c28655q, i24 | 48);
                    if (viewState instanceof AbstractC27870e.b) {
                        c28655q.m87150e0(-558698111);
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        list = null;
                        objArr3 = 0;
                        objArr2 = 0;
                        objArr = 0;
                        if (viewState instanceof AbstractC27870e.a) {
                            c28655q.m87150e0(-558315137);
                            int i210 = 2;
                            AbstractC33208p0.b bVar5 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i210, objArr == true ? 1 : 0), false, null, 6, null);
                            TextResource textResourceM21267a5 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b5 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i210, objArr3 == true ? 1 : 0);
                            if ((i15 & 112) == 32) {
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z15) {
                                objM87133R2 = new C28947h(function10, 26);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C28947h(function10, 26);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC33199m0.m105214F(bVar5, textResourceM21267a5, null, c8688b5, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function12 = function5;
                            if (viewState instanceof AbstractC27870e.c) {
                                throw AbstractC11895b.m32003v(813260358, c28655q, false);
                            }
                            c28655q.m87150e0(-557898714);
                            if ((i15 & 896) == 256) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = (i24 == 4) | z13;
                            objM87133R = c28655q.m87133R();
                            if (z14) {
                                objM87133R = new f(function12, viewState, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new f(function12, viewState, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                            function4 = function10;
                            function13 = function11;
                            m92639t((AbstractC27870e.c) viewState, function4, function13, c28655q, (i15 & 126) | ((i15 >> 3) & 896), 0);
                            c28655q.m87173q(false);
                        }
                        function8 = function13;
                        function7 = function12;
                    }
                    function12 = function5;
                    function4 = function10;
                    function13 = function11;
                    function8 = function13;
                    function7 = function12;
                } else {
                    c28655q.m87138X();
                    function7 = function5;
                    function8 = function6;
                }
                function9 = function4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C27640a((Object) viewState, function9, function7, (Object) function8, i13, i14, 14);
                }
            }
            i15 |= 3072;
            function6 = function3;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C30301b(0);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function10 = (Function1) objM87133R5;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C30301b(2);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function5 = (Function1) objM87133R4;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C30301b(3);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function11 = (Function1) objM87133R3;
                } else {
                    function11 = function6;
                }
                i24 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "advanced_labs_test_history", c28655q, i24 | 48);
                if (viewState instanceof AbstractC27870e.b) {
                    c28655q.m87150e0(-558698111);
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    list = null;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (viewState instanceof AbstractC27870e.a) {
                        c28655q.m87150e0(-558315137);
                        int i211 = 2;
                        AbstractC33208p0.b bVar6 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i211, objArr == true ? 1 : 0), false, null, 6, null);
                        TextResource textResourceM21267a6 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b6 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i211, objArr3 == true ? 1 : 0);
                        if ((i15 & 112) == 32) {
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z15) {
                            objM87133R2 = new C28947h(function10, 26);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C28947h(function10, 26);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC33199m0.m105214F(bVar6, textResourceM21267a6, null, c8688b6, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function12 = function5;
                        if (viewState instanceof AbstractC27870e.c) {
                            throw AbstractC11895b.m32003v(813260358, c28655q, false);
                        }
                        c28655q.m87150e0(-557898714);
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = (i24 == 4) | z13;
                        objM87133R = c28655q.m87133R();
                        if (z14) {
                            objM87133R = new f(function12, viewState, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new f(function12, viewState, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                        function4 = function10;
                        function13 = function11;
                        m92639t((AbstractC27870e.c) viewState, function4, function13, c28655q, (i15 & 126) | ((i15 >> 3) & 896), 0);
                        c28655q.m87173q(false);
                    }
                    function8 = function13;
                    function7 = function12;
                }
                function12 = function5;
                function4 = function10;
                function13 = function11;
                function8 = function13;
                function7 = function12;
            } else {
                c28655q.m87138X();
                function7 = function5;
                function8 = function6;
            }
            function9 = function4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27640a((Object) viewState, function9, function7, (Object) function8, i13, i14, 14);
            }
        }
        i15 |= 384;
        function5 = function2;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function6 = function3;
                if (c28655q.m87157i(function6)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C30301b(0);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function10 = (Function1) objM87133R5;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C30301b(2);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function5 = (Function1) objM87133R4;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C30301b(3);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function11 = (Function1) objM87133R3;
                } else {
                    function11 = function6;
                }
                i24 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "advanced_labs_test_history", c28655q, i24 | 48);
                if (viewState instanceof AbstractC27870e.b) {
                    c28655q.m87150e0(-558698111);
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a7);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    list = null;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (viewState instanceof AbstractC27870e.a) {
                        c28655q.m87150e0(-558315137);
                        int i212 = 2;
                        AbstractC33208p0.b bVar7 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i212, objArr == true ? 1 : 0), false, null, 6, null);
                        TextResource textResourceM21267a7 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b7 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i212, objArr3 == true ? 1 : 0);
                        if ((i15 & 112) == 32) {
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z15) {
                            objM87133R2 = new C28947h(function10, 26);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C28947h(function10, 26);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC33199m0.m105214F(bVar7, textResourceM21267a7, null, c8688b7, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function12 = function5;
                        if (viewState instanceof AbstractC27870e.c) {
                            throw AbstractC11895b.m32003v(813260358, c28655q, false);
                        }
                        c28655q.m87150e0(-557898714);
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = (i24 == 4) | z13;
                        objM87133R = c28655q.m87133R();
                        if (z14) {
                            objM87133R = new f(function12, viewState, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new f(function12, viewState, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                        function4 = function10;
                        function13 = function11;
                        m92639t((AbstractC27870e.c) viewState, function4, function13, c28655q, (i15 & 126) | ((i15 >> 3) & 896), 0);
                        c28655q.m87173q(false);
                    }
                    function8 = function13;
                    function7 = function12;
                }
                function12 = function5;
                function4 = function10;
                function13 = function11;
                function8 = function13;
                function7 = function12;
            } else {
                c28655q.m87138X();
                function7 = function5;
                function8 = function6;
            }
            function9 = function4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27640a((Object) viewState, function9, function7, (Object) function8, i13, i14, 14);
            }
        }
        i15 |= 3072;
        function6 = function3;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i25 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C30301b(0);
                    c28655q.m87172p0(objM87133R5);
                }
                function10 = (Function1) objM87133R5;
            } else {
                function10 = function4;
            }
            if (i16 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C30301b(2);
                    c28655q.m87172p0(objM87133R4);
                }
                function5 = (Function1) objM87133R4;
            }
            if (i18 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C30301b(3);
                    c28655q.m87172p0(objM87133R3);
                }
                function11 = (Function1) objM87133R3;
            } else {
                function11 = function6;
            }
            i24 = i15 & 14;
            AbstractC14874j.m42904c(viewState, "advanced_labs_test_history", c28655q, i24 | 48);
            if (viewState instanceof AbstractC27870e.b) {
                c28655q.m87150e0(-558698111);
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                list = null;
                objArr3 = 0;
                objArr2 = 0;
                objArr = 0;
                if (viewState instanceof AbstractC27870e.a) {
                    c28655q.m87150e0(-558315137);
                    int i213 = 2;
                    AbstractC33208p0.b bVar8 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i213, objArr == true ? 1 : 0), false, null, 6, null);
                    TextResource textResourceM21267a8 = AbstractC8693b.m21267a();
                    TextResource.C8688b c8688b8 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i213, objArr3 == true ? 1 : 0);
                    if ((i15 & 112) == 32) {
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z15) {
                        objM87133R2 = new C28947h(function10, 26);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C28947h(function10, 26);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC33199m0.m105214F(bVar8, textResourceM21267a8, null, c8688b8, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    function12 = function5;
                    if (viewState instanceof AbstractC27870e.c) {
                        throw AbstractC11895b.m32003v(813260358, c28655q, false);
                    }
                    c28655q.m87150e0(-557898714);
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = (i24 == 4) | z13;
                    objM87133R = c28655q.m87133R();
                    if (z14) {
                        objM87133R = new f(function12, viewState, null);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new f(function12, viewState, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                    function4 = function10;
                    function13 = function11;
                    m92639t((AbstractC27870e.c) viewState, function4, function13, c28655q, (i15 & 126) | ((i15 >> 3) & 896), 0);
                    c28655q.m87173q(false);
                }
                function8 = function13;
                function7 = function12;
            }
            function12 = function5;
            function4 = function10;
            function13 = function11;
            function8 = function13;
            function7 = function12;
        } else {
            c28655q.m87138X();
            function7 = function5;
            function8 = function6;
        }
        function9 = function4;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27640a((Object) viewState, function9, function7, (Object) function8, i13, i14, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m92614H(AbstractC26596a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m92615I(InterfaceC22381a.c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m92616J(AbstractC27868c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m92617K(Function1 function1) {
        function1.invoke(AbstractC26596a.a.f105795a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m92618L(AbstractC27870e abstractC27870e, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m92613G(abstractC27870e, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    public static final void m92619M(Object viewEvent, Function1 onNavigationEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        if (viewEvent instanceof C23908d1) {
            C9598e c9598eM70282a = ((C23908d1) viewEvent).getDestination();
            if (c9598eM70282a != null) {
                onNavigationEvent.invoke(new AbstractC26596a.b(c9598eM70282a));
                return;
            }
            return;
        }
        if (viewEvent instanceof C27256h) {
            onNavigationEvent.invoke(new AbstractC26596a.b(((C27256h) viewEvent).getDestination()));
        } else if (viewEvent instanceof AbstractC22122e.b) {
            onNavigationEvent.invoke(new AbstractC26596a.b(((AbstractC22122e.b) viewEvent).getDestination()));
        }
    }

    /* JADX INFO: renamed from: r */
    private static final void m92637r(InterfaceC23001u interfaceC23001u, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1470180220);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC23001u) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 8;
            Modifier modifierM3411h = AbstractC1102d.m3411h(f13 * 4, AbstractC1099a.m3398t(interfaceC23001u.mo3400a(C2314t.f9131w, C2299e.f9105H), 0.0f, 0.0f, 0.0f, 3 * f13, 7));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3411h);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC35684p.m113047h(null, InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, c28655q, 0, 509);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4126u1(interfaceC23001u, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m92638s(InterfaceC23001u interfaceC23001u, int i13, Composer composer, int i14) {
        m92637r(interfaceC23001u, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0255  */
    /* JADX WARN: Code duplicated, block: B:105:0x031f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0321  */
    /* JADX WARN: Code duplicated, block: B:109:0x0329  */
    /* JADX WARN: Code duplicated, block: B:113:0x0331  */
    /* JADX WARN: Code duplicated, block: B:116:0x0356  */
    /* JADX WARN: Code duplicated, block: B:117:0x0367  */
    /* JADX WARN: Code duplicated, block: B:119:0x0377  */
    /* JADX WARN: Code duplicated, block: B:122:0x0382  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:62:0x0122  */
    /* JADX WARN: Code duplicated, block: B:63:0x0126  */
    /* JADX WARN: Code duplicated, block: B:66:0x0133  */
    /* JADX WARN: Code duplicated, block: B:68:0x0141  */
    /* JADX WARN: Code duplicated, block: B:71:0x016f  */
    /* JADX WARN: Code duplicated, block: B:73:0x017a  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:94:0x0232  */
    /* JADX WARN: Code duplicated, block: B:95:0x0236  */
    /* JADX WARN: Code duplicated, block: B:98:0x0243  */
    /* JADX INFO: renamed from: t */
    public static final void m92639t(AbstractC27870e.c cVar, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        boolean z4;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        Function1 function8;
        Function1 function9;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function10;
        int iHashCode2;
        EnumC16313m0 enumC16313m0M106630b;
        Integer numValueOf;
        int i18;
        boolean z13;
        Object objM87133R;
        Function1 function11;
        boolean z14;
        boolean z15;
        Object objM87133R2;
        int i19;
        int iHashCode3;
        boolean z16;
        boolean z17;
        Object objM87133R3;
        Function1 function12;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC27870e.c viewState = cVar;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1898755767);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C30301b(4);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function7 = (Function1) objM87133R5;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C30301b(5);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function8 = (Function1) objM87133R4;
                    } else {
                        function8 = function4;
                    }
                    C26068u c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    function9 = function7;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    Modifier modifierM114675c = AbstractC36095b.m114675c(c2314t, 1.0f);
                    C22957g c22957g = AbstractC22977m.f90652c;
                    C2305k c2305k = C2299e.f9110M;
                    function10 = function8;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM114675c);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    TextResource textResourceM21278l = AbstractC8693b.m21278l(viewState.getNavigationBar().getNavigationTitle());
                    Integer numValueOf2 = Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon());
                    enumC16313m0M106630b = viewState.getNavigationBar().getNavigationRightIcon();
                    if (enumC16313m0M106630b != null) {
                        numValueOf = Integer.valueOf(enumC16313m0M106630b.toWhoopIcon());
                    } else {
                        numValueOf = null;
                    }
                    AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceM21278l, null, numValueOf2, null, numValueOf, null, null, null, false, null, null, null, null, null, null, null, 65514, null);
                    i18 = i15 & 112;
                    if (i18 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (!z13 || objM87133R == c28676v0) {
                        function11 = function9;
                        objM87133R = new C28947h(function11, 27);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        function11 = function9;
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                    boolean zM87157i = c28655q.m87157i(viewState);
                    if (i18 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | zM87157i;
                    objM87133R2 = c28655q.m87133R();
                    if (z15 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C28448b(28, viewState, function11);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Function1 function13 = function11;
                    i19 = i15;
                    AbstractC6719b.m20143d(modifierM3409f, aVar, null, interfaceC4339a, (InterfaceC4339a) objM87133R2, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 36);
                    float f13 = 8;
                    Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, c2314t);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    String strM84128f = cVar.getTitle();
                    C38072d c38072d = C38072d.f163053a;
                    int i25 = C38072d.f163054b;
                    C2886a c2886aM8418P = c38072d.m121952e(c28655q, i25).getT3();
                    long jM125430y = c38072d.m121949b(c28655q, i25).getBrandWhite();
                    int i26 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM84128f, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P, null, c28655q, 0, i26, 196602);
                    AbstractC30795n.m94707h(cVar.getSubtitle(), AbstractC1099a.m3398t(c2314t, 0.0f, 1 * f13, 0.0f, ((float) 2.5d) * f13, 5), c38072d.m121949b(c28655q, i25).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i25).getB1(), null, c28655q, 48, i26, 196600);
                    m92607A(c26068uM77569a, cVar.getPaginatedRecords().m84114b(), function13, c28655q, (i19 << 3) & 896);
                    String strM84113a = cVar.getPaginatedRecords().getNextToken();
                    viewState = cVar;
                    boolean zM87157i2 = c28655q.m87157i(viewState);
                    if ((i19 & 896) == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zM87157i2 | z16;
                    objM87133R3 = c28655q.m87133R();
                    if (!z17 || objM87133R3 == c28676v0) {
                        function12 = function10;
                        objM87133R3 = new C29793c(viewState, function12, 7);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        function12 = function10;
                    }
                    AbstractC15689q.m44140h(c26068uM77569a, 0, strM84113a, (Function1) objM87133R3, c28655q, 0, 1);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if (viewState.getIsLoadingMore()) {
                        c28655q.m87150e0(-957231415);
                        m92637r(C1100b.f4583a, c28655q, 6);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-957191053);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function5 = function13;
                    function6 = function12;
                } else {
                    c28655q.m87138X();
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C30179a(viewState, function5, function6, i13, i14, 4);
                }
            }
            i15 |= 384;
            function4 = function2;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C30301b(4);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C30301b(5);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function8 = (Function1) objM87133R4;
                } else {
                    function8 = function4;
                }
                C26068u c26068uM77569a2 = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t2);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                function9 = function7;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                Modifier modifierM114675c2 = AbstractC36095b.m114675c(c2314t2, 1.0f);
                C22957g c22957g2 = AbstractC22977m.f90652c;
                C2305k c2305k2 = C2299e.f9110M;
                function10 = function8;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM114675c2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(viewState.getNavigationBar().getNavigationTitle());
                Integer numValueOf3 = Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon());
                enumC16313m0M106630b = viewState.getNavigationBar().getNavigationRightIcon();
                if (enumC16313m0M106630b != null) {
                    numValueOf = Integer.valueOf(enumC16313m0M106630b.toWhoopIcon());
                } else {
                    numValueOf = null;
                }
                AbstractC6721d.a aVar2 = new AbstractC6721d.a(textResourceM21278l2, null, numValueOf3, null, numValueOf, null, null, null, false, null, null, null, null, null, null, null, 65514, null);
                i18 = i15 & 112;
                if (i18 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    function11 = function9;
                    objM87133R = new C28947h(function11, 27);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function11 = function9;
                    objM87133R = new C28947h(function11, 27);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                boolean zM87157i3 = c28655q.m87157i(viewState);
                if (i18 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | zM87157i3;
                objM87133R2 = c28655q.m87133R();
                if (z15) {
                    objM87133R2 = new C28448b(28, viewState, function11);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C28448b(28, viewState, function11);
                    c28655q.m87172p0(objM87133R2);
                }
                Function1 function14 = function11;
                i19 = i15;
                AbstractC6719b.m20143d(modifierM3409f2, aVar2, null, interfaceC4339a2, (InterfaceC4339a) objM87133R2, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 36);
                float f14 = 8;
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(2 * f14, c2314t2);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
                String strM84128f2 = cVar.getTitle();
                C38072d c38072d2 = C38072d.f163053a;
                int i27 = C38072d.f163054b;
                C2886a c2886aM8418P2 = c38072d2.m121952e(c28655q, i27).getT3();
                long jM125430y2 = c38072d2.m121949b(c28655q, i27).getBrandWhite();
                int i28 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM84128f2, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P2, null, c28655q, 0, i28, 196602);
                AbstractC30795n.m94707h(cVar.getSubtitle(), AbstractC1099a.m3398t(c2314t2, 0.0f, 1 * f14, 0.0f, ((float) 2.5d) * f14, 5), c38072d2.m121949b(c28655q, i27).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i27).getB1(), null, c28655q, 48, i28, 196600);
                m92607A(c26068uM77569a2, cVar.getPaginatedRecords().m84114b(), function14, c28655q, (i19 << 3) & 896);
                String strM84113a2 = cVar.getPaginatedRecords().getNextToken();
                viewState = cVar;
                boolean zM87157i4 = c28655q.m87157i(viewState);
                if ((i19 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zM87157i4 | z16;
                objM87133R3 = c28655q.m87133R();
                if (z17) {
                    function12 = function10;
                    objM87133R3 = new C29793c(viewState, function12, 7);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    function12 = function10;
                    objM87133R3 = new C29793c(viewState, function12, 7);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC15689q.m44140h(c26068uM77569a2, 0, strM84113a2, (Function1) objM87133R3, c28655q, 0, 1);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (viewState.getIsLoadingMore()) {
                    c28655q.m87150e0(-957231415);
                    m92637r(C1100b.f4583a, c28655q, 6);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-957191053);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function5 = function14;
                function6 = function12;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30179a(viewState, function5, function6, i13, i14, 4);
            }
        }
        i15 |= 48;
        function3 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C30301b(4);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C30301b(5);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function8 = (Function1) objM87133R4;
                } else {
                    function8 = function4;
                }
                C26068u c26068uM77569a3 = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                C2314t c2314t3 = C2314t.f9131w;
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t3);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                function9 = function7;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3407d3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i8 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d3);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N7);
                Modifier modifierM114675c3 = AbstractC36095b.m114675c(c2314t3, 1.0f);
                C22957g c22957g3 = AbstractC22977m.f90652c;
                C2305k c2305k3 = C2299e.f9110M;
                function10 = function8;
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM114675c3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m8);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N8);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t3);
                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(viewState.getNavigationBar().getNavigationTitle());
                Integer numValueOf4 = Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon());
                enumC16313m0M106630b = viewState.getNavigationBar().getNavigationRightIcon();
                if (enumC16313m0M106630b != null) {
                    numValueOf = Integer.valueOf(enumC16313m0M106630b.toWhoopIcon());
                } else {
                    numValueOf = null;
                }
                AbstractC6721d.a aVar3 = new AbstractC6721d.a(textResourceM21278l3, null, numValueOf4, null, numValueOf, null, null, null, false, null, null, null, null, null, null, null, 65514, null);
                i18 = i15 & 112;
                if (i18 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    function11 = function9;
                    objM87133R = new C28947h(function11, 27);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function11 = function9;
                    objM87133R = new C28947h(function11, 27);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                boolean zM87157i5 = c28655q.m87157i(viewState);
                if (i18 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | zM87157i5;
                objM87133R2 = c28655q.m87133R();
                if (z15) {
                    objM87133R2 = new C28448b(28, viewState, function11);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C28448b(28, viewState, function11);
                    c28655q.m87172p0(objM87133R2);
                }
                Function1 function15 = function11;
                i19 = i15;
                AbstractC6719b.m20143d(modifierM3409f3, aVar3, null, interfaceC4339a3, (InterfaceC4339a) objM87133R2, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 36);
                float f15 = 8;
                Modifier modifierM3394p3 = AbstractC1099a.m3394p(2 * f15, c2314t3);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3394p3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N9);
                String strM84128f3 = cVar.getTitle();
                C38072d c38072d3 = C38072d.f163053a;
                int i29 = C38072d.f163054b;
                C2886a c2886aM8418P3 = c38072d3.m121952e(c28655q, i29).getT3();
                long jM125430y3 = c38072d3.m121949b(c28655q, i29).getBrandWhite();
                int i210 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM84128f3, null, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P3, null, c28655q, 0, i210, 196602);
                AbstractC30795n.m94707h(cVar.getSubtitle(), AbstractC1099a.m3398t(c2314t3, 0.0f, 1 * f15, 0.0f, ((float) 2.5d) * f15, 5), c38072d3.m121949b(c28655q, i29).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i29).getB1(), null, c28655q, 48, i210, 196600);
                m92607A(c26068uM77569a3, cVar.getPaginatedRecords().m84114b(), function15, c28655q, (i19 << 3) & 896);
                String strM84113a3 = cVar.getPaginatedRecords().getNextToken();
                viewState = cVar;
                boolean zM87157i6 = c28655q.m87157i(viewState);
                if ((i19 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zM87157i6 | z16;
                objM87133R3 = c28655q.m87133R();
                if (z17) {
                    function12 = function10;
                    objM87133R3 = new C29793c(viewState, function12, 7);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    function12 = function10;
                    objM87133R3 = new C29793c(viewState, function12, 7);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC15689q.m44140h(c26068uM77569a3, 0, strM84113a3, (Function1) objM87133R3, c28655q, 0, 1);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (viewState.getIsLoadingMore()) {
                    c28655q.m87150e0(-957231415);
                    m92637r(C1100b.f4583a, c28655q, 6);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-957191053);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function5 = function15;
                function6 = function12;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30179a(viewState, function5, function6, i13, i14, 4);
            }
        }
        i15 |= 384;
        function4 = function2;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C30301b(4);
                    c28655q.m87172p0(objM87133R5);
                }
                function7 = (Function1) objM87133R5;
            } else {
                function7 = function3;
            }
            if (i16 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C30301b(5);
                    c28655q.m87172p0(objM87133R4);
                }
                function8 = (Function1) objM87133R4;
            } else {
                function8 = function4;
            }
            C26068u c26068uM77569a4 = AbstractC26071x.m77569a(0, 0, c28655q, 3);
            C2314t c2314t4 = C2314t.f9131w;
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t4);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            function9 = function7;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3407d4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d4);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m10);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N10);
            Modifier modifierM114675c4 = AbstractC36095b.m114675c(c2314t4, 1.0f);
            C22957g c22957g4 = AbstractC22977m.f90652c;
            C2305k c2305k4 = C2299e.f9110M;
            function10 = function8;
            C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
            Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM114675c4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a7);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m11);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N11);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t4);
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(viewState.getNavigationBar().getNavigationTitle());
            Integer numValueOf5 = Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon());
            enumC16313m0M106630b = viewState.getNavigationBar().getNavigationRightIcon();
            if (enumC16313m0M106630b != null) {
                numValueOf = Integer.valueOf(enumC16313m0M106630b.toWhoopIcon());
            } else {
                numValueOf = null;
            }
            AbstractC6721d.a aVar4 = new AbstractC6721d.a(textResourceM21278l4, null, numValueOf5, null, numValueOf, null, null, null, false, null, null, null, null, null, null, null, 65514, null);
            i18 = i15 & 112;
            if (i18 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                function11 = function9;
                objM87133R = new C28947h(function11, 27);
                c28655q.m87172p0(objM87133R);
            } else {
                function11 = function9;
                objM87133R = new C28947h(function11, 27);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R;
            boolean zM87157i7 = c28655q.m87157i(viewState);
            if (i18 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z14 | zM87157i7;
            objM87133R2 = c28655q.m87133R();
            if (z15) {
                objM87133R2 = new C28448b(28, viewState, function11);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C28448b(28, viewState, function11);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function16 = function11;
            i19 = i15;
            AbstractC6719b.m20143d(modifierM3409f4, aVar4, null, interfaceC4339a4, (InterfaceC4339a) objM87133R2, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 36);
            float f16 = 8;
            Modifier modifierM3394p4 = AbstractC1099a.m3394p(2 * f16, c2314t4);
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 0);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3394p4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m12);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N12);
            String strM84128f4 = cVar.getTitle();
            C38072d c38072d4 = C38072d.f163053a;
            int i211 = C38072d.f163054b;
            C2886a c2886aM8418P4 = c38072d4.m121952e(c28655q, i211).getT3();
            long jM125430y4 = c38072d4.m121949b(c28655q, i211).getBrandWhite();
            int i212 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM84128f4, null, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P4, null, c28655q, 0, i212, 196602);
            AbstractC30795n.m94707h(cVar.getSubtitle(), AbstractC1099a.m3398t(c2314t4, 0.0f, 1 * f16, 0.0f, ((float) 2.5d) * f16, 5), c38072d4.m121949b(c28655q, i211).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i211).getB1(), null, c28655q, 48, i212, 196600);
            m92607A(c26068uM77569a4, cVar.getPaginatedRecords().m84114b(), function16, c28655q, (i19 << 3) & 896);
            String strM84113a4 = cVar.getPaginatedRecords().getNextToken();
            viewState = cVar;
            boolean zM87157i8 = c28655q.m87157i(viewState);
            if ((i19 & 896) == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = zM87157i8 | z16;
            objM87133R3 = c28655q.m87133R();
            if (z17) {
                function12 = function10;
                objM87133R3 = new C29793c(viewState, function12, 7);
                c28655q.m87172p0(objM87133R3);
            } else {
                function12 = function10;
                objM87133R3 = new C29793c(viewState, function12, 7);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC15689q.m44140h(c26068uM77569a4, 0, strM84113a4, (Function1) objM87133R3, c28655q, 0, 1);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            if (viewState.getIsLoadingMore()) {
                c28655q.m87150e0(-957231415);
                m92637r(C1100b.f4583a, c28655q, 6);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-957191053);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            function5 = function16;
            function6 = function12;
        } else {
            c28655q.m87138X();
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30179a(viewState, function5, function6, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m92640u(AbstractC26596a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m92641v(AbstractC27868c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m92642w(Function1 function1) {
        function1.invoke(AbstractC26596a.a.f105795a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m92643x(AbstractC27870e.c cVar, Function1 function1) {
        C9598e c9598eM106629a = cVar.getNavigationBar().getNavigationRightDestination();
        if (c9598eM106629a != null) {
            function1.invoke(new AbstractC26596a.b(c9598eM106629a));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m92644y(AbstractC27870e.c cVar, Function1 function1, boolean z4) {
        String strM84113a;
        if (z4 && (strM84113a = cVar.getPaginatedRecords().getNextToken()) != null) {
            function1.invoke(new AbstractC27868c.b(strM84113a));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m92645z(AbstractC27870e.c cVar, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m92639t(cVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
