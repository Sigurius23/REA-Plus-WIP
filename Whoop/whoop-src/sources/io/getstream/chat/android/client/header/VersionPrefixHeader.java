package io.getstream.chat.android.client.header;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/client/header/VersionPrefixHeader;", "", "<init>", "()V", "prefix", "", "getPrefix", "()Ljava/lang/String;", "Default", "UiComponents", "Compose", "Lio/getstream/chat/android/client/header/VersionPrefixHeader$Compose;", "Lio/getstream/chat/android/client/header/VersionPrefixHeader$Default;", "Lio/getstream/chat/android/client/header/VersionPrefixHeader$UiComponents;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class VersionPrefixHeader {

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/client/header/VersionPrefixHeader$Compose;", "Lio/getstream/chat/android/client/header/VersionPrefixHeader;", "<init>", "()V", "prefix", "", "getPrefix", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Compose extends VersionPrefixHeader {
        public static final Compose INSTANCE = new Compose();
        private static final String prefix = "stream-chat-android-compose-";

        private Compose() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof Compose);
        }

        @Override // io.getstream.chat.android.client.header.VersionPrefixHeader
        public final String getPrefix() {
            return prefix;
        }

        public final int hashCode() {
            return -2042502968;
        }

        public final String toString() {
            return "Compose";
        }
    }

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/client/header/VersionPrefixHeader$Default;", "Lio/getstream/chat/android/client/header/VersionPrefixHeader;", "<init>", "()V", "prefix", "", "getPrefix", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Default extends VersionPrefixHeader {
        public static final Default INSTANCE = new Default();
        private static final String prefix = "stream-chat-android-";

        private Default() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof Default);
        }

        @Override // io.getstream.chat.android.client.header.VersionPrefixHeader
        public final String getPrefix() {
            return prefix;
        }

        public final int hashCode() {
            return -1448196745;
        }

        public final String toString() {
            return "Default";
        }
    }

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/client/header/VersionPrefixHeader$UiComponents;", "Lio/getstream/chat/android/client/header/VersionPrefixHeader;", "<init>", "()V", "prefix", "", "getPrefix", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class UiComponents extends VersionPrefixHeader {
        public static final UiComponents INSTANCE = new UiComponents();
        private static final String prefix = "stream-chat-android-ui-components-";

        private UiComponents() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof UiComponents);
        }

        @Override // io.getstream.chat.android.client.header.VersionPrefixHeader
        public final String getPrefix() {
            return prefix;
        }

        public final int hashCode() {
            return -623057068;
        }

        public final String toString() {
            return "UiComponents";
        }
    }

    private VersionPrefixHeader() {
    }

    public abstract String getPrefix();

    public VersionPrefixHeader(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
