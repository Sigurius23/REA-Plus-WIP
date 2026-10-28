package com.whoop.profile.view.edit.form;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import no0.AbstractC26980w0;

/* JADX INFO: renamed from: com.whoop.profile.view.edit.form.f */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9782f implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Modifier f28470E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f28471F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f28472G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28473w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f28474x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f28475y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f28476z;

    public /* synthetic */ C9782f(int i13, int i14, int i15, Modifier modifier, InterfaceC4339a interfaceC4339a, String str, boolean z4) {
        this.f28473w = i15;
        this.f28474x = str;
        this.f28475y = z4;
        this.f28476z = interfaceC4339a;
        this.f28470E = modifier;
        this.f28471F = i13;
        this.f28472G = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28473w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return HeightWeightGroupedFormFieldKt.UnitToggleButton$lambda$1(this.f28474x, this.f28475y, this.f28476z, this.f28470E, this.f28471F, this.f28472G, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC26980w0.m80904j(this.f28474x, this.f28475y, this.f28476z, this.f28470E, this.f28471F, this.f28472G, (Composer) obj, iIntValue2);
        }
    }
}
