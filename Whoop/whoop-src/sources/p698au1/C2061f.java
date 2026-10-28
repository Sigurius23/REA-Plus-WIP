package p698au1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c41.AbstractC4001c2;
import c51.AbstractC4234k;
import c93.InterfaceC4351m;
import hy0.AbstractC17770n;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p510u0.AbstractC34302b;
import p530up.AbstractC35148d;
import p730qt2.AbstractC30613s;
import pj2.AbstractC29321t;

/* JADX INFO: renamed from: au1.f */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C2061f implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8186w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f8187x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f8188y;

    public /* synthetic */ C2061f(Modifier modifier, int i13, int i14) {
        this.f8186w = 7;
        this.f8187x = modifier;
        this.f8188y = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f8186w) {
            case 0:
                return AbstractC2062g.m6492c(this.f8187x, this.f8188y, composer, num.intValue());
            case 1:
                num.getClass();
                AbstractC35148d.m111172c(this.f8187x, composer, AbstractC28683x.m87244L(this.f8188y | 1));
                return C23454a0.f92919a;
            case 2:
                return AbstractC4001c2.m12134h(this.f8187x, this.f8188y, composer, num.intValue());
            case 3:
                return AbstractC4234k.m13133F(this.f8187x, this.f8188y, composer, num.intValue());
            case 4:
                return AbstractC17770n.m50990R(this.f8187x, this.f8188y, composer, num.intValue());
            case 5:
                return AbstractC29321t.m89242z(this.f8187x, this.f8188y, composer, num.intValue());
            case 6:
                return AbstractC30613s.m93965k(this.f8187x, this.f8188y, composer, num.intValue());
            default:
                num.getClass();
                AbstractC34302b.m108611b(this.f8187x, AbstractC28683x.m87244L(1), composer, this.f8188y);
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C2061f(Modifier modifier, int i13, int i14, byte b) {
        this.f8186w = i14;
        this.f8187x = modifier;
        this.f8188y = i13;
    }
}
