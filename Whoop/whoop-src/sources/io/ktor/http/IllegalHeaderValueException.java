package io.ktor.http;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/ktor/http/IllegalHeaderValueException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "ktor-http"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class IllegalHeaderValueException extends IllegalArgumentException {
    public IllegalHeaderValueException(String headerValue, int i13) {
        AbstractC22676k.m65750j(headerValue, "headerValue");
        StringBuilder sb4 = new StringBuilder("Header value '");
        sb4.append(headerValue);
        sb4.append("' contains illegal character '");
        sb4.append(headerValue.charAt(i13));
        sb4.append("' (code ");
        super(AbstractC11895b.m31999r(sb4, headerValue.charAt(i13) & 255, ')'));
    }
}
