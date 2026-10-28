package androidx.compose.p018ui.graphics;

import androidx.compose.p018ui.Modifier;
import androidx.profileinstaller.ProfileVerifier;
import no.nordicsemi.android.dfu.DfuBaseService;
import p208i2.AbstractC17888h0;
import p208i2.AbstractC17918w0;
import p208i2.C17881e1;
import p208i2.C17907r;
import p208i2.InterfaceC17869a1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1127a {
    /* JADX INFO: renamed from: a */
    public static final Modifier m3486a(Modifier modifier, Function1 function1) {
        return modifier.mo3471e(new BlockGraphicsLayerElement(function1));
    }

    /* JADX INFO: renamed from: b */
    public static Modifier m3487b(Modifier modifier, float f13, float f14, float f15, float f16, InterfaceC17869a1 interfaceC17869a1, int i13) {
        float f17 = (i13 & 1) != 0 ? 1.0f : f13;
        float f18 = (i13 & 2) != 0 ? 1.0f : f14;
        float f19 = (i13 & 4) != 0 ? 1.0f : f15;
        float f24 = (i13 & 32) != 0 ? 0.0f : f16;
        long j7 = C17881e1.f69566b;
        InterfaceC17869a1 interfaceC17869a2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? AbstractC17918w0.f69621a : interfaceC17869a1;
        long j13 = AbstractC17888h0.f69583a;
        return modifier.mo3471e(new GraphicsLayerElement(f17, f18, f19, 0.0f, 0.0f, f24, 0.0f, 0.0f, j7, interfaceC17869a2, false, null, j13, j13, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? 0 : 1));
    }

    /* JADX INFO: renamed from: c */
    public static Modifier m3488c(Modifier modifier, float f13, float f14, float f15, float f16, float f17, float f18, InterfaceC17869a1 interfaceC17869a1, C17907r c17907r, int i13, int i14) {
        float f19 = (i14 & 1) != 0 ? 1.0f : f13;
        float f24 = (i14 & 2) != 0 ? 1.0f : f14;
        float f25 = (i14 & 4) != 0 ? 1.0f : f15;
        float f26 = (i14 & 8) != 0 ? 0.0f : f16;
        float f27 = (i14 & 16) != 0 ? 0.0f : f17;
        float f28 = (i14 & 128) != 0 ? 0.0f : 180.0f;
        float f29 = (i14 & 256) != 0 ? 0.0f : f18;
        long j7 = C17881e1.f69566b;
        InterfaceC17869a1 interfaceC17869a2 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? AbstractC17918w0.f69621a : interfaceC17869a1;
        boolean z4 = (i14 & 4096) == 0;
        C17907r c17907r2 = (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : c17907r;
        long j13 = AbstractC17888h0.f69583a;
        return modifier.mo3471e(new GraphicsLayerElement(f19, f24, f25, f26, f27, 0.0f, f28, f29, j7, interfaceC17869a2, z4, c17907r2, j13, j13, (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? 0 : i13));
    }
}
