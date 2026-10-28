package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import java.util.List;
import jg3.C21682i;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\u0004\u0012\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJv\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\n\u001a\u00020\u00042\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b+\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b,\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b-\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b.\u0010\u0013R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u0010\u001aR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b1\u0010\u001a¨\u00062"}, m65681d2 = {"Lio/getstream/android/video/generated/models/SIPTrunkResponse;", "", "Ljg3/i;", "createdAt", "", "id", "name", "password", "updatedAt", "uri", "username", "", "allowedIps", "numbers", "<init>", "(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljg3/i;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/util/List;", "component9", "copy", "(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lio/getstream/android/video/generated/models/SIPTrunkResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljg3/i;", "getCreatedAt", "Ljava/lang/String;", "getId", "getName", "getPassword", "getUpdatedAt", "getUri", "getUsername", "Ljava/util/List;", "getAllowedIps", "getNumbers", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class SIPTrunkResponse {
    private final List<String> allowedIps;
    private final C21682i createdAt;
    private final String id;
    private final String name;
    private final List<String> numbers;
    private final String password;
    private final C21682i updatedAt;
    private final String uri;
    private final String username;

    public SIPTrunkResponse(@InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "id") String id4, @InterfaceC30731q(name = "name") String name, @InterfaceC30731q(name = "password") String password, @InterfaceC30731q(name = "updated_at") C21682i updatedAt, @InterfaceC30731q(name = "uri") String uri, @InterfaceC30731q(name = "username") String username, @InterfaceC30731q(name = "allowed_ips") List<String> allowedIps, @InterfaceC30731q(name = "numbers") List<String> numbers) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(password, "password");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(uri, "uri");
        AbstractC22676k.m65750j(username, "username");
        AbstractC22676k.m65750j(allowedIps, "allowedIps");
        AbstractC22676k.m65750j(numbers, "numbers");
        this.createdAt = createdAt;
        this.id = id4;
        this.name = name;
        this.password = password;
        this.updatedAt = updatedAt;
        this.uri = uri;
        this.username = username;
        this.allowedIps = allowedIps;
        this.numbers = numbers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SIPTrunkResponse copy$default(SIPTrunkResponse sIPTrunkResponse, C21682i c21682i, String str, String str2, String str3, C21682i c21682i2, String str4, String str5, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c21682i = sIPTrunkResponse.createdAt;
        }
        if ((i13 & 2) != 0) {
            str = sIPTrunkResponse.id;
        }
        if ((i13 & 4) != 0) {
            str2 = sIPTrunkResponse.name;
        }
        if ((i13 & 8) != 0) {
            str3 = sIPTrunkResponse.password;
        }
        if ((i13 & 16) != 0) {
            c21682i2 = sIPTrunkResponse.updatedAt;
        }
        if ((i13 & 32) != 0) {
            str4 = sIPTrunkResponse.uri;
        }
        if ((i13 & 64) != 0) {
            str5 = sIPTrunkResponse.username;
        }
        if ((i13 & 128) != 0) {
            list = sIPTrunkResponse.allowedIps;
        }
        if ((i13 & 256) != 0) {
            list2 = sIPTrunkResponse.numbers;
        }
        List list3 = list;
        List list4 = list2;
        String str6 = str4;
        String str7 = str5;
        C21682i c21682i3 = c21682i2;
        String str8 = str2;
        return sIPTrunkResponse.copy(c21682i, str, str8, str3, c21682i3, str6, str7, list3, list4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C21682i getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    public final List<String> component8() {
        return this.allowedIps;
    }

    public final List<String> component9() {
        return this.numbers;
    }

    public final SIPTrunkResponse copy(@InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "id") String id4, @InterfaceC30731q(name = "name") String name, @InterfaceC30731q(name = "password") String password, @InterfaceC30731q(name = "updated_at") C21682i updatedAt, @InterfaceC30731q(name = "uri") String uri, @InterfaceC30731q(name = "username") String username, @InterfaceC30731q(name = "allowed_ips") List<String> allowedIps, @InterfaceC30731q(name = "numbers") List<String> numbers) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(password, "password");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(uri, "uri");
        AbstractC22676k.m65750j(username, "username");
        AbstractC22676k.m65750j(allowedIps, "allowedIps");
        AbstractC22676k.m65750j(numbers, "numbers");
        return new SIPTrunkResponse(createdAt, id4, name, password, updatedAt, uri, username, allowedIps, numbers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SIPTrunkResponse)) {
            return false;
        }
        SIPTrunkResponse sIPTrunkResponse = (SIPTrunkResponse) other;
        return AbstractC22676k.m65745e(this.createdAt, sIPTrunkResponse.createdAt) && AbstractC22676k.m65745e(this.id, sIPTrunkResponse.id) && AbstractC22676k.m65745e(this.name, sIPTrunkResponse.name) && AbstractC22676k.m65745e(this.password, sIPTrunkResponse.password) && AbstractC22676k.m65745e(this.updatedAt, sIPTrunkResponse.updatedAt) && AbstractC22676k.m65745e(this.uri, sIPTrunkResponse.uri) && AbstractC22676k.m65745e(this.username, sIPTrunkResponse.username) && AbstractC22676k.m65745e(this.allowedIps, sIPTrunkResponse.allowedIps) && AbstractC22676k.m65745e(this.numbers, sIPTrunkResponse.numbers);
    }

    public final List<String> getAllowedIps() {
        return this.allowedIps;
    }

    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getNumbers() {
        return this.numbers;
    }

    public final String getPassword() {
        return this.password;
    }

    public final C21682i getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUri() {
        return this.uri;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return this.numbers.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC3855a.m11822f(this.updatedAt, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.createdAt.hashCode() * 31, 31, this.id), 31, this.name), 31, this.password), 31), 31, this.uri), 31, this.username), 31, this.allowedIps);
    }

    public String toString() {
        C21682i c21682i = this.createdAt;
        String str = this.id;
        String str2 = this.name;
        String str3 = this.password;
        C21682i c21682i2 = this.updatedAt;
        String str4 = this.uri;
        String str5 = this.username;
        List<String> list = this.allowedIps;
        List<String> list2 = this.numbers;
        StringBuilder sb4 = new StringBuilder("SIPTrunkResponse(createdAt=");
        sb4.append(c21682i);
        sb4.append(", id=");
        sb4.append(str);
        sb4.append(", name=");
        AbstractC11266d.m30444B(sb4, str2, ", password=", str3, ", updatedAt=");
        sb4.append(c21682i2);
        sb4.append(", uri=");
        sb4.append(str4);
        sb4.append(", username=");
        AbstractC36095b.m114694v(str5, ", allowedIps=", ", numbers=", sb4, list);
        return AbstractC3855a.m11829m(sb4, list2, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SIPTrunkResponse(C21682i c21682i, String str, String str2, String str3, C21682i c21682i2, String str4, String str5, List list, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 128;
        C25271y c25271y = C25271y.f99162w;
        this(c21682i, str, str2, str3, c21682i2, str4, str5, i14 != 0 ? c25271y : list, (i13 & 256) != 0 ? c25271y : list2);
    }
}
