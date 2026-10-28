package androidx.lifecycle;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m65681d2 = {"Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onCreate", "(Landroidx/lifecycle/g0;)V", "onStart", "onResume", "onPause", "onStop", "onDestroy", "lifecycle-common"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface DefaultLifecycleObserver extends InterfaceC1581f0 {
    default void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
    }

    default void onDestroy(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
    }

    default void onPause(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
    }

    default void onResume(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
    }

    default void onStart(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
    }

    default void onStop(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
    }
}
