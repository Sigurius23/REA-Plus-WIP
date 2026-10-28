.class public final synthetic Lg1/r4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lp1/t2;

.field public final synthetic F:Lp1/t2;

.field public final synthetic G:Lp1/t2;

.field public final synthetic H:Lp1/t2;

.field public final synthetic w:J

.field public final synthetic x:Lk2/i;

.field public final synthetic y:F

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(JLk2/i;FJLd0/j0;Ld0/j0;Ld0/j0;Ld0/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lg1/r4;->w:J

    iput-object p3, p0, Lg1/r4;->x:Lk2/i;

    iput p4, p0, Lg1/r4;->y:F

    iput-wide p5, p0, Lg1/r4;->z:J

    iput-object p7, p0, Lg1/r4;->E:Lp1/t2;

    iput-object p8, p0, Lg1/r4;->F:Lp1/t2;

    iput-object p9, p0, Lg1/r4;->G:Lp1/t2;

    iput-object p10, p0, Lg1/r4;->H:Lp1/t2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v0, p1

    check-cast v0, Lk2/e;

    const/4 v1, 0x0

    const/high16 v2, 0x43b40000    # 360.0f

    iget-wide v3, p0, Lg1/r4;->w:J

    iget-object v5, p0, Lg1/r4;->x:Lk2/i;

    invoke-static/range {v0 .. v5}, Lg1/v4;->e(Lk2/e;FFJLk2/i;)V

    iget-object p1, p0, Lg1/r4;->E:Lp1/t2;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    int-to-float p1, p1

    const/high16 v1, 0x43580000    # 216.0f

    mul-float/2addr p1, v1

    const/high16 v1, 0x43b40000    # 360.0f

    rem-float/2addr p1, v1

    iget-object v1, p0, Lg1/r4;->F:Lp1/t2;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iget-object v2, p0, Lg1/r4;->G:Lp1/t2;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    sub-float/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const/high16 v3, -0x3d4c0000    # -90.0f

    add-float/2addr p1, v3

    iget-object v3, p0, Lg1/r4;->H:Lp1/t2;

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    add-float/2addr v3, p1

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    add-float/2addr p1, v3

    iget v2, v5, Lk2/i;->c:I

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    sget v2, Lg1/v4;->c:F

    const/4 v3, 0x2

    int-to-float v3, v3

    div-float/2addr v2, v3

    iget v3, p0, Lg1/r4;->y:F

    div-float/2addr v3, v2

    const v2, 0x42652ee1

    mul-float/2addr v3, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v3, v2

    :goto_0
    add-float/2addr p1, v2

    const v2, 0x3dcccccd    # 0.1f

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    iget-wide v3, p0, Lg1/r4;->z:J

    move v1, p1

    invoke-static/range {v0 .. v5}, Lg1/v4;->e(Lk2/e;FFJLk2/i;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
