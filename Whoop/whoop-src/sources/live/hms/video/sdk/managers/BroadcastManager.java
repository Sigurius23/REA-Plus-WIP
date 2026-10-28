package live.hms.video.sdk.managers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.HMSMessage;
import live.hms.video.sdk.models.HMSMessageRecipient;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.HMSPeerType;
import live.hms.video.sdk.models.HMSRemotePeer;
import live.hms.video.sdk.models.SDKUpdate;
import live.hms.video.sdk.models.enums.HMSMessageRecipientType;
import live.hms.video.sdk.models.role.HMSRole;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/sdk/managers/BroadcastManager;", "Llive/hms/video/sdk/managers/IManager;", "Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;", "store", "Llive/hms/video/sdk/SDKStore;", "<init>", "(Llive/hms/video/sdk/SDKStore;)V", "getStore", "()Llive/hms/video/sdk/SDKStore;", "manage", "", "Llive/hms/video/sdk/models/SDKUpdate;", "params", "getHMSRoleFromRoleName", "Llive/hms/video/sdk/models/role/HMSRole;", "name", "", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class BroadcastManager implements IManager<HMSNotifications.OnBroadcast> {
    private static final String TAG = "BroadcastManager";
    private final SDKStore store;

    public BroadcastManager(SDKStore store) {
        AbstractC22676k.m65750j(store, "store");
        this.store = store;
    }

    private final HMSRole getHMSRoleFromRoleName(String name) {
        Object next;
        Iterator it = AbstractC25265s.m74093D1(getStore().getRolesMap().values()).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (AbstractC22676k.m65745e(((HMSRole) next).getName(), name)) {
                return (HMSRole) next;
            }
        }
        next = null;
        return (HMSRole) next;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public SDKStore getStore() {
        return this.store;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public List<SDKUpdate> manage(HMSNotifications.OnBroadcast params) {
        AbstractC22676k.m65750j(params, "params");
        ArrayList arrayList = new ArrayList();
        SDKStore store = getStore();
        HMSNotifications.BroadcastPeer peer = params.getPeer();
        HMSRemotePeer hMSRemotePeer = null;
        HMSPeer peerById = store.getPeerById(peer != null ? peer.getPeerId() : null);
        HMSNotifications.BroadcastPeer peer2 = params.getPeer();
        if (peer2 != null && peerById == null) {
            HMSRole hMSRole = getStore().getRolesMap().get(peer2.getRole());
            if (hMSRole != null) {
                HMSRemotePeer hMSRemotePeer2 = new HMSRemotePeer(peer2.getPeerId(), peer2.getInfo().getCustomerUserId(), peer2.getInfo().getUserName(), hMSRole, 0L, null, HMSPeerType.REGULAR, 32, null);
                hMSRemotePeer2.setGroups$lib_release(peer2.getGroups());
                hMSRemotePeer = hMSRemotePeer2;
            }
            peerById = hMSRemotePeer;
        }
        HMSPeer hMSPeer = peerById;
        HMSMessageRecipient hMSMessageRecipient = new HMSMessageRecipient(null, null, null, 7, null);
        if (params.getPrivate()) {
            hMSMessageRecipient.setRecipientType(HMSMessageRecipientType.PEER);
            hMSMessageRecipient.setRecipientPeer(getStore().getLocalPeer());
        }
        ArrayList<String> roleNames = params.getRoleNames();
        if (roleNames != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = roleNames.iterator();
            while (it.hasNext()) {
                HMSRole hMSRoleFromRoleName = getHMSRoleFromRoleName((String) it.next());
                if (hMSRoleFromRoleName != null) {
                    arrayList2.add(hMSRoleFromRoleName);
                }
            }
            hMSMessageRecipient.setRecipientType(HMSMessageRecipientType.ROLES);
            hMSMessageRecipient.setRecipientRoles(arrayList2);
        }
        String message = params.getInfo().getMessage();
        String type = params.getInfo().getType();
        long timestamp = params.getTimestamp();
        String messageId = params.getMessageId();
        if (messageId == null) {
            messageId = "";
        }
        arrayList.add(new SDKUpdate.Broadcast(new HMSMessage(message, type, hMSMessageRecipient, timestamp, hMSPeer, messageId)));
        return arrayList;
    }
}
