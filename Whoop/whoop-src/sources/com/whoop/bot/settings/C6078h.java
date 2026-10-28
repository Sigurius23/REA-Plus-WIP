package com.whoop.bot.settings;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import lf0.AbstractC23940l1;
import lf0.C23944m1;
import n71.C26436q;
import p715kotlin.jvm.functions.Function1;
import p739ui0.AbstractC35014p;
import qn0.AbstractC30507b;
import ri0.C31450i;
import sg2.AbstractC32465p;

/* JADX INFO: renamed from: com.whoop.bot.settings.h */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C6078h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f24131E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f24132w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f24133x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f24134y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f24135z;

    public /* synthetic */ C6078h(TextResource textResource, TextResource textResource2, float f13, int i13) {
        this.f24132w = 3;
        this.f24135z = textResource;
        this.f24131E = textResource2;
        this.f24133x = f13;
        this.f24134y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24132w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return CoachSettingsScreenKt.SettingItemEntry_rAjV9yQ$lambda$1((SettingItem) this.f24135z, this.f24133x, (Function1) this.f24131E, this.f24134y, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return CoachSettingsScreenKt.Footer_rAjV9yQ$lambda$1((CoachSettingsDisplayState) this.f24135z, this.f24133x, (InterfaceC4339a) this.f24131E, this.f24134y, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC23940l1.m70499k((C23944m1) this.f24135z, this.f24133x, (Function1) this.f24131E, this.f24134y, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC30507b.m93430c((TextResource) this.f24135z, (TextResource) this.f24131E, this.f24133x, this.f24134y, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC32465p.m101394o((C26436q) this.f24135z, this.f24133x, (Modifier) this.f24131E, this.f24134y, (Composer) obj, iIntValue5);
            default:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC35014p.m110629t((C31450i) this.f24135z, this.f24133x, (InterfaceC4339a) this.f24131E, this.f24134y, (Composer) obj, iIntValue6);
        }
    }

    public /* synthetic */ C6078h(Object obj, float f13, Object obj2, int i13, int i14) {
        this.f24132w = i14;
        this.f24135z = obj;
        this.f24133x = f13;
        this.f24131E = obj2;
        this.f24134y = i13;
    }
}
