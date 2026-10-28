package com.whoop.p069ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1633v0;
import f93.InterfaceC14291c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import p088dc.AbstractC11895b;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39415s;

/* JADX INFO: renamed from: com.whoop.ui.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B+\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00042\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/ui/d;", "Landroid/view/View;", "T", "Lf93/c;", "Landroidx/fragment/app/m0;", "", "id", "fragment", "Lkotlin/Function1;", "Ll83/a0;", "cleanup", "<init>", "(ILandroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;)V", "", "property", "", "e", "(Ljava/lang/String;)Ljava/lang/Void;", "thisRef", "Lj93/z;", "f", "(Landroidx/fragment/app/m0;Lj93/z;)Landroid/view/View;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "I", "x", "Landroidx/fragment/app/m0;", "y", "Lkotlin/jvm/functions/Function1;", "z", "Landroid/view/View;", "_value", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10464d<T extends View> implements InterfaceC14291c {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final AbstractComponentCallbacksC1320m0 fragment;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final Function1 cleanup;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private T _value;

    /* JADX INFO: renamed from: com.whoop.ui.d$a */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006R\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"com/whoop/ui/d$a", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onCreate", "(Landroidx/lifecycle/g0;)V", "onDestroy", "Landroidx/lifecycle/v0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Landroidx/lifecycle/v0;", "getViewLifecycleOwnerLiveDataObserver", "()Landroidx/lifecycle/v0;", "viewLifecycleOwnerLiveDataObserver", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final InterfaceC1633v0 viewLifecycleOwnerLiveDataObserver;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C10464d<T> f31652x;

        /* JADX INFO: renamed from: com.whoop.ui.d$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"com/whoop/ui/d$a$a", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onDestroy", "(Landroidx/lifecycle/g0;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41426a implements DefaultLifecycleObserver {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C10464d<T> f31653w;

            public C41426a(C10464d<T> c10464d) {
                this.f31653w = c10464d;
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onCreate(InterfaceC1585g0 interfaceC1585g0) {
                super.onCreate(interfaceC1585g0);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(InterfaceC1585g0 owner) {
                AbstractC22676k.m65750j(owner, "owner");
                View view = ((C10464d) this.f31653w)._value;
                if (view != null) {
                    ((C10464d) this.f31653w).cleanup.invoke(view);
                }
                ((C10464d) this.f31653w)._value = null;
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
                super.onPause(interfaceC1585g0);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
                super.onResume(interfaceC1585g0);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onStart(InterfaceC1585g0 interfaceC1585g0) {
                super.onStart(interfaceC1585g0);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
                super.onStop(interfaceC1585g0);
            }
        }

        public a(C10464d<T> c10464d) {
            this.f31652x = c10464d;
            this.viewLifecycleOwnerLiveDataObserver = new C10460a(c10464d, 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final void m26735b(C10464d c10464d, InterfaceC1585g0 interfaceC1585g0) {
            if (interfaceC1585g0 == null) {
                return;
            }
            interfaceC1585g0.getLifecycle().mo4986a(new C41426a(c10464d));
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onCreate(InterfaceC1585g0 owner) {
            AbstractC22676k.m65750j(owner, "owner");
            ((C10464d) this.f31652x).fragment.getViewLifecycleOwnerLiveData().observeForever(this.viewLifecycleOwnerLiveDataObserver);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(InterfaceC1585g0 owner) {
            AbstractC22676k.m65750j(owner, "owner");
            ((C10464d) this.f31652x).fragment.getViewLifecycleOwnerLiveData().removeObserver(this.viewLifecycleOwnerLiveDataObserver);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
            super.onPause(interfaceC1585g0);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
            super.onResume(interfaceC1585g0);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onStart(InterfaceC1585g0 interfaceC1585g0) {
            super.onStart(interfaceC1585g0);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
            super.onStop(interfaceC1585g0);
        }
    }

    public C10464d(int i13, AbstractComponentCallbacksC1320m0 fragment, Function1 cleanup) {
        AbstractC22676k.m65750j(fragment, "fragment");
        AbstractC22676k.m65750j(cleanup, "cleanup");
        this.id = i13;
        this.fragment = fragment;
        this.cleanup = cleanup;
        fragment.getLifecycle().mo4986a(new a(this));
    }

    /* JADX INFO: renamed from: e */
    private final Void m26732e(String property) {
        throw new IllegalStateException(AbstractC39415s.m125909s("\n                AutoClearedView accessed " + property + " before this Fragment's View was\n                created or after this Fragment's onDestroyView callback was invoked.\n        "));
    }

    @Override // f93.InterfaceC14291c
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public T getValue(AbstractComponentCallbacksC1320m0 thisRef, InterfaceC21493z property) {
        String resourceName;
        Resources resources;
        AbstractC22676k.m65750j(thisRef, "thisRef");
        AbstractC22676k.m65750j(property, "property");
        T t14 = this._value;
        if (t14 != null) {
            return t14;
        }
        View view = thisRef.getView();
        if (view == null) {
            m26732e(property.getName());
            throw new KotlinNothingValueException();
        }
        T t15 = (T) view.findViewById(this.id);
        if (t15 != null) {
            this._value = t15;
            return t15;
        }
        Context context = this.fragment.getContext();
        if (context == null || (resources = context.getResources()) == null || (resourceName = resources.getResourceName(this.id)) == null) {
            resourceName = "unknown";
        }
        throw new IllegalArgumentException(AbstractC11895b.m31996o("AutoClearedView failed to find view with id ", resourceName, " in this Fragment's root view").toString());
    }
}
