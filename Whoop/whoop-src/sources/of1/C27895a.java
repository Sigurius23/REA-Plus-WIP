package of1;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whoop.p069ui.ProgressBar;
import ec.InterfaceC13008a;
import nf1.AbstractC26663d;
import p507tx.AbstractC34235f;

/* JADX INFO: renamed from: of1.a */
/* JADX INFO: loaded from: classes8.dex */
public final class C27895a implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    private final FrameLayout f112474a;

    /* JADX INFO: renamed from: b */
    public final TextView f112475b;

    /* JADX INFO: renamed from: c */
    public final FrameLayout f112476c;

    /* JADX INFO: renamed from: d */
    public final ProgressBar f112477d;

    private C27895a(FrameLayout frameLayout, TextView textView, FrameLayout frameLayout2, ProgressBar progressBar) {
        this.f112474a = frameLayout;
        this.f112475b = textView;
        this.f112476c = frameLayout2;
        this.f112477d = progressBar;
    }

    /* JADX INFO: renamed from: a */
    public static C27895a m84174a(View view) {
        int i13 = AbstractC26663d.f105993l;
        TextView textView = (TextView) AbstractC34235f.m108203J(view, i13);
        if (textView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            int i14 = AbstractC26663d.f105995n;
            ProgressBar progressBar = (ProgressBar) AbstractC34235f.m108203J(view, i14);
            if (progressBar != null) {
                return new C27895a(frameLayout, textView, frameLayout, progressBar);
            }
            i13 = i14;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // ec.InterfaceC13008a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f112474a;
    }
}
