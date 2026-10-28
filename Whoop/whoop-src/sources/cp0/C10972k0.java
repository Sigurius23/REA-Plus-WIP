package cp0;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import java.util.List;
import nl0.EnumC26811m;
import p390p1.InterfaceC28601c1;
import p412q3.C29891y;
import p702ch0.C4605b;
import p715kotlin.jvm.functions.Function1;
import ql0.AbstractC30467b;

/* JADX INFO: renamed from: cp0.k0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C10972k0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f34127w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f34128x;

    public /* synthetic */ C10972k0(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f34127w = i13;
        this.f34128x = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f34127w) {
            case 0:
                return AbstractC10969j0.c.m29216j(this.f34128x, (EnumC11003u1) obj);
            case 1:
                return AbstractC10942a0.m28993C(this.f34128x, (AbstractC30467b) obj);
            case 2:
                return AbstractC10969j0.m29112E0(this.f34128x, ((Boolean) obj).booleanValue());
            case 3:
                return AbstractC10969j0.m29114F0(this.f34128x, (InterfaceC4339a) obj);
            case 4:
                return AbstractC10969j0.m29116G0(this.f34128x, (InterfaceC4339a) obj);
            case 5:
                return AbstractC10969j0.m29118H0(this.f34128x, (InterfaceC4339a) obj);
            case 6:
                return AbstractC10969j0.m29120I0(this.f34128x, (String) obj);
            case 7:
                return AbstractC10969j0.m29200t0(this.f34128x, (EnumC11003u1) obj);
            case 8:
                return AbstractC10969j0.m29122J0(this.f34128x, ((Boolean) obj).booleanValue());
            case 9:
                return AbstractC10969j0.m29124K0(this.f34128x, ((Boolean) obj).booleanValue());
            case 10:
                return AbstractC10969j0.m29108C0(this.f34128x, ((Boolean) obj).booleanValue());
            case 11:
                return AbstractC10969j0.m29202u0(this.f34128x, ((Boolean) obj).booleanValue());
            case 12:
                return AbstractC11009x0.m29456U0(this.f34128x, (C29891y) obj);
            case 13:
                return AbstractC11009x0.m29442N0(this.f34128x, (C29891y) obj);
            case 14:
                return AbstractC11009x0.m29531v0(this.f34128x, (List) obj);
            case 15:
                return AbstractC11009x0.m29534w0(this.f34128x, (TextResource) obj);
            case 16:
                return AbstractC11009x0.m29537x0(this.f34128x, (InterfaceC4339a) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC11009x0.m29540y0(this.f34128x, (C4605b) obj);
            default:
                return AbstractC11009x0.m29542z0(this.f34128x, (EnumC26811m) obj);
        }
    }
}
