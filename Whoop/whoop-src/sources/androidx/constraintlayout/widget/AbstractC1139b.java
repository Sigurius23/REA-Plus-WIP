package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Arrays;
import java.util.HashMap;
import p319m4.AbstractC25021j;
import p319m4.C25016e;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1139b extends View {

    /* JADX INFO: renamed from: E */
    public String f5004E;

    /* JADX INFO: renamed from: F */
    public String f5005F;

    /* JADX INFO: renamed from: G */
    public HashMap f5006G;

    /* JADX INFO: renamed from: w */
    public int[] f5007w;

    /* JADX INFO: renamed from: x */
    public int f5008x;

    /* JADX INFO: renamed from: y */
    public Context f5009y;

    /* JADX INFO: renamed from: z */
    public AbstractC25021j f5010z;

    public AbstractC1139b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5007w = new int[32];
        this.f5006G = new HashMap();
        this.f5009y = context;
        mo3606h(attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m3615a(String str) {
        Context context = this.f5009y;
        if (str == null || str.length() == 0 || context == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int identifier = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, strTrim);
            if (designInformation instanceof Integer) {
                identifier = ((Integer) designInformation).intValue();
            }
        }
        if (identifier == 0 && constraintLayout != null) {
            identifier = m3620g(constraintLayout, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = AbstractC1155r.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
        }
        if (identifier != 0) {
            this.f5006G.put(Integer.valueOf(identifier), strTrim);
            m3616b(identifier);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3616b(int i13) {
        if (i13 == getId()) {
            return;
        }
        int i14 = this.f5008x + 1;
        int[] iArr = this.f5007w;
        if (i14 > iArr.length) {
            this.f5007w = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f5007w;
        int i15 = this.f5008x;
        iArr2[i15] = i13;
        this.f5008x = i15 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m3617c(String str) {
        if (str == null || str.length() == 0 || this.f5009y == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = constraintLayout.getChildAt(i13);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C1141d) && strTrim.equals(((C1141d) layoutParams).f5036Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m3616b(childAt.getId());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3618d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m3619e((ConstraintLayout) parent);
    }

    /* JADX INFO: renamed from: e */
    public final void m3619e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i13 = 0; i13 < this.f5008x; i13++) {
            View viewById = constraintLayout.getViewById(this.f5007w[i13]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo3611f(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: renamed from: g */
    public final int m3620g(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f5009y.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = constraintLayout.getChildAt(i13);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f5007w, this.f5008x);
    }

    /* JADX INFO: renamed from: h */
    public void mo3606h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1156s.f5224b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i13);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f5004E = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f5005F = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo3607i(C25016e c25016e, boolean z4) {
    }

    /* JADX INFO: renamed from: j */
    public void mo3612j() {
    }

    /* JADX INFO: renamed from: k */
    public final void m3621k() {
        if (this.f5010z == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C1141d) {
            ((C1141d) layoutParams).f5069p0 = this.f5010z;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f5004E;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f5005F;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i13, int i14) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f5004E = str;
        if (str == null) {
            return;
        }
        int i13 = 0;
        this.f5008x = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i13);
            if (iIndexOf == -1) {
                m3615a(str.substring(i13));
                return;
            } else {
                m3615a(str.substring(i13, iIndexOf));
                i13 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f5005F = str;
        if (str == null) {
            return;
        }
        int i13 = 0;
        this.f5008x = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i13);
            if (iIndexOf == -1) {
                m3617c(str.substring(i13));
                return;
            } else {
                m3617c(str.substring(i13, iIndexOf));
                i13 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f5004E = null;
        this.f5008x = 0;
        for (int i13 : iArr) {
            m3616b(i13);
        }
    }

    @Override // android.view.View
    public final void setTag(int i13, Object obj) {
        super.setTag(i13, obj);
        if (obj == null && this.f5004E == null) {
            m3616b(i13);
        }
    }
}
