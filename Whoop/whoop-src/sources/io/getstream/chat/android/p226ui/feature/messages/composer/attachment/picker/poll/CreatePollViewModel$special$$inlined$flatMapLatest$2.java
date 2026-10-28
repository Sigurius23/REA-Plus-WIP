package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.poll;

import androidx.room.C1844y;
import ec3.AbstractC13091v;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollViewModel$special$$inlined$flatMapLatest$2", m100430f = "CreatePollViewModel.kt", m100431l = {189}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class CreatePollViewModel$special$$inlined$flatMapLatest$2 extends AbstractC32275i implements Function3 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CreatePollViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePollViewModel$special$$inlined$flatMapLatest$2(InterfaceC30057d interfaceC30057d, CreatePollViewModel createPollViewModel) {
        super(3, interfaceC30057d);
        this.this$0 = createPollViewModel;
    }

    public final Object invoke(InterfaceC13062m interfaceC13062m, Boolean bool, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        CreatePollViewModel$special$$inlined$flatMapLatest$2 createPollViewModel$special$$inlined$flatMapLatest$2 = new CreatePollViewModel$special$$inlined$flatMapLatest$2(interfaceC30057d, this.this$0);
        createPollViewModel$special$$inlined$flatMapLatest$2.L$0 = interfaceC13062m;
        createPollViewModel$special$$inlined$flatMapLatest$2.L$1 = bool;
        return createPollViewModel$special$$inlined$flatMapLatest$2.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
            ((Boolean) this.L$1).getClass();
            C1844y c1844yM36605o = AbstractC13091v.m36605o(this.this$0._titleStateFlow, this.this$0.getOptions(), this.this$0.allowMultipleVotes, this.this$0.maxAnswers, new CreatePollViewModel$createPollParams$2$1(this.this$0, null));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (AbstractC13091v.m36613w(interfaceC13062m, c1844yM36605o, this) == enumC31071a) {
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
        return invoke((InterfaceC13062m) obj, (Boolean) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
    }
}
