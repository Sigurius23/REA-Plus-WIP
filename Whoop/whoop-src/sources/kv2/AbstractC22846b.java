package kv2;

import am2.C1023i0;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import b91.AbstractC2890e;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import bg0.C3226h;
import bm0.C3412o;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weightlifting.StrengthTrainerDestination;
import eu2.AbstractC13653j;
import ge3.AbstractC15751g;
import gy0.AbstractC16277f;
import gz0.AbstractC16319p0;
import hu1.C17649f;
import hy0.AbstractC17755i2;
import ih0.AbstractC18489d0;
import j11.C21214q;
import java.util.Iterator;
import java.util.List;
import jf3.C21647a;
import jp1.C21851c;
import jp1.C21860l;
import jv2.C21971b;
import jv2.C21974e;
import jv2.InterfaceC21970a;
import jv2.InterfaceC21972c;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kl2.C22571f;
import km2.C22594e;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import mh.C25540h;
import nf3.C26669a;
import o11.AbstractC27407m;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p114eb.C12991u0;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p249jc.AbstractC21598x;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23004v;
import p315m0.AbstractC24868a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.C39102j;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p720m91.AbstractC25303l;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p736sz0.C33210q;
import pf.AbstractC29125c;
import pf3.C29155a;
import ph.C29227a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import x81.C38072d;
import xf3.C38266c;

/* JADX INFO: renamed from: kv2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00102\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0016\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u0019\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00182\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bH\u0003¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination$i$a;", "navArgs", "Leb/u0;", "navController", "", "isExerciseDetailsV2ExperimentEnabled", "Ll83/a0;", "E", "(Lcom/whoop/weightlifting/StrengthTrainerDestination$i$a;Leb/u0;ZLandroidx/compose/runtime/Composer;II)V", "Ljv2/c;", "viewState", "Lkotlin/Function1;", "Ljv2/a;", "onEvent", "C", "(Ljv2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ljv2/c$b;", "s", "(Ljv2/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "Ljv2/e;", "metaDataList", "J", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "Ljv2/c$a;", "p", "(Ljv2/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ljv2/b;", "viewModel", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22846b {

    /* JADX INFO: renamed from: kv2.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function3 {

        /* JADX INFO: renamed from: w */
        public static final a f90061w = new a();

        /* JADX INFO: renamed from: a */
        public final Modifier m66276a(AbstractC27407m.c.a it, Composer composer, int i13) {
            AbstractC22676k.m65750j(it, "it");
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-116153628);
            float f13 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, ((float) 1.5d) * f13, 7), ((float) 2.5d) * f13, 0.0f, 2);
            c28655q.m87173q(false);
            return modifierM3396r;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m66276a((AbstractC27407m.c.a) obj, (Composer) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: kv2.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f90062w;

        public b(Function1 function1) {
            this.f90062w = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m66277a(Object it) {
            AbstractC22676k.m65750j(it, "it");
            if (it instanceof InterfaceC21970a) {
                this.f90062w.invoke(it);
            }
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m66277a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kv2.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f90063w = new c();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(AbstractC27407m.c.a aVar) {
            return null;
        }
    }

    /* JADX INFO: renamed from: kv2.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f90064w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f90065x;

        public d(Function1 function1, List list) {
            this.f90064w = function1;
            this.f90065x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m66279a(int i13) {
            return this.f90064w.invoke(this.f90065x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m66279a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: kv2.b$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f90066w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f90067x;

        public e(List list, Function1 function1) {
            this.f90066w = list;
            this.f90067x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m66280a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            AbstractC27407m.c.a aVar = (AbstractC27407m.c.a) this.f90066w.get(i13);
            c28655q.m87150e0(-591730197);
            a aVar2 = a.f90061w;
            boolean zM87153g = c28655q.m87153g(this.f90067x);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new b(this.f90067x);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(aVar, null, aVar2, (Function1) objM87133R, c28655q, AbstractC27407m.c.a.f110299H, 2);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m66280a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kv2.b$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f90068w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f90069x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f90070y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f90071z;

        /* JADX INFO: renamed from: kv2.b$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f90072w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C21647a c21647a) {
                super(0);
                this.f90072w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f90072w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f90068w = c38266c;
            this.f90069x = interfaceC35951a;
            this.f90070y = interfaceC4339a;
            this.f90071z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, jv2.b] */
        @Override // c93.InterfaceC4339a
        public final C21971b invoke() {
            return AbstractC21598x.m60668X(this.f90068w, this.f90069x, new a(this.f90071z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21971b.class), null, this.f90070y);
        }
    }

    /* JADX INFO: renamed from: kv2.b$g */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.details.view.WorkoutDetailsScreenKt$WorkoutDetailsScreen$1$1", m100430f = "WorkoutDetailsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f90073w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ StrengthTrainerDestination.C10746i.a f90074x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC23462h f90075y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(StrengthTrainerDestination.C10746i.a aVar, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f90074x = aVar;
            this.f90075y = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f90074x, this.f90075y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f90073w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC22846b.m66243F(this.f90075y).m62715n(new InterfaceC21970a.b(this.f90074x.getWorkoutTemplateId()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m66238A(Function1 function1) {
        function1.invoke(InterfaceC21970a.c.f85046a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m66239B(InterfaceC21972c.b bVar, Function1 function1, int i13, Composer composer, int i14) {
        m66268s(bVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    public static final void m66240C(InterfaceC21972c viewState, Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-736888594);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (viewState instanceof InterfaceC21972c.a) {
            c28655q.m87150e0(-1070068740);
            m66265p((InterfaceC21972c.a) viewState, onEvent, c28655q, i14 & 126);
            c28655q.m87173q(false);
        } else {
            if (!(viewState instanceof InterfaceC21972c.b)) {
                throw AbstractC11895b.m32003v(519668828, c28655q, false);
            }
            c28655q.m87150e0(-1069935812);
            m66268s((InterfaceC21972c.b) viewState, onEvent, c28655q, i14 & 126);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22571f(viewState, onEvent, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m66241D(InterfaceC21972c interfaceC21972c, Function1 function1, int i13, Composer composer, int i14) {
        m66240C(interfaceC21972c, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x009a  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:53:0x0106  */
    /* JADX WARN: Code duplicated, block: B:54:0x0108  */
    /* JADX WARN: Code duplicated, block: B:58:0x0112  */
    /* JADX WARN: Code duplicated, block: B:60:0x0123  */
    /* JADX WARN: Code duplicated, block: B:62:0x012b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0135  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: E */
    public static final void m66242E(StrengthTrainerDestination.C10746i.a navArgs, C12991u0 navController, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        boolean z14;
        boolean z15;
        C28677v1 c28677v1M87180u;
        boolean z16;
        C26669a c26669a;
        C38266c c38266c;
        C21647a c21647aM114690r;
        boolean zM87153g;
        Object objM87133R;
        InterfaceC23462h interfaceC23462h;
        boolean z17;
        boolean z18;
        Object objM87133R2;
        boolean z19;
        boolean z24;
        Object objM87133R3;
        AbstractC22676k.m65750j(navArgs, "navArgs");
        AbstractC22676k.m65750j(navController, "navController");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-596549121);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(navArgs) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(navController) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                c28655q.m87152f0(-1688186518);
                c26669a = C29155a.f118017b;
                if (c26669a != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c = c26669a.f106046a.f159364d;
                c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
                zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new f(c38266c, null, null, c21647aM114690r));
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                interfaceC23462h = (InterfaceC23462h) objM87133R;
                c28655q.m87173q(false);
                InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m66243F(interfaceC23462h).getViewState(), InterfaceC21972c.a.INSTANCE.m62725a(), null, c28655q, 0, 2);
                C21971b c21971bM66243F = m66243F(interfaceC23462h);
                boolean zM87157i = c28655q.m87157i(interfaceC23462h);
                if ((i15 & 14) == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z17 | zM87157i;
                objM87133R2 = c28655q.m87133R();
                if (z18 || objM87133R2 == c28676v0) {
                    objM87133R2 = new g(navArgs, interfaceC23462h, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c21971bM66243F);
                InterfaceC21972c interfaceC21972cM66244G = m66244G(interfaceC28601c1M87260n);
                boolean zM87157i2 = c28655q.m87157i(navController) | c28655q.m87157i(interfaceC23462h);
                if ((i15 & 896) == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = z19 | zM87157i2;
                objM87133R3 = c28655q.m87133R();
                if (z24 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C1023i0(navController, z16, interfaceC23462h, 9);
                    c28655q.m87172p0(objM87133R3);
                }
                m66240C(interfaceC21972cM66244G, (Function1) objM87133R3, c28655q, 0);
                z15 = z16;
            } else {
                c28655q.m87138X();
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(navArgs, navController, z15, i13, i14, 14);
            }
        }
        i15 |= 384;
        z13 = z4;
        if ((i15 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i16 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            c28655q.m87152f0(-1688186518);
            c26669a = C29155a.f118017b;
            if (c26669a != null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            c38266c = c26669a.f106046a.f159364d;
            c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
            zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87153g) {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new f(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new f(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            interfaceC23462h = (InterfaceC23462h) objM87133R;
            c28655q.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(m66243F(interfaceC23462h).getViewState(), InterfaceC21972c.a.INSTANCE.m62725a(), null, c28655q, 0, 2);
            C21971b c21971bM66243F2 = m66243F(interfaceC23462h);
            boolean zM87157i3 = c28655q.m87157i(interfaceC23462h);
            if ((i15 & 14) == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z17 | zM87157i3;
            objM87133R2 = c28655q.m87133R();
            if (z18) {
                objM87133R2 = new g(navArgs, interfaceC23462h, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new g(navArgs, interfaceC23462h, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c21971bM66243F2);
            InterfaceC21972c interfaceC21972cM66244G2 = m66244G(interfaceC28601c1M87260n2);
            boolean zM87157i4 = c28655q.m87157i(navController) | c28655q.m87157i(interfaceC23462h);
            if ((i15 & 896) == 256) {
                z19 = true;
            } else {
                z19 = false;
            }
            z24 = z19 | zM87157i4;
            objM87133R3 = c28655q.m87133R();
            if (z24) {
                objM87133R3 = new C1023i0(navController, z16, interfaceC23462h, 9);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C1023i0(navController, z16, interfaceC23462h, 9);
                c28655q.m87172p0(objM87133R3);
            }
            m66240C(interfaceC21972cM66244G2, (Function1) objM87133R3, c28655q, 0);
            z15 = z16;
        } else {
            c28655q.m87138X();
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(navArgs, navController, z15, i13, i14, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C21971b m66243F(InterfaceC23462h interfaceC23462h) {
        return (C21971b) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: G */
    private static final InterfaceC21972c m66244G(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC21972c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m66245H(C12991u0 c12991u0, boolean z4, InterfaceC23462h interfaceC23462h, InterfaceC21970a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(InterfaceC21970a.a.f85044a)) {
            c12991u0.m36410z();
        } else if (event instanceof InterfaceC21970a.e) {
            m66243F(interfaceC23462h).m62715n((InterfaceC21970a.e) event);
        } else if (event instanceof InterfaceC21970a.d) {
            StrengthTrainerDestination.C10742e.m28080p(StrengthTrainerDestination.C10742e.f32774a, c12991u0, ((InterfaceC21970a.d) event).getWorkoutTemplateId(), false, null, null, z4, 12, null);
        } else {
            if (!(event instanceof InterfaceC21970a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            StrengthTrainerDestination.C10741d.m28056n(StrengthTrainerDestination.C10741d.f32764a, c12991u0, 0L, null, null, false, false, null, 59, null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m66246I(StrengthTrainerDestination.C10746i.a aVar, C12991u0 c12991u0, boolean z4, int i13, int i14, Composer composer, int i15) {
        m66242E(aVar, c12991u0, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    public static final void m66247J(List<C21974e> metaDataList, Composer composer, int i13) {
        C28655q c28655q;
        AbstractC22676k.m65750j(metaDataList, "metaDataList");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1519072457);
        int i14 = 4;
        int i15 = (i13 & 6) == 0 ? i13 | (c28655q2.m87157i(metaDataList) ? 4 : 2) : i13;
        boolean z4 = false;
        boolean z13 = true;
        if (c28655q2.m87135U(i15 & 1, (i15 & 3) != 2)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            c28655q2.m87150e0(2045514018);
            for (C21974e c21974e : metaDataList) {
                String strM62745a = c21974e.getPropertyName();
                C38072d c38072d = C38072d.f163053a;
                int i16 = C38072d.f163054b;
                C2886a c2886aM8438s = c38072d.m121952e(c28655q2, i16).getH5();
                long jM125430y = c38072d.m121949b(c28655q2, i16).getBrandWhite();
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, ((float) 0.5d) * 8, 7);
                int i17 = C2886a.f11498d << 18;
                int i18 = i14;
                C28655q c28655q3 = c28655q2;
                AbstractC30795n.m94707h(strM62745a, modifierM3398t, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s, null, c28655q3, 48, i17, 196600);
                AbstractC30795n.m94707h(c21974e.getPropertyValue(), null, c38072d.m121949b(c28655q3, i16).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i16).getB2(), null, c28655q3, 0, i17, 196602);
                c2314t = c2314t;
                AbstractC18489d0.m53380u(6, i18, c2314t, c28655q3);
                z4 = false;
                z13 = true;
                i14 = i18;
                c28655q2 = c28655q3;
            }
            c28655q = c28655q2;
            c28655q.m87173q(z4);
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3412o(metaDataList, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m66248K(List list, int i13, Composer composer, int i14) {
        m66247J(list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m66265p(InterfaceC21972c.a aVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1088925459);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(aVar) : c28655q.m87157i(aVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            int i15 = i14;
            AbstractC33208p0 abstractC33208p0M62724i = aVar.getType();
            TextResource textResourceM62723h = aVar.getSupportText();
            TextResource textResourceM62722g = aVar.getPrimaryButtonText();
            boolean zM87157i = c28655q.m87157i(aVar) | ((i15 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C21214q(aVar, function1, 25);
                c28655q.m87172p0(objM87133R);
            }
            int i16 = AbstractC33208p0.f138461d;
            int i17 = TextResource.$stable;
            AbstractC33199m0.m105214F(abstractC33208p0M62724i, textResourceM62723h, null, textResourceM62722g, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, i16 | (i17 << 3) | (i17 << 9), 0, 4068);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22571f(aVar, function1, i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m66266q(InterfaceC21972c.a aVar, Function1 function1) {
        InterfaceC21970a interfaceC21970aM62721f = aVar.getButtonClickEvent();
        if (interfaceC21970aM62721f != null) {
            function1.invoke(interfaceC21970aM62721f);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m66267r(InterfaceC21972c.a aVar, Function1 function1, int i13, Composer composer, int i14) {
        m66265p(aVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0182  */
    /* JADX WARN: Code duplicated, block: B:62:0x018e  */
    /* JADX INFO: renamed from: s */
    private static final void m66268s(InterfaceC21972c.b bVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28676v0 c28676v0;
        boolean z4;
        Object objM87133R;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(671559122);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(bVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM94757f = AbstractC30802r.m94757f(c2314t, 1.0f);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM94757f);
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
            AbstractC6721d.a aVar = new AbstractC6721d.a(bVar.getToolbarTitle(), null, Integer.valueOf(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1 * 8, 7);
            int i15 = i14 & 112;
            boolean z13 = i15 == 32;
            Object objM87133R2 = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (z13 || objM87133R2 == c28676v1) {
                objM87133R2 = new C21860l(function1, 27);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC6719b.m20143d(modifierM3398t, aVar, null, (InterfaceC4339a) objM87133R2, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            boolean zM87157i = c28655q.m87157i(bVar) | (i15 == 32);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i) {
                c28676v0 = c28676v1;
            } else {
                c28676v0 = c28676v1;
                if (objM87133R3 == c28676v0) {
                }
                C28676v0 c28676v2 = c28676v0;
                AbstractC22674j.m65717c(layoutWeightElement, null, null, null, null, null, false, null, (Function1) objM87133R3, c28655q, 0, 510);
                String strM21274h = AbstractC8693b.m21274h(bVar.getScreenCtaText(), c28655q, TextResource.$stable);
                z4 = i15 == 32;
                objM87133R = c28655q.m87133R();
                if (z4 || objM87133R == c28676v2) {
                    objM87133R = new C21860l(function1, 26);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC13653j.m38495g(null, strM21274h, false, null, false, false, (InterfaceC4339a) objM87133R, c28655q, 0, 61);
                c28655q = c28655q;
                c28655q.m87173q(true);
            }
            objM87133R3 = new C21851c(14, bVar, function1);
            c28655q.m87172p0(objM87133R3);
            C28676v0 c28676v3 = c28676v0;
            AbstractC22674j.m65717c(layoutWeightElement, null, null, null, null, null, false, null, (Function1) objM87133R3, c28655q, 0, 510);
            String strM21274h2 = AbstractC8693b.m21274h(bVar.getScreenCtaText(), c28655q, TextResource.$stable);
            if (i15 == 32) {
            }
            objM87133R = c28655q.m87133R();
            if (z4) {
                objM87133R = new C21860l(function1, 26);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C21860l(function1, 26);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC13653j.m38495g(null, strM21274h2, false, null, false, false, (InterfaceC4339a) objM87133R, c28655q, 0, 61);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22571f(bVar, function1, i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m66269t(Function1 function1) {
        function1.invoke(InterfaceC21970a.a.f85044a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m66270u(InterfaceC21972c.b bVar, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C22845a(bVar, 0), true, -1112150361), 3);
        List<AbstractC27407m.c.a> listM62730c = bVar.m62730c();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM62730c.size(), null, new d(c.f90063w, listM62730c), new C37816b(new e(listM62730c, function1), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m66271v(InterfaceC21972c.b bVar, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC22953f.m66714a(null, null, false, AbstractC37817c.m121344e(1679220497, c28655q, new C22845a(bVar, 1)), c28655q, 3072, 7);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m66272w(InterfaceC21972c.b bVar, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C28674u2 c28674u2 = AbstractC2453v1.f9569h;
            C1101c c1101c = (C1101c) BoxWithConstraints;
            int iMo743q0 = (int) ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(c1101c.m3403d());
            int iMo743q1 = (int) ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(c1101c.m3402c());
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C22594e(9);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3486a = AbstractC1127a.m3486a(modifierM3407d, (Function1) objM87133R);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C22594e(10);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3480c = AbstractC1125a.m3480c(modifierM3486a, (Function1) objM87133R2);
            AbstractC22403o abstractC22403oM62732e = bVar.getScreenBackgroundImage();
            boolean zM87149e = c28655q.m87149e(iMo743q0) | c28655q.m87149e(iMo743q1);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87149e || objM87133R3 == c28676v0) {
                objM87133R3 = new C17649f(iMo743q0, iMo743q1, 1);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM62732e, null, (Function1) objM87133R3, c28655q, AbstractC22403o.f87638a, 1), null, modifierM3480c, null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
            float f13 = 8;
            float f14 = ((float) 2.5d) * f13;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f15 = 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(50 * f15, c2314t));
            TextResource textResourceM62735h = bVar.getScreenTitle();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM62735h, c28655q, i15);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i16).getBrandWhite();
            C2886a c2886aM8416N = AbstractC2890e.m8450e().getT1();
            C36775k c36775k = new C36775k(5);
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8416N, null, c28655q, 0, i17, 196090);
            float f16 = 1;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16 * f15, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(bVar.getScreenSubTitle(), c28655q, i15), null, c38072d.m121949b(c28655q, i16).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getB2(), null, c28655q, 0, i17, 196090);
            float f17 = 6 * f15;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f17, c2314t));
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            float f18 = f15 * f13;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f18), C2299e.f9107J, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            c28655q.m87150e0(659697398);
            Iterator<C33210q> it = bVar.m62731d().iterator();
            while (it.hasNext()) {
                AbstractC25303l.m74291r(it.next(), null, null, null, c28655q, C33210q.f138488m, 14);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18, c2314t));
            TextResource textResourceM62728a = bVar.getDescription();
            int i18 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM62728a, c28655q, i18);
            C38072d c38072d2 = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h2, null, c38072d2.m121949b(c28655q, i19).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196090);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f17, c2314t));
            AbstractC15751g.m44449b(AbstractC1102d.m3409f(1.0f, new HorizontalAlignElement(C2299e.f9111N)), c38072d2.m121949b(c28655q, i19).getWhite10(), f16, 0.0f, c28655q, 384, 8);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f17, c2314t));
            m66247J(bVar.m62737j(), c28655q, 0);
            AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, f16 * f13, 0.0f, f14, 5), null, null, bVar.getExerciseListTitle(), null, 0L, 0L, null, c28655q, (i18 << 9) | 6, 246);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m66273x(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51551a(0.99f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m66274y(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        List listM118959K = AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(C17919x.f69625b));
        ((C0238p0) drawWithContent).m728a();
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51493k(AbstractC17911t.f69612b, listM118959K, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, 8, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m66275z(int i13, int i14, C25540h rememberImagePainter) {
        AbstractC22676k.m65750j(rememberImagePainter, "$this$rememberImagePainter");
        rememberImagePainter.m75120d(i13, i14);
        rememberImagePainter.f100086j = new C29227a(0, 3);
        return C23454a0.f92919a;
    }
}
