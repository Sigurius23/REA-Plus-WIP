package qk2;

import android.graphics.DashPathEffect;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1132b;
import androidx.compose.runtime.Composer;
import b91.AbstractC2890e;
import b91.C2886a;
import br2.C3565g;
import bu2.C3658s;
import c41.C4090p0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.google.crypto.tink.internal.C5101l0;
import com.whoop.data.local.room.dao.persistent.C6494e;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.C9814j;
import com.whoop.weeklyplan.api.WeeklyPlanApiKt;
import e61.C12769l;
import e93.AbstractC12889b;
import eg2.C13179l;
import fc0.C14362f;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import m83.C25272z;
import n21.C26193g;
import no.nordicsemi.android.dfu.DfuBaseService;
import ok2.C27995a;
import ok2.C27998d;
import ok2.C28004j;
import ok2.EnumC27997c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p108e4.AbstractC12686t;
import p108e4.C12671e;
import p108e4.C12672f;
import p108e4.C12677k;
import p108e4.C12679m;
import p108e4.C12680n;
import p108e4.C12684r;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17893k;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p209i3.AbstractC18032n;
import p209i3.InterfaceC18044z;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p571w3.C36775k;
import p581we.C37199o;
import p602x1.AbstractC37817c;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39125q1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39174f;
import p636y3.C39178j;
import p636y3.C39180l;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import pf.AbstractC29125c;
import qb0.C30179a;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: qk2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a/\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a)\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a1\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a!\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a!\u0010 \u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b \u0010!\u001a)\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b$\u0010%\u001a9\u0010+\u001a\u00020\n2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b+\u0010,¨\u0006.²\u0006\u000e\u0010-\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lok2/c;", "Lqk2/a;", "M", "(Lok2/c;)Lqk2/a;", "", "Lok2/a;", "bars", "style", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "v", "(Ljava/util/List;Lok2/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "state", "Ly3/f;", "chartHeight", "q", "(Lok2/a;Lok2/c;FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Li2/x;", "color", "Li2/a1;", "shape", "x", "(JLi2/a1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "fillFraction", "B", "(FJLi2/a1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "offsetXPx", "D", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "l", "(JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lok2/d;", WeeklyPlanApiKt.GOAL, "o", "(Lok2/d;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lok2/j;", "label", "Lb91/a;", "leadingStyle", "trailingStyle", "z", "(Lok2/j;JLb91/a;Lb91/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "columnWidthPx", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30446b {

    /* JADX INFO: renamed from: qk2.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f125088w = new a();

        /* JADX INFO: renamed from: a */
        public final void m93170a(C12671e constrainAs) {
            AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
            C5101l0 c5101l0 = constrainAs.f43330g;
            C12672f c12672f = constrainAs.f43326c;
            C5101l0.m16026X(c5101l0, c12672f.f43336g, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43327d, c12672f.f43333d, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43329f, c12672f.f43335f, 0.0f, 6);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m93170a((C12671e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qk2.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12672f f125089w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C30449e f125090x;

        public b(C12672f c12672f, C30449e c30449e) {
            this.f125089w = c12672f;
            this.f125090x = c30449e;
        }

        /* JADX INFO: renamed from: a */
        public final void m93171a(C12671e constrainAs) {
            AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
            C5101l0.m16026X(constrainAs.f43330g, this.f125089w.f43334e, this.f125090x.m93188d(), 4);
            C37199o c37199o = constrainAs.f43327d;
            C12672f c12672f = constrainAs.f43326c;
            C37199o.m119194J(c37199o, c12672f.f43333d, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43329f, c12672f.f43335f, 0.0f, 6);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m93171a((C12671e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qk2.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12672f f125091w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C30449e f125092x;

        public c(C12672f c12672f, C30449e c30449e) {
            this.f125091w = c12672f;
            this.f125092x = c30449e;
        }

        /* JADX INFO: renamed from: a */
        public final void m93172a(C12671e constrainAs) {
            AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
            C5101l0.m16026X(constrainAs.f43330g, this.f125091w.f43334e, this.f125092x.m93188d(), 4);
            C37199o c37199o = constrainAs.f43327d;
            C12672f c12672f = constrainAs.f43326c;
            C37199o.m119194J(c37199o, c12672f.f43333d, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43329f, c12672f.f43335f, 0.0f, 6);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m93172a((C12671e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qk2.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12672f f125093w;

        public d(C12672f c12672f) {
            this.f125093w = c12672f;
        }

        /* JADX INFO: renamed from: a */
        public final void m93173a(C12671e constrainAs) {
            AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
            C5101l0.m16026X(constrainAs.f43330g, this.f125093w.f43334e, 0.0f, 6);
            C37199o c37199o = constrainAs.f43327d;
            C12672f c12672f = constrainAs.f43326c;
            C37199o.m119194J(c37199o, c12672f.f43333d, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43329f, c12672f.f43335f, 0.0f, 6);
            constrainAs.m35473a(new C12680n("spread"));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m93173a((C12671e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qk2.b$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C12672f f125094E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C12672f f125095F;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C27998d f125096w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12672f f125097x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C30449e f125098y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f125099z;

        public e(C27998d c27998d, C12672f c12672f, C30449e c30449e, boolean z4, C12672f c12672f2, C12672f c12672f3) {
            this.f125096w = c27998d;
            this.f125097x = c12672f;
            this.f125098y = c30449e;
            this.f125099z = z4;
            this.f125094E = c12672f2;
            this.f125095F = c12672f3;
        }

        /* JADX INFO: renamed from: a */
        public final void m93174a(C12671e constrainAs) {
            AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
            C12672f c12672f = constrainAs.f43326c;
            C5101l0 c5101l0 = constrainAs.f43330g;
            if (this.f125096w.getShowDashes()) {
                C5101l0.m16026X(c5101l0, this.f125097x.f43334e, this.f125098y.m93189e(), 4);
            } else {
                C5101l0.m16026X(c5101l0, (this.f125099z ? this.f125094E : this.f125095F).f43334e, 0.0f, 6);
            }
            C37199o.m119194J(constrainAs.f43327d, c12672f.f43333d, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43329f, c12672f.f43335f, 0.0f, 6);
            constrainAs.m35473a(new C12680n("spread"));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m93174a((C12671e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qk2.b$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12672f f125100w;

        public f(C12672f c12672f) {
            this.f125100w = c12672f;
        }

        /* JADX INFO: renamed from: a */
        public final void m93175a(C12671e constrainAs) {
            AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
            C5101l0.m16026X(constrainAs.f43328e, this.f125100w.f43334e, 0.0f, 6);
            C5101l0.m16026X(constrainAs.f43330g, this.f125100w.f43336g, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43327d, constrainAs.f43326c.f43333d, 0.0f, 6);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m93175a((C12671e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qk2.b$g */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m65681d2 = {"Ly2/t0;", "", "Ly2/q0;", "measurables", "Ly3/a;", "constraints", "Ly2/s0;", "a", "(Ly2/t0;Ljava/util/List;J)Ly2/s0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g implements InterfaceC39127r0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC28601c1 f125101a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C12684r f125102b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C12679m f125103c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f125104d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InterfaceC28601c1 f125105e;

        /* JADX INFO: renamed from: qk2.b$g$a */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Ly2/i1;", "Ll83/a0;", "a", "(Ly2/i1;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC22680m implements Function1 {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C12684r f125106w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ List f125107x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C12684r c12684r, List list) {
                super(1);
                this.f125106w = c12684r;
                this.f125107x = list;
            }

            /* JADX INFO: renamed from: a */
            public final void m93176a(AbstractC39101i1 abstractC39101i1) {
                this.f125106w.m35489e(abstractC39101i1, this.f125107x);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m93176a((AbstractC39101i1) obj);
                return C23454a0.f92919a;
            }
        }

        public g(InterfaceC28601c1 interfaceC28601c1, C12684r c12684r, C12679m c12679m, int i13, InterfaceC28601c1 interfaceC28601c2) {
            this.f125101a = interfaceC28601c1;
            this.f125102b = c12684r;
            this.f125103c = c12679m;
            this.f125104d = i13;
            this.f125105e = interfaceC28601c2;
        }

        @Override // p635y2.InterfaceC39127r0
        /* JADX INFO: renamed from: a */
        public final InterfaceC39130s0 mo521a(InterfaceC39133t0 interfaceC39133t0, List<? extends InterfaceC39124q0> list, long j7) {
            this.f125101a.getValue();
            long jM35490f = this.f125102b.m35490f(j7, interfaceC39133t0.getLayoutDirection(), this.f125103c, list, this.f125104d);
            this.f125105e.getValue();
            return interfaceC39133t0.mo86822W((int) (jM35490f >> 32), (int) (jM35490f & 4294967295L), C25272z.f99163w, new a(this.f125102b, list));
        }
    }

    /* JADX INFO: renamed from: qk2.b$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC28601c1 f125108w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12679m f125109x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC28601c1 interfaceC28601c1, C12679m c12679m) {
            super(0);
            this.f125108w = interfaceC28601c1;
            this.f125109x = c12679m;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134474invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134474invoke() {
            InterfaceC28601c1 interfaceC28601c1 = this.f125108w;
            interfaceC28601c1.setValue(Boolean.valueOf(!((Boolean) interfaceC28601c1.getValue()).booleanValue()));
            this.f125109x.f43362z = true;
        }
    }

    /* JADX INFO: renamed from: qk2.b$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Li3/z;", "Ll83/a0;", "a", "(Li3/z;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC22680m implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12684r f125110w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C12684r c12684r) {
            super(1);
            this.f125110w = c12684r;
        }

        /* JADX INFO: renamed from: a */
        public final void m93177a(InterfaceC18044z interfaceC18044z) {
            AbstractC12686t.m35496a(interfaceC18044z, this.f125110w);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m93177a((InterfaceC18044z) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qk2.b$j */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "a", "(Landroidx/compose/runtime/Composer;I)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC22680m implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C27998d f125111E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ long f125112F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ C33252i f125113G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ boolean f125114H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ C33252i f125115I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ C30449e f125116J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ InterfaceC39171c f125117K;

        /* JADX INFO: renamed from: L */
        final /* synthetic */ long f125118L;

        /* JADX INFO: renamed from: M */
        final /* synthetic */ InterfaceC28593a1 f125119M;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC28601c1 f125120w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12677k f125121x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f125122y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C27995a f125123z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC28601c1 interfaceC28601c1, C12677k c12677k, InterfaceC4339a interfaceC4339a, C27995a c27995a, C27998d c27998d, long j7, C33252i c33252i, boolean z4, C33252i c33252i2, C30449e c30449e, InterfaceC39171c interfaceC39171c, long j13, InterfaceC28593a1 interfaceC28593a1) {
            super(2);
            this.f125120w = interfaceC28601c1;
            this.f125121x = c12677k;
            this.f125122y = interfaceC4339a;
            this.f125123z = c27995a;
            this.f125111E = c27998d;
            this.f125112F = j7;
            this.f125113G = c33252i;
            this.f125114H = z4;
            this.f125115I = c33252i2;
            this.f125116J = c30449e;
            this.f125117K = interfaceC39171c;
            this.f125118L = j13;
            this.f125119M = interfaceC28593a1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r3v30, types: [int] */
        /* JADX WARN: Type inference failed for: r3v31 */
        /* JADX WARN: Type inference failed for: r3v38 */
        /* JADX WARN: Type inference failed for: r7v10, types: [p1.q] */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v12 */
        /* JADX WARN: Type inference failed for: r7v13 */
        /* JADX WARN: Type inference failed for: r7v14 */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v4, types: [p1.q] */
        /* JADX WARN: Type inference failed for: r7v5, types: [p1.q] */
        /* JADX WARN: Type inference failed for: r7v7, types: [p1.q] */
        /* JADX WARN: Type inference failed for: r7v8, types: [androidx.compose.runtime.Composer, p1.q] */
        /* JADX WARN: Type inference failed for: r8v27, types: [androidx.compose.runtime.Composer] */
        /* JADX WARN: Type inference failed for: r8v9, types: [androidx.compose.runtime.Composer] */
        /* JADX INFO: renamed from: a */
        public final void m93178a(Composer composer, int i13) {
            Object obj;
            Object obj2;
            C2314t c2314t;
            ?? r10;
            ?? r14;
            ?? r15;
            long j7;
            ?? r16;
            Object obj3;
            C27998d c27998d;
            ?? r17;
            if ((i13 & 3) == 2) {
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87121F()) {
                    c28655q.m87138X();
                    return;
                }
            }
            this.f125120w.setValue(C23454a0.f92919a);
            C12677k c12677k = this.f125121x;
            int i14 = c12677k.f43349b;
            c12677k.m35480e();
            C12677k c12677k2 = this.f125121x;
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(1882317808);
            C12677k c12677k3 = (C12677k) c12677k2.m35479d().f2818x;
            C12672f c12672fM35478c = c12677k3.m35478c();
            C12672f c12672fM35478c2 = c12677k3.m35478c();
            C12672f c12672fM35478c3 = c12677k3.m35478c();
            C12672f c12672fM35478c4 = c12677k3.m35478c();
            C12672f c12672fM35478c5 = c12677k3.m35478c();
            C12672f c12672fM35478c6 = c12677k3.m35478c();
            long jMo134584toComposableColorWaAFU9c = this.f125123z.getColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
            C27998d c27998d2 = this.f125111E;
            long jM51541c = C17919x.m51541c((c27998d2 == null || !c27998d2.getIsReached()) ? this.f125123z.getBarPaintAlpha() : 1.0f, jMo134584toComposableColorWaAFU9c);
            long j13 = this.f125112F;
            C33252i c33252i = this.f125113G;
            Object objM87133R = c28655q2.m87133R();
            Object obj4 = C28635l.f115821a;
            if (objM87133R == obj4) {
                objM87133R = a.f125088w;
                c28655q2.m87172p0(objM87133R);
            }
            C2314t c2314t2 = C2314t.f9131w;
            AbstractC30446b.m93167x(j13, c33252i, C12677k.m35476b(c2314t2, c12672fM35478c, (Function1) objM87133R), c28655q2, 0, 0);
            if (this.f125111E == null) {
                c28655q2.m87150e0(1882872861);
                c28655q2.m87173q(false);
                c2314t = c2314t2;
                obj2 = obj4;
                r10 = 0;
                r14 = c28655q2;
            } else {
                c28655q2.m87150e0(1882872862);
                float fM84451a = this.f125111E.getFillFraction();
                long j14 = this.f125118L;
                C33252i c33252i2 = this.f125115I;
                boolean zM87153g = c28655q2.m87153g(c12672fM35478c) | c28655q2.m87153g(this.f125116J);
                Object objM87133R2 = c28655q2.m87133R();
                if (zM87153g) {
                    obj = obj4;
                } else {
                    if (objM87133R2 == obj) {
                    }
                    obj = obj4;
                    obj2 = obj;
                    c2314t = c2314t2;
                    r10 = 0;
                    AbstractC30446b.m93132B(fM84451a, j14, c33252i2, C12677k.m35476b(c2314t2, c12672fM35478c2, (Function1) objM87133R2), c28655q2, 0, 0);
                    C28655q c28655q3 = c28655q2;
                    c28655q3.m87173q(false);
                    r14 = c28655q3;
                }
                obj = obj4;
                objM87133R2 = new b(c12672fM35478c, this.f125116J);
                c28655q2.m87172p0(objM87133R2);
                obj = obj4;
                obj2 = obj;
                c2314t = c2314t2;
                r10 = 0;
                AbstractC30446b.m93132B(fM84451a, j14, c33252i2, C12677k.m35476b(c2314t2, c12672fM35478c2, (Function1) objM87133R2), c28655q2, 0, 0);
                C28655q c28655q4 = c28655q2;
                c28655q4.m87173q(false);
                r14 = c28655q4;
            }
            if (this.f125114H) {
                r14.m87150e0(1883425623);
                float fM84435c = this.f125123z.getFillFraction();
                long j15 = this.f125112F;
                C33252i c33252i3 = this.f125115I;
                boolean zM87153g2 = r14.m87153g(c12672fM35478c) | r14.m87153g(this.f125116J);
                Object objM87133R3 = r14.m87133R();
                if (zM87153g2 || objM87133R3 == obj2) {
                    objM87133R3 = new c(c12672fM35478c, this.f125116J);
                    r14.m87172p0(objM87133R3);
                }
                ?? r18 = r14;
                AbstractC30446b.m93132B(fM84435c, j15, c33252i3, C12677k.m35476b(c2314t, c12672fM35478c3, (Function1) objM87133R3), r18, 0, 0);
                ?? r19 = r18;
                r19.m87173q(r10);
                r15 = r19;
            } else {
                r14.m87150e0(1883907084);
                r14.m87173q(r10);
                r15 = r14;
            }
            C27998d c27998d3 = this.f125111E;
            if (c27998d3 == null || !c27998d3.getShowDashes()) {
                c27998d3 = null;
            }
            if (c27998d3 == null) {
                r15.m87150e0(1883970447);
                r15.m87173q(r10);
                j7 = jM51541c;
                r16 = r15;
            } else {
                r15.m87150e0(1883970448);
                boolean zM87153g3 = r15.m87153g(c12672fM35478c2);
                Object objM87133R4 = r15.m87133R();
                if (zM87153g3 || objM87133R4 == obj2) {
                    objM87133R4 = new d(c12672fM35478c2);
                    r15.m87172p0(objM87133R4);
                }
                ?? r24 = r15;
                j7 = jM51541c;
                AbstractC30446b.m93155l(j7, C12677k.m35476b(c2314t, c12672fM35478c4, (Function1) objM87133R4), r24, 0, 0);
                ?? r25 = r24;
                r25.m87173q(r10);
                r16 = r25;
            }
            if (this.f125111E == null) {
                r16.m87150e0(1884446793);
                r16.m87173q(r10);
                obj3 = obj2;
            } else {
                r16.m87150e0(1884446794);
                C27998d c27998d4 = this.f125111E;
                boolean zM87157i = r16.m87157i(c27998d4) | r16.m87153g(c12672fM35478c4) | r16.m87153g(this.f125116J) | r16.m87155h(this.f125114H) | r16.m87153g(c12672fM35478c3) | r16.m87153g(c12672fM35478c2);
                Object objM87133R5 = r16.m87133R();
                if (zM87157i || objM87133R5 == obj2) {
                    obj3 = obj2;
                    c27998d = c27998d4;
                    e eVar = new e(c27998d, c12672fM35478c4, this.f125116J, this.f125114H, c12672fM35478c3, c12672fM35478c2);
                    r16.m87172p0(eVar);
                    objM87133R5 = eVar;
                } else {
                    c27998d = c27998d4;
                    obj3 = obj2;
                }
                AbstractC30446b.m93158o(c27998d, j7, C12677k.m35476b(c2314t, c12672fM35478c5, (Function1) objM87133R5), r16, TextResource.$stable, 0);
                r16.m87173q(r10);
            }
            if (!this.f125123z.getIsActive() || AbstractC30446b.m93161r(this.f125119M) <= 0) {
                r16.m87150e0(1885943660);
                r16.m87173q(r10);
            } else {
                r16.m87150e0(1885326698);
                int iM84438f = (int) (this.f125123z.getThumbPercent() * (AbstractC30446b.m93161r(this.f125119M) - this.f125117K.mo743q0(this.f125116J.m93206v())));
                if (iM84438f < 0) {
                    r17 = iM84438f;
                    r17 = r10;
                }
                r17 = iM84438f;
                boolean zM87153g4 = r16.m87153g(c12672fM35478c);
                Object objM87133R6 = r16.m87133R();
                if (zM87153g4 || objM87133R6 == obj3) {
                    objM87133R6 = new f(c12672fM35478c);
                    r16.m87172p0(objM87133R6);
                }
                AbstractC30446b.m93134D(r17, C12677k.m35476b(c2314t, c12672fM35478c6, (Function1) objM87133R6), r16, r10, r10);
                r16.m87173q(r10);
            }
            r16.m87173q(r10);
            if (this.f125121x.f43349b != i14) {
                AbstractC28683x.m87257k(this.f125122y, r16);
            }
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m93178a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qk2.b$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class k {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f125124a;

        static {
            int[] iArr = new int[EnumC27997c.values().length];
            try {
                iArr[EnumC27997c.Compact.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC27997c.Full.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC27997c.FullWithGoals.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f125124a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m93131A(C28004j c28004j, long j7, C2886a c2886a, C2886a c2886a2, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m93169z(c28004j, j7, c2886a, c2886a2, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final void m93132B(float f13, long j7, InterfaceC17869a1 interfaceC17869a1, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1356448860);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87151f(j7) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(interfaceC17869a1) ? 256 : 128;
        }
        int i16 = i14 & 8;
        if (i16 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(modifier) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier;
            C30449e c30449e = C30449e.f125125a;
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(((C39174f) AbstractC12889b.m36281k(new C39174f(c30449e.m93195k() * f13), new C39174f(c30449e.m93196l()))).f168413w, AbstractC1102d.m3409f(1.0f, modifier3)), interfaceC17869a1), j7, AbstractC17918w0.f69621a), c28655q, 0);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3658s(f13, j7, interfaceC17869a1, modifier2, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m93133C(float f13, long j7, InterfaceC17869a1 interfaceC17869a1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m93132B(f13, j7, interfaceC17869a1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m93134D(int i13, Modifier modifier, Composer composer, int i14, int i15) {
        int i16;
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1400113673);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87149e(i13) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i17 = i15 & 2;
        if (i17 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 19) != 18)) {
            Modifier modifier3 = i17 != 0 ? C2314t.f9131w : modifier;
            C30449e c30449e = C30449e.f125125a;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(c30449e.m93204t());
            boolean z4 = (i16 & 14) == 4;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C6494e(i13, 24);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22989q.m66760a(AbstractC15751g.m44455h(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(c30449e.m93205u(), AbstractC1102d.m3424u(c30449e.m93206v(), AbstractC1099a.m3390l(modifier3, (Function1) objM87133R))), c33252iM105489e), EnumC39333f.BRAND_WHITE.mo134584toComposableColorWaAFU9c(c28655q, 6), AbstractC17918w0.f69621a), c30449e.m93203s(), EnumC39333f.BLACK_30.mo134584toComposableColorWaAFU9c(c28655q, 6), c33252iM105489e), c28655q, 0);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13179l(i13, i14, i15, 2, modifier2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C39178j m93135E(int i13, InterfaceC39171c offset) {
        AbstractC22676k.m65750j(offset, "$this$offset");
        return new C39178j((((long) i13) << 32) | (((long) 0) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m93136F(int i13, Modifier modifier, int i14, int i15, Composer composer, int i16) {
        m93134D(i13, modifier, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    private static final C30445a m93143M(EnumC27997c enumC27997c) {
        C30449e c30449e = C30449e.f125125a;
        int i13 = k.f125124a[enumC27997c.ordinal()];
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (i13 == 1) {
            return new C30445a(c30449e.m93186b(), c30449e.m93187c(), defaultConstructorMarker);
        }
        if (i13 == 2) {
            return new C30445a(c30449e.m93197m(), c30449e.m93200p(), defaultConstructorMarker);
        }
        if (i13 == 3) {
            return new C30445a(c30449e.m93198n(), c30449e.m93201q(), defaultConstructorMarker);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:33:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    public static final void m93155l(long j7, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        boolean z4;
        Modifier modifier2;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        float fMo743q0;
        float fMo743q1;
        boolean zM87147d;
        Object objM87133R;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-842661630);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87151f(j7) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                i15 |= c28655q.m87153g(modifier) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier;
                }
                C30449e c30449e = C30449e.f125125a;
                InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                fMo743q0 = interfaceC39171c.mo743q0(c30449e.m93192h());
                fMo743q1 = interfaceC39171c.mo743q0(c30449e.m93191g());
                Modifier modifierM3411h = AbstractC1102d.m3411h(c30449e.m93193i(), AbstractC1102d.m3409f(1.0f, modifier3));
                zM87147d = c28655q.m87147d(fMo743q0) | ((i15 & 14) == 4) | c28655q.m87147d(fMo743q1);
                objM87133R = c28655q.m87133R();
                if (zM87147d || objM87133R == C28635l.f115821a) {
                    C12769l c12769l = new C12769l(j7, fMo743q0, fMo743q1, 7);
                    c28655q.m87172p0(c12769l);
                    objM87133R = c12769l;
                }
                AbstractC21478l0.m60421a(modifierM3411h, (Function1) objM87133R, c28655q, 0);
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C26193g(i13, i14, j7, modifier2);
            }
        }
        i15 |= 48;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier;
            }
            C30449e c30449e2 = C30449e.f125125a;
            InterfaceC39171c interfaceC39171c2 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            fMo743q0 = interfaceC39171c2.mo743q0(c30449e2.m93192h());
            fMo743q1 = interfaceC39171c2.mo743q0(c30449e2.m93191g());
            Modifier modifierM3411h2 = AbstractC1102d.m3411h(c30449e2.m93193i(), AbstractC1102d.m3409f(1.0f, modifier3));
            zM87147d = c28655q.m87147d(fMo743q0) | ((i15 & 14) == 4) | c28655q.m87147d(fMo743q1);
            objM87133R = c28655q.m87133R();
            if (zM87147d) {
                C12769l c12769l2 = new C12769l(j7, fMo743q0, fMo743q1, 7);
                c28655q.m87172p0(c12769l2);
                objM87133R = c12769l2;
            } else {
                C12769l c12769l3 = new C12769l(j7, fMo743q0, fMo743q1, 7);
                c28655q.m87172p0(c12769l3);
                objM87133R = c12769l3;
            }
            AbstractC21478l0.m60421a(modifierM3411h2, (Function1) objM87133R, c28655q, 0);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26193g(i13, i14, j7, modifier2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m93156m(long j7, float f13, float f14, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)) / 2.0f)) & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo731d() >> 32));
        Canvas.mo732d0(j7, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), (496 & 8) != 0 ? 0.0f : Float.intBitsToFloat((int) (4294967295L & Canvas.mo731d())), (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : new C17893k(new DashPathEffect(new float[]{f13, f14}, 0.0f)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m93157n(long j7, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m93155l(j7, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:53:0x0100  */
    /* JADX WARN: Code duplicated, block: B:56:0x0140  */
    /* JADX WARN: Code duplicated, block: B:59:0x014a  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: o */
    public static final void m93158o(C27998d c27998d, long j7, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C30449e c30449e;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1363477963);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(c27998d) : c28655q.m87157i(c27998d) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87151f(j7) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier2 = c2314t;
                }
                c30449e = C30449e.f125125a;
                Modifier modifierM3411h = AbstractC1102d.m3411h(c30449e.m93194j(), AbstractC1102d.m3409f(1.0f, modifier2));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3411h);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                if (c27998d.getIsReached()) {
                    c28655q.m87150e0(808793160);
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(C38072d.f163053a.m121951d().getTinyIcons().getCheckmark(), c28655q, 0), null, AbstractC1102d.m3419p(c30449e.m93190f(), c2314t), j7, c28655q, ((i15 << 6) & 7168) | 48, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(809045469);
                    C28004j c28004jM84453c = c27998d.getTimeLabel();
                    C38072d c38072d = C38072d.f163053a;
                    int i17 = C38072d.f163054b;
                    C2886a c2886aM8407E = c38072d.m121952e(c28655q, i17).getN8();
                    C2886a c2886aM8407E2 = c38072d.m121952e(c28655q, i17).getN8();
                    int i18 = (i15 & 112) | TextResource.$stable;
                    int i19 = C2886a.f11498d;
                    m93169z(c28004jM84453c, j7, c2886aM8407E, c2886aM8407E2, null, c28655q, i18 | (i19 << 6) | (i19 << 9), 16);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
            }
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3565g(c27998d, j7, modifier3, i13, i14, 3);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            c30449e = C30449e.f125125a;
            Modifier modifierM3411h2 = AbstractC1102d.m3411h(c30449e.m93194j(), AbstractC1102d.m3409f(1.0f, modifier2));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3411h2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            if (c27998d.getIsReached()) {
                c28655q.m87150e0(808793160);
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(C38072d.f163053a.m121951d().getTinyIcons().getCheckmark(), c28655q, 0), null, AbstractC1102d.m3419p(c30449e.m93190f(), c2314t), j7, c28655q, ((i15 << 6) & 7168) | 48, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(809045469);
                C28004j c28004jM84453c2 = c27998d.getTimeLabel();
                C38072d c38072d2 = C38072d.f163053a;
                int i110 = C38072d.f163054b;
                C2886a c2886aM8407E3 = c38072d2.m121952e(c28655q, i110).getN8();
                C2886a c2886aM8407E4 = c38072d2.m121952e(c28655q, i110).getN8();
                int i111 = (i15 & 112) | TextResource.$stable;
                int i112 = C2886a.f11498d;
                m93169z(c28004jM84453c2, j7, c2886aM8407E3, c2886aM8407E4, null, c28655q, i111 | (i112 << 6) | (i112 << 9), 16);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3565g(c27998d, j7, modifier3, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m93159p(C27998d c27998d, long j7, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m93158o(c27998d, j7, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x021b  */
    /* JADX WARN: Code duplicated, block: B:104:0x023d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x0245  */
    /* JADX WARN: Code duplicated, block: B:110:0x025f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0273 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0275  */
    /* JADX WARN: Code duplicated, block: B:116:0x0304  */
    /* JADX WARN: Code duplicated, block: B:119:0x030f  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:66:0x011d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0121  */
    /* JADX WARN: Code duplicated, block: B:70:0x0136  */
    /* JADX WARN: Code duplicated, block: B:73:0x0147  */
    /* JADX WARN: Code duplicated, block: B:77:0x0161  */
    /* JADX WARN: Code duplicated, block: B:80:0x018f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0193  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:98:0x0209  */
    /* JADX INFO: renamed from: q */
    private static final void m93160q(C27995a c27995a, EnumC27997c enumC27997c, float f13, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C30449e c30449e;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28593a1 interfaceC28593a1;
        boolean z13;
        boolean z14;
        C27998d c27998dM84436d;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C30449e c30449e2;
        Object objM87133R2;
        int iHashCode2;
        InterfaceC39171c interfaceC39171c;
        Object objM87133R3;
        C12684r c12684r;
        Object objM87133R4;
        C12677k c12677k;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R6;
        C12679m c12679m;
        Object objM87133R7;
        InterfaceC28601c1 interfaceC28601c2;
        boolean zM87157i;
        Object objM87133R8;
        Object objM87133R9;
        boolean zM87157i2;
        Object objM87133R10;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-470806238);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(c27995a) : c28655q2.m87157i(c27995a) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87149e(enumC27997c.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87147d(f13) ? 256 : 128;
        }
        int i16 = i14 & 8;
        if (i16 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c30449e = C30449e.f125125a;
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95646v(0, c28655q2);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R;
                C28674u2 c28674u2 = AbstractC2453v1.f9569h;
                InterfaceC39171c interfaceC39171c2 = (InterfaceC39171c) c28655q2.m87161k(c28674u2);
                float f14 = ((float) 0.5d) * 4;
                C33252i c33252iM105491g = AbstractC33253j.m105491g(f14, f14, 0.0f, 0.0f, 12);
                C33252i c33252iM105489e = AbstractC33253j.m105489e(f14);
                long jM51541c = C17919x.m51541c(c27995a.getBarPaintAlpha(), c27995a.getColor().mo134584toComposableColorWaAFU9c(c28655q2, 0));
                long jM51541c2 = C17919x.m51541c(0.2f, c27995a.getColor().mo134584toComposableColorWaAFU9c(c28655q2, 0));
                long jMo134584toComposableColorWaAFU9c = c27995a.getTimeLabelColorKey().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                if (enumC27997c == EnumC27997c.Compact) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13 && c27995a.getShowFillBar()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                c27998dM84436d = c27995a.getCom.whoop.weeklyplan.api.WeeklyPlanApiKt.GOAL java.lang.String();
                if (z13) {
                    c27998dM84436d = null;
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9111N, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                Modifier modifier5 = modifier4;
                if (c28655q2.f115903S) {
                    c30449e2 = c30449e;
                } else {
                    c30449e2 = c30449e;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                    Modifier modifierM3411h = AbstractC1102d.m3411h(f13, AbstractC1102d.m3409f(1.0f, c2314t));
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C14362f(interfaceC28593a1, 9);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3502b = AbstractC1132b.m3502b(modifierM3411h, (Function1) objM87133R2);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3502b);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                    c28655q2.m87150e0(-1003410150);
                    c28655q2.m87150e0(212064437);
                    c28655q2.m87173q(false);
                    interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(c28674u2);
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C12684r(interfaceC39171c);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    c12684r = (C12684r) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C12677k();
                        c28655q2.m87172p0(objM87133R4);
                    }
                    c12677k = (C12677k) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C12679m(c12677k);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    c12679m = (C12679m) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        C28633k1 c28633k1 = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
                        c28655q2.m87172p0(c28633k1);
                        objM87133R7 = c28633k1;
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                    zM87157i = c28655q2.m87157i(c12684r) | c28655q2.m87149e(257);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87157i || objM87133R8 == c28676v0) {
                        objM87133R8 = new g(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    InterfaceC39127r0 interfaceC39127r0 = (InterfaceC39127r0) objM87133R8;
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new h(interfaceC28601c1, c12679m);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R9;
                    zM87157i2 = c28655q2.m87157i(c12684r);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i2 || objM87133R10 == c28676v0) {
                        objM87133R10 = new i(c12684r);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    c28655q = c28655q2;
                    AbstractC39125q1.m124655a(AbstractC18032n.m51775c(modifierM3407d, false, (Function1) objM87133R10), AbstractC37817c.m121344e(1200550679, c28655q, new j(interfaceC28601c2, c12677k, interfaceC4339a, c27995a, c27998dM84436d, jM51541c, c33252iM105489e, z14, c33252iM105491g, c30449e2, interfaceC39171c2, jM51541c2, interfaceC28593a1)), interfaceC39127r0, c28655q, 48);
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(c30449e2.m93207w() + c30449e2.m93202r(), c2314t));
                    C28004j c28004jM84439g = c27995a.getTimeLabel();
                    C38072d c38072d = C38072d.f163053a;
                    int i17 = C38072d.f163054b;
                    C2886a c2886aM8405C = c38072d.m121952e(c28655q, i17).getN6();
                    C2886a c2886aM8407E = c38072d.m121952e(c28655q, i17).getN8();
                    int i18 = TextResource.$stable;
                    int i19 = C2886a.f11498d;
                    m93169z(c28004jM84439g, jMo134584toComposableColorWaAFU9c, c2886aM8405C, c2886aM8407E, null, c28655q, i18 | (i19 << 6) | (i19 << 9), 16);
                    c28655q.m87173q(true);
                    modifier3 = modifier5;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                Modifier modifierM3411h2 = AbstractC1102d.m3411h(f13, AbstractC1102d.m3409f(1.0f, c2314t));
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C14362f(interfaceC28593a1, 9);
                    c28655q2.m87172p0(objM87133R2);
                }
                Modifier modifierM3502b2 = AbstractC1132b.m3502b(modifierM3411h2, (Function1) objM87133R2);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3502b2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
                c28655q2.m87150e0(-1003410150);
                c28655q2.m87150e0(212064437);
                c28655q2.m87173q(false);
                interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(c28674u2);
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C12684r(interfaceC39171c);
                    c28655q2.m87172p0(objM87133R3);
                }
                c12684r = (C12684r) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C12677k();
                    c28655q2.m87172p0(objM87133R4);
                }
                c12677k = (C12677k) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C12679m(c12677k);
                    c28655q2.m87172p0(objM87133R6);
                }
                c12679m = (C12679m) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    C28633k1 c28633k2 = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
                    c28655q2.m87172p0(c28633k2);
                    objM87133R7 = c28633k2;
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                zM87157i = c28655q2.m87157i(c12684r) | c28655q2.m87149e(257);
                objM87133R8 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R8 = new g(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new g(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R8);
                }
                InterfaceC39127r0 interfaceC39127r1 = (InterfaceC39127r0) objM87133R8;
                objM87133R9 = c28655q2.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new h(interfaceC28601c1, c12679m);
                    c28655q2.m87172p0(objM87133R9);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R9;
                zM87157i2 = c28655q2.m87157i(c12684r);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R10 = new i(c12684r);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new i(c12684r);
                    c28655q2.m87172p0(objM87133R10);
                }
                c28655q = c28655q2;
                AbstractC39125q1.m124655a(AbstractC18032n.m51775c(modifierM3407d2, false, (Function1) objM87133R10), AbstractC37817c.m121344e(1200550679, c28655q, new j(interfaceC28601c2, c12677k, interfaceC4339a2, c27995a, c27998dM84436d, jM51541c, c33252iM105489e, z14, c33252iM105491g, c30449e2, interfaceC39171c2, jM51541c2, interfaceC28593a1)), interfaceC39127r1, c28655q, 48);
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(c30449e2.m93207w() + c30449e2.m93202r(), c2314t));
                C28004j c28004jM84439g2 = c27995a.getTimeLabel();
                C38072d c38072d2 = C38072d.f163053a;
                int i110 = C38072d.f163054b;
                C2886a c2886aM8405C2 = c38072d2.m121952e(c28655q, i110).getN6();
                C2886a c2886aM8407E2 = c38072d2.m121952e(c28655q, i110).getN8();
                int i111 = TextResource.$stable;
                int i112 = C2886a.f11498d;
                m93169z(c28004jM84439g2, jMo134584toComposableColorWaAFU9c, c2886aM8405C2, c2886aM8407E2, null, c28655q, i111 | (i112 << 6) | (i112 << 9), 16);
                c28655q.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C9814j(c27995a, enumC27997c, f13, modifier3, i13, i14);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c30449e = C30449e.f125125a;
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC31061c.m95646v(0, c28655q2);
            }
            interfaceC28593a1 = (InterfaceC28593a1) objM87133R;
            C28674u2 c28674u3 = AbstractC2453v1.f9569h;
            InterfaceC39171c interfaceC39171c3 = (InterfaceC39171c) c28655q2.m87161k(c28674u3);
            float f15 = ((float) 0.5d) * 4;
            C33252i c33252iM105491g2 = AbstractC33253j.m105491g(f15, f15, 0.0f, 0.0f, 12);
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(f15);
            long jM51541c3 = C17919x.m51541c(c27995a.getBarPaintAlpha(), c27995a.getColor().mo134584toComposableColorWaAFU9c(c28655q2, 0));
            long jM51541c4 = C17919x.m51541c(0.2f, c27995a.getColor().mo134584toComposableColorWaAFU9c(c28655q2, 0));
            long jMo134584toComposableColorWaAFU9c2 = c27995a.getTimeLabelColorKey().mo134584toComposableColorWaAFU9c(c28655q2, 0);
            if (enumC27997c == EnumC27997c.Compact) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                z14 = false;
            } else {
                z14 = false;
            }
            c27998dM84436d = c27995a.getCom.whoop.weeklyplan.api.WeeklyPlanApiKt.GOAL java.lang.String();
            if (z13) {
                c27998dM84436d = null;
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9111N, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifier4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a2);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            Modifier modifier6 = modifier4;
            if (c28655q2.f115903S) {
                c30449e2 = c30449e;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N4);
                Modifier modifierM3411h3 = AbstractC1102d.m3411h(f13, AbstractC1102d.m3409f(1.0f, c2314t));
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C14362f(interfaceC28593a1, 9);
                    c28655q2.m87172p0(objM87133R2);
                }
                Modifier modifierM3502b3 = AbstractC1132b.m3502b(modifierM3411h3, (Function1) objM87133R2);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3502b3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m5);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N5);
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t);
                c28655q2.m87150e0(-1003410150);
                c28655q2.m87150e0(212064437);
                c28655q2.m87173q(false);
                interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(c28674u3);
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C12684r(interfaceC39171c);
                    c28655q2.m87172p0(objM87133R3);
                }
                c12684r = (C12684r) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C12677k();
                    c28655q2.m87172p0(objM87133R4);
                }
                c12677k = (C12677k) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C12679m(c12677k);
                    c28655q2.m87172p0(objM87133R6);
                }
                c12679m = (C12679m) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    C28633k1 c28633k3 = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
                    c28655q2.m87172p0(c28633k3);
                    objM87133R7 = c28633k3;
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                zM87157i = c28655q2.m87157i(c12684r) | c28655q2.m87149e(257);
                objM87133R8 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R8 = new g(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new g(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R8);
                }
                InterfaceC39127r0 interfaceC39127r2 = (InterfaceC39127r0) objM87133R8;
                objM87133R9 = c28655q2.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new h(interfaceC28601c1, c12679m);
                    c28655q2.m87172p0(objM87133R9);
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R9;
                zM87157i2 = c28655q2.m87157i(c12684r);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R10 = new i(c12684r);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new i(c12684r);
                    c28655q2.m87172p0(objM87133R10);
                }
                c28655q = c28655q2;
                AbstractC39125q1.m124655a(AbstractC18032n.m51775c(modifierM3407d3, false, (Function1) objM87133R10), AbstractC37817c.m121344e(1200550679, c28655q, new j(interfaceC28601c2, c12677k, interfaceC4339a3, c27995a, c27998dM84436d, jM51541c3, c33252iM105489e2, z14, c33252iM105491g2, c30449e2, interfaceC39171c3, jM51541c4, interfaceC28593a1)), interfaceC39127r2, c28655q, 48);
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(c30449e2.m93207w() + c30449e2.m93202r(), c2314t));
                C28004j c28004jM84439g3 = c27995a.getTimeLabel();
                C38072d c38072d3 = C38072d.f163053a;
                int i113 = C38072d.f163054b;
                C2886a c2886aM8405C3 = c38072d3.m121952e(c28655q, i113).getN6();
                C2886a c2886aM8407E3 = c38072d3.m121952e(c28655q, i113).getN8();
                int i114 = TextResource.$stable;
                int i115 = C2886a.f11498d;
                m93169z(c28004jM84439g3, jMo134584toComposableColorWaAFU9c2, c2886aM8405C3, c2886aM8407E3, null, c28655q, i114 | (i115 << 6) | (i115 << 9), 16);
                c28655q.m87173q(true);
                modifier3 = modifier6;
            } else {
                c30449e2 = c30449e;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N4);
            Modifier modifierM3411h4 = AbstractC1102d.m3411h(f13, AbstractC1102d.m3409f(1.0f, c2314t));
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C14362f(interfaceC28593a1, 9);
                c28655q2.m87172p0(objM87133R2);
            }
            Modifier modifierM3502b4 = AbstractC1132b.m3502b(modifierM3411h4, (Function1) objM87133R2);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3502b4);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m6);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N6);
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t);
            c28655q2.m87150e0(-1003410150);
            c28655q2.m87150e0(212064437);
            c28655q2.m87173q(false);
            interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(c28674u3);
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C12684r(interfaceC39171c);
                c28655q2.m87172p0(objM87133R3);
            }
            c12684r = (C12684r) objM87133R3;
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C12677k();
                c28655q2.m87172p0(objM87133R4);
            }
            c12677k = (C12677k) objM87133R4;
            objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R5);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
            objM87133R6 = c28655q2.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = new C12679m(c12677k);
                c28655q2.m87172p0(objM87133R6);
            }
            c12679m = (C12679m) objM87133R6;
            objM87133R7 = c28655q2.m87133R();
            if (objM87133R7 == c28676v0) {
                C28633k1 c28633k4 = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
                c28655q2.m87172p0(c28633k4);
                objM87133R7 = c28633k4;
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
            zM87157i = c28655q2.m87157i(c12684r) | c28655q2.m87149e(257);
            objM87133R8 = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R8 = new g(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R8);
            } else {
                objM87133R8 = new g(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R8);
            }
            InterfaceC39127r0 interfaceC39127r3 = (InterfaceC39127r0) objM87133R8;
            objM87133R9 = c28655q2.m87133R();
            if (objM87133R9 == c28676v0) {
                objM87133R9 = new h(interfaceC28601c1, c12679m);
                c28655q2.m87172p0(objM87133R9);
            }
            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R9;
            zM87157i2 = c28655q2.m87157i(c12684r);
            objM87133R10 = c28655q2.m87133R();
            if (zM87157i2) {
                objM87133R10 = new i(c12684r);
                c28655q2.m87172p0(objM87133R10);
            } else {
                objM87133R10 = new i(c12684r);
                c28655q2.m87172p0(objM87133R10);
            }
            c28655q = c28655q2;
            AbstractC39125q1.m124655a(AbstractC18032n.m51775c(modifierM3407d4, false, (Function1) objM87133R10), AbstractC37817c.m121344e(1200550679, c28655q, new j(interfaceC28601c2, c12677k, interfaceC4339a4, c27995a, c27998dM84436d, jM51541c3, c33252iM105489e2, z14, c33252iM105491g2, c30449e2, interfaceC39171c3, jM51541c4, interfaceC28593a1)), interfaceC39127r3, c28655q, 48);
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(c30449e2.m93207w() + c30449e2.m93202r(), c2314t));
            C28004j c28004jM84439g4 = c27995a.getTimeLabel();
            C38072d c38072d4 = C38072d.f163053a;
            int i116 = C38072d.f163054b;
            C2886a c2886aM8405C4 = c38072d4.m121952e(c28655q, i116).getN6();
            C2886a c2886aM8407E4 = c38072d4.m121952e(c28655q, i116).getN8();
            int i117 = TextResource.$stable;
            int i118 = C2886a.f11498d;
            m93169z(c28004jM84439g4, jMo134584toComposableColorWaAFU9c2, c2886aM8405C4, c2886aM8407E4, null, c28655q, i117 | (i118 << 6) | (i118 << 9), 16);
            c28655q.m87173q(true);
            modifier3 = modifier6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9814j(c27995a, enumC27997c, f13, modifier3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final int m93161r(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: s */
    private static final void m93162s(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m93163t(InterfaceC28593a1 interfaceC28593a1, C39180l c39180l) {
        m93162s(interfaceC28593a1, (int) (c39180l.f168422a >> 32));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m93164u(C27995a c27995a, EnumC27997c enumC27997c, float f13, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m93160q(c27995a, enumC27997c, f13, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:52:0x0106  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:58:0x012e  */
    /* JADX WARN: Code duplicated, block: B:62:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: v */
    public static final void m93165v(List<C27995a> bars, EnumC27997c enumC27997c, Modifier modifier, Composer composer, int i13, int i14) {
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C30445a c30445aM93143M;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        AbstractC22676k.m65750j(bars, "bars");
        EnumC27997c style = enumC27997c;
        AbstractC22676k.m65750j(style, "style");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2037567920);
        int i15 = (i13 & 6) == 0 ? (c28655q.m87157i(bars) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(style.ordinal()) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                C30449e c30449e = C30449e.f125125a;
                c30445aM93143M = m93143M(style);
                Modifier modifierM3411h = AbstractC1102d.m3411h(c30445aM93143M.getRowHeight(), AbstractC1102d.m3409f(1.0f, modifier3));
                C22949e c22949e = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(c30449e.m93199o()), C2299e.f9109L, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3411h);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                c28655q.m87150e0(-2018342673);
                for (C27995a c27995a : bars) {
                    float fM93129a = c30445aM93143M.getChartHeight();
                    if (1.0f > 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    m93160q(c27995a, style, fM93129a, new LayoutWeightElement(1.0f, true), c28655q, (i15 & 112) | TextResource.$stable, 0);
                    style = enumC27997c;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30179a(bars, enumC27997c, modifier3, i13, i14, 6);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            C30449e c30449e2 = C30449e.f125125a;
            c30445aM93143M = m93143M(style);
            Modifier modifierM3411h2 = AbstractC1102d.m3411h(c30445aM93143M.getRowHeight(), AbstractC1102d.m3409f(1.0f, modifier3));
            C22949e c22949e2 = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(c30449e2.m93199o()), C2299e.f9109L, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3411h2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            c28655q.m87150e0(-2018342673);
            while (r16.hasNext()) {
                float fM93129a2 = c30445aM93143M.getChartHeight();
                if (1.0f > 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                m93160q(c27995a, style, fM93129a2, new LayoutWeightElement(1.0f, true), c28655q, (i15 & 112) | TextResource.$stable, 0);
                style = enumC27997c;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30179a(bars, enumC27997c, modifier3, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m93166w(List list, EnumC27997c enumC27997c, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m93165v(list, enumC27997c, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m93167x(long j7, InterfaceC17869a1 interfaceC17869a1, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1471474998);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87151f(j7) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(interfaceC17869a1) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(C30449e.f125125a.m93185a(), AbstractC1102d.m3409f(1.0f, modifier)), interfaceC17869a1), j7, AbstractC17918w0.f69621a), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3565g(j7, interfaceC17869a1, modifier2, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m93168y(long j7, InterfaceC17869a1 interfaceC17869a1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m93167x(j7, interfaceC17869a1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x011a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0126  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: z */
    private static final void m93169z(C28004j c28004j, long j7, C2886a c2886a, C2886a c2886a2, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(479327628);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(c28004j) : c28655q2.m87157i(c28004j) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87151f(j7) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q2.m87153g(c2886a) : c28655q2.m87157i(c2886a) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= (i13 & 4096) == 0 ? c28655q2.m87153g(c2886a2) : c28655q2.m87157i(c2886a2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i16 = i14 & 16;
        if (i16 == 0) {
            if ((i13 & 24576) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                TextResource textResourceM84468a = c28004j.getLeading();
                int i17 = TextResource.$stable;
                int i18 = i15 & 112;
                c28655q = c28655q2;
                Modifier modifier5 = modifier4;
                AbstractC30795n.m94704e(AbstractC37056f.m118959K(new C23465k(AbstractC8693b.m21274h(textResourceM84468a, c28655q2, i17), AbstractC2890e.m8451f(c2886a.getStyle(), j7, c28655q2, i18)), new C23465k(AbstractC8693b.m21274h(c28004j.getTrailing(), c28655q2, i17), AbstractC2890e.m8451f(c2886a2.getStyle(), j7, c28655q2, i18))), modifier5, j7, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, null, c2886a, c28655q, ((i15 >> 9) & 112) | ((i15 << 3) & 896), (C2886a.f11498d << 21) | 3456 | ((i15 << 15) & 29360128), 118264);
                modifier3 = modifier5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4090p0(c28004j, j7, c2886a, c2886a2, modifier3, i13, i14);
            }
        }
        i15 |= 24576;
        modifier2 = modifier;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            TextResource textResourceM84468a2 = c28004j.getLeading();
            int i19 = TextResource.$stable;
            int i110 = i15 & 112;
            c28655q = c28655q2;
            Modifier modifier6 = modifier4;
            AbstractC30795n.m94704e(AbstractC37056f.m118959K(new C23465k(AbstractC8693b.m21274h(textResourceM84468a2, c28655q2, i19), AbstractC2890e.m8451f(c2886a.getStyle(), j7, c28655q2, i110)), new C23465k(AbstractC8693b.m21274h(c28004j.getTrailing(), c28655q2, i19), AbstractC2890e.m8451f(c2886a2.getStyle(), j7, c28655q2, i110))), modifier6, j7, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 1, 0, null, null, c2886a, c28655q, ((i15 >> 9) & 112) | ((i15 << 3) & 896), (C2886a.f11498d << 21) | 3456 | ((i15 << 15) & 29360128), 118264);
            modifier3 = modifier6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4090p0(c28004j, j7, c2886a, c2886a2, modifier3, i13, i14);
        }
    }
}
