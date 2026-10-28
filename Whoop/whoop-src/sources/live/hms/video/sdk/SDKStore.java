package live.hms.video.sdk;

import c93.InterfaceC4351m;
import io.getstream.chat.android.models.CommandDefaults;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import l83.C23465k;
import live.hms.video.interactivity.HmsInteractivityCenter;
import live.hms.video.media.tracks.HMSRemoteAudioTrack;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.media.tracks.HMSTrackType;
import live.hms.video.sdk.featureflags.FeatureFlags;
import live.hms.video.sdk.models.HMSConfig;
import live.hms.video.sdk.models.HMSLocalPeer;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.HMSPeerType;
import live.hms.video.sdk.models.HMSRemotePeer;
import live.hms.video.sdk.models.HMSRoom;
import live.hms.video.sdk.models.role.HMSRole;
import live.hms.video.sdk.models.role.PermissionsParams;
import live.hms.video.sessionstore.HmsSessionStore;
import live.hms.video.utils.AuthTokenUtils;
import live.hms.video.utils.HMSLogger;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25272z;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0080\b\u0018\u0000 °\u00012\u00020\u0001:\b°\u0001±\u0001²\u0001³\u0001B3\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020!¢\u0006\u0004\b$\u0010%J\u001d\u0010)\u001a\u00020\r2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0003¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u0003¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u00020\r2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0015\u0010$\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b$\u00102J\u0015\u00103\u001a\u00020\r2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b3\u00101J\u0015\u00104\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b4\u00105J\u001d\u00106\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u00032\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b6\u00107J\u0013\u00109\u001a\b\u0012\u0004\u0012\u00020!08¢\u0006\u0004\b9\u0010:J\u0013\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001b08¢\u0006\u0004\b;\u0010:J\u0019\u0010<\u001a\u0004\u0018\u00010!2\b\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b<\u0010=J\u0019\u0010?\u001a\u0004\u0018\u00010!2\b\u0010>\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b?\u0010=J\u0017\u0010@\u001a\u0004\u0018\u00010.2\u0006\u0010+\u001a\u00020\u0003¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010+\u001a\u00020\u0003¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u0004\u0018\u00010!2\u0006\u0010+\u001a\u00020\u0003¢\u0006\u0004\bE\u0010=J'\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001b082\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0F¢\u0006\u0004\bH\u0010IJ'\u0010M\u001a\u00020\r2\u0018\u0010L\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\r0J¢\u0006\u0004\bM\u0010NJ!\u0010O\u001a\u00020\r2\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\r0F¢\u0006\u0004\bO\u0010PJ'\u0010Q\u001a\u00020\r2\u0018\u0010L\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\r0J¢\u0006\u0004\bQ\u0010NJ-\u0010S\u001a\u00020\r2\u001e\u0010L\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\r0R¢\u0006\u0004\bS\u0010TJ\u0015\u0010V\u001a\u00020\u000b2\u0006\u0010U\u001a\u00020\u0003¢\u0006\u0004\bV\u0010-J\r\u0010W\u001a\u00020\r¢\u0006\u0004\bW\u0010XJ-\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u000008\"\u0004\b\u0000\u0010Y2\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00028\u00000F¢\u0006\u0004\bZ\u0010IJ\u001f\u0010\\\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070[08¢\u0006\u0004\b\\\u0010:J\u001d\u0010^\u001a\u00020\r2\u000e\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u000108¢\u0006\u0004\b^\u0010_J<\u0010`\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b`\u0010aJ\u0010\u0010b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bb\u0010\u0014J\u0010\u0010d\u001a\u00020cHÖ\u0001¢\u0006\u0004\bd\u0010eJ\u001a\u0010g\u001a\u00020\u000b2\b\u0010f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bg\u0010hJ\u001c\u0010i\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÂ\u0003¢\u0006\u0004\bi\u0010jJ\u001c\u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006HÂ\u0003¢\u0006\u0004\bk\u0010lR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010mR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010nR\u0016\u0010o\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00030q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR$\u0010u\u001a\u0004\u0018\u00010t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR.\u0010|\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020t0{8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010m\u001a\u0004\b}\u0010j\"\u0004\b~\u0010\u007fR,\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\"\u0010\u0089\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020B0\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010mR\"\u0010\u008a\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010mR,\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R0\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0092\u00012\n\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R,\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R,\u0010 \u0001\u001a\u0005\u0018\u00010\u009f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R\u0013\u0010§\u0001\u001a\u00020\u00038F¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010\u0014R\u0013\u0010©\u0001\u001a\u00020c8F¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010eR\u0013\u0010«\u0001\u001a\u00020c8F¢\u0006\u0007\u001a\u0005\bª\u0001\u0010eR\u0013\u0010\u00ad\u0001\u001a\u00020c8F¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010eR\u0013\u0010¯\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b®\u0001\u0010\u0011¨\u0006´\u0001"}, m65681d2 = {"Llive/hms/video/sdk/SDKStore;", "", "", "", "Llive/hms/video/sdk/SDKStore$PeerTimePair;", "peers", "Ljava/util/concurrent/ConcurrentHashMap;", "Llive/hms/video/sdk/SDKStore$TrackTimePair;", "tracks", "<init>", "(Ljava/util/Map;Ljava/util/concurrent/ConcurrentHashMap;)V", "", CommandDefaults.MUTE, "Ll83/a0;", "setLocalTracksMute", "(Z)V", "getLocalTracksMute", "()Z", "muteAllRemoteTracks", "getNullableLocalPeerId", "()Ljava/lang/String;", "Llive/hms/video/sdk/models/HMSConfig;", "config", "initWithConfig", "(Llive/hms/video/sdk/models/HMSConfig;)V", "Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;", "peer", "Llive/hms/video/sdk/models/HMSRemotePeer;", "add", "(Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;)Llive/hms/video/sdk/models/HMSRemotePeer;", "Llive/hms/video/sdk/models/HMSLocalPeer;", "getLocalPeer", "()Llive/hms/video/sdk/models/HMSLocalPeer;", "Llive/hms/video/sdk/models/HMSPeer;", "addLocalPeer", "(Llive/hms/video/sdk/models/HMSPeer;)V", "remove", "(Llive/hms/video/sdk/models/HMSPeer;)Z", "Llive/hms/video/sdk/models/HMSNotifications$Track;", "data", "peerId", "addTrackMetadata", "(Llive/hms/video/sdk/models/HMSNotifications$Track;Ljava/lang/String;)V", "trackId", "removeTrackData", "(Ljava/lang/String;)Z", "Llive/hms/video/media/tracks/HMSTrack;", "track", "addNativeTrack", "(Llive/hms/video/media/tracks/HMSTrack;)V", "(Llive/hms/video/media/tracks/HMSTrack;)Z", "removeNativeTrack", "updateRTCTrack", "(Llive/hms/video/sdk/models/HMSNotifications$Track;)Z", "updateTrackMetaData", "(Ljava/lang/String;Llive/hms/video/sdk/models/HMSNotifications$Track;)Z", "", "getPeers", "()Ljava/util/List;", "getRemotePeers", "getPeerById", "(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;", "customerUserID", "getPeerByCustomerUserId", "getNativeTrackById", "(Ljava/lang/String;)Llive/hms/video/media/tracks/HMSTrack;", "Llive/hms/video/sdk/SDKStore$TrackMetadataPair;", "getTrackMetadata", "(Ljava/lang/String;)Llive/hms/video/sdk/SDKStore$TrackMetadataPair;", "getPeerByTrackId", "Lkotlin/Function1;", "checker", "filterRemoterPeers", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "Lkotlin/Function2;", "", "action", "forEachPeerWithTime", "(Lc93/m;)V", "forEachTrack", "(Lkotlin/jvm/functions/Function1;)V", "forEachTrackWithTime", "Lkotlin/Function3;", "forEachTrackDataWithTime", "(Lkotlin/jvm/functions/Function3;)V", "id", "hasTrackMetadataFor", "clear", "()V", "R", "mapTracks", "Ll83/k;", "getRemoteTrackCopy", "flags", "setFeatureFlags", "(Ljava/util/List;)V", "copy", "(Ljava/util/Map;Ljava/util/concurrent/ConcurrentHashMap;)Llive/hms/video/sdk/SDKStore;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "component1", "()Ljava/util/Map;", "component2", "()Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/Map;", "Ljava/util/concurrent/ConcurrentHashMap;", "localMute", "Z", "", "trackMetadataId", "Ljava/util/Set;", "Llive/hms/video/sdk/models/role/HMSRole;", "role", "Llive/hms/video/sdk/models/role/HMSRole;", "getRole", "()Llive/hms/video/sdk/models/role/HMSRole;", "setRole", "(Llive/hms/video/sdk/models/role/HMSRole;)V", "", "rolesMap", "getRolesMap", "setRolesMap", "(Ljava/util/Map;)V", "Llive/hms/video/sdk/models/HMSNotifications$Plugins;", "plugins", "Llive/hms/video/sdk/models/HMSNotifications$Plugins;", "getPlugins", "()Llive/hms/video/sdk/models/HMSNotifications$Plugins;", "setPlugins", "(Llive/hms/video/sdk/models/HMSNotifications$Plugins;)V", "_localPeerId", "Ljava/lang/String;", "trackMetadata", "trackIDToPeerIdMap", "Llive/hms/video/sdk/models/HMSRoom;", "_room", "Llive/hms/video/sdk/models/HMSRoom;", "get_room", "()Llive/hms/video/sdk/models/HMSRoom;", "set_room", "(Llive/hms/video/sdk/models/HMSRoom;)V", "Llive/hms/video/sdk/featureflags/FeatureFlags;", "value", "featureFlags", "Llive/hms/video/sdk/featureflags/FeatureFlags;", "getFeatureFlags", "()Llive/hms/video/sdk/featureflags/FeatureFlags;", "Llive/hms/video/sessionstore/HmsSessionStore;", "hmsSessionStore", "Llive/hms/video/sessionstore/HmsSessionStore;", "getHmsSessionStore", "()Llive/hms/video/sessionstore/HmsSessionStore;", "setHmsSessionStore", "(Llive/hms/video/sessionstore/HmsSessionStore;)V", "Llive/hms/video/interactivity/HmsInteractivityCenter;", "hmsInteractivityCenter", "Llive/hms/video/interactivity/HmsInteractivityCenter;", "getHmsInteractivityCenter", "()Llive/hms/video/interactivity/HmsInteractivityCenter;", "setHmsInteractivityCenter", "(Llive/hms/video/interactivity/HmsInteractivityCenter;)V", "getLocalPeerId", "localPeerId", "getCountTracks", "countTracks", "getCountTracksMetadata", "countTracksMetadata", "getCountPeers", "countPeers", "getHasLocalPeer", "hasLocalPeer", "Companion", "PeerTimePair", "TrackTimePair", "TrackMetadataPair", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class SDKStore {
    private static final String TAG = "SDKStore";
    private String _localPeerId;
    private HMSRoom _room;
    private FeatureFlags featureFlags;
    private HmsInteractivityCenter hmsInteractivityCenter;
    private HmsSessionStore hmsSessionStore;
    private boolean localMute;
    private final Map<String, PeerTimePair> peers;
    private HMSNotifications.Plugins plugins;
    private HMSRole role;
    private Map<String, HMSRole> rolesMap;
    private final Map<String, String> trackIDToPeerIdMap;
    private final Map<String, TrackMetadataPair> trackMetadata;
    private final Set<String> trackMetadataId;
    private final ConcurrentHashMap<String, TrackTimePair> tracks;

    /* JADX WARN: Multi-variable type inference failed */
    public SDKStore() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final Map<String, PeerTimePair> component1() {
        return this.peers;
    }

    private final ConcurrentHashMap<String, TrackTimePair> component2() {
        return this.tracks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SDKStore copy$default(SDKStore sDKStore, Map map, ConcurrentHashMap concurrentHashMap, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = sDKStore.peers;
        }
        if ((i13 & 2) != 0) {
            concurrentHashMap = sDKStore.tracks;
        }
        return sDKStore.copy(map, concurrentHashMap);
    }

    public final synchronized HMSRemotePeer add(HMSNotifications.PeerJoin peer) {
        HMSRemotePeer hMSRemotePeer;
        PermissionsParams permission;
        try {
            AbstractC22676k.m65750j(peer, "peer");
            HMSRole hMSRole = this.rolesMap.get(peer.getRole());
            String peerId = peer.getPeerId();
            String customerUserId = peer.getInfo().getCustomerUserId();
            HMSRole hMSRole2 = new HMSRole(peer.getRole(), hMSRole != null ? hMSRole.getPublishParams() : null, hMSRole != null ? hMSRole.getSubscribeParams() : null, (hMSRole == null || (permission = hMSRole.getPermission()) == null) ? new PermissionsParams(false, false, false, false, false, false, false, false, false, false, null, 2047, null) : permission, hMSRole != null ? hMSRole.getPriority() : 1, 1L);
            String userName = peer.getInfo().getUserName();
            String metadata = peer.getInfo().getMetadata();
            if (metadata == null) {
                metadata = "";
            }
            String str = metadata;
            long joinedAt = peer.getJoinedAt();
            HMSPeerType typeSipOrRegular = peer.getInfo().getTypeSipOrRegular();
            if (typeSipOrRegular == null) {
                typeSipOrRegular = HMSPeerType.REGULAR;
            }
            hMSRemotePeer = new HMSRemotePeer(peerId, customerUserId, userName, hMSRole2, joinedAt, str, typeSipOrRegular);
            hMSRemotePeer.setGroups$lib_release(peer.getGroups());
            this.peers.put(peer.getPeerId(), new PeerTimePair(hMSRemotePeer, 0L, 2, null));
        } catch (Throwable th3) {
            throw th3;
        }
        return hMSRemotePeer;
    }

    public final synchronized void addLocalPeer(HMSPeer peer) {
        AbstractC22676k.m65750j(peer, "peer");
        this.peers.put(peer.getPeerID(), new PeerTimePair(peer, 0L, 2, null));
        this._localPeerId = peer.getPeerID();
    }

    public final synchronized void addNativeTrack(HMSTrack track) {
        AbstractC22676k.m65750j(track, "track");
        this.tracks.put(track.getTrackId(), new TrackTimePair(track, 0L, 2, null));
    }

    public final synchronized void addTrackMetadata(HMSNotifications.Track data, String peerId) {
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(peerId, "peerId");
        this.trackMetadataId.add(data.getTrackId());
        this.trackIDToPeerIdMap.put(data.getTrackId(), peerId);
        this.trackMetadata.put(data.getTrackId(), new TrackMetadataPair(peerId, data, 0L, 4, null));
    }

    public final synchronized void clear() {
        HMSLogger.m71136d(TAG, "clear: START ⏰");
        this.role = null;
        this.rolesMap = C25272z.f99163w;
        this.plugins = null;
        this.trackIDToPeerIdMap.clear();
        this.trackMetadata.clear();
        this.tracks.clear();
        this.peers.clear();
        setLocalTracksMute(false);
        this._localPeerId = null;
        this._room = null;
        this.featureFlags = null;
        this.hmsSessionStore = null;
        this.hmsInteractivityCenter = null;
        HMSLogger.m71136d(TAG, "clear: DONE ✅");
    }

    public final SDKStore copy(Map<String, PeerTimePair> peers, ConcurrentHashMap<String, TrackTimePair> tracks) {
        AbstractC22676k.m65750j(peers, "peers");
        AbstractC22676k.m65750j(tracks, "tracks");
        return new SDKStore(peers, tracks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SDKStore)) {
            return false;
        }
        SDKStore sDKStore = (SDKStore) other;
        return AbstractC22676k.m65745e(this.peers, sDKStore.peers) && AbstractC22676k.m65745e(this.tracks, sDKStore.tracks);
    }

    public final synchronized List<HMSRemotePeer> filterRemoterPeers(Function1 checker) {
        ArrayList arrayList;
        try {
            AbstractC22676k.m65750j(checker, "checker");
            Map<String, PeerTimePair> map = this.peers;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, PeerTimePair> entry : map.entrySet()) {
                if (!entry.getValue().getPeer().getIsLocal()) {
                    HMSPeer peer = entry.getValue().getPeer();
                    AbstractC22676k.m65748h(peer, "null cannot be cast to non-null type live.hms.video.sdk.models.HMSRemotePeer");
                    if (((Boolean) checker.invoke((HMSRemotePeer) peer)).booleanValue()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            arrayList = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                HMSPeer peer2 = ((PeerTimePair) ((Map.Entry) it.next()).getValue()).getPeer();
                AbstractC22676k.m65748h(peer2, "null cannot be cast to non-null type live.hms.video.sdk.models.HMSRemotePeer");
                arrayList.add((HMSRemotePeer) peer2);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return arrayList;
    }

    public final synchronized void forEachPeerWithTime(InterfaceC4351m action) {
        AbstractC22676k.m65750j(action, "action");
        synchronized (this.peers) {
            for (Map.Entry<String, PeerTimePair> entry : this.peers.entrySet()) {
                action.invoke(entry.getValue().getPeer(), Long.valueOf(entry.getValue().getTimestamp()));
            }
        }
    }

    public final synchronized void forEachTrack(Function1 action) {
        AbstractC22676k.m65750j(action, "action");
        Iterator<Map.Entry<String, TrackTimePair>> it = this.tracks.entrySet().iterator();
        while (it.hasNext()) {
            action.invoke(it.next().getValue().getTrack());
        }
    }

    public final synchronized void forEachTrackDataWithTime(Function3 action) {
        AbstractC22676k.m65750j(action, "action");
        for (Map.Entry<String, TrackMetadataPair> entry : this.trackMetadata.entrySet()) {
            action.invoke(entry.getValue().getPeerId(), entry.getValue().getTrackData(), Long.valueOf(entry.getValue().getTimestamp()));
        }
    }

    public final synchronized void forEachTrackWithTime(InterfaceC4351m action) {
        AbstractC22676k.m65750j(action, "action");
        for (Map.Entry<String, TrackTimePair> entry : this.tracks.entrySet()) {
            action.invoke(entry.getValue().getTrack(), Long.valueOf(entry.getValue().getTimestamp()));
        }
    }

    public final synchronized int getCountPeers() {
        return this.peers.size();
    }

    public final synchronized int getCountTracks() {
        return this.tracks.size();
    }

    public final synchronized int getCountTracksMetadata() {
        return this.trackMetadata.size();
    }

    public final FeatureFlags getFeatureFlags() {
        return this.featureFlags;
    }

    public final synchronized boolean getHasLocalPeer() {
        return this._localPeerId != null;
    }

    public final HmsInteractivityCenter getHmsInteractivityCenter() {
        return this.hmsInteractivityCenter;
    }

    public final HmsSessionStore getHmsSessionStore() {
        return this.hmsSessionStore;
    }

    public final synchronized HMSLocalPeer getLocalPeer() {
        HMSLocalPeer hMSLocalPeer;
        HMSPeer peerById;
        String str = this._localPeerId;
        hMSLocalPeer = null;
        if (str != null && (peerById = getPeerById(str)) != null) {
            hMSLocalPeer = (HMSLocalPeer) peerById;
        }
        return hMSLocalPeer;
    }

    public final synchronized String getLocalPeerId() {
        String str;
        str = this._localPeerId;
        AbstractC22676k.m65747g(str);
        return str;
    }

    public final synchronized boolean getLocalTracksMute() {
        return this.localMute;
    }

    public final synchronized HMSTrack getNativeTrackById(String trackId) {
        TrackTimePair trackTimePair;
        AbstractC22676k.m65750j(trackId, "trackId");
        trackTimePair = this.tracks.get(trackId);
        return trackTimePair != null ? trackTimePair.getTrack() : null;
    }

    /* JADX INFO: renamed from: getNullableLocalPeerId, reason: from getter */
    public final String get_localPeerId() {
        return this._localPeerId;
    }

    public final synchronized HMSPeer getPeerByCustomerUserId(String customerUserID) {
        if (customerUserID == null) {
            return null;
        }
        for (PeerTimePair peerTimePair : this.peers.values()) {
            if (AbstractC22676k.m65745e(peerTimePair.getPeer().getCustomerUserID(), customerUserID)) {
                return peerTimePair.getPeer();
            }
        }
        return null;
    }

    public final synchronized HMSPeer getPeerById(String peerId) {
        HMSPeer peer;
        peer = null;
        if (peerId != null) {
            PeerTimePair peerTimePair = this.peers.get(peerId);
            if (peerTimePair != null) {
                peer = peerTimePair.getPeer();
            }
        }
        return peer;
    }

    public final synchronized HMSPeer getPeerByTrackId(String trackId) {
        String str;
        AbstractC22676k.m65750j(trackId, "trackId");
        str = this.trackIDToPeerIdMap.get(trackId);
        return str != null ? getPeerById(str) : null;
    }

    public final synchronized List<HMSPeer> getPeers() {
        ArrayList arrayList;
        Collection<PeerTimePair> collectionValues = this.peers.values();
        arrayList = new ArrayList(AbstractC25267u.m74163i0(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(((PeerTimePair) it.next()).getPeer());
        }
        return arrayList;
    }

    public final synchronized HMSNotifications.Plugins getPlugins() {
        return this.plugins;
    }

    public final synchronized List<HMSRemotePeer> getRemotePeers() {
        ArrayList arrayList;
        try {
            List<HMSPeer> peers = getPeers();
            ArrayList<HMSPeer> arrayList2 = new ArrayList();
            for (Object obj : peers) {
                if (!((HMSPeer) obj).getIsLocal()) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
            for (HMSPeer hMSPeer : arrayList2) {
                AbstractC22676k.m65748h(hMSPeer, "null cannot be cast to non-null type live.hms.video.sdk.models.HMSRemotePeer");
                arrayList.add((HMSRemotePeer) hMSPeer);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return arrayList;
    }

    public final synchronized List<C23465k> getRemoteTrackCopy() {
        return AbstractC25247g0.m73999h0(this.tracks);
    }

    public final synchronized HMSRole getRole() {
        return this.role;
    }

    public final synchronized Map<String, HMSRole> getRolesMap() {
        return this.rolesMap;
    }

    public final synchronized TrackMetadataPair getTrackMetadata(String trackId) {
        AbstractC22676k.m65750j(trackId, "trackId");
        return this.trackMetadata.get(trackId);
    }

    public final synchronized HMSRoom get_room() {
        return this._room;
    }

    public final synchronized boolean hasTrackMetadataFor(String id4) {
        boolean zContains;
        AbstractC22676k.m65750j(id4, "id");
        synchronized (this.trackMetadataId) {
            zContains = this.trackMetadataId.contains(id4);
        }
        return zContains;
    }

    public int hashCode() {
        return this.tracks.hashCode() + (this.peers.hashCode() * 31);
    }

    public final synchronized void initWithConfig(HMSConfig config) {
        String name;
        try {
            AbstractC22676k.m65750j(config, "config");
            if (!getHasLocalPeer()) {
                AuthTokenUtils.AuthToken jWTPayload = AuthTokenUtils.INSTANCE.getJWTPayload(config.getAuthtoken());
                HMSLocalPeer hMSLocalPeer = new HMSLocalPeer(jWTPayload.getUserId(), config.getUserName(), new HMSRole(jWTPayload.getRole(), null, null, new PermissionsParams(false, false, false, false, false, false, false, false, false, false, null, 2047, null), 1, 1L), config.getMetadata());
                addLocalPeer(hMSLocalPeer);
                this._room = new HMSRoom(jWTPayload.getRoomId(), hMSLocalPeer.getName(), this, null, 8, null);
            } else if (this._room == null) {
                String roomId = AuthTokenUtils.INSTANCE.getJWTPayload(config.getAuthtoken()).getRoomId();
                HMSLocalPeer localPeer = getLocalPeer();
                if (localPeer == null || (name = localPeer.getName()) == null) {
                    name = "Unknown Name";
                }
                this._room = new HMSRoom(roomId, name, this, null, 8, null);
            }
            HMSLocalPeer localPeer2 = getLocalPeer();
            if (localPeer2 != null) {
                localPeer2.setName$lib_release(config.getUserName());
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized <R> List<R> mapTracks(Function1 action) {
        ArrayList arrayList;
        AbstractC22676k.m65750j(action, "action");
        ConcurrentHashMap<String, TrackTimePair> concurrentHashMap = this.tracks;
        arrayList = new ArrayList(concurrentHashMap.size());
        Iterator<Map.Entry<String, TrackTimePair>> it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(action.invoke(it.next().getValue().getTrack()));
        }
        return arrayList;
    }

    public final synchronized void muteAllRemoteTracks(boolean mute) {
        double d3 = mute ? 0.0d : 1.0d;
        Iterator<Map.Entry<String, TrackTimePair>> it = this.tracks.entrySet().iterator();
        while (it.hasNext()) {
            HMSTrack track = it.next().getValue().getTrack();
            if (track.getType() == HMSTrackType.AUDIO && (track instanceof HMSRemoteAudioTrack)) {
                ((HMSRemoteAudioTrack) track).setVolume(d3);
            }
        }
    }

    public final synchronized boolean remove(HMSPeer peer) {
        AbstractC22676k.m65750j(peer, "peer");
        return this.peers.remove(peer.getPeerID()) != null;
    }

    public final synchronized void removeNativeTrack(HMSTrack track) {
        AbstractC22676k.m65750j(track, "track");
        this.tracks.remove(track.getTrackId());
    }

    public final synchronized boolean removeTrackData(String trackId) {
        AbstractC22676k.m65750j(trackId, "trackId");
        this.trackMetadataId.add(trackId);
        return this.trackMetadata.remove(trackId) != null;
    }

    public final void setFeatureFlags(List<String> flags) {
        if (flags != null) {
            this.featureFlags = new FeatureFlags(AbstractC25265s.m74103I1(flags));
        }
    }

    public final void setHmsInteractivityCenter(HmsInteractivityCenter hmsInteractivityCenter) {
        this.hmsInteractivityCenter = hmsInteractivityCenter;
    }

    public final void setHmsSessionStore(HmsSessionStore hmsSessionStore) {
        this.hmsSessionStore = hmsSessionStore;
    }

    public final synchronized void setLocalTracksMute(boolean mute) {
        this.localMute = mute;
    }

    public final synchronized void setPlugins(HMSNotifications.Plugins plugins) {
        this.plugins = plugins;
    }

    public final synchronized void setRole(HMSRole hMSRole) {
        this.role = hMSRole;
    }

    public final synchronized void setRolesMap(Map<String, HMSRole> map) {
        AbstractC22676k.m65750j(map, "<set-?>");
        this.rolesMap = map;
    }

    public final synchronized void set_room(HMSRoom hMSRoom) {
        this._room = hMSRoom;
    }

    public String toString() {
        return "SDKStore(peers=" + this.peers + ", tracks=" + this.tracks + ')';
    }

    public final synchronized boolean updateRTCTrack(HMSNotifications.Track data) {
        boolean z4;
        HMSTrack track;
        try {
            AbstractC22676k.m65750j(data, "data");
            TrackTimePair trackTimePair = this.tracks.get(data.getTrackId());
            if (trackTimePair == null || (track = trackTimePair.getTrack()) == null) {
                z4 = false;
            } else {
                String string = track.getType().toString();
                Locale ENGLISH = Locale.ENGLISH;
                AbstractC22676k.m65749i(ENGLISH, "ENGLISH");
                String lowerCase = string.toLowerCase(ENGLISH);
                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                if (!lowerCase.equals(data.getType())) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                track.setSource(data.getSource());
                track.setMute$lib_release(data.isMute());
                track.setDescription$lib_release(data.getDescription());
                z4 = true;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return z4;
    }

    public final synchronized boolean updateTrackMetaData(String peerId, HMSNotifications.Track data) {
        AbstractC22676k.m65750j(peerId, "peerId");
        AbstractC22676k.m65750j(data, "data");
        if (!this.trackMetadata.containsKey(data.getTrackId())) {
            return false;
        }
        this.trackMetadata.put(data.getTrackId(), new TrackMetadataPair(peerId, data, 0L, 4, null));
        return true;
    }

    public SDKStore(Map<String, PeerTimePair> peers, ConcurrentHashMap<String, TrackTimePair> tracks) {
        AbstractC22676k.m65750j(peers, "peers");
        AbstractC22676k.m65750j(tracks, "tracks");
        this.peers = peers;
        this.tracks = tracks;
        Set<String> setSynchronizedSet = Collections.synchronizedSet(new HashSet());
        AbstractC22676k.m65749i(setSynchronizedSet, "synchronizedSet(...)");
        this.trackMetadataId = setSynchronizedSet;
        this.rolesMap = C25272z.f99163w;
        Map<String, TrackMetadataPair> mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        AbstractC22676k.m65749i(mapSynchronizedMap, "synchronizedMap(...)");
        this.trackMetadata = mapSynchronizedMap;
        Map<String, String> mapSynchronizedMap2 = Collections.synchronizedMap(new HashMap());
        AbstractC22676k.m65749i(mapSynchronizedMap2, "synchronizedMap(...)");
        this.trackIDToPeerIdMap = mapSynchronizedMap2;
    }

    public final synchronized boolean remove(HMSTrack track) {
        AbstractC22676k.m65750j(track, "track");
        this.trackIDToPeerIdMap.remove(track.getTrackId());
        return this.tracks.remove(track.getTrackId()) != null;
    }

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Llive/hms/video/sdk/SDKStore$PeerTimePair;", "", "peer", "Llive/hms/video/sdk/models/HMSPeer;", "timestamp", "", "<init>", "(Llive/hms/video/sdk/models/HMSPeer;J)V", "getPeer", "()Llive/hms/video/sdk/models/HMSPeer;", "getTimestamp", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class PeerTimePair {
        private final HMSPeer peer;
        private final long timestamp;

        public PeerTimePair(HMSPeer peer, long j7) {
            AbstractC22676k.m65750j(peer, "peer");
            this.peer = peer;
            this.timestamp = j7;
        }

        public static /* synthetic */ PeerTimePair copy$default(PeerTimePair peerTimePair, HMSPeer hMSPeer, long j7, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                hMSPeer = peerTimePair.peer;
            }
            if ((i13 & 2) != 0) {
                j7 = peerTimePair.timestamp;
            }
            return peerTimePair.copy(hMSPeer, j7);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HMSPeer getPeer() {
            return this.peer;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        public final PeerTimePair copy(HMSPeer peer, long timestamp) {
            AbstractC22676k.m65750j(peer, "peer");
            return new PeerTimePair(peer, timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PeerTimePair)) {
                return false;
            }
            PeerTimePair peerTimePair = (PeerTimePair) other;
            return AbstractC22676k.m65745e(this.peer, peerTimePair.peer) && this.timestamp == peerTimePair.timestamp;
        }

        public final HMSPeer getPeer() {
            return this.peer;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp) + (this.peer.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("PeerTimePair(peer=");
            sb4.append(this.peer);
            sb4.append(", timestamp=");
            return AbstractC2875y.m8302o(sb4, this.timestamp, ')');
        }

        public /* synthetic */ PeerTimePair(HMSPeer hMSPeer, long j7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(hMSPeer, (i13 & 2) != 0 ? System.currentTimeMillis() : j7);
        }
    }

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Llive/hms/video/sdk/SDKStore$TrackTimePair;", "", "track", "Llive/hms/video/media/tracks/HMSTrack;", "timestamp", "", "<init>", "(Llive/hms/video/media/tracks/HMSTrack;J)V", "getTrack", "()Llive/hms/video/media/tracks/HMSTrack;", "getTimestamp", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class TrackTimePair {
        private final long timestamp;
        private final HMSTrack track;

        public TrackTimePair(HMSTrack track, long j7) {
            AbstractC22676k.m65750j(track, "track");
            this.track = track;
            this.timestamp = j7;
        }

        public static /* synthetic */ TrackTimePair copy$default(TrackTimePair trackTimePair, HMSTrack hMSTrack, long j7, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                hMSTrack = trackTimePair.track;
            }
            if ((i13 & 2) != 0) {
                j7 = trackTimePair.timestamp;
            }
            return trackTimePair.copy(hMSTrack, j7);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HMSTrack getTrack() {
            return this.track;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        public final TrackTimePair copy(HMSTrack track, long timestamp) {
            AbstractC22676k.m65750j(track, "track");
            return new TrackTimePair(track, timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackTimePair)) {
                return false;
            }
            TrackTimePair trackTimePair = (TrackTimePair) other;
            return AbstractC22676k.m65745e(this.track, trackTimePair.track) && this.timestamp == trackTimePair.timestamp;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final HMSTrack getTrack() {
            return this.track;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp) + (this.track.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("TrackTimePair(track=");
            sb4.append(this.track);
            sb4.append(", timestamp=");
            return AbstractC2875y.m8302o(sb4, this.timestamp, ')');
        }

        public /* synthetic */ TrackTimePair(HMSTrack hMSTrack, long j7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(hMSTrack, (i13 & 2) != 0 ? System.currentTimeMillis() : j7);
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/sdk/SDKStore$TrackMetadataPair;", "", "peerId", "", "trackData", "Llive/hms/video/sdk/models/HMSNotifications$Track;", "timestamp", "", "<init>", "(Ljava/lang/String;Llive/hms/video/sdk/models/HMSNotifications$Track;J)V", "getPeerId", "()Ljava/lang/String;", "getTrackData", "()Llive/hms/video/sdk/models/HMSNotifications$Track;", "getTimestamp", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class TrackMetadataPair {
        private final String peerId;
        private final long timestamp;
        private final HMSNotifications.Track trackData;

        public TrackMetadataPair(String peerId, HMSNotifications.Track trackData, long j7) {
            AbstractC22676k.m65750j(peerId, "peerId");
            AbstractC22676k.m65750j(trackData, "trackData");
            this.peerId = peerId;
            this.trackData = trackData;
            this.timestamp = j7;
        }

        public static /* synthetic */ TrackMetadataPair copy$default(TrackMetadataPair trackMetadataPair, String str, HMSNotifications.Track track, long j7, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = trackMetadataPair.peerId;
            }
            if ((i13 & 2) != 0) {
                track = trackMetadataPair.trackData;
            }
            if ((i13 & 4) != 0) {
                j7 = trackMetadataPair.timestamp;
            }
            return trackMetadataPair.copy(str, track, j7);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPeerId() {
            return this.peerId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final HMSNotifications.Track getTrackData() {
            return this.trackData;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        public final TrackMetadataPair copy(String peerId, HMSNotifications.Track trackData, long timestamp) {
            AbstractC22676k.m65750j(peerId, "peerId");
            AbstractC22676k.m65750j(trackData, "trackData");
            return new TrackMetadataPair(peerId, trackData, timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackMetadataPair)) {
                return false;
            }
            TrackMetadataPair trackMetadataPair = (TrackMetadataPair) other;
            return AbstractC22676k.m65745e(this.peerId, trackMetadataPair.peerId) && AbstractC22676k.m65745e(this.trackData, trackMetadataPair.trackData) && this.timestamp == trackMetadataPair.timestamp;
        }

        public final String getPeerId() {
            return this.peerId;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final HMSNotifications.Track getTrackData() {
            return this.trackData;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp) + ((this.trackData.hashCode() + (this.peerId.hashCode() * 31)) * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("TrackMetadataPair(peerId=");
            sb4.append(this.peerId);
            sb4.append(", trackData=");
            sb4.append(this.trackData);
            sb4.append(", timestamp=");
            return AbstractC2875y.m8302o(sb4, this.timestamp, ')');
        }

        public /* synthetic */ TrackMetadataPair(String str, HMSNotifications.Track track, long j7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, track, (i13 & 4) != 0 ? System.currentTimeMillis() : j7);
        }
    }

    public /* synthetic */ SDKStore(Map map, ConcurrentHashMap concurrentHashMap, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? Collections.synchronizedMap(new HashMap()) : map, (i13 & 2) != 0 ? new ConcurrentHashMap() : concurrentHashMap);
    }
}
