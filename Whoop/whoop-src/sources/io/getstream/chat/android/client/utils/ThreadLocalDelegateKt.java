package io.getstream.chat.android.client.utils;

import c93.InterfaceC4339a;
import f93.InterfaceC14291c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"", "T", "Lkotlin/Function0;", "value", "Lf93/c;", "threadLocal", "(Lc93/a;)Lf93/c;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ThreadLocalDelegateKt {
    public static final <T> InterfaceC14291c threadLocal(InterfaceC4339a value) {
        AbstractC22676k.m65750j(value, "value");
        return new ThreadLocalDelegate(value);
    }
}
