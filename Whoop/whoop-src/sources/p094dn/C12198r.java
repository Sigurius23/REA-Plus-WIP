package p094dn;

import android.util.Log;
import p309lo.AbstractC24543a;
import p588wm.C37376r;

/* JADX INFO: renamed from: dn.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C12198r {

    /* JADX INFO: renamed from: a */
    public final boolean f40729a;

    /* JADX INFO: renamed from: b */
    public final String f40730b;

    /* JADX INFO: renamed from: c */
    public final C37376r f40731c;

    /* JADX INFO: renamed from: d */
    public final int f40732d;

    /* JADX INFO: renamed from: e */
    public final byte[] f40733e;

    public C12198r(boolean z4, String str, int i13, byte[] bArr, int i14, int i15, byte[] bArr2) {
        byte b = 0;
        int i16 = 1;
        AbstractC24543a.m71569e((i13 == 0) ^ (bArr2 == null));
        this.f40729a = z4;
        this.f40730b = str;
        this.f40732d = i13;
        this.f40733e = bArr2;
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
                    StringBuilder sb4 = new StringBuilder(str.length() + 68);
                    sb4.append("Unsupported protection scheme type '");
                    sb4.append(str);
                    sb4.append("'. Assuming AES-CTR crypto mode.");
                    Log.w("TrackEncryptionBox", sb4.toString());
                    break;
            }
        }
        this.f40731c = new C37376r(i16, i14, i15, bArr);
    }
}
