package io.getstream.chat.android.p226ui.common.utils.typing.internal;

import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import io.getstream.chat.android.p226ui.common.utils.typing.TypingUpdatesBuffer;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R$\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, m65681d2 = {"Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;", "Lio/getstream/chat/android/ui/common/utils/typing/TypingUpdatesBuffer;", "Lbc3/c0;", "coroutineScope", "Lkotlin/Function0;", "Ll83/a0;", "onTypingStarted", "onTypingStopped", "<init>", "(Lbc3/c0;Lc93/a;Lc93/a;)V", "startTypingTimer", "(Lq83/d;)Ljava/lang/Object;", "handleTypingEvent", "()V", "", "inputText", "onKeystroke", "(Ljava/lang/String;)V", "clear", "Lbc3/c0;", "Lc93/a;", "Lbc3/k1;", "isTypingTimerJob", "Lbc3/k1;", "sendUpdatesJob", "", "value", "isTyping", "Z", "setTyping", "(Z)V", "Companion", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DefaultTypingUpdatesBuffer implements TypingUpdatesBuffer {
    public static final int $stable = 8;
    private static final Companion Companion = new Companion();
    private static final long DEFAULT_BUFFER_TYPING_UPDATES_INTERVAL = 1000;
    private static final long DEFAULT_SEND_TYPING_UPDATES_INTERVAL = 3000;
    private final InterfaceC2994c0 coroutineScope;
    private boolean isTyping;
    private InterfaceC3027k1 isTypingTimerJob;
    private final InterfaceC4339a onTypingStarted;
    private final InterfaceC4339a onTypingStopped;
    private InterfaceC3027k1 sendUpdatesJob;

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer$Companion;", "", "<init>", "()V", "DEFAULT_SEND_TYPING_UPDATES_INTERVAL", "", "DEFAULT_BUFFER_TYPING_UPDATES_INTERVAL", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.utils.typing.internal.DefaultTypingUpdatesBuffer$handleTypingEvent$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.utils.typing.internal.DefaultTypingUpdatesBuffer$handleTypingEvent$1", m100430f = "DefaultTypingUpdatesBuffer.kt", m100431l = {129}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C196171 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C196171(InterfaceC30057d<? super C196171> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return DefaultTypingUpdatesBuffer.this.new C196171(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C196171) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0 && i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            while (DefaultTypingUpdatesBuffer.this.isTyping) {
                DefaultTypingUpdatesBuffer.this.onTypingStarted.invoke();
                this.label = 1;
                if (AbstractC3034m0.m8782b(3000L, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            DefaultTypingUpdatesBuffer.this.onTypingStopped.invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.utils.typing.internal.DefaultTypingUpdatesBuffer$onKeystroke$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.utils.typing.internal.DefaultTypingUpdatesBuffer$onKeystroke$1", m100430f = "DefaultTypingUpdatesBuffer.kt", m100431l = {101}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C196181 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C196181(InterfaceC30057d<? super C196181> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return DefaultTypingUpdatesBuffer.this.new C196181(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C196181) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                DefaultTypingUpdatesBuffer defaultTypingUpdatesBuffer = DefaultTypingUpdatesBuffer.this;
                this.label = 1;
                if (defaultTypingUpdatesBuffer.startTypingTimer(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.utils.typing.internal.DefaultTypingUpdatesBuffer$startTypingTimer$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.utils.typing.internal.DefaultTypingUpdatesBuffer", m100430f = "DefaultTypingUpdatesBuffer.kt", m100431l = {78}, m100432m = "startTypingTimer")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C196191 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C196191(InterfaceC30057d<? super C196191> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultTypingUpdatesBuffer.this.startTypingTimer(this);
        }
    }

    public DefaultTypingUpdatesBuffer(InterfaceC2994c0 coroutineScope, InterfaceC4339a onTypingStarted, InterfaceC4339a onTypingStopped) {
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(onTypingStarted, "onTypingStarted");
        AbstractC22676k.m65750j(onTypingStopped, "onTypingStopped");
        this.coroutineScope = coroutineScope;
        this.onTypingStarted = onTypingStarted;
        this.onTypingStopped = onTypingStopped;
    }

    private final void handleTypingEvent() {
        InterfaceC3027k1 interfaceC3027k1 = this.sendUpdatesJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.sendUpdatesJob = AbstractC3006f0.m8732z(this.coroutineScope, null, null, new C196171(null), 3);
    }

    private final void setTyping(boolean z4) {
        this.isTyping = z4;
        if (z4) {
            handleTypingEvent();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object startTypingTimer(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C196191 c196191;
        if (interfaceC30057d instanceof C196191) {
            c196191 = (C196191) interfaceC30057d;
            int i13 = c196191.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c196191.label = i13 - Integer.MIN_VALUE;
            } else {
                c196191 = new C196191(interfaceC30057d);
            }
        } else {
            c196191 = new C196191(interfaceC30057d);
        }
        Object obj = c196191.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c196191.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c196191.label = 1;
            if (AbstractC3034m0.m8782b(1000L, c196191) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        this.isTyping = false;
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.p226ui.common.utils.typing.TypingUpdatesBuffer
    public final void clear() {
        AbstractC3006f0.m8718l(this.coroutineScope.getCoroutineContext());
        if (this.isTyping) {
            this.isTyping = false;
        }
        this.onTypingStopped.invoke();
    }

    @Override // io.getstream.chat.android.p226ui.common.utils.typing.TypingUpdatesBuffer
    public final void onKeystroke(String inputText) {
        AbstractC22676k.m65750j(inputText, "inputText");
        InterfaceC3027k1 interfaceC3027k1 = this.isTypingTimerJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        boolean z4 = inputText.length() == 0;
        if (z4) {
            this.isTyping = false;
            this.onTypingStopped.invoke();
        } else {
            if (z4) {
                throw new NoWhenBranchMatchedException();
            }
            if (!this.isTyping) {
                setTyping(true);
            }
            this.isTypingTimerJob = AbstractC3006f0.m8732z(this.coroutineScope, null, null, new C196181(null), 3);
        }
    }

    public /* synthetic */ DefaultTypingUpdatesBuffer(InterfaceC2994c0 interfaceC2994c0, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC3006f0.m8708b(DispatcherProvider.INSTANCE.getIO()) : interfaceC2994c0, interfaceC4339a, interfaceC4339a2);
    }
}
