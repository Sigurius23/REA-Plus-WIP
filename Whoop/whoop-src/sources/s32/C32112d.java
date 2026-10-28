package s32;

import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.view.BecsDebitBsbEditText;
import com.stripe.android.view.CardNumberEditText;
import com.stripe.android.view.CountryTextInputLayout;
import com.whoop.design.models.items.targetrecommendation.TargetRecommendationWidgetModel;
import j93.InterfaceC21493z;
import java.util.List;
import jb1.C21536b;
import kd0.InterfaceC22381a;
import l83.C23454a0;
import p208i2.InterfaceC17886g0;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.C25308q;
import qa0.InterfaceC30109a;
import qc0.InterfaceC30214a;
import s51.AbstractC32210g;
import s71.AbstractC32240b;
import s81.AbstractC32264g;
import s90.AbstractC32291g;
import sa0.AbstractC32325b;
import sb0.C32345f;
import sc0.AbstractC32357e;
import sc0.AbstractC32359g;
import sc0.AbstractC32360h;
import sc1.AbstractC32361a;
import y00.C38870j6;
import y00.EnumC38853i;

/* JADX INFO: renamed from: s32.d */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C32112d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133122w;

    public /* synthetic */ C32112d(int i13) {
        this.f133122w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f133122w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                return AbstractC32114f.m99968q(obj);
            case 1:
                int i14 = BecsDebitBsbEditText.f22466b0;
                return c23454a0;
            case 2:
                EnumC38853i it = (EnumC38853i) obj;
                int i15 = CardNumberEditText.f22507p0;
                AbstractC22676k.m65750j(it, "it");
                return c23454a0;
            case 3:
                EnumC38853i it3 = (EnumC38853i) obj;
                int i16 = CardNumberEditText.f22507p0;
                AbstractC22676k.m65750j(it3, "it");
                return c23454a0;
            case 4:
                List it4 = (List) obj;
                int i17 = CardNumberEditText.f22507p0;
                AbstractC22676k.m65750j(it4, "it");
                return c23454a0;
            case 5:
                ((Boolean) obj).getClass();
                int i18 = CardNumberEditText.f22507p0;
                return c23454a0;
            case 6:
                Country it5 = (Country) obj;
                InterfaceC21493z[] interfaceC21493zArr = CountryTextInputLayout.f22528k1;
                AbstractC22676k.m65750j(it5, "it");
                return c23454a0;
            case 7:
                CountryCode it6 = (CountryCode) obj;
                InterfaceC21493z[] interfaceC21493zArr2 = CountryTextInputLayout.f22528k1;
                AbstractC22676k.m65750j(it6, "it");
                return c23454a0;
            case 8:
                C38870j6 it7 = (C38870j6) obj;
                AbstractC22676k.m65750j(it7, "it");
                return c23454a0;
            case 9:
                return AbstractC32210g.m100195h(obj);
            case 10:
                return AbstractC32210g.m100201n((InterfaceC22129c) obj);
            case 11:
                return AbstractC32240b.m100315d(obj);
            case 12:
                return AbstractC32264g.m100406j(obj);
            case 13:
                return AbstractC32291g.m100514z((Modifier) obj);
            case 14:
                return AbstractC32291g.m100477A((Modifier) obj);
            case 15:
                return AbstractC32291g.m100480D((Modifier) obj);
            case 16:
                return AbstractC32291g.m100485I((InterfaceC22131e) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC32291g.m100486J((InterfaceC17886g0) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC32325b.m100600m((InterfaceC30109a) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC32325b.m100601n((InterfaceC22381a.c) obj);
            case 20:
                return AbstractC32325b.m100606s((InterfaceC22381a.c) obj);
            case 21:
                return AbstractC32325b.m100607t((InterfaceC30109a) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C32345f.m100662b((C21536b) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC32357e.m100736l((InterfaceC30214a) obj);
            case 24:
                return AbstractC32359g.m100752k((InterfaceC30214a) obj);
            case 25:
                return AbstractC32359g.m100759r(obj);
            case 26:
                return AbstractC32359g.m100760s((C25308q) obj);
            case 27:
                return AbstractC32360h.m100777p((InterfaceC30214a) obj);
            case 28:
                return AbstractC32361a.m100786g((C23749z0) obj);
            default:
                return AbstractC32361a.m100787h((TargetRecommendationWidgetModel) obj);
        }
    }
}
