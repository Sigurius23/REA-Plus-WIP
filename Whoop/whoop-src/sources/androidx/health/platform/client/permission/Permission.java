package androidx.health.platform.client.permission;

import android.os.Parcelable;
import androidx.health.platform.client.proto.AbstractC1433a;
import androidx.health.platform.client.proto.C1545w1;
import p023ay.C2125b;
import p575w7.AbstractC36868a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/health/platform/client/permission/Permission;", "Lw7/a;", "Landroidx/health/platform/client/proto/w1;", "connect-client_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public final class Permission extends AbstractC36868a {
    public static final Parcelable.Creator<Permission> CREATOR = new C2125b(22);

    /* JADX INFO: renamed from: x */
    public final C1545w1 f6011x;

    public Permission(C1545w1 proto) {
        AbstractC22676k.m65750j(proto, "proto");
        this.f6011x = proto;
    }

    @Override // p575w7.AbstractC36868a
    /* JADX INFO: renamed from: b */
    public final AbstractC1433a mo4557b() {
        return this.f6011x;
    }
}
