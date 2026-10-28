package io.getstream.chat.android.p226ui.viewmodel.channels.internal;

import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.channel.state.ChannelState;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.viewmodel.channels.internal.ChannelActionsViewModel$special$$inlined$flatMapLatest$1", m100430f = "ChannelActionsViewModel.kt", m100431l = {189}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class ChannelActionsViewModel$special$$inlined$flatMapLatest$1 extends AbstractC32275i implements Function3 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public ChannelActionsViewModel$special$$inlined$flatMapLatest$1(InterfaceC30057d interfaceC30057d) {
        super(3, interfaceC30057d);
    }

    public final Object invoke(InterfaceC13062m interfaceC13062m, ChannelState channelState, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        ChannelActionsViewModel$special$$inlined$flatMapLatest$1 channelActionsViewModel$special$$inlined$flatMapLatest$1 = new ChannelActionsViewModel$special$$inlined$flatMapLatest$1(3, interfaceC30057d);
        channelActionsViewModel$special$$inlined$flatMapLatest$1.L$0 = interfaceC13062m;
        channelActionsViewModel$special$$inlined$flatMapLatest$1.L$1 = channelState;
        return channelActionsViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
            ChannelState channelState = (ChannelState) this.L$1;
            C13052j1 c13052j1M36606p = AbstractC13091v.m36606p(channelState.getChannelData(), channelState.getMembers(), channelState.getWatcherCount(), new ChannelActionsViewModel$channel$1$1(channelState, null));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (AbstractC13091v.m36613w(interfaceC13062m, c13052j1M36606p, this) == enumC31071a) {
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
        return invoke((InterfaceC13062m) obj, (ChannelState) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
    }
}
