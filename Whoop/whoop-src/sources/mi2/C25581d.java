package mi2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import ji2.C21727f;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mi2.d */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C25581d implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f100365w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21727f f100366x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f100367y;

    public /* synthetic */ C25581d(int i13, C21727f c21727f, Function1 function1) {
        this.f100365w = i13;
        this.f100366x = c21727f;
        this.f100367y = function1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f100365w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC25586i.m75245D(this.f100366x, this.f100367y, composer, iIntValue);
            default:
                return AbstractC25586i.m75278w(this.f100366x, this.f100367y, composer, iIntValue);
        }
    }
}
