package es2;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.items.ImageUrlModel;
import com.whoop.design.models.items.NavigationBarModel;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.modal.DialogModel;
import com.whoop.navigation.C9598e;
import com.whoop.videocall.api.VideoCallContentResponse;
import fs2.InterfaceC14759l;
import hs2.InterfaceC17607a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: es2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJV\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\b\"\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, m65681d2 = {"Les2/c;", "", "Les2/a;", "currentDialogType", "Lcom/whoop/videocall/api/VideoCallContentResponse;", "content", "Lfs2/l;", "callState", "Lhs2/a;", NotificationCompat.CATEGORY_EVENT, "", "arePermissionsEnabled", "Lcom/whoop/navigation/e;", "pendingDestination", "<init>", "(Les2/a;Lcom/whoop/videocall/api/VideoCallContentResponse;Lfs2/l;Lhs2/a;ZLcom/whoop/navigation/e;)V", "a", "(Les2/a;Lcom/whoop/videocall/api/VideoCallContentResponse;Lfs2/l;Lhs2/a;ZLcom/whoop/navigation/e;)Les2/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Les2/a;", "f", "()Les2/a;", "b", "Lcom/whoop/videocall/api/VideoCallContentResponse;", "e", "()Lcom/whoop/videocall/api/VideoCallContentResponse;", "c", "Lfs2/l;", "d", "()Lfs2/l;", "Lhs2/a;", "g", "()Lhs2/a;", "Z", "()Z", "Lcom/whoop/navigation/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/navigation/e;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13593c {

    /* JADX INFO: renamed from: g */
    public static final int f47991g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC13591a currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final VideoCallContentResponse content;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC14759l callState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC17607a event;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean arePermissionsEnabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C9598e pendingDestination;

    static {
        int i13 = C9598e.f28134d | DialogModel.$stable | SecondaryButtonModel.$stable | InfoCalloutTileModel.$stable;
        int i14 = ImageUrlModel.$stable;
        f47991g = i13 | i14 | i14 | NavigationBarModel.$stable;
    }

    public C13593c(InterfaceC13591a interfaceC13591a, VideoCallContentResponse videoCallContentResponse, InterfaceC14759l interfaceC14759l, InterfaceC17607a interfaceC17607a, boolean z4, C9598e c9598e) {
        this.currentDialogType = interfaceC13591a;
        this.content = videoCallContentResponse;
        this.callState = interfaceC14759l;
        this.event = interfaceC17607a;
        this.arePermissionsEnabled = z4;
        this.pendingDestination = c9598e;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C13593c m38395b(C13593c c13593c, InterfaceC13591a interfaceC13591a, VideoCallContentResponse videoCallContentResponse, InterfaceC14759l interfaceC14759l, InterfaceC17607a interfaceC17607a, boolean z4, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC13591a = c13593c.currentDialogType;
        }
        if ((i13 & 2) != 0) {
            videoCallContentResponse = c13593c.content;
        }
        if ((i13 & 4) != 0) {
            interfaceC14759l = c13593c.callState;
        }
        if ((i13 & 8) != 0) {
            interfaceC17607a = c13593c.event;
        }
        if ((i13 & 16) != 0) {
            z4 = c13593c.arePermissionsEnabled;
        }
        if ((i13 & 32) != 0) {
            c9598e = c13593c.pendingDestination;
        }
        boolean z13 = z4;
        C9598e c9598e2 = c9598e;
        return c13593c.m38396a(interfaceC13591a, videoCallContentResponse, interfaceC14759l, interfaceC17607a, z13, c9598e2);
    }

    /* JADX INFO: renamed from: a */
    public final C13593c m38396a(InterfaceC13591a currentDialogType, VideoCallContentResponse content, InterfaceC14759l callState, InterfaceC17607a event, boolean arePermissionsEnabled, C9598e pendingDestination) {
        return new C13593c(currentDialogType, content, callState, event, arePermissionsEnabled, pendingDestination);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getArePermissionsEnabled() {
        return this.arePermissionsEnabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC14759l getCallState() {
        return this.callState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final VideoCallContentResponse getContent() {
        return this.content;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13593c)) {
            return false;
        }
        C13593c c13593c = (C13593c) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c13593c.currentDialogType) && AbstractC22676k.m65745e(this.content, c13593c.content) && AbstractC22676k.m65745e(this.callState, c13593c.callState) && AbstractC22676k.m65745e(this.event, c13593c.event) && this.arePermissionsEnabled == c13593c.arePermissionsEnabled && AbstractC22676k.m65745e(this.pendingDestination, c13593c.pendingDestination);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC13591a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final InterfaceC17607a getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C9598e getPendingDestination() {
        return this.pendingDestination;
    }

    public int hashCode() {
        InterfaceC13591a interfaceC13591a = this.currentDialogType;
        int iHashCode = (interfaceC13591a == null ? 0 : interfaceC13591a.hashCode()) * 31;
        VideoCallContentResponse videoCallContentResponse = this.content;
        int iHashCode2 = (iHashCode + (videoCallContentResponse == null ? 0 : videoCallContentResponse.hashCode())) * 31;
        InterfaceC14759l interfaceC14759l = this.callState;
        int iHashCode3 = (iHashCode2 + (interfaceC14759l == null ? 0 : interfaceC14759l.hashCode())) * 31;
        InterfaceC17607a interfaceC17607a = this.event;
        int iM8289b = AbstractC2875y.m8289b((iHashCode3 + (interfaceC17607a == null ? 0 : interfaceC17607a.hashCode())) * 31, 31, this.arePermissionsEnabled);
        C9598e c9598e = this.pendingDestination;
        return iM8289b + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        return "VideoCallDomainState(currentDialogType=" + this.currentDialogType + ", content=" + this.content + ", callState=" + this.callState + ", event=" + this.event + ", arePermissionsEnabled=" + this.arePermissionsEnabled + ", pendingDestination=" + this.pendingDestination + ")";
    }

    public /* synthetic */ C13593c(InterfaceC13591a interfaceC13591a, VideoCallContentResponse videoCallContentResponse, InterfaceC14759l interfaceC14759l, InterfaceC17607a interfaceC17607a, boolean z4, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC13591a, (i13 & 2) != 0 ? null : videoCallContentResponse, (i13 & 4) != 0 ? null : interfaceC14759l, (i13 & 8) != 0 ? null : interfaceC17607a, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? null : c9598e);
    }
}
