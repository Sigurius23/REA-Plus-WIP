package live.hms.video.sdk;

import c93.InterfaceC4339a;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import live.hms.video.connection.degredation.Audio;
import live.hms.video.connection.degredation.ConnectionInfo;
import live.hms.video.connection.degredation.Peer;
import live.hms.video.connection.degredation.StatsBundle;
import live.hms.video.connection.degredation.Track;
import live.hms.video.connection.degredation.Video;
import live.hms.video.connection.degredation.WebrtcStats;
import live.hms.video.connection.stats.BitrateCalculator;
import live.hms.video.connection.stats.HMSLocalAudioStats;
import live.hms.video.connection.stats.HMSLocalVideoStats;
import live.hms.video.connection.stats.HMSRTCStats;
import live.hms.video.connection.stats.HMSRTCStatsReport;
import live.hms.video.connection.stats.HMSRemoteAudioStats;
import live.hms.video.connection.stats.HMSRemoteVideoStats;
import live.hms.video.connection.stats.HMSStatsObserver;
import live.hms.video.media.settings.HMSLayer;
import live.hms.video.media.settings.HMSVideoResolution;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.media.tracks.HMSTrackSource;
import live.hms.video.sdk.models.HMSLocalPeer;
import live.hms.video.sdk.models.HMSPeer;
import m83.AbstractC25265s;
import m83.AbstractC25269w;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J[\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00192\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00192\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, m65681d2 = {"Llive/hms/video/sdk/BundleToStatsObserver;", "", "<init>", "()V", "Llive/hms/video/sdk/PublishConnection;", "audioPubConnection", "videoPubConnection", "Llive/hms/video/sdk/SubscribeConnection;", "audioSubConnection", "videoSubConnection", "Llive/hms/video/connection/stats/HMSStatsObserver;", "hmsStatsObserver", "", "subscribeRoundTripTime", "publishRoundTripTime", "Ll83/a0;", "sendOverallRtcStats", "(Llive/hms/video/sdk/PublishConnection;Llive/hms/video/sdk/PublishConnection;Llive/hms/video/sdk/SubscribeConnection;Llive/hms/video/sdk/SubscribeConnection;Llive/hms/video/connection/stats/HMSStatsObserver;DD)V", "Llive/hms/video/media/settings/HMSLayer;", "hmsLayer", "", "layerSortOrder", "(Llive/hms/video/media/settings/HMSLayer;)I", "Llive/hms/video/connection/degredation/StatsBundle;", "bundle", "Lkotlin/Function1;", "", "Llive/hms/video/media/tracks/HMSTrack;", "getTrackForId", "Llive/hms/video/sdk/models/HMSPeer;", "getRemotePeerForTrackId", "Lkotlin/Function0;", "Llive/hms/video/sdk/models/HMSLocalPeer;", "getLocalPeer", "convertBundleToStatsObserverEvents", "(Llive/hms/video/connection/degredation/StatsBundle;Llive/hms/video/connection/stats/HMSStatsObserver;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;)V", "Llive/hms/video/connection/stats/BitrateCalculator;", "bitrateCalculator", "Llive/hms/video/connection/stats/BitrateCalculator;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class BundleToStatsObserver {
    private final BitrateCalculator bitrateCalculator = new BitrateCalculator();

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMSLayer.values().length];
            try {
                iArr[HMSLayer.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HMSLayer.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HMSLayer.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int layerSortOrder(HMSLayer hmsLayer) {
        int i13 = hmsLayer == null ? -1 : WhenMappings.$EnumSwitchMapping$0[hmsLayer.ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 != 2) {
            return i13 != 3 ? -1 : 2;
        }
        return 1;
    }

    private final void sendOverallRtcStats(PublishConnection audioPubConnection, PublishConnection videoPubConnection, SubscribeConnection audioSubConnection, SubscribeConnection videoSubConnection, HMSStatsObserver hmsStatsObserver, double subscribeRoundTripTime, double publishRoundTripTime) {
        double d3 = (subscribeRoundTripTime + publishRoundTripTime) / ((double) 2);
        HMSRTCStats hMSRTCStats = new HMSRTCStats(videoPubConnection.getBytesSent(), videoSubConnection.getBytesReceived(), videoSubConnection.getPacketsReceived(), videoPubConnection.getPacketLoss(), AbstractC25265s.m74147s0(videoPubConnection.getAvailableOutgoingBitrates()), AbstractC25265s.m74147s0(videoSubConnection.getAvailableIncomingBitrates()), d3);
        HMSRTCStats hMSRTCStats2 = new HMSRTCStats(audioPubConnection.getBytesSent(), audioSubConnection.getBytesReceived(), audioSubConnection.getPacketsReceived(), audioPubConnection.getPacketLoss(), AbstractC25265s.m74147s0(audioPubConnection.getAvailableOutgoingBitrates()), AbstractC25265s.m74147s0(audioSubConnection.getAvailableIncomingBitrates()), d3);
        HMSRTCStatsReport hMSRTCStatsReport = new HMSRTCStatsReport(new HMSRTCStats(hMSRTCStats.getBytesSent() + hMSRTCStats2.getBytesSent(), hMSRTCStats.getBytesReceived() + hMSRTCStats2.getBytesReceived(), hMSRTCStats.getPacketsReceived() + hMSRTCStats2.getPacketsReceived(), hMSRTCStats.getPacketsLost() + hMSRTCStats2.getPacketsLost(), AbstractC25265s.m74147s0(AbstractC25265s.m74129g1(audioPubConnection.getAvailableOutgoingBitrates(), videoPubConnection.getAvailableOutgoingBitrates())), AbstractC25265s.m74147s0(AbstractC25265s.m74129g1(audioSubConnection.getAvailableIncomingBitrates(), videoSubConnection.getAvailableIncomingBitrates())), d3), hMSRTCStats2, hMSRTCStats);
        if (hmsStatsObserver != null) {
            hmsStatsObserver.onRTCStats(hMSRTCStatsReport);
        }
    }

    public final void convertBundleToStatsObserverEvents(StatsBundle bundle, HMSStatsObserver hmsStatsObserver, Function1 getTrackForId, Function1 getRemotePeerForTrackId, InterfaceC4339a getLocalPeer) {
        double d3;
        Track.LocalTrack.LocalVideo localVideo;
        HMSTrack hMSTrack;
        HMSTrack hMSTrack2;
        List<HMSTrack> auxiliaryTracks;
        Object next;
        this = this;
        AbstractC22676k.m65750j(bundle, "bundle");
        AbstractC22676k.m65750j(getTrackForId, "getTrackForId");
        AbstractC22676k.m65750j(getRemotePeerForTrackId, "getRemotePeerForTrackId");
        AbstractC22676k.m65750j(getLocalPeer, "getLocalPeer");
        PublishConnection publishConnection = new PublishConnection(0L, null, 0L, 0L, 15, null);
        PublishConnection publishConnection2 = new PublishConnection(0L, null, 0L, 0L, 15, null);
        SubscribeConnection subscribeConnection = new SubscribeConnection(0L, null, 0L, 0L, 15, null);
        SubscribeConnection subscribeConnection2 = new SubscribeConnection(0L, null, 0L, 0L, 15, null);
        ArrayList arrayList = new ArrayList();
        double dDoubleValue = 0.0d;
        double dDoubleValue2 = 0.0d;
        HMSTrack hMSTrack3 = null;
        for (Map.Entry<String, WebrtcStats> entry : bundle.getAllStats().entrySet()) {
            hMSTrack3 = hMSTrack3;
            WebrtcStats value = entry.getValue();
            if (value instanceof Peer) {
                arrayList = arrayList;
                d3 = dDoubleValue;
            } else if (value instanceof Track.LocalTrack.LocalVideo) {
                double d14 = dDoubleValue;
                double bitrateFromTrackUpdatePrev = this.bitrateCalculator.getBitrateFromTrackUpdatePrev((Track) value);
                Track.LocalTrack.LocalVideo localVideo2 = (Track.LocalTrack.LocalVideo) value;
                BigInteger bytesTransported = localVideo2.getBytesTransported();
                long jLongValue = bytesTransported != null ? bytesTransported.longValue() : 0L;
                String trackIdentifier = localVideo2.getTrackIdentifier();
                if (trackIdentifier == null) {
                    trackIdentifier = "";
                }
                HMSTrack hMSTrack4 = (HMSTrack) getTrackForId.invoke(trackIdentifier);
                HMSLocalPeer hMSLocalPeer = (HMSLocalPeer) getLocalPeer.invoke();
                if (hMSLocalPeer == null || (auxiliaryTracks = hMSLocalPeer.getAuxiliaryTracks()) == null) {
                    localVideo = localVideo2;
                    hMSTrack = hMSTrack4;
                    hMSTrack2 = null;
                } else {
                    Iterator<T> it = auxiliaryTracks.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            localVideo = localVideo2;
                            hMSTrack = hMSTrack4;
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            localVideo = localVideo2;
                            hMSTrack = hMSTrack4;
                            if (AbstractC22676k.m65745e(((HMSTrack) next).getSource(), HMSTrackSource.SCREEN)) {
                                break;
                            }
                            localVideo2 = localVideo;
                            hMSTrack4 = hMSTrack;
                        }
                    }
                    hMSTrack2 = (HMSTrack) next;
                }
                if (hMSTrack != null || hMSTrack2 == null) {
                    Double jitter = localVideo.getJitter();
                    Double roundTripTime = localVideo.getRoundTripTime();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Double dValueOf = Double.valueOf(bitrateFromTrackUpdatePrev);
                    HMSVideoResolution resolution = localVideo.getResolution();
                    Number frameRate = localVideo.getFrameRate();
                    arrayList.add(new HMSLocalVideoStats(jitter, roundTripTime, lValueOf, dValueOf, resolution, frameRate != null ? Double.valueOf(frameRate.doubleValue()) : null, localVideo.getQualityLimitations(), localVideo.getHmsLayer(), Long.valueOf(localVideo.getPacketLoss()), localVideo.getPacketsSent()));
                    publishConnection2.getAvailableOutgoingBitrates().add(Double.valueOf(bitrateFromTrackUpdatePrev));
                    if (jLongValue > 0) {
                        publishConnection2.setBytesSent(publishConnection2.getBytesSent() + jLongValue);
                    }
                    Long packetsSent = localVideo.getPacketsSent();
                    if ((packetsSent != null ? packetsSent.longValue() : 0L) > 0) {
                        long packetsSent2 = publishConnection2.getPacketsSent();
                        Long packetsSent3 = localVideo.getPacketsSent();
                        publishConnection2.setPacketsSent(packetsSent2 + (packetsSent3 != null ? packetsSent3.longValue() : 0L));
                    }
                    publishConnection2.setPacketLoss(localVideo.getPacketLoss());
                } else {
                    Double jitter2 = localVideo.getJitter();
                    Double roundTripTime2 = localVideo.getRoundTripTime();
                    Long lValueOf2 = Long.valueOf(jLongValue);
                    Double dValueOf2 = Double.valueOf(bitrateFromTrackUpdatePrev);
                    HMSVideoResolution resolution2 = localVideo.getResolution();
                    Number frameRate2 = localVideo.getFrameRate();
                    HMSLocalVideoStats hMSLocalVideoStats = new HMSLocalVideoStats(jitter2, roundTripTime2, lValueOf2, dValueOf2, resolution2, frameRate2 != null ? Double.valueOf(frameRate2.doubleValue()) : null, localVideo.getQualityLimitations(), localVideo.getHmsLayer(), Long.valueOf(localVideo.getPacketLoss()), localVideo.getPacketsSent());
                    publishConnection2.getAvailableOutgoingBitrates().add(Double.valueOf(bitrateFromTrackUpdatePrev));
                    if (jLongValue > 0) {
                        publishConnection2.setBytesSent(publishConnection2.getBytesSent() + jLongValue);
                    }
                    Long packetsSent4 = localVideo.getPacketsSent();
                    if ((packetsSent4 != null ? packetsSent4.longValue() : 0L) > 0) {
                        long packetsSent5 = publishConnection2.getPacketsSent();
                        Long packetsSent6 = localVideo.getPacketsSent();
                        publishConnection2.setPacketsSent(packetsSent5 + (packetsSent6 != null ? packetsSent6.longValue() : 0L));
                    }
                    if (hmsStatsObserver != null) {
                        hmsStatsObserver.onLocalVideoStats(AbstractC37056f.m118958J(hMSLocalVideoStats), hMSTrack2, (HMSPeer) getLocalPeer.invoke());
                    }
                }
                dDoubleValue = d14;
                hMSTrack3 = hMSTrack;
            } else {
                d3 = dDoubleValue;
                if (value instanceof Track.LocalTrack.LocalAudio) {
                    double bitrateFromTrackUpdatePrev2 = this.bitrateCalculator.getBitrateFromTrackUpdatePrev((Track) value);
                    Track.LocalTrack.LocalAudio localAudio = (Track.LocalTrack.LocalAudio) value;
                    BigInteger bytesTransported2 = localAudio.getBytesTransported();
                    long jLongValue2 = bytesTransported2 != null ? bytesTransported2.longValue() : 0L;
                    if (hmsStatsObserver != null) {
                        Double jitter3 = localAudio.getJitter();
                        Double roundTripTime3 = localAudio.getRoundTripTime();
                        BigInteger bytesTransported3 = localAudio.getBytesTransported();
                        hmsStatsObserver.onLocalAudioStats(new HMSLocalAudioStats(jitter3, roundTripTime3, bytesTransported3 != null ? Long.valueOf(bytesTransported3.longValue()) : null, Double.valueOf(bitrateFromTrackUpdatePrev2), Long.valueOf(localAudio.getPacketLoss()), localAudio.getPacketsSent()), (HMSTrack) getTrackForId.invoke(AbstractC39414r.m125906y0(entry.getKey(), new String[]{"_"}, 6).get(0)), (HMSPeer) getLocalPeer.invoke());
                    }
                    publishConnection.getAvailableOutgoingBitrates().add(Double.valueOf(bitrateFromTrackUpdatePrev2));
                    if (jLongValue2 > 0) {
                        publishConnection.setBytesSent(publishConnection.getBytesSent() + jLongValue2);
                    }
                    Long packetsSent7 = localAudio.getPacketsSent();
                    if ((packetsSent7 != null ? packetsSent7.longValue() : 0L) > 0) {
                        long packetsSent8 = publishConnection.getPacketsSent();
                        Long packetsSent9 = localAudio.getPacketsSent();
                        publishConnection.setPacketsSent(packetsSent8 + (packetsSent9 != null ? packetsSent9.longValue() : 0L));
                    }
                    publishConnection.setPacketLoss(localAudio.getPacketLoss());
                } else {
                    arrayList = arrayList;
                    if (value instanceof Audio) {
                        double bitrateFromTrackUpdatePrev3 = this.bitrateCalculator.getBitrateFromTrackUpdatePrev((Track) value);
                        Audio audio = (Audio) value;
                        BigInteger bytesTransported4 = audio.getBytesTransported();
                        long jLongValue3 = bytesTransported4 != null ? bytesTransported4.longValue() : 0L;
                        HMSRemoteAudioStats hMSRemoteAudioStats = new HMSRemoteAudioStats(audio.getJitter(), Long.valueOf(jLongValue3), Double.valueOf(bitrateFromTrackUpdatePrev3), audio.getPacketsReceived(), audio.getPacketsLost());
                        if (hmsStatsObserver != null) {
                            hmsStatsObserver.onRemoteAudioStats(hMSRemoteAudioStats, (HMSTrack) getTrackForId.invoke(AbstractC39414r.m125906y0(entry.getKey(), new String[]{"_"}, 6).get(0)), (HMSPeer) getRemotePeerForTrackId.invoke(AbstractC39414r.m125906y0(entry.getKey(), new String[]{"_"}, 6).get(0)));
                        }
                        if (jLongValue3 > 0) {
                            subscribeConnection.setBytesReceived(subscribeConnection.getBytesReceived() + jLongValue3);
                        }
                        subscribeConnection.getAvailableIncomingBitrates().add(Double.valueOf(bitrateFromTrackUpdatePrev3));
                        Long packetsReceived = audio.getPacketsReceived();
                        if ((packetsReceived != null ? packetsReceived.longValue() : 0L) > 0) {
                            long packetsReceived2 = subscribeConnection.getPacketsReceived();
                            Long packetsReceived3 = audio.getPacketsReceived();
                            subscribeConnection.setPacketsReceived(packetsReceived2 + (packetsReceived3 != null ? packetsReceived3.longValue() : 0L));
                        }
                    } else if (value instanceof Video) {
                        double bitrateFromTrackUpdatePrev4 = this.bitrateCalculator.getBitrateFromTrackUpdatePrev((Track) value);
                        Video video = (Video) value;
                        BigInteger bytesTransported5 = video.getBytesTransported();
                        long jLongValue4 = bytesTransported5 != null ? bytesTransported5.longValue() : 0L;
                        HMSRemoteVideoStats hMSRemoteVideoStats = new HMSRemoteVideoStats(video.getJitter(), Long.valueOf(jLongValue4), Double.valueOf(bitrateFromTrackUpdatePrev4), video.getPacketsReceived(), video.getPacketsLost(), (video.getFrameWidth() == null || video.getFrameHeight() == null) ? null : new HMSVideoResolution((int) video.getFrameWidth().longValue(), (int) video.getFrameHeight().longValue()), video.getFramesPerSecond());
                        if (hmsStatsObserver != null) {
                            hmsStatsObserver.onRemoteVideoStats(hMSRemoteVideoStats, (HMSTrack) getTrackForId.invoke(AbstractC39414r.m125906y0(entry.getKey(), new String[]{"_"}, 6).get(0)), (HMSPeer) getRemotePeerForTrackId.invoke(AbstractC39414r.m125906y0(entry.getKey(), new String[]{"_"}, 6).get(0)));
                        }
                        if (jLongValue4 > 0) {
                            subscribeConnection2.setBytesReceived(subscribeConnection2.getBytesReceived() + jLongValue4);
                        }
                        subscribeConnection2.getAvailableIncomingBitrates().add(Double.valueOf(bitrateFromTrackUpdatePrev4));
                        Long packetsReceived4 = video.getPacketsReceived();
                        if ((packetsReceived4 != null ? packetsReceived4.longValue() : 0L) > 0) {
                            long packetsReceived5 = subscribeConnection2.getPacketsReceived();
                            Long packetsReceived6 = video.getPacketsReceived();
                            subscribeConnection2.setPacketsReceived(packetsReceived5 + (packetsReceived6 != null ? packetsReceived6.longValue() : 0L));
                        }
                    } else if (value instanceof ConnectionInfo.PublishConnection) {
                        Double currentRoundTripTime = ((ConnectionInfo.PublishConnection) value).getCurrentRoundTripTime();
                        dDoubleValue2 = currentRoundTripTime != null ? currentRoundTripTime.doubleValue() : 0.0d;
                    } else {
                        if (value instanceof ConnectionInfo.SubscribeConnection) {
                            Double currentRoundTripTime2 = ((ConnectionInfo.SubscribeConnection) value).getCurrentRoundTripTime();
                            dDoubleValue = currentRoundTripTime2 != null ? currentRoundTripTime2.doubleValue() : 0.0d;
                        }
                        arrayList = arrayList;
                    }
                }
            }
            dDoubleValue = d3;
            arrayList = arrayList;
        }
        ArrayList arrayList2 = arrayList;
        HMSTrack hMSTrack5 = hMSTrack3;
        this.sendOverallRtcStats(publishConnection, publishConnection2, subscribeConnection, subscribeConnection2, hmsStatsObserver, dDoubleValue, dDoubleValue2);
        if (arrayList2.isEmpty()) {
            return;
        }
        if (arrayList2.size() > 1) {
            AbstractC25269w.m74166l0(arrayList2, new Comparator() { // from class: live.hms.video.sdk.BundleToStatsObserver$convertBundleToStatsObserverEvents$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t14, T t15) {
                    return AbstractC30060g.m92127q(Integer.valueOf(this.this$0.layerSortOrder(((HMSLocalVideoStats) t14).getHmsLayer())), Integer.valueOf(this.this$0.layerSortOrder(((HMSLocalVideoStats) t15).getHmsLayer())));
                }
            });
        }
        if (hmsStatsObserver != null) {
            hmsStatsObserver.onLocalVideoStats(arrayList2, hMSTrack5, (HMSPeer) getLocalPeer.invoke());
        }
    }
}
