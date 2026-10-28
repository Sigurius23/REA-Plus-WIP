package live.hms.video.sdk.models;

import java.util.ArrayList;
import java.util.List;
import live.hms.video.sdk.models.enums.HMSMessageRecipientType;
import live.hms.video.sdk.models.role.HMSRole;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B/\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSMessageRecipient;", "", "recipientPeer", "Llive/hms/video/sdk/models/HMSPeer;", "recipientRoles", "", "Llive/hms/video/sdk/models/role/HMSRole;", "recipientType", "Llive/hms/video/sdk/models/enums/HMSMessageRecipientType;", "<init>", "(Llive/hms/video/sdk/models/HMSPeer;Ljava/util/List;Llive/hms/video/sdk/models/enums/HMSMessageRecipientType;)V", "getRecipientPeer", "()Llive/hms/video/sdk/models/HMSPeer;", "setRecipientPeer", "(Llive/hms/video/sdk/models/HMSPeer;)V", "getRecipientRoles", "()Ljava/util/List;", "setRecipientRoles", "(Ljava/util/List;)V", "getRecipientType", "()Llive/hms/video/sdk/models/enums/HMSMessageRecipientType;", "setRecipientType", "(Llive/hms/video/sdk/models/enums/HMSMessageRecipientType;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSMessageRecipient {
    private HMSPeer recipientPeer;
    private List<HMSRole> recipientRoles;
    private HMSMessageRecipientType recipientType;

    public HMSMessageRecipient() {
        this(null, null, null, 7, null);
    }

    public final HMSPeer getRecipientPeer() {
        return this.recipientPeer;
    }

    public final List<HMSRole> getRecipientRoles() {
        return this.recipientRoles;
    }

    public final HMSMessageRecipientType getRecipientType() {
        return this.recipientType;
    }

    public final void setRecipientPeer(HMSPeer hMSPeer) {
        this.recipientPeer = hMSPeer;
    }

    public final void setRecipientRoles(List<HMSRole> list) {
        AbstractC22676k.m65750j(list, "<set-?>");
        this.recipientRoles = list;
    }

    public final void setRecipientType(HMSMessageRecipientType hMSMessageRecipientType) {
        AbstractC22676k.m65750j(hMSMessageRecipientType, "<set-?>");
        this.recipientType = hMSMessageRecipientType;
    }

    public HMSMessageRecipient(HMSPeer hMSPeer, List<HMSRole> recipientRoles, HMSMessageRecipientType recipientType) {
        AbstractC22676k.m65750j(recipientRoles, "recipientRoles");
        AbstractC22676k.m65750j(recipientType, "recipientType");
        this.recipientPeer = hMSPeer;
        this.recipientRoles = recipientRoles;
        this.recipientType = recipientType;
    }

    public /* synthetic */ HMSMessageRecipient(HMSPeer hMSPeer, List list, HMSMessageRecipientType hMSMessageRecipientType, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : hMSPeer, (i13 & 2) != 0 ? new ArrayList() : list, (i13 & 4) != 0 ? HMSMessageRecipientType.BROADCAST : hMSMessageRecipientType);
    }
}
