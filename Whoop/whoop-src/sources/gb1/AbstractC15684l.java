package gb1;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.os.Build;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import c31.C3917a;
import l83.C23454a0;
import p027b3.AbstractC2453v1;
import p208i2.C17899n;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: gb1.l */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\u001a/\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\b\u0010\u0007\"\u0017\u0010\r\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0017\u0010\u0010\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f\"\u0017\u0010\u0012\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0013"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "Ly3/f;", "blurStartHeight", "blurFullHeight", "", "blurProgress", "d", "(Landroidx/compose/ui/Modifier;FFF)Landroidx/compose/ui/Modifier;", "f", "a", "F", "c", "()F", "TRANSPARENT_TOOLBAR_HEIGHT", "b", "getTRANSPARENT_TOOLBAR_BLUR_HEIGHT", "TRANSPARENT_TOOLBAR_BLUR_HEIGHT", "getTRANSPARENT_TOOLBAR_BLUR_FULL_HEIGHT", "TRANSPARENT_TOOLBAR_BLUR_FULL_HEIGHT", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15684l {

    /* JADX INFO: renamed from: a */
    private static final float f58873a;

    /* JADX INFO: renamed from: b */
    private static final float f58874b;

    /* JADX INFO: renamed from: c */
    private static final float f58875c;

    static {
        float f13 = 100;
        f58873a = f13;
        float f14 = f13 * 0.8f;
        f58874b = f14;
        f58875c = f14 * 0.5f;
    }

    /* JADX INFO: renamed from: c */
    public static final float m44119c() {
        return f58873a;
    }

    /* JADX INFO: renamed from: d */
    public static final Modifier m44120d(Modifier gradientBlurBehindToolbar, float f13, float f14, float f15) {
        AbstractC22676k.m65750j(gradientBlurBehindToolbar, "$this$gradientBlurBehindToolbar");
        return Build.VERSION.SDK_INT >= 33 ? m44122f(gradientBlurBehindToolbar, f13, f14, f15) : gradientBlurBehindToolbar;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Modifier m44121e(Modifier modifier, float f13, float f14, float f15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = f58874b;
        }
        if ((i13 & 2) != 0) {
            f14 = f58875c;
        }
        if ((i13 & 4) != 0) {
            f15 = 1.0f;
        }
        return m44120d(modifier, f13, f14, f15);
    }

    /* JADX INFO: renamed from: f */
    private static final Modifier m44122f(Modifier modifier, float f13, float f14, float f15) {
        return AbstractC37056f.m118997u(modifier, new C15683k(0, f15, f13, f14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Modifier m44123g(float f13, float f14, float f15, Modifier composed, Composer composer, int i13) {
        AbstractC22676k.m65750j(composed, "$this$composed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1128451157);
        InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
        float fMo743q0 = interfaceC39171c.mo743q0(f14);
        float fMo743q1 = interfaceC39171c.mo743q0(f15);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = new RuntimeShader("\n    uniform shader content;\n    uniform float blurStartHeight;\n    uniform float blurFullHeight;\n    uniform float blurProgress;\n    uniform float2 size;\n\n    half4 main(float2 coord) {\n        float t = clamp(\n            (blurStartHeight - coord.y) / (blurStartHeight - blurFullHeight),\n            0.0, 1.0\n        );\n        if (t <= 0.0) return content.eval(coord);\n\n        float spread = t * 20.0 * blurProgress;\n\n        // Per-pixel kernel rotation via Interleaved Gradient Noise.\n        // Each pixel gets a unique angle, breaking the regular grid into\n        // smooth stochastic noise and eliminating the square artifact.\n        float hash = fract(52.9829189 * fract(0.06711056 * coord.x + 0.00583715 * coord.y));\n        float theta = hash * 6.28318530718;\n        float cosT = cos(theta);\n        float sinT = sin(theta);\n\n        half4 result = half4(0.0);\n        float total = 0.0;\n        for (int x = -3; x <= 3; x++) {\n            for (int y = -3; y <= 3; y++) {\n                float fx = float(x);\n                float fy = float(y);\n                float2 rotated = float2(fx * cosT - fy * sinT, fx * sinT + fy * cosT);\n                float2 target = coord + rotated * spread;\n                if (target.x < 0.0 || target.y < 0.0 ||\n                    target.x >= size.x || target.y >= size.y) continue;\n                float weight = exp(-0.5 * (fx * fx + fy * fy) / 4.0);\n                result += content.eval(target) * half(weight);\n                total += weight;\n            }\n        }\n        return total > 0.0 ? result / total : content.eval(coord);\n    }\n");
            c28655q.m87172p0(objM87133R);
        }
        RuntimeShader runtimeShader = (RuntimeShader) objM87133R;
        boolean zM87157i = c28655q.m87157i(runtimeShader) | c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1) | c28655q.m87147d(f13);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i || objM87133R2 == c28676v0) {
            objM87133R2 = new C3917a(runtimeShader, fMo743q0, fMo743q1, f13);
            c28655q.m87172p0(objM87133R2);
        }
        Modifier modifierM3486a = AbstractC1127a.m3486a(composed, (Function1) objM87133R2);
        c28655q.m87173q(false);
        return modifierM3486a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m44124h(RuntimeShader runtimeShader, float f13, float f14, float f15, InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        runtimeShader.setFloatUniform("blurStartHeight", f13);
        runtimeShader.setFloatUniform("blurFullHeight", f14);
        runtimeShader.setFloatUniform("blurProgress", f15);
        C17920x0 c17920x0 = (C17920x0) graphicsLayer;
        runtimeShader.setFloatUniform("size", Float.intBitsToFloat((int) (c17920x0.f69653R >> 32)), Float.intBitsToFloat((int) (c17920x0.f69653R & 4294967295L)));
        RenderEffect renderEffectCreateRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(runtimeShader, "content");
        AbstractC22676k.m65749i(renderEffectCreateRuntimeShaderEffect, "createRuntimeShaderEffect(...)");
        c17920x0.m51556g(new C17899n(renderEffectCreateRuntimeShaderEffect));
        return C23454a0.f92919a;
    }
}
