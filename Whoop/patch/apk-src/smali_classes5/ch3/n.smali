.class public final Lch3/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/e;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lch3/n;->w:I

    iput-object p1, p0, Lch3/n;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lch3/n;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lxg3/s;

    iget-object v0, p0, Lch3/n;->x:Ljava/lang/Object;

    check-cast v0, Llh3/k;

    invoke-virtual {v0, p1}, Lxg3/g;->W(Lxg3/s;)Lxg3/t;

    return-void

    :pswitch_0
    check-cast p1, Lxg3/s;

    sget-boolean v0, Lgh3/l;->y:Z

    iget-object v1, p0, Lch3/n;->x:Ljava/lang/Object;

    if-eqz v0, :cond_0

    new-instance v0, Ldh3/b;

    invoke-direct {v0, p1, v1}, Ldh3/b;-><init>(Lxg3/s;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lf1/p1;

    const/4 v2, 0x2

    invoke-direct {v0, v2, p1, v1}, Lf1/p1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p1, v0}, Lxg3/s;->f(Lxg3/i;)V

    return-void

    :pswitch_1
    check-cast p1, Lxg3/s;

    new-instance v0, Lch3/z0;

    invoke-direct {v0, p1}, Lch3/z0;-><init>(Lxg3/s;)V

    invoke-virtual {p1, v0}, Lxg3/s;->c(Lxg3/t;)V

    iget-object p1, p0, Lch3/n;->x:Ljava/lang/Object;

    check-cast p1, Lxg3/o;

    invoke-interface {p1, v0}, Lbh3/b;->b(Ljava/lang/Object;)V

    return-void

    :pswitch_2
    check-cast p1, Lxg3/s;

    new-instance v0, Lch3/m;

    iget-object v1, p0, Lch3/n;->x:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    invoke-direct {v0, p1, v1}, Lch3/m;-><init>(Lxg3/s;[Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lxg3/s;->f(Lxg3/i;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
