package io.ktor.http;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/ktor/http/IllegalHeaderNameException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "ktor-http"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class IllegalHeaderNameException extends IllegalArgumentException {
    public IllegalHeaderNameException(String headerName, int i13) {
        AbstractC22676k.m65750j(headerName, "headerName");
        StringBuilder sb4 = new StringBuilder("Header name '");
        sb4.append(headerName);
        sb4.append("' contains illegal character '");
        sb4.append(headerName.charAt(i13));
        sb4.append("' (code ");
        super(AbstractC11895b.m31999r(sb4, headerName.charAt(i13) & 255, ')'));
    }
}
