package io.getstream.chat.android.p226ui.viewmodel.messages;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.p226ui.common.state.messages.composer.MessageComposerState;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerView;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22656a;
import p715kotlin.jvm.internal.InterfaceC22666f;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.viewmodel.messages.MessageComposerViewModelBinding$bindView$3", m100430f = "MessageComposerViewModelBinding.kt", m100431l = {136}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class MessageComposerViewModelBinding$bindView$3 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ MessageComposerViewModel $this_bindView;
    final /* synthetic */ MessageComposerView $view;
    int label;

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.MessageComposerViewModelBinding$bindView$3$1 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C199251 implements InterfaceC13062m, InterfaceC22666f {
        final /* synthetic */ MessageComposerView $tmp0;

        public C199251(MessageComposerView messageComposerView) {
            this.$tmp0 = messageComposerView;
        }

        public final Object emit(MessageComposerState messageComposerState, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            MessageComposerViewModelBinding$bindView$3.access$invokeSuspend$renderState(this.$tmp0, messageComposerState, interfaceC30057d);
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            return C23454a0.f92919a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC13062m) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return new C22656a(2, 4, MessageComposerView.class, this.$tmp0, "renderState", "renderState(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V");
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // ec3.InterfaceC13062m
        public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
            return emit((MessageComposerState) obj, (InterfaceC30057d<? super C23454a0>) interfaceC30057d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageComposerViewModelBinding$bindView$3(MessageComposerViewModel messageComposerViewModel, MessageComposerView messageComposerView, InterfaceC30057d<? super MessageComposerViewModelBinding$bindView$3> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$this_bindView = messageComposerViewModel;
        this.$view = messageComposerView;
    }

    public static final /* synthetic */ Object access$invokeSuspend$renderState(MessageComposerView messageComposerView, MessageComposerState messageComposerState, InterfaceC30057d interfaceC30057d) {
        invokeSuspend$renderState(messageComposerView, messageComposerState, interfaceC30057d);
        return C23454a0.f92919a;
    }

    private static final /* synthetic */ Object invokeSuspend$renderState(MessageComposerView messageComposerView, MessageComposerState messageComposerState, InterfaceC30057d interfaceC30057d) {
        messageComposerView.renderState(messageComposerState);
        return C23454a0.f92919a;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new MessageComposerViewModelBinding$bindView$3(this.$this_bindView, this.$view, interfaceC30057d);
    }

    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        ((MessageComposerViewModelBinding$bindView$3) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        return EnumC31071a.f128113w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC13037f2 messageComposerState = this.$this_bindView.getMessageComposerState();
            C199251 c199251 = new C199251(this.$view);
            this.label = 1;
            if (messageComposerState.collect(c199251, this) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // c93.InterfaceC4351m
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2994c0) obj, (InterfaceC30057d<? super C23454a0>) obj2);
        return EnumC31071a.f128113w;
    }
}
