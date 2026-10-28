.class public final Lqg3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/e;


# instance fields
.field public final synthetic w:I

.field public final x:Lxg3/e;


# direct methods
.method public synthetic constructor <init>(Lxg3/e;I)V
    .locals 0

    iput p2, p0, Lqg3/b;->w:I

    iput-object p1, p0, Lqg3/b;->x:Lxg3/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lqg3/b;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lxg3/s;

    new-instance v0, Lih3/c;

    invoke-direct {v0, p1}, Lih3/c;-><init>(Lxg3/s;)V

    iget-object p1, p0, Lqg3/b;->x:Lxg3/e;

    invoke-interface {p1, v0}, Lbh3/b;->b(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    check-cast p1, Lxg3/s;

    new-instance v0, Lqg3/a;

    invoke-direct {v0, p1}, Lqg3/a;-><init>(Lxg3/s;)V

    iget-object p1, p0, Lqg3/b;->x:Lxg3/e;

    invoke-interface {p1, v0}, Lbh3/b;->b(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
