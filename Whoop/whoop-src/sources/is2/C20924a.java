package is2;

import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.items.ImageUrlModel;
import com.whoop.design.models.items.NavigationBarModel;
import com.whoop.design.models.items.NavigationButtonModel;
import com.whoop.design.models.modal.DialogModel;
import com.whoop.videocall.api.VideoCallParticipantModel;
import com.whoop.videocall.api.VideoCallParticipantsModel;
import com.whoop.videocall.api.VideoCallPermissionsModel;
import com.whoop.videocall.api.VideoCallWaitingRoomModel;
import es2.C13593c;
import es2.InterfaceC13591a;
import fs2.InterfaceC14759l;
import hs2.C17608b;
import hs2.C17609c;
import hs2.C17611e;
import hs2.InterfaceC17607a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23618e2;
import p716lb1.AbstractC23653j2;
import p736sz0.C33205o0;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: is2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\u0005*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\n¨\u0006\u001d"}, m65681d2 = {"Lis2/a;", "", "<init>", "()V", "Les2/a$a;", "Lhs2/e;", "b", "(Les2/a$a;)Lhs2/e;", "Les2/c;", "g", "(Les2/c;)Lhs2/e;", "Lcom/whoop/design/models/items/NavigationBarModel;", "Lhs2/e$b;", "c", "(Lcom/whoop/design/models/items/NavigationBarModel;)Lhs2/e$b;", "Lcom/whoop/design/models/items/NavigationButtonModel;", "Lhs2/e$c;", "d", "(Lcom/whoop/design/models/items/NavigationButtonModel;)Lhs2/e$c;", "Lcom/whoop/videocall/api/VideoCallParticipantsModel;", "Lhs2/c;", "f", "(Lcom/whoop/videocall/api/VideoCallParticipantsModel;)Lhs2/c;", "Lcom/whoop/videocall/api/VideoCallParticipantModel;", "Lhs2/b;", "e", "(Lcom/whoop/videocall/api/VideoCallParticipantModel;)Lhs2/b;", "domainResult", "a", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20924a {
    /* JADX INFO: renamed from: b */
    private final C17611e m58047b(InterfaceC13591a.a aVar) {
        if (aVar instanceof InterfaceC13591a.b) {
            return new C17611e(new C17611e.a(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, null, 6, null);
        }
        if (aVar instanceof InterfaceC13591a.c) {
            return new C17611e(new C17611e.a(C33205o0.f138451a.m105289c(), InterfaceC17607a.i.f68226a, null, InterfaceC17607a.b.f68219a, 4, null), null, null, 6, null);
        }
        if (aVar instanceof InterfaceC13591a.d) {
            return new C17611e(new C17611e.a(C33205o0.f138451a.m105291e(), InterfaceC17607a.i.f68226a, null, InterfaceC17607a.b.f68219a, 4, null), null, null, 6, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    private final C17611e.b m58048c(NavigationBarModel navigationBarModel) {
        String title = navigationBarModel.getTitle();
        NavigationButtonModel rightButton = navigationBarModel.getRightButton();
        return new C17611e.b(title, rightButton != null ? m58049d(rightButton) : null);
    }

    /* JADX INFO: renamed from: d */
    private final C17611e.c m58049d(NavigationButtonModel navigationButtonModel) {
        return new C17611e.c(navigationButtonModel.getIcon(), navigationButtonModel.getContentDescription(), navigationButtonModel.getDestination());
    }

    /* JADX INFO: renamed from: e */
    private final C17608b m58050e(VideoCallParticipantModel videoCallParticipantModel) {
        String id4 = videoCallParticipantModel.getId();
        String displayName = videoCallParticipantModel.getDisplayName();
        Character chM125883b0 = AbstractC39414r.m125883b0(videoCallParticipantModel.getFirstName());
        Object objValueOf = chM125883b0 != null ? Character.valueOf(Character.toUpperCase(chM125883b0.charValue())) : "";
        Character chM125883b1 = AbstractC39414r.m125883b0(videoCallParticipantModel.getLastName());
        Object objValueOf2 = chM125883b1 != null ? Character.valueOf(Character.toUpperCase(chM125883b1.charValue())) : "";
        StringBuilder sb4 = new StringBuilder();
        sb4.append(objValueOf);
        sb4.append(objValueOf2);
        String string = sb4.toString();
        ImageUrlModel profileImage = videoCallParticipantModel.getProfileImage();
        return new C17608b(id4, displayName, string, profileImage != null ? AbstractC23618e2.m68697h(profileImage) : null);
    }

    /* JADX INFO: renamed from: f */
    private final C17609c m58051f(VideoCallParticipantsModel videoCallParticipantsModel) {
        return new C17609c(m58050e(videoCallParticipantsModel.getLocalParticipant()), m58050e(videoCallParticipantsModel.getPrimaryRemoteParticipant()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    private final C17611e m58052g(C13593c c13593c) {
        InterfaceC14759l callState = c13593c.getCallState();
        Object dVar = null;
        if (c13593c.getContent() != null) {
            VideoCallWaitingRoomModel waitingRoom = c13593c.getContent().getWaitingRoom();
            boolean arePermissionsEnabled = c13593c.getArePermissionsEnabled();
            C17611e.b bVarM58048c = m58048c(waitingRoom.getNavigationBar());
            String header = waitingRoom.getHeader();
            String description = waitingRoom.getDescription();
            String primaryButtonTitle = waitingRoom.getPrimaryButtonTitle();
            DialogModel modal = c13593c.getContent().getPermissions().getModal();
            if (!c13593c.getArePermissionsEnabled()) {
                VideoCallPermissionsModel permissions = c13593c.getContent().getPermissions();
                InfoCalloutTileModel callout = permissions.getCallout();
                dVar = AbstractC23653j2.m68922b(callout.copy((15871 & 1) != 0 ? callout.title : null, (15871 & 2) != 0 ? callout.description : null, (15871 & 4) != 0 ? callout.descriptionTypography : null, (15871 & 8) != 0 ? callout.style : null, (15871 & 16) != 0 ? callout.icon : null, (15871 & 32) != 0 ? callout.useFallbackIcon : null, (15871 & 64) != 0 ? callout.iconGradient : null, (15871 & 128) != 0 ? callout.iconSize : null, (15871 & 256) != 0 ? callout.componentDismissalId : null, (15871 & 512) != 0 ? callout.items : AbstractC37056f.m118958J(permissions.getButton()), (15871 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? callout.itemsAlignment : null, (15871 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? callout.analyticsProperties : null, (15871 & 4096) != 0 ? callout.dismissAction : null, (15871 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? callout.analyticEvents : null));
            }
            dVar = new C17611e.d(new C17611e.e(bVarM58048c, header, description, primaryButtonTitle, modal, dVar), m58051f(c13593c.getContent().getParticipants()), arePermissionsEnabled);
        }
        return new C17611e(null, callState, dVar, 1, null);
    }

    /* JADX INFO: renamed from: a */
    public final C17611e m58053a(C13593c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        return domainResult.getCurrentDialogType() instanceof InterfaceC13591a.a ? m58047b((InterfaceC13591a.a) domainResult.getCurrentDialogType()) : m58052g(domainResult);
    }
}
