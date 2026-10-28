package p180h0;

import p007a6.C0428i;
import p095dp.AbstractC12240d;
import p132f0.AbstractC13804m;
import p132f0.C13787g0;
import p132f0.C13798k;
import p181h2.C16617b;
import p181h2.C16620e;

/* JADX INFO: renamed from: h0.a3 */
/* JADX INFO: loaded from: classes.dex */
public final class C16360a3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C16372c3 f62899a;

    public C16360a3(C16372c3 c16372c3) {
        this.f62899a = c16372c3;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x021a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0229  */
    /* JADX WARN: Code duplicated, block: B:112:0x022e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0236  */
    /* JADX WARN: Code duplicated, block: B:115:0x023a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0246  */
    /* JADX WARN: Code duplicated, block: B:120:0x024b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0253  */
    /* JADX WARN: Code duplicated, block: B:123:0x0257  */
    /* JADX WARN: Code duplicated, block: B:125:0x025a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x0260  */
    /* JADX WARN: Code duplicated, block: B:131:0x0268  */
    /* JADX WARN: Code duplicated, block: B:133:0x0270  */
    /* JADX WARN: Code duplicated, block: B:136:0x028a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0293  */
    /* JADX WARN: Code duplicated, block: B:143:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:147:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:150:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:154:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:158:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:161:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:165:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:169:0x0305  */
    /* JADX WARN: Code duplicated, block: B:171:0x0308 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:174:0x030d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0311  */
    /* JADX WARN: Code duplicated, block: B:60:0x011b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0121  */
    /* JADX WARN: Code duplicated, block: B:73:0x015b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0167  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:92:0x01dd  */
    /* JADX INFO: renamed from: a */
    public final long m46563a(int i13, long j7) {
        long j13;
        float fIntBitsToFloat;
        int i14;
        char c3;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jM47191g;
        long jM47191g2;
        boolean z4;
        boolean zM39140f;
        boolean z13;
        int i15;
        boolean z14;
        int i16;
        boolean z15;
        C16372c3 c16372c3 = this.f62899a;
        c16372c3.f62945j = i13;
        C13798k c13798k = c16372c3.f62937b;
        if (c13798k == null || !(c16372c3.f62936a.mo39183d() || c16372c3.f62936a.mo39182c())) {
            return c16372c3.m46570c(c16372c3.f62946k, j7, i13);
        }
        int i17 = c16372c3.f62945j;
        C0428i c0428i = c16372c3.f62948m;
        C13787g0 c13787g0 = c13798k.f49235c;
        if (C16620e.m47214f(c13798k.f49239g)) {
            return ((C16617b) c0428i.invoke(new C16617b(j7))).f63937a;
        }
        if (!c13798k.f49238f) {
            if (C13787g0.m39141g(c13787g0.f49188f)) {
                c13798k.m39166f(0L);
            }
            if (C13787g0.m39141g(c13787g0.f49189g)) {
                c13798k.m39167g(0L);
            }
            if (C13787g0.m39141g(c13787g0.f49186d)) {
                c13798k.m39168h(0L);
            }
            if (C13787g0.m39141g(c13787g0.f49187e)) {
                c13798k.m39165e(0L);
            }
            c13798k.f49238f = true;
        }
        int i18 = AbstractC13804m.f49253a;
        float f13 = i17 == 2 ? 4.0f : 1.0f;
        long jM47193i = C16617b.m47193i(f13, j7);
        int i19 = (int) (j7 & 4294967295L);
        if (Float.intBitsToFloat(i19) != 0.0f) {
            if (!C13787g0.m39141g(c13787g0.f49186d) || Float.intBitsToFloat(i19) >= 0.0f) {
                j13 = 4294967295L;
                if (C13787g0.m39141g(c13787g0.f49187e) && Float.intBitsToFloat(i19) > 0.0f) {
                    float fM39165e = c13798k.m39165e(jM47193i);
                    if (!C13787g0.m39141g(c13787g0.f49187e)) {
                        c13787g0.m39143b().finish();
                    }
                    jM47193i = jM47193i;
                    fIntBitsToFloat = fM39165e == Float.intBitsToFloat((int) (jM47193i & 4294967295L)) ? Float.intBitsToFloat(i19) : fM39165e / f13;
                }
            } else {
                float fM39168h = c13798k.m39168h(jM47193i);
                j13 = 4294967295L;
                if (!C13787g0.m39141g(c13787g0.f49186d)) {
                    c13787g0.m39146e().finish();
                }
                fIntBitsToFloat = fM39168h == Float.intBitsToFloat((int) (jM47193i & 4294967295L)) ? Float.intBitsToFloat(i19) : fM39168h / f13;
                jM47193i = jM47193i;
            }
            i14 = (int) (j7 >> 32);
            if (Float.intBitsToFloat(i14) == 0.0f) {
                if (C13787g0.m39141g(c13787g0.f49188f) || Float.intBitsToFloat(i14) >= 0.0f) {
                    long j14 = jM47193i;
                    c3 = ' ';
                    if (!C13787g0.m39141g(c13787g0.f49189g) && Float.intBitsToFloat(i14) > 0.0f) {
                        float fM39167g = c13798k.m39167g(j14);
                        if (!C13787g0.m39141g(c13787g0.f49189g)) {
                            c13787g0.m39145d().finish();
                        }
                        fIntBitsToFloat2 = fM39167g == Float.intBitsToFloat((int) (j14 >> 32)) ? Float.intBitsToFloat(i14) : fM39167g / f13;
                    }
                } else {
                    long j15 = jM47193i;
                    float fM39166f = c13798k.m39166f(j15);
                    c3 = ' ';
                    if (!C13787g0.m39141g(c13787g0.f49188f)) {
                        c13787g0.m39144c().finish();
                    }
                    fIntBitsToFloat2 = fM39166f == Float.intBitsToFloat((int) (j15 >> 32)) ? Float.intBitsToFloat(i14) : fM39166f / f13;
                }
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j13) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c3);
                if (!C16617b.m47187c(jFloatToRawIntBits, 0L)) {
                    c13798k.m39164d();
                }
                jM47191g = C16617b.m47191g(j7, jFloatToRawIntBits);
                long j16 = ((C16617b) c0428i.invoke(new C16617b(jM47191g))).f63937a;
                jM47191g2 = C16617b.m47191g(jM47191g, j16);
                if ((Float.intBitsToFloat((int) (jM47191g >> c3)) == 0.0f || Float.intBitsToFloat((int) (jM47191g & j13)) != 0.0f) && ((Float.intBitsToFloat((int) (j16 >> c3)) != 0.0f || Float.intBitsToFloat((int) (j16 & j13)) != 0.0f) && (C13787g0.m39141g(c13787g0.f49188f) || C13787g0.m39141g(c13787g0.f49186d) || C13787g0.m39141g(c13787g0.f49189g) || C13787g0.m39141g(c13787g0.f49187e)))) {
                    c13798k.m39161a();
                }
                if (i17 == 1) {
                    i15 = (int) (jM47191g2 >> c3);
                    if (Float.intBitsToFloat(i15) > 0.5f) {
                        c13798k.m39166f(jM47191g2);
                    } else {
                        if (Float.intBitsToFloat(i15) < -0.5f) {
                            c13798k.m39167g(jM47191g2);
                        } else {
                            z14 = false;
                        }
                        i16 = (int) (jM47191g2 & j13);
                        if (Float.intBitsToFloat(i16) > 0.5f) {
                            c13798k.m39168h(jM47191g2);
                        } else {
                            if (Float.intBitsToFloat(i16) < -0.5f) {
                                c13798k.m39165e(jM47191g2);
                            } else {
                                z15 = false;
                            }
                            if (!z14 || z15) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        }
                        z15 = true;
                        if (z14) {
                        }
                        z4 = true;
                    }
                    z14 = true;
                    i16 = (int) (jM47191g2 & j13);
                    if (Float.intBitsToFloat(i16) > 0.5f) {
                        c13798k.m39168h(jM47191g2);
                    } else {
                        if (Float.intBitsToFloat(i16) < -0.5f) {
                            c13798k.m39165e(jM47191g2);
                        } else {
                            z15 = false;
                        }
                        if (z14) {
                        }
                        z4 = true;
                    }
                    z15 = true;
                    if (z14) {
                    }
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!C16617b.m47187c(jM47191g, 0L)) {
                    if (C13787g0.m39140f(c13787g0.f49188f) || Float.intBitsToFloat(i14) >= 0.0f) {
                        zM39140f = false;
                    } else {
                        AbstractC12240d.m34053S(c13787g0.m39144c(), Float.intBitsToFloat(i14));
                        zM39140f = C13787g0.m39140f(c13787g0.f49188f);
                    }
                    if (C13787g0.m39140f(c13787g0.f49189g) && Float.intBitsToFloat(i14) > 0.0f) {
                        AbstractC12240d.m34053S(c13787g0.m39145d(), Float.intBitsToFloat(i14));
                        if (!zM39140f || C13787g0.m39140f(c13787g0.f49189g)) {
                            zM39140f = true;
                        } else {
                            zM39140f = false;
                        }
                    }
                    if (C13787g0.m39140f(c13787g0.f49186d) && Float.intBitsToFloat(i19) < 0.0f) {
                        AbstractC12240d.m34053S(c13787g0.m39146e(), Float.intBitsToFloat(i19));
                        if (!zM39140f || C13787g0.m39140f(c13787g0.f49186d)) {
                            zM39140f = true;
                        } else {
                            zM39140f = false;
                        }
                    }
                    if (C13787g0.m39140f(c13787g0.f49187e) && Float.intBitsToFloat(i19) > 0.0f) {
                        AbstractC12240d.m34053S(c13787g0.m39143b(), Float.intBitsToFloat(i19));
                        if (!zM39140f || C13787g0.m39140f(c13787g0.f49187e)) {
                            zM39140f = true;
                        } else {
                            zM39140f = false;
                        }
                    }
                    if (!zM39140f || z4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z4 = z13;
                }
                if (z4) {
                    c13798k.m39164d();
                }
                return C16617b.m47192h(jFloatToRawIntBits, j16);
            }
            c3 = ' ';
            fIntBitsToFloat2 = 0.0f;
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j13) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c3);
            if (!C16617b.m47187c(jFloatToRawIntBits, 0L)) {
                c13798k.m39164d();
            }
            jM47191g = C16617b.m47191g(j7, jFloatToRawIntBits);
            long j17 = ((C16617b) c0428i.invoke(new C16617b(jM47191g))).f63937a;
            jM47191g2 = C16617b.m47191g(jM47191g, j17);
            if (Float.intBitsToFloat((int) (jM47191g >> c3)) == 0.0f) {
                c13798k.m39161a();
            } else {
                c13798k.m39161a();
            }
            if (i17 == 1) {
                i15 = (int) (jM47191g2 >> c3);
                if (Float.intBitsToFloat(i15) > 0.5f) {
                    c13798k.m39166f(jM47191g2);
                } else {
                    if (Float.intBitsToFloat(i15) < -0.5f) {
                        c13798k.m39167g(jM47191g2);
                    } else {
                        z14 = false;
                    }
                    i16 = (int) (jM47191g2 & j13);
                    if (Float.intBitsToFloat(i16) > 0.5f) {
                        c13798k.m39168h(jM47191g2);
                    } else {
                        if (Float.intBitsToFloat(i16) < -0.5f) {
                            c13798k.m39165e(jM47191g2);
                        } else {
                            z15 = false;
                        }
                        if (z14) {
                        }
                        z4 = true;
                    }
                    z15 = true;
                    if (z14) {
                    }
                    z4 = true;
                }
                z14 = true;
                i16 = (int) (jM47191g2 & j13);
                if (Float.intBitsToFloat(i16) > 0.5f) {
                    c13798k.m39168h(jM47191g2);
                } else {
                    if (Float.intBitsToFloat(i16) < -0.5f) {
                        c13798k.m39165e(jM47191g2);
                    } else {
                        z15 = false;
                    }
                    if (z14) {
                    }
                    z4 = true;
                }
                z15 = true;
                if (z14) {
                }
                z4 = true;
            } else {
                z4 = false;
            }
            if (!C16617b.m47187c(jM47191g, 0L)) {
                if (C13787g0.m39140f(c13787g0.f49188f)) {
                    zM39140f = false;
                } else {
                    zM39140f = false;
                }
                if (C13787g0.m39140f(c13787g0.f49189g)) {
                    AbstractC12240d.m34053S(c13787g0.m39145d(), Float.intBitsToFloat(i14));
                    if (zM39140f) {
                        zM39140f = true;
                    } else {
                        zM39140f = true;
                    }
                }
                if (C13787g0.m39140f(c13787g0.f49186d)) {
                    AbstractC12240d.m34053S(c13787g0.m39146e(), Float.intBitsToFloat(i19));
                    if (zM39140f) {
                        zM39140f = true;
                    } else {
                        zM39140f = true;
                    }
                }
                if (C13787g0.m39140f(c13787g0.f49187e)) {
                    AbstractC12240d.m34053S(c13787g0.m39143b(), Float.intBitsToFloat(i19));
                    if (zM39140f) {
                        zM39140f = true;
                    } else {
                        zM39140f = true;
                    }
                }
                if (zM39140f) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                z4 = z13;
            }
            if (z4) {
                c13798k.m39164d();
            }
            return C16617b.m47192h(jFloatToRawIntBits, j17);
        }
        j13 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i14 = (int) (j7 >> 32);
        if (Float.intBitsToFloat(i14) == 0.0f) {
            if (C13787g0.m39141g(c13787g0.f49188f)) {
                long j18 = jM47193i;
                c3 = ' ';
                if (!C13787g0.m39141g(c13787g0.f49189g)) {
                }
            } else {
                long j19 = jM47193i;
                c3 = ' ';
                if (!C13787g0.m39141g(c13787g0.f49189g)) {
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j13) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c3);
            if (!C16617b.m47187c(jFloatToRawIntBits, 0L)) {
                c13798k.m39164d();
            }
            jM47191g = C16617b.m47191g(j7, jFloatToRawIntBits);
            long j110 = ((C16617b) c0428i.invoke(new C16617b(jM47191g))).f63937a;
            jM47191g2 = C16617b.m47191g(jM47191g, j110);
            if (Float.intBitsToFloat((int) (jM47191g >> c3)) == 0.0f) {
                c13798k.m39161a();
            } else {
                c13798k.m39161a();
            }
            if (i17 == 1) {
                i15 = (int) (jM47191g2 >> c3);
                if (Float.intBitsToFloat(i15) > 0.5f) {
                    c13798k.m39166f(jM47191g2);
                } else {
                    if (Float.intBitsToFloat(i15) < -0.5f) {
                        c13798k.m39167g(jM47191g2);
                    } else {
                        z14 = false;
                    }
                    i16 = (int) (jM47191g2 & j13);
                    if (Float.intBitsToFloat(i16) > 0.5f) {
                        c13798k.m39168h(jM47191g2);
                    } else {
                        if (Float.intBitsToFloat(i16) < -0.5f) {
                            c13798k.m39165e(jM47191g2);
                        } else {
                            z15 = false;
                        }
                        if (z14) {
                        }
                        z4 = true;
                    }
                    z15 = true;
                    if (z14) {
                    }
                    z4 = true;
                }
                z14 = true;
                i16 = (int) (jM47191g2 & j13);
                if (Float.intBitsToFloat(i16) > 0.5f) {
                    c13798k.m39168h(jM47191g2);
                } else {
                    if (Float.intBitsToFloat(i16) < -0.5f) {
                        c13798k.m39165e(jM47191g2);
                    } else {
                        z15 = false;
                    }
                    if (z14) {
                    }
                    z4 = true;
                }
                z15 = true;
                if (z14) {
                }
                z4 = true;
            } else {
                z4 = false;
            }
            if (!C16617b.m47187c(jM47191g, 0L)) {
                if (C13787g0.m39140f(c13787g0.f49188f)) {
                    zM39140f = false;
                } else {
                    zM39140f = false;
                }
                if (C13787g0.m39140f(c13787g0.f49189g)) {
                    AbstractC12240d.m34053S(c13787g0.m39145d(), Float.intBitsToFloat(i14));
                    if (zM39140f) {
                        zM39140f = true;
                    } else {
                        zM39140f = true;
                    }
                }
                if (C13787g0.m39140f(c13787g0.f49186d)) {
                    AbstractC12240d.m34053S(c13787g0.m39146e(), Float.intBitsToFloat(i19));
                    if (zM39140f) {
                        zM39140f = true;
                    } else {
                        zM39140f = true;
                    }
                }
                if (C13787g0.m39140f(c13787g0.f49187e)) {
                    AbstractC12240d.m34053S(c13787g0.m39143b(), Float.intBitsToFloat(i19));
                    if (zM39140f) {
                        zM39140f = true;
                    } else {
                        zM39140f = true;
                    }
                }
                if (zM39140f) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                z4 = z13;
            }
            if (z4) {
                c13798k.m39164d();
            }
            return C16617b.m47192h(jFloatToRawIntBits, j110);
        }
        c3 = ' ';
        fIntBitsToFloat2 = 0.0f;
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j13) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c3);
        if (!C16617b.m47187c(jFloatToRawIntBits, 0L)) {
            c13798k.m39164d();
        }
        jM47191g = C16617b.m47191g(j7, jFloatToRawIntBits);
        long j111 = ((C16617b) c0428i.invoke(new C16617b(jM47191g))).f63937a;
        jM47191g2 = C16617b.m47191g(jM47191g, j111);
        if (Float.intBitsToFloat((int) (jM47191g >> c3)) == 0.0f) {
            c13798k.m39161a();
        } else {
            c13798k.m39161a();
        }
        if (i17 == 1) {
            i15 = (int) (jM47191g2 >> c3);
            if (Float.intBitsToFloat(i15) > 0.5f) {
                c13798k.m39166f(jM47191g2);
            } else {
                if (Float.intBitsToFloat(i15) < -0.5f) {
                    c13798k.m39167g(jM47191g2);
                } else {
                    z14 = false;
                }
                i16 = (int) (jM47191g2 & j13);
                if (Float.intBitsToFloat(i16) > 0.5f) {
                    c13798k.m39168h(jM47191g2);
                } else {
                    if (Float.intBitsToFloat(i16) < -0.5f) {
                        c13798k.m39165e(jM47191g2);
                    } else {
                        z15 = false;
                    }
                    if (z14) {
                    }
                    z4 = true;
                }
                z15 = true;
                if (z14) {
                }
                z4 = true;
            }
            z14 = true;
            i16 = (int) (jM47191g2 & j13);
            if (Float.intBitsToFloat(i16) > 0.5f) {
                c13798k.m39168h(jM47191g2);
            } else {
                if (Float.intBitsToFloat(i16) < -0.5f) {
                    c13798k.m39165e(jM47191g2);
                } else {
                    z15 = false;
                }
                if (z14) {
                }
                z4 = true;
            }
            z15 = true;
            if (z14) {
            }
            z4 = true;
        } else {
            z4 = false;
        }
        if (!C16617b.m47187c(jM47191g, 0L)) {
            if (C13787g0.m39140f(c13787g0.f49188f)) {
                zM39140f = false;
            } else {
                zM39140f = false;
            }
            if (C13787g0.m39140f(c13787g0.f49189g)) {
                AbstractC12240d.m34053S(c13787g0.m39145d(), Float.intBitsToFloat(i14));
                if (zM39140f) {
                    zM39140f = true;
                } else {
                    zM39140f = true;
                }
            }
            if (C13787g0.m39140f(c13787g0.f49186d)) {
                AbstractC12240d.m34053S(c13787g0.m39146e(), Float.intBitsToFloat(i19));
                if (zM39140f) {
                    zM39140f = true;
                } else {
                    zM39140f = true;
                }
            }
            if (C13787g0.m39140f(c13787g0.f49187e)) {
                AbstractC12240d.m34053S(c13787g0.m39143b(), Float.intBitsToFloat(i19));
                if (zM39140f) {
                    zM39140f = true;
                } else {
                    zM39140f = true;
                }
            }
            if (zM39140f) {
                z13 = true;
            } else {
                z13 = true;
            }
            z4 = z13;
        }
        if (z4) {
            c13798k.m39164d();
        }
        return C16617b.m47192h(jFloatToRawIntBits, j111);
    }
}
