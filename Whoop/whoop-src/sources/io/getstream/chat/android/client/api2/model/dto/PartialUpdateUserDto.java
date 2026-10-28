package io.getstream.chat.android.client.api2.model.dto;

import c13.AbstractC3855a;
import java.util.List;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/PartialUpdateUserDto;", "", "id", "", "set", "", "unset", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getSet", "()Ljava/util/Map;", "getUnset", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class PartialUpdateUserDto {
    private final String id;
    private final Map<String, Object> set;
    private final List<String> unset;

    public PartialUpdateUserDto(String id4, Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        this.id = id4;
        this.set = set;
        this.unset = unset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PartialUpdateUserDto copy$default(PartialUpdateUserDto partialUpdateUserDto, String str, Map map, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = partialUpdateUserDto.id;
        }
        if ((i13 & 2) != 0) {
            map = partialUpdateUserDto.set;
        }
        if ((i13 & 4) != 0) {
            list = partialUpdateUserDto.unset;
        }
        return partialUpdateUserDto.copy(str, map, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final Map<String, Object> component2() {
        return this.set;
    }

    public final List<String> component3() {
        return this.unset;
    }

    public final PartialUpdateUserDto copy(String id4, Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return new PartialUpdateUserDto(id4, set, unset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartialUpdateUserDto)) {
            return false;
        }
        PartialUpdateUserDto partialUpdateUserDto = (PartialUpdateUserDto) other;
        return AbstractC22676k.m65745e(this.id, partialUpdateUserDto.id) && AbstractC22676k.m65745e(this.set, partialUpdateUserDto.set) && AbstractC22676k.m65745e(this.unset, partialUpdateUserDto.unset);
    }

    public final String getId() {
        return this.id;
    }

    public final Map<String, Object> getSet() {
        return this.set;
    }

    public final List<String> getUnset() {
        return this.unset;
    }

    public int hashCode() {
        return this.unset.hashCode() + AbstractC3855a.m11821e(this.set, this.id.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.id;
        Map<String, Object> map = this.set;
        return AbstractC3855a.m11829m(AbstractC36095b.m114686n("PartialUpdateUserDto(id=", str, ", set=", ", unset=", map), this.unset, ")");
    }
}
