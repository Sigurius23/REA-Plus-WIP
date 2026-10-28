package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.poll;

import c93.InterfaceC4353o;
import io.getstream.chat.android.models.CreatePollParams;
import io.getstream.chat.android.models.PollOption;
import io.getstream.chat.android.models.VotingVisibility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollViewModel$createPollParams$2$1", m100430f = "CreatePollViewModel.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\n"}, m65681d2 = {"<anonymous>", "Lio/getstream/chat/android/models/CreatePollParams;", "title", "", "options", "", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;", "allowMultipleVotes", "", "maxAnswers", ""}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CreatePollViewModel$createPollParams$2$1 extends AbstractC32275i implements InterfaceC4353o {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ CreatePollViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePollViewModel$createPollParams$2$1(CreatePollViewModel createPollViewModel, InterfaceC30057d<? super CreatePollViewModel$createPollParams$2$1> interfaceC30057d) {
        super(5, interfaceC30057d);
        this.this$0 = createPollViewModel;
    }

    @Override // c93.InterfaceC4353o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return invoke((String) obj, (List<PollAnswer>) obj2, ((Boolean) obj3).booleanValue(), (Integer) obj4, (InterfaceC30057d<? super CreatePollParams>) obj5);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        List list = (List) this.L$1;
        boolean z4 = this.Z$0;
        Integer num = (Integer) this.L$2;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        List list2 = list;
        Integer num2 = num;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new PollOption(((PollAnswer) it.next()).getText(), null, 2, null));
        }
        VotingVisibility votingVisibility = this.this$0.annonymousPoll ? VotingVisibility.ANONYMOUS : VotingVisibility.PUBLIC;
        boolean z13 = this.this$0.suggestAnOption;
        boolean z14 = this.this$0.allowAnswers;
        if (!z4) {
            num2 = null;
        }
        return new CreatePollParams(str, arrayList, null, votingVisibility, !z4, new Integer(num2 != null ? num2.intValue() : 1), z13, z14, null, 260, null);
    }

    public final Object invoke(String str, List<PollAnswer> list, boolean z4, Integer num, InterfaceC30057d<? super CreatePollParams> interfaceC30057d) {
        CreatePollViewModel$createPollParams$2$1 createPollViewModel$createPollParams$2$1 = new CreatePollViewModel$createPollParams$2$1(this.this$0, interfaceC30057d);
        createPollViewModel$createPollParams$2$1.L$0 = str;
        createPollViewModel$createPollParams$2$1.L$1 = list;
        createPollViewModel$createPollParams$2$1.Z$0 = z4;
        createPollViewModel$createPollParams$2$1.L$2 = num;
        return createPollViewModel$createPollParams$2$1.invokeSuspend(C23454a0.f92919a);
    }
}
