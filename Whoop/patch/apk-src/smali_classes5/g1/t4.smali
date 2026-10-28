.class public final synthetic Lg1/t4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(FJJLd0/j0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lg1/t4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg1/t4;->x:F

    iput-wide p2, p0, Lg1/t4;->y:J

    iput-wide p4, p0, Lg1/t4;->z:J

    iput-object p6, p0, Lg1/t4;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(FJLk2/i;J)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lg1/t4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg1/t4;->x:F

    iput-wide p2, p0, Lg1/t4;->y:J

    iput-object p4, p0, Lg1/t4;->E:Ljava/lang/Object;

    iput-wide p5, p0, Lg1/t4;->z:J

    return-void
.end method

.method public synthetic constructor <init>(FLi2/t0;JJ)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput v0, p0, Lg1/t4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg1/t4;->x:F

    iput-object p2, p0, Lg1/t4;->E:Ljava/lang/Object;

    iput-wide p3, p0, Lg1/t4;->y:J

    iput-wide p5, p0, Lg1/t4;->z:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lg1/t4;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg1/t4;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Li2/t0;

    iget-wide v5, p0, Lg1/t4;->z:J

    move-object v7, p1

    check-cast v7, Lk2/e;

    iget v1, p0, Lg1/t4;->x:F

    iget-wide v3, p0, Lg1/t4;->y:J

    invoke-static/range {v1 .. v7}, Lz81/d;->e(FLi2/t0;JJLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lg1/t4;->E:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    move-object v1, p1

    check-cast v1, Lk2/e;

    const-string p1, "$this$Canvas"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p0, Lg1/t4;->x:F

    invoke-interface {v1, p1}, Ly3/c;->q0(F)F

    move-result v3

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v4

    invoke-static {v4, v5}, Lh2/e;->d(J)F

    move-result p1

    const/4 v2, 0x2

    int-to-float v2, v2

    div-float/2addr p1, v2

    div-float v10, v3, v2

    sub-float/2addr p1, v10

    new-instance v2, Lk2/i;

    const/4 v7, 0x0

    const/16 v8, 0x1a

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lk2/i;-><init>(FFIILi2/t0;I)V

    move v11, v3

    const/16 v9, 0x6c

    move-object v8, v2

    iget-wide v2, p0, Lg1/t4;->y:J

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    move v4, p1

    invoke-static/range {v1 .. v9}, Lk2/e;->M(Lk2/e;JFJFLk2/f;I)V

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    new-instance v2, Lk2/i;

    const/4 v7, 0x0

    const/16 v8, 0x1a

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move v3, v11

    invoke-direct/range {v2 .. v8}, Lk2/i;-><init>(FFIILi2/t0;I)V

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v4

    invoke-static {v4, v5}, Lh2/e;->e(J)F

    move-result v0

    sub-float/2addr v0, v3

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v4

    invoke-static {v4, v5}, Lh2/e;->c(J)F

    move-result v4

    sub-float/2addr v4, v3

    invoke-static {v0, v4}, Ljc/x;->b(FF)J

    move-result-wide v8

    invoke-static {v10, v10}, Lge3/g;->c(FF)J

    move-result-wide v6

    const/4 v10, 0x0

    const/16 v12, 0x340

    move-object v11, v2

    iget-wide v2, p0, Lg1/t4;->z:J

    const/high16 v5, 0x42b40000    # 90.0f

    move v4, p1

    invoke-static/range {v1 .. v12}, Lk2/e;->P(Lk2/e;JFFJJFLk2/i;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lg1/t4;->E:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lk2/i;

    move-object v1, p1

    check-cast v1, Lk2/e;

    const/high16 p1, 0x43b40000    # 360.0f

    iget v0, p0, Lg1/t4;->x:F

    mul-float/2addr v0, p1

    const/4 v2, 0x0

    const/high16 v3, 0x43b40000    # 360.0f

    iget-wide v4, p0, Lg1/t4;->y:J

    invoke-static/range {v1 .. v6}, Lg1/v4;->e(Lk2/e;FFJLk2/i;)V

    const/high16 v2, 0x43870000    # 270.0f

    iget-wide v4, p0, Lg1/t4;->z:J

    move v3, v0

    invoke-static/range {v1 .. v6}, Lg1/v4;->e(Lk2/e;FFJLk2/i;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
