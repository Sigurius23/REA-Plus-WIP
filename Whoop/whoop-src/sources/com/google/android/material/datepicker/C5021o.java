package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y;
import b30.ViewOnClickListenerC2558k3;
import bi.AbstractC3269g;
import com.google.android.material.internal.CheckableImageButton;
import com.whoop.android.R;
import io.sentry.config.AbstractC20301a;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kr.C22788g;
import p006a4.AbstractC0354a;
import p014aj.C0929d;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16908r1;
import p184h5.C16911s1;
import p184h5.C16917u1;
import p257jq.AbstractC21885a;
import p463rj.AbstractC31484o;
import p592wq.ViewOnTouchListenerC37502a;
import pf.AbstractC29125c;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: com.google.android.material.datepicker.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C5021o<S> extends DialogInterfaceOnCancelListenerC1361y {

    /* JADX INFO: renamed from: E */
    public C5008b f20934E;

    /* JADX INFO: renamed from: F */
    public C5019m f20935F;

    /* JADX INFO: renamed from: G */
    public int f20936G;

    /* JADX INFO: renamed from: H */
    public CharSequence f20937H;

    /* JADX INFO: renamed from: I */
    public boolean f20938I;

    /* JADX INFO: renamed from: J */
    public int f20939J;

    /* JADX INFO: renamed from: K */
    public int f20940K;

    /* JADX INFO: renamed from: L */
    public CharSequence f20941L;

    /* JADX INFO: renamed from: M */
    public int f20942M;

    /* JADX INFO: renamed from: N */
    public CharSequence f20943N;

    /* JADX INFO: renamed from: O */
    public int f20944O;

    /* JADX INFO: renamed from: P */
    public CharSequence f20945P;

    /* JADX INFO: renamed from: Q */
    public int f20946Q;

    /* JADX INFO: renamed from: R */
    public CharSequence f20947R;

    /* JADX INFO: renamed from: S */
    public TextView f20948S;

    /* JADX INFO: renamed from: T */
    public CheckableImageButton f20949T;

    /* JADX INFO: renamed from: U */
    public C22788g f20950U;

    /* JADX INFO: renamed from: V */
    public boolean f20951V;

    /* JADX INFO: renamed from: W */
    public CharSequence f20952W;

    /* JADX INFO: renamed from: X */
    public CharSequence f20953X;

    /* JADX INFO: renamed from: w */
    public final LinkedHashSet f20954w;

    /* JADX INFO: renamed from: x */
    public final LinkedHashSet f20955x;

    /* JADX INFO: renamed from: y */
    public int f20956y;

    /* JADX INFO: renamed from: z */
    public AbstractC5028v f20957z;

    public C5021o() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f20954w = new LinkedHashSet();
        this.f20955x = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: A */
    public static int m15750A(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarM15761b = AbstractC5031y.m15761b();
        calendarM15761b.set(5, 1);
        Calendar calendarM15760a = AbstractC5031y.m15760a(calendarM15761b);
        calendarM15760a.get(2);
        calendarM15760a.get(1);
        int maximum = calendarM15760a.getMaximum(7);
        calendarM15760a.getActualMaximum(5);
        calendarM15760a.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* JADX INFO: renamed from: B */
    public static boolean m15751B(Context context, int i13) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC20301a.m56325X(context, R.attr.materialCalendarStyle, C5019m.class.getCanonicalName()).data, new int[]{i13});
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z4;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f20954w.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f20956y = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f20934E = (C5008b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f20936G = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f20937H = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f20939J = bundle.getInt("INPUT_MODE_KEY");
        this.f20940K = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f20941L = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f20942M = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f20943N = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f20944O = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f20945P = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f20946Q = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f20947R = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f20937H;
        if (text == null) {
            text = requireContext().getResources().getText(this.f20936G);
        }
        this.f20952W = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f20953X = text;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public final Dialog onCreateDialog(Bundle bundle) {
        Context contextRequireContext = requireContext();
        requireContext();
        int i13 = this.f20956y;
        if (i13 == 0) {
            m15752z();
            throw null;
        }
        Dialog dialog = new Dialog(contextRequireContext, i13);
        Context context = dialog.getContext();
        this.f20938I = m15751B(context, android.R.attr.windowFullscreen);
        this.f20950U = new C22788g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC21885a.f84562v, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f20950U.m66009k(context);
        this.f20950U.m66011m(ColorStateList.valueOf(color));
        C22788g c22788g = this.f20950U;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        c22788g.m66010l(AbstractC16877h0.m47510e(decorView));
        return dialog;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f20938I ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f20938I) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m15750A(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m15750A(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        int i13 = 1;
        textView.setAccessibilityLiveRegion(1);
        this.f20949T = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f20948S = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f20949T.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f20949T;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC30060g.m92133x(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC30060g.m92133x(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f20949T.setChecked(this.f20939J != 0);
        AbstractC16901p0.m47583n(this.f20949T, null);
        CheckableImageButton checkableImageButton2 = this.f20949T;
        this.f20949T.setContentDescription(this.f20939J == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f20949T.setOnClickListener(new ViewOnClickListenerC2558k3(this, i13));
        m15752z();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f20955x.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f20956y);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        C5008b c5008b = this.f20934E;
        C5006a c5006a = new C5006a();
        int i13 = C5006a.f20889b;
        int i14 = C5006a.f20889b;
        long j7 = c5008b.f20895w.f20961F;
        long j13 = c5008b.f20896x.f20961F;
        c5006a.f20890a = Long.valueOf(c5008b.f20898z.f20961F);
        int i15 = c5008b.f20892E;
        C5010d c5010d = c5008b.f20897y;
        C5019m c5019m = this.f20935F;
        C5023q c5023q = c5019m == null ? null : c5019m.f20929z;
        if (c5023q != null) {
            c5006a.f20890a = Long.valueOf(c5023q.f20961F);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", c5010d);
        C5023q c5023qM15754f = C5023q.m15754f(j7);
        C5023q c5023qM15754f2 = C5023q.m15754f(j13);
        C5010d c5010d2 = (C5010d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l7 = c5006a.f20890a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C5008b(c5023qM15754f, c5023qM15754f2, c5010d2, l7 == null ? null : C5023q.m15754f(l7.longValue()), i15));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f20936G);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f20937H);
        bundle.putInt("INPUT_MODE_KEY", this.f20939J);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f20940K);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f20941L);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f20942M);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f20943N);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f20944O);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f20945P);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f20946Q);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f20947R);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onStart() {
        AbstractC5028v abstractC5028v;
        AbstractC3269g c16911s1;
        AbstractC3269g c16911s2;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f20938I) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f20950U);
            if (!this.f20951V) {
                View viewFindViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListM976p = AbstractC0354a.m976p(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListM976p != null ? Integer.valueOf(colorStateListM976p.getDefaultColor()) : null;
                boolean z4 = numValueOf == null || numValueOf.intValue() == 0;
                int iM96968t = AbstractC31484o.m96968t(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z4) {
                    numValueOf = Integer.valueOf(iM96968t);
                }
                AbstractC29125c.m88513V(window, false);
                window.getContext();
                window.getContext();
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                boolean z13 = AbstractC31484o.m96971w(0) || AbstractC31484o.m96971w(numValueOf.intValue());
                C0929d c0929d = new C0929d(window.getDecorView());
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 35) {
                    c16911s1 = new C16917u1(window, c0929d);
                } else {
                    c16911s1 = i13 >= 30 ? new C16911s1(window, c0929d) : new C16908r1(window, c0929d);
                }
                c16911s1.mo9526Y(z13);
                boolean z14 = AbstractC31484o.m96971w(0) || AbstractC31484o.m96971w(iM96968t);
                C0929d c0929d2 = new C0929d(window.getDecorView());
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 35) {
                    c16911s2 = new C16917u1(window, c0929d2);
                } else {
                    c16911s2 = i14 >= 30 ? new C16911s1(window, c0929d2) : new C16908r1(window, c0929d2);
                }
                c16911s2.mo9525X(z14);
                C5020n c5020n = new C5020n(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop());
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                AbstractC16877h0.m47517l(viewFindViewById, c5020n);
                this.f20951V = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f20950U, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC37502a(requireDialog(), rect));
        }
        requireContext();
        int i15 = this.f20956y;
        if (i15 == 0) {
            m15752z();
            throw null;
        }
        m15752z();
        C5008b c5008b = this.f20934E;
        C5019m c5019m = new C5019m();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i15);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c5008b);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", c5008b.f20898z);
        c5019m.setArguments(bundle);
        this.f20935F = c5019m;
        if (this.f20939J == 1) {
            abstractC5028v = c5019m;
            m15752z();
            C5008b c5008b2 = this.f20934E;
            C5022p c5022p = new C5022p();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i15);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c5008b2);
            c5022p.setArguments(bundle2);
            abstractC5028v = c5022p;
        }
        abstractC5028v = c5019m;
        this.f20957z = abstractC5028v;
        this.f20948S.setText((this.f20939J == 1 && getResources().getConfiguration().orientation == 2) ? this.f20953X : this.f20952W);
        m15752z();
        getContext();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onStop() {
        this.f20957z.f20979w.clear();
        super.onStop();
    }

    /* JADX INFO: renamed from: z */
    public final void m15752z() {
        if (getArguments().getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }
}
