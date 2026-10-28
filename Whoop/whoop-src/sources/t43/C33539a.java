package t43;

import c13.AbstractC3855a;
import io.getstream.android.video.generated.models.PermissionRequestEvent;
import io.getstream.video.android.model.User;
import java.util.List;
import jg3.C21682i;
import p088dc.AbstractC11895b;
import p550vd.AbstractC35903f;
import p715kotlin.jvm.internal.AbstractC22676k;
import t23.C33368c0;

/* JADX INFO: renamed from: t43.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C33539a {

    /* JADX INFO: renamed from: a */
    public final C33368c0 f139998a;

    /* JADX INFO: renamed from: b */
    public final User f139999b;

    /* JADX INFO: renamed from: c */
    public final C21682i f140000c;

    /* JADX INFO: renamed from: d */
    public final List f140001d;

    public C33539a(C33368c0 c33368c0, PermissionRequestEvent event) {
        AbstractC22676k.m65750j(event, "event");
        User userM114002V = AbstractC35903f.m114002V(event.getUser());
        C21682i createdAt = event.getCreatedAt();
        List<String> permissions = event.getPermissions();
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(permissions, "permissions");
        this.f139998a = c33368c0;
        this.f139999b = userM114002V;
        this.f140000c = createdAt;
        this.f140001d = permissions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33539a)) {
            return false;
        }
        C33539a c33539a = (C33539a) obj;
        return AbstractC22676k.m65745e(this.f139998a, c33539a.f139998a) && AbstractC22676k.m65745e(this.f139999b, c33539a.f139999b) && AbstractC22676k.m65745e(this.f140000c, c33539a.f140000c) && AbstractC22676k.m65745e(this.f140001d, c33539a.f140001d);
    }

    public final int hashCode() {
        return AbstractC11895b.m31983b(AbstractC3855a.m11822f(this.f140000c, (this.f139999b.hashCode() + (this.f139998a.hashCode() * 31)) * 31, 31), 961, this.f140001d);
    }

    public final String toString() {
        return "PermissionRequest(call=" + this.f139998a + ", user=" + this.f139999b + ", createdAt=" + this.f140000c + ", permissions=" + this.f140001d + ", grantedAt=null, rejectedAt=null)";
    }
}
