package io.getstream.chat.android.client.api.event;

import io.getstream.chat.android.models.Channel;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/client/api/event/EventHandlingResult;", "", "<init>", "()V", "Add", "WatchAndAdd", "Remove", "Skip", "Lio/getstream/chat/android/client/api/event/EventHandlingResult$Add;", "Lio/getstream/chat/android/client/api/event/EventHandlingResult$Remove;", "Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;", "Lio/getstream/chat/android/client/api/event/EventHandlingResult$WatchAndAdd;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class EventHandlingResult {

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/api/event/EventHandlingResult$Add;", "Lio/getstream/chat/android/client/api/event/EventHandlingResult;", "channel", "Lio/getstream/chat/android/models/Channel;", "<init>", "(Lio/getstream/chat/android/models/Channel;)V", "getChannel", "()Lio/getstream/chat/android/models/Channel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Add extends EventHandlingResult {
        private final Channel channel;

        public Add(Channel channel) {
            AbstractC22676k.m65750j(channel, "channel");
            this.channel = channel;
        }

        public static /* synthetic */ Add copy$default(Add add, Channel channel, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                channel = add.channel;
            }
            return add.copy(channel);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Channel getChannel() {
            return this.channel;
        }

        public final Add copy(Channel channel) {
            AbstractC22676k.m65750j(channel, "channel");
            return new Add(channel);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Add) && AbstractC22676k.m65745e(this.channel, ((Add) other).channel);
        }

        public final Channel getChannel() {
            return this.channel;
        }

        public final int hashCode() {
            return this.channel.hashCode();
        }

        public final String toString() {
            return "Add(channel=" + this.channel + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/client/api/event/EventHandlingResult$Remove;", "Lio/getstream/chat/android/client/api/event/EventHandlingResult;", "cid", "", "<init>", "(Ljava/lang/String;)V", "getCid", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Remove extends EventHandlingResult {
        private final String cid;

        public Remove(String cid) {
            AbstractC22676k.m65750j(cid, "cid");
            this.cid = cid;
        }

        public static /* synthetic */ Remove copy$default(Remove remove, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = remove.cid;
            }
            return remove.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCid() {
            return this.cid;
        }

        public final Remove copy(String cid) {
            AbstractC22676k.m65750j(cid, "cid");
            return new Remove(cid);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Remove) && AbstractC22676k.m65745e(this.cid, ((Remove) other).cid);
        }

        public final String getCid() {
            return this.cid;
        }

        public final int hashCode() {
            return this.cid.hashCode();
        }

        public final String toString() {
            return AbstractC11895b.m31996o("Remove(cid=", this.cid, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/api/event/EventHandlingResult$Skip;", "Lio/getstream/chat/android/client/api/event/EventHandlingResult;", "<init>", "()V", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Skip extends EventHandlingResult {
        public static final Skip INSTANCE = new Skip();

        private Skip() {
        }

        public final String toString() {
            return "Skip";
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/client/api/event/EventHandlingResult$WatchAndAdd;", "Lio/getstream/chat/android/client/api/event/EventHandlingResult;", "cid", "", "<init>", "(Ljava/lang/String;)V", "getCid", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class WatchAndAdd extends EventHandlingResult {
        private final String cid;

        public WatchAndAdd(String cid) {
            AbstractC22676k.m65750j(cid, "cid");
            this.cid = cid;
        }

        public static /* synthetic */ WatchAndAdd copy$default(WatchAndAdd watchAndAdd, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = watchAndAdd.cid;
            }
            return watchAndAdd.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCid() {
            return this.cid;
        }

        public final WatchAndAdd copy(String cid) {
            AbstractC22676k.m65750j(cid, "cid");
            return new WatchAndAdd(cid);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WatchAndAdd) && AbstractC22676k.m65745e(this.cid, ((WatchAndAdd) other).cid);
        }

        public final String getCid() {
            return this.cid;
        }

        public final int hashCode() {
            return this.cid.hashCode();
        }

        public final String toString() {
            return AbstractC11895b.m31996o("WatchAndAdd(cid=", this.cid, ")");
        }
    }

    private EventHandlingResult() {
    }

    public EventHandlingResult(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
