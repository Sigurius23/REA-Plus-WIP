package io.ktor.http;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/ktor/http/UnsafeHeaderException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "ktor-http"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class UnsafeHeaderException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsafeHeaderException(String header) {
        super("Header(s) " + header + " are controlled by the engine and cannot be set explicitly");
        AbstractC22676k.m65750j(header, "header");
    }
}
