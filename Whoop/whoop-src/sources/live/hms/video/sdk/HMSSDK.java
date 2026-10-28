package live.hms.video.sdk;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.models.CommandDefaults;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.InterfaceC23457c;
import live.hms.video.audio.HMSAudioDeviceInfo;
import live.hms.video.audio.HMSAudioManager;
import live.hms.video.connection.stats.HMSStatsObserver;
import live.hms.video.diagnostics.HMSDiagnostics;
import live.hms.video.error.ErrorFactory;
import live.hms.video.error.HMSException;
import live.hms.video.events.AgentType;
import live.hms.video.factories.noisecancellation.AvailabilityStatus;
import live.hms.video.interactivity.HmsInteractivityCenter;
import live.hms.video.media.settings.HMSLogSettings;
import live.hms.video.media.settings.HMSTrackSettings;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.media.tracks.HMSTrackType;
import live.hms.video.plugin.video.HMSVideoPlugin;
import live.hms.video.sdk.models.FrameworkInfo;
import live.hms.video.sdk.models.HMSConfig;
import live.hms.video.sdk.models.HMSHLSConfig;
import live.hms.video.sdk.models.HMSHLSTimedMetadata;
import live.hms.video.sdk.models.HMSLocalPeer;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.HMSRecordingConfig;
import live.hms.video.sdk.models.HMSRemotePeer;
import live.hms.video.sdk.models.HMSRoleChangeRequest;
import live.hms.video.sdk.models.HMSRoom;
import live.hms.video.sdk.models.PeerListIterator;
import live.hms.video.sdk.models.PeerListIteratorOptions;
import live.hms.video.sdk.models.PeerSearchResponse;
import live.hms.video.sdk.models.TranscriptionsMode;
import live.hms.video.sdk.models.enums.AudioMixingMode;
import live.hms.video.sdk.models.enums.HMSAnalyticsEventLevel;
import live.hms.video.sdk.models.enums.HMSMessageType;
import live.hms.video.sdk.models.role.HMSRole;
import live.hms.video.signal.init.HMSLayoutListener;
import live.hms.video.signal.init.HMSTokenListener;
import live.hms.video.signal.init.LayoutRequestOptions;
import live.hms.video.signal.init.TokenRequest;
import live.hms.video.signal.init.TokenRequestOptions;
import live.hms.video.utils.HMSCoroutineScope;
import live.hms.video.utils.HMSLogger;
import live.hms.video.utils.LogUtils;
import live.hms.video.whiteboard.HMSWhiteboardPermissions;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u009e\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0089\u00022\u00020\u0001:\u0004\u0089\u0002\u008a\u0002BQ\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ\r\u0010 \u001a\u00020\u0018¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\u00182\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b+\u0010,J\u0013\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-¢\u0006\u0004\b/\u00100J\u0013\u00102\u001a\b\u0012\u0004\u0012\u0002010-¢\u0006\u0004\b2\u00100J'\u00108\u001a\u00020\u00182\u0006\u00104\u001a\u0002032\b\b\u0002\u00105\u001a\u0002032\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J/\u0010;\u001a\u00020\u00182\u0006\u00104\u001a\u0002032\b\b\u0002\u00105\u001a\u0002032\u0006\u0010:\u001a\u00020.2\u0006\u00107\u001a\u000206¢\u0006\u0004\b;\u0010<J5\u0010>\u001a\u00020\u00182\u0006\u00104\u001a\u0002032\b\b\u0002\u00105\u001a\u0002032\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001b0-2\u0006\u00107\u001a\u000206¢\u0006\u0004\b>\u0010?J\u0015\u0010B\u001a\u00020\u00182\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u0018¢\u0006\u0004\bD\u0010!J\u0013\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001b0-¢\u0006\u0004\bE\u00100J+\u0010H\u001a\u00020\u00182\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001b0-2\u0006\u0010G\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\bH\u0010IJ/\u0010L\u001a\u00020\u00182\u0006\u0010J\u001a\u00020.2\u0006\u0010G\u001a\u00020\u001b2\u0006\u0010K\u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\bL\u0010MJ-\u0010N\u001a\u00020\u00182\u0006\u0010J\u001a\u00020.2\u0006\u0010G\u001a\u00020\u001b2\u0006\u0010K\u001a\u00020\b2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\bN\u0010MJ\u001d\u0010Q\u001a\u00020\u00182\u0006\u0010P\u001a\u00020O2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\bQ\u0010RJ%\u0010U\u001a\u00020\u00182\u0006\u0010S\u001a\u0002012\u0006\u0010T\u001a\u0002032\u0006\u0010'\u001a\u00020&¢\u0006\u0004\bU\u0010VJ%\u0010X\u001a\u00020\u00182\u0006\u0010T\u001a\u0002032\u0006\u0010W\u001a\u00020\b2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\bX\u0010YJ%\u0010]\u001a\u00020\u00182\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020\b2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b]\u0010^JA\u0010]\u001a\u00020\u00182\u0006\u0010\\\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u00010_2\b\u0010`\u001a\u0004\u0018\u0001032\u000e\u0010a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010-2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b]\u0010bJ\u001d\u0010d\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020c2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\bd\u0010eJ!\u0010g\u001a\u00020\u00182\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010f2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\bg\u0010hJ!\u0010i\u001a\u00020\u00182\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010f2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\bi\u0010hJ\u0015\u0010j\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&¢\u0006\u0004\bj\u0010)J\u000f\u0010l\u001a\u0004\u0018\u00010k¢\u0006\u0004\bl\u0010mJ+\u0010r\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&2\b\u0010o\u001a\u0004\u0018\u00010n2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010p¢\u0006\u0004\br\u0010sJ\r\u0010t\u001a\u00020\b¢\u0006\u0004\bt\u0010uJ\u0015\u0010v\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&¢\u0006\u0004\bv\u0010)J7\u0010z\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&2\b\u0010o\u001a\u0004\u0018\u00010n2\b\b\u0002\u0010x\u001a\u00020w2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010pH\u0007¢\u0006\u0004\bz\u0010{J\u0015\u0010|\u001a\u00020\u00182\u0006\u0010x\u001a\u00020w¢\u0006\u0004\b|\u0010}J\u0015\u0010~\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b~\u0010)J#\u0010\u0081\u0001\u001a\u00020\u00182\t\b\u0001\u0010\u0080\u0001\u001a\u00020\u007f2\u0006\u0010'\u001a\u00020&¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0017\u0010\u0083\u0001\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&¢\u0006\u0005\b\u0083\u0001\u0010)J-\u0010\u0087\u0001\u001a\u00020\u00182\b\u0010\u0085\u0001\u001a\u00030\u0084\u00012\u0006\u0010'\u001a\u00020&2\t\b\u0002\u0010\u0086\u0001\u001a\u00020\u007f¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\"\u0010\u0089\u0001\u001a\u00020\u00182\b\u0010\u0085\u0001\u001a\u00030\u0084\u00012\u0006\u0010'\u001a\u00020&¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0018\u0010\u008b\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0084\u0001\u0018\u00010-¢\u0006\u0005\b\u008b\u0001\u00100J!\u0010\u008d\u0001\u001a\u00020\u00182\u0007\u0010\u008c\u0001\u001a\u0002032\u0006\u0010'\u001a\u00020&¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J!\u0010\u0090\u0001\u001a\u00020\u00182\u0007\u0010\u008f\u0001\u001a\u0002032\u0006\u0010'\u001a\u00020&¢\u0006\u0006\b\u0090\u0001\u0010\u008e\u0001J\u0018\u0010\u0092\u0001\u001a\u00020\u00182\u0007\u0010\u0091\u0001\u001a\u00020&¢\u0006\u0005\b\u0092\u0001\u0010)J\u0018\u0010\u0093\u0001\u001a\u00020\u00182\u0007\u0010\u0091\u0001\u001a\u00020&¢\u0006\u0005\b\u0093\u0001\u0010)J!\u0010\u0094\u0001\u001a\u00020\u00182\u0006\u0010J\u001a\u00020.2\u0007\u0010\u0091\u0001\u001a\u00020&¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001f\u0010\u0099\u0001\u001a\u00030\u0098\u00012\f\b\u0002\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0019\u0010\u009c\u0001\u001a\u00020\u00182\u0007\u0010\u009b\u0001\u001a\u00020\u007f¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001a\u0010 \u0001\u001a\u00020\u00182\b\u0010\u009f\u0001\u001a\u00030\u009e\u0001¢\u0006\u0006\b \u0001\u0010¡\u0001J\u001a\u0010¤\u0001\u001a\u00020\u00182\b\u0010£\u0001\u001a\u00030¢\u0001¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u0011\u0010¦\u0001\u001a\u00030\u009e\u0001¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0016\u0010¨\u0001\u001a\t\u0012\u0005\u0012\u00030\u009e\u00010-¢\u0006\u0005\b¨\u0001\u00100J\u0016\u0010ª\u0001\u001a\t\u0012\u0005\u0012\u00030©\u00010-¢\u0006\u0005\bª\u0001\u00100J\u0019\u0010¬\u0001\u001a\u00020\u00182\u0007\u0010A\u001a\u00030«\u0001¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u000f\u0010®\u0001\u001a\u00020\u0018¢\u0006\u0005\b®\u0001\u0010!J(\u0010°\u0001\u001a\u00020\u00182\u000e\u0010\u008f\u0001\u001a\t\u0012\u0005\u0012\u00030¯\u00010-2\u0006\u0010'\u001a\u00020&¢\u0006\u0006\b°\u0001\u0010±\u0001J\u001a\u0010´\u0001\u001a\u00020\u00182\b\u0010³\u0001\u001a\u00030²\u0001¢\u0006\u0006\b´\u0001\u0010µ\u0001J2\u0010¼\u0001\u001a\u00020\u00182\b\u0010·\u0001\u001a\u00030¶\u00012\f\b\u0002\u0010¹\u0001\u001a\u0005\u0018\u00010¸\u00012\b\u0010»\u0001\u001a\u00030º\u0001¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u0011\u0010¿\u0001\u001a\u00030¾\u0001¢\u0006\u0006\b¿\u0001\u0010À\u0001J\u0011\u0010Â\u0001\u001a\u00030Á\u0001¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u000f\u0010Ä\u0001\u001a\u00020\u0018¢\u0006\u0005\bÄ\u0001\u0010!J1\u0010Ê\u0001\u001a\u00020\u00182\u0007\u0010Å\u0001\u001a\u0002032\f\b\u0002\u0010Ç\u0001\u001a\u0005\u0018\u00010Æ\u00012\b\u0010É\u0001\u001a\u00030È\u0001¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J\u001b\u0010Í\u0001\u001a\u00020\u00182\u0007\u0010Ì\u0001\u001a\u00020\bH\u0007¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J!\u0010Ï\u0001\u001a\u00020\u00182\u0007\u0010Ì\u0001\u001a\u00020\b2\u0006\u0010'\u001a\u00020&¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J\u0011\u0010Ñ\u0001\u001a\u00020\bH\u0007¢\u0006\u0005\bÑ\u0001\u0010uJ\u000f\u0010Ò\u0001\u001a\u00020\b¢\u0006\u0005\bÒ\u0001\u0010uJ\"\u0010Õ\u0001\u001a\u00020\u00182\b\u0010Ô\u0001\u001a\u00030Ó\u00012\u0006\u0010\u0017\u001a\u00020&¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J\"\u0010×\u0001\u001a\u00020\u00182\b\u0010Ô\u0001\u001a\u00030Ó\u00012\u0006\u0010\u0017\u001a\u00020&¢\u0006\u0006\b×\u0001\u0010Ö\u0001J\u0013\u0010Ù\u0001\u001a\u00030Ø\u0001H\u0007¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J\u0011\u0010Û\u0001\u001a\u00030Ø\u0001¢\u0006\u0006\bÛ\u0001\u0010Ú\u0001J\u001b\u0010Ý\u0001\u001a\u0004\u0018\u00010.2\u0007\u0010Ü\u0001\u001a\u000203¢\u0006\u0006\bÝ\u0001\u0010Þ\u0001J\u001c\u0010á\u0001\u001a\u00030à\u00012\t\u0010ß\u0001\u001a\u0004\u0018\u000103¢\u0006\u0006\bá\u0001\u0010â\u0001J<\u0010é\u0001\u001a\u00020\u00182\u0007\u0010ã\u0001\u001a\u0002032\u0007\u0010ä\u0001\u001a\u00020\u007f2\b\u0010æ\u0001\u001a\u00030å\u00012\u000e\u0010\u0017\u001a\n\u0012\u0005\u0012\u00030è\u00010ç\u0001¢\u0006\u0006\bé\u0001\u0010ê\u0001J\u0011\u0010ë\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\bë\u0001\u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0003\u0010ì\u0001\u001a\u0006\bí\u0001\u0010î\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010ï\u0001R\u001a\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\b\u0007\u0010ð\u0001\u001a\u0006\bñ\u0001\u0010ò\u0001R\u0019\u0010\t\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\t\u0010ó\u0001\u001a\u0005\bô\u0001\u0010uR\u001a\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\u000f\n\u0005\b\u000b\u0010õ\u0001\u001a\u0006\bö\u0001\u0010÷\u0001R\u001a\u0010\r\u001a\u00020\f8\u0006¢\u0006\u000f\n\u0005\b\r\u0010ø\u0001\u001a\u0006\bù\u0001\u0010ú\u0001R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\u000f\n\u0005\b\u000f\u0010û\u0001\u001a\u0006\bü\u0001\u0010ý\u0001R\u0019\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u0010\u0010ó\u0001\u001a\u0005\bþ\u0001\u0010uR\u0019\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u0011\u0010ó\u0001\u001a\u0005\bÿ\u0001\u0010uR\u0018\u0010\u0081\u0002\u001a\u00030\u0080\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0002\u0010\u0082\u0002R\u0018\u0010\u0084\u0002\u001a\u00030\u0083\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0085\u0002R\u0018\u0010\u0087\u0002\u001a\u00030\u0086\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0002\u0010\u0088\u0002¨\u0006\u008b\u0002"}, m65681d2 = {"Llive/hms/video/sdk/HMSSDK;", "", "Llive/hms/video/media/settings/HMSTrackSettings;", "hmsSettings", "Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;", "hmsAnalyticsEventLevel", "Llive/hms/video/utils/HMSLogger$LogLevel;", "hmsWebRtcLogLevel", "", "shouldSkipPIIEvents", "Landroid/content/Context;", "applicationContext", "Llive/hms/video/media/settings/HMSLogSettings;", "hmsLogSettings", "Llive/hms/video/sdk/models/FrameworkInfo;", "frameworkInfo", "haltPreviewJoinForPermissions", "iceGatheringOnAnyAddressPorts", "<init>", "(Llive/hms/video/media/settings/HMSTrackSettings;Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;Llive/hms/video/utils/HMSLogger$LogLevel;ZLandroid/content/Context;Llive/hms/video/media/settings/HMSLogSettings;Llive/hms/video/sdk/models/FrameworkInfo;ZZ)V", "Llive/hms/video/sdk/models/HMSConfig;", "config", "Llive/hms/video/sdk/HMSPreviewListener;", "listener", "Ll83/a0;", "preview", "(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSPreviewListener;)V", "Llive/hms/video/sdk/models/role/HMSRole;", "forRole", "Llive/hms/video/sdk/RolePreviewListener;", "rolePreviewListener", "(Llive/hms/video/sdk/models/role/HMSRole;Llive/hms/video/sdk/RolePreviewListener;)V", "cancelPreview", "()V", "Llive/hms/video/sdk/HMSUpdateListener;", "hmsUpdateListener", "join", "(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSUpdateListener;)V", "Llive/hms/video/sdk/HMSActionResultListener;", "hmsActionResultListener", "leave", "(Llive/hms/video/sdk/HMSActionResultListener;)V", "Llive/hms/video/sdk/models/HMSLocalPeer;", "getLocalPeer", "()Llive/hms/video/sdk/models/HMSLocalPeer;", "", "Llive/hms/video/sdk/models/HMSPeer;", "getPeers", "()Ljava/util/List;", "Llive/hms/video/sdk/models/HMSRemotePeer;", "getRemotePeers", "", "message", "type", "Llive/hms/video/sdk/HMSMessageResultListener;", "hmsMessageResultListener", "sendBroadcastMessage", "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/HMSMessageResultListener;)V", "peerTo", "sendDirectMessage", "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/HMSMessageResultListener;)V", "hmsRolesTo", "sendGroupMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Llive/hms/video/sdk/HMSMessageResultListener;)V", "Llive/hms/video/sdk/HMSAudioListener;", "observer", "addAudioObserver", "(Llive/hms/video/sdk/HMSAudioListener;)V", "removeAudioObserver", "getRoles", "ofRoles", "toRole", "changeRoleOfPeersWithRoles", "(Ljava/util/List;Llive/hms/video/sdk/models/role/HMSRole;Llive/hms/video/sdk/HMSActionResultListener;)V", "forPeer", "force", "changeRole", "(Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;)V", "changeRoleOfPeer", "Llive/hms/video/sdk/models/HMSRoleChangeRequest;", "request", "acceptChangeRole", "(Llive/hms/video/sdk/models/HMSRoleChangeRequest;Llive/hms/video/sdk/HMSActionResultListener;)V", "peer", "reason", "removePeerRequest", "(Llive/hms/video/sdk/models/HMSRemotePeer;Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;)V", "lock", "endRoom", "(Ljava/lang/String;ZLlive/hms/video/sdk/HMSActionResultListener;)V", "Llive/hms/video/media/tracks/HMSTrack;", "forRemoteTrack", CommandDefaults.MUTE, "changeTrackState", "(Llive/hms/video/media/tracks/HMSTrack;ZLlive/hms/video/sdk/HMSActionResultListener;)V", "Llive/hms/video/media/tracks/HMSTrackType;", "source", "roles", "(ZLlive/hms/video/media/tracks/HMSTrackType;Ljava/lang/String;Ljava/util/List;Llive/hms/video/sdk/HMSActionResultListener;)V", "Llive/hms/video/sdk/models/HMSRecordingConfig;", "startRtmpOrRecording", "(Llive/hms/video/sdk/models/HMSRecordingConfig;Llive/hms/video/sdk/HMSActionResultListener;)V", "Llive/hms/video/sdk/models/HMSHLSConfig;", "startHLSStreaming", "(Llive/hms/video/sdk/models/HMSHLSConfig;Llive/hms/video/sdk/HMSActionResultListener;)V", "stopHLSStreaming", "stopRtmpAndRecording", "Llive/hms/video/sdk/models/HMSRoom;", "getRoom", "()Llive/hms/video/sdk/models/HMSRoom;", "Landroid/content/Intent;", "mediaProjectionPermissionResultData", "Landroid/app/Notification;", "screenShareNotification", "startScreenshare", "(Llive/hms/video/sdk/HMSActionResultListener;Landroid/content/Intent;Landroid/app/Notification;)V", "isScreenShared", "()Z", "stopScreenshare", "Llive/hms/video/sdk/models/enums/AudioMixingMode;", "audioMixingMode", "audioShareNotification", "startAudioshare", "(Llive/hms/video/sdk/HMSActionResultListener;Landroid/content/Intent;Llive/hms/video/sdk/models/enums/AudioMixingMode;Landroid/app/Notification;)V", "setAudioMixingMode", "(Llive/hms/video/sdk/models/enums/AudioMixingMode;)V", "stopAudioshare", "", "audioResourceId", "streamAndPlayAudioFromRawFile", "(ILlive/hms/video/sdk/HMSActionResultListener;)V", "stopAudioFromRawFile", "Llive/hms/video/plugin/video/HMSVideoPlugin;", "plugin", "pluginFrameRate", "addPlugin", "(Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;I)V", "removePlugin", "(Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;)V", "getPlugins", "name", "changeName", "(Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;)V", "metadata", "changeMetadata", "actionlistener", "raiseLocalPeerHand", "lowerLocalPeerHand", "lowerRemotePeerHand", "(Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/HMSActionResultListener;)V", "Llive/hms/video/sdk/models/PeerListIteratorOptions;", "peerListIteratorOptions", "Llive/hms/video/sdk/models/PeerListIterator;", "getPeerListIterator", "(Llive/hms/video/sdk/models/PeerListIteratorOptions;)Llive/hms/video/sdk/models/PeerListIterator;", "audioMode", "setAudioMode", "(I)V", "Llive/hms/video/audio/HMSAudioManager$AudioDevice;", "audioDevice", "switchAudioOutput", "(Llive/hms/video/audio/HMSAudioManager$AudioDevice;)V", "Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;", "audioManageDeviceChangeDeviceChangeListener", "setAudioDeviceChangeListener", "(Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;)V", "getAudioOutputRouteType", "()Llive/hms/video/audio/HMSAudioManager$AudioDevice;", "getAudioDevicesList", "Llive/hms/video/audio/HMSAudioDeviceInfo;", "getAudioDevicesInfoList", "Llive/hms/video/connection/stats/HMSStatsObserver;", "addRtcStatsObserver", "(Llive/hms/video/connection/stats/HMSStatsObserver;)V", "removeRtcStatsObserver", "Llive/hms/video/sdk/models/HMSHLSTimedMetadata;", "setHlsSessionMetadata", "(Ljava/util/List;Llive/hms/video/sdk/HMSActionResultListener;)V", "Llive/hms/video/error/HMSException;", "hmsException", "sendErrorEvent", "(Llive/hms/video/error/HMSException;)V", "Llive/hms/video/signal/init/TokenRequest;", "tokenRequest", "Llive/hms/video/signal/init/TokenRequestOptions;", "tokenRequestOptions", "Llive/hms/video/signal/init/HMSTokenListener;", "hmsTokenListener", "getAuthTokenByRoomCode", "(Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/TokenRequestOptions;Llive/hms/video/signal/init/HMSTokenListener;)V", "Llive/hms/video/whiteboard/HMSWhiteboardPermissions;", "getWhiteboardPermissions", "()Llive/hms/video/whiteboard/HMSWhiteboardPermissions;", "Llive/hms/video/interactivity/HmsInteractivityCenter;", "getHmsInteractivityCenter", "()Llive/hms/video/interactivity/HmsInteractivityCenter;", "setPermissionsAccepted", "authToken", "Llive/hms/video/signal/init/LayoutRequestOptions;", "layoutRequestOptions", "Llive/hms/video/signal/init/HMSLayoutListener;", "layoutListener", "getRoomLayout", "(Ljava/lang/String;Llive/hms/video/signal/init/LayoutRequestOptions;Llive/hms/video/signal/init/HMSLayoutListener;)V", "enable", "setNoiseCancellationEnabled", "(Z)V", "enableNoiseCancellation", "(ZLlive/hms/video/sdk/HMSActionResultListener;)V", "getNoiseCancellationEnabled", "isNoiseCancellationEnabled", "Llive/hms/video/sdk/models/TranscriptionsMode;", "mode", "startRealTimeTranscription", "(Llive/hms/video/sdk/models/TranscriptionsMode;Llive/hms/video/sdk/HMSActionResultListener;)V", "stopRealTimeTranscription", "Llive/hms/video/factories/noisecancellation/AvailabilityStatus;", "isNoiseCancellationAvailable", "()Llive/hms/video/factories/noisecancellation/AvailabilityStatus;", "isNoiseCancellationSupported", "peerId", "getPeerById", "(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;", "customerUserId", "Llive/hms/video/diagnostics/HMSDiagnostics;", "getDiagnosticsSDK", "(Ljava/lang/String;)Llive/hms/video/diagnostics/HMSDiagnostics;", "query", MapboxMap.QFE_LIMIT, "", MapboxMap.QFE_OFFSET, "Llive/hms/video/sdk/HmsTypedActionResultListener;", "Llive/hms/video/sdk/models/PeerSearchResponse;", "searchPeerNameInLargeRoom", "(Ljava/lang/String;IJLlive/hms/video/sdk/HmsTypedActionResultListener;)V", "initLogStorage", "Llive/hms/video/media/settings/HMSTrackSettings;", "getHmsSettings", "()Llive/hms/video/media/settings/HMSTrackSettings;", "Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;", "Llive/hms/video/utils/HMSLogger$LogLevel;", "getHmsWebRtcLogLevel", "()Llive/hms/video/utils/HMSLogger$LogLevel;", "Z", "getShouldSkipPIIEvents", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "Llive/hms/video/media/settings/HMSLogSettings;", "getHmsLogSettings", "()Llive/hms/video/media/settings/HMSLogSettings;", "Llive/hms/video/sdk/models/FrameworkInfo;", "getFrameworkInfo", "()Llive/hms/video/sdk/models/FrameworkInfo;", "getHaltPreviewJoinForPermissions", "getIceGatheringOnAnyAddressPorts", "Lmc3/a;", "joinLeavePreviewMutex", "Lmc3/a;", "Llive/hms/video/sdk/SDKStore;", "store", "Llive/hms/video/sdk/SDKStore;", "Llive/hms/video/sdk/SDKDelegate;", "delegate", "Llive/hms/video/sdk/SDKDelegate;", "Companion", "Builder", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSSDK {
    public static final String VERSION = "2.9.87";
    public static final String WEBRTC_VERSION = "m111-hms-1.94.3";
    private final Context applicationContext;
    private final SDKDelegate delegate;
    private final FrameworkInfo frameworkInfo;
    private final boolean haltPreviewJoinForPermissions;
    private final HMSAnalyticsEventLevel hmsAnalyticsEventLevel;
    private final HMSLogSettings hmsLogSettings;
    private final HMSTrackSettings hmsSettings;
    private final HMSLogger.LogLevel hmsWebRtcLogLevel;
    private final boolean iceGatheringOnAnyAddressPorts;
    private final InterfaceC25435a joinLeavePreviewMutex;
    private final boolean shouldSkipPIIEvents;
    private final SDKStore store;

    @Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u0011J\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0016¢\u0006\u0004\b$\u0010\u0019J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0016\u0010)\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0016\u0010,\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00100R\u0016\u00101\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00100R\u0016\u00104\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00100¨\u00065"}, m65681d2 = {"Llive/hms/video/sdk/HMSSDK$Builder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Llive/hms/video/media/settings/HMSTrackSettings;", "trackSettings", "setTrackSettings", "(Llive/hms/video/media/settings/HMSTrackSettings;)Llive/hms/video/sdk/HMSSDK$Builder;", "Llive/hms/video/media/settings/HMSLogSettings;", "hmsLogSettings", "setLogSettings", "(Llive/hms/video/media/settings/HMSLogSettings;)Llive/hms/video/sdk/HMSSDK$Builder;", "Llive/hms/video/utils/HMSLogger$LogLevel;", "hmsLogLevel", "setLogLevel", "(Llive/hms/video/utils/HMSLogger$LogLevel;)Llive/hms/video/sdk/HMSSDK$Builder;", "Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;", "level", "setAnalyticEventLevel", "(Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;)Llive/hms/video/sdk/HMSSDK$Builder;", "", "shouldSkip", "shouldSkipPIIEvents", "(Z)Llive/hms/video/sdk/HMSSDK$Builder;", "setWebRtcLogLevel", "Llive/hms/video/sdk/models/FrameworkInfo;", "frameworkInfo", "setFrameworkInfo", "(Llive/hms/video/sdk/models/FrameworkInfo;)Llive/hms/video/sdk/HMSSDK$Builder;", "enable", "Ll83/a0;", "enableIceGatheringOnAnyAddressPorts", "(Z)V", "halt", "haltPreviewJoinForPermissionsRequest", "Llive/hms/video/sdk/HMSSDK;", "build", "()Llive/hms/video/sdk/HMSSDK;", "Landroid/content/Context;", "hmsSettings", "Llive/hms/video/media/settings/HMSTrackSettings;", "Llive/hms/video/media/settings/HMSLogSettings;", "hmsWebRtcLogLevel", "Llive/hms/video/utils/HMSLogger$LogLevel;", "hmsAnalyticsEventLevel", "Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;", "Z", "envFrameworkInfo", "Llive/hms/video/sdk/models/FrameworkInfo;", "haltPreviewJoinForPermissions", "iceGatheringOnAnyAddressPorts", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Builder {
        private final Context context;
        private FrameworkInfo envFrameworkInfo;
        private boolean haltPreviewJoinForPermissions;
        private HMSAnalyticsEventLevel hmsAnalyticsEventLevel;
        private HMSLogSettings hmsLogSettings;
        private HMSTrackSettings hmsSettings;
        private HMSLogger.LogLevel hmsWebRtcLogLevel;
        private boolean iceGatheringOnAnyAddressPorts;
        private boolean shouldSkipPIIEvents;

        public Builder(Context context) {
            AbstractC22676k.m65750j(context, "context");
            this.context = context;
            this.hmsSettings = new HMSTrackSettings.Builder().build();
            this.hmsLogSettings = new HMSLogSettings(0L, false, null, 7, null);
            this.hmsWebRtcLogLevel = HMSLogger.INSTANCE.getWebRtcLogLevel();
            this.hmsAnalyticsEventLevel = HMSAnalyticsEventLevel.INFO;
            this.shouldSkipPIIEvents = true;
            this.envFrameworkInfo = new FrameworkInfo(AgentType.ANDROID_NATIVE, null, null, false, 6, null);
        }

        public final HMSSDK build() {
            return new HMSSDK(this.hmsSettings, this.hmsAnalyticsEventLevel, this.hmsWebRtcLogLevel, this.shouldSkipPIIEvents, this.context, this.hmsLogSettings, this.envFrameworkInfo, this.haltPreviewJoinForPermissions, this.iceGatheringOnAnyAddressPorts);
        }

        public final void enableIceGatheringOnAnyAddressPorts(boolean enable) {
            this.iceGatheringOnAnyAddressPorts = enable;
        }

        public final Builder haltPreviewJoinForPermissionsRequest(boolean halt) {
            this.haltPreviewJoinForPermissions = halt;
            return this;
        }

        public final Builder setAnalyticEventLevel(HMSAnalyticsEventLevel level) {
            AbstractC22676k.m65750j(level, "level");
            this.hmsAnalyticsEventLevel = level;
            return this;
        }

        public final Builder setFrameworkInfo(FrameworkInfo frameworkInfo) {
            AbstractC22676k.m65750j(frameworkInfo, "frameworkInfo");
            this.envFrameworkInfo = frameworkInfo;
            return this;
        }

        @InterfaceC23457c
        public final Builder setLogLevel(HMSLogger.LogLevel hmsLogLevel) {
            AbstractC22676k.m65750j(hmsLogLevel, "hmsLogLevel");
            this.hmsLogSettings = new HMSLogSettings(0L, false, hmsLogLevel, 3, null);
            return this;
        }

        public final Builder setLogSettings(HMSLogSettings hmsLogSettings) {
            AbstractC22676k.m65750j(hmsLogSettings, "hmsLogSettings");
            this.hmsLogSettings = hmsLogSettings;
            return this;
        }

        public final Builder setTrackSettings(HMSTrackSettings trackSettings) {
            AbstractC22676k.m65750j(trackSettings, "trackSettings");
            this.hmsSettings = trackSettings;
            return this;
        }

        public final Builder setWebRtcLogLevel(HMSLogger.LogLevel level) {
            AbstractC22676k.m65750j(level, "level");
            this.hmsWebRtcLogLevel = level;
            return this;
        }

        public final Builder shouldSkipPIIEvents(boolean shouldSkip) {
            this.shouldSkipPIIEvents = shouldSkip;
            return this;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.HMSSDK$initLogStorage$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.HMSSDK$initLogStorage$1", m100430f = "HMSSDK.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241901 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C241901(InterfaceC30057d<? super C241901> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HMSSDK.this.new C241901(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241901) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            HMSSDK hmssdk = HMSSDK.this;
            try {
                if (hmssdk.getHmsLogSettings().isLogStorageEnabled()) {
                    LogUtils logUtils = LogUtils.INSTANCE;
                    logUtils.checkDirSizeAndRemove(hmssdk.getApplicationContext());
                    logUtils.staticFileWriterStart(hmssdk.getApplicationContext(), hmssdk.getFrameworkInfo());
                }
            } catch (Throwable th3) {
                AbstractC34132o.m107888l(th3);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.HMSSDK$join$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.HMSSDK$join$1", m100430f = "HMSSDK.kt", m100431l = {789, 116}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241911 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSConfig $config;
        final /* synthetic */ HMSUpdateListener $hmsUpdateListener;
        final /* synthetic */ long $time;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ HMSSDK this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241911(long j7, HMSSDK hmssdk, HMSConfig hMSConfig, HMSUpdateListener hMSUpdateListener, InterfaceC30057d<? super C241911> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$time = j7;
            this.this$0 = hmssdk;
            this.$config = hMSConfig;
            this.$hmsUpdateListener = hMSUpdateListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C241911(this.$time, this.this$0, this.$config, this.$hmsUpdateListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241911) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC25435a interfaceC25435a;
            long j7;
            HMSSDK hmssdk;
            HMSConfig hMSConfig;
            HMSUpdateListener hMSUpdateListener;
            InterfaceC25435a interfaceC25435a2;
            Throwable th3;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    HMSLogger.m71136d("Profiling", "Join Coroutine starting :: waited for " + (System.currentTimeMillis() - this.$time) + " m");
                    interfaceC25435a = this.this$0.joinLeavePreviewMutex;
                    j7 = this.$time;
                    hmssdk = this.this$0;
                    HMSConfig hMSConfig2 = this.$config;
                    HMSUpdateListener hMSUpdateListener2 = this.$hmsUpdateListener;
                    this.L$0 = interfaceC25435a;
                    this.L$1 = hmssdk;
                    this.L$2 = hMSConfig2;
                    this.L$3 = hMSUpdateListener2;
                    this.J$0 = j7;
                    this.label = 1;
                    if (interfaceC25435a.mo68211b(this) != enumC31071a) {
                        hMSConfig = hMSConfig2;
                        hMSUpdateListener = hMSUpdateListener2;
                    }
                    return enumC31071a;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC25435a2 = (InterfaceC25435a) this.L$0;
                    try {
                        AbstractC34132o.m107864I(obj);
                        HMSLogger.m71136d("Profiling", "~~ joinLeavePreviewMutex released ~~");
                        interfaceC25435a2.mo68214i(null);
                        return C23454a0.f92919a;
                    } catch (Throwable th4) {
                        th3 = th4;
                        interfaceC25435a2.mo68214i(null);
                        throw th3;
                    }
                }
                j7 = this.J$0;
                hMSUpdateListener = (HMSUpdateListener) this.L$3;
                hMSConfig = (HMSConfig) this.L$2;
                hmssdk = (HMSSDK) this.L$1;
                InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) this.L$0;
                AbstractC34132o.m107864I(obj);
                interfaceC25435a = interfaceC25435a3;
                HMSLogger.m71136d("Profiling", " ~~ Post lock Actual SDK join started :: waited for " + (System.currentTimeMillis() - j7) + " ms");
                SDKDelegate sDKDelegate = hmssdk.delegate;
                this.L$0 = interfaceC25435a;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                if (sDKDelegate.join(hMSConfig, hMSUpdateListener, this) != enumC31071a) {
                    interfaceC25435a2 = interfaceC25435a;
                    HMSLogger.m71136d("Profiling", "~~ joinLeavePreviewMutex released ~~");
                    interfaceC25435a2.mo68214i(null);
                    return C23454a0.f92919a;
                }
                return enumC31071a;
            } catch (Throwable th5) {
                interfaceC25435a2 = interfaceC25435a;
                th3 = th5;
                interfaceC25435a2.mo68214i(null);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.HMSSDK$leave$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.HMSSDK$leave$1", m100430f = "HMSSDK.kt", m100431l = {789, 128}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241921 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSActionResultListener $hmsActionResultListener;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241921(HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C241921> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$hmsActionResultListener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HMSSDK.this.new C241921(this.$hmsActionResultListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241921) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0060 A[Catch: HMSException -> 0x002c, TryCatch #2 {HMSException -> 0x002c, blocks: (B:26:0x0059, B:28:0x0060, B:31:0x0068, B:32:0x006b, B:14:0x0027, B:19:0x0031), top: B:43:0x0007 }] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC25435a interfaceC25435a;
            HMSSDK hmssdk;
            InterfaceC25435a interfaceC25435a2;
            Throwable th3;
            HMSActionResultListener hMSActionResultListener;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                try {
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        interfaceC25435a = HMSSDK.this.joinLeavePreviewMutex;
                        hmssdk = HMSSDK.this;
                        this.L$0 = interfaceC25435a;
                        this.L$1 = hmssdk;
                        this.label = 1;
                        if (interfaceC25435a.mo68211b(this) != enumC31071a) {
                        }
                        return enumC31071a;
                    }
                    if (i13 != 1) {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC25435a2 = (InterfaceC25435a) this.L$0;
                        try {
                            AbstractC34132o.m107864I(obj);
                            interfaceC25435a2.mo68214i(null);
                            hMSActionResultListener = this.$hmsActionResultListener;
                            if (hMSActionResultListener != null) {
                                hMSActionResultListener.onSuccess();
                            }
                            return C23454a0.f92919a;
                        } catch (Throwable th4) {
                            th3 = th4;
                            interfaceC25435a2.mo68214i(null);
                            throw th3;
                        }
                    }
                    hmssdk = (HMSSDK) this.L$1;
                    InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) this.L$0;
                    AbstractC34132o.m107864I(obj);
                    interfaceC25435a = interfaceC25435a3;
                    SDKDelegate sDKDelegate = hmssdk.delegate;
                    this.L$0 = interfaceC25435a;
                    this.L$1 = null;
                    this.label = 2;
                    if (SDKDelegate.leave$default(sDKDelegate, false, this, 1, null) != enumC31071a) {
                        interfaceC25435a2 = interfaceC25435a;
                        interfaceC25435a2.mo68214i(null);
                        hMSActionResultListener = this.$hmsActionResultListener;
                        if (hMSActionResultListener != null) {
                            hMSActionResultListener.onSuccess();
                        }
                        return C23454a0.f92919a;
                    }
                    return enumC31071a;
                } catch (Throwable th5) {
                    interfaceC25435a2 = interfaceC25435a;
                    th3 = th5;
                    interfaceC25435a2.mo68214i(null);
                    throw th3;
                }
            } catch (HMSException e5) {
                HMSActionResultListener hMSActionResultListener2 = this.$hmsActionResultListener;
                if (hMSActionResultListener2 == null) {
                    throw e5;
                }
                hMSActionResultListener2.onError(e5);
            }
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.HMSSDK$preview$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.HMSSDK$preview$1", m100430f = "HMSSDK.kt", m100431l = {789, 83}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241931 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSConfig $config;
        final /* synthetic */ HMSPreviewListener $listener;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241931(HMSConfig hMSConfig, HMSPreviewListener hMSPreviewListener, InterfaceC30057d<? super C241931> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$config = hMSConfig;
            this.$listener = hMSPreviewListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HMSSDK.this.new C241931(this.$config, this.$listener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241931) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC25435a interfaceC25435a;
            HMSSDK hmssdk;
            HMSConfig hMSConfig;
            HMSPreviewListener hMSPreviewListener;
            InterfaceC25435a interfaceC25435a2;
            Throwable th3;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    interfaceC25435a = HMSSDK.this.joinLeavePreviewMutex;
                    hmssdk = HMSSDK.this;
                    HMSConfig hMSConfig2 = this.$config;
                    HMSPreviewListener hMSPreviewListener2 = this.$listener;
                    this.L$0 = interfaceC25435a;
                    this.L$1 = hmssdk;
                    this.L$2 = hMSConfig2;
                    this.L$3 = hMSPreviewListener2;
                    this.label = 1;
                    if (interfaceC25435a.mo68211b(this) != enumC31071a) {
                        hMSConfig = hMSConfig2;
                        hMSPreviewListener = hMSPreviewListener2;
                    }
                    return enumC31071a;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC25435a2 = (InterfaceC25435a) this.L$0;
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
                hMSPreviewListener = (HMSPreviewListener) this.L$3;
                hMSConfig = (HMSConfig) this.L$2;
                hmssdk = (HMSSDK) this.L$1;
                InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) this.L$0;
                AbstractC34132o.m107864I(obj);
                interfaceC25435a = interfaceC25435a3;
                SDKDelegate sDKDelegate = hmssdk.delegate;
                this.L$0 = interfaceC25435a;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                if (sDKDelegate.preview(hMSConfig, hMSPreviewListener, this) != enumC31071a) {
                    interfaceC25435a2 = interfaceC25435a;
                    interfaceC25435a2.mo68214i(null);
                    return C23454a0.f92919a;
                }
                return enumC31071a;
            } catch (Throwable th5) {
                interfaceC25435a2 = interfaceC25435a;
                th3 = th5;
                interfaceC25435a2.mo68214i(null);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.HMSSDK$preview$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.HMSSDK$preview$2", m100430f = "HMSSDK.kt", m100431l = {90}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241942 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSRole $forRole;
        final /* synthetic */ RolePreviewListener $rolePreviewListener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241942(HMSRole hMSRole, RolePreviewListener rolePreviewListener, InterfaceC30057d<? super C241942> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$forRole = hMSRole;
            this.$rolePreviewListener = rolePreviewListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HMSSDK.this.new C241942(this.$forRole, this.$rolePreviewListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241942) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                SDKDelegate sDKDelegate = HMSSDK.this.delegate;
                HMSRole hMSRole = this.$forRole;
                RolePreviewListener rolePreviewListener = this.$rolePreviewListener;
                this.label = 1;
                if (sDKDelegate.previewForRole(hMSRole, rolePreviewListener, this) == enumC31071a) {
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

    public HMSSDK(HMSTrackSettings hmsSettings, HMSAnalyticsEventLevel hmsAnalyticsEventLevel, HMSLogger.LogLevel hmsWebRtcLogLevel, boolean z4, Context applicationContext, HMSLogSettings hmsLogSettings, FrameworkInfo frameworkInfo, boolean z13, boolean z14) {
        AbstractC22676k.m65750j(hmsSettings, "hmsSettings");
        AbstractC22676k.m65750j(hmsAnalyticsEventLevel, "hmsAnalyticsEventLevel");
        AbstractC22676k.m65750j(hmsWebRtcLogLevel, "hmsWebRtcLogLevel");
        AbstractC22676k.m65750j(applicationContext, "applicationContext");
        AbstractC22676k.m65750j(hmsLogSettings, "hmsLogSettings");
        AbstractC22676k.m65750j(frameworkInfo, "frameworkInfo");
        this.hmsSettings = hmsSettings;
        this.hmsAnalyticsEventLevel = hmsAnalyticsEventLevel;
        this.hmsWebRtcLogLevel = hmsWebRtcLogLevel;
        this.shouldSkipPIIEvents = z4;
        this.applicationContext = applicationContext;
        this.hmsLogSettings = hmsLogSettings;
        this.frameworkInfo = frameworkInfo;
        this.haltPreviewJoinForPermissions = z13;
        this.iceGatheringOnAnyAddressPorts = z14;
        this.joinLeavePreviewMutex = AbstractC25438d.m74669a();
        SDKStore sDKStore = new SDKStore(null, null, 3, null);
        this.store = sDKStore;
        this.delegate = new SDKDelegate(applicationContext, hmsSettings, hmsLogSettings, sDKStore, hmsAnalyticsEventLevel, frameworkInfo, z13, z14);
    }

    public static /* synthetic */ void addPlugin$default(HMSSDK hmssdk, HMSVideoPlugin hMSVideoPlugin, HMSActionResultListener hMSActionResultListener, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i13 = 15;
        }
        hmssdk.addPlugin(hMSVideoPlugin, hMSActionResultListener, i13);
    }

    public static /* synthetic */ void getAuthTokenByRoomCode$default(HMSSDK hmssdk, TokenRequest tokenRequest, TokenRequestOptions tokenRequestOptions, HMSTokenListener hMSTokenListener, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            tokenRequestOptions = null;
        }
        hmssdk.getAuthTokenByRoomCode(tokenRequest, tokenRequestOptions, hMSTokenListener);
    }

    public static /* synthetic */ PeerListIterator getPeerListIterator$default(HMSSDK hmssdk, PeerListIteratorOptions peerListIteratorOptions, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            peerListIteratorOptions = null;
        }
        return hmssdk.getPeerListIterator(peerListIteratorOptions);
    }

    public static /* synthetic */ void getRoomLayout$default(HMSSDK hmssdk, String str, LayoutRequestOptions layoutRequestOptions, HMSLayoutListener hMSLayoutListener, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            layoutRequestOptions = null;
        }
        hmssdk.getRoomLayout(str, layoutRequestOptions, hMSLayoutListener);
    }

    private final void initLogStorage() {
        C22365e c22365e = AbstractC3050q0.f12077a;
        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(ExecutorC22364d.f87316w), null, null, new C241901(null), 3);
    }

    public static /* synthetic */ void leave$default(HMSSDK hmssdk, HMSActionResultListener hMSActionResultListener, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            hMSActionResultListener = null;
        }
        hmssdk.leave(hMSActionResultListener);
    }

    public static /* synthetic */ void sendBroadcastMessage$default(HMSSDK hmssdk, String str, String str2, HMSMessageResultListener hMSMessageResultListener, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = HMSMessageType.CHAT;
        }
        hmssdk.sendBroadcastMessage(str, str2, hMSMessageResultListener);
    }

    public static /* synthetic */ void sendDirectMessage$default(HMSSDK hmssdk, String str, String str2, HMSPeer hMSPeer, HMSMessageResultListener hMSMessageResultListener, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = HMSMessageType.CHAT;
        }
        hmssdk.sendDirectMessage(str, str2, hMSPeer, hMSMessageResultListener);
    }

    public static /* synthetic */ void sendGroupMessage$default(HMSSDK hmssdk, String str, String str2, List list, HMSMessageResultListener hMSMessageResultListener, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = HMSMessageType.CHAT;
        }
        hmssdk.sendGroupMessage(str, str2, list, hMSMessageResultListener);
    }

    public static /* synthetic */ void startAudioshare$default(HMSSDK hmssdk, HMSActionResultListener hMSActionResultListener, Intent intent, AudioMixingMode audioMixingMode, Notification notification, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            audioMixingMode = AudioMixingMode.TALK_AND_MUSIC;
        }
        if ((i13 & 8) != 0) {
            notification = null;
        }
        hmssdk.startAudioshare(hMSActionResultListener, intent, audioMixingMode, notification);
    }

    public static /* synthetic */ void startHLSStreaming$default(HMSSDK hmssdk, HMSHLSConfig hMSHLSConfig, HMSActionResultListener hMSActionResultListener, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            hMSHLSConfig = null;
        }
        hmssdk.startHLSStreaming(hMSHLSConfig, hMSActionResultListener);
    }

    public static /* synthetic */ void startScreenshare$default(HMSSDK hmssdk, HMSActionResultListener hMSActionResultListener, Intent intent, Notification notification, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            notification = null;
        }
        hmssdk.startScreenshare(hMSActionResultListener, intent, notification);
    }

    public static /* synthetic */ void stopHLSStreaming$default(HMSSDK hmssdk, HMSHLSConfig hMSHLSConfig, HMSActionResultListener hMSActionResultListener, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            hMSHLSConfig = null;
        }
        hmssdk.stopHLSStreaming(hMSHLSConfig, hMSActionResultListener);
    }

    public final void acceptChangeRole(HMSRoleChangeRequest request, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        this.delegate.roleChangeAccept(request, hmsActionResultListener);
    }

    public final void addAudioObserver(HMSAudioListener observer) {
        AbstractC22676k.m65750j(observer, "observer");
        this.delegate.setAudioObserver(observer);
    }

    public final void addPlugin(HMSVideoPlugin plugin, HMSActionResultListener hmsActionResultListener, int pluginFrameRate) {
        AbstractC22676k.m65750j(plugin, "plugin");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        this.delegate.addPlugin(plugin, hmsActionResultListener, pluginFrameRate);
    }

    public final void addRtcStatsObserver(HMSStatsObserver observer) {
        AbstractC22676k.m65750j(observer, "observer");
        this.delegate.addStatsObserver(observer);
    }

    public final void cancelPreview() {
        this.delegate.cancelRolePreview();
    }

    public final void changeMetadata(String metadata, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        this.delegate.changeMetadata(metadata, hmsActionResultListener);
    }

    public final void changeName(String name, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        this.delegate.changeName(name, hmsActionResultListener);
    }

    @InterfaceC23457c
    public final void changeRole(HMSPeer forPeer, HMSRole toRole, boolean force, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(forPeer, "forPeer");
        AbstractC22676k.m65750j(toRole, "toRole");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        changeRoleOfPeer(forPeer, toRole, force, hmsActionResultListener);
    }

    public final void changeRoleOfPeer(HMSPeer forPeer, HMSRole toRole, boolean force, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(forPeer, "forPeer");
        AbstractC22676k.m65750j(toRole, "toRole");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        this.delegate.roleChangeRequest(forPeer, toRole, force, hmsActionResultListener);
    }

    public final void changeRoleOfPeersWithRoles(List<HMSRole> ofRoles, HMSRole toRole, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(ofRoles, "ofRoles");
        AbstractC22676k.m65750j(toRole, "toRole");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        this.delegate.bulkRoleChangeRequest(ofRoles, toRole, true, hmsActionResultListener);
    }

    public final void changeTrackState(HMSTrack forRemoteTrack, boolean mute, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(forRemoteTrack, "forRemoteTrack");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        this.delegate.changeTrackState(forRemoteTrack, mute, hmsActionResultListener);
    }

    public final void enableNoiseCancellation(boolean enable, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        this.delegate.enableNoiseCancellation(enable, hmsActionResultListener);
    }

    public final void endRoom(String reason, boolean lock, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(reason, "reason");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        this.delegate.endRoom(reason, lock, hmsActionResultListener);
    }

    public final Context getApplicationContext() {
        return this.applicationContext;
    }

    public final List<HMSAudioDeviceInfo> getAudioDevicesInfoList() {
        return this.delegate.getAvailableAudioDevicesInfoList();
    }

    public final List<HMSAudioManager.AudioDevice> getAudioDevicesList() {
        return this.delegate.getAvailableAudioDevicesList();
    }

    public final HMSAudioManager.AudioDevice getAudioOutputRouteType() {
        return this.delegate.getAudioOutputRouteType();
    }

    public final void getAuthTokenByRoomCode(TokenRequest tokenRequest, TokenRequestOptions tokenRequestOptions, HMSTokenListener hmsTokenListener) {
        AbstractC22676k.m65750j(tokenRequest, "tokenRequest");
        AbstractC22676k.m65750j(hmsTokenListener, "hmsTokenListener");
        this.delegate.getAuthTokenByRoomCode(tokenRequest, tokenRequestOptions, hmsTokenListener);
    }

    public final HMSDiagnostics getDiagnosticsSDK(String customerUserId) {
        return new HMSDiagnostics(this.delegate, customerUserId);
    }

    public final FrameworkInfo getFrameworkInfo() {
        return this.frameworkInfo;
    }

    public final boolean getHaltPreviewJoinForPermissions() {
        return this.haltPreviewJoinForPermissions;
    }

    public final HmsInteractivityCenter getHmsInteractivityCenter() {
        return this.delegate.getHmsInteractivityCenter();
    }

    public final HMSLogSettings getHmsLogSettings() {
        return this.hmsLogSettings;
    }

    public final HMSTrackSettings getHmsSettings() {
        return this.hmsSettings;
    }

    public final HMSLogger.LogLevel getHmsWebRtcLogLevel() {
        return this.hmsWebRtcLogLevel;
    }

    public final boolean getIceGatheringOnAnyAddressPorts() {
        return this.iceGatheringOnAnyAddressPorts;
    }

    public final HMSLocalPeer getLocalPeer() {
        return this.store.getLocalPeer();
    }

    @InterfaceC23457c
    public final boolean getNoiseCancellationEnabled() {
        return false;
    }

    public final HMSPeer getPeerById(String peerId) {
        AbstractC22676k.m65750j(peerId, "peerId");
        return this.store.getPeerById(peerId);
    }

    public final PeerListIterator getPeerListIterator(PeerListIteratorOptions peerListIteratorOptions) {
        return this.delegate.getPeerListIterator(peerListIteratorOptions);
    }

    public final List<HMSPeer> getPeers() {
        return this.store.getPeers();
    }

    public final List<HMSVideoPlugin> getPlugins() {
        return this.delegate.getPlugins();
    }

    public final List<HMSRemotePeer> getRemotePeers() {
        return this.store.getRemotePeers();
    }

    public final List<HMSRole> getRoles() {
        return AbstractC25265s.m74093D1(this.store.getRolesMap().values());
    }

    public final HMSRoom getRoom() {
        return this.store.get_room();
    }

    public final void getRoomLayout(String authToken, LayoutRequestOptions layoutRequestOptions, HMSLayoutListener layoutListener) {
        AbstractC22676k.m65750j(authToken, "authToken");
        AbstractC22676k.m65750j(layoutListener, "layoutListener");
        this.delegate.getLayoutConfigByToken(authToken, layoutRequestOptions, layoutListener);
    }

    public final boolean getShouldSkipPIIEvents() {
        return this.shouldSkipPIIEvents;
    }

    public final HMSWhiteboardPermissions getWhiteboardPermissions() {
        return this.delegate.getWhiteboardPermissions();
    }

    @InterfaceC23457c
    public final AvailabilityStatus isNoiseCancellationAvailable() {
        return new AvailabilityStatus.NotAvailable("deprecated method, use isNoiseCancellationSupported");
    }

    public final boolean isNoiseCancellationEnabled() {
        return this.delegate.isNoiseCancellationEnabled();
    }

    public final AvailabilityStatus isNoiseCancellationSupported() {
        return this.delegate.isNoiseCancellationSupported();
    }

    public final boolean isScreenShared() {
        return this.delegate.getIsScreenShared();
    }

    public final void join(HMSConfig config, HMSUpdateListener hmsUpdateListener) {
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(hmsUpdateListener, "hmsUpdateListener");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.haltPreviewJoinForPermissions) {
            this.delegate.setPermissionsAccepted();
        }
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241911(jCurrentTimeMillis, this, config, hmsUpdateListener, null), 3);
    }

    public final void leave(HMSActionResultListener hmsActionResultListener) {
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241921(hmsActionResultListener, null), 3);
    }

    public final void lowerLocalPeerHand(HMSActionResultListener actionlistener) {
        AbstractC22676k.m65750j(actionlistener, "actionlistener");
        this.delegate.changeLocalPeerHand(actionlistener, false);
    }

    public final void lowerRemotePeerHand(HMSPeer forPeer, HMSActionResultListener actionlistener) {
        AbstractC22676k.m65750j(forPeer, "forPeer");
        AbstractC22676k.m65750j(actionlistener, "actionlistener");
        this.delegate.lowerRemotePeerHand(forPeer, actionlistener);
    }

    public final void preview(HMSConfig config, HMSPreviewListener listener) {
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(listener, "listener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241931(config, listener, null), 3);
    }

    public final void raiseLocalPeerHand(HMSActionResultListener actionlistener) {
        AbstractC22676k.m65750j(actionlistener, "actionlistener");
        this.delegate.changeLocalPeerHand(actionlistener, true);
    }

    public final void removeAudioObserver() {
        this.delegate.setAudioObserver(null);
    }

    public final void removePeerRequest(HMSRemotePeer peer, String reason, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(peer, "peer");
        AbstractC22676k.m65750j(reason, "reason");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        this.delegate.removePeer(peer, reason, hmsActionResultListener);
    }

    public final void removePlugin(HMSVideoPlugin plugin, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(plugin, "plugin");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        this.delegate.removePlugin(plugin, hmsActionResultListener);
    }

    public final void removeRtcStatsObserver() {
        this.delegate.removeRtcStatsObserver();
    }

    public final void searchPeerNameInLargeRoom(String query, int limit, long offset, HmsTypedActionResultListener<PeerSearchResponse> listener) {
        AbstractC22676k.m65750j(query, "query");
        AbstractC22676k.m65750j(listener, "listener");
        this.delegate.searchPeerName(query, limit, offset, listener);
    }

    public final void sendBroadcastMessage(String message, String type, HMSMessageResultListener hmsMessageResultListener) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(hmsMessageResultListener, "hmsMessageResultListener");
        this.delegate.sendMessage(type, message, hmsMessageResultListener);
    }

    public final void sendDirectMessage(String message, String type, HMSPeer peerTo, HMSMessageResultListener hmsMessageResultListener) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(peerTo, "peerTo");
        AbstractC22676k.m65750j(hmsMessageResultListener, "hmsMessageResultListener");
        this.delegate.sendMessage(type, message, peerTo, hmsMessageResultListener);
    }

    public final void sendErrorEvent(HMSException hmsException) {
        AbstractC22676k.m65750j(hmsException, "hmsException");
        this.delegate.sendErrorEvent(hmsException);
    }

    public final void sendGroupMessage(String message, String type, List<HMSRole> hmsRolesTo, HMSMessageResultListener hmsMessageResultListener) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(hmsRolesTo, "hmsRolesTo");
        AbstractC22676k.m65750j(hmsMessageResultListener, "hmsMessageResultListener");
        this.delegate.sendMessage(type, message, hmsRolesTo, hmsMessageResultListener);
    }

    public final void setAudioDeviceChangeListener(HMSAudioManager.AudioManagerDeviceChangeListener audioManageDeviceChangeDeviceChangeListener) {
        AbstractC22676k.m65750j(audioManageDeviceChangeDeviceChangeListener, "audioManageDeviceChangeDeviceChangeListener");
        this.delegate.setAudioDeviceChangeListener(audioManageDeviceChangeDeviceChangeListener);
    }

    public final void setAudioMixingMode(AudioMixingMode audioMixingMode) {
        AbstractC22676k.m65750j(audioMixingMode, "audioMixingMode");
        this.delegate.setAudioMixingMode(audioMixingMode);
    }

    public final void setAudioMode(int audioMode) {
        this.delegate.setAudioMode(audioMode);
    }

    public final void setHlsSessionMetadata(List<HMSHLSTimedMetadata> metadata, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        this.delegate.setHlsSessionMetadata(metadata, hmsActionResultListener);
    }

    @InterfaceC23457c
    public final void setNoiseCancellationEnabled(boolean enable) {
    }

    public final void setPermissionsAccepted() {
        this.delegate.setPermissionsAccepted();
    }

    public final void startAudioshare(HMSActionResultListener hmsActionResultListener, Intent mediaProjectionPermissionResultData, AudioMixingMode audioMixingMode, Notification audioShareNotification) {
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        AbstractC22676k.m65750j(audioMixingMode, "audioMixingMode");
        if (Build.VERSION.SDK_INT >= 29) {
            this.delegate.startAudioshare(hmsActionResultListener, mediaProjectionPermissionResultData, audioMixingMode, audioShareNotification);
        } else {
            hmsActionResultListener.onError(ErrorFactory.GenericErrors.APINotSupported$default(ErrorFactory.GenericErrors.INSTANCE, null, "Minimum Android version needed to share system audio is 10", null, null, 13, null));
        }
    }

    public final void startHLSStreaming(HMSHLSConfig config, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        this.delegate.startHLSStreaming(config, hmsActionResultListener);
    }

    public final void startRealTimeTranscription(TranscriptionsMode mode, HMSActionResultListener listener) {
        AbstractC22676k.m65750j(mode, "mode");
        AbstractC22676k.m65750j(listener, "listener");
        this.delegate.startRealTimeTranscription(mode, listener);
    }

    public final void startRtmpOrRecording(HMSRecordingConfig config, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        this.delegate.startRtmpOrRecording(config, hmsActionResultListener);
    }

    public final void startScreenshare(HMSActionResultListener hmsActionResultListener, Intent mediaProjectionPermissionResultData, Notification screenShareNotification) {
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        this.delegate.startScreenshare(hmsActionResultListener, mediaProjectionPermissionResultData, screenShareNotification);
    }

    public final void stopAudioFromRawFile(HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        this.delegate.stopAudioFromRawFile(hmsActionResultListener);
    }

    public final void stopAudioshare(HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        this.delegate.stopAudioshare(hmsActionResultListener);
    }

    public final void stopHLSStreaming(HMSHLSConfig config, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        this.delegate.stopHLSStreaming(config, hmsActionResultListener);
    }

    public final void stopRealTimeTranscription(TranscriptionsMode mode, HMSActionResultListener listener) {
        AbstractC22676k.m65750j(mode, "mode");
        AbstractC22676k.m65750j(listener, "listener");
        this.delegate.stopRealTimeTranscription(mode, listener);
    }

    public final void stopRtmpAndRecording(HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        this.delegate.stopRtmpAndRecording(hmsActionResultListener);
    }

    public final void stopScreenshare(HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        this.delegate.stopScreenshare(hmsActionResultListener);
    }

    public final void streamAndPlayAudioFromRawFile(int audioResourceId, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        this.delegate.streamAndPlayAudioFromRawFile(audioResourceId, hmsActionResultListener);
    }

    public final void switchAudioOutput(HMSAudioManager.AudioDevice audioDevice) {
        AbstractC22676k.m65750j(audioDevice, "audioDevice");
        this.delegate.switchAudioMode(audioDevice);
    }

    public final void changeTrackState(boolean mute, HMSTrackType type, String source, List<HMSRole> roles, HMSActionResultListener hmsActionResultListener) {
        ArrayList arrayList;
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        SDKDelegate sDKDelegate = this.delegate;
        if (roles != null) {
            List<HMSRole> list = roles;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((HMSRole) it.next()).getName());
            }
        } else {
            arrayList = null;
        }
        sDKDelegate.changeTrackState(mute, type, source, arrayList, hmsActionResultListener);
    }

    public final void preview(HMSRole forRole, RolePreviewListener rolePreviewListener) {
        AbstractC22676k.m65750j(forRole, "forRole");
        AbstractC22676k.m65750j(rolePreviewListener, "rolePreviewListener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241942(forRole, rolePreviewListener, null), 3);
    }
}
