package live.hms.video.utils;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import live.hms.video.media.tracks.HMSAudioTrack;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.media.tracks.HMSVideoTrack;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.HMSRoom;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"Llive/hms/video/utils/HmsUtilities;", "", "<init>", "()V", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HmsUtilities {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String[] SOFTWARE_IMPLEMENTATION_PREFIXES = {"OMX.google.", "OMX.SEC.", "c2.android"};

    @Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\rj\b\u0012\u0004\u0012\u00020\f`\u000b2\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J#\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00120\rj\b\u0012\u0004\u0012\u00020\u0012`\u000b2\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001dJ\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001dH\u0003R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\""}, m65681d2 = {"Llive/hms/video/utils/HmsUtilities$Companion;", "", "<init>", "()V", "SOFTWARE_IMPLEMENTATION_PREFIXES", "", "", "getSOFTWARE_IMPLEMENTATION_PREFIXES", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getAllVideoTracks", "Lkotlin/collections/ArrayList;", "Llive/hms/video/media/tracks/HMSVideoTrack;", "Ljava/util/ArrayList;", "room", "Llive/hms/video/sdk/models/HMSRoom;", "(Llive/hms/video/sdk/models/HMSRoom;)Ljava/util/ArrayList;", "getAllAudioTracks", "Llive/hms/video/media/tracks/HMSAudioTrack;", "getPeer", "Llive/hms/video/sdk/models/HMSPeer;", "peerId", "getTrack", "Llive/hms/video/media/tracks/HMSTrack;", "trackId", "getAudioTrack", "getVideoTrack", "getSupportedVp8CodecsList", "", "Landroid/media/MediaCodecInfo;", "isSoftwareOnly", "", "codecInfo", "isSoftwareOnlyQOrHigher", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @TargetApi(29)
        private final boolean isSoftwareOnlyQOrHigher(MediaCodecInfo codecInfo) {
            return codecInfo.isSoftwareOnly();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ArrayList<HMSAudioTrack> getAllAudioTracks(HMSRoom room) {
            AbstractC22676k.m65750j(room, "room");
            ArrayList<HMSAudioTrack> arrayList = new ArrayList<>();
            for (HMSPeer hMSPeer : room.getPeerList()) {
                HMSAudioTrack audioTrack = hMSPeer.getAudioTrack();
                if (audioTrack != null) {
                    arrayList.add(audioTrack);
                }
                for (HMSTrack hMSTrack : hMSPeer.getAuxiliaryTracks()) {
                    if (hMSTrack instanceof HMSAudioTrack) {
                        arrayList.add(hMSTrack);
                    }
                }
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ArrayList<HMSVideoTrack> getAllVideoTracks(HMSRoom room) {
            AbstractC22676k.m65750j(room, "room");
            ArrayList<HMSVideoTrack> arrayList = new ArrayList<>();
            for (HMSPeer hMSPeer : room.getPeerList()) {
                HMSVideoTrack videoTrack = hMSPeer.getVideoTrack();
                if (videoTrack != null) {
                    arrayList.add(videoTrack);
                }
                for (HMSTrack hMSTrack : hMSPeer.getAuxiliaryTracks()) {
                    if (hMSTrack instanceof HMSVideoTrack) {
                        arrayList.add(hMSTrack);
                    }
                }
            }
            return arrayList;
        }

        public final HMSAudioTrack getAudioTrack(String trackId, HMSRoom room) {
            Object next;
            AbstractC22676k.m65750j(trackId, "trackId");
            AbstractC22676k.m65750j(room, "room");
            Iterator<T> it = getAllAudioTracks(room).iterator();
            while (it.hasNext()) {
                next = it.next();
                if (AbstractC22676k.m65745e(((HMSAudioTrack) next).getTrackId(), trackId)) {
                    return (HMSAudioTrack) next;
                }
            }
            next = null;
            return (HMSAudioTrack) next;
        }

        public final HMSPeer getPeer(String peerId, HMSRoom room) {
            Object next;
            AbstractC22676k.m65750j(peerId, "peerId");
            AbstractC22676k.m65750j(room, "room");
            Iterator<T> it = room.getPeerList().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (AbstractC22676k.m65745e(((HMSPeer) next).getPeerID(), peerId)) {
                    return (HMSPeer) next;
                }
            }
            next = null;
            return (HMSPeer) next;
        }

        public final String[] getSOFTWARE_IMPLEMENTATION_PREFIXES() {
            return HmsUtilities.SOFTWARE_IMPLEMENTATION_PREFIXES;
        }

        public final List<MediaCodecInfo> getSupportedVp8CodecsList() {
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            AbstractC22676k.m65749i(codecInfos, "getCodecInfos(...)");
            ArrayList arrayList = new ArrayList();
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (mediaCodecInfo.isEncoder()) {
                    String str = mediaCodecInfo.getSupportedTypes()[0];
                    AbstractC22676k.m65749i(str, "get(...)");
                    if (AbstractC39421y.m125930O(str, "video", false)) {
                        String name = mediaCodecInfo.getName();
                        AbstractC22676k.m65749i(name, "getName(...)");
                        if (AbstractC39414r.m125876U(name, "vp8", false)) {
                            arrayList.add(mediaCodecInfo);
                        }
                    }
                }
            }
            return arrayList;
        }

        public final HMSTrack getTrack(String trackId, HMSRoom room) {
            AbstractC22676k.m65750j(trackId, "trackId");
            AbstractC22676k.m65750j(room, "room");
            HMSAudioTrack audioTrack = getAudioTrack(trackId, room);
            if (audioTrack != null) {
                return audioTrack;
            }
            HMSVideoTrack videoTrack = getVideoTrack(trackId, room);
            if (videoTrack != null) {
                return videoTrack;
            }
            return null;
        }

        public final HMSVideoTrack getVideoTrack(String trackId, HMSRoom room) {
            Object next;
            AbstractC22676k.m65750j(trackId, "trackId");
            AbstractC22676k.m65750j(room, "room");
            Iterator<T> it = getAllVideoTracks(room).iterator();
            while (it.hasNext()) {
                next = it.next();
                if (AbstractC22676k.m65745e(((HMSVideoTrack) next).getTrackId(), trackId)) {
                    return (HMSVideoTrack) next;
                }
            }
            next = null;
            return (HMSVideoTrack) next;
        }

        public final boolean isSoftwareOnly(MediaCodecInfo codecInfo) {
            AbstractC22676k.m65750j(codecInfo, "codecInfo");
            if (Build.VERSION.SDK_INT >= 29) {
                return isSoftwareOnlyQOrHigher(codecInfo);
            }
            String name = codecInfo.getName();
            AbstractC22676k.m65749i(name, "getName(...)");
            for (String str : getSOFTWARE_IMPLEMENTATION_PREFIXES()) {
                if (AbstractC39421y.m125930O(name, str, false)) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }
}
