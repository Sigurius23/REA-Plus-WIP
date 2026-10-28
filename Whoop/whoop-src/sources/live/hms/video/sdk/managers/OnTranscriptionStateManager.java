package live.hms.video.sdk.managers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSRoom;
import live.hms.video.sdk.models.SDKUpdate;
import live.hms.video.sdk.models.Transcriptions;
import live.hms.video.sdk.models.enums.HMSRoomUpdate;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Llive/hms/video/sdk/managers/OnTranscriptionStateManager;", "Llive/hms/video/sdk/managers/IManager;", "Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;", "Llive/hms/video/sdk/SDKStore;", "store", "<init>", "(Llive/hms/video/sdk/SDKStore;)V", "Llive/hms/video/sdk/models/HMSRoom;", "room", "params", "Ll83/a0;", "addTranscriptionToRoom", "(Llive/hms/video/sdk/models/HMSRoom;Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;)V", "", "Llive/hms/video/sdk/models/SDKUpdate;", "manage", "(Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;)Ljava/util/List;", "Llive/hms/video/sdk/SDKStore;", "getStore", "()Llive/hms/video/sdk/SDKStore;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class OnTranscriptionStateManager implements IManager<HMSNotifications.OnTranscriptionUpdate> {
    private final SDKStore store;

    public OnTranscriptionStateManager(SDKStore store) {
        AbstractC22676k.m65750j(store, "store");
        this.store = store;
    }

    private final void addTranscriptionToRoom(HMSRoom room, HMSNotifications.OnTranscriptionUpdate params) {
        Object next;
        Iterator<T> it = room.get_transcriptions$lib_release().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Transcriptions) next).getMode() != params.getMode());
        Transcriptions transcriptions = (Transcriptions) next;
        if (transcriptions != null) {
            transcriptions.update$lib_release(params);
            return;
        }
        List<Transcriptions> list = room.get_transcriptions$lib_release();
        Transcriptions transcriptions2 = new Transcriptions();
        transcriptions2.update$lib_release(params);
        list.add(transcriptions2);
    }

    @Override // live.hms.video.sdk.managers.IManager
    public SDKStore getStore() {
        return this.store;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public List<SDKUpdate> manage(HMSNotifications.OnTranscriptionUpdate params) {
        AbstractC22676k.m65750j(params, "params");
        ArrayList arrayList = new ArrayList();
        HMSRoom hMSRoom = getStore().get_room();
        if (hMSRoom != null) {
            addTranscriptionToRoom(hMSRoom, params);
            arrayList.add(new SDKUpdate.Room(HMSRoomUpdate.TRANSCRIPTIONS_UPDATED));
        }
        return arrayList;
    }
}
