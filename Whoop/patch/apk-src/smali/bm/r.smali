.class public final Lbm/r;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lbm/t;


# direct methods
.method public synthetic constructor <init>(Lbm/t;I)V
    .locals 0

    iput p2, p0, Lbm/r;->w:I

    iput-object p1, p0, Lbm/r;->x:Lbm/t;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lbm/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbm/r;->x:Lbm/t;

    iget-object v0, v0, Lbm/t;->a:Ln0/u;

    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v0

    iget v0, v0, Ln0/n;->n:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lbm/r;->x:Lbm/t;

    invoke-virtual {v0}, Lbm/t;->g()Ln0/g;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Ln0/o;

    invoke-virtual {v1}, Ln0/o;->n()I

    move-result v2

    neg-int v2, v2

    int-to-float v2, v2

    invoke-virtual {v1}, Ln0/o;->o()I

    move-result v1

    invoke-virtual {v0}, Lbm/t;->i()I

    move-result v0

    add-int/2addr v0, v1

    int-to-float v0, v0

    div-float/2addr v2, v0

    const/high16 v0, -0x41000000    # -0.5f

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {v2, v0, v1}, Le93/b;->m(FFF)F

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
