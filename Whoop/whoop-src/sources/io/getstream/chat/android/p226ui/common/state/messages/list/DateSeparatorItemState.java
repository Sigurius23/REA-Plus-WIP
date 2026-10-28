package io.getstream.chat.android.p226ui.common.state.messages.list;

import com.mapbox.common.HttpHeaders;
import java.util.Date;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/list/DateSeparatorItemState;", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;", HttpHeaders.DATE, "Ljava/util/Date;", "<init>", "(Ljava/util/Date;)V", "getDate", "()Ljava/util/Date;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DateSeparatorItemState extends MessageListItemState {
    public static final int $stable = 8;
    private final Date date;

    public DateSeparatorItemState(Date date) {
        AbstractC22676k.m65750j(date, "date");
        this.date = date;
    }

    public static /* synthetic */ DateSeparatorItemState copy$default(DateSeparatorItemState dateSeparatorItemState, Date date, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            date = dateSeparatorItemState.date;
        }
        return dateSeparatorItemState.copy(date);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    public final DateSeparatorItemState copy(Date date) {
        AbstractC22676k.m65750j(date, "date");
        return new DateSeparatorItemState(date);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DateSeparatorItemState) && AbstractC22676k.m65745e(this.date, ((DateSeparatorItemState) other).date);
    }

    public final Date getDate() {
        return this.date;
    }

    public final int hashCode() {
        return this.date.hashCode();
    }

    public final String toString() {
        return "DateSeparatorItemState(date=" + this.date + ")";
    }
}
