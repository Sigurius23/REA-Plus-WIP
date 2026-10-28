package p319m4;

/* JADX INFO: renamed from: m4.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C25018g {

    /* JADX INFO: renamed from: a */
    public int f97972a;

    /* JADX INFO: renamed from: d */
    public C25015d f97975d;

    /* JADX INFO: renamed from: e */
    public C25015d f97976e;

    /* JADX INFO: renamed from: f */
    public C25015d f97977f;

    /* JADX INFO: renamed from: g */
    public C25015d f97978g;

    /* JADX INFO: renamed from: h */
    public int f97979h;

    /* JADX INFO: renamed from: i */
    public int f97980i;

    /* JADX INFO: renamed from: j */
    public int f97981j;

    /* JADX INFO: renamed from: k */
    public int f97982k;

    /* JADX INFO: renamed from: q */
    public int f97988q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C25019h f97989r;

    /* JADX INFO: renamed from: b */
    public C25016e f97973b = null;

    /* JADX INFO: renamed from: c */
    public int f97974c = 0;

    /* JADX INFO: renamed from: l */
    public int f97983l = 0;

    /* JADX INFO: renamed from: m */
    public int f97984m = 0;

    /* JADX INFO: renamed from: n */
    public int f97985n = 0;

    /* JADX INFO: renamed from: o */
    public int f97986o = 0;

    /* JADX INFO: renamed from: p */
    public int f97987p = 0;

    public C25018g(C25019h c25019h, int i13, C25015d c25015d, C25015d c25015d2, C25015d c25015d3, C25015d c25015d4, int i14) {
        this.f97989r = c25019h;
        this.f97972a = i13;
        this.f97975d = c25015d;
        this.f97976e = c25015d2;
        this.f97977f = c25015d3;
        this.f97978g = c25015d4;
        this.f97979h = c25019h.f98032x0;
        this.f97980i = c25019h.f98028t0;
        this.f97981j = c25019h.f98033y0;
        this.f97982k = c25019h.f98029u0;
        this.f97988q = i14;
    }

    /* JADX INFO: renamed from: a */
    public final void m73462a(C25016e c25016e) {
        int i13 = this.f97972a;
        C25019h c25019h = this.f97989r;
        if (i13 == 0) {
            int iM73469b0 = c25019h.m73469b0(c25016e, this.f97988q);
            if (c25016e.f97940q0[0] == 3) {
                this.f97987p++;
                iM73469b0 = 0;
            }
            this.f97983l = iM73469b0 + (c25016e.f97922h0 != 8 ? c25019h.f98002Q0 : 0) + this.f97983l;
            int iM73468a0 = c25019h.m73468a0(c25016e, this.f97988q);
            if (this.f97973b == null || this.f97974c < iM73468a0) {
                this.f97973b = c25016e;
                this.f97974c = iM73468a0;
                this.f97984m = iM73468a0;
            }
        } else {
            int iM73469b1 = c25019h.m73469b0(c25016e, this.f97988q);
            int iM73468a1 = c25019h.m73468a0(c25016e, this.f97988q);
            if (c25016e.f97940q0[1] == 3) {
                this.f97987p++;
                iM73468a1 = 0;
            }
            this.f97984m = iM73468a1 + (c25016e.f97922h0 != 8 ? c25019h.f98003R0 : 0) + this.f97984m;
            if (this.f97973b == null || this.f97974c < iM73469b1) {
                this.f97973b = c25016e;
                this.f97974c = iM73469b1;
                this.f97983l = iM73469b1;
            }
        }
        this.f97986o++;
    }

    /* JADX INFO: renamed from: b */
    public final void m73463b(int i13, boolean z4, boolean z13) {
        C25019h c25019h;
        int i14;
        int i15;
        C25016e c25016e;
        boolean z14;
        char c3;
        float f13;
        float f14;
        int i16;
        float f15;
        float f16;
        int i17;
        int i18 = this.f97986o;
        int i19 = 0;
        while (true) {
            c25019h = this.f97989r;
            if (i19 >= i18 || (i17 = this.f97985n + i19) >= c25019h.f98014c1) {
                break;
            }
            C25016e c25016e2 = c25019h.f98013b1[i17];
            if (c25016e2 != null) {
                c25016e2.m73417E();
            }
            i19++;
        }
        if (i18 == 0 || this.f97973b == null) {
            return;
        }
        boolean z15 = z13 && i13 == 0;
        int i24 = -1;
        int i25 = -1;
        for (int i26 = 0; i26 < i18; i26++) {
            int i27 = this.f97985n + (z4 ? (i18 - 1) - i26 : i26);
            if (i27 >= c25019h.f98014c1) {
                break;
            }
            C25016e c25016e3 = c25019h.f98013b1[i27];
            if (c25016e3 != null && c25016e3.f97922h0 == 0) {
                if (i24 == -1) {
                    i24 = i26;
                }
                i25 = i26;
            }
        }
        if (this.f97972a == 0) {
            C25016e c25016e4 = this.f97973b;
            c25016e4.f97928k0 = c25019h.f97991F0;
            C25015d c25015d = c25016e4.f97893M;
            C25015d c25015d2 = c25016e4.f97891K;
            int i28 = this.f97980i;
            if (i13 > 0) {
                i28 += c25019h.f98003R0;
            }
            c25015d2.m73399a(this.f97976e, i28);
            if (z13) {
                c25015d.m73399a(this.f97978g, this.f97982k);
            }
            if (i13 > 0) {
                this.f97976e.f97875d.f97893M.m73399a(c25015d2, 0);
            }
            if (c25019h.f98005T0 != 3 || c25016e4.f97886F) {
                c25016e = c25016e4;
                break;
            }
            int i29 = 0;
            while (true) {
                if (i29 < i18) {
                    int i34 = this.f97985n + (z4 ? (i18 - 1) - i29 : i29);
                    if (i34 < c25019h.f98014c1) {
                        c25016e = c25019h.f98013b1[i34];
                        if (c25016e.f97886F) {
                            break;
                        } else {
                            i29++;
                        }
                    }
                }
                c25016e = c25016e4;
                break;
            }
            int i35 = 0;
            C25016e c25016e5 = null;
            while (i35 < i18) {
                int i36 = z4 ? (i18 - 1) - i35 : i35;
                int i37 = this.f97985n + i36;
                if (i37 >= c25019h.f98014c1) {
                    return;
                }
                C25016e c25016e6 = c25019h.f98013b1[i37];
                if (c25016e6 == null) {
                    i18 = i18;
                    z14 = z15;
                    i25 = i25;
                    c3 = 3;
                } else {
                    C25015d c25015d3 = c25016e6.f97893M;
                    C25015d c25015d4 = c25016e6.f97891K;
                    C25015d c25015d5 = c25016e6.f97890J;
                    z14 = z15;
                    if (i35 == 0) {
                        c25016e6.m73436g(c25015d5, this.f97975d, this.f97979h);
                    }
                    if (i36 == 0) {
                        int i38 = c25019h.f97990E0;
                        if (z4) {
                            f13 = 1.0f;
                            f14 = 1.0f - c25019h.f97996K0;
                        } else {
                            f13 = 1.0f;
                            f14 = c25019h.f97996K0;
                        }
                        if (this.f97985n != 0 || (i16 = c25019h.f97992G0) == -1) {
                            if (!z13 || (i16 = c25019h.f97994I0) == -1) {
                                i16 = i38;
                                f15 = f14;
                            } else if (z4) {
                                f16 = c25019h.f98000O0;
                                f15 = f13 - f16;
                            } else {
                                f15 = c25019h.f98000O0;
                            }
                        } else if (z4) {
                            f16 = c25019h.f97998M0;
                            f15 = f13 - f16;
                        } else {
                            f15 = c25019h.f97998M0;
                        }
                        c25016e6.f97926j0 = i16;
                        c25016e6.f97916e0 = f15;
                    }
                    if (i35 == i18 - 1) {
                        c25016e6.m73436g(c25016e6.f97892L, this.f97977f, this.f97981j);
                    }
                    if (c25016e5 != null) {
                        C25015d c25015d6 = c25016e5.f97892L;
                        c25015d5.m73399a(c25015d6, c25019h.f98002Q0);
                        if (i35 == i24) {
                            int i39 = this.f97979h;
                            if (c25015d5.m73406h()) {
                                c25015d5.f97879h = i39;
                            }
                        }
                        c25015d6.m73399a(c25015d5, 0);
                        if (i35 == i25 + 1) {
                            int i44 = this.f97981j;
                            if (c25015d6.m73406h()) {
                                c25015d6.f97879h = i44;
                            }
                        }
                    }
                    if (c25016e6 != c25016e4) {
                        int i45 = c25019h.f98005T0;
                        c3 = 3;
                        if (i45 == 3 && c25016e.f97886F && c25016e6 != c25016e && c25016e6.f97886F) {
                            c25016e6.f97894N.m73399a(c25016e.f97894N, 0);
                        } else if (i45 == 0) {
                            c25015d4.m73399a(c25015d2, 0);
                        } else if (i45 == 1) {
                            c25015d3.m73399a(c25015d, 0);
                        } else if (z14) {
                            c25015d4.m73399a(this.f97976e, this.f97980i);
                            c25015d3.m73399a(this.f97978g, this.f97982k);
                        } else {
                            c25015d4.m73399a(c25015d2, 0);
                            c25015d3.m73399a(c25015d, 0);
                        }
                    } else {
                        c3 = 3;
                    }
                    c25016e5 = c25016e6;
                }
                i35++;
                z15 = z14;
                i25 = i25;
                i18 = i18;
            }
            return;
        }
        int i46 = i18;
        boolean z16 = z15;
        int i47 = i25;
        C25016e c25016e7 = this.f97973b;
        c25016e7.f97926j0 = c25019h.f97990E0;
        C25015d c25015d7 = c25016e7.f97890J;
        C25015d c25015d8 = c25016e7.f97892L;
        int i48 = this.f97979h;
        if (i13 > 0) {
            i48 += c25019h.f98002Q0;
        }
        if (z4) {
            c25015d8.m73399a(this.f97977f, i48);
            if (z13) {
                c25015d7.m73399a(this.f97975d, this.f97981j);
            }
            if (i13 > 0) {
                this.f97977f.f97875d.f97890J.m73399a(c25015d8, 0);
            }
        } else {
            c25015d7.m73399a(this.f97975d, i48);
            if (z13) {
                c25015d8.m73399a(this.f97977f, this.f97981j);
            }
            if (i13 > 0) {
                this.f97975d.f97875d.f97892L.m73399a(c25015d7, 0);
            }
        }
        int i49 = 0;
        C25016e c25016e8 = null;
        while (true) {
            int i54 = i46;
            if (i49 >= i54 || (i14 = this.f97985n + i49) >= c25019h.f98014c1) {
                return;
            }
            C25016e c25016e9 = c25019h.f98013b1[i14];
            if (c25016e9 == null) {
                i46 = i54;
            } else {
                C25015d c25015d9 = c25016e9.f97891K;
                C25015d c25015d10 = c25016e9.f97892L;
                C25015d c25015d11 = c25016e9.f97890J;
                if (i49 == 0) {
                    c25016e9.m73436g(c25015d9, this.f97976e, this.f97980i);
                    int i55 = c25019h.f97991F0;
                    float f17 = c25019h.f97997L0;
                    if (this.f97985n == 0) {
                        int i56 = c25019h.f97993H0;
                        i46 = i54;
                        i15 = -1;
                        if (i56 != -1) {
                            f17 = c25019h.f97999N0;
                        }
                        i55 = i56;
                        c25016e9.f97928k0 = i55;
                        c25016e9.f97918f0 = f17;
                    } else {
                        i46 = i54;
                        i15 = -1;
                    }
                    if (z13 && (i56 = c25019h.f97995J0) != i15) {
                        f17 = c25019h.f98001P0;
                        i55 = i56;
                    }
                    c25016e9.f97928k0 = i55;
                    c25016e9.f97918f0 = f17;
                } else {
                    i46 = i54;
                }
                if (i49 == i46 - 1) {
                    c25016e9.m73436g(c25016e9.f97893M, this.f97978g, this.f97982k);
                }
                if (c25016e8 != null) {
                    C25015d c25015d12 = c25016e8.f97893M;
                    c25015d9.m73399a(c25015d12, c25019h.f98003R0);
                    if (i49 == i24) {
                        int i57 = this.f97980i;
                        if (c25015d9.m73406h()) {
                            c25015d9.f97879h = i57;
                        }
                    }
                    c25015d12.m73399a(c25015d9, 0);
                    if (i49 == i47 + 1) {
                        int i58 = this.f97982k;
                        if (c25015d12.m73406h()) {
                            c25015d12.f97879h = i58;
                        }
                    }
                }
                if (c25016e9 != c25016e7) {
                    if (z4) {
                        int i59 = c25019h.f98004S0;
                        if (i59 == 0) {
                            c25015d10.m73399a(c25015d8, 0);
                        } else if (i59 == 1) {
                            c25015d11.m73399a(c25015d7, 0);
                        } else if (i59 == 2) {
                            c25015d11.m73399a(c25015d7, 0);
                            c25015d10.m73399a(c25015d8, 0);
                        }
                    } else {
                        int i64 = c25019h.f98004S0;
                        if (i64 == 0) {
                            c25015d11.m73399a(c25015d7, 0);
                        } else if (i64 == 1) {
                            c25015d10.m73399a(c25015d8, 0);
                        } else if (i64 == 2) {
                            if (z16) {
                                c25015d11.m73399a(this.f97975d, this.f97979h);
                                c25015d10.m73399a(this.f97977f, this.f97981j);
                            } else {
                                c25015d11.m73399a(c25015d7, 0);
                                c25015d10.m73399a(c25015d8, 0);
                            }
                        }
                    }
                }
                c25016e8 = c25016e9;
            }
            i49++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m73464c() {
        return this.f97972a == 1 ? this.f97984m - this.f97989r.f98003R0 : this.f97984m;
    }

    /* JADX INFO: renamed from: d */
    public final int m73465d() {
        return this.f97972a == 0 ? this.f97983l - this.f97989r.f98002Q0 : this.f97983l;
    }

    /* JADX INFO: renamed from: e */
    public final void m73466e(int i13) {
        C25019h c25019h;
        int i14;
        int i15 = this.f97987p;
        if (i15 == 0) {
            return;
        }
        int i16 = this.f97986o;
        int i17 = i13 / i15;
        int i18 = 0;
        while (true) {
            c25019h = this.f97989r;
            if (i18 >= i16 || (i14 = this.f97985n + i18) >= c25019h.f98014c1) {
                break;
            }
            C25016e c25016e = c25019h.f98013b1[i14];
            if (this.f97972a == 0) {
                if (c25016e != null) {
                    int[] iArr = c25016e.f97940q0;
                    if (iArr[0] == 3 && c25016e.f97942s == 0) {
                        c25019h.m73478Z(1, i17, iArr[1], c25016e.m73441l(), c25016e);
                    }
                }
            } else if (c25016e != null) {
                int[] iArr2 = c25016e.f97940q0;
                if (iArr2[1] == 3 && c25016e.f97943t == 0) {
                    int i19 = i17;
                    c25019h.m73478Z(iArr2[0], c25016e.m73445r(), 1, i19, c25016e);
                    i17 = i19;
                }
            }
            i18++;
        }
        this.f97983l = 0;
        this.f97984m = 0;
        this.f97973b = null;
        this.f97974c = 0;
        int i24 = this.f97986o;
        for (int i25 = 0; i25 < i24; i25++) {
            int i26 = this.f97985n + i25;
            if (i26 >= c25019h.f98014c1) {
                return;
            }
            C25016e c25016e2 = c25019h.f98013b1[i26];
            if (this.f97972a == 0) {
                int iM73445r = c25016e2.m73445r();
                int i27 = c25019h.f98002Q0;
                if (c25016e2.f97922h0 == 8) {
                    i27 = 0;
                }
                this.f97983l = iM73445r + i27 + this.f97983l;
                int iM73468a0 = c25019h.m73468a0(c25016e2, this.f97988q);
                if (this.f97973b == null || this.f97974c < iM73468a0) {
                    this.f97973b = c25016e2;
                    this.f97974c = iM73468a0;
                    this.f97984m = iM73468a0;
                }
            } else {
                int iM73469b0 = c25019h.m73469b0(c25016e2, this.f97988q);
                int iM73468a1 = c25019h.m73468a0(c25016e2, this.f97988q);
                int i28 = c25019h.f98003R0;
                if (c25016e2.f97922h0 == 8) {
                    i28 = 0;
                }
                this.f97984m = iM73468a1 + i28 + this.f97984m;
                if (this.f97973b == null || this.f97974c < iM73469b0) {
                    this.f97973b = c25016e2;
                    this.f97974c = iM73469b0;
                    this.f97983l = iM73469b0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m73467f(int i13, C25015d c25015d, C25015d c25015d2, C25015d c25015d3, C25015d c25015d4, int i14, int i15, int i16, int i17, int i18) {
        this.f97972a = i13;
        this.f97975d = c25015d;
        this.f97976e = c25015d2;
        this.f97977f = c25015d3;
        this.f97978g = c25015d4;
        this.f97979h = i14;
        this.f97980i = i15;
        this.f97981j = i16;
        this.f97982k = i17;
        this.f97988q = i18;
    }
}
