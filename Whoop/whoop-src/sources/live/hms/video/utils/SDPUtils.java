package live.hms.video.utils;

import hms.webrtc.SessionDescription;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import live.hms.video.media.settings.HMSAudioTrackSettings;
import live.hms.video.media.settings.HMSVideoTrackSettings;
import live.hms.video.media.tracks.HMSLocalAudioTrack;
import live.hms.video.media.tracks.HMSLocalVideoTrack;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.media.tracks.HMSTrackType;
import m83.AbstractC25265s;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yb3.C39412p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u000e\u001a:\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\nj\b\u0012\u0004\u0012\u00020\u0004`\u000b\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007`\r0\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00070\nj\b\u0012\u0004\u0012\u00020\u0007`\u000b2\u0006\u0010\u0010\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00070\nj\b\u0012\u0004\u0012\u00020\u0007`\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00070\nj\b\u0012\u0004\u0012\u00020\u0007`\u000b2\u0006\u0010\u0014\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0006¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010#\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010 ¨\u0006("}, m65681d2 = {"Llive/hms/video/utils/SDPUtils;", "", "<init>", "()V", "", "startIndex", "", "", "sdp", "Ll83/k;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getPayloadTypeToCodecMap", "(I[Ljava/lang/String;)Ll83/k;", "sdpStartIndex", "getMediaLines", "(I[Ljava/lang/String;)Ljava/util/ArrayList;", "Llive/hms/video/media/settings/HMSAudioTrackSettings;", "settings", "mungeAudioMedia", "(Llive/hms/video/media/settings/HMSAudioTrackSettings;I[Ljava/lang/String;)Ljava/util/ArrayList;", "Llive/hms/video/media/settings/HMSVideoTrackSettings;", "mungeVideoMedia", "(Llive/hms/video/media/settings/HMSVideoTrackSettings;I[Ljava/lang/String;)Ljava/util/ArrayList;", "Lhms/webrtc/SessionDescription;", "Llive/hms/video/media/tracks/HMSTrack;", "tracks", "mungePublishSDP", "(Lhms/webrtc/SessionDescription;[Llive/hms/video/media/tracks/HMSTrack;)Lhms/webrtc/SessionDescription;", "TAG", "Ljava/lang/String;", "ATTRIBUTE_RTPMAP", "MEDIA_AUDIO", "MEDIA_VIDEO", "Lyb3/p;", "SDP_SEPARATOR_REGEX", "Lyb3/p;", "SDP_SEPARATOR", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class SDPUtils {
    private static final String ATTRIBUTE_RTPMAP = "a=rtpmap";
    private static final String MEDIA_AUDIO = "m=audio";
    private static final String MEDIA_VIDEO = "m=video";
    private static final String SDP_SEPARATOR = "\r\n";
    private static final String TAG = "SDPUtils";
    public static final SDPUtils INSTANCE = new SDPUtils();
    private static final C39412p SDP_SEPARATOR_REGEX = new C39412p("(\r\n|\r|\n)");

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMSTrackType.values().length];
            try {
                iArr[HMSTrackType.AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HMSTrackType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SDPUtils() {
    }

    private final ArrayList<String> getMediaLines(int sdpStartIndex, String[] sdp) {
        ArrayList<String> arrayList = new ArrayList<>();
        do {
            arrayList.add(sdp[sdpStartIndex]);
            sdpStartIndex++;
            if (sdpStartIndex >= sdp.length) {
                break;
            }
        } while (sdp[sdpStartIndex].charAt(0) != 'm');
        return arrayList;
    }

    private final C23465k getPayloadTypeToCodecMap(int startIndex, String[] sdp) {
        if (!AbstractC39421y.m125930O(sdp[startIndex], MEDIA_AUDIO, false) && !AbstractC39421y.m125930O(sdp[startIndex], MEDIA_VIDEO, false)) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(startIndex, "Expected `startIndex=", "` to be a audio/video media attribute in sdp"));
        }
        List listM125906y0 = AbstractC39414r.m125906y0(sdp[startIndex], new String[]{" "}, 6);
        ArrayList arrayList = new ArrayList();
        int size = listM125906y0.size();
        for (int i13 = 3; i13 < size; i13++) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) listM125906y0.get(i13))));
        }
        HashMap map = new HashMap();
        do {
            if (AbstractC39421y.m125930O(sdp[startIndex], ATTRIBUTE_RTPMAP, false)) {
                String strSubstring = sdp[startIndex].substring(9);
                AbstractC22676k.m65749i(strSubstring, "substring(...)");
                List listM125906y1 = AbstractC39414r.m125906y0(AbstractC39414r.m125869O0(strSubstring).toString(), new String[]{" "}, 6);
                map.put(Integer.valueOf(Integer.parseInt((String) listM125906y1.get(0))), (String) listM125906y1.get(1));
            }
            startIndex++;
            if (startIndex >= sdp.length) {
                break;
            }
        } while (sdp[startIndex].charAt(0) != 'm');
        HMSLogger.m71136d(TAG, "getPayloadTypeToCodecMap: payloadPriority=" + arrayList + " payloadTypeToCodecMap=" + map);
        return new C23465k(arrayList, map);
    }

    private final ArrayList<String> mungeAudioMedia(HMSAudioTrackSettings settings, int sdpStartIndex, String[] sdp) {
        ArrayList<String> arrayList = new ArrayList<>();
        C23465k payloadTypeToCodecMap = getPayloadTypeToCodecMap(sdpStartIndex, sdp);
        HashMap map = (HashMap) payloadTypeToCodecMap.f92938x;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (AbstractC39421y.m125930O((String) entry.getValue(), settings.getCodec().name(), true)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            throw new IllegalStateException("Codec=" + settings.getCodec() + " not supported in this device");
        }
        String strM74110N0 = AbstractC25265s.m74110N0(linkedHashMap.keySet(), " ", null, null, null, 62);
        do {
            if (AbstractC39421y.m125930O(sdp[sdpStartIndex], MEDIA_AUDIO, false)) {
                List listM125906y0 = AbstractC39414r.m125906y0(sdp[sdpStartIndex], new String[]{" "}, 6);
                arrayList.add("m=audio " + ((String) listM125906y0.get(1)) + ' ' + ((String) listM125906y0.get(2)) + ' ' + strM74110N0);
            } else {
                arrayList.add(sdp[sdpStartIndex]);
            }
            sdpStartIndex++;
            if (sdpStartIndex >= sdp.length) {
                break;
            }
        } while (sdp[sdpStartIndex].charAt(0) != 'm');
        return arrayList;
    }

    private final ArrayList<String> mungeVideoMedia(HMSVideoTrackSettings settings, int sdpStartIndex, String[] sdp) {
        ArrayList<String> arrayList = new ArrayList<>();
        C23465k payloadTypeToCodecMap = getPayloadTypeToCodecMap(sdpStartIndex, sdp);
        HashMap map = (HashMap) payloadTypeToCodecMap.f92938x;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (AbstractC39421y.m125930O((String) entry.getValue(), settings.getCodec().name(), true)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            throw new IllegalStateException("Codec=" + settings.getCodec() + " not supported in this device");
        }
        String strM74110N0 = AbstractC25265s.m74110N0(linkedHashMap.keySet(), " ", null, null, null, 62);
        do {
            if (AbstractC39421y.m125930O(sdp[sdpStartIndex], MEDIA_VIDEO, false)) {
                List listM125906y0 = AbstractC39414r.m125906y0(sdp[sdpStartIndex], new String[]{" "}, 6);
                arrayList.add("m=video " + ((String) listM125906y0.get(1)) + ' ' + ((String) listM125906y0.get(2)) + ' ' + strM74110N0);
            } else {
                arrayList.add(sdp[sdpStartIndex]);
            }
            sdpStartIndex++;
            if (sdpStartIndex >= sdp.length) {
                break;
            }
        } while (sdp[sdpStartIndex].charAt(0) != 'm');
        return arrayList;
    }

    public final SessionDescription mungePublishSDP(SessionDescription sdp, HMSTrack[] tracks) {
        String str;
        ArrayList<String> arrayListMungeAudioMedia;
        AbstractC22676k.m65750j(sdp, "sdp");
        AbstractC22676k.m65750j(tracks, "tracks");
        ArrayList arrayList = new ArrayList();
        String description = sdp.description;
        AbstractC22676k.m65749i(description, "description");
        String[] strArr = (String[]) SDP_SEPARATOR_REGEX.m125854h(AbstractC39414r.m125869O0(description).toString()).toArray(new String[0]);
        int i13 = 0;
        while (i13 < strArr.length && strArr[i13].charAt(0) != 'm') {
            arrayList.add(strArr[i13]);
            i13++;
        }
        while (i13 < strArr.length) {
            if (AbstractC39421y.m125930O(strArr[i13], MEDIA_AUDIO, false) || AbstractC39421y.m125930O(strArr[i13], MEDIA_VIDEO, false)) {
                for (HMSTrack hMSTrack : tracks) {
                    HMSTrackType type = hMSTrack.getType();
                    int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                    int i14 = iArr[type.ordinal()];
                    if (i14 == 1) {
                        str = MEDIA_AUDIO;
                    } else {
                        if (i14 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = MEDIA_VIDEO;
                    }
                    if (AbstractC39421y.m125930O(strArr[i13], str, false)) {
                        int i15 = iArr[hMSTrack.getType().ordinal()];
                        if (i15 == 1) {
                            arrayListMungeAudioMedia = mungeAudioMedia(((HMSLocalAudioTrack) hMSTrack).getSettings(), i13, strArr);
                        } else {
                            if (i15 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            arrayListMungeAudioMedia = mungeVideoMedia(((HMSLocalVideoTrack) hMSTrack).getSettings(), i13, strArr);
                        }
                        arrayList.addAll(arrayListMungeAudioMedia);
                        break;
                    }
                }
            } else {
                arrayList.addAll(getMediaLines(i13, strArr));
            }
            do {
                i13++;
                if (i13 >= strArr.length) {
                    break;
                }
            } while (strArr[i13].charAt(0) != 'm');
        }
        String strM73376i = AbstractC25012a.m73376i(AbstractC25265s.m74110N0(arrayList, SDP_SEPARATOR, null, null, null, 62), SDP_SEPARATOR, new StringBuilder());
        HMSLogger.m71136d(TAG, "mungePublishSDP: modified sdp [size=" + strM73376i.length() + "] " + strM73376i);
        return new SessionDescription(sdp.type, strM73376i);
    }
}
