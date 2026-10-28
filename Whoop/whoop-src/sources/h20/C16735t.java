package h20;

import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1601k1;
import b30.C2570m;
import c93.InterfaceC4339a;
import d30.C11529f;
import e30.AbstractC12605c;
import e30.C12603a;
import java.util.List;
import k20.C22136a;
import p029b5.C2725d;
import p078d1.C11457j;
import p337n8.C26444a;
import p352ny.C27232d;
import p599wz.C37734l1;
import p695zx.C41193o;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29829n;
import v00.C35459c0;
import y00.C38809d5;
import y00.C38818e4;
import y00.C38888l4;
import y00.C38915o4;
import y00.C39013z3;
import y00.EnumC38828f4;
import y00.InterfaceC38949s2;

/* JADX INFO: renamed from: h20.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C16735t implements InterfaceC16747v {

    /* JADX INFO: renamed from: a */
    public static final C16735t f64289a = new C16735t();

    /* JADX INFO: renamed from: b */
    public static final C16735t f64290b = new C16735t();

    /* JADX INFO: renamed from: a */
    public static C16687l m47260a(InterfaceC41211c displayName, C38915o4 paymentMethod, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(displayName, "displayName");
        AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
        InterfaceC38949s2 interfaceC38949s2 = paymentMethod.f167524R;
        EnumC38828f4 enumC38828f4 = paymentMethod.f167511E;
        int i13 = enumC38828f4 == null ? -1 : AbstractC16681k.f64146a[enumC38828f4.ordinal()];
        InterfaceC16728r4 c16698m4 = null;
        if (i13 != 1) {
            if (i13 == 2) {
                C38888l4 c38888l4 = paymentMethod.f167523Q;
                if (c38888l4 != null) {
                    c16698m4 = new C16716p4(c38888l4);
                }
            } else if (i13 == 3) {
                C38818e4 c38818e4 = paymentMethod.f167518L;
                if (c38818e4 != null) {
                    c16698m4 = new C16710o4(c38818e4);
                }
            } else if (i13 == 4 && interfaceC38949s2 != null) {
                c16698m4 = new C16704n4(interfaceC38949s2);
            }
        } else if (interfaceC38949s2 != null) {
            c16698m4 = new C16704n4(interfaceC38949s2);
        } else {
            C39013z3 c39013z3 = paymentMethod.f167514H;
            if (c39013z3 != null) {
                c16698m4 = new C16698m4(c39013z3, paymentMethod.f167512F);
            }
        }
        if (c16698m4 == null) {
            c16698m4 = C16722q4.f64264a;
        }
        return new C16687l(displayName, paymentMethod, c16698m4, z4, z13);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static C16657g m47261b(AbstractC12605c viewModel, C35459c0 paymentMethodMetadata, int i13) {
        boolean z4;
        C38809d5 c38809d5Mo47221e;
        C16765y c16765y = new C16765y();
        boolean z13 = (i13 & 8) == 0;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        C26444a c26444aM5043b = AbstractC1640x1.m5043b(viewModel);
        C27232d tapToAddCollectionHandler = viewModel.f43004H;
        C11529f c11529f = new C11529f(viewModel, 4);
        C11529f c11529f2 = new C11529f(viewModel, 5);
        AbstractC22676k.m65750j(tapToAddCollectionHandler, "tapToAddCollectionHandler");
        C2570m c2570m = paymentMethodMetadata.f150994k0 ? new C2570m(c26444aM5043b, tapToAddCollectionHandler, paymentMethodMetadata, c11529f, c11529f2) : null;
        C26444a c26444aM5043b2 = AbstractC1640x1.m5043b(viewModel);
        C41193o c41193o = viewModel.f43002F;
        C37734l1 c37734l1 = viewModel.f43001E.f64391a;
        boolean zIsEmpty = ((List) ((InterfaceC4339a) viewModel.f43022Z.f64022c.f104635y).invoke()).isEmpty();
        C22136a c22136a = viewModel.f43026x;
        boolean z14 = z13;
        C1601k1 c1601k1 = viewModel.f43028z;
        C38809d5 c38809d5 = null;
        C11457j c11457j = viewModel.f43010N;
        C2725d c2725d = c38809d5;
        if (z14) {
            InterfaceC16640d0 interfaceC16640d0Mo35330n = viewModel.mo35330n();
            if ((interfaceC16640d0Mo35330n != null ? interfaceC16640d0Mo35330n.mo47218b() : null) instanceof C29829n) {
                InterfaceC16640d0 interfaceC16640d0Mo35330n2 = viewModel.mo35330n();
                if (interfaceC16640d0Mo35330n2 != null) {
                    c38809d5Mo47221e = c38809d5;
                    c38809d5Mo47221e = interfaceC16640d0Mo35330n2.mo47221e();
                }
                z4 = c38809d5Mo47221e != null;
            }
            c2725d = new C2725d(z4, paymentMethodMetadata.f150986c0, viewModel.f43028z);
        }
        return new C16657g(c26444aM5043b2, c16765y, c41193o, paymentMethodMetadata, new C12603a(viewModel, 1), new C11529f(viewModel, 6), c37734l1, zIsEmpty, c22136a, c1601k1, c11457j, false, c2725d, c2570m);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C16687l m47262c(InterfaceC41211c interfaceC41211c, C38915o4 c38915o4, boolean z4, int i13) {
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        return m47260a(interfaceC41211c, c38915o4, z4, (i13 & 8) == 0);
    }
}
