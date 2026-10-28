package j21;

import a00.C0072g;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.membership.extensions.domain.models.OrderOption;
import com.whoop.payments.domain.models.Card;
import com.whoop.trackactivity.domain.SessionTargetsFetcher;
import gr1.C16095b;
import gr1.C16111r;
import hy0.C17723a2;
import iw1.InterfaceC20996b;
import j02.C21148j;
import j72.AbstractC21405j;
import java.util.ArrayList;
import jr1.AbstractC21896d;
import k00.InterfaceC22088a;
import k11.AbstractC22121d;
import k11.C22123f;
import kd1.AbstractC22390d;
import kd1.AbstractC22403o;
import kd1.AbstractC22405q;
import kr1.AbstractC22811d;
import kw1.AbstractC22853d;
import l21.AbstractC23238b;
import l21.C23239c;
import l72.AbstractC23408o;
import l83.C23454a0;
import ld0.C23847f;
import lf0.AbstractC23917f2;
import lf0.AbstractC23918g;
import lf0.AbstractC23939l0;
import lf0.AbstractC23961q2;
import lf0.AbstractC23968s1;
import lf0.C23922h;
import lf0.C23943m0;
import lf0.C23965r2;
import lf0.C23972t1;
import lw2.C24778c;
import lw2.C24779d;
import m62.InterfaceC25116g;
import m83.AbstractC25265s;
import mm1.AbstractC25688b;
import mm1.AbstractC25695i;
import mm1.C25689c;
import mm1.C25697k;
import mw0.AbstractC25976d;
import mx1.AbstractC26007m;
import n71.AbstractC26434o;
import n71.C26436q;
import nk1.AbstractC26797c;
import nk1.C26798d;
import nw0.AbstractC27203j;
import ow2.AbstractC28443f;
import ox2.AbstractC28463i;
import p078d1.C11457j;
import p268k0.AbstractC22086a;
import p291l0.InterfaceC22965i;
import p292l1.C23116j1;
import p353o0.C27317b;
import p389p0.C28506a0;
import p389p0.C28515d0;
import p389p0.InterfaceC28512c0;
import p390p1.AbstractC28659r;
import p390p1.AbstractC28683x;
import p390p1.C28594a2;
import p390p1.C28626i2;
import p390p1.C28643n;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28623i;
import p602x1.C37822h;
import p62.AbstractC28942c;
import p635y2.InterfaceC39140v1;
import p636y3.C39169a;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import px2.AbstractC29607j;
import se.AbstractC32411b;

/* JADX INFO: renamed from: j21.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C21245d implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f81104w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f81105x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f81106y;

    public /* synthetic */ C21245d(int i13, Object obj, Object obj2) {
        this.f81104w = i13;
        this.f81106y = obj;
        this.f81105x = obj2;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f81104w) {
            case 0:
                return AbstractC21246e.m59572f((C21250i) this.f81106y, (Function1) this.f81105x, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return AbstractC21896d.m62189Q((Function1) this.f81105x, (C16095b) this.f81106y, (String) obj, ((Boolean) obj2).booleanValue());
            case 2:
                ((Integer) obj2).getClass();
                AbstractC32411b.m101099k((InterfaceC22088a) this.f81106y, (Modifier) this.f81105x, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 3:
                return AbstractC22121d.m63333j((C22123f) this.f81106y, (Function1) this.f81105x, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                return AbstractC22390d.m64431w((InterfaceC28601c1) this.f81106y, (C21148j) this.f81105x, (Composer) obj, ((Integer) obj2).intValue());
            case 5:
                return AbstractC22405q.m64509f((InterfaceC4339a) this.f81106y, (AbstractC22403o) this.f81105x, (Composer) obj, ((Integer) obj2).intValue());
            case 6:
                return AbstractC22811d.m66069f((C16111r) this.f81106y, (InterfaceC4351m) this.f81105x, (Composer) obj, ((Integer) obj2).intValue());
            case 7:
                return AbstractC22853d.m66291D((InterfaceC20996b) this.f81106y, (Function1) this.f81105x, ((Integer) obj).intValue(), (OrderOption) obj2);
            case 8:
                ((Integer) obj2).getClass();
                ((C23116j1) this.f81106y).m67094a((C0072g) this.f81105x, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 9:
                return AbstractC23238b.m67277g((C23239c) this.f81106y, (Function1) this.f81105x, (Composer) obj, ((Integer) obj2).intValue());
            case 10:
                return AbstractC23408o.m67828V((AbstractC21405j) this.f81106y, (Function1) this.f81105x, (Composer) obj, ((Integer) obj2).intValue());
            case 11:
                return AbstractC23918g.m70353g((C23922h) this.f81106y, (Function1) this.f81105x, (Composer) obj, ((Integer) obj2).intValue());
            case 12:
                return AbstractC23939l0.m70485g((C23943m0) this.f81106y, (Function1) this.f81105x, (Composer) obj, ((Integer) obj2).intValue());
            case 13:
                return AbstractC23968s1.m70634f((C23972t1) this.f81106y, (Function1) this.f81105x, (Composer) obj, ((Integer) obj2).intValue());
            case 14:
                return AbstractC23917f2.m70335o((InterfaceC4339a) this.f81106y, (C23847f) this.f81105x, (Composer) obj, ((Integer) obj2).intValue());
            case 15:
                return AbstractC23961q2.m70615g((C23965r2) this.f81106y, (Function1) this.f81105x, (Composer) obj, ((Integer) obj2).intValue());
            case 16:
                return SessionTargetsFetcher.m26504e((SessionTargetsFetcher) this.f81106y, (String) this.f81105x, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC25688b.m75645i((C25689c) this.f81106y, (Function1) this.f81105x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC25695i.m75684i((C25697k) this.f81106y, (Function1) this.f81105x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC26007m.m77250h0((Card) this.f81106y, (Function1) this.f81105x, ((Boolean) obj).booleanValue(), (Card) obj2);
            case 20:
                ((Integer) obj2).getClass();
                AbstractC32411b.m101093f((String) this.f81106y, (Function1) this.f81105x, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 21:
                return AbstractC26434o.m78210I((Modifier) this.f81106y, (C26436q) this.f81105x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC26797c.m79863t((String) this.f81106y, (C26798d) this.f81105x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC27203j.m81851R((AbstractC25976d.d) this.f81106y, (C17723a2) this.f81105x, (Composer) obj, ((Integer) obj2).intValue());
            case 24:
                C27317b c27317b = (C27317b) this.f81106y;
                InterfaceC22965i interfaceC22965i = (InterfaceC22965i) this.f81105x;
                InterfaceC39171c interfaceC39171c = (InterfaceC39171c) obj;
                C39169a c39169a = (C39169a) obj2;
                if (C39169a.m124765i(c39169a.f168407a) == Integer.MAX_VALUE) {
                    AbstractC22086a.m63158a("LazyVerticalGrid's width should be bound by parent.");
                }
                int iM124765i = C39169a.m124765i(c39169a.f168407a);
                int iMo724F = interfaceC39171c.mo724F(interfaceC22965i.mo66735a());
                int i13 = c27317b.f109385a;
                int i14 = iM124765i - ((i13 - 1) * iMo724F);
                int i15 = i14 / i13;
                int i16 = i14 % i13;
                ArrayList arrayList = new ArrayList(i13);
                int i17 = 0;
                while (i17 < i13) {
                    arrayList.add(Integer.valueOf((i17 < i16 ? 1 : 0) + i15));
                    i17++;
                }
                int[] iArrM74091C1 = AbstractC25265s.m74091C1(arrayList);
                int[] iArr = new int[iArrM74091C1.length];
                interfaceC22965i.mo66713c(interfaceC39171c, iM124765i, iArrM74091C1, EnumC39181m.f168423w, iArr);
                return new C11457j(23, iArrM74091C1, iArr);
            case 25:
                return AbstractC28443f.m86203x((C24779d) this.f81106y, (C24778c) this.f81105x, (Composer) obj, ((Integer) obj2).intValue());
            case 26:
                return AbstractC28463i.m86377h((AbstractC29607j) this.f81106y, (Function1) this.f81105x, (Composer) obj, ((Integer) obj2).intValue());
            case 27:
                return ((InterfaceC28512c0) this.f81105x).mo77535a(new C28515d0((C28506a0) this.f81106y, (InterfaceC39140v1) obj), ((C39169a) obj2).f168407a);
            case 28:
                C37822h c37822h = (C37822h) this.f81106y;
                C28626i2 c28626i2 = (C28626i2) this.f81105x;
                int iIntValue = ((Integer) obj).intValue();
                if (obj2 instanceof InterfaceC28623i) {
                    c37822h.f161973f.m94885b((InterfaceC28623i) obj2);
                } else if (obj2 instanceof C28594a2) {
                    C28594a2 c28594a2 = (C28594a2) obj2;
                    if (!(c28594a2.f115707a instanceof C28643n)) {
                        AbstractC28659r.m87196g(c28626i2, iIntValue, obj2);
                        c37822h.m121354e(c28594a2);
                    }
                } else if (obj2 instanceof C28677v1) {
                    AbstractC28659r.m87196g(c28626i2, iIntValue, obj2);
                    ((C28677v1) obj2).m87203d();
                }
                return C23454a0.f92919a;
            default:
                return AbstractC28942c.m87871g((InterfaceC25116g.c) this.f81106y, (Function1) this.f81105x, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C21245d(Object obj, Object obj2, int i13, int i14) {
        this.f81104w = i14;
        this.f81106y = obj;
        this.f81105x = obj2;
    }

    public /* synthetic */ C21245d(Function1 function1, C16095b c16095b) {
        this.f81104w = 1;
        this.f81105x = function1;
        this.f81106y = c16095b;
    }
}
