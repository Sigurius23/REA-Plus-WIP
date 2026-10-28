package com.whoop.profile.view;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.models.modal.AnyModal;
import if0.AbstractC18452c;
import no0.AbstractC26965p;
import no0.AbstractC26979w;
import of2.AbstractC27902f;
import p715kotlin.jvm.functions.Function1;
import p90.AbstractC29001i;
import p90.C28997e;
import re1.AbstractC31323j;
import rs2.AbstractC31797c;
import wo1.C37470s;

/* JADX INFO: renamed from: com.whoop.profile.view.h */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9812h implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28561w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f28562x;

    public /* synthetic */ C9812h(Function1 function1, int i13) {
        this.f28561w = i13;
        this.f28562x = function1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28561w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ProfileScreenKt.ProfileToolbar$lambda$1$0$1(this.f28562x, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ProfileScreenKt.ProfileToolbar$lambda$1$0$3(this.f28562x, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC18452c.m53185q(this.f28562x, (Composer) obj, iIntValue3);
            case 3:
                return AbstractC26965p.m80740m(this.f28562x, (Modifier) obj, (AnyModal) obj2);
            case 4:
                return AbstractC26979w.m80864c0(this.f28562x, (String) obj, (Long) obj2);
            case 5:
                return AbstractC27902f.m84213e(this.f28562x, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            case 6:
                return AbstractC29001i.m88086j(this.f28562x, ((Boolean) obj).booleanValue(), (C28997e) obj2);
            case 7:
                return AbstractC31323j.m96346T(this.f28562x, (String) obj, (String) obj2);
            case 8:
                return AbstractC31797c.m98783r(this.f28562x, obj, ((Integer) obj2).intValue());
            default:
                return C37470s.m120117g(this.f28562x, ((Integer) obj).intValue(), (String) obj2);
        }
    }
}
