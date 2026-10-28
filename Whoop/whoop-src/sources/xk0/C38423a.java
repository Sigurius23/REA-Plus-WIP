package xk0;

import com.whoop.metrics.domain.models.MetricPostType;
import com.whoop.navigation.AppScreen;
import com.whoop.service.network.model.UserState;
import fi0.InterfaceC14515a;
import fl0.C14564i;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.models.MessageType;
import iy1.InterfaceC21030c;
import java.time.Clock;
import java.util.Locale;
import jy1.C22047a;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25247g0;
import m83.C25271y;
import m83.C25272z;
import or2.AbstractC28182m1;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import t83.InterfaceC33616a;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import wb3.AbstractC37056f;
import y82.EnumC39339b;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: xk0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u0001ZBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b!\u0010 J\u0015\u0010\"\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010 J\r\u0010#\u001a\u00020\u0010¢\u0006\u0004\b#\u0010\u0012J\u001d\u0010%\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004¢\u0006\u0004\b%\u0010\u001eJ\r\u0010&\u001a\u00020\u0010¢\u0006\u0004\b&\u0010\u0012J\u001d\u0010*\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0010¢\u0006\u0004\b,\u0010\u0012J-\u0010.\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00042\u0006\u0010-\u001a\u00020(¢\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004¢\u0006\u0004\b0\u0010\u001eJ\u001d\u00102\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u00101\u001a\u00020(¢\u0006\u0004\b2\u0010+J\u001d\u00106\u001a\u00020\u00102\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u0004¢\u0006\u0004\b6\u00107J!\u0010:\u001a\u00020\u00102\n\u00109\u001a\u0006\u0012\u0002\b\u0003082\u0006\u00105\u001a\u00020\u0004¢\u0006\u0004\b:\u0010;J!\u0010?\u001a\u00020\u00102\n\u0010>\u001a\u00060<j\u0002`=2\u0006\u00105\u001a\u00020\u0004¢\u0006\u0004\b?\u0010@J!\u0010B\u001a\u00020\u00102\n\u00109\u001a\u0006\u0012\u0002\b\u00030A2\u0006\u00105\u001a\u00020\u0004¢\u0006\u0004\bB\u0010CJ\u0015\u0010D\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\bD\u0010 J%\u0010H\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020(¢\u0006\u0004\bH\u0010IJ\u0015\u0010L\u001a\u00020\u00102\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020\u0010¢\u0006\u0004\bN\u0010\u0012J\u0015\u0010P\u001a\u00020\u00102\u0006\u0010O\u001a\u00020(¢\u0006\u0004\bP\u0010QJ\u0015\u0010R\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\bR\u0010 J/\u0010V\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010S\u001a\u00020(2\b\u0010T\u001a\u0004\u0018\u00010\u00042\u0006\u0010U\u001a\u00020(¢\u0006\u0004\bV\u0010WJ\r\u0010X\u001a\u00020\u0010¢\u0006\u0004\bX\u0010\u0012J\r\u0010Y\u001a\u00020\u0010¢\u0006\u0004\bY\u0010\u0012J\r\u0010Z\u001a\u00020\u0010¢\u0006\u0004\bZ\u0010\u0012J\u0018\u0010[\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b[\u0010\\J\u0018\u0010]\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b]\u0010\\J \u0010_\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010^\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b_\u0010`J\u001d\u0010c\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010b\u001a\u00020a¢\u0006\u0004\bc\u0010dJ\u001d\u0010f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010e\u001a\u00020(¢\u0006\u0004\bf\u0010+J\u001d\u0010i\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010h\u001a\u00020g¢\u0006\u0004\bi\u0010jJ\u001d\u0010k\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004¢\u0006\u0004\bk\u0010\u001eJ\u0015\u0010l\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\bl\u0010 J%\u0010p\u001a\u00020\u00102\u0006\u0010m\u001a\u00020\u00042\u0006\u0010n\u001a\u00020\u00042\u0006\u0010o\u001a\u00020\u0004¢\u0006\u0004\bp\u0010qJ\u0015\u0010r\u001a\u00020\u00102\u0006\u0010o\u001a\u00020\u0004¢\u0006\u0004\br\u0010 J\r\u0010s\u001a\u00020\u0010¢\u0006\u0004\bs\u0010\u0012J\u0015\u0010t\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\bt\u0010 J\u0013\u0010u\u001a\u00020\u0004*\u00020JH\u0002¢\u0006\u0004\bu\u0010vJ\u000f\u0010w\u001a\u00020\u0010H\u0002¢\u0006\u0004\bw\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010xR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010yR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010yR\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010yR\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010yR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010zR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010{R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010yR\u0014\u0010|\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\bl\u0010yR\u0014\u0010}\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\bH\u0010yR\u0014\u0010~\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\bs\u0010yR\u0014\u0010\u007f\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\bD\u0010yR\u0015\u0010\u0080\u0001\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\bL\u0010yR\u0015\u0010\u0081\u0001\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\bP\u0010yR\u0017\u0010\u0084\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b&\u0010\u0083\u0001R\u0015\u0010\u0085\u0001\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010yR\u0015\u0010\u0086\u0001\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010yR\u0015\u0010\u0087\u0001\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\bp\u0010yR\u0015\u0010\u0088\u0001\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\bV\u0010yR\u0015\u0010\u0089\u0001\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b0\u0010yR\u0015\u0010\u008a\u0001\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b.\u0010yR\u0015\u0010\u008b\u0001\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010yR\u0015\u0010\u008c\u0001\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010yR\u0015\u0010\u008d\u0001\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\bw\u0010yR\u0015\u0010\u008e\u0001\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\bY\u0010yR\u0015\u0010\u008f\u0001\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010yR\u001a\u0010\u0091\u0001\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b%\u0010\u0090\u0001R\u0015\u0010\u0092\u0001\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010yR\u0015\u0010\u0093\u0001\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010y¨\u0006\u0094\u0001"}, m65681d2 = {"Lxk0/a;", "", "Lfi0/a;", "analytics", "", "sourcePillar", "sourceType", "presetQuestion", "sourceId", "Ljava/time/Clock;", "clock", "Liy1/c;", "metricWriter", "source", "<init>", "(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/Clock;Liy1/c;Ljava/lang/String;)V", "Ll83/a0;", "p", "()V", "conversationId", "", "index", "messageCount", "B", "(Ljava/lang/String;II)V", "variant", "suggestionCount", "D", "(Ljava/lang/String;Ljava/lang/String;I)V", "C", "(Ljava/lang/String;Ljava/lang/String;)V", "c", "(Ljava/lang/String;)V", "e", "q", "z", "messageId", "A", "o", "key", "", "enabled", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/lang/String;Z)V", "v", "isVoiceInput", "u", "(Ljava/lang/String;ILjava/lang/String;Z)V", "t", MessageType.FAILED, StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lxk0/d;", "failureType", "context", "J", "(Lxk0/d;Ljava/lang/String;)V", "Lu02/a$b;", "error", "L", "(Lu02/a$b;Ljava/lang/String;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "M", "(Ljava/lang/Exception;Ljava/lang/String;)V", "Lpm0/a$b;", "K", "(Lpm0/a$b;Ljava/lang/String;)V", "l", "Lxk0/a$a;", "action", "manual", "j", "(Ljava/lang/String;Lxk0/a$a;Z)V", "Lcom/whoop/navigation/AppScreen;", HMSTrackSource.SCREEN, "m", "(Lcom/whoop/navigation/AppScreen;)V", "b", "goToSettings", "n", "(Z)V", "d", "committed", "title", "fromGhostTile", "s", "(Ljava/lang/String;ZLjava/lang/String;Z)V", "E", "y", "a", "Q", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "O", "method", "P", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "value", "G", "(Ljava/lang/String;J)V", "isError", "I", "Lfl0/i;", "uploadModel", "H", "(Ljava/lang/String;Lfl0/i;)V", "g", "i", "role", "messageType", "failureReason", "r", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "N", "k", "f", "F", "(Lcom/whoop/navigation/AppScreen;)Ljava/lang/String;", "x", "Lfi0/a;", "Ljava/lang/String;", "Ljava/time/Clock;", "Liy1/c;", "actionOptIn", "valueGoToSettings", "valueGetStarted", "ACTION_BUILD_NEW_WORKOUT", "SOURCE_AI_CREATE_WORKOUT", "isPresetKey", "Ltr2/n;", "Ltr2/n;", "logger", "coachMetricName", "actionImageUploadSuccess", "actionImageUploadFailure", "actionImageUploadMethod", "emptyCompleteMessage", "messageIdProperty", "memberResponse", "botResponse", "inputType", "pushToTalk", "text", "Ljava/lang/Long;", "conversationStartTime", "conversationIdProperty", "agentId", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38423a {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private Long conversationStartTime;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final String conversationIdProperty;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final String agentId;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String sourcePillar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String sourceType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String presetQuestion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String sourceId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String actionOptIn;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String valueGoToSettings;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String valueGetStarted;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final String ACTION_BUILD_NEW_WORKOUT;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final String SOURCE_AI_CREATE_WORKOUT;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final String isPresetKey;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final String coachMetricName;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final String actionImageUploadSuccess;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final String actionImageUploadFailure;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final String actionImageUploadMethod;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final String emptyCompleteMessage;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final String messageIdProperty;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final String memberResponse;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String botResponse;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final String inputType;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String pushToTalk;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: xk0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m65681d2 = {"Lxk0/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "OPEN", "CLOSE", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum a {
        OPEN,
        CLOSE;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    public C38423a(InterfaceC14515a analytics, String sourcePillar, String sourceType, String presetQuestion, String sourceId, Clock clock, InterfaceC21030c metricWriter, String source) {
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(sourcePillar, "sourcePillar");
        AbstractC22676k.m65750j(sourceType, "sourceType");
        AbstractC22676k.m65750j(presetQuestion, "presetQuestion");
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(source, "source");
        this.analytics = analytics;
        this.sourcePillar = sourcePillar;
        this.sourceType = sourceType;
        this.presetQuestion = presetQuestion;
        this.sourceId = sourceId;
        this.clock = clock;
        this.metricWriter = metricWriter;
        this.source = source;
        this.actionOptIn = "Onboarding Opt-In";
        this.valueGoToSettings = "Go to Settings";
        this.valueGetStarted = "Get Started";
        this.ACTION_BUILD_NEW_WORKOUT = "Build New Workout";
        this.SOURCE_AI_CREATE_WORKOUT = "AI_create_workout";
        this.isPresetKey = "is_preset";
        this.logger = InterfaceC34116n.INSTANCE.m107848a("AiConversationAnalyticsHelper");
        this.coachMetricName = "whoop.ai.conversation";
        this.actionImageUploadSuccess = "image_upload_success";
        this.actionImageUploadFailure = "image_upload_failure";
        this.actionImageUploadMethod = "image_upload_method";
        this.emptyCompleteMessage = "emptyCompleteMessage";
        this.messageIdProperty = "message_id";
        this.memberResponse = "Member Response";
        this.botResponse = "Bot Response";
        this.inputType = "input-type";
        this.pushToTalk = "push_to_talk";
        this.text = "text";
        this.conversationIdProperty = "conversation_id";
        this.agentId = "agent_id";
    }

    /* JADX INFO: renamed from: F */
    private final String m123045F(AppScreen appScreen) {
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9437v5.f27996w)) {
            return "workout_builder_screen";
        }
        String lowerCase = appScreen.getName().toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* JADX INFO: renamed from: x */
    private final void m123046x() {
        Long lValueOf = Long.valueOf(this.clock.millis());
        this.conversationStartTime = lValueOf;
        this.logger.mo85228t("Conversation timer started at: " + lValueOf, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: A */
    public final void m123047A(String conversationId, String messageId) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        AbstractC22676k.m65750j(messageId, "messageId");
        InterfaceC14515a.m41418i(this.analytics, null, "Stop Generating", null, "AI Coach", null, AbstractC25247g0.m73990Y(new C23465k("message_id", messageId), new C23465k(this.conversationIdProperty, conversationId)), 21, null);
    }

    /* JADX INFO: renamed from: B */
    public final void m123048B(String conversationId, int index, int messageCount) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        String strM85299a = this.source;
        if (strM85299a.length() == 0) {
            strM85299a = AbstractC28182m1.m85299a(this.sourcePillar);
        }
        InterfaceC14515a.m41418i(this.analytics, null, "Suggestion Selected", String.valueOf(index), "AI Coach", String.valueOf(messageCount), AbstractC25247g0.m73990Y(new C23465k("source", strM85299a), new C23465k("source_type", this.sourceType), new C23465k(this.conversationIdProperty, conversationId)), 1, null);
    }

    /* JADX INFO: renamed from: C */
    public final void m123049C(String conversationId, String variant) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        AbstractC22676k.m65750j(variant, "variant");
        String strM85299a = this.source;
        if (strM85299a.length() == 0) {
            strM85299a = AbstractC28182m1.m85299a(this.sourcePillar);
        }
        InterfaceC14515a.m41418i(this.analytics, null, "Suggestions Scrolled", variant, "AI Coach", null, AbstractC25247g0.m73990Y(new C23465k("source", strM85299a), new C23465k("source_type", this.sourceType), new C23465k(this.conversationIdProperty, conversationId), new C23465k("variant", variant)), 17, null);
    }

    /* JADX INFO: renamed from: D */
    public final void m123050D(String conversationId, String variant, int suggestionCount) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        AbstractC22676k.m65750j(variant, "variant");
        String strM85299a = this.source;
        if (strM85299a.length() == 0) {
            strM85299a = AbstractC28182m1.m85299a(this.sourcePillar);
        }
        InterfaceC14515a.m41418i(this.analytics, null, "Suggestions Shown", variant, "AI Coach", String.valueOf(suggestionCount), AbstractC25247g0.m73990Y(new C23465k("source", strM85299a), new C23465k("source_type", this.sourceType), new C23465k(this.conversationIdProperty, conversationId), new C23465k("variant", variant)), 1, null);
    }

    /* JADX INFO: renamed from: E */
    public final void m123051E() {
        InterfaceC14515a.m41418i(this.analytics, null, "swipe_activity", null, "AI Coach", null, null, 53, null);
    }

    /* JADX INFO: renamed from: G */
    public final void m123052G(String conversationId, long value) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        this.analytics.mo41422d("latency_abandon", "exit", "coach_latency", "AI Coach", String.valueOf(value), AbstractC31061c.m95645u(this.conversationIdProperty, conversationId));
    }

    /* JADX INFO: renamed from: H */
    public final void m123053H(String conversationId, C14564i uploadModel) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        AbstractC22676k.m65750j(uploadModel, "uploadModel");
        m123054I(conversationId, uploadModel.getIsError());
    }

    /* JADX INFO: renamed from: I */
    public final void m123054I(String conversationId, boolean isError) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        InterfaceC14515a.m41418i(this.analytics, null, "image_deleted", isError ? "upload_failure" : "upload_success", "AI Coach", null, AbstractC31061c.m95645u(this.conversationIdProperty, conversationId), 17, null);
    }

    /* JADX INFO: renamed from: J */
    public final void m123055J(AbstractC38426d failureType, String context) {
        AbstractC22676k.m65750j(failureType, "failureType");
        AbstractC22676k.m65750j(context, "context");
        InterfaceC14515a.m41418i(this.analytics, null, "network_failure", null, "AI Coach", null, AbstractC25247g0.m73990Y(new C23465k("failure_type", failureType.getAnalyticsString()), new C23465k("context", context)), 21, null);
        this.logger.mo85228t(AbstractC31061c.m95640p("Network failure tracked: ", failureType.getAnalyticsString(), ", context: ", context), new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: K */
    public final void m123056K(InterfaceC29354a.b<?> error, String context) {
        AbstractC22676k.m65750j(error, "error");
        AbstractC22676k.m65750j(context, "context");
        m123055J(C38425c.f164569a.m123102b(error), context);
    }

    /* JADX INFO: renamed from: L */
    public final void m123057L(InterfaceC34385a.b<?> error, String context) {
        AbstractC22676k.m65750j(error, "error");
        AbstractC22676k.m65750j(context, "context");
        m123055J(C38425c.f164569a.m123103c(error), context);
    }

    /* JADX INFO: renamed from: M */
    public final void m123058M(Exception exception, String context) {
        AbstractC22676k.m65750j(exception, "exception");
        AbstractC22676k.m65750j(context, "context");
        m123055J(C38425c.f164569a.m123101a(exception), context);
    }

    /* JADX INFO: renamed from: N */
    public final void m123059N(String failureReason) {
        AbstractC22676k.m65750j(failureReason, "failureReason");
        this.analytics.mo41422d(UserState.Sources.USER, "message_failure", "voice", "AI Coach", failureReason, C25272z.f99163w);
    }

    /* JADX INFO: renamed from: O */
    public final Object m123060O(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        InterfaceC14515a.m41418i(this.analytics, null, this.actionImageUploadFailure, null, "AI Coach", null, AbstractC31061c.m95645u(this.conversationIdProperty, str), 21, null);
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, AbstractC18489d0.m53370k(this.coachMetricName, ".", this.actionImageUploadFailure), null, C25271y.f99162w, MetricPostType.COUNT, 5, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: P */
    public final Object m123061P(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        InterfaceC14515a.m41418i(this.analytics, null, this.actionImageUploadMethod, null, "AI Coach", null, AbstractC25247g0.m73990Y(new C23465k("upload_method", str2), new C23465k(this.conversationIdProperty, str)), 21, null);
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, AbstractC18489d0.m53370k(this.coachMetricName, ".", this.actionImageUploadMethod), null, AbstractC31061c.m95644t("method:", str2), MetricPostType.COUNT, 5, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q */
    public final Object m123062Q(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        InterfaceC14515a.m41418i(this.analytics, null, this.actionImageUploadSuccess, null, "AI Coach", null, AbstractC31061c.m95645u(this.conversationIdProperty, str), 21, null);
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, AbstractC18489d0.m53370k(this.coachMetricName, ".", this.actionImageUploadSuccess), null, C25271y.f99162w, MetricPostType.COUNT, 5, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a */
    public final void m123063a() {
        InterfaceC14515a.m41418i(this.analytics, null, "edit_sleep_schedule", null, "AI Coach", null, null, 53, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m123064b() {
        InterfaceC14515a.m41418i(this.analytics, null, this.ACTION_BUILD_NEW_WORKOUT, null, "Workout Builder", null, AbstractC31061c.m95645u("source", this.SOURCE_AI_CREATE_WORKOUT), 21, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m123065c(String conversationId) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        InterfaceC14515a.m41418i(this.analytics, null, "Opened History", null, "AI Coach", null, AbstractC31061c.m95645u(this.conversationIdProperty, conversationId), 21, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m123066d(String conversationId) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        InterfaceC14515a.m41418i(this.analytics, null, "Message Copied", null, "AI Coach", null, AbstractC31061c.m95645u(this.conversationIdProperty, conversationId), 21, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m123067e(String conversationId) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        InterfaceC14515a.m41418i(this.analytics, null, "Deleted Conversation", null, "AI Coach", null, AbstractC31061c.m95645u(this.conversationIdProperty, conversationId), 21, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m123068f(String conversationId) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        InterfaceC14515a.m41418i(this.analytics, null, "disabled_input_tapped", null, "AI Coach", null, AbstractC31061c.m95645u(this.conversationIdProperty, conversationId), 21, null);
        this.metricWriter.mo58701b(new C22047a(0, AbstractC2875y.m8299l(this.coachMetricName, ".disabled_input_tapped"), null, C25271y.f99162w, MetricPostType.COUNT, 5, null));
    }

    /* JADX INFO: renamed from: g */
    public final void m123069g(String conversationId, String messageId) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        AbstractC22676k.m65750j(messageId, "messageId");
        InterfaceC14515a.m41418i(this.analytics, null, "Empty Complete Message", null, "AI Coach", null, AbstractC25247g0.m73990Y(new C23465k(this.conversationIdProperty, conversationId), new C23465k(this.messageIdProperty, messageId)), 21, null);
        this.metricWriter.mo58701b(new C22047a(0, AbstractC18489d0.m53370k(this.coachMetricName, ".", this.emptyCompleteMessage), null, C25271y.f99162w, MetricPostType.COUNT, 5, null));
    }

    /* JADX INFO: renamed from: h */
    public final void m123070h(String conversationId, boolean failed) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        InterfaceC14515a.m41418i(this.analytics, null, "Error Message Displayed", null, "AI Coach", failed ? EnumC39339b.RESULT_FAILURE : "Slow", AbstractC31061c.m95645u(this.conversationIdProperty, conversationId), 5, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m123071i(String conversationId) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        InterfaceC14515a.m41418i(this.analytics, "conversation_exited", "exit", null, "AI Coach", null, AbstractC31061c.m95645u(this.conversationIdProperty, conversationId), 20, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m123072j(String conversationId, a action, boolean manual) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        AbstractC22676k.m65750j(action, "action");
        InterfaceC14515a.m41418i(this.analytics, null, action == a.OPEN ? "Keyboard Enabled" : "Keyboard Dismissed", null, "AI Coach", null, AbstractC25247g0.m73990Y(new C23465k("source", manual ? "manual" : "automatic"), new C23465k("source_type", this.sourceType), new C23465k(this.conversationIdProperty, conversationId)), 21, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m123073k() {
        this.metricWriter.mo58701b(new C22047a(0, "whoop.ai.chat_version.resolution", null, AbstractC37056f.m118959K("backend_intent:v1", "resolved_version:v1", "is_mismatch:false"), MetricPostType.COUNT, 5, null));
    }

    /* JADX INFO: renamed from: l */
    public final void m123074l(String conversationId) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        InterfaceC14515a.m41418i(this.analytics, null, "MS Link Clicked", null, "AI Coach", null, AbstractC31061c.m95645u(this.conversationIdProperty, conversationId), 21, null);
    }

    /* JADX INFO: renamed from: m */
    public final void m123075m(AppScreen screen) {
        AbstractC22676k.m65750j(screen, "screen");
        InterfaceC14515a.m41418i(this.analytics, null, "Navigation Link Clicked", m123045F(screen), "AI Coach", null, null, 49, null);
    }

    /* JADX INFO: renamed from: n */
    public final void m123076n(boolean goToSettings) {
        InterfaceC14515a.m41418i(this.analytics, null, this.actionOptIn, null, "AI Coach", goToSettings ? this.valueGoToSettings : this.valueGetStarted, null, 37, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m123077o() {
        InterfaceC14515a.m41418i(this.analytics, null, "Article Open", null, "AI Coach", null, null, 53, null);
    }

    /* JADX INFO: renamed from: p */
    public final void m123078p() {
        m123046x();
        InterfaceC14515a interfaceC14515a = this.analytics;
        String strM85299a = this.source;
        if (strM85299a.length() == 0) {
            strM85299a = AbstractC28182m1.m85299a(this.sourcePillar);
        }
        InterfaceC14515a.m41418i(interfaceC14515a, null, "Open", null, "AI Coach", null, AbstractC25247g0.m73990Y(new C23465k("source", strM85299a), new C23465k("source_type", this.sourceType), new C23465k("preset question type", this.presetQuestion)), 21, null);
        boolean z4 = this.presetQuestion.length() > 0;
        String str = z4 ? "bot_response" : "member_response";
        InterfaceC14515a interfaceC14515a2 = this.analytics;
        String str2 = this.source;
        if (str2.length() == 0) {
            str2 = this.sourceId;
        }
        InterfaceC14515a.m41418i(interfaceC14515a2, null, str, null, "AI Coach", null, AbstractC25247g0.m73993b0(new C23465k("source", str2), new C23465k(this.isPresetKey, Boolean.valueOf(z4)), new C23465k("preset question type", this.presetQuestion)), 21, null);
        InterfaceC14515a interfaceC14515a3 = this.analytics;
        String str3 = this.source;
        if (str3.length() == 0) {
            str3 = this.sourceId;
        }
        InterfaceC14515a.m41418i(interfaceC14515a3, "Chat Entry", "Chat Entered", null, "AI Coach", null, AbstractC25247g0.m73993b0(new C23465k("source", str3), new C23465k("source_type", this.sourceType), new C23465k(AbstractC39421y.m125926K("preset question type", " ", "_", false), this.presetQuestion), new C23465k(this.agentId, this.sourceId)), 20, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m123079q(String conversationId) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        InterfaceC14515a.m41418i(this.analytics, null, "Accessed Old Conversation", null, "AI Coach", null, AbstractC31061c.m95645u(this.conversationIdProperty, conversationId), 21, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m123080r(String role, String messageType, String failureReason) {
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(messageType, "messageType");
        AbstractC22676k.m65750j(failureReason, "failureReason");
        this.analytics.mo41422d(role, "retry", messageType, "AI Coach", failureReason, C25272z.f99163w);
    }

    /* JADX INFO: renamed from: s */
    public final void m123081s(String conversationId, boolean committed, String title, boolean fromGhostTile) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        InterfaceC14515a.m41418i(this.analytics, null, committed ? "commit_activity" : "uncommit_activity", title, "AI Coach", null, AbstractC25247g0.m73990Y(new C23465k(this.conversationIdProperty, conversationId), new C23465k("source", fromGhostTile ? "ghost_tile_coach" : null)), 17, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m123082t(String conversationId, String messageId) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        AbstractC22676k.m65750j(messageId, "messageId");
        InterfaceC14515a.m41418i(this.analytics, null, this.botResponse, null, "AI Coach", null, AbstractC25247g0.m73990Y(new C23465k(this.agentId, this.sourceId), new C23465k(this.conversationIdProperty, conversationId), new C23465k(this.messageIdProperty, messageId)), 21, null);
    }

    /* JADX INFO: renamed from: u */
    public final void m123083u(String conversationId, int messageCount, String messageId, boolean isVoiceInput) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        AbstractC22676k.m65750j(messageId, "messageId");
        String strM85299a = this.source;
        if (strM85299a.length() == 0) {
            strM85299a = AbstractC28182m1.m85299a(this.sourcePillar);
        }
        InterfaceC14515a.m41418i(this.analytics, null, this.memberResponse, null, "AI Coach", String.valueOf(messageCount), AbstractC25247g0.m73990Y(new C23465k("source", strM85299a), new C23465k("source_type", this.sourceType), new C23465k(this.messageIdProperty, messageId), new C23465k(this.inputType, isVoiceInput ? this.pushToTalk : this.text), new C23465k(this.conversationIdProperty, conversationId)), 5, null);
    }

    /* JADX INFO: renamed from: v */
    public final void m123084v() {
        InterfaceC14515a.m41418i(this.analytics, null, "Learn More Clicked", null, "AI Coach", null, null, 53, null);
    }

    /* JADX INFO: renamed from: w */
    public final void m123085w(String key, boolean enabled) {
        AbstractC22676k.m65750j(key, "key");
        int iHashCode = key.hashCode();
        if (iHashCode == -1365129194) {
            if (key.equals("WHOOP_COACH_RECOMMENDED_ACTIVITIES")) {
                InterfaceC14515a.m41418i(this.analytics, null, "Settings Toggled", "activity_recommendations", "AI Coach", enabled ? "toggled_on" : "toggled_off", null, 33, null);
            }
        } else if (iHashCode == 1272946234) {
            if (key.equals("WHOOP_COACH")) {
                InterfaceC14515a.m41418i(this.analytics, null, "Settings Toggled", "WHOOP Coach", "AI Coach", enabled ? "On" : "Off", null, 33, null);
            }
        } else if (iHashCode == 1300682383 && key.equals("WHOOP_COACH_DATA")) {
            InterfaceC14515a.m41418i(this.analytics, null, "Coaching Mode Toggled", null, "AI Coach", enabled ? "Customized" : "Education", null, 37, null);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m123086y() {
        InterfaceC14515a.m41418i(this.analytics, null, "start_ghost_activity", null, "AI Coach", null, null, 53, null);
    }

    /* JADX INFO: renamed from: z */
    public final void m123087z() {
        InterfaceC14515a.m41418i(this.analytics, null, "Start New Conversation", null, "AI Coach", null, null, 53, null);
    }
}
