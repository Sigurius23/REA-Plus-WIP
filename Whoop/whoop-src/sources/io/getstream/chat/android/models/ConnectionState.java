package io.getstream.chat.android.models;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/models/ConnectionState;", "", "<init>", "()V", "Connected", "Connecting", "Offline", "Companion", "Lio/getstream/chat/android/models/ConnectionState$Connected;", "Lio/getstream/chat/android/models/ConnectionState$Connecting;", "Lio/getstream/chat/android/models/ConnectionState$Offline;", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class ConnectionState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<ConnectionState> values = AbstractC37056f.m118959K(Connected.INSTANCE, Connecting.INSTANCE, Offline.INSTANCE);

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/models/ConnectionState$Companion;", "", "<init>", "()V", "values", "", "Lio/getstream/chat/android/models/ConnectionState;", "getValues", "()Ljava/util/List;", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<ConnectionState> getValues() {
            return ConnectionState.values;
        }

        private Companion() {
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/models/ConnectionState$Connected;", "Lio/getstream/chat/android/models/ConnectionState;", "<init>", "()V", "toString", "", "equals", "", "other", "", "hashCode", "", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Connected extends ConnectionState {
        public static final Connected INSTANCE = new Connected();

        private Connected() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Connected);
        }

        public int hashCode() {
            return 931476351;
        }

        public String toString() {
            return "Connected";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/models/ConnectionState$Connecting;", "Lio/getstream/chat/android/models/ConnectionState;", "<init>", "()V", "toString", "", "equals", "", "other", "", "hashCode", "", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Connecting extends ConnectionState {
        public static final Connecting INSTANCE = new Connecting();

        private Connecting() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Connecting);
        }

        public int hashCode() {
            return -1188999934;
        }

        public String toString() {
            return "Connecting";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/models/ConnectionState$Offline;", "Lio/getstream/chat/android/models/ConnectionState;", "<init>", "()V", "toString", "", "equals", "", "other", "", "hashCode", "", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Offline extends ConnectionState {
        public static final Offline INSTANCE = new Offline();

        private Offline() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Offline);
        }

        public int hashCode() {
            return -1252068391;
        }

        public String toString() {
            return "Offline";
        }
    }

    public /* synthetic */ ConnectionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ConnectionState() {
    }
}
