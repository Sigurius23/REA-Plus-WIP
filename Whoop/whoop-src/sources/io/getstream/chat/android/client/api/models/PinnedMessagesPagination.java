package io.getstream.chat.android.client.api.models;

import com.mapbox.common.HttpHeaders;
import java.util.Date;
import nh3.AbstractC26725a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;", "", "<init>", "()V", "AroundMessage", "BeforeMessage", "AfterMessage", "AroundDate", "BeforeDate", "AfterDate", "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$AfterDate;", "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$AfterMessage;", "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$AroundDate;", "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$AroundMessage;", "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$BeforeDate;", "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$BeforeMessage;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class PinnedMessagesPagination {

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$AfterDate;", "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;", HttpHeaders.DATE, "Ljava/util/Date;", "inclusive", "", "<init>", "(Ljava/util/Date;Z)V", "getDate", "()Ljava/util/Date;", "getInclusive", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class AfterDate extends PinnedMessagesPagination {
        private final Date date;
        private final boolean inclusive;

        public AfterDate(Date date, boolean z4) {
            AbstractC22676k.m65750j(date, "date");
            this.date = date;
            this.inclusive = z4;
        }

        public static /* synthetic */ AfterDate copy$default(AfterDate afterDate, Date date, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                date = afterDate.date;
            }
            if ((i13 & 2) != 0) {
                z4 = afterDate.inclusive;
            }
            return afterDate.copy(date, z4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Date getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getInclusive() {
            return this.inclusive;
        }

        public final AfterDate copy(Date date, boolean inclusive) {
            AbstractC22676k.m65750j(date, "date");
            return new AfterDate(date, inclusive);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AfterDate)) {
                return false;
            }
            AfterDate afterDate = (AfterDate) other;
            return AbstractC22676k.m65745e(this.date, afterDate.date) && this.inclusive == afterDate.inclusive;
        }

        public final Date getDate() {
            return this.date;
        }

        public final boolean getInclusive() {
            return this.inclusive;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.inclusive) + (this.date.hashCode() * 31);
        }

        public final String toString() {
            return "AfterDate(date=" + this.date + ", inclusive=" + this.inclusive + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$AfterMessage;", "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;", "messageId", "", "inclusive", "", "<init>", "(Ljava/lang/String;Z)V", "getMessageId", "()Ljava/lang/String;", "getInclusive", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class AfterMessage extends PinnedMessagesPagination {
        private final boolean inclusive;
        private final String messageId;

        public AfterMessage(String messageId, boolean z4) {
            AbstractC22676k.m65750j(messageId, "messageId");
            this.messageId = messageId;
            this.inclusive = z4;
        }

        public static /* synthetic */ AfterMessage copy$default(AfterMessage afterMessage, String str, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = afterMessage.messageId;
            }
            if ((i13 & 2) != 0) {
                z4 = afterMessage.inclusive;
            }
            return afterMessage.copy(str, z4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getInclusive() {
            return this.inclusive;
        }

        public final AfterMessage copy(String messageId, boolean inclusive) {
            AbstractC22676k.m65750j(messageId, "messageId");
            return new AfterMessage(messageId, inclusive);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AfterMessage)) {
                return false;
            }
            AfterMessage afterMessage = (AfterMessage) other;
            return AbstractC22676k.m65745e(this.messageId, afterMessage.messageId) && this.inclusive == afterMessage.inclusive;
        }

        public final boolean getInclusive() {
            return this.inclusive;
        }

        public final String getMessageId() {
            return this.messageId;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.inclusive) + (this.messageId.hashCode() * 31);
        }

        public final String toString() {
            return AbstractC26725a.m79503g("AfterMessage(messageId=", this.messageId, ", inclusive=", ")", this.inclusive);
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$AroundDate;", "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;", HttpHeaders.DATE, "Ljava/util/Date;", "<init>", "(Ljava/util/Date;)V", "getDate", "()Ljava/util/Date;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class AroundDate extends PinnedMessagesPagination {
        private final Date date;

        public AroundDate(Date date) {
            AbstractC22676k.m65750j(date, "date");
            this.date = date;
        }

        public static /* synthetic */ AroundDate copy$default(AroundDate aroundDate, Date date, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                date = aroundDate.date;
            }
            return aroundDate.copy(date);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Date getDate() {
            return this.date;
        }

        public final AroundDate copy(Date date) {
            AbstractC22676k.m65750j(date, "date");
            return new AroundDate(date);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AroundDate) && AbstractC22676k.m65745e(this.date, ((AroundDate) other).date);
        }

        public final Date getDate() {
            return this.date;
        }

        public final int hashCode() {
            return this.date.hashCode();
        }

        public final String toString() {
            return "AroundDate(date=" + this.date + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$AroundMessage;", "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;", "messageId", "", "<init>", "(Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class AroundMessage extends PinnedMessagesPagination {
        private final String messageId;

        public AroundMessage(String messageId) {
            AbstractC22676k.m65750j(messageId, "messageId");
            this.messageId = messageId;
        }

        public static /* synthetic */ AroundMessage copy$default(AroundMessage aroundMessage, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = aroundMessage.messageId;
            }
            return aroundMessage.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        public final AroundMessage copy(String messageId) {
            AbstractC22676k.m65750j(messageId, "messageId");
            return new AroundMessage(messageId);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AroundMessage) && AbstractC22676k.m65745e(this.messageId, ((AroundMessage) other).messageId);
        }

        public final String getMessageId() {
            return this.messageId;
        }

        public final int hashCode() {
            return this.messageId.hashCode();
        }

        public final String toString() {
            return AbstractC11895b.m31996o("AroundMessage(messageId=", this.messageId, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$BeforeDate;", "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;", HttpHeaders.DATE, "Ljava/util/Date;", "inclusive", "", "<init>", "(Ljava/util/Date;Z)V", "getDate", "()Ljava/util/Date;", "getInclusive", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class BeforeDate extends PinnedMessagesPagination {
        private final Date date;
        private final boolean inclusive;

        public BeforeDate(Date date, boolean z4) {
            AbstractC22676k.m65750j(date, "date");
            this.date = date;
            this.inclusive = z4;
        }

        public static /* synthetic */ BeforeDate copy$default(BeforeDate beforeDate, Date date, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                date = beforeDate.date;
            }
            if ((i13 & 2) != 0) {
                z4 = beforeDate.inclusive;
            }
            return beforeDate.copy(date, z4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Date getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getInclusive() {
            return this.inclusive;
        }

        public final BeforeDate copy(Date date, boolean inclusive) {
            AbstractC22676k.m65750j(date, "date");
            return new BeforeDate(date, inclusive);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BeforeDate)) {
                return false;
            }
            BeforeDate beforeDate = (BeforeDate) other;
            return AbstractC22676k.m65745e(this.date, beforeDate.date) && this.inclusive == beforeDate.inclusive;
        }

        public final Date getDate() {
            return this.date;
        }

        public final boolean getInclusive() {
            return this.inclusive;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.inclusive) + (this.date.hashCode() * 31);
        }

        public final String toString() {
            return "BeforeDate(date=" + this.date + ", inclusive=" + this.inclusive + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$BeforeMessage;", "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;", "messageId", "", "inclusive", "", "<init>", "(Ljava/lang/String;Z)V", "getMessageId", "()Ljava/lang/String;", "getInclusive", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class BeforeMessage extends PinnedMessagesPagination {
        private final boolean inclusive;
        private final String messageId;

        public BeforeMessage(String messageId, boolean z4) {
            AbstractC22676k.m65750j(messageId, "messageId");
            this.messageId = messageId;
            this.inclusive = z4;
        }

        public static /* synthetic */ BeforeMessage copy$default(BeforeMessage beforeMessage, String str, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = beforeMessage.messageId;
            }
            if ((i13 & 2) != 0) {
                z4 = beforeMessage.inclusive;
            }
            return beforeMessage.copy(str, z4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getInclusive() {
            return this.inclusive;
        }

        public final BeforeMessage copy(String messageId, boolean inclusive) {
            AbstractC22676k.m65750j(messageId, "messageId");
            return new BeforeMessage(messageId, inclusive);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BeforeMessage)) {
                return false;
            }
            BeforeMessage beforeMessage = (BeforeMessage) other;
            return AbstractC22676k.m65745e(this.messageId, beforeMessage.messageId) && this.inclusive == beforeMessage.inclusive;
        }

        public final boolean getInclusive() {
            return this.inclusive;
        }

        public final String getMessageId() {
            return this.messageId;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.inclusive) + (this.messageId.hashCode() * 31);
        }

        public final String toString() {
            return AbstractC26725a.m79503g("BeforeMessage(messageId=", this.messageId, ", inclusive=", ")", this.inclusive);
        }
    }

    private PinnedMessagesPagination() {
    }

    public PinnedMessagesPagination(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
