package com.whoop.design.showcase.gallery.view.fragment;

import ad1.C0750a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.squareup.wire.AbstractC5583n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import l83.C23454a0;
import p003a1.C0111j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import yc1.C39432b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R+\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseLegacyGalleryFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "C", "()Landroidx/recyclerview/widget/RecyclerView;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lyc1/b;", "<set-?>", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/ui/b;", "z", "()Lyc1/b;", "B", "(Lyc1/b;)V", "binding", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DesignShowcaseLegacyGalleryFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: x */
    static final /* synthetic */ InterfaceC21493z[] f25869x = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(DesignShowcaseLegacyGalleryFragment.class, "binding", "getBinding()Lcom/whoop/design/showcase/databinding/FragmentDesignShowcaseLegacyGalleryBinding;", 0))};

    /* JADX INFO: renamed from: y */
    public static final int f25870y = 8;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m21215A(DesignShowcaseLegacyGalleryFragment designShowcaseLegacyGalleryFragment) {
        AbstractC5583n.m16799z(designShowcaseLegacyGalleryFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    private final void m21216B(C39432b c39432b) {
        this.binding.setValue(this, f25869x[0], c39432b);
    }

    /* JADX INFO: renamed from: C */
    private final RecyclerView m21217C() {
        RecyclerView recyclerView = m21219z().f169667b;
        recyclerView.setAdapter(new C0750a());
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager());
        return recyclerView;
    }

    /* JADX INFO: renamed from: z */
    private final C39432b m21219z() {
        return (C39432b) this.binding.getValue(this, f25869x[0]);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        C39432b c39432bM125946c = C39432b.m125946c(inflater, container, false);
        AbstractC22676k.m65749i(c39432bM125946c, "inflate(...)");
        m21216B(c39432bM125946c);
        ConstraintLayout constraintLayoutM125947b = m21219z().getRoot();
        AbstractC22676k.m65749i(constraintLayoutM125947b, "getRoot(...)");
        return constraintLayoutM125947b;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m21217C();
        m21219z().f169668c.setToolbarType(AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Stress Test")));
        m21219z().f169668c.setOnLeftButtonClick(new C0111j(this, 15));
    }
}
