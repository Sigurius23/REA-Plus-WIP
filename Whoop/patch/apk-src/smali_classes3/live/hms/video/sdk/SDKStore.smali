.class public final Llive/hms/video/sdk/SDKStore;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/sdk/SDKStore$Companion;,
        Llive/hms/video/sdk/SDKStore$PeerTimePair;,
        Llive/hms/video/sdk/SDKStore$TrackMetadataPair;,
        Llive/hms/video/sdk/SDKStore$TrackTimePair;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00e2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010 \n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0010#\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010$\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0008\u0080\u0008\u0018\u0000 \u00b0\u00012\u00020\u0001:\u0008\u00b0\u0001\u00b1\u0001\u00b2\u0001\u00b3\u0001B3\u0012\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0012\u0010\u000fJ\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0015\u0010\"\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020!\u00a2\u0006\u0004\u0008\"\u0010#J\u0015\u0010$\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020!\u00a2\u0006\u0004\u0008$\u0010%J\u001d\u0010)\u001a\u00020\r2\u0006\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0015\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0015\u00100\u001a\u00020\r2\u0006\u0010/\u001a\u00020.\u00a2\u0006\u0004\u00080\u00101J\u0015\u0010$\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.\u00a2\u0006\u0004\u0008$\u00102J\u0015\u00103\u001a\u00020\r2\u0006\u0010/\u001a\u00020.\u00a2\u0006\u0004\u00083\u00101J\u0015\u00104\u001a\u00020\u000b2\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0004\u00084\u00105J\u001d\u00106\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u00032\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0004\u00086\u00107J\u0013\u00109\u001a\u0008\u0012\u0004\u0012\u00020!08\u00a2\u0006\u0004\u00089\u0010:J\u0013\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\u001b08\u00a2\u0006\u0004\u0008;\u0010:J\u0019\u0010<\u001a\u0004\u0018\u00010!2\u0008\u0010(\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008<\u0010=J\u0019\u0010?\u001a\u0004\u0018\u00010!2\u0008\u0010>\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008?\u0010=J\u0017\u0010@\u001a\u0004\u0018\u00010.2\u0006\u0010+\u001a\u00020\u0003\u00a2\u0006\u0004\u0008@\u0010AJ\u0017\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010+\u001a\u00020\u0003\u00a2\u0006\u0004\u0008C\u0010DJ\u0017\u0010E\u001a\u0004\u0018\u00010!2\u0006\u0010+\u001a\u00020\u0003\u00a2\u0006\u0004\u0008E\u0010=J\'\u0010H\u001a\u0008\u0012\u0004\u0012\u00020\u001b082\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0F\u00a2\u0006\u0004\u0008H\u0010IJ\'\u0010M\u001a\u00020\r2\u0018\u0010L\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\r0J\u00a2\u0006\u0004\u0008M\u0010NJ!\u0010O\u001a\u00020\r2\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\r0F\u00a2\u0006\u0004\u0008O\u0010PJ\'\u0010Q\u001a\u00020\r2\u0018\u0010L\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\r0J\u00a2\u0006\u0004\u0008Q\u0010NJ-\u0010S\u001a\u00020\r2\u001e\u0010L\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\r0R\u00a2\u0006\u0004\u0008S\u0010TJ\u0015\u0010V\u001a\u00020\u000b2\u0006\u0010U\u001a\u00020\u0003\u00a2\u0006\u0004\u0008V\u0010-J\r\u0010W\u001a\u00020\r\u00a2\u0006\u0004\u0008W\u0010XJ-\u0010Z\u001a\u0008\u0012\u0004\u0012\u00028\u000008\"\u0004\u0008\u0000\u0010Y2\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00028\u00000F\u00a2\u0006\u0004\u0008Z\u0010IJ\u001f\u0010\\\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070[08\u00a2\u0006\u0004\u0008\\\u0010:J\u001d\u0010^\u001a\u00020\r2\u000e\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u000108\u00a2\u0006\u0004\u0008^\u0010_J<\u0010`\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008`\u0010aJ\u0010\u0010b\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008b\u0010\u0014J\u0010\u0010d\u001a\u00020cH\u00d6\u0001\u00a2\u0006\u0004\u0008d\u0010eJ\u001a\u0010g\u001a\u00020\u000b2\u0008\u0010f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008g\u0010hJ\u001c\u0010i\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u00c2\u0003\u00a2\u0006\u0004\u0008i\u0010jJ\u001c\u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006H\u00c2\u0003\u00a2\u0006\u0004\u0008k\u0010lR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010mR \u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010nR\u0016\u0010o\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008o\u0010pR\u001a\u0010r\u001a\u0008\u0012\u0004\u0012\u00020\u00030q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008r\u0010sR$\u0010u\u001a\u0004\u0018\u00010t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008u\u0010v\u001a\u0004\u0008w\u0010x\"\u0004\u0008y\u0010zR.\u0010|\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020t0{8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008|\u0010m\u001a\u0004\u0008}\u0010j\"\u0004\u0008~\u0010\u007fR,\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0081\u0001\u0010\u0082\u0001\u001a\u0006\u0008\u0083\u0001\u0010\u0084\u0001\"\u0006\u0008\u0085\u0001\u0010\u0086\u0001R\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0087\u0001\u0010\u0088\u0001R\"\u0010\u0089\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020B0\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0089\u0001\u0010mR\"\u0010\u008a\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u008a\u0001\u0010mR,\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u008c\u0001\u0010\u008d\u0001\u001a\u0006\u0008\u008e\u0001\u0010\u008f\u0001\"\u0006\u0008\u0090\u0001\u0010\u0091\u0001R0\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0092\u00012\n\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0006@BX\u0086\u000e\u00a2\u0006\u0010\n\u0006\u0008\u0094\u0001\u0010\u0095\u0001\u001a\u0006\u0008\u0096\u0001\u0010\u0097\u0001R,\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0099\u0001\u0010\u009a\u0001\u001a\u0006\u0008\u009b\u0001\u0010\u009c\u0001\"\u0006\u0008\u009d\u0001\u0010\u009e\u0001R,\u0010\u00a0\u0001\u001a\u0005\u0018\u00010\u009f\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001\u001a\u0006\u0008\u00a2\u0001\u0010\u00a3\u0001\"\u0006\u0008\u00a4\u0001\u0010\u00a5\u0001R\u0013\u0010\u00a7\u0001\u001a\u00020\u00038F\u00a2\u0006\u0007\u001a\u0005\u0008\u00a6\u0001\u0010\u0014R\u0013\u0010\u00a9\u0001\u001a\u00020c8F\u00a2\u0006\u0007\u001a\u0005\u0008\u00a8\u0001\u0010eR\u0013\u0010\u00ab\u0001\u001a\u00020c8F\u00a2\u0006\u0007\u001a\u0005\u0008\u00aa\u0001\u0010eR\u0013\u0010\u00ad\u0001\u001a\u00020c8F\u00a2\u0006\u0007\u001a\u0005\u0008\u00ac\u0001\u0010eR\u0013\u0010\u00af\u0001\u001a\u00020\u000b8F\u00a2\u0006\u0007\u001a\u0005\u0008\u00ae\u0001\u0010\u0011\u00a8\u0006\u00b4\u0001"
    }
    d2 = {
        "Llive/hms/video/sdk/SDKStore;",
        "",
        "",
        "",
        "Llive/hms/video/sdk/SDKStore$PeerTimePair;",
        "peers",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "Llive/hms/video/sdk/SDKStore$TrackTimePair;",
        "tracks",
        "<init>",
        "(Ljava/util/Map;Ljava/util/concurrent/ConcurrentHashMap;)V",
        "",
        "mute",
        "Ll83/a0;",
        "setLocalTracksMute",
        "(Z)V",
        "getLocalTracksMute",
        "()Z",
        "muteAllRemoteTracks",
        "getNullableLocalPeerId",
        "()Ljava/lang/String;",
        "Llive/hms/video/sdk/models/HMSConfig;",
        "config",
        "initWithConfig",
        "(Llive/hms/video/sdk/models/HMSConfig;)V",
        "Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;",
        "peer",
        "Llive/hms/video/sdk/models/HMSRemotePeer;",
        "add",
        "(Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;)Llive/hms/video/sdk/models/HMSRemotePeer;",
        "Llive/hms/video/sdk/models/HMSLocalPeer;",
        "getLocalPeer",
        "()Llive/hms/video/sdk/models/HMSLocalPeer;",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "addLocalPeer",
        "(Llive/hms/video/sdk/models/HMSPeer;)V",
        "remove",
        "(Llive/hms/video/sdk/models/HMSPeer;)Z",
        "Llive/hms/video/sdk/models/HMSNotifications$Track;",
        "data",
        "peerId",
        "addTrackMetadata",
        "(Llive/hms/video/sdk/models/HMSNotifications$Track;Ljava/lang/String;)V",
        "trackId",
        "removeTrackData",
        "(Ljava/lang/String;)Z",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "track",
        "addNativeTrack",
        "(Llive/hms/video/media/tracks/HMSTrack;)V",
        "(Llive/hms/video/media/tracks/HMSTrack;)Z",
        "removeNativeTrack",
        "updateRTCTrack",
        "(Llive/hms/video/sdk/models/HMSNotifications$Track;)Z",
        "updateTrackMetaData",
        "(Ljava/lang/String;Llive/hms/video/sdk/models/HMSNotifications$Track;)Z",
        "",
        "getPeers",
        "()Ljava/util/List;",
        "getRemotePeers",
        "getPeerById",
        "(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;",
        "customerUserID",
        "getPeerByCustomerUserId",
        "getNativeTrackById",
        "(Ljava/lang/String;)Llive/hms/video/media/tracks/HMSTrack;",
        "Llive/hms/video/sdk/SDKStore$TrackMetadataPair;",
        "getTrackMetadata",
        "(Ljava/lang/String;)Llive/hms/video/sdk/SDKStore$TrackMetadataPair;",
        "getPeerByTrackId",
        "Lkotlin/Function1;",
        "checker",
        "filterRemoterPeers",
        "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;",
        "Lkotlin/Function2;",
        "",
        "action",
        "forEachPeerWithTime",
        "(Lc93/m;)V",
        "forEachTrack",
        "(Lkotlin/jvm/functions/Function1;)V",
        "forEachTrackWithTime",
        "Lkotlin/Function3;",
        "forEachTrackDataWithTime",
        "(Lkotlin/jvm/functions/Function3;)V",
        "id",
        "hasTrackMetadataFor",
        "clear",
        "()V",
        "R",
        "mapTracks",
        "Ll83/k;",
        "getRemoteTrackCopy",
        "flags",
        "setFeatureFlags",
        "(Ljava/util/List;)V",
        "copy",
        "(Ljava/util/Map;Ljava/util/concurrent/ConcurrentHashMap;)Llive/hms/video/sdk/SDKStore;",
        "toString",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "component1",
        "()Ljava/util/Map;",
        "component2",
        "()Ljava/util/concurrent/ConcurrentHashMap;",
        "Ljava/util/Map;",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "localMute",
        "Z",
        "",
        "trackMetadataId",
        "Ljava/util/Set;",
        "Llive/hms/video/sdk/models/role/HMSRole;",
        "role",
        "Llive/hms/video/sdk/models/role/HMSRole;",
        "getRole",
        "()Llive/hms/video/sdk/models/role/HMSRole;",
        "setRole",
        "(Llive/hms/video/sdk/models/role/HMSRole;)V",
        "",
        "rolesMap",
        "getRolesMap",
        "setRolesMap",
        "(Ljava/util/Map;)V",
        "Llive/hms/video/sdk/models/HMSNotifications$Plugins;",
        "plugins",
        "Llive/hms/video/sdk/models/HMSNotifications$Plugins;",
        "getPlugins",
        "()Llive/hms/video/sdk/models/HMSNotifications$Plugins;",
        "setPlugins",
        "(Llive/hms/video/sdk/models/HMSNotifications$Plugins;)V",
        "_localPeerId",
        "Ljava/lang/String;",
        "trackMetadata",
        "trackIDToPeerIdMap",
        "Llive/hms/video/sdk/models/HMSRoom;",
        "_room",
        "Llive/hms/video/sdk/models/HMSRoom;",
        "get_room",
        "()Llive/hms/video/sdk/models/HMSRoom;",
        "set_room",
        "(Llive/hms/video/sdk/models/HMSRoom;)V",
        "Llive/hms/video/sdk/featureflags/FeatureFlags;",
        "value",
        "featureFlags",
        "Llive/hms/video/sdk/featureflags/FeatureFlags;",
        "getFeatureFlags",
        "()Llive/hms/video/sdk/featureflags/FeatureFlags;",
        "Llive/hms/video/sessionstore/HmsSessionStore;",
        "hmsSessionStore",
        "Llive/hms/video/sessionstore/HmsSessionStore;",
        "getHmsSessionStore",
        "()Llive/hms/video/sessionstore/HmsSessionStore;",
        "setHmsSessionStore",
        "(Llive/hms/video/sessionstore/HmsSessionStore;)V",
        "Llive/hms/video/interactivity/HmsInteractivityCenter;",
        "hmsInteractivityCenter",
        "Llive/hms/video/interactivity/HmsInteractivityCenter;",
        "getHmsInteractivityCenter",
        "()Llive/hms/video/interactivity/HmsInteractivityCenter;",
        "setHmsInteractivityCenter",
        "(Llive/hms/video/interactivity/HmsInteractivityCenter;)V",
        "getLocalPeerId",
        "localPeerId",
        "getCountTracks",
        "countTracks",
        "getCountTracksMetadata",
        "countTracksMetadata",
        "getCountPeers",
        "countPeers",
        "getHasLocalPeer",
        "hasLocalPeer",
        "Companion",
        "PeerTimePair",
        "TrackTimePair",
        "TrackMetadataPair",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Llive/hms/video/sdk/SDKStore$Companion;

.field private static final TAG:Ljava/lang/String; = "SDKStore"


# instance fields
.field private _localPeerId:Ljava/lang/String;

.field private _room:Llive/hms/video/sdk/models/HMSRoom;

.field private featureFlags:Llive/hms/video/sdk/featureflags/FeatureFlags;

.field private hmsInteractivityCenter:Llive/hms/video/interactivity/HmsInteractivityCenter;

.field private hmsSessionStore:Llive/hms/video/sessionstore/HmsSessionStore;

.field private localMute:Z

.field private final peers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/SDKStore$PeerTimePair;",
            ">;"
        }
    .end annotation
.end field

.field private plugins:Llive/hms/video/sdk/models/HMSNotifications$Plugins;

.field private role:Llive/hms/video/sdk/models/role/HMSRole;

.field private rolesMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/models/role/HMSRole;",
            ">;"
        }
    .end annotation
.end field

.field private final trackIDToPeerIdMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final trackMetadata:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/SDKStore$TrackMetadataPair;",
            ">;"
        }
    .end annotation
.end field

.field private final trackMetadataId:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final tracks:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/SDKStore$TrackTimePair;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/sdk/SDKStore$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/sdk/SDKStore$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/sdk/SDKStore;->Companion:Llive/hms/video/sdk/SDKStore$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Llive/hms/video/sdk/SDKStore;-><init>(Ljava/util/Map;Ljava/util/concurrent/ConcurrentHashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;Ljava/util/concurrent/ConcurrentHashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/SDKStore$PeerTimePair;",
            ">;",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/SDKStore$TrackTimePair;",
            ">;)V"
        }
    .end annotation

    const-string v0, "peers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tracks"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Llive/hms/video/sdk/SDKStore;->peers:Ljava/util/Map;

    .line 4
    iput-object p2, p0, Llive/hms/video/sdk/SDKStore;->tracks:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    const-string p2, "synchronizedSet(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/sdk/SDKStore;->trackMetadataId:Ljava/util/Set;

    .line 6
    sget-object p1, Lm83/z;->w:Lm83/z;

    iput-object p1, p0, Llive/hms/video/sdk/SDKStore;->rolesMap:Ljava/util/Map;

    .line 7
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    const-string p2, "synchronizedMap(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/sdk/SDKStore;->trackMetadata:Ljava/util/Map;

    .line 8
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/sdk/SDKStore;->trackIDToPeerIdMap:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Map;Ljava/util/concurrent/ConcurrentHashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 9
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 10
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 11
    :cond_1
    invoke-direct {p0, p1, p2}, Llive/hms/video/sdk/SDKStore;-><init>(Ljava/util/Map;Ljava/util/concurrent/ConcurrentHashMap;)V

    return-void
.end method

.method private final component1()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/SDKStore$PeerTimePair;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->peers:Ljava/util/Map;

    return-object v0
.end method

.method private final component2()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/SDKStore$TrackTimePair;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->tracks:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/SDKStore;Ljava/util/Map;Ljava/util/concurrent/ConcurrentHashMap;ILjava/lang/Object;)Llive/hms/video/sdk/SDKStore;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Llive/hms/video/sdk/SDKStore;->peers:Ljava/util/Map;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Llive/hms/video/sdk/SDKStore;->tracks:Ljava/util/concurrent/ConcurrentHashMap;

    :cond_1
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKStore;->copy(Ljava/util/Map;Ljava/util/concurrent/ConcurrentHashMap;)Llive/hms/video/sdk/SDKStore;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final declared-synchronized add(Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;)Llive/hms/video/sdk/models/HMSRemotePeer;
    .locals 24

    move-object/from16 v1, p0

    monitor-enter p0

    :try_start_0
    const-string v0, "peer"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v1, Llive/hms/video/sdk/SDKStore;->rolesMap:Ljava/util/Map;

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;->getRole()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/video/sdk/models/role/HMSRole;

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;->getPeerId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;->getInfo()Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;

    move-result-object v3

    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;->getCustomerUserId()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Llive/hms/video/sdk/models/role/HMSRole;

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;->getRole()Ljava/lang/String;

    move-result-object v7

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Llive/hms/video/sdk/models/role/HMSRole;->getPublishParams()Llive/hms/video/sdk/models/role/PublishParams;

    move-result-object v8

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_0
    move-object v8, v3

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Llive/hms/video/sdk/models/role/HMSRole;->getSubscribeParams()Llive/hms/video/sdk/models/role/SubscribeParams;

    move-result-object v3

    :cond_1
    move-object v9, v3

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Llive/hms/video/sdk/models/role/HMSRole;->getPermission()Llive/hms/video/sdk/models/role/PermissionsParams;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    move-object v10, v3

    goto :goto_2

    :cond_3
    :goto_1
    new-instance v10, Llive/hms/video/sdk/models/role/PermissionsParams;

    const/16 v22, 0x7ff

    const/16 v23, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v10 .. v23}, Llive/hms/video/sdk/models/role/PermissionsParams;-><init>(ZZZZZZZZZZLlive/hms/video/sdk/models/role/HMSWhiteBoardPermission;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_2
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Llive/hms/video/sdk/models/role/HMSRole;->getPriority()I

    move-result v0

    :goto_3
    move v11, v0

    goto :goto_4

    :cond_4
    const/4 v0, 0x1

    goto :goto_3

    :goto_4
    const-wide/16 v12, 0x1

    invoke-direct/range {v6 .. v13}, Llive/hms/video/sdk/models/role/HMSRole;-><init>(Ljava/lang/String;Llive/hms/video/sdk/models/role/PublishParams;Llive/hms/video/sdk/models/role/SubscribeParams;Llive/hms/video/sdk/models/role/PermissionsParams;IJ)V

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;->getInfo()Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;->getUserName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;->getInfo()Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;

    move-result-object v3

    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;->getMetadata()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_5

    const-string v3, ""

    :cond_5
    move-object v10, v3

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;->getJoinedAt()J

    move-result-wide v8

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;->getInfo()Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;

    move-result-object v3

    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;->getTypeSipOrRegular()Llive/hms/video/sdk/models/HMSPeerType;

    move-result-object v3

    if-nez v3, :cond_6

    sget-object v3, Llive/hms/video/sdk/models/HMSPeerType;->REGULAR:Llive/hms/video/sdk/models/HMSPeerType;

    :cond_6
    move-object v11, v3

    new-instance v3, Llive/hms/video/sdk/models/HMSRemotePeer;

    move-object v7, v6

    move-object v6, v0

    invoke-direct/range {v3 .. v11}, Llive/hms/video/sdk/models/HMSRemotePeer;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/role/HMSRole;JLjava/lang/String;Llive/hms/video/sdk/models/HMSPeerType;)V

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;->getGroups()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v3, v0}, Llive/hms/video/sdk/models/HMSPeer;->setGroups$lib_release(Ljava/util/ArrayList;)V

    iget-object v0, v1, Llive/hms/video/sdk/SDKStore;->peers:Ljava/util/Map;

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSNotifications$PeerJoin;->getPeerId()Ljava/lang/String;

    move-result-object v2

    new-instance v12, Llive/hms/video/sdk/SDKStore$PeerTimePair;

    const/16 v16, 0x2

    const/16 v17, 0x0

    const-wide/16 v14, 0x0

    move-object v13, v3

    invoke-direct/range {v12 .. v17}, Llive/hms/video/sdk/SDKStore$PeerTimePair;-><init>(Llive/hms/video/sdk/models/HMSPeer;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v2, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v3

    :goto_5
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized addLocalPeer(Llive/hms/video/sdk/models/HMSPeer;)V
    .locals 8

    monitor-enter p0

    :try_start_0
    const-string v0, "peer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->peers:Ljava/util/Map;

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSPeer;->getPeerID()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Llive/hms/video/sdk/SDKStore$PeerTimePair;

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-wide/16 v4, 0x0

    move-object v3, p1

    invoke-direct/range {v2 .. v7}, Llive/hms/video/sdk/SDKStore$PeerTimePair;-><init>(Llive/hms/video/sdk/models/HMSPeer;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSPeer;->getPeerID()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/sdk/SDKStore;->_localPeerId:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized addNativeTrack(Llive/hms/video/media/tracks/HMSTrack;)V
    .locals 8

    monitor-enter p0

    :try_start_0
    const-string v0, "track"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->tracks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Llive/hms/video/sdk/SDKStore$TrackTimePair;

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-wide/16 v4, 0x0

    move-object v3, p1

    invoke-direct/range {v2 .. v7}, Llive/hms/video/sdk/SDKStore$TrackTimePair;-><init>(Llive/hms/video/media/tracks/HMSTrack;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized addTrackMetadata(Llive/hms/video/sdk/models/HMSNotifications$Track;Ljava/lang/String;)V
    .locals 9

    monitor-enter p0

    :try_start_0
    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peerId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->trackMetadataId:Ljava/util/Set;

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$Track;->getTrackId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->trackIDToPeerIdMap:Ljava/util/Map;

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$Track;->getTrackId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->trackMetadata:Ljava/util/Map;

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$Track;->getTrackId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Llive/hms/video/sdk/SDKStore$TrackMetadataPair;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-wide/16 v5, 0x0

    move-object v4, p1

    move-object v3, p2

    invoke-direct/range {v2 .. v8}, Llive/hms/video/sdk/SDKStore$TrackMetadataPair;-><init>(Ljava/lang/String;Llive/hms/video/sdk/models/HMSNotifications$Track;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized clear()V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "SDKStore"

    const-string v1, "clear: START \u23f0"

    invoke-static {v0, v1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Llive/hms/video/sdk/SDKStore;->role:Llive/hms/video/sdk/models/role/HMSRole;

    sget-object v1, Lm83/z;->w:Lm83/z;

    iput-object v1, p0, Llive/hms/video/sdk/SDKStore;->rolesMap:Ljava/util/Map;

    iput-object v0, p0, Llive/hms/video/sdk/SDKStore;->plugins:Llive/hms/video/sdk/models/HMSNotifications$Plugins;

    iget-object v1, p0, Llive/hms/video/sdk/SDKStore;->trackIDToPeerIdMap:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    iget-object v1, p0, Llive/hms/video/sdk/SDKStore;->trackMetadata:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    iget-object v1, p0, Llive/hms/video/sdk/SDKStore;->tracks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v1, p0, Llive/hms/video/sdk/SDKStore;->peers:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Llive/hms/video/sdk/SDKStore;->setLocalTracksMute(Z)V

    iput-object v0, p0, Llive/hms/video/sdk/SDKStore;->_localPeerId:Ljava/lang/String;

    iput-object v0, p0, Llive/hms/video/sdk/SDKStore;->_room:Llive/hms/video/sdk/models/HMSRoom;

    iput-object v0, p0, Llive/hms/video/sdk/SDKStore;->featureFlags:Llive/hms/video/sdk/featureflags/FeatureFlags;

    iput-object v0, p0, Llive/hms/video/sdk/SDKStore;->hmsSessionStore:Llive/hms/video/sessionstore/HmsSessionStore;

    iput-object v0, p0, Llive/hms/video/sdk/SDKStore;->hmsInteractivityCenter:Llive/hms/video/interactivity/HmsInteractivityCenter;

    const-string v0, "SDKStore"

    const-string v1, "clear: DONE \u2705"

    invoke-static {v0, v1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final copy(Ljava/util/Map;Ljava/util/concurrent/ConcurrentHashMap;)Llive/hms/video/sdk/SDKStore;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/SDKStore$PeerTimePair;",
            ">;",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/SDKStore$TrackTimePair;",
            ">;)",
            "Llive/hms/video/sdk/SDKStore;"
        }
    .end annotation

    const-string v0, "peers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tracks"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/sdk/SDKStore;

    invoke-direct {v0, p1, p2}, Llive/hms/video/sdk/SDKStore;-><init>(Ljava/util/Map;Ljava/util/concurrent/ConcurrentHashMap;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/SDKStore;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/SDKStore;

    iget-object v1, p0, Llive/hms/video/sdk/SDKStore;->peers:Ljava/util/Map;

    iget-object v3, p1, Llive/hms/video/sdk/SDKStore;->peers:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/sdk/SDKStore;->tracks:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object p1, p1, Llive/hms/video/sdk/SDKStore;->tracks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final declared-synchronized filterRemoterPeers(Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/HMSRemotePeer;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "checker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->peers:Ljava/util/Map;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llive/hms/video/sdk/SDKStore$PeerTimePair;

    invoke-virtual {v3}, Llive/hms/video/sdk/SDKStore$PeerTimePair;->getPeer()Llive/hms/video/sdk/models/HMSPeer;

    move-result-object v3

    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSPeer;->isLocal()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llive/hms/video/sdk/SDKStore$PeerTimePair;

    invoke-virtual {v3}, Llive/hms/video/sdk/SDKStore$PeerTimePair;->getPeer()Llive/hms/video/sdk/models/HMSPeer;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type live.hms.video.sdk.models.HMSRemotePeer"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Llive/hms/video/sdk/models/HMSRemotePeer;

    invoke-interface {p1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/sdk/SDKStore$PeerTimePair;

    invoke-virtual {v1}, Llive/hms/video/sdk/SDKStore$PeerTimePair;->getPeer()Llive/hms/video/sdk/models/HMSPeer;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type live.hms.video.sdk.models.HMSRemotePeer"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Llive/hms/video/sdk/models/HMSRemotePeer;

    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_2
    monitor-exit p0

    return-object p1

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized forEachPeerWithTime(Lc93/m;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->peers:Ljava/util/Map;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Llive/hms/video/sdk/SDKStore;->peers:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llive/hms/video/sdk/SDKStore$PeerTimePair;

    invoke-virtual {v3}, Llive/hms/video/sdk/SDKStore$PeerTimePair;->getPeer()Llive/hms/video/sdk/models/HMSPeer;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/sdk/SDKStore$PeerTimePair;

    invoke-virtual {v2}, Llive/hms/video/sdk/SDKStore$PeerTimePair;->getTimestamp()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {p1, v3, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    goto :goto_2

    :goto_1
    :try_start_3
    monitor-exit v0

    throw p1

    :goto_2
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method public final declared-synchronized forEachTrack(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->tracks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/sdk/SDKStore$TrackTimePair;

    invoke-virtual {v1}, Llive/hms/video/sdk/SDKStore$TrackTimePair;->getTrack()Llive/hms/video/media/tracks/HMSTrack;

    move-result-object v1

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized forEachTrackDataWithTime(Lkotlin/jvm/functions/Function3;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3;",
            ")V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->trackMetadata:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/sdk/SDKStore$TrackMetadataPair;

    invoke-virtual {v2}, Llive/hms/video/sdk/SDKStore$TrackMetadataPair;->getPeerId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llive/hms/video/sdk/SDKStore$TrackMetadataPair;

    invoke-virtual {v3}, Llive/hms/video/sdk/SDKStore$TrackMetadataPair;->getTrackData()Llive/hms/video/sdk/models/HMSNotifications$Track;

    move-result-object v3

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/sdk/SDKStore$TrackMetadataPair;

    invoke-virtual {v1}, Llive/hms/video/sdk/SDKStore$TrackMetadataPair;->getTimestamp()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p1, v2, v3, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized forEachTrackWithTime(Lc93/m;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->tracks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/sdk/SDKStore$TrackTimePair;

    invoke-virtual {v2}, Llive/hms/video/sdk/SDKStore$TrackTimePair;->getTrack()Llive/hms/video/media/tracks/HMSTrack;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/sdk/SDKStore$TrackTimePair;

    invoke-virtual {v1}, Llive/hms/video/sdk/SDKStore$TrackTimePair;->getTimestamp()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p1, v2, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized getCountPeers()I
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->peers:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized getCountTracks()I
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->tracks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized getCountTracksMetadata()I
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->trackMetadata:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final getFeatureFlags()Llive/hms/video/sdk/featureflags/FeatureFlags;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->featureFlags:Llive/hms/video/sdk/featureflags/FeatureFlags;

    return-object v0
.end method

.method public final declared-synchronized getHasLocalPeer()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->_localPeerId:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final getHmsInteractivityCenter()Llive/hms/video/interactivity/HmsInteractivityCenter;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->hmsInteractivityCenter:Llive/hms/video/interactivity/HmsInteractivityCenter;

    return-object v0
.end method

.method public final getHmsSessionStore()Llive/hms/video/sessionstore/HmsSessionStore;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->hmsSessionStore:Llive/hms/video/sessionstore/HmsSessionStore;

    return-object v0
.end method

.method public final declared-synchronized getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->_localPeerId:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Llive/hms/video/sdk/SDKStore;->getPeerById(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object v1, v0

    check-cast v1, Llive/hms/video/sdk/models/HMSLocalPeer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-object v1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized getLocalPeerId()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->_localPeerId:Ljava/lang/String;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized getLocalTracksMute()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Llive/hms/video/sdk/SDKStore;->localMute:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized getNativeTrackById(Ljava/lang/String;)Llive/hms/video/media/tracks/HMSTrack;
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "trackId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->tracks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llive/hms/video/sdk/SDKStore$TrackTimePair;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Llive/hms/video/sdk/SDKStore$TrackTimePair;->getTrack()Llive/hms/video/media/tracks/HMSTrack;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit p0

    return-object p1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final getNullableLocalPeerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->_localPeerId:Ljava/lang/String;

    return-object v0
.end method

.method public final declared-synchronized getPeerByCustomerUserId(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;
    .locals 4

    monitor-enter p0

    const/4 v0, 0x0

    if-nez p1, :cond_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_0
    iget-object v1, p0, Llive/hms/video/sdk/SDKStore;->peers:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/sdk/SDKStore$PeerTimePair;

    invoke-virtual {v2}, Llive/hms/video/sdk/SDKStore$PeerTimePair;->getPeer()Llive/hms/video/sdk/models/HMSPeer;

    move-result-object v3

    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSPeer;->getCustomerUserID()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Llive/hms/video/sdk/SDKStore$PeerTimePair;->getPeer()Llive/hms/video/sdk/models/HMSPeer;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_2
    monitor-exit p0

    return-object v0

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized getPeerById(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;
    .locals 2

    monitor-enter p0

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v1, p0, Llive/hms/video/sdk/SDKStore;->peers:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llive/hms/video/sdk/SDKStore$PeerTimePair;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Llive/hms/video/sdk/SDKStore$PeerTimePair;->getPeer()Llive/hms/video/sdk/models/HMSPeer;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized getPeerByTrackId(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "trackId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->trackIDToPeerIdMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Llive/hms/video/sdk/SDKStore;->getPeerById(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit p0

    return-object p1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized getPeers()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/HMSPeer;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->peers:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/sdk/SDKStore$PeerTimePair;

    invoke-virtual {v2}, Llive/hms/video/sdk/SDKStore$PeerTimePair;->getPeer()Llive/hms/video/sdk/models/HMSPeer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    monitor-exit p0

    return-object v1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized getPlugins()Llive/hms/video/sdk/models/HMSNotifications$Plugins;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->plugins:Llive/hms/video/sdk/models/HMSNotifications$Plugins;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized getRemotePeers()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/HMSRemotePeer;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Llive/hms/video/sdk/SDKStore;->getPeers()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Llive/hms/video/sdk/models/HMSPeer;

    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSPeer;->isLocal()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/sdk/models/HMSPeer;

    const-string v3, "null cannot be cast to non-null type live.hms.video.sdk.models.HMSRemotePeer"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Llive/hms/video/sdk/models/HMSRemotePeer;

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_2
    monitor-exit p0

    return-object v0

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized getRemoteTrackCopy()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ll83/k;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->tracks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0}, Lm83/g0;->h0(Ljava/util/Map;)Ljava/util/List;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized getRole()Llive/hms/video/sdk/models/role/HMSRole;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->role:Llive/hms/video/sdk/models/role/HMSRole;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized getRolesMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/models/role/HMSRole;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->rolesMap:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized getTrackMetadata(Ljava/lang/String;)Llive/hms/video/sdk/SDKStore$TrackMetadataPair;
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "trackId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->trackMetadata:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llive/hms/video/sdk/SDKStore$TrackMetadataPair;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized get_room()Llive/hms/video/sdk/models/HMSRoom;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->_room:Llive/hms/video/sdk/models/HMSRoom;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized hasTrackMetadataFor(Ljava/lang/String;)Z
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->trackMetadataId:Ljava/util/Set;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Llive/hms/video/sdk/SDKStore;->trackMetadataId:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v0

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->peers:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/sdk/SDKStore;->tracks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final declared-synchronized initWithConfig(Llive/hms/video/sdk/models/HMSConfig;)V
    .locals 25

    move-object/from16 v3, p0

    monitor-enter p0

    :try_start_0
    const-string v0, "config"

    move-object/from16 v7, p1

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Llive/hms/video/sdk/SDKStore;->getHasLocalPeer()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Llive/hms/video/utils/AuthTokenUtils;->INSTANCE:Llive/hms/video/utils/AuthTokenUtils;

    invoke-virtual {v7}, Llive/hms/video/sdk/models/HMSConfig;->getAuthtoken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Llive/hms/video/utils/AuthTokenUtils;->getJWTPayload(Ljava/lang/String;)Llive/hms/video/utils/AuthTokenUtils$AuthToken;

    move-result-object v0

    new-instance v1, Llive/hms/video/sdk/models/HMSLocalPeer;

    invoke-virtual {v0}, Llive/hms/video/utils/AuthTokenUtils$AuthToken;->getUserId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7}, Llive/hms/video/sdk/models/HMSConfig;->getUserName()Ljava/lang/String;

    move-result-object v4

    new-instance v8, Llive/hms/video/sdk/models/role/HMSRole;

    invoke-virtual {v0}, Llive/hms/video/utils/AuthTokenUtils$AuthToken;->getRole()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Llive/hms/video/sdk/models/role/PermissionsParams;

    const/16 v22, 0x7ff

    const/16 v23, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v10 .. v23}, Llive/hms/video/sdk/models/role/PermissionsParams;-><init>(ZZZZZZZZZZLlive/hms/video/sdk/models/role/HMSWhiteBoardPermission;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v13, 0x1

    const-wide/16 v14, 0x1

    move-object v12, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v15}, Llive/hms/video/sdk/models/role/HMSRole;-><init>(Ljava/lang/String;Llive/hms/video/sdk/models/role/PublishParams;Llive/hms/video/sdk/models/role/SubscribeParams;Llive/hms/video/sdk/models/role/PermissionsParams;IJ)V

    invoke-virtual {v7}, Llive/hms/video/sdk/models/HMSConfig;->getMetadata()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v2, v4, v8, v5}, Llive/hms/video/sdk/models/HMSLocalPeer;-><init>(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/role/HMSRole;Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Llive/hms/video/sdk/SDKStore;->addLocalPeer(Llive/hms/video/sdk/models/HMSPeer;)V

    move-object v2, v0

    new-instance v0, Llive/hms/video/sdk/models/HMSRoom;

    invoke-virtual {v2}, Llive/hms/video/utils/AuthTokenUtils$AuthToken;->getRoomId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSPeer;->getName()Ljava/lang/String;

    move-result-object v1

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object/from16 v24, v2

    move-object v2, v1

    move-object/from16 v1, v24

    invoke-direct/range {v0 .. v6}, Llive/hms/video/sdk/models/HMSRoom;-><init>(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/SDKStore;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, v3, Llive/hms/video/sdk/SDKStore;->_room:Llive/hms/video/sdk/models/HMSRoom;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    iget-object v0, v3, Llive/hms/video/sdk/SDKStore;->_room:Llive/hms/video/sdk/models/HMSRoom;

    if-nez v0, :cond_3

    sget-object v0, Llive/hms/video/utils/AuthTokenUtils;->INSTANCE:Llive/hms/video/utils/AuthTokenUtils;

    invoke-virtual {v7}, Llive/hms/video/sdk/models/HMSConfig;->getAuthtoken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Llive/hms/video/utils/AuthTokenUtils;->getJWTPayload(Ljava/lang/String;)Llive/hms/video/utils/AuthTokenUtils$AuthToken;

    move-result-object v0

    move-object v1, v0

    new-instance v0, Llive/hms/video/sdk/models/HMSRoom;

    invoke-virtual {v1}, Llive/hms/video/utils/AuthTokenUtils$AuthToken;->getRoomId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Llive/hms/video/sdk/SDKStore;->getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSPeer;->getName()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    :cond_1
    const-string v2, "Unknown Name"

    :cond_2
    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Llive/hms/video/sdk/models/HMSRoom;-><init>(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/SDKStore;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, v3, Llive/hms/video/sdk/SDKStore;->_room:Llive/hms/video/sdk/models/HMSRoom;

    :cond_3
    :goto_0
    invoke-virtual {v3}, Llive/hms/video/sdk/SDKStore;->getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v7}, Llive/hms/video/sdk/models/HMSConfig;->getUserName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Llive/hms/video/sdk/models/HMSPeer;->setName$lib_release(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized mapTracks(Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Ljava/util/List<",
            "TR;>;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->tracks:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/sdk/SDKStore$TrackTimePair;

    invoke-virtual {v2}, Llive/hms/video/sdk/SDKStore$TrackTimePair;->getTrack()Llive/hms/video/media/tracks/HMSTrack;

    move-result-object v2

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    monitor-exit p0

    return-object v1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized muteAllRemoteTracks(Z)V
    .locals 5

    monitor-enter p0

    if-eqz p1, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    :goto_0
    :try_start_0
    iget-object p1, p0, Llive/hms/video/sdk/SDKStore;->tracks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/sdk/SDKStore$TrackTimePair;

    invoke-virtual {v2}, Llive/hms/video/sdk/SDKStore$TrackTimePair;->getTrack()Llive/hms/video/media/tracks/HMSTrack;

    move-result-object v2

    invoke-virtual {v2}, Llive/hms/video/media/tracks/HMSTrack;->getType()Llive/hms/video/media/tracks/HMSTrackType;

    move-result-object v3

    sget-object v4, Llive/hms/video/media/tracks/HMSTrackType;->AUDIO:Llive/hms/video/media/tracks/HMSTrackType;

    if-ne v3, v4, :cond_1

    instance-of v3, v2, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;

    if-eqz v3, :cond_1

    check-cast v2, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;

    invoke-virtual {v2, v0, v1}, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;->setVolume(D)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized remove(Llive/hms/video/media/tracks/HMSTrack;)Z
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "track"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->trackIDToPeerIdMap:Ljava/util/Map;

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->tracks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized remove(Llive/hms/video/sdk/models/HMSPeer;)Z
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "peer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->peers:Ljava/util/Map;

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSPeer;->getPeerID()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized removeNativeTrack(Llive/hms/video/media/tracks/HMSTrack;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "track"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->tracks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized removeTrackData(Ljava/lang/String;)Z
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "trackId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->trackMetadataId:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->trackMetadata:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final setFeatureFlags(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    new-instance v0, Llive/hms/video/sdk/featureflags/FeatureFlags;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    invoke-direct {v0, p1}, Llive/hms/video/sdk/featureflags/FeatureFlags;-><init>(Ljava/util/Set;)V

    iput-object v0, p0, Llive/hms/video/sdk/SDKStore;->featureFlags:Llive/hms/video/sdk/featureflags/FeatureFlags;

    :cond_0
    return-void
.end method

.method public final setHmsInteractivityCenter(Llive/hms/video/interactivity/HmsInteractivityCenter;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/sdk/SDKStore;->hmsInteractivityCenter:Llive/hms/video/interactivity/HmsInteractivityCenter;

    return-void
.end method

.method public final setHmsSessionStore(Llive/hms/video/sessionstore/HmsSessionStore;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/sdk/SDKStore;->hmsSessionStore:Llive/hms/video/sessionstore/HmsSessionStore;

    return-void
.end method

.method public final declared-synchronized setLocalTracksMute(Z)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-boolean p1, p0, Llive/hms/video/sdk/SDKStore;->localMute:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized setPlugins(Llive/hms/video/sdk/models/HMSNotifications$Plugins;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Llive/hms/video/sdk/SDKStore;->plugins:Llive/hms/video/sdk/models/HMSNotifications$Plugins;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized setRole(Llive/hms/video/sdk/models/role/HMSRole;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Llive/hms/video/sdk/SDKStore;->role:Llive/hms/video/sdk/models/role/HMSRole;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized setRolesMap(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/models/role/HMSRole;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/sdk/SDKStore;->rolesMap:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized set_room(Llive/hms/video/sdk/models/HMSRoom;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Llive/hms/video/sdk/SDKStore;->_room:Llive/hms/video/sdk/models/HMSRoom;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SDKStore(peers="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/sdk/SDKStore;->peers:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tracks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/SDKStore;->tracks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized updateRTCTrack(Llive/hms/video/sdk/models/HMSNotifications$Track;)Z
    .locals 4

    monitor-enter p0

    :try_start_0
    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->tracks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$Track;->getTrackId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/video/sdk/SDKStore$TrackTimePair;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKStore$TrackTimePair;->getTrack()Llive/hms/video/media/tracks/HMSTrack;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSTrack;->getType()Llive/hms/video/media/tracks/HMSTrackType;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v3, "ENGLISH"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toLowerCase(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$Track;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$Track;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Llive/hms/video/media/tracks/HMSTrack;->setSource(Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$Track;->isMute()Z

    move-result v1

    invoke-virtual {v0, v1}, Llive/hms/video/media/tracks/HMSTrack;->setMute$lib_release(Z)V

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$Track;->getDescription()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Llive/hms/video/media/tracks/HMSTrack;->setDescription$lib_release(Ljava/lang/String;)V

    const/4 p1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const-string p1, "Failed requirement."

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    monitor-exit p0

    return p1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized updateTrackMetaData(Ljava/lang/String;Llive/hms/video/sdk/models/HMSNotifications$Track;)Z
    .locals 9

    monitor-enter p0

    :try_start_0
    const-string v0, "peerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->trackMetadata:Ljava/util/Map;

    invoke-virtual {p2}, Llive/hms/video/sdk/models/HMSNotifications$Track;->getTrackId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore;->trackMetadata:Ljava/util/Map;

    invoke-virtual {p2}, Llive/hms/video/sdk/models/HMSNotifications$Track;->getTrackId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Llive/hms/video/sdk/SDKStore$TrackMetadataPair;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-wide/16 v5, 0x0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v2 .. v8}, Llive/hms/video/sdk/SDKStore$TrackMetadataPair;-><init>(Ljava/lang/String;Llive/hms/video/sdk/models/HMSNotifications$Track;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :cond_0
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
