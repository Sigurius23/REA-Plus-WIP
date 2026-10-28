package p474s;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.whoop.android.R;
import p184h5.AbstractC16901p0;
import p290l.AbstractC22932a;

/* JADX INFO: renamed from: s.t2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C32011t2 implements InterfaceC31938b1 {

    /* JADX INFO: renamed from: a */
    public final Toolbar f132828a;

    /* JADX INFO: renamed from: b */
    public int f132829b;

    /* JADX INFO: renamed from: c */
    public View f132830c;

    /* JADX INFO: renamed from: d */
    public Drawable f132831d;

    /* JADX INFO: renamed from: e */
    public Drawable f132832e;

    /* JADX INFO: renamed from: f */
    public Drawable f132833f;

    /* JADX INFO: renamed from: g */
    public boolean f132834g;

    /* JADX INFO: renamed from: h */
    public CharSequence f132835h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f132836i;

    /* JADX INFO: renamed from: j */
    public final CharSequence f132837j;

    /* JADX INFO: renamed from: k */
    public Window.Callback f132838k;

    /* JADX INFO: renamed from: l */
    public boolean f132839l;

    /* JADX INFO: renamed from: m */
    public C31960h f132840m;

    /* JADX INFO: renamed from: n */
    public final int f132841n;

    /* JADX INFO: renamed from: o */
    public final Drawable f132842o;

    public C32011t2(Toolbar toolbar, boolean z4) {
        Drawable drawable;
        this.f132841n = 0;
        this.f132828a = toolbar;
        this.f132835h = toolbar.getTitle();
        this.f132836i = toolbar.getSubtitle();
        this.f132834g = this.f132835h != null;
        this.f132833f = toolbar.getNavigationIcon();
        C31983m2 c31983m2M99479q = C31983m2.m99479q(toolbar.getContext(), null, AbstractC22932a.f90508a, R.attr.actionBarStyle);
        TypedArray typedArray = (TypedArray) c31983m2M99479q.f132769x;
        int i13 = 15;
        this.f132842o = c31983m2M99479q.m99486j(15);
        if (z4) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f132834g = true;
                this.f132835h = text;
                if ((this.f132829b & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.f132834g) {
                        AbstractC16901p0.m47584o(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f132836i = text2;
                if ((this.f132829b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableM99486j = c31983m2M99479q.m99486j(20);
            if (drawableM99486j != null) {
                this.f132832e = drawableM99486j;
                m99565d();
            }
            Drawable drawableM99486j2 = c31983m2M99479q.m99486j(17);
            if (drawableM99486j2 != null) {
                this.f132831d = drawableM99486j2;
                m99565d();
            }
            if (this.f132833f == null && (drawable = this.f132842o) != null) {
                this.f132833f = drawable;
                if ((this.f132829b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            m99563b(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                m99562a(LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false));
                m99563b(this.f132829b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                toolbar.m3300D(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                toolbar.mo3304H(toolbar.getContext(), resourceId2);
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                toolbar.m3303G(toolbar.getContext(), resourceId3);
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f132842o = toolbar.getNavigationIcon();
            } else {
                i13 = 11;
            }
            this.f132829b = i13;
        }
        c31983m2M99479q.m99491r();
        if (R.string.abc_action_bar_up_description != this.f132841n) {
            this.f132841n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i14 = this.f132841n;
                this.f132837j = i14 != 0 ? toolbar.getContext().getString(i14) : null;
                m99564c();
            }
        }
        this.f132837j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new ViewOnClickListenerC32007s2(this));
    }

    /* JADX INFO: renamed from: a */
    public final void m99562a(View view) {
        View view2 = this.f132830c;
        Toolbar toolbar = this.f132828a;
        if (view2 != null && (this.f132829b & 16) != 0) {
            toolbar.removeView(view2);
        }
        this.f132830c = view;
        if (view == null || (this.f132829b & 16) == 0) {
            return;
        }
        toolbar.addView(view);
    }

    /* JADX INFO: renamed from: b */
    public final void m99563b(int i13) {
        View view;
        int i14 = this.f132829b ^ i13;
        this.f132829b = i13;
        if (i14 != 0) {
            int i15 = i14 & 4;
            Toolbar toolbar = this.f132828a;
            if (i15 != 0) {
                if ((i13 & 4) != 0) {
                    m99564c();
                }
                if ((this.f132829b & 4) != 0) {
                    Drawable drawable = this.f132833f;
                    if (drawable == null) {
                        drawable = this.f132842o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i14 & 3) != 0) {
                m99565d();
            }
            if ((i14 & 8) != 0) {
                if ((i13 & 8) != 0) {
                    toolbar.setTitle(this.f132835h);
                    toolbar.setSubtitle(this.f132836i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i14 & 16) == 0 || (view = this.f132830c) == null) {
                return;
            }
            if ((i13 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m99564c() {
        if ((this.f132829b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f132837j);
            Toolbar toolbar = this.f132828a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f132841n);
            } else {
                toolbar.setNavigationContentDescription(this.f132837j);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m99565d() {
        Drawable drawable;
        int i13 = this.f132829b;
        if ((i13 & 2) == 0) {
            drawable = null;
        } else if ((i13 & 1) == 0 || (drawable = this.f132832e) == null) {
            drawable = this.f132831d;
        }
        this.f132828a.setLogo(drawable);
    }
}
