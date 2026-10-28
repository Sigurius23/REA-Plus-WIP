package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.health.platform.client.proto.C1533u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import p136f4.AbstractC14052d;
import p136f4.C14051c;
import p319m4.AbstractC25021j;
import p319m4.C25016e;
import p319m4.C25017f;
import p319m4.C25020i;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.2.0-alpha04";
    private static C1157t sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<AbstractC1139b> mConstraintHelpers;
    protected C1146i mConstraintLayoutSpec;
    private C1153p mConstraintSet;
    private int mConstraintSetId;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected C25017f mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    C1142e mMeasurer;
    private AbstractC14052d mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private ArrayList<InterfaceC1143f> mModifiers;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<C25016e> mTempMapIdToWidget;

    public ConstraintLayout(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C25017f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new C1142e(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m3609a(null, 0, 0);
    }

    public static /* synthetic */ AbstractC14052d access$000(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        return null;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static C1157t getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new C1157t();
        }
        return sSharedValues;
    }

    /* JADX INFO: renamed from: a */
    public final void m3609a(AttributeSet attributeSet, int i13, int i14) {
        C25017f c25017f = this.mLayoutWidget;
        c25017f.f97920g0 = this;
        C1142e c1142e = this.mMeasurer;
        c25017f.f97967v0 = c1142e;
        c25017f.f97965t0.f104378h = c1142e;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1156s.f5224b, i13, i14);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i15 = 0; i15 < indexCount; i15++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i15);
                if (index == 16) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 17) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 14) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 15) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 113) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C1153p c1153p = new C1153p();
                        this.mConstraintSet = c1153p;
                        c1153p.m3652k(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        C25017f c25017f2 = this.mLayoutWidget;
        c25017f2.f97954E0 = this.mOptimizationLevel;
        C14051c.f50153q = c25017f2.m73461c0(512);
    }

    public void addValueModifier(InterfaceC1143f interfaceC1143f) {
        if (this.mModifiers == null) {
            this.mModifiers = new ArrayList<>();
        }
        this.mModifiers.add(interfaceC1143f);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x010a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0110  */
    /* JADX WARN: Code duplicated, block: B:63:0x0133  */
    /* JADX WARN: Code duplicated, block: B:65:0x013c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148  */
    /* JADX WARN: Code duplicated, block: B:70:0x014d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0165  */
    /* JADX WARN: Code duplicated, block: B:77:0x0172  */
    /* JADX WARN: Code duplicated, block: B:79:0x0177  */
    /* JADX WARN: Code duplicated, block: B:80:0x0182  */
    /* JADX WARN: Code duplicated, block: B:82:0x0186  */
    /* JADX WARN: Code duplicated, block: B:85:0x0197  */
    /* JADX WARN: Code duplicated, block: B:88:0x019f  */
    public void applyConstraintsFromLayoutParams(boolean z4, View view, C25016e c25016e, C1141d c1141d, SparseArray<C25016e> sparseArray) {
        ConstraintLayout constraintLayout;
        int i13;
        C25016e c25016e2;
        int i14;
        int i15;
        int i16;
        C25016e c25016e3;
        int i17;
        int i18;
        int i19;
        int i24;
        C25016e c25016e4;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        C25016e c25016e5;
        int i34;
        int i35;
        C1141d c1141d2;
        int i36;
        int i37;
        C25016e c25016e6;
        int i38;
        float f13;
        C25016e c25016e7;
        C25016e c25016e8;
        C25016e c25016e9;
        int i39;
        C25016e c25016e10 = c25016e;
        c1141d.m3622a();
        c25016e10.f97922h0 = view.getVisibility();
        c25016e10.f97920g0 = view;
        if (view instanceof AbstractC1139b) {
            constraintLayout = this;
            ((AbstractC1139b) view).mo3607i(c25016e10, constraintLayout.mLayoutWidget.f97968w0);
        } else {
            constraintLayout = this;
        }
        if (c1141d.f5045d0) {
            C25020i c25020i = (C25020i) c25016e10;
            int i44 = c1141d.f5063m0;
            int i45 = c1141d.f5065n0;
            float f14 = c1141d.f5067o0;
            if (f14 != -1.0f) {
                if (f14 > -1.0f) {
                    c25020i.f98015r0 = f14;
                    c25020i.f98016s0 = -1;
                    c25020i.f98017t0 = -1;
                    return;
                }
                return;
            }
            if (i44 != -1) {
                if (i44 > -1) {
                    c25020i.f98015r0 = -1.0f;
                    c25020i.f98016s0 = i44;
                    c25020i.f98017t0 = -1;
                    return;
                }
                return;
            }
            if (i45 == -1 || i45 <= -1) {
                return;
            }
            c25020i.f98015r0 = -1.0f;
            c25020i.f98016s0 = -1;
            c25020i.f98017t0 = i45;
            return;
        }
        int i46 = c1141d.f5049f0;
        int i47 = c1141d.f5051g0;
        int i48 = c1141d.f5053h0;
        int i49 = c1141d.f5055i0;
        int i54 = c1141d.f5057j0;
        int i55 = c1141d.f5059k0;
        float f15 = c1141d.f5061l0;
        int i56 = c1141d.f5068p;
        if (i56 != -1) {
            C25016e c25016e11 = sparseArray.get(i56);
            if (c25016e11 != null) {
                float f16 = c1141d.f5071r;
                c25016e.m73450w(7, 7, c1141d.f5070q, 0, c25016e11);
                c25016e10 = c25016e;
                c25016e10.f97885E = f16;
            }
            c25016e6 = c25016e10;
            c1141d2 = c1141d;
            i17 = 4;
            i16 = 2;
            i38 = 5;
            i28 = 3;
        } else {
            if (i46 != -1) {
                C25016e c25016e12 = sparseArray.get(i46);
                if (c25016e12 != null) {
                    i13 = 2;
                    c25016e10.m73450w(2, 2, ((ViewGroup.MarginLayoutParams) c1141d).leftMargin, i54, c25016e12);
                } else {
                    i13 = 2;
                }
            } else {
                i13 = 2;
                if (i47 != -1 && (c25016e2 = sparseArray.get(i47)) != null) {
                    c25016e.m73450w(2, 4, ((ViewGroup.MarginLayoutParams) c1141d).leftMargin, i54, c25016e2);
                    i14 = 2;
                    i15 = 4;
                }
                if (i48 != -1) {
                    c25016e9 = sparseArray.get(i48);
                    if (c25016e9 != null) {
                        c25016e.m73450w(i15, i14, ((ViewGroup.MarginLayoutParams) c1141d).rightMargin, i55, c25016e9);
                    }
                    i16 = i14;
                } else {
                    i16 = i14;
                    if (i49 != -1 && (c25016e3 = sparseArray.get(i49)) != null) {
                        c25016e.m73450w(i15, i15, ((ViewGroup.MarginLayoutParams) c1141d).rightMargin, i55, c25016e3);
                    }
                }
                i17 = i15;
                i18 = c1141d.f5054i;
                if (i18 != -1) {
                    c25016e8 = sparseArray.get(i18);
                    if (c25016e8 != null) {
                        i19 = 3;
                        c25016e.m73450w(3, 3, ((ViewGroup.MarginLayoutParams) c1141d).topMargin, c1141d.f5077x, c25016e8);
                    } else {
                        i19 = 3;
                    }
                } else {
                    i19 = 3;
                    i24 = c1141d.f5056j;
                    if (i24 == -1 && (c25016e4 = sparseArray.get(i24)) != null) {
                        c25016e.m73450w(3, 5, ((ViewGroup.MarginLayoutParams) c1141d).topMargin, c1141d.f5077x, c25016e4);
                        i25 = 3;
                        i26 = 5;
                    }
                    i27 = c1141d.f5058k;
                    if (i27 != -1) {
                        c25016e7 = sparseArray.get(i27);
                        if (c25016e7 != null) {
                            c25016e.m73450w(i26, i25, ((ViewGroup.MarginLayoutParams) c1141d).bottomMargin, c1141d.f5079z, c25016e7);
                        }
                        i28 = i25;
                    } else {
                        i28 = i25;
                        i29 = c1141d.f5060l;
                        if (i29 != -1 && (c25016e5 = sparseArray.get(i29)) != null) {
                            c25016e.m73450w(i26, i26, ((ViewGroup.MarginLayoutParams) c1141d).bottomMargin, c1141d.f5079z, c25016e5);
                        }
                    }
                    i34 = i26;
                    i35 = c1141d.f5062m;
                    if (i35 != -1) {
                        c1141d2 = c1141d;
                        constraintLayout.m3610e(c25016e, c1141d2, sparseArray, i35, 6);
                    } else {
                        c1141d2 = c1141d;
                        i36 = c1141d2.f5064n;
                        if (i36 != -1) {
                            m3610e(c25016e, c1141d2, sparseArray, i36, i28);
                        } else {
                            i37 = c1141d2.f5066o;
                            if (i37 != -1) {
                                m3610e(c25016e, c1141d2, sparseArray, i37, i34);
                                c25016e6 = c25016e;
                                i38 = i34;
                            }
                            if (f15 >= 0.0f) {
                                c25016e6.f97916e0 = f15;
                            }
                            f13 = c1141d2.f5017F;
                            if (f13 >= 0.0f) {
                                c25016e6.f97918f0 = f13;
                            }
                        }
                    }
                    c25016e6 = c25016e;
                    i38 = i34;
                    if (f15 >= 0.0f) {
                        c25016e6.f97916e0 = f15;
                    }
                    f13 = c1141d2.f5017F;
                    if (f13 >= 0.0f) {
                        c25016e6.f97918f0 = f13;
                    }
                }
                i25 = i19;
                i26 = 5;
                i27 = c1141d.f5058k;
                if (i27 != -1) {
                    c25016e7 = sparseArray.get(i27);
                    if (c25016e7 != null) {
                        c25016e.m73450w(i26, i25, ((ViewGroup.MarginLayoutParams) c1141d).bottomMargin, c1141d.f5079z, c25016e7);
                    }
                    i28 = i25;
                } else {
                    i28 = i25;
                    i29 = c1141d.f5060l;
                    if (i29 != -1) {
                        c25016e.m73450w(i26, i26, ((ViewGroup.MarginLayoutParams) c1141d).bottomMargin, c1141d.f5079z, c25016e5);
                    }
                }
                i34 = i26;
                i35 = c1141d.f5062m;
                if (i35 != -1) {
                    c1141d2 = c1141d;
                    constraintLayout.m3610e(c25016e, c1141d2, sparseArray, i35, 6);
                } else {
                    c1141d2 = c1141d;
                    i36 = c1141d2.f5064n;
                    if (i36 != -1) {
                        m3610e(c25016e, c1141d2, sparseArray, i36, i28);
                    } else {
                        i37 = c1141d2.f5066o;
                        if (i37 != -1) {
                            m3610e(c25016e, c1141d2, sparseArray, i37, i34);
                            c25016e6 = c25016e;
                            i38 = i34;
                        }
                        if (f15 >= 0.0f) {
                            c25016e6.f97916e0 = f15;
                        }
                        f13 = c1141d2.f5017F;
                        if (f13 >= 0.0f) {
                            c25016e6.f97918f0 = f13;
                        }
                    }
                }
                c25016e6 = c25016e;
                i38 = i34;
                if (f15 >= 0.0f) {
                    c25016e6.f97916e0 = f15;
                }
                f13 = c1141d2.f5017F;
                if (f13 >= 0.0f) {
                    c25016e6.f97918f0 = f13;
                }
            }
            i14 = i13;
            i15 = 4;
            if (i48 != -1) {
                c25016e9 = sparseArray.get(i48);
                if (c25016e9 != null) {
                    c25016e.m73450w(i15, i14, ((ViewGroup.MarginLayoutParams) c1141d).rightMargin, i55, c25016e9);
                }
                i16 = i14;
            } else {
                i16 = i14;
                if (i49 != -1) {
                    c25016e.m73450w(i15, i15, ((ViewGroup.MarginLayoutParams) c1141d).rightMargin, i55, c25016e3);
                }
            }
            i17 = i15;
            i18 = c1141d.f5054i;
            if (i18 != -1) {
                c25016e8 = sparseArray.get(i18);
                if (c25016e8 != null) {
                    i19 = 3;
                    c25016e.m73450w(3, 3, ((ViewGroup.MarginLayoutParams) c1141d).topMargin, c1141d.f5077x, c25016e8);
                } else {
                    i19 = 3;
                }
            } else {
                i19 = 3;
                i24 = c1141d.f5056j;
                if (i24 == -1) {
                }
                i27 = c1141d.f5058k;
                if (i27 != -1) {
                    c25016e7 = sparseArray.get(i27);
                    if (c25016e7 != null) {
                        c25016e.m73450w(i26, i25, ((ViewGroup.MarginLayoutParams) c1141d).bottomMargin, c1141d.f5079z, c25016e7);
                    }
                    i28 = i25;
                } else {
                    i28 = i25;
                    i29 = c1141d.f5060l;
                    if (i29 != -1) {
                        c25016e.m73450w(i26, i26, ((ViewGroup.MarginLayoutParams) c1141d).bottomMargin, c1141d.f5079z, c25016e5);
                    }
                }
                i34 = i26;
                i35 = c1141d.f5062m;
                if (i35 != -1) {
                    c1141d2 = c1141d;
                    constraintLayout.m3610e(c25016e, c1141d2, sparseArray, i35, 6);
                } else {
                    c1141d2 = c1141d;
                    i36 = c1141d2.f5064n;
                    if (i36 != -1) {
                        m3610e(c25016e, c1141d2, sparseArray, i36, i28);
                    } else {
                        i37 = c1141d2.f5066o;
                        if (i37 != -1) {
                            m3610e(c25016e, c1141d2, sparseArray, i37, i34);
                            c25016e6 = c25016e;
                            i38 = i34;
                        }
                        if (f15 >= 0.0f) {
                            c25016e6.f97916e0 = f15;
                        }
                        f13 = c1141d2.f5017F;
                        if (f13 >= 0.0f) {
                            c25016e6.f97918f0 = f13;
                        }
                    }
                }
                c25016e6 = c25016e;
                i38 = i34;
                if (f15 >= 0.0f) {
                    c25016e6.f97916e0 = f15;
                }
                f13 = c1141d2.f5017F;
                if (f13 >= 0.0f) {
                    c25016e6.f97918f0 = f13;
                }
            }
            i25 = i19;
            i26 = 5;
            i27 = c1141d.f5058k;
            if (i27 != -1) {
                c25016e7 = sparseArray.get(i27);
                if (c25016e7 != null) {
                    c25016e.m73450w(i26, i25, ((ViewGroup.MarginLayoutParams) c1141d).bottomMargin, c1141d.f5079z, c25016e7);
                }
                i28 = i25;
            } else {
                i28 = i25;
                i29 = c1141d.f5060l;
                if (i29 != -1) {
                    c25016e.m73450w(i26, i26, ((ViewGroup.MarginLayoutParams) c1141d).bottomMargin, c1141d.f5079z, c25016e5);
                }
            }
            i34 = i26;
            i35 = c1141d.f5062m;
            if (i35 != -1) {
                c1141d2 = c1141d;
                constraintLayout.m3610e(c25016e, c1141d2, sparseArray, i35, 6);
            } else {
                c1141d2 = c1141d;
                i36 = c1141d2.f5064n;
                if (i36 != -1) {
                    m3610e(c25016e, c1141d2, sparseArray, i36, i28);
                } else {
                    i37 = c1141d2.f5066o;
                    if (i37 != -1) {
                        m3610e(c25016e, c1141d2, sparseArray, i37, i34);
                        c25016e6 = c25016e;
                        i38 = i34;
                    }
                    if (f15 >= 0.0f) {
                        c25016e6.f97916e0 = f15;
                    }
                    f13 = c1141d2.f5017F;
                    if (f13 >= 0.0f) {
                        c25016e6.f97918f0 = f13;
                    }
                }
            }
            c25016e6 = c25016e;
            i38 = i34;
            if (f15 >= 0.0f) {
                c25016e6.f97916e0 = f15;
            }
            f13 = c1141d2.f5017F;
            if (f13 >= 0.0f) {
                c25016e6.f97918f0 = f13;
            }
        }
        if (z4 && ((i39 = c1141d2.f5031T) != -1 || c1141d2.f5032U != -1)) {
            int i57 = c1141d2.f5032U;
            c25016e6.f97906Z = i39;
            c25016e6.f97908a0 = i57;
        }
        if (c1141d2.f5039a0) {
            c25016e6.m73425O(1);
            c25016e6.m73429S(((ViewGroup.MarginLayoutParams) c1141d2).width);
            if (((ViewGroup.MarginLayoutParams) c1141d2).width == -2) {
                c25016e6.m73425O(2);
            }
        } else if (((ViewGroup.MarginLayoutParams) c1141d2).width == -1) {
            if (c1141d2.f5034W) {
                c25016e6.m73425O(3);
            } else {
                c25016e6.m73425O(4);
            }
            c25016e6.mo73439j(i16).f97878g = ((ViewGroup.MarginLayoutParams) c1141d2).leftMargin;
            c25016e6.mo73439j(i17).f97878g = ((ViewGroup.MarginLayoutParams) c1141d2).rightMargin;
        } else {
            c25016e6.m73425O(3);
            c25016e6.m73429S(0);
        }
        if (c1141d2.f5041b0) {
            c25016e6.m73427Q(1);
            c25016e6.m73424N(((ViewGroup.MarginLayoutParams) c1141d2).height);
            if (((ViewGroup.MarginLayoutParams) c1141d2).height == -2) {
                c25016e6.m73427Q(2);
            }
        } else if (((ViewGroup.MarginLayoutParams) c1141d2).height == -1) {
            if (c1141d2.f5035X) {
                c25016e6.m73427Q(3);
            } else {
                c25016e6.m73427Q(4);
            }
            c25016e6.mo73439j(i28).f97878g = ((ViewGroup.MarginLayoutParams) c1141d2).topMargin;
            c25016e6.mo73439j(i38).f97878g = ((ViewGroup.MarginLayoutParams) c1141d2).bottomMargin;
        } else {
            c25016e6.m73427Q(3);
            c25016e6.m73424N(0);
        }
        c25016e6.m73421K(c1141d2.f5018G);
        float f17 = c1141d2.f5019H;
        float[] fArr = c25016e6.f97930l0;
        fArr[0] = f17;
        fArr[1] = c1141d2.f5020I;
        c25016e6.f97926j0 = c1141d2.f5021J;
        c25016e6.f97928k0 = c1141d2.f5022K;
        int i58 = c1141d2.f5037Z;
        if (i58 >= 0 && i58 <= 3) {
            c25016e6.f97941r = i58;
        }
        c25016e6.m73426P(c1141d2.f5029R, c1141d2.f5023L, c1141d2.f5025N, c1141d2.f5027P);
        c25016e6.m73428R(c1141d2.f5030S, c1141d2.f5024M, c1141d2.f5026O, c1141d2.f5028Q);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1141d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<AbstractC1139b> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                this.mConstraintHelpers.get(i13).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i15 = Integer.parseInt(strArrSplit[0]);
                        int i16 = Integer.parseInt(strArrSplit[1]);
                        int i17 = Integer.parseInt(strArrSplit[2]);
                        int i18 = (int) ((i15 / 1080.0f) * width);
                        int i19 = (int) ((i16 / 1920.0f) * height);
                        int i24 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f13 = i18;
                        float f14 = i19;
                        float f15 = i18 + ((int) ((i17 / 1080.0f) * width));
                        canvas.drawLine(f13, f14, f15, f14, paint);
                        float f16 = i19 + i24;
                        canvas.drawLine(f15, f14, f15, f16, paint);
                        canvas.drawLine(f15, f16, f13, f16, paint);
                        canvas.drawLine(f13, f16, f13, f14, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f13, f14, f15, f16, paint);
                        canvas.drawLine(f13, f16, f15, f14, paint);
                    }
                }
            }
        }
    }

    public boolean dynamicUpdateConstraints(int i13, int i14) {
        if (this.mModifiers == null) {
            return false;
        }
        View.MeasureSpec.getSize(i13);
        View.MeasureSpec.getSize(i14);
        Iterator<InterfaceC1143f> it = this.mModifiers.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            Iterator it3 = this.mLayoutWidget.f97963r0.iterator();
            if (it3.hasNext()) {
                View view = (View) ((C25016e) it3.next()).f97920g0;
                view.getId();
                throw null;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m3610e(C25016e c25016e, C1141d c1141d, SparseArray sparseArray, int i13, int i14) {
        View view = this.mChildrenByIds.get(i13);
        C25016e c25016e2 = (C25016e) sparseArray.get(i13);
        if (c25016e2 == null || view == null || !(view.getLayoutParams() instanceof C1141d)) {
            return;
        }
        c1141d.f5043c0 = true;
        if (i14 == 6) {
            C1141d c1141d2 = (C1141d) view.getLayoutParams();
            c1141d2.f5043c0 = true;
            c1141d2.f5069p0.f97886F = true;
        }
        c25016e.mo73439j(6).m73400b(c25016e2.mo73439j(i14), c1141d.f5015D, c1141d.f5014C, true);
        c25016e.f97886F = true;
        c25016e.mo73439j(3).m73408j();
        c25016e.mo73439j(5).m73408j();
    }

    public void fillMetrics(AbstractC14052d abstractC14052d) {
        this.mLayoutWidget.f97969x0.getClass();
    }

    @Override // android.view.View
    public void forceLayout() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.forceLayout();
    }

    public Object getDesignInformation(int i13, Object obj) {
        if (i13 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.f97954E0;
    }

    public String getSceneString() {
        int id4;
        StringBuilder sb4 = new StringBuilder();
        if (this.mLayoutWidget.f97927k == null) {
            int id5 = getId();
            if (id5 != -1) {
                this.mLayoutWidget.f97927k = getContext().getResources().getResourceEntryName(id5);
            } else {
                this.mLayoutWidget.f97927k = "parent";
            }
        }
        C25017f c25017f = this.mLayoutWidget;
        if (c25017f.f97924i0 == null) {
            c25017f.f97924i0 = c25017f.f97927k;
            Log.v(TAG, " setDebugName " + this.mLayoutWidget.f97924i0);
        }
        for (C25016e c25016e : this.mLayoutWidget.f97963r0) {
            View view = (View) c25016e.f97920g0;
            if (view != null) {
                if (c25016e.f97927k == null && (id4 = view.getId()) != -1) {
                    c25016e.f97927k = getContext().getResources().getResourceEntryName(id4);
                }
                if (c25016e.f97924i0 == null) {
                    c25016e.f97924i0 = c25016e.f97927k;
                    Log.v(TAG, " setDebugName " + c25016e.f97924i0);
                }
            }
        }
        this.mLayoutWidget.mo73444o(sb4);
        return sb4.toString();
    }

    public View getViewById(int i13) {
        return this.mChildrenByIds.get(i13);
    }

    public final C25016e getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C1141d) {
            return ((C1141d) view.getLayoutParams()).f5069p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C1141d) {
            return ((C1141d) view.getLayoutParams()).f5069p0;
        }
        return null;
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i13) {
        if (i13 == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new C1146i(getContext(), this, i13);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            C1141d c1141d = (C1141d) childAt.getLayoutParams();
            C25016e c25016e = c1141d.f5069p0;
            if (childAt.getVisibility() != 8 || c1141d.f5045d0 || c1141d.f5047e0 || zIsInEditMode) {
                int iM73446s = c25016e.m73446s();
                int iM73447t = c25016e.m73447t();
                childAt.layout(iM73446s, iM73447t, c25016e.m73445r() + iM73446s, c25016e.m73441l() + iM73447t);
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i18 = 0; i18 < size; i18++) {
                this.mConstraintHelpers.get(i18).mo3612j();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i13, int i14) {
        boolean z4;
        String str;
        int iM3620g;
        C25016e c25016e;
        boolean zDynamicUpdateConstraints = this.mDirtyHierarchy | dynamicUpdateConstraints(i13, i14);
        this.mDirtyHierarchy = zDynamicUpdateConstraints;
        if (!zDynamicUpdateConstraints) {
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                if (getChildAt(i15).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
            }
        }
        this.mOnMeasureWidthMeasureSpec = i13;
        this.mOnMeasureHeightMeasureSpec = i14;
        this.mLayoutWidget.f97968w0 = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            int childCount2 = getChildCount();
            int i16 = 0;
            while (true) {
                if (i16 >= childCount2) {
                    z4 = false;
                    break;
                } else {
                    if (getChildAt(i16).isLayoutRequested()) {
                        z4 = true;
                        break;
                    }
                    i16++;
                }
            }
            if (z4) {
                boolean zIsInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i17 = 0; i17 < childCount3; i17++) {
                    C25016e viewWidget = getViewWidget(getChildAt(i17));
                    if (viewWidget != null) {
                        viewWidget.mo73416D();
                    }
                }
                if (zIsInEditMode) {
                    for (int i18 = 0; i18 < childCount3; i18++) {
                        View childAt = getChildAt(i18);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                            int iIndexOf = resourceName.indexOf(47);
                            if (iIndexOf != -1) {
                                resourceName = resourceName.substring(iIndexOf + 1);
                            }
                            int id4 = childAt.getId();
                            if (id4 == 0) {
                                c25016e = this.mLayoutWidget;
                            } else {
                                View viewFindViewById = this.mChildrenByIds.get(id4);
                                if (viewFindViewById == null && (viewFindViewById = findViewById(id4)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
                                    onViewAdded(viewFindViewById);
                                }
                                c25016e = viewFindViewById == this ? this.mLayoutWidget : viewFindViewById == null ? null : ((C1141d) viewFindViewById.getLayoutParams()).f5069p0;
                            }
                            c25016e.f97924i0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.mConstraintSetId != -1) {
                    for (int i19 = 0; i19 < childCount3; i19++) {
                        getChildAt(i19).getId();
                    }
                }
                C1153p c1153p = this.mConstraintSet;
                if (c1153p != null) {
                    c1153p.m3645b(this);
                }
                this.mLayoutWidget.f97963r0.clear();
                int size = this.mConstraintHelpers.size();
                if (size > 0) {
                    for (int i24 = 0; i24 < size; i24++) {
                        AbstractC1139b abstractC1139b = this.mConstraintHelpers.get(i24);
                        HashMap map = abstractC1139b.f5006G;
                        if (abstractC1139b.isInEditMode()) {
                            abstractC1139b.setIds(abstractC1139b.f5004E);
                        }
                        AbstractC25021j abstractC25021j = abstractC1139b.f5010z;
                        if (abstractC25021j != null) {
                            abstractC25021j.f98022s0 = 0;
                            Arrays.fill(abstractC25021j.f98021r0, (Object) null);
                            for (int i25 = 0; i25 < abstractC1139b.f5008x; i25++) {
                                int i26 = abstractC1139b.f5007w[i25];
                                View viewById = getViewById(i26);
                                if (viewById == null && (iM3620g = abstractC1139b.m3620g(this, (str = (String) map.get(Integer.valueOf(i26))))) != 0) {
                                    abstractC1139b.f5007w[i25] = iM3620g;
                                    map.put(Integer.valueOf(iM3620g), str);
                                    viewById = getViewById(iM3620g);
                                }
                                if (viewById != null) {
                                    abstractC1139b.f5010z.m73472V(getViewWidget(viewById));
                                }
                            }
                            abstractC1139b.f5010z.mo73474X();
                        }
                    }
                }
                for (int i27 = 0; i27 < childCount3; i27++) {
                    getChildAt(i27);
                }
                this.mTempMapIdToWidget.clear();
                this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
                this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
                for (int i28 = 0; i28 < childCount3; i28++) {
                    View childAt2 = getChildAt(i28);
                    this.mTempMapIdToWidget.put(childAt2.getId(), getViewWidget(childAt2));
                }
                for (int i29 = 0; i29 < childCount3; i29++) {
                    View childAt3 = getChildAt(i29);
                    C25016e viewWidget2 = getViewWidget(childAt3);
                    if (viewWidget2 != null) {
                        C1141d c1141d = (C1141d) childAt3.getLayoutParams();
                        this.mLayoutWidget.m73455V(viewWidget2);
                        applyConstraintsFromLayoutParams(zIsInEditMode, childAt3, viewWidget2, c1141d, this.mTempMapIdToWidget);
                    }
                }
            }
            if (z4) {
                C25017f c25017f = this.mLayoutWidget;
                c25017f.f97964s0.m696a0(c25017f);
            }
        }
        this.mLayoutWidget.f97969x0.getClass();
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i13, i14);
        int iM73445r = this.mLayoutWidget.m73445r();
        int iM73441l = this.mLayoutWidget.m73441l();
        C25017f c25017f2 = this.mLayoutWidget;
        resolveMeasuredDimension(i13, i14, iM73445r, iM73441l, c25017f2.f97955F0, c25017f2.f97956G0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C25016e viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof C25020i)) {
            C1141d c1141d = (C1141d) view.getLayoutParams();
            C25020i c25020i = new C25020i();
            c1141d.f5069p0 = c25020i;
            c1141d.f5045d0 = true;
            c25020i.m73471W(c1141d.f5033V);
        }
        if (view instanceof AbstractC1139b) {
            AbstractC1139b abstractC1139b = (AbstractC1139b) view;
            abstractC1139b.m3621k();
            ((C1141d) view.getLayoutParams()).f5047e0 = true;
            if (!this.mConstraintHelpers.contains(abstractC1139b)) {
                this.mConstraintHelpers.add(abstractC1139b);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        C25016e viewWidget = getViewWidget(view);
        this.mLayoutWidget.f97963r0.remove(viewWidget);
        viewWidget.mo73416D();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i13) {
        this.mConstraintLayoutSpec = new C1146i(getContext(), this, i13);
    }

    public void removeValueModifier(InterfaceC1143f interfaceC1143f) {
        if (interfaceC1143f == null) {
            return;
        }
        this.mModifiers.remove(interfaceC1143f);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i13, int i14, int i15, int i16, boolean z4, boolean z13) {
        C1142e c1142e = this.mMeasurer;
        int i17 = c1142e.f5084e;
        int iResolveSizeAndState = View.resolveSizeAndState(i15 + c1142e.f5083d, i13, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i16 + i17, i14, 0) & 16777215;
        int iMin = Math.min(this.mMaxWidth, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.mMaxHeight, iResolveSizeAndState2);
        if (z4) {
            iMin |= 16777216;
        }
        if (z13) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    public void resolveSystem(C25017f c25017f, int i13, int i14, int i15) {
        int mode = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i14);
        int mode2 = View.MeasureSpec.getMode(i15);
        int size2 = View.MeasureSpec.getSize(i15);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i16 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        C1142e c1142e = this.mMeasurer;
        c1142e.f5081b = iMax;
        c1142e.f5082c = iMax2;
        c1142e.f5083d = paddingWidth;
        c1142e.f5084e = i16;
        c1142e.f5085f = i14;
        c1142e.f5086g = i15;
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 <= 0 && iMax4 <= 0) {
            iMax3 = Math.max(0, getPaddingLeft());
        } else if (isRtl()) {
            iMax3 = iMax4;
        }
        int i17 = size - paddingWidth;
        int i18 = size2 - i16;
        setSelfDimensionBehaviour(c25017f, mode, i17, mode2, i18);
        c25017f.m73460a0(i13, mode, i17, mode2, i18, iMax3, iMax);
    }

    public void setConstraintSet(C1153p c1153p) {
        this.mConstraintSet = c1153p;
    }

    public void setDesignInformation(int i13, Object obj, Object obj2) {
        if (i13 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.mDesignIds.put(strSubstring, (Integer) obj2);
        }
    }

    @Override // android.view.View
    public void setId(int i13) {
        this.mChildrenByIds.remove(getId());
        super.setId(i13);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i13) {
        if (i13 == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i13;
        requestLayout();
    }

    public void setMaxWidth(int i13) {
        if (i13 == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i13;
        requestLayout();
    }

    public void setMinHeight(int i13) {
        if (i13 == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i13;
        requestLayout();
    }

    public void setMinWidth(int i13) {
        if (i13 == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i13;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC1154q abstractC1154q) {
        C1146i c1146i = this.mConstraintLayoutSpec;
        if (c1146i != null) {
            c1146i.getClass();
        }
    }

    public void setOptimizationLevel(int i13) {
        this.mOptimizationLevel = i13;
        C25017f c25017f = this.mLayoutWidget;
        c25017f.f97954E0 = i13;
        C14051c.f50153q = c25017f.m73461c0(512);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x003f A[PHI: r4
      0x003f: PHI (r4v2 int) = (r4v0 int), (r4v4 int) binds: [B:21:0x004a, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x0090  */
    /* JADX WARN: Code duplicated, block: B:33:0x0093  */
    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    public void setSelfDimensionBehaviour(C25017f c25017f, int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        int i19;
        C1142e c1142e = this.mMeasurer;
        int i24 = c1142e.f5084e;
        int i25 = c1142e.f5083d;
        int childCount = getChildCount();
        int i26 = 2;
        if (i13 != Integer.MIN_VALUE) {
            if (i13 != 0) {
                if (i13 != 1073741824) {
                    i17 = 1;
                } else {
                    i14 = Math.min(this.mMaxWidth - i25, i14);
                    i17 = 1;
                }
                if (i15 != Integer.MIN_VALUE) {
                    if (i15 != 0) {
                        if (i15 != 1073741824) {
                            i26 = 1;
                            i16 = 0;
                        } else {
                            i16 = Math.min(this.mMaxHeight - i24, i16);
                            i26 = 1;
                        }
                    } else if (childCount == 0) {
                        i16 = Math.max(0, this.mMinHeight);
                    } else {
                        i16 = 0;
                    }
                } else if (childCount == 0) {
                    i16 = Math.max(0, this.mMinHeight);
                }
                if (i14 == c25017f.m73445r() || i16 != c25017f.m73441l()) {
                    c25017f.f97965t0.f104373c = true;
                }
                c25017f.f97906Z = 0;
                c25017f.f97908a0 = 0;
                int i27 = this.mMaxWidth - i25;
                int[] iArr = c25017f.f97884D;
                iArr[0] = i27;
                iArr[1] = this.mMaxHeight - i24;
                c25017f.f97912c0 = 0;
                c25017f.f97914d0 = 0;
                c25017f.m73425O(i17);
                c25017f.m73429S(i14);
                c25017f.m73427Q(i26);
                c25017f.m73424N(i16);
                i18 = this.mMinWidth - i25;
                if (i18 < 0) {
                    c25017f.f97912c0 = 0;
                } else {
                    c25017f.f97912c0 = i18;
                }
                i19 = this.mMinHeight - i24;
                if (i19 < 0) {
                    c25017f.f97914d0 = 0;
                } else {
                    c25017f.f97914d0 = i19;
                }
            }
            if (childCount == 0) {
                i14 = Math.max(0, this.mMinWidth);
            } else {
                i17 = 2;
            }
            i14 = 0;
            if (i15 != Integer.MIN_VALUE) {
                if (i15 != 0) {
                    if (i15 != 1073741824) {
                        i26 = 1;
                        i16 = 0;
                    } else {
                        i16 = Math.min(this.mMaxHeight - i24, i16);
                        i26 = 1;
                    }
                } else if (childCount == 0) {
                    i16 = Math.max(0, this.mMinHeight);
                } else {
                    i16 = 0;
                }
            } else if (childCount == 0) {
                i16 = Math.max(0, this.mMinHeight);
            }
            if (i14 == c25017f.m73445r()) {
                c25017f.f97965t0.f104373c = true;
            } else {
                c25017f.f97965t0.f104373c = true;
            }
            c25017f.f97906Z = 0;
            c25017f.f97908a0 = 0;
            int i28 = this.mMaxWidth - i25;
            int[] iArr2 = c25017f.f97884D;
            iArr2[0] = i28;
            iArr2[1] = this.mMaxHeight - i24;
            c25017f.f97912c0 = 0;
            c25017f.f97914d0 = 0;
            c25017f.m73425O(i17);
            c25017f.m73429S(i14);
            c25017f.m73427Q(i26);
            c25017f.m73424N(i16);
            i18 = this.mMinWidth - i25;
            if (i18 < 0) {
                c25017f.f97912c0 = 0;
            } else {
                c25017f.f97912c0 = i18;
            }
            i19 = this.mMinHeight - i24;
            if (i19 < 0) {
                c25017f.f97914d0 = 0;
            } else {
                c25017f.f97914d0 = i19;
            }
        }
        if (childCount == 0) {
            i14 = Math.max(0, this.mMinWidth);
        }
        i17 = 2;
        if (i15 != Integer.MIN_VALUE) {
            if (i15 != 0) {
                if (i15 != 1073741824) {
                    i26 = 1;
                    i16 = 0;
                } else {
                    i16 = Math.min(this.mMaxHeight - i24, i16);
                    i26 = 1;
                }
            } else if (childCount == 0) {
                i16 = Math.max(0, this.mMinHeight);
            } else {
                i16 = 0;
            }
        } else if (childCount == 0) {
            i16 = Math.max(0, this.mMinHeight);
        }
        if (i14 == c25017f.m73445r()) {
            c25017f.f97965t0.f104373c = true;
        } else {
            c25017f.f97965t0.f104373c = true;
        }
        c25017f.f97906Z = 0;
        c25017f.f97908a0 = 0;
        int i29 = this.mMaxWidth - i25;
        int[] iArr3 = c25017f.f97884D;
        iArr3[0] = i29;
        iArr3[1] = this.mMaxHeight - i24;
        c25017f.f97912c0 = 0;
        c25017f.f97914d0 = 0;
        c25017f.m73425O(i17);
        c25017f.m73429S(i14);
        c25017f.m73427Q(i26);
        c25017f.m73424N(i16);
        i18 = this.mMinWidth - i25;
        if (i18 < 0) {
            c25017f.f97912c0 = 0;
        } else {
            c25017f.f97912c0 = i18;
        }
        i19 = this.mMinHeight - i24;
        if (i19 < 0) {
            c25017f.f97914d0 = 0;
        } else {
            c25017f.f97914d0 = i19;
        }
    }

    public void setState(int i13, int i14, int i15) {
        C1146i c1146i = this.mConstraintLayoutSpec;
        if (c1146i != null) {
            c1146i.m3628b(i14, i15, i13);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public C1141d generateDefaultLayoutParams() {
        return new C1141d(-2, -2);
    }

    @Override // android.view.ViewGroup
    public C1141d generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1141d c1141d = new C1141d(context, attributeSet);
        c1141d.f5038a = -1;
        c1141d.f5040b = -1;
        c1141d.f5042c = -1.0f;
        c1141d.f5044d = true;
        c1141d.f5046e = -1;
        c1141d.f5048f = -1;
        c1141d.f5050g = -1;
        c1141d.f5052h = -1;
        c1141d.f5054i = -1;
        c1141d.f5056j = -1;
        c1141d.f5058k = -1;
        c1141d.f5060l = -1;
        c1141d.f5062m = -1;
        c1141d.f5064n = -1;
        c1141d.f5066o = -1;
        c1141d.f5068p = -1;
        c1141d.f5070q = 0;
        c1141d.f5071r = 0.0f;
        c1141d.f5072s = -1;
        c1141d.f5073t = -1;
        c1141d.f5074u = -1;
        c1141d.f5075v = -1;
        c1141d.f5076w = Integer.MIN_VALUE;
        c1141d.f5077x = Integer.MIN_VALUE;
        c1141d.f5078y = Integer.MIN_VALUE;
        c1141d.f5079z = Integer.MIN_VALUE;
        c1141d.f5012A = Integer.MIN_VALUE;
        c1141d.f5013B = Integer.MIN_VALUE;
        c1141d.f5014C = Integer.MIN_VALUE;
        c1141d.f5015D = 0;
        c1141d.f5016E = 0.5f;
        c1141d.f5017F = 0.5f;
        c1141d.f5018G = null;
        c1141d.f5019H = -1.0f;
        c1141d.f5020I = -1.0f;
        c1141d.f5021J = 0;
        c1141d.f5022K = 0;
        c1141d.f5023L = 0;
        c1141d.f5024M = 0;
        c1141d.f5025N = 0;
        c1141d.f5026O = 0;
        c1141d.f5027P = 0;
        c1141d.f5028Q = 0;
        c1141d.f5029R = 1.0f;
        c1141d.f5030S = 1.0f;
        c1141d.f5031T = -1;
        c1141d.f5032U = -1;
        c1141d.f5033V = -1;
        c1141d.f5034W = false;
        c1141d.f5035X = false;
        c1141d.f5036Y = null;
        c1141d.f5037Z = 0;
        c1141d.f5039a0 = true;
        c1141d.f5041b0 = true;
        c1141d.f5043c0 = false;
        c1141d.f5045d0 = false;
        c1141d.f5047e0 = false;
        c1141d.f5049f0 = -1;
        c1141d.f5051g0 = -1;
        c1141d.f5053h0 = -1;
        c1141d.f5055i0 = -1;
        c1141d.f5057j0 = Integer.MIN_VALUE;
        c1141d.f5059k0 = Integer.MIN_VALUE;
        c1141d.f5061l0 = 0.5f;
        c1141d.f5069p0 = new C25016e();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1156s.f5224b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i13);
            int i14 = AbstractC1140c.f5011a.get(index);
            switch (i14) {
                case 1:
                    c1141d.f5033V = typedArrayObtainStyledAttributes.getInt(index, c1141d.f5033V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c1141d.f5068p);
                    c1141d.f5068p = resourceId;
                    if (resourceId == -1) {
                        c1141d.f5068p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    c1141d.f5070q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1141d.f5070q);
                    break;
                case 4:
                    float f13 = typedArrayObtainStyledAttributes.getFloat(index, c1141d.f5071r) % 360.0f;
                    c1141d.f5071r = f13;
                    if (f13 < 0.0f) {
                        c1141d.f5071r = (360.0f - f13) % 360.0f;
                    }
                    break;
                case 5:
                    c1141d.f5038a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1141d.f5038a);
                    break;
                case 6:
                    c1141d.f5040b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1141d.f5040b);
                    break;
                case 7:
                    c1141d.f5042c = typedArrayObtainStyledAttributes.getFloat(index, c1141d.f5042c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c1141d.f5046e);
                    c1141d.f5046e = resourceId2;
                    if (resourceId2 == -1) {
                        c1141d.f5046e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c1141d.f5048f);
                    c1141d.f5048f = resourceId3;
                    if (resourceId3 == -1) {
                        c1141d.f5048f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c1141d.f5050g);
                    c1141d.f5050g = resourceId4;
                    if (resourceId4 == -1) {
                        c1141d.f5050g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c1141d.f5052h);
                    c1141d.f5052h = resourceId5;
                    if (resourceId5 == -1) {
                        c1141d.f5052h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c1141d.f5054i);
                    c1141d.f5054i = resourceId6;
                    if (resourceId6 == -1) {
                        c1141d.f5054i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c1141d.f5056j);
                    c1141d.f5056j = resourceId7;
                    if (resourceId7 == -1) {
                        c1141d.f5056j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c1141d.f5058k);
                    c1141d.f5058k = resourceId8;
                    if (resourceId8 == -1) {
                        c1141d.f5058k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c1141d.f5060l);
                    c1141d.f5060l = resourceId9;
                    if (resourceId9 == -1) {
                        c1141d.f5060l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c1141d.f5062m);
                    c1141d.f5062m = resourceId10;
                    if (resourceId10 == -1) {
                        c1141d.f5062m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c1141d.f5072s);
                    c1141d.f5072s = resourceId11;
                    if (resourceId11 == -1) {
                        c1141d.f5072s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c1141d.f5073t);
                    c1141d.f5073t = resourceId12;
                    if (resourceId12 == -1) {
                        c1141d.f5073t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c1141d.f5074u);
                    c1141d.f5074u = resourceId13;
                    if (resourceId13 == -1) {
                        c1141d.f5074u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c1141d.f5075v);
                    c1141d.f5075v = resourceId14;
                    if (resourceId14 == -1) {
                        c1141d.f5075v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    c1141d.f5076w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1141d.f5076w);
                    break;
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    c1141d.f5077x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1141d.f5077x);
                    break;
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    c1141d.f5078y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1141d.f5078y);
                    break;
                case 24:
                    c1141d.f5079z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1141d.f5079z);
                    break;
                case 25:
                    c1141d.f5012A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1141d.f5012A);
                    break;
                case 26:
                    c1141d.f5013B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1141d.f5013B);
                    break;
                case 27:
                    c1141d.f5034W = typedArrayObtainStyledAttributes.getBoolean(index, c1141d.f5034W);
                    break;
                case 28:
                    c1141d.f5035X = typedArrayObtainStyledAttributes.getBoolean(index, c1141d.f5035X);
                    break;
                case 29:
                    c1141d.f5016E = typedArrayObtainStyledAttributes.getFloat(index, c1141d.f5016E);
                    break;
                case 30:
                    c1141d.f5017F = typedArrayObtainStyledAttributes.getFloat(index, c1141d.f5017F);
                    break;
                case 31:
                    int i15 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c1141d.f5023L = i15;
                    if (i15 == 1) {
                        Log.e(TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i16 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c1141d.f5024M = i16;
                    if (i16 == 1) {
                        Log.e(TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        c1141d.f5025N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1141d.f5025N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1141d.f5025N) == -2) {
                            c1141d.f5025N = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        c1141d.f5027P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1141d.f5027P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1141d.f5027P) == -2) {
                            c1141d.f5027P = -2;
                        }
                    }
                    break;
                case 35:
                    c1141d.f5029R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c1141d.f5029R));
                    c1141d.f5023L = 2;
                    break;
                case 36:
                    try {
                        c1141d.f5026O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1141d.f5026O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1141d.f5026O) == -2) {
                            c1141d.f5026O = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        c1141d.f5028Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1141d.f5028Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1141d.f5028Q) == -2) {
                            c1141d.f5028Q = -2;
                        }
                    }
                    break;
                case 38:
                    c1141d.f5030S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c1141d.f5030S));
                    c1141d.f5024M = 2;
                    break;
                default:
                    switch (i14) {
                        case 44:
                            C1153p.m3642n(c1141d, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c1141d.f5019H = typedArrayObtainStyledAttributes.getFloat(index, c1141d.f5019H);
                            break;
                        case 46:
                            c1141d.f5020I = typedArrayObtainStyledAttributes.getFloat(index, c1141d.f5020I);
                            break;
                        case 47:
                            c1141d.f5021J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c1141d.f5022K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c1141d.f5031T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1141d.f5031T);
                            break;
                        case 50:
                            c1141d.f5032U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1141d.f5032U);
                            break;
                        case 51:
                            c1141d.f5036Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, c1141d.f5064n);
                            c1141d.f5064n = resourceId15;
                            if (resourceId15 == -1) {
                                c1141d.f5064n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, c1141d.f5066o);
                            c1141d.f5066o = resourceId16;
                            if (resourceId16 == -1) {
                                c1141d.f5066o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            c1141d.f5015D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1141d.f5015D);
                            break;
                        case 55:
                            c1141d.f5014C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1141d.f5014C);
                            break;
                        default:
                            switch (i14) {
                                case 64:
                                    C1153p.m3641m(c1141d, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    C1153p.m3641m(c1141d, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c1141d.f5037Z = typedArrayObtainStyledAttributes.getInt(index, c1141d.f5037Z);
                                    break;
                                case 67:
                                    c1141d.f5044d = typedArrayObtainStyledAttributes.getBoolean(index, c1141d.f5044d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c1141d.m3622a();
        return c1141d;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C25017f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new C1142e(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m3609a(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C25017f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new C1142e(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m3609a(attributeSet, i13, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C25017f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new C1142e(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m3609a(attributeSet, i13, i14);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1141d c1141d = new C1141d(layoutParams);
        c1141d.f5038a = -1;
        c1141d.f5040b = -1;
        c1141d.f5042c = -1.0f;
        c1141d.f5044d = true;
        c1141d.f5046e = -1;
        c1141d.f5048f = -1;
        c1141d.f5050g = -1;
        c1141d.f5052h = -1;
        c1141d.f5054i = -1;
        c1141d.f5056j = -1;
        c1141d.f5058k = -1;
        c1141d.f5060l = -1;
        c1141d.f5062m = -1;
        c1141d.f5064n = -1;
        c1141d.f5066o = -1;
        c1141d.f5068p = -1;
        c1141d.f5070q = 0;
        c1141d.f5071r = 0.0f;
        c1141d.f5072s = -1;
        c1141d.f5073t = -1;
        c1141d.f5074u = -1;
        c1141d.f5075v = -1;
        c1141d.f5076w = Integer.MIN_VALUE;
        c1141d.f5077x = Integer.MIN_VALUE;
        c1141d.f5078y = Integer.MIN_VALUE;
        c1141d.f5079z = Integer.MIN_VALUE;
        c1141d.f5012A = Integer.MIN_VALUE;
        c1141d.f5013B = Integer.MIN_VALUE;
        c1141d.f5014C = Integer.MIN_VALUE;
        c1141d.f5015D = 0;
        c1141d.f5016E = 0.5f;
        c1141d.f5017F = 0.5f;
        c1141d.f5018G = null;
        c1141d.f5019H = -1.0f;
        c1141d.f5020I = -1.0f;
        c1141d.f5021J = 0;
        c1141d.f5022K = 0;
        c1141d.f5023L = 0;
        c1141d.f5024M = 0;
        c1141d.f5025N = 0;
        c1141d.f5026O = 0;
        c1141d.f5027P = 0;
        c1141d.f5028Q = 0;
        c1141d.f5029R = 1.0f;
        c1141d.f5030S = 1.0f;
        c1141d.f5031T = -1;
        c1141d.f5032U = -1;
        c1141d.f5033V = -1;
        c1141d.f5034W = false;
        c1141d.f5035X = false;
        c1141d.f5036Y = null;
        c1141d.f5037Z = 0;
        c1141d.f5039a0 = true;
        c1141d.f5041b0 = true;
        c1141d.f5043c0 = false;
        c1141d.f5045d0 = false;
        c1141d.f5047e0 = false;
        c1141d.f5049f0 = -1;
        c1141d.f5051g0 = -1;
        c1141d.f5053h0 = -1;
        c1141d.f5055i0 = -1;
        c1141d.f5057j0 = Integer.MIN_VALUE;
        c1141d.f5059k0 = Integer.MIN_VALUE;
        c1141d.f5061l0 = 0.5f;
        c1141d.f5069p0 = new C25016e();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) c1141d).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) c1141d).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) c1141d).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) c1141d).bottomMargin = marginLayoutParams.bottomMargin;
            c1141d.setMarginStart(marginLayoutParams.getMarginStart());
            c1141d.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof C1141d)) {
            return c1141d;
        }
        C1141d c1141d2 = (C1141d) layoutParams;
        c1141d.f5038a = c1141d2.f5038a;
        c1141d.f5040b = c1141d2.f5040b;
        c1141d.f5042c = c1141d2.f5042c;
        c1141d.f5044d = c1141d2.f5044d;
        c1141d.f5046e = c1141d2.f5046e;
        c1141d.f5048f = c1141d2.f5048f;
        c1141d.f5050g = c1141d2.f5050g;
        c1141d.f5052h = c1141d2.f5052h;
        c1141d.f5054i = c1141d2.f5054i;
        c1141d.f5056j = c1141d2.f5056j;
        c1141d.f5058k = c1141d2.f5058k;
        c1141d.f5060l = c1141d2.f5060l;
        c1141d.f5062m = c1141d2.f5062m;
        c1141d.f5064n = c1141d2.f5064n;
        c1141d.f5066o = c1141d2.f5066o;
        c1141d.f5068p = c1141d2.f5068p;
        c1141d.f5070q = c1141d2.f5070q;
        c1141d.f5071r = c1141d2.f5071r;
        c1141d.f5072s = c1141d2.f5072s;
        c1141d.f5073t = c1141d2.f5073t;
        c1141d.f5074u = c1141d2.f5074u;
        c1141d.f5075v = c1141d2.f5075v;
        c1141d.f5076w = c1141d2.f5076w;
        c1141d.f5077x = c1141d2.f5077x;
        c1141d.f5078y = c1141d2.f5078y;
        c1141d.f5079z = c1141d2.f5079z;
        c1141d.f5012A = c1141d2.f5012A;
        c1141d.f5013B = c1141d2.f5013B;
        c1141d.f5014C = c1141d2.f5014C;
        c1141d.f5015D = c1141d2.f5015D;
        c1141d.f5016E = c1141d2.f5016E;
        c1141d.f5017F = c1141d2.f5017F;
        c1141d.f5018G = c1141d2.f5018G;
        c1141d.f5019H = c1141d2.f5019H;
        c1141d.f5020I = c1141d2.f5020I;
        c1141d.f5021J = c1141d2.f5021J;
        c1141d.f5022K = c1141d2.f5022K;
        c1141d.f5034W = c1141d2.f5034W;
        c1141d.f5035X = c1141d2.f5035X;
        c1141d.f5023L = c1141d2.f5023L;
        c1141d.f5024M = c1141d2.f5024M;
        c1141d.f5025N = c1141d2.f5025N;
        c1141d.f5027P = c1141d2.f5027P;
        c1141d.f5026O = c1141d2.f5026O;
        c1141d.f5028Q = c1141d2.f5028Q;
        c1141d.f5029R = c1141d2.f5029R;
        c1141d.f5030S = c1141d2.f5030S;
        c1141d.f5031T = c1141d2.f5031T;
        c1141d.f5032U = c1141d2.f5032U;
        c1141d.f5033V = c1141d2.f5033V;
        c1141d.f5039a0 = c1141d2.f5039a0;
        c1141d.f5041b0 = c1141d2.f5041b0;
        c1141d.f5043c0 = c1141d2.f5043c0;
        c1141d.f5045d0 = c1141d2.f5045d0;
        c1141d.f5049f0 = c1141d2.f5049f0;
        c1141d.f5051g0 = c1141d2.f5051g0;
        c1141d.f5053h0 = c1141d2.f5053h0;
        c1141d.f5055i0 = c1141d2.f5055i0;
        c1141d.f5057j0 = c1141d2.f5057j0;
        c1141d.f5059k0 = c1141d2.f5059k0;
        c1141d.f5061l0 = c1141d2.f5061l0;
        c1141d.f5036Y = c1141d2.f5036Y;
        c1141d.f5037Z = c1141d2.f5037Z;
        c1141d.f5069p0 = c1141d2.f5069p0;
        return c1141d;
    }
}
