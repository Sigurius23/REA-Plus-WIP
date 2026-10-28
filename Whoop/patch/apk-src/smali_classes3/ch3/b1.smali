.class public final Lch3/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/o;


# instance fields
.field public final synthetic w:I

.field public final x:Lxg3/p;

.field public final y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lxg3/p;Ljava/lang/Object;I)V
    .locals 0

    iput p3, p0, Lch3/b1;->w:I

    iput-object p1, p0, Lch3/b1;->x:Lxg3/p;

    iput-object p2, p0, Lch3/b1;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lch3/b1;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lxg3/r;

    iget-object v0, p0, Lch3/b1;->y:Ljava/lang/Object;

    check-cast v0, Lxg3/k;

    invoke-virtual {v0}, Lxg3/k;->a()Lxg3/j;

    move-result-object v0

    invoke-virtual {p1, v0}, Lxg3/r;->c(Lxg3/t;)V

    new-instance v1, Lxg3/n;

    invoke-direct {v1, p0, p1, v0}, Lxg3/n;-><init>(Lch3/b1;Lxg3/r;Lxg3/j;)V

    invoke-virtual {v0, v1}, Lxg3/j;->c(Lbh3/a;)Lxg3/t;

    return-void

    :pswitch_0
    check-cast p1, Lxg3/r;

    new-instance v0, Lch3/a1;

    iget-object v1, p0, Lch3/b1;->y:Ljava/lang/Object;

    check-cast v1, Lbh3/g;

    invoke-direct {v0, p1, v1}, Lch3/a1;-><init>(Lxg3/r;Lbh3/g;)V

    invoke-virtual {p1, v0}, Lxg3/r;->c(Lxg3/t;)V

    iget-object p1, p0, Lch3/b1;->x:Lxg3/p;

    invoke-virtual {p1, v0}, Lxg3/p;->c(Lxg3/r;)Lxg3/t;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
