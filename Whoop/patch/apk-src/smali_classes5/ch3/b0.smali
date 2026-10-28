.class public final Lch3/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/f;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lch3/b0;->w:I

    iput-object p1, p0, Lch3/b0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lch3/b0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lxg3/s;

    new-instance v0, Ldh3/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lmh3/b;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lmh3/b;-><init>(I)V

    new-instance v2, Lch3/q0;

    invoke-direct {v2, p0, p1, v0, v1}, Lch3/q0;-><init>(Lch3/b0;Lxg3/s;Ldh3/a;Lmh3/b;)V

    iget-object v3, v1, Lmh3/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    check-cast v3, Lfh3/a;

    invoke-virtual {v3, v2}, Lfh3/a;->c(Lxg3/t;)V

    invoke-virtual {p1, v1}, Lxg3/s;->c(Lxg3/t;)V

    invoke-virtual {p1, v0}, Lxg3/s;->f(Lxg3/i;)V

    return-object v2

    :pswitch_0
    check-cast p1, Lxg3/s;

    new-instance v0, Lch3/l;

    iget-object v1, p0, Lch3/b0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Class;

    const/4 v2, 0x2

    invoke-direct {v0, p1, v1, v2}, Lch3/l;-><init>(Lxg3/s;Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lxg3/s;->c(Lxg3/t;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
