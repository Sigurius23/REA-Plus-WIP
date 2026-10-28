package io.getstream.chat.android.core.internal.lazy;

import c93.InterfaceC4351m;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"T", "R", "Lkotlin/Function2;", "Lq83/d;", "", "initializer", "Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;", "parameterizedLazy", "(Lc93/m;)Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;", "stream-chat-android-core"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ParameterizedLazyKt {
    @InternalStreamChatApi
    public static final <T, R> ParameterizedLazy<T, R> parameterizedLazy(InterfaceC4351m initializer) {
        AbstractC22676k.m65750j(initializer, "initializer");
        return new ParameterizedLazy<>(initializer);
    }
}
