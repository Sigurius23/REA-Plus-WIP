package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: renamed from: android.support.v4.media.session.q */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1083q {
    /* JADX INFO: renamed from: a */
    public static void m3222a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
        builder.addCustomAction(customAction);
    }

    /* JADX INFO: renamed from: b */
    public static PlaybackState.CustomAction m3223b(PlaybackState.CustomAction.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: c */
    public static PlaybackState m3224c(PlaybackState.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: d */
    public static PlaybackState.Builder m3225d() {
        return new PlaybackState.Builder();
    }

    /* JADX INFO: renamed from: e */
    public static PlaybackState.CustomAction.Builder m3226e(String str, CharSequence charSequence, int i13) {
        return new PlaybackState.CustomAction.Builder(str, charSequence, i13);
    }

    /* JADX INFO: renamed from: f */
    public static String m3227f(PlaybackState.CustomAction customAction) {
        return customAction.getAction();
    }

    /* JADX INFO: renamed from: g */
    public static long m3228g(PlaybackState playbackState) {
        return playbackState.getActions();
    }

    /* JADX INFO: renamed from: h */
    public static long m3229h(PlaybackState playbackState) {
        return playbackState.getActiveQueueItemId();
    }

    /* JADX INFO: renamed from: i */
    public static long m3230i(PlaybackState playbackState) {
        return playbackState.getBufferedPosition();
    }

    /* JADX INFO: renamed from: j */
    public static List<PlaybackState.CustomAction> m3231j(PlaybackState playbackState) {
        return playbackState.getCustomActions();
    }

    /* JADX INFO: renamed from: k */
    public static CharSequence m3232k(PlaybackState playbackState) {
        return playbackState.getErrorMessage();
    }

    /* JADX INFO: renamed from: l */
    public static Bundle m3233l(PlaybackState.CustomAction customAction) {
        return customAction.getExtras();
    }

    /* JADX INFO: renamed from: m */
    public static int m3234m(PlaybackState.CustomAction customAction) {
        return customAction.getIcon();
    }

    /* JADX INFO: renamed from: n */
    public static long m3235n(PlaybackState playbackState) {
        return playbackState.getLastPositionUpdateTime();
    }

    /* JADX INFO: renamed from: o */
    public static CharSequence m3236o(PlaybackState.CustomAction customAction) {
        return customAction.getName();
    }

    /* JADX INFO: renamed from: p */
    public static float m3237p(PlaybackState playbackState) {
        return playbackState.getPlaybackSpeed();
    }

    /* JADX INFO: renamed from: q */
    public static long m3238q(PlaybackState playbackState) {
        return playbackState.getPosition();
    }

    /* JADX INFO: renamed from: r */
    public static int m3239r(PlaybackState playbackState) {
        return playbackState.getState();
    }

    /* JADX INFO: renamed from: s */
    public static void m3240s(PlaybackState.Builder builder, long j7) {
        builder.setActions(j7);
    }

    /* JADX INFO: renamed from: t */
    public static void m3241t(PlaybackState.Builder builder, long j7) {
        builder.setActiveQueueItemId(j7);
    }

    /* JADX INFO: renamed from: u */
    public static void m3242u(PlaybackState.Builder builder, long j7) {
        builder.setBufferedPosition(j7);
    }

    /* JADX INFO: renamed from: v */
    public static void m3243v(PlaybackState.Builder builder, CharSequence charSequence) {
        builder.setErrorMessage(charSequence);
    }

    /* JADX INFO: renamed from: w */
    public static void m3244w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* JADX INFO: renamed from: x */
    public static void m3245x(PlaybackState.Builder builder, int i13, long j7, float f13, long j13) {
        builder.setState(i13, j7, f13, j13);
    }
}
