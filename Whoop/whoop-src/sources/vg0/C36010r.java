package vg0;

import com.whoop.p057ai.chat.models.Attachment;
import java.util.List;
import jh3.AbstractC21702c;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vg0.r */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0010R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, m65681d2 = {"Lvg0/r;", "", "", "fingerprint", "content", "", "fileIds", "Lcom/whoop/ai/chat/models/Attachment;", "attachments", "", "userTimestamp", "", "isSuggestion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "e", "Ljava/lang/Long;", "()Ljava/lang/Long;", "f", "Z", "()Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36010r {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String fingerprint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String content;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<String> fileIds;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<Attachment> attachments;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Long userTimestamp;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isSuggestion;

    public C36010r(String fingerprint, String str, List<String> list, List<Attachment> list2, Long l7, boolean z4) {
        AbstractC22676k.m65750j(fingerprint, "fingerprint");
        this.fingerprint = fingerprint;
        this.content = str;
        this.fileIds = list;
        this.attachments = list2;
        this.userTimestamp = l7;
        this.isSuggestion = z4;
    }

    /* JADX INFO: renamed from: a */
    public final List<Attachment> m114347a() {
        return this.attachments;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: c */
    public final List<String> m114349c() {
        return this.fileIds;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFingerprint() {
        return this.fingerprint;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getUserTimestamp() {
        return this.userTimestamp;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36010r)) {
            return false;
        }
        C36010r c36010r = (C36010r) other;
        return AbstractC22676k.m65745e(this.fingerprint, c36010r.fingerprint) && AbstractC22676k.m65745e(this.content, c36010r.content) && AbstractC22676k.m65745e(this.fileIds, c36010r.fileIds) && AbstractC22676k.m65745e(this.attachments, c36010r.attachments) && AbstractC22676k.m65745e(this.userTimestamp, c36010r.userTimestamp) && this.isSuggestion == c36010r.isSuggestion;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsSuggestion() {
        return this.isSuggestion;
    }

    public int hashCode() {
        int iHashCode = this.fingerprint.hashCode() * 31;
        String str = this.content;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.fileIds;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Attachment> list2 = this.attachments;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l7 = this.userTimestamp;
        return Boolean.hashCode(this.isSuggestion) + ((iHashCode4 + (l7 != null ? l7.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.fingerprint;
        String str2 = this.content;
        List<String> list = this.fileIds;
        List<Attachment> list2 = this.attachments;
        Long l7 = this.userTimestamp;
        boolean z4 = this.isSuggestion;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CreateTurnAction(fingerprint=", str, ", content=", str2, ", fileIds=");
        AbstractC21702c.m61148s(sbM32001t, list, ", attachments=", list2, ", userTimestamp=");
        sbM32001t.append(l7);
        sbM32001t.append(", isSuggestion=");
        sbM32001t.append(z4);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
