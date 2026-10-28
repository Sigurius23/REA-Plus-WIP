package com.whoop.video;

import a80.C0539c;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bs2.AbstractC3613f;
import c93.InterfaceC4339a;
import com.whoop.video.VideoActivity;
import hj0.AbstractActivityC17350i;
import j02.InterfaceC21153l0;
import java.io.IOException;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p026b2.C2314t;
import p161g.AbstractC14917t;
import p179h.AbstractC16348f;
import p291l0.AbstractC22953f;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0003R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00128\u0014X\u0094D¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, m65681d2 = {"Lcom/whoop/video/VideoActivity;", "Lhj0/i;", "<init>", "()V", "Ll83/a0;", "G", "O", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "I", "H", "", "E", "Ljava/lang/String;", "videoUrl", "", "F", "Z", "userViewedFullVideo", "shouldSubtitlesDefaultToOff", "shouldForceHdVideo", "v", "()Ljava/lang/String;", "logTag", "J", "a", "video_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class VideoActivity extends AbstractActivityC17350i {

    /* JADX INFO: renamed from: K */
    public static final int f32636K = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private String videoUrl;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private boolean userViewedFullVideo;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private boolean shouldSubtitlesDefaultToOff;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private boolean shouldForceHdVideo;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final String logTag = "VideoActivity";

    /* JADX INFO: renamed from: com.whoop.video.VideoActivity$b */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/video/VideoActivity$b", "Lg/t;", "Ll83/a0;", "d", "()V", "video_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10701b extends AbstractC14917t {
        public C10701b() {
            super(true);
        }

        @Override // p161g.AbstractC14917t
        /* JADX INFO: renamed from: d */
        public void mo4073d() {
            VideoActivity.this.m27826O();
            VideoActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: G */
    private final void m27820G() {
        getOnBackPressedDispatcher().m43015a(this, new C10701b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m27821J(final VideoActivity videoActivity, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            String str = videoActivity.videoUrl;
            if (str == null) {
                AbstractC22676k.m65757q("videoUrl");
                throw null;
            }
            Modifier modifierM66723l = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, C2314t.f9131w));
            boolean z4 = videoActivity.shouldSubtitlesDefaultToOff;
            boolean z13 = videoActivity.shouldForceHdVideo;
            boolean zM87157i = c28655q.m87157i(videoActivity);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                final int i14 = 0;
                objM87133R = new InterfaceC4339a(videoActivity) { // from class: bs2.a

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ VideoActivity f14670x;

                    {
                        this.f14670x = videoActivity;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                return VideoActivity.m27822K(this.f14670x);
                            case 1:
                                return VideoActivity.m27823L(this.f14670x);
                            case 2:
                                return VideoActivity.m27824M(this.f14670x);
                            default:
                                return VideoActivity.m27825N(this.f14670x);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(videoActivity);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i15 = 1;
                objM87133R2 = new InterfaceC4339a(videoActivity) { // from class: bs2.a

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ VideoActivity f14670x;

                    {
                        this.f14670x = videoActivity;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                return VideoActivity.m27822K(this.f14670x);
                            case 1:
                                return VideoActivity.m27823L(this.f14670x);
                            case 2:
                                return VideoActivity.m27824M(this.f14670x);
                            default:
                                return VideoActivity.m27825N(this.f14670x);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(videoActivity);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                final int i16 = 2;
                objM87133R3 = new InterfaceC4339a(videoActivity) { // from class: bs2.a

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ VideoActivity f14670x;

                    {
                        this.f14670x = videoActivity;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                return VideoActivity.m27822K(this.f14670x);
                            case 1:
                                return VideoActivity.m27823L(this.f14670x);
                            case 2:
                                return VideoActivity.m27824M(this.f14670x);
                            default:
                                return VideoActivity.m27825N(this.f14670x);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R3;
            boolean zM87157i4 = c28655q.m87157i(videoActivity);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                final int i17 = 3;
                objM87133R4 = new InterfaceC4339a(videoActivity) { // from class: bs2.a

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ VideoActivity f14670x;

                    {
                        this.f14670x = videoActivity;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                return VideoActivity.m27822K(this.f14670x);
                            case 1:
                                return VideoActivity.m27823L(this.f14670x);
                            case 2:
                                return VideoActivity.m27824M(this.f14670x);
                            default:
                                return VideoActivity.m27825N(this.f14670x);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC3613f.m10967f(modifierM66723l, str, false, z4, z13, false, false, false, false, false, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, (InterfaceC4339a) objM87133R4, c28655q, 0, 0, 996);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m27822K(VideoActivity videoActivity) {
        videoActivity.setRequestedOrientation(11);
        videoActivity.m27829I();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m27823L(VideoActivity videoActivity) {
        videoActivity.m27828H();
        videoActivity.setRequestedOrientation(2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m27824M(VideoActivity videoActivity) {
        videoActivity.m27826O();
        videoActivity.finish();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m27825N(VideoActivity videoActivity) {
        videoActivity.userViewedFullVideo = true;
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public final void m27826O() {
        Intent intent = getIntent();
        intent.putExtra("USER_VIEWED_FULL_VIDEO", this.userViewedFullVideo);
        setResult(-1, intent);
    }

    /* JADX INFO: renamed from: H */
    public final void m27828H() {
        getWindow().getDecorView().setSystemUiVisibility(0);
        if (Build.VERSION.SDK_INT < 30) {
            getWindow().clearFlags(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
            return;
        }
        WindowInsetsController insetsController = getWindow().getInsetsController();
        if (insetsController != null) {
            insetsController.show(WindowInsets.Type.statusBars());
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m27829I() {
        getWindow().getDecorView().setSystemUiVisibility(DfuBaseService.ERROR_SERVICE_NOT_FOUND);
        if (Build.VERSION.SDK_INT < 30) {
            getWindow().addFlags(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
            return;
        }
        WindowInsetsController insetsController = getWindow().getInsetsController();
        if (insetsController != null) {
            insetsController.hide(WindowInsets.Type.statusBars());
        }
    }

    @Override // p314m.AbstractActivityC24852m, p161g.AbstractActivityC14909l, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC22676k.m65750j(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int i13 = newConfig.orientation;
        if (i13 == 2) {
            m27829I();
        } else if (i13 == 1) {
            m27828H();
        }
    }

    @Override // hj0.AbstractActivityC17350i, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(128);
        m27820G();
        String stringExtra = getIntent().getStringExtra("videoUrl");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.videoUrl = stringExtra;
        this.shouldSubtitlesDefaultToOff = getIntent().getBooleanExtra("SHOULD_SUBTITLES_DEFAULT_TO_OFF", false);
        this.shouldForceHdVideo = getIntent().getBooleanExtra("SHOULD_FORCE_HD_VIDEO", false);
        AbstractC29125c.m88513V(getWindow(), false);
        Window window = getWindow();
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        AbstractC16348f.m46559a(this, new C37816b(new C0539c(this, 18), true, 656216459));
        ((InterfaceC21153l0) AbstractC29125c.m88492A(this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21153l0.class), null)).mo59004J("VideoActivity");
    }

    @Override // hj0.AbstractActivityC17350i, p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getWindow().clearFlags(128);
    }

    @Override // hj0.AbstractActivityC17350i
    /* JADX INFO: renamed from: v, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }
}
