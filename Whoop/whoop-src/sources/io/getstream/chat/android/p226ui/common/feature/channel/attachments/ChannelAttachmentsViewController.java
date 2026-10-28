package io.getstream.chat.android.p226ui.common.feature.channel.attachments;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13045h2;
import ec3.C13052j1;
import ec3.C13096w1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.extensions.StringExtensionsKt;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.C19336c;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Filters;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.SearchMessagesResult;
import io.getstream.chat.android.p226ui.common.state.channel.attachments.ChannelAttachmentsViewState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00150,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010\"R\u001a\u00102\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001d\u00105\u001a\b\u0012\u0004\u0012\u000201048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002090,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010.R\u001d\u0010<\u001a\b\u0012\u0004\u0012\u0002090;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006@"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;", "", "", "cid", "", "attachmentTypes", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/Attachment;", "", "localFilter", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "Lbc3/c0;", "scope", "<init>", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;)V", "Ln23/h;", "Lio/getstream/chat/android/models/SearchMessagesResult;", "searchAttachments", "(Lq83/d;)Ljava/lang/Object;", "result", "Ll83/a0;", "onSuccessResult", "(Lio/getstream/chat/android/models/SearchMessagesResult;)V", "Ln23/e;", "error", "onFailureResult", "(Ln23/e;)V", "loadMore", "()V", "Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewAction;", "action", "onViewAction", "(Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewAction;)V", "Ljava/lang/String;", "Ljava/util/List;", "Lkotlin/jvm/functions/Function1;", "Lio/getstream/chat/android/client/ChatClient;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lec3/o1;", "loadRequests", "Lec3/o1;", "nextPage", "Lec3/p1;", "Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState;", "_state", "Lec3/p1;", "Lec3/f2;", "state", "Lec3/f2;", "getState", "()Lec3/f2;", "Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewEvent;", "_events", "Lec3/t1;", "events", "Lec3/t1;", "getEvents", "()Lec3/t1;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelAttachmentsViewController {
    public static final int $stable = 8;
    private final InterfaceC13072o1 _events;
    private final InterfaceC13075p1 _state;
    private final List<String> attachmentTypes;
    private final ChatClient chatClient;
    private final String cid;
    private final InterfaceC13087t1 events;
    private final InterfaceC13072o1 loadRequests;
    private final Function1 localFilter;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private String nextPage;
    private final InterfaceC13037f2 state;

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.attachments.ChannelAttachmentsViewController$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.attachments.ChannelAttachmentsViewController$2", m100430f = "ChannelAttachmentsViewController.kt", m100431l = {91}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194712 extends AbstractC32275i implements InterfaceC4351m {
        private /* synthetic */ Object L$0;
        int label;

        public C194712(InterfaceC30057d<? super C194712> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C194712 c194712 = new C194712(2, interfaceC30057d);
            c194712.L$0 = obj;
            return c194712;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194712) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.L$0 = null;
                this.label = 1;
                if (interfaceC13062m.emit(c23454a0, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.attachments.ChannelAttachmentsViewController$4 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.attachments.ChannelAttachmentsViewController$4", m100430f = "ChannelAttachmentsViewController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/SearchMessagesResult;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194724 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C194724(InterfaceC30057d<? super C194724> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C194724 c194724 = ChannelAttachmentsViewController.this.new C194724(interfaceC30057d);
            c194724.L$0 = obj;
            return c194724;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((AbstractC26205h) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            ChannelAttachmentsViewController channelAttachmentsViewController = ChannelAttachmentsViewController.this;
            boolean z4 = abstractC26205h instanceof C26204g;
            if (z4) {
                channelAttachmentsViewController.onSuccessResult((SearchMessagesResult) ((C26204g) abstractC26205h).f103919a);
            } else if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            ChannelAttachmentsViewController channelAttachmentsViewController2 = ChannelAttachmentsViewController.this;
            if (!z4) {
                if (!(abstractC26205h instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                channelAttachmentsViewController2.onFailureResult(((C26203f) abstractC26205h).f103918a);
            }
            return C23454a0.f92919a;
        }

        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C194724 c194724 = (C194724) create(abstractC26205h, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c194724.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    public ChannelAttachmentsViewController(String cid, List<String> attachmentTypes, Function1 localFilter, ChatClient chatClient, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(attachmentTypes, "attachmentTypes");
        AbstractC22676k.m65750j(localFilter, "localFilter");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(scope, "scope");
        this.cid = cid;
        this.attachmentTypes = attachmentTypes;
        this.localFilter = localFilter;
        this.chatClient = chatClient;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:ChannelAttachmentsViewController");
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 1, null, 5);
        this.loadRequests = c13096w1M36592b;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(ChannelAttachmentsViewState.Loading.INSTANCE);
        this._state = c13045h2M36593c;
        this.state = AbstractC13091v.m36598h(c13045h2M36593c);
        C13096w1 c13096w1M36592b2 = AbstractC13091v.m36592b(0, 1, null, 5);
        this._events = c13096w1M36592b2;
        this.events = AbstractC13091v.m36597g(c13096w1M36592b2);
        AbstractC13091v.m36582H(new C13052j1(AbstractC13091v.m36590P(new C13015a0(new C194712(2, null), c13096w1M36592b), new C19473xac33375b(null, this)), new C194724(null), 0), scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(Attachment it) {
        AbstractC22676k.m65750j(it, "it");
        return true;
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final void loadMore() {
        ChannelAttachmentsViewState channelAttachmentsViewState = (ChannelAttachmentsViewState) this.state.getValue();
        if (!(channelAttachmentsViewState instanceof ChannelAttachmentsViewState.Content)) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[loadMore] current state is not Content, cannot load more attachments", null);
                return;
            }
            return;
        }
        ChannelAttachmentsViewState.Content content = (ChannelAttachmentsViewState.Content) channelAttachmentsViewState;
        if (!content.getCanLoadMore()) {
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str2 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                logger2.f9274b.log(enumC2341g2, str2, "[loadMore] no more attachments to load", null);
                return;
            }
            return;
        }
        if (content.isLoadingMore()) {
            C2345k logger3 = getLogger();
            InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
            String str3 = logger3.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
            if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
                logger3.f9274b.log(enumC2341g3, str3, "[loadMore] already loading more attachments", null);
                return;
            }
            return;
        }
        C2345k logger4 = getLogger();
        InterfaceC2339e interfaceC2339e4 = logger4.f9275c;
        String str4 = logger4.f9273a;
        EnumC2341g enumC2341g4 = EnumC2341g.DEBUG;
        if (interfaceC2339e4.isLoggable(enumC2341g4, str4)) {
            logger4.f9274b.log(enumC2341g4, str4, "[loadMore] no args", null);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        ChannelAttachmentsViewState.Content contentCopy$default = ChannelAttachmentsViewState.Content.copy$default(content, null, false, true, 3, null);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, contentCopy$default);
        this.loadRequests.mo36564a(C23454a0.f92919a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFailureResult(AbstractC26202e error) {
        C13045h2 c13045h2;
        Object value;
        Object objCopy$default;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[onFailureResult] error: ", error.mo77807a()), null);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            objCopy$default = (ChannelAttachmentsViewState) value;
            if (objCopy$default instanceof ChannelAttachmentsViewState.Loading) {
                objCopy$default = new ChannelAttachmentsViewState.Error(error.mo77807a());
            } else if (objCopy$default instanceof ChannelAttachmentsViewState.Content) {
                this._events.mo36564a(new ChannelAttachmentsViewEvent.LoadMoreError(error));
                objCopy$default = ChannelAttachmentsViewState.Content.copy$default((ChannelAttachmentsViewState.Content) objCopy$default, null, false, false, 3, null);
            }
        } while (!c13045h2.m36569i(value, objCopy$default));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSuccessResult(SearchMessagesResult result) {
        C13045h2 c13045h2;
        Object value;
        ChannelAttachmentsViewState channelAttachmentsViewState;
        this.nextPage = result.getNext();
        List<Message> messages = result.getMessages();
        ArrayList arrayList = new ArrayList();
        for (Message message : messages) {
            List<Attachment> attachments = message.getAttachments();
            Function1 function1 = this.localFilter;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : attachments) {
                if (((Boolean) function1.invoke(obj)).booleanValue()) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(new ChannelAttachmentsViewState.Content.Item(message, (Attachment) it.next()));
            }
            AbstractC25265s.m74141p0(arrayList, arrayList3);
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30456j(arrayList.size(), "[onSuccessResult] items: ", ", next: ", this.nextPage), null);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            channelAttachmentsViewState = (ChannelAttachmentsViewState) value;
        } while (!c13045h2.m36569i(value, new ChannelAttachmentsViewState.Content(AbstractC25265s.m74129g1(channelAttachmentsViewState instanceof ChannelAttachmentsViewState.Content ? ((ChannelAttachmentsViewState.Content) channelAttachmentsViewState).getItems() : C25271y.f99162w, arrayList), this.nextPage != null, false)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object searchAttachments(InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(this.cid);
        FilterObject filterObjectM54979eq = Filters.m54979eq("cid", ((String) c23465kCidToTypeAndId.f92937w) + ":" + ((String) c23465kCidToTypeAndId.f92938x));
        FilterObject filterObjectM54980in = Filters.m54980in("attachments.type", this.attachmentTypes);
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[searchAttachments] filters: " + filterObjectM54979eq + " and " + filterObjectM54980in + ", limit: 30, nextPage: " + this.nextPage, null);
        }
        return ChatClient.searchMessages$default(this.chatClient, filterObjectM54979eq, filterObjectM54980in, null, new Integer(30), this.nextPage, null, 36, null).await(interfaceC30057d);
    }

    public final InterfaceC13087t1 getEvents() {
        return this.events;
    }

    public final InterfaceC13037f2 getState() {
        return this.state;
    }

    public final void onViewAction(ChannelAttachmentsViewAction action) {
        AbstractC22676k.m65750j(action, "action");
        if (!action.equals(ChannelAttachmentsViewAction.LoadMoreRequested.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        loadMore();
    }

    public /* synthetic */ ChannelAttachmentsViewController(String str, List list, Function1 function1, ChatClient chatClient, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i13 & 4) != 0 ? new C19336c(14) : function1, (i13 & 8) != 0 ? ChatClient.INSTANCE.instance() : chatClient, interfaceC2994c0);
    }
}
