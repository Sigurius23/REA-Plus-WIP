package io.getstream.chat.android.client.api.state;

import io.getstream.chat.android.models.Channel;
import java.util.List;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/client/api/state/ChannelsStateData;", "", "<init>", "()V", "NoQueryActive", "Loading", "OfflineNoResults", "Result", "Lio/getstream/chat/android/client/api/state/ChannelsStateData$Loading;", "Lio/getstream/chat/android/client/api/state/ChannelsStateData$NoQueryActive;", "Lio/getstream/chat/android/client/api/state/ChannelsStateData$OfflineNoResults;", "Lio/getstream/chat/android/client/api/state/ChannelsStateData$Result;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class ChannelsStateData {

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/api/state/ChannelsStateData$Loading;", "Lio/getstream/chat/android/client/api/state/ChannelsStateData;", "<init>", "()V", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Loading extends ChannelsStateData {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public final String toString() {
            return "ChannelsStateData.Loading";
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/api/state/ChannelsStateData$NoQueryActive;", "Lio/getstream/chat/android/client/api/state/ChannelsStateData;", "<init>", "()V", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class NoQueryActive extends ChannelsStateData {
        public static final NoQueryActive INSTANCE = new NoQueryActive();

        private NoQueryActive() {
        }

        public final String toString() {
            return "ChannelsStateData.NoQueryActive";
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/api/state/ChannelsStateData$OfflineNoResults;", "Lio/getstream/chat/android/client/api/state/ChannelsStateData;", "<init>", "()V", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class OfflineNoResults extends ChannelsStateData {
        public static final OfflineNoResults INSTANCE = new OfflineNoResults();

        private OfflineNoResults() {
        }

        public final String toString() {
            return "ChannelsStateData.OfflineNoResults";
        }
    }

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/client/api/state/ChannelsStateData$Result;", "Lio/getstream/chat/android/client/api/state/ChannelsStateData;", "channels", "", "Lio/getstream/chat/android/models/Channel;", "<init>", "(Ljava/util/List;)V", "getChannels", "()Ljava/util/List;", "toString", "", "component1", "copy", "equals", "", "other", "", "hashCode", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Result extends ChannelsStateData {
        private final List<Channel> channels;

        public Result(List<Channel> channels) {
            AbstractC22676k.m65750j(channels, "channels");
            this.channels = channels;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Result copy$default(Result result, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = result.channels;
            }
            return result.copy(list);
        }

        public final List<Channel> component1() {
            return this.channels;
        }

        public final Result copy(List<Channel> channels) {
            AbstractC22676k.m65750j(channels, "channels");
            return new Result(channels);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && AbstractC22676k.m65745e(this.channels, ((Result) other).channels);
        }

        public final List<Channel> getChannels() {
            return this.channels;
        }

        public final int hashCode() {
            return this.channels.hashCode();
        }

        public final String toString() {
            return AbstractC2875y.m8296i(this.channels.size(), "ChannelsStateData.Result(channels.size=", ")");
        }
    }

    private ChannelsStateData() {
    }

    public ChannelsStateData(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
