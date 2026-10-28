.class public final synthetic Ll1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ll1/w3;


# direct methods
.method public synthetic constructor <init>(Ll1/w3;I)V
    .locals 0

    iput p2, p0, Ll1/e;->w:I

    iput-object p1, p0, Ll1/e;->x:Ll1/w3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Ll1/e;->w:I

    check-cast p1, Li2/g0;

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll1/e;->x:Ll1/w3;

    iget-object v0, v0, Ll1/w3;->e:Lm1/g;

    iget-object v1, v0, Lm1/g;->j:Lp1/g1;

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v1

    invoke-virtual {v0}, Lm1/g;->d()Lm1/b0;

    move-result-object v0

    invoke-virtual {v0}, Lm1/b0;->c()F

    move-result v0

    cmpg-float v2, v1, v0

    const/4 v3, 0x0

    if-gez v2, :cond_0

    sub-float/2addr v0, v1

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    cmpl-float v1, v0, v3

    if-lez v1, :cond_1

    const/4 v1, 0x1

    int-to-float v1, v1

    move-object v2, p1

    check-cast v2, Li2/x0;

    iget-wide v4, v2, Li2/x0;->R:J

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    add-float/2addr v4, v0

    iget-wide v8, v2, Li2/x0;->R:J

    and-long v5, v8, v6

    long-to-int v0, v5

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    div-float/2addr v4, v0

    div-float/2addr v1, v4

    goto :goto_1

    :cond_1
    const/high16 v1, 0x3f800000    # 1.0f

    :goto_1
    check-cast p1, Li2/x0;

    invoke-virtual {p1, v1}, Li2/x0;->r(F)V

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {v0, v3}, Li2/w0;->l(FF)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Li2/x0;->y(J)V

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ll1/e;->x:Ll1/w3;

    iget-object v0, v0, Ll1/w3;->e:Lm1/g;

    iget-object v1, v0, Lm1/g;->j:Lp1/g1;

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v1

    invoke-virtual {v0}, Lm1/g;->d()Lm1/b0;

    move-result-object v0

    invoke-virtual {v0}, Lm1/b0;->c()F

    move-result v0

    cmpg-float v2, v1, v0

    const/4 v3, 0x0

    if-gez v2, :cond_2

    sub-float/2addr v0, v1

    goto :goto_3

    :cond_2
    move v0, v3

    :goto_3
    cmpl-float v1, v0, v3

    if-lez v1, :cond_3

    move-object v1, p1

    check-cast v1, Li2/x0;

    iget-wide v4, v1, Li2/x0;->R:J

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    long-to-int v2, v4

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    add-float/2addr v2, v0

    iget-wide v0, v1, Li2/x0;->R:J

    and-long/2addr v0, v6

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    div-float/2addr v2, v0

    goto :goto_4

    :cond_3
    const/high16 v2, 0x3f800000    # 1.0f

    :goto_4
    check-cast p1, Li2/x0;

    invoke-virtual {p1, v2}, Li2/x0;->r(F)V

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {v0, v3}, Li2/w0;->l(FF)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Li2/x0;->y(J)V

    goto :goto_2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
