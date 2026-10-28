package p043c4;

import c93.InterfaceC4339a;
import eu.C13603b0;
import eu.C13612g;
import eu.C13636w;
import l83.C23454a0;
import p530up.C35146b;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c4.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C3969l extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f16176E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f16177F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16178w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ EnumC39181m f16179x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f16180y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f16181z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3969l(Object obj, Object obj2, Object obj3, Object obj4, EnumC39181m enumC39181m, int i13) {
        super(0);
        this.f16178w = i13;
        this.f16180y = obj;
        this.f16181z = obj2;
        this.f16176E = obj3;
        this.f16177F = obj4;
        this.f16179x = enumC39181m;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f16178w) {
            case 0:
                ((C3958f0) this.f16180y).m11999k((InterfaceC4339a) this.f16181z, (C3966j0) this.f16176E, (String) this.f16177F, this.f16179x);
                return C23454a0.f92919a;
            default:
                return new C13603b0((C35146b) this.f16180y, (C13612g) this.f16181z, (C13636w) this.f16176E, (InterfaceC39171c) this.f16177F, this.f16179x);
        }
    }
}
