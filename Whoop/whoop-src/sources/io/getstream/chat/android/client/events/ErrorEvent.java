package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import java.util.Date;
import n23.AbstractC26202e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011¨\u0006$"}, m65681d2 = {"Lio/getstream/chat/android/client/events/ErrorEvent;", "Lio/getstream/chat/android/client/events/ChatEvent;", "", "type", "Ljava/util/Date;", "createdAt", "rawCreatedAt", "Ln23/e;", "error", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ln23/e;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Date;", "component3", "component4", "()Ln23/e;", "copy", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ln23/e;)Lio/getstream/chat/android/client/events/ErrorEvent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "Ljava/util/Date;", "getCreatedAt", "getRawCreatedAt", "Ln23/e;", "getError", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ErrorEvent extends ChatEvent {
    private final Date createdAt;
    private final AbstractC26202e error;
    private final String rawCreatedAt;
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorEvent(String type, Date createdAt, String str, AbstractC26202e error) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(error, "error");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = str;
        this.error = error;
    }

    public static /* synthetic */ ErrorEvent copy$default(ErrorEvent errorEvent, String str, Date date, String str2, AbstractC26202e abstractC26202e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = errorEvent.type;
        }
        if ((i13 & 2) != 0) {
            date = errorEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = errorEvent.rawCreatedAt;
        }
        if ((i13 & 8) != 0) {
            abstractC26202e = errorEvent.error;
        }
        return errorEvent.copy(str, date, str2, abstractC26202e);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AbstractC26202e getError() {
        return this.error;
    }

    public final ErrorEvent copy(String type, Date createdAt, String rawCreatedAt, AbstractC26202e error) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(error, "error");
        return new ErrorEvent(type, createdAt, rawCreatedAt, error);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorEvent)) {
            return false;
        }
        ErrorEvent errorEvent = (ErrorEvent) other;
        return AbstractC22676k.m65745e(this.type, errorEvent.type) && AbstractC22676k.m65745e(this.createdAt, errorEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, errorEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.error, errorEvent.error);
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final AbstractC26202e getError() {
        return this.error;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int iM124373c = AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31);
        String str = this.rawCreatedAt;
        return this.error.hashCode() + ((iM124373c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.type;
        Date date = this.createdAt;
        String str2 = this.rawCreatedAt;
        AbstractC26202e abstractC26202e = this.error;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("ErrorEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        sbM11830n.append(str2);
        sbM11830n.append(", error=");
        sbM11830n.append(abstractC26202e);
        sbM11830n.append(")");
        return sbM11830n.toString();
    }
}
