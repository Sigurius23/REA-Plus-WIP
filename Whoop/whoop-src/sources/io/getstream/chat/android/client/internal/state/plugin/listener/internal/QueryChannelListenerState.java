package io.getstream.chat.android.client.internal.state.plugin.listener.internal;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry;
import io.getstream.chat.android.client.plugin.listeners.QueryChannelListener;
import io.getstream.chat.android.models.Channel;
import l83.C23454a0;
import l83.InterfaceC23462h;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000f\u0010\u000eJ6\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryChannelListenerState;", "Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "logic", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V", "", "channelType", "channelId", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "request", "Ln23/h;", "Ll83/a0;", "onQueryChannelPrecondition", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;", "onQueryChannelRequest", "Lio/getstream/chat/android/models/Channel;", "result", "onQueryChannelResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryChannelListenerState implements QueryChannelListener {

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final LogicRegistry logic;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.listener.internal.QueryChannelListenerState$onQueryChannelRequest$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.listener.internal.QueryChannelListenerState", m100430f = "QueryChannelListenerState.kt", m100431l = {57}, m100432m = "onQueryChannelRequest")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192891 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C192891(InterfaceC30057d<? super C192891> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return QueryChannelListenerState.this.onQueryChannelRequest(null, null, null, this);
        }
    }

    public QueryChannelListenerState(LogicRegistry logic) {
        AbstractC22676k.m65750j(logic, "logic");
        this.logic = logic;
        this.logger = AbstractC1772c1.m5382S(this, "QueryChannelListenerS");
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.QueryChannelListener
    public final Object onQueryChannelPrecondition(String str, String str2, QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return new C26204g(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.plugin.listeners.QueryChannelListener
    public final Object onQueryChannelRequest(String str, String str2, QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C192891 c192891;
        if (interfaceC30057d instanceof C192891) {
            c192891 = (C192891) interfaceC30057d;
            int i13 = c192891.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c192891.label = i13 - Integer.MIN_VALUE;
            } else {
                c192891 = new C192891(interfaceC30057d);
            }
        } else {
            c192891 = new C192891(interfaceC30057d);
        }
        Object obj = c192891.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c192891.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str3 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str3)) {
                InterfaceC2344j interfaceC2344j = logger.f9274b;
                StringBuilder sbM32001t = AbstractC11895b.m32001t("[onQueryChannelRequest] cid: ", str, ":", str2, ", request: ");
                sbM32001t.append(queryChannelRequest);
                interfaceC2344j.log(enumC2341g, str3, sbM32001t.toString(), null);
            }
            ChannelLogic channelLogicChannel = this.logic.channel(str, str2);
            channelLogicChannel.setPaginationDirection(queryChannelRequest);
            c192891.L$0 = null;
            c192891.L$1 = null;
            c192891.L$2 = null;
            c192891.L$3 = channelLogicChannel;
            c192891.L$4 = null;
            c192891.I$0 = 0;
            c192891.label = 1;
            if (channelLogicChannel.updateStateFromDatabase(queryChannelRequest, c192891) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.QueryChannelListener
    public final Object onQueryChannelResult(AbstractC26205h abstractC26205h, String str, String str2, QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        String string;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str3 = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str3)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            if (abstractC26205h instanceof C26204g) {
                string = ((Channel) ((C26204g) abstractC26205h).f103919a).getCid();
            } else {
                if (!(abstractC26205h instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                string = ((C26203f) abstractC26205h).f103918a.toString();
            }
            StringBuilder sbM32001t = AbstractC11895b.m32001t("[onQueryChannelResult] cid: ", str, ":", str2, ", request: ");
            sbM32001t.append(queryChannelRequest);
            sbM32001t.append(", result: ");
            sbM32001t.append(string);
            interfaceC2344j.log(enumC2341g, str3, sbM32001t.toString(), null);
        }
        this.logic.channel(str, str2).onQueryChannelResult(queryChannelRequest, abstractC26205h);
        return C23454a0.f92919a;
    }
}
