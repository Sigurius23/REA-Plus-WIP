package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import androidx.core.app.NotificationCompat;
import java.util.List;
import java.util.Map;
import m83.C25271y;
import m83.C25272z;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0010HÆ\u0003J\u0091\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0010HÆ\u0001J\u0013\u0010.\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00063"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;", "", "id", "", "cid", "text", "parentId", "mentionedUsersIds", "", NotificationCompat.GROUP_KEY_SILENT, "", "showInChannel", "replyMessageId", "command", "args", "extraData", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getCid", "getText", "getParentId", "getMentionedUsersIds", "()Ljava/util/List;", "getSilent", "()Z", "getShowInChannel", "getReplyMessageId", "getCommand", "getArgs", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DraftMessageEntity {
    private final String args;
    private final String cid;
    private final String command;
    private final Map<String, Object> extraData;
    private final String id;
    private final List<String> mentionedUsersIds;
    private final String parentId;
    private final String replyMessageId;
    private final boolean showInChannel;
    private final boolean silent;
    private final String text;

    public DraftMessageEntity(String id4, String cid, String text, String str, List<String> mentionedUsersIds, boolean z4, boolean z13, String str2, String str3, String str4, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(mentionedUsersIds, "mentionedUsersIds");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.id = id4;
        this.cid = cid;
        this.text = text;
        this.parentId = str;
        this.mentionedUsersIds = mentionedUsersIds;
        this.silent = z4;
        this.showInChannel = z13;
        this.replyMessageId = str2;
        this.command = str3;
        this.args = str4;
        this.extraData = extraData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DraftMessageEntity copy$default(DraftMessageEntity draftMessageEntity, String str, String str2, String str3, String str4, List list, boolean z4, boolean z13, String str5, String str6, String str7, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = draftMessageEntity.id;
        }
        if ((i13 & 2) != 0) {
            str2 = draftMessageEntity.cid;
        }
        if ((i13 & 4) != 0) {
            str3 = draftMessageEntity.text;
        }
        if ((i13 & 8) != 0) {
            str4 = draftMessageEntity.parentId;
        }
        if ((i13 & 16) != 0) {
            list = draftMessageEntity.mentionedUsersIds;
        }
        if ((i13 & 32) != 0) {
            z4 = draftMessageEntity.silent;
        }
        if ((i13 & 64) != 0) {
            z13 = draftMessageEntity.showInChannel;
        }
        if ((i13 & 128) != 0) {
            str5 = draftMessageEntity.replyMessageId;
        }
        if ((i13 & 256) != 0) {
            str6 = draftMessageEntity.command;
        }
        if ((i13 & 512) != 0) {
            str7 = draftMessageEntity.args;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            map = draftMessageEntity.extraData;
        }
        String str8 = str7;
        Map map2 = map;
        String str9 = str5;
        String str10 = str6;
        boolean z14 = z4;
        boolean z15 = z13;
        List list2 = list;
        String str11 = str3;
        return draftMessageEntity.copy(str, str2, str11, str4, list2, z14, z15, str9, str10, str8, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getArgs() {
        return this.args;
    }

    public final Map<String, Object> component11() {
        return this.extraData;
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

    public final List<String> component5() {
        return this.mentionedUsersIds;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getSilent() {
        return this.silent;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShowInChannel() {
        return this.showInChannel;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getReplyMessageId() {
        return this.replyMessageId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCommand() {
        return this.command;
    }

    public final DraftMessageEntity copy(String id4, String cid, String text, String parentId, List<String> mentionedUsersIds, boolean silent, boolean showInChannel, String replyMessageId, String command, String args, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(mentionedUsersIds, "mentionedUsersIds");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new DraftMessageEntity(id4, cid, text, parentId, mentionedUsersIds, silent, showInChannel, replyMessageId, command, args, extraData);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DraftMessageEntity)) {
            return false;
        }
        DraftMessageEntity draftMessageEntity = (DraftMessageEntity) other;
        return AbstractC22676k.m65745e(this.id, draftMessageEntity.id) && AbstractC22676k.m65745e(this.cid, draftMessageEntity.cid) && AbstractC22676k.m65745e(this.text, draftMessageEntity.text) && AbstractC22676k.m65745e(this.parentId, draftMessageEntity.parentId) && AbstractC22676k.m65745e(this.mentionedUsersIds, draftMessageEntity.mentionedUsersIds) && this.silent == draftMessageEntity.silent && this.showInChannel == draftMessageEntity.showInChannel && AbstractC22676k.m65745e(this.replyMessageId, draftMessageEntity.replyMessageId) && AbstractC22676k.m65745e(this.command, draftMessageEntity.command) && AbstractC22676k.m65745e(this.args, draftMessageEntity.args) && AbstractC22676k.m65745e(this.extraData, draftMessageEntity.extraData);
    }

    public final String getArgs() {
        return this.args;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getCommand() {
        return this.command;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
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

    public final String getReplyMessageId() {
        return this.replyMessageId;
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

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.cid), 31, this.text);
        String str = this.parentId;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11895b.m31983b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.mentionedUsersIds), 31, this.silent), 31, this.showInChannel);
        String str2 = this.replyMessageId;
        int iHashCode = (iM8289b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.command;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.args;
        return this.extraData.hashCode() + ((iHashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.cid;
        String str3 = this.text;
        String str4 = this.parentId;
        List<String> list = this.mentionedUsersIds;
        boolean z4 = this.silent;
        boolean z13 = this.showInChannel;
        String str5 = this.replyMessageId;
        String str6 = this.command;
        String str7 = this.args;
        Map<String, Object> map = this.extraData;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DraftMessageEntity(id=", str, ", cid=", str2, ", text=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", parentId=", str4, ", mentionedUsersIds=");
        AbstractC26725a.m79512p(", silent=", ", showInChannel=", sbM32001t, list, z4);
        AbstractC38963t7.m124391u(sbM32001t, z13, ", replyMessageId=", str5, ", command=");
        AbstractC11266d.m30444B(sbM32001t, str6, ", args=", str7, ", extraData=");
        return AbstractC13673n.m38565l(sbM32001t, map, ")");
    }

    public /* synthetic */ DraftMessageEntity(String str, String str2, String str3, String str4, List list, boolean z4, boolean z13, String str5, String str6, String str7, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? C25271y.f99162w : list, z4, z13, (i13 & 128) != 0 ? null : str5, (i13 & 256) != 0 ? null : str6, (i13 & 512) != 0 ? null : str7, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? C25272z.f99163w : map);
    }
}
