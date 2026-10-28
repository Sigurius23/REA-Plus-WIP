package p081d5;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import com.whoop.p069ui.home.redesign.view.MainActivity;
import p014aj.C0929d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C11706c extends C0929d {

    /* JADX INFO: renamed from: x */
    public final ViewGroupOnHierarchyChangeListenerC11705b f37850x;

    public C11706c(MainActivity mainActivity) {
        super(mainActivity);
        this.f37850x = new ViewGroupOnHierarchyChangeListenerC11705b(this, mainActivity);
    }

    @Override // p014aj.C0929d
    /* JADX INFO: renamed from: p */
    public final void mo2356p() {
        MainActivity mainActivity = (MainActivity) this.f3422w;
        Resources.Theme theme = mainActivity.getTheme();
        AbstractC22676k.m65749i(theme, "activity.theme");
        m2338A(theme, new TypedValue());
        ((ViewGroup) mainActivity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.f37850x);
    }
}
