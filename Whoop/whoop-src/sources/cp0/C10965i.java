package cp0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import he1.AbstractC17212a;
import hh0.AbstractC17287g;
import n31.AbstractC26217b;
import nr0.AbstractC27073f;
import te1.AbstractC33751b;
import u11.AbstractC34443i;
import v01.AbstractC35510l;
import v80.AbstractC35794b;
import vy0.AbstractC36588p;
import w01.AbstractC36682g;
import y31.AbstractC39195d;

/* JADX INFO: renamed from: cp0.i */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C10965i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f34062w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f34063x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f34064y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f34065z;

    public /* synthetic */ C10965i(int i13, String str, InterfaceC4339a interfaceC4339a) {
        this.f34062w = 8;
        this.f34064y = interfaceC4339a;
        this.f34063x = str;
        this.f34065z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f34062w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC10971k.m29225g(this.f34063x, this.f34064y, this.f34065z, composer, iIntValue);
            case 1:
                return AbstractC17212a.m48618G(this.f34063x, this.f34064y, this.f34065z, composer, iIntValue);
            case 2:
                return AbstractC17287g.m48963g(this.f34063x, this.f34064y, this.f34065z, composer, iIntValue);
            case 3:
                return AbstractC26217b.m77845n(this.f34063x, this.f34064y, this.f34065z, composer, iIntValue);
            case 4:
                return AbstractC27073f.m81379D(this.f34063x, this.f34064y, this.f34065z, composer, iIntValue);
            case 5:
                return AbstractC33751b.m106721v(this.f34063x, this.f34064y, this.f34065z, composer, iIntValue);
            case 6:
                return AbstractC34443i.m108819D(this.f34063x, this.f34064y, this.f34065z, composer, iIntValue);
            case 7:
                return AbstractC35510l.m112631G(this.f34063x, this.f34064y, this.f34065z, composer, iIntValue);
            case 8:
                return AbstractC35794b.m113455E(this.f34064y, this.f34063x, this.f34065z, composer, iIntValue);
            case 9:
                return AbstractC36588p.m117478q0(this.f34063x, this.f34064y, this.f34065z, composer, iIntValue);
            case 10:
                return AbstractC36682g.m117720H(this.f34063x, this.f34064y, this.f34065z, composer, iIntValue);
            default:
                return AbstractC39195d.m124866u(this.f34063x, this.f34064y, this.f34065z, composer, iIntValue);
        }
    }

    public /* synthetic */ C10965i(String str, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f34062w = i14;
        this.f34063x = str;
        this.f34064y = interfaceC4339a;
        this.f34065z = i13;
    }
}
