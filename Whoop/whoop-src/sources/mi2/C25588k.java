package mi2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import ji2.C21733l;

/* JADX INFO: renamed from: mi2.k */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C25588k implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f100401w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21733l f100402x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f100403y;

    public /* synthetic */ C25588k(C21733l c21733l, int i13, int i14) {
        this.f100401w = i14;
        this.f100402x = c21733l;
        this.f100403y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f100401w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC25589l.m75308u(this.f100402x, this.f100403y, composer, iIntValue);
            default:
                return AbstractC25589l.m75312y(this.f100402x, this.f100403y, composer, iIntValue);
        }
    }
}
