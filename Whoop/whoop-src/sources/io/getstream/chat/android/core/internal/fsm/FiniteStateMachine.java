package io.getstream.chat.android.core.internal.fsm;

import androidx.core.app.NotificationCompat;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.core.internal.fsm.builder.FSMBuilder;
import io.getstream.chat.android.core.internal.fsm.builder.FSMBuilderMarker;
import j93.InterfaceC21461d;
import java.util.Map;
import l83.C23454a0;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes5.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \"*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001\"B{\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012P\u0010\t\u001aL\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\u0012:\u00128\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0006\u0012&\u0012$\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\b0\u00050\u0005\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0001H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012R^\u0010\t\u001aL\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\u0012:\u00128\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0006\u0012&\u0012$\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\b0\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010!\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b \u0010\u0012¨\u0006#"}, m65681d2 = {"Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;", "", "S", "E", "initialState", "", "Lj93/d;", "Lkotlin/Function2;", "Lio/getstream/chat/android/core/internal/fsm/builder/StateFunction;", "stateFunctions", "defaultEventHandler", "<init>", "(Ljava/lang/Object;Ljava/util/Map;Lc93/m;)V", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "sendEvent", "(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;", "stay", "()Ljava/lang/Object;", "Ljava/util/Map;", "Lc93/m;", "Lmc3/a;", "mutex", "Lmc3/a;", "Lec3/p1;", "_state", "Lec3/p1;", "Lec3/f2;", "stateFlow", "Lec3/f2;", "getStateFlow", "()Lec3/f2;", "getState", "state", "Companion", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class FiniteStateMachine<S, E> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final InterfaceC13075p1 _state;
    private final InterfaceC4351m defaultEventHandler;
    private final InterfaceC25435a mutex;
    private final InterfaceC13037f2 stateFlow;
    private final Map<InterfaceC21461d, Map<InterfaceC21461d, InterfaceC4351m>> stateFunctions;

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JP\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n\"\b\b\u0002\u0010\u0004*\u00020\u0001\"\b\b\u0003\u0010\u0005*\u00020\u00012\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0087\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$Companion;", "", "<init>", "()V", "S", "E", "Lkotlin/Function1;", "Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;", "Ll83/a0;", "builder", "Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;", "invoke", "(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @FSMBuilderMarker
        public final <S, E> FiniteStateMachine<S, E> invoke(Function1 builder) {
            AbstractC22676k.m65750j(builder, "builder");
            FSMBuilder fSMBuilder = new FSMBuilder();
            builder.invoke(fSMBuilder);
            return fSMBuilder.build$stream_chat_android_core();
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.core.internal.fsm.FiniteStateMachine$sendEvent$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.core.internal.fsm.FiniteStateMachine", m100430f = "FiniteStateMachine.kt", m100431l = {94}, m100432m = "sendEvent")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194601 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FiniteStateMachine<S, E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194601(FiniteStateMachine<S, E> finiteStateMachine, InterfaceC30057d<? super C194601> interfaceC30057d) {
            super(interfaceC30057d);
            this.this$0 = finiteStateMachine;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.sendEvent(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FiniteStateMachine(S initialState, Map<InterfaceC21461d, ? extends Map<InterfaceC21461d, ? extends InterfaceC4351m>> stateFunctions, InterfaceC4351m defaultEventHandler) {
        AbstractC22676k.m65750j(initialState, "initialState");
        AbstractC22676k.m65750j(stateFunctions, "stateFunctions");
        AbstractC22676k.m65750j(defaultEventHandler, "defaultEventHandler");
        this.stateFunctions = stateFunctions;
        this.defaultEventHandler = defaultEventHandler;
        this.mutex = AbstractC25438d.m74669a();
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(initialState);
        this._state = c13045h2M36593c;
        this.stateFlow = c13045h2M36593c;
    }

    public final S getState() {
        return (S) ((C13045h2) this._state).getValue();
    }

    public final InterfaceC13037f2 getStateFlow() {
        return this.stateFlow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object sendEvent(E e5, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C194601 c194601;
        InterfaceC25435a interfaceC25435a;
        InterfaceC4351m interfaceC4351m;
        if (interfaceC30057d instanceof C194601) {
            c194601 = (C194601) interfaceC30057d;
            int i13 = c194601.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c194601.label = i13 - Integer.MIN_VALUE;
            } else {
                c194601 = new C194601(this, interfaceC30057d);
            }
        } else {
            c194601 = new C194601(this, interfaceC30057d);
        }
        Object obj = c194601.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c194601.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.mutex;
            c194601.L$0 = e5;
            c194601.L$1 = interfaceC25435a;
            c194601.I$0 = 0;
            c194601.label = 1;
            if (interfaceC25435a.mo68211b(c194601) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) c194601.L$1;
            Object obj2 = c194601.L$0;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            e5 = (E) obj2;
        }
        try {
            Object value = ((C13045h2) this._state).getValue();
            Map<InterfaceC21461d, Map<InterfaceC21461d, InterfaceC4351m>> map = this.stateFunctions;
            Class<?> cls = value.getClass();
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            Map<InterfaceC21461d, InterfaceC4351m> map2 = map.get(c22673i0.getOrCreateKotlinClass(cls));
            if (map2 == null || (interfaceC4351m = map2.get(c22673i0.getOrCreateKotlinClass(e5.getClass()))) == null) {
                interfaceC4351m = this.defaultEventHandler;
            }
            ((C13045h2) this._state).m36570j(interfaceC4351m.invoke(value, e5));
            return C23454a0.f92919a;
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    public final S stay() {
        return getState();
    }
}
