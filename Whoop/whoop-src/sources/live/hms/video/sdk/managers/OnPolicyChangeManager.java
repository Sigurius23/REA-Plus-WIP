package live.hms.video.sdk.managers;

import c93.InterfaceC4339a;
import java.util.ArrayList;
import java.util.List;
import live.hms.video.sdk.NoiseCancellationReportingUseCase;
import live.hms.video.sdk.OfflineAnalyticsPeerInfo;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.HMSLocalPeer;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.SDKUpdate;
import live.hms.video.sdk.models.enums.HMSPeerUpdate;
import live.hms.video.sdk.models.role.HMSRole;
import live.hms.video.sdk.models.role.HMSTranscriptionPermissions;
import live.hms.video.sdk.models.role.HMSWhiteBoardPermission;
import live.hms.video.sdk.models.role.PermissionsParams;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/sdk/managers/OnPolicyChangeManager;", "Llive/hms/video/sdk/managers/IManager;", "Llive/hms/video/sdk/models/HMSNotifications$PolicyChange;", "Llive/hms/video/sdk/SDKStore;", "store", "Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;", "offlineAnalyticsPeerInfo", "Llive/hms/video/sdk/NoiseCancellationReportingUseCase;", "noiseCancellationReportingUseCase", "Lkotlin/Function0;", "", "hasJoined", "<init>", "(Llive/hms/video/sdk/SDKStore;Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;Llive/hms/video/sdk/NoiseCancellationReportingUseCase;Lc93/a;)V", "params", "", "Llive/hms/video/sdk/models/SDKUpdate;", "manage", "(Llive/hms/video/sdk/models/HMSNotifications$PolicyChange;)Ljava/util/List;", "Llive/hms/video/sdk/SDKStore;", "getStore", "()Llive/hms/video/sdk/SDKStore;", "Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;", "Llive/hms/video/sdk/NoiseCancellationReportingUseCase;", "Lc93/a;", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class OnPolicyChangeManager implements IManager<HMSNotifications.PolicyChange> {
    public static final String TAG = "OnPolicyChangeManager";
    private final InterfaceC4339a hasJoined;
    private final NoiseCancellationReportingUseCase noiseCancellationReportingUseCase;
    private final OfflineAnalyticsPeerInfo offlineAnalyticsPeerInfo;
    private final SDKStore store;

    public OnPolicyChangeManager(SDKStore store, OfflineAnalyticsPeerInfo offlineAnalyticsPeerInfo, NoiseCancellationReportingUseCase noiseCancellationReportingUseCase, InterfaceC4339a hasJoined) {
        AbstractC22676k.m65750j(store, "store");
        AbstractC22676k.m65750j(offlineAnalyticsPeerInfo, "offlineAnalyticsPeerInfo");
        AbstractC22676k.m65750j(noiseCancellationReportingUseCase, "noiseCancellationReportingUseCase");
        AbstractC22676k.m65750j(hasJoined, "hasJoined");
        this.store = store;
        this.offlineAnalyticsPeerInfo = offlineAnalyticsPeerInfo;
        this.noiseCancellationReportingUseCase = noiseCancellationReportingUseCase;
        this.hasJoined = hasJoined;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public SDKStore getStore() {
        return this.store;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public List<SDKUpdate> manage(HMSNotifications.PolicyChange params) {
        List<HMSTranscriptionPermissions> arrayList;
        List<HMSNotifications.TranscriptionsPlugin> transcriptions;
        List<String> admin;
        HMSNotifications.Whiteboard whiteboard;
        HMSNotifications.WhiteboardPermissions permissions;
        List<String> writer;
        HMSNotifications.Whiteboard whiteboard2;
        HMSNotifications.WhiteboardPermissions permissions2;
        List<String> reader;
        HMSNotifications.Whiteboard whiteboard3;
        HMSNotifications.WhiteboardPermissions permissions3;
        List<String> admin2;
        HMSLocalPeer localPeer;
        AbstractC22676k.m65750j(params, "params");
        ArrayList arrayList2 = new ArrayList();
        this.offlineAnalyticsPeerInfo.updateTemplateId(params.getTemplateId());
        HMSLocalPeer localPeer2 = getStore().getLocalPeer();
        Boolean boolValueOf = localPeer2 != null ? Boolean.valueOf(localPeer2.isWebrtcPeer()) : null;
        if (!getStore().getRolesMap().isEmpty()) {
            HMSRole role = getStore().getRole();
            HMSRole hMSRole = params.getRolesMap().get(params.getRoleName());
            if (!AbstractC22676k.m65745e(hMSRole != null ? hMSRole.getName() : null, role != null ? role.getName() : null) && (localPeer = getStore().getLocalPeer()) != null) {
                AbstractC22676k.m65747g(hMSRole);
                localPeer.setHmsRole$lib_release(hMSRole);
                arrayList2.add(new SDKUpdate.Peer(HMSPeerUpdate.ROLE_CHANGED, localPeer));
            }
        }
        getStore().setRole(params.getRolesMap().get(params.getRoleName()));
        getStore().setRolesMap(params.getRolesMap());
        getStore().setPlugins(params.getPlugins());
        HMSRole role2 = getStore().getRole();
        if (role2 != null) {
            HMSWhiteBoardPermission whiteboard4 = role2.getPermission().getWhiteboard();
            HMSNotifications.Plugins plugins = params.getPlugins();
            whiteboard4.setAdmin((plugins == null || (whiteboard3 = plugins.getWhiteboard()) == null || (permissions3 = whiteboard3.getPermissions()) == null || (admin2 = permissions3.getAdmin()) == null) ? false : admin2.contains(params.getRoleName()));
            HMSWhiteBoardPermission whiteboard5 = role2.getPermission().getWhiteboard();
            HMSNotifications.Plugins plugins2 = params.getPlugins();
            whiteboard5.setRead((plugins2 == null || (whiteboard2 = plugins2.getWhiteboard()) == null || (permissions2 = whiteboard2.getPermissions()) == null || (reader = permissions2.getReader()) == null) ? false : reader.contains(params.getRoleName()));
            HMSWhiteBoardPermission whiteboard6 = role2.getPermission().getWhiteboard();
            HMSNotifications.Plugins plugins3 = params.getPlugins();
            whiteboard6.setWrite((plugins3 == null || (whiteboard = plugins3.getWhiteboard()) == null || (permissions = whiteboard.getPermissions()) == null || (writer = permissions.getWriter()) == null) ? false : writer.contains(params.getRoleName()));
            PermissionsParams permission = role2.getPermission();
            HMSNotifications.Plugins plugins4 = params.getPlugins();
            if (plugins4 == null || (transcriptions = plugins4.getTranscriptions()) == null) {
                arrayList = C25271y.f99162w;
            } else {
                ArrayList<HMSNotifications.TranscriptionsPlugin> arrayList3 = new ArrayList();
                for (Object obj : transcriptions) {
                    if (((HMSNotifications.TranscriptionsPlugin) obj).getMode() != null) {
                        arrayList3.add(obj);
                    }
                }
                arrayList = new ArrayList<>(AbstractC25267u.m74163i0(arrayList3, 10));
                for (HMSNotifications.TranscriptionsPlugin transcriptionsPlugin : arrayList3) {
                    HMSTranscriptionPermissions hMSTranscriptionPermissions = new HMSTranscriptionPermissions();
                    hMSTranscriptionPermissions.setMode$lib_release(transcriptionsPlugin.getMode());
                    HMSNotifications.TranscriptionsPluginPermissions permissions4 = transcriptionsPlugin.getPermissions();
                    hMSTranscriptionPermissions.setAdmin$lib_release((permissions4 == null || (admin = permissions4.getAdmin()) == null) ? false : admin.contains(params.getRoleName()));
                    HMSNotifications.TranscriptionsPluginPermissions permissions5 = transcriptionsPlugin.getPermissions();
                    List<String> admin3 = permissions5 != null ? permissions5.getAdmin() : null;
                    hMSTranscriptionPermissions.setRead$lib_release(!(admin3 == null || admin3.isEmpty()));
                    arrayList.add(hMSTranscriptionPermissions);
                }
            }
            permission.setTranscriptions$lib_release(arrayList);
            HMSLocalPeer localPeer3 = getStore().getLocalPeer();
            if (localPeer3 != null) {
                localPeer3.setHmsRole$lib_release(role2);
            }
        }
        HMSLocalPeer localPeer4 = getStore().getLocalPeer();
        this.noiseCancellationReportingUseCase.localPeerRoleChanged(localPeer4 != null ? Boolean.valueOf(localPeer4.isWebrtcPeer()) : null, boolValueOf, ((Boolean) this.hasJoined.invoke()).booleanValue());
        return arrayList2;
    }
}
