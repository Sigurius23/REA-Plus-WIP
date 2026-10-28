package io.getstream.chat.android.client.p224di;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.lifecycle.AbstractC1638x;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.StreamLifecycleObserver;
import io.getstream.chat.android.client.api.AnonymousApi;
import io.getstream.chat.android.client.api.AuthenticatedApi;
import io.getstream.chat.android.client.api.ChatApi;
import io.getstream.chat.android.client.api.ChatApiConfig;
import io.getstream.chat.android.client.api.ProxyChatApi;
import io.getstream.chat.android.client.api.RetrofitCallAdapterFactory;
import io.getstream.chat.android.client.api.RetrofitCdnApi;
import io.getstream.chat.android.client.api.interceptor.ApiKeyInterceptor;
import io.getstream.chat.android.client.api.interceptor.ApiRequestAnalyserInterceptor;
import io.getstream.chat.android.client.api.interceptor.HeadersInterceptor;
import io.getstream.chat.android.client.api.interceptor.HttpLoggingInterceptor;
import io.getstream.chat.android.client.api.interceptor.ProgressInterceptor;
import io.getstream.chat.android.client.api.interceptor.TokenAuthInterceptor;
import io.getstream.chat.android.client.api.internal.DistinctChatApi;
import io.getstream.chat.android.client.api.internal.DistinctChatApiEnabler;
import io.getstream.chat.android.client.api.internal.ExtraDataValidator;
import io.getstream.chat.android.client.api2.MoshiChatApi;
import io.getstream.chat.android.client.api2.endpoint.ChannelApi;
import io.getstream.chat.android.client.api2.endpoint.ConfigApi;
import io.getstream.chat.android.client.api2.endpoint.DeviceApi;
import io.getstream.chat.android.client.api2.endpoint.FileDownloadApi;
import io.getstream.chat.android.client.api2.endpoint.GeneralApi;
import io.getstream.chat.android.client.api2.endpoint.GuestApi;
import io.getstream.chat.android.client.api2.endpoint.MessageApi;
import io.getstream.chat.android.client.api2.endpoint.ModerationApi;
import io.getstream.chat.android.client.api2.endpoint.OpenGraphApi;
import io.getstream.chat.android.client.api2.endpoint.PollsApi;
import io.getstream.chat.android.client.api2.endpoint.PushPreferencesApi;
import io.getstream.chat.android.client.api2.endpoint.RemindersApi;
import io.getstream.chat.android.client.api2.endpoint.ThreadsApi;
import io.getstream.chat.android.client.api2.endpoint.UserApi;
import io.getstream.chat.android.client.api2.mapping.DomainMapping;
import io.getstream.chat.android.client.api2.mapping.DtoMapping;
import io.getstream.chat.android.client.api2.mapping.EventMapping;
import io.getstream.chat.android.client.cdn.CDN;
import io.getstream.chat.android.client.cdn.internal.CDNOkHttpInterceptor;
import io.getstream.chat.android.client.clientstate.UserStateService;
import io.getstream.chat.android.client.debugger.ChatClientDebugger;
import io.getstream.chat.android.client.interceptor.SendMessageInterceptor;
import io.getstream.chat.android.client.logger.ChatLogLevel;
import io.getstream.chat.android.client.network.NetworkStateProvider;
import io.getstream.chat.android.client.notifications.ChatNotifications;
import io.getstream.chat.android.client.notifications.ChatNotificationsImpl;
import io.getstream.chat.android.client.notifications.NoOpChatNotifications;
import io.getstream.chat.android.client.notifications.handler.NotificationConfig;
import io.getstream.chat.android.client.notifications.handler.NotificationHandler;
import io.getstream.chat.android.client.notifications.handler.NotificationHandlerFactory;
import io.getstream.chat.android.client.parser.ChatParser;
import io.getstream.chat.android.client.parser2.DirectEventParser;
import io.getstream.chat.android.client.parser2.MoshiChatParser;
import io.getstream.chat.android.client.plugins.requests.ApiRequestsAnalyser;
import io.getstream.chat.android.client.scope.ClientScope;
import io.getstream.chat.android.client.scope.UserScope;
import io.getstream.chat.android.client.setup.state.internal.MutableClientState;
import io.getstream.chat.android.client.socket.ChatSocket;
import io.getstream.chat.android.client.socket.SocketFactory;
import io.getstream.chat.android.client.token.TokenManager;
import io.getstream.chat.android.client.transformer.ApiModelTransformers;
import io.getstream.chat.android.client.uploader.FileTransformer;
import io.getstream.chat.android.client.uploader.FileUploader;
import io.getstream.chat.android.client.uploader.StreamFileUploader;
import io.getstream.chat.android.client.user.CurrentUserFetcher;
import io.getstream.chat.android.client.utils.HeadersUtil;
import io.getstream.chat.android.client.utils.internal.ServerClockOffset;
import java.lang.annotation.Annotation;
import java.util.concurrent.TimeUnit;
import l83.InterfaceC23462h;
import p007a6.C0438l0;
import p158fw.C14829i;
import p710im1.C18683m0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29222x0;
import pg3.C29224y0;
import q83.AbstractC30060g;
import ud3.C34824k0;
import ud3.C34826l0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000¶\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 µ\u00012\u00020\u0001:\u0002µ\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J!\u0010.\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010\n2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\n2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b0\u00101J7\u0010:\u001a\u0002092\u0006\u00102\u001a\u00020\u001e2\u0006\u00104\u001a\u0002032\u0006\u0010\t\u001a\u00020\b2\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020<2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b=\u0010>J/\u0010?\u001a\u00020<2\u0006\u00104\u001a\u0002032\u0006\u0010\t\u001a\u00020\b2\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b?\u0010@J%\u0010B\u001a\b\u0012\u0004\u0012\u0002070A2\u0006\u0010\t\u001a\u00020\b2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020E2\u0006\u0010D\u001a\u00020\bH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020%2\u0006\u0010D\u001a\u00020\bH\u0002¢\u0006\u0004\bH\u0010IJ\u0018\u0010K\u001a\u00028\u0000\"\u0006\b\u0000\u0010J\u0018\u0001H\u0082\b¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bQ\u0010RR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010SR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010TR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010UR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010VR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010WR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010XR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010YR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010ZR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010[R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\\R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010]R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010^R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010_R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010`R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010aR\u0016\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010aR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u001b\u0010k\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u001b\u0010p\u001a\u00020l8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bm\u0010h\u001a\u0004\bn\u0010oR\u001b\u0010u\u001a\u00020q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\br\u0010h\u001a\u0004\bs\u0010tR\u001d\u0010z\u001a\u0004\u0018\u00010v8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010h\u001a\u0004\bx\u0010yR\u001b\u0010~\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010h\u001a\u0004\b|\u0010}R\u001f\u0010\u0083\u0001\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0080\u0001\u0010h\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001e\u0010\u0086\u0001\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010h\u001a\u0005\b\u0085\u0001\u0010*R\u001e\u0010\u0089\u0001\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010h\u001a\u0005\b\u0088\u0001\u0010'R\u001f\u0010\u008d\u0001\u001a\u00020E8@X\u0080\u0084\u0002¢\u0006\u000f\n\u0005\b\u008a\u0001\u0010h\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R \u0010\u0092\u0001\u001a\u00030\u008e\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008f\u0001\u0010h\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R \u0010\u0097\u0001\u001a\u00030\u0093\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0094\u0001\u0010h\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R \u0010\u009c\u0001\u001a\u00030\u0098\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0099\u0001\u0010h\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001d\u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0006¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R \u0010¦\u0001\u001a\u00030¢\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b£\u0001\u0010h\u001a\u0006\b¤\u0001\u0010¥\u0001R \u0010«\u0001\u001a\u00030§\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b¨\u0001\u0010h\u001a\u0006\b©\u0001\u0010ª\u0001R&\u0010\u00ad\u0001\u001a\u0011\u0012\r\u0012\u000b\u0018\u00010\u001ej\u0005\u0018\u0001`¬\u00010A8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u001f\u0010²\u0001\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¯\u0001\u0010h\u001a\u0006\b°\u0001\u0010±\u0001R\u001e\u00108\u001a\u000207*\u0007\u0012\u0002\b\u00030³\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b8\u0010´\u0001¨\u0006¶\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/di/ChatModule;", "", "Landroid/content/Context;", "appContext", "Lio/getstream/chat/android/client/scope/ClientScope;", "clientScope", "Lio/getstream/chat/android/client/scope/UserScope;", "userScope", "Lio/getstream/chat/android/client/api/ChatApiConfig;", "config", "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;", "notificationsHandler", "Lio/getstream/chat/android/client/transformer/ApiModelTransformers;", "apiModelTransformers", "Lio/getstream/chat/android/client/uploader/FileTransformer;", "fileTransformer", "Lio/getstream/chat/android/client/uploader/FileUploader;", "fileUploader", "Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;", "sendMessageInterceptor", "Lio/getstream/chat/android/client/cdn/CDN;", "cdn", "Lio/getstream/chat/android/client/token/TokenManager;", "tokenManager", "Lud3/l0;", "customOkHttpClient", "Lio/getstream/chat/android/client/debugger/ChatClientDebugger;", "clientDebugger", "Landroidx/lifecycle/x;", "lifecycle", "", "appName", "appVersion", "Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;", "serverClockOffset", "<init>", "(Landroid/content/Context;Lio/getstream/chat/android/client/scope/ClientScope;Lio/getstream/chat/android/client/scope/UserScope;Lio/getstream/chat/android/client/api/ChatApiConfig;Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;Lio/getstream/chat/android/client/transformer/ApiModelTransformers;Lio/getstream/chat/android/client/uploader/FileTransformer;Lio/getstream/chat/android/client/uploader/FileUploader;Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;Lio/getstream/chat/android/client/cdn/CDN;Lio/getstream/chat/android/client/token/TokenManager;Lud3/l0;Lio/getstream/chat/android/client/debugger/ChatClientDebugger;Landroidx/lifecycle/x;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;)V", "Lio/getstream/chat/android/client/api/ChatApi;", "api", "()Lio/getstream/chat/android/client/api/ChatApi;", "Lio/getstream/chat/android/client/notifications/ChatNotifications;", "notifications", "()Lio/getstream/chat/android/client/notifications/ChatNotifications;", "handler", "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;", "notificationConfig", "buildChatNotifications", "(Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;)Lio/getstream/chat/android/client/notifications/ChatNotifications;", "defaultNotificationHandler", "(Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;)Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;", "endpoint", "", "timeout", "Lio/getstream/chat/android/client/parser/ChatParser;", "parser", "", "isAnonymousApi", "Lpg3/y0;", "buildRetrofit", "(Ljava/lang/String;JLio/getstream/chat/android/client/api/ChatApiConfig;Lio/getstream/chat/android/client/parser/ChatParser;Z)Lpg3/y0;", "Lud3/k0;", "baseClientBuilder", "(J)Lud3/k0;", "clientBuilder", "(JLio/getstream/chat/android/client/api/ChatApiConfig;Lio/getstream/chat/android/client/parser/ChatParser;Z)Lud3/k0;", "Lkotlin/Function0;", "getAnonymousProvider", "(Lio/getstream/chat/android/client/api/ChatApiConfig;Z)Lc93/a;", "chatConfig", "Lio/getstream/chat/android/client/socket/ChatSocket;", "buildChatSocket", "(Lio/getstream/chat/android/client/api/ChatApiConfig;)Lio/getstream/chat/android/client/socket/ChatSocket;", "buildApi", "(Lio/getstream/chat/android/client/api/ChatApiConfig;)Lio/getstream/chat/android/client/api/ChatApi;", "T", "buildRetrofitApi", "()Ljava/lang/Object;", "Lio/getstream/chat/android/client/api/RetrofitCdnApi;", "buildRetrofitCdnApi", "()Lio/getstream/chat/android/client/api/RetrofitCdnApi;", "Lio/getstream/chat/android/client/api2/endpoint/FileDownloadApi;", "buildFileDownloadApi", "()Lio/getstream/chat/android/client/api2/endpoint/FileDownloadApi;", "Landroid/content/Context;", "Lio/getstream/chat/android/client/scope/ClientScope;", "Lio/getstream/chat/android/client/scope/UserScope;", "Lio/getstream/chat/android/client/api/ChatApiConfig;", "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;", "Lio/getstream/chat/android/client/transformer/ApiModelTransformers;", "Lio/getstream/chat/android/client/uploader/FileTransformer;", "Lio/getstream/chat/android/client/uploader/FileUploader;", "Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;", "Lio/getstream/chat/android/client/cdn/CDN;", "Lio/getstream/chat/android/client/token/TokenManager;", "Lud3/l0;", "Lio/getstream/chat/android/client/debugger/ChatClientDebugger;", "Landroidx/lifecycle/x;", "Ljava/lang/String;", "Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;", "Lio/getstream/chat/android/client/utils/HeadersUtil;", "headersUtil", "Lio/getstream/chat/android/client/utils/HeadersUtil;", "Lio/getstream/chat/android/client/api2/mapping/DomainMapping;", "domainMapping$delegate", "Ll83/h;", "getDomainMapping", "()Lio/getstream/chat/android/client/api2/mapping/DomainMapping;", "domainMapping", "Lio/getstream/chat/android/client/api2/mapping/DtoMapping;", "dtoMapping$delegate", "getDtoMapping$stream_chat_android_client_release", "()Lio/getstream/chat/android/client/api2/mapping/DtoMapping;", "dtoMapping", "Lio/getstream/chat/android/client/api2/mapping/EventMapping;", "eventMapping$delegate", "getEventMapping", "()Lio/getstream/chat/android/client/api2/mapping/EventMapping;", "eventMapping", "Lio/getstream/chat/android/client/parser2/DirectEventParser;", "directEventParser$delegate", "getDirectEventParser", "()Lio/getstream/chat/android/client/parser2/DirectEventParser;", "directEventParser", "moshiParser$delegate", "getMoshiParser", "()Lio/getstream/chat/android/client/parser/ChatParser;", "moshiParser", "Lio/getstream/chat/android/client/socket/SocketFactory;", "socketFactory$delegate", "getSocketFactory", "()Lio/getstream/chat/android/client/socket/SocketFactory;", "socketFactory", "defaultNotifications$delegate", "getDefaultNotifications", "defaultNotifications", "defaultApi$delegate", "getDefaultApi", "defaultApi", "chatSocket$delegate", "getChatSocket$stream_chat_android_client_release", "()Lio/getstream/chat/android/client/socket/ChatSocket;", "chatSocket", "Lio/getstream/chat/android/client/uploader/StreamFileUploader;", "defaultFileUploader$delegate", "getDefaultFileUploader", "()Lio/getstream/chat/android/client/uploader/StreamFileUploader;", "defaultFileUploader", "Lio/getstream/chat/android/client/StreamLifecycleObserver;", "lifecycleObserver$delegate", "getLifecycleObserver", "()Lio/getstream/chat/android/client/StreamLifecycleObserver;", "lifecycleObserver", "Lio/getstream/chat/android/client/network/NetworkStateProvider;", "networkStateProvider$delegate", "getNetworkStateProvider", "()Lio/getstream/chat/android/client/network/NetworkStateProvider;", "networkStateProvider", "Lio/getstream/chat/android/client/clientstate/UserStateService;", "userStateService", "Lio/getstream/chat/android/client/clientstate/UserStateService;", "getUserStateService", "()Lio/getstream/chat/android/client/clientstate/UserStateService;", "Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;", "mutableClientState$delegate", "getMutableClientState", "()Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;", "mutableClientState", "Lio/getstream/chat/android/client/user/CurrentUserFetcher;", "currentUserFetcher$delegate", "getCurrentUserFetcher", "()Lio/getstream/chat/android/client/user/CurrentUserFetcher;", "currentUserFetcher", "Lio/getstream/chat/android/models/UserId;", "currentUserIdProvider", "Lc93/a;", "baseClient$delegate", "getBaseClient", "()Lud3/l0;", "baseClient", "Ljava/lang/Class;", "(Ljava/lang/Class;)Z", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatModule {
    private static final long BASE_TIMEOUT = 30000;
    private static final long CDN_TIMEOUT = 30000;
    private static final Companion Companion = new Companion();
    private final ApiModelTransformers apiModelTransformers;
    private final Context appContext;
    private final String appName;
    private final String appVersion;

    /* JADX INFO: renamed from: baseClient$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h baseClient;
    private final CDN cdn;

    /* JADX INFO: renamed from: chatSocket$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h chatSocket;
    private final ChatClientDebugger clientDebugger;
    private final ClientScope clientScope;
    private final ChatApiConfig config;

    /* JADX INFO: renamed from: currentUserFetcher$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h currentUserFetcher;
    private final InterfaceC4339a currentUserIdProvider;
    private final C34826l0 customOkHttpClient;

    /* JADX INFO: renamed from: defaultApi$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h defaultApi;

    /* JADX INFO: renamed from: defaultFileUploader$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h defaultFileUploader;

    /* JADX INFO: renamed from: defaultNotifications$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h defaultNotifications;

    /* JADX INFO: renamed from: directEventParser$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h directEventParser;

    /* JADX INFO: renamed from: domainMapping$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h domainMapping;

    /* JADX INFO: renamed from: dtoMapping$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h dtoMapping;

    /* JADX INFO: renamed from: eventMapping$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h eventMapping;
    private final FileTransformer fileTransformer;
    private final FileUploader fileUploader;
    private final HeadersUtil headersUtil;
    private final AbstractC1638x lifecycle;

    /* JADX INFO: renamed from: lifecycleObserver$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h lifecycleObserver;

    /* JADX INFO: renamed from: moshiParser$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h moshiParser;

    /* JADX INFO: renamed from: mutableClientState$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h mutableClientState;

    /* JADX INFO: renamed from: networkStateProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h networkStateProvider;
    private final NotificationHandler notificationsHandler;
    private final SendMessageInterceptor sendMessageInterceptor;
    private final ServerClockOffset serverClockOffset;

    /* JADX INFO: renamed from: socketFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h socketFactory;
    private final TokenManager tokenManager;
    private final UserScope userScope;
    private final UserStateService userStateService;

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/chat/android/client/di/ChatModule$Companion;", "", "<init>", "()V", "BASE_TIMEOUT", "", "CDN_TIMEOUT", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ChatModule(Context appContext, ClientScope clientScope, UserScope userScope, ChatApiConfig config, NotificationHandler notificationHandler, ApiModelTransformers apiModelTransformers, FileTransformer fileTransformer, FileUploader fileUploader, SendMessageInterceptor sendMessageInterceptor, CDN cdn, TokenManager tokenManager, C34826l0 c34826l0, ChatClientDebugger chatClientDebugger, AbstractC1638x lifecycle, String str, String str2, ServerClockOffset serverClockOffset) {
        AbstractC22676k.m65750j(appContext, "appContext");
        AbstractC22676k.m65750j(clientScope, "clientScope");
        AbstractC22676k.m65750j(userScope, "userScope");
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(apiModelTransformers, "apiModelTransformers");
        AbstractC22676k.m65750j(fileTransformer, "fileTransformer");
        AbstractC22676k.m65750j(tokenManager, "tokenManager");
        AbstractC22676k.m65750j(lifecycle, "lifecycle");
        AbstractC22676k.m65750j(serverClockOffset, "serverClockOffset");
        this.appContext = appContext;
        this.clientScope = clientScope;
        this.userScope = userScope;
        this.config = config;
        this.notificationsHandler = notificationHandler;
        this.apiModelTransformers = apiModelTransformers;
        this.fileTransformer = fileTransformer;
        this.fileUploader = fileUploader;
        this.sendMessageInterceptor = sendMessageInterceptor;
        this.cdn = cdn;
        this.tokenManager = tokenManager;
        this.customOkHttpClient = c34826l0;
        this.clientDebugger = chatClientDebugger;
        this.lifecycle = lifecycle;
        this.appName = str;
        this.appVersion = str2;
        this.serverClockOffset = serverClockOffset;
        this.headersUtil = new HeadersUtil(appContext, str, str2);
        final int i13 = 0;
        this.domainMapping = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.di.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatModule f73788x;

            {
                this.f73788x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return ChatModule.domainMapping_delegate$lambda$0(this.f73788x);
                    case 1:
                        return ChatModule.moshiParser_delegate$lambda$4(this.f73788x);
                    case 2:
                        return ChatModule.socketFactory_delegate$lambda$5(this.f73788x);
                    case 3:
                        return ChatModule.defaultNotifications_delegate$lambda$6(this.f73788x);
                    case 4:
                        return ChatModule.m54662o(this.f73788x);
                    case 5:
                        return ChatModule.m54656i(this.f73788x);
                    case 6:
                        return ChatModule.m54651d(this.f73788x);
                    case 7:
                        return ChatModule.m54659l(this.f73788x);
                    case 8:
                        return ChatModule.networkStateProvider_delegate$lambda$11(this.f73788x);
                    case 9:
                        return new MutableClientState(this.f73788x.getNetworkStateProvider());
                    case 10:
                        return ChatModule.currentUserFetcher_delegate$lambda$13(this.f73788x);
                    case 11:
                        return ChatModule.m54650c(this.f73788x);
                    case 12:
                        return ChatModule.m54663p(this.f73788x);
                    case 13:
                        return ChatModule.dtoMapping_delegate$lambda$1(this.f73788x);
                    case 14:
                        return ChatModule.m54660m(this.f73788x);
                    default:
                        return ChatModule.directEventParser_delegate$lambda$3(this.f73788x);
                }
            }
        });
        final int i14 = 13;
        this.dtoMapping = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.di.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatModule f73788x;

            {
                this.f73788x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return ChatModule.domainMapping_delegate$lambda$0(this.f73788x);
                    case 1:
                        return ChatModule.moshiParser_delegate$lambda$4(this.f73788x);
                    case 2:
                        return ChatModule.socketFactory_delegate$lambda$5(this.f73788x);
                    case 3:
                        return ChatModule.defaultNotifications_delegate$lambda$6(this.f73788x);
                    case 4:
                        return ChatModule.m54662o(this.f73788x);
                    case 5:
                        return ChatModule.m54656i(this.f73788x);
                    case 6:
                        return ChatModule.m54651d(this.f73788x);
                    case 7:
                        return ChatModule.m54659l(this.f73788x);
                    case 8:
                        return ChatModule.networkStateProvider_delegate$lambda$11(this.f73788x);
                    case 9:
                        return new MutableClientState(this.f73788x.getNetworkStateProvider());
                    case 10:
                        return ChatModule.currentUserFetcher_delegate$lambda$13(this.f73788x);
                    case 11:
                        return ChatModule.m54650c(this.f73788x);
                    case 12:
                        return ChatModule.m54663p(this.f73788x);
                    case 13:
                        return ChatModule.dtoMapping_delegate$lambda$1(this.f73788x);
                    case 14:
                        return ChatModule.m54660m(this.f73788x);
                    default:
                        return ChatModule.directEventParser_delegate$lambda$3(this.f73788x);
                }
            }
        });
        final int i15 = 14;
        this.eventMapping = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.di.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatModule f73788x;

            {
                this.f73788x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return ChatModule.domainMapping_delegate$lambda$0(this.f73788x);
                    case 1:
                        return ChatModule.moshiParser_delegate$lambda$4(this.f73788x);
                    case 2:
                        return ChatModule.socketFactory_delegate$lambda$5(this.f73788x);
                    case 3:
                        return ChatModule.defaultNotifications_delegate$lambda$6(this.f73788x);
                    case 4:
                        return ChatModule.m54662o(this.f73788x);
                    case 5:
                        return ChatModule.m54656i(this.f73788x);
                    case 6:
                        return ChatModule.m54651d(this.f73788x);
                    case 7:
                        return ChatModule.m54659l(this.f73788x);
                    case 8:
                        return ChatModule.networkStateProvider_delegate$lambda$11(this.f73788x);
                    case 9:
                        return new MutableClientState(this.f73788x.getNetworkStateProvider());
                    case 10:
                        return ChatModule.currentUserFetcher_delegate$lambda$13(this.f73788x);
                    case 11:
                        return ChatModule.m54650c(this.f73788x);
                    case 12:
                        return ChatModule.m54663p(this.f73788x);
                    case 13:
                        return ChatModule.dtoMapping_delegate$lambda$1(this.f73788x);
                    case 14:
                        return ChatModule.m54660m(this.f73788x);
                    default:
                        return ChatModule.directEventParser_delegate$lambda$3(this.f73788x);
                }
            }
        });
        final int i16 = 15;
        this.directEventParser = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.di.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatModule f73788x;

            {
                this.f73788x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return ChatModule.domainMapping_delegate$lambda$0(this.f73788x);
                    case 1:
                        return ChatModule.moshiParser_delegate$lambda$4(this.f73788x);
                    case 2:
                        return ChatModule.socketFactory_delegate$lambda$5(this.f73788x);
                    case 3:
                        return ChatModule.defaultNotifications_delegate$lambda$6(this.f73788x);
                    case 4:
                        return ChatModule.m54662o(this.f73788x);
                    case 5:
                        return ChatModule.m54656i(this.f73788x);
                    case 6:
                        return ChatModule.m54651d(this.f73788x);
                    case 7:
                        return ChatModule.m54659l(this.f73788x);
                    case 8:
                        return ChatModule.networkStateProvider_delegate$lambda$11(this.f73788x);
                    case 9:
                        return new MutableClientState(this.f73788x.getNetworkStateProvider());
                    case 10:
                        return ChatModule.currentUserFetcher_delegate$lambda$13(this.f73788x);
                    case 11:
                        return ChatModule.m54650c(this.f73788x);
                    case 12:
                        return ChatModule.m54663p(this.f73788x);
                    case 13:
                        return ChatModule.dtoMapping_delegate$lambda$1(this.f73788x);
                    case 14:
                        return ChatModule.m54660m(this.f73788x);
                    default:
                        return ChatModule.directEventParser_delegate$lambda$3(this.f73788x);
                }
            }
        });
        final int i17 = 1;
        this.moshiParser = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.di.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatModule f73788x;

            {
                this.f73788x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return ChatModule.domainMapping_delegate$lambda$0(this.f73788x);
                    case 1:
                        return ChatModule.moshiParser_delegate$lambda$4(this.f73788x);
                    case 2:
                        return ChatModule.socketFactory_delegate$lambda$5(this.f73788x);
                    case 3:
                        return ChatModule.defaultNotifications_delegate$lambda$6(this.f73788x);
                    case 4:
                        return ChatModule.m54662o(this.f73788x);
                    case 5:
                        return ChatModule.m54656i(this.f73788x);
                    case 6:
                        return ChatModule.m54651d(this.f73788x);
                    case 7:
                        return ChatModule.m54659l(this.f73788x);
                    case 8:
                        return ChatModule.networkStateProvider_delegate$lambda$11(this.f73788x);
                    case 9:
                        return new MutableClientState(this.f73788x.getNetworkStateProvider());
                    case 10:
                        return ChatModule.currentUserFetcher_delegate$lambda$13(this.f73788x);
                    case 11:
                        return ChatModule.m54650c(this.f73788x);
                    case 12:
                        return ChatModule.m54663p(this.f73788x);
                    case 13:
                        return ChatModule.dtoMapping_delegate$lambda$1(this.f73788x);
                    case 14:
                        return ChatModule.m54660m(this.f73788x);
                    default:
                        return ChatModule.directEventParser_delegate$lambda$3(this.f73788x);
                }
            }
        });
        final int i18 = 2;
        this.socketFactory = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.di.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatModule f73788x;

            {
                this.f73788x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        return ChatModule.domainMapping_delegate$lambda$0(this.f73788x);
                    case 1:
                        return ChatModule.moshiParser_delegate$lambda$4(this.f73788x);
                    case 2:
                        return ChatModule.socketFactory_delegate$lambda$5(this.f73788x);
                    case 3:
                        return ChatModule.defaultNotifications_delegate$lambda$6(this.f73788x);
                    case 4:
                        return ChatModule.m54662o(this.f73788x);
                    case 5:
                        return ChatModule.m54656i(this.f73788x);
                    case 6:
                        return ChatModule.m54651d(this.f73788x);
                    case 7:
                        return ChatModule.m54659l(this.f73788x);
                    case 8:
                        return ChatModule.networkStateProvider_delegate$lambda$11(this.f73788x);
                    case 9:
                        return new MutableClientState(this.f73788x.getNetworkStateProvider());
                    case 10:
                        return ChatModule.currentUserFetcher_delegate$lambda$13(this.f73788x);
                    case 11:
                        return ChatModule.m54650c(this.f73788x);
                    case 12:
                        return ChatModule.m54663p(this.f73788x);
                    case 13:
                        return ChatModule.dtoMapping_delegate$lambda$1(this.f73788x);
                    case 14:
                        return ChatModule.m54660m(this.f73788x);
                    default:
                        return ChatModule.directEventParser_delegate$lambda$3(this.f73788x);
                }
            }
        });
        final int i19 = 3;
        this.defaultNotifications = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.di.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatModule f73788x;

            {
                this.f73788x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        return ChatModule.domainMapping_delegate$lambda$0(this.f73788x);
                    case 1:
                        return ChatModule.moshiParser_delegate$lambda$4(this.f73788x);
                    case 2:
                        return ChatModule.socketFactory_delegate$lambda$5(this.f73788x);
                    case 3:
                        return ChatModule.defaultNotifications_delegate$lambda$6(this.f73788x);
                    case 4:
                        return ChatModule.m54662o(this.f73788x);
                    case 5:
                        return ChatModule.m54656i(this.f73788x);
                    case 6:
                        return ChatModule.m54651d(this.f73788x);
                    case 7:
                        return ChatModule.m54659l(this.f73788x);
                    case 8:
                        return ChatModule.networkStateProvider_delegate$lambda$11(this.f73788x);
                    case 9:
                        return new MutableClientState(this.f73788x.getNetworkStateProvider());
                    case 10:
                        return ChatModule.currentUserFetcher_delegate$lambda$13(this.f73788x);
                    case 11:
                        return ChatModule.m54650c(this.f73788x);
                    case 12:
                        return ChatModule.m54663p(this.f73788x);
                    case 13:
                        return ChatModule.dtoMapping_delegate$lambda$1(this.f73788x);
                    case 14:
                        return ChatModule.m54660m(this.f73788x);
                    default:
                        return ChatModule.directEventParser_delegate$lambda$3(this.f73788x);
                }
            }
        });
        final int i24 = 4;
        this.defaultApi = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.di.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatModule f73788x;

            {
                this.f73788x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i24) {
                    case 0:
                        return ChatModule.domainMapping_delegate$lambda$0(this.f73788x);
                    case 1:
                        return ChatModule.moshiParser_delegate$lambda$4(this.f73788x);
                    case 2:
                        return ChatModule.socketFactory_delegate$lambda$5(this.f73788x);
                    case 3:
                        return ChatModule.defaultNotifications_delegate$lambda$6(this.f73788x);
                    case 4:
                        return ChatModule.m54662o(this.f73788x);
                    case 5:
                        return ChatModule.m54656i(this.f73788x);
                    case 6:
                        return ChatModule.m54651d(this.f73788x);
                    case 7:
                        return ChatModule.m54659l(this.f73788x);
                    case 8:
                        return ChatModule.networkStateProvider_delegate$lambda$11(this.f73788x);
                    case 9:
                        return new MutableClientState(this.f73788x.getNetworkStateProvider());
                    case 10:
                        return ChatModule.currentUserFetcher_delegate$lambda$13(this.f73788x);
                    case 11:
                        return ChatModule.m54650c(this.f73788x);
                    case 12:
                        return ChatModule.m54663p(this.f73788x);
                    case 13:
                        return ChatModule.dtoMapping_delegate$lambda$1(this.f73788x);
                    case 14:
                        return ChatModule.m54660m(this.f73788x);
                    default:
                        return ChatModule.directEventParser_delegate$lambda$3(this.f73788x);
                }
            }
        });
        final int i25 = 5;
        this.chatSocket = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.di.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatModule f73788x;

            {
                this.f73788x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i25) {
                    case 0:
                        return ChatModule.domainMapping_delegate$lambda$0(this.f73788x);
                    case 1:
                        return ChatModule.moshiParser_delegate$lambda$4(this.f73788x);
                    case 2:
                        return ChatModule.socketFactory_delegate$lambda$5(this.f73788x);
                    case 3:
                        return ChatModule.defaultNotifications_delegate$lambda$6(this.f73788x);
                    case 4:
                        return ChatModule.m54662o(this.f73788x);
                    case 5:
                        return ChatModule.m54656i(this.f73788x);
                    case 6:
                        return ChatModule.m54651d(this.f73788x);
                    case 7:
                        return ChatModule.m54659l(this.f73788x);
                    case 8:
                        return ChatModule.networkStateProvider_delegate$lambda$11(this.f73788x);
                    case 9:
                        return new MutableClientState(this.f73788x.getNetworkStateProvider());
                    case 10:
                        return ChatModule.currentUserFetcher_delegate$lambda$13(this.f73788x);
                    case 11:
                        return ChatModule.m54650c(this.f73788x);
                    case 12:
                        return ChatModule.m54663p(this.f73788x);
                    case 13:
                        return ChatModule.dtoMapping_delegate$lambda$1(this.f73788x);
                    case 14:
                        return ChatModule.m54660m(this.f73788x);
                    default:
                        return ChatModule.directEventParser_delegate$lambda$3(this.f73788x);
                }
            }
        });
        final int i26 = 6;
        this.defaultFileUploader = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.di.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatModule f73788x;

            {
                this.f73788x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i26) {
                    case 0:
                        return ChatModule.domainMapping_delegate$lambda$0(this.f73788x);
                    case 1:
                        return ChatModule.moshiParser_delegate$lambda$4(this.f73788x);
                    case 2:
                        return ChatModule.socketFactory_delegate$lambda$5(this.f73788x);
                    case 3:
                        return ChatModule.defaultNotifications_delegate$lambda$6(this.f73788x);
                    case 4:
                        return ChatModule.m54662o(this.f73788x);
                    case 5:
                        return ChatModule.m54656i(this.f73788x);
                    case 6:
                        return ChatModule.m54651d(this.f73788x);
                    case 7:
                        return ChatModule.m54659l(this.f73788x);
                    case 8:
                        return ChatModule.networkStateProvider_delegate$lambda$11(this.f73788x);
                    case 9:
                        return new MutableClientState(this.f73788x.getNetworkStateProvider());
                    case 10:
                        return ChatModule.currentUserFetcher_delegate$lambda$13(this.f73788x);
                    case 11:
                        return ChatModule.m54650c(this.f73788x);
                    case 12:
                        return ChatModule.m54663p(this.f73788x);
                    case 13:
                        return ChatModule.dtoMapping_delegate$lambda$1(this.f73788x);
                    case 14:
                        return ChatModule.m54660m(this.f73788x);
                    default:
                        return ChatModule.directEventParser_delegate$lambda$3(this.f73788x);
                }
            }
        });
        final int i27 = 7;
        this.lifecycleObserver = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.di.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatModule f73788x;

            {
                this.f73788x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i27) {
                    case 0:
                        return ChatModule.domainMapping_delegate$lambda$0(this.f73788x);
                    case 1:
                        return ChatModule.moshiParser_delegate$lambda$4(this.f73788x);
                    case 2:
                        return ChatModule.socketFactory_delegate$lambda$5(this.f73788x);
                    case 3:
                        return ChatModule.defaultNotifications_delegate$lambda$6(this.f73788x);
                    case 4:
                        return ChatModule.m54662o(this.f73788x);
                    case 5:
                        return ChatModule.m54656i(this.f73788x);
                    case 6:
                        return ChatModule.m54651d(this.f73788x);
                    case 7:
                        return ChatModule.m54659l(this.f73788x);
                    case 8:
                        return ChatModule.networkStateProvider_delegate$lambda$11(this.f73788x);
                    case 9:
                        return new MutableClientState(this.f73788x.getNetworkStateProvider());
                    case 10:
                        return ChatModule.currentUserFetcher_delegate$lambda$13(this.f73788x);
                    case 11:
                        return ChatModule.m54650c(this.f73788x);
                    case 12:
                        return ChatModule.m54663p(this.f73788x);
                    case 13:
                        return ChatModule.dtoMapping_delegate$lambda$1(this.f73788x);
                    case 14:
                        return ChatModule.m54660m(this.f73788x);
                    default:
                        return ChatModule.directEventParser_delegate$lambda$3(this.f73788x);
                }
            }
        });
        final int i28 = 8;
        this.networkStateProvider = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.di.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatModule f73788x;

            {
                this.f73788x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i28) {
                    case 0:
                        return ChatModule.domainMapping_delegate$lambda$0(this.f73788x);
                    case 1:
                        return ChatModule.moshiParser_delegate$lambda$4(this.f73788x);
                    case 2:
                        return ChatModule.socketFactory_delegate$lambda$5(this.f73788x);
                    case 3:
                        return ChatModule.defaultNotifications_delegate$lambda$6(this.f73788x);
                    case 4:
                        return ChatModule.m54662o(this.f73788x);
                    case 5:
                        return ChatModule.m54656i(this.f73788x);
                    case 6:
                        return ChatModule.m54651d(this.f73788x);
                    case 7:
                        return ChatModule.m54659l(this.f73788x);
                    case 8:
                        return ChatModule.networkStateProvider_delegate$lambda$11(this.f73788x);
                    case 9:
                        return new MutableClientState(this.f73788x.getNetworkStateProvider());
                    case 10:
                        return ChatModule.currentUserFetcher_delegate$lambda$13(this.f73788x);
                    case 11:
                        return ChatModule.m54650c(this.f73788x);
                    case 12:
                        return ChatModule.m54663p(this.f73788x);
                    case 13:
                        return ChatModule.dtoMapping_delegate$lambda$1(this.f73788x);
                    case 14:
                        return ChatModule.m54660m(this.f73788x);
                    default:
                        return ChatModule.directEventParser_delegate$lambda$3(this.f73788x);
                }
            }
        });
        this.userStateService = new UserStateService();
        final int i29 = 9;
        this.mutableClientState = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.di.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatModule f73788x;

            {
                this.f73788x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i29) {
                    case 0:
                        return ChatModule.domainMapping_delegate$lambda$0(this.f73788x);
                    case 1:
                        return ChatModule.moshiParser_delegate$lambda$4(this.f73788x);
                    case 2:
                        return ChatModule.socketFactory_delegate$lambda$5(this.f73788x);
                    case 3:
                        return ChatModule.defaultNotifications_delegate$lambda$6(this.f73788x);
                    case 4:
                        return ChatModule.m54662o(this.f73788x);
                    case 5:
                        return ChatModule.m54656i(this.f73788x);
                    case 6:
                        return ChatModule.m54651d(this.f73788x);
                    case 7:
                        return ChatModule.m54659l(this.f73788x);
                    case 8:
                        return ChatModule.networkStateProvider_delegate$lambda$11(this.f73788x);
                    case 9:
                        return new MutableClientState(this.f73788x.getNetworkStateProvider());
                    case 10:
                        return ChatModule.currentUserFetcher_delegate$lambda$13(this.f73788x);
                    case 11:
                        return ChatModule.m54650c(this.f73788x);
                    case 12:
                        return ChatModule.m54663p(this.f73788x);
                    case 13:
                        return ChatModule.dtoMapping_delegate$lambda$1(this.f73788x);
                    case 14:
                        return ChatModule.m54660m(this.f73788x);
                    default:
                        return ChatModule.directEventParser_delegate$lambda$3(this.f73788x);
                }
            }
        });
        final int i34 = 10;
        this.currentUserFetcher = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.di.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatModule f73788x;

            {
                this.f73788x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i34) {
                    case 0:
                        return ChatModule.domainMapping_delegate$lambda$0(this.f73788x);
                    case 1:
                        return ChatModule.moshiParser_delegate$lambda$4(this.f73788x);
                    case 2:
                        return ChatModule.socketFactory_delegate$lambda$5(this.f73788x);
                    case 3:
                        return ChatModule.defaultNotifications_delegate$lambda$6(this.f73788x);
                    case 4:
                        return ChatModule.m54662o(this.f73788x);
                    case 5:
                        return ChatModule.m54656i(this.f73788x);
                    case 6:
                        return ChatModule.m54651d(this.f73788x);
                    case 7:
                        return ChatModule.m54659l(this.f73788x);
                    case 8:
                        return ChatModule.networkStateProvider_delegate$lambda$11(this.f73788x);
                    case 9:
                        return new MutableClientState(this.f73788x.getNetworkStateProvider());
                    case 10:
                        return ChatModule.currentUserFetcher_delegate$lambda$13(this.f73788x);
                    case 11:
                        return ChatModule.m54650c(this.f73788x);
                    case 12:
                        return ChatModule.m54663p(this.f73788x);
                    case 13:
                        return ChatModule.dtoMapping_delegate$lambda$1(this.f73788x);
                    case 14:
                        return ChatModule.m54660m(this.f73788x);
                    default:
                        return ChatModule.directEventParser_delegate$lambda$3(this.f73788x);
                }
            }
        });
        final int i35 = 11;
        this.currentUserIdProvider = new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.di.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatModule f73788x;

            {
                this.f73788x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i35) {
                    case 0:
                        return ChatModule.domainMapping_delegate$lambda$0(this.f73788x);
                    case 1:
                        return ChatModule.moshiParser_delegate$lambda$4(this.f73788x);
                    case 2:
                        return ChatModule.socketFactory_delegate$lambda$5(this.f73788x);
                    case 3:
                        return ChatModule.defaultNotifications_delegate$lambda$6(this.f73788x);
                    case 4:
                        return ChatModule.m54662o(this.f73788x);
                    case 5:
                        return ChatModule.m54656i(this.f73788x);
                    case 6:
                        return ChatModule.m54651d(this.f73788x);
                    case 7:
                        return ChatModule.m54659l(this.f73788x);
                    case 8:
                        return ChatModule.networkStateProvider_delegate$lambda$11(this.f73788x);
                    case 9:
                        return new MutableClientState(this.f73788x.getNetworkStateProvider());
                    case 10:
                        return ChatModule.currentUserFetcher_delegate$lambda$13(this.f73788x);
                    case 11:
                        return ChatModule.m54650c(this.f73788x);
                    case 12:
                        return ChatModule.m54663p(this.f73788x);
                    case 13:
                        return ChatModule.dtoMapping_delegate$lambda$1(this.f73788x);
                    case 14:
                        return ChatModule.m54660m(this.f73788x);
                    default:
                        return ChatModule.directEventParser_delegate$lambda$3(this.f73788x);
                }
            }
        };
        final int i36 = 12;
        this.baseClient = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.di.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatModule f73788x;

            {
                this.f73788x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i36) {
                    case 0:
                        return ChatModule.domainMapping_delegate$lambda$0(this.f73788x);
                    case 1:
                        return ChatModule.moshiParser_delegate$lambda$4(this.f73788x);
                    case 2:
                        return ChatModule.socketFactory_delegate$lambda$5(this.f73788x);
                    case 3:
                        return ChatModule.defaultNotifications_delegate$lambda$6(this.f73788x);
                    case 4:
                        return ChatModule.m54662o(this.f73788x);
                    case 5:
                        return ChatModule.m54656i(this.f73788x);
                    case 6:
                        return ChatModule.m54651d(this.f73788x);
                    case 7:
                        return ChatModule.m54659l(this.f73788x);
                    case 8:
                        return ChatModule.networkStateProvider_delegate$lambda$11(this.f73788x);
                    case 9:
                        return new MutableClientState(this.f73788x.getNetworkStateProvider());
                    case 10:
                        return ChatModule.currentUserFetcher_delegate$lambda$13(this.f73788x);
                    case 11:
                        return ChatModule.m54650c(this.f73788x);
                    case 12:
                        return ChatModule.m54663p(this.f73788x);
                    case 13:
                        return ChatModule.dtoMapping_delegate$lambda$1(this.f73788x);
                    case 14:
                        return ChatModule.m54660m(this.f73788x);
                    default:
                        return ChatModule.directEventParser_delegate$lambda$3(this.f73788x);
                }
            }
        });
    }

    private final C34824k0 baseClientBuilder(long timeout) {
        C34824k0 c34824k0M109897a = getBaseClient().m109897a();
        c34824k0M109897a.f146620i = false;
        if (!AbstractC22676k.m65745e(getBaseClient(), this.customOkHttpClient)) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c34824k0M109897a.m109892b(timeout, timeUnit);
            c34824k0M109897a.m109896f(timeout, timeUnit);
            c34824k0M109897a.m109895e(timeout, timeUnit);
        }
        if (this.config.getDebugRequests()) {
            c34824k0M109897a.m109891a(new ApiRequestAnalyserInterceptor(ApiRequestsAnalyser.INSTANCE.get()));
        }
        if (this.config.getLoggerConfig().getLevel() != ChatLogLevel.NOTHING) {
            c34824k0M109897a.m109891a(new HttpLoggingInterceptor());
            c34824k0M109897a.m109891a(new C14829i(new ChatModule$baseClientBuilder$1$1()));
        }
        return c34824k0M109897a;
    }

    private static final C34826l0 baseClient_delegate$lambda$15(ChatModule chatModule) {
        C34826l0 c34826l0 = chatModule.customOkHttpClient;
        return c34826l0 == null ? new C34826l0() : c34826l0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChatApi buildApi(ChatApiConfig chatConfig) {
        DomainMapping domainMapping = getDomainMapping();
        EventMapping eventMapping = getEventMapping();
        DtoMapping dtoMapping$stream_chat_android_client_release = getDtoMapping$stream_chat_android_client_release();
        FileUploader defaultFileUploader = this.fileUploader;
        if (defaultFileUploader == null) {
            defaultFileUploader = getDefaultFileUploader();
        }
        FileUploader fileUploader = defaultFileUploader;
        FileTransformer fileTransformer = this.fileTransformer;
        UserApi userApi = (UserApi) buildRetrofit(this.config.getHttpUrl(), 30000L, this.config, getMoshiParser(), isAnonymousApi(UserApi.class)).m88733b(UserApi.class);
        GuestApi guestApi = (GuestApi) buildRetrofit(this.config.getHttpUrl(), 30000L, this.config, getMoshiParser(), isAnonymousApi(GuestApi.class)).m88733b(GuestApi.class);
        MessageApi messageApi = (MessageApi) buildRetrofit(this.config.getHttpUrl(), 30000L, this.config, getMoshiParser(), isAnonymousApi(MessageApi.class)).m88733b(MessageApi.class);
        ChannelApi channelApi = (ChannelApi) buildRetrofit(this.config.getHttpUrl(), 30000L, this.config, getMoshiParser(), isAnonymousApi(ChannelApi.class)).m88733b(ChannelApi.class);
        DeviceApi deviceApi = (DeviceApi) buildRetrofit(this.config.getHttpUrl(), 30000L, this.config, getMoshiParser(), isAnonymousApi(DeviceApi.class)).m88733b(DeviceApi.class);
        ModerationApi moderationApi = (ModerationApi) buildRetrofit(this.config.getHttpUrl(), 30000L, this.config, getMoshiParser(), isAnonymousApi(ModerationApi.class)).m88733b(ModerationApi.class);
        GeneralApi generalApi = (GeneralApi) buildRetrofit(this.config.getHttpUrl(), 30000L, this.config, getMoshiParser(), isAnonymousApi(GeneralApi.class)).m88733b(GeneralApi.class);
        ConfigApi configApi = (ConfigApi) buildRetrofit(this.config.getHttpUrl(), 30000L, this.config, getMoshiParser(), isAnonymousApi(ConfigApi.class)).m88733b(ConfigApi.class);
        FileDownloadApi fileDownloadApiBuildFileDownloadApi = buildFileDownloadApi();
        OpenGraphApi openGraphApi = (OpenGraphApi) buildRetrofit(this.config.getHttpUrl(), 30000L, this.config, getMoshiParser(), isAnonymousApi(OpenGraphApi.class)).m88733b(OpenGraphApi.class);
        ThreadsApi threadsApi = (ThreadsApi) buildRetrofit(this.config.getHttpUrl(), 30000L, this.config, getMoshiParser(), isAnonymousApi(ThreadsApi.class)).m88733b(ThreadsApi.class);
        PollsApi pollsApi = (PollsApi) buildRetrofit(this.config.getHttpUrl(), 30000L, this.config, getMoshiParser(), isAnonymousApi(PollsApi.class)).m88733b(PollsApi.class);
        RemindersApi remindersApi = (RemindersApi) buildRetrofit(this.config.getHttpUrl(), 30000L, this.config, getMoshiParser(), isAnonymousApi(RemindersApi.class)).m88733b(RemindersApi.class);
        PushPreferencesApi pushPreferencesApi = (PushPreferencesApi) buildRetrofit(this.config.getHttpUrl(), 30000L, this.config, getMoshiParser(), isAnonymousApi(PushPreferencesApi.class)).m88733b(PushPreferencesApi.class);
        UserScope userScope = this.userScope;
        return new ProxyChatApi(new ExtraDataValidator(this.userScope, new DistinctChatApiEnabler(new DistinctChatApi(this.userScope, new MoshiChatApi(domainMapping, eventMapping, dtoMapping$stream_chat_android_client_release, fileUploader, fileTransformer, userApi, guestApi, messageApi, channelApi, deviceApi, moderationApi, generalApi, configApi, fileDownloadApiBuildFileDownloadApi, openGraphApi, threadsApi, pollsApi, remindersApi, pushPreferencesApi, userScope, userScope)), new C0438l0(chatConfig, 20))), this.userScope, this.sendMessageInterceptor);
    }

    private final ChatNotifications buildChatNotifications(NotificationHandler handler, NotificationConfig notificationConfig) {
        if (!notificationConfig.getPushNotificationsEnabled()) {
            return NoOpChatNotifications.INSTANCE;
        }
        if (handler == null) {
            handler = defaultNotificationHandler(notificationConfig);
        }
        return new ChatNotificationsImpl(handler, notificationConfig, this.appContext, getDefaultApi(), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChatSocket buildChatSocket(ChatApiConfig chatConfig) {
        return new ChatSocket(chatConfig.getApiKey(), chatConfig.getWssUrl(), this.tokenManager, getSocketFactory(), this.userScope, getLifecycleObserver(), getNetworkStateProvider(), this.clientDebugger, this.serverClockOffset);
    }

    private final FileDownloadApi buildFileDownloadApi() {
        C34824k0 c34824k0BaseClientBuilder = baseClientBuilder(30000L);
        CDN cdn = this.cdn;
        if (cdn != null) {
            c34824k0BaseClientBuilder.m109891a(new CDNOkHttpInterceptor(cdn));
        }
        C34826l0 c34826l0 = new C34826l0(c34824k0BaseClientBuilder);
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88729c(this.config.getHttpUrl());
        c29222x0.f118281a = c34826l0;
        c29222x0.m88727a(RetrofitCallAdapterFactory.INSTANCE.create(getMoshiParser(), this.userScope));
        Object objM88733b = c29222x0.m88730d().m88733b(FileDownloadApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (FileDownloadApi) objM88733b;
    }

    private final C29224y0 buildRetrofit(String endpoint, long timeout, ChatApiConfig config, ChatParser parser, boolean isAnonymousApi) {
        C34826l0 c34826l0 = new C34826l0(clientBuilder(timeout, config, parser, isAnonymousApi));
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88729c(endpoint);
        c29222x0.f118281a = c34826l0;
        parser.configRetrofit(c29222x0);
        c29222x0.m88727a(RetrofitCallAdapterFactory.INSTANCE.create(parser, this.userScope));
        return c29222x0.m88730d();
    }

    private final <T> T buildRetrofitApi() {
        AbstractC22676k.m65756p();
        throw null;
    }

    private final RetrofitCdnApi buildRetrofitCdnApi() {
        Object objM88733b = buildRetrofit(this.config.getCdnHttpUrl(), 30000L, this.config, getMoshiParser(), isAnonymousApi(RetrofitCdnApi.class)).m88733b(RetrofitCdnApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (RetrofitCdnApi) objM88733b;
    }

    /* JADX INFO: renamed from: c */
    public static String m54650c(ChatModule chatModule) {
        return chatModule.userScope.getUserId().getValue();
    }

    private final C34824k0 clientBuilder(long timeout, ChatApiConfig config, ChatParser parser, boolean isAnonymousApi) {
        C34824k0 c34824k0BaseClientBuilder = baseClientBuilder(timeout);
        c34824k0BaseClientBuilder.m109891a(new ApiKeyInterceptor(config.getApiKey()));
        c34824k0BaseClientBuilder.m109891a(new HeadersInterceptor(new C18683m0(isAnonymousApi, config, 1), this.headersUtil));
        c34824k0BaseClientBuilder.m109891a(new TokenAuthInterceptor(this.tokenManager, parser, new C18683m0(isAnonymousApi, config, 1)));
        c34824k0BaseClientBuilder.f146615d.add(new ProgressInterceptor());
        return c34824k0BaseClientBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CurrentUserFetcher currentUserFetcher_delegate$lambda$13(ChatModule chatModule) {
        return new CurrentUserFetcher(chatModule.getNetworkStateProvider(), chatModule.getSocketFactory(), chatModule.config);
    }

    /* JADX INFO: renamed from: d */
    public static StreamFileUploader m54651d(ChatModule chatModule) {
        return new StreamFileUploader(chatModule.buildRetrofitCdnApi());
    }

    private static final StreamFileUploader defaultFileUploader_delegate$lambda$9(ChatModule chatModule) {
        return new StreamFileUploader(chatModule.buildRetrofitCdnApi());
    }

    private final NotificationHandler defaultNotificationHandler(NotificationConfig notificationConfig) {
        return NotificationHandlerFactory.createNotificationHandler$default(this.appContext, notificationConfig, null, null, null, null, null, null, null, null, null, 2044, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChatNotifications defaultNotifications_delegate$lambda$6(ChatModule chatModule) {
        return chatModule.buildChatNotifications(chatModule.notificationsHandler, chatModule.config.getNotificationConfig());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectEventParser directEventParser_delegate$lambda$3(ChatModule chatModule) {
        if (chatModule.config.getFastEventParsing()) {
            return new DirectEventParser(chatModule.currentUserIdProvider, chatModule.apiModelTransformers.getIncomingMessageTransformer(), chatModule.apiModelTransformers.getIncomingUserTransformer());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DomainMapping domainMapping_delegate$lambda$0(ChatModule chatModule) {
        return new DomainMapping(chatModule.currentUserIdProvider, chatModule.apiModelTransformers.getIncomingChannelTransformer(), chatModule.apiModelTransformers.getIncomingMessageTransformer(), chatModule.apiModelTransformers.getIncomingUserTransformer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DtoMapping dtoMapping_delegate$lambda$1(ChatModule chatModule) {
        return new DtoMapping(chatModule.apiModelTransformers.getOutgoingMessageTransformer(), chatModule.apiModelTransformers.getOutgoingUserTransformers());
    }

    private static final EventMapping eventMapping_delegate$lambda$2(ChatModule chatModule) {
        return new EventMapping(chatModule.getDomainMapping());
    }

    private final InterfaceC4339a getAnonymousProvider(ChatApiConfig config, boolean isAnonymousApi) {
        return new C18683m0(isAnonymousApi, config, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getAnonymousProvider$lambda$17(boolean z4, ChatApiConfig chatApiConfig) {
        return z4 || chatApiConfig.getIsAnonymous();
    }

    private final C34826l0 getBaseClient() {
        return (C34826l0) this.baseClient.getValue();
    }

    private final ChatApi getDefaultApi() {
        return (ChatApi) this.defaultApi.getValue();
    }

    private final StreamFileUploader getDefaultFileUploader() {
        return (StreamFileUploader) this.defaultFileUploader.getValue();
    }

    private final ChatNotifications getDefaultNotifications() {
        return (ChatNotifications) this.defaultNotifications.getValue();
    }

    private final DirectEventParser getDirectEventParser() {
        return (DirectEventParser) this.directEventParser.getValue();
    }

    private final DomainMapping getDomainMapping() {
        return (DomainMapping) this.domainMapping.getValue();
    }

    private final EventMapping getEventMapping() {
        return (EventMapping) this.eventMapping.getValue();
    }

    private final ChatParser getMoshiParser() {
        return (ChatParser) this.moshiParser.getValue();
    }

    private final SocketFactory getSocketFactory() {
        return (SocketFactory) this.socketFactory.getValue();
    }

    /* JADX INFO: renamed from: i */
    public static ChatSocket m54656i(ChatModule chatModule) {
        return chatModule.buildChatSocket(chatModule.config);
    }

    private final boolean isAnonymousApi(Class<?> cls) {
        boolean z4;
        boolean z13;
        Annotation[] annotations = cls.getAnnotations();
        AbstractC22676k.m65749i(annotations, "getAnnotations(...)");
        int length = annotations.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                z4 = false;
                break;
            }
            if (annotations[i13] instanceof AnonymousApi) {
                z4 = true;
                break;
            }
            i13++;
        }
        Annotation[] annotations2 = cls.getAnnotations();
        AbstractC22676k.m65749i(annotations2, "getAnnotations(...)");
        int length2 = annotations2.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length2) {
                z13 = false;
                break;
            }
            if (annotations2[i14] instanceof AuthenticatedApi) {
                z13 = true;
                break;
            }
            i14++;
        }
        if (z4 && z13) {
            throw new IllegalStateException("Api class must be annotated with either @AnonymousApi or @AuthenticatedApi, and not both");
        }
        if (z4) {
            return true;
        }
        if (z13) {
            return false;
        }
        throw new IllegalStateException("Api class must be annotated with either @AnonymousApi or @AuthenticatedApi");
    }

    /* JADX INFO: renamed from: l */
    public static StreamLifecycleObserver m54659l(ChatModule chatModule) {
        return new StreamLifecycleObserver(chatModule.userScope, chatModule.lifecycle);
    }

    private static final StreamLifecycleObserver lifecycleObserver_delegate$lambda$10(ChatModule chatModule) {
        return new StreamLifecycleObserver(chatModule.userScope, chatModule.lifecycle);
    }

    /* JADX INFO: renamed from: m */
    public static EventMapping m54660m(ChatModule chatModule) {
        return new EventMapping(chatModule.getDomainMapping());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MoshiChatParser moshiParser_delegate$lambda$4(ChatModule chatModule) {
        return new MoshiChatParser(chatModule.getEventMapping(), chatModule.getDtoMapping$stream_chat_android_client_release(), chatModule.getDirectEventParser());
    }

    private static final MutableClientState mutableClientState_delegate$lambda$12(ChatModule chatModule) {
        return new MutableClientState(chatModule.getNetworkStateProvider());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkStateProvider networkStateProvider_delegate$lambda$11(ChatModule chatModule) {
        UserScope userScope = chatModule.userScope;
        Object systemService = chatModule.appContext.getSystemService("connectivity");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return new NetworkStateProvider(userScope, (ConnectivityManager) systemService);
    }

    /* JADX INFO: renamed from: o */
    public static ProxyChatApi m54662o(ChatModule chatModule) {
        return (ProxyChatApi) chatModule.buildApi(chatModule.config);
    }

    /* JADX INFO: renamed from: p */
    public static C34826l0 m54663p(ChatModule chatModule) {
        C34826l0 c34826l0 = chatModule.customOkHttpClient;
        return c34826l0 == null ? new C34826l0() : c34826l0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SocketFactory socketFactory_delegate$lambda$5(ChatModule chatModule) {
        return new SocketFactory(chatModule.getMoshiParser(), chatModule.tokenManager, chatModule.headersUtil, null, 8, null);
    }

    public final ChatApi api() {
        return getDefaultApi();
    }

    public final ChatSocket getChatSocket$stream_chat_android_client_release() {
        return (ChatSocket) this.chatSocket.getValue();
    }

    public final CurrentUserFetcher getCurrentUserFetcher() {
        return (CurrentUserFetcher) this.currentUserFetcher.getValue();
    }

    public final DtoMapping getDtoMapping$stream_chat_android_client_release() {
        return (DtoMapping) this.dtoMapping.getValue();
    }

    public final StreamLifecycleObserver getLifecycleObserver() {
        return (StreamLifecycleObserver) this.lifecycleObserver.getValue();
    }

    public final MutableClientState getMutableClientState() {
        return (MutableClientState) this.mutableClientState.getValue();
    }

    public final NetworkStateProvider getNetworkStateProvider() {
        return (NetworkStateProvider) this.networkStateProvider.getValue();
    }

    public final UserStateService getUserStateService() {
        return this.userStateService;
    }

    public final ChatNotifications notifications() {
        return getDefaultNotifications();
    }
}
