package jp2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import p291l0.C23000t1;
import p730qt2.AbstractC30613s;
import qz0.AbstractC30792k;
import wo1.AbstractC37453i0;
import wq2.AbstractC37513b;
import z21.AbstractC40021c;

/* JADX INFO: renamed from: jp2.m */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C21882m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f84506w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TextResource f84507x;

    public /* synthetic */ C21882m(TextResource textResource, int i13) {
        this.f84506w = i13;
        this.f84507x = textResource;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f84506w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC21883n.m62078p(this.f84507x, composer, iIntValue);
            case 1:
                return AbstractC30613s.m93974t(this.f84507x, composer, iIntValue);
            case 2:
                return AbstractC30792k.m94689w(this.f84507x, composer, iIntValue);
            case 3:
                return AbstractC37453i0.m119956e(this.f84507x, composer, iIntValue);
            case 4:
                return AbstractC37513b.m120289p(this.f84507x, composer, iIntValue);
            default:
                return AbstractC40021c.m128283f(C23000t1.f90727a, this.f84507x, composer, iIntValue);
        }
    }
}
