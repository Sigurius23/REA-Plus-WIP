package ug3;

import java.io.IOException;
import pg3.InterfaceC29201n;
import ud3.AbstractC34799a1;

/* JADX INFO: renamed from: ug3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C34953b implements InterfaceC29201n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f147917w;

    /* JADX INFO: renamed from: x */
    public static final C34953b f147914x = new C34953b(0);

    /* JADX INFO: renamed from: y */
    public static final C34953b f147915y = new C34953b(1);

    /* JADX INFO: renamed from: z */
    public static final C34953b f147916z = new C34953b(2);

    /* JADX INFO: renamed from: E */
    public static final C34953b f147908E = new C34953b(3);

    /* JADX INFO: renamed from: F */
    public static final C34953b f147909F = new C34953b(4);

    /* JADX INFO: renamed from: G */
    public static final C34953b f147910G = new C34953b(5);

    /* JADX INFO: renamed from: H */
    public static final C34953b f147911H = new C34953b(6);

    /* JADX INFO: renamed from: I */
    public static final C34953b f147912I = new C34953b(7);

    /* JADX INFO: renamed from: J */
    public static final C34953b f147913J = new C34953b(8);

    public /* synthetic */ C34953b(int i13) {
        this.f147917w = i13;
    }

    @Override // pg3.InterfaceC29201n
    public final Object convert(Object obj) throws IOException {
        switch (this.f147917w) {
            case 0:
                return Boolean.valueOf(((AbstractC34799a1) obj).m109860m());
            case 1:
                return Byte.valueOf(((AbstractC34799a1) obj).m109860m());
            case 2:
                String strM109860m = ((AbstractC34799a1) obj).m109860m();
                if (strM109860m.length() == 1) {
                    return Character.valueOf(strM109860m.charAt(0));
                }
                throw new IOException("Expected body of length 1 for Character conversion but was " + strM109860m.length());
            case 3:
                return Double.valueOf(((AbstractC34799a1) obj).m109860m());
            case 4:
                return Float.valueOf(((AbstractC34799a1) obj).m109860m());
            case 5:
                return Integer.valueOf(((AbstractC34799a1) obj).m109860m());
            case 6:
                return Long.valueOf(((AbstractC34799a1) obj).m109860m());
            case 7:
                return Short.valueOf(((AbstractC34799a1) obj).m109860m());
            default:
                return ((AbstractC34799a1) obj).m109860m();
        }
    }
}
