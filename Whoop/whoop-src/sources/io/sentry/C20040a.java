package io.sentry;

import com.iterable.iterableapi.CallableC5355n1;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import io.sentry.protocol.C20485j0;

/* JADX INFO: renamed from: io.sentry.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C20040a {

    /* JADX INFO: renamed from: a */
    public final byte[] f75184a;

    /* JADX INFO: renamed from: b */
    public final C20485j0 f75185b;

    /* JADX INFO: renamed from: c */
    public final CallableC5355n1 f75186c;

    /* JADX INFO: renamed from: d */
    public final String f75187d;

    /* JADX INFO: renamed from: e */
    public final String f75188e;

    /* JADX INFO: renamed from: f */
    public final String f75189f;

    public C20040a(String str, String str2, String str3, byte[] bArr) {
        this.f75184a = bArr;
        this.f75185b = null;
        this.f75186c = null;
        this.f75187d = str;
        this.f75188e = str2;
        this.f75189f = str3;
    }

    /* JADX INFO: renamed from: a */
    public static C20040a m55880a(CallableC5355n1 callableC5355n1) {
        return new C20040a(callableC5355n1);
    }

    /* JADX INFO: renamed from: b */
    public static C20040a m55881b(byte[] bArr) {
        return new C20040a("thread-dump.txt", MimeType.MIME_TYPE_TXT, "event.attachment", bArr);
    }

    /* JADX INFO: renamed from: c */
    public static C20040a m55882c(C20485j0 c20485j0) {
        return new C20040a(c20485j0);
    }

    /* JADX INFO: renamed from: d */
    public final String m55883d() {
        return this.f75189f;
    }

    /* JADX INFO: renamed from: e */
    public final String m55884e() {
        return this.f75188e;
    }

    /* JADX INFO: renamed from: f */
    public final String m55885f() {
        return this.f75187d;
    }

    public C20040a(C20485j0 c20485j0) {
        this.f75184a = null;
        this.f75185b = c20485j0;
        this.f75186c = null;
        this.f75187d = "view-hierarchy.json";
        this.f75188e = "application/json";
        this.f75189f = "event.view_hierarchy";
    }

    public C20040a(CallableC5355n1 callableC5355n1) {
        this.f75184a = null;
        this.f75185b = null;
        this.f75186c = callableC5355n1;
        this.f75187d = "screenshot.png";
        this.f75188e = "image/png";
        this.f75189f = "event.attachment";
    }
}
