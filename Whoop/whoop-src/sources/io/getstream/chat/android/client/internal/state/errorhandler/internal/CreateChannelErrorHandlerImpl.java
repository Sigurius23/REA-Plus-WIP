package io.getstream.chat.android.client.internal.state.errorhandler.internal;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.errorhandler.CreateChannelErrorHandler;
import io.getstream.chat.android.client.persistance.repository.ChannelRepository;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.client.utils.channel.ChannelUtilsKt;
import io.getstream.chat.android.models.Channel;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25265s;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26203f;
import n23.C26204g;
import o23.AbstractC27476f;
import o23.C27487q;
import o23.InterfaceC27474d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJU\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00152\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/errorhandler/internal/CreateChannelErrorHandlerImpl;", "Lio/getstream/chat/android/client/errorhandler/CreateChannelErrorHandler;", "Lbc3/c0;", "scope", "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "channelRepository", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "<init>", "(Lbc3/c0;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;Lio/getstream/chat/android/client/setup/state/ClientState;)V", "Lo23/d;", "Lio/getstream/chat/android/models/Channel;", "originalCall", "", "channelType", "channelId", "", "memberIds", "", "", "extraData", "Lo23/q;", "onCreateChannelError", "(Lo23/d;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lo23/q;", "Lbc3/c0;", "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CreateChannelErrorHandlerImpl implements CreateChannelErrorHandler {
    private final ChannelRepository channelRepository;
    private final ClientState clientState;
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.errorhandler.internal.CreateChannelErrorHandlerImpl$onCreateChannelError$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.errorhandler.internal.CreateChannelErrorHandlerImpl$onCreateChannelError$1", m100430f = "CreateChannelErrorHandlerImpl.kt", m100431l = {71}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/e;", "originalError", "Ln23/h;", "Lio/getstream/chat/android/models/Channel;", "<anonymous>", "(Ln23/e;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C192551 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ List<String> $memberIds;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192551(String str, String str2, List<String> list, InterfaceC30057d<? super C192551> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$channelType = str;
            this.$channelId = str2;
            this.$memberIds = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C192551 c192551 = CreateChannelErrorHandlerImpl.this.new C192551(this.$channelType, this.$channelId, this.$memberIds, interfaceC30057d);
            c192551.L$0 = obj;
            return c192551;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC26202e abstractC26202e = (AbstractC26202e) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (CreateChannelErrorHandlerImpl.this.clientState.isOnline()) {
                    return new C26203f(abstractC26202e);
                }
                String strM53370k = AbstractC18489d0.m53370k(this.$channelType, ":", ChannelUtilsKt.generateChannelIdIfNeeded(this.$channelId, this.$memberIds));
                ChannelRepository channelRepository = CreateChannelErrorHandlerImpl.this.channelRepository;
                List<String> listM118958J = AbstractC37056f.m118958J(strM53370k);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = channelRepository.selectChannels(listM118958J, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            Channel channel = (Channel) AbstractC25265s.m74100H0((List) obj);
            return channel == null ? new C26203f(new C26198a("Channel wasn't cached properly.")) : new C26204g(channel);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26202e abstractC26202e, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C192551) create(abstractC26202e, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public CreateChannelErrorHandlerImpl(InterfaceC2994c0 scope, ChannelRepository channelRepository, ClientState clientState) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(channelRepository, "channelRepository");
        AbstractC22676k.m65750j(clientState, "clientState");
        this.scope = scope;
        this.channelRepository = channelRepository;
        this.clientState = clientState;
    }

    @Override // io.getstream.chat.android.client.errorhandler.CreateChannelErrorHandler
    public final C27487q onCreateChannelError(InterfaceC27474d originalCall, String channelType, String channelId, List<String> memberIds, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(originalCall, "originalCall");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(memberIds, "memberIds");
        AbstractC22676k.m65750j(extraData, "extraData");
        return AbstractC27476f.m82910h(originalCall, this.scope, new C192551(channelType, channelId, memberIds, null));
    }
}
