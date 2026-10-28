package io.getstream.chat.android.models;

import java.util.List;
import nh3.AbstractC26725a;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/models/QueryThreadsResult;", "", "threads", "", "Lio/getstream/chat/android/models/Thread;", "prev", "", "next", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getThreads", "()Ljava/util/List;", "getPrev", "()Ljava/lang/String;", "getNext", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryThreadsResult {
    private final String next;
    private final String prev;
    private final List<Thread> threads;

    public QueryThreadsResult(List<Thread> threads, String str, String str2) {
        AbstractC22676k.m65750j(threads, "threads");
        this.threads = threads;
        this.prev = str;
        this.next = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryThreadsResult copy$default(QueryThreadsResult queryThreadsResult, List list, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = queryThreadsResult.threads;
        }
        if ((i13 & 2) != 0) {
            str = queryThreadsResult.prev;
        }
        if ((i13 & 4) != 0) {
            str2 = queryThreadsResult.next;
        }
        return queryThreadsResult.copy(list, str, str2);
    }

    public final List<Thread> component1() {
        return this.threads;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPrev() {
        return this.prev;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    public final QueryThreadsResult copy(List<Thread> threads, String prev, String next) {
        AbstractC22676k.m65750j(threads, "threads");
        return new QueryThreadsResult(threads, prev, next);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryThreadsResult)) {
            return false;
        }
        QueryThreadsResult queryThreadsResult = (QueryThreadsResult) other;
        return AbstractC22676k.m65745e(this.threads, queryThreadsResult.threads) && AbstractC22676k.m65745e(this.prev, queryThreadsResult.prev) && AbstractC22676k.m65745e(this.next, queryThreadsResult.next);
    }

    public final String getNext() {
        return this.next;
    }

    public final String getPrev() {
        return this.prev;
    }

    public final List<Thread> getThreads() {
        return this.threads;
    }

    public int hashCode() {
        int iHashCode = this.threads.hashCode() * 31;
        String str = this.prev;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.next;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        List<Thread> list = this.threads;
        return AbstractC25012a.m73376i(this.next, ")", AbstractC26725a.m79507k("QueryThreadsResult(threads=", ", prev=", this.prev, ", next=", list));
    }
}
