package com.whoop.profile.presentation.edit;

import androidx.compose.runtime.Composer;
import g11.AbstractC15219c;
import mf0.AbstractC25506e;
import p291l0.InterfaceC23013y;
import p292l1.InterfaceC23098g1;
import p715kotlin.jvm.functions.Function3;
import s80.AbstractC32255c;

/* JADX INFO: renamed from: com.whoop.profile.presentation.edit.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C9722a implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28343w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC23098g1 f28344x;

    public /* synthetic */ C9722a(InterfaceC23098g1 interfaceC23098g1, int i13) {
        this.f28343w = i13;
        this.f28344x = interfaceC23098g1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i13 = this.f28343w;
        InterfaceC23013y interfaceC23013y = (InterfaceC23013y) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i13) {
            case 0:
                return BirthdayContentKt.BirthdayContent$lambda$1(this.f28344x, interfaceC23013y, composer, iIntValue);
            case 1:
                return AbstractC15219c.m43273w(this.f28344x, interfaceC23013y, composer, iIntValue);
            case 2:
                return AbstractC25506e.m74963n0(this.f28344x, interfaceC23013y, composer, iIntValue);
            default:
                return AbstractC32255c.m100375w(this.f28344x, interfaceC23013y, composer, iIntValue);
        }
    }
}
