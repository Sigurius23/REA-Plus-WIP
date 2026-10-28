.class public final Lv3/d;
.super Landroid/text/style/CharacterStyle;
.source "SourceFile"

# interfaces
.implements Landroid/text/style/UpdateAppearance;


# instance fields
.field public final w:Li2/y0;

.field public final x:F

.field public final y:Lp1/k1;

.field public final z:Lp1/f0;


# direct methods
.method public constructor <init>(Li2/y0;F)V
    .locals 2

    invoke-direct {p0}, Landroid/text/style/CharacterStyle;-><init>()V

    iput-object p1, p0, Lv3/d;->w:Li2/y0;

    iput p2, p0, Lv3/d;->x:F

    new-instance p1, Lh2/e;

    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    invoke-direct {p1, v0, v1}, Lh2/e;-><init>(J)V

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lv3/d;->y:Lp1/k1;

    new-instance p1, Lsc0/c;

    const/16 p2, 0x19

    invoke-direct {p1, p0, p2}, Lsc0/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object p1

    iput-object p1, p0, Lv3/d;->z:Lp1/f0;

    return-void
.end method


# virtual methods
.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    iget v0, p0, Lv3/d;->x:F

    invoke-static {p1, v0}, Ldt/b;->O(Landroid/text/TextPaint;F)V

    iget-object v0, p0, Lv3/d;->z:Lp1/f0;

    invoke-virtual {v0}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Shader;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void
.end method
