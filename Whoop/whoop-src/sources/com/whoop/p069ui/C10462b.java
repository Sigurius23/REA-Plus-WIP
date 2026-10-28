package com.whoop.p069ui;

import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1633v0;
import f93.InterfaceC14292d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39415s;

/* JADX INFO: renamed from: com.whoop.ui.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00042\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/ui/b;", "", "T", "Lf93/d;", "Landroidx/fragment/app/m0;", "fragment", "Lkotlin/Function1;", "Ll83/a0;", "cleanup", "<init>", "(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;)V", "thisRef", "Lj93/z;", "property", "e", "(Landroidx/fragment/app/m0;Lj93/z;)Ljava/lang/Object;", "value", "f", "(Landroidx/fragment/app/m0;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Landroidx/fragment/app/m0;", "x", "Lkotlin/jvm/functions/Function1;", "y", "Ljava/lang/Object;", "_value", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10462b<T> implements InterfaceC14292d {

    /* JADX INFO: renamed from: z */
    public static final int f31640z = 8;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final AbstractComponentCallbacksC1320m0 fragment;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final Function1 cleanup;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private T _value;

    /* JADX INFO: renamed from: com.whoop.ui.b$a */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006R\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"com/whoop/ui/b$a", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onCreate", "(Landroidx/lifecycle/g0;)V", "onDestroy", "Landroidx/lifecycle/v0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Landroidx/lifecycle/v0;", "getViewLifecycleOwnerLiveDataObserver", "()Landroidx/lifecycle/v0;", "viewLifecycleOwnerLiveDataObserver", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final InterfaceC1633v0 viewLifecycleOwnerLiveDataObserver;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C10462b<T> f31645x;

        /* JADX INFO: renamed from: com.whoop.ui.b$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"com/whoop/ui/b$a$a", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onDestroy", "(Landroidx/lifecycle/g0;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41425a implements DefaultLifecycleObserver {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C10462b<T> f31646w;

            public C41425a(C10462b<T> c10462b) {
                this.f31646w = c10462b;
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onCreate(InterfaceC1585g0 interfaceC1585g0) {
                super.onCreate(interfaceC1585g0);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(InterfaceC1585g0 owner) {
                AbstractC22676k.m65750j(owner, "owner");
                Object obj = ((C10462b) this.f31646w)._value;
                if (obj != null) {
                    ((C10462b) this.f31646w).cleanup.invoke(obj);
                }
                ((C10462b) this.f31646w)._value = null;
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

        public a(C10462b<T> c10462b) {
            this.f31645x = c10462b;
            this.viewLifecycleOwnerLiveDataObserver = new C10460a(c10462b, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final void m26723b(C10462b c10462b, InterfaceC1585g0 interfaceC1585g0) {
            if (interfaceC1585g0 == null) {
                return;
            }
            interfaceC1585g0.getLifecycle().mo4986a(new C41425a(c10462b));
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onCreate(InterfaceC1585g0 owner) {
            AbstractC22676k.m65750j(owner, "owner");
            ((C10462b) this.f31645x).fragment.getViewLifecycleOwnerLiveData().observeForever(this.viewLifecycleOwnerLiveDataObserver);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(InterfaceC1585g0 owner) {
            AbstractC22676k.m65750j(owner, "owner");
            ((C10462b) this.f31645x).fragment.getViewLifecycleOwnerLiveData().removeObserver(this.viewLifecycleOwnerLiveDataObserver);
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

    public C10462b(AbstractComponentCallbacksC1320m0 fragment, Function1 cleanup) {
        AbstractC22676k.m65750j(fragment, "fragment");
        AbstractC22676k.m65750j(cleanup, "cleanup");
        this.fragment = fragment;
        this.cleanup = cleanup;
        fragment.getLifecycle().mo4986a(new a(this));
    }

    @Override // f93.InterfaceC14291c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public T getValue(AbstractComponentCallbacksC1320m0 thisRef, InterfaceC21493z property) {
        AbstractC22676k.m65750j(thisRef, "thisRef");
        AbstractC22676k.m65750j(property, "property");
        T t14 = this._value;
        if (t14 != null) {
            return t14;
        }
        throw new IllegalStateException(AbstractC39415s.m125909s("\n                AutoClearedValue accessed " + property.getName() + " before it was initialized, after it was set to null, or after\n                this Fragment's onDestroyView callback was invoked.\n        "));
    }

    @Override // f93.InterfaceC14292d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void setValue(AbstractComponentCallbacksC1320m0 thisRef, InterfaceC21493z property, T value) {
        AbstractC22676k.m65750j(thisRef, "thisRef");
        AbstractC22676k.m65750j(property, "property");
        AbstractC22676k.m65750j(value, "value");
        this._value = value;
    }
}
