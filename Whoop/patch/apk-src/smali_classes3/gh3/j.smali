.class public final Lgh3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/e;


# instance fields
.field public final synthetic w:I

.field public final x:Lbh3/g;

.field public final y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lbh3/g;I)V
    .locals 0

    iput p3, p0, Lgh3/j;->w:I

    iput-object p1, p0, Lgh3/j;->y:Ljava/lang/Object;

    iput-object p2, p0, Lgh3/j;->x:Lbh3/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lgh3/j;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lxg3/s;

    new-instance v0, Lgh3/k;

    iget-object v1, p0, Lgh3/j;->y:Ljava/lang/Object;

    iget-object v2, p0, Lgh3/j;->x:Lbh3/g;

    invoke-direct {v0, p1, v1, v2}, Lgh3/k;-><init>(Lxg3/s;Ljava/lang/Object;Lbh3/g;)V

    invoke-virtual {p1, v0}, Lxg3/s;->f(Lxg3/i;)V

    return-void

    :pswitch_0
    check-cast p1, Lxg3/s;

    iget-object v0, p0, Lgh3/j;->y:Ljava/lang/Object;

    check-cast v0, Lgh3/l;

    iget-object v0, v0, Lgh3/l;->x:Ljava/lang/Object;

    iget-object v1, p0, Lgh3/j;->x:Lbh3/g;

    invoke-interface {v1, v0}, Lbh3/g;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxg3/g;

    instance-of v1, v0, Lgh3/l;

    if-eqz v1, :cond_1

    check-cast v0, Lgh3/l;

    iget-object v0, v0, Lgh3/l;->x:Ljava/lang/Object;

    sget-boolean v1, Lgh3/l;->y:Z

    if-eqz v1, :cond_0

    new-instance v1, Ldh3/b;

    invoke-direct {v1, p1, v0}, Ldh3/b;-><init>(Lxg3/s;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v1, Lf1/p1;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p1, v0}, Lf1/p1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p1, v1}, Lxg3/s;->f(Lxg3/i;)V

    goto :goto_1

    :cond_1
    new-instance v1, Lih3/c;

    invoke-direct {v1, p1, p1}, Lih3/c;-><init>(Lxg3/s;Lxg3/s;)V

    invoke-virtual {v0, v1}, Lxg3/g;->W(Lxg3/s;)Lxg3/t;

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
