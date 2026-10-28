package io.getstream.chat.android.core.internal.concurrency;

import c93.InterfaceC4339a;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00028\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00002\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/core/internal/concurrency/SynchronizedReference;", "", "T", "value", "<init>", "(Ljava/lang/Object;)V", "get", "()Ljava/lang/Object;", "Lkotlin/Function0;", "builder", "getOrCreate", "(Lc93/a;)Ljava/lang/Object;", "", "reset", "()Z", "set", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/Object;", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SynchronizedReference<T> {
    private volatile T value;

    /* JADX WARN: Illegal instructions before constructor call */
    public SynchronizedReference() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(defaultConstructorMarker, 1, defaultConstructorMarker);
    }

    public final T get() {
        return this.value;
    }

    public final T getOrCreate(InterfaceC4339a builder) {
        T t14;
        AbstractC22676k.m65750j(builder, "builder");
        T t15 = this.value;
        if (t15 != null) {
            return t15;
        }
        synchronized (this) {
            t14 = this.value;
            if (t14 == null) {
                t14 = (T) builder.invoke();
                this.value = t14;
            }
        }
        return t14;
    }

    public final boolean reset() {
        return set(null) != null;
    }

    public final T set(T value) {
        T t14;
        synchronized (this) {
            t14 = this.value;
            this.value = value;
        }
        return t14;
    }

    public SynchronizedReference(T t14) {
        this.value = t14;
    }

    public /* synthetic */ SynchronizedReference(Object obj, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : obj);
    }
}
