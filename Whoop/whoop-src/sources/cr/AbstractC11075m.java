package cr;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.whoop.android.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p026b2.C2298d;
import p088dc.AbstractC11895b;
import p184h5.AbstractC16901p0;
import p257jq.AbstractC21885a;

/* JADX INFO: renamed from: cr.m */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11075m {

    /* JADX INFO: renamed from: a */
    public static final int[] f35032a = {R.attr.colorPrimary};

    /* JADX INFO: renamed from: b */
    public static final int[] f35033b = {R.attr.colorPrimaryVariant};

    /* JADX INFO: renamed from: c */
    public static final C2298d f35034c = new C2298d(2);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f35035d = 0;

    /* JADX INFO: renamed from: a */
    public static void m29867a(Context context, AttributeSet attributeSet, int i13, int i14) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC21885a.f84540Q, i13, i14);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z4) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m29869c(context, f35033b, "Theme.MaterialComponents");
            }
        }
        m29869c(context, f35032a, "Theme.AppCompat");
    }

    /* JADX INFO: renamed from: b */
    public static void m29868b(Context context, AttributeSet attributeSet, int[] iArr, int i13, int i14, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC21885a.f84540Q, i13, i14);
        boolean z4 = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i13, i14);
            int length = iArr2.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z4 = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i15], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i15++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z4 = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z4) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m29869c(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i13 = 0; i13 < iArr.length; i13++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i13)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalArgumentException(AbstractC11895b.m31996o("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: d */
    public static float m29870d(Context context, int i13) {
        return TypedValue.applyDimension(1, i13, context.getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: e */
    public static ArrayList m29871e(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < materialToolbar.getChildCount(); i13++) {
            View childAt = materialToolbar.getChildAt(i13);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m29872f(View view) {
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        return view.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: g */
    public static TypedArray m29873g(Context context, AttributeSet attributeSet, int[] iArr, int i13, int i14, int... iArr2) {
        m29867a(context, attributeSet, i13, i14);
        m29868b(context, attributeSet, iArr, i13, i14, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i13, i14);
    }

    /* JADX INFO: renamed from: h */
    public static PorterDuff.Mode m29874h(int i13, PorterDuff.Mode mode) {
        if (i13 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i13 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i13 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i13) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
