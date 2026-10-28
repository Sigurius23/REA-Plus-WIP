package ce3;

import c93.InterfaceC4339a;
import java.io.IOException;
import kotlinx.serialization.internal.EnumDescriptor;
import l83.C23454a0;

/* JADX INFO: renamed from: ce3.j */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C4509j implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18164w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f18165x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f18166y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f18167z;

    public /* synthetic */ C4509j(int i13, String str, EnumDescriptor enumDescriptor) {
        this.f18165x = i13;
        this.f18166y = str;
        this.f18167z = enumDescriptor;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f18164w) {
            case 0:
                C4516q c4516q = (C4516q) this.f18166y;
                try {
                    c4516q.f18203X.m14166x(this.f18165x, (EnumC4496a) this.f18167z);
                    break;
                } catch (IOException e5) {
                    EnumC4496a enumC4496a = EnumC4496a.PROTOCOL_ERROR;
                    c4516q.m14133b(enumC4496a, enumC4496a, e5);
                }
                return C23454a0.f92919a;
            default:
                return EnumDescriptor.elementDescriptors_delegate$lambda$0(this.f18165x, (String) this.f18166y, (EnumDescriptor) this.f18167z);
        }
    }

    public /* synthetic */ C4509j(C4516q c4516q, int i13, EnumC4496a enumC4496a) {
        this.f18166y = c4516q;
        this.f18165x = i13;
        this.f18167z = enumC4496a;
    }
}
