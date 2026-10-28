package p314m;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.material.datepicker.ViewOnClickListenerC5018l;
import com.whoop.android.R;
import java.util.WeakHashMap;
import p184h5.AbstractC16880i0;
import p184h5.AbstractC16901p0;
import p474s.C31990o1;

/* JADX INFO: renamed from: m.j */
/* JADX INFO: loaded from: classes5.dex */
public final class DialogInterfaceC24846j extends DialogC24833c0 implements DialogInterface {

    /* JADX INFO: renamed from: F */
    public final C24842h f97334F;

    public DialogInterfaceC24846j(ContextThemeWrapper contextThemeWrapper, int i13) {
        super(contextThemeWrapper, m72853g(contextThemeWrapper, i13));
        this.f97334F = new C24842h(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: g */
    public static int m72853g(Context context, int i13) {
        if (((i13 >>> 24) & 255) >= 1) {
            return i13;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p314m.DialogC24833c0, p161g.DialogC14910m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i13;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        C24842h c24842h = this.f97334F;
        c24842h.f97298b.setContentView(c24842h.f97322z);
        Context context = c24842h.f97297a;
        Window window = c24842h.f97299c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = c24842h.f97303g;
        if (view == null) {
            view = null;
        }
        boolean z4 = view != null;
        if (!z4 || !C24842h.m72843a(view)) {
            window.setFlags(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ);
        }
        if (z4) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (c24842h.f97304h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (c24842h.f97302f != null) {
                ((LinearLayout.LayoutParams) ((C31990o1) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupM72844b = C24842h.m72844b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM72844b2 = C24842h.m72844b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM72844b3 = C24842h.m72844b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c24842h.f97314r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c24842h.f97314r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM72844b2.findViewById(android.R.id.message);
        c24842h.f97318v = textView;
        if (textView != null) {
            CharSequence charSequence = c24842h.f97301e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                c24842h.f97314r.removeView(c24842h.f97318v);
                if (c24842h.f97302f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c24842h.f97314r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(c24842h.f97314r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(c24842h.f97302f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupM72844b2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupM72844b3.findViewById(android.R.id.button1);
        c24842h.f97305i = button;
        ViewOnClickListenerC5018l viewOnClickListenerC5018l = c24842h.f97296F;
        button.setOnClickListener(viewOnClickListenerC5018l);
        if (TextUtils.isEmpty(c24842h.f97306j)) {
            c24842h.f97305i.setVisibility(8);
            i13 = 0;
        } else {
            c24842h.f97305i.setText(c24842h.f97306j);
            c24842h.f97305i.setVisibility(0);
            i13 = 1;
        }
        Button button2 = (Button) viewGroupM72844b3.findViewById(android.R.id.button2);
        c24842h.f97308l = button2;
        button2.setOnClickListener(viewOnClickListenerC5018l);
        if (TextUtils.isEmpty(c24842h.f97309m)) {
            c24842h.f97308l.setVisibility(8);
        } else {
            c24842h.f97308l.setText(c24842h.f97309m);
            c24842h.f97308l.setVisibility(0);
            i13 |= 2;
        }
        Button button3 = (Button) viewGroupM72844b3.findViewById(android.R.id.button3);
        c24842h.f97311o = button3;
        button3.setOnClickListener(viewOnClickListenerC5018l);
        if (TextUtils.isEmpty(c24842h.f97312p)) {
            c24842h.f97311o.setVisibility(8);
        } else {
            c24842h.f97311o.setText(c24842h.f97312p);
            c24842h.f97311o.setVisibility(0);
            i13 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i13 == 1) {
                Button button4 = c24842h.f97305i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i13 == 2) {
                Button button5 = c24842h.f97308l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i13 == 4) {
                Button button6 = c24842h.f97311o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i13 == 0) {
            viewGroupM72844b3.setVisibility(8);
        }
        if (c24842h.f97319w != null) {
            viewGroupM72844b.addView(c24842h.f97319w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c24842h.f97316t = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c24842h.f97300d) || !c24842h.f97294D) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c24842h.f97316t.setVisibility(8);
                viewGroupM72844b.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c24842h.f97317u = textView2;
                textView2.setText(c24842h.f97300d);
                Drawable drawable = c24842h.f97315s;
                if (drawable != null) {
                    c24842h.f97316t.setImageDrawable(drawable);
                } else {
                    c24842h.f97317u.setPadding(c24842h.f97316t.getPaddingLeft(), c24842h.f97316t.getPaddingTop(), c24842h.f97316t.getPaddingRight(), c24842h.f97316t.getPaddingBottom());
                    c24842h.f97316t.setVisibility(8);
                }
            }
        }
        boolean z13 = viewGroup.getVisibility() != 8;
        int i14 = (viewGroupM72844b == null || viewGroupM72844b.getVisibility() == 8) ? 0 : 1;
        boolean z14 = viewGroupM72844b3.getVisibility() != 8;
        if (!z14 && (viewFindViewById = viewGroupM72844b2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i14 != 0) {
            NestedScrollView nestedScrollView2 = c24842h.f97314r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (c24842h.f97301e == null && c24842h.f97302f == null) ? null : viewGroupM72844b.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupM72844b2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c24842h.f97302f;
        if (alertController$RecycleListView != null && (!z14 || i14 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i14 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f4216w, alertController$RecycleListView.getPaddingRight(), z14 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f4217x);
        }
        if (!z13) {
            View view2 = c24842h.f97302f;
            if (view2 == null) {
                view2 = c24842h.f97314r;
            }
            if (view2 != null) {
                int i15 = z14 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                AbstractC16880i0.m47523b(view2, i14 | i15, 3);
                if (viewFindViewById11 != null) {
                    viewGroupM72844b2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupM72844b2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c24842h.f97302f;
        if (alertController$RecycleListView2 == null || (listAdapter = c24842h.f97320x) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i16 = c24842h.f97321y;
        if (i16 > -1) {
            alertController$RecycleListView2.setItemChecked(i16, true);
            alertController$RecycleListView2.setSelection(i16);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i13, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f97334F.f97314r;
        if (nestedScrollView == null || !nestedScrollView.m3701m(keyEvent)) {
            return super.onKeyDown(i13, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i13, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f97334F.f97314r;
        if (nestedScrollView == null || !nestedScrollView.m3701m(keyEvent)) {
            return super.onKeyUp(i13, keyEvent);
        }
        return true;
    }

    @Override // p314m.DialogC24833c0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C24842h c24842h = this.f97334F;
        c24842h.f97300d = charSequence;
        TextView textView = c24842h.f97317u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
