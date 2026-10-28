package live.hms.video.sdk.managers;

import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.HMSRoom;
import live.hms.video.sdk.models.SDKUpdate;
import live.hms.video.sdk.models.enums.HMSRoomUpdate;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\t"}, m65681d2 = {"updatePeerCount", "Llive/hms/video/sdk/models/SDKUpdate$Room;", "increase", "", "store", "Llive/hms/video/sdk/SDKStore;", "setPeerCount", "givenPeerCount", "", "lib_release"}, m65682k = 2, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class PeerCountUpdateUseCaseKt {
    public static final SDKUpdate.Room setPeerCount(int i13, SDKStore store) {
        AbstractC22676k.m65750j(store, "store");
        HMSRoom hMSRoom = store.get_room();
        if (hMSRoom != null) {
            hMSRoom.setPeerCount$lib_release(Integer.valueOf(i13));
        }
        return new SDKUpdate.Room(HMSRoomUpdate.ROOM_PEER_COUNT_UPDATED);
    }

    public static final SDKUpdate.Room updatePeerCount(boolean z4, SDKStore store) {
        AbstractC22676k.m65750j(store, "store");
        HMSRoom hMSRoom = store.get_room();
        if (hMSRoom != null) {
            Integer numValueOf = null;
            if (z4) {
                Integer peerCount = hMSRoom.getPeerCount();
                if (peerCount != null) {
                    numValueOf = Integer.valueOf(peerCount.intValue() + 1);
                }
            } else {
                Integer peerCount2 = hMSRoom.getPeerCount();
                if (peerCount2 != null && peerCount2.intValue() == 0) {
                    numValueOf = hMSRoom.getPeerCount();
                } else {
                    Integer peerCount3 = hMSRoom.getPeerCount();
                    if (peerCount3 != null) {
                        numValueOf = Integer.valueOf(peerCount3.intValue() - 1);
                    }
                }
            }
            hMSRoom.setPeerCount$lib_release(numValueOf);
        }
        return new SDKUpdate.Room(HMSRoomUpdate.ROOM_PEER_COUNT_UPDATED);
    }
}
