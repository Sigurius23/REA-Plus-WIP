package p321m6;

import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import ih0.AbstractC18489d0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m6.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25106b {

    /* JADX INFO: renamed from: a */
    public static final C25105a f98395a = C25105a.f98394a;

    /* JADX INFO: renamed from: a */
    public static C25105a m73598a(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        while (abstractComponentCallbacksC1320m0 != null) {
            if (abstractComponentCallbacksC1320m0.isAdded()) {
                AbstractC22676k.m65749i(abstractComponentCallbacksC1320m0.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            abstractComponentCallbacksC1320m0 = abstractComponentCallbacksC1320m0.getParentFragment();
        }
        return f98395a;
    }

    /* JADX INFO: renamed from: b */
    public static void m73599b(Violation violation) {
        if (AbstractC1329o1.m4132M(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(violation.f5799w.getClass().getName()), violation);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m73600c(AbstractComponentCallbacksC1320m0 fragment, String previousFragmentId) {
        AbstractC22676k.m65750j(fragment, "fragment");
        AbstractC22676k.m65750j(previousFragmentId, "previousFragmentId");
        m73599b(new FragmentReuseViolation(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId));
        m73598a(fragment).getClass();
    }

    /* JADX INFO: renamed from: d */
    public static final void m73601d(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, ViewGroup viewGroup) {
        m73599b(new FragmentTagUsageViolation(abstractComponentCallbacksC1320m0, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC1320m0 + " to container " + viewGroup));
        m73598a(abstractComponentCallbacksC1320m0).getClass();
    }

    /* JADX INFO: renamed from: e */
    public static final void m73602e(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        m73599b(new GetRetainInstanceUsageViolation(abstractComponentCallbacksC1320m0, "Attempting to get retain instance for fragment " + abstractComponentCallbacksC1320m0));
        m73598a(abstractComponentCallbacksC1320m0).getClass();
    }

    /* JADX INFO: renamed from: f */
    public static final void m73603f(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        m73599b(new GetTargetFragmentRequestCodeUsageViolation(abstractComponentCallbacksC1320m0, "Attempting to get target request code from fragment " + abstractComponentCallbacksC1320m0));
        m73598a(abstractComponentCallbacksC1320m0).getClass();
    }

    /* JADX INFO: renamed from: g */
    public static final void m73604g(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        m73599b(new GetTargetFragmentUsageViolation(abstractComponentCallbacksC1320m0, "Attempting to get target fragment from fragment " + abstractComponentCallbacksC1320m0));
        m73598a(abstractComponentCallbacksC1320m0).getClass();
    }

    /* JADX INFO: renamed from: h */
    public static final void m73605h(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        m73599b(new SetRetainInstanceUsageViolation(abstractComponentCallbacksC1320m0, "Attempting to set retain instance for fragment " + abstractComponentCallbacksC1320m0));
        m73598a(abstractComponentCallbacksC1320m0).getClass();
    }

    /* JADX INFO: renamed from: i */
    public static final void m73606i(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1, int i13) {
        m73599b(new SetTargetFragmentUsageViolation(abstractComponentCallbacksC1320m0, "Attempting to set target fragment " + abstractComponentCallbacksC1320m1 + " with request code " + i13 + " for fragment " + abstractComponentCallbacksC1320m0));
        m73598a(abstractComponentCallbacksC1320m0).getClass();
    }

    /* JADX INFO: renamed from: j */
    public static final void m73607j(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, boolean z4) {
        m73599b(new SetUserVisibleHintViolation(abstractComponentCallbacksC1320m0, "Attempting to set user visible hint to " + z4 + " for fragment " + abstractComponentCallbacksC1320m0));
        m73598a(abstractComponentCallbacksC1320m0).getClass();
    }

    /* JADX INFO: renamed from: k */
    public static final void m73608k(AbstractComponentCallbacksC1320m0 fragment, ViewGroup viewGroup) {
        AbstractC22676k.m65750j(fragment, "fragment");
        m73599b(new WrongFragmentContainerViolation(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView"));
        m73598a(fragment).getClass();
    }

    /* JADX INFO: renamed from: l */
    public static final void m73609l(AbstractComponentCallbacksC1320m0 fragment, AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, int i13) {
        AbstractC22676k.m65750j(fragment, "fragment");
        StringBuilder sb4 = new StringBuilder("Attempting to nest fragment ");
        sb4.append(fragment);
        sb4.append(" within the view of parent fragment ");
        sb4.append(abstractComponentCallbacksC1320m0);
        sb4.append(" via container with ID ");
        m73599b(new WrongNestedHierarchyViolation(fragment, AbstractC18489d0.m53371l(sb4, i13, " without using parent's childFragmentManager")));
        m73598a(fragment).getClass();
    }
}
