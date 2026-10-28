package a61;

import android.view.View;
import androidx.health.platform.client.proto.C1533u;
import ar2.C1931b;
import az1.AbstractC2166g;
import az1.AbstractC2167h;
import b01.AbstractC2195p;
import b01.C2182c;
import b90.C2879a;
import be1.AbstractC3173g;
import bv2.AbstractC3676c;
import c41.AbstractC4133v1;
import c41.C4000c1;
import c41.C4043i2;
import c41.C4153y0;
import ck1.AbstractC4786i;
import ck1.AbstractC4787j;
import com.whoop.android.R;
import com.whoop.navigation.C9598e;
import com.whoop.p069ui.WhoopNewToolbar;
import com.whoop.profile.presentation.edit.HeightWeightContentKt;
import com.whoop.profile.view.edit.form.EditProfileTextFieldKt;
import d21.AbstractC11508f;
import d42.AbstractC11700p;
import d90.C11810a;
import ec.InterfaceC13008a;
import l83.C23454a0;
import n82.InterfaceC26456b;
import org.joda.time.LocalDateTime;
import p164g2.InterfaceC15250v;
import p294l3.C23277r0;
import p704dk2.AbstractC12123j;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import sp0.C32870j;
import tp0.EnumC34058c;

/* JADX INFO: renamed from: a61.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0468a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1597w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f1598x;

    public /* synthetic */ C0468a(Function1 function1, int i13) {
        this.f1597w = i13;
        this.f1598x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1597w) {
            case 0:
                return C0469b.m1127d(this.f1598x, obj);
            case 1:
                return C1931b.m5914e(this.f1598x, obj);
            case 2:
                return AbstractC2166g.m6770z(this.f1598x, obj);
            case 3:
                return AbstractC2167h.m6788q(this.f1598x, obj);
            case 4:
                return AbstractC2195p.m6939y(this.f1598x, (C2182c) obj);
            case 5:
                Object tag = ((View) obj).getTag(R.id.binding_reference);
                AbstractC22676k.m65748h(tag, "null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding");
                this.f1598x.invoke((InterfaceC13008a) tag);
                return C23454a0.f92919a;
            case 6:
                return C2879a.m8323d(this.f1598x, obj);
            case 7:
                return AbstractC3173g.m9099c0(this.f1598x, (InterfaceC26456b) obj);
            case 8:
                return AbstractC3173g.m9101d0(this.f1598x, (String) obj);
            case 9:
                return AbstractC3173g.m9075H(this.f1598x, (EnumC34058c) obj);
            case 10:
                return AbstractC3173g.m9076I(this.f1598x, ((Boolean) obj).booleanValue());
            case 11:
                return AbstractC3173g.m9077J(this.f1598x, (C32870j) obj);
            case 12:
                return AbstractC3173g.m9085R(this.f1598x, (LocalDateTime) obj);
            case 13:
                return AbstractC3173g.m9088U(this.f1598x, (LocalDateTime) obj);
            case 14:
                return AbstractC3676c.m11384t(this.f1598x, (String) obj);
            case 15:
                return C4153y0.m12937d(this.f1598x, obj);
            case 16:
                return C4000c1.m12124d(this.f1598x, obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC4133v1.m12797y(this.f1598x, (C23277r0) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C4043i2.m12330d(this.f1598x, obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC4786i.m15079I(this.f1598x, (C9598e) obj);
            case 20:
                return AbstractC4787j.m15118l(this.f1598x, (Throwable) obj);
            case 21:
                return HeightWeightContentKt.HeightSelector$lambda$0$0$0(this.f1598x, ((Integer) obj).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return HeightWeightContentKt.WeightSelector$lambda$0$0$0(this.f1598x, ((Integer) obj).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return EditProfileTextFieldKt.EditProfileTextField_iQW2vr8$lambda$3$0$0(this.f1598x, (InterfaceC15250v) obj);
            case 24:
                return WhoopNewToolbar.m26682o(this.f1598x, (View) obj);
            case 25:
                return AbstractC11508f.m30956h(this.f1598x, (String) obj);
            case 26:
                return AbstractC11700p.m31246U(this.f1598x, (String) obj);
            case 27:
                return AbstractC11700p.m31249X(this.f1598x, (String) obj);
            case 28:
                return C11810a.m31659d(this.f1598x, obj);
            default:
                return AbstractC12123j.m33532F(this.f1598x, ((Integer) obj).intValue());
        }
    }
}
