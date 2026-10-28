package com.whoop.profile.view.edit.preview;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import cp0.AbstractC10959g;
import cz0.AbstractC11255p;
import d41.AbstractC11679e;
import d62.AbstractC11741g;
import d71.AbstractC11759e;
import e51.AbstractC12736l;
import e81.AbstractC12823d0;
import eg2.AbstractC13181n;
import eo2.AbstractC13393m;
import ez0.AbstractC13759c;
import f01.AbstractC13860g;
import f01.AbstractC13881n;
import f01.AbstractC13899t;
import f01.AbstractC13913z;

/* JADX INFO: renamed from: com.whoop.profile.view.edit.preview.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9809a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28553w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f28554x;

    public /* synthetic */ C9809a(int i13, int i14) {
        this.f28553w = i14;
        this.f28554x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f28553w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return EditProfileFullScreenModalPreviewKt.EditProfileScreenSavingModalPreview$lambda$1(this.f28554x, composer, iIntValue);
            case 1:
                return EditProfileFullScreenModalPreviewKt.EditProfileScreenErrorModalPreview$lambda$1(this.f28554x, composer, iIntValue);
            case 2:
                return EditProfileFullScreenModalPreviewKt.EditProfileScreenSuccessModalPreview$lambda$1(this.f28554x, composer, iIntValue);
            case 3:
                return GenderSelectionContentPreviewKt.GenderSelectionContentPreview$lambda$1(this.f28554x, composer, iIntValue);
            case 4:
                return PhysiologicalBaselineSelectionContentPreviewKt.PhysiologicalBaselineSelectionContentPreview$lambda$1(this.f28554x, composer, iIntValue);
            case 5:
                return StateSelectionContentPreviewKt.StateSelectionContentPreview$lambda$1(this.f28554x, composer, iIntValue);
            case 6:
                return AbstractC10959g.m29080g(this.f28554x, composer, iIntValue);
            case 7:
                return AbstractC11255p.m30398c(this.f28554x, composer, iIntValue);
            case 8:
                return AbstractC11679e.m31106L(this.f28554x, composer, iIntValue);
            case 9:
                return AbstractC11679e.m31132y(this.f28554x, composer, iIntValue);
            case 10:
                return AbstractC11679e.m31097C(this.f28554x, composer, iIntValue);
            case 11:
                return AbstractC11741g.m31426w(this.f28554x, composer, iIntValue);
            case 12:
                return AbstractC11741g.m31401J(this.f28554x, composer, iIntValue);
            case 13:
                return AbstractC11741g.m31392A(this.f28554x, composer, iIntValue);
            case 14:
                return AbstractC11741g.m31393B(this.f28554x, composer, iIntValue);
            case 15:
                return AbstractC11759e.m31469d(this.f28554x, composer, iIntValue);
            case 16:
                return AbstractC12736l.m35636w(this.f28554x, composer, iIntValue);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC12823d0.m35957z(this.f28554x, composer, iIntValue);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC13181n.m37064r(this.f28554x, composer, iIntValue);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC13393m.m37805j(this.f28554x, composer, iIntValue);
            case 20:
                return AbstractC13759c.m39115c(this.f28554x, composer, iIntValue);
            case 21:
                return AbstractC13860g.m39282q(this.f28554x, composer, iIntValue);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC13860g.m39280o(this.f28554x, composer, iIntValue);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC13860g.m39284s(this.f28554x, composer, iIntValue);
            case 24:
                return AbstractC13860g.m39278m(this.f28554x, composer, iIntValue);
            case 25:
                return AbstractC13881n.m39373D(this.f28554x, composer, iIntValue);
            case 26:
                return AbstractC13881n.m39371B(this.f28554x, composer, iIntValue);
            case 27:
                return AbstractC13881n.m39404z(this.f28554x, composer, iIntValue);
            case 28:
                return AbstractC13899t.m39547l(this.f28554x, composer, iIntValue);
            default:
                return AbstractC13913z.m39635j(this.f28554x, composer, iIntValue);
        }
    }
}
