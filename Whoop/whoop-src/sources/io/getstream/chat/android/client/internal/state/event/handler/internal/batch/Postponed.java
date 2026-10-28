package io.getstream.chat.android.client.internal.state.event.handler.internal.batch;

import androidx.core.app.NotificationCompat;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.events.ChatEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u0000 %2\u00020\u0001:\u0001%B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0012\"\u000e\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR$\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\t0\u001bj\b\u0012\u0004\u0012\u00020\t`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006&"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;", "", "Lkotlin/Function0;", "", "now", "<init>", "(Lc93/a;)V", "collectionTime", "()J", "Lio/getstream/chat/android/client/events/ChatEvent;", NotificationCompat.CATEGORY_EVENT, "", "add", "(Lio/getstream/chat/android/client/events/ChatEvent;)Z", "", "R", "Lkotlin/Function1;", "predicate", "", "sortedBy", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "isEmpty", "()Z", "Ll83/a0;", "clear", "()V", "Lc93/a;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "events", "Ljava/util/ArrayList;", "collectStartTime", "J", "", "getSize", "()I", "size", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class Postponed {
    private static final Companion Companion = new Companion();
    private static final long ZERO = 0;
    private long collectStartTime;
    private final ArrayList<ChatEvent> events;
    private final InterfaceC4339a now;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed$Companion;", "", "<init>", "()V", "ZERO", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public Postponed(InterfaceC4339a now) {
        AbstractC22676k.m65750j(now, "now");
        this.now = now;
        this.events = new ArrayList<>();
    }

    public final boolean add(ChatEvent event) {
        AbstractC22676k.m65750j(event, "event");
        if (this.events.isEmpty()) {
            this.collectStartTime = ((Number) this.now.invoke()).longValue();
        }
        return this.events.add(event);
    }

    public final void clear() {
        this.events.clear();
        this.collectStartTime = 0L;
    }

    public final long collectionTime() {
        long j7 = this.collectStartTime;
        if (j7 == 0) {
            return 0L;
        }
        return ((Number) this.now.invoke()).longValue() - j7;
    }

    public final int getSize() {
        return this.events.size();
    }

    public final boolean isEmpty() {
        return this.events.isEmpty();
    }

    public final <R extends Comparable<? super R>> List<ChatEvent> sortedBy(final Function1 predicate) {
        AbstractC22676k.m65750j(predicate, "predicate");
        return AbstractC25265s.m74152u1(this.events, new Comparator() { // from class: io.getstream.chat.android.client.internal.state.event.handler.internal.batch.Postponed$sortedBy$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t14, T t15) {
                Function1 function1 = predicate;
                return AbstractC30060g.m92127q((Comparable) function1.invoke(t14), (Comparable) function1.invoke(t15));
            }
        });
    }
}
