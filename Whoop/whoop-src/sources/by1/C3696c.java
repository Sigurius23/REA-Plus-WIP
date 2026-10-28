package by1;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.TextResource;
import fg2.AbstractC14466h;
import fh0.AbstractC14482d;
import o82.AbstractC27660d;
import p040c0.InterfaceC3747i0;
import p291l0.InterfaceC22997s1;
import p714k80.AbstractC22287p;
import p715kotlin.jvm.functions.Function3;
import y80.AbstractC39326c;

/* JADX INFO: renamed from: by1.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3696c implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15113w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TextResource f15114x;

    public /* synthetic */ C3696c(TextResource textResource, int i13) {
        this.f15113w = i13;
        this.f15114x = textResource;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f15113w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC3697d.m11505f(this.f15114x, (InterfaceC22997s1) obj, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC14466h.m41258p(this.f15114x, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj3).intValue();
                return AbstractC14482d.m41362e(this.f15114x, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj3).intValue();
                return AbstractC22287p.m64029f(this.f15114x, (InterfaceC22997s1) obj, (Composer) obj2, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj3).intValue();
                return AbstractC27660d.m83635l(this.f15114x, (InterfaceC1103a) obj, (Composer) obj2, iIntValue5);
            default:
                int iIntValue6 = ((Integer) obj3).intValue();
                return AbstractC39326c.m125307h(this.f15114x, (InterfaceC22997s1) obj, (Composer) obj2, iIntValue6);
        }
    }
}
