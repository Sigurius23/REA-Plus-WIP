package p113ea;

import java.util.Arrays;
import java.util.Objects;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p516u8.C34610p;
import p516u8.InterfaceC34583b0;

/* JADX INFO: renamed from: ea.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C12890a implements InterfaceC34583b0 {

    /* JADX INFO: renamed from: g */
    public static final C34610p f44376g;

    /* JADX INFO: renamed from: h */
    public static final C34610p f44377h;

    /* JADX INFO: renamed from: a */
    public final String f44378a;

    /* JADX INFO: renamed from: b */
    public final String f44379b;

    /* JADX INFO: renamed from: c */
    public final long f44380c;

    /* JADX INFO: renamed from: d */
    public final long f44381d;

    /* JADX INFO: renamed from: e */
    public final byte[] f44382e;

    /* JADX INFO: renamed from: f */
    public int f44383f;

    static {
        C34608o c34608o = new C34608o();
        c34608o.f145741m = AbstractC34587d0.m109382o("application/id3");
        f44376g = new C34610p(c34608o);
        C34608o c34608o2 = new C34608o();
        c34608o2.f145741m = AbstractC34587d0.m109382o("application/x-scte35");
        f44377h = new C34610p(c34608o2);
    }

    public C12890a(String str, String str2, long j7, long j13, byte[] bArr) {
        this.f44378a = str;
        this.f44379b = str2;
        this.f44380c = j7;
        this.f44381d = j13;
        this.f44382e = bArr;
    }

    @Override // p516u8.InterfaceC34583b0
    /* JADX INFO: renamed from: d */
    public final C34610p mo36297d() {
        String str = this.f44378a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f44377h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f44376g;
            default:
                return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12890a.class == obj.getClass()) {
            C12890a c12890a = (C12890a) obj;
            if (this.f44380c == c12890a.f44380c && this.f44381d == c12890a.f44381d && Objects.equals(this.f44378a, c12890a.f44378a) && Objects.equals(this.f44379b, c12890a.f44379b) && Arrays.equals(this.f44382e, c12890a.f44382e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f44383f == 0) {
            String str = this.f44378a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f44379b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j7 = this.f44380c;
            int i13 = (iHashCode2 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
            long j13 = this.f44381d;
            this.f44383f = Arrays.hashCode(this.f44382e) + ((i13 + ((int) (j13 ^ (j13 >>> 32)))) * 31);
        }
        return this.f44383f;
    }

    @Override // p516u8.InterfaceC34583b0
    /* JADX INFO: renamed from: j */
    public final byte[] mo36298j() {
        if (mo36297d() != null) {
            return this.f44382e;
        }
        return null;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f44378a + ", id=" + this.f44381d + ", durationMs=" + this.f44380c + ", value=" + this.f44379b;
    }
}
