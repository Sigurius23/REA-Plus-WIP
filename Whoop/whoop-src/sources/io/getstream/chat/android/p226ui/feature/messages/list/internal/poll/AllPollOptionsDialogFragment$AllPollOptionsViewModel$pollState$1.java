package io.getstream.chat.android.p226ui.feature.messages.list.internal.poll;

import c93.InterfaceC4351m;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Poll;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.list.internal.poll.AllPollOptionsDialogFragment$AllPollOptionsViewModel$pollState$1", m100430f = "AllPollOptionsDialogFragment.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m65681d2 = {"<anonymous>", "Lio/getstream/chat/android/models/Poll;", "it", "", "Lio/getstream/chat/android/models/Message;"}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AllPollOptionsDialogFragment$AllPollOptionsViewModel$pollState$1 extends AbstractC32275i implements InterfaceC4351m {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AllPollOptionsDialogFragment.AllPollOptionsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllPollOptionsDialogFragment$AllPollOptionsViewModel$pollState$1(AllPollOptionsDialogFragment.AllPollOptionsViewModel allPollOptionsViewModel, InterfaceC30057d<? super AllPollOptionsDialogFragment$AllPollOptionsViewModel$pollState$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = allPollOptionsViewModel;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        AllPollOptionsDialogFragment$AllPollOptionsViewModel$pollState$1 allPollOptionsDialogFragment$AllPollOptionsViewModel$pollState$1 = new AllPollOptionsDialogFragment$AllPollOptionsViewModel$pollState$1(this.this$0, interfaceC30057d);
        allPollOptionsDialogFragment$AllPollOptionsViewModel$pollState$1.L$0 = obj;
        return allPollOptionsDialogFragment$AllPollOptionsViewModel$pollState$1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object next;
        List list = (List) this.L$0;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        AllPollOptionsDialogFragment.AllPollOptionsViewModel allPollOptionsViewModel = this.this$0;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((Message) next).getId(), allPollOptionsViewModel.messageId));
        Message message = (Message) next;
        if (message != null) {
            return message.getPoll();
        }
        return null;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(List<Message> list, InterfaceC30057d<? super Poll> interfaceC30057d) {
        return ((AllPollOptionsDialogFragment$AllPollOptionsViewModel$pollState$1) create(list, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }
}
