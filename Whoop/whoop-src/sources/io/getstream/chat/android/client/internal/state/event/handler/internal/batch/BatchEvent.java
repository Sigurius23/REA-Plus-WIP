package io.getstream.chat.android.client.internal.state.event.handler.internal.batch;

import io.getstream.chat.android.client.events.ChatEvent;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;", "", "id", "", "sortedEvents", "", "Lio/getstream/chat/android/client/events/ChatEvent;", "isFromHistorySync", "", "<init>", "(ILjava/util/List;Z)V", "getId", "()I", "getSortedEvents", "()Ljava/util/List;", "()Z", "size", "getSize", "isFromSocketConnection", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class BatchEvent {
    private final int id;
    private final boolean isFromHistorySync;
    private final boolean isFromSocketConnection;
    private final int size;
    private final List<ChatEvent> sortedEvents;

    /* JADX WARN: Multi-variable type inference failed */
    public BatchEvent(int i13, List<? extends ChatEvent> sortedEvents, boolean z4) {
        AbstractC22676k.m65750j(sortedEvents, "sortedEvents");
        this.id = i13;
        this.sortedEvents = sortedEvents;
        this.isFromHistorySync = z4;
        this.size = sortedEvents.size();
        this.isFromSocketConnection = !z4;
    }

    public final int getId() {
        return this.id;
    }

    public final int getSize() {
        return this.size;
    }

    public final List<ChatEvent> getSortedEvents() {
        return this.sortedEvents;
    }

    /* JADX INFO: renamed from: isFromHistorySync, reason: from getter */
    public final boolean getIsFromHistorySync() {
        return this.isFromHistorySync;
    }

    /* JADX INFO: renamed from: isFromSocketConnection, reason: from getter */
    public final boolean getIsFromSocketConnection() {
        return this.isFromSocketConnection;
    }

    public /* synthetic */ BatchEvent(int i13, List list, boolean z4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? BatchEventKt.idGenerator.incrementAndGet() : i13, list, z4);
    }
}
