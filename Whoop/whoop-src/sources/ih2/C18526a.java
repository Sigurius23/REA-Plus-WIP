package ih2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import o42.AbstractC27531k;
import p715kotlin.jvm.functions.Function1;
import tj1.AbstractC33866a;
import u71.AbstractC34573g;

/* JADX INFO: renamed from: ih2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C18526a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f72182w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f72183x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f72184y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f72185z;

    public /* synthetic */ C18526a(boolean z4, Function1 function1, int i13, int i14) {
        this.f72182w = i14;
        this.f72183x = z4;
        this.f72184y = function1;
        this.f72185z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f72182w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC18527b.m53717R(this.f72183x, this.f72184y, this.f72185z, composer, iIntValue);
            case 1:
                return AbstractC27531k.m83018m0(this.f72183x, this.f72184y, this.f72185z, composer, iIntValue);
            case 2:
                return AbstractC27531k.m83024p0(this.f72183x, this.f72184y, this.f72185z, composer, iIntValue);
            case 3:
                return AbstractC33866a.m107089e(this.f72183x, this.f72184y, this.f72185z, composer, iIntValue);
            default:
                return AbstractC34573g.m109317E(this.f72183x, this.f72184y, this.f72185z, composer, iIntValue);
        }
    }
}
