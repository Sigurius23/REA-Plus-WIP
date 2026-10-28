package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.datepicker.C5016j;
import com.google.android.material.timepicker.C5073f;
import com.whoop.android.R;
import cr.AbstractC11075m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import kr.C22782a;
import kr.C22791j;
import kr.C22792k;
import p133f1.C13982u0;
import p171g9.C15585b;
import p184h5.AbstractC16901p0;
import p257jq.AbstractC21885a;
import p434qq.C30544d;
import p435qr.AbstractC30554a;
import q30.C29934u0;

/* JADX INFO: loaded from: classes6.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ int f20846K = 0;

    /* JADX INFO: renamed from: E */
    public Integer[] f20847E;

    /* JADX INFO: renamed from: F */
    public boolean f20848F;

    /* JADX INFO: renamed from: G */
    public boolean f20849G;

    /* JADX INFO: renamed from: H */
    public boolean f20850H;

    /* JADX INFO: renamed from: I */
    public final int f20851I;

    /* JADX INFO: renamed from: J */
    public HashSet f20852J;

    /* JADX INFO: renamed from: w */
    public final ArrayList f20853w;

    /* JADX INFO: renamed from: x */
    public final C29934u0 f20854x;

    /* JADX INFO: renamed from: y */
    public final LinkedHashSet f20855y;

    /* JADX INFO: renamed from: z */
    public final C13982u0 f20856z;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC30554a.m93706a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f20853w = new ArrayList();
        int i13 = 4;
        this.f20854x = new C29934u0(this, i13);
        this.f20855y = new LinkedHashSet();
        this.f20856z = new C13982u0(this, i13);
        this.f20848F = false;
        this.f20852J = new HashSet();
        TypedArray typedArrayM29873g = AbstractC11075m.m29873g(getContext(), attributeSet, AbstractC21885a.f84561u, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayM29873g.getBoolean(3, false));
        this.f20851I = typedArrayM29873g.getResourceId(1, -1);
        this.f20850H = typedArrayM29873g.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM29873g.getBoolean(0, true));
        typedArrayM29873g.recycle();
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            if (m15722c(i13)) {
                return i13;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m15722c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            if ((getChildAt(i14) instanceof MaterialButton) && m15722c(i14)) {
                i13++;
            }
        }
        return i13;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f20854x);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m15720a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i13 = firstVisibleChildIndex + 1; i13 < getChildCount(); i13++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i13);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i13 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i13, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        m15721b(materialButton.getId(), materialButton.f20842O);
        C22792k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f20853w.add(new C30544d(shapeAppearanceModel.f89770e, shapeAppearanceModel.f89773h, shapeAppearanceModel.f89771f, shapeAppearanceModel.f89772g));
        materialButton.setEnabled(isEnabled());
        AbstractC16901p0.m47583n(materialButton, new C5016j(this, 4));
    }

    /* JADX INFO: renamed from: b */
    public final void m15721b(int i13, boolean z4) {
        if (i13 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i13);
            return;
        }
        HashSet hashSet = new HashSet(this.f20852J);
        if (z4 && !hashSet.contains(Integer.valueOf(i13))) {
            if (this.f20849G && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i13));
        } else {
            if (z4 || !hashSet.contains(Integer.valueOf(i13))) {
                return;
            }
            if (!this.f20850H || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i13));
            }
        }
        m15723d(hashSet);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m15722c(int i13) {
        return getChildAt(i13).getVisibility() != 8;
    }

    /* JADX INFO: renamed from: d */
    public final void m15723d(Set set) {
        HashSet hashSet = this.f20852J;
        this.f20852J = new HashSet(set);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            int id4 = ((MaterialButton) getChildAt(i13)).getId();
            boolean zContains = set.contains(Integer.valueOf(id4));
            View viewFindViewById = findViewById(id4);
            if (viewFindViewById instanceof MaterialButton) {
                this.f20848F = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f20848F = false;
            }
            if (hashSet.contains(Integer.valueOf(id4)) != set.contains(Integer.valueOf(id4))) {
                set.contains(Integer.valueOf(id4));
                Iterator it = this.f20855y.iterator();
                while (it.hasNext()) {
                    ((C5073f) it.next()).m15917a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f20856z);
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            treeMap.put((MaterialButton) getChildAt(i13), Integer.valueOf(i13));
        }
        this.f20847E = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m15724e() {
        C30544d c30544d;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i13 = 0; i13 < childCount; i13++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i13);
            if (materialButton.getVisibility() != 8) {
                C22791j c22791jM66029e = materialButton.getShapeAppearanceModel().m66029e();
                C30544d c30544d2 = (C30544d) this.f20853w.get(i13);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z4 = getOrientation() == 0;
                    C22782a c22782a = C30544d.f125700e;
                    if (i13 == firstVisibleChildIndex) {
                        c30544d = z4 ? AbstractC11075m.m29872f(this) ? new C30544d(c22782a, c22782a, c30544d2.f125702b, c30544d2.f125703c) : new C30544d(c30544d2.f125701a, c30544d2.f125704d, c22782a, c22782a) : new C30544d(c30544d2.f125701a, c22782a, c30544d2.f125702b, c22782a);
                    } else if (i13 != lastVisibleChildIndex) {
                        c30544d2 = null;
                    } else if (z4) {
                        c30544d = AbstractC11075m.m29872f(this) ? new C30544d(c30544d2.f125701a, c30544d2.f125704d, c22782a, c22782a) : new C30544d(c22782a, c22782a, c30544d2.f125702b, c30544d2.f125703c);
                    } else {
                        c30544d = new C30544d(c22782a, c30544d2.f125704d, c22782a, c30544d2.f125703c);
                    }
                    c30544d2 = c30544d;
                }
                if (c30544d2 == null) {
                    c22791jM66029e.m66022b(0.0f);
                } else {
                    c22791jM66029e.f89757e = c30544d2.f125701a;
                    c22791jM66029e.f89760h = c30544d2.f125704d;
                    c22791jM66029e.f89758f = c30544d2.f125702b;
                    c22791jM66029e.f89759g = c30544d2.f125703c;
                }
                materialButton.setShapeAppearanceModel(c22791jM66029e.m66021a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f20849G || this.f20852J.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f20852J.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            int id4 = ((MaterialButton) getChildAt(i13)).getId();
            if (this.f20852J.contains(Integer.valueOf(id4))) {
                arrayList.add(Integer.valueOf(id4));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i13, int i14) {
        Integer[] numArr = this.f20847E;
        if (numArr != null && i14 < numArr.length) {
            return numArr[i14].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i14;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i13 = this.f20851I;
        if (i13 != -1) {
            m15723d(Collections.singleton(Integer.valueOf(i13)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C15585b.m43881c(1, getVisibleButtonCount(), this.f20849G ? 1 : 2, false).f58535a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        m15724e();
        m15720a();
        super.onMeasure(i13, i14);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f20853w.remove(iIndexOfChild);
        }
        m15724e();
        m15720a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            ((MaterialButton) getChildAt(i13)).setEnabled(z4);
        }
    }

    public void setSelectionRequired(boolean z4) {
        this.f20850H = z4;
    }

    public void setSingleSelection(boolean z4) {
        if (this.f20849G != z4) {
            this.f20849G = z4;
            m15723d(new HashSet());
        }
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            ((MaterialButton) getChildAt(i13)).setA11yClassName((this.f20849G ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i13) {
        setSingleSelection(getResources().getBoolean(i13));
    }
}
