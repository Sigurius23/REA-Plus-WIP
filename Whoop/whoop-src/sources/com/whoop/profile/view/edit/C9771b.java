package com.whoop.profile.view.edit;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.List;
import p715kotlin.jvm.functions.Function1;
import wr0.AbstractC37535j0;

/* JADX INFO: renamed from: com.whoop.profile.view.edit.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9771b implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f28401E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28402w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f28403x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f28404y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f28405z;

    public /* synthetic */ C9771b(List list, String str, Function1 function1, int i13, int i14) {
        this.f28402w = i14;
        this.f28403x = list;
        this.f28404y = str;
        this.f28405z = function1;
        this.f28401E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28402w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return CountrySelectionContentKt.CountrySelectionContent$lambda$8(this.f28403x, this.f28404y, this.f28405z, this.f28401E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return StateSelectionContentKt.StateSelectionContent$lambda$1(this.f28403x, this.f28404y, this.f28405z, this.f28401E, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC37535j0.m120382l(this.f28403x, this.f28404y, this.f28405z, this.f28401E, (Composer) obj, iIntValue3);
        }
    }
}
