package io.getstream.chat.android.client;

import android.content.Context;
import android.util.Log;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.C1593i0;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.room.AbstractC1772c1;
import ar0.C1926a;
import b23.C2335a;
import b23.C2336b;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.AbstractC3006f0;
import bc3.AbstractC3028k2;
import bc3.AbstractC3034m0;
import bc3.C3023j1;
import bc3.C3031l1;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import bm2.C3433d0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.mapbox.maps.MapboxMap;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13096w1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13072o1;
import h02.C16574h;
import h02.C16587n0;
import ht2.C17632d;
import i01.C17841d;
import ig0.C18468h;
import ih0.AbstractC18489d0;
import ih0.C18510t;
import ih1.C18518b;
import io.getstream.chat.android.PrivacySettings;
import io.getstream.chat.android.TypingIndicators;
import io.getstream.chat.android.client.api.ChatApi;
import io.getstream.chat.android.client.api.ChatApiConfig;
import io.getstream.chat.android.client.api.ChatClientConfig;
import io.getstream.chat.android.client.api.ErrorCall;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.api.models.GetThreadOptions;
import io.getstream.chat.android.client.api.models.PinnedMessagesPagination;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api.models.QueryChannelsRequest;
import io.getstream.chat.android.client.api.models.QueryChannelsResult;
import io.getstream.chat.android.client.api.models.QueryThreadsRequest;
import io.getstream.chat.android.client.api.models.QueryUsersRequest;
import io.getstream.chat.android.client.api.models.SendActionRequest;
import io.getstream.chat.android.client.api.models.UpdatePollRequest;
import io.getstream.chat.android.client.api.models.identifier.IdentifiersKt;
import io.getstream.chat.android.client.api2.mapping.DtoMapping;
import io.getstream.chat.android.client.api2.model.dto.AttachmentDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamChannelDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamMessageDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamReactionDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto;
import io.getstream.chat.android.client.attachment.AttachmentsSender;
import io.getstream.chat.android.client.attachment.MessagePreparer;
import io.getstream.chat.android.client.audio.AudioPlayer;
import io.getstream.chat.android.client.audio.NativeMediaPlayerImpl;
import io.getstream.chat.android.client.audio.StreamAudioPlayer;
import io.getstream.chat.android.client.cdn.CDN;
import io.getstream.chat.android.client.cdn.internal.StreamMediaDataSource;
import io.getstream.chat.android.client.channel.ChannelClient;
import io.getstream.chat.android.client.channel.state.ChannelStateLogicProvider;
import io.getstream.chat.android.client.clientstate.UserStateService;
import io.getstream.chat.android.client.debugger.ChatClientDebugger;
import io.getstream.chat.android.client.debugger.SendMessageDebugger;
import io.getstream.chat.android.client.debugger.StubChatClientDebugger;
import io.getstream.chat.android.client.errorhandler.CreateChannelErrorHandlerKt;
import io.getstream.chat.android.client.errorhandler.DeleteReactionErrorHandlerKt;
import io.getstream.chat.android.client.errorhandler.ErrorHandler;
import io.getstream.chat.android.client.errorhandler.QueryMembersErrorHandlerKt;
import io.getstream.chat.android.client.errorhandler.SendReactionErrorHandlerKt;
import io.getstream.chat.android.client.errors.cause.StreamChannelNotFoundException;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.events.HasOwnUser;
import io.getstream.chat.android.client.events.UserEvent;
import io.getstream.chat.android.client.extensions.StringExtensionsKt;
import io.getstream.chat.android.client.extensions.internal.DateKt;
import io.getstream.chat.android.client.header.VersionPrefixHeader;
import io.getstream.chat.android.client.helpers.AppSettingManager;
import io.getstream.chat.android.client.interceptor.SendMessageInterceptor;
import io.getstream.chat.android.client.internal.file.StreamFileManager;
import io.getstream.chat.android.client.internal.offline.plugin.factory.StreamOfflinePluginFactory;
import io.getstream.chat.android.client.internal.state.event.handler.internal.C19284a;
import io.getstream.chat.android.client.internal.state.plugin.factory.StreamStatePluginFactory;
import io.getstream.chat.android.client.logger.ChatLogLevel;
import io.getstream.chat.android.client.logger.ChatLoggerConfigImpl;
import io.getstream.chat.android.client.logger.ChatLoggerHandler;
import io.getstream.chat.android.client.logger.StreamLogLevelValidator;
import io.getstream.chat.android.client.logger.StreamLoggerHandler;
import io.getstream.chat.android.client.notifications.ChatNotifications;
import io.getstream.chat.android.client.notifications.PushNotificationReceivedListener;
import io.getstream.chat.android.client.notifications.handler.ChatNotification;
import io.getstream.chat.android.client.notifications.handler.NotificationConfig;
import io.getstream.chat.android.client.notifications.handler.NotificationHandler;
import io.getstream.chat.android.client.notifications.handler.NotificationHandlerFactory;
import io.getstream.chat.android.client.p224di.ChatModule;
import io.getstream.chat.android.client.parser2.adapters.internal.StreamDateFormatter;
import io.getstream.chat.android.client.persistance.repository.RepositoryFacade;
import io.getstream.chat.android.client.persistance.repository.factory.RepositoryFactory;
import io.getstream.chat.android.client.persistance.repository.noop.NoOpRepositoryFactory;
import io.getstream.chat.android.client.persistence.p225db.ChatClientDatabase;
import io.getstream.chat.android.client.persistence.repository.ChatClientRepository;
import io.getstream.chat.android.client.plugin.DependencyResolver;
import io.getstream.chat.android.client.plugin.MessageDeliveredPluginFactory;
import io.getstream.chat.android.client.plugin.Plugin;
import io.getstream.chat.android.client.plugin.factory.PluginFactory;
import io.getstream.chat.android.client.plugin.factory.ThrottlingPluginFactory;
import io.getstream.chat.android.client.query.AddMembersParams;
import io.getstream.chat.android.client.query.CreateChannelParams;
import io.getstream.chat.android.client.receipts.MessageReceiptManager;
import io.getstream.chat.android.client.receipts.MessageReceiptReporter;
import io.getstream.chat.android.client.scope.ClientScope;
import io.getstream.chat.android.client.scope.ClientScopeKt;
import io.getstream.chat.android.client.scope.UserScope;
import io.getstream.chat.android.client.scope.UserScopeKt;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.client.setup.state.internal.MutableClientState;
import io.getstream.chat.android.client.socket.ChatSocket;
import io.getstream.chat.android.client.socket.SocketListener;
import io.getstream.chat.android.client.token.CacheableTokenProvider;
import io.getstream.chat.android.client.token.ConstantTokenProvider;
import io.getstream.chat.android.client.token.TokenManager;
import io.getstream.chat.android.client.token.TokenManagerImpl;
import io.getstream.chat.android.client.token.TokenProvider;
import io.getstream.chat.android.client.transformer.ApiModelTransformers;
import io.getstream.chat.android.client.uploader.FileTransformer;
import io.getstream.chat.android.client.uploader.FileUploader;
import io.getstream.chat.android.client.uploader.NoOpFileTransformer;
import io.getstream.chat.android.client.user.CredentialConfig;
import io.getstream.chat.android.client.user.CurrentUserFetcher;
import io.getstream.chat.android.client.user.storage.SharedPreferencesCredentialStorage;
import io.getstream.chat.android.client.user.storage.UserCredentialStorage;
import io.getstream.chat.android.client.utils.ProgressCallback;
import io.getstream.chat.android.client.utils.TokenUtils;
import io.getstream.chat.android.client.utils.UserUtilsKt;
import io.getstream.chat.android.client.utils.internal.ServerClockOffset;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.client.utils.observable.ChatEventsObservable;
import io.getstream.chat.android.client.utils.observable.Disposable;
import io.getstream.chat.android.client.utils.retry.NoRetryPolicy;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.core.internal.StreamHandsOff;
import io.getstream.chat.android.models.AppSettings;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.BannedUsersSort;
import io.getstream.chat.android.models.ConnectionData;
import io.getstream.chat.android.models.ConnectionState;
import io.getstream.chat.android.models.CreatePollParams;
import io.getstream.chat.android.models.Device;
import io.getstream.chat.android.models.DraftMessage;
import io.getstream.chat.android.models.DraftsSort;
import io.getstream.chat.android.models.EventType;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Filters;
import io.getstream.chat.android.models.InitializationState;
import io.getstream.chat.android.models.Location;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.MemberData;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.MessageReminder;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.PollOption;
import io.getstream.chat.android.models.PushMessage;
import io.getstream.chat.android.models.PushPreference;
import io.getstream.chat.android.models.PushPreferenceLevel;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.SearchMessagesResult;
import io.getstream.chat.android.models.UploadAttachmentsNetworkType;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.Vote;
import io.getstream.chat.android.models.querysort.QuerySortByField;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import l83.C23454a0;
import l83.C23465k;
import l83.C23467m;
import l83.C23468n;
import l83.InterfaceC23462h;
import live.hms.video.error.ErrorCodes;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26201d;
import n23.C26203f;
import n23.C26204g;
import n83.C26459b;
import n83.C26460c;
import no.nordicsemi.android.dfu.DfuBaseService;
import o23.AbstractC27476f;
import o23.C27478h;
import o23.C27481k;
import o23.C27485o;
import o23.InterfaceC27474d;
import p000.AbstractC11266d;
import p007a6.C0438l0;
import p031b9.AbstractC2875y;
import p031b9.C2830f0;
import p031b9.C2857p;
import p077d0.C11387o2;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p211i5.C18090c;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p708hb2.C17095c;
import p710im1.C18656a0;
import p710im1.C18681l0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r23.InterfaceC30894d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ud3.C34826l0;
import wb3.AbstractC37056f;
import xb3.AbstractC38176k;
import xb3.InterfaceC38174i;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000ì\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u0093\u00052\u00020\u0001:\u0006\u0094\u0005\u0095\u0005\u0093\u0005Bë\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b6\u00107J3\u0010@\u001a\u00020=2\"\u0010<\u001a\u001e\b\u0001\u0012\u0004\u0012\u000209\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:\u0012\u0006\u0012\u0004\u0018\u00010\u000108H\u0000¢\u0006\u0004\b>\u0010?J#\u0010C\u001a\u0002092\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020B0AH\u0007¢\u0006\u0004\bC\u0010DJ(\u0010H\u001a\u00028\u0001\"\n\b\u0000\u0010F\u0018\u0001*\u00020E\"\n\b\u0001\u0010G\u0018\u0001*\u00020\u0001H\u0087\b¢\u0006\u0004\bH\u0010IJ(\u0010K\u001a\u00028\u0001\"\n\b\u0000\u0010J\u0018\u0001*\u00020E\"\n\b\u0001\u0010G\u0018\u0001*\u00020\u0001H\u0081\b¢\u0006\u0004\bK\u0010IJ(\u0010M\u001a\u00028\u0001\"\n\b\u0000\u0010L\u0018\u0001*\u00020E\"\n\b\u0001\u0010G\u0018\u0001*\u00020\u0001H\u0081\b¢\u0006\u0004\bM\u0010IJ\u0019\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010O\u001a\u00020NH\u0007¢\u0006\u0004\bQ\u0010RJ\u0015\u0010U\u001a\b\u0012\u0004\u0012\u00020T0SH\u0007¢\u0006\u0004\bU\u0010VJ1\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0S2\u0006\u0010X\u001a\u00020W2\u0006\u0010Z\u001a\u00020Y2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010NH\u0007¢\u0006\u0004\b\\\u0010]JA\u0010_\u001a\b\u0012\u0004\u0012\u00020[0S2\u0006\u0010X\u001a\u00020W2\u0006\u0010Z\u001a\u00020Y2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010N2\u000e\b\u0002\u0010^\u001a\b\u0012\u0004\u0012\u00020;0)H\u0007¢\u0006\u0004\b_\u0010`JA\u0010_\u001a\b\u0012\u0004\u0012\u00020[0S2\u0006\u0010X\u001a\u00020W2\u0006\u0010b\u001a\u00020a2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010N2\u000e\b\u0002\u0010^\u001a\b\u0012\u0004\u0012\u00020;0)H\u0007¢\u0006\u0004\b_\u0010cJ1\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0S2\u0006\u0010X\u001a\u00020W2\u0006\u0010b\u001a\u00020a2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010NH\u0007¢\u0006\u0004\b\\\u0010dJ\u0010\u0010g\u001a\u00020;H\u0080@¢\u0006\u0004\be\u0010fJ\u000f\u0010i\u001a\u00020hH\u0007¢\u0006\u0004\bi\u0010jJ!\u0010k\u001a\b\u0012\u0004\u0012\u00020[0S2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010NH\u0007¢\u0006\u0004\bk\u0010lJ1\u0010o\u001a\b\u0012\u0004\u0012\u00020[0S2\u0006\u0010m\u001a\u00020a2\u0006\u0010n\u001a\u00020a2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010NH\u0007¢\u0006\u0004\bo\u0010pJ%\u0010s\u001a\b\u0012\u0004\u0012\u00020r0S2\u0006\u0010m\u001a\u00020a2\u0006\u0010q\u001a\u00020aH\u0007¢\u0006\u0004\bs\u0010tJd\u0010\u0080\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020}0\u001e0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\u0006\u0010x\u001a\u00020w2\u0006\u0010y\u001a\u00020w2\u0006\u0010{\u001a\u00020z2\f\u0010~\u001a\b\u0012\u0004\u0012\u00020}0|2\u000e\b\u0002\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020}0\u001eH\u0007¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001JA\u0010\u0087\u0001\u001a\t\u0012\u0005\u0012\u00030\u0086\u00010S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\b\u0010\u0083\u0001\u001a\u00030\u0082\u00012\f\b\u0002\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0007¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001JA\u0010\u0089\u0001\u001a\t\u0012\u0005\u0012\u00030\u0086\u00010S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\b\u0010\u0083\u0001\u001a\u00030\u0082\u00012\f\b\u0002\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0007¢\u0006\u0006\b\u0089\u0001\u0010\u0088\u0001J1\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020;0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\u0007\u0010\u008a\u0001\u001a\u00020aH\u0007¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J1\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020;0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\u0007\u0010\u008a\u0001\u001a\u00020aH\u0007¢\u0006\u0006\b\u008d\u0001\u0010\u008c\u0001J1\u0010\u008f\u0001\u001a\t\u0012\u0005\u0012\u00030\u0086\u00010S2\b\u0010\u0083\u0001\u001a\u00030\u0082\u00012\f\b\u0002\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0007¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J!\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020;0S2\u0007\u0010\u008a\u0001\u001a\u00020aH\u0007¢\u0006\u0006\b\u008b\u0001\u0010\u0091\u0001J1\u0010\u0092\u0001\u001a\t\u0012\u0005\u0012\u00030\u0086\u00010S2\b\u0010\u0083\u0001\u001a\u00030\u0082\u00012\f\b\u0002\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0007¢\u0006\u0006\b\u0092\u0001\u0010\u0090\u0001J!\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020;0S2\u0007\u0010\u008a\u0001\u001a\u00020aH\u0007¢\u0006\u0006\b\u008d\u0001\u0010\u0091\u0001J8\u0010\u0095\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0094\u00010\u001e0S2\u0007\u0010\u0093\u0001\u001a\u00020a2\u0006\u0010x\u001a\u00020w2\u0006\u0010y\u001a\u00020wH\u0007¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001JZ\u0010\u0099\u0001\u001a\t\u0012\u0005\u0012\u00030\u0098\u00010S2\u0007\u0010\u0093\u0001\u001a\u00020a2\n\b\u0002\u0010{\u001a\u0004\u0018\u00010z2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010w2\u000b\b\u0002\u0010\u0097\u0001\u001a\u0004\u0018\u00010a2\u0011\b\u0002\u0010~\u001a\u000b\u0012\u0005\u0012\u00030\u0094\u0001\u0018\u00010|H\u0007¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J8\u0010\u009e\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010S2\u0007\u0010\u0093\u0001\u001a\u00020a2\u0007\u0010\u009b\u0001\u001a\u00020a2\u000b\b\u0002\u0010\u009c\u0001\u001a\u0004\u0018\u00010aH\u0007¢\u0006\u0006\b\u009e\u0001\u0010\u008c\u0001JD\u0010¢\u0001\u001a\t\u0012\u0005\u0012\u00030\u0094\u00010S2\b\u0010\u009f\u0001\u001a\u00030\u0094\u00012\u0007\u0010 \u0001\u001a\u00020h2\u000b\b\u0002\u0010\u009c\u0001\u001a\u0004\u0018\u00010a2\t\b\u0002\u0010¡\u0001\u001a\u00020hH\u0007¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0017\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u00020;0SH\u0007¢\u0006\u0005\b¤\u0001\u0010VJ\u0015\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020W0S¢\u0006\u0005\b¥\u0001\u0010VJ\u0017\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u00020;0SH\u0007¢\u0006\u0005\b¦\u0001\u0010VJ\u001a\u0010©\u0001\u001a\u00020;2\b\u0010¨\u0001\u001a\u00030§\u0001¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u001a\u0010«\u0001\u001a\u00020;2\b\u0010¨\u0001\u001a\u00030§\u0001¢\u0006\u0006\b«\u0001\u0010ª\u0001J\"\u0010¯\u0001\u001a\u00030®\u00012\u000f\u0010¨\u0001\u001a\n\u0012\u0005\u0012\u00030\u00ad\u00010¬\u0001¢\u0006\u0006\b¯\u0001\u0010°\u0001J8\u0010³\u0001\u001a\u00030®\u00012\u0014\u0010²\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020a0±\u0001\"\u00020a2\u000f\u0010¨\u0001\u001a\n\u0012\u0005\u0012\u00030\u00ad\u00010¬\u0001¢\u0006\u0006\b³\u0001\u0010´\u0001JB\u0010³\u0001\u001a\u00030®\u00012\b\u0010¶\u0001\u001a\u00030µ\u00012\u0014\u0010²\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020a0±\u0001\"\u00020a2\u000f\u0010¨\u0001\u001a\n\u0012\u0005\u0012\u00030\u00ad\u00010¬\u0001¢\u0006\u0006\b³\u0001\u0010·\u0001JL\u0010³\u0001\u001a\u00030®\u00012(\u0010²\u0001\u001a\u0015\u0012\u0010\b\u0001\u0012\f\u0012\u0007\b\u0001\u0012\u00030\u00ad\u00010¸\u00010±\u0001\"\f\u0012\u0007\b\u0001\u0012\u00030\u00ad\u00010¸\u00012\u000f\u0010¨\u0001\u001a\n\u0012\u0005\u0012\u00030\u00ad\u00010¬\u0001¢\u0006\u0006\b³\u0001\u0010¹\u0001JV\u0010³\u0001\u001a\u00030®\u00012\b\u0010¶\u0001\u001a\u00030µ\u00012(\u0010²\u0001\u001a\u0015\u0012\u0010\b\u0001\u0012\f\u0012\u0007\b\u0001\u0012\u00030\u00ad\u00010¸\u00010±\u0001\"\f\u0012\u0007\b\u0001\u0012\u00030\u00ad\u00010¸\u00012\u000f\u0010¨\u0001\u001a\n\u0012\u0005\u0012\u00030\u00ad\u00010¬\u0001¢\u0006\u0006\b³\u0001\u0010º\u0001J+\u0010¼\u0001\u001a\u00030®\u00012\u0007\u0010»\u0001\u001a\u00020a2\u000f\u0010¨\u0001\u001a\n\u0012\u0005\u0012\u00030\u00ad\u00010¬\u0001¢\u0006\u0006\b¼\u0001\u0010½\u0001J<\u0010¼\u0001\u001a\u00030®\u0001\"\t\b\u0000\u0010G*\u00030\u00ad\u00012\u000e\u0010»\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000¸\u00012\u000e\u0010¨\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000¬\u0001¢\u0006\u0006\b¼\u0001\u0010¾\u0001J\u0017\u0010¿\u0001\u001a\b\u0012\u0004\u0012\u00020;0SH\u0007¢\u0006\u0005\b¿\u0001\u0010VJ\"\u0010Â\u0001\u001a\b\u0012\u0004\u0012\u00020;0S2\b\u0010Á\u0001\u001a\u00030À\u0001H\u0007¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J,\u0010Æ\u0001\u001a\b\u0012\u0004\u0012\u00020;0S2\u0007\u0010Ä\u0001\u001a\u00020h2\t\b\u0002\u0010Å\u0001\u001a\u00020hH\u0007¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J\u001e\u0010É\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030È\u00010\u001e0SH\u0007¢\u0006\u0005\bÉ\u0001\u0010VJ\"\u0010Å\u0001\u001a\b\u0012\u0004\u0012\u00020;0S2\b\u0010Ê\u0001\u001a\u00030È\u0001H\u0007¢\u0006\u0006\bÅ\u0001\u0010Ë\u0001J\"\u0010Ì\u0001\u001a\b\u0012\u0004\u0012\u00020;0S2\b\u0010Ê\u0001\u001a\u00030È\u0001H\u0007¢\u0006\u0006\bÌ\u0001\u0010Ë\u0001J#\u0010Ð\u0001\u001a\t\u0012\u0005\u0012\u00030Ï\u00010S2\b\u0010Î\u0001\u001a\u00030Í\u0001H\u0007¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\"\u0010Ó\u0001\u001a\t\u0012\u0005\u0012\u00030Ï\u00010S2\u0007\u0010Ò\u0001\u001a\u00020*H\u0007¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J,\u0010Õ\u0001\u001a\t\u0012\u0005\u0012\u00030Ï\u00010S2\u0007\u0010\u009c\u0001\u001a\u00020a2\b\u0010Î\u0001\u001a\u00030Í\u0001H\u0007¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J+\u0010×\u0001\u001a\t\u0012\u0005\u0012\u00030Ï\u00010S2\u0007\u0010\u009c\u0001\u001a\u00020a2\u0007\u0010Ò\u0001\u001a\u00020*H\u0007¢\u0006\u0006\b×\u0001\u0010Ø\u0001J \u0010Ù\u0001\u001a\u00020;2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001Jc\u0010Þ\u0001\u001a\t\u0012\u0005\u0012\u00030Ý\u00010S2\u0007\u0010Û\u0001\u001a\u00020z2\u0007\u0010Ü\u0001\u001a\u00020z2\n\b\u0002\u0010x\u001a\u0004\u0018\u00010w2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010w2\u000b\b\u0002\u0010\u0097\u0001\u001a\u0004\u0018\u00010a2\u0011\b\u0002\u0010~\u001a\u000b\u0012\u0005\u0012\u00030\u009d\u0001\u0018\u00010|H\u0007¢\u0006\u0006\bÞ\u0001\u0010ß\u0001JP\u0010â\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009d\u00010\u001e0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\u0006\u0010y\u001a\u00020w2\r\u0010~\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010|2\b\u0010á\u0001\u001a\u00030à\u0001H\u0007¢\u0006\u0006\bâ\u0001\u0010ã\u0001J?\u0010é\u0001\u001a\t\u0012\u0005\u0012\u00030è\u00010S2\u0007\u0010\u009c\u0001\u001a\u00020a2\b\u0010å\u0001\u001a\u00030ä\u00012\b\u0010æ\u0001\u001a\u00030ä\u00012\u0007\u0010ç\u0001\u001a\u00020aH\u0007¢\u0006\u0006\bé\u0001\u0010ê\u0001JH\u0010ì\u0001\u001a\t\u0012\u0005\u0012\u00030è\u00010S2\u0007\u0010\u009c\u0001\u001a\u00020a2\b\u0010å\u0001\u001a\u00030ä\u00012\b\u0010æ\u0001\u001a\u00030ä\u00012\u0007\u0010ç\u0001\u001a\u00020a2\u0007\u0010ë\u0001\u001a\u00020*H\u0007¢\u0006\u0006\bì\u0001\u0010í\u0001J\u001e\u0010î\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030è\u00010\u001e0SH\u0007¢\u0006\u0005\bî\u0001\u0010VJ?\u0010ï\u0001\u001a\t\u0012\u0005\u0012\u00030è\u00010S2\u0007\u0010\u0093\u0001\u001a\u00020a2\b\u0010å\u0001\u001a\u00030ä\u00012\b\u0010æ\u0001\u001a\u00030ä\u00012\u0007\u0010ç\u0001\u001a\u00020aH\u0007¢\u0006\u0006\bï\u0001\u0010ê\u0001J*\u0010ð\u0001\u001a\t\u0012\u0005\u0012\u00030è\u00010S2\u0007\u0010\u0093\u0001\u001a\u00020a2\u0007\u0010ç\u0001\u001a\u00020aH\u0007¢\u0006\u0005\bð\u0001\u0010tJ3\u0010ó\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\b\u0010ò\u0001\u001a\u00030ñ\u0001H\u0007¢\u0006\u0006\bó\u0001\u0010ô\u0001J#\u0010ø\u0001\u001a\t\u0012\u0005\u0012\u00030÷\u00010S2\b\u0010ö\u0001\u001a\u00030õ\u0001H\u0007¢\u0006\u0006\bø\u0001\u0010ù\u0001J\"\u0010û\u0001\u001a\t\u0012\u0005\u0012\u00030÷\u00010S2\u0007\u0010ú\u0001\u001a\u00020aH\u0007¢\u0006\u0006\bû\u0001\u0010\u0091\u0001JK\u0010ÿ\u0001\u001a\t\u0012\u0005\u0012\u00030÷\u00010S2\u0007\u0010ú\u0001\u001a\u00020a2\u0016\b\u0002\u0010ý\u0001\u001a\u000f\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00010ü\u00012\u000f\b\u0002\u0010þ\u0001\u001a\b\u0012\u0004\u0012\u00020a0\u001eH\u0007¢\u0006\u0006\bÿ\u0001\u0010\u0080\u0002J\"\u0010\u0081\u0002\u001a\t\u0012\u0005\u0012\u00030÷\u00010S2\u0007\u0010ú\u0001\u001a\u00020aH\u0007¢\u0006\u0006\b\u0081\u0002\u0010\u0091\u0001J!\u0010\u0082\u0002\u001a\b\u0012\u0004\u0012\u00020;0S2\u0007\u0010ú\u0001\u001a\u00020aH\u0007¢\u0006\u0006\b\u0082\u0002\u0010\u0091\u0001J,\u0010\u0085\u0002\u001a\t\u0012\u0005\u0012\u00030\u0083\u00020S2\u0007\u0010ú\u0001\u001a\u00020a2\b\u0010\u0084\u0002\u001a\u00030\u0083\u0002H\u0007¢\u0006\u0006\b\u0085\u0002\u0010\u0086\u0002J,\u0010\u0087\u0002\u001a\t\u0012\u0005\u0012\u00030\u0083\u00020S2\u0007\u0010ú\u0001\u001a\u00020a2\b\u0010\u0084\u0002\u001a\u00030\u0083\u0002H\u0007¢\u0006\u0006\b\u0087\u0002\u0010\u0086\u0002J)\u0010\u0089\u0002\u001a\b\u0012\u0004\u0012\u00020;0S2\u0007\u0010ú\u0001\u001a\u00020a2\u0007\u0010\u0088\u0002\u001a\u00020aH\u0007¢\u0006\u0005\b\u0089\u0002\u0010tJZ\u0010\u008c\u0002\u001a\t\u0012\u0005\u0012\u00030\u008b\u00020S2\u0007\u0010ú\u0001\u001a\u00020a2\n\b\u0002\u0010{\u001a\u0004\u0018\u00010z2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010w2\u000b\b\u0002\u0010\u0097\u0001\u001a\u0004\u0018\u00010a2\u0011\b\u0002\u0010~\u001a\u000b\u0012\u0005\u0012\u00030\u008a\u0002\u0018\u00010|H\u0007¢\u0006\u0006\b\u008c\u0002\u0010\u009a\u0001JQ\u0010\u008e\u0002\u001a\t\u0012\u0005\u0012\u00030\u008d\u00020S2\n\b\u0002\u0010{\u001a\u0004\u0018\u00010z2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010w2\u000b\b\u0002\u0010\u0097\u0001\u001a\u0004\u0018\u00010a2\u0011\b\u0002\u0010~\u001a\u000b\u0012\u0005\u0012\u00030÷\u0001\u0018\u00010|H\u0007¢\u0006\u0006\b\u008e\u0002\u0010\u008f\u0002J4\u0010\u0090\u0002\u001a\t\u0012\u0005\u0012\u00030\u008a\u00020S2\u0007\u0010\u0093\u0001\u001a\u00020a2\u0007\u0010ú\u0001\u001a\u00020a2\u0007\u0010\u0088\u0002\u001a\u00020aH\u0007¢\u0006\u0006\b\u0090\u0002\u0010\u008c\u0001J4\u0010\u0092\u0002\u001a\t\u0012\u0005\u0012\u00030\u008a\u00020S2\u0007\u0010\u0093\u0001\u001a\u00020a2\u0007\u0010ú\u0001\u001a\u00020a2\u0007\u0010\u0091\u0002\u001a\u00020aH\u0007¢\u0006\u0006\b\u0092\u0002\u0010\u008c\u0001J4\u0010\u0094\u0002\u001a\t\u0012\u0005\u0012\u00030\u008a\u00020S2\u0007\u0010\u0093\u0001\u001a\u00020a2\u0007\u0010ú\u0001\u001a\u00020a2\u0007\u0010\u0093\u0002\u001a\u00020aH\u0007¢\u0006\u0006\b\u0094\u0002\u0010\u008c\u0001J?\u0010\u0096\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0095\u00020\u001e0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\u0006\u0010x\u001a\u00020w2\u0006\u0010y\u001a\u00020wH\u0007¢\u0006\u0006\b\u0096\u0002\u0010\u0097\u0002J?\u0010\u0098\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0095\u00020\u001e0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\u0006\u0010x\u001a\u00020w2\u0006\u0010y\u001a\u00020wH\u0007¢\u0006\u0006\b\u0098\u0002\u0010\u0097\u0002JN\u0010\u009a\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009d\u00010\u001e0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\u0006\u0010x\u001a\u00020w2\u0006\u0010y\u001a\u00020w2\r\u0010\u0099\u0002\u001a\b\u0012\u0004\u0012\u00020a0\u001eH\u0007¢\u0006\u0006\b\u009a\u0002\u0010\u009b\u0002J0\u0010\u009c\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009d\u00010\u001e0S2\u0007\u0010\u0093\u0001\u001a\u00020a2\u0006\u0010y\u001a\u00020wH\u0007¢\u0006\u0006\b\u009c\u0002\u0010\u009d\u0002J=\u0010 \u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009d\u00010\u001e0S2\u0007\u0010\u009e\u0002\u001a\u00020a2\u0006\u0010y\u001a\u00020w2\u000b\b\u0002\u0010\u009f\u0002\u001a\u0004\u0018\u00010aH\u0007¢\u0006\u0006\b \u0002\u0010¡\u0002J9\u0010£\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009d\u00010\u001e0S2\u0007\u0010\u0093\u0001\u001a\u00020a2\u0007\u0010¢\u0002\u001a\u00020a2\u0006\u0010y\u001a\u00020wH\u0007¢\u0006\u0006\b£\u0002\u0010¤\u0002J#\u0010§\u0002\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010S2\b\u0010¦\u0002\u001a\u00030¥\u0002H\u0007¢\u0006\u0006\b§\u0002\u0010¨\u0002J#\u0010ª\u0002\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010S2\b\u0010©\u0002\u001a\u00030\u009d\u0001H\u0007¢\u0006\u0006\bª\u0002\u0010«\u0002J#\u0010¬\u0002\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010S2\b\u0010©\u0002\u001a\u00030\u009d\u0001H\u0007¢\u0006\u0006\b¬\u0002\u0010«\u0002J-\u0010®\u0002\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010S2\u0007\u0010\u0093\u0001\u001a\u00020a2\t\b\u0002\u0010\u00ad\u0002\u001a\u00020hH\u0007¢\u0006\u0006\b®\u0002\u0010¯\u0002J\"\u0010°\u0002\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010S2\u0007\u0010\u0093\u0001\u001a\u00020aH\u0007¢\u0006\u0006\b°\u0002\u0010\u0091\u0001J\"\u0010±\u0002\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010S2\u0007\u0010\u0093\u0001\u001a\u00020aH\u0007¢\u0006\u0006\b±\u0002\u0010\u0091\u0001J\"\u0010³\u0002\u001a\t\u0012\u0005\u0012\u00030²\u00020S2\u0007\u0010\u0093\u0001\u001a\u00020aH\u0007¢\u0006\u0006\b³\u0002\u0010\u0091\u0001J>\u0010µ\u0002\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\b\u0010©\u0002\u001a\u00030\u009d\u00012\t\b\u0002\u0010´\u0002\u001a\u00020hH\u0007¢\u0006\u0006\bµ\u0002\u0010¶\u0002J3\u0010¸\u0002\u001a\t\u0012\u0005\u0012\u00030·\u00020S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\b\u0010©\u0002\u001a\u00030·\u0002H\u0007¢\u0006\u0006\b¸\u0002\u0010¹\u0002J2\u0010º\u0002\u001a\b\u0012\u0004\u0012\u00020;0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\b\u0010©\u0002\u001a\u00030·\u0002H\u0007¢\u0006\u0006\bº\u0002\u0010¹\u0002JG\u0010½\u0002\u001a\t\u0012\u0005\u0012\u00030¼\u00020S2\u0006\u0010{\u001a\u00020z2\u0006\u0010y\u001a\u00020w2\u000b\b\u0002\u0010\u0097\u0001\u001a\u0004\u0018\u00010a2\u000f\b\u0002\u0010~\u001a\t\u0012\u0005\u0012\u00030»\u00020|H\u0007¢\u0006\u0006\b½\u0002\u0010¾\u0002J#\u0010¿\u0002\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010S2\b\u0010©\u0002\u001a\u00030\u009d\u0001H\u0007¢\u0006\u0006\b¿\u0002\u0010«\u0002J3\u0010À\u0002\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\b\u0010©\u0002\u001a\u00030\u009d\u0001H\u0007¢\u0006\u0006\bÀ\u0002\u0010Á\u0002JK\u0010Â\u0002\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010S2\u0007\u0010\u0093\u0001\u001a\u00020a2\u0016\b\u0002\u0010ý\u0001\u001a\u000f\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00010ü\u00012\u000f\b\u0002\u0010þ\u0001\u001a\b\u0012\u0004\u0012\u00020a0\u001eH\u0007¢\u0006\u0006\bÂ\u0002\u0010\u0080\u0002J%\u0010Ã\u0002\u001a\b\u0012\u0004\u0012\u00020}0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a¢\u0006\u0005\bÃ\u0002\u0010tJ%\u0010Ä\u0002\u001a\b\u0012\u0004\u0012\u00020}0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a¢\u0006\u0005\bÄ\u0002\u0010tJ%\u0010Å\u0002\u001a\b\u0012\u0004\u0012\u00020}0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a¢\u0006\u0005\bÅ\u0002\u0010tJ%\u0010Æ\u0002\u001a\b\u0012\u0004\u0012\u00020}0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a¢\u0006\u0005\bÆ\u0002\u0010tJ0\u0010È\u0002\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010S2\b\u0010©\u0002\u001a\u00030\u009d\u00012\u000b\b\u0002\u0010Ç\u0002\u001a\u0004\u0018\u00010*H\u0007¢\u0006\u0006\bÈ\u0002\u0010É\u0002J,\u0010È\u0002\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010S2\b\u0010©\u0002\u001a\u00030\u009d\u00012\u0007\u0010Ê\u0002\u001a\u00020wH\u0007¢\u0006\u0006\bÈ\u0002\u0010Ë\u0002J#\u0010Ì\u0002\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010S2\b\u0010©\u0002\u001a\u00030\u009d\u0001H\u0007¢\u0006\u0006\bÌ\u0002\u0010«\u0002J#\u0010Ï\u0002\u001a\t\u0012\u0005\u0012\u00030Î\u00020S2\b\u0010¦\u0002\u001a\u00030Í\u0002H\u0007¢\u0006\u0006\bÏ\u0002\u0010Ð\u0002JA\u0010Õ\u0002\u001a\t\u0012\u0005\u0012\u00030Ô\u00020S2\u0007\u0010\u009c\u0001\u001a\u00020a2\t\b\u0002\u0010Ñ\u0002\u001a\u00020w2\t\b\u0002\u0010Ò\u0002\u001a\u00020w2\t\b\u0002\u0010Ó\u0002\u001a\u00020h¢\u0006\u0006\bÕ\u0002\u0010Ö\u0002JH\u0010Õ\u0002\u001a\t\u0012\u0005\u0012\u00030Ô\u00020S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\t\b\u0002\u0010Ñ\u0002\u001a\u00020w2\t\b\u0002\u0010Ò\u0002\u001a\u00020w2\t\b\u0002\u0010Ó\u0002\u001a\u00020h¢\u0006\u0006\bÕ\u0002\u0010×\u0002J>\u0010Ú\u0002\u001a\t\u0012\u0005\u0012\u00030Ô\u00020S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\b\u0010¦\u0002\u001a\u00030Ø\u00022\t\b\u0002\u0010Ù\u0002\u001a\u00020hH\u0007¢\u0006\u0006\bÚ\u0002\u0010Û\u0002J)\u0010Ü\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ô\u00020\u001e0S2\b\u0010¦\u0002\u001a\u00030Í\u0002H\u0007¢\u0006\u0006\bÜ\u0002\u0010Ð\u0002J(\u0010Ý\u0002\u001a\t\u0012\u0005\u0012\u00030Ô\u00020S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020aH\u0007¢\u0006\u0005\bÝ\u0002\u0010tJ!\u0010Þ\u0002\u001a\b\u0012\u0004\u0012\u00020h0S2\u0007\u0010\u0093\u0001\u001a\u00020aH\u0007¢\u0006\u0006\bÞ\u0002\u0010\u0091\u0001J1\u0010ß\u0002\u001a\b\u0012\u0004\u0012\u00020;0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\u0007\u0010\u0093\u0001\u001a\u00020aH\u0007¢\u0006\u0006\bß\u0002\u0010\u008c\u0001J1\u0010á\u0002\u001a\b\u0012\u0004\u0012\u00020;0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\u0007\u0010à\u0002\u001a\u00020aH\u0007¢\u0006\u0006\bá\u0002\u0010\u008c\u0001J'\u0010â\u0002\u001a\b\u0012\u0004\u0012\u00020;0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020aH\u0007¢\u0006\u0005\bâ\u0002\u0010tJ3\u0010ä\u0002\u001a\b\u0012\u0004\u0012\u00020;0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\t\b\u0002\u0010ã\u0002\u001a\u00020hH\u0007¢\u0006\u0006\bä\u0002\u0010å\u0002J7\u0010ç\u0002\u001a\t\u0012\u0005\u0012\u00030Ô\u00020S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\f\b\u0002\u0010æ\u0002\u001a\u0005\u0018\u00010\u009d\u0001H\u0007¢\u0006\u0006\bç\u0002\u0010Á\u0002J'\u0010è\u0002\u001a\b\u0012\u0004\u0012\u00020;0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020aH\u0007¢\u0006\u0005\bè\u0002\u0010tJM\u0010ê\u0002\u001a\t\u0012\u0005\u0012\u00030Ô\u00020S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\n\u0010¿\u0002\u001a\u0005\u0018\u00010\u009d\u00012\u0016\b\u0002\u0010é\u0002\u001a\u000f\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00010ü\u0001H\u0007¢\u0006\u0006\bê\u0002\u0010ë\u0002JR\u0010ì\u0002\u001a\t\u0012\u0005\u0012\u00030Ô\u00020S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\u0016\b\u0002\u0010ý\u0001\u001a\u000f\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00010ü\u00012\u000f\b\u0002\u0010þ\u0001\u001a\b\u0012\u0004\u0012\u00020a0\u001eH\u0007¢\u0006\u0006\bì\u0002\u0010í\u0002JY\u0010î\u0002\u001a\b\u0012\u0004\u0012\u00020}0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\u0006\u0010m\u001a\u00020a2\u0016\b\u0002\u0010ý\u0001\u001a\u000f\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00010ü\u00012\u000f\b\u0002\u0010þ\u0001\u001a\b\u0012\u0004\u0012\u00020a0\u001eH\u0007¢\u0006\u0006\bî\u0002\u0010ï\u0002J2\u0010ñ\u0002\u001a\t\u0012\u0005\u0012\u00030Ô\u00020S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\u0007\u0010ð\u0002\u001a\u00020wH\u0007¢\u0006\u0006\bñ\u0002\u0010¤\u0002J(\u0010ò\u0002\u001a\t\u0012\u0005\u0012\u00030Ô\u00020S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020aH\u0007¢\u0006\u0005\bò\u0002\u0010tJ4\u0010ó\u0002\u001a\t\u0012\u0005\u0012\u00030Ô\u00020S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\t\u0010©\u0002\u001a\u0004\u0018\u00010aH\u0007¢\u0006\u0006\bó\u0002\u0010\u008c\u0001J(\u0010ô\u0002\u001a\t\u0012\u0005\u0012\u00030Ô\u00020S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020aH\u0007¢\u0006\u0005\bô\u0002\u0010tJJ\u0010ö\u0002\u001a\t\u0012\u0005\u0012\u00030\u00ad\u00010S2\u0007\u0010»\u0001\u001a\u00020a2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\u0016\b\u0002\u0010õ\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010ü\u0001H\u0007¢\u0006\u0006\bö\u0002\u0010÷\u0002J\u0016\u0010ù\u0002\u001a\t\u0012\u0005\u0012\u00030ø\u00020S¢\u0006\u0005\bù\u0002\u0010VJ\u0017\u0010ú\u0002\u001a\b\u0012\u0004\u0012\u00020;0SH\u0007¢\u0006\u0005\bú\u0002\u0010VJ'\u0010û\u0002\u001a\b\u0012\u0004\u0012\u00020;0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020aH\u0007¢\u0006\u0005\bû\u0002\u0010tJ1\u0010ü\u0002\u001a\b\u0012\u0004\u0012\u00020;0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\u0007\u0010\u0093\u0001\u001a\u00020aH\u0007¢\u0006\u0006\bü\u0002\u0010\u008c\u0001J1\u0010ü\u0002\u001a\b\u0012\u0004\u0012\u00020;0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\u0007\u0010ý\u0002\u001a\u00020*H\u0007¢\u0006\u0006\bü\u0002\u0010þ\u0002J1\u0010ÿ\u0002\u001a\b\u0012\u0004\u0012\u00020;0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\u0007\u0010à\u0002\u001a\u00020aH\u0007¢\u0006\u0006\bÿ\u0002\u0010\u008c\u0001J-\u0010\u0081\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0\u001e0S2\r\u0010\u0080\u0003\u001a\b\u0012\u0004\u0012\u00020W0\u001eH\u0007¢\u0006\u0006\b\u0081\u0003\u0010\u0082\u0003J \u0010\u0083\u0003\u001a\b\u0012\u0004\u0012\u00020W0S2\u0006\u0010X\u001a\u00020WH\u0007¢\u0006\u0006\b\u0083\u0003\u0010\u0084\u0003J!\u0010\u0086\u0003\u001a\t\u0012\u0005\u0012\u00030\u0085\u00030S2\u0006\u0010m\u001a\u00020aH\u0007¢\u0006\u0006\b\u0086\u0003\u0010\u0091\u0001J \u0010\u0087\u0003\u001a\b\u0012\u0004\u0012\u00020;0S2\u0006\u0010m\u001a\u00020aH\u0007¢\u0006\u0006\b\u0087\u0003\u0010\u0091\u0001J\u001e\u0010\u0088\u0003\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0085\u00030\u001e0SH\u0007¢\u0006\u0005\b\u0088\u0003\u0010VJJ\u0010\u008a\u0003\u001a\b\u0012\u0004\u0012\u00020W0S2\u0007\u0010\u0089\u0003\u001a\u00020a2\u0016\b\u0002\u0010ý\u0001\u001a\u000f\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00010ü\u00012\u000f\b\u0002\u0010þ\u0001\u001a\b\u0012\u0004\u0012\u00020a0\u001eH\u0007¢\u0006\u0006\b\u008a\u0003\u0010\u0080\u0002J(\u0010\u008d\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0\u001e0S2\b\u0010\u008c\u0003\u001a\u00030\u008b\u0003H\u0007¢\u0006\u0006\b\u008d\u0003\u0010\u008e\u0003Jm\u0010\u0092\u0003\u001a\t\u0012\u0005\u0012\u00030Ô\u00020S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\r\u0010\u008f\u0003\u001a\b\u0012\u0004\u0012\u00020a0\u001e2\f\b\u0002\u0010æ\u0002\u001a\u0005\u0018\u00010\u009d\u00012\u000b\b\u0002\u0010\u0090\u0003\u001a\u0004\u0018\u00010h2\u000b\b\u0002\u0010\u0091\u0003\u001a\u0004\u0018\u00010*2\u000b\b\u0002\u0010¡\u0001\u001a\u0004\u0018\u00010hH\u0007¢\u0006\u0006\b\u0092\u0003\u0010\u0093\u0003J3\u0010\u0092\u0003\u001a\t\u0012\u0005\u0012\u00030Ô\u00020S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\b\u0010\u0095\u0003\u001a\u00030\u0094\u0003H\u0007¢\u0006\u0006\b\u0092\u0003\u0010\u0096\u0003JS\u0010\u0097\u0003\u001a\t\u0012\u0005\u0012\u00030Ô\u00020S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\r\u0010\u008f\u0003\u001a\b\u0012\u0004\u0012\u00020a0\u001e2\f\b\u0002\u0010æ\u0002\u001a\u0005\u0018\u00010\u009d\u00012\u000b\b\u0002\u0010¡\u0001\u001a\u0004\u0018\u00010hH\u0007¢\u0006\u0006\b\u0097\u0003\u0010\u0098\u0003JS\u0010\u0099\u0003\u001a\t\u0012\u0005\u0012\u00030Ô\u00020S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\r\u0010\u008f\u0003\u001a\b\u0012\u0004\u0012\u00020a0\u001e2\f\b\u0002\u0010æ\u0002\u001a\u0005\u0018\u00010\u009d\u00012\u000b\b\u0002\u0010¡\u0001\u001a\u0004\u0018\u00010hH\u0007¢\u0006\u0006\b\u0099\u0003\u0010\u0098\u0003J5\u0010\u009b\u0003\u001a\b\u0012\u0004\u0012\u00020;0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\u000b\b\u0002\u0010\u009a\u0003\u001a\u0004\u0018\u00010wH\u0007¢\u0006\u0006\b\u009b\u0003\u0010\u009c\u0003J'\u0010\u009d\u0003\u001a\b\u0012\u0004\u0012\u00020;0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020aH\u0007¢\u0006\u0005\b\u009d\u0003\u0010tJ.\u0010\u009f\u0003\u001a\t\u0012\u0005\u0012\u00030\u009e\u00030S2\u0006\u0010m\u001a\u00020a2\u000b\b\u0002\u0010Ê\u0002\u001a\u0004\u0018\u00010wH\u0007¢\u0006\u0006\b\u009f\u0003\u0010 \u0003J \u0010¡\u0003\u001a\b\u0012\u0004\u0012\u00020;0S2\u0006\u0010m\u001a\u00020aH\u0007¢\u0006\u0006\b¡\u0003\u0010\u0091\u0001J\u0017\u0010¢\u0003\u001a\b\u0012\u0004\u0012\u00020;0SH\u0007¢\u0006\u0005\b¢\u0003\u0010VJ\u0018\u0010£\u0003\u001a\t\u0012\u0005\u0012\u00030\u009e\u00030SH\u0007¢\u0006\u0005\b£\u0003\u0010VJB\u0010§\u0003\u001a\t\u0012\u0005\u0012\u00030¦\u00030S2\u0006\u0010m\u001a\u00020a2\t\u0010¤\u0003\u001a\u0004\u0018\u00010a2\u0014\u0010¥\u0003\u001a\u000f\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020a0ü\u0001H\u0007¢\u0006\u0006\b§\u0003\u0010¨\u0003J!\u0010©\u0003\u001a\t\u0012\u0005\u0012\u00030¦\u00030S2\u0006\u0010m\u001a\u00020aH\u0007¢\u0006\u0006\b©\u0003\u0010\u0091\u0001JC\u0010ª\u0003\u001a\t\u0012\u0005\u0012\u00030¦\u00030S2\u0007\u0010\u0093\u0001\u001a\u00020a2\t\u0010¤\u0003\u001a\u0004\u0018\u00010a2\u0014\u0010¥\u0003\u001a\u000f\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020a0ü\u0001H\u0007¢\u0006\u0006\bª\u0003\u0010¨\u0003J\"\u0010«\u0003\u001a\t\u0012\u0005\u0012\u00030¦\u00030S2\u0007\u0010\u0093\u0001\u001a\u00020aH\u0007¢\u0006\u0006\b«\u0003\u0010\u0091\u0001J*\u0010\u00ad\u0003\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010S2\u0007\u0010\u0093\u0001\u001a\u00020a2\u0007\u0010¬\u0003\u001a\u00020aH\u0007¢\u0006\u0005\b\u00ad\u0003\u0010tJ\"\u0010®\u0003\u001a\t\u0012\u0005\u0012\u00030\u0095\u00020S2\u0007\u0010\u008a\u0001\u001a\u00020aH\u0007¢\u0006\u0006\b®\u0003\u0010\u0091\u0001JG\u0010°\u0003\u001a\b\u0012\u0004\u0012\u00020;0S2\u0007\u0010¯\u0003\u001a\u00020a2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\t\u0010¤\u0003\u001a\u0004\u0018\u00010a2\t\u0010Ê\u0002\u001a\u0004\u0018\u00010wH\u0007¢\u0006\u0006\b°\u0003\u0010±\u0003J1\u0010²\u0003\u001a\b\u0012\u0004\u0012\u00020;0S2\u0007\u0010¯\u0003\u001a\u00020a2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020aH\u0007¢\u0006\u0006\b²\u0003\u0010\u008c\u0001JG\u0010³\u0003\u001a\b\u0012\u0004\u0012\u00020;0S2\u0007\u0010¯\u0003\u001a\u00020a2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\t\u0010¤\u0003\u001a\u0004\u0018\u00010a2\t\u0010Ê\u0002\u001a\u0004\u0018\u00010wH\u0007¢\u0006\u0006\b³\u0003\u0010±\u0003J1\u0010´\u0003\u001a\b\u0012\u0004\u0012\u00020;0S2\u0007\u0010¯\u0003\u001a\u00020a2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020aH\u0007¢\u0006\u0006\b´\u0003\u0010\u008c\u0001J\u0084\u0001\u0010»\u0003\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030º\u00030\u001e0S2\u0006\u0010{\u001a\u00020z2\u000f\b\u0002\u0010~\u001a\t\u0012\u0005\u0012\u00030µ\u00030|2\n\b\u0002\u0010x\u001a\u0004\u0018\u00010w2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010w2\u000b\b\u0002\u0010¶\u0003\u001a\u0004\u0018\u00010*2\u000b\b\u0002\u0010·\u0003\u001a\u0004\u0018\u00010*2\u000b\b\u0002\u0010¸\u0003\u001a\u0004\u0018\u00010*2\u000b\b\u0002\u0010¹\u0003\u001a\u0004\u0018\u00010*H\u0007¢\u0006\u0006\b»\u0003\u0010¼\u0003J\u0014\u0010¿\u0003\u001a\u0004\u0018\u00010WH\u0000¢\u0006\u0006\b½\u0003\u0010¾\u0003J\u001c\u0010Â\u0003\u001a\u00020;2\b\u0010Á\u0003\u001a\u00030À\u0003H\u0007¢\u0006\u0006\bÂ\u0003\u0010Ã\u0003J\u0012\u0010Ä\u0003\u001a\u0004\u0018\u00010a¢\u0006\u0006\bÄ\u0003\u0010Å\u0003J\u0012\u0010Æ\u0003\u001a\u0004\u0018\u00010W¢\u0006\u0006\bÆ\u0003\u0010¾\u0003J\u0014\u0010Ç\u0003\u001a\u0004\u0018\u00010aH\u0007¢\u0006\u0006\bÇ\u0003\u0010Å\u0003J\u0012\u0010È\u0003\u001a\u0004\u0018\u00010a¢\u0006\u0006\bÈ\u0003\u0010Å\u0003J\u0010\u0010É\u0003\u001a\u00020T¢\u0006\u0006\bÉ\u0003\u0010Ê\u0003J\u000f\u0010Ë\u0003\u001a\u00020h¢\u0006\u0005\bË\u0003\u0010jJ!\u0010Í\u0003\u001a\u00030Ì\u00032\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a¢\u0006\u0006\bÍ\u0003\u0010Î\u0003J\u001a\u0010Í\u0003\u001a\u00030Ì\u00032\u0007\u0010\u009c\u0001\u001a\u00020a¢\u0006\u0006\bÍ\u0003\u0010Ï\u0003JN\u0010Ð\u0003\u001a\t\u0012\u0005\u0012\u00030Ô\u00020S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\r\u0010\u008f\u0003\u001a\b\u0012\u0004\u0012\u00020a0\u001e2\u0014\u0010õ\u0002\u001a\u000f\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00010ü\u0001H\u0007¢\u0006\u0006\bÐ\u0003\u0010Ñ\u0003J3\u0010Ð\u0003\u001a\t\u0012\u0005\u0012\u00030Ô\u00020S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\b\u0010\u0095\u0003\u001a\u00030Ò\u0003H\u0007¢\u0006\u0006\bÐ\u0003\u0010Ó\u0003J7\u0010Ö\u0003\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00ad\u00010\u001e0S2\r\u0010Ô\u0003\u001a\b\u0012\u0004\u0012\u00020a0\u001e2\u0007\u0010Õ\u0003\u001a\u00020*H\u0007¢\u0006\u0006\bÖ\u0003\u0010×\u0003J7\u0010Ö\u0003\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00ad\u00010\u001e0S2\r\u0010Ô\u0003\u001a\b\u0012\u0004\u0012\u00020a0\u001e2\u0007\u0010Õ\u0003\u001a\u00020aH\u0007¢\u0006\u0006\bÖ\u0003\u0010Ø\u0003J6\u0010Ù\u0003\u001a\t\u0012\u0005\u0012\u00030\u00ad\u00010S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\u000b\b\u0002\u0010\u009e\u0002\u001a\u0004\u0018\u00010aH\u0007¢\u0006\u0006\bÙ\u0003\u0010\u008c\u0001J6\u0010Ú\u0003\u001a\t\u0012\u0005\u0012\u00030\u00ad\u00010S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\u000b\b\u0002\u0010\u009e\u0002\u001a\u0004\u0018\u00010aH\u0007¢\u0006\u0006\bÚ\u0003\u0010\u008c\u0001J\"\u0010Ý\u0003\u001a\t\u0012\u0005\u0012\u00030Ü\u00030S2\u0007\u0010Û\u0003\u001a\u00020aH\u0007¢\u0006\u0006\bÝ\u0003\u0010\u0091\u0001J#\u0010à\u0003\u001a\t\u0012\u0005\u0012\u00030ß\u00030S2\b\u0010\u008c\u0003\u001a\u00030Þ\u0003H\u0007¢\u0006\u0006\bà\u0003\u0010á\u0003J.\u0010å\u0003\u001a\t\u0012\u0005\u0012\u00030ä\u00030S2\u0007\u0010\u0093\u0001\u001a\u00020a2\n\b\u0002\u0010ã\u0003\u001a\u00030â\u0003H\u0007¢\u0006\u0006\bå\u0003\u0010æ\u0003JK\u0010è\u0003\u001a\t\u0012\u0005\u0012\u00030ç\u00030S2\u0007\u0010\u0093\u0001\u001a\u00020a2\u0016\b\u0002\u0010ý\u0001\u001a\u000f\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00010ü\u00012\u000f\b\u0002\u0010þ\u0001\u001a\b\u0012\u0004\u0012\u00020a0\u001eH\u0007¢\u0006\u0006\bè\u0003\u0010\u0080\u0002J-\u0010ë\u0003\u001a\t\u0012\u0005\u0012\u00030ê\u00030S2\u0007\u0010\u0093\u0001\u001a\u00020a2\t\u0010é\u0003\u001a\u0004\u0018\u00010*H\u0007¢\u0006\u0006\bë\u0003\u0010Ø\u0001J-\u0010ì\u0003\u001a\t\u0012\u0005\u0012\u00030ê\u00030S2\u0007\u0010\u0093\u0001\u001a\u00020a2\t\u0010é\u0003\u001a\u0004\u0018\u00010*H\u0007¢\u0006\u0006\bì\u0003\u0010Ø\u0001J!\u0010í\u0003\u001a\b\u0012\u0004\u0012\u00020;0S2\u0007\u0010\u0093\u0001\u001a\u00020aH\u0007¢\u0006\u0006\bí\u0003\u0010\u0091\u0001JG\u0010ï\u0003\u001a\t\u0012\u0005\u0012\u00030î\u00030S2\u0006\u0010{\u001a\u00020z2\u0006\u0010y\u001a\u00020w2\u000b\b\u0002\u0010\u0097\u0001\u001a\u0004\u0018\u00010a2\u000f\b\u0002\u0010~\u001a\t\u0012\u0005\u0012\u00030ê\u00030|H\u0007¢\u0006\u0006\bï\u0003\u0010¾\u0002J\u0018\u0010ð\u0003\u001a\u00020a2\u0006\u0010m\u001a\u00020a¢\u0006\u0006\bð\u0003\u0010ñ\u0003Jn\u0010ø\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010S\"\u0005\b\u0000\u0010ò\u0003\"\b\b\u0001\u0010G*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00010S2\r\u0010ó\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2*\u0010õ\u0003\u001a%\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0011\u0012\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020;0ô\u00030:\u0012\u0006\u0012\u0004\u0018\u00010\u000108H\u0001¢\u0006\u0006\bö\u0003\u0010÷\u0003J\u001d\u0010ú\u0003\u001a\u00020;2\b\u0010ù\u0003\u001a\u00030\u00ad\u0001H\u0082@¢\u0006\u0006\bú\u0003\u0010û\u0003J\u0019\u0010ü\u0003\u001a\u0004\u0018\u00010W*\u00030\u00ad\u0001H\u0002¢\u0006\u0006\bü\u0003\u0010ý\u0003J4\u0010þ\u0003\u001a\t\u0012\u0004\u0012\u00020[0ô\u00032\u0006\u0010X\u001a\u00020W2\u0006\u0010Z\u001a\u00020Y2\b\u0010O\u001a\u0004\u0018\u00010NH\u0082@¢\u0006\u0006\bþ\u0003\u0010ÿ\u0003J,\u0010\u0082\u0004\u001a\u00020;2\u0006\u0010X\u001a\u00020W2\u0007\u0010Z\u001a\u00030\u0080\u00042\u0007\u0010\u0081\u0004\u001a\u00020hH\u0002¢\u0006\u0006\b\u0082\u0004\u0010\u0083\u0004J\u001b\u0010\u0085\u0004\u001a\u00030\u0084\u00042\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0006\b\u0085\u0004\u0010\u0086\u0004J(\u0010\u008a\u0004\u001a\u00030\u0089\u00042\u0007\u0010\u0087\u0004\u001a\u0002092\n\b\u0002\u0010\u0088\u0004\u001a\u00030\u0084\u0004H\u0002¢\u0006\u0006\b\u008a\u0004\u0010\u008b\u0004J4\u0010\u008c\u0004\u001a\t\u0012\u0004\u0012\u00020[0ô\u00032\u0006\u0010X\u001a\u00020W2\u0006\u0010Z\u001a\u00020Y2\b\u0010O\u001a\u0004\u0018\u00010NH\u0082@¢\u0006\u0006\b\u008c\u0004\u0010ÿ\u0003J+\u0010\u008d\u0004\u001a\u00020;2\u0006\u0010m\u001a\u00020a2\u0006\u0010q\u001a\u00020a2\u0007\u0010\u0081\u0004\u001a\u00020hH\u0002¢\u0006\u0006\b\u008d\u0004\u0010\u008e\u0004J$\u0010\u008f\u0004\u001a\t\u0012\u0004\u0012\u00020[0ô\u00032\b\u0010O\u001a\u0004\u0018\u00010NH\u0082@¢\u0006\u0006\b\u008f\u0004\u0010\u0090\u0004J\u001c\u0010\u0091\u0004\u001a\u00020;2\u0007\u0010Ä\u0001\u001a\u00020hH\u0082@¢\u0006\u0006\b\u0091\u0004\u0010\u0092\u0004J\u001c\u0010\u0093\u0004\u001a\u00020;2\u0007\u0010Ä\u0001\u001a\u00020hH\u0082@¢\u0006\u0006\b\u0093\u0004\u0010\u0092\u0004J-\u0010\u0097\u0004\u001a\u00020\u0001*\u00030\u0094\u00042\b\u0010Ó\u0002\u001a\u00030\u0095\u00042\t\b\u0002\u0010\u0096\u0004\u001a\u00020NH\u0082@¢\u0006\u0006\b\u0097\u0004\u0010\u0098\u0004J#\u0010\u009a\u0004\u001a\t\u0012\u0005\u0012\u00030è\u00010S2\b\u0010\u0099\u0004\u001a\u00030è\u0001H\u0003¢\u0006\u0006\b\u009a\u0004\u0010\u009b\u0004JH\u0010\u009d\u0004\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0095\u00020\u001e0S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\u0006\u0010x\u001a\u00020w2\u0006\u0010y\u001a\u00020w2\u0007\u0010\u009c\u0004\u001a\u00020aH\u0003¢\u0006\u0006\b\u009d\u0004\u0010\u009e\u0004J\"\u0010\u009f\u0004\u001a\u00030\u009d\u0001*\u00030\u009d\u00012\u0007\u0010\u009c\u0001\u001a\u00020aH\u0082@¢\u0006\u0006\b\u009f\u0004\u0010 \u0004J5\u0010¡\u0004\u001a\n\u0012\u0005\u0012\u00030\u009d\u00010ô\u00032\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\b\u0010©\u0002\u001a\u00030\u009d\u0001H\u0082@¢\u0006\u0006\b¡\u0004\u0010¢\u0004JJ\u0010¥\u0004\u001a\n\u0012\u0005\u0012\u00030\u009d\u00010ô\u00032\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\b\u0010©\u0002\u001a\u00030\u009d\u00012\t\b\u0002\u0010´\u0002\u001a\u00020h2\b\u0010¤\u0004\u001a\u00030£\u0004H\u0082@¢\u0006\u0006\b¥\u0004\u0010¦\u0004J3\u0010§\u0004\u001a\t\u0012\u0005\u0012\u00030Ô\u00020S2\u0006\u0010u\u001a\u00020a2\u0006\u0010v\u001a\u00020a2\b\u0010¦\u0002\u001a\u00030Ø\u0002H\u0003¢\u0006\u0006\b§\u0004\u0010¨\u0004J1\u0010©\u0004\u001a\t\u0012\u0004\u0012\u00020;0ô\u00032\r\u0010Ô\u0003\u001a\b\u0012\u0004\u0012\u00020a0\u001e2\u0007\u0010Õ\u0003\u001a\u00020*H\u0002¢\u0006\u0006\b©\u0004\u0010ª\u0004J\u0012\u0010«\u0004\u001a\u00020;H\u0002¢\u0006\u0006\b«\u0004\u0010¬\u0004J\u0011\u0010\u00ad\u0004\u001a\u00020hH\u0002¢\u0006\u0005\b\u00ad\u0004\u0010jR\u001d\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0003\u0010®\u0004\u001a\u0006\b¯\u0004\u0010°\u0004R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010±\u0004R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010²\u0004R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010³\u0004R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010´\u0004R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010µ\u0004R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010¶\u0004R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010·\u0004R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010¸\u0004R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010¹\u0004R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010º\u0004R\u001d\u0010\u0019\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0019\u0010»\u0004\u001a\u0006\b¼\u0004\u0010½\u0004R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010¾\u0004R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010¿\u0004R+\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006X\u0087\u0004¢\u0006\u0017\n\u0005\b \u0010À\u0004\u0012\u0006\bÃ\u0004\u0010¬\u0004\u001a\u0006\bÁ\u0004\u0010Â\u0004R\u0015\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010Ä\u0004R\u0015\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b$\u0010Å\u0004R\u0015\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b&\u0010Æ\u0004R%\u0010(\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\u0017\n\u0005\b(\u0010Ç\u0004\u0012\u0006\bÊ\u0004\u0010¬\u0004\u001a\u0006\bÈ\u0004\u0010É\u0004R\u001b\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010Ë\u0004R%\u0010-\u001a\u00020,8\u0006X\u0087\u0004¢\u0006\u0017\n\u0005\b-\u0010Ì\u0004\u0012\u0006\bÏ\u0004\u0010¬\u0004\u001a\u0006\bÍ\u0004\u0010Î\u0004R\u0015\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b/\u0010Ð\u0004R\u0015\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b1\u0010Ñ\u0004R\u001d\u00103\u001a\u0002028\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b3\u0010Ò\u0004\u001a\u0006\bÓ\u0004\u0010Ô\u0004R'\u00105\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\u0017\n\u0005\b5\u0010Õ\u0004\u0012\u0006\bØ\u0004\u0010¬\u0004\u001a\u0006\bÖ\u0004\u0010×\u0004R!\u0010Þ\u0004\u001a\u00030Ù\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÚ\u0004\u0010Û\u0004\u001a\u0006\bÜ\u0004\u0010Ý\u0004R\u0018\u0010à\u0004\u001a\u00030ß\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0004\u0010á\u0004R%\u0010ã\u0004\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020[0ô\u00030â\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bã\u0004\u0010ä\u0004R\u001d\u0010å\u0004\u001a\u00030\u0094\u00048\u0006¢\u0006\u0010\n\u0006\bå\u0004\u0010æ\u0004\u001a\u0006\bç\u0004\u0010è\u0004R\u0018\u0010ê\u0004\u001a\u00030é\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bê\u0004\u0010ë\u0004R\u0018\u0010í\u0004\u001a\u00030ì\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bí\u0004\u0010î\u0004R\u0018\u0010ð\u0004\u001a\u00030ï\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bð\u0004\u0010ñ\u0004R \u0010ó\u0004\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010a0ò\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bó\u0004\u0010ô\u0004R\u001c\u0010õ\u0004\u001a\u0005\u0018\u00010\u0089\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0004\u0010ö\u0004R\u001a\u0010Á\u0003\u001a\u00030À\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0003\u0010÷\u0004R8\u0010ù\u0004\u001a\t\u0012\u0005\u0012\u00030ø\u00040\u001e8\u0006@\u0006X\u0087\u000e¢\u0006 \n\u0006\bù\u0004\u0010À\u0004\u0012\u0006\bý\u0004\u0010¬\u0004\u001a\u0006\bú\u0004\u0010Â\u0004\"\u0006\bû\u0004\u0010ü\u0004R,\u0010ÿ\u0004\u001a\u0005\u0018\u00010þ\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÿ\u0004\u0010\u0080\u0005\u001a\u0006\b\u0081\u0005\u0010\u0082\u0005\"\u0006\b\u0083\u0005\u0010\u0084\u0005R*\u0010\u0086\u0005\u001a\u00030\u0085\u00058\u0000@\u0000X\u0080.¢\u0006\u0018\n\u0006\b\u0086\u0005\u0010\u0087\u0005\u001a\u0006\b\u0088\u0005\u0010\u0089\u0005\"\u0006\b\u008a\u0005\u0010\u008b\u0005R \u0010\u008f\u0005\u001a\u00030\u0089\u00048FX\u0087\u0004¢\u0006\u0010\u0012\u0006\b\u008e\u0005\u0010¬\u0004\u001a\u0006\b\u008c\u0005\u0010\u008d\u0005R\u001e\u0010\u0092\u0005\u001a\t\u0012\u0005\u0012\u00030\u0090\u00050\u001e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0091\u0005\u0010Â\u0004¨\u0006\u0096\u0005"}, m65681d2 = {"Lio/getstream/chat/android/client/ChatClient;", "", "Lio/getstream/chat/android/client/api/ChatApiConfig;", "config", "Lio/getstream/chat/android/client/api/ChatApi;", "api", "Lio/getstream/chat/android/client/api2/mapping/DtoMapping;", "dtoMapping", "Lio/getstream/chat/android/client/notifications/ChatNotifications;", "notifications", "Lio/getstream/chat/android/client/token/TokenManager;", "tokenManager", "Lio/getstream/chat/android/client/user/storage/UserCredentialStorage;", "userCredentialStorage", "Lio/getstream/chat/android/client/clientstate/UserStateService;", "userStateService", "Lio/getstream/chat/android/client/debugger/ChatClientDebugger;", "clientDebugger", "Lio/getstream/chat/android/client/utils/TokenUtils;", "tokenUtils", "Lio/getstream/chat/android/client/scope/ClientScope;", "clientScope", "Lio/getstream/chat/android/client/scope/UserScope;", "userScope", "Lr23/d;", "retryPolicy", "Lio/getstream/chat/android/client/helpers/AppSettingManager;", "appSettingsManager", "Lio/getstream/chat/android/client/socket/ChatSocket;", "chatSocket", "", "Lio/getstream/chat/android/client/plugin/factory/PluginFactory;", "pluginFactories", "Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;", "mutableClientState", "Lio/getstream/chat/android/client/user/CurrentUserFetcher;", "currentUserFetcher", "Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory$Provider;", "repositoryFactoryProvider", "Lio/getstream/chat/android/client/audio/AudioPlayer;", "audioPlayer", "Lkotlin/Function0;", "Ljava/util/Date;", "now", "Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;", "serverClockOffset", "Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository;", "repository", "Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;", "messageReceiptReporter", "Lio/getstream/chat/android/client/receipts/MessageReceiptManager;", "messageReceiptManager", "Lio/getstream/chat/android/client/cdn/CDN;", "cdn", "<init>", "(Lio/getstream/chat/android/client/api/ChatApiConfig;Lio/getstream/chat/android/client/api/ChatApi;Lio/getstream/chat/android/client/api2/mapping/DtoMapping;Lio/getstream/chat/android/client/notifications/ChatNotifications;Lio/getstream/chat/android/client/token/TokenManager;Lio/getstream/chat/android/client/user/storage/UserCredentialStorage;Lio/getstream/chat/android/client/clientstate/UserStateService;Lio/getstream/chat/android/client/debugger/ChatClientDebugger;Lio/getstream/chat/android/client/utils/TokenUtils;Lio/getstream/chat/android/client/scope/ClientScope;Lio/getstream/chat/android/client/scope/UserScope;Lr23/d;Lio/getstream/chat/android/client/helpers/AppSettingManager;Lio/getstream/chat/android/client/socket/ChatSocket;Ljava/util/List;Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;Lio/getstream/chat/android/client/user/CurrentUserFetcher;Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory$Provider;Lio/getstream/chat/android/client/audio/AudioPlayer;Lc93/a;Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository;Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;Lio/getstream/chat/android/client/receipts/MessageReceiptManager;Lio/getstream/chat/android/client/cdn/CDN;)V", "Lkotlin/Function2;", "Lbc3/c0;", "Lq83/d;", "Ll83/a0;", "block", "Lbc3/k1;", "launch$stream_chat_android_client_release", "(Lc93/m;)Lbc3/k1;", "launch", "Lkotlin/Function1;", "Lq83/j;", "inheritScope", "(Lkotlin/jvm/functions/Function1;)Lbc3/c0;", "Lio/getstream/chat/android/client/plugin/DependencyResolver;", "DR", "T", "resolveDependency", "()Ljava/lang/Object;", "F", "resolveFactoryDependency", "P", "resolvePluginDependency", "", "timeoutMilliseconds", "Lio/getstream/chat/android/models/InitializationState;", "awaitInitializationState", "(J)Lio/getstream/chat/android/models/InitializationState;", "Lo23/d;", "Lio/getstream/chat/android/models/AppSettings;", "appSettings", "()Lo23/d;", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "Lio/getstream/chat/android/client/token/TokenProvider;", "tokenProvider", "Lio/getstream/chat/android/models/ConnectionData;", "connectUser", "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/client/token/TokenProvider;Ljava/lang/Long;)Lo23/d;", "onDisconnectionComplete", "switchUser", "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/client/token/TokenProvider;Ljava/lang/Long;Lc93/a;)Lo23/d;", "", "token", "(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/Long;Lc93/a;)Lo23/d;", "(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/Long;)Lo23/d;", "setUserWithoutConnectingIfNeeded$stream_chat_android_client_release", "(Lq83/d;)Ljava/lang/Object;", "setUserWithoutConnectingIfNeeded", "", "containsStoredCredentials", "()Z", "connectAnonymousUser", "(Ljava/lang/Long;)Lo23/d;", "userId", "username", "connectGuestUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lo23/d;", "userName", "Lio/getstream/chat/android/models/GuestUser;", "getGuestToken", "(Ljava/lang/String;Ljava/lang/String;)Lo23/d;", "channelType", "channelId", "", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "Lio/getstream/chat/android/models/FilterObject;", "filter", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Member;", "sort", QueryChannelRequest.KEY_MEMBERS, "queryMembers", "(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/d;", "Ljava/io/File;", "file", "Lio/getstream/chat/android/client/utils/ProgressCallback;", "callback", "Lio/getstream/chat/android/models/UploadedFile;", "sendFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;", "sendImage", QueryParams.URL, "deleteFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;", "deleteImage", "progressCallback", "uploadFile", "(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;", "(Ljava/lang/String;)Lo23/d;", "uploadImage", "messageId", "Lio/getstream/chat/android/models/Reaction;", "getReactions", "(Ljava/lang/String;II)Lo23/d;", "next", "Lio/getstream/chat/android/models/QueryReactionsResult;", "queryReactions", "(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "reactionType", "cid", "Lio/getstream/chat/android/models/Message;", "deleteReaction", "reaction", "enforceUnique", "skipPush", "sendReaction", "(Lio/getstream/chat/android/models/Reaction;ZLjava/lang/String;Z)Lo23/d;", "disconnectSocket", "fetchCurrentUser", "reconnectSocket", "Lio/getstream/chat/android/client/socket/SocketListener;", "listener", "addSocketListener", "(Lio/getstream/chat/android/client/socket/SocketListener;)V", "removeSocketListener", "Lio/getstream/chat/android/client/ChatEventListener;", "Lio/getstream/chat/android/client/events/ChatEvent;", "Lio/getstream/chat/android/client/utils/observable/Disposable;", "subscribe", "(Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;", "", "eventTypes", "subscribeFor", "([Ljava/lang/String;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;", "Landroidx/lifecycle/g0;", "lifecycleOwner", "(Landroidx/lifecycle/g0;[Ljava/lang/String;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;", "Ljava/lang/Class;", "([Ljava/lang/Class;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;", "(Landroidx/lifecycle/g0;[Ljava/lang/Class;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;", "eventType", "subscribeForSingle", "(Ljava/lang/String;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;", "(Ljava/lang/Class;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;", "clearPersistence", "Landroid/content/Context;", "context", "clearCacheAndTemporaryFiles", "(Landroid/content/Context;)Lo23/d;", "flushPersistence", "deleteDevice", "disconnect", "(ZZ)Lo23/d;", "Lio/getstream/chat/android/models/Device;", "getDevices", "device", "(Lio/getstream/chat/android/models/Device;)Lo23/d;", "addDevice", "Lio/getstream/chat/android/models/PushPreferenceLevel;", "level", "Lio/getstream/chat/android/models/PushPreference;", "setUserPushPreference", "(Lio/getstream/chat/android/models/PushPreferenceLevel;)Lo23/d;", "until", "snoozeUserPushNotifications", "(Ljava/util/Date;)Lo23/d;", "setChannelPushPreference", "(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;)Lo23/d;", "snoozeChannelPushNotifications", "(Ljava/lang/String;Ljava/util/Date;)Lo23/d;", "dismissChannelNotifications", "(Ljava/lang/String;Ljava/lang/String;)V", "channelFilter", "messageFilter", "Lio/getstream/chat/android/models/SearchMessagesResult;", "searchMessages", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;", "pagination", "getPinnedMessages", "(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)Lo23/d;", "", "latitude", "longitude", "deviceId", "Lio/getstream/chat/android/models/Location;", "sendStaticLocation", "(Ljava/lang/String;DDLjava/lang/String;)Lo23/d;", "endAt", "startLiveLocationSharing", "(Ljava/lang/String;DDLjava/lang/String;Ljava/util/Date;)Lo23/d;", "queryActiveLocations", "updateLiveLocation", "stopLiveLocationSharing", "Lio/getstream/chat/android/models/CreatePollParams;", "createPollParams", "sendPoll", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/CreatePollParams;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/UpdatePollRequest;", "poll", "Lio/getstream/chat/android/models/Poll;", "updatePoll", "(Lio/getstream/chat/android/client/api/models/UpdatePollRequest;)Lo23/d;", "pollId", "getPoll", "", "set", "unset", "partialUpdatePoll", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;", "closePoll", "deletePoll", "Lio/getstream/chat/android/models/PollOption;", "option", "createPollOption", "(Ljava/lang/String;Lio/getstream/chat/android/models/PollOption;)Lo23/d;", "updatePollOption", "optionId", "deletePollOption", "Lio/getstream/chat/android/models/Vote;", "Lio/getstream/chat/android/models/QueryPollVotesResult;", "queryPollVotes", "Lio/getstream/chat/android/models/QueryPollsResult;", "queryPolls", "(Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "castPollVote", "answer", "castPollAnswer", "voteId", "removePollVote", "Lio/getstream/chat/android/models/Attachment;", "getFileAttachments", "(Ljava/lang/String;Ljava/lang/String;II)Lo23/d;", "getImageAttachments", "types", "getMessagesWithAttachments", "(Ljava/lang/String;Ljava/lang/String;IILjava/util/List;)Lo23/d;", "getReplies", "(Ljava/lang/String;I)Lo23/d;", "parentId", "lastId", "getNewerReplies", "(Ljava/lang/String;ILjava/lang/String;)Lo23/d;", "firstId", "getRepliesMore", "(Ljava/lang/String;Ljava/lang/String;I)Lo23/d;", "Lio/getstream/chat/android/client/api/models/SendActionRequest;", "request", "sendAction", "(Lio/getstream/chat/android/client/api/models/SendActionRequest;)Lo23/d;", "message", "sendGiphy", "(Lio/getstream/chat/android/models/Message;)Lo23/d;", "shuffleGiphy", "hard", "deleteMessage", "(Ljava/lang/String;Z)Lo23/d;", "deleteMessageForMe", "getMessage", "Lio/getstream/chat/android/models/PendingMessage;", "getPendingMessage", "isRetrying", "sendMessage", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Z)Lo23/d;", "Lio/getstream/chat/android/models/DraftMessage;", "createDraftMessage", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;)Lo23/d;", "deleteDraftMessages", "Lio/getstream/chat/android/models/DraftsSort;", "Lio/getstream/chat/android/models/QueryDraftsResult;", "queryDrafts", "(Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "updateMessage", "editMessage", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;", "partialUpdateMessage", "pinChannel", "unpinChannel", "archiveChannel", "unarchiveChannel", "expirationDate", "pinMessage", "(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Lo23/d;", "timeout", "(Lio/getstream/chat/android/models/Message;I)Lo23/d;", "unpinMessage", "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "Lio/getstream/chat/android/client/api/models/QueryChannelsResult;", "queryChannelsInternal", "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lo23/d;", "messageLimit", "memberLimit", "state", "Lio/getstream/chat/android/models/Channel;", "getChannel", "(Ljava/lang/String;IIZ)Lo23/d;", "(Ljava/lang/String;Ljava/lang/String;IIZ)Lo23/d;", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "skipOnRequest", "queryChannel", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Z)Lo23/d;", "queryChannels", "deleteChannel", "markMessageAsDelivered", "markMessageRead", "threadId", "markThreadRead", "showChannel", "clearHistory", "hideChannel", "(Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;", "systemMessage", "truncateChannel", "stopWatching", "channelExtraData", "updateChannel", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Ljava/util/Map;)Lo23/d;", "updateChannelPartial", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;", "partialUpdateMember", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;", "cooldownTimeInSeconds", "enableSlowMode", "disableSlowMode", "acceptInvite", "rejectInvite", "extraData", "sendEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;", "Lio/getstream/chat/android/models/UnreadCounts;", "getUnreadCounts", "markAllRead", "markRead", "markUnread", "timestamp", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)Lo23/d;", "markThreadUnread", "users", "updateUsers", "(Ljava/util/List;)Lo23/d;", "updateUser", "(Lio/getstream/chat/android/models/User;)Lo23/d;", "Lio/getstream/chat/android/models/UserBlock;", "blockUser", "unblockUser", "queryBlockedUsers", "id", "partialUpdateUser", "Lio/getstream/chat/android/client/api/models/QueryUsersRequest;", "query", "queryUsers", "(Lio/getstream/chat/android/client/api/models/QueryUsersRequest;)Lo23/d;", "memberIds", "hideHistory", "hideHistoryBefore", "addMembers", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/Boolean;)Lo23/d;", "Lio/getstream/chat/android/client/query/AddMembersParams;", "params", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/query/AddMembersParams;)Lo23/d;", "removeMembers", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;)Lo23/d;", "inviteMembers", "expiration", "muteChannel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;", "unmuteChannel", "Lio/getstream/chat/android/models/Mute;", "muteUser", "(Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;", "unmuteUser", "unmuteCurrentUser", "muteCurrentUser", "reason", "customData", "Lio/getstream/chat/android/models/Flag;", "flagUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;", "unflagUser", "flagMessage", "unflagMessage", "language", "translate", "enrichUrl", "targetId", "banUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;", "unbanUser", "shadowBanUser", "removeShadowBan", "Lio/getstream/chat/android/models/BannedUsersSort;", "createdAtAfter", "createdAtAfterOrEqual", "createdAtBefore", "createdAtBeforeOrEqual", "Lio/getstream/chat/android/models/BannedUser;", "queryBannedUsers", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lo23/d;", "getStoredUser$stream_chat_android_client_release", "()Lio/getstream/chat/android/models/User;", "getStoredUser", "Lio/getstream/chat/android/client/notifications/PushNotificationReceivedListener;", "pushNotificationReceivedListener", "setPushNotificationReceivedListener", "(Lio/getstream/chat/android/client/notifications/PushNotificationReceivedListener;)V", "getConnectionId", "()Ljava/lang/String;", "getCurrentUser", "getCurrentOrStoredUserId", "getCurrentToken", "getAppSettings", "()Lio/getstream/chat/android/models/AppSettings;", "isSocketConnected", "Lio/getstream/chat/android/client/channel/ChannelClient;", "channel", "(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelClient;", "(Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelClient;", "createChannel", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lo23/d;", "Lio/getstream/chat/android/client/query/CreateChannelParams;", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/query/CreateChannelParams;)Lo23/d;", "channelsIds", "lastSyncAt", "getSyncHistory", "(Ljava/util/List;Ljava/util/Date;)Lo23/d;", "(Ljava/util/List;Ljava/lang/String;)Lo23/d;", "keystroke", "stopTyping", "fileUrl", "Lud3/a1;", "downloadFile", "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;", "Lio/getstream/chat/android/models/QueryThreadsResult;", "queryThreads", "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/GetThreadOptions;", "options", "Lio/getstream/chat/android/models/Thread;", "getThread", "(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/GetThreadOptions;)Lo23/d;", "Lio/getstream/chat/android/models/ThreadInfo;", "partialUpdateThread", "remindAt", "Lio/getstream/chat/android/models/MessageReminder;", "createReminder", "updateReminder", "deleteReminder", "Lio/getstream/chat/android/models/QueryRemindersResult;", "queryReminders", "devToken", "(Ljava/lang/String;)Ljava/lang/String;", "R", "pluginsList", "Ln23/h;", "preconditionCheck", "precondition$stream_chat_android_client_release", "(Lo23/d;Ljava/util/List;Lc93/m;)Lo23/d;", "precondition", NotificationCompat.CATEGORY_EVENT, "handleEvent", "(Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;", "extractCurrentUser", "(Lio/getstream/chat/android/client/events/ChatEvent;)Lio/getstream/chat/android/models/User;", "setUser", "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/client/token/TokenProvider;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/token/CacheableTokenProvider;", "isAnonymous", "initializeClientWithUser", "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/client/token/CacheableTokenProvider;Z)V", "Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;", "createRepositoryFactory", "(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;", "scope", "repositoryFactory", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "createRepositoryFacade", "(Lbc3/c0;Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;)Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "connectUserSuspend", "storePushNotificationsConfig", "(Ljava/lang/String;Ljava/lang/String;Z)V", "waitFirstConnection", "(Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;", "disconnectSuspend", "(ZLq83/d;)Ljava/lang/Object;", "disconnectUserSuspend", "Lio/getstream/chat/android/client/setup/state/ClientState;", "Lio/getstream/chat/android/models/ConnectionState;", "timeoutInMillis", "awaitConnectionState", "(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/models/ConnectionState;JLq83/d;)Ljava/lang/Object;", "location", "sendLocationMessage", "(Lio/getstream/chat/android/models/Location;)Lo23/d;", "type", "getAttachments", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Lo23/d;", "ensureCreatedLocallyAt", "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "doSendMessage", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/debugger/SendMessageDebugger;", "debugger", "sendAttachments", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;ZLio/getstream/chat/android/client/debugger/SendMessageDebugger;Lq83/d;)Ljava/lang/Object;", "queryChannelInternal", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)Lo23/d;", "checkSyncHistoryPreconditions", "(Ljava/util/List;Ljava/util/Date;)Ln23/h;", "warmUp", "()V", "isUserSet", "Lio/getstream/chat/android/client/api/ChatApiConfig;", "getConfig$stream_chat_android_client_release", "()Lio/getstream/chat/android/client/api/ChatApiConfig;", "Lio/getstream/chat/android/client/api/ChatApi;", "Lio/getstream/chat/android/client/api2/mapping/DtoMapping;", "Lio/getstream/chat/android/client/notifications/ChatNotifications;", "Lio/getstream/chat/android/client/token/TokenManager;", "Lio/getstream/chat/android/client/user/storage/UserCredentialStorage;", "Lio/getstream/chat/android/client/clientstate/UserStateService;", "Lio/getstream/chat/android/client/debugger/ChatClientDebugger;", "Lio/getstream/chat/android/client/utils/TokenUtils;", "Lio/getstream/chat/android/client/scope/ClientScope;", "Lio/getstream/chat/android/client/scope/UserScope;", "Lr23/d;", "getRetryPolicy$stream_chat_android_client_release", "()Lr23/d;", "Lio/getstream/chat/android/client/helpers/AppSettingManager;", "Lio/getstream/chat/android/client/socket/ChatSocket;", "Ljava/util/List;", "getPluginFactories", "()Ljava/util/List;", "getPluginFactories$annotations", "Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;", "Lio/getstream/chat/android/client/user/CurrentUserFetcher;", "Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory$Provider;", "Lio/getstream/chat/android/client/audio/AudioPlayer;", "getAudioPlayer", "()Lio/getstream/chat/android/client/audio/AudioPlayer;", "getAudioPlayer$annotations", "Lc93/a;", "Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;", "getServerClockOffset", "()Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;", "getServerClockOffset$annotations", "Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository;", "Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;", "Lio/getstream/chat/android/client/receipts/MessageReceiptManager;", "getMessageReceiptManager$stream_chat_android_client_release", "()Lio/getstream/chat/android/client/receipts/MessageReceiptManager;", "Lio/getstream/chat/android/client/cdn/CDN;", "getCdn", "()Lio/getstream/chat/android/client/cdn/CDN;", "getCdn$annotations", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lio/getstream/chat/android/client/internal/file/StreamFileManager;", "fileManager", "Lio/getstream/chat/android/client/internal/file/StreamFileManager;", "Lec3/o1;", "waitConnection", "Lec3/o1;", "clientState", "Lio/getstream/chat/android/client/setup/state/ClientState;", "getClientState", "()Lio/getstream/chat/android/client/setup/state/ClientState;", "Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;", "streamDateFormatter", "Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;", "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;", "eventsObservable", "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;", "Lmc3/a;", "eventMutex", "Lmc3/a;", "Ljava/util/concurrent/atomic/AtomicReference;", "initializedUserId", "Ljava/util/concurrent/atomic/AtomicReference;", "_repositoryFacade", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "Lio/getstream/chat/android/client/notifications/PushNotificationReceivedListener;", "Lio/getstream/chat/android/client/plugin/Plugin;", "plugins", "getPlugins", "setPlugins", "(Ljava/util/List;)V", "getPlugins$annotations", "Lio/getstream/chat/android/client/channel/state/ChannelStateLogicProvider;", "logicRegistry", "Lio/getstream/chat/android/client/channel/state/ChannelStateLogicProvider;", "getLogicRegistry", "()Lio/getstream/chat/android/client/channel/state/ChannelStateLogicProvider;", "setLogicRegistry", "(Lio/getstream/chat/android/client/channel/state/ChannelStateLogicProvider;)V", "Lio/getstream/chat/android/client/attachment/AttachmentsSender;", "attachmentsSender", "Lio/getstream/chat/android/client/attachment/AttachmentsSender;", "getAttachmentsSender$stream_chat_android_client_release", "()Lio/getstream/chat/android/client/attachment/AttachmentsSender;", "setAttachmentsSender$stream_chat_android_client_release", "(Lio/getstream/chat/android/client/attachment/AttachmentsSender;)V", "getRepositoryFacade", "()Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "getRepositoryFacade$annotations", "repositoryFacade", "Lio/getstream/chat/android/client/errorhandler/ErrorHandler;", "getErrorHandlers", "errorHandlers", "Companion", "Builder", "ChatClientBuilder", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatClient {
    public static final String ANONYMOUS_USER_ID = "!anon";
    private static final String ARG_TYPING_PARENT_ID = "parent_id";
    private static final long DEFAULT_CONNECTION_STATE_TIMEOUT = 10000;
    public static final QuerySorter<Member> DEFAULT_SORT;
    private static final long INITIALIZATION_DELAY = 100;
    private static final String KEY_MESSAGE_ACTION = "image_action";
    private static final int MAX_COOLDOWN_TIME_SECONDS = 120;
    private static final String MESSAGE_ACTION_SEND = "send";
    private static final String MESSAGE_ACTION_SHUFFLE = "shuffle";
    private static boolean OFFLINE_SUPPORT_ENABLED = false;
    public static final long RESOLVE_DEPENDENCY_TIMEOUT = 10000;
    public static final String TAG = "Chat:Client";
    private static final long THIRTY_DAYS_IN_MILLISECONDS;
    private static final InterfaceC23462h anonUser$delegate;
    private static ChatClient instance;
    private RepositoryFacade _repositoryFacade;
    private final ChatApi api;
    private final AppSettingManager appSettingsManager;
    public AttachmentsSender attachmentsSender;
    private final AudioPlayer audioPlayer;
    private final CDN cdn;
    private final ChatSocket chatSocket;
    private final ChatClientDebugger clientDebugger;
    private final ClientScope clientScope;
    private final ClientState clientState;
    private final ChatApiConfig config;
    private final CurrentUserFetcher currentUserFetcher;
    private final DtoMapping dtoMapping;
    private final InterfaceC25435a eventMutex;
    private final ChatEventsObservable eventsObservable;
    private final StreamFileManager fileManager;
    private final AtomicReference<String> initializedUserId;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private ChannelStateLogicProvider logicRegistry;
    private final MessageReceiptManager messageReceiptManager;
    private final MessageReceiptReporter messageReceiptReporter;
    private final MutableClientState mutableClientState;
    private final ChatNotifications notifications;
    private final InterfaceC4339a now;
    private final List<PluginFactory> pluginFactories;
    private volatile List<? extends Plugin> plugins;
    private PushNotificationReceivedListener pushNotificationReceivedListener;
    private final ChatClientRepository repository;
    private final RepositoryFactory.Provider repositoryFactoryProvider;
    private final InterfaceC30894d retryPolicy;
    private final ServerClockOffset serverClockOffset;
    private final StreamDateFormatter streamDateFormatter;
    private final TokenManager tokenManager;
    private final TokenUtils tokenUtils;
    private final UserCredentialStorage userCredentialStorage;
    private final UserScope userScope;
    private final UserStateService userStateService;
    private final InterfaceC13072o1 waitConnection;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static VersionPrefixHeader VERSION_PREFIX_HEADER = VersionPrefixHeader.Default.INSTANCE;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$1 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C188901 extends C22672i implements InterfaceC4339a {
        public static final C188901 INSTANCE = new C188901();

        public C188901() {
            super(0, Date.class, "<init>", "<init>()V", 0);
        }

        @Override // c93.InterfaceC4339a
        public final Object invoke() {
            return new Date();
        }

        @Override // c93.InterfaceC4339a
        public final Date invoke() {
            return new Date();
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$2 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C188912<EventT extends ChatEvent> implements ChatEventsObservable.ChatEventSuspendListener {
        public C188912() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // io.getstream.chat.android.client.utils.observable.ChatEventsObservable.ChatEventSuspendListener
        public final Object onEvent(ChatEvent chatEvent, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
            ChatClient$2$onEvent$1 chatClient$2$onEvent$1;
            InterfaceC25435a interfaceC25435a;
            ChatClient chatClient;
            int i13;
            Throwable th3;
            InterfaceC25435a interfaceC25435a2;
            if (interfaceC30057d instanceof ChatClient$2$onEvent$1) {
                chatClient$2$onEvent$1 = (ChatClient$2$onEvent$1) interfaceC30057d;
                int i14 = chatClient$2$onEvent$1.label;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    chatClient$2$onEvent$1.label = i14 - Integer.MIN_VALUE;
                } else {
                    chatClient$2$onEvent$1 = new ChatClient$2$onEvent$1(this, interfaceC30057d);
                }
            } else {
                chatClient$2$onEvent$1 = new ChatClient$2$onEvent$1(this, interfaceC30057d);
            }
            Object obj = chatClient$2$onEvent$1.result;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i15 = chatClient$2$onEvent$1.label;
            try {
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    interfaceC25435a = ChatClient.this.eventMutex;
                    ChatClient chatClient2 = ChatClient.this;
                    chatClient$2$onEvent$1.L$0 = chatEvent;
                    chatClient$2$onEvent$1.L$1 = interfaceC25435a;
                    chatClient$2$onEvent$1.L$2 = chatClient2;
                    chatClient$2$onEvent$1.I$0 = 0;
                    chatClient$2$onEvent$1.label = 1;
                    if (interfaceC25435a.mo68211b(chatClient$2$onEvent$1) != enumC31071a) {
                        chatClient = chatClient2;
                        i13 = 0;
                    }
                    return enumC31071a;
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC25435a2 = (InterfaceC25435a) chatClient$2$onEvent$1.L$1;
                    try {
                        AbstractC34132o.m107864I(obj);
                        interfaceC25435a2.mo68214i(null);
                        return C23454a0.f92919a;
                    } catch (Throwable th4) {
                        th3 = th4;
                        interfaceC25435a2.mo68214i(null);
                        throw th3;
                    }
                }
                int i16 = chatClient$2$onEvent$1.I$0;
                ChatClient chatClient3 = (ChatClient) chatClient$2$onEvent$1.L$2;
                InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) chatClient$2$onEvent$1.L$1;
                ChatEvent chatEvent2 = (ChatEvent) chatClient$2$onEvent$1.L$0;
                AbstractC34132o.m107864I(obj);
                interfaceC25435a = interfaceC25435a3;
                chatClient = chatClient3;
                i13 = i16;
                chatEvent = chatEvent2;
                chatClient$2$onEvent$1.L$0 = null;
                chatClient$2$onEvent$1.L$1 = interfaceC25435a;
                chatClient$2$onEvent$1.L$2 = null;
                chatClient$2$onEvent$1.I$0 = i13;
                chatClient$2$onEvent$1.I$1 = 0;
                chatClient$2$onEvent$1.label = 2;
                if (chatClient.handleEvent(chatEvent, chatClient$2$onEvent$1) != enumC31071a) {
                    interfaceC25435a2 = interfaceC25435a;
                    interfaceC25435a2.mo68214i(null);
                    return C23454a0.f92919a;
                }
                return enumC31071a;
            } catch (Throwable th5) {
                InterfaceC25435a interfaceC25435a4 = interfaceC25435a;
                th3 = th5;
                interfaceC25435a2 = interfaceC25435a4;
                interfaceC25435a2.mo68214i(null);
                throw th3;
            }
        }
    }

    @Metadata(m65680d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0000¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0002H\u0007¢\u0006\u0004\b-\u0010,J\u0017\u0010.\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0002H\u0007¢\u0006\u0004\b.\u0010,J\u0015\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020/¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0002¢\u0006\u0004\b2\u0010,J\r\u00103\u001a\u00020\u0000¢\u0006\u0004\b3\u0010&J\u0015\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u000204¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u00020\u00002\u0006\u00108\u001a\u000207¢\u0006\u0004\b8\u00109J\u0015\u0010<\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u0000¢\u0006\u0004\bA\u0010&J\u0015\u0010D\u001a\u00020\u00002\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\u0015\u0010F\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u0002¢\u0006\u0004\bF\u0010,J\u0015\u0010G\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\u0002¢\u0006\u0004\bG\u0010,J\u000f\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020HH\u0017¢\u0006\u0004\bK\u0010JJ\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020N0M2\u0006\u0010L\u001a\u000204H\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010R\u001a\u00020QH\u0002¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020QH\u0002¢\u0006\u0004\bT\u0010SR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010UR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010VR\u0016\u00103\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010WR\u0018\u0010-\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010UR\u0018\u0010.\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010UR\u0016\u0010+\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010UR\u0018\u00102\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010UR\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010XR\u0016\u0010Y\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010WR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010ZR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010[R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\\R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010]R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010^R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010c\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010e\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010gR\u0016\u0010h\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010WR\u0016\u0010<\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010WR\u0016\u0010L\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010iR\u0016\u0010D\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010jR\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010kR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010lR\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010mR\u0018\u0010F\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010UR\u0018\u0010G\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010U¨\u0006n"}, m65681d2 = {"Lio/getstream/chat/android/client/ChatClient$Builder;", "Lio/getstream/chat/android/client/ChatClient$ChatClientBuilder;", "", "apiKey", "Landroid/content/Context;", "appContext", "<init>", "(Ljava/lang/String;Landroid/content/Context;)V", "Lio/getstream/chat/android/client/logger/ChatLogLevel;", "level", "logLevel", "(Lio/getstream/chat/android/client/logger/ChatLogLevel;)Lio/getstream/chat/android/client/ChatClient$Builder;", "Lio/getstream/chat/android/client/logger/ChatLoggerHandler;", "loggerHandler", "(Lio/getstream/chat/android/client/logger/ChatLoggerHandler;)Lio/getstream/chat/android/client/ChatClient$Builder;", "Lio/getstream/chat/android/client/debugger/ChatClientDebugger;", "clientDebugger", "(Lio/getstream/chat/android/client/debugger/ChatClientDebugger;)Lio/getstream/chat/android/client/ChatClient$Builder;", "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;", "notificationConfig", "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;", "notificationsHandler", "notifications", "(Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;)Lio/getstream/chat/android/client/ChatClient$Builder;", "Lio/getstream/chat/android/client/uploader/FileTransformer;", "fileTransformer", "(Lio/getstream/chat/android/client/uploader/FileTransformer;)Lio/getstream/chat/android/client/ChatClient$Builder;", "Lio/getstream/chat/android/client/transformer/ApiModelTransformers;", "apiModelTransformers", "withApiModelTransformer", "(Lio/getstream/chat/android/client/transformer/ApiModelTransformers;)Lio/getstream/chat/android/client/ChatClient$Builder;", "Lio/getstream/chat/android/client/uploader/FileUploader;", "fileUploader", "(Lio/getstream/chat/android/client/uploader/FileUploader;)Lio/getstream/chat/android/client/ChatClient$Builder;", "Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;", "sendMessageInterceptor", "(Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;)Lio/getstream/chat/android/client/ChatClient$Builder;", "disableWarmUp", "()Lio/getstream/chat/android/client/ChatClient$Builder;", "Lud3/l0;", "okHttpClient", "(Lud3/l0;)Lio/getstream/chat/android/client/ChatClient$Builder;", "value", "baseUrl", "(Ljava/lang/String;)Lio/getstream/chat/android/client/ChatClient$Builder;", "forceHttpUrl", "forceWsUrl", "Lio/getstream/chat/android/client/cdn/CDN;", "cdn", "(Lio/getstream/chat/android/client/cdn/CDN;)Lio/getstream/chat/android/client/ChatClient$Builder;", "cdnUrl", "forceInsecureConnection", "Lio/getstream/chat/android/client/api/ChatClientConfig;", "config", "(Lio/getstream/chat/android/client/api/ChatClientConfig;)Lio/getstream/chat/android/client/ChatClient$Builder;", "Lio/getstream/chat/android/client/user/storage/UserCredentialStorage;", "credentialStorage", "(Lio/getstream/chat/android/client/user/storage/UserCredentialStorage;)Lio/getstream/chat/android/client/ChatClient$Builder;", "", "shouldDebug", "debugRequests", "(Z)Lio/getstream/chat/android/client/ChatClient$Builder;", "Lr23/d;", "retryPolicy", "(Lr23/d;)Lio/getstream/chat/android/client/ChatClient$Builder;", "disableDistinctApiCalls", "Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;", "type", "uploadAttachmentsNetworkType", "(Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;)Lio/getstream/chat/android/client/ChatClient$Builder;", "appName", "appVersion", "Lio/getstream/chat/android/client/ChatClient;", "build", "()Lio/getstream/chat/android/client/ChatClient;", "internalBuild", "chatClientConfig", "", "Lio/getstream/chat/android/client/plugin/factory/PluginFactory;", "setupPluginFactories", "(Lio/getstream/chat/android/client/api/ChatClientConfig;)Ljava/util/List;", "Ll83/a0;", "setupStreamLog", "()V", "warmUpReflection", "Ljava/lang/String;", "Landroid/content/Context;", "Z", "Lio/getstream/chat/android/client/logger/ChatLogLevel;", "warmUp", "Lio/getstream/chat/android/client/logger/ChatLoggerHandler;", "Lio/getstream/chat/android/client/debugger/ChatClientDebugger;", "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;", "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;", "Lio/getstream/chat/android/client/uploader/FileUploader;", "Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;", "Lio/getstream/chat/android/client/token/TokenManager;", "tokenManager", "Lio/getstream/chat/android/client/token/TokenManager;", "customOkHttpClient", "Lud3/l0;", "userCredentialStorage", "Lio/getstream/chat/android/client/user/storage/UserCredentialStorage;", "Lr23/d;", "distinctApiCalls", "Lio/getstream/chat/android/client/api/ChatClientConfig;", "Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;", "Lio/getstream/chat/android/client/uploader/FileTransformer;", "Lio/getstream/chat/android/client/transformer/ApiModelTransformers;", "Lio/getstream/chat/android/client/cdn/CDN;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Builder extends ChatClientBuilder {
        private final String apiKey;
        private ApiModelTransformers apiModelTransformers;
        private final Context appContext;
        private String appName;
        private String appVersion;
        private String baseUrl;
        private CDN cdn;
        private String cdnUrl;
        private ChatClientConfig chatClientConfig;
        private ChatClientDebugger clientDebugger;
        private C34826l0 customOkHttpClient;
        private boolean debugRequests;
        private boolean distinctApiCalls;
        private FileTransformer fileTransformer;
        private FileUploader fileUploader;
        private String forceHttpUrl;
        private boolean forceInsecureConnection;
        private String forceWsUrl;
        private ChatLogLevel logLevel;
        private ChatLoggerHandler loggerHandler;
        private NotificationConfig notificationConfig;
        private NotificationHandler notificationsHandler;
        private InterfaceC30894d retryPolicy;
        private SendMessageInterceptor sendMessageInterceptor;
        private final TokenManager tokenManager;
        private UploadAttachmentsNetworkType uploadAttachmentsNetworkType;
        private UserCredentialStorage userCredentialStorage;
        private boolean warmUp;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder(String apiKey, Context appContext) {
            AbstractC22676k.m65750j(apiKey, "apiKey");
            AbstractC22676k.m65750j(appContext, "appContext");
            this.apiKey = apiKey;
            this.appContext = appContext;
            this.baseUrl = "chat.stream-io-api.com";
            this.logLevel = ChatLogLevel.NOTHING;
            this.warmUp = true;
            boolean z4 = false;
            this.notificationConfig = new NotificationConfig(z4, null, null, null, null, false, null, 126, null);
            this.tokenManager = new TokenManagerImpl();
            this.retryPolicy = new NoRetryPolicy();
            this.distinctApiCalls = true;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            this.chatClientConfig = new ChatClientConfig(z4, objArr, false, false, objArr2, null, objArr3, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
            this.uploadAttachmentsNetworkType = UploadAttachmentsNetworkType.CONNECTED;
            this.fileTransformer = NoOpFileTransformer.INSTANCE;
            Object[] objArr4 = 0 == true ? 1 : 0;
            this.apiModelTransformers = new ApiModelTransformers(null, objArr4, null, null, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ C2830f0 m54537a(Builder builder) {
            return (C2830f0) internalBuild$lambda$20(builder);
        }

        private static final ExoPlayer internalBuild$lambda$20(Builder builder) {
            C2857p c2857p = new C2857p(builder.appContext);
            C11387o2 c11387o2 = new C11387o2(7);
            c11387o2.m30622n();
            c2857p.m8251b(c11387o2.m30619g());
            return c2857p.m8250a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RepositoryFacade internalBuild$lambda$21() {
            return ChatClient.INSTANCE.instance().getRepositoryFacade();
        }

        public static /* synthetic */ Builder notifications$default(Builder builder, NotificationConfig notificationConfig, NotificationHandler notificationHandler, int i13, Object obj) {
            builder.notifications(notificationConfig, (i13 & 2) != 0 ? NotificationHandlerFactory.createNotificationHandler$default(builder.appContext, notificationConfig, null, null, null, null, null, null, null, null, null, 2044, null) : notificationHandler);
            return builder;
        }

        private final List<PluginFactory> setupPluginFactories(ChatClientConfig chatClientConfig) {
            C26460c c26460cM119000x = AbstractC37056f.m119000x();
            c26460cM119000x.add(ThrottlingPluginFactory.INSTANCE);
            c26460cM119000x.add(MessageDeliveredPluginFactory.INSTANCE);
            c26460cM119000x.add(new StreamStatePluginFactory(chatClientConfig, this.appContext));
            if (chatClientConfig.getOfflineEnabled()) {
                c26460cM119000x.add(new StreamOfflinePluginFactory(this.appContext, chatClientConfig.getIgnoredOfflineChannelTypes(), null, 4, null));
            }
            return AbstractC37056f.m118988k(c26460cM119000x);
        }

        private final void setupStreamLog() {
            ChatLogLevel chatLogLevel;
            if (C2343i.f9270b || (chatLogLevel = this.logLevel) == ChatLogLevel.NOTHING) {
                return;
            }
            C2343i.f9272d = new StreamLogLevelValidator(chatLogLevel);
            C2343i.m7229c(new C2336b(new C2335a(), new StreamLoggerHandler(this.loggerHandler)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void warmUpReflection() {
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            c22673i0.getOrCreateKotlinClass(DownstreamUserDto.class).getMembers();
            c22673i0.getOrCreateKotlinClass(DownstreamChannelDto.class).getMembers();
            c22673i0.getOrCreateKotlinClass(DownstreamMessageDto.class).getMembers();
            c22673i0.getOrCreateKotlinClass(DownstreamReactionDto.class).getMembers();
            c22673i0.getOrCreateKotlinClass(AttachmentDto.class).getMembers();
        }

        public final Builder appName(String appName) {
            AbstractC22676k.m65750j(appName, "appName");
            this.appName = appName;
            return this;
        }

        public final Builder appVersion(String appVersion) {
            AbstractC22676k.m65750j(appVersion, "appVersion");
            this.appVersion = appVersion;
            return this;
        }

        public final Builder baseUrl(String value) {
            AbstractC22676k.m65750j(value, "value");
            this.baseUrl = StringExtensionsKt.extractBaseUrl(value);
            return this;
        }

        @Override // io.getstream.chat.android.client.ChatClient.ChatClientBuilder
        public final ChatClient build() {
            return super.build();
        }

        public final Builder cdn(CDN cdn) {
            AbstractC22676k.m65750j(cdn, "cdn");
            this.cdn = cdn;
            return this;
        }

        public final Builder cdnUrl(String value) {
            AbstractC22676k.m65750j(value, "value");
            this.cdnUrl = StringExtensionsKt.extractBaseUrl(value);
            return this;
        }

        public final Builder clientDebugger(ChatClientDebugger clientDebugger) {
            AbstractC22676k.m65750j(clientDebugger, "clientDebugger");
            this.clientDebugger = clientDebugger;
            return this;
        }

        public final Builder config(ChatClientConfig config) {
            AbstractC22676k.m65750j(config, "config");
            this.chatClientConfig = config;
            return this;
        }

        public final Builder credentialStorage(UserCredentialStorage credentialStorage) {
            AbstractC22676k.m65750j(credentialStorage, "credentialStorage");
            this.userCredentialStorage = credentialStorage;
            return this;
        }

        public final Builder debugRequests(boolean shouldDebug) {
            this.debugRequests = shouldDebug;
            return this;
        }

        public final Builder disableDistinctApiCalls() {
            this.distinctApiCalls = false;
            return this;
        }

        public final Builder disableWarmUp() {
            this.warmUp = false;
            return this;
        }

        public final Builder fileTransformer(FileTransformer fileTransformer) {
            AbstractC22676k.m65750j(fileTransformer, "fileTransformer");
            this.fileTransformer = fileTransformer;
            return this;
        }

        public final Builder fileUploader(FileUploader fileUploader) {
            AbstractC22676k.m65750j(fileUploader, "fileUploader");
            this.fileUploader = fileUploader;
            return this;
        }

        @InternalStreamChatApi
        public final Builder forceHttpUrl(String value) {
            AbstractC22676k.m65750j(value, "value");
            this.forceHttpUrl = value;
            return this;
        }

        public final Builder forceInsecureConnection() {
            this.forceInsecureConnection = true;
            return this;
        }

        @InternalStreamChatApi
        public final Builder forceWsUrl(String value) {
            AbstractC22676k.m65750j(value, "value");
            this.forceWsUrl = value;
            return this;
        }

        @Override // io.getstream.chat.android.client.ChatClient.ChatClientBuilder
        @InternalStreamChatApi
        public final ChatClient internalBuild() {
            if (this.apiKey.length() == 0) {
                throw new IllegalStateException("apiKey is not defined in ".concat(Builder.class.getSimpleName()));
            }
            if (ChatClient.instance != null) {
                Log.e("Chat", "[ERROR] You have just re-initialized ChatClient, old configuration has been overridden [ERROR]");
            }
            boolean z4 = this.forceInsecureConnection || AbstractC39414r.m125876U(this.baseUrl, "localhost", false);
            String str = z4 ? "http" : "https";
            String str2 = z4 ? "ws" : "wss";
            C1593i0 c1593i0 = ProcessLifecycleOwner.f6173I.f6175F;
            String str3 = this.apiKey;
            String strM31997p = this.forceHttpUrl;
            if (strM31997p == null) {
                strM31997p = AbstractC11895b.m31997p(str, "://", this.baseUrl, "/");
            }
            String str4 = this.cdnUrl;
            if (str4 == null) {
                str4 = this.baseUrl;
            }
            String strM31997p2 = AbstractC11895b.m31997p(str, "://", str4, "/");
            String strM31997p3 = this.forceWsUrl;
            if (strM31997p3 == null) {
                strM31997p3 = AbstractC11895b.m31997p(str2, "://", this.baseUrl, "/");
            }
            ChatApiConfig chatApiConfig = new ChatApiConfig(str3, strM31997p, strM31997p2, strM31997p3, this.warmUp, new ChatLoggerConfigImpl(this.logLevel, this.loggerHandler), this.distinctApiCalls, this.debugRequests, this.notificationConfig, this.chatClientConfig.getFastEventParsing());
            setupStreamLog();
            ClientScope ClientScope = ClientScopeKt.ClientScope();
            UserScope UserScope = UserScopeKt.UserScope(ClientScope);
            AbstractC3006f0.m8732z(ClientScope, null, null, new ChatClient$Builder$internalBuild$2(this, null), 3);
            ServerClockOffset serverClockOffset = new ServerClockOffset(null, 0L, 0L, 7, null);
            ChatModule chatModule = new ChatModule(this.appContext, ClientScope, UserScope, chatApiConfig, this.notificationsHandler, this.apiModelTransformers, this.fileTransformer, this.fileUploader, this.sendMessageInterceptor, this.cdn, this.tokenManager, this.customOkHttpClient, this.clientDebugger, c1593i0, this.appName, this.appVersion, serverClockOffset);
            ChatApi chatApiApi = chatModule.api();
            AppSettingManager appSettingManager = new AppSettingManager(chatApiApi);
            StreamAudioPlayer streamAudioPlayer = new StreamAudioPlayer(new NativeMediaPlayerImpl(StreamMediaDataSource.INSTANCE.factory(this.appContext, this.cdn), new C0438l0(this, 17)), UserScope, 0L, 4, null);
            ChatClientRepository chatClientRepositoryFrom = ChatClientRepository.INSTANCE.from(ChatClientDatabase.INSTANCE.build(this.appContext));
            List<PluginFactory> list = setupPluginFactories(this.chatClientConfig);
            DtoMapping dtoMapping$stream_chat_android_client_release = chatModule.getDtoMapping$stream_chat_android_client_release();
            ChatNotifications chatNotificationsNotifications = chatModule.notifications();
            TokenManager tokenManager = this.tokenManager;
            UserCredentialStorage sharedPreferencesCredentialStorage = this.userCredentialStorage;
            if (sharedPreferencesCredentialStorage == null) {
                sharedPreferencesCredentialStorage = new SharedPreferencesCredentialStorage(this.appContext);
            }
            UserStateService userStateService = chatModule.getUserStateService();
            ChatClientDebugger chatClientDebugger = this.clientDebugger;
            if (chatClientDebugger == null) {
                chatClientDebugger = StubChatClientDebugger.INSTANCE;
            }
            InterfaceC30894d interfaceC30894d = this.retryPolicy;
            ChatSocket chatSocket$stream_chat_android_client_release = chatModule.getChatSocket$stream_chat_android_client_release();
            ArrayList arrayList = new ArrayList();
            ListIterator listIterator = ((C26460c) list).listIterator(0);
            while (true) {
                C26459b c26459b = (C26459b) listIterator;
                if (!c26459b.hasNext()) {
                    break;
                }
                Object next = c26459b.next();
                ListIterator listIterator2 = listIterator;
                if (next instanceof RepositoryFactory.Provider) {
                    arrayList.add(next);
                }
                listIterator = listIterator2;
            }
            RepositoryFactory.Provider provider = (RepositoryFactory.Provider) AbstractC25265s.m74100H0(arrayList);
            if (provider == null) {
                provider = NoOpRepositoryFactory.Provider.INSTANCE;
            }
            ChatClient chatClient = new ChatClient(chatApiConfig, chatApiApi, dtoMapping$stream_chat_android_client_release, chatNotificationsNotifications, tokenManager, sharedPreferencesCredentialStorage, userStateService, chatClientDebugger, null, ClientScope, UserScope, interfaceC30894d, appSettingManager, chatSocket$stream_chat_android_client_release, list, new MutableClientState(chatModule.getNetworkStateProvider()), chatModule.getCurrentUserFetcher(), provider, streamAudioPlayer, null, serverClockOffset, chatClientRepositoryFrom, new MessageReceiptReporter(UserScope, chatClientRepositoryFrom, chatApiApi), new MessageReceiptManager(ChatClient$Builder$internalBuild$3.INSTANCE, new C18681l0(5), chatClientRepositoryFrom, chatApiApi), this.cdn, 524544, null);
            chatClient.attachmentsSender = new AttachmentsSender(this.appContext, this.uploadAttachmentsNetworkType, chatClient.getClientState(), ClientScope, null, 16, null);
            return chatClient;
        }

        public final Builder logLevel(ChatLogLevel level) {
            AbstractC22676k.m65750j(level, "level");
            this.logLevel = level;
            return this;
        }

        public final Builder loggerHandler(ChatLoggerHandler loggerHandler) {
            AbstractC22676k.m65750j(loggerHandler, "loggerHandler");
            this.loggerHandler = loggerHandler;
            return this;
        }

        public final Builder notifications(NotificationConfig notificationConfig) {
            AbstractC22676k.m65750j(notificationConfig, "notificationConfig");
            notifications$default(this, notificationConfig, null, 2, null);
            return this;
        }

        public final Builder okHttpClient(C34826l0 okHttpClient) {
            AbstractC22676k.m65750j(okHttpClient, "okHttpClient");
            this.customOkHttpClient = okHttpClient;
            return this;
        }

        public final Builder retryPolicy(InterfaceC30894d retryPolicy) {
            AbstractC22676k.m65750j(retryPolicy, "retryPolicy");
            this.retryPolicy = retryPolicy;
            return this;
        }

        public final Builder sendMessageInterceptor(SendMessageInterceptor sendMessageInterceptor) {
            AbstractC22676k.m65750j(sendMessageInterceptor, "sendMessageInterceptor");
            this.sendMessageInterceptor = sendMessageInterceptor;
            return this;
        }

        public final Builder uploadAttachmentsNetworkType(UploadAttachmentsNetworkType type) {
            AbstractC22676k.m65750j(type, "type");
            this.uploadAttachmentsNetworkType = type;
            return this;
        }

        public final Builder withApiModelTransformer(ApiModelTransformers apiModelTransformers) {
            AbstractC22676k.m65750j(apiModelTransformers, "apiModelTransformers");
            this.apiModelTransformers = apiModelTransformers;
            return this;
        }

        public final Builder notifications(NotificationConfig notificationConfig, NotificationHandler notificationsHandler) {
            AbstractC22676k.m65750j(notificationConfig, "notificationConfig");
            AbstractC22676k.m65750j(notificationsHandler, "notificationsHandler");
            this.notificationConfig = notificationConfig;
            this.notificationsHandler = notificationsHandler;
            return this;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H'¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/chat/android/client/ChatClient$ChatClientBuilder;", "", "<init>", "()V", "build", "Lio/getstream/chat/android/client/ChatClient;", "internalBuild", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static abstract class ChatClientBuilder {
        @InternalStreamChatApi
        public ChatClientBuilder() {
        }

        public ChatClient build() {
            ChatClient chatClientInternalBuild = internalBuild();
            ChatClient.instance = chatClientInternalBuild;
            return chatClientInternalBuild;
        }

        @InternalStreamChatApi
        public abstract ChatClient internalBuild();
    }

    @Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00178\u0000X\u0081T¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001a\u0010\u0003R(\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010$\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b$\u0010%\u0012\u0004\b*\u0010\u0003\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00101\u001a\u00020#8FX\u0087\u0004¢\u0006\f\u0012\u0004\b2\u0010\u0003\u001a\u0004\b1\u0010'R\u0014\u00104\u001a\u0002038\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010\u0019R\u0014\u0010:\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010\u0019R\u0014\u0010;\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u0010\u0019R\u0014\u0010<\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00108R\u0014\u0010=\u001a\u0002068\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u00108R\u0014\u0010>\u001a\u0002068\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u00108R\u0014\u0010?\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\u00178\u0000X\u0080T¢\u0006\u0006\n\u0004\bE\u0010\u0019¨\u0006F"}, m65681d2 = {"Lio/getstream/chat/android/client/ChatClient$Companion;", "", "<init>", "()V", "Lio/getstream/chat/android/client/ChatClient;", "ensureClientInitialized", "()Lio/getstream/chat/android/client/ChatClient;", "instance", "Lio/getstream/chat/android/models/PushMessage;", "pushMessage", "Ll83/a0;", "handlePushMessage", "(Lio/getstream/chat/android/models/PushMessage;)V", "Lio/getstream/chat/android/client/notifications/handler/ChatNotification;", "notification", "displayNotification$stream_chat_android_client_release", "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V", "displayNotification", "Lio/getstream/chat/android/models/Device;", "device", "setDevice$stream_chat_android_client_release", "(Lio/getstream/chat/android/models/Device;)V", "setDevice", "", "TAG", "Ljava/lang/String;", "getTAG$annotations", "Lio/getstream/chat/android/client/header/VersionPrefixHeader;", "VERSION_PREFIX_HEADER", "Lio/getstream/chat/android/client/header/VersionPrefixHeader;", "getVERSION_PREFIX_HEADER", "()Lio/getstream/chat/android/client/header/VersionPrefixHeader;", "setVERSION_PREFIX_HEADER", "(Lio/getstream/chat/android/client/header/VersionPrefixHeader;)V", "getVERSION_PREFIX_HEADER$annotations", "", "OFFLINE_SUPPORT_ENABLED", "Z", "getOFFLINE_SUPPORT_ENABLED", "()Z", "setOFFLINE_SUPPORT_ENABLED", "(Z)V", "getOFFLINE_SUPPORT_ENABLED$annotations", "Lio/getstream/chat/android/models/User;", "anonUser$delegate", "Ll83/h;", "getAnonUser", "()Lio/getstream/chat/android/models/User;", "anonUser", "isInitialized", "isInitialized$annotations", "", "MAX_COOLDOWN_TIME_SECONDS", "I", "", "DEFAULT_CONNECTION_STATE_TIMEOUT", "J", "KEY_MESSAGE_ACTION", "MESSAGE_ACTION_SEND", "MESSAGE_ACTION_SHUFFLE", "THIRTY_DAYS_IN_MILLISECONDS", "INITIALIZATION_DELAY", "RESOLVE_DEPENDENCY_TIMEOUT", "ARG_TYPING_PARENT_ID", "Lio/getstream/chat/android/client/ChatClient;", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Member;", "DEFAULT_SORT", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "ANONYMOUS_USER_ID", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final ChatClient ensureClientInitialized() throws IllegalStateException {
            if (isInitialized()) {
                return instance();
            }
            throw new IllegalStateException("ChatClient should be initialized first!");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final User getAnonUser() {
            return (User) ChatClient.anonUser$delegate.getValue();
        }

        @InternalStreamChatApi
        public static /* synthetic */ void getOFFLINE_SUPPORT_ENABLED$annotations() {
        }

        @InternalStreamChatApi
        public static /* synthetic */ void getTAG$annotations() {
        }

        @InternalStreamChatApi
        public static /* synthetic */ void getVERSION_PREFIX_HEADER$annotations() {
        }

        public static /* synthetic */ void isInitialized$annotations() {
        }

        public final void displayNotification$stream_chat_android_client_release(ChatNotification notification) throws IllegalStateException {
            AbstractC22676k.m65750j(notification, "notification");
            ensureClientInitialized().notifications.displayNotification(notification);
        }

        public final boolean getOFFLINE_SUPPORT_ENABLED() {
            return ChatClient.OFFLINE_SUPPORT_ENABLED;
        }

        public final VersionPrefixHeader getVERSION_PREFIX_HEADER() {
            return ChatClient.VERSION_PREFIX_HEADER;
        }

        public final void handlePushMessage(PushMessage pushMessage) throws IllegalStateException {
            AbstractC22676k.m65750j(pushMessage, "pushMessage");
            ChatClient chatClientEnsureClientInitialized = ensureClientInitialized();
            String type = pushMessage.getType();
            if (type == null) {
                type = "";
            }
            if (!((Boolean) chatClientEnsureClientInitialized.getConfig().getNotificationConfig().getIgnorePushMessageWhenUserOnline().invoke(type)).booleanValue() || !chatClientEnsureClientInitialized.isSocketConnected()) {
                AbstractC3006f0.m8732z(chatClientEnsureClientInitialized.clientScope, null, null, new ChatClient$Companion$handlePushMessage$1$1(chatClientEnsureClientInitialized, pushMessage, null), 3);
                return;
            }
            C2345k logger = chatClientEnsureClientInitialized.getLogger();
            InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
                logger.m7230a().log(enumC2341g, logger.m7231b(), "[handlePushMessage] received push message while WS is connected - ignoring", null);
            }
        }

        public final ChatClient instance() {
            ChatClient chatClient = ChatClient.instance;
            if (chatClient != null) {
                return chatClient;
            }
            throw new IllegalStateException("ChatClient.Builder::build() must be called before obtaining ChatClient instance");
        }

        public final boolean isInitialized() {
            return ChatClient.instance != null;
        }

        public final void setDevice$stream_chat_android_client_release(Device device) throws IllegalStateException {
            AbstractC22676k.m65750j(device, "device");
            ChatClient chatClientEnsureClientInitialized = ensureClientInitialized();
            chatClientEnsureClientInitialized.notifications.setDevice(chatClientEnsureClientInitialized.getCurrentUser(), device);
        }

        public final void setOFFLINE_SUPPORT_ENABLED(boolean z4) {
            ChatClient.OFFLINE_SUPPORT_ENABLED = z4;
        }

        public final void setVERSION_PREFIX_HEADER(VersionPrefixHeader versionPrefixHeader) {
            AbstractC22676k.m65750j(versionPrefixHeader, "<set-?>");
            ChatClient.VERSION_PREFIX_HEADER = versionPrefixHeader;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$awaitConnectionState$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient", m100430f = "ChatClient.kt", m100431l = {1615}, m100432m = "awaitConnectionState")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C188921 extends AbstractC32269c {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C188921(InterfaceC30057d<? super C188921> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChatClient.this.awaitConnectionState(null, null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$awaitConnectionState$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$awaitConnectionState$2", m100430f = "ChatClient.kt", m100431l = {1616}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lio/getstream/chat/android/models/ConnectionState;", "<anonymous>", "(Lbc3/c0;)Lio/getstream/chat/android/models/ConnectionState;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C188932 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ ConnectionState $state;
        final /* synthetic */ ClientState $this_awaitConnectionState;
        int label;

        /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$awaitConnectionState$2$1, reason: invalid class name */
        @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$awaitConnectionState$2$1", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
        @Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m65681d2 = {"<anonymous>", "", "it", "Lio/getstream/chat/android/models/ConnectionState;"}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class AnonymousClass1 extends AbstractC32275i implements InterfaceC4351m {
            final /* synthetic */ ConnectionState $state;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ConnectionState connectionState, InterfaceC30057d<? super AnonymousClass1> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.$state = connectionState;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, interfaceC30057d);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(ConnectionState connectionState, InterfaceC30057d<? super Boolean> interfaceC30057d) {
                return ((AnonymousClass1) create(connectionState, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                ConnectionState connectionState = (ConnectionState) this.L$0;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return Boolean.valueOf(AbstractC22676k.m65745e(connectionState, this.$state));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C188932(ClientState clientState, ConnectionState connectionState, InterfaceC30057d<? super C188932> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$this_awaitConnectionState = clientState;
            this.$state = connectionState;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C188932(this.$this_awaitConnectionState, this.$state, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super ConnectionState> interfaceC30057d) {
            return ((C188932) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC13037f2 connectionState = this.$this_awaitConnectionState.getConnectionState();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, null);
            this.label = 1;
            Object objM36616z = AbstractC13091v.m36616z(connectionState, anonymousClass1, this);
            return objM36616z == enumC31071a ? enumC31071a : objM36616z;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$awaitInitializationState$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$awaitInitializationState$2", m100430f = "ChatClient.kt", m100431l = {439}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C188942 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ C22669g0 $initState;
        final /* synthetic */ long $timeoutMilliseconds;
        Object L$0;
        int label;
        final /* synthetic */ ChatClient this$0;

        /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$awaitInitializationState$2$1, reason: invalid class name */
        @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$awaitInitializationState$2$1", m100430f = "ChatClient.kt", m100431l = {440}, m100432m = "invokeSuspend")
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lio/getstream/chat/android/models/InitializationState;", "<anonymous>", "(Lbc3/c0;)Lio/getstream/chat/android/models/InitializationState;"}, m65682k = 3, m65683mv = {2, 2, 0})
        public static final class AnonymousClass1 extends AbstractC32275i implements InterfaceC4351m {
            int label;
            final /* synthetic */ ChatClient this$0;

            /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$awaitInitializationState$2$1$1, reason: invalid class name and collision with other inner class name */
            @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$awaitInitializationState$2$1$1", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
            @Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m65681d2 = {"<anonymous>", "", "it", "Lio/getstream/chat/android/models/InitializationState;"}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C417661 extends AbstractC32275i implements InterfaceC4351m {
                /* synthetic */ Object L$0;
                int label;

                public C417661(InterfaceC30057d<? super C417661> interfaceC30057d) {
                    super(2, interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    C417661 c417661 = new C417661(2, interfaceC30057d);
                    c417661.L$0 = obj;
                    return c417661;
                }

                @Override // c93.InterfaceC4351m
                public final Object invoke(InitializationState initializationState, InterfaceC30057d<? super Boolean> interfaceC30057d) {
                    return ((C417661) create(initializationState, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    InitializationState initializationState = (InitializationState) this.L$0;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return Boolean.valueOf(initializationState == InitializationState.COMPLETE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ChatClient chatClient, InterfaceC30057d<? super AnonymousClass1> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.this$0 = chatClient;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new AnonymousClass1(this.this$0, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InitializationState> interfaceC30057d) {
                return ((AnonymousClass1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.label;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC13037f2 initializationState = this.this$0.getClientState().getInitializationState();
                C417661 c417661 = new C417661(2, null);
                this.label = 1;
                Object objM36616z = AbstractC13091v.m36616z(initializationState, c417661, this);
                return objM36616z == enumC31071a ? enumC31071a : objM36616z;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C188942(C22669g0 c22669g0, long j7, ChatClient chatClient, InterfaceC30057d<? super C188942> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$initState = c22669g0;
            this.$timeoutMilliseconds = j7;
            this.this$0 = chatClient;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C188942(this.$initState, this.$timeoutMilliseconds, this.this$0, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C188942) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C22669g0 c22669g0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C22669g0 c22669g1 = this.$initState;
                long j7 = this.$timeoutMilliseconds;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.L$0 = c22669g1;
                this.label = 1;
                Object objM8750d = AbstractC3028k2.m8750d(j7, anonymousClass1, this);
                if (objM8750d == enumC31071a) {
                    return enumC31071a;
                }
                c22669g0 = c22669g1;
                obj = objM8750d;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c22669g0 = (C22669g0) this.L$0;
                AbstractC34132o.m107864I(obj);
            }
            c22669g0.f89336w = obj;
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$blockUser$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$blockUser$1", m100430f = "ChatClient.kt", m100431l = {3614}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/UserBlock;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C188951 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $userId;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C188951(String str, InterfaceC30057d<? super C188951> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$userId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C188951 c188951 = ChatClient.this.new C188951(this.$userId, interfaceC30057d);
            c188951.L$0 = obj;
            return c188951;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            User user;
            User userCopy$default;
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Iterator<T> it = ChatClient.this.getPlugins().iterator();
                while (it.hasNext()) {
                    ((Plugin) it.next()).onBlockUserResult(abstractC26205h);
                }
                if ((abstractC26205h instanceof C26204g) && (user = (User) ((C13045h2) ChatClient.this.mutableClientState.getUser()).getValue()) != null && !user.getBlockedUserIds().contains(this.$userId)) {
                    userCopy$default = User.copy$default(user, null, null, null, null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, AbstractC25265s.m74128f1(this.$userId, user.getBlockedUserIds()), null, null, null, null, 32505855, null);
                    UserStateService userStateService = ChatClient.this.userStateService;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = userCopy$default;
                    this.label = 1;
                    if (userStateService.onUserUpdated(userCopy$default, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return c23454a0;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userCopy$default = (User) this.L$2;
            AbstractC34132o.m107864I(obj);
            ChatClient.this.mutableClientState.setUser(userCopy$default);
            return c23454a0;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C188951) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$clearCacheAndTemporaryFiles$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$clearCacheAndTemporaryFiles$1", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C188961 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C188961(Context context, InterfaceC30057d<? super C188961> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$context = context;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C188961(this.$context, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C188961) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C2345k logger = ChatClient.this.getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[clearCacheAndTemporaryFiles] Clearing all cache and temporary files", null);
            }
            AbstractC26205h abstractC26205hClearAllCache = ChatClient.this.fileManager.clearAllCache(this.$context);
            AbstractC26205h abstractC26205hClearExternalStorage = ChatClient.this.fileManager.clearExternalStorage(this.$context);
            if (abstractC26205hClearAllCache instanceof C26203f) {
                return abstractC26205hClearAllCache;
            }
            return abstractC26205hClearExternalStorage instanceof C26203f ? abstractC26205hClearExternalStorage : new C26204g(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$clearPersistence$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$clearPersistence$1", m100430f = "ChatClient.kt", m100431l = {1496}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C188971 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C188971(InterfaceC30057d<? super C188971> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C188971(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C188971) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ChatClient chatClient = ChatClient.this;
                this.label = 1;
                if (chatClient.disconnectSuspend(true, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return new C26204g(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$clearPersistence$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$clearPersistence$2", m100430f = "ChatClient.kt", m100431l = {1498}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C188982 extends AbstractC32275i implements Function1 {
        int label;

        public C188982(InterfaceC30057d<? super C188982> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C188982(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ChatClient chatClient = ChatClient.this;
                this.label = 1;
                if (chatClient.m54536xe26c02ca(this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C188982) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$connectAnonymousUser$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$connectAnonymousUser$1", m100430f = "ChatClient.kt", m100431l = {888}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Lio/getstream/chat/android/models/ConnectionData;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C188991 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Long $timeoutMilliseconds;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C188991(Long l7, InterfaceC30057d<? super C188991> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$timeoutMilliseconds = l7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C188991(this.$timeoutMilliseconds, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C188991) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String string;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C2345k logger = ChatClient.this.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, "[connectAnonymousUser] no args", null);
                }
                ChatClient.this.userScope.getUserId().setValue(ChatClient.ANONYMOUS_USER_ID);
                ChatClient chatClient = ChatClient.this;
                User anonUser = ChatClient.INSTANCE.getAnonUser();
                ConstantTokenProvider constantTokenProvider = new ConstantTokenProvider(ChatClient.this.devToken(ChatClient.ANONYMOUS_USER_ID));
                Long l7 = this.$timeoutMilliseconds;
                this.label = 1;
                obj = chatClient.setUser(anonUser, constantTokenProvider, l7, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC26205h abstractC26205h = (AbstractC26205h) obj;
            C2345k logger2 = ChatClient.this.getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str2 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (!interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                return obj;
            }
            InterfaceC2344j interfaceC2344j = logger2.f9274b;
            if (abstractC26205h instanceof C26204g) {
                string = AbstractC11895b.m31996o("ConnectionData(connectionId=", ((ConnectionData) ((C26204g) abstractC26205h).f103919a).getConnectionId(), ")");
            } else {
                if (!(abstractC26205h instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                string = ((C26203f) abstractC26205h).f103918a.toString();
            }
            interfaceC2344j.log(enumC2341g2, str2, AbstractC11266d.m30461o("[connectAnonymousUser] completed: ", string), null);
            return obj;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$connectGuestUser$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$connectGuestUser$1", m100430f = "ChatClient.kt", m100431l = {920, 921}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Lio/getstream/chat/android/models/ConnectionData;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189001 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Long $timeoutMilliseconds;
        final /* synthetic */ String $userId;
        final /* synthetic */ String $username;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189001(String str, String str2, Long l7, InterfaceC30057d<? super C189001> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$userId = str;
            this.$username = str2;
            this.$timeoutMilliseconds = l7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189001(this.$userId, this.$username, this.$timeoutMilliseconds, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189001) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:27:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:29:0x00da  */
        /* JADX WARN: Code duplicated, block: B:32:0x00df  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00a2, code lost:
        
            if (r12 == r0) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 235
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.ChatClient.C189001.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$connectUser$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$connectUser$1", m100430f = "ChatClient.kt", m100431l = {727}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Lio/getstream/chat/android/models/ConnectionData;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189011 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Long $timeoutMilliseconds;
        final /* synthetic */ TokenProvider $tokenProvider;
        final /* synthetic */ User $user;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189011(User user, TokenProvider tokenProvider, Long l7, InterfaceC30057d<? super C189011> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$user = user;
            this.$tokenProvider = tokenProvider;
            this.$timeoutMilliseconds = l7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189011(this.$user, this.$tokenProvider, this.$timeoutMilliseconds, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189011) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ChatClient.this.userScope.getUserId().setValue(this.$user.getId());
            ChatClient chatClient = ChatClient.this;
            User user = this.$user;
            TokenProvider tokenProvider = this.$tokenProvider;
            Long l7 = this.$timeoutMilliseconds;
            this.label = 1;
            Object objConnectUserSuspend = chatClient.connectUserSuspend(user, tokenProvider, l7, this);
            return objConnectUserSuspend == enumC31071a ? enumC31071a : objConnectUserSuspend;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$connectUserSuspend$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient", m100430f = "ChatClient.kt", m100431l = {739}, m100432m = "connectUserSuspend")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C189021 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C189021(InterfaceC30057d<? super C189021> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChatClient.this.connectUserSuspend(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$createChannel$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$createChannel$1", m100430f = "ChatClient.kt", m100431l = {4248}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189031 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ User $currentUser;
        final /* synthetic */ CreateChannelParams $params;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189031(String str, String str2, CreateChannelParams createChannelParams, User user, InterfaceC30057d<? super C189031> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$channelType = str;
            this.$channelId = str2;
            this.$params = createChannelParams;
            this.$currentUser = user;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189031(this.$channelType, this.$channelId, this.$params, this.$currentUser, interfaceC30057d);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0068  */
        /* JADX WARN: Code duplicated, block: B:13:0x007f  */
        /* JADX WARN: Code duplicated, block: B:16:0x00bb A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00b9 -> B:17:0x00bc). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0068
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r5 = r16
                r83.a r6 = r83.EnumC31071a.f128113w
                int r0 = r5.label
                r8 = 1
                if (r0 == 0) goto L42
                if (r0 != r8) goto L3a
                int r0 = r5.I$0
                java.lang.Object r1 = r5.L$8
                io.getstream.chat.android.client.plugin.Plugin r1 = (io.getstream.chat.android.client.plugin.Plugin) r1
                java.lang.Object r1 = r5.L$6
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r2 = r5.L$5
                io.getstream.chat.android.models.User r2 = (io.getstream.chat.android.models.User) r2
                java.lang.Object r3 = r5.L$4
                io.getstream.chat.android.client.query.CreateChannelParams r3 = (io.getstream.chat.android.client.query.CreateChannelParams) r3
                java.lang.Object r4 = r5.L$3
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r9 = r5.L$2
                java.lang.String r9 = (java.lang.String) r9
                java.lang.Object r10 = r5.L$1
                io.getstream.chat.android.client.ChatClient r10 = (io.getstream.chat.android.client.ChatClient) r10
                java.lang.Object r11 = r5.L$0
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                p505ts.AbstractC34132o.m107864I(r17)
                r7 = r4
                r4 = r2
                r2 = r7
                r11 = r10
                r7 = 0
                r10 = r1
                r1 = r9
                r9 = r0
                goto Lbc
            L3a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L42:
                p505ts.AbstractC34132o.m107864I(r17)
                io.getstream.chat.android.client.ChatClient r0 = io.getstream.chat.android.client.ChatClient.this
                java.util.List r0 = r0.getPlugins()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                io.getstream.chat.android.client.ChatClient r1 = io.getstream.chat.android.client.ChatClient.this
                java.lang.String r2 = r5.$channelType
                java.lang.String r3 = r5.$channelId
                io.getstream.chat.android.client.query.CreateChannelParams r4 = r5.$params
                io.getstream.chat.android.models.User r9 = r5.$currentUser
                java.util.Iterator r0 = r0.iterator()
                r10 = r0
                r11 = r1
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r9
                r9 = 0
            L62:
                boolean r0 = r10.hasNext()
                if (r0 == 0) goto Lbf
                java.lang.Object r0 = r10.next()
                io.getstream.chat.android.client.plugin.Plugin r0 = (io.getstream.chat.android.client.plugin.Plugin) r0
                b23.k r12 = io.getstream.chat.android.client.ChatClient.access$getLogger(r11)
                b23.e r13 = r12.f9275c
                java.lang.String r14 = r12.f9273a
                b23.g r15 = b23.EnumC2341g.VERBOSE
                boolean r13 = r13.isLoggable(r15, r14)
                r8 = 0
                if (r13 == 0) goto L98
                b23.j r12 = r12.f9274b
                java.lang.Class r13 = r0.getClass()
                kotlin.jvm.internal.i0 r7 = p715kotlin.jvm.internal.AbstractC22671h0.f89337a
                j93.d r7 = r7.getOrCreateKotlinClass(r13)
                java.lang.String r7 = r7.getQualifiedName()
                java.lang.String r13 = "[createChannel] #doOnStart; plugin: "
                java.lang.String r7 = p000.AbstractC11266d.m30461o(r13, r7)
                r12.log(r15, r14, r7, r8)
            L98:
                p715kotlin.jvm.internal.AbstractC22676k.m65747g(r4)
                r5.L$0 = r8
                r5.L$1 = r11
                r5.L$2 = r1
                r5.L$3 = r2
                r5.L$4 = r3
                r5.L$5 = r4
                r5.L$6 = r10
                r5.L$7 = r8
                r5.L$8 = r8
                r5.I$0 = r9
                r7 = 0
                r5.I$1 = r7
                r8 = 1
                r5.label = r8
                java.lang.Object r0 = r0.onCreateChannelRequest(r1, r2, r3, r4, r5)
                if (r0 != r6) goto Lbc
                return r6
            Lbc:
                r5 = r16
                goto L62
            Lbf:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.ChatClient.C189031.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189031) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$createChannel$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$createChannel$2", m100430f = "ChatClient.kt", m100431l = {4259}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/Channel;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189042 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ CreateChannelParams $params;
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189042(String str, String str2, CreateChannelParams createChannelParams, InterfaceC30057d<? super C189042> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$channelType = str;
            this.$channelId = str2;
            this.$params = createChannelParams;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189042 c189042 = ChatClient.this.new C189042(this.$channelType, this.$channelId, this.$params, interfaceC30057d);
            c189042.L$0 = obj;
            return c189042;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0065  */
        /* JADX WARN: Code duplicated, block: B:13:0x007c  */
        /* JADX WARN: Code duplicated, block: B:16:0x00b9 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00b7 -> B:17:0x00ba). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0065
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r5 = r16
                java.lang.Object r0 = r5.L$0
                r4 = r0
                n23.h r4 = (n23.AbstractC26205h) r4
                r83.a r6 = r83.EnumC31071a.f128113w
                int r0 = r5.label
                r8 = 1
                if (r0 == 0) goto L42
                if (r0 != r8) goto L3a
                int r0 = r5.I$0
                java.lang.Object r1 = r5.L$8
                io.getstream.chat.android.client.plugin.Plugin r1 = (io.getstream.chat.android.client.plugin.Plugin) r1
                java.lang.Object r1 = r5.L$6
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r2 = r5.L$5
                io.getstream.chat.android.client.query.CreateChannelParams r2 = (io.getstream.chat.android.client.query.CreateChannelParams) r2
                java.lang.Object r3 = r5.L$4
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r9 = r5.L$3
                java.lang.String r9 = (java.lang.String) r9
                java.lang.Object r10 = r5.L$2
                io.getstream.chat.android.client.ChatClient r10 = (io.getstream.chat.android.client.ChatClient) r10
                java.lang.Object r11 = r5.L$1
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                p505ts.AbstractC34132o.m107864I(r17)
                r11 = r2
                r2 = r3
                r12 = r10
                r7 = 0
                r10 = r1
                r1 = r9
                r9 = r0
                goto Lba
            L3a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L42:
                p505ts.AbstractC34132o.m107864I(r17)
                io.getstream.chat.android.client.ChatClient r0 = io.getstream.chat.android.client.ChatClient.this
                java.util.List r0 = r0.getPlugins()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                io.getstream.chat.android.client.ChatClient r1 = io.getstream.chat.android.client.ChatClient.this
                java.lang.String r2 = r5.$channelType
                java.lang.String r3 = r5.$channelId
                io.getstream.chat.android.client.query.CreateChannelParams r9 = r5.$params
                java.util.Iterator r0 = r0.iterator()
                r10 = r0
                r12 = r1
                r1 = r2
                r2 = r3
                r11 = r9
                r9 = 0
            L5f:
                boolean r0 = r10.hasNext()
                if (r0 == 0) goto Lbd
                java.lang.Object r0 = r10.next()
                io.getstream.chat.android.client.plugin.Plugin r0 = (io.getstream.chat.android.client.plugin.Plugin) r0
                b23.k r3 = io.getstream.chat.android.client.ChatClient.access$getLogger(r12)
                b23.e r13 = r3.f9275c
                java.lang.String r14 = r3.f9273a
                b23.g r15 = b23.EnumC2341g.VERBOSE
                boolean r13 = r13.isLoggable(r15, r14)
                r8 = 0
                if (r13 == 0) goto L95
                b23.j r3 = r3.f9274b
                java.lang.Class r13 = r0.getClass()
                kotlin.jvm.internal.i0 r7 = p715kotlin.jvm.internal.AbstractC22671h0.f89337a
                j93.d r7 = r7.getOrCreateKotlinClass(r13)
                java.lang.String r7 = r7.getQualifiedName()
                java.lang.String r13 = "[createChannel] #doOnResult; plugin: "
                java.lang.String r7 = p000.AbstractC11266d.m30461o(r13, r7)
                r3.log(r15, r14, r7, r8)
            L95:
                java.util.List r3 = r11.getMemberIds()
                r5.L$0 = r4
                r5.L$1 = r8
                r5.L$2 = r12
                r5.L$3 = r1
                r5.L$4 = r2
                r5.L$5 = r11
                r5.L$6 = r10
                r5.L$7 = r8
                r5.L$8 = r8
                r5.I$0 = r9
                r7 = 0
                r5.I$1 = r7
                r8 = 1
                r5.label = r8
                java.lang.Object r0 = r0.onCreateChannelResult(r1, r2, r3, r4, r5)
                if (r0 != r6) goto Lba
                return r6
            Lba:
                r5 = r16
                goto L5f
            Lbd:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.ChatClient.C189042.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189042) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$createChannel$3 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$createChannel$3", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/Plugin;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/client/plugin/Plugin;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189053 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ User $currentUser;
        final /* synthetic */ CreateChannelParams $params;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189053(User user, String str, CreateChannelParams createChannelParams, InterfaceC30057d<? super C189053> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$currentUser = user;
            this.$channelId = str;
            this.$params = createChannelParams;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189053 c189053 = new C189053(this.$currentUser, this.$channelId, this.$params, interfaceC30057d);
            c189053.L$0 = obj;
            return c189053;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(Plugin plugin, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189053) create(plugin, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Plugin plugin = (Plugin) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return plugin.onCreateChannelPrecondition(this.$currentUser, this.$channelId, this.$params.getMemberIds());
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$deleteChannel$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$deleteChannel$1", m100430f = "ChatClient.kt", m100431l = {3147}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189061 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189061(String str, String str2, InterfaceC30057d<? super C189061> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$channelType = str;
            this.$channelId = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189061(this.$channelType, this.$channelId, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String str;
            ChatClient chatClient;
            int i13;
            String str2;
            Iterator it;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C2345k logger = ChatClient.this.getLogger();
                String str3 = this.$channelType;
                String str4 = this.$channelId;
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str5 = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                if (interfaceC2339e.isLoggable(enumC2341g, str5)) {
                    logger.f9274b.log(enumC2341g, str5, AbstractC31061c.m95640p("[deleteChannel] #doOnStart; cid: ", str3, ":", str4), null);
                }
                List<Plugin> plugins = ChatClient.this.getPlugins();
                ChatClient chatClient2 = ChatClient.this;
                String str6 = this.$channelType;
                str = this.$channelId;
                chatClient = chatClient2;
                i13 = 0;
                str2 = str6;
                it = plugins.iterator();
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                it = (Iterator) this.L$4;
                str = (String) this.L$3;
                str2 = (String) this.L$2;
                chatClient = (ChatClient) this.L$1;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                User currentUser = chatClient.getCurrentUser();
                this.L$0 = null;
                this.L$1 = chatClient;
                this.L$2 = str2;
                this.L$3 = str;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (plugin.onDeleteChannelRequest(currentUser, str2, str, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189061) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$deleteChannel$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$deleteChannel$2", m100430f = "ChatClient.kt", m100431l = {3153}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/Channel;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189072 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189072(String str, String str2, InterfaceC30057d<? super C189072> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$channelType = str;
            this.$channelId = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189072 c189072 = ChatClient.this.new C189072(this.$channelType, this.$channelId, interfaceC30057d);
            c189072.L$0 = obj;
            return c189072;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String str;
            int i13;
            String str2;
            Iterator it;
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C2345k logger = ChatClient.this.getLogger();
                String str3 = this.$channelType;
                String str4 = this.$channelId;
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str5 = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str5)) {
                    InterfaceC2344j interfaceC2344j = logger.f9274b;
                    StringBuilder sbM32001t = AbstractC11895b.m32001t("[deleteChannel] #doOnResult; completed(", str3, ":", str4, "): ");
                    sbM32001t.append(abstractC26205h);
                    interfaceC2344j.log(enumC2341g, str5, sbM32001t.toString(), null);
                }
                List<Plugin> plugins = ChatClient.this.getPlugins();
                str = this.$channelType;
                i13 = 0;
                str2 = this.$channelId;
                it = plugins.iterator();
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                it = (Iterator) this.L$4;
                str2 = (String) this.L$3;
                str = (String) this.L$2;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                this.L$0 = abstractC26205h;
                this.L$1 = null;
                this.L$2 = str;
                this.L$3 = str2;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (plugin.onDeleteChannelResult(str, str2, abstractC26205h, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189072) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$deleteChannel$3 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$deleteChannel$3", m100430f = "ChatClient.kt", m100431l = {3157}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/Plugin;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/client/plugin/Plugin;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189083 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189083(String str, String str2, InterfaceC30057d<? super C189083> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$channelType = str;
            this.$channelId = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189083 c189083 = ChatClient.this.new C189083(this.$channelType, this.$channelId, interfaceC30057d);
            c189083.L$0 = obj;
            return c189083;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(Plugin plugin, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189083) create(plugin, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Plugin plugin = (Plugin) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            User currentUser = ChatClient.this.getCurrentUser();
            String str = this.$channelType;
            String str2 = this.$channelId;
            this.L$0 = null;
            this.label = 1;
            Object objOnDeleteChannelPrecondition = plugin.onDeleteChannelPrecondition(currentUser, str, str2, this);
            return objOnDeleteChannelPrecondition == enumC31071a ? enumC31071a : objOnDeleteChannelPrecondition;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$deleteDraftMessages$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$deleteDraftMessages$1", m100430f = "ChatClient.kt", m100431l = {2631}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ln23/h;", "Ll83/a0;", "result", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189091 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ DraftMessage $message;
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189091(String str, String str2, DraftMessage draftMessage, InterfaceC30057d<? super C189091> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$channelType = str;
            this.$channelId = str2;
            this.$message = draftMessage;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189091 c189091 = ChatClient.this.new C189091(this.$channelType, this.$channelId, this.$message, interfaceC30057d);
            c189091.L$0 = obj;
            return c189091;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:24:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:27:0x00f8 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f6 -> B:28:0x00f9). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 255
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.ChatClient.C189091.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189091) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$deleteMessage$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$deleteMessage$2", m100430f = "ChatClient.kt", m100431l = {2433}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189102 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $messageId;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189102(String str, InterfaceC30057d<? super C189102> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$messageId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189102(this.$messageId, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ChatClient chatClient;
            int i13;
            String str;
            Iterator it;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                List<Plugin> plugins = ChatClient.this.getPlugins();
                chatClient = ChatClient.this;
                i13 = 0;
                str = this.$messageId;
                it = plugins.iterator();
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                it = (Iterator) this.L$3;
                str = (String) this.L$2;
                chatClient = (ChatClient) this.L$1;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                C2345k logger = chatClient.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str2 = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                    logger.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("[deleteMessage] #doOnStart; plugin: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(plugin.getClass()).getQualifiedName()), null);
                }
                this.L$0 = null;
                this.L$1 = chatClient;
                this.L$2 = str;
                this.L$3 = it;
                this.L$4 = null;
                this.L$5 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (plugin.onMessageDeleteRequest(str, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189102) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$deleteMessage$3 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$deleteMessage$3", m100430f = "ChatClient.kt", m100431l = {2439}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/Message;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189113 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $messageId;
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189113(String str, InterfaceC30057d<? super C189113> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$messageId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189113 c189113 = ChatClient.this.new C189113(this.$messageId, interfaceC30057d);
            c189113.L$0 = obj;
            return c189113;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ChatClient chatClient;
            int i13;
            String str;
            Iterator it;
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                List<Plugin> plugins = ChatClient.this.getPlugins();
                chatClient = ChatClient.this;
                i13 = 0;
                str = this.$messageId;
                it = plugins.iterator();
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                it = (Iterator) this.L$4;
                str = (String) this.L$3;
                chatClient = (ChatClient) this.L$2;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                C2345k logger = chatClient.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str2 = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                    logger.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("[deleteMessage] #doOnResult; plugin: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(plugin.getClass()).getQualifiedName()), null);
                }
                this.L$0 = abstractC26205h;
                this.L$1 = null;
                this.L$2 = chatClient;
                this.L$3 = str;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (plugin.onMessageDeleteResult(str, abstractC26205h, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189113) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$deleteMessage$4 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$deleteMessage$4", m100430f = "ChatClient.kt", m100431l = {2443}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/Plugin;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/client/plugin/Plugin;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189124 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $messageId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189124(String str, InterfaceC30057d<? super C189124> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$messageId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189124 c189124 = new C189124(this.$messageId, interfaceC30057d);
            c189124.L$0 = obj;
            return c189124;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(Plugin plugin, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189124) create(plugin, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Plugin plugin = (Plugin) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            String str = this.$messageId;
            this.L$0 = null;
            this.label = 1;
            Object objOnMessageDeletePrecondition = plugin.onMessageDeletePrecondition(str, this);
            return objOnMessageDeletePrecondition == enumC31071a ? enumC31071a : objOnMessageDeletePrecondition;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$deleteMessageForMe$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$deleteMessageForMe$2", m100430f = "ChatClient.kt", m100431l = {2460}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189132 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $messageId;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189132(String str, InterfaceC30057d<? super C189132> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$messageId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189132(this.$messageId, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ChatClient chatClient;
            int i13;
            String str;
            Iterator it;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                List<Plugin> plugins = ChatClient.this.getPlugins();
                chatClient = ChatClient.this;
                i13 = 0;
                str = this.$messageId;
                it = plugins.iterator();
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                it = (Iterator) this.L$3;
                str = (String) this.L$2;
                chatClient = (ChatClient) this.L$1;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                C2345k logger = chatClient.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str2 = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                    logger.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("[deleteMessageForMe] #doOnStart; plugin: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(plugin.getClass()).getQualifiedName()), null);
                }
                this.L$0 = null;
                this.L$1 = chatClient;
                this.L$2 = str;
                this.L$3 = it;
                this.L$4 = null;
                this.L$5 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (plugin.onDeleteMessageForMeRequest(str, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189132) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$deleteMessageForMe$3 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$deleteMessageForMe$3", m100430f = "ChatClient.kt", m100431l = {2466}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/Message;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189143 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $messageId;
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189143(String str, InterfaceC30057d<? super C189143> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$messageId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189143 c189143 = ChatClient.this.new C189143(this.$messageId, interfaceC30057d);
            c189143.L$0 = obj;
            return c189143;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ChatClient chatClient;
            int i13;
            String str;
            Iterator it;
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                List<Plugin> plugins = ChatClient.this.getPlugins();
                chatClient = ChatClient.this;
                i13 = 0;
                str = this.$messageId;
                it = plugins.iterator();
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                it = (Iterator) this.L$4;
                str = (String) this.L$3;
                chatClient = (ChatClient) this.L$2;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                C2345k logger = chatClient.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str2 = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                    logger.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("[deleteMessageForMe] #doOnResult; plugin: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(plugin.getClass()).getQualifiedName()), null);
                }
                this.L$0 = abstractC26205h;
                this.L$1 = null;
                this.L$2 = chatClient;
                this.L$3 = str;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (plugin.onDeleteMessageForMeResult(str, abstractC26205h, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189143) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$deleteMessageForMe$4 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$deleteMessageForMe$4", m100430f = "ChatClient.kt", m100431l = {2470}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/Plugin;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/client/plugin/Plugin;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189154 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $messageId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189154(String str, InterfaceC30057d<? super C189154> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$messageId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189154 c189154 = new C189154(this.$messageId, interfaceC30057d);
            c189154.L$0 = obj;
            return c189154;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(Plugin plugin, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189154) create(plugin, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Plugin plugin = (Plugin) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            String str = this.$messageId;
            this.L$0 = null;
            this.label = 1;
            Object objOnDeleteMessageForMePrecondition = plugin.onDeleteMessageForMePrecondition(str, this);
            return objOnDeleteMessageForMePrecondition == enumC31071a ? enumC31071a : objOnDeleteMessageForMePrecondition;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$deleteReaction$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$deleteReaction$1", m100430f = "ChatClient.kt", m100431l = {1211}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189161 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $cid;
        final /* synthetic */ User $currentUser;
        final /* synthetic */ String $messageId;
        final /* synthetic */ String $reactionType;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189161(String str, String str2, String str3, User user, InterfaceC30057d<? super C189161> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$cid = str;
            this.$messageId = str2;
            this.$reactionType = str3;
            this.$currentUser = user;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189161(this.$cid, this.$messageId, this.$reactionType, this.$currentUser, interfaceC30057d);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0068  */
        /* JADX WARN: Code duplicated, block: B:13:0x007f  */
        /* JADX WARN: Code duplicated, block: B:16:0x00bb A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00b9 -> B:17:0x00bc). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0068
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r5 = r16
                r83.a r6 = r83.EnumC31071a.f128113w
                int r0 = r5.label
                r8 = 1
                if (r0 == 0) goto L42
                if (r0 != r8) goto L3a
                int r0 = r5.I$0
                java.lang.Object r1 = r5.L$8
                io.getstream.chat.android.client.plugin.Plugin r1 = (io.getstream.chat.android.client.plugin.Plugin) r1
                java.lang.Object r1 = r5.L$6
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r2 = r5.L$5
                io.getstream.chat.android.models.User r2 = (io.getstream.chat.android.models.User) r2
                java.lang.Object r3 = r5.L$4
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r5.L$3
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r9 = r5.L$2
                java.lang.String r9 = (java.lang.String) r9
                java.lang.Object r10 = r5.L$1
                io.getstream.chat.android.client.ChatClient r10 = (io.getstream.chat.android.client.ChatClient) r10
                java.lang.Object r11 = r5.L$0
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                p505ts.AbstractC34132o.m107864I(r17)
                r7 = r4
                r4 = r2
                r2 = r7
                r11 = r10
                r7 = 0
                r10 = r1
                r1 = r9
                r9 = r0
                goto Lbc
            L3a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L42:
                p505ts.AbstractC34132o.m107864I(r17)
                io.getstream.chat.android.client.ChatClient r0 = io.getstream.chat.android.client.ChatClient.this
                java.util.List r0 = r0.getPlugins()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                io.getstream.chat.android.client.ChatClient r1 = io.getstream.chat.android.client.ChatClient.this
                java.lang.String r2 = r5.$cid
                java.lang.String r3 = r5.$messageId
                java.lang.String r4 = r5.$reactionType
                io.getstream.chat.android.models.User r9 = r5.$currentUser
                java.util.Iterator r0 = r0.iterator()
                r10 = r0
                r11 = r1
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r9
                r9 = 0
            L62:
                boolean r0 = r10.hasNext()
                if (r0 == 0) goto Lbf
                java.lang.Object r0 = r10.next()
                io.getstream.chat.android.client.plugin.Plugin r0 = (io.getstream.chat.android.client.plugin.Plugin) r0
                b23.k r12 = io.getstream.chat.android.client.ChatClient.access$getLogger(r11)
                b23.e r13 = r12.f9275c
                java.lang.String r14 = r12.f9273a
                b23.g r15 = b23.EnumC2341g.VERBOSE
                boolean r13 = r13.isLoggable(r15, r14)
                r8 = 0
                if (r13 == 0) goto L98
                b23.j r12 = r12.f9274b
                java.lang.Class r13 = r0.getClass()
                kotlin.jvm.internal.i0 r7 = p715kotlin.jvm.internal.AbstractC22671h0.f89337a
                j93.d r7 = r7.getOrCreateKotlinClass(r13)
                java.lang.String r7 = r7.getQualifiedName()
                java.lang.String r13 = "[deleteReaction] #doOnStart; plugin: "
                java.lang.String r7 = p000.AbstractC11266d.m30461o(r13, r7)
                r12.log(r15, r14, r7, r8)
            L98:
                p715kotlin.jvm.internal.AbstractC22676k.m65747g(r4)
                r5.L$0 = r8
                r5.L$1 = r11
                r5.L$2 = r1
                r5.L$3 = r2
                r5.L$4 = r3
                r5.L$5 = r4
                r5.L$6 = r10
                r5.L$7 = r8
                r5.L$8 = r8
                r5.I$0 = r9
                r7 = 0
                r5.I$1 = r7
                r8 = 1
                r5.label = r8
                java.lang.Object r0 = r0.onDeleteReactionRequest(r1, r2, r3, r4, r5)
                if (r0 != r6) goto Lbc
                return r6
            Lbc:
                r5 = r16
                goto L62
            Lbf:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.ChatClient.C189161.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189161) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$deleteReaction$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$deleteReaction$2", m100430f = "ChatClient.kt", m100431l = {1222}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/Message;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189172 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $cid;
        final /* synthetic */ User $currentUser;
        final /* synthetic */ String $messageId;
        final /* synthetic */ String $reactionType;
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189172(String str, String str2, String str3, User user, InterfaceC30057d<? super C189172> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$cid = str;
            this.$messageId = str2;
            this.$reactionType = str3;
            this.$currentUser = user;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189172 c189172 = ChatClient.this.new C189172(this.$cid, this.$messageId, this.$reactionType, this.$currentUser, interfaceC30057d);
            c189172.L$0 = obj;
            return c189172;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x006d  */
        /* JADX WARN: Code duplicated, block: B:13:0x0083  */
        /* JADX WARN: Code duplicated, block: B:14:0x009e  */
        /* JADX WARN: Code duplicated, block: B:17:0x00c4 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00c2 -> B:18:0x00c5). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x00c4
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 203
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.ChatClient.C189172.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189172) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$deleteReaction$3 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$deleteReaction$3", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/Plugin;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/client/plugin/Plugin;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189183 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ User $currentUser;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189183(User user, InterfaceC30057d<? super C189183> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$currentUser = user;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189183 c189183 = new C189183(this.$currentUser, interfaceC30057d);
            c189183.L$0 = obj;
            return c189183;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(Plugin plugin, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189183) create(plugin, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Plugin plugin = (Plugin) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return plugin.onDeleteReactionPrecondition(this.$currentUser);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$disconnect$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$disconnect$1", m100430f = "ChatClient.kt", m100431l = {1556, 1558}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189191 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ boolean $deleteDevice;
        final /* synthetic */ boolean $flushPersistence;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189191(boolean z4, boolean z13, InterfaceC30057d<? super C189191> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$deleteDevice = z4;
            this.$flushPersistence = z13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189191(this.$deleteDevice, this.$flushPersistence, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189191) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
        
            if (r9.disconnectSuspend(r1, r8) == r0) goto L22;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r8.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r9)
                goto L6d
            L10:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L18:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L60
            L1c:
                p505ts.AbstractC34132o.m107864I(r9)
                io.getstream.chat.android.client.ChatClient r9 = io.getstream.chat.android.client.ChatClient.this
                b23.k r9 = io.getstream.chat.android.client.ChatClient.access$getLogger(r9)
                boolean r1 = r8.$flushPersistence
                b23.e r4 = r9.f9275c
                java.lang.String r5 = r9.f9273a
                b23.g r6 = b23.EnumC2341g.DEBUG
                boolean r4 = r4.isLoggable(r6, r5)
                r7 = 0
                if (r4 == 0) goto L3f
                b23.j r9 = r9.f9274b
                java.lang.String r4 = "[disconnect] flushPersistence: "
                java.lang.String r1 = p000.AbstractC11266d.m30462p(r4, r1)
                r9.log(r6, r5, r1, r7)
            L3f:
                io.getstream.chat.android.client.ChatClient r9 = io.getstream.chat.android.client.ChatClient.this
                boolean r9 = io.getstream.chat.android.client.ChatClient.access$isUserSet(r9)
                if (r9 != r3) goto L75
                boolean r9 = r8.$deleteDevice
                if (r9 == 0) goto L60
                io.getstream.chat.android.client.ChatClient r9 = io.getstream.chat.android.client.ChatClient.this
                io.getstream.chat.android.client.notifications.ChatNotifications r9 = io.getstream.chat.android.client.ChatClient.access$getNotifications$p(r9)
                io.getstream.chat.android.client.ChatClient r1 = io.getstream.chat.android.client.ChatClient.this
                io.getstream.chat.android.models.User r1 = r1.getCurrentUser()
                r8.label = r3
                java.lang.Object r9 = r9.deleteDevice(r1, r8)
                if (r9 != r0) goto L60
                goto L6c
            L60:
                io.getstream.chat.android.client.ChatClient r9 = io.getstream.chat.android.client.ChatClient.this
                boolean r1 = r8.$flushPersistence
                r8.label = r2
                java.lang.Object r9 = io.getstream.chat.android.client.ChatClient.access$disconnectSuspend(r9, r1, r8)
                if (r9 != r0) goto L6d
            L6c:
                return r0
            L6d:
                n23.g r9 = new n23.g
                l83.a0 r0 = l83.C23454a0.f92919a
                r9.<init>(r0)
                return r9
            L75:
                if (r9 != 0) goto L9d
                io.getstream.chat.android.client.ChatClient r9 = io.getstream.chat.android.client.ChatClient.this
                b23.k r9 = io.getstream.chat.android.client.ChatClient.access$getLogger(r9)
                b23.e r0 = r9.f9275c
                java.lang.String r1 = r9.f9273a
                b23.g r2 = b23.EnumC2341g.INFO
                boolean r0 = r0.isLoggable(r2, r1)
                if (r0 == 0) goto L90
                b23.j r9 = r9.f9274b
                java.lang.String r0 = "[disconnect] cannot disconnect as the user wasn't connected"
                r9.log(r2, r1, r0, r7)
            L90:
                n23.f r9 = new n23.f
                n23.a r0 = new n23.a
                java.lang.String r1 = "ChatClient can't be disconnected because user wasn't connected previously"
                r0.<init>(r1)
                r9.<init>(r0)
                return r9
            L9d:
                kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.ChatClient.C189191.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$disconnectSocket$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$disconnectSocket$1", m100430f = "ChatClient.kt", m100431l = {1300}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189201 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C189201(InterfaceC30057d<? super C189201> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189201(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189201) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ChatSocket chatSocket = ChatClient.this.chatSocket;
                this.label = 1;
                if (chatSocket.disconnect(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return new C26204g(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$disconnectSuspend$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient", m100430f = "ChatClient.kt", m100431l = {1574}, m100432m = "disconnectSuspend")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C189211 extends AbstractC32269c {
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C189211(InterfaceC30057d<? super C189211> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChatClient.this.disconnectSuspend(false, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$disconnectUserSuspend$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient", m100430f = "ChatClient.kt", m100431l = {1583, 1590, 1591, 1592, 1596, 1600}, m100432m = "disconnectUserSuspend")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C189221 extends AbstractC32269c {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C189221(InterfaceC30057d<? super C189221> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChatClient.this.disconnectUserSuspend(false, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$doSendMessage$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$doSendMessage$2", m100430f = "ChatClient.kt", m100431l = {2672}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/Message;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189232 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ Message $message;
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189232(String str, String str2, Message message, InterfaceC30057d<? super C189232> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$channelType = str;
            this.$channelId = str2;
            this.$message = message;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189232 c189232 = ChatClient.this.new C189232(this.$channelType, this.$channelId, this.$message, interfaceC30057d);
            c189232.L$0 = obj;
            return c189232;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:24:0x00be  */
        /* JADX WARN: Code duplicated, block: B:27:0x00f7 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f5 -> B:28:0x00f8). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.ChatClient.C189232.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189232) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$editMessage$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$editMessage$1", m100430f = "ChatClient.kt", m100431l = {2756, 2764, 2772}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Lio/getstream/chat/android/models/Message;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189241 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ Message $message;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ ChatClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189241(Message message, ChatClient chatClient, String str, String str2, InterfaceC30057d<? super C189241> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$message = message;
            this.this$0 = chatClient;
            this.$channelType = str;
            this.$channelId = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C189241(this.$message, this.this$0, this.$channelType, this.$channelId, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189241) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0142, code lost:
        
            if (r0 == r6) goto L38;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r62) {
            /*
                Method dump skipped, instruction units count: 382
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.ChatClient.C189241.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$enrichUrl$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$enrichUrl$1", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189251 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189251(String str, InterfaceC30057d<? super C189251> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$url = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189251(this.$url, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC30057d<? super C23454a0>) obj);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C2345k logger = ChatClient.this.getLogger();
            String str = this.$url;
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str2 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                logger.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("[enrichUrl] #doOnStart; url: ", str), null);
            }
            return C23454a0.f92919a;
        }

        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C189251 c189251 = (C189251) create(interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c189251.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$enrichUrl$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$enrichUrl$2", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/Attachment;", "it", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189262 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $url;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189262(String str, InterfaceC30057d<? super C189262> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$url = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189262 c189262 = ChatClient.this.new C189262(this.$url, interfaceC30057d);
            c189262.L$0 = obj;
            return c189262;
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
            C2345k logger = ChatClient.this.getLogger();
            String str = this.$url;
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str2 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                logger.f9274b.log(enumC2341g, str2, "[enrichUrl] #doOnResult; completed(" + str + "): " + abstractC26205h, null);
            }
            return C23454a0.f92919a;
        }

        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C189262 c189262 = (C189262) create(abstractC26205h, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c189262.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$ensureCreatedLocallyAt$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient", m100430f = "ChatClient.kt", m100431l = {2558, 2571}, m100432m = "ensureCreatedLocallyAt")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C189271 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C189271(InterfaceC30057d<? super C189271> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChatClient.this.ensureCreatedLocallyAt(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$fetchCurrentUser$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$fetchCurrentUser$1", m100430f = "ChatClient.kt", m100431l = {1318}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Lio/getstream/chat/android/models/User;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189281 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C189281(InterfaceC30057d<? super C189281> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189281(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189281) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C2345k logger = ChatClient.this.getLogger();
                ChatClient chatClient = ChatClient.this;
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, "[fetchCurrentUser] isUserSet: " + chatClient.isUserSet() + ", isSocketConnected: " + chatClient.isSocketConnected(), null);
                }
                if (!ChatClient.this.isUserSet()) {
                    return new C26203f(new C26198a("User is not set, can't fetch current user"));
                }
                if (ChatClient.this.isSocketConnected()) {
                    return new C26203f(new C26198a("Socket is connected, can't fetch current user"));
                }
                CurrentUserFetcher currentUserFetcher = ChatClient.this.currentUserFetcher;
                User currentUser = ChatClient.this.getCurrentUser();
                AbstractC22676k.m65747g(currentUser);
                this.label = 1;
                obj = currentUserFetcher.fetch(currentUser, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (AbstractC26205h) obj;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$fetchCurrentUser$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$fetchCurrentUser$2", m100430f = "ChatClient.kt", m100431l = {1327}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/User;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189292 extends AbstractC32275i implements InterfaceC4351m {
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        public C189292(InterfaceC30057d<? super C189292> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189292 c189292 = ChatClient.this.new C189292(interfaceC30057d);
            c189292.L$0 = obj;
            return c189292;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            ChatClient chatClient;
            int i13;
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C2345k logger = ChatClient.this.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, "[fetchCurrentUser] completed: " + abstractC26205h, null);
                }
                User user = (User) abstractC26205h.m77816b();
                if (user != null) {
                    ChatClient.this.mutableClientState.setUser(user);
                }
                List<Plugin> plugins = ChatClient.this.getPlugins();
                ChatClient chatClient2 = ChatClient.this;
                it = plugins.iterator();
                chatClient = chatClient2;
                i13 = 0;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                it = (Iterator) this.L$3;
                chatClient = (ChatClient) this.L$2;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                C2345k logger2 = chatClient.getLogger();
                InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
                String str2 = logger2.f9273a;
                EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
                if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                    logger2.f9274b.log(enumC2341g2, str2, AbstractC11266d.m30461o("[fetchCurrentUser] #doOnResult; plugin: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(plugin.getClass()).getQualifiedName()), null);
                }
                this.L$0 = abstractC26205h;
                this.L$1 = null;
                this.L$2 = chatClient;
                this.L$3 = it;
                this.L$4 = null;
                this.L$5 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (plugin.onFetchCurrentUserResult(abstractC26205h, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189292) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$getChannel$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$getChannel$1", m100430f = "ChatClient.kt", m100431l = {ErrorCodes.TracksErrors.cNothingToReturn}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Lio/getstream/chat/android/models/Channel;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189301 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $cid;
        final /* synthetic */ int $memberLimit;
        final /* synthetic */ int $messageLimit;
        final /* synthetic */ boolean $state;
        Object L$0;
        int label;
        final /* synthetic */ ChatClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189301(String str, int i13, int i14, ChatClient chatClient, boolean z4, InterfaceC30057d<? super C189301> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$cid = str;
            this.$messageLimit = i13;
            this.$memberLimit = i14;
            this.this$0 = chatClient;
            this.$state = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C189301(this.$cid, this.$messageLimit, this.$memberLimit, this.this$0, this.$state, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189301) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objAwait;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            String str = null;
            Object[] objArr = 0;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                QueryChannelsRequest queryChannelsRequest = new QueryChannelsRequest(Filters.m54979eq("cid", this.$cid), 0, 1, null, new Integer(this.$messageLimit), new Integer(this.$memberLimit), null, null, null, 458, null);
                boolean z4 = this.$state;
                queryChannelsRequest.setWatch(false);
                queryChannelsRequest.setState(z4);
                C27485o c27485oM82909g = AbstractC27476f.m82909g(this.this$0.api.queryChannels(queryChannelsRequest), new C18510t(23));
                this.L$0 = null;
                this.label = 1;
                objAwait = c27485oM82909g.await(this);
                if (objAwait == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objAwait = obj;
            }
            AbstractC26205h abstractC26205h = (AbstractC26205h) objAwait;
            if (!(abstractC26205h instanceof C26204g)) {
                if (abstractC26205h instanceof C26203f) {
                    return abstractC26205h;
                }
                throw new NoWhenBranchMatchedException();
            }
            List list = (List) ((C26204g) abstractC26205h).f103919a;
            if (!list.isEmpty()) {
                return new C26204g(AbstractC25265s.m74096F0(list));
            }
            StreamChannelNotFoundException streamChannelNotFoundException = new StreamChannelNotFoundException(this.$cid, str, 2, objArr == true ? 1 : 0);
            return new C26203f(new C26201d(streamChannelNotFoundException.getMessage(), streamChannelNotFoundException));
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$getMessage$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$getMessage$2", m100430f = "ChatClient.kt", m100431l = {2491}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/Message;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189312 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $messageId;
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189312(String str, InterfaceC30057d<? super C189312> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$messageId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189312 c189312 = ChatClient.this.new C189312(this.$messageId, interfaceC30057d);
            c189312.L$0 = obj;
            return c189312;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ChatClient chatClient;
            int i13;
            String str;
            Iterator it;
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                List<Plugin> plugins = ChatClient.this.getPlugins();
                chatClient = ChatClient.this;
                i13 = 0;
                str = this.$messageId;
                it = plugins.iterator();
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                it = (Iterator) this.L$4;
                str = (String) this.L$3;
                chatClient = (ChatClient) this.L$2;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                C2345k logger = chatClient.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str2 = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                    logger.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("[getMessage] #doOnResult; plugin: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(plugin.getClass()).getQualifiedName()), null);
                }
                this.L$0 = abstractC26205h;
                this.L$1 = null;
                this.L$2 = chatClient;
                this.L$3 = str;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (plugin.onGetMessageResult(str, abstractC26205h, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189312) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$getNewerReplies$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$getNewerReplies$2", m100430f = "ChatClient.kt", m100431l = {2323}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189322 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $lastId;
        final /* synthetic */ int $limit;
        final /* synthetic */ String $parentId;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189322(String str, int i13, String str2, InterfaceC30057d<? super C189322> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$parentId = str;
            this.$limit = i13;
            this.$lastId = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189322(this.$parentId, this.$limit, this.$lastId, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ChatClient chatClient;
            int i13;
            String str;
            String str2;
            Iterator it;
            int i14;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i15 = this.label;
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                List<Plugin> plugins = ChatClient.this.getPlugins();
                ChatClient chatClient2 = ChatClient.this;
                String str3 = this.$parentId;
                chatClient = chatClient2;
                i13 = this.$limit;
                str = this.$lastId;
                str2 = str3;
                it = plugins.iterator();
                i14 = 0;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i14 = this.I$1;
                i13 = this.I$0;
                it = (Iterator) this.L$4;
                str = (String) this.L$3;
                str2 = (String) this.L$2;
                chatClient = (ChatClient) this.L$1;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                C2345k logger = chatClient.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str4 = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str4)) {
                    logger.f9274b.log(enumC2341g, str4, AbstractC11266d.m30461o("[getNewerReplies] #doOnStart; plugin: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(plugin.getClass()).getQualifiedName()), null);
                }
                this.L$0 = null;
                this.L$1 = chatClient;
                this.L$2 = str2;
                this.L$3 = str;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = i13;
                this.I$1 = i14;
                this.I$2 = 0;
                this.label = 1;
                if (plugin.onGetNewerRepliesRequest(str2, i13, str, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189322) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$getNewerReplies$3 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$getNewerReplies$3", m100430f = "ChatClient.kt", m100431l = {2329}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Ln23/h;", "", "Lio/getstream/chat/android/models/Message;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189333 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $lastId;
        final /* synthetic */ int $limit;
        final /* synthetic */ String $parentId;
        int I$0;
        int I$1;
        int I$2;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189333(String str, int i13, String str2, InterfaceC30057d<? super C189333> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$parentId = str;
            this.$limit = i13;
            this.$lastId = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189333 c189333 = ChatClient.this.new C189333(this.$parentId, this.$limit, this.$lastId, interfaceC30057d);
            c189333.L$0 = obj;
            return c189333;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0062  */
        /* JADX WARN: Code duplicated, block: B:13:0x0079  */
        /* JADX WARN: Code duplicated, block: B:16:0x00b2 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00b0 -> B:17:0x00b3). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0062
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r5 = r16
                java.lang.Object r0 = r5.L$0
                r1 = r0
                n23.h r1 = (n23.AbstractC26205h) r1
                r83.a r6 = r83.EnumC31071a.f128113w
                int r0 = r5.label
                r8 = 1
                if (r0 == 0) goto L3f
                if (r0 != r8) goto L37
                int r0 = r5.I$1
                int r2 = r5.I$0
                java.lang.Object r3 = r5.L$7
                io.getstream.chat.android.client.plugin.Plugin r3 = (io.getstream.chat.android.client.plugin.Plugin) r3
                java.lang.Object r3 = r5.L$5
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r5.L$4
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r9 = r5.L$3
                java.lang.String r9 = (java.lang.String) r9
                java.lang.Object r10 = r5.L$2
                io.getstream.chat.android.client.ChatClient r10 = (io.getstream.chat.android.client.ChatClient) r10
                java.lang.Object r11 = r5.L$1
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                p505ts.AbstractC34132o.m107864I(r17)
                r11 = r10
                r7 = 0
                r10 = r3
                r3 = r2
                r2 = r9
                r9 = r0
                goto Lb3
            L37:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L3f:
                p505ts.AbstractC34132o.m107864I(r17)
                io.getstream.chat.android.client.ChatClient r0 = io.getstream.chat.android.client.ChatClient.this
                java.util.List r0 = r0.getPlugins()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                io.getstream.chat.android.client.ChatClient r2 = io.getstream.chat.android.client.ChatClient.this
                java.lang.String r3 = r5.$parentId
                int r4 = r5.$limit
                java.lang.String r9 = r5.$lastId
                java.util.Iterator r0 = r0.iterator()
                r10 = r0
                r11 = r2
                r2 = r3
                r3 = r4
                r4 = r9
                r9 = 0
            L5c:
                boolean r0 = r10.hasNext()
                if (r0 == 0) goto Lb6
                java.lang.Object r0 = r10.next()
                io.getstream.chat.android.client.plugin.Plugin r0 = (io.getstream.chat.android.client.plugin.Plugin) r0
                b23.k r12 = io.getstream.chat.android.client.ChatClient.access$getLogger(r11)
                b23.e r13 = r12.f9275c
                java.lang.String r14 = r12.f9273a
                b23.g r15 = b23.EnumC2341g.VERBOSE
                boolean r13 = r13.isLoggable(r15, r14)
                r8 = 0
                if (r13 == 0) goto L92
                b23.j r12 = r12.f9274b
                java.lang.Class r13 = r0.getClass()
                kotlin.jvm.internal.i0 r7 = p715kotlin.jvm.internal.AbstractC22671h0.f89337a
                j93.d r7 = r7.getOrCreateKotlinClass(r13)
                java.lang.String r7 = r7.getQualifiedName()
                java.lang.String r13 = "[getNewerReplies] #doOnResult; plugin: "
                java.lang.String r7 = p000.AbstractC11266d.m30461o(r13, r7)
                r12.log(r15, r14, r7, r8)
            L92:
                r5.L$0 = r1
                r5.L$1 = r8
                r5.L$2 = r11
                r5.L$3 = r2
                r5.L$4 = r4
                r5.L$5 = r10
                r5.L$6 = r8
                r5.L$7 = r8
                r5.I$0 = r3
                r5.I$1 = r9
                r7 = 0
                r5.I$2 = r7
                r8 = 1
                r5.label = r8
                java.lang.Object r0 = r0.onGetNewerRepliesResult(r1, r2, r3, r4, r5)
                if (r0 != r6) goto Lb3
                return r6
            Lb3:
                r5 = r16
                goto L5c
            Lb6:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.ChatClient.C189333.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189333) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$getNewerReplies$4 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$getNewerReplies$4", m100430f = "ChatClient.kt", m100431l = {2332}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/Plugin;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/client/plugin/Plugin;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189344 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $parentId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189344(String str, InterfaceC30057d<? super C189344> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$parentId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189344 c189344 = new C189344(this.$parentId, interfaceC30057d);
            c189344.L$0 = obj;
            return c189344;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(Plugin plugin, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189344) create(plugin, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Plugin plugin = (Plugin) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            String str = this.$parentId;
            this.L$0 = null;
            this.label = 1;
            Object objOnGetRepliesPrecondition = plugin.onGetRepliesPrecondition(str, this);
            return objOnGetRepliesPrecondition == enumC31071a ? enumC31071a : objOnGetRepliesPrecondition;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$getReplies$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$getReplies$2", m100430f = "ChatClient.kt", m100431l = {2288}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189352 extends AbstractC32275i implements Function1 {
        final /* synthetic */ int $limit;
        final /* synthetic */ String $messageId;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189352(String str, int i13, InterfaceC30057d<? super C189352> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$messageId = str;
            this.$limit = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189352(this.$messageId, this.$limit, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ChatClient chatClient;
            int i13;
            String str;
            int i14;
            Iterator it;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i15 = this.label;
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                List<Plugin> plugins = ChatClient.this.getPlugins();
                ChatClient chatClient2 = ChatClient.this;
                chatClient = chatClient2;
                i13 = 0;
                str = this.$messageId;
                i14 = this.$limit;
                it = plugins.iterator();
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$1;
                i14 = this.I$0;
                it = (Iterator) this.L$3;
                str = (String) this.L$2;
                chatClient = (ChatClient) this.L$1;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                C2345k logger = chatClient.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str2 = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                    logger.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("[getReplies] #doOnStart; plugin: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(plugin.getClass()).getQualifiedName()), null);
                }
                this.L$0 = null;
                this.L$1 = chatClient;
                this.L$2 = str;
                this.L$3 = it;
                this.L$4 = null;
                this.L$5 = null;
                this.I$0 = i14;
                this.I$1 = i13;
                this.I$2 = 0;
                this.label = 1;
                if (plugin.onGetRepliesRequest(str, i14, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189352) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$getReplies$3 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$getReplies$3", m100430f = "ChatClient.kt", m100431l = {2294}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Ln23/h;", "", "Lio/getstream/chat/android/models/Message;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189363 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ int $limit;
        final /* synthetic */ String $messageId;
        int I$0;
        int I$1;
        int I$2;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189363(String str, int i13, InterfaceC30057d<? super C189363> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$messageId = str;
            this.$limit = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189363 c189363 = ChatClient.this.new C189363(this.$messageId, this.$limit, interfaceC30057d);
            c189363.L$0 = obj;
            return c189363;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ChatClient chatClient;
            int i13;
            String str;
            Iterator it;
            int i14;
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i15 = this.label;
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                List<Plugin> plugins = ChatClient.this.getPlugins();
                ChatClient chatClient2 = ChatClient.this;
                String str2 = this.$messageId;
                chatClient = chatClient2;
                i13 = this.$limit;
                str = str2;
                it = plugins.iterator();
                i14 = 0;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i14 = this.I$1;
                i13 = this.I$0;
                it = (Iterator) this.L$4;
                str = (String) this.L$3;
                chatClient = (ChatClient) this.L$2;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                C2345k logger = chatClient.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str3 = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str3)) {
                    logger.f9274b.log(enumC2341g, str3, AbstractC11266d.m30461o("[getReplies] #doOnResult; plugin: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(plugin.getClass()).getQualifiedName()), null);
                }
                this.L$0 = abstractC26205h;
                this.L$1 = null;
                this.L$2 = chatClient;
                this.L$3 = str;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = i13;
                this.I$1 = i14;
                this.I$2 = 0;
                this.label = 1;
                if (plugin.onGetRepliesResult(abstractC26205h, str, i13, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189363) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$getReplies$4 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$getReplies$4", m100430f = "ChatClient.kt", m100431l = {2297}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/Plugin;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/client/plugin/Plugin;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189374 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $messageId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189374(String str, InterfaceC30057d<? super C189374> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$messageId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189374 c189374 = new C189374(this.$messageId, interfaceC30057d);
            c189374.L$0 = obj;
            return c189374;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(Plugin plugin, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189374) create(plugin, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Plugin plugin = (Plugin) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            String str = this.$messageId;
            this.L$0 = null;
            this.label = 1;
            Object objOnGetRepliesPrecondition = plugin.onGetRepliesPrecondition(str, this);
            return objOnGetRepliesPrecondition == enumC31071a ? enumC31071a : objOnGetRepliesPrecondition;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$getRepliesMore$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$getRepliesMore$2", m100430f = "ChatClient.kt", m100431l = {2348}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189382 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $firstId;
        final /* synthetic */ int $limit;
        final /* synthetic */ String $messageId;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189382(String str, String str2, int i13, InterfaceC30057d<? super C189382> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$messageId = str;
            this.$firstId = str2;
            this.$limit = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189382(this.$messageId, this.$firstId, this.$limit, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String str;
            ChatClient chatClient;
            int i13;
            String str2;
            Iterator it;
            int i14;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i15 = this.label;
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                List<Plugin> plugins = ChatClient.this.getPlugins();
                ChatClient chatClient2 = ChatClient.this;
                String str3 = this.$messageId;
                str = this.$firstId;
                chatClient = chatClient2;
                i13 = this.$limit;
                str2 = str3;
                it = plugins.iterator();
                i14 = 0;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i14 = this.I$1;
                i13 = this.I$0;
                it = (Iterator) this.L$4;
                str = (String) this.L$3;
                str2 = (String) this.L$2;
                chatClient = (ChatClient) this.L$1;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                C2345k logger = chatClient.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str4 = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str4)) {
                    logger.f9274b.log(enumC2341g, str4, AbstractC11266d.m30461o("[getRepliesMore] #doOnStart; plugin: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(plugin.getClass()).getQualifiedName()), null);
                }
                this.L$0 = null;
                this.L$1 = chatClient;
                this.L$2 = str2;
                this.L$3 = str;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = i13;
                this.I$1 = i14;
                this.I$2 = 0;
                this.label = 1;
                if (plugin.onGetRepliesMoreRequest(str2, str, i13, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189382) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$getRepliesMore$3 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$getRepliesMore$3", m100430f = "ChatClient.kt", m100431l = {2354}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Ln23/h;", "", "Lio/getstream/chat/android/models/Message;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189393 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $firstId;
        final /* synthetic */ int $limit;
        final /* synthetic */ String $messageId;
        int I$0;
        int I$1;
        int I$2;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189393(String str, String str2, int i13, InterfaceC30057d<? super C189393> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$messageId = str;
            this.$firstId = str2;
            this.$limit = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189393 c189393 = ChatClient.this.new C189393(this.$messageId, this.$firstId, this.$limit, interfaceC30057d);
            c189393.L$0 = obj;
            return c189393;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0063  */
        /* JADX WARN: Code duplicated, block: B:13:0x007a  */
        /* JADX WARN: Code duplicated, block: B:16:0x00b3 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00b1 -> B:17:0x00b4). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0063
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r5 = r16
                java.lang.Object r0 = r5.L$0
                r1 = r0
                n23.h r1 = (n23.AbstractC26205h) r1
                r83.a r6 = r83.EnumC31071a.f128113w
                int r0 = r5.label
                r8 = 1
                if (r0 == 0) goto L40
                if (r0 != r8) goto L38
                int r0 = r5.I$1
                int r2 = r5.I$0
                java.lang.Object r3 = r5.L$7
                io.getstream.chat.android.client.plugin.Plugin r3 = (io.getstream.chat.android.client.plugin.Plugin) r3
                java.lang.Object r3 = r5.L$5
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r5.L$4
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r9 = r5.L$3
                java.lang.String r9 = (java.lang.String) r9
                java.lang.Object r10 = r5.L$2
                io.getstream.chat.android.client.ChatClient r10 = (io.getstream.chat.android.client.ChatClient) r10
                java.lang.Object r11 = r5.L$1
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                p505ts.AbstractC34132o.m107864I(r17)
                r11 = r10
                r7 = 0
                r10 = r3
                r3 = r4
                r4 = r2
                r2 = r9
                r9 = r0
                goto Lb4
            L38:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L40:
                p505ts.AbstractC34132o.m107864I(r17)
                io.getstream.chat.android.client.ChatClient r0 = io.getstream.chat.android.client.ChatClient.this
                java.util.List r0 = r0.getPlugins()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                io.getstream.chat.android.client.ChatClient r2 = io.getstream.chat.android.client.ChatClient.this
                java.lang.String r3 = r5.$messageId
                java.lang.String r4 = r5.$firstId
                int r9 = r5.$limit
                java.util.Iterator r0 = r0.iterator()
                r10 = r0
                r11 = r2
                r2 = r3
                r3 = r4
                r4 = r9
                r9 = 0
            L5d:
                boolean r0 = r10.hasNext()
                if (r0 == 0) goto Lb7
                java.lang.Object r0 = r10.next()
                io.getstream.chat.android.client.plugin.Plugin r0 = (io.getstream.chat.android.client.plugin.Plugin) r0
                b23.k r12 = io.getstream.chat.android.client.ChatClient.access$getLogger(r11)
                b23.e r13 = r12.f9275c
                java.lang.String r14 = r12.f9273a
                b23.g r15 = b23.EnumC2341g.VERBOSE
                boolean r13 = r13.isLoggable(r15, r14)
                r8 = 0
                if (r13 == 0) goto L93
                b23.j r12 = r12.f9274b
                java.lang.Class r13 = r0.getClass()
                kotlin.jvm.internal.i0 r7 = p715kotlin.jvm.internal.AbstractC22671h0.f89337a
                j93.d r7 = r7.getOrCreateKotlinClass(r13)
                java.lang.String r7 = r7.getQualifiedName()
                java.lang.String r13 = "[getRepliesMore] #doOnResult; plugin: "
                java.lang.String r7 = p000.AbstractC11266d.m30461o(r13, r7)
                r12.log(r15, r14, r7, r8)
            L93:
                r5.L$0 = r1
                r5.L$1 = r8
                r5.L$2 = r11
                r5.L$3 = r2
                r5.L$4 = r3
                r5.L$5 = r10
                r5.L$6 = r8
                r5.L$7 = r8
                r5.I$0 = r4
                r5.I$1 = r9
                r7 = 0
                r5.I$2 = r7
                r8 = 1
                r5.label = r8
                java.lang.Object r0 = r0.onGetRepliesMoreResult(r1, r2, r3, r4, r5)
                if (r0 != r6) goto Lb4
                return r6
            Lb4:
                r5 = r16
                goto L5d
            Lb7:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.ChatClient.C189393.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189393) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$getRepliesMore$4 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$getRepliesMore$4", m100430f = "ChatClient.kt", m100431l = {2357}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/Plugin;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/client/plugin/Plugin;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189404 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $messageId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189404(String str, InterfaceC30057d<? super C189404> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$messageId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189404 c189404 = new C189404(this.$messageId, interfaceC30057d);
            c189404.L$0 = obj;
            return c189404;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(Plugin plugin, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189404) create(plugin, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Plugin plugin = (Plugin) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            String str = this.$messageId;
            this.L$0 = null;
            this.label = 1;
            Object objOnGetRepliesPrecondition = plugin.onGetRepliesPrecondition(str, this);
            return objOnGetRepliesPrecondition == enumC31071a ? enumC31071a : objOnGetRepliesPrecondition;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$getSyncHistory$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$getSyncHistory$1", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Ln23/h;", "Ll83/a0;", "<anonymous>", "()Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189411 extends AbstractC32275i implements Function1 {
        final /* synthetic */ List<String> $channelsIds;
        final /* synthetic */ Date $lastSyncAt;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189411(List<String> list, Date date, InterfaceC30057d<? super C189411> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$channelsIds = list;
            this.$lastSyncAt = date;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189411(this.$channelsIds, this.$lastSyncAt, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ChatClient.this.checkSyncHistoryPreconditions(this.$channelsIds, this.$lastSyncAt);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189411) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$getSyncHistory$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$getSyncHistory$2", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Ln23/h;", "Ll83/a0;", "<anonymous>", "()Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189422 extends AbstractC32275i implements Function1 {
        final /* synthetic */ List<String> $channelsIds;
        final /* synthetic */ Date $parsedDate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189422(List<String> list, Date date, InterfaceC30057d<? super C189422> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$channelsIds = list;
            this.$parsedDate = date;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189422(this.$channelsIds, this.$parsedDate, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ChatClient.this.checkSyncHistoryPreconditions(this.$channelsIds, this.$parsedDate);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189422) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$handleEvent$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient", m100430f = "ChatClient.kt", m100431l = {483, 523, 532}, m100432m = "handleEvent")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C189431 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C189431(InterfaceC30057d<? super C189431> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChatClient.this.handleEvent(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$hideChannel$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$hideChannel$2", m100430f = "ChatClient.kt", m100431l = {3269}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189442 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ boolean $clearHistory;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189442(String str, String str2, boolean z4, InterfaceC30057d<? super C189442> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$channelType = str;
            this.$channelId = str2;
            this.$clearHistory = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189442(this.$channelType, this.$channelId, this.$clearHistory, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String str;
            ChatClient chatClient;
            boolean z4;
            String str2;
            Iterator it;
            int i13;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                List<Plugin> plugins = ChatClient.this.getPlugins();
                ChatClient chatClient2 = ChatClient.this;
                String str3 = this.$channelType;
                str = this.$channelId;
                chatClient = chatClient2;
                z4 = this.$clearHistory;
                str2 = str3;
                it = plugins.iterator();
                i13 = 0;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                z4 = this.Z$0;
                it = (Iterator) this.L$4;
                str = (String) this.L$3;
                str2 = (String) this.L$2;
                chatClient = (ChatClient) this.L$1;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                C2345k logger = chatClient.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str4 = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str4)) {
                    logger.f9274b.log(enumC2341g, str4, AbstractC11266d.m30461o("[hideChannel] #doOnStart; plugin: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(plugin.getClass()).getQualifiedName()), null);
                }
                this.L$0 = null;
                this.L$1 = chatClient;
                this.L$2 = str2;
                this.L$3 = str;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = null;
                this.Z$0 = z4;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (plugin.onHideChannelRequest(str2, str, z4, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189442) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$hideChannel$3 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$hideChannel$3", m100430f = "ChatClient.kt", m100431l = {3275}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ln23/h;", "Ll83/a0;", "result", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189453 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ boolean $clearHistory;
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189453(String str, String str2, boolean z4, InterfaceC30057d<? super C189453> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$channelType = str;
            this.$channelId = str2;
            this.$clearHistory = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189453 c189453 = ChatClient.this.new C189453(this.$channelType, this.$channelId, this.$clearHistory, interfaceC30057d);
            c189453.L$0 = obj;
            return c189453;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0063  */
        /* JADX WARN: Code duplicated, block: B:13:0x007a  */
        /* JADX WARN: Code duplicated, block: B:16:0x00b3 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00b1 -> B:17:0x00b4). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0063
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r5 = r16
                java.lang.Object r0 = r5.L$0
                r1 = r0
                n23.h r1 = (n23.AbstractC26205h) r1
                r83.a r6 = r83.EnumC31071a.f128113w
                int r0 = r5.label
                r8 = 1
                if (r0 == 0) goto L40
                if (r0 != r8) goto L38
                int r0 = r5.I$0
                boolean r2 = r5.Z$0
                java.lang.Object r3 = r5.L$7
                io.getstream.chat.android.client.plugin.Plugin r3 = (io.getstream.chat.android.client.plugin.Plugin) r3
                java.lang.Object r3 = r5.L$5
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r5.L$4
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r9 = r5.L$3
                java.lang.String r9 = (java.lang.String) r9
                java.lang.Object r10 = r5.L$2
                io.getstream.chat.android.client.ChatClient r10 = (io.getstream.chat.android.client.ChatClient) r10
                java.lang.Object r11 = r5.L$1
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                p505ts.AbstractC34132o.m107864I(r17)
                r11 = r10
                r7 = 0
                r10 = r3
                r3 = r4
                r4 = r2
                r2 = r9
                r9 = r0
                goto Lb4
            L38:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L40:
                p505ts.AbstractC34132o.m107864I(r17)
                io.getstream.chat.android.client.ChatClient r0 = io.getstream.chat.android.client.ChatClient.this
                java.util.List r0 = r0.getPlugins()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                io.getstream.chat.android.client.ChatClient r2 = io.getstream.chat.android.client.ChatClient.this
                java.lang.String r3 = r5.$channelType
                java.lang.String r4 = r5.$channelId
                boolean r9 = r5.$clearHistory
                java.util.Iterator r0 = r0.iterator()
                r10 = r0
                r11 = r2
                r2 = r3
                r3 = r4
                r4 = r9
                r9 = 0
            L5d:
                boolean r0 = r10.hasNext()
                if (r0 == 0) goto Lb7
                java.lang.Object r0 = r10.next()
                io.getstream.chat.android.client.plugin.Plugin r0 = (io.getstream.chat.android.client.plugin.Plugin) r0
                b23.k r12 = io.getstream.chat.android.client.ChatClient.access$getLogger(r11)
                b23.e r13 = r12.f9275c
                java.lang.String r14 = r12.f9273a
                b23.g r15 = b23.EnumC2341g.VERBOSE
                boolean r13 = r13.isLoggable(r15, r14)
                r8 = 0
                if (r13 == 0) goto L93
                b23.j r12 = r12.f9274b
                java.lang.Class r13 = r0.getClass()
                kotlin.jvm.internal.i0 r7 = p715kotlin.jvm.internal.AbstractC22671h0.f89337a
                j93.d r7 = r7.getOrCreateKotlinClass(r13)
                java.lang.String r7 = r7.getQualifiedName()
                java.lang.String r13 = "[hideChannel] #doOnResult; plugin: "
                java.lang.String r7 = p000.AbstractC11266d.m30461o(r13, r7)
                r12.log(r15, r14, r7, r8)
            L93:
                r5.L$0 = r1
                r5.L$1 = r8
                r5.L$2 = r11
                r5.L$3 = r2
                r5.L$4 = r3
                r5.L$5 = r10
                r5.L$6 = r8
                r5.L$7 = r8
                r5.Z$0 = r4
                r5.I$0 = r9
                r7 = 0
                r5.I$1 = r7
                r8 = 1
                r5.label = r8
                java.lang.Object r0 = r0.onHideChannelResult(r1, r2, r3, r4, r5)
                if (r0 != r6) goto Lb4
                return r6
            Lb4:
                r5 = r16
                goto L5d
            Lb7:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.ChatClient.C189453.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189453) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$hideChannel$4 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$hideChannel$4", m100430f = "ChatClient.kt", m100431l = {3278}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/Plugin;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/client/plugin/Plugin;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189464 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ boolean $clearHistory;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189464(String str, String str2, boolean z4, InterfaceC30057d<? super C189464> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$channelType = str;
            this.$channelId = str2;
            this.$clearHistory = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189464 c189464 = new C189464(this.$channelType, this.$channelId, this.$clearHistory, interfaceC30057d);
            c189464.L$0 = obj;
            return c189464;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(Plugin plugin, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189464) create(plugin, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Plugin plugin = (Plugin) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            String str = this.$channelType;
            String str2 = this.$channelId;
            boolean z4 = this.$clearHistory;
            this.L$0 = null;
            this.label = 1;
            Object objOnHideChannelPrecondition = plugin.onHideChannelPrecondition(str, str2, z4, this);
            return objOnHideChannelPrecondition == enumC31071a ? enumC31071a : objOnHideChannelPrecondition;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$keystroke$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$keystroke$2", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189472 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ Date $eventTime;
        final /* synthetic */ String $eventType;
        final /* synthetic */ Map<Object, Object> $extraData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189472(String str, String str2, String str3, Map<Object, ? extends Object> map, Date date, InterfaceC30057d<? super C189472> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$eventType = str;
            this.$channelType = str2;
            this.$channelId = str3;
            this.$extraData = map;
            this.$eventTime = date;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189472(this.$eventType, this.$channelType, this.$channelId, this.$extraData, this.$eventTime, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC30057d<? super C23454a0>) obj);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            List<Plugin> plugins = ChatClient.this.getPlugins();
            ChatClient chatClient = ChatClient.this;
            String str = this.$eventType;
            String str2 = this.$channelType;
            String str3 = this.$channelId;
            Map<Object, ? extends Object> map = this.$extraData;
            Date date = this.$eventTime;
            for (Plugin plugin : plugins) {
                C2345k logger = chatClient.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str4 = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str4)) {
                    logger.f9274b.log(enumC2341g, str4, AbstractC11266d.m30461o("[keystroke] #doOnStart; plugin: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(plugin.getClass()).getQualifiedName()), null);
                }
                plugin.onTypingEventRequest(str, str2, str3, map, date);
            }
            return C23454a0.f92919a;
        }

        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C189472 c189472 = (C189472) create(interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c189472.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$keystroke$3 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$keystroke$3", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/client/events/ChatEvent;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189483 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ Date $eventTime;
        final /* synthetic */ String $eventType;
        final /* synthetic */ Map<Object, Object> $extraData;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189483(String str, String str2, String str3, Map<Object, ? extends Object> map, Date date, InterfaceC30057d<? super C189483> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$eventType = str;
            this.$channelType = str2;
            this.$channelId = str3;
            this.$extraData = map;
            this.$eventTime = date;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189483 c189483 = ChatClient.this.new C189483(this.$eventType, this.$channelType, this.$channelId, this.$extraData, this.$eventTime, interfaceC30057d);
            c189483.L$0 = obj;
            return c189483;
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
            List<Plugin> plugins = ChatClient.this.getPlugins();
            ChatClient chatClient = ChatClient.this;
            String str = this.$eventType;
            String str2 = this.$channelType;
            String str3 = this.$channelId;
            Map<Object, ? extends Object> map = this.$extraData;
            Date date = this.$eventTime;
            for (Plugin plugin : plugins) {
                C2345k logger = chatClient.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str4 = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str4)) {
                    logger.f9274b.log(enumC2341g, str4, AbstractC11266d.m30461o("[keystroke] #doOnResult; plugin: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(plugin.getClass()).getQualifiedName()), null);
                }
                plugin.onTypingEventResult(abstractC26205h, str, str2, str3, map, date);
            }
            return C23454a0.f92919a;
        }

        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C189483 c189483 = (C189483) create(abstractC26205h, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c189483.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$keystroke$4 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$keystroke$4", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/Plugin;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/client/plugin/Plugin;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189494 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ Date $eventTime;
        final /* synthetic */ String $eventType;
        final /* synthetic */ Map<Object, Object> $extraData;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189494(String str, String str2, String str3, Map<Object, ? extends Object> map, Date date, InterfaceC30057d<? super C189494> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$eventType = str;
            this.$channelType = str2;
            this.$channelId = str3;
            this.$extraData = map;
            this.$eventTime = date;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189494 c189494 = new C189494(this.$eventType, this.$channelType, this.$channelId, this.$extraData, this.$eventTime, interfaceC30057d);
            c189494.L$0 = obj;
            return c189494;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(Plugin plugin, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189494) create(plugin, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Plugin plugin = (Plugin) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return plugin.onTypingEventPrecondition(this.$eventType, this.$channelType, this.$channelId, this.$extraData, this.$eventTime);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$markAllRead$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$markAllRead$1", m100430f = "ChatClient.kt", m100431l = {3503}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189501 extends AbstractC32275i implements Function1 {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        public C189501(InterfaceC30057d<? super C189501> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189501(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            int i13;
            C23454a0 c23454a0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C2345k logger = ChatClient.this.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, "[markAllRead] #doOnStart; no args", null);
                }
                it = ChatClient.this.getPlugins().iterator();
                i13 = 0;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                it = (Iterator) this.L$1;
                AbstractC34132o.m107864I(obj);
            }
            do {
                boolean zHasNext = it.hasNext();
                c23454a0 = C23454a0.f92919a;
                if (!zHasNext) {
                    return c23454a0;
                }
                Plugin plugin = (Plugin) it.next();
                this.L$0 = null;
                this.L$1 = it;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                plugin.onMarkAllReadRequest(this);
            } while (c23454a0 != enumC31071a);
            return enumC31071a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189501) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$markAllRead$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$markAllRead$2", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ln23/h;", "Ll83/a0;", "it", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189512 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C189512(InterfaceC30057d<? super C189512> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189512(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((AbstractC26205h) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C2345k logger = ChatClient.this.getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[markAllRead] #doOnResult; completed", null);
            }
            return C23454a0.f92919a;
        }

        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C189512 c189512 = (C189512) create(abstractC26205h, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c189512.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$markMessageAsDelivered$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$markMessageAsDelivered$1", m100430f = "ChatClient.kt", m100431l = {3187}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189521 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $messageId;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189521(String str, InterfaceC30057d<? super C189521> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$messageId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189521 c189521 = ChatClient.this.new C189521(this.$messageId, interfaceC30057d);
            c189521.L$0 = obj;
            return c189521;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189521) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM107888l;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ChatClient chatClient = ChatClient.this;
                    String str = this.$messageId;
                    MessageReceiptManager messageReceiptManager = chatClient.getMessageReceiptManager();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.I$0 = 0;
                    this.label = 1;
                    obj = messageReceiptManager.markMessageAsDelivered(str, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                objM107888l = (Boolean) obj;
                objM107888l.getClass();
            } catch (Throwable th3) {
                objM107888l = AbstractC34132o.m107888l(th3);
            }
            Throwable thM68037a = C23468n.m68037a(objM107888l);
            if (thM68037a == null) {
                return new C26204g((Boolean) objM107888l);
            }
            String message = thM68037a.getMessage();
            if (message == null) {
                message = "";
            }
            return new C26203f(new C26198a(message));
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$markMessageAsDelivered$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$markMessageAsDelivered$2", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189532 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $messageId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189532(String str, InterfaceC30057d<? super C189532> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$messageId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189532(this.$messageId, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC30057d<? super C23454a0>) obj);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C2345k logger = ChatClient.this.getLogger();
            String str = this.$messageId;
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str2 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                logger.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("[markMessageAsDelivered] #doOnStart; messageId: ", str), null);
            }
            return C23454a0.f92919a;
        }

        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C189532 c189532 = (C189532) create(interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c189532.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$markMessageAsDelivered$3 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$markMessageAsDelivered$3", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "", "it", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189543 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $messageId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189543(String str, InterfaceC30057d<? super C189543> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$messageId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189543(this.$messageId, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((AbstractC26205h) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C2345k logger = ChatClient.this.getLogger();
            String str = this.$messageId;
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str2 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                logger.f9274b.log(enumC2341g, str2, AbstractC11895b.m31996o("[markMessageAsDelivered] #doOnResult; completed(", str, ")"), null);
            }
            return C23454a0.f92919a;
        }

        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C189543 c189543 = (C189543) create(abstractC26205h, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c189543.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$markMessageRead$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$markMessageRead$1", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189551 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ String $messageId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189551(String str, String str2, String str3, InterfaceC30057d<? super C189551> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$channelType = str;
            this.$channelId = str2;
            this.$messageId = str3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189551(this.$channelType, this.$channelId, this.$messageId, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC30057d<? super C23454a0>) obj);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C2345k logger = ChatClient.this.getLogger();
            String str = this.$channelType;
            String str2 = this.$channelId;
            String str3 = this.$messageId;
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str4 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str4)) {
                InterfaceC2344j interfaceC2344j = logger.f9274b;
                StringBuilder sbM32001t = AbstractC11895b.m32001t("[markMessageRead] #doOnStart; cid: ", str, ":", str2, ", msgId: ");
                sbM32001t.append(str3);
                interfaceC2344j.log(enumC2341g, str4, sbM32001t.toString(), null);
            }
            return C23454a0.f92919a;
        }

        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C189551 c189551 = (C189551) create(interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c189551.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$markMessageRead$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$markMessageRead$2", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ln23/h;", "Ll83/a0;", "it", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189562 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ String $messageId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189562(String str, String str2, String str3, InterfaceC30057d<? super C189562> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$channelType = str;
            this.$channelId = str2;
            this.$messageId = str3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189562 c189562 = ChatClient.this.new C189562(this.$channelType, this.$channelId, this.$messageId, interfaceC30057d);
            c189562.L$0 = obj;
            return c189562;
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
            C2345k logger = ChatClient.this.getLogger();
            String str = this.$channelType;
            String str2 = this.$channelId;
            String str3 = this.$messageId;
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str4 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str4)) {
                InterfaceC2344j interfaceC2344j = logger.f9274b;
                StringBuilder sbM32001t = AbstractC11895b.m32001t("[markMessageRead] #doOnResult; completed(", str, ":", str2, "-");
                sbM32001t.append(str3);
                sbM32001t.append("): ");
                sbM32001t.append(abstractC26205h);
                interfaceC2344j.log(enumC2341g, str4, sbM32001t.toString(), null);
            }
            return C23454a0.f92919a;
        }

        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C189562 c189562 = (C189562) create(abstractC26205h, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c189562.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$markRead$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$markRead$1", m100430f = "ChatClient.kt", m100431l = {3520}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/Plugin;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/client/plugin/Plugin;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189571 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189571(String str, String str2, InterfaceC30057d<? super C189571> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$channelType = str;
            this.$channelId = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189571 c189571 = new C189571(this.$channelType, this.$channelId, interfaceC30057d);
            c189571.L$0 = obj;
            return c189571;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(Plugin plugin, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189571) create(plugin, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Plugin plugin = (Plugin) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            String str = this.$channelType;
            String str2 = this.$channelId;
            this.L$0 = null;
            this.label = 1;
            Object objOnChannelMarkReadPrecondition = plugin.onChannelMarkReadPrecondition(str, str2, this);
            return objOnChannelMarkReadPrecondition == enumC31071a ? enumC31071a : objOnChannelMarkReadPrecondition;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$markRead$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$markRead$2", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189582 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189582(String str, String str2, InterfaceC30057d<? super C189582> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$channelType = str;
            this.$channelId = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189582(this.$channelType, this.$channelId, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC30057d<? super C23454a0>) obj);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C2345k logger = ChatClient.this.getLogger();
            String str = this.$channelType;
            String str2 = this.$channelId;
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str3 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str3)) {
                logger.f9274b.log(enumC2341g, str3, AbstractC31061c.m95640p("[markRead] #doOnStart; cid: ", str, ":", str2), null);
            }
            return C23454a0.f92919a;
        }

        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C189582 c189582 = (C189582) create(interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c189582.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$markRead$3 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$markRead$3", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ln23/h;", "Ll83/a0;", "it", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189593 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189593(String str, String str2, InterfaceC30057d<? super C189593> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$channelType = str;
            this.$channelId = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189593 c189593 = ChatClient.this.new C189593(this.$channelType, this.$channelId, interfaceC30057d);
            c189593.L$0 = obj;
            return c189593;
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
            C2345k logger = ChatClient.this.getLogger();
            String str = this.$channelType;
            String str2 = this.$channelId;
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str3 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str3)) {
                InterfaceC2344j interfaceC2344j = logger.f9274b;
                StringBuilder sbM32001t = AbstractC11895b.m32001t("[markRead] #doOnResult; completed(", str, ":", str2, "): ");
                sbM32001t.append(abstractC26205h);
                interfaceC2344j.log(enumC2341g, str3, sbM32001t.toString(), null);
            }
            return C23454a0.f92919a;
        }

        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C189593 c189593 = (C189593) create(abstractC26205h, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c189593.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$partialUpdateMessage$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$partialUpdateMessage$1", m100430f = "ChatClient.kt", m100431l = {2810}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/Message;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189601 extends AbstractC32275i implements InterfaceC4351m {
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        public C189601(InterfaceC30057d<? super C189601> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189601 c189601 = ChatClient.this.new C189601(interfaceC30057d);
            c189601.L$0 = obj;
            return c189601;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Message message;
            ChatClient chatClient;
            Iterator it;
            int i13;
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                if (abstractC26205h instanceof C26204g) {
                    Message message2 = (Message) ((C26204g) abstractC26205h).f103919a;
                    List<Plugin> plugins = ChatClient.this.getPlugins();
                    message = message2;
                    chatClient = ChatClient.this;
                    it = plugins.iterator();
                    i13 = 0;
                }
                return C23454a0.f92919a;
            }
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = this.I$0;
            it = (Iterator) this.L$4;
            chatClient = (ChatClient) this.L$3;
            message = (Message) this.L$1;
            AbstractC34132o.m107864I(obj);
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                C2345k logger = chatClient.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[partialUpdateMessage] #doOnResult; plugin: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(plugin.getClass()).getQualifiedName()), null);
                }
                this.L$0 = abstractC26205h;
                this.L$1 = message;
                this.L$2 = null;
                this.L$3 = chatClient;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (plugin.onMessageEditResult(message, abstractC26205h, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189601) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$queryActiveLocations$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$queryActiveLocations$1", m100430f = "ChatClient.kt", m100431l = {1910}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Ln23/h;", "", "Lio/getstream/chat/android/models/Location;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189611 extends AbstractC32275i implements InterfaceC4351m {
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        public C189611(InterfaceC30057d<? super C189611> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189611 c189611 = ChatClient.this.new C189611(interfaceC30057d);
            c189611.L$0 = obj;
            return c189611;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            ChatClient chatClient;
            int i13;
            C23454a0 c23454a0;
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                List<Plugin> plugins = ChatClient.this.getPlugins();
                ChatClient chatClient2 = ChatClient.this;
                it = plugins.iterator();
                chatClient = chatClient2;
                i13 = 0;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                it = (Iterator) this.L$3;
                chatClient = (ChatClient) this.L$2;
                AbstractC34132o.m107864I(obj);
            }
            do {
                boolean zHasNext = it.hasNext();
                c23454a0 = C23454a0.f92919a;
                if (!zHasNext) {
                    return c23454a0;
                }
                Plugin plugin = (Plugin) it.next();
                C2345k logger = chatClient.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[queryActiveLocations] #doOnResult; plugin: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(plugin.getClass()).getQualifiedName()), null);
                }
                this.L$0 = abstractC26205h;
                this.L$1 = null;
                this.L$2 = chatClient;
                this.L$3 = it;
                this.L$4 = null;
                this.L$5 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                plugin.onQueryActiveLocationsResult(abstractC26205h, this);
            } while (c23454a0 != enumC31071a);
            return enumC31071a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189611) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$queryBlockedUsers$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$queryBlockedUsers$1", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Ln23/h;", "", "Lio/getstream/chat/android/models/UserBlock;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189621 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C189621(InterfaceC30057d<? super C189621> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189621 c189621 = ChatClient.this.new C189621(interfaceC30057d);
            c189621.L$0 = obj;
            return c189621;
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
            Iterator<T> it = ChatClient.this.getPlugins().iterator();
            while (it.hasNext()) {
                ((Plugin) it.next()).onQueryBlockedUsersResult(abstractC26205h);
            }
            return C23454a0.f92919a;
        }

        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C189621 c189621 = (C189621) create(abstractC26205h, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c189621.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$queryChannel$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$queryChannel$1", m100430f = "ChatClient.kt", m100431l = {3084}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189631 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ QueryChannelRequest $request;
        final /* synthetic */ boolean $skipOnRequest;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189631(boolean z4, String str, String str2, QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super C189631> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$skipOnRequest = z4;
            this.$channelType = str;
            this.$channelId = str2;
            this.$request = queryChannelRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189631(this.$skipOnRequest, this.$channelType, this.$channelId, this.$request, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            QueryChannelRequest queryChannelRequest;
            String str;
            int i13;
            String str2;
            Iterator it;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C2345k logger = ChatClient.this.getLogger();
                boolean z4 = this.$skipOnRequest;
                String str3 = this.$channelType;
                String str4 = this.$channelId;
                QueryChannelRequest queryChannelRequest2 = this.$request;
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str5 = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                if (interfaceC2339e.isLoggable(enumC2341g, str5)) {
                    InterfaceC2344j interfaceC2344j = logger.f9274b;
                    StringBuilder sbM38567n = AbstractC13673n.m38567n("[queryChannel] #doOnStart; skipOnRequest: ", ", cid: ", str3, ":", z4);
                    sbM38567n.append(str4);
                    sbM38567n.append(", request: ");
                    sbM38567n.append(queryChannelRequest2);
                    interfaceC2344j.log(enumC2341g, str5, sbM38567n.toString(), null);
                }
                if (!this.$skipOnRequest) {
                    List<Plugin> plugins = ChatClient.this.getPlugins();
                    String str6 = this.$channelType;
                    String str7 = this.$channelId;
                    queryChannelRequest = this.$request;
                    str = str6;
                    i13 = 0;
                    str2 = str7;
                    it = plugins.iterator();
                }
                return C23454a0.f92919a;
            }
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = this.I$0;
            it = (Iterator) this.L$4;
            queryChannelRequest = (QueryChannelRequest) this.L$3;
            str2 = (String) this.L$2;
            str = (String) this.L$1;
            AbstractC34132o.m107864I(obj);
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                this.L$0 = null;
                this.L$1 = str;
                this.L$2 = str2;
                this.L$3 = queryChannelRequest;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (plugin.onQueryChannelRequest(str, str2, queryChannelRequest, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189631) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$queryChannel$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$queryChannel$2", m100430f = "ChatClient.kt", m100431l = {3093}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/Channel;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189642 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ QueryChannelRequest $request;
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189642(String str, String str2, QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super C189642> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$channelType = str;
            this.$channelId = str2;
            this.$request = queryChannelRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189642 c189642 = ChatClient.this.new C189642(this.$channelType, this.$channelId, this.$request, interfaceC30057d);
            c189642.L$0 = obj;
            return c189642;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            QueryChannelRequest queryChannelRequest;
            int i13;
            String str;
            String str2;
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C2345k logger = ChatClient.this.getLogger();
                String str3 = this.$channelType;
                String str4 = this.$channelId;
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str5 = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str5)) {
                    InterfaceC2344j interfaceC2344j = logger.f9274b;
                    Object objM77815a = abstractC26205h.m77815a();
                    if (objM77815a == null) {
                        objM77815a = c23454a0;
                    }
                    StringBuilder sbM32001t = AbstractC11895b.m32001t("[queryChannel] #doOnResult; completed(", str3, ":", str4, "): ");
                    sbM32001t.append(objM77815a);
                    interfaceC2344j.log(enumC2341g, str5, sbM32001t.toString(), null);
                }
                List<Plugin> plugins = ChatClient.this.getPlugins();
                String str6 = this.$channelType;
                String str7 = this.$channelId;
                QueryChannelRequest queryChannelRequest2 = this.$request;
                it = plugins.iterator();
                queryChannelRequest = queryChannelRequest2;
                i13 = 0;
                str = str7;
                str2 = str6;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i15 = this.I$0;
                Iterator it3 = (Iterator) this.L$5;
                QueryChannelRequest queryChannelRequest3 = (QueryChannelRequest) this.L$4;
                String str8 = (String) this.L$3;
                String str9 = (String) this.L$2;
                AbstractC34132o.m107864I(obj);
                queryChannelRequest = queryChannelRequest3;
                str = str8;
                i13 = i15;
                it = it3;
                str2 = str9;
            }
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                this.L$0 = abstractC26205h;
                this.L$1 = null;
                this.L$2 = str2;
                this.L$3 = str;
                this.L$4 = queryChannelRequest;
                this.L$5 = it;
                this.L$6 = null;
                this.L$7 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (plugin.onQueryChannelResult(abstractC26205h, str2, str, queryChannelRequest, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return c23454a0;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189642) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$queryChannel$3 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$queryChannel$3", m100430f = "ChatClient.kt", m100431l = {3096}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/Plugin;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/client/plugin/Plugin;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189653 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ QueryChannelRequest $request;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189653(String str, String str2, QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super C189653> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$channelType = str;
            this.$channelId = str2;
            this.$request = queryChannelRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189653 c189653 = new C189653(this.$channelType, this.$channelId, this.$request, interfaceC30057d);
            c189653.L$0 = obj;
            return c189653;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(Plugin plugin, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189653) create(plugin, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Plugin plugin = (Plugin) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            String str = this.$channelType;
            String str2 = this.$channelId;
            QueryChannelRequest queryChannelRequest = this.$request;
            this.L$0 = null;
            this.label = 1;
            Object objOnQueryChannelPrecondition = plugin.onQueryChannelPrecondition(str, str2, queryChannelRequest, this);
            return objOnQueryChannelPrecondition == enumC31071a ? enumC31071a : objOnQueryChannelPrecondition;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$queryChannels$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$queryChannels$2", m100430f = "ChatClient.kt", m100431l = {3119}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189662 extends AbstractC32275i implements Function1 {
        final /* synthetic */ QueryChannelsRequest $request;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189662(QueryChannelsRequest queryChannelsRequest, InterfaceC30057d<? super C189662> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$request = queryChannelsRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189662(this.$request, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ChatClient chatClient;
            int i13;
            QueryChannelsRequest queryChannelsRequest;
            Iterator it;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                List<Plugin> plugins = ChatClient.this.getPlugins();
                chatClient = ChatClient.this;
                i13 = 0;
                queryChannelsRequest = this.$request;
                it = plugins.iterator();
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                it = (Iterator) this.L$3;
                queryChannelsRequest = (QueryChannelsRequest) this.L$2;
                chatClient = (ChatClient) this.L$1;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                C2345k logger = chatClient.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[queryChannels] #doOnStart; plugin: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(plugin.getClass()).getQualifiedName()), null);
                }
                this.L$0 = null;
                this.L$1 = chatClient;
                this.L$2 = queryChannelsRequest;
                this.L$3 = it;
                this.L$4 = null;
                this.L$5 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (plugin.onQueryChannelsRequest(queryChannelsRequest, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189662) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$queryChannels$3 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$queryChannels$3", m100430f = "ChatClient.kt", m100431l = {3124}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/client/api/models/QueryChannelsResult;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189673 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ QueryChannelsRequest $request;
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189673(QueryChannelsRequest queryChannelsRequest, InterfaceC30057d<? super C189673> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$request = queryChannelsRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189673 c189673 = ChatClient.this.new C189673(this.$request, interfaceC30057d);
            c189673.L$0 = obj;
            return c189673;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ChatClient chatClient;
            int i13;
            QueryChannelsRequest queryChannelsRequest;
            Iterator it;
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                List<Plugin> plugins = ChatClient.this.getPlugins();
                chatClient = ChatClient.this;
                i13 = 0;
                queryChannelsRequest = this.$request;
                it = plugins.iterator();
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                it = (Iterator) this.L$4;
                queryChannelsRequest = (QueryChannelsRequest) this.L$3;
                chatClient = (ChatClient) this.L$2;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                C2345k logger = chatClient.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[queryChannels] #doOnResult; plugin: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(plugin.getClass()).getQualifiedName()), null);
                }
                this.L$0 = abstractC26205h;
                this.L$1 = null;
                this.L$2 = chatClient;
                this.L$3 = queryChannelsRequest;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (plugin.onQueryChannelsResult(abstractC26205h, queryChannelsRequest, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189673) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$queryChannels$4 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$queryChannels$4", m100430f = "ChatClient.kt", m100431l = {3127}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/Plugin;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/client/plugin/Plugin;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189684 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ QueryChannelsRequest $request;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189684(QueryChannelsRequest queryChannelsRequest, InterfaceC30057d<? super C189684> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$request = queryChannelsRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189684 c189684 = new C189684(this.$request, interfaceC30057d);
            c189684.L$0 = obj;
            return c189684;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(Plugin plugin, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189684) create(plugin, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Plugin plugin = (Plugin) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            QueryChannelsRequest queryChannelsRequest = this.$request;
            this.L$0 = null;
            this.label = 1;
            Object objOnQueryChannelsPrecondition = plugin.onQueryChannelsPrecondition(queryChannelsRequest, this);
            return objOnQueryChannelsPrecondition == enumC31071a ? enumC31071a : objOnQueryChannelsPrecondition;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$queryDrafts$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$queryDrafts$1", m100430f = "ChatClient.kt", m100431l = {2656}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/QueryDraftsResult;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189691 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ FilterObject $filter;
        final /* synthetic */ int $limit;
        final /* synthetic */ String $next;
        final /* synthetic */ QuerySorter<DraftsSort> $sort;
        int I$0;
        int I$1;
        int I$2;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189691(FilterObject filterObject, int i13, String str, QuerySorter<DraftsSort> querySorter, InterfaceC30057d<? super C189691> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$filter = filterObject;
            this.$limit = i13;
            this.$next = str;
            this.$sort = querySorter;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189691 c189691 = ChatClient.this.new C189691(this.$filter, this.$limit, this.$next, this.$sort, interfaceC30057d);
            c189691.L$0 = obj;
            return c189691;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            QuerySorter<DraftsSort> querySorter;
            int i13;
            String str;
            int i14;
            FilterObject filterObject;
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i15 = this.label;
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                List<Plugin> plugins = ChatClient.this.getPlugins();
                FilterObject filterObject2 = this.$filter;
                int i16 = this.$limit;
                String str2 = this.$next;
                QuerySorter<DraftsSort> querySorter2 = this.$sort;
                it = plugins.iterator();
                querySorter = querySorter2;
                i13 = 0;
                str = str2;
                i14 = i16;
                filterObject = filterObject2;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i17 = this.I$1;
                int i18 = this.I$0;
                Iterator it3 = (Iterator) this.L$5;
                QuerySorter<DraftsSort> querySorter3 = (QuerySorter) this.L$4;
                String str3 = (String) this.L$3;
                FilterObject filterObject3 = (FilterObject) this.L$2;
                AbstractC34132o.m107864I(obj);
                querySorter = querySorter3;
                str = str3;
                i13 = i17;
                it = it3;
                i14 = i18;
                filterObject = filterObject3;
            }
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                this.L$0 = abstractC26205h;
                this.L$1 = null;
                this.L$2 = filterObject;
                this.L$3 = str;
                this.L$4 = querySorter;
                this.L$5 = it;
                this.L$6 = null;
                this.L$7 = null;
                this.I$0 = i14;
                this.I$1 = i13;
                this.I$2 = 0;
                this.label = 1;
                if (plugin.onQueryDraftMessagesResult(abstractC26205h, filterObject, i14, str, querySorter, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189691) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$queryMembers$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$queryMembers$2", m100430f = "ChatClient.kt", m100431l = {964}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Ln23/h;", "", "Lio/getstream/chat/android/models/Member;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189702 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ FilterObject $filter;
        final /* synthetic */ int $limit;
        final /* synthetic */ List<Member> $members;
        final /* synthetic */ int $offset;
        final /* synthetic */ QuerySorter<Member> $sort;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$10;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189702(String str, String str2, int i13, int i14, FilterObject filterObject, QuerySorter<Member> querySorter, List<Member> list, InterfaceC30057d<? super C189702> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$channelType = str;
            this.$channelId = str2;
            this.$offset = i13;
            this.$limit = i14;
            this.$filter = filterObject;
            this.$sort = querySorter;
            this.$members = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189702 c189702 = ChatClient.this.new C189702(this.$channelType, this.$channelId, this.$offset, this.$limit, this.$filter, this.$sort, this.$members, interfaceC30057d);
            c189702.L$0 = obj;
            return c189702;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0083  */
        /* JADX WARN: Code duplicated, block: B:13:0x009d  */
        /* JADX WARN: Code duplicated, block: B:14:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:17:0x00eb A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:18:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:21:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:23:0x0103  */
        /* JADX WARN: Code duplicated, block: B:24:0x011b  */
        /* JADX WARN: Code duplicated, block: B:26:0x0123  */
        /* JADX WARN: Code duplicated, block: B:28:0x0137  */
        /* JADX WARN: Code duplicated, block: B:30:0x013d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00ec -> B:19:0x00ed). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 334
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.ChatClient.C189702.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189702) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$queryThreads$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$queryThreads$1", m100430f = "ChatClient.kt", m100431l = {4476}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189711 extends AbstractC32275i implements Function1 {
        final /* synthetic */ QueryThreadsRequest $query;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189711(QueryThreadsRequest queryThreadsRequest, InterfaceC30057d<? super C189711> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$query = queryThreadsRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189711(this.$query, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            QueryThreadsRequest queryThreadsRequest;
            int i13;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                List<Plugin> plugins = ChatClient.this.getPlugins();
                QueryThreadsRequest queryThreadsRequest2 = this.$query;
                it = plugins.iterator();
                queryThreadsRequest = queryThreadsRequest2;
                i13 = 0;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                it = (Iterator) this.L$2;
                queryThreadsRequest = (QueryThreadsRequest) this.L$1;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                this.L$0 = null;
                this.L$1 = queryThreadsRequest;
                this.L$2 = it;
                this.L$3 = null;
                this.L$4 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (plugin.onQueryThreadsRequest(queryThreadsRequest, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189711) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$queryThreads$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$queryThreads$2", m100430f = "ChatClient.kt", m100431l = {4481}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/QueryThreadsResult;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189722 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ QueryThreadsRequest $query;
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189722(QueryThreadsRequest queryThreadsRequest, InterfaceC30057d<? super C189722> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$query = queryThreadsRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189722 c189722 = ChatClient.this.new C189722(this.$query, interfaceC30057d);
            c189722.L$0 = obj;
            return c189722;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            QueryThreadsRequest queryThreadsRequest;
            int i13;
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                List<Plugin> plugins = ChatClient.this.getPlugins();
                QueryThreadsRequest queryThreadsRequest2 = this.$query;
                it = plugins.iterator();
                queryThreadsRequest = queryThreadsRequest2;
                i13 = 0;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                it = (Iterator) this.L$3;
                queryThreadsRequest = (QueryThreadsRequest) this.L$2;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                this.L$0 = abstractC26205h;
                this.L$1 = null;
                this.L$2 = queryThreadsRequest;
                this.L$3 = it;
                this.L$4 = null;
                this.L$5 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (plugin.onQueryThreadsResult(abstractC26205h, queryThreadsRequest, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189722) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$queryThreads$3 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$queryThreads$3", m100430f = "ChatClient.kt", m100431l = {4485}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/Plugin;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/client/plugin/Plugin;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189733 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ QueryThreadsRequest $query;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189733(QueryThreadsRequest queryThreadsRequest, InterfaceC30057d<? super C189733> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$query = queryThreadsRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189733 c189733 = new C189733(this.$query, interfaceC30057d);
            c189733.L$0 = obj;
            return c189733;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(Plugin plugin, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189733) create(plugin, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Plugin plugin = (Plugin) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            QueryThreadsRequest queryThreadsRequest = this.$query;
            this.L$0 = null;
            this.label = 1;
            Object objOnQueryThreadsPrecondition = plugin.onQueryThreadsPrecondition(queryThreadsRequest, this);
            return objOnQueryThreadsPrecondition == enumC31071a ? enumC31071a : objOnQueryThreadsPrecondition;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$reconnectSocket$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$reconnectSocket$1", m100430f = "ChatClient.kt", m100431l = {1341}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189741 extends AbstractC32275i implements InterfaceC4351m {
        Object L$0;
        int label;

        public C189741(InterfaceC30057d<? super C189741> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189741(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189741) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                io.getstream.chat.android.client.clientstate.UserState state$stream_chat_android_client_release = ChatClient.this.userStateService.getState$stream_chat_android_client_release();
                if (!(state$stream_chat_android_client_release instanceof io.getstream.chat.android.client.clientstate.UserState.UserSet) && !(state$stream_chat_android_client_release instanceof io.getstream.chat.android.client.clientstate.UserState.AnonymousUserSet)) {
                    return new C26203f(new C26198a("Invalid user state " + state$stream_chat_android_client_release + " without user being set!"));
                }
                this.L$0 = null;
                this.label = 1;
                if (ChatClient.this.chatSocket.reconnectUser(state$stream_chat_android_client_release.userOrError$stream_chat_android_client_release(), state$stream_chat_android_client_release instanceof io.getstream.chat.android.client.clientstate.UserState.AnonymousUserSet, true, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return new C26204g(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$sendAttachments$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient", m100430f = "ChatClient.kt", m100431l = {2692, 2695}, m100432m = "sendAttachments")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C189751 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C189751(InterfaceC30057d<? super C189751> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChatClient.this.sendAttachments(null, null, null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$sendGiphy$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$sendGiphy$1", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/Message;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189761 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Message $message;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189761(Message message, InterfaceC30057d<? super C189761> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$message = message;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189761 c189761 = ChatClient.this.new C189761(this.$message, interfaceC30057d);
            c189761.L$0 = obj;
            return c189761;
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
            List<Plugin> plugins = ChatClient.this.getPlugins();
            ChatClient chatClient = ChatClient.this;
            Message message = this.$message;
            for (Plugin plugin : plugins) {
                C2345k logger = chatClient.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[sendGiphy] #doOnResult; plugin: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(plugin.getClass()).getQualifiedName()), null);
                }
                plugin.onGiphySendResult(message.getCid(), abstractC26205h);
            }
            return C23454a0.f92919a;
        }

        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C189761 c189761 = (C189761) create(abstractC26205h, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c189761.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$sendMessage$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$sendMessage$1", m100430f = "ChatClient.kt", m100431l = {2529, 2534, 2537}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Lio/getstream/chat/android/models/Message;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189771 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ boolean $isRetrying;
        final /* synthetic */ Message $messageWithId;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189771(Message message, String str, String str2, boolean z4, InterfaceC30057d<? super C189771> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$messageWithId = message;
            this.$channelType = str;
            this.$channelId = str2;
            this.$isRetrying = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189771(this.$messageWithId, this.$channelType, this.$channelId, this.$isRetrying, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189771) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:24:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:26:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:30:0x00e3  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C189771 c189771;
            ChatClient chatClient;
            String str;
            int i13;
            String str2;
            SendMessageDebugger sendMessageDebugger;
            Message message;
            Object objDoSendMessage;
            Message message2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                ChatClient chatClient2 = ChatClient.this;
                Message message3 = this.$messageWithId;
                String strM53370k = AbstractC18489d0.m53370k(this.$channelType, ":", this.$channelId);
                this.label = 1;
                obj = chatClient2.ensureCreatedLocallyAt(message3, strM53370k, this);
                if (obj == enumC31071a) {
                }
                return enumC31071a;
            }
            if (i14 == 1) {
                AbstractC34132o.m107864I(obj);
            } else {
                if (i14 == 2) {
                    int i15 = this.I$0;
                    SendMessageDebugger sendMessageDebugger2 = (SendMessageDebugger) this.L$4;
                    str2 = (String) this.L$2;
                    str = (String) this.L$1;
                    chatClient = (ChatClient) this.L$0;
                    AbstractC34132o.m107864I(obj);
                    i13 = i15;
                    sendMessageDebugger = sendMessageDebugger2;
                    c189771 = this;
                    obj = (AbstractC26205h) obj;
                    if (obj instanceof C26204g) {
                        message = (Message) ((C26204g) obj).f103919a;
                        sendMessageDebugger.onSendStart(message);
                        c189771.L$0 = null;
                        c189771.L$1 = sendMessageDebugger;
                        c189771.L$2 = null;
                        c189771.L$3 = null;
                        c189771.L$4 = null;
                        c189771.L$5 = message;
                        c189771.I$0 = i13;
                        c189771.I$1 = 0;
                        c189771.I$2 = 0;
                        c189771.label = 3;
                        objDoSendMessage = chatClient.doSendMessage(str, str2, message, this);
                        if (objDoSendMessage != enumC31071a) {
                            message2 = message;
                            obj = objDoSendMessage;
                        }
                        return enumC31071a;
                    }
                    if (!(obj instanceof C26203f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return (AbstractC26205h) obj;
                }
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                message2 = (Message) this.L$5;
                sendMessageDebugger = (SendMessageDebugger) this.L$1;
                AbstractC34132o.m107864I(obj);
            }
            AbstractC26205h abstractC26205h = (AbstractC26205h) obj;
            sendMessageDebugger.onSendStop(abstractC26205h, message2);
            sendMessageDebugger.onStop(abstractC26205h, message2);
            return (AbstractC26205h) obj;
            ChatClient chatClient3 = ChatClient.this;
            String str3 = this.$channelType;
            String str4 = this.$channelId;
            boolean z4 = this.$isRetrying;
            Message message4 = (Message) obj;
            SendMessageDebugger sendMessageDebuggerDebugSendMessage = chatClient3.clientDebugger.debugSendMessage(str3, str4, message4, z4);
            sendMessageDebuggerDebugSendMessage.onStart(message4);
            this.L$0 = chatClient3;
            this.L$1 = str3;
            this.L$2 = str4;
            this.L$3 = null;
            this.L$4 = sendMessageDebuggerDebugSendMessage;
            this.I$0 = 0;
            this.label = 2;
            c189771 = this;
            obj = chatClient3.sendAttachments(str3, str4, message4, z4, sendMessageDebuggerDebugSendMessage, c189771);
            if (obj != enumC31071a) {
                chatClient = chatClient3;
                str = str3;
                i13 = 0;
                str2 = str4;
                sendMessageDebugger = sendMessageDebuggerDebugSendMessage;
                obj = (AbstractC26205h) obj;
                if (obj instanceof C26204g) {
                    message = (Message) ((C26204g) obj).f103919a;
                    sendMessageDebugger.onSendStart(message);
                    c189771.L$0 = null;
                    c189771.L$1 = sendMessageDebugger;
                    c189771.L$2 = null;
                    c189771.L$3 = null;
                    c189771.L$4 = null;
                    c189771.L$5 = message;
                    c189771.I$0 = i13;
                    c189771.I$1 = 0;
                    c189771.I$2 = 0;
                    c189771.label = 3;
                    objDoSendMessage = chatClient.doSendMessage(str, str2, message, this);
                    if (objDoSendMessage != enumC31071a) {
                        message2 = message;
                        obj = objDoSendMessage;
                        AbstractC26205h abstractC26205h2 = (AbstractC26205h) obj;
                        sendMessageDebugger.onSendStop(abstractC26205h2, message2);
                        sendMessageDebugger.onStop(abstractC26205h2, message2);
                    }
                } else if (!(obj instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                return (AbstractC26205h) obj;
            }
            return enumC31071a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$sendReaction$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$sendReaction$1", m100430f = "ChatClient.kt", m100431l = {1270}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189781 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $cid;
        final /* synthetic */ User $currentUser;
        final /* synthetic */ boolean $enforceUnique;
        final /* synthetic */ Reaction $finalReaction;
        final /* synthetic */ Reaction $reaction;
        final /* synthetic */ boolean $skipPush;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        boolean Z$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189781(Reaction reaction, String str, Reaction reaction2, boolean z4, boolean z13, User user, InterfaceC30057d<? super C189781> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$reaction = reaction;
            this.$cid = str;
            this.$finalReaction = reaction2;
            this.$enforceUnique = z4;
            this.$skipPush = z13;
            this.$currentUser = user;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189781(this.$reaction, this.$cid, this.$finalReaction, this.$enforceUnique, this.$skipPush, this.$currentUser, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String str;
            Reaction reaction;
            boolean z4;
            boolean z13;
            User user;
            Iterator it;
            int i13;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C2345k logger = ChatClient.this.getLogger();
                Reaction reaction2 = this.$reaction;
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str2 = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                    logger.f9274b.log(enumC2341g, str2, AbstractC31061c.m95640p("[sendReaction] #doOnStart; reaction: ", reaction2.getType(), ", messageId: ", reaction2.getMessageId()), null);
                }
                List<Plugin> plugins = ChatClient.this.getPlugins();
                str = this.$cid;
                reaction = this.$finalReaction;
                z4 = this.$enforceUnique;
                z13 = this.$skipPush;
                user = this.$currentUser;
                it = plugins.iterator();
                i13 = 0;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i15 = this.I$0;
                boolean z14 = this.Z$1;
                boolean z15 = this.Z$0;
                Iterator it3 = (Iterator) this.L$4;
                User user2 = (User) this.L$3;
                Reaction reaction3 = (Reaction) this.L$2;
                String str3 = (String) this.L$1;
                AbstractC34132o.m107864I(obj);
                it = it3;
                z4 = z15;
                reaction = reaction3;
                user = user2;
                z13 = z14;
                str = str3;
                i13 = i15;
            }
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                AbstractC22676k.m65747g(user);
                this.L$0 = null;
                this.L$1 = str;
                this.L$2 = reaction;
                this.L$3 = user;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = null;
                this.Z$0 = z4;
                this.Z$1 = z13;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (plugin.onSendReactionRequest(str, reaction, z4, z13, user, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189781) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$sendReaction$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$sendReaction$2", m100430f = "ChatClient.kt", m100431l = {1282}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/Reaction;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189792 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $cid;
        final /* synthetic */ User $currentUser;
        final /* synthetic */ boolean $enforceUnique;
        final /* synthetic */ Reaction $finalReaction;
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189792(String str, Reaction reaction, boolean z4, User user, InterfaceC30057d<? super C189792> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$cid = str;
            this.$finalReaction = reaction;
            this.$enforceUnique = z4;
            this.$currentUser = user;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189792 c189792 = ChatClient.this.new C189792(this.$cid, this.$finalReaction, this.$enforceUnique, this.$currentUser, interfaceC30057d);
            c189792.L$0 = obj;
            return c189792;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            User user;
            int i13;
            boolean z4;
            Reaction reaction;
            String str;
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C2345k logger = ChatClient.this.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str2 = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                    logger.f9274b.log(enumC2341g, str2, "[sendReaction] #doOnResult; completed: " + abstractC26205h, null);
                }
                List<Plugin> plugins = ChatClient.this.getPlugins();
                String str3 = this.$cid;
                Reaction reaction2 = this.$finalReaction;
                boolean z13 = this.$enforceUnique;
                User user2 = this.$currentUser;
                it = plugins.iterator();
                user = user2;
                i13 = 0;
                z4 = z13;
                reaction = reaction2;
                str = str3;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i15 = this.I$0;
                boolean z14 = this.Z$0;
                Iterator it3 = (Iterator) this.L$5;
                User user3 = (User) this.L$4;
                Reaction reaction3 = (Reaction) this.L$3;
                String str4 = (String) this.L$2;
                AbstractC34132o.m107864I(obj);
                i13 = i15;
                it = it3;
                reaction = reaction3;
                user = user3;
                z4 = z14;
                str = str4;
            }
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                AbstractC22676k.m65747g(user);
                this.L$0 = abstractC26205h;
                this.L$1 = null;
                this.L$2 = str;
                this.L$3 = reaction;
                this.L$4 = user;
                this.L$5 = it;
                this.L$6 = null;
                this.L$7 = null;
                this.Z$0 = z4;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (plugin.onSendReactionResult(str, reaction, z4, user, abstractC26205h, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189792) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$sendReaction$3 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$sendReaction$3", m100430f = "ChatClient.kt", m100431l = {1292}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/Plugin;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/client/plugin/Plugin;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189803 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $cid;
        final /* synthetic */ User $currentUser;
        final /* synthetic */ Reaction $reaction;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189803(String str, User user, Reaction reaction, InterfaceC30057d<? super C189803> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$cid = str;
            this.$currentUser = user;
            this.$reaction = reaction;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189803 c189803 = new C189803(this.$cid, this.$currentUser, this.$reaction, interfaceC30057d);
            c189803.L$0 = obj;
            return c189803;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(Plugin plugin, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189803) create(plugin, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Plugin plugin = (Plugin) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            String str = this.$cid;
            User user = this.$currentUser;
            Reaction reaction = this.$reaction;
            this.L$0 = null;
            this.label = 1;
            Object objOnSendReactionPrecondition = plugin.onSendReactionPrecondition(str, user, reaction, this);
            return objOnSendReactionPrecondition == enumC31071a ? enumC31071a : objOnSendReactionPrecondition;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$setChannelPushPreference$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$setChannelPushPreference$1", m100430f = "ChatClient.kt", m100431l = {1710}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/PushPreference;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189811 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $cid;
        final /* synthetic */ PushPreferenceLevel $level;
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189811(String str, PushPreferenceLevel pushPreferenceLevel, InterfaceC30057d<? super C189811> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$cid = str;
            this.$level = pushPreferenceLevel;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189811 c189811 = ChatClient.this.new C189811(this.$cid, this.$level, interfaceC30057d);
            c189811.L$0 = obj;
            return c189811;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String str;
            int i13;
            PushPreferenceLevel pushPreferenceLevel;
            Iterator it;
            C23454a0 c23454a0;
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                List<Plugin> plugins = ChatClient.this.getPlugins();
                str = this.$cid;
                i13 = 0;
                pushPreferenceLevel = this.$level;
                it = plugins.iterator();
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                it = (Iterator) this.L$4;
                pushPreferenceLevel = (PushPreferenceLevel) this.L$3;
                str = (String) this.L$2;
                AbstractC34132o.m107864I(obj);
            }
            do {
                boolean zHasNext = it.hasNext();
                c23454a0 = C23454a0.f92919a;
                if (!zHasNext) {
                    return c23454a0;
                }
                Plugin plugin = (Plugin) it.next();
                this.L$0 = abstractC26205h;
                this.L$1 = null;
                this.L$2 = str;
                this.L$3 = pushPreferenceLevel;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                plugin.onChannelPushPreferenceSet(str, pushPreferenceLevel, abstractC26205h, this);
            } while (c23454a0 != enumC31071a);
            return enumC31071a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189811) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$setUser$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient", m100430f = "ChatClient.kt", m100431l = {596, 597, 599, 646}, m100432m = "setUser")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C189821 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C189821(InterfaceC30057d<? super C189821> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChatClient.this.setUser(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$setUserPushPreference$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$setUserPushPreference$1", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/PushPreference;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189831 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C189831(InterfaceC30057d<? super C189831> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189831 c189831 = ChatClient.this.new C189831(interfaceC30057d);
            c189831.L$0 = obj;
            return c189831;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            User user;
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            boolean z4 = abstractC26205h instanceof C26204g;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (!z4 || (user = (User) ((C13045h2) ChatClient.this.mutableClientState.getUser()).getValue()) == null) {
                return c23454a0;
            }
            ChatClient.this.mutableClientState.setUser(User.copy$default(user, null, null, null, null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, null, null, (PushPreference) ((C26204g) abstractC26205h).f103919a, null, null, 29360127, null));
            return c23454a0;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189831) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$shuffleGiphy$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$shuffleGiphy$1", m100430f = "ChatClient.kt", m100431l = {2413}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/Message;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189841 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Message $message;
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189841(Message message, InterfaceC30057d<? super C189841> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$message = message;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189841 c189841 = ChatClient.this.new C189841(this.$message, interfaceC30057d);
            c189841.L$0 = obj;
            return c189841;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ChatClient chatClient;
            int i13;
            Message message;
            Iterator it;
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                List<Plugin> plugins = ChatClient.this.getPlugins();
                chatClient = ChatClient.this;
                i13 = 0;
                message = this.$message;
                it = plugins.iterator();
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                it = (Iterator) this.L$4;
                message = (Message) this.L$3;
                chatClient = (ChatClient) this.L$2;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                C2345k logger = chatClient.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[shuffleGiphy] #doOnResult; plugin: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(plugin.getClass()).getQualifiedName()), null);
                }
                String cid = message.getCid();
                this.L$0 = abstractC26205h;
                this.L$1 = null;
                this.L$2 = chatClient;
                this.L$3 = message;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (plugin.onShuffleGiphyResult(cid, abstractC26205h, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189841) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$snoozeChannelPushNotifications$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$snoozeChannelPushNotifications$1", m100430f = "ChatClient.kt", m100431l = {1729}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/PushPreference;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189851 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $cid;
        final /* synthetic */ Date $until;
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189851(String str, Date date, InterfaceC30057d<? super C189851> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$cid = str;
            this.$until = date;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189851 c189851 = ChatClient.this.new C189851(this.$cid, this.$until, interfaceC30057d);
            c189851.L$0 = obj;
            return c189851;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String str;
            int i13;
            Date date;
            Iterator it;
            C23454a0 c23454a0;
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                List<Plugin> plugins = ChatClient.this.getPlugins();
                str = this.$cid;
                i13 = 0;
                date = this.$until;
                it = plugins.iterator();
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                it = (Iterator) this.L$4;
                date = (Date) this.L$3;
                str = (String) this.L$2;
                AbstractC34132o.m107864I(obj);
            }
            do {
                boolean zHasNext = it.hasNext();
                c23454a0 = C23454a0.f92919a;
                if (!zHasNext) {
                    return c23454a0;
                }
                Plugin plugin = (Plugin) it.next();
                this.L$0 = abstractC26205h;
                this.L$1 = null;
                this.L$2 = str;
                this.L$3 = date;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                plugin.onChannelPushNotificationsSnoozed(str, date, abstractC26205h, this);
            } while (c23454a0 != enumC31071a);
            return enumC31071a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189851) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$snoozeUserPushNotifications$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$snoozeUserPushNotifications$1", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/PushPreference;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189861 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C189861(InterfaceC30057d<? super C189861> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189861 c189861 = ChatClient.this.new C189861(interfaceC30057d);
            c189861.L$0 = obj;
            return c189861;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            User user;
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            boolean z4 = abstractC26205h instanceof C26204g;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (!z4 || (user = (User) ((C13045h2) ChatClient.this.mutableClientState.getUser()).getValue()) == null) {
                return c23454a0;
            }
            ChatClient.this.mutableClientState.setUser(User.copy$default(user, null, null, null, null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, null, null, (PushPreference) ((C26204g) abstractC26205h).f103919a, null, null, 29360127, null));
            return c23454a0;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189861) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$stopTyping$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$stopTyping$2", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189872 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ Date $eventTime;
        final /* synthetic */ String $eventType;
        final /* synthetic */ Map<Object, Object> $extraData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189872(String str, String str2, String str3, Map<Object, ? extends Object> map, Date date, InterfaceC30057d<? super C189872> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$eventType = str;
            this.$channelType = str2;
            this.$channelId = str3;
            this.$extraData = map;
            this.$eventTime = date;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189872(this.$eventType, this.$channelType, this.$channelId, this.$extraData, this.$eventTime, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC30057d<? super C23454a0>) obj);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            List<Plugin> plugins = ChatClient.this.getPlugins();
            ChatClient chatClient = ChatClient.this;
            String str = this.$eventType;
            String str2 = this.$channelType;
            String str3 = this.$channelId;
            Map<Object, ? extends Object> map = this.$extraData;
            Date date = this.$eventTime;
            for (Plugin plugin : plugins) {
                C2345k logger = chatClient.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str4 = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str4)) {
                    logger.f9274b.log(enumC2341g, str4, AbstractC11266d.m30461o("[stopTyping] #doOnStart; plugin: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(plugin.getClass()).getQualifiedName()), null);
                }
                plugin.onTypingEventRequest(str, str2, str3, map, date);
            }
            return C23454a0.f92919a;
        }

        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C189872 c189872 = (C189872) create(interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c189872.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$stopTyping$3 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$stopTyping$3", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/client/events/ChatEvent;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189883 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ Date $eventTime;
        final /* synthetic */ String $eventType;
        final /* synthetic */ Map<Object, Object> $extraData;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189883(String str, String str2, String str3, Map<Object, ? extends Object> map, Date date, InterfaceC30057d<? super C189883> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$eventType = str;
            this.$channelType = str2;
            this.$channelId = str3;
            this.$extraData = map;
            this.$eventTime = date;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189883 c189883 = ChatClient.this.new C189883(this.$eventType, this.$channelType, this.$channelId, this.$extraData, this.$eventTime, interfaceC30057d);
            c189883.L$0 = obj;
            return c189883;
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
            List<Plugin> plugins = ChatClient.this.getPlugins();
            ChatClient chatClient = ChatClient.this;
            String str = this.$eventType;
            String str2 = this.$channelType;
            String str3 = this.$channelId;
            Map<Object, ? extends Object> map = this.$extraData;
            Date date = this.$eventTime;
            for (Plugin plugin : plugins) {
                C2345k logger = chatClient.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str4 = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str4)) {
                    logger.f9274b.log(enumC2341g, str4, AbstractC11266d.m30461o("[stopTyping] #doOnResult; plugin: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(plugin.getClass()).getQualifiedName()), null);
                }
                plugin.onTypingEventResult(abstractC26205h, str, str2, str3, map, date);
            }
            return C23454a0.f92919a;
        }

        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C189883 c189883 = (C189883) create(abstractC26205h, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c189883.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$stopTyping$4 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$stopTyping$4", m100430f = "ChatClient.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/Plugin;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/client/plugin/Plugin;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189894 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        final /* synthetic */ Date $eventTime;
        final /* synthetic */ String $eventType;
        final /* synthetic */ Map<Object, Object> $extraData;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189894(String str, String str2, String str3, Map<Object, ? extends Object> map, Date date, InterfaceC30057d<? super C189894> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$eventType = str;
            this.$channelType = str2;
            this.$channelId = str3;
            this.$extraData = map;
            this.$eventTime = date;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189894 c189894 = new C189894(this.$eventType, this.$channelType, this.$channelId, this.$extraData, this.$eventTime, interfaceC30057d);
            c189894.L$0 = obj;
            return c189894;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(Plugin plugin, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189894) create(plugin, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Plugin plugin = (Plugin) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return plugin.onTypingEventPrecondition(this.$eventType, this.$channelType, this.$channelId, this.$extraData, this.$eventTime);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$switchUser$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$switchUser$2", m100430f = "ChatClient.kt", m100431l = {772, 773, 778}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Lio/getstream/chat/android/models/ConnectionData;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189922 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ InterfaceC4339a $onDisconnectionComplete;
        final /* synthetic */ Long $timeoutMilliseconds;
        final /* synthetic */ TokenProvider $tokenProvider;
        final /* synthetic */ User $user;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189922(User user, InterfaceC4339a interfaceC4339a, TokenProvider tokenProvider, Long l7, InterfaceC30057d<? super C189922> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$user = user;
            this.$onDisconnectionComplete = interfaceC4339a;
            this.$tokenProvider = tokenProvider;
            this.$timeoutMilliseconds = l7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189922(this.$user, this.$onDisconnectionComplete, this.$tokenProvider, this.$timeoutMilliseconds, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C189922) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
        
            if (r11 == r0) goto L23;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r10.label
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 != r3) goto L15
                p505ts.AbstractC34132o.m107864I(r11)
                goto L96
            L15:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1d:
                p505ts.AbstractC34132o.m107864I(r11)
                goto L6d
            L21:
                p505ts.AbstractC34132o.m107864I(r11)
                goto L62
            L25:
                p505ts.AbstractC34132o.m107864I(r11)
                io.getstream.chat.android.client.ChatClient r11 = io.getstream.chat.android.client.ChatClient.this
                b23.k r11 = io.getstream.chat.android.client.ChatClient.access$getLogger(r11)
                io.getstream.chat.android.models.User r1 = r10.$user
                b23.e r6 = r11.f9275c
                java.lang.String r7 = r11.f9273a
                b23.g r8 = b23.EnumC2341g.DEBUG
                boolean r6 = r6.isLoggable(r8, r7)
                if (r6 == 0) goto L4d
                b23.j r11 = r11.f9274b
                java.lang.String r1 = r1.getId()
                java.lang.String r6 = "[switchUser] user.id: '"
                java.lang.String r9 = "'"
                java.lang.String r1 = p088dc.AbstractC11895b.m31996o(r6, r1, r9)
                r11.log(r8, r7, r1, r2)
            L4d:
                io.getstream.chat.android.client.ChatClient r11 = io.getstream.chat.android.client.ChatClient.this
                io.getstream.chat.android.client.notifications.ChatNotifications r11 = io.getstream.chat.android.client.ChatClient.access$getNotifications$p(r11)
                io.getstream.chat.android.client.ChatClient r1 = io.getstream.chat.android.client.ChatClient.this
                io.getstream.chat.android.models.User r1 = r1.getCurrentUser()
                r10.label = r5
                java.lang.Object r11 = r11.deleteDevice(r1, r10)
                if (r11 != r0) goto L62
                goto L95
            L62:
                io.getstream.chat.android.client.ChatClient r11 = io.getstream.chat.android.client.ChatClient.this
                r10.label = r4
                java.lang.Object r11 = io.getstream.chat.android.client.ChatClient.access$disconnectUserSuspend(r11, r5, r10)
                if (r11 != r0) goto L6d
                goto L95
            L6d:
                io.getstream.chat.android.client.ChatClient r11 = io.getstream.chat.android.client.ChatClient.this
                io.getstream.chat.android.client.scope.UserScope r11 = io.getstream.chat.android.client.ChatClient.access$getUserScope$p(r11)
                io.getstream.chat.android.client.scope.user.UserIdentifier r11 = r11.getUserId()
                io.getstream.chat.android.models.User r1 = r10.$user
                java.lang.String r1 = r1.getId()
                r11.setValue(r1)
                c93.a r11 = r10.$onDisconnectionComplete
                r11.invoke()
                io.getstream.chat.android.client.ChatClient r11 = io.getstream.chat.android.client.ChatClient.this
                io.getstream.chat.android.models.User r1 = r10.$user
                io.getstream.chat.android.client.token.TokenProvider r4 = r10.$tokenProvider
                java.lang.Long r5 = r10.$timeoutMilliseconds
                r10.label = r3
                java.lang.Object r11 = io.getstream.chat.android.client.ChatClient.access$connectUserSuspend(r11, r1, r4, r5, r10)
                if (r11 != r0) goto L96
            L95:
                return r0
            L96:
                io.getstream.chat.android.client.ChatClient r0 = io.getstream.chat.android.client.ChatClient.this
                io.getstream.chat.android.models.User r1 = r10.$user
                r3 = r11
                n23.h r3 = (n23.AbstractC26205h) r3
                b23.k r0 = io.getstream.chat.android.client.ChatClient.access$getLogger(r0)
                b23.e r3 = r0.f9275c
                java.lang.String r4 = r0.f9273a
                b23.g r5 = b23.EnumC2341g.VERBOSE
                boolean r3 = r3.isLoggable(r5, r4)
                if (r3 == 0) goto Lbe
                b23.j r0 = r0.f9274b
                java.lang.String r1 = r1.getId()
                java.lang.String r3 = "[switchUser] completed('"
                java.lang.String r6 = "')"
                java.lang.String r1 = p088dc.AbstractC11895b.m31996o(r3, r1, r6)
                r0.log(r5, r4, r1, r2)
            Lbe:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.ChatClient.C189922.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$unblockUser$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$unblockUser$1", m100430f = "ChatClient.kt", m100431l = {3635}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ln23/h;", "Ll83/a0;", "result", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189931 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $userId;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189931(String str, InterfaceC30057d<? super C189931> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$userId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189931 c189931 = ChatClient.this.new C189931(this.$userId, interfaceC30057d);
            c189931.L$0 = obj;
            return c189931;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            User user;
            User userCopy$default;
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                List<Plugin> plugins = ChatClient.this.getPlugins();
                String str = this.$userId;
                Iterator<T> it = plugins.iterator();
                while (it.hasNext()) {
                    ((Plugin) it.next()).onUnblockUserResult(str, abstractC26205h);
                }
                if ((abstractC26205h instanceof C26204g) && (user = (User) ((C13045h2) ChatClient.this.mutableClientState.getUser()).getValue()) != null && user.getBlockedUserIds().contains(this.$userId)) {
                    userCopy$default = User.copy$default(user, null, null, null, null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, AbstractC25265s.m74124b1(user.getBlockedUserIds(), this.$userId), null, null, null, null, 32505855, null);
                    UserStateService userStateService = ChatClient.this.userStateService;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = userCopy$default;
                    this.label = 1;
                    if (userStateService.onUserUpdated(userCopy$default, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return c23454a0;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userCopy$default = (User) this.L$2;
            AbstractC34132o.m107864I(obj);
            ChatClient.this.mutableClientState.setUser(userCopy$default);
            return c23454a0;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189931) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$updateMessage$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$updateMessage$1", m100430f = "ChatClient.kt", m100431l = {2713}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189941 extends AbstractC32275i implements Function1 {
        final /* synthetic */ Message $message;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189941(Message message, InterfaceC30057d<? super C189941> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$message = message;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChatClient.this.new C189941(this.$message, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ChatClient chatClient;
            int i13;
            Message message;
            Iterator it;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                List<Plugin> plugins = ChatClient.this.getPlugins();
                chatClient = ChatClient.this;
                i13 = 0;
                message = this.$message;
                it = plugins.iterator();
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                it = (Iterator) this.L$3;
                message = (Message) this.L$2;
                chatClient = (ChatClient) this.L$1;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                C2345k logger = chatClient.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[updateMessage] #doOnStart; plugin: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(plugin.getClass()).getQualifiedName()), null);
                }
                this.L$0 = null;
                this.L$1 = chatClient;
                this.L$2 = message;
                this.L$3 = it;
                this.L$4 = null;
                this.L$5 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (plugin.onMessageEditRequest(message, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189941) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$updateMessage$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$updateMessage$2", m100430f = "ChatClient.kt", m100431l = {2719}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/Message;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C189952 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Message $message;
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189952(Message message, InterfaceC30057d<? super C189952> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$message = message;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C189952 c189952 = ChatClient.this.new C189952(this.$message, interfaceC30057d);
            c189952.L$0 = obj;
            return c189952;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ChatClient chatClient;
            int i13;
            Message message;
            Iterator it;
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                List<Plugin> plugins = ChatClient.this.getPlugins();
                chatClient = ChatClient.this;
                i13 = 0;
                message = this.$message;
                it = plugins.iterator();
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                it = (Iterator) this.L$4;
                message = (Message) this.L$3;
                chatClient = (ChatClient) this.L$2;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                Plugin plugin = (Plugin) it.next();
                C2345k logger = chatClient.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[updateMessage] #doOnResult; plugin: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(plugin.getClass()).getQualifiedName()), null);
                }
                this.L$0 = abstractC26205h;
                this.L$1 = null;
                this.L$2 = chatClient;
                this.L$3 = message;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (plugin.onMessageEditResult(message, abstractC26205h, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C189952) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.ChatClient$waitFirstConnection$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient", m100430f = "ChatClient.kt", m100431l = {903, 907}, m100432m = "waitFirstConnection")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C189961 extends AbstractC32269c {
        int I$0;
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C189961(InterfaceC30057d<? super C189961> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChatClient.this.waitFirstConnection(null, this);
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        THIRTY_DAYS_IN_MILLISECONDS = Duration.m134273getInWholeMillisecondsimpl(DurationKt.toDuration(30, DurationUnit.DAYS));
        DEFAULT_SORT = QuerySortByField.INSTANCE.descByName("last_updated");
        anonUser$delegate = AbstractC30060g.m92088H(new C18681l0(4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatClient(ChatApiConfig config, ChatApi api, DtoMapping dtoMapping, ChatNotifications notifications, TokenManager tokenManager, UserCredentialStorage userCredentialStorage, UserStateService userStateService, ChatClientDebugger clientDebugger, TokenUtils tokenUtils, ClientScope clientScope, UserScope userScope, InterfaceC30894d retryPolicy, AppSettingManager appSettingsManager, ChatSocket chatSocket, List<? extends PluginFactory> pluginFactories, MutableClientState mutableClientState, CurrentUserFetcher currentUserFetcher, RepositoryFactory.Provider repositoryFactoryProvider, AudioPlayer audioPlayer, InterfaceC4339a now, ServerClockOffset serverClockOffset, ChatClientRepository repository, MessageReceiptReporter messageReceiptReporter, MessageReceiptManager messageReceiptManager, CDN cdn) {
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(dtoMapping, "dtoMapping");
        AbstractC22676k.m65750j(notifications, "notifications");
        AbstractC22676k.m65750j(tokenManager, "tokenManager");
        AbstractC22676k.m65750j(userCredentialStorage, "userCredentialStorage");
        AbstractC22676k.m65750j(userStateService, "userStateService");
        AbstractC22676k.m65750j(clientDebugger, "clientDebugger");
        AbstractC22676k.m65750j(tokenUtils, "tokenUtils");
        AbstractC22676k.m65750j(clientScope, "clientScope");
        AbstractC22676k.m65750j(userScope, "userScope");
        AbstractC22676k.m65750j(retryPolicy, "retryPolicy");
        AbstractC22676k.m65750j(appSettingsManager, "appSettingsManager");
        AbstractC22676k.m65750j(chatSocket, "chatSocket");
        AbstractC22676k.m65750j(pluginFactories, "pluginFactories");
        AbstractC22676k.m65750j(mutableClientState, "mutableClientState");
        AbstractC22676k.m65750j(currentUserFetcher, "currentUserFetcher");
        AbstractC22676k.m65750j(repositoryFactoryProvider, "repositoryFactoryProvider");
        AbstractC22676k.m65750j(audioPlayer, "audioPlayer");
        AbstractC22676k.m65750j(now, "now");
        AbstractC22676k.m65750j(serverClockOffset, "serverClockOffset");
        AbstractC22676k.m65750j(repository, "repository");
        AbstractC22676k.m65750j(messageReceiptReporter, "messageReceiptReporter");
        AbstractC22676k.m65750j(messageReceiptManager, "messageReceiptManager");
        this.config = config;
        this.api = api;
        this.dtoMapping = dtoMapping;
        this.notifications = notifications;
        this.tokenManager = tokenManager;
        this.userCredentialStorage = userCredentialStorage;
        this.userStateService = userStateService;
        this.clientDebugger = clientDebugger;
        this.tokenUtils = tokenUtils;
        this.clientScope = clientScope;
        this.userScope = userScope;
        this.retryPolicy = retryPolicy;
        this.appSettingsManager = appSettingsManager;
        this.chatSocket = chatSocket;
        this.pluginFactories = pluginFactories;
        this.mutableClientState = mutableClientState;
        this.currentUserFetcher = currentUserFetcher;
        this.repositoryFactoryProvider = repositoryFactoryProvider;
        this.audioPlayer = audioPlayer;
        this.now = now;
        this.serverClockOffset = serverClockOffset;
        this.repository = repository;
        this.messageReceiptReporter = messageReceiptReporter;
        this.messageReceiptManager = messageReceiptManager;
        this.cdn = cdn;
        this.logger = AbstractC1772c1.m5382S(this, TAG);
        this.fileManager = new StreamFileManager();
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.waitConnection = c13096w1M36592b;
        this.clientState = mutableClientState;
        this.streamDateFormatter = new StreamDateFormatter(null, false, 3, 0 == true ? 1 : 0);
        ChatEventsObservable chatEventsObservable = new ChatEventsObservable(c13096w1M36592b, userScope, chatSocket);
        this.eventsObservable = chatEventsObservable;
        this.eventMutex = AbstractC25438d.m74669a();
        this.initializedUserId = new AtomicReference<>(null);
        this.pushNotificationReceivedListener = new C18090c(10);
        this.plugins = C25271y.f99162w;
        ChatEventsObservable.subscribeSuspend$default(chatEventsObservable, null, new C188912(), 1, null);
    }

    public static /* synthetic */ InterfaceC27474d addMembers$default(ChatClient chatClient, String str, String str2, List list, Message message, Boolean bool, Date date, Boolean bool2, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            message = null;
        }
        if ((i13 & 16) != 0) {
            bool = null;
        }
        if ((i13 & 32) != 0) {
            date = null;
        }
        if ((i13 & 64) != 0) {
            bool2 = null;
        }
        return chatClient.addMembers(str, str2, list, message, bool, date, bool2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final User anonUser_delegate$lambda$134() {
        return new User(ANONYMOUS_USER_ID, null, null, null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, 33554430, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object awaitConnectionState(ClientState clientState, ConnectionState connectionState, long j7, InterfaceC30057d<Object> interfaceC30057d) {
        C188921 c188921;
        if (interfaceC30057d instanceof C188921) {
            c188921 = (C188921) interfaceC30057d;
            int i13 = c188921.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c188921.label = i13 - Integer.MIN_VALUE;
            } else {
                c188921 = new C188921(interfaceC30057d);
            }
        } else {
            c188921 = new C188921(interfaceC30057d);
        }
        Object obj = c188921.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c188921.label;
        try {
            if (i14 != 0) {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C188932 c188932 = new C188932(clientState, connectionState, null);
            c188921.L$0 = null;
            c188921.L$1 = null;
            c188921.J$0 = j7;
            c188921.label = 1;
            Object objM8748b = AbstractC3028k2.m8748b(j7, c188932, c188921);
            return objM8748b == enumC31071a ? enumC31071a : objM8748b;
        } catch (Throwable th3) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
                logger.m7230a().log(enumC2341g, logger.m7231b(), "[awaitConnectionState] failed: " + th3, null);
            }
            return C23454a0.f92919a;
        }
    }

    public static /* synthetic */ Object awaitConnectionState$default(ChatClient chatClient, ClientState clientState, ConnectionState connectionState, long j7, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            j7 = 10000;
        }
        return chatClient.awaitConnectionState(clientState, connectionState, j7, interfaceC30057d);
    }

    private static final InterfaceC30063j awaitInitializationState$lambda$10(InterfaceC3027k1 it) {
        AbstractC22676k.m65750j(it, "it");
        return new C3031l1(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC26205h checkSyncHistoryPreconditions(List<String> channelsIds, Date lastSyncAt) {
        if (channelsIds.isEmpty()) {
            return new C26203f(new C26198a("channelsIds must contain at least 1 id."));
        }
        return DateKt.isLaterThanDays(lastSyncAt, THIRTY_DAYS_IN_MILLISECONDS) ? new C26203f(new C26198a("lastSyncAt cannot by later than 30 days.")) : new C26204g(C23454a0.f92919a);
    }

    public static /* synthetic */ InterfaceC27474d connectAnonymousUser$default(ChatClient chatClient, Long l7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            l7 = null;
        }
        return chatClient.connectAnonymousUser(l7);
    }

    public static /* synthetic */ InterfaceC27474d connectGuestUser$default(ChatClient chatClient, String str, String str2, Long l7, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            l7 = null;
        }
        return chatClient.connectGuestUser(str, str2, l7);
    }

    public static /* synthetic */ InterfaceC27474d connectUser$default(ChatClient chatClient, User user, TokenProvider tokenProvider, Long l7, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            l7 = null;
        }
        return chatClient.connectUser(user, tokenProvider, l7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object connectUserSuspend(User user, TokenProvider tokenProvider, Long l7, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        C189021 c189021;
        String string;
        if (interfaceC30057d instanceof C189021) {
            c189021 = (C189021) interfaceC30057d;
            int i13 = c189021.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c189021.label = i13 - Integer.MIN_VALUE;
            } else {
                c189021 = new C189021(interfaceC30057d);
            }
        } else {
            c189021 = new C189021(interfaceC30057d);
        }
        Object user2 = c189021.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = c189021.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(user2);
            this.mutableClientState.setInitializationState(InitializationState.INITIALIZING);
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
                logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC2875y.m8300m("[connectUserSuspend] userId: '", user.getId(), "', username: '", user.getName(), "'"), null);
            }
            c189021.L$0 = null;
            c189021.L$1 = null;
            c189021.L$2 = null;
            c189021.label = 1;
            user2 = setUser(user, tokenProvider, l7, c189021);
            if (user2 == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(user2);
        }
        AbstractC26205h abstractC26205h = (AbstractC26205h) user2;
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339eM7232c2 = logger2.m7232c();
        EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
        if (!interfaceC2339eM7232c2.isLoggable(enumC2341g2, logger2.m7231b())) {
            return user2;
        }
        InterfaceC2344j interfaceC2344jM7230a = logger2.m7230a();
        String strM7231b = logger2.m7231b();
        if (abstractC26205h instanceof C26204g) {
            string = AbstractC11895b.m31996o("ConnectionData(connectionId=", ((ConnectionData) ((C26204g) abstractC26205h).m77814e()).getConnectionId(), ")");
        } else {
            if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            string = ((C26203f) abstractC26205h).m77813e().toString();
        }
        interfaceC2344jM7230a.log(enumC2341g2, strM7231b, "[connectUserSuspend] completed: " + string, null);
        return user2;
    }

    private final RepositoryFacade createRepositoryFacade(InterfaceC2994c0 scope, RepositoryFactory repositoryFactory) {
        return RepositoryFacade.Companion.create$default(RepositoryFacade.INSTANCE, repositoryFactory, scope, null, 4, null);
    }

    public static /* synthetic */ RepositoryFacade createRepositoryFacade$default(ChatClient chatClient, InterfaceC2994c0 interfaceC2994c0, RepositoryFactory repositoryFactory, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            repositoryFactory = NoOpRepositoryFactory.INSTANCE;
        }
        return chatClient.createRepositoryFacade(interfaceC2994c0, repositoryFactory);
    }

    private final RepositoryFactory createRepositoryFactory(User user) {
        return this.repositoryFactoryProvider.createRepositoryFactory(user);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ ArrayList m54521d(String str, List list) {
        return (ArrayList) getAttachments$lambda$71(str, list);
    }

    public static /* synthetic */ InterfaceC27474d deleteMessage$default(ChatClient chatClient, String str, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return chatClient.deleteMessage(str, z4);
    }

    public static /* synthetic */ InterfaceC27474d deleteReaction$default(ChatClient chatClient, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        return chatClient.deleteReaction(str, str2, str3);
    }

    public static /* synthetic */ InterfaceC27474d disconnect$default(ChatClient chatClient, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = z4;
        }
        return chatClient.disconnect(z4, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object disconnectSuspend(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C189211 c189211;
        if (interfaceC30057d instanceof C189211) {
            c189211 = (C189211) interfaceC30057d;
            int i13 = c189211.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c189211.label = i13 - Integer.MIN_VALUE;
            } else {
                c189211 = new C189211(interfaceC30057d);
            }
        } else {
            c189211 = new C189211(interfaceC30057d);
        }
        Object obj = c189211.result;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c189211.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c189211.Z$0 = z4;
            c189211.label = 1;
            if (disconnectUserSuspend(z4, c189211) == obj2) {
                return obj2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        this.userScope.getUserId().setValue(null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x005b A[PHI: r2 r13
      0x005b: PHI (r2v11 java.lang.String) = (r2v8 java.lang.String), (r2v15 java.lang.String) binds: [B:38:0x0100, B:16:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x005b: PHI (r13v5 boolean) = (r13v3 boolean), (r13v6 boolean) binds: [B:38:0x0100, B:16:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00d5 A[LOOP:0: B:31:0x00cf->B:33:0x00d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x00f3 A[PHI: r2 r13
      0x00f3: PHI (r2v8 java.lang.String) = (r2v4 java.lang.String), (r2v10 java.lang.String) binds: [B:35:0x00f0, B:18:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x00f3: PHI (r13v3 boolean) = (r13v1 boolean), (r13v4 boolean) binds: [B:35:0x00f0, B:18:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x011a A[PHI: r2 r13 r14
      0x011a: PHI (r2v16 io.getstream.chat.android.client.ChatClient) = (r2v13 io.getstream.chat.android.client.ChatClient), (r2v19 io.getstream.chat.android.client.ChatClient) binds: [B:41:0x0117, B:15:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x011a: PHI (r13v7 boolean) = (r13v5 boolean), (r13v8 boolean) binds: [B:41:0x0117, B:15:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x011a: PHI (r14v18 java.lang.String) = (r14v17 java.lang.String), (r14v19 java.lang.String) binds: [B:41:0x0117, B:15:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0121  */
    /* JADX WARN: Code duplicated, block: B:49:0x0138 A[PHI: r2 r13 r14
      0x0138: PHI (r2v20 io.getstream.chat.android.client.ChatClient) = (r2v16 io.getstream.chat.android.client.ChatClient), (r2v21 io.getstream.chat.android.client.ChatClient) binds: [B:44:0x011f, B:48:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r13v9 boolean) = (r13v7 boolean), (r13v11 boolean) binds: [B:44:0x011f, B:48:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r14v20 java.lang.String) = (r14v18 java.lang.String), (r14v24 java.lang.String) binds: [B:44:0x011f, B:48:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0130, code lost:
    
        if (r3.clear(r7) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0148, code lost:
    
        if (r3.clear(r7) == r1) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object disconnectUserSuspend(boolean r13, q83.InterfaceC30057d<? super l83.C23454a0> r14) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.ChatClient.disconnectUserSuspend(boolean, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object doSendMessage(String str, String str2, Message message, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return AbstractC27476f.m82903a(AbstractC27476f.m82911i(this.api.sendMessage(str, str2, message), this.userScope, this.retryPolicy), this.userScope, new C189232(str, str2, message, null)).await(interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (r2 == r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0167, code lost:
    
        if (r2 == r4) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ensureCreatedLocallyAt(io.getstream.chat.android.models.Message r64, java.lang.String r65, q83.InterfaceC30057d<? super io.getstream.chat.android.models.Message> r66) {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.ChatClient.ensureCreatedLocallyAt(io.getstream.chat.android.models.Message, java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final User extractCurrentUser(ChatEvent chatEvent) {
        User currentUser;
        if (chatEvent instanceof HasOwnUser) {
            return ((HasOwnUser) chatEvent).getMe();
        }
        if ((chatEvent instanceof UserEvent) && (currentUser = getCurrentUser()) != null) {
            UserEvent userEvent = (UserEvent) chatEvent;
            if (!AbstractC22676k.m65745e(currentUser.getId(), userEvent.getUser().getId())) {
                currentUser = null;
            }
            if (currentUser != null) {
                return UserUtilsKt.mergePartially(currentUser, userEvent.getUser());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C3031l1 m54524g(InterfaceC3027k1 interfaceC3027k1) {
        return (C3031l1) awaitInitializationState$lambda$10(interfaceC3027k1);
    }

    private final InterfaceC27474d getAttachments(String channelType, String channelId, int offset, int limit, String type) {
        return AbstractC27476f.m82909g(getMessagesWithAttachments(channelType, channelId, offset, limit, AbstractC37056f.m118958J(type)), new C17632d(type, 2));
    }

    private static final List getAttachments$lambda$71(String str, List messages) {
        AbstractC22676k.m65750j(messages, "messages");
        ArrayList arrayList = new ArrayList();
        Iterator it = messages.iterator();
        while (it.hasNext()) {
            List<Attachment> attachments = ((Message) it.next()).getAttachments();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : attachments) {
                if (AbstractC22676k.m65745e(((Attachment) obj).getType(), str)) {
                    arrayList2.add(obj);
                }
            }
            AbstractC25265s.m74141p0(arrayList, arrayList2);
        }
        return arrayList;
    }

    @InternalStreamChatApi
    public static /* synthetic */ void getAudioPlayer$annotations() {
    }

    @InternalStreamChatApi
    public static /* synthetic */ void getCdn$annotations() {
    }

    public static /* synthetic */ InterfaceC27474d getChannel$default(ChatClient chatClient, String str, int i13, int i14, boolean z4, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            i13 = 0;
        }
        if ((i15 & 4) != 0) {
            i14 = 0;
        }
        if ((i15 & 8) != 0) {
            z4 = false;
        }
        return chatClient.getChannel(str, i13, i14, z4);
    }

    private static final int getDevices$lambda$58() {
        return 295158983;
    }

    private final List<ErrorHandler> getErrorHandlers() {
        List<? extends Plugin> list = this.plugins;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ErrorHandler errorHandler = ((Plugin) it.next()).getErrorHandler();
            if (errorHandler != null) {
                arrayList.add(errorHandler);
            }
        }
        return AbstractC25265s.m74150t1(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getMessagesWithAttachments$lambda$72(SearchMessagesResult it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getMessages();
    }

    public static /* synthetic */ InterfaceC27474d getNewerReplies$default(ChatClient chatClient, String str, int i13, String str2, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            str2 = null;
        }
        return chatClient.getNewerReplies(str, i13, str2);
    }

    public static final boolean getOFFLINE_SUPPORT_ENABLED() {
        INSTANCE.getClass();
        return OFFLINE_SUPPORT_ENABLED;
    }

    @InternalStreamChatApi
    public static /* synthetic */ void getPluginFactories$annotations() {
    }

    @InternalStreamChatApi
    public static /* synthetic */ void getPlugins$annotations() {
    }

    @InternalStreamChatApi
    public static /* synthetic */ void getRepositoryFacade$annotations() {
    }

    @InternalStreamChatApi
    public static /* synthetic */ void getServerClockOffset$annotations() {
    }

    public static /* synthetic */ InterfaceC27474d getThread$default(ChatClient chatClient, String str, GetThreadOptions getThreadOptions, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            getThreadOptions = new GetThreadOptions(false, 0, 0, 0, 15, null);
        }
        return chatClient.getThread(str, getThreadOptions);
    }

    public static final VersionPrefixHeader getVERSION_PREFIX_HEADER() {
        INSTANCE.getClass();
        return VERSION_PREFIX_HEADER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01e4, code lost:
    
        if (r13.onUserUpdated(r12, r0) == r1) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleEvent(io.getstream.chat.android.client.events.ChatEvent r12, q83.InterfaceC30057d<? super l83.C23454a0> r13) {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.ChatClient.handleEvent(io.getstream.chat.android.client.events.ChatEvent, q83.d):java.lang.Object");
    }

    public static final void handlePushMessage(PushMessage pushMessage) throws IllegalStateException {
        INSTANCE.handlePushMessage(pushMessage);
    }

    public static /* synthetic */ InterfaceC27474d hideChannel$default(ChatClient chatClient, String str, String str2, boolean z4, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        return chatClient.hideChannel(str, str2, z4);
    }

    private final synchronized void initializeClientWithUser(User user, CacheableTokenProvider tokenProvider, boolean isAnonymous) {
        InterfaceC38174i children;
        InterfaceC38174i children2;
        try {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
            EnumC2341g enumC2341g = EnumC2341g.INFO;
            if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
                logger.m7230a().log(enumC2341g, logger.m7231b(), "[initializeClientWithUser] user.id: '" + user.getId() + "'", null);
            }
            InterfaceC30063j coroutineContext = this.clientScope.getCoroutineContext();
            C3023j1 c3023j1 = C3023j1.f12041w;
            InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) coroutineContext.get(c3023j1);
            int iM122280p = -1;
            int iM122280p2 = (interfaceC3027k1 == null || (children2 = interfaceC3027k1.getChildren()) == null) ? -1 : AbstractC38176k.m122280p(children2);
            InterfaceC3027k1 interfaceC3027k2 = (InterfaceC3027k1) this.userScope.getCoroutineContext().get(c3023j1);
            if (interfaceC3027k2 != null && (children = interfaceC3027k2.getChildren()) != null) {
                iM122280p = AbstractC38176k.m122280p(children);
            }
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339eM7232c2 = logger2.m7232c();
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339eM7232c2.isLoggable(enumC2341g2, logger2.m7231b())) {
                logger2.m7230a().log(enumC2341g2, logger2.m7231b(), "[initializeClientWithUser] clientJobCount: " + iM122280p2 + ", userJobCount: " + iM122280p, null);
            }
            if (AbstractC22676k.m65745e(this.initializedUserId.get(), user.getId())) {
                C2345k logger3 = getLogger();
                if (logger3.m7232c().isLoggable(enumC2341g, logger3.m7231b())) {
                    logger3.m7230a().log(enumC2341g, logger3.m7231b(), "[initializeClientWithUser] initializing client with the same user id. Skipping repository and plugins recreation", null);
                }
            } else {
                this._repositoryFacade = createRepositoryFacade(this.userScope, this.repositoryFactoryProvider.createRepositoryFactory(user));
                List<PluginFactory> list = this.pluginFactories;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PluginFactory) it.next()).get(user));
                }
                this.plugins = arrayList;
                this.initializedUserId.set(user.getId());
            }
            Iterator<T> it3 = this.plugins.iterator();
            while (it3.hasNext()) {
                ((Plugin) it3.next()).onUserSet(user);
            }
            this.config.setAnonymous(isAnonymous);
            this.tokenManager.setTokenProvider(tokenProvider);
            this.appSettingsManager.loadAppSettings();
            warmUp();
            this.messageReceiptReporter.start();
            C2345k logger4 = getLogger();
            InterfaceC2339e interfaceC2339eM7232c3 = logger4.m7232c();
            EnumC2341g enumC2341g3 = EnumC2341g.INFO;
            if (interfaceC2339eM7232c3.isLoggable(enumC2341g3, logger4.m7231b())) {
                logger4.m7230a().log(enumC2341g3, logger4.m7231b(), "[initializeClientWithUser] user.id: '" + user.getId() + "'completed", null);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static final ChatClient instance() {
        return INSTANCE.instance();
    }

    public static /* synthetic */ InterfaceC27474d inviteMembers$default(ChatClient chatClient, String str, String str2, List list, Message message, Boolean bool, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            message = null;
        }
        if ((i13 & 16) != 0) {
            bool = null;
        }
        return chatClient.inviteMembers(str, str2, list, message, bool);
    }

    public static final boolean isInitialized() {
        return INSTANCE.isInitialized();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isUserSet() {
        return !(this.userStateService.getState$stream_chat_android_client_release() instanceof io.getstream.chat.android.client.clientstate.UserState.NotSet);
    }

    public static /* synthetic */ InterfaceC27474d keystroke$default(ChatClient chatClient, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        return chatClient.keystroke(str, str2, str3);
    }

    private static final int markAllRead$lambda$113() {
        return -150079702;
    }

    public static /* synthetic */ InterfaceC27474d muteChannel$default(ChatClient chatClient, String str, String str2, Integer num, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            num = null;
        }
        return chatClient.muteChannel(str, str2, num);
    }

    public static /* synthetic */ InterfaceC27474d muteUser$default(ChatClient chatClient, String str, Integer num, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            num = null;
        }
        return chatClient.muteUser(str, num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC27474d partialUpdateMember$default(ChatClient chatClient, String str, String str2, String str3, Map map, List list, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            map = C25272z.f99163w;
        }
        Map map2 = map;
        if ((i13 & 16) != 0) {
            list = C25271y.f99162w;
        }
        return chatClient.partialUpdateMember(str, str2, str3, map2, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC27474d partialUpdateMessage$default(ChatClient chatClient, String str, Map map, List list, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map = C25272z.f99163w;
        }
        if ((i13 & 4) != 0) {
            list = C25271y.f99162w;
        }
        return chatClient.partialUpdateMessage(str, map, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC27474d partialUpdatePoll$default(ChatClient chatClient, String str, Map map, List list, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map = C25272z.f99163w;
        }
        if ((i13 & 4) != 0) {
            list = C25271y.f99162w;
        }
        return chatClient.partialUpdatePoll(str, map, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC27474d partialUpdateThread$default(ChatClient chatClient, String str, Map map, List list, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map = C25272z.f99163w;
        }
        if ((i13 & 4) != 0) {
            list = C25271y.f99162w;
        }
        return chatClient.partialUpdateThread(str, map, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC27474d partialUpdateUser$default(ChatClient chatClient, String str, Map map, List list, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map = C25272z.f99163w;
        }
        if ((i13 & 4) != 0) {
            list = C25271y.f99162w;
        }
        return chatClient.partialUpdateUser(str, map, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC27474d partialUpdateUser$lambda$118(ChatClient chatClient, String str, List users) {
        Object next;
        AbstractC22676k.m65750j(users, "users");
        Iterator it = users.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((User) next).getId(), str));
        User user = (User) next;
        return user == null ? new ErrorCall(chatClient.userScope, new C26198a(AbstractC11895b.m31996o("User with id ", str, " not found"))) : new C27478h(chatClient.userScope, new ChatClient$partialUpdateUser$2$1(user, null));
    }

    public static /* synthetic */ InterfaceC27474d pinMessage$default(ChatClient chatClient, Message message, Date date, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            date = null;
        }
        return chatClient.pinMessage(message, date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pushNotificationReceivedListener$lambda$3(String str, String str2) {
        AbstractC22676k.m65750j(str, "<unused var>");
        AbstractC22676k.m65750j(str2, "<unused var>");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC27474d queryBannedUsers$default(ChatClient chatClient, FilterObject filterObject, QuerySorter querySorter, Integer num, Integer num2, Date date, Date date2, Date date3, Date date4, int i13, Object obj) {
        return chatClient.queryBannedUsers(filterObject, (i13 & 2) != 0 ? QuerySortByField.INSTANCE.ascByName("created_at") : querySorter, (i13 & 4) != 0 ? null : num, (i13 & 8) != 0 ? null : num2, (i13 & 16) != 0 ? null : date, (i13 & 32) != 0 ? null : date2, (i13 & 64) != 0 ? null : date3, (i13 & 128) != 0 ? null : date4);
    }

    public static /* synthetic */ InterfaceC27474d queryChannel$default(ChatClient chatClient, String str, String str2, QueryChannelRequest queryChannelRequest, boolean z4, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z4 = false;
        }
        return chatClient.queryChannel(str, str2, queryChannelRequest, z4);
    }

    private final InterfaceC27474d queryChannelInternal(String channelType, String channelId, QueryChannelRequest request) {
        return this.api.queryChannel(channelType, channelId, request);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List queryChannels$lambda$109(QueryChannelsResult it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getChannels();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC27474d queryDrafts$default(ChatClient chatClient, FilterObject filterObject, int i13, String str, QuerySorter querySorter, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            str = null;
        }
        if ((i14 & 8) != 0) {
            querySorter = QuerySortByField.INSTANCE.descByName("created_at");
        }
        return chatClient.queryDrafts(filterObject, i13, str, querySorter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC27474d queryPollVotes$default(ChatClient chatClient, String str, FilterObject filterObject, Integer num, String str2, QuerySorter querySorter, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            filterObject = null;
        }
        if ((i13 & 4) != 0) {
            num = null;
        }
        if ((i13 & 8) != 0) {
            str2 = null;
        }
        if ((i13 & 16) != 0) {
            querySorter = null;
        }
        return chatClient.queryPollVotes(str, filterObject, num, str2, querySorter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC27474d queryPolls$default(ChatClient chatClient, FilterObject filterObject, Integer num, String str, QuerySorter querySorter, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            filterObject = null;
        }
        if ((i13 & 2) != 0) {
            num = null;
        }
        if ((i13 & 4) != 0) {
            str = null;
        }
        if ((i13 & 8) != 0) {
            querySorter = null;
        }
        return chatClient.api.queryPolls(filterObject, num, str, querySorter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC27474d queryReactions$default(ChatClient chatClient, String str, FilterObject filterObject, Integer num, String str2, QuerySorter querySorter, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            filterObject = null;
        }
        if ((i13 & 4) != 0) {
            num = null;
        }
        if ((i13 & 8) != 0) {
            str2 = null;
        }
        if ((i13 & 16) != 0) {
            querySorter = null;
        }
        return chatClient.queryReactions(str, filterObject, num, str2, querySorter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC27474d queryReminders$default(ChatClient chatClient, FilterObject filterObject, int i13, String str, QuerySorter querySorter, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            str = null;
        }
        if ((i14 & 8) != 0) {
            querySorter = new QuerySortByField();
        }
        return chatClient.queryReminders(filterObject, i13, str, querySorter);
    }

    public static /* synthetic */ InterfaceC27474d removeMembers$default(ChatClient chatClient, String str, String str2, List list, Message message, Boolean bool, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            message = null;
        }
        if ((i13 & 16) != 0) {
            bool = null;
        }
        return chatClient.removeMembers(str, str2, list, message, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC27474d searchMessages$default(ChatClient chatClient, FilterObject filterObject, FilterObject filterObject2, Integer num, Integer num2, String str, QuerySorter querySorter, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            num = null;
        }
        if ((i13 & 8) != 0) {
            num2 = null;
        }
        if ((i13 & 16) != 0) {
            str = null;
        }
        if ((i13 & 32) != 0) {
            querySorter = null;
        }
        return chatClient.searchMessages(filterObject, filterObject2, num, num2, str, querySorter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object sendAttachments(String str, String str2, Message message, boolean z4, SendMessageDebugger sendMessageDebugger, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        C189751 c189751;
        String str3;
        Message message2;
        int i13;
        Iterator it;
        SendMessageDebugger sendMessageDebugger2;
        boolean z13;
        SendMessageDebugger sendMessageDebugger3;
        Message message3;
        Message messagePrepareMessage = message;
        if (interfaceC30057d instanceof C189751) {
            c189751 = (C189751) interfaceC30057d;
            int i14 = c189751.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c189751.label = i14 - Integer.MIN_VALUE;
            } else {
                c189751 = new C189751(interfaceC30057d);
            }
        } else {
            c189751 = new C189751(interfaceC30057d);
        }
        Object obj = c189751.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c189751.label;
        if (i15 != 0) {
            if (i15 == 1) {
                int i16 = c189751.I$0;
                boolean z14 = c189751.Z$0;
                Iterator it3 = (Iterator) c189751.L$7;
                Message message4 = (Message) c189751.L$5;
                SendMessageDebugger sendMessageDebugger4 = (SendMessageDebugger) c189751.L$3;
                String str4 = (String) c189751.L$1;
                String str5 = (String) c189751.L$0;
                AbstractC34132o.m107864I(obj);
                sendMessageDebugger2 = sendMessageDebugger4;
                str3 = str4;
                message2 = message4;
                it = it3;
                z13 = z14;
                i13 = i16;
                str = str5;
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                message3 = (Message) c189751.L$5;
                sendMessageDebugger3 = (SendMessageDebugger) c189751.L$3;
                AbstractC34132o.m107864I(obj);
            }
            sendMessageDebugger3.onInterceptionStop((AbstractC26205h) obj, message3);
            return obj;
        }
        AbstractC34132o.m107864I(obj);
        sendMessageDebugger.onInterceptionStart(messagePrepareMessage);
        MessagePreparer messagePreparer = new MessagePreparer(this.clientState, this.logicRegistry);
        User currentUser = getCurrentUser();
        if (currentUser != null) {
            messagePrepareMessage = messagePreparer.prepareMessage(messagePrepareMessage, str2, str, currentUser);
        }
        sendMessageDebugger.onInterceptionUpdate(messagePrepareMessage);
        str3 = str2;
        message2 = messagePrepareMessage;
        i13 = 0;
        it = this.plugins.iterator();
        sendMessageDebugger2 = sendMessageDebugger;
        z13 = z4;
        while (it.hasNext()) {
            Plugin plugin = (Plugin) it.next();
            c189751.L$0 = str;
            c189751.L$1 = str3;
            c189751.L$2 = null;
            c189751.L$3 = sendMessageDebugger2;
            c189751.L$4 = null;
            c189751.L$5 = message2;
            c189751.L$6 = null;
            c189751.L$7 = it;
            c189751.L$8 = null;
            c189751.L$9 = null;
            c189751.Z$0 = z13;
            c189751.I$0 = i13;
            c189751.I$1 = 0;
            c189751.label = 1;
            if (plugin.onAttachmentSendRequest(str, str3, message2, c189751) == enumC31071a) {
                return enumC31071a;
            }
        }
        AttachmentsSender attachmentsSender$stream_chat_android_client_release = getAttachmentsSender$stream_chat_android_client_release();
        c189751.L$0 = null;
        c189751.L$1 = null;
        c189751.L$2 = null;
        c189751.L$3 = sendMessageDebugger2;
        c189751.L$4 = null;
        c189751.L$5 = message2;
        c189751.L$6 = null;
        c189751.L$7 = null;
        c189751.L$8 = null;
        c189751.L$9 = null;
        c189751.Z$0 = z13;
        c189751.label = 2;
        Object objSendAttachments$stream_chat_android_client_release = attachmentsSender$stream_chat_android_client_release.sendAttachments$stream_chat_android_client_release(message2, str, str3, z13, c189751);
        if (objSendAttachments$stream_chat_android_client_release != enumC31071a) {
            sendMessageDebugger3 = sendMessageDebugger2;
            obj = objSendAttachments$stream_chat_android_client_release;
            message3 = message2;
            sendMessageDebugger3.onInterceptionStop((AbstractC26205h) obj, message3);
            return obj;
        }
        return enumC31071a;
    }

    public static /* synthetic */ Object sendAttachments$default(ChatClient chatClient, String str, String str2, Message message, boolean z4, SendMessageDebugger sendMessageDebugger, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z4 = false;
        }
        return chatClient.sendAttachments(str, str2, message, z4, sendMessageDebugger, interfaceC30057d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC27474d sendEvent$default(ChatClient chatClient, String str, String str2, String str3, Map map, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            map = C25272z.f99163w;
        }
        return chatClient.sendEvent(str, str2, str3, map);
    }

    public static /* synthetic */ InterfaceC27474d sendFile$default(ChatClient chatClient, String str, String str2, File file, ProgressCallback progressCallback, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            progressCallback = null;
        }
        return chatClient.sendFile(str, str2, file, progressCallback);
    }

    public static /* synthetic */ InterfaceC27474d sendImage$default(ChatClient chatClient, String str, String str2, File file, ProgressCallback progressCallback, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            progressCallback = null;
        }
        return chatClient.sendImage(str, str2, file, progressCallback);
    }

    private final InterfaceC27474d sendLocationMessage(Location location) {
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(location.getCid());
        return AbstractC27476f.m82907e(sendMessage$default(this, (String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x, new Message(null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, location, null, false, -1, 57343, null), false, 8, null), new C19085d(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC27474d sendLocationMessage$lambda$65(ChatClient chatClient, Message message) {
        AbstractC22676k.m65750j(message, "message");
        Location sharedLocation = message.getSharedLocation();
        if (sharedLocation != null) {
            return new C27478h(chatClient.userScope, new ChatClient$sendLocationMessage$1$1$1(sharedLocation, null));
        }
        ErrorCall errorCall = new ErrorCall(chatClient.userScope, new C26198a("Location was not sent."));
        C2345k logger = chatClient.getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "Location was not sent", null);
        }
        return errorCall;
    }

    public static /* synthetic */ InterfaceC27474d sendMessage$default(ChatClient chatClient, String str, String str2, Message message, boolean z4, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z4 = false;
        }
        return chatClient.sendMessage(str, str2, message, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sendMessage$lambda$90(String str, String str2, Message message) {
        return IdentifiersKt.SendMessageIdentifier(str, str2, message.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC27474d sendPoll$lambda$68(ChatClient chatClient, String str, String str2, Poll poll) {
        AbstractC22676k.m65750j(poll, "poll");
        return sendMessage$default(chatClient, str, str2, new Message(null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC31061c.m95645u("poll_id", poll.getId()), false, false, null, false, null, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, false, -16777217, 65535, null), false, 8, null);
    }

    public static /* synthetic */ InterfaceC27474d sendReaction$default(ChatClient chatClient, Reaction reaction, boolean z4, String str, boolean z13, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str = null;
        }
        if ((i13 & 8) != 0) {
            z13 = false;
        }
        return chatClient.sendReaction(reaction, z4, str, z13);
    }

    public static final void setOFFLINE_SUPPORT_ENABLED(boolean z4) {
        INSTANCE.getClass();
        OFFLINE_SUPPORT_ENABLED = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:67:0x0275  */
    /* JADX WARN: Code duplicated, block: B:69:0x0279  */
    /* JADX WARN: Code duplicated, block: B:71:0x029e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:72:0x029f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:75:0x02a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0186, code lost:
    
        if (r15 == r1) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setUser(io.getstream.chat.android.models.User r12, io.getstream.chat.android.client.token.TokenProvider r13, java.lang.Long r14, q83.InterfaceC30057d<? super n23.AbstractC26205h> r15) {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.ChatClient.setUser(io.getstream.chat.android.models.User, io.getstream.chat.android.client.token.TokenProvider, java.lang.Long, q83.d):java.lang.Object");
    }

    public static final void setVERSION_PREFIX_HEADER(VersionPrefixHeader versionPrefixHeader) {
        INSTANCE.setVERSION_PREFIX_HEADER(versionPrefixHeader);
    }

    public static /* synthetic */ InterfaceC27474d stopTyping$default(ChatClient chatClient, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        return chatClient.stopTyping(str, str2, str3);
    }

    private final void storePushNotificationsConfig(String userId, String userName, boolean isAnonymous) {
        UserCredentialStorage userCredentialStorage = this.userCredentialStorage;
        String currentToken = getCurrentToken();
        if (currentToken == null) {
            currentToken = "";
        }
        userCredentialStorage.put(new CredentialConfig(userId, currentToken, userName, isAnonymous));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean subscribeFor$lambda$46(String[] strArr, ChatEvent event) {
        AbstractC22676k.m65750j(event, "event");
        return AbstractC25260n.m74056a0(strArr, event.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeFor$lambda$47(InterfaceC1585g0 interfaceC1585g0, ChatEventListener chatEventListener, ChatEvent event) {
        AbstractC22676k.m65750j(event, "event");
        if (interfaceC1585g0.getLifecycle().getCurrentState().compareTo(EnumC1635w.f6328z) >= 0) {
            chatEventListener.onEvent(event);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean subscribeFor$lambda$49(Class[] clsArr, ChatEvent event) {
        AbstractC22676k.m65750j(event, "event");
        for (Class cls : clsArr) {
            if (cls.isInstance(event)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeFor$lambda$50(InterfaceC1585g0 interfaceC1585g0, ChatEventListener chatEventListener, ChatEvent event) {
        AbstractC22676k.m65750j(event, "event");
        if (interfaceC1585g0.getLifecycle().getCurrentState().compareTo(EnumC1635w.f6328z) >= 0) {
            chatEventListener.onEvent(event);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean subscribeForSingle$lambda$51(String str, ChatEvent event) {
        AbstractC22676k.m65750j(event, "event");
        return AbstractC22676k.m65745e(event.getType(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean subscribeForSingle$lambda$52(Class cls, ChatEvent event) {
        AbstractC22676k.m65750j(event, "event");
        return cls.isInstance(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeForSingle$lambda$53(ChatEventListener chatEventListener, ChatEvent event) {
        AbstractC22676k.m65750j(event, "event");
        chatEventListener.onEvent(event);
    }

    public static /* synthetic */ InterfaceC27474d switchUser$default(ChatClient chatClient, User user, TokenProvider tokenProvider, Long l7, InterfaceC4339a interfaceC4339a, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            l7 = null;
        }
        if ((i13 & 8) != 0) {
            interfaceC4339a = new C18518b(28);
        }
        return chatClient.switchUser(user, tokenProvider, l7, interfaceC4339a);
    }

    public static /* synthetic */ InterfaceC27474d truncateChannel$default(ChatClient chatClient, String str, String str2, Message message, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            message = null;
        }
        return chatClient.truncateChannel(str, str2, message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC27474d updateChannel$default(ChatClient chatClient, String str, String str2, Message message, Map map, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            map = C25272z.f99163w;
        }
        return chatClient.updateChannel(str, str2, message, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC27474d updateChannelPartial$default(ChatClient chatClient, String str, String str2, Map map, List list, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            map = C25272z.f99163w;
        }
        if ((i13 & 8) != 0) {
            list = C25271y.f99162w;
        }
        return chatClient.updateChannelPartial(str, str2, map, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final User updateUser$lambda$115(List it) {
        AbstractC22676k.m65750j(it, "it");
        return (User) AbstractC25265s.m74096F0(it);
    }

    public static /* synthetic */ InterfaceC27474d uploadFile$default(ChatClient chatClient, File file, ProgressCallback progressCallback, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            progressCallback = null;
        }
        return chatClient.uploadFile(file, progressCallback);
    }

    public static /* synthetic */ InterfaceC27474d uploadImage$default(ChatClient chatClient, File file, ProgressCallback progressCallback, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            progressCallback = null;
        }
        return chatClient.uploadImage(file, progressCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r10 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitFirstConnection(java.lang.Long r9, q83.InterfaceC30057d<? super n23.AbstractC26205h> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.getstream.chat.android.client.ChatClient.C189961
            if (r0 == 0) goto L13
            r0 = r10
            io.getstream.chat.android.client.ChatClient$waitFirstConnection$1 r0 = (io.getstream.chat.android.client.ChatClient.C189961) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.ChatClient$waitFirstConnection$1 r0 = new io.getstream.chat.android.client.ChatClient$waitFirstConnection$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r9 = r0.L$0
            java.lang.Long r9 = (java.lang.Long) r9
            p505ts.AbstractC34132o.m107864I(r10)
            return r10
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            java.lang.Object r9 = r0.L$0
            java.lang.Long r9 = (java.lang.Long) r9
            p505ts.AbstractC34132o.m107864I(r10)
            goto L61
        L3e:
            p505ts.AbstractC34132o.m107864I(r10)
            r10 = 0
            if (r9 == 0) goto L83
            long r2 = r9.longValue()
            long r5 = r9.longValue()
            io.getstream.chat.android.client.ChatClient$waitFirstConnection$2$1 r7 = new io.getstream.chat.android.client.ChatClient$waitFirstConnection$2$1
            r7.<init>(r8, r10)
            r0.L$0 = r9
            r0.J$0 = r2
            r10 = 0
            r0.I$0 = r10
            r0.label = r4
            java.lang.Object r10 = bc3.AbstractC3028k2.m8750d(r5, r7, r0)
            if (r10 != r1) goto L61
            goto L8f
        L61:
            n23.h r10 = (n23.AbstractC26205h) r10
            if (r10 != 0) goto L82
            n23.f r10 = new n23.f
            n23.a r0 = new n23.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Connection wasn't established in "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = "ms"
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            r10.<init>(r0)
        L82:
            return r10
        L83:
            ec3.o1 r9 = r8.waitConnection
            r0.L$0 = r10
            r0.label = r3
            java.lang.Object r9 = ec3.AbstractC13091v.m36575A(r9, r0)
            if (r9 != r1) goto L90
        L8f:
            return r1
        L90:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.ChatClient.waitFirstConnection(java.lang.Long, q83.d):java.lang.Object");
    }

    private final void warmUp() {
        if (this.config.getWarmUp()) {
            this.api.warmUp();
        }
    }

    public final InterfaceC27474d acceptInvite(String channelType, String channelId, String message) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.api.acceptInvite(channelType, channelId, message);
    }

    public final InterfaceC27474d addDevice(Device device) {
        AbstractC22676k.m65750j(device, "device");
        return AbstractC27476f.m82912j(this.api.addDevice(device), this.userScope, new C19089g(device, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC27474d addMembers(String channelType, String channelId, List<String> memberIds, Message systemMessage, Boolean hideHistory, Date hideHistoryBefore, Boolean skipPush) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(memberIds, "memberIds");
        List<String> list = memberIds;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new MemberData((String) it.next(), null, 2, 0 == true ? 1 : 0));
        }
        return addMembers(channelType, channelId, new AddMembersParams(arrayList, systemMessage, hideHistory, hideHistoryBefore, skipPush));
    }

    public final void addSocketListener(SocketListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.chatSocket.addListener(listener);
    }

    public final InterfaceC27474d appSettings() {
        return this.api.appSettings();
    }

    public final InterfaceC27474d archiveChannel(String channelType, String channelId) {
        String id4;
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC31061c.m95640p("[archiveChannel] channelType: ", channelType, ", channelId: ", channelId), null);
        }
        Map mapM114688p = AbstractC36095b.m114688p(Boolean.TRUE, "archived");
        User currentUser = getCurrentUser();
        if (currentUser == null || (id4 = currentUser.getId()) == null) {
            id4 = "";
        }
        return partialUpdateMember$default(this, channelType, channelId, id4, mapM114688p, null, 16, null);
    }

    @InternalStreamChatApi
    @StreamHandsOff(reason = "This method is used to avoid race-condition between plugin initialization and dependency resolution.")
    public final InitializationState awaitInitializationState(long timeoutMilliseconds) throws InterruptedException {
        Object obj;
        C22669g0 c22669g0 = new C22669g0();
        c22669g0.f89336w = ((C13045h2) this.clientState.getInitializationState()).getValue();
        AbstractC3006f0.m8732z(inheritScope(new C18510t(20)), null, null, new C188942(c22669g0, timeoutMilliseconds, this, null), 3);
        long j7 = 0;
        while (true) {
            obj = c22669g0.f89336w;
            if (obj != InitializationState.INITIALIZING || j7 >= timeoutMilliseconds) {
                break;
            }
            Thread.sleep(100L);
            j7 += 100;
        }
        return (InitializationState) obj;
    }

    public final InterfaceC27474d banUser(String targetId, String channelType, String channelId, String reason, Integer timeout) {
        AbstractC22676k.m65750j(targetId, "targetId");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return AbstractC27476f.m82913k(this.api.banUser(targetId, timeout, reason, channelType, channelId, false));
    }

    public final InterfaceC27474d blockUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        return AbstractC27476f.m82903a(this.api.blockUser(userId), this.userScope, new C188951(userId, null));
    }

    public final InterfaceC27474d castPollAnswer(String messageId, String pollId, String answer) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(answer, "answer");
        return this.api.castPollAnswer(messageId, pollId, answer);
    }

    public final InterfaceC27474d castPollVote(String messageId, String pollId, String optionId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(optionId, "optionId");
        return this.api.castPollVote(messageId, pollId, optionId);
    }

    public final ChannelClient channel(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return new ChannelClient(channelType, channelId, this);
    }

    public final InterfaceC27474d clearCacheAndTemporaryFiles(Context context) {
        AbstractC22676k.m65750j(context, "context");
        return new C27478h(this.clientScope, new C188961(context, null));
    }

    public final InterfaceC27474d clearPersistence() {
        return AbstractC27476f.m82904b(new C27478h(this.clientScope, new C188971(null)), this.clientScope, new C188982(null));
    }

    public final InterfaceC27474d closePoll(String pollId) {
        AbstractC22676k.m65750j(pollId, "pollId");
        return this.api.closePoll(pollId);
    }

    public final InterfaceC27474d connectAnonymousUser() {
        return connectAnonymousUser$default(this, null, 1, null);
    }

    public final InterfaceC27474d connectGuestUser(String userId, String username) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(username, "username");
        return connectGuestUser(userId, username, null);
    }

    public final InterfaceC27474d connectUser(User user, TokenProvider tokenProvider) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(tokenProvider, "tokenProvider");
        return connectUser(user, tokenProvider, (Long) null);
    }

    @InternalStreamChatApi
    public final boolean containsStoredCredentials() {
        return this.userCredentialStorage.get() != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC27474d createChannel(String channelType, String channelId, List<String> memberIds, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(memberIds, "memberIds");
        AbstractC22676k.m65750j(extraData, "extraData");
        List<String> list = memberIds;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new MemberData((String) it.next(), null, 2, 0 == true ? 1 : 0));
        }
        return createChannel(channelType, channelId, new CreateChannelParams(arrayList, extraData));
    }

    public final InterfaceC27474d createDraftMessage(String channelType, String channelId, DraftMessage message) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(message, "message");
        DraftMessage draftMessageEnsureId = MessageUtils.ensureId(message);
        return AbstractC27476f.m82903a(AbstractC27476f.m82911i(this.api.createDraftMessage(channelType, channelId, draftMessageEnsureId), this.userScope, this.retryPolicy), this.userScope, new ChatClient$createDraftMessage$1$1(this, channelType, channelId, draftMessageEnsureId, null));
    }

    public final InterfaceC27474d createPollOption(String pollId, PollOption option) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(option, "option");
        return this.api.createPollOption(pollId, option);
    }

    public final InterfaceC27474d createReminder(String messageId, Date remindAt) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.api.createReminder(messageId, remindAt);
    }

    public final InterfaceC27474d deleteChannel(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return precondition$stream_chat_android_client_release(AbstractC27476f.m82903a(AbstractC27476f.m82904b(this.api.deleteChannel(channelType, channelId), this.userScope, new C189061(channelType, channelId, null)), this.userScope, new C189072(channelType, channelId, null)), this.plugins, new C189083(channelType, channelId, null));
    }

    public final InterfaceC27474d deleteDevice(Device device) {
        AbstractC22676k.m65750j(device, "device");
        return AbstractC27476f.m82912j(this.api.deleteDevice(device.getToken()), this.userScope, new C19089g(device, 1));
    }

    public final InterfaceC27474d deleteDraftMessages(String channelType, String channelId, DraftMessage message) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(message, "message");
        return AbstractC27476f.m82903a(AbstractC27476f.m82911i(this.api.deleteDraftMessage(channelType, channelId, message), this.userScope, this.retryPolicy), this.userScope, new C189091(channelType, channelId, message, null));
    }

    public final InterfaceC27474d deleteFile(String channelType, String channelId, String url) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(url, "url");
        return this.api.deleteFile(channelType, channelId, url);
    }

    public final InterfaceC27474d deleteImage(String channelType, String channelId, String url) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(url, "url");
        return this.api.deleteImage(channelType, channelId, url);
    }

    public final InterfaceC27474d deleteMessage(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return deleteMessage(messageId, false);
    }

    public final InterfaceC27474d deleteMessageForMe(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[deleteMessageForMe] messageId: ".concat(messageId), null);
        }
        return AbstractC27476f.m82912j(precondition$stream_chat_android_client_release(AbstractC27476f.m82903a(AbstractC27476f.m82904b(this.api.deleteMessage(messageId, false, true), this.userScope, new C189132(messageId, null)), this.userScope, new C189143(messageId, null)), this.plugins, new C189154(messageId, null)), this.userScope, new C1926a(messageId, 3));
    }

    public final InterfaceC27474d deletePoll(String pollId) {
        AbstractC22676k.m65750j(pollId, "pollId");
        return this.api.deletePoll(pollId);
    }

    public final InterfaceC27474d deletePollOption(String pollId, String optionId) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(optionId, "optionId");
        return this.api.deletePollOption(pollId, optionId);
    }

    public final InterfaceC27474d deleteReaction(String messageId, String reactionType, String cid) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(reactionType, "reactionType");
        User currentUser = getCurrentUser();
        return AbstractC27476f.m82912j(DeleteReactionErrorHandlerKt.onMessageError(precondition$stream_chat_android_client_release(AbstractC27476f.m82903a(AbstractC27476f.m82904b(AbstractC27476f.m82911i(this.api.deleteReaction(messageId, reactionType), this.userScope, this.retryPolicy), this.userScope, new C189161(cid, messageId, reactionType, currentUser, null)), this.userScope, new C189172(cid, messageId, reactionType, currentUser, null)), this.plugins, new C189183(currentUser, null)), getErrorHandlers(), cid, messageId), this.userScope, new C19004a(0, messageId, reactionType, cid));
    }

    public final InterfaceC27474d deleteReminder(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.api.deleteReminder(messageId);
    }

    public final String devToken(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        return this.tokenUtils.devToken(userId);
    }

    public final InterfaceC27474d disableSlowMode(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.api.disableSlowMode(channelType, channelId);
    }

    public final InterfaceC27474d disconnect(boolean z4) {
        return disconnect$default(this, z4, false, 2, null);
    }

    public final InterfaceC27474d disconnectSocket() {
        return new C27478h(this.userScope, new C189201(null));
    }

    public final void dismissChannelNotifications(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        this.notifications.dismissChannelNotifications(channelType, channelId);
    }

    @InternalStreamChatApi
    public final InterfaceC27474d downloadFile(String fileUrl) {
        AbstractC22676k.m65750j(fileUrl, "fileUrl");
        return this.api.downloadFile(fileUrl);
    }

    public final InterfaceC27474d editMessage(String channelType, String channelId, Message message) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(message, "message");
        return new C27478h(this.userScope, new C189241(message, this, channelType, channelId, null));
    }

    public final InterfaceC27474d enableSlowMode(String channelType, String channelId, int cooldownTimeInSeconds) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return (1 > cooldownTimeInSeconds || cooldownTimeInSeconds >= 121) ? new ErrorCall(this.userScope, new C26198a("You can't specify a value outside the range 1-120 for cooldown duration.")) : this.api.enableSlowMode(channelType, channelId, cooldownTimeInSeconds);
    }

    public final InterfaceC27474d enrichUrl(String url) {
        AbstractC22676k.m65750j(url, "url");
        return AbstractC27476f.m82903a(AbstractC27476f.m82904b(this.api.mo54539og(url), this.userScope, new C189251(url, null)), this.userScope, new C189262(url, null));
    }

    public final InterfaceC27474d fetchCurrentUser() {
        return AbstractC27476f.m82903a(new C27478h(this.userScope, new C189281(null)), this.userScope, new C189292(null));
    }

    public final InterfaceC27474d flagMessage(String messageId, String reason, Map<String, String> customData) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(customData, "customData");
        return this.api.flagMessage(messageId, reason, customData);
    }

    public final InterfaceC27474d flagUser(String userId, String reason, Map<String, String> customData) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(customData, "customData");
        return this.api.flagUser(userId, reason, customData);
    }

    public final AppSettings getAppSettings() {
        return this.appSettingsManager.getAppSettings();
    }

    public final AttachmentsSender getAttachmentsSender$stream_chat_android_client_release() {
        AttachmentsSender attachmentsSender = this.attachmentsSender;
        if (attachmentsSender != null) {
            return attachmentsSender;
        }
        AbstractC22676k.m65757q("attachmentsSender");
        throw null;
    }

    public final AudioPlayer getAudioPlayer() {
        return this.audioPlayer;
    }

    public final CDN getCdn() {
        return this.cdn;
    }

    public final InterfaceC27474d getChannel(String cid, int messageLimit, int memberLimit, boolean state) {
        AbstractC22676k.m65750j(cid, "cid");
        return new C27478h(this.userScope, new C189301(cid, messageLimit, memberLimit, this, state, null));
    }

    public final ClientState getClientState() {
        return this.clientState;
    }

    /* JADX INFO: renamed from: getConfig$stream_chat_android_client_release, reason: from getter */
    public final ChatApiConfig getConfig() {
        return this.config;
    }

    public final String getConnectionId() {
        Object objM107888l;
        try {
            objM107888l = this.chatSocket.connectionIdOrError$stream_chat_android_client_release();
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        if (objM107888l instanceof C23467m) {
            objM107888l = null;
        }
        return (String) objM107888l;
    }

    @InternalStreamChatApi
    public final String getCurrentOrStoredUserId() {
        String id4;
        User currentUser = getCurrentUser();
        if (currentUser != null && (id4 = currentUser.getId()) != null) {
            return id4;
        }
        User storedUser$stream_chat_android_client_release = getStoredUser$stream_chat_android_client_release();
        if (storedUser$stream_chat_android_client_release != null) {
            return storedUser$stream_chat_android_client_release.getId();
        }
        return null;
    }

    public final String getCurrentToken() {
        Object objM107888l;
        try {
            objM107888l = ((this.userStateService.getState$stream_chat_android_client_release() instanceof io.getstream.chat.android.client.clientstate.UserState.UserSet) && this.tokenManager.hasToken()) ? this.tokenManager.getToken() : null;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        return (String) (objM107888l instanceof C23467m ? null : objM107888l);
    }

    public final User getCurrentUser() {
        Object objM107888l;
        try {
            objM107888l = this.userStateService.getState$stream_chat_android_client_release().userOrError$stream_chat_android_client_release();
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        if (objM107888l instanceof C23467m) {
            objM107888l = null;
        }
        return (User) objM107888l;
    }

    public final InterfaceC27474d getDevices() {
        return AbstractC27476f.m82912j(this.api.getDevices(), this.userScope, new C18518b(29));
    }

    public final InterfaceC27474d getFileAttachments(String channelType, String channelId, int offset, int limit) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return getAttachments(channelType, channelId, offset, limit, "file");
    }

    public final InterfaceC27474d getGuestToken(String userId, String userName) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(userName, "userName");
        return this.api.getGuestUser(userId, userName);
    }

    public final InterfaceC27474d getImageAttachments(String channelType, String channelId, int offset, int limit) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return getAttachments(channelType, channelId, offset, limit, "image");
    }

    public final ChannelStateLogicProvider getLogicRegistry() {
        return this.logicRegistry;
    }

    public final InterfaceC27474d getMessage(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[getMessage] messageId: ".concat(messageId), null);
        }
        return AbstractC27476f.m82912j(AbstractC27476f.m82903a(this.api.getMessage(messageId), this.userScope, new C189312(messageId, null)), this.userScope, new C1926a(messageId, 2));
    }

    /* JADX INFO: renamed from: getMessageReceiptManager$stream_chat_android_client_release, reason: from getter */
    public final MessageReceiptManager getMessageReceiptManager() {
        return this.messageReceiptManager;
    }

    public final InterfaceC27474d getMessagesWithAttachments(String channelType, String channelId, int offset, int limit, List<String> types) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(types, "types");
        StringBuilder sb4 = new StringBuilder();
        sb4.append(channelType);
        return AbstractC27476f.m82909g(searchMessages$default(this, Filters.m54982in("cid", AbstractC25012a.m73376i(":", channelId, sb4)), Filters.m54980in("attachments.type", types), Integer.valueOf(offset), Integer.valueOf(limit), null, null, 48, null), new C18510t(19));
    }

    public final InterfaceC27474d getNewerReplies(String parentId, int limit, String lastId) {
        AbstractC22676k.m65750j(parentId, "parentId");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            InterfaceC2344j interfaceC2344jM7230a = logger.m7230a();
            String strM7231b = logger.m7231b();
            StringBuilder sbM30467u = AbstractC11266d.m30467u(limit, "[getNewerReplies] parentId: ", parentId, ", limit: ", ", lastId: ");
            sbM30467u.append(lastId);
            interfaceC2344jM7230a.log(enumC2341g, strM7231b, sbM30467u.toString(), null);
        }
        return AbstractC27476f.m82912j(precondition$stream_chat_android_client_release(AbstractC27476f.m82903a(AbstractC27476f.m82904b(this.api.getNewerReplies(parentId, limit, lastId), this.userScope, new C189322(parentId, limit, lastId, null)), this.userScope, new C189333(parentId, limit, lastId, null)), this.plugins, new C189344(parentId, null)), this.userScope, new C19088f(parentId, limit, lastId));
    }

    public final InterfaceC27474d getPendingMessage(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return AbstractC27476f.m82912j(this.api.getPendingMessage(messageId), this.userScope, new C1926a(messageId, 4));
    }

    public final InterfaceC27474d getPinnedMessages(String channelType, String channelId, int limit, QuerySorter<Message> sort, PinnedMessagesPagination pagination) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(sort, "sort");
        AbstractC22676k.m65750j(pagination, "pagination");
        return this.api.getPinnedMessages(channelType, channelId, limit, sort, pagination);
    }

    public final List<PluginFactory> getPluginFactories() {
        return this.pluginFactories;
    }

    public final List<Plugin> getPlugins() {
        return this.plugins;
    }

    public final InterfaceC27474d getPoll(String pollId) {
        AbstractC22676k.m65750j(pollId, "pollId");
        return this.api.getPoll(pollId);
    }

    public final InterfaceC27474d getReactions(String messageId, int offset, int limit) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.api.getReactions(messageId, offset, limit);
    }

    public final InterfaceC27474d getReplies(String messageId, int limit) {
        AbstractC22676k.m65750j(messageId, "messageId");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC25012a.m73374g(limit, "[getReplies] messageId: ", messageId, ", limit: "), null);
        }
        return AbstractC27476f.m82912j(precondition$stream_chat_android_client_release(AbstractC27476f.m82903a(AbstractC27476f.m82904b(this.api.getReplies(messageId, limit), this.userScope, new C189352(messageId, limit, null)), this.userScope, new C189363(messageId, limit, null)), this.plugins, new C189374(messageId, null)), this.userScope, new C19092i(messageId, limit));
    }

    public final InterfaceC27474d getRepliesMore(String messageId, String firstId, int limit) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(firstId, "firstId");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            InterfaceC2344j interfaceC2344jM7230a = logger.m7230a();
            String strM7231b = logger.m7231b();
            StringBuilder sbM32001t = AbstractC11895b.m32001t("[getRepliesMore] messageId: ", messageId, ", firstId: ", firstId, ", limit: ");
            sbM32001t.append(limit);
            interfaceC2344jM7230a.log(enumC2341g, strM7231b, sbM32001t.toString(), null);
        }
        return AbstractC27476f.m82912j(precondition$stream_chat_android_client_release(AbstractC27476f.m82903a(AbstractC27476f.m82904b(this.api.getRepliesMore(messageId, firstId, limit), this.userScope, new C189382(messageId, firstId, limit, null)), this.userScope, new C189393(messageId, firstId, limit, null)), this.plugins, new C189404(messageId, null)), this.userScope, new C19088f(messageId, firstId, limit));
    }

    public final RepositoryFacade getRepositoryFacade() {
        RepositoryFacade repositoryFacadeCreateRepositoryFacade;
        RepositoryFacade repositoryFacade = this._repositoryFacade;
        if (repositoryFacade != null) {
            return repositoryFacade;
        }
        User currentUser = getCurrentUser();
        if (currentUser == null) {
            currentUser = getStoredUser$stream_chat_android_client_release();
        }
        if (currentUser != null) {
            repositoryFacadeCreateRepositoryFacade = createRepositoryFacade(this.userScope, this.repositoryFactoryProvider.createRepositoryFactory(currentUser));
            this._repositoryFacade = repositoryFacadeCreateRepositoryFacade;
        } else {
            repositoryFacadeCreateRepositoryFacade = null;
        }
        return repositoryFacadeCreateRepositoryFacade == null ? createRepositoryFacade$default(this, this.userScope, null, 2, null) : repositoryFacadeCreateRepositoryFacade;
    }

    /* JADX INFO: renamed from: getRetryPolicy$stream_chat_android_client_release, reason: from getter */
    public final InterfaceC30894d getRetryPolicy() {
        return this.retryPolicy;
    }

    public final ServerClockOffset getServerClockOffset() {
        return this.serverClockOffset;
    }

    public final User getStoredUser$stream_chat_android_client_release() {
        CredentialConfig credentialConfig = this.userCredentialStorage.get();
        if (credentialConfig == null) {
            return null;
        }
        return new User(credentialConfig.getUserId(), null, credentialConfig.getUserName(), null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, 33554426, null);
    }

    public final InterfaceC27474d getSyncHistory(List<String> channelsIds, Date lastSyncAt) {
        AbstractC22676k.m65750j(channelsIds, "channelsIds");
        AbstractC22676k.m65750j(lastSyncAt, "lastSyncAt");
        return AbstractC27476f.m82914l(this.api.getSyncHistory(channelsIds, this.streamDateFormatter.format(lastSyncAt)), this.userScope, new C189411(channelsIds, lastSyncAt, null));
    }

    public final InterfaceC27474d getThread(String messageId, GetThreadOptions options) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(options, "options");
        return this.api.getThread(messageId, options);
    }

    public final InterfaceC27474d getUnreadCounts() {
        return this.api.getUnreadCounts();
    }

    public final InterfaceC27474d hideChannel(String channelType, String channelId, boolean clearHistory) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            InterfaceC2344j interfaceC2344jM7230a = logger.m7230a();
            String strM7231b = logger.m7231b();
            StringBuilder sbM32001t = AbstractC11895b.m32001t("[hideChannel] cid: ", channelType, ":", channelId, ", clearHistory: ");
            sbM32001t.append(clearHistory);
            interfaceC2344jM7230a.log(enumC2341g, strM7231b, sbM32001t.toString(), null);
        }
        return AbstractC27476f.m82912j(precondition$stream_chat_android_client_release(AbstractC27476f.m82903a(AbstractC27476f.m82904b(this.api.hideChannel(channelType, channelId, clearHistory), this.userScope, new C189442(channelType, channelId, clearHistory, null)), this.userScope, new C189453(channelType, channelId, clearHistory, null)), this.plugins, new C189464(channelType, channelId, clearHistory, null)), this.userScope, new C3433d0(channelType, channelId, clearHistory, 7));
    }

    @InternalStreamChatApi
    public final InterfaceC2994c0 inheritScope(Function1 block) {
        AbstractC22676k.m65750j(block, "block");
        if (this.userScope.getUserId().getValue() == null) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
                logger.m7230a().log(enumC2341g, logger.m7231b(), "[inheritScope] userId is null", null);
            }
            this.clientDebugger.onNonFatalErrorOccurred(TAG, "inheritScope", "ChatClient::connectUser() must be called before inheriting scope", new C26198a("userScope.userId.value is null"));
        }
        UserScope userScope = this.userScope;
        return AbstractC3006f0.m8696B(userScope, (InterfaceC30063j) block.invoke(AbstractC3006f0.m8725s(userScope.getCoroutineContext())));
    }

    public final InterfaceC27474d inviteMembers(String channelType, String channelId, List<String> memberIds, Message systemMessage, Boolean skipPush) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(memberIds, "memberIds");
        return this.api.inviteMembers(channelType, channelId, memberIds, systemMessage, skipPush);
    }

    public final boolean isSocketConnected() {
        return this.chatSocket.isConnected$stream_chat_android_client_release();
    }

    public final InterfaceC27474d keystroke(String channelType, String channelId, String parentId) {
        PrivacySettings privacySettings;
        TypingIndicators typingIndicators;
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        User user = (User) ((C13045h2) this.clientState.getUser()).getValue();
        if (user == null || (privacySettings = user.getPrivacySettings()) == null || (typingIndicators = privacySettings.getTypingIndicators()) == null || typingIndicators.getEnabled()) {
            Map<Object, ? extends Object> mapM95645u = parentId != null ? AbstractC31061c.m95645u(ARG_TYPING_PARENT_ID, parentId) : C25272z.f99163w;
            Date date = (Date) this.now.invoke();
            return AbstractC27476f.m82912j(precondition$stream_chat_android_client_release(AbstractC27476f.m82903a(AbstractC27476f.m82904b(this.api.sendEvent(EventType.TYPING_START, channelType, channelId, mapM95645u), this.userScope, new C189472(EventType.TYPING_START, channelType, channelId, mapM95645u, date, null)), this.userScope, new C189483(EventType.TYPING_START, channelType, channelId, mapM95645u, date, null)), this.plugins, new C189494(EventType.TYPING_START, channelType, channelId, mapM95645u, date, null)), this.userScope, new C19004a(1, channelType, channelId, parentId));
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[keystroke] rejected (typing indicators are disabled)", null);
        }
        return new ErrorCall(this.userScope, new C26198a("Typing indicators are disabled for the current user."));
    }

    public final InterfaceC3027k1 launch$stream_chat_android_client_release(InterfaceC4351m block) {
        AbstractC22676k.m65750j(block, "block");
        return AbstractC3006f0.m8732z(this.userScope, null, null, block, 3);
    }

    public final InterfaceC27474d markAllRead() {
        return AbstractC27476f.m82912j(AbstractC27476f.m82903a(AbstractC27476f.m82904b(this.api.markAllRead(), this.userScope, new C189501(null)), this.userScope, new C189512(null)), this.userScope, new C19383k(0));
    }

    public final InterfaceC27474d markMessageAsDelivered(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return AbstractC27476f.m82903a(AbstractC27476f.m82904b(new C27478h(this.userScope, new C189521(messageId, null)), this.userScope, new C189532(messageId, null)), this.userScope, new C189543(messageId, null));
    }

    public final InterfaceC27474d markMessageRead(String channelType, String channelId, String messageId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(messageId, "messageId");
        return AbstractC27476f.m82903a(AbstractC27476f.m82904b(this.api.markRead(channelType, channelId, messageId), this.userScope, new C189551(channelType, channelId, messageId, null)), this.userScope, new C189562(channelType, channelId, messageId, null));
    }

    public final InterfaceC27474d markRead(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return AbstractC27476f.m82912j(AbstractC27476f.m82903a(AbstractC27476f.m82904b(precondition$stream_chat_android_client_release(ChatApi.markRead$default(this.api, channelType, channelId, null, 4, null), this.plugins, new C189571(channelType, channelId, null)), this.userScope, new C189582(channelType, channelId, null)), this.userScope, new C189593(channelType, channelId, null)), this.userScope, new C17841d(11, channelType, channelId));
    }

    public final InterfaceC27474d markThreadRead(String channelType, String channelId, String threadId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(threadId, "threadId");
        return this.api.markThreadRead(channelType, channelId, threadId);
    }

    public final InterfaceC27474d markThreadUnread(String channelType, String channelId, String threadId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(threadId, "threadId");
        return ChatApi.markUnread$default(this.api, channelType, channelId, null, null, threadId, 12, null);
    }

    public final InterfaceC27474d markUnread(String channelType, String channelId, String messageId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(messageId, "messageId");
        return ChatApi.markUnread$default(this.api, channelType, channelId, messageId, null, null, 24, null);
    }

    public final InterfaceC27474d muteChannel(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return muteChannel(channelType, channelId, null);
    }

    public final InterfaceC27474d muteCurrentUser() {
        return this.api.muteCurrentUser();
    }

    public final InterfaceC27474d muteUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        return muteUser(userId, null);
    }

    public final InterfaceC27474d partialUpdateMember(String channelType, String channelId, String userId, Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return this.api.partialUpdateMember(channelType, channelId, userId, set, unset);
    }

    public final InterfaceC27474d partialUpdateMessage(String messageId, Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return AbstractC27476f.m82903a(ChatApi.partialUpdateMessage$default(this.api, messageId, set, unset, false, 8, null), this.userScope, new C189601(null));
    }

    public final InterfaceC27474d partialUpdatePoll(String pollId, Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return this.api.partialUpdatePoll(pollId, set, unset);
    }

    public final InterfaceC27474d partialUpdateThread(String messageId, Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return this.api.partialUpdateThread(messageId, set, unset);
    }

    public final InterfaceC27474d partialUpdateUser(String id4, Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        User currentUser = getCurrentUser();
        if (id4.equals(currentUser != null ? currentUser.getId() : null)) {
            return AbstractC27476f.m82907e(this.api.partialUpdateUser(id4, set, unset), new C16574h(18, this, id4));
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "The client-side partial update allows you to update only the current user. Make sure the user is set before updating it.", null);
        }
        return new ErrorCall(this.userScope, new C26198a("The client-side partial update allows you to update only the current user. Make sure the user is set before updating it."));
    }

    public final InterfaceC27474d pinChannel(String channelType, String channelId) {
        String id4;
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC31061c.m95640p("[pinChannel] channelType: ", channelType, ", channelId: ", channelId), null);
        }
        Map mapM114688p = AbstractC36095b.m114688p(Boolean.TRUE, "pinned");
        User currentUser = getCurrentUser();
        if (currentUser == null || (id4 = currentUser.getId()) == null) {
            id4 = "";
        }
        return partialUpdateMember$default(this, channelType, channelId, id4, mapM114688p, null, 16, null);
    }

    public final InterfaceC27474d pinMessage(Message message, Date expirationDate) {
        AbstractC22676k.m65750j(message, "message");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            InterfaceC2344j interfaceC2344jM7230a = logger.m7230a();
            String strM7231b = logger.m7231b();
            StringBuilder sbM32001t = AbstractC11895b.m32001t("[pinMessage] message: Message(id=", message.getId(), ", text=", message.getText(), "), expirationDate: ");
            sbM32001t.append(expirationDate);
            interfaceC2344jM7230a.log(enumC2341g, strM7231b, sbM32001t.toString(), null);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("pinned", Boolean.TRUE);
        if (expirationDate != null) {
            linkedHashMap.put("pin_expires", expirationDate);
        }
        return partialUpdateMessage$default(this, message.getId(), linkedHashMap, null, 4, null);
    }

    public final <R, T> InterfaceC27474d precondition$stream_chat_android_client_release(InterfaceC27474d interfaceC27474d, List<? extends R> pluginsList, InterfaceC4351m preconditionCheck) {
        AbstractC22676k.m65750j(interfaceC27474d, "<this>");
        AbstractC22676k.m65750j(pluginsList, "pluginsList");
        AbstractC22676k.m65750j(preconditionCheck, "preconditionCheck");
        return AbstractC27476f.m82914l(interfaceC27474d, this.userScope, new ChatClient$precondition$1(pluginsList, preconditionCheck, null));
    }

    public final InterfaceC27474d queryActiveLocations() {
        return AbstractC27476f.m82903a(this.api.queryActiveLocations(), this.userScope, new C189611(null));
    }

    public final InterfaceC27474d queryBannedUsers(FilterObject filter) {
        AbstractC22676k.m65750j(filter, "filter");
        return queryBannedUsers$default(this, filter, null, null, null, null, null, null, null, 254, null);
    }

    public final InterfaceC27474d queryBlockedUsers() {
        return AbstractC27476f.m82903a(this.api.queryBlockedUsers(), this.userScope, new C189621(null));
    }

    public final InterfaceC27474d queryChannel(String channelType, String channelId, QueryChannelRequest request, boolean skipOnRequest) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(request, "request");
        return AbstractC27476f.m82912j(precondition$stream_chat_android_client_release(AbstractC27476f.m82903a(AbstractC27476f.m82904b(this.api.queryChannel(channelType, channelId, request), this.userScope, new C189631(skipOnRequest, channelType, channelId, request, null)), this.userScope, new C189642(channelType, channelId, request, null)), this.plugins, new C189653(channelType, channelId, request, null)), this.userScope, new C19073c(channelType, channelId, request, 1));
    }

    public final InterfaceC27474d queryChannels(QueryChannelsRequest request) {
        AbstractC22676k.m65750j(request, "request");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC2875y.m8294g(request.getOffset(), request.getLimit(), "[queryChannels] offset: ", ", limit: "), null);
        }
        return AbstractC27476f.m82912j(AbstractC27476f.m82909g(precondition$stream_chat_android_client_release(AbstractC27476f.m82903a(AbstractC27476f.m82904b(this.api.queryChannels(request), this.userScope, new C189662(request, null)), this.userScope, new C189673(request, null)), this.plugins, new C189684(request, null)), new C18510t(21)), this.userScope, new C16587n0(request, 22));
    }

    @InternalStreamChatApi
    public final InterfaceC27474d queryChannelsInternal(QueryChannelsRequest request) {
        AbstractC22676k.m65750j(request, "request");
        return this.api.queryChannels(request);
    }

    public final InterfaceC27474d queryDrafts(FilterObject filter, int limit, String next, QuerySorter<DraftsSort> sort) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        return AbstractC27476f.m82903a(AbstractC27476f.m82911i(this.api.queryDrafts(filter, Integer.valueOf(limit), next, sort), this.userScope, this.retryPolicy), this.userScope, new C189691(filter, limit, next, sort, null));
    }

    public final InterfaceC27474d queryMembers(final String channelType, final String channelId, final int offset, final int limit, final FilterObject filter, final QuerySorter<Member> sort, final List<Member> members) {
        int i13;
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        AbstractC22676k.m65750j(members, "members");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            InterfaceC2344j interfaceC2344jM7230a = logger.m7230a();
            String strM7231b = logger.m7231b();
            StringBuilder sbM32001t = AbstractC11895b.m32001t("[queryMembers] cid: ", channelType, ":", channelId, ", offset: ");
            sbM32001t.append(offset);
            sbM32001t.append(", limit: ");
            i13 = limit;
            sbM32001t.append(i13);
            interfaceC2344jM7230a.log(enumC2341g, strM7231b, sbM32001t.toString(), null);
        } else {
            i13 = limit;
        }
        return AbstractC27476f.m82912j(QueryMembersErrorHandlerKt.onQueryMembersError(AbstractC27476f.m82903a(this.api.queryMembers(channelType, channelId, offset, i13, filter, sort, members), this.userScope, new C189702(channelType, channelId, offset, limit, filter, sort, members, null)), getErrorHandlers(), channelType, channelId, offset, limit, filter, sort, members), this.userScope, new InterfaceC4339a() { // from class: io.getstream.chat.android.client.j
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                ChatClient.Companion companion = ChatClient.INSTANCE;
                return Integer.valueOf(IdentifiersKt.QueryMembersIdentifier(channelType, channelId, offset, limit, filter, sort, members));
            }
        });
    }

    public final InterfaceC27474d queryPollVotes(String pollId, FilterObject filter, Integer limit, String next, QuerySorter<Vote> sort) {
        AbstractC22676k.m65750j(pollId, "pollId");
        return this.api.queryPollVotes(pollId, filter, limit, next, sort);
    }

    public final InterfaceC27474d queryPolls(FilterObject filter, Integer limit, String next, QuerySorter<Poll> sort) {
        return this.api.queryPolls(filter, limit, next, sort);
    }

    public final InterfaceC27474d queryReactions(String messageId, FilterObject filter, Integer limit, String next, QuerySorter<Reaction> sort) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.api.queryReactions(messageId, filter, limit, next, sort);
    }

    public final InterfaceC27474d queryReminders(FilterObject filter, int limit, String next, QuerySorter<MessageReminder> sort) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        return this.api.queryReminders(filter, limit, next, sort);
    }

    public final InterfaceC27474d queryThreads(QueryThreadsRequest query) {
        AbstractC22676k.m65750j(query, "query");
        return precondition$stream_chat_android_client_release(AbstractC27476f.m82903a(AbstractC27476f.m82904b(this.api.queryThreads(query), this.userScope, new C189711(query, null)), this.userScope, new C189722(query, null)), this.plugins, new C189733(query, null));
    }

    public final InterfaceC27474d queryUsers(QueryUsersRequest query) {
        AbstractC22676k.m65750j(query, "query");
        return this.api.queryUsers(query);
    }

    public final InterfaceC27474d reconnectSocket() {
        return new C27478h(this.userScope, new C189741(null));
    }

    public final InterfaceC27474d rejectInvite(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.api.rejectInvite(channelType, channelId);
    }

    public final InterfaceC27474d removeMembers(String channelType, String channelId, List<String> memberIds, Message systemMessage, Boolean skipPush) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(memberIds, "memberIds");
        return this.api.removeMembers(channelType, channelId, memberIds, systemMessage, skipPush);
    }

    public final InterfaceC27474d removePollVote(String messageId, String pollId, String voteId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(voteId, "voteId");
        return this.api.removePollVote(messageId, pollId, voteId);
    }

    public final InterfaceC27474d removeShadowBan(String targetId, String channelType, String channelId) {
        AbstractC22676k.m65750j(targetId, "targetId");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return AbstractC27476f.m82913k(this.api.unbanUser(targetId, channelType, channelId, true));
    }

    public final void removeSocketListener(SocketListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.chatSocket.removeListener(listener);
    }

    @InternalStreamChatApi
    public final <DR extends DependencyResolver, T> T resolveDependency() throws IllegalStateException {
        C2343i c2343i = C2343i.f9269a;
        if (C2343i.f9272d.isLoggable(EnumC2341g.DEBUG, TAG)) {
            AbstractC22676k.m65756p();
            throw null;
        }
        AbstractC22676k.m65756p();
        throw null;
    }

    @InternalStreamChatApi
    public final <F extends DependencyResolver, T> T resolveFactoryDependency() throws IllegalStateException {
        C2343i c2343i = C2343i.f9269a;
        if (C2343i.f9272d.isLoggable(EnumC2341g.VERBOSE, TAG)) {
            AbstractC22676k.m65756p();
            throw null;
        }
        Iterator<T> it = this.pluginFactories.iterator();
        if (!it.hasNext()) {
            AbstractC22676k.m65756p();
            throw null;
        }
        AbstractC22676k.m65756p();
        throw null;
    }

    @InternalStreamChatApi
    public final <P extends DependencyResolver, T> T resolvePluginDependency() throws IllegalStateException, InterruptedException {
        C2343i c2343i = C2343i.f9269a;
        if (C2343i.f9272d.isLoggable(EnumC2341g.VERBOSE, TAG)) {
            AbstractC22676k.m65756p();
            throw null;
        }
        List<? extends Plugin> list = this.plugins;
        InitializationState initializationStateAwaitInitializationState = awaitInitializationState(10000L);
        if (initializationStateAwaitInitializationState == InitializationState.COMPLETE) {
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                AbstractC22676k.m65756p();
                throw null;
            }
            AbstractC22676k.m65756p();
            throw null;
        }
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
            C2343i.f9271c.log(enumC2341g, TAG, "[resolvePluginDependency] failed (initializationState is not COMPLETE): " + initializationStateAwaitInitializationState + " ", null);
        }
        throw new IllegalStateException("ChatClient::connectUser() must be called before resolving any dependency");
    }

    public final InterfaceC27474d searchMessages(FilterObject channelFilter, FilterObject messageFilter, Integer offset, Integer limit, String next, QuerySorter<Message> sort) {
        AbstractC22676k.m65750j(channelFilter, "channelFilter");
        AbstractC22676k.m65750j(messageFilter, "messageFilter");
        return (offset == null || next == null) ? this.api.searchMessages(channelFilter, messageFilter, offset, limit, next, sort) : new ErrorCall(this.userScope, new C26198a("Cannot use both offset and next values. Specify only one of these options."));
    }

    public final InterfaceC27474d sendAction(SendActionRequest request) {
        AbstractC22676k.m65750j(request, "request");
        return this.api.sendAction(request);
    }

    public final InterfaceC27474d sendEvent(String eventType, String channelType, String channelId, Map<Object, ? extends Object> extraData) {
        AbstractC22676k.m65750j(eventType, "eventType");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(extraData, "extraData");
        return this.api.sendEvent(eventType, channelType, channelId, extraData);
    }

    public final InterfaceC27474d sendFile(String channelType, String channelId, File file) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(file, "file");
        return sendFile(channelType, channelId, file, null);
    }

    public final InterfaceC27474d sendGiphy(Message message) {
        AbstractC22676k.m65750j(message, "message");
        SendActionRequest sendActionRequest = new SendActionRequest(message.getCid(), message.getId(), message.getType(), AbstractC31061c.m95645u(KEY_MESSAGE_ACTION, MESSAGE_ACTION_SEND));
        return AbstractC27476f.m82912j(AbstractC27476f.m82903a(AbstractC27476f.m82911i(sendAction(sendActionRequest), this.userScope, this.retryPolicy), this.userScope, new C189761(message, null)), this.userScope, new C19087e(sendActionRequest, 1));
    }

    public final InterfaceC27474d sendImage(String channelType, String channelId, File file) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(file, "file");
        return sendImage(channelType, channelId, file, null);
    }

    public final InterfaceC27474d sendMessage(String channelType, String channelId, Message message, boolean isRetrying) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(message, "message");
        Message messageEnsureId = MessageUtils.ensureId(message);
        return AbstractC27476f.m82912j(new C27478h(this.userScope, new C189771(messageEnsureId, channelType, channelId, isRetrying, null)), this.userScope, new C18656a0(1, channelId, messageEnsureId, channelType));
    }

    public final InterfaceC27474d sendPoll(String channelType, String channelId, CreatePollParams createPollParams) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(createPollParams, "createPollParams");
        return AbstractC27476f.m82907e(this.api.createPoll(createPollParams), new C18468h(this, channelType, channelId, 6));
    }

    public final InterfaceC27474d sendReaction(Reaction reaction, boolean z4) {
        AbstractC22676k.m65750j(reaction, "reaction");
        return sendReaction$default(this, reaction, z4, null, false, 12, null);
    }

    public final InterfaceC27474d sendStaticLocation(String cid, double latitude, double longitude, String deviceId) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(deviceId, "deviceId");
        return sendLocationMessage(new Location(cid, null, null, null, latitude, longitude, deviceId, 14, null));
    }

    public final void setAttachmentsSender$stream_chat_android_client_release(AttachmentsSender attachmentsSender) {
        AbstractC22676k.m65750j(attachmentsSender, "<set-?>");
        this.attachmentsSender = attachmentsSender;
    }

    public final InterfaceC27474d setChannelPushPreference(String cid, PushPreferenceLevel level) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(level, "level");
        return AbstractC27476f.m82903a(this.api.setChannelPushPreference(cid, level), this.userScope, new C189811(cid, level, null));
    }

    public final void setLogicRegistry(ChannelStateLogicProvider channelStateLogicProvider) {
        this.logicRegistry = channelStateLogicProvider;
    }

    public final void setPlugins(List<? extends Plugin> list) {
        AbstractC22676k.m65750j(list, "<set-?>");
        this.plugins = list;
    }

    @InternalStreamChatApi
    public final void setPushNotificationReceivedListener(PushNotificationReceivedListener pushNotificationReceivedListener) {
        AbstractC22676k.m65750j(pushNotificationReceivedListener, "pushNotificationReceivedListener");
        this.pushNotificationReceivedListener = pushNotificationReceivedListener;
    }

    public final InterfaceC27474d setUserPushPreference(PushPreferenceLevel level) {
        AbstractC22676k.m65750j(level, "level");
        return AbstractC27476f.m82903a(this.api.setUserPushPreference(level), this.userScope, new C189831(null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: setUserWithoutConnectingIfNeeded$stream_chat_android_client_release */
    public final Object m54536xe26c02ca(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        ChatClient$setUserWithoutConnectingIfNeeded$1 chatClient$setUserWithoutConnectingIfNeeded$1;
        if (interfaceC30057d instanceof ChatClient$setUserWithoutConnectingIfNeeded$1) {
            chatClient$setUserWithoutConnectingIfNeeded$1 = (ChatClient$setUserWithoutConnectingIfNeeded$1) interfaceC30057d;
            int i13 = chatClient$setUserWithoutConnectingIfNeeded$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                chatClient$setUserWithoutConnectingIfNeeded$1.label = i13 - Integer.MIN_VALUE;
            } else {
                chatClient$setUserWithoutConnectingIfNeeded$1 = new ChatClient$setUserWithoutConnectingIfNeeded$1(this, interfaceC30057d);
            }
        } else {
            chatClient$setUserWithoutConnectingIfNeeded$1 = new ChatClient$setUserWithoutConnectingIfNeeded$1(this, interfaceC30057d);
        }
        Object obj = chatClient$setUserWithoutConnectingIfNeeded$1.result;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = chatClient$setUserWithoutConnectingIfNeeded$1.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (((C13045h2) this.clientState.getInitializationState()).getValue() == InitializationState.INITIALIZING) {
                chatClient$setUserWithoutConnectingIfNeeded$1.label = 1;
                if (AbstractC3034m0.m8782b(100L, chatClient$setUserWithoutConnectingIfNeeded$1) != obj2) {
                }
            }
            if (isUserSet() || ((C13045h2) this.clientState.getInitializationState()).getValue() == InitializationState.COMPLETE) {
                C2345k logger = getLogger();
                InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
                    logger.m7230a().log(enumC2341g, logger.m7231b(), "[setUserWithoutConnectingIfNeeded] User is already set: " + isUserSet() + " Initialization state: " + ((C13045h2) this.clientState.getInitializationState()).getValue(), null);
                }
            } else {
                CredentialConfig credentialConfig = this.userCredentialStorage.get();
                if (credentialConfig != null) {
                    TokenProvider tokenProvider = this.config.getNotificationConfig().getTokenProvider();
                    User user = new User(credentialConfig.getUserId(), null, credentialConfig.getUserName(), null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, 33554426, null);
                    if (tokenProvider == null) {
                        tokenProvider = new ConstantTokenProvider(credentialConfig.getUserToken());
                    }
                    initializeClientWithUser(user, new CacheableTokenProvider(tokenProvider), credentialConfig.getIsAnonymous());
                    return c23454a0;
                }
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return c23454a0;
        }
        AbstractC34132o.m107864I(obj);
        chatClient$setUserWithoutConnectingIfNeeded$1.label = 2;
        return m54536xe26c02ca(chatClient$setUserWithoutConnectingIfNeeded$1) == obj2 ? obj2 : c23454a0;
    }

    public final InterfaceC27474d shadowBanUser(String targetId, String channelType, String channelId, String reason, Integer timeout) {
        AbstractC22676k.m65750j(targetId, "targetId");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return AbstractC27476f.m82913k(this.api.banUser(targetId, timeout, reason, channelType, channelId, true));
    }

    public final InterfaceC27474d showChannel(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.api.showChannel(channelType, channelId);
    }

    public final InterfaceC27474d shuffleGiphy(Message message) {
        AbstractC22676k.m65750j(message, "message");
        SendActionRequest sendActionRequest = new SendActionRequest(message.getCid(), message.getId(), message.getType(), AbstractC31061c.m95645u(KEY_MESSAGE_ACTION, MESSAGE_ACTION_SHUFFLE));
        return AbstractC27476f.m82912j(AbstractC27476f.m82903a(AbstractC27476f.m82911i(sendAction(sendActionRequest), this.userScope, this.retryPolicy), this.userScope, new C189841(message, null)), this.userScope, new C19087e(sendActionRequest, 0));
    }

    public final InterfaceC27474d snoozeChannelPushNotifications(String cid, Date until) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(until, "until");
        return AbstractC27476f.m82903a(this.api.snoozeChannelPushNotifications(cid, until), this.userScope, new C189851(cid, until, null));
    }

    public final InterfaceC27474d snoozeUserPushNotifications(Date until) {
        AbstractC22676k.m65750j(until, "until");
        return AbstractC27476f.m82903a(this.api.snoozeUserPushNotifications(until), this.userScope, new C189861(null));
    }

    public final InterfaceC27474d startLiveLocationSharing(String cid, double latitude, double longitude, String deviceId, Date endAt) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(deviceId, "deviceId");
        AbstractC22676k.m65750j(endAt, "endAt");
        Location location = new Location(cid, null, null, endAt, latitude, longitude, deviceId, 6, null);
        return AbstractC27476f.m82903a(sendLocationMessage(location), this.userScope, new ChatClient$startLiveLocationSharing$1$1(this, location, null));
    }

    public final InterfaceC27474d stopLiveLocationSharing(String messageId, String deviceId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(deviceId, "deviceId");
        Location location = new Location(null, messageId, null, (Date) this.now.invoke(), 0.0d, 0.0d, deviceId, 53, null);
        return AbstractC27476f.m82903a(this.api.stopLiveLocation(location), this.userScope, new ChatClient$stopLiveLocationSharing$1$1(this, location, null));
    }

    public final InterfaceC27474d stopTyping(String channelType, String channelId, String parentId) {
        PrivacySettings privacySettings;
        TypingIndicators typingIndicators;
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        User user = (User) ((C13045h2) this.clientState.getUser()).getValue();
        if (user == null || (privacySettings = user.getPrivacySettings()) == null || (typingIndicators = privacySettings.getTypingIndicators()) == null || typingIndicators.getEnabled()) {
            Map<Object, ? extends Object> mapM95645u = parentId != null ? AbstractC31061c.m95645u(ARG_TYPING_PARENT_ID, parentId) : C25272z.f99163w;
            Date date = (Date) this.now.invoke();
            return AbstractC27476f.m82912j(precondition$stream_chat_android_client_release(AbstractC27476f.m82903a(AbstractC27476f.m82904b(this.api.sendEvent(EventType.TYPING_STOP, channelType, channelId, mapM95645u), this.userScope, new C189872(EventType.TYPING_STOP, channelType, channelId, mapM95645u, date, null)), this.userScope, new C189883(EventType.TYPING_STOP, channelType, channelId, mapM95645u, date, null)), this.plugins, new C189894(EventType.TYPING_STOP, channelType, channelId, mapM95645u, date, null)), this.userScope, new C19004a(2, channelType, channelId, parentId));
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[stopTyping] rejected (typing indicators are disabled)", null);
        }
        return new ErrorCall(this.userScope, new C26198a("Typing indicators are disabled for the current user."));
    }

    public final InterfaceC27474d stopWatching(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.api.stopWatching(channelType, channelId);
    }

    public final Disposable subscribe(ChatEventListener<ChatEvent> listener) {
        AbstractC22676k.m65750j(listener, "listener");
        return ChatEventsObservable.subscribe$default(this.eventsObservable, null, listener, 1, null);
    }

    public final Disposable subscribeFor(String[] eventTypes, ChatEventListener<ChatEvent> listener) {
        AbstractC22676k.m65750j(eventTypes, "eventTypes");
        AbstractC22676k.m65750j(listener, "listener");
        return this.eventsObservable.subscribe(new C17095c(eventTypes, 11), listener);
    }

    public final Disposable subscribeForSingle(String eventType, ChatEventListener<ChatEvent> listener) {
        AbstractC22676k.m65750j(eventType, "eventType");
        AbstractC22676k.m65750j(listener, "listener");
        return this.eventsObservable.subscribeSingle(new C17632d(eventType, 3), listener);
    }

    public final InterfaceC27474d switchUser(User user, TokenProvider tokenProvider) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(tokenProvider, "tokenProvider");
        return switchUser$default(this, user, tokenProvider, (Long) null, (InterfaceC4339a) null, 12, (Object) null);
    }

    public final InterfaceC27474d translate(String messageId, String language) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(language, "language");
        return this.api.translate(messageId, language);
    }

    public final InterfaceC27474d truncateChannel(String channelType, String channelId, Message systemMessage) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.api.truncateChannel(channelType, channelId, systemMessage);
    }

    public final InterfaceC27474d unarchiveChannel(String channelType, String channelId) {
        String id4;
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC31061c.m95640p("[unarchiveChannel]channelType: ", channelType, ", channelId: ", channelId), null);
        }
        User currentUser = getCurrentUser();
        if (currentUser == null || (id4 = currentUser.getId()) == null) {
            id4 = "";
        }
        return partialUpdateMember$default(this, channelType, channelId, id4, null, AbstractC37056f.m118958J("archived"), 8, null);
    }

    public final InterfaceC27474d unbanUser(String targetId, String channelType, String channelId) {
        AbstractC22676k.m65750j(targetId, "targetId");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return AbstractC27476f.m82913k(this.api.unbanUser(targetId, channelType, channelId, false));
    }

    public final InterfaceC27474d unblockUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        return AbstractC27476f.m82903a(this.api.unblockUser(userId), this.userScope, new C189931(userId, null));
    }

    public final InterfaceC27474d unflagMessage(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.api.unflagMessage(messageId);
    }

    public final InterfaceC27474d unflagUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        return this.api.unflagUser(userId);
    }

    public final InterfaceC27474d unmuteChannel(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.api.unmuteChannel(channelType, channelId);
    }

    public final InterfaceC27474d unmuteCurrentUser() {
        return this.api.unmuteCurrentUser();
    }

    public final InterfaceC27474d unmuteUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        return this.api.unmuteUser(userId);
    }

    public final InterfaceC27474d unpinChannel(String channelType, String channelId) {
        String id4;
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC31061c.m95640p("[unpinChannel] channelType: ", channelType, ", channelId: ", channelId), null);
        }
        User currentUser = getCurrentUser();
        if (currentUser == null || (id4 = currentUser.getId()) == null) {
            id4 = "";
        }
        return partialUpdateMember$default(this, channelType, channelId, id4, null, AbstractC37056f.m118958J("pinned"), 8, null);
    }

    public final InterfaceC27474d unpinMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC2875y.m8300m("[unpinMessage] message: Message(text=", message.getText(), ", id=", message.getId(), ")"), null);
        }
        return partialUpdateMessage$default(this, message.getId(), AbstractC36095b.m114688p(Boolean.FALSE, "pinned"), null, 4, null);
    }

    public final InterfaceC27474d updateChannel(String channelType, String channelId, Message updateMessage, Map<String, ? extends Object> channelExtraData) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(channelExtraData, "channelExtraData");
        return this.api.updateChannel(channelType, channelId, channelExtraData, updateMessage);
    }

    public final InterfaceC27474d updateChannelPartial(String channelType, String channelId, Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return this.api.updateChannelPartial(channelType, channelId, set, unset);
    }

    public final InterfaceC27474d updateLiveLocation(String messageId, double latitude, double longitude, String deviceId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(deviceId, "deviceId");
        Location location = new Location(null, messageId, null, null, latitude, longitude, deviceId, 13, null);
        return AbstractC27476f.m82903a(precondition$stream_chat_android_client_release(this.api.updateLiveLocation(location), this.plugins, new ChatClient$updateLiveLocation$1$1(location, null)), this.userScope, new ChatClient$updateLiveLocation$1$2(this, location, null));
    }

    public final InterfaceC27474d updateMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        return AbstractC27476f.m82912j(AbstractC27476f.m82903a(AbstractC27476f.m82904b(this.api.updateMessage(message), this.userScope, new C189941(message, null)), this.userScope, new C189952(message, null)), this.userScope, new C16587n0(message, 23));
    }

    public final InterfaceC27474d updatePoll(UpdatePollRequest poll) {
        AbstractC22676k.m65750j(poll, "poll");
        return this.api.updatePoll(poll);
    }

    public final InterfaceC27474d updatePollOption(String pollId, PollOption option) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(option, "option");
        return this.api.updatePollOption(pollId, option);
    }

    public final InterfaceC27474d updateReminder(String messageId, Date remindAt) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.api.updateReminder(messageId, remindAt);
    }

    public final InterfaceC27474d updateUser(User user) {
        AbstractC22676k.m65750j(user, "user");
        return AbstractC27476f.m82909g(updateUsers(AbstractC37056f.m118958J(user)), new C18510t(22));
    }

    public final InterfaceC27474d updateUsers(List<User> users) {
        AbstractC22676k.m65750j(users, "users");
        return this.api.updateUsers(users);
    }

    public final InterfaceC27474d uploadFile(File file) {
        AbstractC22676k.m65750j(file, "file");
        return uploadFile(file, null);
    }

    public final InterfaceC27474d uploadImage(File file) {
        AbstractC22676k.m65750j(file, "file");
        return uploadImage(file, null);
    }

    public static /* synthetic */ InterfaceC27474d connectUser$default(ChatClient chatClient, User user, String str, Long l7, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            l7 = null;
        }
        return chatClient.connectUser(user, str, l7);
    }

    public static /* synthetic */ InterfaceC27474d getChannel$default(ChatClient chatClient, String str, String str2, int i13, int i14, boolean z4, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            i13 = 0;
        }
        if ((i15 & 8) != 0) {
            i14 = 0;
        }
        if ((i15 & 16) != 0) {
            z4 = false;
        }
        return chatClient.getChannel(str, str2, i13, i14, z4);
    }

    public final ChannelClient channel(String cid) {
        AbstractC22676k.m65750j(cid, "cid");
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(cid);
        return channel((String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x);
    }

    public final InterfaceC27474d connectAnonymousUser(Long timeoutMilliseconds) {
        return new C27478h(this.clientScope, new C188991(timeoutMilliseconds, null));
    }

    public final InterfaceC27474d connectGuestUser(String userId, String username, Long timeoutMilliseconds) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(username, "username");
        return new C27478h(this.clientScope, new C189001(userId, username, timeoutMilliseconds, null));
    }

    public final InterfaceC27474d connectUser(User user, TokenProvider tokenProvider, Long timeoutMilliseconds) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(tokenProvider, "tokenProvider");
        return AbstractC27476f.m82912j(new C27478h(this.clientScope, new C189011(user, tokenProvider, timeoutMilliseconds, null)), this.clientScope, new C16587n0(user, 21));
    }

    public final InterfaceC27474d deleteFile(String url) {
        AbstractC22676k.m65750j(url, "url");
        return this.api.deleteFile(url);
    }

    public final InterfaceC27474d deleteImage(String url) {
        AbstractC22676k.m65750j(url, "url");
        return this.api.deleteImage(url);
    }

    public final InterfaceC27474d deleteMessage(String messageId, boolean hard) {
        AbstractC22676k.m65750j(messageId, "messageId");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC11478a.m30857i("[deleteMessage] messageId: ", messageId, ", hard: ", hard), null);
        }
        return AbstractC27476f.m82912j(precondition$stream_chat_android_client_release(AbstractC27476f.m82903a(AbstractC27476f.m82904b(this.api.deleteMessage(messageId, hard, false), this.userScope, new C189102(messageId, null)), this.userScope, new C189113(messageId, null)), this.plugins, new C189124(messageId, null)), this.userScope, new C19072b(messageId, hard, 0));
    }

    public final InterfaceC27474d disconnect(boolean flushPersistence, boolean deleteDevice) {
        return new C27478h(this.clientScope, new C189191(deleteDevice, flushPersistence, null));
    }

    public final InterfaceC27474d getChannel(String channelType, String channelId, int messageLimit, int memberLimit, boolean state) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        StringBuilder sb4 = new StringBuilder();
        sb4.append(channelType);
        return getChannel(AbstractC25012a.m73376i(":", channelId, sb4), messageLimit, memberLimit, state);
    }

    public final InterfaceC27474d markUnread(String channelType, String channelId, Date timestamp) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(timestamp, "timestamp");
        return ChatApi.markUnread$default(this.api, channelType, channelId, null, timestamp, null, 20, null);
    }

    public final InterfaceC27474d muteChannel(String channelType, String channelId, Integer expiration) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.api.muteChannel(channelType, channelId, expiration);
    }

    public final InterfaceC27474d muteUser(String userId, Integer timeout) {
        AbstractC22676k.m65750j(userId, "userId");
        return this.api.muteUser(userId, timeout);
    }

    public final InterfaceC27474d queryBannedUsers(FilterObject filter, QuerySorter<BannedUsersSort> sort) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        return queryBannedUsers$default(this, filter, sort, null, null, null, null, null, null, 252, null);
    }

    public final InterfaceC27474d sendFile(String channelType, String channelId, File file, ProgressCallback callback) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(file, "file");
        return this.api.sendFile(channelType, channelId, file, callback);
    }

    public final InterfaceC27474d sendImage(String channelType, String channelId, File file, ProgressCallback callback) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(file, "file");
        return this.api.sendImage(channelType, channelId, file, callback);
    }

    public final InterfaceC27474d sendReaction(Reaction reaction, boolean z4, String str) {
        AbstractC22676k.m65750j(reaction, "reaction");
        return sendReaction$default(this, reaction, z4, str, false, 8, null);
    }

    public final InterfaceC27474d switchUser(User user, TokenProvider tokenProvider, Long l7) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(tokenProvider, "tokenProvider");
        return switchUser$default(this, user, tokenProvider, l7, (InterfaceC4339a) null, 8, (Object) null);
    }

    public final InterfaceC27474d uploadFile(File file, ProgressCallback progressCallback) {
        AbstractC22676k.m65750j(file, "file");
        return this.api.uploadFile(file, progressCallback);
    }

    public final InterfaceC27474d uploadImage(File file, ProgressCallback progressCallback) {
        AbstractC22676k.m65750j(file, "file");
        return this.api.uploadImage(file, progressCallback);
    }

    public static /* synthetic */ InterfaceC27474d switchUser$default(ChatClient chatClient, User user, String str, Long l7, InterfaceC4339a interfaceC4339a, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            l7 = null;
        }
        if ((i13 & 8) != 0) {
            interfaceC4339a = new C18518b(28);
        }
        return chatClient.switchUser(user, str, l7, interfaceC4339a);
    }

    public final InterfaceC27474d queryBannedUsers(FilterObject filter, QuerySorter<BannedUsersSort> sort, Integer num) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        return queryBannedUsers$default(this, filter, sort, num, null, null, null, null, null, 248, null);
    }

    public final InterfaceC27474d sendReaction(Reaction reaction, boolean enforceUnique, String cid, boolean skipPush) {
        AbstractC22676k.m65750j(reaction, "reaction");
        User currentUser = getCurrentUser();
        Reaction reactionCopy = reaction.copy((16319 & 1) != 0 ? reaction.messageId : null, (16319 & 2) != 0 ? reaction.type : null, (16319 & 4) != 0 ? reaction.score : 0, (16319 & 8) != 0 ? reaction.user : null, (16319 & 16) != 0 ? reaction.userId : null, (16319 & 32) != 0 ? reaction.createdAt : null, (16319 & 64) != 0 ? reaction.createdLocallyAt : (Date) this.now.invoke(), (16319 & 128) != 0 ? reaction.updatedAt : null, (16319 & 256) != 0 ? reaction.deletedAt : null, (16319 & 512) != 0 ? reaction.syncStatus : null, (16319 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? reaction.extraData : null, (16319 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? reaction.enforceUnique : false, (16319 & 4096) != 0 ? reaction.skipPush : false, (16319 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? reaction.emojiCode : null);
        C27481k c27481kM82903a = AbstractC27476f.m82903a(AbstractC27476f.m82904b(AbstractC27476f.m82911i(this.api.sendReaction(reactionCopy, enforceUnique, skipPush), this.userScope, this.retryPolicy), this.userScope, new C189781(reaction, cid, reactionCopy, enforceUnique, skipPush, currentUser, null)), this.userScope, new C189792(cid, reactionCopy, enforceUnique, currentUser, null));
        List<ErrorHandler> errorHandlers = getErrorHandlers();
        AbstractC22676k.m65747g(currentUser);
        return AbstractC27476f.m82912j(precondition$stream_chat_android_client_release(SendReactionErrorHandlerKt.onReactionError(c27481kM82903a, errorHandlers, reaction, enforceUnique, skipPush, currentUser), this.plugins, new C189803(cid, currentUser, reaction, null)), this.userScope, new C3433d0(reaction, enforceUnique, cid, 6));
    }

    public final Disposable subscribeFor(InterfaceC1585g0 lifecycleOwner, String[] eventTypes, ChatEventListener<ChatEvent> listener) {
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(eventTypes, "eventTypes");
        AbstractC22676k.m65750j(listener, "listener");
        final Disposable disposableSubscribeFor = subscribeFor((String[]) Arrays.copyOf(eventTypes, eventTypes.length), new C19090h(lifecycleOwner, listener, 0));
        lifecycleOwner.getLifecycle().mo4986a(new DefaultLifecycleObserver() { // from class: io.getstream.chat.android.client.ChatClient.subscribeFor.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(InterfaceC1585g0 owner) {
                AbstractC22676k.m65750j(owner, "owner");
                disposableSubscribeFor.dispose();
            }
        });
        return disposableSubscribeFor;
    }

    public final <T extends ChatEvent> Disposable subscribeForSingle(Class<T> eventType, ChatEventListener<T> listener) {
        AbstractC22676k.m65750j(eventType, "eventType");
        AbstractC22676k.m65750j(listener, "listener");
        return this.eventsObservable.subscribeSingle(new C17095c(eventType, 12), new C19284a(listener, 2));
    }

    public final InterfaceC27474d switchUser(User user, String token) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(token, "token");
        return switchUser$default(this, user, token, (Long) null, (InterfaceC4339a) null, 12, (Object) null);
    }

    public final InterfaceC27474d getSyncHistory(List<String> channelsIds, String lastSyncAt) {
        AbstractC22676k.m65750j(channelsIds, "channelsIds");
        AbstractC22676k.m65750j(lastSyncAt, "lastSyncAt");
        Date date = this.streamDateFormatter.parse$stream_chat_android_client_release(lastSyncAt);
        if (date == null) {
            return new ErrorCall(this.userScope, new C26198a(AbstractC31061c.m95640p("The string for data: ", lastSyncAt, " could not be parsed for format: ", this.streamDateFormatter.getDatePattern())));
        }
        return AbstractC27476f.m82914l(this.api.getSyncHistory(channelsIds, lastSyncAt), this.userScope, new C189422(channelsIds, date, null));
    }

    public final InterfaceC27474d queryBannedUsers(FilterObject filter, QuerySorter<BannedUsersSort> sort, Integer num, Integer num2) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        return queryBannedUsers$default(this, filter, sort, num, num2, null, null, null, null, 240, null);
    }

    public final InterfaceC27474d switchUser(User user, String token, Long l7) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(token, "token");
        return switchUser$default(this, user, token, l7, (InterfaceC4339a) null, 8, (Object) null);
    }

    public final InterfaceC27474d queryBannedUsers(FilterObject filter, QuerySorter<BannedUsersSort> sort, Integer num, Integer num2, Date date) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        return queryBannedUsers$default(this, filter, sort, num, num2, date, null, null, null, 224, null);
    }

    public final InterfaceC27474d switchUser(User user, TokenProvider tokenProvider, Long timeoutMilliseconds, InterfaceC4339a onDisconnectionComplete) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(tokenProvider, "tokenProvider");
        AbstractC22676k.m65750j(onDisconnectionComplete, "onDisconnectionComplete");
        return new C27478h(this.clientScope, new C189922(user, onDisconnectionComplete, tokenProvider, timeoutMilliseconds, null));
    }

    public final InterfaceC27474d connectUser(User user, String token) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(token, "token");
        return connectUser(user, token, (Long) null);
    }

    public final InterfaceC27474d queryBannedUsers(FilterObject filter, QuerySorter<BannedUsersSort> sort, Integer num, Integer num2, Date date, Date date2) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        return queryBannedUsers$default(this, filter, sort, num, num2, date, date2, null, null, 192, null);
    }

    public final InterfaceC27474d switchUser(User user, String token, Long timeoutMilliseconds, InterfaceC4339a onDisconnectionComplete) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(onDisconnectionComplete, "onDisconnectionComplete");
        return switchUser(user, new ConstantTokenProvider(token), timeoutMilliseconds, onDisconnectionComplete);
    }

    public final InterfaceC27474d connectUser(User user, String token, Long timeoutMilliseconds) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(token, "token");
        return connectUser(user, new ConstantTokenProvider(token), timeoutMilliseconds);
    }

    public final InterfaceC27474d queryBannedUsers(FilterObject filter, QuerySorter<BannedUsersSort> sort, Integer num, Integer num2, Date date, Date date2, Date date3) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        return queryBannedUsers$default(this, filter, sort, num, num2, date, date2, date3, null, 128, null);
    }

    public final InterfaceC27474d queryBannedUsers(FilterObject filter, QuerySorter<BannedUsersSort> sort, Integer offset, Integer limit, Date createdAtAfter, Date createdAtAfterOrEqual, Date createdAtBefore, Date createdAtBeforeOrEqual) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        return this.api.queryBannedUsers(filter, sort, offset, limit, createdAtAfter, createdAtAfterOrEqual, createdAtBefore, createdAtBeforeOrEqual);
    }

    public final Disposable subscribeFor(Class<? extends ChatEvent>[] eventTypes, ChatEventListener<ChatEvent> listener) {
        AbstractC22676k.m65750j(eventTypes, "eventTypes");
        AbstractC22676k.m65750j(listener, "listener");
        return this.eventsObservable.subscribe(new C17095c(eventTypes, 13), listener);
    }

    public final InterfaceC27474d addMembers(String channelType, String channelId, AddMembersParams params) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(params, "params");
        return this.api.addMembers(channelType, channelId, params.getMembers(), params.getSystemMessage(), params.getHideHistory(), params.getHideHistoryBefore(), params.getSkipPush());
    }

    public final InterfaceC27474d createChannel(String channelType, String channelId, CreateChannelParams params) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(params, "params");
        User currentUser = getCurrentUser();
        DtoMapping dtoMapping = this.dtoMapping;
        List<MemberData> members = params.getMembers();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(members, 10));
        Iterator<T> it = members.iterator();
        while (it.hasNext()) {
            arrayList.add(dtoMapping.toDto$stream_chat_android_client_release((MemberData) it.next()));
        }
        QueryChannelRequest queryChannelRequest = new QueryChannelRequest();
        queryChannelRequest.withData(AbstractC25247g0.m73995d0(params.getExtraData(), AbstractC25247g0.m73989X(new C23465k(QueryChannelRequest.KEY_MEMBERS, arrayList))));
        return AbstractC27476f.m82912j(precondition$stream_chat_android_client_release(CreateChannelErrorHandlerKt.onCreateChannelError(AbstractC27476f.m82903a(AbstractC27476f.m82904b(AbstractC27476f.m82911i(this.api.queryChannel(channelType, channelId, queryChannelRequest), this.userScope, this.retryPolicy), this.userScope, new C189031(channelType, channelId, params, currentUser, null)), this.userScope, new C189042(channelType, channelId, params, null)), getErrorHandlers(), channelType, channelId, params.getMemberIds(), params.getExtraData()), this.plugins, new C189053(currentUser, channelId, params, null)), this.userScope, new C19073c(channelType, channelId, queryChannelRequest, 0));
    }

    public final Disposable subscribeFor(InterfaceC1585g0 lifecycleOwner, Class<? extends ChatEvent>[] eventTypes, ChatEventListener<ChatEvent> listener) {
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(eventTypes, "eventTypes");
        AbstractC22676k.m65750j(listener, "listener");
        final Disposable disposableSubscribeFor = subscribeFor((Class<? extends ChatEvent>[]) Arrays.copyOf(eventTypes, eventTypes.length), new C19090h(lifecycleOwner, listener, 1));
        lifecycleOwner.getLifecycle().mo4986a(new DefaultLifecycleObserver() { // from class: io.getstream.chat.android.client.ChatClient.subscribeFor.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(InterfaceC1585g0 owner) {
                AbstractC22676k.m65750j(owner, "owner");
                disposableSubscribeFor.dispose();
            }
        });
        return disposableSubscribeFor;
    }

    public final InterfaceC27474d pinMessage(Message message, int timeout) {
        AbstractC22676k.m65750j(message, "message");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC18489d0.m53371l(AbstractC11895b.m32001t("[pinMessage] message: Message(id=", message.getId(), ", text=", message.getText(), "), timeout: "), timeout, " seconds"), null);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(13, timeout);
        return partialUpdateMessage$default(this, message.getId(), AbstractC25247g0.m73990Y(new C23465k("pinned", Boolean.TRUE), new C23465k("pin_expires", calendar.getTime())), null, 4, null);
    }

    public /* synthetic */ ChatClient(ChatApiConfig chatApiConfig, ChatApi chatApi, DtoMapping dtoMapping, ChatNotifications chatNotifications, TokenManager tokenManager, UserCredentialStorage userCredentialStorage, UserStateService userStateService, ChatClientDebugger chatClientDebugger, TokenUtils tokenUtils, ClientScope clientScope, UserScope userScope, InterfaceC30894d interfaceC30894d, AppSettingManager appSettingManager, ChatSocket chatSocket, List list, MutableClientState mutableClientState, CurrentUserFetcher currentUserFetcher, RepositoryFactory.Provider provider, AudioPlayer audioPlayer, InterfaceC4339a interfaceC4339a, ServerClockOffset serverClockOffset, ChatClientRepository chatClientRepository, MessageReceiptReporter messageReceiptReporter, MessageReceiptManager messageReceiptManager, CDN cdn, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(chatApiConfig, chatApi, dtoMapping, chatNotifications, (i13 & 16) != 0 ? new TokenManagerImpl() : tokenManager, userCredentialStorage, (i13 & 64) != 0 ? new UserStateService() : userStateService, (i13 & 128) != 0 ? StubChatClientDebugger.INSTANCE : chatClientDebugger, (i13 & 256) != 0 ? TokenUtils.INSTANCE : tokenUtils, clientScope, userScope, interfaceC30894d, appSettingManager, chatSocket, list, mutableClientState, currentUserFetcher, provider, audioPlayer, (524288 & i13) != 0 ? C188901.INSTANCE : interfaceC4339a, serverClockOffset, chatClientRepository, messageReceiptReporter, messageReceiptManager, (i13 & 16777216) != 0 ? null : cdn);
    }
}
