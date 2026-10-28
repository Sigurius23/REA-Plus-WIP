.class public final synthetic Ln1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(F[FFZLi2/t;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Ln1/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ln1/b;->x:F

    iput-object p2, p0, Ln1/b;->E:Ljava/lang/Object;

    iput p3, p0, Ln1/b;->y:F

    iput-boolean p4, p0, Ln1/b;->z:Z

    iput-object p5, p0, Ln1/b;->F:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ln1/o;ZFFLi2/a1;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Ln1/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln1/b;->E:Ljava/lang/Object;

    iput-boolean p2, p0, Ln1/b;->z:Z

    iput p3, p0, Ln1/b;->x:F

    iput p4, p0, Ln1/b;->y:F

    iput-object p5, p0, Ln1/b;->F:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Ln1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, [F

    iget-object v0, p0, Ln1/b;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Li2/t;

    move-object v6, p1

    check-cast v6, Lk2/c;

    iget v1, p0, Ln1/b;->x:F

    iget v3, p0, Ln1/b;->y:F

    iget-boolean v4, p0, Ln1/b;->z:Z

    invoke-static/range {v1 .. v6}, Luz0/g;->c(F[FFZLi2/t;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ln1/b;->E:Ljava/lang/Object;

    check-cast v0, Ln1/o;

    iget-object v1, p0, Ln1/b;->F:Ljava/lang/Object;

    check-cast v1, Li2/a1;

    check-cast p1, Li2/g0;

    iget-object v2, v0, Ln1/o;->a:Ld0/e;

    invoke-virtual {v2}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    const/4 v4, 0x1

    if-gtz v2, :cond_1

    iget-boolean v2, p0, Ln1/b;->z:Z

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v4

    :goto_1
    iget-object v0, v0, Ln1/o;->a:Ld0/e;

    invoke-virtual {v0}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v5, p0, Ln1/b;->x:F

    invoke-interface {p1, v5}, Ly3/c;->F(F)I

    move-result v5

    int-to-float v5, v5

    mul-float/2addr v0, v5

    check-cast p1, Li2/x0;

    iget-wide v5, p1, Li2/x0;->R:J

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    sub-float/2addr v0, v5

    invoke-virtual {p1, v0}, Li2/x0;->E(F)V

    if-eqz v2, :cond_2

    iget-object v0, p1, Li2/x0;->S:Ly3/c;

    invoke-interface {v0}, Ly3/c;->getDensity()F

    move-result v0

    iget v2, p0, Ln1/b;->y:F

    mul-float v3, v0, v2

    :cond_2
    invoke-virtual {p1, v3}, Li2/x0;->s(F)V

    invoke-virtual {p1, v1}, Li2/x0;->t(Li2/a1;)V

    invoke-virtual {p1, v4}, Li2/x0;->e(Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
