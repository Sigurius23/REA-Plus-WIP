package p314m;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import p002a0.C0021f1;
import p474s.C31976l;
import p474s.C32024x;

/* JADX INFO: renamed from: m.f0 */
/* JADX INFO: loaded from: classes.dex */
public class C24839f0 {

    /* JADX INFO: renamed from: b */
    public static final Class[] f97283b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c */
    public static final int[] f97284c = {R.attr.onClick};

    /* JADX INFO: renamed from: d */
    public static final int[] f97285d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e */
    public static final int[] f97286e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f */
    public static final int[] f97287f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g */
    public static final String[] f97288g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h */
    public static final C0021f1 f97289h = new C0021f1(0);

    /* JADX INFO: renamed from: a */
    public final Object[] f97290a = new Object[2];

    /* JADX INFO: renamed from: a */
    public C31976l mo15907a(Context context, AttributeSet attributeSet) {
        return new C31976l(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public AppCompatButton mo15908b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* JADX INFO: renamed from: c */
    public AppCompatCheckBox mo15909c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* JADX INFO: renamed from: d */
    public C32024x mo15910d(Context context, AttributeSet attributeSet) {
        return new C32024x(context, attributeSet);
    }

    /* JADX INFO: renamed from: e */
    public AppCompatTextView mo15911e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* JADX INFO: renamed from: f */
    public final View m72841f(Context context, String str, String str2) {
        String strConcat;
        C0021f1 c0021f1 = f97289h;
        Constructor constructor = (Constructor) c0021f1.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f97283b);
            c0021f1.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f97290a);
    }
}
