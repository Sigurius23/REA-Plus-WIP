package p328mj;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: mj.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C25598e extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f100431w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f100432x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25598e(int i13, InterfaceC28601c1 interfaceC28601c1) {
        super(0);
        this.f100431w = i13;
        this.f100432x = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f100431w) {
            case 0:
                this.f100432x.setValue(Boolean.TRUE);
                break;
            case 1:
                this.f100432x.setValue(Boolean.FALSE);
                break;
            case 2:
                this.f100432x.setValue(Boolean.FALSE);
                break;
            case 3:
                InterfaceC28601c1 interfaceC28601c1 = this.f100432x;
                interfaceC28601c1.setValue(Boolean.valueOf(!((Boolean) interfaceC28601c1.getValue()).booleanValue()));
                break;
            case 4:
                InterfaceC28601c1 interfaceC28601c2 = this.f100432x;
                if (((Boolean) interfaceC28601c2.getValue()).booleanValue()) {
                    interfaceC28601c2.setValue(Boolean.FALSE);
                }
                break;
            case 5:
                InterfaceC28601c1 interfaceC28601c3 = this.f100432x;
                interfaceC28601c3.setValue(Boolean.valueOf(!((Boolean) interfaceC28601c3.getValue()).booleanValue()));
                break;
            case 6:
                InterfaceC28601c1 interfaceC28601c4 = this.f100432x;
                interfaceC28601c4.setValue(Boolean.valueOf(!((Boolean) interfaceC28601c4.getValue()).booleanValue()));
                break;
            case 7:
                InterfaceC28601c1 interfaceC28601c5 = this.f100432x;
                interfaceC28601c5.setValue(Boolean.valueOf(!((Boolean) interfaceC28601c5.getValue()).booleanValue()));
                break;
            default:
                this.f100432x.setValue(Boolean.FALSE);
                break;
        }
        return C23454a0.f92919a;
    }
}
