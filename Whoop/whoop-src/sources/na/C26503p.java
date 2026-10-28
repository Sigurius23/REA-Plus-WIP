package na;

import p499t9.C33637j0;
import p607x8.AbstractC38046a;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: na.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C26503p {

    /* JADX INFO: renamed from: a */
    public final boolean f105323a;

    /* JADX INFO: renamed from: b */
    public final String f105324b;

    /* JADX INFO: renamed from: c */
    public final C33637j0 f105325c;

    /* JADX INFO: renamed from: d */
    public final int f105326d;

    /* JADX INFO: renamed from: e */
    public final byte[] f105327e;

    public C26503p(boolean z4, String str, int i13, byte[] bArr, int i14, int i15, byte[] bArr2) {
        byte b = 0;
        int i16 = 1;
        AbstractC35849g.m113802d((i13 == 0) ^ (bArr2 == null));
        this.f105323a = z4;
        this.f105324b = str;
        this.f105326d = i13;
        this.f105327e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b = -1;
                    }
                    break;
                case 3046671:
                    b = !str.equals("cbcs") ? (byte) -1 : (byte) 1;
                    break;
                case 3049879:
                    b = !str.equals("cenc") ? (byte) -1 : (byte) 2;
                    break;
                case 3049895:
                    b = !str.equals("cens") ? (byte) -1 : (byte) 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                    i16 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    AbstractC38046a.m121826u("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.f105325c = new C33637j0(i16, i14, i15, bArr);
    }
}
