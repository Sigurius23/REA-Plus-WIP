package io.getstream.chat.android.client.parser2;

import com.squareup.moshi.JsonAdapter;
import io.getstream.chat.android.client.api2.FlagRequestAdapterFactory;
import io.getstream.chat.android.client.api2.MoshiUrlQueryPayloadFactory;
import io.getstream.chat.android.client.api2.mapping.DtoMapping;
import io.getstream.chat.android.client.api2.mapping.EventMapping;
import io.getstream.chat.android.client.api2.mapping.SocketErrorMappingKt;
import io.getstream.chat.android.client.api2.model.dto.ChatEventDto;
import io.getstream.chat.android.client.api2.model.dto.UpstreamConnectedEventDto;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import io.getstream.chat.android.client.api2.model.response.SocketErrorResponse;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.events.ConnectedEvent;
import io.getstream.chat.android.client.extensions.internal.ChatEventKt;
import io.getstream.chat.android.client.parser.ChatParser;
import io.getstream.chat.android.client.parser2.adapters.AttachmentDtoAdapter;
import io.getstream.chat.android.client.parser2.adapters.CreatePollRequestAdapter;
import io.getstream.chat.android.client.parser2.adapters.DateAdapter;
import io.getstream.chat.android.client.parser2.adapters.DownstreamChannelDtoAdapter;
import io.getstream.chat.android.client.parser2.adapters.DownstreamMemberDtoAdapter;
import io.getstream.chat.android.client.parser2.adapters.DownstreamMessageDtoAdapter;
import io.getstream.chat.android.client.parser2.adapters.DownstreamModerationDetailsDtoAdapter;
import io.getstream.chat.android.client.parser2.adapters.DownstreamPollDtoAdapter;
import io.getstream.chat.android.client.parser2.adapters.DownstreamPollOptionDtoAdapter;
import io.getstream.chat.android.client.parser2.adapters.DownstreamReactionDtoAdapter;
import io.getstream.chat.android.client.parser2.adapters.DownstreamThreadDtoAdapter;
import io.getstream.chat.android.client.parser2.adapters.DownstreamThreadInfoDtoAdapter;
import io.getstream.chat.android.client.parser2.adapters.DownstreamUserDtoAdapter;
import io.getstream.chat.android.client.parser2.adapters.EventAdapterFactory;
import io.getstream.chat.android.client.parser2.adapters.ExactDateAdapter;
import io.getstream.chat.android.client.parser2.adapters.UpstreamMemberDataDtoAdapter;
import io.getstream.chat.android.client.parser2.adapters.UpstreamMemberDtoAdapter;
import io.getstream.chat.android.client.parser2.adapters.UpstreamMessageDtoAdapter;
import io.getstream.chat.android.client.parser2.adapters.UpstreamOptionDtoAdapter;
import io.getstream.chat.android.client.parser2.adapters.UpstreamReactionDtoAdapter;
import io.getstream.chat.android.client.parser2.adapters.UpstreamUserDtoAdapter;
import io.getstream.chat.android.client.socket.ErrorResponse;
import io.getstream.chat.android.client.socket.SocketErrorMessage;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import l83.InterfaceC23462h;
import p007a6.C0438l0;
import p441qx.C30716i0;
import p441qx.C30722l0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29222x0;
import q83.AbstractC30060g;
import tg3.C33800a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000e\u001a\u00020\u000b\"\u0006\b\u0000\u0010\n\u0018\u0001*\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0082\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b'\u0010\u0014J/\u0010*\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103RX\u00107\u001aF\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\u0002\b\u0003 6*\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010505 6*\"\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\u0002\b\u0003 6*\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010505\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R8\u0010:\u001a&\u0012\f\u0012\n 6*\u0004\u0018\u00010909 6*\u0012\u0012\f\u0012\n 6*\u0004\u0018\u00010909\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R8\u0010<\u001a&\u0012\f\u0012\n 6*\u0004\u0018\u00010;0; 6*\u0012\u0012\f\u0012\n 6*\u0004\u0018\u00010;0;\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00108R8\u0010>\u001a&\u0012\f\u0012\n 6*\u0004\u0018\u00010=0= 6*\u0012\u0012\f\u0012\n 6*\u0004\u0018\u00010=0=\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00108R8\u0010@\u001a&\u0012\f\u0012\n 6*\u0004\u0018\u00010?0? 6*\u0012\u0012\f\u0012\n 6*\u0004\u0018\u00010?0?\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00108¨\u0006A"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/MoshiChatParser;", "Lio/getstream/chat/android/client/parser/ChatParser;", "Lio/getstream/chat/android/client/api2/mapping/EventMapping;", "eventMapping", "Lio/getstream/chat/android/client/api2/mapping/DtoMapping;", "dtoMapping", "Lio/getstream/chat/android/client/parser2/DirectEventParser;", "directEventParser", "<init>", "(Lio/getstream/chat/android/client/api2/mapping/EventMapping;Lio/getstream/chat/android/client/api2/mapping/DtoMapping;Lio/getstream/chat/android/client/parser2/DirectEventParser;)V", "T", "Lqx/i0;", "Lcom/squareup/moshi/JsonAdapter;", "adapter", "addAdapter", "(Lqx/i0;Lcom/squareup/moshi/JsonAdapter;)Lqx/i0;", "", "any", "", "serializeMap", "(Ljava/lang/Object;)Ljava/lang/String;", "Lio/getstream/chat/android/client/events/ConnectedEvent;", "connectedEvent", "serializeConnectedEvent", "(Lio/getstream/chat/android/client/events/ConnectedEvent;)Ljava/lang/String;", "raw", "Lio/getstream/chat/android/client/socket/SocketErrorMessage;", "parseSocketError", "(Ljava/lang/String;)Lio/getstream/chat/android/client/socket/SocketErrorMessage;", "Lio/getstream/chat/android/client/socket/ErrorResponse;", "parseErrorResponse", "(Ljava/lang/String;)Lio/getstream/chat/android/client/socket/ErrorResponse;", "Lio/getstream/chat/android/client/events/ChatEvent;", "parseAndProcessEvent", "(Ljava/lang/String;)Lio/getstream/chat/android/client/events/ChatEvent;", "Lpg3/x0;", "builder", "configRetrofit", "(Lpg3/x0;)Lpg3/x0;", "toJson", "Ljava/lang/Class;", "clazz", "fromJson", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/api2/mapping/EventMapping;", "Lio/getstream/chat/android/client/api2/mapping/DtoMapping;", "Lio/getstream/chat/android/client/parser2/DirectEventParser;", "Lqx/l0;", "moshi$delegate", "Ll83/h;", "getMoshi", "()Lqx/l0;", "moshi", "", "kotlin.jvm.PlatformType", "mapAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamConnectedEventDto;", "upstreamConnectedEventAdapter", "Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;", "socketErrorResponseAdapter", "Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;", "errorResponseAdapter", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "chatEventDtoAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MoshiChatParser implements ChatParser {
    private final JsonAdapter<ChatEventDto> chatEventDtoAdapter;
    private final DirectEventParser directEventParser;
    private final DtoMapping dtoMapping;
    private final JsonAdapter<SocketErrorResponse.ErrorResponse> errorResponseAdapter;
    private final EventMapping eventMapping;
    private final JsonAdapter<Map<?, ?>> mapAdapter;

    /* JADX INFO: renamed from: moshi$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h moshi;
    private final JsonAdapter<SocketErrorResponse> socketErrorResponseAdapter;
    private final JsonAdapter<UpstreamConnectedEventDto> upstreamConnectedEventAdapter;

    public MoshiChatParser(EventMapping eventMapping, DtoMapping dtoMapping, DirectEventParser directEventParser) {
        AbstractC22676k.m65750j(eventMapping, "eventMapping");
        AbstractC22676k.m65750j(dtoMapping, "dtoMapping");
        this.eventMapping = eventMapping;
        this.dtoMapping = dtoMapping;
        this.directEventParser = directEventParser;
        this.moshi = AbstractC30060g.m92088H(new C0438l0(this, 21));
        this.mapAdapter = getMoshi().m94398a(Map.class);
        this.upstreamConnectedEventAdapter = getMoshi().m94398a(UpstreamConnectedEventDto.class);
        this.socketErrorResponseAdapter = getMoshi().m94398a(SocketErrorResponse.class);
        this.errorResponseAdapter = getMoshi().m94398a(SocketErrorResponse.ErrorResponse.class);
        this.chatEventDtoAdapter = getMoshi().m94398a(ChatEventDto.class);
    }

    private final <T> C30716i0 addAdapter(C30716i0 c30716i0, JsonAdapter<T> jsonAdapter) {
        AbstractC22676k.m65756p();
        throw null;
    }

    private final C30722l0 getMoshi() {
        Object value = this.moshi.getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        return (C30722l0) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C30722l0 moshi_delegate$lambda$0(MoshiChatParser moshiChatParser) {
        C30716i0 c30716i0 = new C30716i0();
        c30716i0.m94392b(Date.class, new DateAdapter());
        c30716i0.m94392b(ExactDate.class, new ExactDateAdapter());
        c30716i0.m94393c(new EventAdapterFactory());
        c30716i0.m94391a(DownstreamMessageDtoAdapter.INSTANCE);
        c30716i0.m94391a(DownstreamModerationDetailsDtoAdapter.INSTANCE);
        c30716i0.m94391a(UpstreamMessageDtoAdapter.INSTANCE);
        c30716i0.m94391a(DownstreamChannelDtoAdapter.INSTANCE);
        c30716i0.m94391a(AttachmentDtoAdapter.INSTANCE);
        c30716i0.m94391a(DownstreamReactionDtoAdapter.INSTANCE);
        c30716i0.m94391a(UpstreamReactionDtoAdapter.INSTANCE);
        c30716i0.m94391a(DownstreamUserDtoAdapter.INSTANCE);
        c30716i0.m94391a(UpstreamUserDtoAdapter.INSTANCE);
        c30716i0.m94391a(DownstreamMemberDtoAdapter.INSTANCE);
        c30716i0.m94391a(UpstreamMemberDtoAdapter.INSTANCE);
        c30716i0.m94391a(UpstreamMemberDataDtoAdapter.INSTANCE);
        c30716i0.m94393c(FlagRequestAdapterFactory.INSTANCE);
        c30716i0.m94391a(DownstreamThreadDtoAdapter.INSTANCE);
        c30716i0.m94391a(DownstreamThreadInfoDtoAdapter.INSTANCE);
        c30716i0.m94391a(DownstreamPollDtoAdapter.INSTANCE);
        c30716i0.m94391a(DownstreamPollOptionDtoAdapter.INSTANCE);
        c30716i0.m94391a(CreatePollRequestAdapter.INSTANCE);
        c30716i0.m94391a(UpstreamOptionDtoAdapter.INSTANCE);
        return new C30722l0(c30716i0);
    }

    private final ChatEvent parseAndProcessEvent(String raw) throws IOException {
        DirectEventParser directEventParser = this.directEventParser;
        ChatEvent chatEvent = directEventParser != null ? directEventParser.parse(raw) : null;
        if (chatEvent != null) {
            return chatEvent;
        }
        EventMapping eventMapping = this.eventMapping;
        ChatEventDto chatEventDtoFromJson = this.chatEventDtoAdapter.fromJson(raw);
        AbstractC22676k.m65747g(chatEventDtoFromJson);
        return ChatEventKt.enrichIfNeeded(eventMapping.toDomain$stream_chat_android_client_release(chatEventDtoFromJson));
    }

    private final ErrorResponse parseErrorResponse(String raw) throws IOException {
        SocketErrorResponse.ErrorResponse errorResponseFromJson = this.errorResponseAdapter.fromJson(raw);
        AbstractC22676k.m65747g(errorResponseFromJson);
        return SocketErrorMappingKt.toDomain(errorResponseFromJson);
    }

    private final SocketErrorMessage parseSocketError(String raw) throws IOException {
        SocketErrorResponse socketErrorResponseFromJson = this.socketErrorResponseAdapter.fromJson(raw);
        AbstractC22676k.m65747g(socketErrorResponseFromJson);
        return SocketErrorMappingKt.toDomain(socketErrorResponseFromJson);
    }

    private final String serializeConnectedEvent(ConnectedEvent connectedEvent) {
        String json = this.upstreamConnectedEventAdapter.toJson(this.dtoMapping.toDto$stream_chat_android_client_release(connectedEvent));
        AbstractC22676k.m65749i(json, "toJson(...)");
        return json;
    }

    private final String serializeMap(Object any) {
        JsonAdapter<Map<?, ?>> jsonAdapter = this.mapAdapter;
        AbstractC22676k.m65748h(any, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        String json = jsonAdapter.toJson((Map) any);
        AbstractC22676k.m65749i(json, "toJson(...)");
        return json;
    }

    @Override // io.getstream.chat.android.client.parser.ChatParser
    public final C29222x0 configRetrofit(C29222x0 builder) {
        AbstractC22676k.m65750j(builder, "builder");
        builder.m88728b(new MoshiUrlQueryPayloadFactory(getMoshi()));
        builder.m88728b(MoshiErrorLoggingKt.withErrorLogging(new C33800a(getMoshi())));
        return builder;
    }

    @Override // io.getstream.chat.android.client.parser.ChatParser
    public final <T> T fromJson(String raw, Class<T> clazz) {
        AbstractC22676k.m65750j(raw, "raw");
        AbstractC22676k.m65750j(clazz, "clazz");
        if (clazz.equals(ChatEvent.class)) {
            return (T) parseAndProcessEvent(raw);
        }
        if (clazz.equals(SocketErrorMessage.class)) {
            return (T) parseSocketError(raw);
        }
        if (clazz.equals(ErrorResponse.class)) {
            return (T) parseErrorResponse(raw);
        }
        T t14 = (T) getMoshi().m94398a(clazz).fromJson(raw);
        AbstractC22676k.m65747g(t14);
        return t14;
    }

    @Override // io.getstream.chat.android.client.parser.ChatParser
    public final String toJson(Object any) {
        AbstractC22676k.m65750j(any, "any");
        if (Map.class.isAssignableFrom(any.getClass())) {
            return serializeMap(any);
        }
        if (any instanceof ConnectedEvent) {
            return serializeConnectedEvent((ConnectedEvent) any);
        }
        String json = getMoshi().m94398a(any.getClass()).toJson(any);
        AbstractC22676k.m65749i(json, "toJson(...)");
        return json;
    }
}
