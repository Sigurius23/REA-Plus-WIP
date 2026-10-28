package com.whoop.profile.view;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import kd1.AbstractC22403o;
import nr0.AbstractC27076i;

/* JADX INFO: renamed from: com.whoop.profile.view.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9747a implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f28367E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f28368F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28369w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f28370x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC22403o f28371y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Modifier f28372z;

    public /* synthetic */ C9747a(String str, AbstractC22403o abstractC22403o, Modifier modifier, int i13, int i14) {
        this.f28370x = str;
        this.f28371y = abstractC22403o;
        this.f28372z = modifier;
        this.f28367E = i13;
        this.f28368F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28369w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                String str = this.f28370x;
                return ProfileAvatarKt.ProfileAvatar$lambda$1(this.f28371y, this.f28372z, str, this.f28367E, this.f28368F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC27076i.m81423j(this.f28370x, this.f28371y, this.f28372z, this.f28367E, this.f28368F, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C9747a(AbstractC22403o abstractC22403o, Modifier modifier, String str, int i13, int i14) {
        this.f28371y = abstractC22403o;
        this.f28372z = modifier;
        this.f28370x = str;
        this.f28367E = i13;
        this.f28368F = i14;
    }
}
