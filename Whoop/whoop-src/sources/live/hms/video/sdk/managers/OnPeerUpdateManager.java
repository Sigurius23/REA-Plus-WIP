package live.hms.video.sdk.managers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.SDKUpdate;
import live.hms.video.sdk.models.enums.HMSPeerUpdate;
import live.hms.video.sdk.models.role.HMSRole;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m65681d2 = {"Llive/hms/video/sdk/managers/OnPeerUpdateManager;", "Llive/hms/video/sdk/managers/IManager;", "Llive/hms/video/sdk/models/HMSNotifications$Peer;", "store", "Llive/hms/video/sdk/SDKStore;", "onPeerLeaveManager", "Llive/hms/video/sdk/managers/OnPeerLeaveManager;", "<init>", "(Llive/hms/video/sdk/SDKStore;Llive/hms/video/sdk/managers/OnPeerLeaveManager;)V", "getStore", "()Llive/hms/video/sdk/SDKStore;", "manage", "", "Llive/hms/video/sdk/models/SDKUpdate;", "params", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class OnPeerUpdateManager implements IManager<HMSNotifications.Peer> {
    private static final String TAG = "OnPeerUpdateManager";
    private final OnPeerLeaveManager onPeerLeaveManager;
    private final SDKStore store;

    public OnPeerUpdateManager(SDKStore store, OnPeerLeaveManager onPeerLeaveManager) {
        AbstractC22676k.m65750j(store, "store");
        AbstractC22676k.m65750j(onPeerLeaveManager, "onPeerLeaveManager");
        this.store = store;
        this.onPeerLeaveManager = onPeerLeaveManager;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public SDKStore getStore() {
        return this.store;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public List<SDKUpdate> manage(HMSNotifications.Peer params) {
        String metadata;
        boolean zContains;
        String name;
        String name2;
        AbstractC22676k.m65750j(params, "params");
        ArrayList arrayList = new ArrayList();
        HMSPeer peerById = getStore().getPeerById(params.getPeerId());
        if (peerById != null) {
            name = peerById.getHmsRole().getName();
            name2 = peerById.getName();
            metadata = peerById.getMetadata();
            ArrayList<String> groups$lib_release = peerById.getGroups$lib_release();
            zContains = groups$lib_release != null ? groups$lib_release.contains("_handraise") : false;
            if (!params.isRealTime() && !peerById.getIsLocal()) {
                arrayList.addAll(this.onPeerLeaveManager.removeFromStoreAndSendUpdates(params.toPeerLeave()));
            }
        } else {
            peerById = getStore().add(params.toPeerJoin());
            metadata = null;
            arrayList.add(new SDKUpdate.PeerListUpdate(AbstractC37056f.m118980f(peerById), null));
            zContains = false;
            name = null;
            name2 = null;
        }
        String role = params.getRole();
        String userName = params.getInfo().getUserName();
        String metadata2 = params.getInfo().getMetadata();
        ArrayList<String> groups = params.getGroups();
        boolean zContains2 = groups != null ? groups.contains("_handraise") : false;
        Map<String, HMSRole> rolesMap = getStore().getRolesMap();
        if (rolesMap != null && !rolesMap.isEmpty()) {
            if (!peerById.getIsLocal()) {
                HMSRole hMSRole = getStore().getRolesMap().get(role);
                AbstractC22676k.m65747g(hMSRole);
                peerById.setHmsRole$lib_release(hMSRole);
                if (!AbstractC22676k.m65745e(role, name)) {
                    arrayList.add(new SDKUpdate.Peer(HMSPeerUpdate.ROLE_CHANGED, peerById));
                }
            }
            if (!AbstractC22676k.m65745e(metadata, metadata2) && metadata2 != null) {
                peerById.setMetadata$lib_release(metadata2);
                arrayList.add(new SDKUpdate.Peer(HMSPeerUpdate.METADATA_CHANGED, peerById));
            }
            if (!AbstractC22676k.m65745e(name2, userName)) {
                peerById.setName$lib_release(userName);
                arrayList.add(new SDKUpdate.Peer(HMSPeerUpdate.NAME_CHANGED, peerById));
            }
            if (zContains != zContains2) {
                peerById.setGroups$lib_release(params.getGroups());
                arrayList.add(new SDKUpdate.Peer(HMSPeerUpdate.HAND_RAISED_CHANGED, peerById));
            }
        }
        return arrayList;
    }
}
