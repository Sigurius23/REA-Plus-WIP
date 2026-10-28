package p413q4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p393p4.AbstractC28825a;

/* JADX INFO: renamed from: q4.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C29960e extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a */
    public AbstractC29957b f122364a;

    /* JADX INFO: renamed from: b */
    public boolean f122365b;

    /* JADX INFO: renamed from: c */
    public int f122366c;

    /* JADX INFO: renamed from: d */
    public int f122367d;

    /* JADX INFO: renamed from: e */
    public final int f122368e;

    /* JADX INFO: renamed from: f */
    public int f122369f;

    /* JADX INFO: renamed from: g */
    public int f122370g;

    /* JADX INFO: renamed from: h */
    public int f122371h;

    /* JADX INFO: renamed from: i */
    public int f122372i;

    /* JADX INFO: renamed from: j */
    public int f122373j;

    /* JADX INFO: renamed from: k */
    public View f122374k;

    /* JADX INFO: renamed from: l */
    public View f122375l;

    /* JADX INFO: renamed from: m */
    public boolean f122376m;

    /* JADX INFO: renamed from: n */
    public boolean f122377n;

    /* JADX INFO: renamed from: o */
    public boolean f122378o;

    /* JADX INFO: renamed from: p */
    public boolean f122379p;

    /* JADX INFO: renamed from: q */
    public final Rect f122380q;

    public C29960e() {
        super(-2, -2);
        this.f122365b = false;
        this.f122366c = 0;
        this.f122367d = 0;
        this.f122368e = -1;
        this.f122369f = -1;
        this.f122370g = 0;
        this.f122371h = 0;
        this.f122380q = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m91653a(int i13) {
        if (i13 == 0) {
            return this.f122377n;
        }
        if (i13 != 1) {
            return false;
        }
        return this.f122378o;
    }

    /* JADX INFO: renamed from: b */
    public final void m91654b(AbstractC29957b abstractC29957b) {
        AbstractC29957b abstractC29957b2 = this.f122364a;
        if (abstractC29957b2 != abstractC29957b) {
            if (abstractC29957b2 != null) {
                abstractC29957b2.mo15714n();
            }
            this.f122364a = abstractC29957b;
            this.f122365b = true;
            if (abstractC29957b != null) {
                abstractC29957b.mo15713k(this);
            }
        }
    }

    public C29960e(Context context, AttributeSet attributeSet) {
        AbstractC29957b abstractC29957b;
        super(context, attributeSet);
        this.f122365b = false;
        this.f122366c = 0;
        this.f122367d = 0;
        this.f122368e = -1;
        this.f122369f = -1;
        this.f122370g = 0;
        this.f122371h = 0;
        this.f122380q = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC28825a.f116696b);
        this.f122366c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f122369f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f122367d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f122368e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f122370g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f122371h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f122365b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f5235U;
            if (TextUtils.isEmpty(string)) {
                abstractC29957b = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f5235U;
                    if (!TextUtils.isEmpty(str2)) {
                        string = AbstractC11895b.m31992k('.', str2, string);
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f5237W;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f5236V);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC29957b = (AbstractC29957b) constructor.newInstance(context, attributeSet);
                } catch (Exception e5) {
                    throw new RuntimeException(AbstractC11266d.m30461o("Could not inflate Behavior subclass ", string), e5);
                }
            }
            this.f122364a = abstractC29957b;
        }
        typedArrayObtainStyledAttributes.recycle();
        AbstractC29957b abstractC29957b2 = this.f122364a;
        if (abstractC29957b2 != null) {
            abstractC29957b2.mo15713k(this);
        }
    }

    public C29960e(C29960e c29960e) {
        super((ViewGroup.MarginLayoutParams) c29960e);
        this.f122365b = false;
        this.f122366c = 0;
        this.f122367d = 0;
        this.f122368e = -1;
        this.f122369f = -1;
        this.f122370g = 0;
        this.f122371h = 0;
        this.f122380q = new Rect();
    }

    public C29960e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f122365b = false;
        this.f122366c = 0;
        this.f122367d = 0;
        this.f122368e = -1;
        this.f122369f = -1;
        this.f122370g = 0;
        this.f122371h = 0;
        this.f122380q = new Rect();
    }

    public C29960e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f122365b = false;
        this.f122366c = 0;
        this.f122367d = 0;
        this.f122368e = -1;
        this.f122369f = -1;
        this.f122370g = 0;
        this.f122371h = 0;
        this.f122380q = new Rect();
    }
}
