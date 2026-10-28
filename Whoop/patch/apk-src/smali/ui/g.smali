.class public final Lui/g;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lui/i;


# direct methods
.method public synthetic constructor <init>(Lui/i;I)V
    .locals 0

    iput p2, p0, Lui/g;->w:I

    iput-object p1, p0, Lui/g;->x:Lui/i;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lui/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lui/g;->x:Lui/i;

    invoke-virtual {v0}, Lui/i;->j()I

    move-result v1

    iget-object v2, v0, Lui/i;->y:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lui/i;->k()F

    move-result v1

    invoke-virtual {v0}, Lui/i;->g()F

    move-result v0

    cmpg-float v0, v1, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lui/g;->x:Lui/i;

    iget-object v1, v0, Lui/i;->z:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lui/i;->j()I

    move-result v1

    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lui/i;->l()F

    move-result v0

    neg-float v0, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lui/i;->l()F

    move-result v0

    :goto_1
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lui/g;->x:Lui/i;

    invoke-virtual {v0}, Lui/i;->e()Lqi/i;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lui/i;->l()F

    move-result v3

    cmpg-float v3, v3, v2

    if-gez v3, :cond_3

    invoke-virtual {v0}, Lui/i;->d()Lui/o;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0, v1}, Lui/o;->b(Lqi/i;)F

    move-result v2

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, Lui/i;->d()Lui/o;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0, v1}, Lui/o;->a(Lqi/i;)F

    move-result v2

    goto :goto_2

    :cond_4
    const/high16 v2, 0x3f800000    # 1.0f

    :cond_5
    :goto_2
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
