package jn2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import jz0.AbstractC22070c;
import p040c0.InterfaceC3747i0;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: jn2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C21806a implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f84062w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f84063x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f84064y;

    public /* synthetic */ C21806a(float f13, long j7) {
        this.f84063x = f13;
        this.f84064y = j7;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f84062w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC21808c.m61737f(this.f84064y, this.f84063x, (Modifier) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC22070c.m63141g(this.f84063x, this.f84064y, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ C21806a(long j7, float f13) {
        this.f84064y = j7;
        this.f84063x = f13;
    }
}
