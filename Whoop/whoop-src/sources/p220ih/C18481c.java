package p220ih;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import mh.C25545m;
import p425qh.AbstractC30358d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ih.c */
/* JADX INFO: loaded from: classes.dex */
public final class C18481c implements InterfaceC18480b {
    @Override // p220ih.InterfaceC18480b
    /* JADX INFO: renamed from: a */
    public final String mo53321a(Object obj, C25545m c25545m) {
        Uri uri = (Uri) obj;
        if (!AbstractC22676k.m65745e(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(uri);
        sb4.append('-');
        Configuration configuration = c25545m.f100135a.getResources().getConfiguration();
        Bitmap.Config[] configArr = AbstractC30358d.f124548a;
        sb4.append(configuration.uiMode & 48);
        return sb4.toString();
    }
}
