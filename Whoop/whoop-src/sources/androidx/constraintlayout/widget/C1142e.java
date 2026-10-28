package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import p108e4.AbstractC12682p;
import p319m4.AbstractC25022k;
import p319m4.AbstractC25023l;
import p319m4.C25015d;
import p319m4.C25016e;
import p319m4.C25017f;
import p333n4.C26246b;
import p333n4.InterfaceC26247c;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1142e implements InterfaceC26247c {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f5080a;

    /* JADX INFO: renamed from: b */
    public int f5081b;

    /* JADX INFO: renamed from: c */
    public int f5082c;

    /* JADX INFO: renamed from: d */
    public int f5083d;

    /* JADX INFO: renamed from: e */
    public int f5084e;

    /* JADX INFO: renamed from: f */
    public int f5085f;

    /* JADX INFO: renamed from: g */
    public int f5086g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ConstraintLayout f5087h;

    public C1142e(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f5087h = constraintLayout;
        this.f5080a = constraintLayout2;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3623c(int i13, int i14, int i15) {
        if (i13 == i14) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i13);
        int mode2 = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i14);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i15 == size;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x019f  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:124:0x01b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:130:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:133:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:135:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:138:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:140:0x01d2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:141:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:143:0x01de  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:155:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:158:0x0209  */
    /* JADX WARN: Code duplicated, block: B:161:0x0223  */
    /* JADX WARN: Code duplicated, block: B:162:0x0228  */
    /* JADX WARN: Code duplicated, block: B:165:0x022d  */
    /* JADX WARN: Code duplicated, block: B:168:0x0235  */
    /* JADX WARN: Code duplicated, block: B:170:0x023c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0242  */
    /* JADX WARN: Code duplicated, block: B:176:0x0253  */
    /* JADX WARN: Code duplicated, block: B:178:0x0257 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x0261 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x0263 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:184:0x026d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x0273  */
    /* JADX WARN: Code duplicated, block: B:190:0x0277  */
    /* JADX WARN: Code duplicated, block: B:192:0x027d  */
    /* JADX WARN: Code duplicated, block: B:193:0x0282  */
    /* JADX WARN: Code duplicated, block: B:196:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:197:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:200:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:204:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:207:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:209:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:78:0x0102 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x0111  */
    /* JADX WARN: Code duplicated, block: B:86:0x011c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0126  */
    /* JADX WARN: Code duplicated, block: B:90:0x0131  */
    @Override // p333n4.InterfaceC26247c
    /* JADX INFO: renamed from: a */
    public final void mo3624a(C25016e c25016e, C26246b c26246b) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iM35485e;
        int iMakeMeasureSpec3;
        int childMeasureSpec;
        C25017f c25017f;
        boolean z4;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        C1141d c1141d;
        int i13;
        int measuredWidth;
        int measuredHeight;
        int baseline;
        int i14;
        int measuredWidth2;
        int i15;
        int i16;
        int measuredHeight2;
        int i17;
        int i18;
        int iMakeMeasureSpec4;
        boolean z18;
        int i19;
        boolean z19;
        boolean z24;
        boolean z25;
        int i24;
        boolean z26;
        int i25;
        if (c25016e == null) {
            return;
        }
        C25015d c25015d = c25016e.f97892L;
        C25015d c25015d2 = c25016e.f97890J;
        if (c25016e.f97922h0 == 8) {
            c26246b.f104363e = 0;
            c26246b.f104364f = 0;
            c26246b.f104365g = 0;
            return;
        }
        if (c25016e.f97901U == null) {
            return;
        }
        ConstraintLayout constraintLayout = this.f5087h;
        ConstraintLayout.access$000(constraintLayout);
        int i26 = c26246b.f104359a;
        int i27 = c26246b.f104360b;
        int i28 = c26246b.f104361c;
        int i29 = c26246b.f104362d;
        int i34 = this.f5081b + this.f5082c;
        int i35 = this.f5083d;
        View view = (View) c25016e.f97920g0;
        int iM35485e2 = AbstractC12682p.m35485e(i26);
        if (iM35485e2 == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i28, 1073741824);
        } else {
            if (iM35485e2 != 1) {
                if (iM35485e2 == 2) {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f5085f, i35, -2);
                    boolean z27 = c25016e.f97942s == 1;
                    int i36 = c26246b.f104368j;
                    if (i36 == 1 || i36 == 2) {
                        boolean z28 = view.getMeasuredHeight() == c25016e.m73441l();
                        if (c26246b.f104368j == 2 || !z27 || ((z27 && z28) || c25016e.mo73394B())) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c25016e.m73445r(), 1073741824);
                        }
                    }
                } else if (iM35485e2 != 3) {
                    iMakeMeasureSpec2 = 0;
                } else {
                    int i37 = this.f5085f;
                    int i38 = c25015d2 != null ? c25015d2.f97878g : 0;
                    if (c25015d != null) {
                        i38 += c25015d.f97878g;
                    }
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i37, i35 + i38, -1);
                }
                iM35485e = AbstractC12682p.m35485e(i27);
                if (iM35485e != 0) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i29, 1073741824);
                } else {
                    if (iM35485e != 1) {
                        if (iM35485e != 2) {
                            iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f5086g, i34, -2);
                            if (c25016e.f97943t == 1) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            i24 = c26246b.f104368j;
                            if (i24 != 1 || i24 == 2) {
                                if (view.getMeasuredWidth() == c25016e.m73445r()) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                if (c26246b.f104368j != 2 || !z25 || ((z25 && z26) || c25016e.mo73395C())) {
                                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c25016e.m73441l(), 1073741824);
                                }
                            }
                        } else if (iM35485e != 3) {
                            childMeasureSpec = 0;
                        } else {
                            int i39 = this.f5086g;
                            if (c25015d2 != null) {
                                i25 = c25016e.f97891K.f97878g;
                            } else {
                                i25 = 0;
                            }
                            if (c25015d != null) {
                                i25 += c25016e.f97893M.f97878g;
                            }
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i39, i34 + i25, -1);
                        }
                        c25017f = c25016e.f97901U;
                        if (c25017f == null && AbstractC25022k.m73477c(constraintLayout.mOptimizationLevel, 256) && view.getMeasuredWidth() == c25016e.m73445r() && view.getMeasuredWidth() < c25017f.m73445r() && view.getMeasuredHeight() == c25016e.m73441l() && view.getMeasuredHeight() < c25017f.m73441l() && view.getBaseline() == c25016e.f97910b0 && !c25016e.m73415A() && m3623c(c25016e.f97888H, iMakeMeasureSpec2, c25016e.m73445r()) && m3623c(c25016e.f97889I, childMeasureSpec, c25016e.m73441l())) {
                            c26246b.f104363e = c25016e.m73445r();
                            c26246b.f104364f = c25016e.m73441l();
                            c26246b.f104365g = c25016e.f97910b0;
                            return;
                        }
                        if (i26 == 3) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (i27 == 3) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (i27 != 4 || i27 == 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i26 != 4 || i26 == 1) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z4 || c25016e.f97904X <= 0.0f) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        if (z13 || c25016e.f97904X <= 0.0f) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        if (view == null) {
                            return;
                        }
                        c1141d = (C1141d) view.getLayoutParams();
                        i13 = c26246b.f104368j;
                        if (i13 == 1 && i13 != 2 && z4 && c25016e.f97942s == 0 && z13 && c25016e.f97943t == 0) {
                            measuredHeight2 = 0;
                            z18 = false;
                            i19 = -1;
                            baseline = 0;
                            measuredWidth2 = 0;
                        } else {
                            if ((view instanceof AbstractC1158u) || !(c25016e instanceof AbstractC25023l)) {
                                view.measure(iMakeMeasureSpec2, childMeasureSpec);
                            } else {
                                ((AbstractC1158u) view).mo3608l((AbstractC25023l) c25016e, iMakeMeasureSpec2, childMeasureSpec);
                            }
                            c25016e.f97888H = iMakeMeasureSpec2;
                            c25016e.f97889I = childMeasureSpec;
                            c25016e.f97919g = false;
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            i14 = c25016e.f97945v;
                            if (i14 > 0) {
                                measuredWidth2 = Math.max(i14, measuredWidth);
                            } else {
                                measuredWidth2 = measuredWidth;
                            }
                            i15 = c25016e.f97946w;
                            if (i15 > 0) {
                                measuredWidth2 = Math.min(i15, measuredWidth2);
                            }
                            i16 = c25016e.f97948y;
                            if (i16 > 0) {
                                measuredHeight2 = Math.max(i16, measuredHeight);
                            } else {
                                measuredHeight2 = measuredHeight;
                            }
                            i17 = childMeasureSpec;
                            i18 = c25016e.f97949z;
                            if (i18 > 0) {
                                measuredHeight2 = Math.min(i18, measuredHeight2);
                            }
                            if (!AbstractC25022k.m73477c(constraintLayout.mOptimizationLevel, 1)) {
                                if (!z16 && z14) {
                                    measuredWidth2 = (int) ((measuredHeight2 * c25016e.f97904X) + 0.5f);
                                } else if (z17 && z15) {
                                    measuredHeight2 = (int) ((measuredWidth2 / c25016e.f97904X) + 0.5f);
                                }
                            }
                            if (measuredWidth == measuredWidth2 || measuredHeight != measuredHeight2) {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                } else {
                                    iMakeMeasureSpec4 = i17;
                                }
                                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                                c25016e.f97888H = iMakeMeasureSpec2;
                                c25016e.f97889I = iMakeMeasureSpec4;
                                z18 = false;
                                c25016e.f97919g = false;
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                z18 = false;
                            }
                            i19 = -1;
                        }
                        if (baseline != i19) {
                            z19 = true;
                        } else {
                            z19 = z18;
                        }
                        if (measuredWidth2 == c26246b.f104361c || measuredHeight2 != c26246b.f104362d) {
                            z24 = true;
                        } else {
                            z24 = z18;
                        }
                        c26246b.f104367i = z24;
                        if (c1141d.f5043c0) {
                            z19 = true;
                        }
                        if (z19 && baseline != -1 && c25016e.f97910b0 != baseline) {
                            c26246b.f104367i = true;
                        }
                        c26246b.f104363e = measuredWidth2;
                        c26246b.f104364f = measuredHeight2;
                        c26246b.f104366h = z19;
                        c26246b.f104365g = baseline;
                        ConstraintLayout.access$000(constraintLayout);
                    }
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f5086g, i34, -2);
                }
                childMeasureSpec = iMakeMeasureSpec3;
                c25017f = c25016e.f97901U;
                if (c25017f == null) {
                }
                if (i26 == 3) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i27 == 3) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (i27 != 4) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (i26 != 4) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (z4) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                if (z13) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                if (view == null) {
                    return;
                }
                c1141d = (C1141d) view.getLayoutParams();
                i13 = c26246b.f104368j;
                if (i13 == 1) {
                    if (view instanceof AbstractC1158u) {
                        view.measure(iMakeMeasureSpec2, childMeasureSpec);
                    } else {
                        view.measure(iMakeMeasureSpec2, childMeasureSpec);
                    }
                    c25016e.f97888H = iMakeMeasureSpec2;
                    c25016e.f97889I = childMeasureSpec;
                    c25016e.f97919g = false;
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    i14 = c25016e.f97945v;
                    if (i14 > 0) {
                        measuredWidth2 = Math.max(i14, measuredWidth);
                    } else {
                        measuredWidth2 = measuredWidth;
                    }
                    i15 = c25016e.f97946w;
                    if (i15 > 0) {
                        measuredWidth2 = Math.min(i15, measuredWidth2);
                    }
                    i16 = c25016e.f97948y;
                    if (i16 > 0) {
                        measuredHeight2 = Math.max(i16, measuredHeight);
                    } else {
                        measuredHeight2 = measuredHeight;
                    }
                    i17 = childMeasureSpec;
                    i18 = c25016e.f97949z;
                    if (i18 > 0) {
                        measuredHeight2 = Math.min(i18, measuredHeight2);
                    }
                    if (!AbstractC25022k.m73477c(constraintLayout.mOptimizationLevel, 1)) {
                        if (!z16) {
                            if (z17) {
                                measuredHeight2 = (int) ((measuredWidth2 / c25016e.f97904X) + 0.5f);
                            }
                        } else if (z17) {
                            measuredHeight2 = (int) ((measuredWidth2 / c25016e.f97904X) + 0.5f);
                        }
                    }
                    if (measuredWidth == measuredWidth2) {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        } else {
                            iMakeMeasureSpec4 = i17;
                        }
                        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                        c25016e.f97888H = iMakeMeasureSpec2;
                        c25016e.f97889I = iMakeMeasureSpec4;
                        z18 = false;
                        c25016e.f97919g = false;
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        } else {
                            iMakeMeasureSpec4 = i17;
                        }
                        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                        c25016e.f97888H = iMakeMeasureSpec2;
                        c25016e.f97889I = iMakeMeasureSpec4;
                        z18 = false;
                        c25016e.f97919g = false;
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i19 = -1;
                } else {
                    if (view instanceof AbstractC1158u) {
                        view.measure(iMakeMeasureSpec2, childMeasureSpec);
                    } else {
                        view.measure(iMakeMeasureSpec2, childMeasureSpec);
                    }
                    c25016e.f97888H = iMakeMeasureSpec2;
                    c25016e.f97889I = childMeasureSpec;
                    c25016e.f97919g = false;
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    i14 = c25016e.f97945v;
                    if (i14 > 0) {
                        measuredWidth2 = Math.max(i14, measuredWidth);
                    } else {
                        measuredWidth2 = measuredWidth;
                    }
                    i15 = c25016e.f97946w;
                    if (i15 > 0) {
                        measuredWidth2 = Math.min(i15, measuredWidth2);
                    }
                    i16 = c25016e.f97948y;
                    if (i16 > 0) {
                        measuredHeight2 = Math.max(i16, measuredHeight);
                    } else {
                        measuredHeight2 = measuredHeight;
                    }
                    i17 = childMeasureSpec;
                    i18 = c25016e.f97949z;
                    if (i18 > 0) {
                        measuredHeight2 = Math.min(i18, measuredHeight2);
                    }
                    if (!AbstractC25022k.m73477c(constraintLayout.mOptimizationLevel, 1)) {
                        if (!z16) {
                            if (z17) {
                                measuredHeight2 = (int) ((measuredWidth2 / c25016e.f97904X) + 0.5f);
                            }
                        } else if (z17) {
                            measuredHeight2 = (int) ((measuredWidth2 / c25016e.f97904X) + 0.5f);
                        }
                    }
                    if (measuredWidth == measuredWidth2) {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        } else {
                            iMakeMeasureSpec4 = i17;
                        }
                        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                        c25016e.f97888H = iMakeMeasureSpec2;
                        c25016e.f97889I = iMakeMeasureSpec4;
                        z18 = false;
                        c25016e.f97919g = false;
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        } else {
                            iMakeMeasureSpec4 = i17;
                        }
                        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                        c25016e.f97888H = iMakeMeasureSpec2;
                        c25016e.f97889I = iMakeMeasureSpec4;
                        z18 = false;
                        c25016e.f97919g = false;
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i19 = -1;
                }
                if (baseline != i19) {
                    z19 = true;
                } else {
                    z19 = z18;
                }
                if (measuredWidth2 == c26246b.f104361c) {
                    z24 = true;
                } else {
                    z24 = true;
                }
                c26246b.f104367i = z24;
                if (c1141d.f5043c0) {
                    z19 = true;
                }
                if (z19) {
                    c26246b.f104367i = true;
                }
                c26246b.f104363e = measuredWidth2;
                c26246b.f104364f = measuredHeight2;
                c26246b.f104366h = z19;
                c26246b.f104365g = baseline;
                ConstraintLayout.access$000(constraintLayout);
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f5085f, i35, -2);
        }
        iMakeMeasureSpec2 = iMakeMeasureSpec;
        iM35485e = AbstractC12682p.m35485e(i27);
        if (iM35485e != 0) {
            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i29, 1073741824);
        } else {
            if (iM35485e != 1) {
                if (iM35485e != 2) {
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f5086g, i34, -2);
                    if (c25016e.f97943t == 1) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    i24 = c26246b.f104368j;
                    if (i24 != 1) {
                        if (view.getMeasuredWidth() == c25016e.m73445r()) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        if (c26246b.f104368j != 2) {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c25016e.m73441l(), 1073741824);
                        } else {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c25016e.m73441l(), 1073741824);
                        }
                    } else {
                        if (view.getMeasuredWidth() == c25016e.m73445r()) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        if (c26246b.f104368j != 2) {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c25016e.m73441l(), 1073741824);
                        } else {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c25016e.m73441l(), 1073741824);
                        }
                    }
                } else if (iM35485e != 3) {
                    childMeasureSpec = 0;
                } else {
                    int i310 = this.f5086g;
                    if (c25015d2 != null) {
                        i25 = c25016e.f97891K.f97878g;
                    } else {
                        i25 = 0;
                    }
                    if (c25015d != null) {
                        i25 += c25016e.f97893M.f97878g;
                    }
                    childMeasureSpec = ViewGroup.getChildMeasureSpec(i310, i34 + i25, -1);
                }
                c25017f = c25016e.f97901U;
                if (c25017f == null) {
                }
                if (i26 == 3) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i27 == 3) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (i27 != 4) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (i26 != 4) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (z4) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                if (z13) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                if (view == null) {
                    return;
                }
                c1141d = (C1141d) view.getLayoutParams();
                i13 = c26246b.f104368j;
                if (i13 == 1) {
                    if (view instanceof AbstractC1158u) {
                        view.measure(iMakeMeasureSpec2, childMeasureSpec);
                    } else {
                        view.measure(iMakeMeasureSpec2, childMeasureSpec);
                    }
                    c25016e.f97888H = iMakeMeasureSpec2;
                    c25016e.f97889I = childMeasureSpec;
                    c25016e.f97919g = false;
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    i14 = c25016e.f97945v;
                    if (i14 > 0) {
                        measuredWidth2 = Math.max(i14, measuredWidth);
                    } else {
                        measuredWidth2 = measuredWidth;
                    }
                    i15 = c25016e.f97946w;
                    if (i15 > 0) {
                        measuredWidth2 = Math.min(i15, measuredWidth2);
                    }
                    i16 = c25016e.f97948y;
                    if (i16 > 0) {
                        measuredHeight2 = Math.max(i16, measuredHeight);
                    } else {
                        measuredHeight2 = measuredHeight;
                    }
                    i17 = childMeasureSpec;
                    i18 = c25016e.f97949z;
                    if (i18 > 0) {
                        measuredHeight2 = Math.min(i18, measuredHeight2);
                    }
                    if (!AbstractC25022k.m73477c(constraintLayout.mOptimizationLevel, 1)) {
                        if (!z16) {
                            if (z17) {
                                measuredHeight2 = (int) ((measuredWidth2 / c25016e.f97904X) + 0.5f);
                            }
                        } else if (z17) {
                            measuredHeight2 = (int) ((measuredWidth2 / c25016e.f97904X) + 0.5f);
                        }
                    }
                    if (measuredWidth == measuredWidth2) {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        } else {
                            iMakeMeasureSpec4 = i17;
                        }
                        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                        c25016e.f97888H = iMakeMeasureSpec2;
                        c25016e.f97889I = iMakeMeasureSpec4;
                        z18 = false;
                        c25016e.f97919g = false;
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        } else {
                            iMakeMeasureSpec4 = i17;
                        }
                        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                        c25016e.f97888H = iMakeMeasureSpec2;
                        c25016e.f97889I = iMakeMeasureSpec4;
                        z18 = false;
                        c25016e.f97919g = false;
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i19 = -1;
                } else {
                    if (view instanceof AbstractC1158u) {
                        view.measure(iMakeMeasureSpec2, childMeasureSpec);
                    } else {
                        view.measure(iMakeMeasureSpec2, childMeasureSpec);
                    }
                    c25016e.f97888H = iMakeMeasureSpec2;
                    c25016e.f97889I = childMeasureSpec;
                    c25016e.f97919g = false;
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    i14 = c25016e.f97945v;
                    if (i14 > 0) {
                        measuredWidth2 = Math.max(i14, measuredWidth);
                    } else {
                        measuredWidth2 = measuredWidth;
                    }
                    i15 = c25016e.f97946w;
                    if (i15 > 0) {
                        measuredWidth2 = Math.min(i15, measuredWidth2);
                    }
                    i16 = c25016e.f97948y;
                    if (i16 > 0) {
                        measuredHeight2 = Math.max(i16, measuredHeight);
                    } else {
                        measuredHeight2 = measuredHeight;
                    }
                    i17 = childMeasureSpec;
                    i18 = c25016e.f97949z;
                    if (i18 > 0) {
                        measuredHeight2 = Math.min(i18, measuredHeight2);
                    }
                    if (!AbstractC25022k.m73477c(constraintLayout.mOptimizationLevel, 1)) {
                        if (!z16) {
                            if (z17) {
                                measuredHeight2 = (int) ((measuredWidth2 / c25016e.f97904X) + 0.5f);
                            }
                        } else if (z17) {
                            measuredHeight2 = (int) ((measuredWidth2 / c25016e.f97904X) + 0.5f);
                        }
                    }
                    if (measuredWidth == measuredWidth2) {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        } else {
                            iMakeMeasureSpec4 = i17;
                        }
                        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                        c25016e.f97888H = iMakeMeasureSpec2;
                        c25016e.f97889I = iMakeMeasureSpec4;
                        z18 = false;
                        c25016e.f97919g = false;
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        } else {
                            iMakeMeasureSpec4 = i17;
                        }
                        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                        c25016e.f97888H = iMakeMeasureSpec2;
                        c25016e.f97889I = iMakeMeasureSpec4;
                        z18 = false;
                        c25016e.f97919g = false;
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i19 = -1;
                }
                if (baseline != i19) {
                    z19 = true;
                } else {
                    z19 = z18;
                }
                if (measuredWidth2 == c26246b.f104361c) {
                    z24 = true;
                } else {
                    z24 = true;
                }
                c26246b.f104367i = z24;
                if (c1141d.f5043c0) {
                    z19 = true;
                }
                if (z19) {
                    c26246b.f104367i = true;
                }
                c26246b.f104363e = measuredWidth2;
                c26246b.f104364f = measuredHeight2;
                c26246b.f104366h = z19;
                c26246b.f104365g = baseline;
                ConstraintLayout.access$000(constraintLayout);
            }
            iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f5086g, i34, -2);
        }
        childMeasureSpec = iMakeMeasureSpec3;
        c25017f = c25016e.f97901U;
        if (c25017f == null) {
        }
        if (i26 == 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i27 == 3) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (i27 != 4) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (i26 != 4) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (z4) {
            z16 = false;
        } else {
            z16 = false;
        }
        if (z13) {
            z17 = false;
        } else {
            z17 = false;
        }
        if (view == null) {
            return;
        }
        c1141d = (C1141d) view.getLayoutParams();
        i13 = c26246b.f104368j;
        if (i13 == 1) {
            if (view instanceof AbstractC1158u) {
                view.measure(iMakeMeasureSpec2, childMeasureSpec);
            } else {
                view.measure(iMakeMeasureSpec2, childMeasureSpec);
            }
            c25016e.f97888H = iMakeMeasureSpec2;
            c25016e.f97889I = childMeasureSpec;
            c25016e.f97919g = false;
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
            baseline = view.getBaseline();
            i14 = c25016e.f97945v;
            if (i14 > 0) {
                measuredWidth2 = Math.max(i14, measuredWidth);
            } else {
                measuredWidth2 = measuredWidth;
            }
            i15 = c25016e.f97946w;
            if (i15 > 0) {
                measuredWidth2 = Math.min(i15, measuredWidth2);
            }
            i16 = c25016e.f97948y;
            if (i16 > 0) {
                measuredHeight2 = Math.max(i16, measuredHeight);
            } else {
                measuredHeight2 = measuredHeight;
            }
            i17 = childMeasureSpec;
            i18 = c25016e.f97949z;
            if (i18 > 0) {
                measuredHeight2 = Math.min(i18, measuredHeight2);
            }
            if (!AbstractC25022k.m73477c(constraintLayout.mOptimizationLevel, 1)) {
                if (!z16) {
                    if (z17) {
                        measuredHeight2 = (int) ((measuredWidth2 / c25016e.f97904X) + 0.5f);
                    }
                } else if (z17) {
                    measuredHeight2 = (int) ((measuredWidth2 / c25016e.f97904X) + 0.5f);
                }
            }
            if (measuredWidth == measuredWidth2) {
                if (measuredWidth != measuredWidth2) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                }
                if (measuredHeight != measuredHeight2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = i17;
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                c25016e.f97888H = iMakeMeasureSpec2;
                c25016e.f97889I = iMakeMeasureSpec4;
                z18 = false;
                c25016e.f97919g = false;
                measuredWidth2 = view.getMeasuredWidth();
                measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
            } else {
                if (measuredWidth != measuredWidth2) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                }
                if (measuredHeight != measuredHeight2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = i17;
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                c25016e.f97888H = iMakeMeasureSpec2;
                c25016e.f97889I = iMakeMeasureSpec4;
                z18 = false;
                c25016e.f97919g = false;
                measuredWidth2 = view.getMeasuredWidth();
                measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
            }
            i19 = -1;
        } else {
            if (view instanceof AbstractC1158u) {
                view.measure(iMakeMeasureSpec2, childMeasureSpec);
            } else {
                view.measure(iMakeMeasureSpec2, childMeasureSpec);
            }
            c25016e.f97888H = iMakeMeasureSpec2;
            c25016e.f97889I = childMeasureSpec;
            c25016e.f97919g = false;
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
            baseline = view.getBaseline();
            i14 = c25016e.f97945v;
            if (i14 > 0) {
                measuredWidth2 = Math.max(i14, measuredWidth);
            } else {
                measuredWidth2 = measuredWidth;
            }
            i15 = c25016e.f97946w;
            if (i15 > 0) {
                measuredWidth2 = Math.min(i15, measuredWidth2);
            }
            i16 = c25016e.f97948y;
            if (i16 > 0) {
                measuredHeight2 = Math.max(i16, measuredHeight);
            } else {
                measuredHeight2 = measuredHeight;
            }
            i17 = childMeasureSpec;
            i18 = c25016e.f97949z;
            if (i18 > 0) {
                measuredHeight2 = Math.min(i18, measuredHeight2);
            }
            if (!AbstractC25022k.m73477c(constraintLayout.mOptimizationLevel, 1)) {
                if (!z16) {
                    if (z17) {
                        measuredHeight2 = (int) ((measuredWidth2 / c25016e.f97904X) + 0.5f);
                    }
                } else if (z17) {
                    measuredHeight2 = (int) ((measuredWidth2 / c25016e.f97904X) + 0.5f);
                }
            }
            if (measuredWidth == measuredWidth2) {
                if (measuredWidth != measuredWidth2) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                }
                if (measuredHeight != measuredHeight2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = i17;
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                c25016e.f97888H = iMakeMeasureSpec2;
                c25016e.f97889I = iMakeMeasureSpec4;
                z18 = false;
                c25016e.f97919g = false;
                measuredWidth2 = view.getMeasuredWidth();
                measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
            } else {
                if (measuredWidth != measuredWidth2) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                }
                if (measuredHeight != measuredHeight2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = i17;
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                c25016e.f97888H = iMakeMeasureSpec2;
                c25016e.f97889I = iMakeMeasureSpec4;
                z18 = false;
                c25016e.f97919g = false;
                measuredWidth2 = view.getMeasuredWidth();
                measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
            }
            i19 = -1;
        }
        if (baseline != i19) {
            z19 = true;
        } else {
            z19 = z18;
        }
        if (measuredWidth2 == c26246b.f104361c) {
            z24 = true;
        } else {
            z24 = true;
        }
        c26246b.f104367i = z24;
        if (c1141d.f5043c0) {
            z19 = true;
        }
        if (z19) {
            c26246b.f104367i = true;
        }
        c26246b.f104363e = measuredWidth2;
        c26246b.f104364f = measuredHeight2;
        c26246b.f104366h = z19;
        c26246b.f104365g = baseline;
        ConstraintLayout.access$000(constraintLayout);
    }

    @Override // p333n4.InterfaceC26247c
    /* JADX INFO: renamed from: b */
    public final void mo3625b() {
        ConstraintLayout constraintLayout = this.f5080a;
        int childCount = constraintLayout.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            constraintLayout.getChildAt(i13);
        }
        int size = constraintLayout.mConstraintHelpers.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                ((AbstractC1139b) constraintLayout.mConstraintHelpers.get(i14)).getClass();
            }
        }
    }
}
