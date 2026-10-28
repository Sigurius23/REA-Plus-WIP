package com.whoop.service.network.model.cycles;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/service/network/model/cycles/PostWorkoutMetadata;", "", "additionalMetadata", "Lcom/whoop/service/network/model/cycles/PostWorkoutAdditionalMetadata;", "<init>", "(Lcom/whoop/service/network/model/cycles/PostWorkoutAdditionalMetadata;)V", "getAdditionalMetadata", "()Lcom/whoop/service/network/model/cycles/PostWorkoutAdditionalMetadata;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class PostWorkoutMetadata {
    private final PostWorkoutAdditionalMetadata additionalMetadata;

    public PostWorkoutMetadata(PostWorkoutAdditionalMetadata additionalMetadata) {
        AbstractC22676k.m65750j(additionalMetadata, "additionalMetadata");
        this.additionalMetadata = additionalMetadata;
    }

    public static /* synthetic */ PostWorkoutMetadata copy$default(PostWorkoutMetadata postWorkoutMetadata, PostWorkoutAdditionalMetadata postWorkoutAdditionalMetadata, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            postWorkoutAdditionalMetadata = postWorkoutMetadata.additionalMetadata;
        }
        return postWorkoutMetadata.copy(postWorkoutAdditionalMetadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PostWorkoutAdditionalMetadata getAdditionalMetadata() {
        return this.additionalMetadata;
    }

    public final PostWorkoutMetadata copy(PostWorkoutAdditionalMetadata additionalMetadata) {
        AbstractC22676k.m65750j(additionalMetadata, "additionalMetadata");
        return new PostWorkoutMetadata(additionalMetadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PostWorkoutMetadata) && AbstractC22676k.m65745e(this.additionalMetadata, ((PostWorkoutMetadata) other).additionalMetadata);
    }

    public final PostWorkoutAdditionalMetadata getAdditionalMetadata() {
        return this.additionalMetadata;
    }

    public int hashCode() {
        return this.additionalMetadata.hashCode();
    }

    public String toString() {
        return "PostWorkoutMetadata(additionalMetadata=" + this.additionalMetadata + ")";
    }
}
