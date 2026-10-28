package android.support.v4.media;

import android.media.Rating;

/* JADX INFO: renamed from: android.support.v4.media.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1065d {
    /* JADX INFO: renamed from: a */
    public static float m3153a(Rating rating) {
        return rating.getPercentRating();
    }

    /* JADX INFO: renamed from: b */
    public static int m3154b(Rating rating) {
        return rating.getRatingStyle();
    }

    /* JADX INFO: renamed from: c */
    public static float m3155c(Rating rating) {
        return rating.getStarRating();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m3156d(Rating rating) {
        return rating.hasHeart();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3157e(Rating rating) {
        return rating.isRated();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m3158f(Rating rating) {
        return rating.isThumbUp();
    }

    /* JADX INFO: renamed from: g */
    public static Rating m3159g(boolean z4) {
        return Rating.newHeartRating(z4);
    }

    /* JADX INFO: renamed from: h */
    public static Rating m3160h(float f13) {
        return Rating.newPercentageRating(f13);
    }

    /* JADX INFO: renamed from: i */
    public static Rating m3161i(int i13, float f13) {
        return Rating.newStarRating(i13, f13);
    }

    /* JADX INFO: renamed from: j */
    public static Rating m3162j(boolean z4) {
        return Rating.newThumbRating(z4);
    }

    /* JADX INFO: renamed from: k */
    public static Rating m3163k(int i13) {
        return Rating.newUnratedRating(i13);
    }
}
