package bf0;

import af3.C0826c;
import af3.C0846v;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import bc0.AbstractC2980c;
import bg0.AbstractC3227i;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.avatar.PhotoSourceActionSheetKt;
import com.whoop.profile.view.edit.form.HeightWeightGroupedField;
import com.whoop.profile.view.edit.form.HeightWeightGroupedFormFieldKt;
import cp1.C11016c;
import cp1.C11028o;
import dc0.AbstractC11903e;
import ep1.AbstractC13410e;
import ep1.AbstractC13422q;
import g21.AbstractC15280b;
import g22.InterfaceC15282b;
import g40.C15341e;
import g40.C15440w2;
import g40.InterfaceC15361h1;
import g40.InterfaceC15391m3;
import g40.InterfaceC15450y2;
import hy0.AbstractC17722a1;
import i22.AbstractC18015c;
import ik1.AbstractC18611h;
import ik2.C18614b;
import iz0.AbstractC21048g;
import iz0.C21054m;
import iz0.EnumC21051j;
import iz0.EnumC21052k;
import j72.AbstractC21405j;
import j72.C21396a;
import java.util.List;
import java.util.Set;
import jk2.AbstractC21762c;
import k71.AbstractC22269z;
import kd0.C22383c;
import kf0.AbstractC22431f;
import kk1.AbstractC22546g;
import kw1.AbstractC22853d;
import l51.AbstractC23354d;
import l51.C23357g;
import l72.AbstractC23396c;
import l72.AbstractC23408o;
import l83.C23454a0;
import l83.InterfaceC23459e;
import m80.AbstractC25219a;
import n00.EnumC26076d;
import n51.AbstractC26300g;
import n51.C26294a;
import p11.AbstractC28704e;
import p11.C28705f;
import p132f0.C13821r1;
import p163g1.AbstractC15002f0;
import p164g2.C15247s;
import p291l0.InterfaceC22965i;
import p291l0.InterfaceC22973k1;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p477s2.AbstractC32073e;
import p547v8.AbstractC35785b;
import p602x1.C37816b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import se.AbstractC32410a;
import ug.AbstractC34924m;
import yf0.C39509a;
import yf0.C39511c;
import ze0.AbstractC40584c;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: bf0.g */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C3195g implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f12513E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f12514F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f12515G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f12516H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12517w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f12518x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f12519y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f12520z;

    public /* synthetic */ C3195g(Object obj, Object obj2, Object obj3, Object obj4, boolean z4, int i13, int i14, int i15) {
        this.f12517w = i15;
        this.f12516H = obj;
        this.f12518x = obj2;
        this.f12520z = obj3;
        this.f12513E = obj4;
        this.f12519y = z4;
        this.f12514F = i13;
        this.f12515G = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12517w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC3199k.m9208K((AbstractC40584c.e) this.f12516H, (InterfaceC41070a) this.f12518x, this.f12519y, (Function1) this.f12520z, (Function1) this.f12513E, this.f12514F, this.f12515G, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC3199k.m9234z((AbstractC40584c) this.f12516H, (InterfaceC41070a) this.f12518x, this.f12519y, (Function1) this.f12520z, (Function1) this.f12513E, this.f12514F, this.f12515G, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC3227i.m9324j((String) this.f12516H, (String) this.f12518x, (C39511c) this.f12520z, (C39509a) this.f12513E, this.f12519y, this.f12514F, this.f12515G, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return PhotoSourceActionSheetKt.PhotoSourceActionSheet$lambda$1((InterfaceC4339a) this.f12516H, (InterfaceC4339a) this.f12518x, (InterfaceC4339a) this.f12520z, this.f12519y, (InterfaceC4339a) this.f12513E, this.f12514F, this.f12515G, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return HeightWeightGroupedFormFieldKt.HeightWeightGroupedFormField$lambda$5((Modifier) this.f12516H, (HeightWeightGroupedField) this.f12518x, (InterfaceC4351m) this.f12513E, (Function1) this.f12520z, this.f12519y, this.f12514F, this.f12515G, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC11903e.m32034o((AbstractC2980c.d) this.f12516H, (InterfaceC41070a) this.f12518x, this.f12519y, (Function1) this.f12520z, (Function1) this.f12513E, this.f12514F, this.f12515G, (Composer) obj, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC13410e.m37928e((C11016c) this.f12516H, (TextResource) this.f12518x, (Modifier) this.f12520z, this.f12519y, (InterfaceC4339a) this.f12513E, this.f12514F, this.f12515G, (Composer) obj, iIntValue7);
            case 7:
                int iIntValue8 = ((Integer) obj2).intValue();
                return AbstractC13422q.m38031S((C11028o) this.f12516H, (InterfaceC4339a) this.f12518x, (Function1) this.f12520z, (Function1) this.f12513E, this.f12519y, this.f12514F, this.f12515G, (Composer) obj, iIntValue8);
            case 8:
                ((Integer) obj2).getClass();
                AbstractC15002f0.m43106b((InterfaceC4339a) this.f12516H, (Modifier) this.f12518x, this.f12519y, (InterfaceC22973k1) this.f12520z, (Function3) this.f12513E, (Composer) obj, AbstractC28683x.m87244L(this.f12514F | 1), this.f12515G);
                return C23454a0.f92919a;
            case 9:
                int iIntValue9 = ((Integer) obj2).intValue();
                return AbstractC15280b.m43377g((List) this.f12516H, (Integer) this.f12518x, this.f12519y, (InterfaceC22965i) this.f12513E, (Function1) this.f12520z, this.f12514F, this.f12515G, (Composer) obj, iIntValue9);
            case 10:
                ((Integer) obj2).getClass();
                AbstractC35785b.m113406b(this.f12519y, (C15341e) this.f12516H, (Set) this.f12518x, (IdentifierSpec) this.f12520z, (Modifier) this.f12513E, (Composer) obj, AbstractC28683x.m87244L(this.f12514F | 1), this.f12515G);
                return C23454a0.f92919a;
            case 11:
                ((Integer) obj2).getClass();
                AbstractC22674j.m65730p(this.f12519y, (C15440w2) this.f12516H, (Set) this.f12518x, (IdentifierSpec) this.f12520z, (Modifier) this.f12513E, (Composer) obj, AbstractC28683x.m87244L(this.f12514F | 1), this.f12515G);
                return C23454a0.f92919a;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC32073e.m99745g(this.f12519y, (InterfaceC15450y2) this.f12516H, (Modifier) this.f12518x, (Set) this.f12520z, (IdentifierSpec) this.f12513E, (Composer) obj, AbstractC28683x.m87244L(this.f12514F | 1), this.f12515G);
                return C23454a0.f92919a;
            case 13:
                ((Integer) obj2).getClass();
                AbstractC32410a.m101045o((InterfaceC41211c) this.f12516H, (InterfaceC15361h1) this.f12518x, (Modifier) this.f12520z, this.f12519y, (C37816b) this.f12513E, (Composer) obj, AbstractC28683x.m87244L(this.f12514F | 1), this.f12515G);
                return C23454a0.f92919a;
            case 14:
                int iIntValue10 = ((Integer) obj2).intValue();
                return AbstractC17722a1.m50721g((Modifier) this.f12516H, (String) this.f12518x, (String) this.f12520z, this.f12519y, (InterfaceC4339a) this.f12513E, this.f12514F, this.f12515G, (Composer) obj, iIntValue10);
            case 15:
                int iIntValue11 = ((Integer) obj2).intValue();
                return AbstractC18015c.m51739T((InterfaceC15282b.c) this.f12516H, this.f12519y, (InterfaceC4351m) this.f12518x, (InterfaceC4339a) this.f12520z, (InterfaceC4339a) this.f12513E, this.f12514F, this.f12515G, (Composer) obj, iIntValue11);
            case 16:
                int iIntValue12 = ((Integer) obj2).intValue();
                return AbstractC21048g.m58832f0((C0846v) this.f12516H, (EnumC21051j) this.f12518x, (C21054m) this.f12513E, (Function1) this.f12520z, this.f12519y, this.f12514F, this.f12515G, (Composer) obj, iIntValue12);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                int iIntValue13 = ((Integer) obj2).intValue();
                return AbstractC21048g.m58815U((C0826c) this.f12516H, (EnumC21052k) this.f12518x, (C21054m) this.f12513E, (Function1) this.f12520z, this.f12519y, this.f12514F, this.f12515G, (Composer) obj, iIntValue13);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(1);
                AbstractC34924m.m110140a(this.f12519y, (InterfaceC15391m3) this.f12516H, (EnumC26076d) this.f12518x, this.f12514F, (C15247s) this.f12520z, (InterfaceC4351m) this.f12513E, (Composer) obj, iM87244L, this.f12515G);
                return C23454a0.f92919a;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                int iIntValue14 = ((Integer) obj2).intValue();
                return AbstractC21762c.m61460i((C18614b) this.f12516H, (InterfaceC4339a) this.f12518x, (InterfaceC4339a) this.f12520z, (InterfaceC4339a) this.f12513E, this.f12519y, this.f12514F, this.f12515G, (Composer) obj, iIntValue14);
            case 20:
                int iIntValue15 = ((Integer) obj2).intValue();
                return AbstractC22269z.m63959a0((TextResource) this.f12516H, (TextResource) this.f12518x, (InterfaceC39332e) this.f12520z, (TextResource) this.f12513E, this.f12519y, this.f12514F, this.f12515G, (Composer) obj, iIntValue15);
            case 21:
                int iIntValue16 = ((Integer) obj2).intValue();
                return AbstractC22431f.m64635J((String) this.f12516H, (C22383c.g) this.f12518x, (Function1) this.f12520z, (C13821r1) this.f12513E, this.f12519y, this.f12514F, this.f12515G, (Composer) obj, iIntValue16);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                int iIntValue17 = ((Integer) obj2).intValue();
                return AbstractC22546g.m65246m0((AbstractC18611h.c) this.f12516H, this.f12519y, (Function1) this.f12520z, (Function1) this.f12513E, (Function1) this.f12518x, this.f12514F, this.f12515G, (Composer) obj, iIntValue17);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                int iIntValue18 = ((Integer) obj2).intValue();
                return AbstractC22853d.m66297J((String) this.f12516H, this.f12519y, (String) this.f12518x, (String) this.f12520z, (InterfaceC4339a) this.f12513E, this.f12514F, this.f12515G, (Composer) obj, iIntValue18);
            case 24:
                int iIntValue19 = ((Integer) obj2).intValue();
                return AbstractC23354d.m67615m((Modifier) this.f12516H, (C23357g) this.f12518x, (Function1) this.f12520z, (Modifier) this.f12513E, this.f12519y, this.f12514F, this.f12515G, (Composer) obj, iIntValue19);
            case 25:
                int iIntValue20 = ((Integer) obj2).intValue();
                return AbstractC23396c.m67713F((C21396a) this.f12516H, (Function1) this.f12520z, (Function1) this.f12513E, (Function1) this.f12518x, this.f12519y, this.f12514F, this.f12515G, (Composer) obj, iIntValue20);
            case 26:
                int iIntValue21 = ((Integer) obj2).intValue();
                return AbstractC23408o.m67846g0((AbstractC21405j) this.f12516H, (Function1) this.f12520z, (Function1) this.f12513E, (Function1) this.f12518x, this.f12519y, this.f12514F, this.f12515G, (Composer) obj, iIntValue21);
            case 27:
                int iIntValue22 = ((Integer) obj2).intValue();
                return AbstractC25219a.m73857m((TextResource) this.f12516H, this.f12519y, (Function1) this.f12520z, (Function1) this.f12513E, (Function1) this.f12518x, this.f12514F, this.f12515G, (Composer) obj, iIntValue22);
            case 28:
                int iIntValue23 = ((Integer) obj2).intValue();
                return AbstractC26300g.m78042h((InterfaceC23013y) this.f12516H, (C26294a) this.f12518x, this.f12514F, this.f12519y, (InterfaceC25312u) this.f12513E, (Function1) this.f12520z, this.f12515G, (Composer) obj, iIntValue23);
            default:
                int iIntValue24 = ((Integer) obj2).intValue();
                return AbstractC28704e.m87303A((Modifier) this.f12516H, (C28705f) this.f12518x, this.f12519y, (InterfaceC4339a) this.f12513E, (Function1) this.f12520z, this.f12514F, this.f12515G, (Composer) obj, iIntValue24);
        }
    }

    public /* synthetic */ C3195g(Object obj, Object obj2, Object obj3, Function1 function1, boolean z4, int i13, int i14, int i15) {
        this.f12517w = i15;
        this.f12516H = obj;
        this.f12518x = obj2;
        this.f12513E = obj3;
        this.f12520z = function1;
        this.f12519y = z4;
        this.f12514F = i13;
        this.f12515G = i14;
    }

    public /* synthetic */ C3195g(Object obj, Object obj2, Object obj3, boolean z4, InterfaceC23459e interfaceC23459e, int i13, int i14, int i15) {
        this.f12517w = i15;
        this.f12516H = obj;
        this.f12518x = obj2;
        this.f12520z = obj3;
        this.f12519y = z4;
        this.f12513E = interfaceC23459e;
        this.f12514F = i13;
        this.f12515G = i14;
    }

    public /* synthetic */ C3195g(Object obj, Object obj2, boolean z4, Object obj3, Function1 function1, int i13, int i14, int i15) {
        this.f12517w = i15;
        this.f12516H = obj;
        this.f12518x = obj2;
        this.f12519y = z4;
        this.f12513E = obj3;
        this.f12520z = function1;
        this.f12514F = i13;
        this.f12515G = i14;
    }

    public /* synthetic */ C3195g(Object obj, Object obj2, boolean z4, Object obj3, InterfaceC23459e interfaceC23459e, int i13, int i14, int i15) {
        this.f12517w = i15;
        this.f12516H = obj;
        this.f12518x = obj2;
        this.f12519y = z4;
        this.f12520z = obj3;
        this.f12513E = interfaceC23459e;
        this.f12514F = i13;
        this.f12515G = i14;
    }

    public /* synthetic */ C3195g(Object obj, Function1 function1, Function1 function2, Function1 function3, boolean z4, int i13, int i14, int i15) {
        this.f12517w = i15;
        this.f12516H = obj;
        this.f12520z = function1;
        this.f12513E = function2;
        this.f12518x = function3;
        this.f12519y = z4;
        this.f12514F = i13;
        this.f12515G = i14;
    }

    public /* synthetic */ C3195g(Object obj, boolean z4, Object obj2, Object obj3, InterfaceC4339a interfaceC4339a, int i13, int i14, int i15) {
        this.f12517w = i15;
        this.f12516H = obj;
        this.f12519y = z4;
        this.f12518x = obj2;
        this.f12520z = obj3;
        this.f12513E = interfaceC4339a;
        this.f12514F = i13;
        this.f12515G = i14;
    }

    public /* synthetic */ C3195g(Object obj, boolean z4, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, int i15) {
        this.f12517w = i15;
        this.f12516H = obj;
        this.f12519y = z4;
        this.f12520z = function1;
        this.f12513E = function2;
        this.f12518x = function3;
        this.f12514F = i13;
        this.f12515G = i14;
    }

    public /* synthetic */ C3195g(InterfaceC23013y interfaceC23013y, C26294a c26294a, int i13, boolean z4, InterfaceC25312u interfaceC25312u, Function1 function1, int i14) {
        this.f12517w = 28;
        this.f12516H = interfaceC23013y;
        this.f12518x = c26294a;
        this.f12514F = i13;
        this.f12519y = z4;
        this.f12513E = interfaceC25312u;
        this.f12520z = function1;
        this.f12515G = i14;
    }

    public /* synthetic */ C3195g(boolean z4, InterfaceC15391m3 interfaceC15391m3, EnumC26076d enumC26076d, int i13, C15247s c15247s, InterfaceC4351m interfaceC4351m, int i14, int i15) {
        this.f12517w = 18;
        this.f12519y = z4;
        this.f12516H = interfaceC15391m3;
        this.f12518x = enumC26076d;
        this.f12514F = i13;
        this.f12520z = c15247s;
        this.f12513E = interfaceC4351m;
        this.f12515G = i15;
    }

    public /* synthetic */ C3195g(boolean z4, Object obj, Object obj2, Object obj3, Object obj4, int i13, int i14, int i15) {
        this.f12517w = i15;
        this.f12519y = z4;
        this.f12516H = obj;
        this.f12518x = obj2;
        this.f12520z = obj3;
        this.f12513E = obj4;
        this.f12514F = i13;
        this.f12515G = i14;
    }
}
