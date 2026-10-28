package io.getstream.chat.android.models;

import java.util.Map;
import m83.C25272z;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/models/MemberData;", "Lio/getstream/chat/android/models/CustomObject;", "userId", "", "extraData", "", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getUserId", "()Ljava/lang/String;", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MemberData implements CustomObject {
    private final Map<String, Object> extraData;
    private final String userId;

    public MemberData(String userId, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.userId = userId;
        this.extraData = extraData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MemberData copy$default(MemberData memberData, String str, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = memberData.userId;
        }
        if ((i13 & 2) != 0) {
            map = memberData.extraData;
        }
        return memberData.copy(str, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final Map<String, Object> component2() {
        return this.extraData;
    }

    public final MemberData copy(String userId, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new MemberData(userId, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemberData)) {
            return false;
        }
        MemberData memberData = (MemberData) other;
        return AbstractC22676k.m65745e(this.userId, memberData.userId) && AbstractC22676k.m65745e(this.extraData, memberData.extraData);
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public Map<String, Object> getExtraData() {
        return this.extraData;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public <T> T getExtraValue(String str, T t14) {
        return (T) super.getExtraValue(str, t14);
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.extraData.hashCode() + (this.userId.hashCode() * 31);
    }

    public String toString() {
        return AbstractC36095b.m114680h("MemberData(userId=", this.userId, ", extraData=", ")", this.extraData);
    }

    public /* synthetic */ MemberData(String str, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? C25272z.f99163w : map);
    }
}
