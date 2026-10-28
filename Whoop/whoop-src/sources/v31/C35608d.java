package v31;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.PhaseLegendStyle;
import com.whoop.profile.view.components.ContextHubTileKt;
import com.whoop.profile.view.components.ContextHubTileViewState;
import com.whoop.profile.view.components.ReferralsTileKt;
import com.whoop.profile.view.components.ReferralsTileViewState;
import com.whoop.profile.view.components.StreaksTileKt;
import com.whoop.profile.view.components.StreaksTileViewState;
import kd1.AbstractC22403o;
import l83.InterfaceC23459e;
import ol0.C28013c;
import p715kotlin.jvm.functions.Function1;
import so1.AbstractC32832p;
import so1.C32806c;
import so1.C32817h0;
import so1.C32829n0;
import te0.AbstractC33749h;
import tp1.C34072l;
import ua2.C34720a;
import ue2.InterfaceC34861a;
import us2.AbstractC35225f;
import v41.AbstractC35679m0;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import v51.AbstractC35703b;
import v51.C35704c;
import v71.AbstractC35761b;
import v71.C35762c;
import ve0.AbstractC35927e;
import ve2.AbstractC35929b;
import vl0.AbstractC36101d;
import vl0.C36102e;
import vo1.AbstractC36229d;
import vo1.AbstractC36249x;
import vp1.AbstractC36272h;
import vs2.AbstractC36479e;
import vy0.AbstractC36568c0;
import vy0.C36570d0;
import w01.AbstractC36682g;
import w01.C36678c;
import w11.AbstractC36695b;
import w11.C36696c;
import w21.AbstractC36739c;
import w21.C36738b;
import w51.AbstractC36841g;
import w51.C36842h;
import wa2.AbstractC36981a;
import wo1.AbstractC37446f;
import wo1.AbstractC37451h0;
import wo1.AbstractC37461m0;
import wo1.AbstractC37467p0;
import wo1.C37440c;
import wo1.C37448g;
import wo1.C37463n0;

/* JADX INFO: renamed from: v31.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C35608d implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f151382E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f151383F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f151384w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f151385x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f151386y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f151387z;

    public /* synthetic */ C35608d(int i13, int i14, int i15, Modifier modifier, Object obj, Function1 function1) {
        this.f151384w = i15;
        this.f151382E = obj;
        this.f151385x = modifier;
        this.f151383F = function1;
        this.f151386y = i13;
        this.f151387z = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f151384w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC35610f.m112818o((Modifier) this.f151385x, (C35611g) this.f151382E, (Function1) this.f151383F, this.f151386y, this.f151387z, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC35684p.m113051l((Modifier) this.f151385x, (InterfaceC35689r0) this.f151382E, (AbstractC35679m0) this.f151383F, this.f151386y, this.f151387z, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return ContextHubTileKt.ContextHubTile$lambda$3((Modifier) this.f151385x, (ContextHubTileViewState) this.f151382E, (Function1) this.f151383F, this.f151386y, this.f151387z, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return ReferralsTileKt.ReferralsTile$lambda$3((Modifier) this.f151385x, (ReferralsTileViewState) this.f151382E, (Function1) this.f151383F, this.f151386y, this.f151387z, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return StreaksTileKt.StreaksTile$lambda$3((Modifier) this.f151385x, (StreaksTileViewState) this.f151382E, (Function1) this.f151383F, this.f151386y, this.f151387z, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC35703b.m113162q((Modifier) this.f151385x, (C35704c) this.f151382E, (Function1) this.f151383F, this.f151386y, this.f151387z, (Composer) obj, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC35761b.m113306g((Modifier) this.f151385x, (C35762c) this.f151382E, (Function1) this.f151383F, this.f151386y, this.f151387z, (Composer) obj, iIntValue7);
            case 7:
                int iIntValue8 = ((Integer) obj2).intValue();
                return AbstractC35927e.m114143h0((AbstractC33749h.e) this.f151385x, (Function1) this.f151383F, (Function1) this.f151382E, this.f151386y, this.f151387z, (Composer) obj, iIntValue8);
            case 8:
                int iIntValue9 = ((Integer) obj2).intValue();
                return AbstractC35929b.m114176m((InterfaceC34861a) this.f151385x, (Function1) this.f151383F, (Function1) this.f151382E, this.f151386y, this.f151387z, (Composer) obj, iIntValue9);
            case 9:
                int iIntValue10 = ((Integer) obj2).intValue();
                return AbstractC36101d.m114708F((Modifier) this.f151385x, (C28013c) this.f151382E, (Function1) this.f151383F, this.f151386y, this.f151387z, (Composer) obj, iIntValue10);
            case 10:
                int iIntValue11 = ((Integer) obj2).intValue();
                return AbstractC36101d.m114703A((Modifier) this.f151385x, (C36102e) this.f151382E, (Function1) this.f151383F, this.f151386y, this.f151387z, (Composer) obj, iIntValue11);
            case 11:
                int iIntValue12 = ((Integer) obj2).intValue();
                return AbstractC36229d.m115382B((AbstractC32832p) this.f151385x, (Function1) this.f151383F, (InterfaceC4339a) this.f151382E, this.f151386y, this.f151387z, (Composer) obj, iIntValue12);
            case 12:
                int iIntValue13 = ((Integer) obj2).intValue();
                return AbstractC36249x.m115643v((C32817h0) this.f151382E, (Function1) this.f151383F, (Modifier) this.f151385x, this.f151386y, this.f151387z, (Composer) obj, iIntValue13);
            case 13:
                int iIntValue14 = ((Integer) obj2).intValue();
                return AbstractC36249x.m115621S((AbstractC22403o) this.f151385x, (Function1) this.f151383F, (Function1) this.f151382E, this.f151386y, this.f151387z, (Composer) obj, iIntValue14);
            case 14:
                int iIntValue15 = ((Integer) obj2).intValue();
                return AbstractC36249x.m115611I((Modifier) this.f151385x, (TextResource) this.f151382E, (PhaseLegendStyle) this.f151383F, this.f151386y, this.f151387z, (Composer) obj, iIntValue15);
            case 15:
                int iIntValue16 = ((Integer) obj2).intValue();
                return AbstractC36272h.m115779P1((C34072l) this.f151385x, (InterfaceC4339a) this.f151382E, (InterfaceC4339a) this.f151383F, this.f151386y, this.f151387z, (Composer) obj, iIntValue16);
            case 16:
                int iIntValue17 = ((Integer) obj2).intValue();
                return AbstractC36479e.m116844F((AbstractC35225f) this.f151385x, (Function1) this.f151383F, (Function1) this.f151382E, this.f151386y, this.f151387z, (Composer) obj, iIntValue17);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                int iIntValue18 = ((Integer) obj2).intValue();
                return AbstractC36568c0.m117317v((C36570d0) this.f151382E, (Modifier) this.f151385x, (Function1) this.f151383F, this.f151386y, this.f151387z, (Composer) obj, iIntValue18);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                int iIntValue19 = ((Integer) obj2).intValue();
                return AbstractC36682g.m117754z((Modifier) this.f151385x, (C36678c) this.f151382E, (Function1) this.f151383F, this.f151386y, this.f151387z, (Composer) obj, iIntValue19);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                int iIntValue20 = ((Integer) obj2).intValue();
                return AbstractC36682g.m117722J((Modifier) this.f151385x, (String) this.f151382E, (Integer) this.f151383F, this.f151386y, this.f151387z, (Composer) obj, iIntValue20);
            case 20:
                int iIntValue21 = ((Integer) obj2).intValue();
                return AbstractC36695b.m117786w((Modifier) this.f151385x, (C36696c) this.f151382E, (Function1) this.f151383F, this.f151386y, this.f151387z, (Composer) obj, iIntValue21);
            case 21:
                int iIntValue22 = ((Integer) obj2).intValue();
                return AbstractC36739c.m117862e((Modifier) this.f151385x, (C36738b) this.f151382E, (Function1) this.f151383F, this.f151386y, this.f151387z, (Composer) obj, iIntValue22);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                int iIntValue23 = ((Integer) obj2).intValue();
                return AbstractC36739c.m117865h((C36738b.a) this.f151382E, (Modifier) this.f151385x, (Function1) this.f151383F, this.f151386y, this.f151387z, (Composer) obj, iIntValue23);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                int iIntValue24 = ((Integer) obj2).intValue();
                return AbstractC36841g.m118120n((C36842h) this.f151382E, (Modifier) this.f151385x, (Function1) this.f151383F, this.f151386y, this.f151387z, (Composer) obj, iIntValue24);
            case 24:
                int iIntValue25 = ((Integer) obj2).intValue();
                return AbstractC36981a.m118726m((C34720a) this.f151385x, (Function1) this.f151383F, (Function1) this.f151382E, this.f151386y, this.f151387z, (Composer) obj, iIntValue25);
            case 25:
                int iIntValue26 = ((Integer) obj2).intValue();
                return AbstractC37446f.m119899l((Modifier) this.f151385x, (C37448g) this.f151382E, (Function1) this.f151383F, this.f151386y, this.f151387z, (Composer) obj, iIntValue26);
            case 26:
                int iIntValue27 = ((Integer) obj2).intValue();
                return AbstractC37446f.m119896i((Modifier) this.f151385x, (C37440c) this.f151382E, (Function1) this.f151383F, this.f151386y, this.f151387z, (Composer) obj, iIntValue27);
            case 27:
                int iIntValue28 = ((Integer) obj2).intValue();
                return AbstractC37451h0.m119939q((C32806c) this.f151385x, (Function1) this.f151383F, (Function1) this.f151382E, this.f151386y, this.f151387z, (Composer) obj, iIntValue28);
            case 28:
                int iIntValue29 = ((Integer) obj2).intValue();
                return AbstractC37461m0.m120035i((Modifier) this.f151385x, (C37463n0) this.f151382E, (Function1) this.f151383F, this.f151386y, this.f151387z, (Composer) obj, iIntValue29);
            default:
                int iIntValue30 = ((Integer) obj2).intValue();
                return AbstractC37467p0.m120091w((C32829n0) this.f151385x, (Function1) this.f151383F, (Function1) this.f151382E, this.f151386y, this.f151387z, (Composer) obj, iIntValue30);
        }
    }

    public /* synthetic */ C35608d(Object obj, Object obj2, Object obj3, int i13, int i14, int i15) {
        this.f151384w = i15;
        this.f151385x = obj;
        this.f151382E = obj2;
        this.f151383F = obj3;
        this.f151386y = i13;
        this.f151387z = i14;
    }

    public /* synthetic */ C35608d(Object obj, Function1 function1, InterfaceC23459e interfaceC23459e, int i13, int i14, int i15) {
        this.f151384w = i15;
        this.f151385x = obj;
        this.f151383F = function1;
        this.f151382E = interfaceC23459e;
        this.f151386y = i13;
        this.f151387z = i14;
    }

    public /* synthetic */ C35608d(C32817h0 c32817h0, Function1 function1, Modifier modifier, int i13, int i14) {
        this.f151384w = 12;
        this.f151382E = c32817h0;
        this.f151383F = function1;
        this.f151385x = modifier;
        this.f151386y = i13;
        this.f151387z = i14;
    }
}
