package com.whoop.design.models.items;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"isVideo", "", "Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;", "(Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;)Z", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ArticleTileCarouselModelKt {
    public static final boolean isVideo(ArticleTileTypeDtoEnum articleTileTypeDtoEnum) {
        AbstractC22676k.m65750j(articleTileTypeDtoEnum, "<this>");
        return articleTileTypeDtoEnum == ArticleTileTypeDtoEnum.VIDEO || articleTileTypeDtoEnum == ArticleTileTypeDtoEnum.VIDEO_NO_OVERLAY;
    }
}
