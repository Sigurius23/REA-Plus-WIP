.class public final Lq93/k;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Lq93/p;


# direct methods
.method public synthetic constructor <init>(Lq93/p;I)V
    .locals 0

    iput p2, p0, Lq93/k;->w:I

    iput-object p1, p0, Lq93/k;->x:Lq93/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lq93/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lq93/k;->x:Lq93/p;

    iget-object v0, v0, Lq93/p;->a:Lu93/e0;

    iget-object v0, v0, Lu93/e0;->E:Lo93/h;

    invoke-virtual {v0}, Lo93/h;->e()Llb3/c0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lq93/k;->x:Lq93/p;

    iget-object v0, v0, Lq93/p;->a:Lu93/e0;

    iget-object v0, v0, Lu93/e0;->E:Lo93/h;

    invoke-static {v0}, Ls93/e;->b(Lo93/h;)Ls93/l;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Ls93/g;->a:Ls93/f;

    goto :goto_0

    :cond_0
    new-instance v1, Ls93/j;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Ls93/j;-><init>(Ljava/util/List;I)V

    move-object v0, v1

    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
