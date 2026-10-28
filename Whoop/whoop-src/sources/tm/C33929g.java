package tm;

import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: tm.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C33929g {

    /* JADX INFO: renamed from: e */
    public static final C33929g f142174e = new C33929g(-1, -1, -1);

    /* JADX INFO: renamed from: a */
    public final int f142175a;

    /* JADX INFO: renamed from: b */
    public final int f142176b;

    /* JADX INFO: renamed from: c */
    public final int f142177c;

    /* JADX INFO: renamed from: d */
    public final int f142178d;

    public C33929g(int i13, int i14, int i15) {
        this.f142175a = i13;
        this.f142176b = i14;
        this.f142177c = i15;
        this.f142178d = AbstractC24567y.m71693x(i15) ? AbstractC24567y.m71687r(i15, i14) : -1;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder(83);
        sb4.append("AudioFormat[sampleRate=");
        sb4.append(this.f142175a);
        sb4.append(", channelCount=");
        sb4.append(this.f142176b);
        sb4.append(", encoding=");
        sb4.append(this.f142177c);
        sb4.append(']');
        return sb4.toString();
    }
}
