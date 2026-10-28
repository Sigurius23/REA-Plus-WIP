package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.C1676e1;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import p044c5.RunnableC4209a;
import p184h5.AbstractC16901p0;
import ro.C31624i;

/* JADX INFO: renamed from: com.google.android.material.datepicker.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C5019m<S> extends AbstractC5028v {

    /* JADX INFO: renamed from: E */
    public int f20919E;

    /* JADX INFO: renamed from: F */
    public C5009c f20920F;

    /* JADX INFO: renamed from: G */
    public RecyclerView f20921G;

    /* JADX INFO: renamed from: H */
    public RecyclerView f20922H;

    /* JADX INFO: renamed from: I */
    public View f20923I;

    /* JADX INFO: renamed from: J */
    public View f20924J;

    /* JADX INFO: renamed from: K */
    public View f20925K;

    /* JADX INFO: renamed from: L */
    public View f20926L;

    /* JADX INFO: renamed from: x */
    public int f20927x;

    /* JADX INFO: renamed from: y */
    public C5008b f20928y;

    /* JADX INFO: renamed from: z */
    public C5023q f20929z;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f20927x = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f20928y = (C5008b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f20929z = (C5023q) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i13;
        int i14;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f20927x);
        this.f20920F = new C5009c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C5023q c5023q = this.f20928y.f20895w;
        if (C5021o.m15751B(contextThemeWrapper, R.attr.windowFullscreen)) {
            i13 = com.whoop.android.R.layout.mtrl_calendar_vertical;
            i14 = 1;
        } else {
            i13 = com.whoop.android.R.layout.mtrl_calendar_horizontal;
            i14 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i13, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.whoop.android.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.whoop.android.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.whoop.android.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.whoop.android.R.dimen.mtrl_calendar_days_of_week_height);
        int i15 = C5024r.f20967d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.whoop.android.R.dimen.mtrl_calendar_month_vertical_padding) * (i15 - 1)) + (resources.getDimensionPixelSize(com.whoop.android.R.dimen.mtrl_calendar_day_height) * i15) + resources.getDimensionPixelOffset(com.whoop.android.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.whoop.android.R.id.mtrl_calendar_days_of_week);
        AbstractC16901p0.m47583n(gridView, new C5013g(0));
        int i16 = this.f20928y.f20892E;
        gridView.setAdapter((ListAdapter) (i16 > 0 ? new C5011e(i16) : new C5011e()));
        gridView.setNumColumns(c5023q.f20966z);
        gridView.setEnabled(false);
        this.f20922H = (RecyclerView) viewInflate.findViewById(com.whoop.android.R.id.mtrl_calendar_months);
        getContext();
        this.f20922H.setLayoutManager(new C5014h(this, i14, i14));
        this.f20922H.setTag("MONTHS_VIEW_GROUP_TAG");
        C5027u c5027u = new C5027u(contextThemeWrapper, this.f20928y, new C31624i(this, 14));
        this.f20922H.setAdapter(c5027u);
        int integer = contextThemeWrapper.getResources().getInteger(com.whoop.android.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(com.whoop.android.R.id.mtrl_calendar_year_selector_frame);
        this.f20921G = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f20921G.setLayoutManager(new GridLayoutManager(integer, 0));
            this.f20921G.setAdapter(new C5007a0(this));
            this.f20921G.addItemDecoration(new C5015i(this), -1);
        }
        if (viewInflate.findViewById(com.whoop.android.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.whoop.android.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            AbstractC16901p0.m47583n(materialButton, new C5016j(this, 0));
            View viewFindViewById = viewInflate.findViewById(com.whoop.android.R.id.month_navigation_previous);
            this.f20923I = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(com.whoop.android.R.id.month_navigation_next);
            this.f20924J = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f20925K = viewInflate.findViewById(com.whoop.android.R.id.mtrl_calendar_year_selector_frame);
            this.f20926L = viewInflate.findViewById(com.whoop.android.R.id.mtrl_calendar_day_selector_frame);
            m15737z(1);
            materialButton.setText(this.f20929z.m15755h());
            this.f20922H.addOnScrollListener(new C5017k(this, c5027u, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC5018l(this, 0));
            this.f20924J.setOnClickListener(new ViewOnClickListenerC5012f(this, c5027u, 1));
            this.f20923I.setOnClickListener(new ViewOnClickListenerC5012f(this, c5027u, 0));
        }
        if (!C5021o.m15751B(contextThemeWrapper, R.attr.windowFullscreen)) {
            new C1676e1().m5235a(this.f20922H);
        }
        this.f20922H.scrollToPosition(c5027u.f20976a.f20895w.m15756i(this.f20929z));
        AbstractC16901p0.m47583n(this.f20922H, new C5013g(1));
        return viewInflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f20927x);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f20928y);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f20929z);
    }

    /* JADX INFO: renamed from: y */
    public final void m15736y(C5023q c5023q) {
        C5027u c5027u = (C5027u) this.f20922H.getAdapter();
        int iM15756i = c5027u.f20976a.f20895w.m15756i(c5023q);
        int iM15756i2 = iM15756i - c5027u.f20976a.f20895w.m15756i(this.f20929z);
        boolean z4 = Math.abs(iM15756i2) > 3;
        boolean z13 = iM15756i2 > 0;
        this.f20929z = c5023q;
        if (z4 && z13) {
            this.f20922H.scrollToPosition(iM15756i - 3);
            this.f20922H.post(new RunnableC4209a(this, iM15756i, 1));
        } else if (!z4) {
            this.f20922H.post(new RunnableC4209a(this, iM15756i, 1));
        } else {
            this.f20922H.scrollToPosition(iM15756i + 3);
            this.f20922H.post(new RunnableC4209a(this, iM15756i, 1));
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m15737z(int i13) {
        this.f20919E = i13;
        if (i13 == 2) {
            this.f20921G.getLayoutManager().scrollToPosition(this.f20929z.f20965y - ((C5007a0) this.f20921G.getAdapter()).f20891a.f20928y.f20895w.f20965y);
            this.f20925K.setVisibility(0);
            this.f20926L.setVisibility(8);
            this.f20923I.setVisibility(8);
            this.f20924J.setVisibility(8);
            return;
        }
        if (i13 == 1) {
            this.f20925K.setVisibility(8);
            this.f20926L.setVisibility(0);
            this.f20923I.setVisibility(0);
            this.f20924J.setVisibility(0);
            m15736y(this.f20929z);
        }
    }
}
