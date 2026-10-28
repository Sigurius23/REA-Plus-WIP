package p701ce2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import be2.InterfaceC3177d;
import bt1.InterfaceC3623d;
import c42.C4170g;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cj1.C4746b;
import cj1.C4748d;
import cj1.C4753i;
import com.whoop.bot.settings.CoachSettingsDisplayState;
import com.whoop.bot.settings.CoachSettingsScreenKt;
import com.whoop.profile.domain.models.Gender;
import com.whoop.profile.domain.models.PhysiologicalBaseline;
import com.whoop.profile.presentation.ProfileViewState;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import com.whoop.profile.view.ProfileBottomSheetKt;
import com.whoop.profile.view.ProfileFullScreenModalKt;
import com.whoop.profile.view.ProfileScreenKt;
import com.whoop.profile.view.edit.EditProfileFullScreenModalKt;
import com.whoop.profile.view.edit.GenderSelectionContentKt;
import com.whoop.profile.view.edit.PhysiologicalBaselineSelectionContentKt;
import com.whoop.settings.AbstractC10104h;
import com.whoop.weightlifting.StrengthTrainerFragment;
import cv1.C11146c;
import cy0.C11184c;
import d42.AbstractC11688d;
import d71.AbstractC11759e;
import dl1.AbstractC12170d;
import ej1.AbstractC13234d;
import ej1.AbstractC13236e;
import ej1.AbstractC13246j;
import eu2.AbstractC13650g;
import ev1.AbstractC13686e;
import ev1.AbstractC13687f;
import ev1.AbstractC13688g;
import ev2.AbstractC13712u;
import ey0.AbstractC13737d;
import ey0.AbstractC13742i;
import h71.C16995l;
import j71.C21395c;
import java.util.List;
import kd1.AbstractC22403o;
import p114eb.C12991u0;
import p291l0.InterfaceC23001u;
import p329n0.C26068u;
import p702ch0.AbstractC4646q0;
import p702ch0.C4642o0;
import p702ch0.Function0;
import p704dk2.AbstractC12127n;
import p711j31.C21280k;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import xk1.C38428b;

/* JADX INFO: renamed from: ce2.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C4494b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18098w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f18099x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f18100y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f18101z;

    public /* synthetic */ C4494b(Object obj, Object obj2, int i13, int i14) {
        this.f18098w = i14;
        this.f18101z = obj;
        this.f18099x = obj2;
        this.f18100y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18098w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return Function1.m14081G((InterfaceC3177d) this.f18101z, (Function1) this.f18099x, this.f18100y, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return Function1.m14104v((InterfaceC3177d.a) this.f18101z, (Function1) this.f18099x, this.f18100y, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return Function1.m14098p((InterfaceC3177d.b) this.f18101z, (Function1) this.f18099x, this.f18100y, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC4646q0.m14595j((InterfaceC23001u) this.f18101z, (C4642o0) this.f18099x, this.f18100y, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return Function0.m14389e((InterfaceC4339a) this.f18101z, (Function3) this.f18099x, this.f18100y, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return CoachSettingsScreenKt.Header$lambda$0((CoachSettingsDisplayState) this.f18101z, (InterfaceC4339a) this.f18099x, this.f18100y, (Composer) obj, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj2).intValue();
                return ProfileBottomSheetKt.ProfileBottomSheet$lambda$4((ProfileViewState) this.f18101z, (Function3) this.f18099x, this.f18100y, (Composer) obj, iIntValue7);
            case 7:
                int iIntValue8 = ((Integer) obj2).intValue();
                return ProfileFullScreenModalKt.ProfileContentAreaModal$lambda$1((ProfileViewState.FullScreenModal) this.f18101z, (Function1) this.f18099x, this.f18100y, (Composer) obj, iIntValue8);
            case 8:
                int iIntValue9 = ((Integer) obj2).intValue();
                return ProfileScreenKt.EntitlementLogo$lambda$2((AbstractC22403o) this.f18101z, (Function1) this.f18099x, this.f18100y, (Composer) obj, iIntValue9);
            case 9:
                int iIntValue10 = ((Integer) obj2).intValue();
                return ProfileScreenKt.ProfileReportDialog$lambda$2((ProfileViewState.ProfileDialogState) this.f18101z, (Function1) this.f18099x, this.f18100y, (Composer) obj, iIntValue10);
            case 10:
                int iIntValue11 = ((Integer) obj2).intValue();
                return EditProfileFullScreenModalKt.EditProfileFullScreenModal$lambda$2((EditProfileViewState.FullScreenModal) this.f18101z, (Function1) this.f18099x, this.f18100y, (Composer) obj, iIntValue11);
            case 11:
                int iIntValue12 = ((Integer) obj2).intValue();
                return GenderSelectionContentKt.GenderSelectionContent$lambda$1((Gender) this.f18101z, (Function1) this.f18099x, this.f18100y, (Composer) obj, iIntValue12);
            case 12:
                int iIntValue13 = ((Integer) obj2).intValue();
                return PhysiologicalBaselineSelectionContentKt.PhysiologicalBaselineSelectionContent$lambda$1((PhysiologicalBaseline) this.f18101z, (Function1) this.f18099x, this.f18100y, (Composer) obj, iIntValue13);
            case 13:
                int iIntValue14 = ((Integer) obj2).intValue();
                return p703ct1.Function1.m30038A((InterfaceC3623d.b) this.f18101z, (Function1) this.f18099x, this.f18100y, (Composer) obj, iIntValue14);
            case 14:
                int iIntValue15 = ((Integer) obj2).intValue();
                return StrengthTrainerFragment.m28123D((StrengthTrainerFragment) this.f18101z, (C12991u0) this.f18099x, this.f18100y, (Composer) obj, iIntValue15);
            case 15:
                int iIntValue16 = ((Integer) obj2).intValue();
                return AbstractC11688d.m31178e((C4170g) this.f18101z, (InterfaceC4339a) this.f18099x, this.f18100y, (Composer) obj, iIntValue16);
            case 16:
                int iIntValue17 = ((Integer) obj2).intValue();
                return AbstractC11759e.m31471f((Modifier) this.f18101z, (C21395c) this.f18099x, this.f18100y, (Composer) obj, iIntValue17);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                int iIntValue18 = ((Integer) obj2).intValue();
                return AbstractC12127n.m33585g((C16995l) this.f18101z, (String) this.f18099x, this.f18100y, (Composer) obj, iIntValue18);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                int iIntValue19 = ((Integer) obj2).intValue();
                return AbstractC12170d.m33668r((C38428b) this.f18101z, (Function1) this.f18099x, this.f18100y, (Composer) obj, iIntValue19);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                int iIntValue20 = ((Integer) obj2).intValue();
                return AbstractC10104h.m25415v((List) this.f18101z, (InterfaceC4339a) this.f18099x, this.f18100y, (Composer) obj, iIntValue20);
            case 20:
                int iIntValue21 = ((Integer) obj2).intValue();
                return AbstractC13234d.m37171m((Modifier) this.f18101z, (C4748d) this.f18099x, this.f18100y, (Composer) obj, iIntValue21);
            case 21:
                int iIntValue22 = ((Integer) obj2).intValue();
                return AbstractC13236e.m37182c((C4746b) this.f18101z, (Function1) this.f18099x, this.f18100y, (Composer) obj, iIntValue22);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                int iIntValue23 = ((Integer) obj2).intValue();
                return AbstractC13246j.m37224i((C4753i.c) this.f18101z, (Function1) this.f18099x, this.f18100y, (Composer) obj, iIntValue23);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                int iIntValue24 = ((Integer) obj2).intValue();
                return AbstractC13650g.m38477y((C21280k) this.f18101z, (Function1) this.f18099x, this.f18100y, (Composer) obj, iIntValue24);
            case 24:
                int iIntValue25 = ((Integer) obj2).intValue();
                return AbstractC13686e.m38622n((C11146c.b) this.f18101z, (Function1) this.f18099x, this.f18100y, (Composer) obj, iIntValue25);
            case 25:
                int iIntValue26 = ((Integer) obj2).intValue();
                return AbstractC13687f.m38627e((C11146c) this.f18101z, (Function1) this.f18099x, this.f18100y, (Composer) obj, iIntValue26);
            case 26:
                int iIntValue27 = ((Integer) obj2).intValue();
                return AbstractC13688g.m38641n((C11146c.d) this.f18101z, (Function1) this.f18099x, this.f18100y, (Composer) obj, iIntValue27);
            case 27:
                int iIntValue28 = ((Integer) obj2).intValue();
                return AbstractC13712u.m38826t0((C26068u) this.f18101z, (C26068u) this.f18099x, this.f18100y, (Composer) obj, iIntValue28);
            case 28:
                int iIntValue29 = ((Integer) obj2).intValue();
                return AbstractC13737d.m39021n((C11184c.c) this.f18101z, (Function1) this.f18099x, this.f18100y, (Composer) obj, iIntValue29);
            default:
                int iIntValue30 = ((Integer) obj2).intValue();
                return AbstractC13742i.m39072n((C11184c) this.f18101z, (Function1) this.f18099x, this.f18100y, (Composer) obj, iIntValue30);
        }
    }
}
