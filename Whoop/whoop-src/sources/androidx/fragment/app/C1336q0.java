package androidx.fragment.app;

import android.view.View;
import android.view.Window;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import p161g.C14923z;
import p161g.InterfaceC14897b0;
import p167g5.InterfaceC15482a;
import p184h5.InterfaceC16885k;
import p184h5.InterfaceC16897o;
import p236j.AbstractC21071j;
import p236j.InterfaceC21072k;
import p399pb.C29047d;
import p399pb.InterfaceC29049f;
import p479s4.InterfaceC32129j;
import p479s4.InterfaceC32130k;

/* JADX INFO: renamed from: androidx.fragment.app.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1336q0 extends AbstractC1359x0 implements InterfaceC32129j, InterfaceC32130k, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, InterfaceC1583f2, InterfaceC14897b0, InterfaceC21072k, InterfaceC29049f, InterfaceC1351u1, InterfaceC16885k {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ AbstractActivityC1340r0 f5776E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1336q0(AbstractActivityC1340r0 abstractActivityC1340r0) {
        super(abstractActivityC1340r0);
        this.f5776E = abstractActivityC1340r0;
    }

    @Override // androidx.fragment.app.InterfaceC1351u1
    /* JADX INFO: renamed from: a */
    public final void mo4085a(AbstractC1329o1 abstractC1329o1, AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        this.f5776E.onAttachFragment(abstractComponentCallbacksC1320m0);
    }

    @Override // p184h5.InterfaceC16885k
    public final void addMenuProvider(InterfaceC16897o interfaceC16897o) {
        this.f5776E.addMenuProvider(interfaceC16897o);
    }

    @Override // p479s4.InterfaceC32129j
    public final void addOnConfigurationChangedListener(InterfaceC15482a interfaceC15482a) {
        this.f5776E.addOnConfigurationChangedListener(interfaceC15482a);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(InterfaceC15482a interfaceC15482a) {
        this.f5776E.addOnMultiWindowModeChangedListener(interfaceC15482a);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(InterfaceC15482a interfaceC15482a) {
        this.f5776E.addOnPictureInPictureModeChangedListener(interfaceC15482a);
    }

    @Override // p479s4.InterfaceC32130k
    public final void addOnTrimMemoryListener(InterfaceC15482a interfaceC15482a) {
        this.f5776E.addOnTrimMemoryListener(interfaceC15482a);
    }

    @Override // androidx.fragment.app.AbstractC1350u0
    /* JADX INFO: renamed from: b */
    public final View mo4070b(int i13) {
        return this.f5776E.findViewById(i13);
    }

    @Override // androidx.fragment.app.AbstractC1350u0
    /* JADX INFO: renamed from: c */
    public final boolean mo4071c() {
        Window window = this.f5776E.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p236j.InterfaceC21072k
    public final AbstractC21071j getActivityResultRegistry() {
        return this.f5776E.getActivityResultRegistry();
    }

    @Override // androidx.lifecycle.InterfaceC1585g0
    public final AbstractC1638x getLifecycle() {
        return this.f5776E.mFragmentLifecycleRegistry;
    }

    @Override // p161g.InterfaceC14897b0
    public final C14923z getOnBackPressedDispatcher() {
        return this.f5776E.getOnBackPressedDispatcher();
    }

    @Override // p399pb.InterfaceC29049f
    public final C29047d getSavedStateRegistry() {
        return this.f5776E.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.InterfaceC1583f2
    public final C1579e2 getViewModelStore() {
        return this.f5776E.getViewModelStore();
    }

    @Override // p184h5.InterfaceC16885k
    public final void removeMenuProvider(InterfaceC16897o interfaceC16897o) {
        this.f5776E.removeMenuProvider(interfaceC16897o);
    }

    @Override // p479s4.InterfaceC32129j
    public final void removeOnConfigurationChangedListener(InterfaceC15482a interfaceC15482a) {
        this.f5776E.removeOnConfigurationChangedListener(interfaceC15482a);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(InterfaceC15482a interfaceC15482a) {
        this.f5776E.removeOnMultiWindowModeChangedListener(interfaceC15482a);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC15482a interfaceC15482a) {
        this.f5776E.removeOnPictureInPictureModeChangedListener(interfaceC15482a);
    }

    @Override // p479s4.InterfaceC32130k
    public final void removeOnTrimMemoryListener(InterfaceC15482a interfaceC15482a) {
        this.f5776E.removeOnTrimMemoryListener(interfaceC15482a);
    }
}
