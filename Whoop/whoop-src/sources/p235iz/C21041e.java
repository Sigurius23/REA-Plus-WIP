package p235iz;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import ec.InterfaceC13008a;
import s40.C32134a1;

/* JADX INFO: renamed from: iz.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C21041e implements InterfaceC13008a {

    /* JADX INFO: renamed from: a */
    public final C32134a1 f79778a;

    /* JADX INFO: renamed from: b */
    public final TextView f79779b;

    /* JADX INFO: renamed from: c */
    public final TextView f79780c;

    /* JADX INFO: renamed from: d */
    public final TextView f79781d;

    /* JADX INFO: renamed from: e */
    public final AppCompatImageView f79782e;

    public C21041e(C32134a1 c32134a1, TextView textView, TextView textView2, TextView textView3, AppCompatImageView appCompatImageView) {
        this.f79778a = c32134a1;
        this.f79779b = textView;
        this.f79780c = textView2;
        this.f79781d = textView3;
        this.f79782e = appCompatImageView;
    }

    @Override // ec.InterfaceC13008a
    public final View getRoot() {
        return this.f79778a;
    }
}
