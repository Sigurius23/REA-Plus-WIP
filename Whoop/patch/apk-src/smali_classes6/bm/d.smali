.class public final Lbm/d;
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

    iput p2, p0, Lbm/d;->w:I

    iput-object p1, p0, Lbm/d;->x:Lbm/t;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lbm/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbm/d;->x:Lbm/t;

    invoke-virtual {v0}, Lbm/t;->j()Ln0/g;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Ln0/o;

    iget v0, v0, Ln0/o;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lbm/d;->x:Lbm/t;

    iget-object v0, v0, Lbm/t;->a:Ln0/u;

    iget-object v0, v0, Ln0/u;->i:Lh0/d0;

    invoke-virtual {v0}, Lh0/d0;->b()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
