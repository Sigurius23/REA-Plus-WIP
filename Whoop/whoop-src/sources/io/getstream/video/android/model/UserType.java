package io.getstream.video.android.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import o53.C27592c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0004\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0003\u0016\u0017\u0018¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/video/android/model/UserType;", "", "<init>", "()V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lio/getstream/video/android/model/UserType;Lzc3/c;Lyc3/g;)V", "Companion", "Anonymous", "Authenticated", "o53/c", "Guest", "Lio/getstream/video/android/model/UserType$Anonymous;", "Lio/getstream/video/android/model/UserType$Authenticated;", "Lio/getstream/video/android/model/UserType$Guest;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
@InterfaceC37144i
public abstract class UserType {
    public static final C27592c Companion = new C27592c();
    private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, C19976g.f74948w);

    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u000fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/video/android/model/UserType$Anonymous;", "Lio/getstream/video/android/model/UserType;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwc3/c;", "serializer", "()Lwc3/c;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class Anonymous extends UserType {
        public static final Anonymous INSTANCE = new Anonymous();
        private static final /* synthetic */ InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, C19974e.f74946w);

        private Anonymous() {
            super(null);
        }

        private final /* synthetic */ InterfaceC37138c get$cachedSerializer() {
            return (InterfaceC37138c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Anonymous);
        }

        public int hashCode() {
            return 28936795;
        }

        public final InterfaceC37138c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Anonymous";
        }
    }

    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u000fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/video/android/model/UserType$Authenticated;", "Lio/getstream/video/android/model/UserType;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwc3/c;", "serializer", "()Lwc3/c;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class Authenticated extends UserType {
        public static final Authenticated INSTANCE = new Authenticated();
        private static final /* synthetic */ InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, C19975f.f74947w);

        private Authenticated() {
            super(null);
        }

        private final /* synthetic */ InterfaceC37138c get$cachedSerializer() {
            return (InterfaceC37138c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Authenticated);
        }

        public int hashCode() {
            return 1163600669;
        }

        public final InterfaceC37138c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Authenticated";
        }
    }

    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u000fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/video/android/model/UserType$Guest;", "Lio/getstream/video/android/model/UserType;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwc3/c;", "serializer", "()Lwc3/c;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class Guest extends UserType {
        public static final Guest INSTANCE = new Guest();
        private static final /* synthetic */ InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, C19977h.f74949w);

        private Guest() {
            super(null);
        }

        private final /* synthetic */ InterfaceC37138c get$cachedSerializer() {
            return (InterfaceC37138c) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Guest);
        }

        public int hashCode() {
            return -1771345210;
        }

        public final InterfaceC37138c serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Guest";
        }
    }

    public /* synthetic */ UserType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ void write$Self(UserType self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
    }

    private UserType() {
    }

    @InterfaceC23457c
    public /* synthetic */ UserType(int i13, SerializationConstructorMarker serializationConstructorMarker) {
    }
}
