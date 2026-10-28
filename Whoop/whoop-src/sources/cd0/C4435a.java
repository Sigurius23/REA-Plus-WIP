package cd0;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import ci0.AbstractC4729d;
import ck1.AbstractC4783f;
import com.whoop.profile.view.ProfileScreenKt;
import h60.AbstractC16978g;
import he1.AbstractC17212a;
import l83.C23454a0;
import le0.AbstractC23873b;
import nw0.AbstractC27208o;
import nx1.AbstractC27226h;
import o42.AbstractC27531k;
import p390p1.AbstractC28683x;
import p460rg.AbstractC31366a;
import p715kotlin.jvm.functions.Function1;
import pp2.AbstractC29444h;
import vs2.AbstractC36479e;
import z50.AbstractC40088d;
import z51.AbstractC40097h;

/* JADX INFO: renamed from: cd0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4435a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17909w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f17910x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f17911y;

    public /* synthetic */ C4435a(Function1 function1, int i13, int i14) {
        this.f17909w = i14;
        this.f17910x = function1;
        this.f17911y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f17909w) {
            case 0:
                int iIntValue = num.intValue();
                return AbstractC4436b.m13880h(this.f17910x, this.f17911y, composer, iIntValue);
            case 1:
                int iIntValue2 = num.intValue();
                return p701ce2.Function1.m14080F(this.f17910x, this.f17911y, composer, iIntValue2);
            case 2:
                int iIntValue3 = num.intValue();
                return AbstractC4729d.m14800r(this.f17910x, this.f17911y, composer, iIntValue3);
            case 3:
                int iIntValue4 = num.intValue();
                return AbstractC4783f.m15063k(this.f17910x, this.f17911y, composer, iIntValue4);
            case 4:
                int iIntValue5 = num.intValue();
                return ProfileScreenKt.ProfileOverflowMenu$lambda$4(this.f17910x, this.f17911y, composer, iIntValue5);
            case 5:
                int iIntValue6 = num.intValue();
                return ProfileScreenKt.SettingsIcon$lambda$1(this.f17910x, this.f17911y, composer, iIntValue6);
            case 6:
                int iIntValue7 = num.intValue();
                return AbstractC16978g.m47785x(this.f17910x, this.f17911y, composer, iIntValue7);
            case 7:
                int iIntValue8 = num.intValue();
                return AbstractC17212a.m48651z(this.f17910x, this.f17911y, composer, iIntValue8);
            case 8:
                int iIntValue9 = num.intValue();
                return p709he2.Function1.m48698L(this.f17910x, this.f17911y, composer, iIntValue9);
            case 9:
                int iIntValue10 = num.intValue();
                return AbstractC23873b.m70142r(this.f17910x, this.f17911y, composer, iIntValue10);
            case 10:
                int iIntValue11 = num.intValue();
                return p722ne2.Function1.m79138t(this.f17910x, this.f17911y, composer, iIntValue11);
            case 11:
                int iIntValue12 = num.intValue();
                return AbstractC27208o.m81898J(this.f17910x, this.f17911y, composer, iIntValue12);
            case 12:
                int iIntValue13 = num.intValue();
                return AbstractC27226h.m82024o(this.f17910x, this.f17911y, composer, iIntValue13);
            case 13:
                int iIntValue14 = num.intValue();
                return AbstractC27531k.m82989W(this.f17910x, this.f17911y, composer, iIntValue14);
            case 14:
                int iIntValue15 = num.intValue();
                return p725ot1.Function1.m85806R(this.f17910x, this.f17911y, composer, iIntValue15);
            case 15:
                int iIntValue16 = num.intValue();
                return AbstractC29444h.m89875x(this.f17910x, this.f17911y, composer, iIntValue16);
            case 16:
                int iIntValue17 = num.intValue();
                return p733ry2.Function1.m99291m(this.f17910x, this.f17911y, composer, iIntValue17);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                int iIntValue18 = num.intValue();
                return p735ss0.Function1.m104023i(this.f17910x, this.f17911y, composer, iIntValue18);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                num.intValue();
                AbstractC31366a.m96467g(this.f17910x, composer, AbstractC28683x.m87244L(this.f17911y | 1));
                return C23454a0.f92919a;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                int iIntValue19 = num.intValue();
                return AbstractC36479e.m116847I(this.f17910x, this.f17911y, composer, iIntValue19);
            case 20:
                int iIntValue20 = num.intValue();
                return p744wt1.Function1.m120879r(this.f17910x, this.f17911y, composer, iIntValue20);
            case 21:
                int iIntValue21 = num.intValue();
                return AbstractC40088d.m128481D(this.f17910x, this.f17911y, composer, iIntValue21);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                int iIntValue22 = num.intValue();
                return AbstractC40097h.m128563M(this.f17910x, this.f17911y, composer, iIntValue22);
            default:
                int iIntValue23 = num.intValue();
                return p748zc1.Function1.m129619k(this.f17910x, this.f17911y, composer, iIntValue23);
        }
    }
}
