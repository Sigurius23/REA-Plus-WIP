package io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal;

import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.events.TypingStartEvent;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\nHÂ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJN\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0012J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;", "", "Lbc3/c0;", "coroutineScope", "Lio/getstream/chat/android/client/events/TypingStartEvent;", "typingStartEvent", "", "userId", "", "delayTimeMs", "Lkotlin/Function1;", "Ll83/a0;", "removeTypingEvent", "<init>", "(Lbc3/c0;Lio/getstream/chat/android/client/events/TypingStartEvent;Ljava/lang/String;JLkotlin/jvm/functions/Function1;)V", "component1", "()Lbc3/c0;", "component3", "()Ljava/lang/String;", "component4", "()J", "component5", "()Lkotlin/jvm/functions/Function1;", "cancelJob", "()V", "component2$stream_chat_android_client_release", "()Lio/getstream/chat/android/client/events/TypingStartEvent;", "component2", "copy", "(Lbc3/c0;Lio/getstream/chat/android/client/events/TypingStartEvent;Ljava/lang/String;JLkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TimedTypingStartEvent;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbc3/c0;", "Lio/getstream/chat/android/client/events/TypingStartEvent;", "getTypingStartEvent$stream_chat_android_client_release", "Ljava/lang/String;", "J", "Lkotlin/jvm/functions/Function1;", "Lbc3/k1;", "job", "Lbc3/k1;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class TimedTypingStartEvent {
    private final InterfaceC2994c0 coroutineScope;
    private final long delayTimeMs;
    private InterfaceC3027k1 job;
    private final Function1 removeTypingEvent;
    private final TypingStartEvent typingStartEvent;
    private final String userId;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.TimedTypingStartEvent$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.TimedTypingStartEvent$1", m100430f = "TypingEventPruner.kt", m100431l = {197}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C193011 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C193011(InterfaceC30057d<? super C193011> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return TimedTypingStartEvent.this.new C193011(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C193011) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                long j7 = TimedTypingStartEvent.this.delayTimeMs;
                this.label = 1;
                if (AbstractC3034m0.m8782b(j7, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            TimedTypingStartEvent.this.removeTypingEvent.invoke(TimedTypingStartEvent.this.userId);
            return C23454a0.f92919a;
        }
    }

    public TimedTypingStartEvent(InterfaceC2994c0 coroutineScope, TypingStartEvent typingStartEvent, String userId, long j7, Function1 removeTypingEvent) {
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(typingStartEvent, "typingStartEvent");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(removeTypingEvent, "removeTypingEvent");
        this.coroutineScope = coroutineScope;
        this.typingStartEvent = typingStartEvent;
        this.userId = userId;
        this.delayTimeMs = j7;
        this.removeTypingEvent = removeTypingEvent;
        this.job = AbstractC3006f0.m8732z(coroutineScope, null, null, new C193011(null), 3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final InterfaceC2994c0 getCoroutineScope() {
        return this.coroutineScope;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final long getDelayTimeMs() {
        return this.delayTimeMs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final Function1 getRemoveTypingEvent() {
        return this.removeTypingEvent;
    }

    public static /* synthetic */ TimedTypingStartEvent copy$default(TimedTypingStartEvent timedTypingStartEvent, InterfaceC2994c0 interfaceC2994c0, TypingStartEvent typingStartEvent, String str, long j7, Function1 function1, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC2994c0 = timedTypingStartEvent.coroutineScope;
        }
        if ((i13 & 2) != 0) {
            typingStartEvent = timedTypingStartEvent.typingStartEvent;
        }
        if ((i13 & 4) != 0) {
            str = timedTypingStartEvent.userId;
        }
        if ((i13 & 8) != 0) {
            j7 = timedTypingStartEvent.delayTimeMs;
        }
        if ((i13 & 16) != 0) {
            function1 = timedTypingStartEvent.removeTypingEvent;
        }
        Function1 function2 = function1;
        String str2 = str;
        return timedTypingStartEvent.copy(interfaceC2994c0, typingStartEvent, str2, j7, function2);
    }

    public final void cancelJob() {
        InterfaceC3027k1 interfaceC3027k1 = this.job;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
    }

    /* JADX INFO: renamed from: component2$stream_chat_android_client_release, reason: from getter */
    public final TypingStartEvent getTypingStartEvent() {
        return this.typingStartEvent;
    }

    public final TimedTypingStartEvent copy(InterfaceC2994c0 coroutineScope, TypingStartEvent typingStartEvent, String userId, long delayTimeMs, Function1 removeTypingEvent) {
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(typingStartEvent, "typingStartEvent");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(removeTypingEvent, "removeTypingEvent");
        return new TimedTypingStartEvent(coroutineScope, typingStartEvent, userId, delayTimeMs, removeTypingEvent);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimedTypingStartEvent)) {
            return false;
        }
        TimedTypingStartEvent timedTypingStartEvent = (TimedTypingStartEvent) other;
        return AbstractC22676k.m65745e(this.coroutineScope, timedTypingStartEvent.coroutineScope) && AbstractC22676k.m65745e(this.typingStartEvent, timedTypingStartEvent.typingStartEvent) && AbstractC22676k.m65745e(this.userId, timedTypingStartEvent.userId) && this.delayTimeMs == timedTypingStartEvent.delayTimeMs && AbstractC22676k.m65745e(this.removeTypingEvent, timedTypingStartEvent.removeTypingEvent);
    }

    public final TypingStartEvent getTypingStartEvent$stream_chat_android_client_release() {
        return this.typingStartEvent;
    }

    public final int hashCode() {
        return this.removeTypingEvent.hashCode() + AbstractC11266d.m30451e(AbstractC11266d.m30450d((this.typingStartEvent.hashCode() + (this.coroutineScope.hashCode() * 31)) * 31, 31, this.userId), this.delayTimeMs, 31);
    }

    public final String toString() {
        return "TimedTypingStartEvent(coroutineScope=" + this.coroutineScope + ", typingStartEvent=" + this.typingStartEvent + ", userId=" + this.userId + ", delayTimeMs=" + this.delayTimeMs + ", removeTypingEvent=" + this.removeTypingEvent + ")";
    }
}
