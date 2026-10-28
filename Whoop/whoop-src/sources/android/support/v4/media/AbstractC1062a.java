package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: renamed from: android.support.v4.media.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1062a {
    /* JADX INFO: renamed from: a */
    public static MediaDescription m3135a(MediaDescription.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: b */
    public static MediaDescription.Builder m3136b() {
        return new MediaDescription.Builder();
    }

    /* JADX INFO: renamed from: c */
    public static CharSequence m3137c(MediaDescription mediaDescription) {
        return mediaDescription.getDescription();
    }

    /* JADX INFO: renamed from: d */
    public static Bundle m3138d(MediaDescription mediaDescription) {
        return mediaDescription.getExtras();
    }

    /* JADX INFO: renamed from: e */
    public static Bitmap m3139e(MediaDescription mediaDescription) {
        return mediaDescription.getIconBitmap();
    }

    /* JADX INFO: renamed from: f */
    public static Uri m3140f(MediaDescription mediaDescription) {
        return mediaDescription.getIconUri();
    }

    /* JADX INFO: renamed from: g */
    public static String m3141g(MediaDescription mediaDescription) {
        return mediaDescription.getMediaId();
    }

    /* JADX INFO: renamed from: h */
    public static CharSequence m3142h(MediaDescription mediaDescription) {
        return mediaDescription.getSubtitle();
    }

    /* JADX INFO: renamed from: i */
    public static CharSequence m3143i(MediaDescription mediaDescription) {
        return mediaDescription.getTitle();
    }

    /* JADX INFO: renamed from: j */
    public static void m3144j(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    /* JADX INFO: renamed from: k */
    public static void m3145k(MediaDescription.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* JADX INFO: renamed from: l */
    public static void m3146l(MediaDescription.Builder builder, Bitmap bitmap) {
        builder.setIconBitmap(bitmap);
    }

    /* JADX INFO: renamed from: m */
    public static void m3147m(MediaDescription.Builder builder, Uri uri) {
        builder.setIconUri(uri);
    }

    /* JADX INFO: renamed from: n */
    public static void m3148n(MediaDescription.Builder builder, String str) {
        builder.setMediaId(str);
    }

    /* JADX INFO: renamed from: o */
    public static void m3149o(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    /* JADX INFO: renamed from: p */
    public static void m3150p(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }
}
