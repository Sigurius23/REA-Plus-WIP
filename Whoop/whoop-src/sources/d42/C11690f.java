package d42;

import androidx.compose.runtime.Composer;
import hh0.AbstractC17287g;
import p040c0.InterfaceC3747i0;
import p291l0.InterfaceC22997s1;
import p291l0.InterfaceC23013y;
import p715kotlin.jvm.functions.Function3;
import te1.AbstractC33751b;
import u11.AbstractC34443i;
import v80.AbstractC35794b;
import w90.AbstractC36952b;

/* JADX INFO: renamed from: d42.f */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C11690f implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37793w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f37794x;

    public /* synthetic */ C11690f(String str, int i13) {
        this.f37793w = i13;
        this.f37794x = str;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f37793w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC11694j.m31204r(this.f37794x, (InterfaceC22997s1) obj, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC17287g.m48961e(this.f37794x, (InterfaceC23013y) obj, (Composer) obj2, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj3).intValue();
                return AbstractC33751b.m106720u(this.f37794x, (InterfaceC22997s1) obj, (Composer) obj2, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj3).intValue();
                return AbstractC34443i.m108861j0(this.f37794x, (InterfaceC22997s1) obj, (Composer) obj2, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj3).intValue();
                return AbstractC35794b.m113454D(this.f37794x, (InterfaceC22997s1) obj, (Composer) obj2, iIntValue5);
            default:
                int iIntValue6 = ((Integer) obj3).intValue();
                return AbstractC36952b.m118669z(this.f37794x, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue6);
        }
    }
}
