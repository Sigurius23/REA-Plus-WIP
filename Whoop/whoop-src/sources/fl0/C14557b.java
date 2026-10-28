package fl0;

import android.net.Uri;
import androidx.core.app.FrameMetricsAggregator;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import bm.C3383g;
import c93.InterfaceC4351m;
import cl0.C4797c;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.bot.api.AiConversationApi;
import com.whoop.bot.models.conversation.AiChatConversation;
import com.whoop.bot.models.conversation.AiChatConversationKt;
import com.whoop.bot.models.conversation.AiChatMessage;
import com.whoop.bot.models.conversation.AiChatMessageRequestBody;
import com.whoop.bot.models.conversation.AiMessageStatus;
import com.whoop.bot.models.conversation.BetaTagModel;
import com.whoop.bot.models.conversation.CommitRecommendationRequest;
import com.whoop.bot.models.conversation.CommitRecommendationRequestBody;
import com.whoop.bot.models.conversation.CommitRecommendationResponse;
import com.whoop.bot.models.conversation.ConversationRequestsKt;
import com.whoop.bot.models.conversation.FetchSuggestionsRequest;
import com.whoop.bot.models.conversation.GetConversationRequest;
import com.whoop.bot.models.conversation.GetConversationV2Request;
import com.whoop.bot.models.conversation.ImageUploadRequest;
import com.whoop.bot.models.conversation.ImageUploadRequestBody;
import com.whoop.bot.models.conversation.Location;
import com.whoop.bot.models.conversation.RemoveImageRequest;
import com.whoop.bot.models.conversation.SendMessageRequest;
import com.whoop.bot.models.conversation.StartConversationRequest;
import com.whoop.bot.models.conversation.StartConversationV2Request;
import com.whoop.bot.models.conversation.StartConversationV2RequestBody;
import com.whoop.bot.models.conversation.StopGeneratingRequest;
import com.whoop.bot.models.conversation.SuggestionsResponse;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.models.items.ArticleTileModel;
import com.whoop.design.models.items.ArticleTileModelEventEnum;
import com.whoop.design.models.items.ArticleTileTypeDtoEnum;
import com.whoop.design.models.items.TileBorderStyle;
import com.whoop.navigation.models.GenericInteraction;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13045h2;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import f63.AbstractC14155c;
import fc3.C14380k;
import fv1.C14814b;
import fv1.InterfaceC14815c;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.ktor.client.plugins.ResponseException;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.error.ErrorCodes;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import nl0.EnumC26800b;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import no.nordicsemi.android.dfu.DfuBaseService;
import od1.InterfaceC27844g;
import or2.InterfaceC28215x1;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s01.EnumC32045a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;
import u02.C34387c;
import u02.InterfaceC34385a;
import wb3.AbstractC37056f;
import xk0.C38423a;
import xk0.C38425c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: fl0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001Bi\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J)\u0010&\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\"2\u0006\u0010(\u001a\u00020\"H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020-2\u0006\u00102\u001a\u00020\u0003H\u0002¢\u0006\u0004\b3\u00104J\u001e\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\u0006\u00105\u001a\u00020\"H\u0082@¢\u0006\u0004\b6\u00107J\u001e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\u0006\u00105\u001a\u00020\"H\u0082@¢\u0006\u0004\b8\u00107J\u001e\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\u0006\u0010:\u001a\u000209H\u0082@¢\u0006\u0004\b;\u0010<J3\u0010@\u001a\u00020\"2\b\u0010=\u001a\u0004\u0018\u00010\"2\u0006\u0010>\u001a\u00020\"2\u0006\u0010?\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b@\u0010AJp\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\b\u0010=\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010?\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010\"2\u0006\u0010B\u001a\u00020-2\u0006\u0010C\u001a\u00020-2\u0006\u0010D\u001a\u00020\"2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020F0E2\b\u0010I\u001a\u0004\u0018\u00010HH\u0082@¢\u0006\u0004\bJ\u0010KJ%\u0010O\u001a\u00020\u00032\f\u0010M\u001a\b\u0012\u0004\u0012\u00020+0L2\u0006\u0010N\u001a\u00020-H\u0002¢\u0006\u0004\bO\u0010PJ9\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\b\u0010=\u001a\u0004\u0018\u00010\"2\u0006\u0010>\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010\"2\u0006\u0010C\u001a\u00020-H\u0002¢\u0006\u0004\bQ\u0010RJp\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\b\u0010=\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010?\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010\"2\u0006\u0010B\u001a\u00020-2\u0006\u0010C\u001a\u00020-2\u0006\u0010D\u001a\u00020\"2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020F0E2\b\u0010I\u001a\u0004\u0018\u00010HH\u0082@¢\u0006\u0004\bS\u0010KJy\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\u0006\u0010T\u001a\u00020\"2\b\b\u0002\u0010U\u001a\u00020-2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\"2\u0010\b\u0002\u0010Y\u001a\n\u0012\u0004\u0012\u00020X\u0018\u00010W2\u0010\b\u0002\u0010Z\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010W2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010H2\b\b\u0002\u0010[\u001a\u00020-2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\\H\u0002¢\u0006\u0004\b^\u0010_J\u0015\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00030\u001eH\u0002¢\u0006\u0004\b`\u0010aJ\u0015\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001eH\u0002¢\u0006\u0004\bb\u0010aJA\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\u0006\u0010c\u001a\u00020-2\u0006\u0010d\u001a\u00020\"2\b\u0010e\u001a\u0004\u0018\u00010\"2\b\u0010f\u001a\u0004\u0018\u00010\"2\u0006\u0010g\u001a\u00020-H\u0002¢\u0006\u0004\bh\u0010iJ#\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0WH\u0002¢\u0006\u0004\bj\u0010kJ(\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\b\u0010l\u001a\u0004\u0018\u00010\"2\u0006\u0010m\u001a\u00020XH\u0082@¢\u0006\u0004\bn\u0010oJ\u0017\u0010r\u001a\u00020+2\u0006\u0010q\u001a\u00020pH\u0002¢\u0006\u0004\br\u0010sJ%\u0010t\u001a\u00020p2\u0006\u0010q\u001a\u00020p2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0WH\u0002¢\u0006\u0004\bt\u0010uR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001e\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00020+0\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001e\u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u00020\"0\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u008f\u0001R \u0010\u0094\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\"0\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u008f\u0001R\u001d\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020\"0W8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R+\u0010\u009a\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020X\u0012\u0005\u0012\u00030\u0098\u00010E0\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u008f\u0001¨\u0006\u009b\u0001"}, m65681d2 = {"Lfl0/b;", "Lod1/g;", "Lfl0/a;", "Lfl0/c;", "Lcom/whoop/bot/api/AiConversationApi;", "api", "Lor2/x1;", "uuidGenerator", "", "userId", "Ltr2/n;", "logger", "Lcl0/c;", "aiActiveResponseInteractor", "Lnm0/e;", "cachedApiSource", "Lu02/c;", "apiClient", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lbc3/c0;", "coroutineScope", "Lxk0/a;", "analyticsHelper", "Lfv1/c;", "locationManager", "Lfl0/h;", "imageFileHandler", "<init>", "(Lcom/whoop/bot/api/AiConversationApi;Lor2/x1;ILtr2/n;Lcl0/c;Lnm0/e;Lu02/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;Lxk0/a;Lfv1/c;Lfl0/h;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "", "firstMessage", "conversationIdSeed", "presetQuestion", "K", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "seed", "E", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/whoop/bot/models/conversation/AiChatConversation;", "conversation", "", "B", "(Lcom/whoop/bot/models/conversation/AiChatConversation;)Z", "S", "(Lcom/whoop/bot/models/conversation/AiChatConversation;)Lcom/whoop/bot/models/conversation/AiChatConversation;", "aiConversationResult", "A", "(Lfl0/c;)Z", "conversationId", "H", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "G", "Ljava/util/UUID;", "supportActionTileID", "F", "(Ljava/util/UUID;Lq83/d;)Ljava/lang/Object;", "initialMessage", "cycleOrActivityId", "source", "J", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "includeInitialMessage", "hasLocationPermission", "sourceId", "", "Lkotlinx/serialization/json/JsonElement;", "args", "", "timestamp", "R", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/Map;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;", "Lpm0/a;", "cacheSourceResult", "showKeyboardOnLaunch", "O", "(Lpm0/a;Z)Lfl0/c;", "L", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;", "M", "messageContent", "isSuggestion", "messageId", "", "Landroid/net/Uri;", "imageUris", "fileIds", "isVoiceInput", "Lfl0/l;", "retryAnalyticsData", "P", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;ZLfl0/l;)Lec3/l;", "T", "()Lec3/l;", "I", "committed", "recommendationId", "activityTitle", "replacementId", "fromGhostTile", "D", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;", "V", "(Ljava/util/List;)Lec3/l;", "fileId", "fileUri", "N", "(Ljava/lang/String;Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/bot/models/conversation/AiChatMessage;", "message", "C", "(Lcom/whoop/bot/models/conversation/AiChatMessage;)Lcom/whoop/bot/models/conversation/AiChatConversation;", "U", "(Lcom/whoop/bot/models/conversation/AiChatMessage;Ljava/util/List;)Lcom/whoop/bot/models/conversation/AiChatMessage;", "a", "Lcom/whoop/bot/api/AiConversationApi;", "b", "Lor2/x1;", "c", "d", "Ltr2/n;", "e", "Lcl0/c;", "f", "Lnm0/e;", "g", "Lu02/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/data/repositories/FeatureFlagChecker;", "i", "Lbc3/c0;", "j", "Lxk0/a;", "k", "Lfv1/c;", "l", "Lfl0/h;", "Lec3/p1;", "m", "Lec3/p1;", "conversationFlow", "n", "sourceOnFlow", "o", "presetQuestionFlow", "p", "Ljava/util/List;", "coldStartFeatures", "Lfl0/i;", "q", "imageUploadModelsFlow", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14557b implements InterfaceC27844g<AbstractC14556a, C14558c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AiConversationApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC28215x1 uuidGenerator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int userId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C4797c aiActiveResponseInteractor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C34387c apiClient;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C38423a analyticsHelper;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC14815c locationManager;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C14563h imageFileHandler;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC13075p1 conversationFlow;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final InterfaceC13075p1 sourceOnFlow;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final InterfaceC13075p1 presetQuestionFlow;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final List<String> coldStartFeatures;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final InterfaceC13075p1 imageUploadModelsFlow;

    /* JADX INFO: renamed from: fl0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$commitRecommendation$$inlined$cacheAPI$1", m100430f = "AiConversationInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f53246w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f53247x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f53248y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f53249z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f53249z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<CommitRecommendationRequestBody> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f53249z);
            aVar.f53247x = interfaceC13062m;
            aVar.f53248y = c26832c;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f53246w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f53247x;
                C26832c c26832c = (C26832c) this.f53248y;
                InterfaceC26834e interfaceC26834e = this.f53249z;
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(CommitRecommendationRequestBody.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65691d);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(CommitRecommendationRequestBody.class), interfaceC21456a0M65691d, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d2 = AbstractC22671h0.m65691d(CommitRecommendationResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(CommitRecommendationResponse.class), interfaceC21456a0M65691d2, AbstractC21478l0.m60396B(interfaceC21456a0M65691d2)));
                this.f53247x = null;
                this.f53248y = null;
                this.f53246w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C26832c<CommitRecommendationRequestBody>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: fl0.b$a0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$uploadImages$1", m100430f = "AiConversationInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Landroid/net/Uri;", "fileUri", "Lec3/l;", "Lfl0/c;", "<anonymous>", "(Landroid/net/Uri;)Lec3/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f53250w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f53251x;

        /* JADX INFO: renamed from: fl0.b$a0$a */
        @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$uploadImages$1$1", m100430f = "AiConversationInteractor.kt", m100431l = {846, 854, 857, 863, 869, 958, 875, 885}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lfl0/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            Object f53253E;

            /* JADX INFO: renamed from: F */
            Object f53254F;

            /* JADX INFO: renamed from: G */
            Object f53255G;

            /* JADX INFO: renamed from: H */
            int f53256H;

            /* JADX INFO: renamed from: I */
            int f53257I;

            /* JADX INFO: renamed from: J */
            int f53258J;

            /* JADX INFO: renamed from: K */
            int f53259K;

            /* JADX INFO: renamed from: L */
            int f53260L;

            /* JADX INFO: renamed from: M */
            private /* synthetic */ Object f53261M;

            /* JADX INFO: renamed from: N */
            final /* synthetic */ Uri f53262N;

            /* JADX INFO: renamed from: O */
            final /* synthetic */ C14557b f53263O;

            /* JADX INFO: renamed from: w */
            Object f53264w;

            /* JADX INFO: renamed from: x */
            Object f53265x;

            /* JADX INFO: renamed from: y */
            Object f53266y;

            /* JADX INFO: renamed from: z */
            Object f53267z;

            /* JADX INFO: renamed from: fl0.b$a0$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$uploadImages$1$1$imageModel$1", m100430f = "AiConversationInteractor.kt", m100431l = {858}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lf63/c;", "<anonymous>", "()Lf63/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C41589a extends AbstractC32275i implements Function1 {

                /* JADX INFO: renamed from: w */
                int f53268w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C14557b f53269x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ ImageUploadRequest f53270y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C41589a(C14557b c14557b, ImageUploadRequest imageUploadRequest, InterfaceC30057d<? super C41589a> interfaceC30057d) {
                    super(1, interfaceC30057d);
                    this.f53269x = c14557b;
                    this.f53270y = imageUploadRequest;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                    return new C41589a(this.f53269x, this.f53270y, interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f53268w;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        return obj;
                    }
                    AbstractC34132o.m107864I(obj);
                    C34387c c34387c = this.f53269x.apiClient;
                    ImageUploadRequest imageUploadRequest = this.f53270y;
                    InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(ImageUploadRequestBody.class);
                    C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ImageUploadRequestBody.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d));
                    this.f53268w = 1;
                    Object objM108748d = c34387c.m108748d(imageUploadRequest, c32236aM44445Y, this);
                    return objM108748d == enumC31071a ? enumC31071a : objM108748d;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(InterfaceC30057d<? super AbstractC14155c> interfaceC30057d) {
                    return ((C41589a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Uri uri, C14557b c14557b, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f53262N = uri;
                this.f53263O = c14557b;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f53262N, this.f53263O, interfaceC30057d);
                aVar.f53261M = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code duplicated, block: B:23:0x0164 A[PHI: r0
              0x0164: PHI (r0v22 java.lang.Object) = (r0v19 java.lang.Object), (r0v29 java.lang.Object) binds: [B:21:0x0160, B:12:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:26:0x01a0 A[PHI: r0 r13
              0x01a0: PHI (r0v30 java.lang.Object) = (r0v26 java.lang.Object), (r0v41 java.lang.Object) binds: [B:24:0x019c, B:11:0x00aa] A[DONT_GENERATE, DONT_INLINE]
              0x01a0: PHI (r13v2 java.lang.String) = (r13v1 java.lang.String), (r13v3 java.lang.String) binds: [B:24:0x019c, B:11:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:28:0x01aa  */
            /* JADX WARN: Code duplicated, block: B:31:0x01d2  */
            /* JADX WARN: Code duplicated, block: B:33:0x01e3  */
            /* JADX WARN: Code duplicated, block: B:35:0x01e7  */
            /* JADX WARN: Code duplicated, block: B:37:0x01ff  */
            /* JADX WARN: Code duplicated, block: B:46:0x0265  */
            /* JADX WARN: Code duplicated, block: B:48:0x026b  */
            /* JADX WARN: Code duplicated, block: B:50:0x0275  */
            /* JADX WARN: Code duplicated, block: B:51:0x0277  */
            /* JADX WARN: Code duplicated, block: B:53:0x027a  */
            /* JADX WARN: Code duplicated, block: B:54:0x027c  */
            /* JADX WARN: Code duplicated, block: B:56:0x0285  */
            /* JADX WARN: Code duplicated, block: B:58:0x028d  */
            /* JADX WARN: Code duplicated, block: B:61:0x02aa  */
            /* JADX WARN: Code duplicated, block: B:71:0x0330  */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x032a, code lost:
            
                if (r8.emit(r14, r23) == r9) goto L68;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r24) {
                /*
                    Method dump skipped, instruction units count: 844
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fl0.C14557b.a0.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a0(InterfaceC30057d<? super a0> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a0 a0Var = C14557b.this.new a0(interfaceC30057d);
            a0Var.f53251x = obj;
            return a0Var;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Uri uri, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            return ((a0) create(uri, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Uri uri = (Uri) this.f53251x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f53250w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C13084s1(new a(uri, C14557b.this, null));
        }
    }

    /* JADX INFO: renamed from: fl0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f53271w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C14557b f53272x;

        /* JADX INFO: renamed from: fl0.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f53273w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14557b f53274x;

            /* JADX INFO: renamed from: fl0.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$commitRecommendation$$inlined$map$1$2", m100430f = "AiConversationInteractor.kt", m100431l = {53, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41590a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f53275E;

                /* JADX INFO: renamed from: F */
                Object f53276F;

                /* JADX INFO: renamed from: G */
                Object f53277G;

                /* JADX INFO: renamed from: H */
                Object f53278H;

                /* JADX INFO: renamed from: I */
                Object f53279I;

                /* JADX INFO: renamed from: J */
                Object f53280J;

                /* JADX INFO: renamed from: K */
                int f53281K;

                /* JADX INFO: renamed from: L */
                int f53282L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f53283w;

                /* JADX INFO: renamed from: x */
                int f53284x;

                /* JADX INFO: renamed from: y */
                Object f53285y;

                public C41590a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f53283w = obj;
                    this.f53284x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C14557b c14557b) {
                this.f53273w = interfaceC13062m;
                this.f53274x = c14557b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x0103, code lost:
            
                if (r1.emit(r10, r2) == r3) goto L39;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r21, q83.InterfaceC30057d r22) {
                /*
                    Method dump skipped, instruction units count: 265
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fl0.C14557b.b.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public b(InterfaceC13058l interfaceC13058l, C14557b c14557b) {
            this.f53271w = interfaceC13058l;
            this.f53272x = c14557b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f53271w.collect(new a(interfaceC13062m, this.f53272x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: fl0.b$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$commitRecommendation$1$1", m100430f = "AiConversationInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lfl0/c;", "<anonymous>", "(Lbc3/c0;)Lfl0/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f53287w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC29354a<CommitRecommendationResponse> f53288x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C14557b f53289y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC29354a<CommitRecommendationResponse> interfaceC29354a, C14557b c14557b, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f53288x = interfaceC29354a;
            this.f53289y = c14557b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f53288x, this.f53289y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C14558c> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AiChatConversation aiChatConversationM41624C;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f53287w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AiChatMessage message = ((CommitRecommendationResponse) ((InterfaceC29354a.a.C42173a) this.f53288x).getData()).getMessage();
            if (message == null || (aiChatConversationM41624C = this.f53289y.m41624C(message)) == null) {
                aiChatConversationM41624C = (AiChatConversation) ((C13045h2) this.f53289y.conversationFlow).getValue();
            }
            return new C14558c(aiChatConversationM41624C, EnumC14565j.SUCCESS, null, null, false, null, 60, null);
        }
    }

    /* JADX INFO: renamed from: fl0.b$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$createMxmSupportTicket$2", m100430f = "AiConversationInteractor.kt", m100431l = {DfuBaseService.NOTIFICATION_ID, 290, 291, 294}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lfl0/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        private /* synthetic */ Object f53290E;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ UUID f53292G;

        /* JADX INFO: renamed from: w */
        Object f53293w;

        /* JADX INFO: renamed from: x */
        Object f53294x;

        /* JADX INFO: renamed from: y */
        Object f53295y;

        /* JADX INFO: renamed from: z */
        int f53296z;

        /* JADX INFO: renamed from: fl0.b$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$createMxmSupportTicket$2$response$1", m100430f = "AiConversationInteractor.kt", m100431l = {292}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/bot/models/conversation/AiChatMessage;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f53297w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14557b f53298x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ AiChatMessage f53299y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ UUID f53300z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C14557b c14557b, AiChatMessage aiChatMessage, UUID uuid, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f53298x = c14557b;
                this.f53299y = aiChatMessage;
                this.f53300z = uuid;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f53298x, this.f53299y, this.f53300z, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f53297w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                AiConversationApi aiConversationApi = this.f53298x.api;
                String id4 = ((AiChatConversation) ((C13045h2) this.f53298x.conversationFlow).getValue()).getId();
                String id5 = this.f53299y.getId();
                String string = this.f53300z.toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                this.f53297w = 1;
                Object objPostMxmCreateTicket = aiConversationApi.postMxmCreateTicket(id4, id5, string, this);
                return objPostMxmCreateTicket == enumC31071a ? enumC31071a : objPostMxmCreateTicket;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super AiChatMessage> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(UUID uuid, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f53292G = uuid;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C14557b.this.new d(this.f53292G, interfaceC30057d);
            dVar.f53290E = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0116  */
        /* JADX WARN: Code duplicated, block: B:29:0x0138  */
        /* JADX WARN: Code duplicated, block: B:31:0x013c  */
        /* JADX WARN: Code duplicated, block: B:37:0x0188  */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00b2, code lost:
        
            if (r8.emit(r13, r23) == r9) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0182, code lost:
        
            if (r8.emit(r14, r23) == r9) goto L34;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instruction units count: 398
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fl0.C14557b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: fl0.b$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$deleteConversation$2", m100430f = "AiConversationInteractor.kt", m100431l = {246, 253, 256}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lfl0/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f53301E;

        /* JADX INFO: renamed from: w */
        Object f53302w;

        /* JADX INFO: renamed from: x */
        int f53303x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f53304y;

        /* JADX INFO: renamed from: fl0.b$e$a */
        @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$deleteConversation$2$response$1", m100430f = "AiConversationInteractor.kt", m100431l = {254}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f53306w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14557b f53307x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f53308y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C14557b c14557b, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f53307x = c14557b;
                this.f53308y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f53307x, this.f53308y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f53306w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                AiConversationApi aiConversationApi = this.f53307x.api;
                String str = this.f53308y;
                this.f53306w = 1;
                Object objDeletePastConversation = aiConversationApi.deletePastConversation(str, this);
                return objDeletePastConversation == enumC31071a ? enumC31071a : objDeletePastConversation;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f53301E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C14557b.this.new e(this.f53301E, interfaceC30057d);
            eVar.f53304y = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x008a  */
        /* JADX WARN: Code duplicated, block: B:21:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:23:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:29:0x00f6  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00f0, code lost:
        
            if (r8.emit(r12, r21) == r9) goto L26;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fl0.C14557b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: fl0.b$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$fetchPastConversation$2", m100430f = "AiConversationInteractor.kt", m100431l = {212, 219, 222}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lfl0/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f53309E;

        /* JADX INFO: renamed from: w */
        Object f53310w;

        /* JADX INFO: renamed from: x */
        int f53311x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f53312y;

        /* JADX INFO: renamed from: fl0.b$f$a */
        @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$fetchPastConversation$2$response$1", m100430f = "AiConversationInteractor.kt", m100431l = {220}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/bot/models/conversation/AiChatConversation;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f53314w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14557b f53315x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f53316y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C14557b c14557b, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f53315x = c14557b;
                this.f53316y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f53315x, this.f53316y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f53314w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                AiConversationApi aiConversationApi = this.f53315x.api;
                String str = this.f53316y;
                this.f53314w = 1;
                Object pastConversation = aiConversationApi.getPastConversation(str, this);
                return pastConversation == enumC31071a ? enumC31071a : pastConversation;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super AiChatConversation> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f53309E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = C14557b.this.new f(this.f53309E, interfaceC30057d);
            fVar.f53312y = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x008b  */
        /* JADX WARN: Code duplicated, block: B:24:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:26:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:32:0x010e  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0108, code lost:
        
            if (r8.emit(r12, r21) == r9) goto L29;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 276
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fl0.C14557b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: fl0.b$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$fetchSuggestionsFlow$$inlined$cacheAPI$1", m100430f = "AiConversationInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f53317w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f53318x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f53319y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f53320z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f53320z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            g gVar = new g(interfaceC30057d, this.f53320z);
            gVar.f53318x = interfaceC13062m;
            gVar.f53319y = c26832c;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f53317w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f53318x;
                C26832c c26832c = (C26832c) this.f53319y;
                InterfaceC26834e interfaceC26834e = this.f53320z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(SuggestionsResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(SuggestionsResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f53318x = null;
                this.f53319y = null;
                this.f53317w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: fl0.b$h */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f53321w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C14557b f53322x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f53323y;

        /* JADX INFO: renamed from: fl0.b$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f53324w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14557b f53325x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ boolean f53326y;

            /* JADX INFO: renamed from: fl0.b$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$fetchSuggestionsFlow$$inlined$map$1$2", m100430f = "AiConversationInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41591a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f53327E;

                /* JADX INFO: renamed from: F */
                Object f53328F;

                /* JADX INFO: renamed from: G */
                Object f53329G;

                /* JADX INFO: renamed from: H */
                int f53330H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f53331w;

                /* JADX INFO: renamed from: x */
                int f53332x;

                /* JADX INFO: renamed from: y */
                Object f53333y;

                public C41591a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f53331w = obj;
                    this.f53332x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C14557b c14557b, boolean z4) {
                this.f53324w = interfaceC13062m;
                this.f53325x = c14557b;
                this.f53326y = z4;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41591a c41591a;
                C14558c c14558c;
                C13045h2 c13045h2;
                Object value;
                AiChatConversation aiChatConversationCopy$default;
                if (interfaceC30057d instanceof C41591a) {
                    c41591a = (C41591a) interfaceC30057d;
                    int i13 = c41591a.f53332x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41591a.f53332x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41591a = new C41591a(interfaceC30057d);
                    }
                } else {
                    c41591a = new C41591a(interfaceC30057d);
                }
                Object obj2 = c41591a.f53331w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41591a.f53332x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f53324w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        InterfaceC13075p1 interfaceC13075p1 = this.f53325x.conversationFlow;
                        do {
                            c13045h2 = (C13045h2) interfaceC13075p1;
                            value = c13045h2.getValue();
                            aiChatConversationCopy$default = AiChatConversation.copy$default((AiChatConversation) value, null, null, ((SuggestionsResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData()).getSuggestions(), null, null, null, null, 123, null);
                        } while (!c13045h2.m36569i(value, aiChatConversationCopy$default));
                        c14558c = new C14558c(aiChatConversationCopy$default, EnumC14565j.SUCCESS, null, null, this.f53326y, null, 44, null);
                    } else {
                        c14558c = new C14558c((AiChatConversation) ((C13045h2) this.f53325x.conversationFlow).getValue(), EnumC14565j.SUCCESS, null, null, this.f53326y, null, 44, null);
                    }
                    c41591a.f53333y = null;
                    c41591a.f53327E = null;
                    c41591a.f53328F = null;
                    c41591a.f53329G = null;
                    c41591a.f53330H = 0;
                    c41591a.f53332x = 1;
                    if (interfaceC13062m.emit(c14558c, c41591a) == enumC31071a) {
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

        public h(InterfaceC13058l interfaceC13058l, C14557b c14557b, boolean z4) {
            this.f53321w = interfaceC13058l;
            this.f53322x = c14557b;
            this.f53323y = z4;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f53321w.collect(new a(interfaceC13062m, this.f53322x, this.f53323y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: fl0.b$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$interact$$inlined$flatMapLatest$1", m100430f = "AiConversationInteractor.kt", m100431l = {194, 203, 204, 205, 227, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        Object f53335E;

        /* JADX INFO: renamed from: F */
        Object f53336F;

        /* JADX INFO: renamed from: G */
        Object f53337G;

        /* JADX INFO: renamed from: H */
        int f53338H;

        /* JADX INFO: renamed from: w */
        int f53339w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f53340x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f53341y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C14557b f53342z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC30057d interfaceC30057d, C14557b c14557b) {
            super(3, interfaceC30057d);
            this.f53342z = c14557b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC14556a abstractC14556a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            i iVar = new i(interfaceC30057d, this.f53342z);
            iVar.f53340x = interfaceC13062m;
            iVar.f53341y = abstractC14556a;
            return iVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:58:0x024c, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r13, (ec3.InterfaceC13058l) r0, r25) == r11) goto L59;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instruction units count: 618
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fl0.C14557b.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC14556a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: fl0.b$j */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$interact$$inlined$flatMapLatest$2", m100430f = "AiConversationInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f53343w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f53344x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f53345y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C14557b f53346z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC30057d interfaceC30057d, C14557b c14557b) {
            super(3, interfaceC30057d);
            this.f53346z = c14557b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C14558c c14558c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            j jVar = new j(interfaceC30057d, this.f53346z);
            jVar.f53344x = interfaceC13062m;
            jVar.f53345y = c14558c;
            return jVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f53343w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f53344x;
                C14558c c14558c = (C14558c) this.f53345y;
                InterfaceC13058l interfaceC13058lM36590P = this.f53346z.m41623B(c14558c.getConversation()) ? AbstractC13091v.m36590P(this.f53346z.aiActiveResponseInteractor.m15161b(c14558c), new l(null, this.f53346z)) : new C0456u(c14558c, 1);
                this.f53344x = null;
                this.f53345y = null;
                this.f53343w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM36590P, this) == enumC31071a) {
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
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C14558c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: fl0.b$k */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$interact$2", m100430f = "AiConversationInteractor.kt", m100431l = {149}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lfl0/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f53347w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f53348x;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            k kVar = C14557b.this.new k(interfaceC30057d);
            kVar.f53348x = obj;
            return kVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f53348x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f53347w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C14558c c14558c = new C14558c((AiChatConversation) ((C13045h2) C14557b.this.conversationFlow).getValue(), EnumC14565j.SUCCESS, null, null, false, null, 60, null);
                this.f53348x = null;
                this.f53347w = 1;
                if (interfaceC13062m.emit(c14558c, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: fl0.b$l */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$interact$lambda$1$$inlined$flatMapLatest$1", m100430f = "AiConversationInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f53350w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f53351x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f53352y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C14557b f53353z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC30057d interfaceC30057d, C14557b c14557b) {
            super(3, interfaceC30057d);
            this.f53353z = c14557b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C14558c c14558c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            l lVar = new l(interfaceC30057d, this.f53353z);
            lVar.f53351x = interfaceC13062m;
            lVar.f53352y = c14558c;
            return lVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C13045h2 c13045h2;
            Object value;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f53350w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f53351x;
                C14558c c14558c = (C14558c) this.f53352y;
                boolean zM41622A = this.f53353z.m41622A(c14558c);
                InterfaceC13075p1 interfaceC13075p1 = this.f53353z.conversationFlow;
                do {
                    c13045h2 = (C13045h2) interfaceC13075p1;
                    value = c13045h2.getValue();
                } while (!c13045h2.m36569i(value, c14558c.getConversation()));
                InterfaceC13058l interfaceC13058lM41630I = zM41622A ? this.f53353z.m41630I() : new C0456u(c14558c, 1);
                this.f53351x = null;
                this.f53352y = null;
                this.f53350w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM41630I, this) == enumC31071a) {
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
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C14558c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: fl0.b$m */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$postNewConversation$$inlined$cacheAPI$1", m100430f = "AiConversationInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class m extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f53354w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f53355x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f53356y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f53357z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f53357z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<AiChatMessageRequestBody> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            m mVar = new m(interfaceC30057d, this.f53357z);
            mVar.f53355x = interfaceC13062m;
            mVar.f53356y = c26832c;
            return mVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f53354w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f53355x;
                C26832c c26832c = (C26832c) this.f53356y;
                InterfaceC26834e interfaceC26834e = this.f53357z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(AiChatMessageRequestBody.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(AiChatMessageRequestBody.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(AiChatMessage.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(AiChatMessage.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f53355x = null;
                this.f53356y = null;
                this.f53354w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C26832c<AiChatMessageRequestBody>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: fl0.b$n */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements InterfaceC13058l {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f53358E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f53359w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C14557b f53360x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f53361y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f53362z;

        /* JADX INFO: renamed from: fl0.b$n$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ boolean f53363E;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f53364w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14557b f53365x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f53366y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f53367z;

            /* JADX INFO: renamed from: fl0.b$n$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$postNewConversation$$inlined$map$1$2", m100430f = "AiConversationInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41592a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f53368E;

                /* JADX INFO: renamed from: F */
                Object f53369F;

                /* JADX INFO: renamed from: G */
                Object f53370G;

                /* JADX INFO: renamed from: H */
                int f53371H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f53372w;

                /* JADX INFO: renamed from: x */
                int f53373x;

                /* JADX INFO: renamed from: y */
                Object f53374y;

                public C41592a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f53372w = obj;
                    this.f53373x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C14557b c14557b, String str, String str2, boolean z4) {
                this.f53364w = interfaceC13062m;
                this.f53365x = c14557b;
                this.f53366y = str;
                this.f53367z = str2;
                this.f53363E = z4;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41592a c41592a;
                C14558c c14558c;
                if (interfaceC30057d instanceof C41592a) {
                    c41592a = (C41592a) interfaceC30057d;
                    int i13 = c41592a.f53373x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41592a.f53373x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41592a = new C41592a(interfaceC30057d);
                    }
                } else {
                    c41592a = new C41592a(interfaceC30057d);
                }
                Object obj2 = c41592a.f53372w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41592a.f53373x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f53364w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        c14558c = new C14558c(this.f53365x.m41624C((AiChatMessage) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData()), EnumC14565j.SUCCESS, null, null, false, null, 60, null);
                    } else if ((interfaceC29354a instanceof InterfaceC29354a.a.b) || (interfaceC29354a instanceof InterfaceC29354a.e)) {
                        c14558c = new C14558c((AiChatConversation) ((C13045h2) this.f53365x.conversationFlow).getValue(), EnumC14565j.LOADING, null, null, false, null, 60, null);
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f53365x.analyticsHelper.m123056K((InterfaceC29354a.b) interfaceC29354a, "start_conversation");
                        this.f53365x.analyticsHelper.m123070h(((AiChatConversation) ((C13045h2) this.f53365x.conversationFlow).getValue()).getId(), true);
                        c14558c = new C14558c((AiChatConversation) ((C13045h2) this.f53365x.conversationFlow).getValue(), EnumC14565j.ERROR, null, new AbstractC14566k.b(this.f53366y, this.f53367z, null, null, false, this.f53363E, 28, null), false, null, 52, null);
                    }
                    c41592a.f53374y = null;
                    c41592a.f53368E = null;
                    c41592a.f53369F = null;
                    c41592a.f53370G = null;
                    c41592a.f53371H = 0;
                    c41592a.f53373x = 1;
                    if (interfaceC13062m.emit(c14558c, c41592a) == enumC31071a) {
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

        public n(InterfaceC13058l interfaceC13058l, C14557b c14557b, String str, String str2, boolean z4) {
            this.f53359w = interfaceC13058l;
            this.f53360x = c14557b;
            this.f53361y = str;
            this.f53362z = str2;
            this.f53358E = z4;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f53359w.collect(new a(interfaceC13062m, this.f53360x, this.f53361y, this.f53362z, this.f53358E), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: fl0.b$o */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$postNewConversation$2", m100430f = "AiConversationInteractor.kt", m100431l = {FrameMetricsAggregator.EVERY_DURATION}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lfl0/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ StartConversationRequest f53376E;

        /* JADX INFO: renamed from: w */
        Object f53377w;

        /* JADX INFO: renamed from: x */
        int f53378x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f53379y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(StartConversationRequest startConversationRequest, InterfaceC30057d<? super o> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f53376E = startConversationRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            o oVar = C14557b.this.new o(this.f53376E, interfaceC30057d);
            oVar.f53379y = obj;
            return oVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((o) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C13045h2 c13045h2;
            Object value;
            AiChatConversation aiChatConversation;
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f53379y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f53378x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13075p1 interfaceC13075p1 = C14557b.this.conversationFlow;
                StartConversationRequest startConversationRequest = this.f53376E;
                do {
                    c13045h2 = (C13045h2) interfaceC13075p1;
                    value = c13045h2.getValue();
                    AiChatMessageRequestBody body = startConversationRequest.getBody();
                    aiChatConversation = new AiChatConversation(startConversationRequest.getConversationId(), AbstractC37056f.m118960L(body != null ? ConversationRequestsKt.toChatMessage(body) : null), (List) null, (List) null, (List) null, (String) null, (BetaTagModel) null, 124, (DefaultConstructorMarker) null);
                } while (!c13045h2.m36569i(value, aiChatConversation));
                C14558c c14558c = new C14558c(aiChatConversation, EnumC14565j.LOADING, null, null, false, null, 60, null);
                this.f53379y = null;
                this.f53377w = null;
                this.f53378x = 1;
                if (interfaceC13062m.emit(c14558c, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: fl0.b$p */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$postNewConversationV2$$inlined$cacheAPI$1", m100430f = "AiConversationInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class p extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f53381w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f53382x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f53383y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f53384z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f53384z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<StartConversationV2RequestBody> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            p pVar = new p(interfaceC30057d, this.f53384z);
            pVar.f53382x = interfaceC13062m;
            pVar.f53383y = c26832c;
            return pVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f53381w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f53382x;
                C26832c c26832c = (C26832c) this.f53383y;
                InterfaceC26834e interfaceC26834e = this.f53384z;
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(StartConversationV2RequestBody.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65691d);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(StartConversationV2RequestBody.class), interfaceC21456a0M65691d, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d2 = AbstractC22671h0.m65691d(AiChatConversation.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(AiChatConversation.class), interfaceC21456a0M65691d2, AbstractC21478l0.m60396B(interfaceC21456a0M65691d2)));
                this.f53382x = null;
                this.f53383y = null;
                this.f53381w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C26832c<StartConversationV2RequestBody>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: fl0.b$q */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements InterfaceC13058l {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f53385E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f53386F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ boolean f53387G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ boolean f53388H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ boolean f53389I;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f53390w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C14557b f53391x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f53392y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f53393z;

        /* JADX INFO: renamed from: fl0.b$q$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ String f53394E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ String f53395F;

            /* JADX INFO: renamed from: G */
            final /* synthetic */ boolean f53396G;

            /* JADX INFO: renamed from: H */
            final /* synthetic */ boolean f53397H;

            /* JADX INFO: renamed from: I */
            final /* synthetic */ boolean f53398I;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f53399w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14557b f53400x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f53401y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f53402z;

            /* JADX INFO: renamed from: fl0.b$q$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$postNewConversationV2$$inlined$map$1$2", m100430f = "AiConversationInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41593a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f53403E;

                /* JADX INFO: renamed from: F */
                Object f53404F;

                /* JADX INFO: renamed from: G */
                Object f53405G;

                /* JADX INFO: renamed from: H */
                int f53406H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f53407w;

                /* JADX INFO: renamed from: x */
                int f53408x;

                /* JADX INFO: renamed from: y */
                Object f53409y;

                public C41593a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f53407w = obj;
                    this.f53408x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C14557b c14557b, String str, String str2, String str3, String str4, boolean z4, boolean z13, boolean z14) {
                this.f53399w = interfaceC13062m;
                this.f53400x = c14557b;
                this.f53401y = str;
                this.f53402z = str2;
                this.f53394E = str3;
                this.f53395F = str4;
                this.f53396G = z4;
                this.f53397H = z13;
                this.f53398I = z14;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41593a c41593a;
                C14558c c14558c;
                C13045h2 c13045h2;
                Object value;
                InterfaceC29354a.a.C42173a c42173a;
                AiChatConversation aiChatConversation;
                if (interfaceC30057d instanceof C41593a) {
                    c41593a = (C41593a) interfaceC30057d;
                    int i13 = c41593a.f53408x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41593a.f53408x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41593a = new C41593a(interfaceC30057d);
                    }
                } else {
                    c41593a = new C41593a(interfaceC30057d);
                }
                Object obj2 = c41593a.f53407w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41593a.f53408x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f53399w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        InterfaceC13075p1 interfaceC13075p1 = this.f53400x.conversationFlow;
                        do {
                            c13045h2 = (C13045h2) interfaceC13075p1;
                            value = c13045h2.getValue();
                            c42173a = (InterfaceC29354a.a.C42173a) interfaceC29354a;
                            aiChatConversation = (AiChatConversation) c42173a.getData();
                        } while (!c13045h2.m36569i(value, aiChatConversation));
                        c14558c = new C14558c(aiChatConversation, EnumC14565j.SUCCESS, null, ((AiChatConversation) c42173a.getData()).getMessages().isEmpty() ? new AbstractC14566k.b(this.f53401y, this.f53402z, this.f53394E, this.f53395F, this.f53396G, this.f53397H) : AbstractC14566k.c.f53546a, this.f53398I, null, 36, null);
                    } else if ((interfaceC29354a instanceof InterfaceC29354a.a.b) || (interfaceC29354a instanceof InterfaceC29354a.e)) {
                        c14558c = new C14558c((AiChatConversation) ((C13045h2) this.f53400x.conversationFlow).getValue(), EnumC14565j.LOADING, null, null, this.f53398I, null, 44, null);
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f53400x.analyticsHelper.m123056K((InterfaceC29354a.b) interfaceC29354a, "start_conversation_v2");
                        this.f53400x.analyticsHelper.m123070h(((AiChatConversation) ((C13045h2) this.f53400x.conversationFlow).getValue()).getId(), true);
                        c14558c = new C14558c((AiChatConversation) ((C13045h2) this.f53400x.conversationFlow).getValue(), EnumC14565j.ERROR, null, new AbstractC14566k.b(this.f53401y, this.f53402z, this.f53394E, this.f53395F, this.f53396G, this.f53397H), this.f53398I, null, 36, null);
                    }
                    c41593a.f53409y = null;
                    c41593a.f53403E = null;
                    c41593a.f53404F = null;
                    c41593a.f53405G = null;
                    c41593a.f53406H = 0;
                    c41593a.f53408x = 1;
                    if (interfaceC13062m.emit(c14558c, c41593a) == enumC31071a) {
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

        public q(InterfaceC13058l interfaceC13058l, C14557b c14557b, String str, String str2, String str3, String str4, boolean z4, boolean z13, boolean z14) {
            this.f53390w = interfaceC13058l;
            this.f53391x = c14557b;
            this.f53392y = str;
            this.f53393z = str2;
            this.f53385E = str3;
            this.f53386F = str4;
            this.f53387G = z4;
            this.f53388H = z13;
            this.f53389I = z14;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f53390w.collect(new a(interfaceC13062m, this.f53391x, this.f53392y, this.f53393z, this.f53385E, this.f53386F, this.f53387G, this.f53388H, this.f53389I), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: fl0.b$r */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor", m100430f = "AiConversationInteractor.kt", m100431l = {531}, m100432m = "postNewConversationV2", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f53411E;

        /* JADX INFO: renamed from: F */
        Object f53412F;

        /* JADX INFO: renamed from: G */
        Object f53413G;

        /* JADX INFO: renamed from: H */
        Object f53414H;

        /* JADX INFO: renamed from: I */
        Object f53415I;

        /* JADX INFO: renamed from: J */
        boolean f53416J;

        /* JADX INFO: renamed from: K */
        boolean f53417K;

        /* JADX INFO: renamed from: L */
        int f53418L;

        /* JADX INFO: renamed from: M */
        /* synthetic */ Object f53419M;

        /* JADX INFO: renamed from: O */
        int f53421O;

        /* JADX INFO: renamed from: w */
        Object f53422w;

        /* JADX INFO: renamed from: x */
        Object f53423x;

        /* JADX INFO: renamed from: y */
        Object f53424y;

        /* JADX INFO: renamed from: z */
        Object f53425z;

        public r(InterfaceC30057d<? super r> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f53419M = obj;
            this.f53421O |= Integer.MIN_VALUE;
            return C14557b.this.m41634M(null, null, null, null, false, false, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: fl0.b$s */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$postNewConversationV2$3", m100430f = "AiConversationInteractor.kt", m100431l = {625}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lfl0/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class s extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f53426E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ boolean f53427F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ StartConversationV2Request f53428G;

        /* JADX INFO: renamed from: w */
        Object f53429w;

        /* JADX INFO: renamed from: x */
        int f53430x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f53431y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(boolean z4, boolean z13, StartConversationV2Request startConversationV2Request, InterfaceC30057d<? super s> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f53426E = z4;
            this.f53427F = z13;
            this.f53428G = startConversationV2Request;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            s sVar = C14557b.this.new s(this.f53426E, this.f53427F, this.f53428G, interfaceC30057d);
            sVar.f53431y = obj;
            return sVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((s) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C13045h2 c13045h2;
            Object value;
            AiChatConversation aiChatConversation;
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f53431y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f53430x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13075p1 interfaceC13075p1 = C14557b.this.conversationFlow;
                boolean z4 = this.f53427F;
                StartConversationV2Request startConversationV2Request = this.f53428G;
                do {
                    c13045h2 = (C13045h2) interfaceC13075p1;
                    value = c13045h2.getValue();
                    aiChatConversation = new AiChatConversation(startConversationV2Request.getConversationId(), z4 ? AbstractC37056f.m118960L(startConversationV2Request.getBody().getMessage()) : C25271y.f99162w, (List) null, (List) null, (List) null, (String) null, (BetaTagModel) null, 124, (DefaultConstructorMarker) null);
                } while (!c13045h2.m36569i(value, aiChatConversation));
                C14558c c14558c = new C14558c(aiChatConversation, EnumC14565j.LOADING, null, null, this.f53426E, null, 44, null);
                this.f53431y = null;
                this.f53429w = null;
                this.f53430x = 1;
                if (interfaceC13062m.emit(c14558c, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: fl0.b$t */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor", m100430f = "AiConversationInteractor.kt", m100431l = {899}, m100432m = "removeImage", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f53433E;

        /* JADX INFO: renamed from: G */
        int f53435G;

        /* JADX INFO: renamed from: w */
        Object f53436w;

        /* JADX INFO: renamed from: x */
        Object f53437x;

        /* JADX INFO: renamed from: y */
        Object f53438y;

        /* JADX INFO: renamed from: z */
        int f53439z;

        public t(InterfaceC30057d<? super t> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f53433E = obj;
            this.f53435G |= Integer.MIN_VALUE;
            return C14557b.this.m41635N(null, null, this);
        }
    }

    /* JADX INFO: renamed from: fl0.b$u */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$removeImage$2$response$1", m100430f = "AiConversationInteractor.kt", m100431l = {900}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lf63/c;", "<anonymous>", "()Lf63/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class u extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f53440w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f53442y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str, InterfaceC30057d<? super u> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f53442y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14557b.this.new u(this.f53442y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f53440w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C34387c c34387c = C14557b.this.apiClient;
            RemoveImageRequest removeImageRequest = new RemoveImageRequest(this.f53442y);
            InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
            C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, AbstractC21478l0.m60396B(interfaceC21456a0M65689b));
            this.f53440w = 1;
            Object objM108748d = c34387c.m108748d(removeImageRequest, c32236aM44445Y, this);
            return objM108748d == enumC31071a ? enumC31071a : objM108748d;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AbstractC14155c> interfaceC30057d) {
            return ((u) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: fl0.b$v */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$sendMessageFlow$$inlined$cacheAPI$1", m100430f = "AiConversationInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class v extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f53443w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f53444x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f53445y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f53446z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f53446z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<AiChatMessageRequestBody> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            v vVar = new v(interfaceC30057d, this.f53446z);
            vVar.f53444x = interfaceC13062m;
            vVar.f53445y = c26832c;
            return vVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f53443w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f53444x;
                C26832c c26832c = (C26832c) this.f53445y;
                InterfaceC26834e interfaceC26834e = this.f53446z;
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(AiChatMessageRequestBody.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65691d);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(AiChatMessageRequestBody.class), interfaceC21456a0M65691d, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d2 = AbstractC22671h0.m65691d(AiChatMessage.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(AiChatMessage.class), interfaceC21456a0M65691d2, AbstractC21478l0.m60396B(interfaceC21456a0M65691d2)));
                this.f53444x = null;
                this.f53445y = null;
                this.f53443w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C26832c<AiChatMessageRequestBody>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: fl0.b$w */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w implements InterfaceC13058l {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ List f53447E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ boolean f53448F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f53449G;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f53450w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C14557b f53451x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f53452y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f53453z;

        /* JADX INFO: renamed from: fl0.b$w$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ List f53454E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ boolean f53455F;

            /* JADX INFO: renamed from: G */
            final /* synthetic */ String f53456G;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f53457w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14557b f53458x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ boolean f53459y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f53460z;

            /* JADX INFO: renamed from: fl0.b$w$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$sendMessageFlow$$inlined$map$1$2", m100430f = "AiConversationInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41594a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f53461E;

                /* JADX INFO: renamed from: F */
                Object f53462F;

                /* JADX INFO: renamed from: G */
                Object f53463G;

                /* JADX INFO: renamed from: H */
                int f53464H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f53465w;

                /* JADX INFO: renamed from: x */
                int f53466x;

                /* JADX INFO: renamed from: y */
                Object f53467y;

                public C41594a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f53465w = obj;
                    this.f53466x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C14557b c14557b, boolean z4, String str, List list, boolean z13, String str2) {
                this.f53457w = interfaceC13062m;
                this.f53458x = c14557b;
                this.f53459y = z4;
                this.f53460z = str;
                this.f53454E = list;
                this.f53455F = z13;
                this.f53456G = str2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41594a c41594a;
                C13045h2 c13045h2;
                Object value;
                AiChatConversation aiChatConversationCopy$default;
                C14558c c14558c;
                String str;
                List list;
                if (interfaceC30057d instanceof C41594a) {
                    c41594a = (C41594a) interfaceC30057d;
                    int i13 = c41594a.f53466x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41594a.f53466x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41594a = new C41594a(interfaceC30057d);
                    }
                } else {
                    c41594a = new C41594a(interfaceC30057d);
                }
                Object obj2 = c41594a.f53465w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41594a.f53466x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f53457w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        InterfaceC29354a.a.C42173a c42173a = (InterfaceC29354a.a.C42173a) interfaceC29354a;
                        boolean z4 = ((AiChatMessage) c42173a.getData()).getMessageStatus() == AiMessageStatus.FLAGGED;
                        this.f53458x.analyticsHelper.m123082t(((AiChatConversation) ((C13045h2) this.f53458x.conversationFlow).getValue()).getId(), ((AiChatMessage) c42173a.getData()).getId());
                        c14558c = new C14558c(this.f53458x.m41624C((AiChatMessage) c42173a.getData()), z4 ? EnumC14565j.FLAGGED : EnumC14565j.SUCCESS, null, null, false, null, 60, null);
                    } else if ((interfaceC29354a instanceof InterfaceC29354a.a.b) || (interfaceC29354a instanceof InterfaceC29354a.e)) {
                        InterfaceC13075p1 interfaceC13075p1 = this.f53458x.conversationFlow;
                        do {
                            c13045h2 = (C13045h2) interfaceC13075p1;
                            value = c13045h2.getValue();
                            aiChatConversationCopy$default = AiChatConversation.copy$default((AiChatConversation) value, null, null, C25271y.f99162w, null, null, null, null, 123, null);
                        } while (!c13045h2.m36569i(value, aiChatConversationCopy$default));
                        c14558c = new C14558c(aiChatConversationCopy$default, EnumC14565j.LOADING, null, null, false, null, 60, null);
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        InterfaceC29354a.b<?> bVar = (InterfaceC29354a.b) interfaceC29354a;
                        String analyticsString = C38425c.f164569a.m123102b(bVar).getAnalyticsString();
                        this.f53458x.analyticsHelper.m123056K(bVar, "send_message");
                        this.f53458x.analyticsHelper.m123070h(((AiChatConversation) ((C13045h2) this.f53458x.conversationFlow).getValue()).getId(), true);
                        if (this.f53459y) {
                            this.f53458x.analyticsHelper.m123059N(analyticsString);
                        }
                        AiChatConversation aiChatConversation = (AiChatConversation) ((C13045h2) this.f53458x.conversationFlow).getValue();
                        EnumC14565j enumC14565j = EnumC14565j.ERROR;
                        String id4 = ((AiChatConversation) ((C13045h2) this.f53458x.conversationFlow).getValue()).getId();
                        String value2 = EnumC26800b.USER.getValue();
                        if (this.f53460z.length() <= 0 || (list = this.f53454E) == null || !(!list.isEmpty())) {
                            List list2 = this.f53454E;
                            if (list2 == null || !(!list2.isEmpty())) {
                                str = this.f53459y ? "push_to_talk" : "text";
                            } else {
                                str = "image";
                            }
                        } else {
                            str = "text_and_image";
                        }
                        c14558c = new C14558c(aiChatConversation, enumC14565j, null, new AbstractC14566k.e(this.f53460z, this.f53455F, id4, this.f53456G, new C14567l(value2, str, analyticsString)), false, null, 52, null);
                    }
                    c41594a.f53467y = null;
                    c41594a.f53461E = null;
                    c41594a.f53462F = null;
                    c41594a.f53463G = null;
                    c41594a.f53464H = 0;
                    c41594a.f53466x = 1;
                    if (interfaceC13062m.emit(c14558c, c41594a) == enumC31071a) {
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

        public w(InterfaceC13058l interfaceC13058l, C14557b c14557b, boolean z4, String str, List list, boolean z13, String str2) {
            this.f53450w = interfaceC13058l;
            this.f53451x = c14557b;
            this.f53452y = z4;
            this.f53453z = str;
            this.f53447E = list;
            this.f53448F = z13;
            this.f53449G = str2;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f53450w.collect(new a(interfaceC13062m, this.f53451x, this.f53452y, this.f53453z, this.f53447E, this.f53448F, this.f53449G), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: fl0.b$x */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$startConversationFlow$$inlined$cacheAPI$1", m100430f = "AiConversationInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class x extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f53469w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f53470x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f53471y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f53472z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f53472z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            x xVar = new x(interfaceC30057d, this.f53472z);
            xVar.f53470x = interfaceC13062m;
            xVar.f53471y = c26832c;
            return xVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f53469w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f53470x;
                C26832c c26832c = (C26832c) this.f53471y;
                InterfaceC26834e interfaceC26834e = this.f53472z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(AiChatConversation.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(AiChatConversation.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f53470x = null;
                this.f53471y = null;
                this.f53469w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: fl0.b$y */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$startConversationFlow$$inlined$flatMapLatest$1", m100430f = "AiConversationInteractor.kt", m100431l = {193, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class y extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C14557b f53473E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f53474F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f53475G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ String f53476H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ String f53477I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ boolean f53478J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ boolean f53479K;

        /* JADX INFO: renamed from: L */
        final /* synthetic */ String f53480L;

        /* JADX INFO: renamed from: M */
        final /* synthetic */ Map f53481M;

        /* JADX INFO: renamed from: N */
        final /* synthetic */ Long f53482N;

        /* JADX INFO: renamed from: O */
        final /* synthetic */ boolean f53483O;

        /* JADX INFO: renamed from: P */
        Object f53484P;

        /* JADX INFO: renamed from: Q */
        Object f53485Q;

        /* JADX INFO: renamed from: R */
        Object f53486R;

        /* JADX INFO: renamed from: S */
        int f53487S;

        /* JADX INFO: renamed from: w */
        int f53488w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f53489x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f53490y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f53491z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(InterfaceC30057d interfaceC30057d, boolean z4, C14557b c14557b, String str, String str2, String str3, String str4, boolean z13, boolean z14, String str5, Map map, Long l7, boolean z15) {
            super(3, interfaceC30057d);
            this.f53491z = z4;
            this.f53473E = c14557b;
            this.f53474F = str;
            this.f53475G = str2;
            this.f53476H = str3;
            this.f53477I = str4;
            this.f53478J = z13;
            this.f53479K = z14;
            this.f53480L = str5;
            this.f53481M = map;
            this.f53482N = l7;
            this.f53483O = z15;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC29354a<AiChatConversation> interfaceC29354a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            y yVar = new y(interfaceC30057d, this.f53491z, this.f53473E, this.f53474F, this.f53475G, this.f53476H, this.f53477I, this.f53478J, this.f53479K, this.f53480L, this.f53481M, this.f53482N, this.f53483O);
            yVar.f53489x = interfaceC13062m;
            yVar.f53490y = interfaceC29354a;
            return yVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00a7 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:25:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:26:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:28:0x0107  */
        /* JADX WARN: Code duplicated, block: B:29:0x0115  */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0137, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r14, (ec3.InterfaceC13058l) r0, r23) == r11) goto L32;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instruction units count: 317
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fl0.C14557b.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (InterfaceC29354a<AiChatConversation>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: fl0.b$z */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.conversation.AiConversationInteractor$stopGeneratingFlow$1", m100430f = "AiConversationInteractor.kt", m100431l = {733}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class z extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AiChatMessageRequestBody f53492E;

        /* JADX INFO: renamed from: w */
        int f53493w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f53494x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f53496z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(String str, AiChatMessageRequestBody aiChatMessageRequestBody, InterfaceC30057d<? super z> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f53496z = str;
            this.f53492E = aiChatMessageRequestBody;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            z zVar = C14557b.this.new z(this.f53496z, this.f53492E, interfaceC30057d);
            zVar.f53494x = obj;
            return zVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((z) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C23465k c23465k;
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f53494x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f53493w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C34387c c34387c = C14557b.this.apiClient;
                    StopGeneratingRequest stopGeneratingRequest = new StopGeneratingRequest(this.f53496z, this.f53492E);
                    InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                    C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, AbstractC21478l0.m60396B(interfaceC21456a0M65689b));
                    this.f53494x = interfaceC2994c0;
                    this.f53493w = 1;
                    if (c34387c.m108748d(stopGeneratingRequest, c32236aM44445Y, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
            } catch (Exception e5) {
                AbstractC3006f0.m8720n(interfaceC2994c0);
                C14557b.this.analyticsHelper.m123058M(e5, "stop_generating");
                if (e5 instanceof ResponseException) {
                    c23465k = new C23465k(String.valueOf(((ResponseException) e5).f74974w.mo13325e()), Boolean.FALSE);
                } else {
                    c23465k = e5 instanceof IOException ? new C23465k(String.valueOf(e5.getMessage()), Boolean.FALSE) : new C23465k(String.valueOf(e5.getMessage()), Boolean.TRUE);
                }
                String str = (String) c23465k.f92937w;
                if (((Boolean) c23465k.f92938x).booleanValue()) {
                    C14557b.this.logger.mo85230v(AbstractC11266d.m30461o("Failed to stop generating: ", str), e5, new AbstractC30556a.a[0]);
                } else {
                    C14557b.this.logger.mo85222m(AbstractC11266d.m30461o("Failed to stop generating: ", str), new AbstractC30556a.a[0]);
                }
            }
            return C23454a0.f92919a;
        }
    }

    public C14557b(AiConversationApi api, InterfaceC28215x1 uuidGenerator, int i13, InterfaceC34116n logger, C4797c aiActiveResponseInteractor, InterfaceC26834e cachedApiSource, C34387c apiClient, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 coroutineScope, C38423a analyticsHelper, InterfaceC14815c locationManager, C14563h imageFileHandler) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(uuidGenerator, "uuidGenerator");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(aiActiveResponseInteractor, "aiActiveResponseInteractor");
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(locationManager, "locationManager");
        AbstractC22676k.m65750j(imageFileHandler, "imageFileHandler");
        this.api = api;
        this.uuidGenerator = uuidGenerator;
        this.userId = i13;
        this.logger = logger;
        this.aiActiveResponseInteractor = aiActiveResponseInteractor;
        this.cachedApiSource = cachedApiSource;
        this.apiClient = apiClient;
        this.featureFlagChecker = featureFlagChecker;
        this.coroutineScope = coroutineScope;
        this.analyticsHelper = analyticsHelper;
        this.locationManager = locationManager;
        this.imageFileHandler = imageFileHandler;
        String string = uuidGenerator.mo85405a().toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        this.conversationFlow = AbstractC13091v.m36593c(new AiChatConversation(string, (List) null, (List) null, (List) null, (List) null, (String) null, (BetaTagModel) null, 126, (DefaultConstructorMarker) null));
        this.sourceOnFlow = AbstractC13091v.m36593c("");
        this.presetQuestionFlow = AbstractC13091v.m36593c(null);
        this.coldStartFeatures = AbstractC37056f.m118959K("PRESET_QUESTION", "SOBER_OCTOBER_CHALLENGE", "WAKE_UP_REPORT", "WIND_DOWN_REPORT", "ACTIVITY_RECOMMENDATION_REVIEW", "CHAT_WITH_AGENT");
        this.imageUploadModelsFlow = AbstractC13091v.m36593c(C25272z.f99163w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final boolean m41622A(C14558c aiConversationResult) {
        return m41623B((AiChatConversation) ((C13045h2) this.conversationFlow).getValue()) && !m41623B(aiConversationResult.getConversation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final boolean m41623B(AiChatConversation conversation) {
        AiChatMessage latestAssistantResponse = AiChatConversationKt.getLatestAssistantResponse(conversation);
        return (latestAssistantResponse != null ? latestAssistantResponse.getMessageStatus() : null) == AiMessageStatus.ACTIVE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final AiChatConversation m41624C(AiChatMessage message) {
        C13045h2 c13045h2;
        Object value;
        AiChatConversation aiChatConversationCopy$default;
        InterfaceC13075p1 interfaceC13075p1 = this.conversationFlow;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            AiChatConversation aiChatConversation = (AiChatConversation) value;
            aiChatConversationCopy$default = AiChatConversation.copy$default(aiChatConversation, null, AbstractC25265s.m74128f1(message, aiChatConversation.getMessages()), null, null, null, null, null, 125, null);
        } while (!c13045h2.m36569i(value, aiChatConversationCopy$default));
        return aiChatConversationCopy$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final InterfaceC13058l m41625D(boolean committed, String recommendationId, String activityTitle, String replacementId, boolean fromGhostTile) {
        this.analyticsHelper.m123081s(((AiChatConversation) ((C13045h2) this.conversationFlow).getValue()).getId(), committed, activityTitle, fromGhostTile);
        return new b(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new CommitRecommendationRequest(((AiChatConversation) ((C13045h2) this.conversationFlow).getValue()).getId(), recommendationId, new CommitRecommendationRequestBody(committed, replacementId)), 1), null, null, 3, null), new a(null, this.cachedApiSource)), this);
    }

    /* JADX INFO: renamed from: E */
    private final String m41626E(String seed) {
        String string = this.featureFlagChecker.isFeatureEnabled("hal-uuid-string-strong") ? this.uuidGenerator.mo85407e(seed).toString() : this.uuidGenerator.mo85406d(seed).toString();
        AbstractC22676k.m65747g(string);
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final Object m41627F(UUID uuid, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return new C13084s1(new d(uuid, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final Object m41628G(String str, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return new C13084s1(new e(str, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public final Object m41629H(String str, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return new C13084s1(new f(str, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final InterfaceC13058l m41630I() {
        return new h(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new FetchSuggestionsRequest(((AiChatConversation) ((C13045h2) this.conversationFlow).getValue()).getId()), 1), null, null, 3, null), new g(null, this.cachedApiSource)), this, !this.coldStartFeatures.contains(((C13045h2) this.sourceOnFlow).getValue()));
    }

    /* JADX INFO: renamed from: J */
    private final String m41631J(String initialMessage, String cycleOrActivityId, String source, String presetQuestion) {
        EnumC32045a enumC32045a;
        EnumC32045a enumC32045a2 = EnumC32045a.OVERVIEW;
        EnumC32045a[] enumC32045aArrValues = EnumC32045a.values();
        int length = enumC32045aArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC32045a = null;
                break;
            }
            enumC32045a = enumC32045aArrValues[i13];
            if (AbstractC22676k.m65745e(enumC32045a.name(), source)) {
                break;
            }
            i13++;
        }
        if (enumC32045a != null) {
            enumC32045a2 = enumC32045a;
        }
        if (this.coldStartFeatures.contains(enumC32045a2.name()) || enumC32045a2 == EnumC32045a.HOME) {
            String strM41632K = m41632K(enumC32045a2.name(), cycleOrActivityId, presetQuestion);
            String strM41626E = m41626E(strM41632K);
            this.logger.mo85228t(AbstractC11266d.m30464r(AbstractC11895b.m32001t("UUID generated (coldStart/HOME) - source: '", source, "', cycleOrActivityId: '", cycleOrActivityId, "', seed: '"), strM41632K, "' → conversationId: '", strM41626E, "'"), new AbstractC30556a.a[0]);
            return strM41626E;
        }
        if (initialMessage != null) {
            String strM41632K2 = m41632K(initialMessage, cycleOrActivityId, presetQuestion);
            String strM41626E2 = m41626E(strM41632K2);
            this.logger.mo85228t(AbstractC11266d.m30464r(AbstractC11895b.m32001t("UUID generated (message) - initialMessage: '", AbstractC39414r.m125866L0(30, initialMessage), "...', cycleOrActivityId: '", cycleOrActivityId, "', seed: '"), strM41632K2, "' → conversationId: '", strM41626E2, "'"), new AbstractC30556a.a[0]);
            if (strM41626E2 != null) {
                return strM41626E2;
            }
        }
        String string = this.uuidGenerator.mo85405a().toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        this.logger.mo85228t(AbstractC11895b.m31996o("UUID generated (random) - conversationId: '", string, "'"), new AbstractC30556a.a[0]);
        return string;
    }

    /* JADX INFO: renamed from: K */
    private final String m41632K(String firstMessage, String conversationIdSeed, String presetQuestion) {
        return (!this.featureFlagChecker.isFeatureEnabled("hal-preset-questions") || presetQuestion == null) ? AbstractC25012a.m73373f(this.userId, firstMessage, conversationIdSeed) : AbstractC25012a.m73373f(this.userId, presetQuestion, conversationIdSeed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public final InterfaceC13058l m41633L(String initialMessage, String cycleOrActivityId, String presetQuestion, boolean hasLocationPermission) {
        StartConversationRequest startConversationRequest;
        if (initialMessage == null || initialMessage.length() == 0) {
            String string = this.uuidGenerator.mo85405a().toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            startConversationRequest = new StartConversationRequest(string, null);
        } else {
            String strM41626E = m41626E(m41632K(initialMessage, cycleOrActivityId, presetQuestion));
            String string2 = this.uuidGenerator.mo85405a().toString();
            AbstractC22676k.m65749i(string2, "toString(...)");
            startConversationRequest = new StartConversationRequest(strM41626E, new AiChatMessageRequestBody(string2, initialMessage, EnumC26800b.ASSISTANT.getValue(), false, (List) null, (Long) null, 48, (DefaultConstructorMarker) null));
        }
        return new C13015a0(new o(startConversationRequest, null), new n(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(startConversationRequest, 1), null, null, 3, null), new m(null, this.cachedApiSource)), this, initialMessage, cycleOrActivityId, hasLocationPermission));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x017b  */
    /* JADX WARN: Code duplicated, block: B:40:0x017f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0181  */
    /* JADX WARN: Code duplicated, block: B:43:0x0184  */
    /* JADX WARN: Code duplicated, block: B:44:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:51:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:53:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:56:0x020b  */
    /* JADX WARN: Code duplicated, block: B:57:0x020d  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: M */
    public final Object m41634M(String str, String str2, String str3, String str4, boolean z4, boolean z13, String str5, Map<String, ? extends JsonElement> map, Long l7, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        r rVar;
        EnumC32045a enumC32045a;
        EnumC32045a enumC32045a2;
        int i13;
        String strM41631J;
        String str6;
        String str7;
        boolean z14;
        String str8;
        Long l12;
        String str9;
        Map<String, ? extends JsonElement> map2;
        Location location;
        String str10;
        String str11;
        Object objMo42556a;
        boolean z15;
        String str12;
        Map<String, ? extends JsonElement> map3;
        AiChatMessage aiChatMessage;
        boolean z16;
        boolean z17;
        boolean z18 = z13;
        if (interfaceC30057d instanceof r) {
            rVar = (r) interfaceC30057d;
            int i14 = rVar.f53421O;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f53421O = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(interfaceC30057d);
            }
        } else {
            rVar = new r(interfaceC30057d);
        }
        Object obj = rVar.f53419M;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = rVar.f53421O;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            EnumC32045a enumC32045a3 = EnumC32045a.OVERVIEW;
            EnumC32045a[] enumC32045aArrValues = EnumC32045a.values();
            int length = enumC32045aArrValues.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length) {
                    enumC32045a = null;
                    break;
                }
                enumC32045a = enumC32045aArrValues[i16];
                if (AbstractC22676k.m65745e(enumC32045a.name(), str3)) {
                    break;
                }
                i16++;
            }
            enumC32045a2 = enumC32045a == null ? enumC32045a3 : enumC32045a;
            i13 = !this.coldStartFeatures.contains(str3) ? 1 : 0;
            strM41631J = m41631J(str, str2, str3, str4);
            if (z18) {
                InterfaceC14815c interfaceC14815c = this.locationManager;
                str11 = str;
                rVar.f53422w = str11;
                rVar.f53423x = str2;
                rVar.f53424y = str3;
                str7 = str4;
                rVar.f53425z = str7;
                str8 = str5;
                rVar.f53411E = str8;
                rVar.f53412F = map;
                l12 = l7;
                rVar.f53413G = l12;
                rVar.f53414H = enumC32045a2;
                rVar.f53415I = strM41631J;
                rVar.f53416J = z4;
                rVar.f53417K = z18;
                rVar.f53418L = i13;
                rVar.f53421O = 1;
                objMo42556a = interfaceC14815c.mo42556a(rVar);
                if (objMo42556a == enumC31071a) {
                    return enumC31071a;
                }
                z15 = z4;
                str12 = str2;
                map3 = map;
                str10 = str3;
            } else {
                str6 = str2;
                str7 = str4;
                z14 = z4;
                str8 = str5;
                l12 = l7;
                str9 = str;
                map2 = map;
                location = null;
                str10 = str3;
            }
            if (enumC32045a2 != EnumC32045a.CHAT_WITH_AGENT) {
                if (enumC32045a2 != EnumC32045a.OVERVIEW) {
                    str8 = str6;
                } else {
                    str8 = null;
                }
            }
            if (str9 != null) {
                aiChatMessage = new AiChatMessage(str9, (AiMessageStatus) null, EnumC26800b.ASSISTANT.getValue(), (String) null, (String) null, (List) null, false, (Boolean) null, (String) null, (String) null, (List) null, false, 4090, (DefaultConstructorMarker) null);
            } else {
                aiChatMessage = null;
            }
            if (map2.isEmpty()) {
                map2 = null;
            }
            AiChatMessage aiChatMessage2 = aiChatMessage;
            StartConversationV2Request startConversationV2Request = new StartConversationV2Request(strM41631J, new StartConversationV2RequestBody(aiChatMessage2, str8, enumC32045a2, str7, location, map2, l12));
            C14380k c14380kM36590P = AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(startConversationV2Request, 1), null, null, 3, null), new p(null, this.cachedApiSource));
            if (i13 != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z19 = z14;
            q qVar = new q(c14380kM36590P, this, str9, str6, str10, str7, z19, z18, z16);
            if (i13 != 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            return new C13015a0(new s(z17, z19, startConversationV2Request, null), qVar);
        }
        if (i15 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i17 = rVar.f53418L;
        z18 = rVar.f53417K;
        z15 = rVar.f53416J;
        strM41631J = (String) rVar.f53415I;
        enumC32045a2 = (EnumC32045a) rVar.f53414H;
        Long l13 = (Long) rVar.f53413G;
        map3 = (Map) rVar.f53412F;
        String str13 = (String) rVar.f53411E;
        String str14 = (String) rVar.f53425z;
        str10 = (String) rVar.f53424y;
        str12 = (String) rVar.f53423x;
        String str15 = (String) rVar.f53422w;
        AbstractC34132o.m107864I(obj);
        str8 = str13;
        str7 = str14;
        l12 = l13;
        str11 = str15;
        objMo42556a = obj;
        i13 = i17;
        C14814b c14814b = (C14814b) objMo42556a;
        boolean z24 = z18;
        if (c14814b != null) {
            map2 = map3;
            location = new Location(new Long(c14814b.getTimestamp()), new Double(c14814b.getLatitude()), new Double(c14814b.getLongitude()), new Double(c14814b.getAltitude()), new Double(c14814b.getHorizontalAccuracy()), new Double(c14814b.getCom.google.android.gms.location.FusedLocationProviderClient.KEY_VERTICAL_ACCURACY java.lang.String()));
            z18 = z24;
            i13 = i13;
            str7 = str7;
            z14 = z15;
            strM41631J = strM41631J;
            str6 = str12;
            l12 = l12;
            enumC32045a2 = enumC32045a2;
            str9 = str11;
        } else {
            map2 = map3;
            z14 = z15;
            str6 = str12;
            str9 = str11;
            location = null;
        }
        if (enumC32045a2 != EnumC32045a.CHAT_WITH_AGENT) {
            if (enumC32045a2 != EnumC32045a.OVERVIEW) {
                str8 = str6;
            } else {
                str8 = null;
            }
        }
        if (str9 != null) {
            aiChatMessage = new AiChatMessage(str9, (AiMessageStatus) null, EnumC26800b.ASSISTANT.getValue(), (String) null, (String) null, (List) null, false, (Boolean) null, (String) null, (String) null, (List) null, false, 4090, (DefaultConstructorMarker) null);
        } else {
            aiChatMessage = null;
        }
        if (map2.isEmpty()) {
            map2 = null;
        }
        AiChatMessage aiChatMessage3 = aiChatMessage;
        StartConversationV2Request startConversationV2Request2 = new StartConversationV2Request(strM41631J, new StartConversationV2RequestBody(aiChatMessage3, str8, enumC32045a2, str7, location, map2, l12));
        C14380k c14380kM36590P2 = AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(startConversationV2Request2, 1), null, null, 3, null), new p(null, this.cachedApiSource));
        if (i13 != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        boolean z110 = z14;
        q qVar2 = new q(c14380kM36590P2, this, str9, str6, str10, str7, z110, z18, z16);
        if (i13 != 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        return new C13015a0(new s(z17, z110, startConversationV2Request2, null), qVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0092  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: N */
    public final Object m41635N(String str, Uri uri, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        t tVar;
        String id4;
        C14564i c14564i;
        InterfaceC13075p1 interfaceC13075p1;
        C13045h2 c13045h2;
        Object value;
        LinkedHashMap linkedHashMap;
        if (interfaceC30057d instanceof t) {
            tVar = (t) interfaceC30057d;
            int i13 = tVar.f53435G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                tVar.f53435G = i13 - Integer.MIN_VALUE;
            } else {
                tVar = new t(interfaceC30057d);
            }
        } else {
            tVar = new t(interfaceC30057d);
        }
        t tVar2 = tVar;
        Object objM108729b = tVar2.f53433E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = tVar2.f53435G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            if (str != null) {
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = this.logger;
                u uVar = new u(str, null);
                tVar2.f53436w = null;
                tVar2.f53437x = uri;
                tVar2.f53438y = null;
                tVar2.f53439z = 0;
                tVar2.f53435G = 1;
                objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, uVar, tVar2, 6, null);
                if (objM108729b == enumC31071a) {
                    return enumC31071a;
                }
            }
            id4 = ((AiChatConversation) ((C13045h2) this.conversationFlow).getValue()).getId();
            c14564i = (C14564i) ((Map) ((C13045h2) this.imageUploadModelsFlow).getValue()).get(uri);
            if (c14564i != null) {
                this.analyticsHelper.m123053H(id4, c14564i);
            }
            interfaceC13075p1 = this.imageUploadModelsFlow;
            do {
                c13045h2 = (C13045h2) interfaceC13075p1;
                value = c13045h2.getValue();
                Map map = (Map) ((C13045h2) this.imageUploadModelsFlow).getValue();
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (!AbstractC22676k.m65745e(((C14564i) entry.getValue()).getUri(), uri)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            } while (!c13045h2.m36569i(value, linkedHashMap));
            return new C0456u(new C14558c((AiChatConversation) ((C13045h2) this.conversationFlow).getValue(), EnumC14565j.SUCCESS, null, null, false, AbstractC25265s.m74093D1(((Map) ((C13045h2) this.imageUploadModelsFlow).getValue()).values()), 28, null), 1);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        uri = (Uri) tVar2.f53437x;
        AbstractC34132o.m107864I(objM108729b);
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            this.analyticsHelper.m123057L((InterfaceC34385a.b) interfaceC34385a, "remove_image");
        }
        id4 = ((AiChatConversation) ((C13045h2) this.conversationFlow).getValue()).getId();
        c14564i = (C14564i) ((Map) ((C13045h2) this.imageUploadModelsFlow).getValue()).get(uri);
        if (c14564i != null) {
            this.analyticsHelper.m123053H(id4, c14564i);
        }
        interfaceC13075p1 = this.imageUploadModelsFlow;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            Map map2 = (Map) ((C13045h2) this.imageUploadModelsFlow).getValue();
            linkedHashMap = new LinkedHashMap();
            while (r1.hasNext()) {
                if (!AbstractC22676k.m65745e(((C14564i) entry.getValue()).getUri(), uri)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        } while (!c13045h2.m36569i(value, linkedHashMap));
        return new C0456u(new C14558c((AiChatConversation) ((C13045h2) this.conversationFlow).getValue(), EnumC14565j.SUCCESS, null, null, false, AbstractC25265s.m74093D1(((Map) ((C13045h2) this.imageUploadModelsFlow).getValue()).values()), 28, null), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public final C14558c m41636O(InterfaceC29354a<AiChatConversation> cacheSourceResult, boolean showKeyboardOnLaunch) {
        C13045h2 c13045h2;
        Object value;
        InterfaceC29354a.a.C42173a c42173a;
        if (cacheSourceResult instanceof InterfaceC29354a.a.C42173a) {
            InterfaceC13075p1 interfaceC13075p1 = this.conversationFlow;
            do {
                c13045h2 = (C13045h2) interfaceC13075p1;
                value = c13045h2.getValue();
                c42173a = (InterfaceC29354a.a.C42173a) cacheSourceResult;
            } while (!c13045h2.m36569i(value, (AiChatConversation) c42173a.getData()));
            return new C14558c((AiChatConversation) c42173a.getData(), EnumC14565j.SUCCESS, null, null, showKeyboardOnLaunch, null, 44, null);
        }
        if (cacheSourceResult instanceof InterfaceC29354a.a.b) {
            return new C14558c((AiChatConversation) ((InterfaceC29354a.a.b) cacheSourceResult).getData(), EnumC14565j.LOADING, null, null, showKeyboardOnLaunch, null, 44, null);
        }
        if (cacheSourceResult instanceof InterfaceC29354a.e) {
            return new C14558c((AiChatConversation) ((C13045h2) this.conversationFlow).getValue(), EnumC14565j.LOADING, null, null, showKeyboardOnLaunch, null, 44, null);
        }
        if (!(cacheSourceResult instanceof InterfaceC29354a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        this.analyticsHelper.m123070h(((AiChatConversation) ((C13045h2) this.conversationFlow).getValue()).getId(), true);
        return new C14558c((AiChatConversation) ((C13045h2) this.conversationFlow).getValue(), EnumC14565j.ERROR, null, null, showKeyboardOnLaunch, null, 44, null);
    }

    /* JADX INFO: renamed from: P */
    private final InterfaceC13058l m41637P(String messageContent, boolean isSuggestion, String messageId, List<? extends Uri> imageUris, List<String> fileIds, Long timestamp, boolean isVoiceInput, C14567l retryAnalyticsData) {
        String str;
        boolean z4;
        AiChatMessage aiChatMessageM41642U;
        if (retryAnalyticsData != null) {
            this.analyticsHelper.m123080r(retryAnalyticsData.getRole(), retryAnalyticsData.getMessageType(), retryAnalyticsData.getFailureReason());
        }
        if (messageId == null) {
            String string = this.uuidGenerator.mo85405a().toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            str = string;
        } else {
            str = messageId;
        }
        String str2 = str;
        AiChatMessageRequestBody aiChatMessageRequestBody = new AiChatMessageRequestBody(str2, messageContent, EnumC26800b.USER.getValue(), isSuggestion, fileIds == null ? C25271y.f99162w : fileIds, timestamp);
        SendMessageRequest sendMessageRequest = new SendMessageRequest(((AiChatConversation) ((C13045h2) this.conversationFlow).getValue()).getId(), aiChatMessageRequestBody);
        if (messageId == null) {
            AiChatMessage chatMessage = ConversationRequestsKt.toChatMessage(aiChatMessageRequestBody);
            if (imageUris != null && (aiChatMessageM41642U = m41642U(chatMessage, imageUris)) != null) {
                chatMessage = aiChatMessageM41642U;
            }
            m41624C(chatMessage);
            C38423a c38423a = this.analyticsHelper;
            String id4 = ((AiChatConversation) ((C13045h2) this.conversationFlow).getValue()).getId();
            List<AiChatMessage> messages = ((AiChatConversation) ((C13045h2) this.conversationFlow).getValue()).getMessages();
            int i13 = 0;
            if (!(messages instanceof Collection) || !messages.isEmpty()) {
                Iterator<T> it = messages.iterator();
                while (it.hasNext()) {
                    if (AbstractC22676k.m65745e(((AiChatMessage) it.next()).getRole(), EnumC26800b.USER.getValue()) && (i13 = i13 + 1) < 0) {
                        AbstractC37056f.m118976c0();
                        throw null;
                    }
                }
            }
            z4 = isVoiceInput;
            c38423a.m123083u(id4, i13, str2, z4);
        } else {
            z4 = isVoiceInput;
        }
        return new w(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(sendMessageRequest, 1), null, null, 3, null), new v(null, this.cachedApiSource)), this, z4, messageContent, fileIds, isSuggestion, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ InterfaceC13058l m41638Q(C14557b c14557b, String str, boolean z4, String str2, List list, List list2, Long l7, boolean z13, C14567l c14567l, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        if ((i13 & 4) != 0) {
            str2 = null;
        }
        if ((i13 & 8) != 0) {
            list = null;
        }
        if ((i13 & 16) != 0) {
            list2 = null;
        }
        if ((i13 & 32) != 0) {
            l7 = null;
        }
        if ((i13 & 64) != 0) {
            z13 = false;
        }
        if ((i13 & 128) != 0) {
            c14567l = null;
        }
        return c14557b.m41637P(str, z4, str2, list, list2, l7, z13, c14567l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public final Object m41639R(String str, String str2, String str3, String str4, boolean z4, boolean z13, String str5, Map<String, ? extends JsonElement> map, Long l7, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        C13045h2 c13045h2;
        Object value;
        String string;
        Object getConversationRequest;
        InterfaceC13075p1 interfaceC13075p1 = this.sourceOnFlow;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, str3));
        InterfaceC13075p1 interfaceC13075p2 = this.presetQuestionFlow;
        while (true) {
            C13045h2 c13045h3 = (C13045h2) interfaceC13075p2;
            Object value2 = c13045h3.getValue();
            if (c13045h3.m36569i(value2, str4)) {
                break;
            }
            str = str;
            str2 = str2;
            str3 = str3;
            str4 = str4;
        }
        boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HAL_ADDITIONAL_CONTEXT_CONTRACT);
        if ((str == null || str.length() == 0) && !this.coldStartFeatures.contains(str3) && !AbstractC22676k.m65745e(str3, "HOME")) {
            return zIsFeatureEnabled ? m41634M(str, str2, str3, str4, z4, z13, str5, map, l7, interfaceC30057d) : m41633L(str, str2, str4, z13);
        }
        if (zIsFeatureEnabled) {
            getConversationRequest = new GetConversationV2Request(m41631J(str, str2, str3, str4));
        } else {
            if (str == null || (string = m41626E(m41632K(str, str2, str4))) == null) {
                string = this.uuidGenerator.mo85405a().toString();
                AbstractC22676k.m65749i(string, "toString(...)");
            }
            getConversationRequest = new GetConversationRequest(string);
        }
        return AbstractC13091v.m36590P(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(getConversationRequest, 1), null, null, 3, null), new x(null, this.cachedApiSource)), new y(null, zIsFeatureEnabled, this, str, str2, str3, str4, z4, z13, str5, map, l7, !this.coldStartFeatures.contains(str3)));
    }

    /* JADX INFO: renamed from: S */
    private final AiChatConversation m41640S(AiChatConversation conversation) {
        AiChatMessage latestAssistantResponse;
        return (AiChatConversationKt.getLatestAssistantResponse(conversation) == null || (latestAssistantResponse = AiChatConversationKt.getLatestAssistantResponse(conversation)) == null) ? conversation : AiChatConversationKt.replaceLatestResponse(conversation, AiChatMessage.copy$default(latestAssistantResponse, latestAssistantResponse.getContent(), AiMessageStatus.STOPPED, latestAssistantResponse.getRole(), latestAssistantResponse.getId(), null, latestAssistantResponse.getAdditionalContext(), false, null, null, null, null, true, ErrorCodes.InitAPIErrors.cServerErrors, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public final InterfaceC13058l m41641T() {
        AiChatMessage aiChatMessagePrevious;
        C13045h2 c13045h2;
        Object value;
        List<AiChatMessage> messages = ((AiChatConversation) ((C13045h2) this.conversationFlow).getValue()).getMessages();
        ListIterator<AiChatMessage> listIterator = messages.listIterator(messages.size());
        do {
            if (!listIterator.hasPrevious()) {
                aiChatMessagePrevious = null;
                break;
            }
            aiChatMessagePrevious = listIterator.previous();
        } while (aiChatMessagePrevious.getMessageStatus() != AiMessageStatus.ACTIVE);
        AiChatMessage aiChatMessage = aiChatMessagePrevious;
        String id4 = ((AiChatConversation) ((C13045h2) this.conversationFlow).getValue()).getId();
        if (aiChatMessage != null) {
            String id5 = aiChatMessage.getId();
            String content = aiChatMessage.getContent();
            String role = aiChatMessage.getRole();
            Boolean boolIsSuggestion = aiChatMessage.isSuggestion();
            AbstractC3006f0.m8732z(this.coroutineScope, null, null, new z(id4, new AiChatMessageRequestBody(id5, content, role, boolIsSuggestion != null ? boolIsSuggestion.booleanValue() : false, (List) null, (Long) null, 48, (DefaultConstructorMarker) null), null), 3);
        }
        InterfaceC13075p1 interfaceC13075p1 = this.conversationFlow;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, m41640S((AiChatConversation) value)));
        return m41630I();
    }

    /* JADX INFO: renamed from: U */
    private final AiChatMessage m41642U(AiChatMessage message, List<? extends Uri> imageUris) {
        List<? extends Uri> list = imageUris;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String string = ((Uri) it.next()).toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            arrayList.add(new ArticleTileModel("", "", (String) null, string, ArticleTileTypeDtoEnum.IMAGE_ONLY, "SMALL", (String) null, (String) null, (String) null, (String) null, (String) null, (ArticleTileModelEventEnum) null, (Integer) null, (TileBorderStyle) null, (GenericInteraction) null, (AnalyticEventModel) null, 61444, (DefaultConstructorMarker) null));
        }
        return AiChatMessage.copy$default(message, null, null, null, null, null, arrayList, false, null, null, null, null, false, 4063, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public final InterfaceC13058l m41643V(List<? extends Uri> imageUris) {
        InterfaceC13058l interfaceC13058lM36579E = AbstractC13091v.m36579E(4, new a0(null), new C3383g(imageUris, 1));
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC13091v.m36580F(interfaceC13058lM36579E, ExecutorC22364d.f87316w);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(new C13015a0(new k(null), AbstractC13091v.m36590P(upstream, new i(null, this))), new j(null, this));
    }

    public /* synthetic */ C14557b(AiConversationApi aiConversationApi, InterfaceC28215x1 interfaceC28215x1, int i13, InterfaceC34116n interfaceC34116n, C4797c c4797c, InterfaceC26834e interfaceC26834e, C34387c c34387c, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 interfaceC2994c0, C38423a c38423a, InterfaceC14815c interfaceC14815c, C14563h c14563h, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(aiConversationApi, interfaceC28215x1, i13, (i14 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AiConversationInteractor") : interfaceC34116n, c4797c, interfaceC26834e, c34387c, featureFlagChecker, interfaceC2994c0, c38423a, interfaceC14815c, c14563h);
    }
}
