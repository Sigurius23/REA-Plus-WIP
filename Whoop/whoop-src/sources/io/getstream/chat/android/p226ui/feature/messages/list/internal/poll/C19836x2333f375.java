package io.getstream.chat.android.p226ui.feature.messages.list.internal.poll;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.Vote;
import java.util.Iterator;
import l83.C23454a0;
import o23.InterfaceC27474d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.internal.poll.AllPollOptionsDialogFragment$AllPollOptionsViewModel$onOptionClick$1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.list.internal.poll.AllPollOptionsDialogFragment$AllPollOptionsViewModel$onOptionClick$1", m100430f = "AllPollOptionsDialogFragment.kt", m100431l = {218}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class C19836x2333f375 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ Option $option;
    int label;
    final /* synthetic */ AllPollOptionsDialogFragment.AllPollOptionsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19836x2333f375(AllPollOptionsDialogFragment.AllPollOptionsViewModel allPollOptionsViewModel, Option option, InterfaceC30057d<? super C19836x2333f375> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = allPollOptionsViewModel;
        this.$option = option;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new C19836x2333f375(this.this$0, this.$option, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((C19836x2333f375) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object next;
        InterfaceC27474d interfaceC27474dCastPollVote;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            Poll poll = (Poll) this.this$0.getPollState().getValue();
            if (poll != null) {
                AllPollOptionsDialogFragment.AllPollOptionsViewModel allPollOptionsViewModel = this.this$0;
                Option option = this.$option;
                Iterator<T> it = poll.getOwnVotes().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!AbstractC22676k.m65745e(((Vote) next).getOptionId(), option.getId()));
                Vote vote = (Vote) next;
                if (vote == null || (interfaceC27474dCastPollVote = allPollOptionsViewModel.chatClient.removePollVote(allPollOptionsViewModel.messageId, poll.getId(), vote.getId())) == null) {
                    interfaceC27474dCastPollVote = allPollOptionsViewModel.chatClient.castPollVote(allPollOptionsViewModel.messageId, poll.getId(), option.getId());
                }
                if (interfaceC27474dCastPollVote != null) {
                    this.label = 1;
                    obj = interfaceC27474dCastPollVote.await(this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                }
            }
            return C23454a0.f92919a;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        return C23454a0.f92919a;
    }
}
