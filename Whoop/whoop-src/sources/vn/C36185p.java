package vn;

import in.C18715c;
import in.InterfaceC18714b;
import java.util.Map;
import p284ko.C22631o;
import p345nn.C26861l;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p556vm.C36136c;
import p556vm.InterfaceC36141h;
import sn.C32754q0;
import sn.C32770z;

/* JADX INFO: renamed from: vn.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C36185p extends C32754q0 {

    /* JADX INFO: renamed from: H */
    public final Map f154858H;

    /* JADX INFO: renamed from: I */
    public C36136c f154859I;

    public C36185p(C22631o c22631o, InterfaceC36141h interfaceC36141h, C32770z c32770z, Map map) {
        super(c22631o, interfaceC36141h, c32770z);
        this.f154858H = map;
    }

    @Override // sn.C32754q0
    /* JADX INFO: renamed from: j */
    public final C31521c0 mo102739j(C31521c0 c31521c0) {
        C36136c c36136c;
        C36136c c36136c2 = this.f154859I;
        if (c36136c2 == null) {
            c36136c2 = c31521c0.f130080O;
        }
        if (c36136c2 != null && (c36136c = (C36136c) this.f154858H.get(c36136c2.f154641y)) != null) {
            c36136c2 = c36136c;
        }
        C18715c c18715c = c31521c0.f130075J;
        C18715c c18715c2 = null;
        if (c18715c == null) {
            c18715c = c18715c2;
        } else {
            InterfaceC18714b[] interfaceC18714bArr = c18715c.f73525w;
            int length = interfaceC18714bArr.length;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    i14 = -1;
                    break;
                }
                InterfaceC18714b interfaceC18714b = interfaceC18714bArr[i14];
                if ((interfaceC18714b instanceof C26861l) && "com.apple.streaming.transportStreamTimestamp".equals(((C26861l) interfaceC18714b).f107186x)) {
                    break;
                }
                i14++;
            }
            if (i14 != -1) {
                if (length != 1) {
                    InterfaceC18714b[] interfaceC18714bArr2 = new InterfaceC18714b[length - 1];
                    while (i13 < length) {
                        if (i13 != i14) {
                            interfaceC18714bArr2[i13 < i14 ? i13 : i13 - 1] = interfaceC18714bArr[i13];
                        }
                        i13++;
                    }
                    c18715c2 = new C18715c(interfaceC18714bArr2);
                }
                c18715c = c18715c2;
            }
        }
        if (c36136c2 != c31521c0.f130080O || c18715c != c31521c0.f130075J) {
            C31518b0 c31518b0M97113a = c31521c0.m97113a();
            c31518b0M97113a.f130050n = c36136c2;
            c31518b0M97113a.f130045i = c18715c;
            c31521c0 = new C31521c0(c31518b0M97113a);
        }
        return super.mo102739j(c31521c0);
    }
}
