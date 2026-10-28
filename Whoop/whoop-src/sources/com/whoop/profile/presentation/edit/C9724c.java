package com.whoop.profile.presentation.edit;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.whoop.profile.presentation.edit.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C9724c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f28349E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f28350F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28351w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f28352x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f28353y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ EditProfileViewState.ValidationRanges f28354z;

    public /* synthetic */ C9724c(float f13, boolean z4, EditProfileViewState.ValidationRanges validationRanges, Function1 function1, int i13, int i14) {
        this.f28351w = i14;
        this.f28352x = f13;
        this.f28353y = z4;
        this.f28354z = validationRanges;
        this.f28349E = function1;
        this.f28350F = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28351w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return HeightWeightContentKt.HeightSelector$lambda$1(this.f28352x, this.f28353y, this.f28354z, this.f28349E, this.f28350F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return HeightWeightContentKt.WeightSelector$lambda$1(this.f28352x, this.f28353y, this.f28354z, this.f28349E, this.f28350F, (Composer) obj, iIntValue2);
        }
    }
}
