package com.whoop.domain.model;

import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m65681d2 = {"withUpdatedAvatarUrl", "Lcom/whoop/domain/model/User;", "avatarUrl", "", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class UserKt {
    public static final User withUpdatedAvatarUrl(User user, String avatarUrl) {
        AbstractC22676k.m65750j(user, "<this>");
        AbstractC22676k.m65750j(avatarUrl, "avatarUrl");
        return user.copy((32511 & 1) != 0 ? user.id : 0, (32511 & 2) != 0 ? user.createdAt : null, (32511 & 4) != 0 ? user.firstName : null, (32511 & 8) != 0 ? user.lastName : null, (32511 & 16) != 0 ? user.fullName : null, (32511 & 32) != 0 ? user.emailAddress : null, (32511 & 64) != 0 ? user.password : null, (32511 & 128) != 0 ? user.username : null, (32511 & 256) != 0 ? user.avatarUrl : avatarUrl, (32511 & 512) != 0 ? user.city : null, (32511 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? user.adminDivision : null, (32511 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? user.country : null, (32511 & 4096) != 0 ? user.profile : null, (32511 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? user.concealed : null, (32511 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? user.age : 0);
    }
}
