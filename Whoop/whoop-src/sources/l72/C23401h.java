package l72;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import com.whoop.membership.extensions.domain.models.OrderOption;
import gz0.EnumC16313m0;
import i51.C18118o;
import j72.C21399d;
import j72.C21408m;
import java.util.List;
import jc0.C21604d;
import kd1.AbstractC22403o;
import l81.AbstractC23449d;
import l81.C23450e;
import l83.InterfaceC23459e;
import lc0.AbstractC23820b;
import lc0.AbstractC23828j;
import ld0.C23842a;
import ld0.C23845d;
import ld0.C23854m;
import ld0.C23857p;
import ld0.C23858q;
import ld0.C23859r;
import ld0.C23860s;
import lf0.AbstractC23898b;
import lf0.AbstractC23899b0;
import lf0.AbstractC23904c1;
import lf0.AbstractC23917f2;
import lf0.AbstractC23918g;
import lf0.AbstractC23925h2;
import lf0.AbstractC23927i0;
import lf0.AbstractC23938l;
import lf0.AbstractC23939l0;
import lf0.AbstractC23940l1;
import lf0.AbstractC23951o0;
import lf0.AbstractC23952o1;
import lf0.AbstractC23954p;
import lf0.AbstractC23961q2;
import lf0.AbstractC23968s1;
import lf0.AbstractC23970t;
import lf0.AbstractC23971t0;
import lf0.C23908d1;
import lf0.C23922h;
import lf0.C23931j0;
import lf0.C23942m;
import lf0.C23943m0;
import lf0.C23944m1;
import lf0.C23955p0;
import lf0.C23965r2;
import lf0.C23972t1;
import lf0.C23973u;
import lg2.AbstractC24038c;
import lg2.C24037b;
import lw1.AbstractC24768d;
import lw1.AbstractC24770f;
import lw1.C24775k;
import m01.AbstractC24876d;
import m31.AbstractC24996b;
import m31.AbstractC24999e;
import m31.C24997c;
import m31.C25000f;
import p715kotlin.jvm.functions.Function1;
import p717lq2.AbstractC24677i;
import p719m22.AbstractC24949d;

/* JADX INFO: renamed from: l72.h */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C23401h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f92729E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f92730F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f92731w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f92732x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f92733y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f92734z;

    public /* synthetic */ C23401h(int i13, int i14, int i15, Object obj, Object obj2, Function1 function1) {
        this.f92731w = i15;
        this.f92730F = obj;
        this.f92733y = obj2;
        this.f92732x = function1;
        this.f92734z = i13;
        this.f92729E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f92731w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC23402i.m67774O((C21399d) this.f92730F, (Function1) this.f92732x, (Function1) this.f92733y, this.f92734z, this.f92729E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC23409p.m67902r((C21408m) this.f92730F, (Function1) this.f92732x, (Function1) this.f92733y, this.f92734z, this.f92729E, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC23449d.m68021l((C23450e) this.f92730F, (Modifier) this.f92733y, (Function1) this.f92732x, this.f92734z, this.f92729E, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC23820b.m69939n((Modifier) this.f92730F, (C21604d.b) this.f92732x, (InterfaceC4339a) this.f92733y, this.f92734z, this.f92729E, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC23828j.m69989J((String) this.f92730F, (EnumC16313m0) this.f92732x, (InterfaceC4339a) this.f92733y, this.f92734z, this.f92729E, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC23898b.m70204i((C23842a) this.f92730F, (Modifier) this.f92732x, (InterfaceC4339a) this.f92733y, this.f92734z, this.f92729E, (Composer) obj, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC23918g.m70355i((Modifier) this.f92730F, (C23922h) this.f92733y, (Function1) this.f92732x, this.f92734z, this.f92729E, (Composer) obj, iIntValue7);
            case 7:
                int iIntValue8 = ((Integer) obj2).intValue();
                return AbstractC23938l.m70475w((Modifier) this.f92730F, (C23942m) this.f92733y, (Function1) this.f92732x, this.f92734z, this.f92729E, (Composer) obj, iIntValue8);
            case 8:
                int iIntValue9 = ((Integer) obj2).intValue();
                return AbstractC23954p.m70588m((Modifier) this.f92730F, (C23845d) this.f92733y, (Function1) this.f92732x, this.f92734z, this.f92729E, (Composer) obj, iIntValue9);
            case 9:
                int iIntValue10 = ((Integer) obj2).intValue();
                return AbstractC23970t.m70646B((Modifier) this.f92730F, (C23973u) this.f92733y, (Function1) this.f92732x, this.f92734z, this.f92729E, (Composer) obj, iIntValue10);
            case 10:
                int iIntValue11 = ((Integer) obj2).intValue();
                return AbstractC23899b0.m70232t((Modifier) this.f92730F, (C23854m) this.f92733y, (Function1) this.f92732x, this.f92734z, this.f92729E, (Composer) obj, iIntValue11);
            case 11:
                int iIntValue12 = ((Integer) obj2).intValue();
                return AbstractC23927i0.m70414r((Modifier) this.f92730F, (C23931j0) this.f92733y, (Function1) this.f92732x, this.f92734z, this.f92729E, (Composer) obj, iIntValue12);
            case 12:
                int iIntValue13 = ((Integer) obj2).intValue();
                return AbstractC23939l0.m70487i((Modifier) this.f92730F, (C23943m0) this.f92733y, (Function1) this.f92732x, this.f92734z, this.f92729E, (Composer) obj, iIntValue13);
            case 13:
                int iIntValue14 = ((Integer) obj2).intValue();
                return AbstractC23951o0.m70556k((Modifier) this.f92730F, (C23955p0) this.f92733y, (Function1) this.f92732x, this.f92734z, this.f92729E, (Composer) obj, iIntValue14);
            case 14:
                int iIntValue15 = ((Integer) obj2).intValue();
                return AbstractC23971t0.m70707r((Modifier) this.f92730F, (C23857p) this.f92733y, (Function1) this.f92732x, this.f92734z, this.f92729E, (Composer) obj, iIntValue15);
            case 15:
                int iIntValue16 = ((Integer) obj2).intValue();
                return AbstractC23904c1.m70268e((Modifier) this.f92730F, (C23908d1) this.f92733y, (Function1) this.f92732x, this.f92734z, this.f92729E, (Composer) obj, iIntValue16);
            case 16:
                int iIntValue17 = ((Integer) obj2).intValue();
                return AbstractC23940l1.m70502n((Modifier) this.f92730F, (C23944m1) this.f92733y, (Function1) this.f92732x, this.f92734z, this.f92729E, (Composer) obj, iIntValue17);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                int iIntValue18 = ((Integer) obj2).intValue();
                return AbstractC23952o1.m70565i((Modifier) this.f92730F, (C23858q) this.f92733y, (Function1) this.f92732x, this.f92734z, this.f92729E, (Composer) obj, iIntValue18);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                int iIntValue19 = ((Integer) obj2).intValue();
                return AbstractC23968s1.m70636h((Modifier) this.f92730F, (C23972t1) this.f92733y, (Function1) this.f92732x, this.f92734z, this.f92729E, (Composer) obj, iIntValue19);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                int iIntValue20 = ((Integer) obj2).intValue();
                return AbstractC23917f2.m70313E((C23859r) this.f92730F, (Modifier) this.f92733y, (Function1) this.f92732x, this.f92734z, this.f92729E, (Composer) obj, iIntValue20);
            case 20:
                int iIntValue21 = ((Integer) obj2).intValue();
                return AbstractC23925h2.m70395g((Modifier) this.f92730F, (C23860s) this.f92733y, (Function1) this.f92732x, this.f92734z, this.f92729E, (Composer) obj, iIntValue21);
            case 21:
                int iIntValue22 = ((Integer) obj2).intValue();
                return AbstractC23961q2.m70617i((Modifier) this.f92730F, (C23965r2) this.f92733y, (Function1) this.f92732x, this.f92734z, this.f92729E, (Composer) obj, iIntValue22);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                int iIntValue23 = ((Integer) obj2).intValue();
                return AbstractC24038c.m70929p((Modifier) this.f92730F, (C24037b) this.f92733y, (Function1) this.f92732x, this.f92734z, this.f92729E, (Composer) obj, iIntValue23);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                int iIntValue24 = ((Integer) obj2).intValue();
                return AbstractC24677i.m72084i((AbstractC22403o) this.f92730F, (TextResource) this.f92732x, (InterfaceC4339a) this.f92733y, this.f92734z, this.f92729E, (Composer) obj, iIntValue24);
            case 24:
                int iIntValue25 = ((Integer) obj2).intValue();
                return AbstractC24768d.m72534i((Modifier) this.f92730F, (OrderOption) this.f92733y, (Function1) this.f92732x, this.f92734z, this.f92729E, (Composer) obj, iIntValue25);
            case 25:
                int iIntValue26 = ((Integer) obj2).intValue();
                return AbstractC24770f.m72569q((Modifier) this.f92730F, (C24775k) this.f92733y, (Function1) this.f92732x, this.f92734z, this.f92729E, (Composer) obj, iIntValue26);
            case 26:
                int iIntValue27 = ((Integer) obj2).intValue();
                return AbstractC24876d.m72941r((Modifier) this.f92730F, (C18118o) this.f92733y, (Function1) this.f92732x, this.f92734z, this.f92729E, (Composer) obj, iIntValue27);
            case 27:
                int iIntValue28 = ((Integer) obj2).intValue();
                return AbstractC24949d.m73128q((List) this.f92730F, (Function1) this.f92732x, (InterfaceC4339a) this.f92733y, this.f92734z, this.f92729E, (Composer) obj, iIntValue28);
            case 28:
                int iIntValue29 = ((Integer) obj2).intValue();
                return AbstractC24996b.m73324c((Modifier) this.f92730F, (C24997c) this.f92733y, (Function1) this.f92732x, this.f92734z, this.f92729E, (Composer) obj, iIntValue29);
            default:
                int iIntValue30 = ((Integer) obj2).intValue();
                return AbstractC24999e.m73335e((Modifier) this.f92730F, (C25000f) this.f92733y, (Function1) this.f92732x, this.f92734z, this.f92729E, (Composer) obj, iIntValue30);
        }
    }

    public /* synthetic */ C23401h(int i13, int i14, int i15, Object obj, Object obj2, InterfaceC23459e interfaceC23459e) {
        this.f92731w = i15;
        this.f92730F = obj;
        this.f92732x = obj2;
        this.f92733y = interfaceC23459e;
        this.f92734z = i13;
        this.f92729E = i14;
    }
}
