package io.getstream.chat.android.core.internal.fsm.builder;

import c93.InterfaceC4351m;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@FSMBuilderMarker
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\t\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00028\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\u000b\u001a\u00020\n\"\n\b\u0003\u0010\u0007\u0018\u0001*\u00028\u00012\u001a\b\b\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00000\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000e\u001a\u00020\n2\u001a\b\u0004\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fJE\u0010\u0012\u001a8\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0010\u0012&\u0012$\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00110\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\b0\u0014H\u0001¢\u0006\u0004\b\u0015\u0010\u0016RV\u0010\u0018\u001a8\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0010\u0012&\u0012$\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00110\u00178\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001a\u0010\u0013R8\u0010\u001c\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\b0\u00148\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010\u0006\u001a\u0004\b\u001e\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, m65681d2 = {"Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;", "", "STATE", "EVENT", "S", "<init>", "()V", "E", "Lkotlin/Function2;", "func", "Ll83/a0;", "onEvent", "(Lc93/m;)V", "listener", "onEnter", "", "Lj93/d;", "Lio/getstream/chat/android/core/internal/fsm/builder/StateFunction;", "get", "()Ljava/util/Map;", "", "getEnterListeners", "()Ljava/util/List;", "", "eventHandlers", "Ljava/util/Map;", "getEventHandlers", "getEventHandlers$annotations", "onEnterListeners", "Ljava/util/List;", "getOnEnterListeners", "getOnEnterListeners$annotations", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StateHandlerBuilder<STATE, EVENT, S extends STATE> {
    private final Map<InterfaceC21461d, InterfaceC4351m> eventHandlers = new LinkedHashMap();
    private final List<InterfaceC4351m> onEnterListeners = new ArrayList();

    public static /* synthetic */ void getEventHandlers$annotations() {
    }

    public static /* synthetic */ void getOnEnterListeners$annotations() {
    }

    public final Map<InterfaceC21461d, InterfaceC4351m> get() {
        return this.eventHandlers;
    }

    public final List<InterfaceC4351m> getEnterListeners() {
        return this.onEnterListeners;
    }

    public final Map<InterfaceC21461d, InterfaceC4351m> getEventHandlers() {
        return this.eventHandlers;
    }

    public final List<InterfaceC4351m> getOnEnterListeners() {
        return this.onEnterListeners;
    }

    @FSMBuilderMarker
    public final void onEnter(final InterfaceC4351m listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.onEnterListeners.add(new InterfaceC4351m() { // from class: io.getstream.chat.android.core.internal.fsm.builder.StateHandlerBuilder.onEnter.1
            @Override // c93.InterfaceC4351m
            public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m134223invoke(obj, obj2);
                return C23454a0.f92919a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m134223invoke(STATE state, EVENT cause) {
                AbstractC22676k.m65750j(state, "state");
                AbstractC22676k.m65750j(cause, "cause");
                listener.invoke(state, cause);
            }
        });
    }

    @FSMBuilderMarker
    public final <E extends EVENT> void onEvent(InterfaceC4351m func) {
        AbstractC22676k.m65750j(func, "func");
        AbstractC22676k.m65756p();
        throw null;
    }
}
