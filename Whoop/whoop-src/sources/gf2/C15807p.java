package gf2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.whoop.p069ui.pills.StrokedPillButton;
import ec.InterfaceC13008a;
import p507tx.AbstractC34235f;
import qe2.AbstractC30312e;
import qe2.AbstractC30313f;

/* JADX INFO: renamed from: gf2.p */
/* JADX INFO: loaded from: classes10.dex */
public final class C15807p implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final ConstraintLayout f59655a;

    /* JADX INFO: renamed from: b */
    public final Guideline f59656b;

    /* JADX INFO: renamed from: c */
    public final TextView f59657c;

    /* JADX INFO: renamed from: d */
    public final StrokedPillButton f59658d;

    /* JADX INFO: renamed from: e */
    public final TimePicker f59659e;

    private C15807p(ConstraintLayout constraintLayout, Guideline guideline, TextView textView, StrokedPillButton strokedPillButton, TimePicker timePicker) {
        this.f59655a = constraintLayout;
        this.f59656b = guideline;
        this.f59657c = textView;
        this.f59658d = strokedPillButton;
        this.f59659e = timePicker;
    }

    /* JADX INFO: renamed from: a */
    public static C15807p m44601a(View view) {
        int i13 = AbstractC30312e.f124095N;
        Guideline guideline = (Guideline) AbstractC34235f.m108203J(view, i13);
        if (guideline != null) {
            i13 = AbstractC30312e.f124148e0;
            TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
            if (textView != null) {
                i13 = AbstractC30312e.f124178o0;
                StrokedPillButton strokedPillButton = (StrokedPillButton) AbstractC34235f.m108203J(view, i13);
                if (strokedPillButton != null) {
                    i13 = AbstractC30312e.f124209y1;
                    TimePicker timePicker = (TimePicker) AbstractC34235f.m108203J(view, i13);
                    if (timePicker != null) {
                        return new C15807p((ConstraintLayout) view, guideline, textView, strokedPillButton, timePicker);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    /* JADX INFO: renamed from: c */
    public static C15807p m44602c(LayoutInflater layoutInflater) {
        return m44603d(layoutInflater, null, false);
    }

    /* JADX INFO: renamed from: d */
    public static C15807p m44603d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        View viewInflate = layoutInflater.inflate(AbstractC30313f.f124227o, viewGroup, false);
        if (z4) {
            viewGroup.addView(viewInflate);
        }
        return m44601a(viewInflate);
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f59655a;
    }
}
