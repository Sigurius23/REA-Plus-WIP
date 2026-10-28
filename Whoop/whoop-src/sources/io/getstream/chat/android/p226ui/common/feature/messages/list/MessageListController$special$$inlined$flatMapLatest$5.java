package io.getstream.chat.android.p226ui.common.feature.messages.list;

import ec3.AbstractC13091v;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.p226ui.common.state.messages.MessageMode;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$special$$inlined$flatMapLatest$5", m100430f = "MessageListController.kt", m100431l = {189}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class MessageListController$special$$inlined$flatMapLatest$5 extends AbstractC32275i implements Function3 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ MessageListController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListController$special$$inlined$flatMapLatest$5(InterfaceC30057d interfaceC30057d, MessageListController messageListController) {
        super(3, interfaceC30057d);
        this.this$0 = messageListController;
    }

    public final Object invoke(InterfaceC13062m interfaceC13062m, MessageMode messageMode, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        MessageListController$special$$inlined$flatMapLatest$5 messageListController$special$$inlined$flatMapLatest$5 = new MessageListController$special$$inlined$flatMapLatest$5(interfaceC30057d, this.this$0);
        messageListController$special$$inlined$flatMapLatest$5.L$0 = interfaceC13062m;
        messageListController$special$$inlined$flatMapLatest$5.L$1 = messageMode;
        return messageListController$special$$inlined$flatMapLatest$5.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
            InterfaceC13075p1 interfaceC13075p1 = ((MessageMode) this.L$1) instanceof MessageMode.MessageThread ? this.this$0._threadListState : this.this$0._messageListState;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13075p1, this) == enumC31071a) {
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

    @Override // p715kotlin.jvm.functions.Function3
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC13062m) obj, (MessageMode) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
    }
}
