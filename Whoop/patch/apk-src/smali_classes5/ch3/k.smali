.class public final Lch3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/e;


# instance fields
.field public final synthetic w:I

.field public final x:Lxg3/g;

.field public final y:Lbh3/g;


# direct methods
.method public synthetic constructor <init>(Lxg3/g;Lbh3/g;I)V
    .locals 0

    iput p3, p0, Lch3/k;->w:I

    iput-object p1, p0, Lch3/k;->x:Lxg3/g;

    iput-object p2, p0, Lch3/k;->y:Lbh3/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lch3/k;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lxg3/s;

    new-instance v0, Lch3/l;

    iget-object v1, p0, Lch3/k;->y:Lbh3/g;

    const/4 v2, 0x1

    invoke-direct {v0, p1, v1, v2}, Lch3/l;-><init>(Lxg3/s;Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lxg3/s;->c(Lxg3/t;)V

    iget-object p1, p0, Lch3/k;->x:Lxg3/g;

    invoke-virtual {p1, v0}, Lxg3/g;->W(Lxg3/s;)Lxg3/t;

    return-void

    :pswitch_0
    check-cast p1, Lxg3/s;

    new-instance v0, Lch3/l;

    iget-object v1, p0, Lch3/k;->y:Lbh3/g;

    invoke-direct {v0, p1, v1}, Lch3/l;-><init>(Lxg3/s;Lbh3/g;)V

    invoke-virtual {p1, v0}, Lxg3/s;->c(Lxg3/t;)V

    iget-object p1, p0, Lch3/k;->x:Lxg3/g;

    invoke-virtual {p1, v0}, Lxg3/g;->W(Lxg3/s;)Lxg3/t;

    return-void

    :pswitch_1
    check-cast p1, Lxg3/s;

    new-instance v0, Lch3/o0;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lch3/o0;-><init>(Lxg3/s;Z)V

    new-instance v1, Lch3/j;

    iget-object v2, p0, Lch3/k;->y:Lbh3/g;

    invoke-direct {v1, v0, v2}, Lch3/j;-><init>(Lch3/o0;Lbh3/g;)V

    invoke-virtual {p1, v1}, Lxg3/s;->c(Lxg3/t;)V

    iget-object v0, v1, Lch3/j;->K:Lmh3/b;

    invoke-virtual {p1, v0}, Lxg3/s;->c(Lxg3/t;)V

    new-instance v0, Laj/c;

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Laj/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lxg3/s;->f(Lxg3/i;)V

    invoke-virtual {p1}, Lxg3/s;->a()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lch3/k;->x:Lxg3/g;

    invoke-virtual {p1, v1}, Lxg3/g;->W(Lxg3/s;)Lxg3/t;

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
