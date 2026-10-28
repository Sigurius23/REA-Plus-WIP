package p499t9;

import tm.AbstractC33922a;

/* JADX INFO: renamed from: t9.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C33621b0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f140342a;

    /* JADX INFO: renamed from: b */
    public int f140343b;

    /* JADX INFO: renamed from: c */
    public String f140344c;

    /* JADX INFO: renamed from: d */
    public int f140345d;

    /* JADX INFO: renamed from: e */
    public int f140346e;

    /* JADX INFO: renamed from: f */
    public int f140347f;

    /* JADX INFO: renamed from: g */
    public int f140348g;

    /* JADX INFO: renamed from: h */
    public int f140349h;

    /* JADX INFO: renamed from: a */
    public final boolean m106233a(int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        switch (this.f140342a) {
            case 0:
                if ((i13 & (-2097152)) != -2097152 || (i14 = (i13 >>> 19) & 3) == 1 || (i15 = (i13 >>> 17) & 3) == 0 || (i16 = (i13 >>> 12) & 15) == 0 || i16 == 15 || (i17 = (i13 >>> 10) & 3) == 3) {
                    return false;
                }
                this.f140343b = i14;
                this.f140344c = AbstractC33618a.f140320s[3 - i15];
                int i26 = AbstractC33618a.f140321t[i17];
                this.f140346e = i26;
                if (i14 == 2) {
                    this.f140346e = i26 / 2;
                } else if (i14 == 0) {
                    this.f140346e = i26 / 4;
                }
                int i27 = (i13 >>> 9) & 1;
                int i28 = 1152;
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            throw new IllegalArgumentException();
                        }
                        i28 = 384;
                    }
                } else if (i14 != 3) {
                    i28 = 576;
                }
                this.f140349h = i28;
                if (i15 == 3) {
                    int i29 = i14 == 3 ? AbstractC33618a.f140322u[i16 - 1] : AbstractC33618a.f140323v[i16 - 1];
                    this.f140348g = i29;
                    this.f140345d = (((i29 * 12) / this.f140346e) + i27) * 4;
                } else {
                    if (i14 == 3) {
                        int i34 = i15 == 2 ? AbstractC33618a.f140324w[i16 - 1] : AbstractC33618a.f140325x[i16 - 1];
                        this.f140348g = i34;
                        this.f140345d = ((i34 * 144) / this.f140346e) + i27;
                    } else {
                        int i35 = AbstractC33618a.f140326y[i16 - 1];
                        this.f140348g = i35;
                        this.f140345d = (((i15 == 1 ? 72 : 144) * i35) / this.f140346e) + i27;
                    }
                }
                this.f140347f = ((i13 >> 6) & 3) == 3 ? 1 : 2;
                return true;
            default:
                if ((i13 & (-2097152)) != -2097152 || (i18 = (i13 >>> 19) & 3) == 1 || (i19 = (i13 >>> 17) & 3) == 0 || (i24 = (i13 >>> 12) & 15) == 0 || i24 == 15 || (i25 = (i13 >>> 10) & 3) == 3) {
                    return false;
                }
                this.f140343b = i18;
                this.f140344c = AbstractC33922a.f142148m[3 - i19];
                int i36 = AbstractC33922a.f142149n[i25];
                this.f140346e = i36;
                if (i18 == 2) {
                    this.f140346e = i36 / 2;
                } else if (i18 == 0) {
                    this.f140346e = i36 / 4;
                }
                int i37 = (i13 >>> 9) & 1;
                int i38 = 1152;
                if (i19 != 1) {
                    if (i19 != 2) {
                        if (i19 != 3) {
                            throw new IllegalArgumentException();
                        }
                        i38 = 384;
                    }
                } else if (i18 != 3) {
                    i38 = 576;
                }
                this.f140349h = i38;
                if (i19 == 3) {
                    int i39 = i18 == 3 ? AbstractC33922a.f142150o[i24 - 1] : AbstractC33922a.f142151p[i24 - 1];
                    this.f140348g = i39;
                    this.f140345d = (((i39 * 12) / this.f140346e) + i37) * 4;
                } else {
                    if (i18 == 3) {
                        int i44 = i19 == 2 ? AbstractC33922a.f142152q[i24 - 1] : AbstractC33922a.f142153r[i24 - 1];
                        this.f140348g = i44;
                        this.f140345d = ((i44 * 144) / this.f140346e) + i37;
                    } else {
                        int i45 = AbstractC33922a.f142154s[i24 - 1];
                        this.f140348g = i45;
                        this.f140345d = (((i19 == 1 ? 72 : 144) * i45) / this.f140346e) + i37;
                    }
                }
                this.f140347f = ((i13 >> 6) & 3) == 3 ? 1 : 2;
                return true;
        }
    }
}
