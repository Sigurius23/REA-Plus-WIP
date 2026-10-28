package com.whoop.domain.model;

import android.net.Uri;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m65681d2 = {"asUri", "Landroid/net/Uri;", "Lcom/whoop/domain/model/WhoopUri;", "essentials_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class WhoopUriKt {
    public static final Uri asUri(WhoopUri whoopUri) {
        AbstractC22676k.m65750j(whoopUri, "<this>");
        return ((AndroidUri) whoopUri).getUri();
    }
}
