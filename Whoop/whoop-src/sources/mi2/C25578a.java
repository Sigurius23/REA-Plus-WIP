package mi2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import ji2.C21733l;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mi2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C25578a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f100349w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21733l f100350x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f100351y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f100352z;

    public /* synthetic */ C25578a(C21733l c21733l, Function1 function1, int i13, int i14) {
        this.f100349w = i14;
        this.f100350x = c21733l;
        this.f100351y = function1;
        this.f100352z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f100349w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC25580c.m75210A(this.f100350x, this.f100351y, this.f100352z, composer, iIntValue);
            case 1:
                return AbstractC25589l.m75306s(this.f100350x, this.f100351y, this.f100352z, composer, iIntValue);
            default:
                return AbstractC25589l.m75302o(this.f100350x, this.f100351y, this.f100352z, composer, iIntValue);
        }
    }
}
