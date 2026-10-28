package f01;

import androidx.compose.runtime.Composer;
import java.util.List;
import p040c0.InterfaceC3747i0;
import p291l0.InterfaceC23013y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import re1.AbstractC31323j;

/* JADX INFO: renamed from: f01.m */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C13878m implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49482w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f49483x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f49484y;

    public /* synthetic */ C13878m(List list, int i13, Function1 function1) {
        this.f49482w = i13;
        this.f49483x = list;
        this.f49484y = function1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f49482w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC13881n.m39398t(this.f49483x, this.f49484y, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC31323j.m96349W(this.f49483x, this.f49484y, (InterfaceC23013y) obj, (Composer) obj2, iIntValue2);
        }
    }
}
