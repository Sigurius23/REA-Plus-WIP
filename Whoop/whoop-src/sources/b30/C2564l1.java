package b30;

import androidx.health.platform.client.proto.C1533u;
import b90.AbstractC2884f;
import com.whoop.profile.view.edit.EditProfileFieldsContentKt;
import l83.C23454a0;
import m80.AbstractC25222d;
import m90.AbstractC25285b;
import p164g2.C15240l;
import p164g2.InterfaceC15237i;
import p510u0.InterfaceC34345p0;
import p522uf.AbstractC34870c0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p90.AbstractC28996d;
import qz0.C30793l;
import r41.AbstractC30924h;
import v80.AbstractC35794b;
import w80.AbstractC36941b;

/* JADX INFO: renamed from: b30.l1 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2564l1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9963w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC15237i f9964x;

    public /* synthetic */ C2564l1(InterfaceC15237i interfaceC15237i, int i13) {
        this.f9963w = i13;
        this.f9964x = interfaceC15237i;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9963w) {
            case 0:
                InterfaceC34345p0 KeyboardActions = (InterfaceC34345p0) obj;
                AbstractC22676k.m65750j(KeyboardActions, "$this$KeyboardActions");
                ((C15240l) this.f9964x).m43345h(1);
                return C23454a0.f92919a;
            case 1:
                return AbstractC2884f.m8373u(this.f9964x, (InterfaceC34345p0) obj);
            case 2:
                return EditProfileFieldsContentKt.EditProfileFieldsContent$lambda$6$0$1$2$0(this.f9964x, (InterfaceC34345p0) obj);
            case 3:
                return EditProfileFieldsContentKt.EditProfileFieldsContent$lambda$6$0$1$3$0(this.f9964x, (InterfaceC34345p0) obj);
            case 4:
                InterfaceC34345p0 KeyboardActions2 = (InterfaceC34345p0) obj;
                AbstractC22676k.m65750j(KeyboardActions2, "$this$KeyboardActions");
                ((C15240l) this.f9964x).m43339b(true);
                return C23454a0.f92919a;
            case 5:
                InterfaceC34345p0 KeyboardActions3 = (InterfaceC34345p0) obj;
                AbstractC22676k.m65750j(KeyboardActions3, "$this$KeyboardActions");
                AbstractC34870c0.m109993c0(this.f9964x, 1);
                return C23454a0.f92919a;
            case 6:
                InterfaceC34345p0 KeyboardActions4 = (InterfaceC34345p0) obj;
                AbstractC22676k.m65750j(KeyboardActions4, "$this$KeyboardActions");
                ((C15240l) this.f9964x).m43339b(true);
                return C23454a0.f92919a;
            case 7:
                InterfaceC34345p0 KeyboardActions5 = (InterfaceC34345p0) obj;
                AbstractC22676k.m65750j(KeyboardActions5, "$this$KeyboardActions");
                AbstractC34870c0.m109993c0(this.f9964x, 1);
                return C23454a0.f92919a;
            case 8:
                InterfaceC34345p0 KeyboardActions6 = (InterfaceC34345p0) obj;
                AbstractC22676k.m65750j(KeyboardActions6, "$this$KeyboardActions");
                ((C15240l) this.f9964x).m43339b(true);
                return C23454a0.f92919a;
            case 9:
                return AbstractC25222d.m73896u(this.f9964x, (InterfaceC34345p0) obj);
            case 10:
                return AbstractC25285b.m74203o(this.f9964x, (InterfaceC34345p0) obj);
            case 11:
                return AbstractC25285b.m74206r(this.f9964x, (InterfaceC34345p0) obj);
            case 12:
                return AbstractC25285b.m74209u(this.f9964x, (InterfaceC34345p0) obj);
            case 13:
                return AbstractC28996d.m88019H(this.f9964x, (InterfaceC34345p0) obj);
            case 14:
                return AbstractC28996d.m88023L(this.f9964x, (InterfaceC34345p0) obj);
            case 15:
                return AbstractC28996d.m88028Q(this.f9964x, (InterfaceC34345p0) obj);
            case 16:
                return AbstractC28996d.m88032U(this.f9964x, (InterfaceC34345p0) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C30793l.m94692b(this.f9964x, (InterfaceC34345p0) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC30924h.m95099y(this.f9964x, (InterfaceC34345p0) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC35794b.m113472q(this.f9964x, (InterfaceC34345p0) obj);
            case 20:
                return AbstractC36941b.m118560E(this.f9964x, (InterfaceC34345p0) obj);
            default:
                return AbstractC36941b.m118595z(this.f9964x, (InterfaceC34345p0) obj);
        }
    }
}
