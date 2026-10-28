package com.whoop.data.local.room.entity.converter;

import com.whoop.domain.model.teams.PrivacyType;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, m65681d2 = {"Lcom/whoop/data/local/room/entity/converter/PrivacyTypeConverter;", "", "<init>", "()V", "fromPrivacyType", "", "privacyType", "Lcom/whoop/domain/model/teams/PrivacyType;", "toPrivacyType", "value", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PrivacyTypeConverter {
    public final int fromPrivacyType(PrivacyType privacyType) {
        if (privacyType != null) {
            return privacyType.getValue();
        }
        return 0;
    }

    public final PrivacyType toPrivacyType(int value) {
        if (value == 0) {
            return PrivacyType.DETAIL;
        }
        if (value != 1) {
            return value != 2 ? PrivacyType.DETAIL : PrivacyType.HIDDEN;
        }
        return PrivacyType.SUMMARY;
    }
}
