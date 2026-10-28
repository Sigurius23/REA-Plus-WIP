package v11;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.profile.view.components.ContextHubTileItem;
import com.whoop.profile.view.components.ContextHubTileViewState;
import com.whoop.profile.view.components.ReferralsTileItem;
import com.whoop.profile.view.components.ReferralsTileViewState;
import com.whoop.profile.view.components.StreaksTileItem;
import com.whoop.profile.view.components.StreaksTileViewState;
import java.util.Set;
import p715kotlin.jvm.functions.Function1;
import so1.C32825l0;
import t60.C33548a;
import t60.C33550c;
import tp1.C34066f;
import v21.C35583a;
import v21.C35585c;
import v31.C35607c;
import v31.C35611g;
import v41.C35670i;
import v41.C35678m;
import v51.C35702a;
import v51.C35704c;
import v80.C35793a;
import v80.C35795c;
import v90.C35812d;
import v90.C35815g;
import v90.C35820l;
import v90.C35823o;
import v90.C35824p;
import v90.C35826r;
import v90.C35828t;
import v90.C35830v;
import vl0.C36098a;
import vl0.C36102e;
import vo1.C36250y;
import vp1.AbstractC36268d;
import w01.C36679d;
import w01.C36683h;
import w11.C36694a;
import w11.C36696c;
import w12.C36698a;
import w12.C36700c;
import w21.C36737a;
import w21.C36738b;
import w51.C36839e;
import w51.C36842h;
import w60.AbstractC36858f;
import w71.AbstractC36882f0;
import w71.C36893l;
import w71.C36894m;
import w71.C36901t;
import w71.C36902u;
import w71.C36906y;
import w80.C36940a;
import w80.C36942c;
import w90.C36951a;
import w90.C36953c;

/* JADX INFO: renamed from: v11.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C35546d implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f151218E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f151219F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f151220w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f151221x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f151222y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f151223z;

    public /* synthetic */ C35546d(Object obj, Object obj2, Object obj3, Object obj4, int i13, int i14) {
        this.f151220w = i14;
        this.f151223z = obj;
        this.f151218E = obj2;
        this.f151219F = obj3;
        this.f151221x = obj4;
        this.f151222y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f151220w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return C35547e.m112705c((C35547e) this.f151223z, (Modifier) this.f151218E, (C35552j) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC35551i.m112712F((C35544b) this.f151223z, (InterfaceC4339a) this.f151218E, (String) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return C35583a.m112772c((C35583a) this.f151223z, (Modifier) this.f151218E, (C35585c) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return C35607c.m112802c((C35607c) this.f151223z, (Modifier) this.f151218E, (C35611g) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return C35670i.m112978d((C35670i) this.f151223z, (Modifier) this.f151218E, (C35678m) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return ContextHubTileItem.Compose$lambda$0((ContextHubTileItem) this.f151223z, (Modifier) this.f151218E, (ContextHubTileViewState) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj2).intValue();
                return ReferralsTileItem.Compose$lambda$0((ReferralsTileItem) this.f151223z, (Modifier) this.f151218E, (ReferralsTileViewState) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue7);
            case 7:
                int iIntValue8 = ((Integer) obj2).intValue();
                return StreaksTileItem.Compose$lambda$0((StreaksTileItem) this.f151223z, (Modifier) this.f151218E, (StreaksTileViewState) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue8);
            case 8:
                int iIntValue9 = ((Integer) obj2).intValue();
                return C35702a.m113143d((C35702a) this.f151223z, (Modifier) this.f151218E, (C35704c) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue9);
            case 9:
                int iIntValue10 = ((Integer) obj2).intValue();
                return C35793a.m113449e((C35793a) this.f151223z, (Modifier) this.f151218E, (C35795c) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue10);
            case 10:
                int iIntValue11 = ((Integer) obj2).intValue();
                return C35812d.m113541c((C35812d) this.f151223z, (Modifier) this.f151218E, (C35815g) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue11);
            case 11:
                int iIntValue12 = ((Integer) obj2).intValue();
                return C35820l.m113613c((C35820l) this.f151223z, (Modifier) this.f151218E, (C35823o) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue12);
            case 12:
                int iIntValue13 = ((Integer) obj2).intValue();
                return C35824p.m113638c((C35824p) this.f151223z, (Modifier) this.f151218E, (C35826r) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue13);
            case 13:
                int iIntValue14 = ((Integer) obj2).intValue();
                return C35828t.m113701c((C35828t) this.f151223z, (Modifier) this.f151218E, (C35830v) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue14);
            case 14:
                int iIntValue15 = ((Integer) obj2).intValue();
                return C36098a.m114701c((C36098a) this.f151223z, (Modifier) this.f151218E, (C36102e) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue15);
            case 15:
                int iIntValue16 = ((Integer) obj2).intValue();
                return C36250y.m115651e((C36250y) this.f151223z, (Modifier) this.f151218E, (C32825l0) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue16);
            case 16:
                int iIntValue17 = ((Integer) obj2).intValue();
                return AbstractC36268d.m115731j((C34066f) this.f151223z, (Set) this.f151218E, (Function1) this.f151221x, (InterfaceC4339a) this.f151219F, this.f151222y, (Composer) obj, iIntValue17);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                int iIntValue18 = ((Integer) obj2).intValue();
                return C36679d.m117711c((C36679d) this.f151223z, (Modifier) this.f151218E, (C36683h) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue18);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                int iIntValue19 = ((Integer) obj2).intValue();
                return C36694a.m117762c((C36694a) this.f151223z, (Modifier) this.f151218E, (C36696c) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue19);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                int iIntValue20 = ((Integer) obj2).intValue();
                return C36698a.m117808c((C36698a) this.f151223z, (Modifier) this.f151218E, (C36700c) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue20);
            case 20:
                int iIntValue21 = ((Integer) obj2).intValue();
                return C36737a.m117844c((C36737a) this.f151223z, (Modifier) this.f151218E, (C36738b) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue21);
            case 21:
                int iIntValue22 = ((Integer) obj2).intValue();
                return C36839e.m118099e((C36839e) this.f151223z, (Modifier) this.f151218E, (C36842h) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue22);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                int iIntValue23 = ((Integer) obj2).intValue();
                return AbstractC36858f.m118199m((String) this.f151223z, (String) this.f151218E, (C33550c) this.f151219F, (C33548a) this.f151221x, this.f151222y, (Composer) obj, iIntValue23);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                int iIntValue24 = ((Integer) obj2).intValue();
                return C36893l.m118381F((C36893l) this.f151223z, (C36906y) this.f151218E, (AbstractC36882f0.a) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue24);
            case 24:
                int iIntValue25 = ((Integer) obj2).intValue();
                return C36893l.m118398Y((C36893l) this.f151223z, (C36906y) this.f151218E, (AbstractC36882f0.i) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue25);
            case 25:
                int iIntValue26 = ((Integer) obj2).intValue();
                return C36893l.m118439t0((C36893l) this.f151223z, (C36906y) this.f151218E, (AbstractC36882f0.h) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue26);
            case 26:
                int iIntValue27 = ((Integer) obj2).intValue();
                return C36894m.m118451e((C36894m) this.f151223z, (Modifier) this.f151218E, (C36906y) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue27);
            case 27:
                int iIntValue28 = ((Integer) obj2).intValue();
                return C36902u.m118494e((C36902u) this.f151223z, (Modifier) this.f151218E, (C36901t) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue28);
            case 28:
                int iIntValue29 = ((Integer) obj2).intValue();
                return C36940a.m118554c((C36940a) this.f151223z, (Modifier) this.f151218E, (C36942c) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue29);
            default:
                int iIntValue30 = ((Integer) obj2).intValue();
                return C36951a.m118637c((C36951a) this.f151223z, (Modifier) this.f151218E, (C36953c) this.f151219F, (Function1) this.f151221x, this.f151222y, (Composer) obj, iIntValue30);
        }
    }

    public /* synthetic */ C35546d(C34066f c34066f, Set set, Function1 function1, InterfaceC4339a interfaceC4339a, int i13) {
        this.f151220w = 16;
        this.f151223z = c34066f;
        this.f151218E = set;
        this.f151221x = function1;
        this.f151219F = interfaceC4339a;
        this.f151222y = i13;
    }
}
