package mi2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import ji2.C21727f;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mi2.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C25582e implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f100368w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21727f f100369x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f100370y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f100371z;

    public /* synthetic */ C25582e(C21727f c21727f, Function1 function1, int i13, int i14) {
        this.f100368w = i14;
        this.f100369x = c21727f;
        this.f100370y = function1;
        this.f100371z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f100368w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC25586i.m75247F(this.f100369x, this.f100370y, this.f100371z, composer, iIntValue);
            case 1:
                return AbstractC25586i.m75276u(this.f100369x, this.f100370y, this.f100371z, composer, iIntValue);
            case 2:
                return AbstractC25586i.m75273r(this.f100369x, this.f100370y, this.f100371z, composer, iIntValue);
            default:
                return AbstractC25586i.m75280y(this.f100369x, this.f100370y, this.f100371z, composer, iIntValue);
        }
    }
}
