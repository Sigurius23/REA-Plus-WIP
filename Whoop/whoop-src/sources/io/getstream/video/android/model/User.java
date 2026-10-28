package io.getstream.video.android.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.service.network.model.UserState;
import java.util.List;
import java.util.Map;
import jg3.C21682i;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import m83.C25271y;
import m83.C25272z;
import o53.C27590a;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yb3.AbstractC39414r;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0002QRB\u008d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012B\u0097\u0001\b\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u001e\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010'J\u0096\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001cJ\u0010\u0010-\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u00182\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101J(\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205HÁ\u0001¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b=\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\b?\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b@\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\bA\u0010\u001cR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010B\u001a\u0004\bC\u0010#R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\bE\u0010%R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010F\u0012\u0004\bH\u0010I\u001a\u0004\bG\u0010'R\"\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010F\u0012\u0004\bK\u0010I\u001a\u0004\bJ\u0010'R\"\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010F\u0012\u0004\bM\u0010I\u001a\u0004\bL\u0010'R\u0012\u0010O\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\bN\u0010\u001c¨\u0006S"}, m65681d2 = {"Lio/getstream/video/android/model/User;", "", "", "id", "role", "Lio/getstream/video/android/model/UserType;", "type", "name", "image", "", "teams", "", "custom", "Ljg3/i;", "createdAt", "updatedAt", "deletedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/UserType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljg3/i;Ljg3/i;Ljg3/i;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/UserType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljg3/i;Ljg3/i;Ljg3/i;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "isValid", "()Z", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lio/getstream/video/android/model/UserType;", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "()Ljava/util/Map;", "component8", "()Ljg3/i;", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/UserType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljg3/i;Ljg3/i;Ljg3/i;)Lio/getstream/video/android/model/User;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stream_video_android_core_release", "(Lio/getstream/video/android/model/User;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getRole", "Lio/getstream/video/android/model/UserType;", "getType", "getName", "getImage", "Ljava/util/List;", "getTeams", "Ljava/util/Map;", "getCustom", "Ljg3/i;", "getCreatedAt", "getCreatedAt$annotations", "()V", "getUpdatedAt", "getUpdatedAt$annotations", "getDeletedAt", "getDeletedAt$annotations", "getUserNameOrId", "userNameOrId", "Companion", "$serializer", "io/getstream/video/android/model/c", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class User {
    private static final InterfaceC37138c[] $childSerializers;
    public static final C19972c Companion = new C19972c();
    private final C21682i createdAt;
    private final Map<String, String> custom;
    private final C21682i deletedAt;
    private final String id;
    private final String image;
    private final String name;
    private final String role;
    private final List<String> teams;
    private final UserType type;
    private final C21682i updatedAt;

    static {
        InterfaceC37138c interfaceC37138cSerializer = UserType.Companion.serializer();
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new InterfaceC37138c[]{null, null, interfaceC37138cSerializer, null, null, new ArrayListSerializer(stringSerializer), new LinkedHashMapSerializer(stringSerializer, stringSerializer), null, null, null};
    }

    public User() {
        this((String) null, (String) null, (UserType) null, (String) null, (String) null, (List) null, (Map) null, (C21682i) null, (C21682i) null, (C21682i) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ User copy$default(User user, String str, String str2, UserType userType, String str3, String str4, List list, Map map, C21682i c21682i, C21682i c21682i2, C21682i c21682i3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = user.id;
        }
        if ((i13 & 2) != 0) {
            str2 = user.role;
        }
        if ((i13 & 4) != 0) {
            userType = user.type;
        }
        if ((i13 & 8) != 0) {
            str3 = user.name;
        }
        if ((i13 & 16) != 0) {
            str4 = user.image;
        }
        if ((i13 & 32) != 0) {
            list = user.teams;
        }
        if ((i13 & 64) != 0) {
            map = user.custom;
        }
        if ((i13 & 128) != 0) {
            c21682i = user.createdAt;
        }
        if ((i13 & 256) != 0) {
            c21682i2 = user.updatedAt;
        }
        if ((i13 & 512) != 0) {
            c21682i3 = user.deletedAt;
        }
        C21682i c21682i4 = c21682i2;
        C21682i c21682i5 = c21682i3;
        Map map2 = map;
        C21682i c21682i6 = c21682i;
        String str5 = str4;
        List list2 = list;
        return user.copy(str, str2, userType, str3, str5, list2, map2, c21682i6, c21682i4, c21682i5);
    }

    @InterfaceC37144i(with = C27590a.class)
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @InterfaceC37144i(with = C27590a.class)
    public static /* synthetic */ void getDeletedAt$annotations() {
    }

    @InterfaceC37144i(with = C27590a.class)
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$stream_video_android_core_release(User self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.id, "")) {
            output.encodeStringElement(serialDesc, 0, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.role, UserState.Sources.USER)) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.role);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.type, UserType.Authenticated.INSTANCE)) {
            output.encodeSerializableElement(serialDesc, 2, interfaceC37138cArr[2], self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.name != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.name);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.image != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.image);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.teams, C25271y.f99162w)) {
            output.encodeNullableSerializableElement(serialDesc, 5, interfaceC37138cArr[5], self.teams);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !AbstractC22676k.m65745e(self.custom, C25272z.f99163w)) {
            output.encodeNullableSerializableElement(serialDesc, 6, interfaceC37138cArr[6], self.custom);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.createdAt != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, C27590a.f111081a, self.createdAt);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.updatedAt != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, C27590a.f111081a, self.updatedAt);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.deletedAt == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, C27590a.f111081a, self.deletedAt);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final C21682i getDeletedAt() {
        return this.deletedAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UserType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final List<String> component6() {
        return this.teams;
    }

    public final Map<String, String> component7() {
        return this.custom;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final C21682i getUpdatedAt() {
        return this.updatedAt;
    }

    public final User copy(String id4, String role, UserType type, String name, String image, List<String> teams, Map<String, String> custom, C21682i createdAt, C21682i updatedAt, C21682i deletedAt) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        return new User(id4, role, type, name, image, teams, custom, createdAt, updatedAt, deletedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        User user = (User) other;
        return AbstractC22676k.m65745e(this.id, user.id) && AbstractC22676k.m65745e(this.role, user.role) && AbstractC22676k.m65745e(this.type, user.type) && AbstractC22676k.m65745e(this.name, user.name) && AbstractC22676k.m65745e(this.image, user.image) && AbstractC22676k.m65745e(this.teams, user.teams) && AbstractC22676k.m65745e(this.custom, user.custom) && AbstractC22676k.m65745e(this.createdAt, user.createdAt) && AbstractC22676k.m65745e(this.updatedAt, user.updatedAt) && AbstractC22676k.m65745e(this.deletedAt, user.deletedAt);
    }

    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    public final Map<String, String> getCustom() {
        return this.custom;
    }

    public final C21682i getDeletedAt() {
        return this.deletedAt;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRole() {
        return this.role;
    }

    public final List<String> getTeams() {
        return this.teams;
    }

    public final UserType getType() {
        return this.type;
    }

    public final C21682i getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUserNameOrId() {
        String name = getName();
        if (name == null || AbstractC39414r.m125890i0(name)) {
            name = null;
        }
        return name == null ? getId() : name;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.role;
        int iHashCode2 = (this.type.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.image;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.teams;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, String> map = this.custom;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        C21682i c21682i = this.createdAt;
        int iHashCode7 = (iHashCode6 + (c21682i == null ? 0 : c21682i.hashCode())) * 31;
        C21682i c21682i2 = this.updatedAt;
        int iHashCode8 = (iHashCode7 + (c21682i2 == null ? 0 : c21682i2.hashCode())) * 31;
        C21682i c21682i3 = this.deletedAt;
        return iHashCode8 + (c21682i3 != null ? c21682i3.hashCode() : 0);
    }

    public final boolean isValid() {
        return this.id.length() > 0;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.role;
        UserType userType = this.type;
        String str3 = this.name;
        String str4 = this.image;
        List<String> list = this.teams;
        Map<String, String> map = this.custom;
        C21682i c21682i = this.createdAt;
        C21682i c21682i2 = this.updatedAt;
        C21682i c21682i3 = this.deletedAt;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("User(id=", str, ", role=", str2, ", type=");
        sbM32001t.append(userType);
        sbM32001t.append(", name=");
        sbM32001t.append(str3);
        sbM32001t.append(", image=");
        AbstractC36095b.m114694v(str4, ", teams=", ", custom=", sbM32001t, list);
        sbM32001t.append(map);
        sbM32001t.append(", createdAt=");
        sbM32001t.append(c21682i);
        sbM32001t.append(", updatedAt=");
        sbM32001t.append(c21682i2);
        sbM32001t.append(", deletedAt=");
        sbM32001t.append(c21682i3);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @InterfaceC23457c
    public /* synthetic */ User(int i13, String str, String str2, UserType userType, String str3, String str4, List list, Map map, @InterfaceC37144i(with = C27590a.class) C21682i c21682i, @InterfaceC37144i(with = C27590a.class) C21682i c21682i2, @InterfaceC37144i(with = C27590a.class) C21682i c21682i3, SerializationConstructorMarker serializationConstructorMarker) {
        this.id = (i13 & 1) == 0 ? "" : str;
        if ((i13 & 2) == 0) {
            this.role = UserState.Sources.USER;
        } else {
            this.role = str2;
        }
        if ((i13 & 4) == 0) {
            this.type = UserType.Authenticated.INSTANCE;
        } else {
            this.type = userType;
        }
        if ((i13 & 8) == 0) {
            this.name = null;
        } else {
            this.name = str3;
        }
        if ((i13 & 16) == 0) {
            this.image = null;
        } else {
            this.image = str4;
        }
        if ((i13 & 32) == 0) {
            this.teams = C25271y.f99162w;
        } else {
            this.teams = list;
        }
        if ((i13 & 64) == 0) {
            this.custom = C25272z.f99163w;
        } else {
            this.custom = map;
        }
        if ((i13 & 128) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = c21682i;
        }
        if ((i13 & 256) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = c21682i2;
        }
        if ((i13 & 512) == 0) {
            this.deletedAt = null;
        } else {
            this.deletedAt = c21682i3;
        }
    }

    public User(String id4, String str, UserType type, String str2, String str3, List<String> list, Map<String, String> map, C21682i c21682i, C21682i c21682i2, C21682i c21682i3) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        this.id = id4;
        this.role = str;
        this.type = type;
        this.name = str2;
        this.image = str3;
        this.teams = list;
        this.custom = map;
        this.createdAt = c21682i;
        this.updatedAt = c21682i2;
        this.deletedAt = c21682i3;
    }

    public /* synthetic */ User(String str, String str2, UserType userType, String str3, String str4, List list, Map map, C21682i c21682i, C21682i c21682i2, C21682i c21682i3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? UserState.Sources.USER : str2, (i13 & 4) != 0 ? UserType.Authenticated.INSTANCE : userType, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? C25271y.f99162w : list, (i13 & 64) != 0 ? C25272z.f99163w : map, (i13 & 128) != 0 ? null : c21682i, (i13 & 256) != 0 ? null : c21682i2, (i13 & 512) != 0 ? null : c21682i3);
    }
}
