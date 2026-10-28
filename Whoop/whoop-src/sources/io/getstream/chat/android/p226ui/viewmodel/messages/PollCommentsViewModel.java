package io.getstream.chat.android.p226ui.viewmodel.messages;

import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.InterfaceC1563a2;
import ch.C4588i;
import ec3.AbstractC13091v;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.state.ChatClientExtensions;
import io.getstream.chat.android.client.api.state.StateRegistry;
import io.getstream.chat.android.client.extensions.StringExtensionsKt;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Poll;
import j93.InterfaceC21461d;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import p298l8.AbstractC23420c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/PollCommentsViewModel;", "Landroidx/lifecycle/w1;", "", "cid", "messageId", "Lio/getstream/chat/android/client/api/state/StateRegistry;", "state", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/state/StateRegistry;)V", "Landroidx/lifecycle/p0;", "Lio/getstream/chat/android/models/Poll;", "poll", "Landroidx/lifecycle/p0;", "getPoll", "()Landroidx/lifecycle/p0;", "Factory", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PollCommentsViewModel extends AbstractC1637w1 {
    private final AbstractC1615p0 poll;

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/PollCommentsViewModel$Factory;", "Landroidx/lifecycle/a2;", "", "cid", "messageId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroidx/lifecycle/w1;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/w1;", "Ljava/lang/String;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Factory implements InterfaceC1563a2 {
        private final String cid;
        private final String messageId;

        public Factory(String cid, String messageId) {
            AbstractC22676k.m65750j(cid, "cid");
            AbstractC22676k.m65750j(messageId, "messageId");
            this.cid = cid;
            this.messageId = messageId;
        }

        @Override // androidx.lifecycle.InterfaceC1563a2
        public final <T extends AbstractC1637w1> T create(InterfaceC21461d interfaceC21461d, AbstractC23420c abstractC23420c) {
            return (T) super.create(interfaceC21461d, abstractC23420c);
        }

        @Override // androidx.lifecycle.InterfaceC1563a2
        public final <T extends AbstractC1637w1> T create(Class<T> cls, AbstractC23420c abstractC23420c) {
            return (T) super.create(cls, abstractC23420c);
        }

        @Override // androidx.lifecycle.InterfaceC1563a2
        public final <T extends AbstractC1637w1> T create(Class<T> modelClass) {
            AbstractC22676k.m65750j(modelClass, "modelClass");
            if (modelClass.equals(PollCommentsViewModel.class)) {
                return new PollCommentsViewModel(this.cid, this.messageId, null, 4, null);
            }
            throw new IllegalArgumentException("Factory can only create instances of PollCommentsViewModel");
        }
    }

    public /* synthetic */ PollCommentsViewModel(String str, String str2, StateRegistry stateRegistry, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? ChatClientExtensions.getState(ChatClient.INSTANCE.instance()) : stateRegistry);
    }

    public final AbstractC1615p0 getPoll() {
        return this.poll;
    }

    public PollCommentsViewModel(String cid, final String messageId, StateRegistry state) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(state, "state");
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(cid);
        final InterfaceC13037f2 messages = state.channel((String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x).getMessages();
        this.poll = AbstractC1613o1.m5012b(AbstractC13091v.m36610t(new C4588i(new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.viewmodel.messages.PollCommentsViewModel$poll$lambda$2$$inlined$map$1

            /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.PollCommentsViewModel$poll$lambda$2$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C199362<T> implements InterfaceC13062m {
                final /* synthetic */ String $messageId$inlined;
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.PollCommentsViewModel$poll$lambda$2$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.viewmodel.messages.PollCommentsViewModel$poll$lambda$2$$inlined$map$1$2", m100430f = "PollCommentsViewModel.kt", m100431l = {50}, m100432m = "emit")
                @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                public static final class AnonymousClass1 extends AbstractC32269c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C199362.this.emit(null, this);
                    }
                }

                public C199362(InterfaceC13062m interfaceC13062m, String str) {
                    this.$this_unsafeFlow = interfaceC13062m;
                    this.$messageId$inlined = str;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    AnonymousClass1 anonymousClass1;
                    T next;
                    if (interfaceC30057d instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC30057d;
                        int i13 = anonymousClass1.label;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i13 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                    }
                    Object obj2 = anonymousClass1.result;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.$this_unsafeFlow;
                        Iterator<T> it = ((List) obj).iterator();
                        do {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                        } while (!AbstractC22676k.m65745e(((Message) next).getId(), this.$messageId$inlined));
                        Message message = next;
                        Poll poll = message != null ? message.getPoll() : null;
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(poll, anonymousClass1) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj2);
                    }
                    return C23454a0.f92919a;
                }
            }

            @Override // ec3.InterfaceC13058l
            public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = messages.collect(new C199362(interfaceC13062m, messageId), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }, 2)), null, 3);
    }
}
