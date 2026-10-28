package io.getstream.chat.android.models;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import io.getstream.chat.android.models.querysort.ComparableFieldProvider;
import java.util.List;
import java.util.Map;
import live.hms.video.utils.HMSConstantsKt;
import m83.C25271y;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000f\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001HB\u009f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010*2\u0006\u0010+\u001a\u00020\u0004H\u0016J9\u0010,\u001a\u0002H-\"\u0004\b\u0000\u0010.\"\u0004\b\u0001\u0010-*\u000e\u0012\u0004\u0012\u0002H.\u0012\u0004\u0012\u0002H-0\r2\u0006\u0010/\u001a\u0002H.2\u0006\u00100\u001a\u0002H-H\u0002¢\u0006\u0002\u00101J\u0006\u00102\u001a\u000203J\b\u00104\u001a\u00020\u0004H\u0016J\b\u00105\u001a\u000206H\u0007J\t\u00107\u001a\u00020\u0004HÆ\u0003J\t\u00108\u001a\u00020\u0004HÆ\u0003J\t\u00109\u001a\u00020\u0004HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00040\tHÆ\u0003J\u0015\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\t\u0010>\u001a\u00020\u0010HÆ\u0003J\t\u0010?\u001a\u00020\u0010HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0004HÆ\u0003J¡\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010D\u001a\u00020\u00102\b\u0010E\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010F\u001a\u00020GHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019¨\u0006I"}, m65681d2 = {"Lio/getstream/chat/android/models/DraftMessage;", "Lio/getstream/chat/android/models/CustomObject;", "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;", "id", "", "cid", "text", "parentId", "attachments", "", "Lio/getstream/chat/android/models/Attachment;", "mentionedUsersIds", "extraData", "", "", NotificationCompat.GROUP_KEY_SILENT, "", "showInChannel", "replyMessage", "Lio/getstream/chat/android/models/Message;", "command", "args", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZLio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getCid", "getText", "getParentId", "getAttachments", "()Ljava/util/List;", "getMentionedUsersIds", "getExtraData", "()Ljava/util/Map;", "getSilent", "()Z", "getShowInChannel", "getReplyMessage", "()Lio/getstream/chat/android/models/Message;", "getCommand", "getArgs", "getComparableField", "", "fieldName", "get", "B", "A", "key", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "identifierHash", "", "toString", "newBuilder", "Lio/getstream/chat/android/models/DraftMessage$Builder;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "Builder", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DraftMessage implements CustomObject, ComparableFieldProvider {
    private final String args;
    private final List<Attachment> attachments;
    private final String cid;
    private final String command;
    private final Map<String, Object> extraData;
    private final String id;
    private final List<String> mentionedUsersIds;
    private final String parentId;
    private final Message replyMessage;
    private final boolean showInChannel;
    private final boolean silent;
    private final String text;

    public DraftMessage() {
        this(null, null, null, null, null, null, null, false, false, null, null, null, 4095, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DraftMessage copy$default(DraftMessage draftMessage, String str, String str2, String str3, String str4, List list, List list2, Map map, boolean z4, boolean z13, Message message, String str5, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = draftMessage.id;
        }
        if ((i13 & 2) != 0) {
            str2 = draftMessage.cid;
        }
        if ((i13 & 4) != 0) {
            str3 = draftMessage.text;
        }
        if ((i13 & 8) != 0) {
            str4 = draftMessage.parentId;
        }
        if ((i13 & 16) != 0) {
            list = draftMessage.attachments;
        }
        if ((i13 & 32) != 0) {
            list2 = draftMessage.mentionedUsersIds;
        }
        if ((i13 & 64) != 0) {
            map = draftMessage.extraData;
        }
        if ((i13 & 128) != 0) {
            z4 = draftMessage.silent;
        }
        if ((i13 & 256) != 0) {
            z13 = draftMessage.showInChannel;
        }
        if ((i13 & 512) != 0) {
            message = draftMessage.replyMessage;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            str5 = draftMessage.command;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            str6 = draftMessage.args;
        }
        String str7 = str5;
        String str8 = str6;
        boolean z14 = z13;
        Message message2 = message;
        Map map2 = map;
        boolean z15 = z4;
        List list3 = list;
        List list4 = list2;
        return draftMessage.copy(str, str2, str3, str4, list3, list4, map2, z15, z14, message2, str7, str8);
    }

    private final <A, B> B get(Map<A, ? extends B> map, A a5, B b) {
        B b6 = map.get(a5);
        return b6 == null ? b : b6;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Message getReplyMessage() {
        return this.replyMessage;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCommand() {
        return this.command;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getArgs() {
        return this.args;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    public final List<Attachment> component5() {
        return this.attachments;
    }

    public final List<String> component6() {
        return this.mentionedUsersIds;
    }

    public final Map<String, Object> component7() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getSilent() {
        return this.silent;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getShowInChannel() {
        return this.showInChannel;
    }

    public final DraftMessage copy(String id4, String cid, String text, String parentId, List<Attachment> attachments, List<String> mentionedUsersIds, Map<String, ? extends Object> extraData, boolean silent, boolean showInChannel, Message replyMessage, String command, String args) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(mentionedUsersIds, "mentionedUsersIds");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new DraftMessage(id4, cid, text, parentId, attachments, mentionedUsersIds, extraData, silent, showInChannel, replyMessage, command, args);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DraftMessage)) {
            return false;
        }
        DraftMessage draftMessage = (DraftMessage) other;
        return AbstractC22676k.m65745e(this.id, draftMessage.id) && AbstractC22676k.m65745e(this.cid, draftMessage.cid) && AbstractC22676k.m65745e(this.text, draftMessage.text) && AbstractC22676k.m65745e(this.parentId, draftMessage.parentId) && AbstractC22676k.m65745e(this.attachments, draftMessage.attachments) && AbstractC22676k.m65745e(this.mentionedUsersIds, draftMessage.mentionedUsersIds) && AbstractC22676k.m65745e(this.extraData, draftMessage.extraData) && this.silent == draftMessage.silent && this.showInChannel == draftMessage.showInChannel && AbstractC22676k.m65745e(this.replyMessage, draftMessage.replyMessage) && AbstractC22676k.m65745e(this.command, draftMessage.command) && AbstractC22676k.m65745e(this.args, draftMessage.args);
    }

    public final String getArgs() {
        return this.args;
    }

    public final List<Attachment> getAttachments() {
        return this.attachments;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getCommand() {
        return this.command;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        return r1.parentId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r2.equals("parent_id") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r2.equals("parentId") == false) goto L30;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.getstream.chat.android.models.querysort.ComparableFieldProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Comparable<?> getComparableField(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "fieldName"
            p715kotlin.jvm.internal.AbstractC22676k.m65750j(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -902327211: goto L46;
                case 3355: goto L3a;
                case 98494: goto L2e;
                case 3556653: goto L22;
                case 1175162725: goto L16;
                case 2070327504: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L4e
        Ld:
            java.lang.String r0 = "parent_id"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1f
            goto L4e
        L16:
            java.lang.String r0 = "parentId"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1f
            goto L4e
        L1f:
            java.lang.String r2 = r1.parentId
            return r2
        L22:
            java.lang.String r0 = "text"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2b
            goto L4e
        L2b:
            java.lang.String r2 = r1.text
            return r2
        L2e:
            java.lang.String r0 = "cid"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L37
            goto L4e
        L37:
            java.lang.String r2 = r1.cid
            return r2
        L3a:
            java.lang.String r0 = "id"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L43
            goto L4e
        L43:
            java.lang.String r2 = r1.id
            return r2
        L46:
            java.lang.String r0 = "silent"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L5f
        L4e:
            java.util.Map r0 = r1.getExtraData()
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof java.lang.Comparable
            if (r0 == 0) goto L5d
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            return r2
        L5d:
            r2 = 0
            return r2
        L5f:
            boolean r2 = r1.silent
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.models.DraftMessage.getComparableField(java.lang.String):java.lang.Comparable");
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public Map<String, Object> getExtraData() {
        return this.extraData;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public <T> T getExtraValue(String str, T t14) {
        return (T) super.getExtraValue(str, t14);
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getMentionedUsersIds() {
        return this.mentionedUsersIds;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final Message getReplyMessage() {
        return this.replyMessage;
    }

    public final boolean getShowInChannel() {
        return this.showInChannel;
    }

    public final boolean getSilent() {
        return this.silent;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.cid), 31, this.text);
        String str = this.parentId;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC3855a.m11821e(this.extraData, AbstractC11895b.m31983b(AbstractC11895b.m31983b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.attachments), 31, this.mentionedUsersIds), 31), 31, this.silent), 31, this.showInChannel);
        Message message = this.replyMessage;
        int iHashCode = (iM8289b + (message == null ? 0 : message.hashCode())) * 31;
        String str2 = this.command;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.args;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final long identifierHash() {
        int iHashCode = this.id.hashCode();
        String str = this.parentId;
        if (str != null) {
            iHashCode = (iHashCode * 31) + str.hashCode();
        }
        return iHashCode;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("Message(id=\"");
        sb4.append(this.id);
        sb4.append("\", text=\"");
        sb4.append(this.text);
        sb4.append("\", cid=\"");
        sb4.append(this.cid);
        sb4.append("\"");
        if (this.parentId != null) {
            sb4.append(", parentId=");
            sb4.append(this.parentId);
        }
        if (!this.attachments.isEmpty()) {
            sb4.append(", attachments=");
            sb4.append(this.attachments);
        }
        if (!this.mentionedUsersIds.isEmpty()) {
            sb4.append(", mentionedUsersIds=");
            sb4.append(this.mentionedUsersIds);
        }
        sb4.append(", silent=");
        sb4.append(this.silent);
        sb4.append(", showInChannel=");
        sb4.append(this.showInChannel);
        if (this.replyMessage != null) {
            sb4.append(", replyMessage=");
            sb4.append(this.replyMessage);
        }
        if (this.command != null) {
            sb4.append(", command=\"");
            sb4.append(this.command);
            sb4.append("\"");
        }
        if (this.args != null) {
            sb4.append(", args=\"");
            sb4.append(this.args);
            sb4.append("\"");
        }
        if (!getExtraData().isEmpty()) {
            sb4.append(", extraData=");
            sb4.append(getExtraData());
        }
        sb4.append(")");
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    public DraftMessage(String id4, String cid, String text, String str, List<Attachment> attachments, List<String> mentionedUsersIds, Map<String, ? extends Object> extraData, boolean z4, boolean z13, Message message, String str2, String str3) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(mentionedUsersIds, "mentionedUsersIds");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.id = id4;
        this.cid = cid;
        this.text = text;
        this.parentId = str;
        this.attachments = attachments;
        this.mentionedUsersIds = mentionedUsersIds;
        this.extraData = extraData;
        this.silent = z4;
        this.showInChannel = z13;
        this.replyMessage = message;
        this.command = str2;
        this.args = str3;
    }

    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\bJ\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u0014\u0010\u001d\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0014\u0010\u001e\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\rJ\u001a\u0010\u001f\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0011J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013J\u0010\u0010\"\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010#\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\bJ\u0010\u0010$\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\bJ\u0006\u0010%\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m65681d2 = {"Lio/getstream/chat/android/models/DraftMessage$Builder;", "", "<init>", "()V", "message", "Lio/getstream/chat/android/models/DraftMessage;", "(Lio/getstream/chat/android/models/DraftMessage;)V", "id", "", "cid", "text", "parentId", "attachments", "", "Lio/getstream/chat/android/models/Attachment;", "mentionedUsersIds", "extraData", "", NotificationCompat.GROUP_KEY_SILENT, "", "showInChannel", "replyMessage", "Lio/getstream/chat/android/models/Message;", "command", "args", "withId", "withCid", "withText", "withParentId", "withAttachments", "withMentionedUsersIds", "withExtraData", "withSilent", "withShowInChannel", "withReplyMessage", "withCommand", "withArgs", "build", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Builder {
        private String args;
        private List<Attachment> attachments;
        private String cid;
        private String command;
        private Map<String, ? extends Object> extraData;
        private String id;
        private List<String> mentionedUsersIds;
        private String parentId;
        private Message replyMessage;
        private boolean showInChannel;
        private boolean silent;
        private String text;

        public Builder() {
            this.id = "";
            this.cid = "";
            this.text = "";
            C25271y c25271y = C25271y.f99162w;
            this.attachments = c25271y;
            this.mentionedUsersIds = c25271y;
            this.extraData = C25272z.f99163w;
        }

        public final DraftMessage build() {
            return new DraftMessage(this.id, this.cid, this.text, this.parentId, this.attachments, this.mentionedUsersIds, this.extraData, this.silent, this.showInChannel, this.replyMessage, this.command, this.args);
        }

        public final Builder withArgs(String args) {
            this.args = args;
            return this;
        }

        public final Builder withAttachments(List<Attachment> attachments) {
            AbstractC22676k.m65750j(attachments, "attachments");
            this.attachments = attachments;
            return this;
        }

        public final Builder withCid(String cid) {
            AbstractC22676k.m65750j(cid, "cid");
            this.cid = cid;
            return this;
        }

        public final Builder withCommand(String command) {
            this.command = command;
            return this;
        }

        public final Builder withExtraData(Map<String, ? extends Object> extraData) {
            AbstractC22676k.m65750j(extraData, "extraData");
            this.extraData = extraData;
            return this;
        }

        public final Builder withId(String id4) {
            AbstractC22676k.m65750j(id4, "id");
            this.id = id4;
            return this;
        }

        public final Builder withMentionedUsersIds(List<String> mentionedUsersIds) {
            AbstractC22676k.m65750j(mentionedUsersIds, "mentionedUsersIds");
            this.mentionedUsersIds = mentionedUsersIds;
            return this;
        }

        public final Builder withParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        public final Builder withReplyMessage(Message replyMessage) {
            this.replyMessage = replyMessage;
            return this;
        }

        public final Builder withShowInChannel(boolean showInChannel) {
            this.showInChannel = showInChannel;
            return this;
        }

        public final Builder withSilent(boolean silent) {
            this.silent = silent;
            return this;
        }

        public final Builder withText(String text) {
            AbstractC22676k.m65750j(text, "text");
            this.text = text;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(DraftMessage message) {
            this();
            AbstractC22676k.m65750j(message, "message");
            this.id = message.getId();
            this.cid = message.getCid();
            this.text = message.getText();
            this.parentId = message.getParentId();
            this.attachments = message.getAttachments();
            this.mentionedUsersIds = message.getMentionedUsersIds();
            this.extraData = message.getExtraData();
            this.silent = message.getSilent();
            this.showInChannel = message.getShowInChannel();
            this.replyMessage = message.getReplyMessage();
            this.command = message.getCommand();
            this.args = message.getArgs();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DraftMessage(String str, String str2, String str3, String str4, List list, List list2, Map map, boolean z4, boolean z13, Message message, String str5, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i13 & 1) != 0 ? "" : str;
        str2 = (i13 & 2) != 0 ? "" : str2;
        String str7 = (i13 & 4) == 0 ? str3 : "";
        String str8 = (i13 & 8) != 0 ? null : str4;
        int i14 = i13 & 16;
        List list3 = C25271y.f99162w;
        this(str, str2, str7, str8, i14 != 0 ? list3 : list, (i13 & 32) == 0 ? list2 : list3, (i13 & 64) != 0 ? C25272z.f99163w : map, (i13 & 128) != 0 ? false : z4, (i13 & 256) == 0 ? z13 : false, (i13 & 512) != 0 ? null : message, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str5, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str6);
    }
}
