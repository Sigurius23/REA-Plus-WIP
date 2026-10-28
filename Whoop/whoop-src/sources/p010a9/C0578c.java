package p010a9;

import android.media.MediaCodec;
import p309lo.AbstractC24567y;
import p499t9.C33652u;
import p607x8.AbstractC38065t;
import p619xl.C38445a;

/* JADX INFO: renamed from: a9.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C0578c {

    /* JADX INFO: renamed from: a */
    public byte[] f2053a;

    /* JADX INFO: renamed from: b */
    public byte[] f2054b;

    /* JADX INFO: renamed from: c */
    public int f2055c;

    /* JADX INFO: renamed from: d */
    public int[] f2056d;

    /* JADX INFO: renamed from: e */
    public int[] f2057e;

    /* JADX INFO: renamed from: f */
    public int f2058f;

    /* JADX INFO: renamed from: g */
    public int f2059g;

    /* JADX INFO: renamed from: h */
    public int f2060h;

    /* JADX INFO: renamed from: i */
    public final MediaCodec.CryptoInfo f2061i;

    /* JADX INFO: renamed from: j */
    public final Object f2062j;

    public C0578c(int i13) {
        C33652u c33652u;
        switch (i13) {
            case 1:
                MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
                this.f2061i = cryptoInfo;
                if (AbstractC24567y.f95875a >= 24) {
                    c33652u = new C33652u();
                    c33652u.f140441w = cryptoInfo;
                    c33652u.f140442x = new MediaCodec.CryptoInfo.Pattern(0, 0);
                } else {
                    c33652u = null;
                }
                this.f2062j = c33652u;
                break;
            default:
                MediaCodec.CryptoInfo cryptoInfo2 = new MediaCodec.CryptoInfo();
                this.f2061i = cryptoInfo2;
                this.f2062j = AbstractC38065t.f163031a >= 24 ? new C38445a(cryptoInfo2) : null;
                break;
        }
    }
}
