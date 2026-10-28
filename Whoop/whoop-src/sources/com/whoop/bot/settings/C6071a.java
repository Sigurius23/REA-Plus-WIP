package com.whoop.bot.settings;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4353o;
import f31.C14044a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.whoop.bot.settings.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C6071a implements InterfaceC4353o {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f24105w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f24106x;

    public /* synthetic */ C6071a(Function1 function1, int i13) {
        this.f24105w = i13;
        this.f24106x = function1;
    }

    @Override // c93.InterfaceC4353o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f24105w) {
            case 0:
                int iIntValue = ((Integer) obj5).intValue();
                return CoachSettingsCoachingModeKt.CoachingModeContent$lambda$2$0(this.f24106x, (InterfaceC1103a) obj, (CoachingMode) obj2, (C14044a) obj3, (Composer) obj4, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj5).intValue();
                return CoachSettingsConcisenessContentKt.ConcisenessContent$lambda$2$0(this.f24106x, (InterfaceC1103a) obj, (ConcisenessMode) obj2, (C14044a) obj3, (Composer) obj4, iIntValue2);
        }
    }
}
