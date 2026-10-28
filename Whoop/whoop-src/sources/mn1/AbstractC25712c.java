package mn1;

import am0.C0998b;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e41.C12704i;
import e41.C12707l;
import ec3.C13084s1;
import ec3.InterfaceC13062m;
import hb3.AbstractC17104a0;
import hy0.AbstractC17755i2;
import java.util.List;
import jn1.AbstractC21803b;
import jn1.AbstractC21805d;
import k71.C22252i;
import kl2.C22571f;
import kw1.C22852c;
import l83.C23454a0;
import l83.InterfaceC23459e;
import ln1.C24530h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11352g;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC23001u;
import p329n0.C26053f;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p411q2.InterfaceC29805a;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p668z1.C39967p;
import p710im1.C18709z0;
import p711j31.AbstractC21270a;
import p711j31.AbstractC21275f;
import p711j31.AbstractC21277h;
import p711j31.C21273d;
import p711j31.C21280k;
import p711j31.Function2;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p719m22.C24947b;
import p720m91.AbstractC25303l;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;
import z51.AbstractC40098i;

/* JADX INFO: renamed from: mn1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a=\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b²\u0006\f\u0010\u001a\u001a\u00020\u00198\nX\u008a\u0084\u0002"}, m65681d2 = {"Ljn1/d$c;", "viewState", "Ln0/u;", "listState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Ljn1/b;", "Ll83/a0;", "onViewEvent", "o", "(Ljn1/d$c;Ln0/u;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lj31/k;", "reorderableListState", "y", "(Lj31/k;Landroidx/compose/runtime/Composer;I)V", "T", "", "Lz1/p;", "B", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Lz1/p;", "", "shouldShowErrorText", "l", "(Ljn1/d$c;ZLandroidx/compose/runtime/Composer;I)V", "", "scaleFactor", "home-customization_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25712c {

    /* JADX INFO: renamed from: mn1.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f101264w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ int f101265x;

        public a(Function1 function1, int i13) {
            this.f101264w = function1;
            this.f101265x = i13;
        }

        /* JADX INFO: renamed from: a */
        public final void m75742a(Object event) {
            AbstractC22676k.m65750j(event, "event");
            if (event instanceof C12707l) {
                this.f101264w.invoke(new AbstractC21803b.f(this.f101265x, ((C12707l) event).getIsEnabled()));
            }
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m75742a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mn1.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12704i f101266w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f101267x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f101268y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21280k f101269z;

        /* JADX INFO: renamed from: mn1.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Function3 {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21280k f101270w;

            public a(C21280k c21280k) {
                this.f101270w = c21280k;
            }

            /* JADX INFO: renamed from: a */
            public final Modifier m75744a(C12704i unused$var$, Composer composer, int i13) {
                AbstractC22676k.m65750j(unused$var$, "$unused$var$");
                C28655q c28655q = (C28655q) composer;
                c28655q.m87150e0(2001301660);
                Modifier modifierM59681a = AbstractC21270a.m59681a(C2314t.f9131w, this.f101270w);
                c28655q.m87173q(false);
                return modifierM59681a;
            }

            @Override // p715kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return m75744a((C12704i) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        }

        /* JADX INFO: renamed from: mn1.c$b$b, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42014b implements Function1 {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ Function1 f101271w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ int f101272x;

            public C42014b(Function1 function1, int i13) {
                this.f101271w = function1;
                this.f101272x = i13;
            }

            /* JADX INFO: renamed from: a */
            public final void m75745a(Object it) {
                AbstractC22676k.m65750j(it, "it");
                this.f101271w.invoke(new AbstractC21803b.d(this.f101272x));
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m75745a(obj);
                return C23454a0.f92919a;
            }
        }

        public b(C12704i c12704i, Function1 function1, int i13, C21280k c21280k) {
            this.f101266w = c12704i;
            this.f101267x = function1;
            this.f101268y = i13;
            this.f101269z = c21280k;
        }

        /* JADX INFO: renamed from: a */
        public final void m75743a(InterfaceC23001u ReorderableItem, boolean z4, Composer composer, int i13) {
            AbstractC22676k.m65750j(ReorderableItem, "$this$ReorderableItem");
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 129) != 128)) {
                c28655q.m87138X();
                return;
            }
            C12704i c12704i = this.f101266w;
            a aVar = new a(this.f101269z);
            boolean zM87153g = c28655q.m87153g(this.f101267x) | c28655q.m87149e(this.f101268y);
            Function1 function1 = this.f101267x;
            int i14 = this.f101268y;
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C42014b(function1, i14);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(c12704i, null, aVar, (Function1) objM87133R, c28655q, C12704i.f43436m, 2);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m75743a((InterfaceC23001u) obj, ((Boolean) obj2).booleanValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mn1.c$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f101273w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ int f101274x;

        public c(Function1 function1, int i13) {
            this.f101273w = function1;
            this.f101274x = i13;
        }

        /* JADX INFO: renamed from: a */
        public final void m75746a(Object it) {
            AbstractC22676k.m65750j(it, "it");
            this.f101273w.invoke(new AbstractC21803b.a(this.f101274x));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m75746a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mn1.c$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f101275w;

        public d(List list) {
            this.f101275w = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m75747a(int i13) {
            this.f101275w.get(i13);
            return null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m75747a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: mn1.c$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f101276w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f101277x;

        public e(List list, Function1 function1) {
            this.f101276w = list;
            this.f101277x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m75748a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            boolean z4 = true;
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C12704i c12704i = (C12704i) this.f101276w.get(i13);
            c28655q.m87150e0(532659719);
            boolean zM87153g = c28655q.m87153g(this.f101277x);
            if ((((i15 & 112) ^ 48) <= 32 || !c28655q.m87149e(i13)) && (i15 & 48) != 32) {
                z4 = false;
            }
            boolean z13 = zM87153g | z4;
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new a(this.f101277x, i13);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(c12704i, null, null, (Function1) objM87133R, c28655q, C12704i.f43436m, 6);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m75748a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mn1.c$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC4351m f101278w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f101279x;

        public f(InterfaceC4351m interfaceC4351m, List list) {
            this.f101278w = interfaceC4351m;
            this.f101279x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m75749a(int i13) {
            return this.f101278w.invoke(Integer.valueOf(i13), this.f101279x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m75749a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: mn1.c$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f101280w;

        public g(List list) {
            this.f101280w = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m75750a(int i13) {
            this.f101280w.get(i13);
            return null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m75750a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: mn1.c$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f101281w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21280k f101282x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f101283y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f101284z;

        public h(List list, C21280k c21280k, int i13, Function1 function1) {
            this.f101281w = list;
            this.f101282x = c21280k;
            this.f101283y = i13;
            this.f101284z = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m75751a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = i14 | (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2);
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
            C12704i c12704i = (C12704i) this.f101281w.get(i13);
            c28655q.m87150e0(-1520530502);
            InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(AbstractC22676k.m65745e(this.f101282x.m59778v(), c12704i.getId()) ? 0.95f : 1.0f, null, null, null, c28655q, 0, 30);
            AbstractC21275f.m59698e(interfaceC1103a, this.f101282x, c12704i.getId(), AbstractC12350b.m34565N(AbstractC25712c.m75737v(interfaceC28670t2M30588b), C2314t.f9131w), Integer.valueOf(this.f101283y + i13), false, AbstractC37817c.m121344e(-1679526113, c28655q, new b(c12704i, this.f101284z, i13, this.f101282x)), c28655q, (i15 & 14) | 1572864 | (C21280k.f81267t << 3), 16);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m75751a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mn1.c$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f101285w;

        public i(List list) {
            this.f101285w = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m75752a(int i13) {
            this.f101285w.get(i13);
            return null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m75752a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: mn1.c$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f101286w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f101287x;

        public j(List list, Function1 function1) {
            this.f101286w = list;
            this.f101287x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m75753a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            boolean z4 = true;
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C12704i c12704i = (C12704i) this.f101286w.get(i13);
            c28655q.m87150e0(-10531431);
            boolean zM87153g = c28655q.m87153g(this.f101287x);
            if ((((i15 & 112) ^ 48) <= 32 || !c28655q.m87149e(i13)) && (i15 & 48) != 32) {
                z4 = false;
            }
            boolean z13 = zM87153g | z4;
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new c(this.f101287x, i13);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(c12704i, null, null, (Function1) objM87133R, c28655q, C12704i.f43436m, 6);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m75753a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mn1.c$k */
    @InterfaceC32271e(m100429c = "com.whoop.homecustomization.view.legacy.DraggableKeyStatsKt$HandleReorderingUX$1$1", m100430f = "DraggableKeyStats.kt", m100431l = {150}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f101288w;

        /* JADX INFO: renamed from: x */
        int f101289x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C21280k f101290y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC29805a f101291z;

        /* JADX INFO: renamed from: mn1.c$k$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C22669g0 f101292w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC29805a f101293x;

            public a(C22669g0 c22669g0, InterfaceC29805a interfaceC29805a) {
                this.f101292w = c22669g0;
                this.f101293x = interfaceC29805a;
            }

            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (obj != null && this.f101292w.f89336w == null) {
                    this.f101293x.mo7428a(0);
                }
                this.f101292w.f89336w = obj;
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C21280k c21280k, InterfaceC29805a interfaceC29805a, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f101290y = c21280k;
            this.f101291z = interfaceC29805a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final Object m75755h(C21280k c21280k) {
            return c21280k.m59778v();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new k(this.f101290y, this.f101291z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f101289x;
            if (i13 == 0) {
                C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C25713d(this.f101290y, 0));
                a aVar = new a(c22669g0M32004w, this.f101291z);
                this.f101288w = null;
                this.f101289x = 1;
                if (c13084s1M87240H.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: mn1.c$l */
    @InterfaceC32271e(m100429c = "com.whoop.homecustomization.view.legacy.DraggableKeyStatsKt$cacheAsStateList$1$1", m100430f = "DraggableKeyStats.kt", m100431l = {170}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f101294w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28670t2 f101295x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C39967p f101296y;

        /* JADX INFO: renamed from: mn1.c$l$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C39967p f101297w;

            public a(C39967p c39967p) {
                this.f101297w = c39967p;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<? extends T> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f101297w.clear();
                this.f101297w.addAll(list);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC28670t2 interfaceC28670t2, C39967p c39967p, InterfaceC30057d<? super l> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f101295x = interfaceC28670t2;
            this.f101296y = c39967p;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final List m75757h(InterfaceC28670t2 interfaceC28670t2) {
            return (List) interfaceC28670t2.getValue();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new l(this.f101295x, this.f101296y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f101294w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C25713d(this.f101295x, 1));
                a aVar = new a(this.f101296y);
                this.f101294w = 1;
                if (c13084s1M87240H.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: B */
    private static final <T> C39967p m75715B(List<? extends T> list, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = AbstractC28683x.m87242J(list);
            c28655q.m87172p0(objM87133R);
        }
        C39967p c39967p = (C39967p) objM87133R;
        InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(list, c28655q);
        boolean zM87153g = c28655q.m87153g(interfaceC28601c1M87238F);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g || objM87133R2 == c28676v0) {
            objM87133R2 = new l(interfaceC28601c1M87238F, c39967p, null);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, interfaceC28601c1M87238F);
        return c39967p;
    }

    /* JADX INFO: renamed from: l */
    public static final void m75727l(AbstractC21805d.c viewState, boolean z4, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-618088482);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            TextResource textResourceM61705a = viewState.getGaugeExplainerViewState().getFirstChosenStat();
            TextResource textResourceM61706b = viewState.getGaugeExplainerViewState().getSecondChosenStat();
            int i15 = TextResource.$stable;
            AbstractC40098i.m128599e(textResourceM61705a, textResourceM61706b, c28655q, i15 | (i15 << 3));
            float f13 = 8;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(((float) 2.5d) * f13, c2314t));
            String strM21268b = AbstractC8693b.m21268b(viewState.getDescription());
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21268b, null, c38072d.m121949b(c28655q, i16).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196090);
            AbstractC1090b.m3350e(C23016z.f90757a, z4, null, AbstractC3788w0.m11576d(null, null, 13).m11562a(AbstractC3788w0.m11577e(null, 1)), null, null, AbstractC37817c.m121344e(649065552, c28655q, new C25711b(viewState, 3)), c28655q, (i14 & 112) | 1575942, 26);
            AbstractC31061c.m95650z((float) 3.5d, f13, c2314t, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0998b(viewState, z4, i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m75728m(AbstractC21805d.c cVar, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer, 0);
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, c2314t);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer, C0217k.f729g, c23010xM66775a);
        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
        AbstractC22953f.m66715b(composer, AbstractC1102d.m3419p(1 * 4, c2314t));
        String strM21268b = AbstractC8693b.m21268b(cVar.getErrorMessage());
        C38072d c38072d = C38072d.f163053a;
        int i14 = C38072d.f163054b;
        AbstractC30795n.m94707h(strM21268b, null, c38072d.m121949b(composer, i14).getAccentNegativeTrend(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(composer, i14).getB1(), null, composer, 0, C2886a.f11498d << 18, 196602);
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m75729n(AbstractC21805d.c cVar, boolean z4, int i13, Composer composer, int i14) {
        m75727l(cVar, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:58:0x011f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0122  */
    /* JADX WARN: Code duplicated, block: B:63:0x013d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:68:0x0172  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: o */
    public static final void m75730o(AbstractC21805d.c viewState, C26068u listState, Modifier modifier, Function1 onViewEvent, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        List<C12704i> listM61728g;
        C39967p c39967pM75715B;
        int size;
        InterfaceC28601c1 interfaceC28601c1M87238F;
        int i16;
        boolean z13;
        boolean z14;
        Object objM87133R;
        boolean zM87149e;
        Object objM87133R2;
        C21280k c21280kM59746a;
        boolean z15;
        boolean zM87153g;
        Object objM87133R3;
        int i17;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(listState, "listState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-203203176);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(listState) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(onViewEvent)) {
                    i17 = 2048;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                List<C12704i> listM61722a = viewState.m61722a();
                listM61728g = viewState.m61728g();
                c39967pM75715B = m75715B(listM61722a, c28655q, 0);
                size = 2 + listM61728g.size();
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(c39967pM75715B, c28655q);
                boolean zM87153g2 = c28655q.m87153g(c39967pM75715B) | c28655q.m87149e(size);
                i16 = i15 & 7168;
                if (i16 == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87153g2 | z13;
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z14 || objM87133R == c28676v0) {
                    objM87133R = new C22571f(size, onViewEvent, c39967pM75715B);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R;
                zM87149e = c28655q.m87149e(size) | c28655q.m87153g(interfaceC28601c1M87238F);
                objM87133R2 = c28655q.m87133R();
                if (zM87149e || objM87133R2 == c28676v0) {
                    objM87133R2 = new C22252i(size, interfaceC28601c1M87238F);
                    c28655q.m87172p0(objM87133R2);
                }
                c21280kM59746a = Function2.m59746a(interfaceC4351m, listState, (InterfaceC4351m) objM87133R2, null, 0.0f, null, c28655q, i15 & 112, 56);
                m75740y(c21280kM59746a, c28655q, C21280k.f81267t);
                C26068u listState2 = c21280kM59746a.getListState();
                Modifier modifierM59705b = AbstractC21277h.m59705b(modifier4, c21280kM59746a);
                C22971k c22971kM66746i = AbstractC22977m.m66746i(((float) 1.5d) * 8);
                boolean zM87157i = c28655q.m87157i(viewState) | c28655q.m87157i(listM61728g);
                if (i16 == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87153g = zM87157i | z15 | c28655q.m87153g(c39967pM75715B) | c28655q.m87157i(c21280kM59746a) | c28655q.m87149e(size);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g || objM87133R3 == c28676v0) {
                    C18709z0 c18709z0 = new C18709z0(listM61728g, c39967pM75715B, viewState, onViewEvent, c21280kM59746a, size);
                    c28655q.m87172p0(c18709z0);
                    objM87133R3 = c18709z0;
                }
                AbstractC22674j.m65717c(modifierM59705b, listState2, null, c22971kM66746i, null, null, false, null, (Function1) objM87133R3, c28655q, 24576, 492);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c((Object) viewState, (Object) listState, (Object) modifier3, (InterfaceC23459e) onViewEvent, i13, i14, 15);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(onViewEvent)) {
                i17 = 2048;
            } else {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i17;
        }
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i18 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            List<C12704i> listM61722a2 = viewState.m61722a();
            listM61728g = viewState.m61728g();
            c39967pM75715B = m75715B(listM61722a2, c28655q, 0);
            size = 2 + listM61728g.size();
            interfaceC28601c1M87238F = AbstractC28683x.m87238F(c39967pM75715B, c28655q);
            boolean zM87153g3 = c28655q.m87153g(c39967pM75715B) | c28655q.m87149e(size);
            i16 = i15 & 7168;
            if (i16 == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zM87153g3 | z13;
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (z14) {
                objM87133R = new C22571f(size, onViewEvent, c39967pM75715B);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C22571f(size, onViewEvent, c39967pM75715B);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4351m interfaceC4351m2 = (InterfaceC4351m) objM87133R;
            zM87149e = c28655q.m87149e(size) | c28655q.m87153g(interfaceC28601c1M87238F);
            objM87133R2 = c28655q.m87133R();
            if (zM87149e) {
                objM87133R2 = new C22252i(size, interfaceC28601c1M87238F);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C22252i(size, interfaceC28601c1M87238F);
                c28655q.m87172p0(objM87133R2);
            }
            c21280kM59746a = Function2.m59746a(interfaceC4351m2, listState, (InterfaceC4351m) objM87133R2, null, 0.0f, null, c28655q, i15 & 112, 56);
            m75740y(c21280kM59746a, c28655q, C21280k.f81267t);
            C26068u listState3 = c21280kM59746a.getListState();
            Modifier modifierM59705b2 = AbstractC21277h.m59705b(modifier4, c21280kM59746a);
            C22971k c22971kM66746i2 = AbstractC22977m.m66746i(((float) 1.5d) * 8);
            boolean zM87157i2 = c28655q.m87157i(viewState) | c28655q.m87157i(listM61728g);
            if (i16 == 2048) {
                z15 = true;
            } else {
                z15 = false;
            }
            zM87153g = zM87157i2 | z15 | c28655q.m87153g(c39967pM75715B) | c28655q.m87157i(c21280kM59746a) | c28655q.m87149e(size);
            objM87133R3 = c28655q.m87133R();
            if (zM87153g) {
                C18709z0 c18709z1 = new C18709z0(listM61728g, c39967pM75715B, viewState, onViewEvent, c21280kM59746a, size);
                c28655q.m87172p0(c18709z1);
                objM87133R3 = c18709z1;
            } else {
                C18709z0 c18709z2 = new C18709z0(listM61728g, c39967pM75715B, viewState, onViewEvent, c21280kM59746a, size);
                c28655q.m87172p0(c18709z2);
                objM87133R3 = c18709z2;
            }
            AbstractC22674j.m65717c(modifierM59705b2, listState3, null, c22971kM66746i2, null, null, false, null, (Function1) objM87133R3, c28655q, 24576, 492);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22852c((Object) viewState, (Object) listState, (Object) modifier3, (InterfaceC23459e) onViewEvent, i13, i14, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m75731p(C39967p c39967p, int i13, Function1 function1, C21273d from, C21273d to3) {
        AbstractC22676k.m65750j(from, "from");
        AbstractC22676k.m65750j(to3, "to");
        c39967p.add(to3.m59692c() - i13, c39967p.remove(from.m59692c() - i13));
        function1.invoke(new AbstractC21803b.e(from.m59692c() - i13, to3.m59692c() - i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final boolean m75732q(int i13, InterfaceC28670t2 interfaceC28670t2, C21273d c21273d, C21273d c21273d2) {
        AbstractC22676k.m65750j(c21273d, "<destruct>");
        AbstractC22676k.m65750j(c21273d2, "<unused var>");
        int index = c21273d.getIndex();
        c21273d.getKey();
        return index + i13 <= ((C39967p) interfaceC28670t2.getValue()).size() + i13 && index >= i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m75733r(List list, C39967p c39967p, AbstractC21805d.c cVar, Function1 function1, C21280k c21280k, int i13, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C25711b(cVar, 0), true, 1043451939), 3);
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(list.size(), null, new d(list), new C37816b(new e(list, function1), true, 2039820996));
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C25711b(cVar, 1), true, 837427468), 3);
        c26053f.m77529r(c39967p.size(), new f(new C24947b(4), c39967p), new g(c39967p), new C37816b(new h(c39967p, c21280k, i13, function1), true, 2039820996));
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C25711b(cVar, 2), true, -1203247637), 3);
        List<C12704i> listM61729h = cVar.m61729h();
        c26053f.m77529r(listM61729h.size(), null, new i(listM61729h), new C37816b(new j(listM61729h, function1), true, 2039820996));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m75734s(AbstractC21805d.c cVar, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            m75727l(cVar, cVar.getShouldShowErrorText(), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m75735t(AbstractC21805d.c cVar, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC17755i2.m50938j(null, null, null, cVar.getPinnedKeyStatsHeader(), null, 0L, 0L, null, c28655q, TextResource.$stable << 9, 247);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final Object m75736u(int i13, C12704i tile) {
        AbstractC22676k.m65750j(tile, "tile");
        return tile.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final float m75737v(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m75738w(AbstractC21805d.c cVar, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC17755i2.m50938j(AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, ((float) 4.5d) * 8, 0.0f, 0.0f, 13), null, null, cVar.getUnpinnedKeyStatsHeader(), null, 0L, 0L, null, c28655q, (TextResource.$stable << 9) | 6, 246);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m75739x(AbstractC21805d.c cVar, C26068u c26068u, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m75730o(cVar, c26068u, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private static final void m75740y(C21280k c21280k, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1197943149);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c21280k) : c28655q.m87157i(c21280k) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        boolean z4 = false;
        int i15 = 1;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            InterfaceC29805a interfaceC29805a = (InterfaceC29805a) c28655q.m87161k(AbstractC2453v1.f9573l);
            if ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(c21280k))) {
                z4 = true;
            }
            boolean zM87157i = c28655q.m87157i(interfaceC29805a) | z4;
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new k(c21280k, interfaceC29805a, null);
                c28655q.m87172p0(objM87133R);
            }
            int i16 = C21280k.f81267t;
            AbstractC28683x.m87254h(c21280k, interfaceC29805a, (InterfaceC4351m) objM87133R, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24530h(c21280k, i13, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m75741z(C21280k c21280k, int i13, Composer composer, int i14) {
        m75740y(c21280k, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
