package io.getstream.chat.android.client.socket;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.DeliveryReceipts;
import io.getstream.chat.android.PrivacySettings;
import io.getstream.chat.android.ReadReceipts;
import io.getstream.chat.android.TypingIndicators;
import io.getstream.chat.android.client.parser.ChatParser;
import io.getstream.chat.android.client.token.TokenManager;
import io.getstream.chat.android.client.utils.HeadersUtil;
import io.getstream.chat.android.models.User;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import l83.InterfaceC23462h;
import le3.C23886g;
import m83.AbstractC25247g0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import ud3.AbstractC34814f1;
import ud3.C34826l0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.InterfaceC34811e1;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 (2\u00020\u0001:\u0002)(B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0015*\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0015*\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006*"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/SocketFactory;", "", "Lio/getstream/chat/android/client/parser/ChatParser;", "parser", "Lio/getstream/chat/android/client/token/TokenManager;", "tokenManager", "Lio/getstream/chat/android/client/utils/HeadersUtil;", "headersUtil", "Lud3/l0;", "httpClient", "<init>", "(Lio/getstream/chat/android/client/parser/ChatParser;Lio/getstream/chat/android/client/token/TokenManager;Lio/getstream/chat/android/client/utils/HeadersUtil;Lud3/l0;)V", "Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;", "connectionConf", "Lud3/o0;", "buildRequest", "(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;)Lud3/o0;", "", "buildUrl", "(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;)Ljava/lang/String;", "buildUserDetailJson", "", "reduceUserDetails", "(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;)Ljava/util/Map;", "Lio/getstream/chat/android/PrivacySettings;", "reducePrivacySettings", "(Lio/getstream/chat/android/PrivacySettings;)Ljava/util/Map;", "Lio/getstream/chat/android/client/socket/StreamWebSocket;", "createSocket", "(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;)Lio/getstream/chat/android/client/socket/StreamWebSocket;", "Lio/getstream/chat/android/client/parser/ChatParser;", "Lio/getstream/chat/android/client/token/TokenManager;", "Lio/getstream/chat/android/client/utils/HeadersUtil;", "Lud3/l0;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Companion", "ConnectionConf", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SocketFactory {
    private static final String X_STREAM_CLIENT = "X-Stream-Client";
    private final HeadersUtil headersUtil;
    private final C34826l0 httpClient;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final ChatParser parser;
    private final TokenManager tokenManager;

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0012\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\u0013R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000b\u0082\u0001\u0002\u0018\u0019¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;", "", "<init>", "()V", "value", "", "isReconnection", "()Z", "endpoint", "", "getEndpoint", "()Ljava/lang/String;", "apiKey", "getApiKey", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "getUser", "()Lio/getstream/chat/android/models/User;", "asReconnectionConf", "asReconnectionConf$stream_chat_android_client_release", "id", "getId$stream_chat_android_client_release", "AnonymousConnectionConf", "UserConnectionConf", "Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$AnonymousConnectionConf;", "Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$UserConnectionConf;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static abstract class ConnectionConf {
        private boolean isReconnection;

        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$AnonymousConnectionConf;", "Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;", "endpoint", "", "apiKey", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;)V", "getEndpoint", "()Ljava/lang/String;", "getApiKey", "getUser", "()Lio/getstream/chat/android/models/User;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class AnonymousConnectionConf extends ConnectionConf {
            private final String apiKey;
            private final String endpoint;
            private final User user;

            public AnonymousConnectionConf(String endpoint, String apiKey, User user) {
                AbstractC22676k.m65750j(endpoint, "endpoint");
                AbstractC22676k.m65750j(apiKey, "apiKey");
                AbstractC22676k.m65750j(user, "user");
                this.endpoint = endpoint;
                this.apiKey = apiKey;
                this.user = user;
            }

            public static /* synthetic */ AnonymousConnectionConf copy$default(AnonymousConnectionConf anonymousConnectionConf, String str, String str2, User user, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = anonymousConnectionConf.endpoint;
                }
                if ((i13 & 2) != 0) {
                    str2 = anonymousConnectionConf.apiKey;
                }
                if ((i13 & 4) != 0) {
                    user = anonymousConnectionConf.user;
                }
                return anonymousConnectionConf.copy(str, str2, user);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getEndpoint() {
                return this.endpoint;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getApiKey() {
                return this.apiKey;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final User getUser() {
                return this.user;
            }

            public final AnonymousConnectionConf copy(String endpoint, String apiKey, User user) {
                AbstractC22676k.m65750j(endpoint, "endpoint");
                AbstractC22676k.m65750j(apiKey, "apiKey");
                AbstractC22676k.m65750j(user, "user");
                return new AnonymousConnectionConf(endpoint, apiKey, user);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AnonymousConnectionConf)) {
                    return false;
                }
                AnonymousConnectionConf anonymousConnectionConf = (AnonymousConnectionConf) other;
                return AbstractC22676k.m65745e(this.endpoint, anonymousConnectionConf.endpoint) && AbstractC22676k.m65745e(this.apiKey, anonymousConnectionConf.apiKey) && AbstractC22676k.m65745e(this.user, anonymousConnectionConf.user);
            }

            @Override // io.getstream.chat.android.client.socket.SocketFactory.ConnectionConf
            public final String getApiKey() {
                return this.apiKey;
            }

            @Override // io.getstream.chat.android.client.socket.SocketFactory.ConnectionConf
            public final String getEndpoint() {
                return this.endpoint;
            }

            @Override // io.getstream.chat.android.client.socket.SocketFactory.ConnectionConf
            public final User getUser() {
                return this.user;
            }

            public final int hashCode() {
                return this.user.hashCode() + AbstractC11266d.m30450d(this.endpoint.hashCode() * 31, 31, this.apiKey);
            }

            public final String toString() {
                String str = this.endpoint;
                String str2 = this.apiKey;
                User user = this.user;
                StringBuilder sbM32001t = AbstractC11895b.m32001t("AnonymousConnectionConf(endpoint=", str, ", apiKey=", str2, ", user=");
                sbM32001t.append(user);
                sbM32001t.append(")");
                return sbM32001t.toString();
            }
        }

        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$UserConnectionConf;", "Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;", "endpoint", "", "apiKey", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;)V", "getEndpoint", "()Ljava/lang/String;", "getApiKey", "getUser", "()Lio/getstream/chat/android/models/User;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class UserConnectionConf extends ConnectionConf {
            private final String apiKey;
            private final String endpoint;
            private final User user;

            public UserConnectionConf(String endpoint, String apiKey, User user) {
                AbstractC22676k.m65750j(endpoint, "endpoint");
                AbstractC22676k.m65750j(apiKey, "apiKey");
                AbstractC22676k.m65750j(user, "user");
                this.endpoint = endpoint;
                this.apiKey = apiKey;
                this.user = user;
            }

            public static /* synthetic */ UserConnectionConf copy$default(UserConnectionConf userConnectionConf, String str, String str2, User user, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = userConnectionConf.endpoint;
                }
                if ((i13 & 2) != 0) {
                    str2 = userConnectionConf.apiKey;
                }
                if ((i13 & 4) != 0) {
                    user = userConnectionConf.user;
                }
                return userConnectionConf.copy(str, str2, user);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getEndpoint() {
                return this.endpoint;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getApiKey() {
                return this.apiKey;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final User getUser() {
                return this.user;
            }

            public final UserConnectionConf copy(String endpoint, String apiKey, User user) {
                AbstractC22676k.m65750j(endpoint, "endpoint");
                AbstractC22676k.m65750j(apiKey, "apiKey");
                AbstractC22676k.m65750j(user, "user");
                return new UserConnectionConf(endpoint, apiKey, user);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UserConnectionConf)) {
                    return false;
                }
                UserConnectionConf userConnectionConf = (UserConnectionConf) other;
                return AbstractC22676k.m65745e(this.endpoint, userConnectionConf.endpoint) && AbstractC22676k.m65745e(this.apiKey, userConnectionConf.apiKey) && AbstractC22676k.m65745e(this.user, userConnectionConf.user);
            }

            @Override // io.getstream.chat.android.client.socket.SocketFactory.ConnectionConf
            public final String getApiKey() {
                return this.apiKey;
            }

            @Override // io.getstream.chat.android.client.socket.SocketFactory.ConnectionConf
            public final String getEndpoint() {
                return this.endpoint;
            }

            @Override // io.getstream.chat.android.client.socket.SocketFactory.ConnectionConf
            public final User getUser() {
                return this.user;
            }

            public final int hashCode() {
                return this.user.hashCode() + AbstractC11266d.m30450d(this.endpoint.hashCode() * 31, 31, this.apiKey);
            }

            public final String toString() {
                String str = this.endpoint;
                String str2 = this.apiKey;
                User user = this.user;
                StringBuilder sbM32001t = AbstractC11895b.m32001t("UserConnectionConf(endpoint=", str, ", apiKey=", str2, ", user=");
                sbM32001t.append(user);
                sbM32001t.append(")");
                return sbM32001t.toString();
            }
        }

        private ConnectionConf() {
        }

        public final ConnectionConf asReconnectionConf$stream_chat_android_client_release() {
            this.isReconnection = true;
            return this;
        }

        public abstract String getApiKey();

        public abstract String getEndpoint();

        public final String getId$stream_chat_android_client_release() {
            if (this instanceof AnonymousConnectionConf) {
                return AbstractC39421y.m125926K(((AnonymousConnectionConf) this).getUser().getId(), "!", "", false);
            }
            if (this instanceof UserConnectionConf) {
                return ((UserConnectionConf) this).getUser().getId();
            }
            throw new NoWhenBranchMatchedException();
        }

        public abstract User getUser();

        /* JADX INFO: renamed from: isReconnection, reason: from getter */
        public final boolean getIsReconnection() {
            return this.isReconnection;
        }

        public ConnectionConf(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public SocketFactory(ChatParser parser, TokenManager tokenManager, HeadersUtil headersUtil, C34826l0 httpClient) {
        AbstractC22676k.m65750j(parser, "parser");
        AbstractC22676k.m65750j(tokenManager, "tokenManager");
        AbstractC22676k.m65750j(headersUtil, "headersUtil");
        AbstractC22676k.m65750j(httpClient, "httpClient");
        this.parser = parser;
        this.tokenManager = tokenManager;
        this.headersUtil = headersUtil;
        this.httpClient = httpClient;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:SocketFactory");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C23886g m54972a(SocketFactory socketFactory, C34832o0 c34832o0, AbstractC34814f1 abstractC34814f1) {
        return (C23886g) createSocket$lambda$1(socketFactory, c34832o0, abstractC34814f1);
    }

    private final C34832o0 buildRequest(ConnectionConf connectionConf) throws UnsupportedEncodingException {
        C34830n0 c34830n0 = new C34830n0();
        c34830n0.m109905f(buildUrl(connectionConf));
        c34830n0.m109900a(X_STREAM_CLIENT, this.headersUtil.buildSdkTrackingHeaders$stream_chat_android_client_release());
        return new C34832o0(c34830n0);
    }

    private final String buildUrl(ConnectionConf connectionConf) throws UnsupportedEncodingException {
        String strBuildUserDetailJson = buildUserDetailJson(connectionConf);
        try {
            Charset charset = StandardCharsets.UTF_8;
            String strEncode = URLEncoder.encode(strBuildUserDetailJson, charset.name());
            AbstractC22676k.m65749i(strEncode, "encode(...)");
            try {
                String strEncode2 = URLEncoder.encode(this.headersUtil.buildSdkTrackingHeaders$stream_chat_android_client_release(), charset.name());
                String str = connectionConf.getEndpoint() + "connect?json=" + strEncode + "&api_key=" + connectionConf.getApiKey() + "&X-Stream-Client=" + strEncode2;
                if (connectionConf instanceof ConnectionConf.AnonymousConnectionConf) {
                    return str + "&stream-auth-type=anonymous";
                }
                if (!(connectionConf instanceof ConnectionConf.UserConnectionConf)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.tokenManager.ensureTokenLoaded();
                return str + "&authorization=" + this.tokenManager.getToken() + "&stream-auth-type=jwt";
            } catch (UnsupportedEncodingException unused) {
                strBuildUserDetailJson = strEncode;
                throw new UnsupportedEncodingException("Unable to encode user details json: ".concat(strBuildUserDetailJson));
            }
        } catch (UnsupportedEncodingException unused2) {
        }
    }

    private final String buildUserDetailJson(ConnectionConf connectionConf) {
        return this.parser.toJson(AbstractC25247g0.m73990Y(new C23465k("user_details", reduceUserDetails(connectionConf)), new C23465k("user_id", connectionConf.getId$stream_chat_android_client_release()), new C23465k("server_determines_connection_id", Boolean.TRUE)));
    }

    private static final InterfaceC34811e1 createSocket$lambda$1(SocketFactory socketFactory, C34832o0 c34832o0, AbstractC34814f1 it) {
        AbstractC22676k.m65750j(it, "it");
        return socketFactory.httpClient.m109899c(c34832o0, it);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final Map<String, Object> reducePrivacySettings(PrivacySettings privacySettings) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TypingIndicators typingIndicators = privacySettings.getTypingIndicators();
        if (typingIndicators != null) {
            linkedHashMap.put("typing_indicators", AbstractC25247g0.m73989X(new C23465k("enabled", Boolean.valueOf(typingIndicators.getEnabled()))));
        }
        DeliveryReceipts deliveryReceipts = privacySettings.getDeliveryReceipts();
        if (deliveryReceipts != null) {
            linkedHashMap.put("delivery_receipts", AbstractC25247g0.m73989X(new C23465k("enabled", Boolean.valueOf(deliveryReceipts.getEnabled()))));
        }
        ReadReceipts readReceipts = privacySettings.getReadReceipts();
        if (readReceipts != null) {
            linkedHashMap.put("read_receipts", AbstractC25247g0.m73989X(new C23465k("enabled", Boolean.valueOf(readReceipts.getEnabled()))));
        }
        return linkedHashMap;
    }

    private final Map<String, Object> reduceUserDetails(ConnectionConf connectionConf) {
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("id", connectionConf.getId$stream_chat_android_client_release()));
        if (!connectionConf.getIsReconnection()) {
            if (!AbstractC39414r.m125890i0(connectionConf.getUser().getRole())) {
                linkedHashMapM73993b0.put("role", connectionConf.getUser().getRole());
            }
            Boolean banned = connectionConf.getUser().getBanned();
            if (banned != null) {
                linkedHashMapM73993b0.put("banned", banned);
            }
            Boolean invisible = connectionConf.getUser().getInvisible();
            if (invisible != null) {
                linkedHashMapM73993b0.put("invisible", invisible);
            }
            PrivacySettings privacySettings = connectionConf.getUser().getPrivacySettings();
            if (privacySettings != null) {
                linkedHashMapM73993b0.put("privacy_settings", reducePrivacySettings(privacySettings));
            }
            if (!connectionConf.getUser().getTeams().isEmpty()) {
                linkedHashMapM73993b0.put("teams", connectionConf.getUser().getTeams());
            }
            if (!AbstractC39414r.m125890i0(connectionConf.getUser().getLanguage())) {
                linkedHashMapM73993b0.put("language", connectionConf.getUser().getLanguage());
            }
            if (!AbstractC39414r.m125890i0(connectionConf.getUser().getImage())) {
                linkedHashMapM73993b0.put("image", connectionConf.getUser().getImage());
            }
            if (!AbstractC39414r.m125890i0(connectionConf.getUser().getName())) {
                linkedHashMapM73993b0.put("name", connectionConf.getUser().getName());
            }
            linkedHashMapM73993b0.putAll(connectionConf.getUser().getExtraData());
        }
        return linkedHashMapM73993b0;
    }

    public final StreamWebSocket createSocket(ConnectionConf connectionConf) throws UnsupportedEncodingException {
        AbstractC22676k.m65750j(connectionConf, "connectionConf");
        C34832o0 c34832o0BuildRequest = buildRequest(connectionConf);
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "new web socket: " + c34832o0BuildRequest.f146712a, null);
        }
        return new StreamWebSocket(this.parser, new C19442c(2, this, c34832o0BuildRequest));
    }

    public /* synthetic */ SocketFactory(ChatParser chatParser, TokenManager tokenManager, HeadersUtil headersUtil, C34826l0 c34826l0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(chatParser, tokenManager, headersUtil, (i13 & 8) != 0 ? new C34826l0() : c34826l0);
    }
}
