package mi2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import ji2.C21728g;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mi2.n */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C25591n implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f100407w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21728g f100408x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f100409y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f100410z;

    public /* synthetic */ C25591n(C21728g c21728g, Function1 function1, int i13, int i14) {
        this.f100407w = i14;
        this.f100408x = c21728g;
        this.f100409y = function1;
        this.f100410z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f100407w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC25593p.m75330q(this.f100408x, this.f100409y, this.f100410z, composer, iIntValue);
            default:
                return AbstractC25593p.m75327n(this.f100408x, this.f100409y, this.f100410z, composer, iIntValue);
        }
    }
}
