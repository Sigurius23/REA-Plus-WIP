package b30;

import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import b71.AbstractC2782c;
import c30.AbstractC3916g;
import com.whoop.data.local.room.dao.persistent.RawDataDao_Impl;
import com.whoop.profile.view.edit.CountrySelectionContentKt;
import com.whoop.profile.view.edit.avatar.PhotoSourceActionSheetKt;
import com.whoop.profile.view.edit.form.EditProfileFormUtils;
import com.whoop.profile.view.edit.form.FieldState;
import com.whoop.weightlifting.data.domain.WorkoutSet;
import d71.AbstractC11758d;
import dn0.AbstractC12208h;
import dv1.C12388a;
import ep1.AbstractC13428w;
import fu2.C14789d;
import h11.AbstractC16609d;
import ht2.AbstractC17633e;
import j93.InterfaceC21493z;
import jb1.C21536b;
import l83.C23454a0;
import l83.C23465k;
import p209i3.AbstractC18039u;
import p209i3.AbstractC18041w;
import p209i3.C18030l;
import p209i3.C18043y;
import p209i3.InterfaceC18044z;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.y4 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2663y4 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10426w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f10427x;

    public /* synthetic */ C2663y4(String str, int i13) {
        this.f10426w = i13;
        this.f10427x = str;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f10426w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        String str = this.f10427x;
        switch (i13) {
            case 0:
                InterfaceC18044z semantics = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics, "$this$semantics");
                AbstractC18041w.m51806e(AbstractC22674j.m65707O(str), semantics);
                return c23454a0;
            case 1:
                return AbstractC2782c.m7886d(str, (InterfaceC18044z) obj);
            case 2:
                InterfaceC18044z semantics2 = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics2, "$this$semantics");
                C18043y c18043y = AbstractC3916g.f16002b;
                InterfaceC21493z interfaceC21493z = AbstractC3916g.f16001a[0];
                c18043y.m51817a(semantics2, str);
                return c23454a0;
            case 3:
                InterfaceC18044z interfaceC18044z = (InterfaceC18044z) obj;
                AbstractC18041w.m51806e(str, interfaceC18044z);
                AbstractC18041w.m51810i(interfaceC18044z, 5);
                return c23454a0;
            case 4:
                return RawDataDao_Impl.lambda$getOldestTimestampByPacketVersion$5(str, (InterfaceC33687a) obj);
            case 5:
                return RawDataDao_Impl.lambda$getPacketsByRevision$2(str, (InterfaceC33687a) obj);
            case 6:
                return RawDataDao_Impl.lambda$getNewestTimestampByPacketVersion$4(str, (InterfaceC33687a) obj);
            case 7:
                return Boolean.valueOf(CountrySelectionContentKt.CountrySelectionContent$lambda$5$0$0(str, (C23465k) obj));
            case 8:
                return PhotoSourceActionSheetKt.PhotoActionButton$lambda$1$0(str, (InterfaceC18044z) obj);
            case 9:
                return EditProfileFormUtils.updateNonEmailField$lambda$0(str, (FieldState) obj);
            case 10:
                return EditProfileFormUtils.updateEmailField$lambda$1(str, (FieldState) obj);
            case 11:
                InterfaceC18044z semantics3 = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics3, "$this$semantics");
                AbstractC18041w.m51812k("manage_screen_chevron_icon_" + str, semantics3);
                return c23454a0;
            case 12:
                InterfaceC18044z semantics4 = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics4, "$this$semantics");
                if (str != null) {
                    AbstractC18041w.m51806e(str, semantics4);
                }
                return c23454a0;
            case 13:
                return AbstractC11758d.m31462o(str, (InterfaceC18044z) obj);
            case 14:
                return AbstractC12208h.m33844t(str, (InterfaceC18044z) obj);
            case 15:
                return C12388a.m34775e(str, (C21536b) obj);
            case 16:
                return AbstractC13428w.m38129s(str, ((Integer) obj).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C14789d.m42485M(str, (WorkoutSet) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C14789d.m42486N(str, (WorkoutSet) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C14789d.m42478F(str, (WorkoutSet) obj);
            case 20:
                return C14789d.m42479G(str, (WorkoutSet) obj);
            case 21:
                return C14789d.m42488P(str, (WorkoutSet) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C14789d.m42489Q(str, (WorkoutSet) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
                ((C18030l) ((InterfaceC18044z) obj)).m51772e(AbstractC18039u.f70029K, str);
                return c23454a0;
            case 24:
                InterfaceC18044z semantics5 = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics5, "$this$semantics");
                InterfaceC21493z[] interfaceC21493zArr2 = AbstractC18041w.f70062a;
                C18043y c18043y2 = AbstractC18039u.f70035b;
                InterfaceC21493z interfaceC21493z2 = AbstractC18041w.f70062a[0];
                c18043y2.m51817a(semantics5, str);
                return c23454a0;
            case 25:
                InterfaceC18044z semantics6 = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics6, "$this$semantics");
                AbstractC18041w.m51806e(str, semantics6);
                return c23454a0;
            case 26:
                InterfaceC18044z semantics7 = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics7, "$this$semantics");
                AbstractC18041w.m51806e(str, semantics7);
                return c23454a0;
            case 27:
                return AbstractC16609d.m47137f(str, (InterfaceC18044z) obj);
            case 28:
                return AbstractC17633e.m50216X(str, (Modifier) obj);
            default:
                return AbstractC17633e.m50217Y(str, (Modifier) obj);
        }
    }
}
