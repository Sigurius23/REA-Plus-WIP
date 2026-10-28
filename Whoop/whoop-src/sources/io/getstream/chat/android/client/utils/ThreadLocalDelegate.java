package io.getstream.chat.android.client.utils;

import c93.InterfaceC4339a;
import f93.InterfaceC14291c;
import j93.InterfaceC21493z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u000e\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000b\u001a\u00028\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/client/utils/ThreadLocalDelegate;", "", "T", "Lf93/c;", "Lkotlin/Function0;", "value", "<init>", "(Lc93/a;)V", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "Lc93/a;", "io/getstream/chat/android/client/utils/ThreadLocalDelegate$threadLocal$1", "threadLocal", "Lio/getstream/chat/android/client/utils/ThreadLocalDelegate$threadLocal$1;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ThreadLocalDelegate<T> implements InterfaceC14291c {
    private final ThreadLocalDelegate$threadLocal$1 threadLocal;
    private final InterfaceC4339a value;

    public ThreadLocalDelegate(InterfaceC4339a value) {
        AbstractC22676k.m65750j(value, "value");
        this.value = value;
        this.threadLocal = new ThreadLocal<T>(this) { // from class: io.getstream.chat.android.client.utils.ThreadLocalDelegate$threadLocal$1
            final /* synthetic */ ThreadLocalDelegate<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.ThreadLocal
            public final T initialValue() {
                return (T) ((ThreadLocalDelegate) this.this$0).value.invoke();
            }
        };
    }

    @Override // f93.InterfaceC14291c
    public final T getValue(Object thisRef, InterfaceC21493z property) {
        AbstractC22676k.m65750j(property, "property");
        T t14 = get();
        AbstractC22676k.m65747g(t14);
        return t14;
    }
}
