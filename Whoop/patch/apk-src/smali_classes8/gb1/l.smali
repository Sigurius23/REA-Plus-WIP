.class public abstract Lgb1/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u000f\u001a/\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a+\u0010\u0008\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\u0007\"\u0017\u0010\r\u001a\u00020\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\"\u0017\u0010\u0010\u001a\u00020\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\n\u001a\u0004\u0008\u000f\u0010\u000c\"\u0017\u0010\u0012\u001a\u00020\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\n\u001a\u0004\u0008\u0011\u0010\u000c\u00a8\u0006\u0013"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "Ly3/f;",
        "blurStartHeight",
        "blurFullHeight",
        "",
        "blurProgress",
        "d",
        "(Landroidx/compose/ui/Modifier;FFF)Landroidx/compose/ui/Modifier;",
        "f",
        "a",
        "F",
        "c",
        "()F",
        "TRANSPARENT_TOOLBAR_HEIGHT",
        "b",
        "getTRANSPARENT_TOOLBAR_BLUR_HEIGHT",
        "TRANSPARENT_TOOLBAR_BLUR_HEIGHT",
        "getTRANSPARENT_TOOLBAR_BLUR_FULL_HEIGHT",
        "TRANSPARENT_TOOLBAR_BLUR_FULL_HEIGHT",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:F

.field private static final b:F

.field private static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x64

    int-to-float v0, v0

    sput v0, Lgb1/l;->a:F

    const v1, 0x3f4ccccd    # 0.8f

    mul-float/2addr v0, v1

    sput v0, Lgb1/l;->b:F

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    sput v0, Lgb1/l;->c:F

    return-void
.end method

.method public static synthetic a(FFFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static/range {p0 .. p5}, Lgb1/l;->g(FFFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/graphics/RuntimeShader;FFFLi2/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lgb1/l;->h(Landroid/graphics/RuntimeShader;FFFLi2/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c()F
    .locals 1

    sget v0, Lgb1/l;->a:F

    return v0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;FFF)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string v0, "$this$gradientBlurBehindToolbar"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1, p2, p3}, Lgb1/l;->f(Landroidx/compose/ui/Modifier;FFF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;FFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget p1, Lgb1/l;->b:F

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    sget p2, Lgb1/l;->c:F

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const/high16 p3, 0x3f800000    # 1.0f

    :cond_2
    invoke-static {p0, p1, p2, p3}, Lgb1/l;->d(Landroidx/compose/ui/Modifier;FFF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Landroidx/compose/ui/Modifier;FFF)Landroidx/compose/ui/Modifier;
    .locals 2

    new-instance v0, Lgb1/k;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p3, p1, p2}, Lgb1/k;-><init>(IFFF)V

    invoke-static {p0, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final g(FFFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 3

    const-string p5, "$this$composed"

    invoke-static {p3, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p4, Lp1/q;

    const p5, 0x4342cc55

    invoke-virtual {p4, p5}, Lp1/q;->e0(I)V

    sget-object p5, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {p4, p5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ly3/c;

    invoke-interface {p5, p1}, Ly3/c;->q0(F)F

    move-result p1

    invoke-interface {p5, p2}, Ly3/c;->q0(F)F

    move-result p2

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p5

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p5, v0, :cond_0

    new-instance p5, Landroid/graphics/RuntimeShader;

    const-string v1, "\n    uniform shader content;\n    uniform float blurStartHeight;\n    uniform float blurFullHeight;\n    uniform float blurProgress;\n    uniform float2 size;\n\n    half4 main(float2 coord) {\n        float t = clamp(\n            (blurStartHeight - coord.y) / (blurStartHeight - blurFullHeight),\n            0.0, 1.0\n        );\n        if (t <= 0.0) return content.eval(coord);\n\n        float spread = t * 20.0 * blurProgress;\n\n        // Per-pixel kernel rotation via Interleaved Gradient Noise.\n        // Each pixel gets a unique angle, breaking the regular grid into\n        // smooth stochastic noise and eliminating the square artifact.\n        float hash = fract(52.9829189 * fract(0.06711056 * coord.x + 0.00583715 * coord.y));\n        float theta = hash * 6.28318530718;\n        float cosT = cos(theta);\n        float sinT = sin(theta);\n\n        half4 result = half4(0.0);\n        float total = 0.0;\n        for (int x = -3; x <= 3; x++) {\n            for (int y = -3; y <= 3; y++) {\n                float fx = float(x);\n                float fy = float(y);\n                float2 rotated = float2(fx * cosT - fy * sinT, fx * sinT + fy * cosT);\n                float2 target = coord + rotated * spread;\n                if (target.x < 0.0 || target.y < 0.0 ||\n                    target.x >= size.x || target.y >= size.y) continue;\n                float weight = exp(-0.5 * (fx * fx + fy * fy) / 4.0);\n                result += content.eval(target) * half(weight);\n                total += weight;\n            }\n        }\n        return total > 0.0 ? result / total : content.eval(coord);\n    }\n"

    invoke-direct {p5, v1}, Landroid/graphics/RuntimeShader;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, p5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast p5, Landroid/graphics/RuntimeShader;

    invoke-virtual {p4, p5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p4, p1}, Lp1/q;->d(F)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {p4, p2}, Lp1/q;->d(F)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {p4, p0}, Lp1/q;->d(F)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1

    if-ne v2, v0, :cond_2

    :cond_1
    new-instance v2, Lc31/a;

    invoke-direct {v2, p5, p1, p2, p0}, Lc31/a;-><init>(Landroid/graphics/RuntimeShader;FFF)V

    invoke-virtual {p4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {p3, v2}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p4, p1}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final h(Landroid/graphics/RuntimeShader;FFFLi2/g0;)Ll83/a0;
    .locals 2

    const-string v0, "$this$graphicsLayer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "blurStartHeight"

    invoke-virtual {p0, v0, p1}, Landroid/graphics/RuntimeShader;->setFloatUniform(Ljava/lang/String;F)V

    const-string p1, "blurFullHeight"

    invoke-virtual {p0, p1, p2}, Landroid/graphics/RuntimeShader;->setFloatUniform(Ljava/lang/String;F)V

    const-string p1, "blurProgress"

    invoke-virtual {p0, p1, p3}, Landroid/graphics/RuntimeShader;->setFloatUniform(Ljava/lang/String;F)V

    check-cast p4, Li2/x0;

    iget-wide p1, p4, Li2/x0;->R:J

    const/16 p3, 0x20

    shr-long/2addr p1, p3

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    iget-wide p2, p4, Li2/x0;->R:J

    const-wide v0, 0xffffffffL

    and-long/2addr p2, v0

    long-to-int p2, p2

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    const-string p3, "size"

    invoke-virtual {p0, p3, p1, p2}, Landroid/graphics/RuntimeShader;->setFloatUniform(Ljava/lang/String;FF)V

    const-string p1, "content"

    invoke-static {p0, p1}, Landroid/graphics/RenderEffect;->createRuntimeShaderEffect(Landroid/graphics/RuntimeShader;Ljava/lang/String;)Landroid/graphics/RenderEffect;

    move-result-object p0

    const-string p1, "createRuntimeShaderEffect(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Li2/n;

    invoke-direct {p1, p0}, Li2/n;-><init>(Landroid/graphics/RenderEffect;)V

    invoke-virtual {p4, p1}, Li2/x0;->g(Lal/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
