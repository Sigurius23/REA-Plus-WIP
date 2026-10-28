package io.ktor.client.call;

import j63.AbstractC21387d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/ktor/client/call/UnsupportedContentTypeException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "ktor-client-core"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class UnsupportedContentTypeException extends IllegalStateException {
    public UnsupportedContentTypeException(AbstractC21387d abstractC21387d) {
        StringBuilder sb4 = new StringBuilder("Failed to write body: ");
        super(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, abstractC21387d.getClass(), sb4));
    }
}
