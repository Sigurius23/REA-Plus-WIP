package io.getstream.chat.android.p226ui.common.feature.messages.list;

import c93.InterfaceC4339a;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fc3.AbstractC14371b;
import io.getstream.chat.android.client.channel.state.ChannelState;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.MessagesState;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageFooterVisibility;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageListState;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import m83.C25271y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeMessagesListState$$inlined$flatMapLatest$1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeMessagesListState$$inlined$flatMapLatest$1", m100430f = "MessageListController.kt", m100431l = {189}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class C19562x18ef7a90 extends AbstractC32275i implements Function3 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ MessageListController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19562x18ef7a90(InterfaceC30057d interfaceC30057d, MessageListController messageListController) {
        super(3, interfaceC30057d);
        this.this$0 = messageListController;
    }

    public final Object invoke(InterfaceC13062m interfaceC13062m, ChannelState channelState, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C19562x18ef7a90 c19562x18ef7a90 = new C19562x18ef7a90(interfaceC30057d, this.this$0);
        c19562x18ef7a90.L$0 = interfaceC13062m;
        c19562x18ef7a90.L$1 = channelState;
        return c19562x18ef7a90.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
            ChannelState channelState = (ChannelState) this.L$1;
            final Channel channel = channelState.toChannel();
            final InterfaceC13058l[] interfaceC13058lArr = {channelState.getMessagesState(), channelState.getReads(), this.this$0._showSystemMessagesState, this.this$0._dateSeparatorHandler, this.this$0._messageFooterVisibilityState, this.this$0._messagePositionHandler, this.this$0.getTypingUsers(), this.this$0.focusedMessage, channelState.getEndOfNewerMessages(), this.this$0.getUnreadLabelState(), channelState.getMembers(), channelState.getEndOfOlderMessages(), this.this$0.getOriginalTranslationsStore().getOriginalTextMessageIds()};
            final MessageListController messageListController = this.this$0;
            InterfaceC13058l interfaceC13058lM36610t = AbstractC13091v.m36610t(new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1

                /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1$3", m100430f = "MessageListController.kt", m100431l = {234}, m100432m = "invokeSuspend")
                @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m65681d2 = {"R", "T", "Lec3/m;", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Lkotlin/Array;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
                public static final class AnonymousClass3 extends AbstractC32275i implements Function3 {
                    final /* synthetic */ Channel $channel$inlined;
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;
                    final /* synthetic */ MessageListController this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass3(InterfaceC30057d interfaceC30057d, MessageListController messageListController, Channel channel) {
                        super(3, interfaceC30057d);
                        this.this$0 = messageListController;
                        this.$channel$inlined = channel;
                    }

                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(InterfaceC13062m interfaceC13062m, Object[] objArr, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(interfaceC30057d, this.this$0, this.$channel$inlined);
                        anonymousClass3.L$0 = interfaceC13062m;
                        anonymousClass3.L$1 = objArr;
                        return anonymousClass3.invokeSuspend(C23454a0.f92919a);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        MessageListState messageListStateCopy$default;
                        EnumC31071a enumC31071a = EnumC31071a.f128113w;
                        int i13 = this.label;
                        if (i13 == 0) {
                            AbstractC34132o.m107864I(obj);
                            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
                            Object[] objArr = (Object[]) this.L$1;
                            Object obj2 = objArr[0];
                            AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type io.getstream.chat.android.models.MessagesState");
                            MessagesState messagesState = (MessagesState) obj2;
                            Object obj3 = objArr[1];
                            AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.models.ChannelUserRead>");
                            List list = (List) obj3;
                            Object obj4 = objArr[2];
                            AbstractC22676k.m65748h(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            Object obj5 = objArr[3];
                            AbstractC22676k.m65748h(obj5, "null cannot be cast to non-null type io.getstream.chat.android.ui.common.feature.messages.list.DateSeparatorHandler");
                            DateSeparatorHandler dateSeparatorHandler = (DateSeparatorHandler) obj5;
                            Object obj6 = objArr[4];
                            AbstractC22676k.m65748h(obj6, "null cannot be cast to non-null type io.getstream.chat.android.ui.common.state.messages.list.MessageFooterVisibility");
                            MessageFooterVisibility messageFooterVisibility = (MessageFooterVisibility) obj6;
                            Object obj7 = objArr[5];
                            AbstractC22676k.m65748h(obj7, "null cannot be cast to non-null type io.getstream.chat.android.ui.common.feature.messages.list.MessagePositionHandler");
                            MessagePositionHandler messagePositionHandler = (MessagePositionHandler) obj7;
                            Object obj8 = objArr[6];
                            AbstractC22676k.m65748h(obj8, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.models.User>");
                            List list2 = (List) obj8;
                            Message message = (Message) objArr[7];
                            Object obj9 = objArr[8];
                            AbstractC22676k.m65748h(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj9).booleanValue();
                            MessageListController.UnreadLabel unreadLabel = (MessageListController.UnreadLabel) objArr[9];
                            Object obj10 = objArr[10];
                            AbstractC22676k.m65748h(obj10, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.models.Member>");
                            List list3 = (List) obj10;
                            Object obj11 = objArr[11];
                            AbstractC22676k.m65748h(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj11).booleanValue();
                            Object obj12 = objArr[12];
                            AbstractC22676k.m65748h(obj12, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                            Set set = (Set) obj12;
                            if ((messagesState instanceof MessagesState.Loading) || (messagesState instanceof MessagesState.NoQueryActive)) {
                                messageListStateCopy$default = MessageListState.copy$default((MessageListState) ((C13045h2) this.this$0._messageListState).getValue(), null, false, false, true, false, false, null, null, 0, null, null, null, 4087, null);
                            } else if (messagesState instanceof MessagesState.OfflineNoResults) {
                                messageListStateCopy$default = MessageListState.copy$default((MessageListState) ((C13045h2) this.this$0._messageListState).getValue(), C25271y.f99162w, false, false, false, false, false, null, null, 0, null, null, null, 4086, null);
                            } else {
                                if (!(messagesState instanceof MessagesState.Result)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                MessageListState messageListState = (MessageListState) ((C13045h2) this.this$0._messageListState).getValue();
                                MessageListController messageListController = this.this$0;
                                messageListStateCopy$default = MessageListState.copy$default(messageListState, messageListController.groupMessages(messageListController.filterMessagesToShow(((MessagesState.Result) messagesState).getMessages(), zBooleanValue), false, list, dateSeparatorHandler, messageFooterVisibility, messagePositionHandler, list2, message, unreadLabel, list3, zBooleanValue3, Channel.copy$default(this.$channel$inlined, null, null, null, null, 0, false, null, null, null, null, 0, null, list3, null, list, null, null, 0, null, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, -20481, 7, null), this.$channel$inlined.getOwnCapabilities(), set), zBooleanValue2, false, false, false, false, null, null, 0, null, null, null, 4084, null);
                            }
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 1;
                            if (interfaceC13062m.emit(messageListStateCopy$default, this) == enumC31071a) {
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

                @Override // ec3.InterfaceC13058l
                public final Object collect(InterfaceC13062m interfaceC13062m2, InterfaceC30057d interfaceC30057d) {
                    final InterfaceC13058l[] interfaceC13058lArr2 = interfaceC13058lArr;
                    Object objM41038a = AbstractC14371b.m41038a(new InterfaceC4339a() { // from class: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1.2
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return new Object[interfaceC13058lArr2.length];
                        }

                        @Override // c93.InterfaceC4339a
                        public final Object[] invoke() {
                            return new Object[interfaceC13058lArr2.length];
                        }
                    }, interfaceC13062m2, new AnonymousClass3(null, messageListController, channel), interfaceC30057d, interfaceC13058lArr2);
                    return objM41038a == EnumC31071a.f128113w ? objM41038a : C23454a0.f92919a;
                }
            });
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM36610t, this) == enumC31071a) {
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
