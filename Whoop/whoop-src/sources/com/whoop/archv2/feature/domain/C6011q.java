package com.whoop.archv2.feature.domain;

import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.PermissionType;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.archv2.feature.domain.q */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/q;", "", "Lcom/whoop/whoopaction/domain/models/PermissionType;", "permission", "Lcom/whoop/navigation/models/GenericInteraction;", "onSuccess", "<init>", "(Lcom/whoop/whoopaction/domain/models/PermissionType;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whoopaction/domain/models/PermissionType;", "b", "()Lcom/whoop/whoopaction/domain/models/PermissionType;", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C6011q {

    /* JADX INFO: renamed from: c */
    public static final int f24008c = GenericInteraction.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final PermissionType permission;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final GenericInteraction onSuccess;

    public C6011q(PermissionType permission, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(permission, "permission");
        this.permission = permission;
        this.onSuccess = genericInteraction;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final GenericInteraction getOnSuccess() {
        return this.onSuccess;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PermissionType getPermission() {
        return this.permission;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C6011q)) {
            return false;
        }
        C6011q c6011q = (C6011q) other;
        return this.permission == c6011q.permission && AbstractC22676k.m65745e(this.onSuccess, c6011q.onSuccess);
    }

    public int hashCode() {
        int iHashCode = this.permission.hashCode() * 31;
        GenericInteraction genericInteraction = this.onSuccess;
        return iHashCode + (genericInteraction == null ? 0 : genericInteraction.hashCode());
    }

    public String toString() {
        return "PendingPermissionRequest(permission=" + this.permission + ", onSuccess=" + this.onSuccess + ")";
    }
}
