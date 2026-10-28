package io.getstream.chat.android.core.internal.coroutines;

import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import bc3.AbstractC3076z;
import hc3.AbstractC17182o;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u0003R*\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;", "", "<init>", "()V", "Lbc3/z;", "mainDispatcher", "ioDispatcher", "Ll83/a0;", "set", "(Lbc3/z;Lbc3/z;)V", "reset", "value", "Main", "Lbc3/z;", "getMain", "()Lbc3/z;", "setMain$stream_chat_android_core", "(Lbc3/z;)V", "IO", "getIO", "setIO$stream_chat_android_core", "getImmediate", "Immediate", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DispatcherProvider {
    public static final DispatcherProvider INSTANCE = new DispatcherProvider();
    private static AbstractC3076z IO;
    private static AbstractC3076z Main;

    static {
        C22365e c22365e = AbstractC3050q0.f12077a;
        Main = AbstractC17182o.f65999a;
        IO = ExecutorC22364d.f87316w;
    }

    private DispatcherProvider() {
    }

    public final AbstractC3076z getIO() {
        return IO;
    }

    public final AbstractC3076z getImmediate() {
        AbstractC3076z abstractC3076z = Main;
        return abstractC3076z instanceof AbstractC3069w1 ? ((AbstractC3069w1) abstractC3076z).mo8825s() : abstractC3076z;
    }

    public final AbstractC3076z getMain() {
        return Main;
    }

    public final void reset() {
        C22365e c22365e = AbstractC3050q0.f12077a;
        Main = AbstractC17182o.f65999a;
        IO = ExecutorC22364d.f87316w;
    }

    public final void set(AbstractC3076z mainDispatcher, AbstractC3076z ioDispatcher) {
        AbstractC22676k.m65750j(mainDispatcher, "mainDispatcher");
        AbstractC22676k.m65750j(ioDispatcher, "ioDispatcher");
        Main = mainDispatcher;
        IO = ioDispatcher;
    }

    public final void setIO$stream_chat_android_core(AbstractC3076z abstractC3076z) {
        AbstractC22676k.m65750j(abstractC3076z, "<set-?>");
        IO = abstractC3076z;
    }

    public final void setMain$stream_chat_android_core(AbstractC3076z abstractC3076z) {
        AbstractC22676k.m65750j(abstractC3076z, "<set-?>");
        Main = abstractC3076z;
    }
}
