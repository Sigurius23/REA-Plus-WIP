package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.C1271a;
import androidx.fragment.app.FragmentContainerView;
import com.whoop.android.R;
import l83.C23470p;
import p005a3.C0222l0;
import p098dt.AbstractC12350b;
import p114eb.AbstractC12973l1;
import p114eb.C12991u0;
import p189hb.AbstractC17076l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/m0;", "", "<init>", "()V", "navigation-fragment_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public class NavHostFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w */
    public final C23470p f6511w = AbstractC30060g.m92088H(new C0222l0(this, 12));

    /* JADX INFO: renamed from: x */
    public View f6512x;

    /* JADX INFO: renamed from: y */
    public int f6513y;

    /* JADX INFO: renamed from: z */
    public boolean f6514z;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onAttach(Context context) {
        AbstractC22676k.m65750j(context, "context");
        super.onAttach(context);
        if (this.f6514z) {
            AbstractC1329o1 parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            C1271a c1271a = new C1271a(parentFragmentManager);
            c1271a.m4051o(this);
            c1271a.m4046j();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onCreate(Bundle bundle) {
        m5094y();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.f6514z = true;
            AbstractC1329o1 parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            C1271a c1271a = new C1271a(parentFragmentManager);
            c1271a.m4051o(this);
            c1271a.m4046j();
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC22676k.m65750j(inflater, "inflater");
        Context context = inflater.getContext();
        AbstractC22676k.m65749i(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int id4 = getId();
        if (id4 == 0 || id4 == -1) {
            id4 = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(id4);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroyView() {
        super.onDestroyView();
        View view = this.f6512x;
        if (view != null && AbstractC12350b.m34598s(view) == m5094y()) {
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.f6512x = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onInflate(Context context, AttributeSet attrs, Bundle bundle) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(attrs, "attrs");
        super.onInflate(context, attrs, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, AbstractC12973l1.f44809b);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…tion.R.styleable.NavHost)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f6513y = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attrs, AbstractC17076l.f65619c);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (typedArrayObtainStyledAttributes2.getBoolean(0, false)) {
            this.f6514z = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onSaveInstanceState(Bundle outState) {
        AbstractC22676k.m65750j(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.f6514z) {
            outState.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        view.setTag(R.id.nav_controller_view_tag, m5094y());
        if (view.getParent() != null) {
            Object parent = view.getParent();
            AbstractC22676k.m65748h(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            this.f6512x = view2;
            if (view2.getId() == getId()) {
                View view3 = this.f6512x;
                AbstractC22676k.m65747g(view3);
                view3.setTag(R.id.nav_controller_view_tag, m5094y());
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final C12991u0 m5094y() {
        return (C12991u0) this.f6511w.getValue();
    }
}
