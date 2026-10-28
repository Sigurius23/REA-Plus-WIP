package io.getstream.chat.android.models;

import java.util.List;
import m83.C25271y;
import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/models/SearchMessagesResult;", "", "messages", "", "Lio/getstream/chat/android/models/Message;", "next", "", "previous", "resultsWarning", "Lio/getstream/chat/android/models/SearchWarning;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SearchWarning;)V", "getMessages", "()Ljava/util/List;", "getNext", "()Ljava/lang/String;", "getPrevious", "getResultsWarning", "()Lio/getstream/chat/android/models/SearchWarning;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class SearchMessagesResult {
    private final List<Message> messages;
    private final String next;
    private final String previous;
    private final SearchWarning resultsWarning;

    public SearchMessagesResult() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchMessagesResult copy$default(SearchMessagesResult searchMessagesResult, List list, String str, String str2, SearchWarning searchWarning, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = searchMessagesResult.messages;
        }
        if ((i13 & 2) != 0) {
            str = searchMessagesResult.next;
        }
        if ((i13 & 4) != 0) {
            str2 = searchMessagesResult.previous;
        }
        if ((i13 & 8) != 0) {
            searchWarning = searchMessagesResult.resultsWarning;
        }
        return searchMessagesResult.copy(list, str, str2, searchWarning);
    }

    public final List<Message> component1() {
        return this.messages;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPrevious() {
        return this.previous;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SearchWarning getResultsWarning() {
        return this.resultsWarning;
    }

    public final SearchMessagesResult copy(List<Message> messages, String next, String previous, SearchWarning resultsWarning) {
        AbstractC22676k.m65750j(messages, "messages");
        return new SearchMessagesResult(messages, next, previous, resultsWarning);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchMessagesResult)) {
            return false;
        }
        SearchMessagesResult searchMessagesResult = (SearchMessagesResult) other;
        return AbstractC22676k.m65745e(this.messages, searchMessagesResult.messages) && AbstractC22676k.m65745e(this.next, searchMessagesResult.next) && AbstractC22676k.m65745e(this.previous, searchMessagesResult.previous) && AbstractC22676k.m65745e(this.resultsWarning, searchMessagesResult.resultsWarning);
    }

    public final List<Message> getMessages() {
        return this.messages;
    }

    public final String getNext() {
        return this.next;
    }

    public final String getPrevious() {
        return this.previous;
    }

    public final SearchWarning getResultsWarning() {
        return this.resultsWarning;
    }

    public int hashCode() {
        int iHashCode = this.messages.hashCode() * 31;
        String str = this.next;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.previous;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SearchWarning searchWarning = this.resultsWarning;
        return iHashCode3 + (searchWarning != null ? searchWarning.hashCode() : 0);
    }

    public String toString() {
        List<Message> list = this.messages;
        String str = this.next;
        String str2 = this.previous;
        SearchWarning searchWarning = this.resultsWarning;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("SearchMessagesResult(messages=", ", next=", str, ", previous=", list);
        sbM79507k.append(str2);
        sbM79507k.append(", resultsWarning=");
        sbM79507k.append(searchWarning);
        sbM79507k.append(")");
        return sbM79507k.toString();
    }

    public SearchMessagesResult(List<Message> messages, String str, String str2, SearchWarning searchWarning) {
        AbstractC22676k.m65750j(messages, "messages");
        this.messages = messages;
        this.next = str;
        this.previous = str2;
        this.resultsWarning = searchWarning;
    }

    public /* synthetic */ SearchMessagesResult(List list, String str, String str2, SearchWarning searchWarning, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : searchWarning);
    }
}
