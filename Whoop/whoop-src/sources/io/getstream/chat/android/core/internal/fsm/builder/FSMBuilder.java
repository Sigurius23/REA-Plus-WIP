package io.getstream.chat.android.core.internal.fsm.builder;

import c93.InterfaceC4351m;
import in0.C18719a;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.core.internal.fsm.FiniteStateMachine;
import j93.InterfaceC21461d;
import java.util.LinkedHashMap;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@FSMBuilderMarker
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000b\u001a\u00020\u00072\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJE\u0010\u0006\u001a\u00020\u0007\"\n\b\u0002\u0010\r\u0018\u0001*\u00028\u00002$\u0010\u0010\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0011J\u001b\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017Ra\u0010\u001c\u001aL\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0019\u0012:\u00128\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0019\u0012&\u0012$\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\nj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u001b0\u001a0\u00188\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR(\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, m65681d2 = {"Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;", "", "STATE", "EVENT", "<init>", "()V", "state", "Ll83/a0;", "initialState", "(Ljava/lang/Object;)V", "Lkotlin/Function2;", "defaultHandler", "(Lc93/m;)V", "S", "Lkotlin/Function1;", "Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;", "stateHandlerBuilder", "(Lkotlin/jvm/functions/Function1;)V", "Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;", "build$stream_chat_android_core", "()Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;", "build", "_initialState", "Ljava/lang/Object;", "", "Lj93/d;", "", "Lio/getstream/chat/android/core/internal/fsm/builder/StateFunction;", "stateFunctions", "Ljava/util/Map;", "getStateFunctions", "()Ljava/util/Map;", "_defaultHandler", "Lc93/m;", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class FSMBuilder<STATE, EVENT> {
    private STATE _initialState;
    private final Map<InterfaceC21461d, Map<InterfaceC21461d, InterfaceC4351m>> stateFunctions = new LinkedHashMap();
    private InterfaceC4351m _defaultHandler = new C18719a(8);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _defaultHandler$lambda$0(Object s13, Object obj) {
        AbstractC22676k.m65750j(s13, "s");
        AbstractC22676k.m65750j(obj, "<unused var>");
        return s13;
    }

    public final FiniteStateMachine<STATE, EVENT> build$stream_chat_android_core() {
        STATE state = this._initialState;
        if (state != null) {
            return new FiniteStateMachine<>(state, this.stateFunctions, this._defaultHandler);
        }
        throw new IllegalStateException("Initial state must be set!");
    }

    @FSMBuilderMarker
    public final void defaultHandler(InterfaceC4351m defaultHandler) {
        AbstractC22676k.m65750j(defaultHandler, "defaultHandler");
        this._defaultHandler = defaultHandler;
    }

    public final Map<InterfaceC21461d, Map<InterfaceC21461d, InterfaceC4351m>> getStateFunctions() {
        return this.stateFunctions;
    }

    @FSMBuilderMarker
    public final void initialState(STATE state) {
        AbstractC22676k.m65750j(state, "state");
        this._initialState = state;
    }

    @FSMBuilderMarker
    public final <S extends STATE> void state(Function1 stateHandlerBuilder) {
        AbstractC22676k.m65750j(stateHandlerBuilder, "stateHandlerBuilder");
        AbstractC22676k.m65756p();
        throw null;
    }
}
