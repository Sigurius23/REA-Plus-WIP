package t23;

import c13.AbstractC3855a;
import io.getstream.video.android.model.User;
import java.util.Map;
import jg3.C21682i;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t23.z1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33486z1 {

    /* JADX INFO: renamed from: a */
    public final User f139808a;

    /* JADX INFO: renamed from: b */
    public final Map f139809b;

    /* JADX INFO: renamed from: c */
    public final String f139810c;

    /* JADX INFO: renamed from: d */
    public final C21682i f139811d;

    /* JADX INFO: renamed from: e */
    public final C21682i f139812e;

    /* JADX INFO: renamed from: f */
    public final C21682i f139813f;

    public C33486z1(User user, Map custom, String str, C21682i createdAt, C21682i updatedAt, C21682i c21682i, int i13) {
        c21682i = (i13 & 32) != 0 ? null : c21682i;
        AbstractC22676k.m65750j(custom, "custom");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        this.f139808a = user;
        this.f139809b = custom;
        this.f139810c = str;
        this.f139811d = createdAt;
        this.f139812e = updatedAt;
        this.f139813f = c21682i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33486z1)) {
            return false;
        }
        C33486z1 c33486z1 = (C33486z1) obj;
        return this.f139808a.equals(c33486z1.f139808a) && AbstractC22676k.m65745e(this.f139809b, c33486z1.f139809b) && AbstractC22676k.m65745e(this.f139810c, c33486z1.f139810c) && AbstractC22676k.m65745e(this.f139811d, c33486z1.f139811d) && AbstractC22676k.m65745e(this.f139812e, c33486z1.f139812e) && AbstractC22676k.m65745e(this.f139813f, c33486z1.f139813f);
    }

    public final int hashCode() {
        int iM11821e = AbstractC3855a.m11821e(this.f139809b, this.f139808a.hashCode() * 31, 31);
        String str = this.f139810c;
        int iM11822f = AbstractC3855a.m11822f(this.f139812e, AbstractC3855a.m11822f(this.f139811d, (iM11821e + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        C21682i c21682i = this.f139813f;
        return (iM11822f + (c21682i != null ? c21682i.hashCode() : 0)) * 961;
    }

    public final String toString() {
        return "MemberState(user=" + this.f139808a + ", custom=" + this.f139809b + ", role=" + this.f139810c + ", createdAt=" + this.f139811d + ", updatedAt=" + this.f139812e + ", deletedAt=" + this.f139813f + ", acceptedAt=null, rejectedAt=null)";
    }
}
