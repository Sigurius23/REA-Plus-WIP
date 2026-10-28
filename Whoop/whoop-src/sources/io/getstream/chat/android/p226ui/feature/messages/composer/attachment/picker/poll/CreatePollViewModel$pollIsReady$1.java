package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.poll;

import c93.InterfaceC4354p;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollViewModel$pollIsReady$1", m100430f = "CreatePollViewModel.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\n"}, m65681d2 = {"<anonymous>", "", "options", "", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;", "title", "", "allowMultipleVotes", "maxAnswers", "", "multipleAnswersError"}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CreatePollViewModel$pollIsReady$1 extends AbstractC32275i implements InterfaceC4354p {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ boolean Z$0;
    int label;

    public CreatePollViewModel$pollIsReady$1(InterfaceC30057d<? super CreatePollViewModel$pollIsReady$1> interfaceC30057d) {
        super(6, interfaceC30057d);
    }

    @Override // c93.InterfaceC4354p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return invoke((List<PollAnswer>) obj, (String) obj2, ((Boolean) obj3).booleanValue(), (Integer) obj4, (Integer) obj5, (InterfaceC30057d<? super Boolean>) obj6);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        boolean z4;
        List list = (List) this.L$0;
        String str = (String) this.L$1;
        boolean z13 = this.Z$0;
        Integer num = (Integer) this.L$2;
        Integer num2 = (Integer) this.L$3;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        if (list.isEmpty()) {
            z4 = false;
        } else {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        PollAnswer pollAnswer = (PollAnswer) it.next();
                        if (AbstractC39414r.m125890i0(pollAnswer.getText()) || pollAnswer.getDuplicateError()) {
                        }
                    } else if (AbstractC39414r.m125890i0(str) && (!z13 || (num != null && num2 == null))) {
                        z4 = true;
                    }
                    z4 = false;
                }
            } else if (AbstractC39414r.m125890i0(str)) {
                z4 = false;
            } else {
                z4 = false;
            }
        }
        return Boolean.valueOf(z4);
    }

    public final Object invoke(List<PollAnswer> list, String str, boolean z4, Integer num, Integer num2, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        CreatePollViewModel$pollIsReady$1 createPollViewModel$pollIsReady$1 = new CreatePollViewModel$pollIsReady$1(interfaceC30057d);
        createPollViewModel$pollIsReady$1.L$0 = list;
        createPollViewModel$pollIsReady$1.L$1 = str;
        createPollViewModel$pollIsReady$1.Z$0 = z4;
        createPollViewModel$pollIsReady$1.L$2 = num;
        createPollViewModel$pollIsReady$1.L$3 = num2;
        return createPollViewModel$pollIsReady$1.invokeSuspend(C23454a0.f92919a);
    }
}
