package eg2;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c41.C3985a0;
import com.whoop.android.R;
import ej1.C13230b;
import ev1.C13683b;
import ev2.AbstractC13712u;
import ey0.AbstractC13740g;
import f01.AbstractC13900t0;
import f01.AbstractC13908w0;
import f02.AbstractC13918d;
import fe0.AbstractC14415e;
import fg2.C14459a;
import fg2.C14460b;
import fg2.C14461c;
import fg2.C14462d;
import g40.C15349f1;
import g40.InterfaceC15421s3;
import gb1.AbstractC15675c0;
import ge0.AbstractC15730e;
import l83.C23465k;
import p040c0.InterfaceC3747i0;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: eg2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C13168a implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45619w;

    public /* synthetic */ C13168a(int i13) {
        this.f45619w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f45619w) {
            case 0:
                return C13169b.m36899q0((InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                return C13169b.m36871c0((InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 2:
                return C13169b.m36877f0((InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 3:
                return C13169b.m36883i0((InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 4:
                return C13169b.m36889l0((InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 5:
                return C13169b.m36863X((InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 6:
                return C13230b.m37143g((InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 7:
                return C13230b.m37142f((InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 8:
                return C13683b.m38606d((InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 9:
                return AbstractC13712u.m38793h0((C3985a0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 10:
                return AbstractC13712u.m38756S0((String) obj, (String) obj2, (String) obj3);
            case 11:
                return AbstractC13740g.m39050x((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 12:
                return AbstractC13900t0.m39556h((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 13:
                return AbstractC13908w0.m39608f((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 14:
                return AbstractC13918d.m39669f((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 15:
                return AbstractC14415e.m41072M((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 16:
                return AbstractC14415e.m41060A((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC14415e.m41061B((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C14459a.m41193c((InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C14460b.m41200f((InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 20:
                return C14461c.m41212l((InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 21:
                return C14461c.m41209i((InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C14461c.m41210j((InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C14461c.m41211k((InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 24:
                return C14462d.m41218c((InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 25:
                C23465k c23465k = (C23465k) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                AbstractC22676k.m65750j(c23465k, "<destruct>");
                String str = (String) c23465k.f92937w;
                boolean zBooleanValue3 = ((Boolean) c23465k.f92938x).booleanValue();
                boolean z4 = zBooleanValue2 && !zBooleanValue3;
                if ((AbstractC39414r.m125890i0(str) || zBooleanValue3 || zBooleanValue) && !z4) {
                    return null;
                }
                return new C15349f1(R.string.stripe_incomplete_phone_number, null);
            case 26:
                InterfaceC15421s3 fieldState = (InterfaceC15421s3) obj;
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue5 = ((Boolean) obj3).booleanValue();
                AbstractC22676k.m65750j(fieldState, "fieldState");
                return Boolean.valueOf(fieldState.mo43600b(zBooleanValue4, zBooleanValue5));
            case 27:
                return AbstractC15675c0.m44095e((Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 28:
                return AbstractC15730e.m44330o((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return AbstractC15730e.m44332q((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }
}
