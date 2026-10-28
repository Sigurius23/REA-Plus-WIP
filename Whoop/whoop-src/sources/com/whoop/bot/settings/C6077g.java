package com.whoop.bot.settings;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import g51.C15493c;
import kd1.AbstractC22403o;
import p040c0.InterfaceC3747i0;
import p291l0.InterfaceC23004v;
import p71.AbstractC28956b;
import p71.C28957c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import ri0.C31446e;
import uu2.AbstractC35252g0;
import v81.AbstractC35798c;
import zi0.AbstractC40662a;

/* JADX INFO: renamed from: com.whoop.bot.settings.g */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C6077g implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f24127w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f24128x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f24129y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f24130z;

    public /* synthetic */ C6077g(float f13, C31446e.a aVar, Function1 function1) {
        this.f24127w = 4;
        this.f24128x = f13;
        this.f24129y = aVar;
        this.f24130z = function1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f24127w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return CoachSettingsScreenKt.CoachSettingsContent$lambda$6$0$5((CoachSettingsViewState.Success) this.f24129y, this.f24128x, (InterfaceC4339a) this.f24130z, (InterfaceC1103a) obj, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC28956b.m87935t((C28957c) this.f24129y, (Function1) this.f24130z, this.f24128x, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj3).intValue();
                return AbstractC35252g0.m111709i((AbstractC22403o) this.f24129y, this.f24128x, (String) this.f24130z, (InterfaceC23004v) obj, (Composer) obj2, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj3).intValue();
                return AbstractC35798c.m113513q((C15493c) this.f24129y, this.f24128x, (Function1) this.f24130z, ((Integer) obj).intValue(), (Composer) obj2, iIntValue4);
            default:
                int iIntValue5 = ((Integer) obj3).intValue();
                return AbstractC40662a.m131948D(this.f24128x, (C31446e.a) this.f24129y, (Function1) this.f24130z, (InterfaceC1103a) obj, (Composer) obj2, iIntValue5);
        }
    }

    public /* synthetic */ C6077g(Object obj, float f13, Object obj2, int i13) {
        this.f24127w = i13;
        this.f24129y = obj;
        this.f24128x = f13;
        this.f24130z = obj2;
    }

    public /* synthetic */ C6077g(C28957c c28957c, Function1 function1, float f13) {
        this.f24127w = 1;
        this.f24129y = c28957c;
        this.f24130z = function1;
        this.f24128x = f13;
    }
}
