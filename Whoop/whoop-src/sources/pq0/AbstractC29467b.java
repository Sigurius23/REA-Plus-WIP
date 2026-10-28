package pq0;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.InterfaceC1633v0;
import c93.InterfaceC4339a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whoop.android.R;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import he1.DialogInterfaceOnShowListenerC17213b;
import hj0.AbstractC17357p;
import hj0.C17359r;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p031b9.AbstractC2875y;
import p404pq.C29464l;
import p404pq.DialogC29463k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qr2.AbstractC30556a;
import rr2.InterfaceC31766c;
import tr2.InterfaceC34116n;
import vf3.InterfaceC35951a;
import vq0.C36277a;
import vu1.AbstractC36510a;

/* JADX INFO: renamed from: pq0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J/\u0010\u0017\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u00028\u00000\u00142\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0015H\u0004¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001a\u0010)\u001a\u00020$8\u0014X\u0094D¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010-R\u001a\u00100\u001a\u00020$8\u0016X\u0096D¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b/\u0010(R\u0014\u00104\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, m65681d2 = {"Lpq0/b;", "Lpq/l;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onDestroyView", "onDestroy", "T", "Landroidx/lifecycle/p0;", "Landroidx/lifecycle/v0;", "observer", "observe", "(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V", "Ltr2/n;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "getLog", "()Ltr2/n;", "log", "Lrr2/c;", "x", "D", "()Lrr2/c;", "crashReporter", "", "y", "Z", "getLogLifecycle", "()Z", "logLifecycle", "Lhj0/r;", "z", "E", "()Lhj0/r;", "lifecycleLogger", "F", "shouldExpandToFullHeight", "", "getLogTag", "()Ljava/lang/String;", "logTag", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29467b extends C29464l {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final boolean shouldExpandToFullHeight;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h log;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h crashReporter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final boolean logLifecycle;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h lifecycleLogger;

    /* JADX INFO: renamed from: pq0.b$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f119657w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f119658x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f119659y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f119657w = componentCallbacks;
            this.f119658x = interfaceC35951a;
            this.f119659y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, rr2.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC31766c invoke() {
            ComponentCallbacks componentCallbacks = this.f119657w;
            InterfaceC35951a interfaceC35951a = this.f119658x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f119659y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC31766c.class), interfaceC35951a);
        }
    }

    public AbstractC29467b() {
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        final int i13 = 0;
        this.log = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: pq0.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AbstractC29467b f119651x;

            {
                this.f119651x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return AbstractC29467b.m89948H(this.f119651x);
                    default:
                        return AbstractC29467b.m89947G(this.f119651x);
                }
            }
        });
        this.crashReporter = AbstractC30060g.m92087G(EnumC23463i.f92933w, new a(this, null, null));
        this.logLifecycle = true;
        final int i14 = 1;
        this.lifecycleLogger = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: pq0.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AbstractC29467b f119651x;

            {
                this.f119651x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return AbstractC29467b.m89948H(this.f119651x);
                    default:
                        return AbstractC29467b.m89947G(this.f119651x);
                }
            }
        });
    }

    /* JADX INFO: renamed from: D */
    private final InterfaceC31766c m89945D() {
        return (InterfaceC31766c) this.crashReporter.getValue();
    }

    /* JADX INFO: renamed from: E */
    private final C17359r m89946E() {
        return (C17359r) this.lifecycleLogger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C17359r m89947G(AbstractC29467b abstractC29467b) {
        return new C17359r(abstractC29467b.getLog());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final InterfaceC34116n m89948H(AbstractC29467b abstractC29467b) {
        return InterfaceC34116n.INSTANCE.m107848a(abstractC29467b.getLogTag());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final void m89949I(AbstractC29467b abstractC29467b, DialogInterface dialogInterface) {
        AbstractC22676k.m65748h(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        FrameLayout frameLayout = (FrameLayout) ((DialogC29463k) dialogInterface).findViewById(R.id.design_bottom_sheet);
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(AbstractC17357p.m49142b(abstractC29467b, AbstractC36510a.f156005N));
            BottomSheetBehavior.m15688O(frameLayout).m15700V(new C36277a().m115964a(abstractC29467b.requireActivity().getResources().getDisplayMetrics().heightPixels, abstractC29467b.getShouldExpandToFullHeight()));
        } else {
            abstractC29467b.getLog().mo85228t("bottom sheet dialog is null", new AbstractC30556a.a[0]);
        }
        abstractC29467b.getLog().mo85228t("done", new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public boolean getShouldExpandToFullHeight() {
        return this.shouldExpandToFullHeight;
    }

    public final InterfaceC34116n getLog() {
        return (InterfaceC34116n) this.log.getValue();
    }

    public boolean getLogLifecycle() {
        return this.logLifecycle;
    }

    public abstract String getLogTag();

    public final <T> void observe(AbstractC1615p0 abstractC1615p0, InterfaceC1633v0 observer) {
        AbstractC22676k.m65750j(abstractC1615p0, "<this>");
        AbstractC22676k.m65750j(observer, "observer");
        abstractC1615p0.observe(getViewLifecycleOwner(), observer);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        if (getLogLifecycle()) {
            getLifecycle().mo4986a(m89946E());
        }
        super.onCreate(savedInstanceState);
    }

    @Override // p404pq.C29464l, p314m.C24835d0, androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        if (getLogLifecycle()) {
            getLog().mo85219j("onCreateDialog", new AbstractC30556a.a[0]);
        }
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        dialogOnCreateDialog.setOnShowListener(new DialogInterfaceOnShowListenerC17213b(this, 2));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroy() {
        super.onDestroy();
        if (getLogLifecycle()) {
            getLifecycle().mo4988d(m89946E());
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroyView() {
        if (getLogLifecycle()) {
            getLog().mo85219j("onDestroyView", new AbstractC30556a.a[0]);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStart() {
        super.onStart();
        InterfaceC31766c.m98635q(m89945D(), AbstractC2875y.m8299l(getLogTag(), "#onStart"), null, 2, null);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        if (getLogLifecycle()) {
            getLog().mo85219j("onViewCreated", new AbstractC30556a.a[0]);
        }
    }
}
