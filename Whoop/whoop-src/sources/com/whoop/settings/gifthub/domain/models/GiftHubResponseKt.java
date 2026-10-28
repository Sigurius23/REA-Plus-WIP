package com.whoop.settings.gifthub.domain.models;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m65681d2 = {"toGiftHubStyle", "Lcom/whoop/settings/gifthub/domain/models/GiftHubStyle;", "", "settings_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class GiftHubResponseKt {
    /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
    public static final GiftHubStyle toGiftHubStyle(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        GiftHubStyle giftHubStyle = GiftHubStyle.DEFAULT;
        for (GiftHubStyle giftHubStyle2 : GiftHubStyle.values()) {
            if (AbstractC22676k.m65745e(giftHubStyle2.name(), str)) {
                if (giftHubStyle2 == null) {
                    return giftHubStyle;
                }
                return giftHubStyle2;
            }
        }
        giftHubStyle2 = null;
        if (giftHubStyle2 == null) {
            return giftHubStyle;
        }
        return giftHubStyle2;
    }
}
