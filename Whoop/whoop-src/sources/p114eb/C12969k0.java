package p114eb;

import android.content.Intent;
import android.net.Uri;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: eb.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12969k0 {

    /* JADX INFO: renamed from: a */
    public final Uri f44793a;

    /* JADX INFO: renamed from: b */
    public final String f44794b;

    /* JADX INFO: renamed from: c */
    public final String f44795c;

    public C12969k0(Uri uri, String str, String str2) {
        this.f44793a = uri;
        this.f44794b = str;
        this.f44795c = str2;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("NavDeepLinkRequest{");
        Uri uri = this.f44793a;
        if (uri != null) {
            sb4.append(" uri=");
            sb4.append(String.valueOf(uri));
        }
        String str = this.f44794b;
        if (str != null) {
            sb4.append(" action=");
            sb4.append(str);
        }
        String str2 = this.f44795c;
        if (str2 != null) {
            sb4.append(" mimetype=");
            sb4.append(str2);
        }
        sb4.append(" }");
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "sb.toString()");
        return string;
    }

    public C12969k0(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
    }
}
