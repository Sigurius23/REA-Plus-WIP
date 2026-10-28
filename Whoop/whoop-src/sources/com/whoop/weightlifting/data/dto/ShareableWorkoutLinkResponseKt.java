package com.whoop.weightlifting.data.dto;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qv2.C30660a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/ShareableWorkoutLinkResponse;", "Lqv2/a;", "toDomainModel", "(Lcom/whoop/weightlifting/data/dto/ShareableWorkoutLinkResponse;)Lqv2/a;", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ShareableWorkoutLinkResponseKt {
    public static final C30660a toDomainModel(ShareableWorkoutLinkResponse shareableWorkoutLinkResponse) {
        AbstractC22676k.m65750j(shareableWorkoutLinkResponse, "<this>");
        return new C30660a(shareableWorkoutLinkResponse.getUrl(), shareableWorkoutLinkResponse.getName());
    }
}
