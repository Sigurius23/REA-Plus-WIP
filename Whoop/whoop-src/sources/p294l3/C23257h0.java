package p294l3;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import java.util.ArrayList;
import java.util.List;
import lc2.C23830a;
import mb2.C25383a;
import p181h2.C16617b;
import p208i2.C17919x;
import p208i2.C17924z0;
import p389p0.C28539n0;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p478s3.AbstractC32098d;
import p478s3.C32095a;
import p478s3.C32096b;
import p571w3.C36765a;
import p571w3.C36768d;
import p571w3.C36769e;
import p571w3.C36770f;
import p571w3.C36771g;
import p571w3.C36772h;
import p571w3.C36773i;
import p571w3.C36775k;
import p571w3.C36777m;
import p571w3.C36781q;
import p634y1.C39029b;
import p636y3.C39183o;
import p636y3.C39184p;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import uf3.C34911a;
import wb3.AbstractC37056f;
import xf3.C38266c;

/* JADX INFO: renamed from: l3.h0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23257h0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f92141w;

    public /* synthetic */ C23257h0(int i13) {
        this.f92141w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        EnumC23262k enumC23262k;
        Object objM67324a;
        switch (this.f92141w) {
            case 0:
                return Integer.valueOf(((C28780r) obj2).f116547w);
            case 1:
                C23282u c23282u = (C23282u) obj2;
                return AbstractC37056f.m118980f(c23282u.f92248a, AbstractC23265l0.m67324a(c23282u.f92249b, AbstractC23265l0.f92174j, (C39029b) obj));
            case 2:
                return Float.valueOf(((C36765a) obj2).f157332a);
            case 3:
                C39029b c39029b = (C39029b) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i13 = 0; i13 < size; i13++) {
                    arrayList.add(AbstractC23265l0.m67324a((C23250e) list.get(i13), AbstractC23265l0.f92167c, c39029b));
                }
                return arrayList;
            case 4:
                C23283u0 c23283u0 = (C23283u0) obj2;
                return AbstractC37056f.m118980f(Integer.valueOf((int) (c23283u0.f92253a >> 32)), Integer.valueOf((int) (4294967295L & c23283u0.f92253a)));
            case 5:
                C39029b c39029b2 = (C39029b) obj;
                C17924z0 c17924z0 = (C17924z0) obj2;
                return AbstractC37056f.m118980f(AbstractC23265l0.m67324a(new C17919x(c17924z0.f69669a), AbstractC23265l0.f92182r, c39029b2), AbstractC23265l0.m67324a(new C16617b(c17924z0.f69670b), AbstractC23265l0.f92184t, c39029b2), Float.valueOf(c17924z0.f69671c));
            case 6:
                C39183o c39183o = (C39183o) obj2;
                return c39183o != null ? C39183o.m124803a(c39183o.f168429a, C39183o.f168428c) : false ? Boolean.FALSE : AbstractC37056f.m118980f(Float.valueOf(C39183o.m124805c(c39183o.f168429a)), new C39184p(C39183o.m124804b(c39183o.f168429a)));
            case 7:
                C16617b c16617b = (C16617b) obj2;
                return c16617b != null ? C16617b.m47187c(c16617b.f63937a, 9205357640488583168L) : false ? Boolean.FALSE : AbstractC37056f.m118980f(Float.valueOf(Float.intBitsToFloat((int) (c16617b.f63937a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (4294967295L & c16617b.f63937a))));
            case 8:
                C39029b c39029b3 = (C39029b) obj;
                List list2 = ((C32096b) obj2).f133099w;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    arrayList2.add(AbstractC23265l0.m67324a((C32095a) list2.get(i14), AbstractC23265l0.f92186v, c39029b3));
                }
                return arrayList2;
            case 9:
                return AbstractC32098d.m99843i(((C32095a) obj2).f133097a);
            case 10:
                C36773i c36773i = (C36773i) obj2;
                return AbstractC37056f.m118980f(new C36770f(c36773i.f157345a), new C36772h(c36773i.f157346b), new C36771g());
            case 11:
                C39029b c39029b4 = (C39029b) obj;
                C23250e c23250e = (C23250e) obj2;
                Object obj3 = c23250e.f92125a;
                if (obj3 instanceof C23245b0) {
                    enumC23262k = EnumC23262k.f92154w;
                } else if (obj3 instanceof C23267m0) {
                    enumC23262k = EnumC23262k.f92155x;
                } else if (obj3 instanceof C23289x0) {
                    enumC23262k = EnumC23262k.f92156y;
                } else if (obj3 instanceof C23287w0) {
                    enumC23262k = EnumC23262k.f92157z;
                } else if (obj3 instanceof C23282u) {
                    enumC23262k = EnumC23262k.f92150E;
                } else if (obj3 instanceof C23280t) {
                    enumC23262k = EnumC23262k.f92151F;
                } else {
                    if (!(obj3 instanceof C23271o0)) {
                        throw new UnsupportedOperationException();
                    }
                    enumC23262k = EnumC23262k.f92152G;
                }
                switch (enumC23262k.ordinal()) {
                    case 0:
                        AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        objM67324a = AbstractC23265l0.m67324a((C23245b0) obj3, AbstractC23265l0.f92172h, c39029b4);
                        break;
                    case 1:
                        AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        objM67324a = AbstractC23265l0.m67324a((C23267m0) obj3, AbstractC23265l0.f92173i, c39029b4);
                        break;
                    case 2:
                        AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        objM67324a = AbstractC23265l0.m67324a((C23289x0) obj3, AbstractC23265l0.f92168d, c39029b4);
                        break;
                    case 3:
                        AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        objM67324a = AbstractC23265l0.m67324a((C23287w0) obj3, AbstractC23265l0.f92169e, c39029b4);
                        break;
                    case 4:
                        AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        objM67324a = AbstractC23265l0.m67324a((C23282u) obj3, AbstractC23265l0.f92170f, c39029b4);
                        break;
                    case 5:
                        AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        objM67324a = AbstractC23265l0.m67324a((C23280t) obj3, AbstractC23265l0.f92171g, c39029b4);
                        break;
                    case 6:
                        AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                        objM67324a = ((C23271o0) obj3).f92213a;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return AbstractC37056f.m118980f(enumC23262k, objM67324a, Integer.valueOf(c23250e.f92126b), Integer.valueOf(c23250e.f92127c), c23250e.f92128d);
            case 12:
                C23280t c23280t = (C23280t) obj2;
                return AbstractC37056f.m118980f(c23280t.f92241a, AbstractC23265l0.m67324a(c23280t.f92242b, AbstractC23265l0.f92174j, (C39029b) obj));
            case 13:
                return ((C23289x0) obj2).m67383a();
            case 14:
                return ((C23287w0) obj2).m67382a();
            case 15:
                C39029b c39029b5 = (C39029b) obj;
                C23245b0 c23245b0 = (C23245b0) obj2;
                C36775k c36775k = new C36775k(c23245b0.f92104a);
                C36777m c36777m = new C36777m(c23245b0.f92105b);
                Object objM67324a2 = AbstractC23265l0.m67324a(new C39183o(c23245b0.f92106c), AbstractC23265l0.f92183s, c39029b5);
                C36781q c36781q = c23245b0.f92107d;
                C36781q c36781q2 = C36781q.f157360c;
                Object objM67324a3 = AbstractC23265l0.m67324a(c36781q, AbstractC23265l0.f92177m, c39029b5);
                Object objM67324a4 = AbstractC23265l0.m67324a(c23245b0.f92108e, AbstractC23278s.f92234b, c39029b5);
                C36773i c36773i2 = c23245b0.f92109f;
                C36773i c36773i3 = C36773i.f157344c;
                return AbstractC37056f.m118980f(c36775k, c36777m, objM67324a2, objM67324a3, objM67324a4, AbstractC23265l0.m67324a(c36773i2, AbstractC23265l0.f92187w, c39029b5), AbstractC23265l0.m67324a(new C36769e(c23245b0.f92110g), AbstractC23278s.f92235c, c39029b5), new C36768d(c23245b0.f92111h), AbstractC23265l0.m67324a(c23245b0.f92112i, AbstractC23278s.f92236d, c39029b5));
            case 16:
                C39029b c39029b6 = (C39029b) obj;
                C23267m0 c23267m0 = (C23267m0) obj2;
                C17919x c17919x = new C17919x(c23267m0.f92191a.mo117875b());
                C23263k0 c23263k0 = AbstractC23265l0.f92182r;
                Object objM67324a5 = AbstractC23265l0.m67324a(c17919x, c23263k0, c39029b6);
                C39183o c39183o2 = new C39183o(c23267m0.f92192b);
                C23263k0 c23263k1 = AbstractC23265l0.f92183s;
                Object objM67324a6 = AbstractC23265l0.m67324a(c39183o2, c23263k1, c39029b6);
                C28780r c28780r = c23267m0.f92193c;
                C28780r c28780r2 = C28780r.f116544x;
                Object objM67324a7 = AbstractC23265l0.m67324a(c28780r, AbstractC23265l0.f92178n, c39029b6);
                C28776n c28776n = c23267m0.f92194d;
                C28777o c28777o = c23267m0.f92195e;
                String str = c23267m0.f92197g;
                Object objM67324a8 = AbstractC23265l0.m67324a(new C39183o(c23267m0.f92198h), c23263k1, c39029b6);
                Object objM67324a9 = AbstractC23265l0.m67324a(c23267m0.f92199i, AbstractC23265l0.f92179o, c39029b6);
                Object objM67324a10 = AbstractC23265l0.m67324a(c23267m0.f92200j, AbstractC23265l0.f92176l, c39029b6);
                C32096b c32096b = c23267m0.f92201k;
                C32096b c32096b2 = C32096b.f133098y;
                Object objM67324a11 = AbstractC23265l0.m67324a(c32096b, AbstractC23265l0.f92185u, c39029b6);
                Object objM67324a12 = AbstractC23265l0.m67324a(new C17919x(c23267m0.f92202l), c23263k0, c39029b6);
                Object objM67324a13 = AbstractC23265l0.m67324a(c23267m0.f92203m, AbstractC23265l0.f92175k, c39029b6);
                C17924z0 c17924z1 = c23267m0.f92204n;
                C17924z0 c17924z2 = C17924z0.f69668d;
                return AbstractC37056f.m118980f(objM67324a5, objM67324a6, objM67324a7, c28776n, c28777o, -1, str, objM67324a8, objM67324a9, objM67324a10, objM67324a11, objM67324a12, objM67324a13, AbstractC23265l0.m67324a(c17924z1, AbstractC23265l0.f92181q, c39029b6));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C39029b c39029b7 = (C39029b) obj;
                C23279s0 c23279s0 = (C23279s0) obj2;
                C23267m0 c23267m1 = c23279s0.f92237a;
                C28539n0 c28539n0 = AbstractC23265l0.f92173i;
                return AbstractC37056f.m118980f(AbstractC23265l0.m67324a(c23267m1, c28539n0, c39029b7), AbstractC23265l0.m67324a(c23279s0.f92238b, c28539n0, c39029b7), AbstractC23265l0.m67324a(c23279s0.f92239c, c28539n0, c39029b7), AbstractC23265l0.m67324a(c23279s0.f92240d, c28539n0, c39029b7));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C23830a.m70032g((C38266c) obj, (C34911a) obj2);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C23830a.m70033h((C38266c) obj, (C34911a) obj2);
            case 20:
                return C23830a.m70034i((C38266c) obj, (C34911a) obj2);
            case 21:
                return C23830a.m70036k((C38266c) obj, (C34911a) obj2);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C25383a.m74447k((C38266c) obj, (C34911a) obj2);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C25383a.m74448l((C38266c) obj, (C34911a) obj2);
            case 24:
                return C25383a.m74449m((C38266c) obj, (C34911a) obj2);
            case 25:
                return C25383a.m74450n((C38266c) obj, (C34911a) obj2);
            case 26:
                return C25383a.m74451o((C38266c) obj, (C34911a) obj2);
            case 27:
                return C25383a.m74453q((C38266c) obj, (C34911a) obj2);
            case 28:
                return C25383a.m74454r((C38266c) obj, (C34911a) obj2);
            default:
                return C25383a.m74455s((C38266c) obj, (C34911a) obj2);
        }
    }
}
