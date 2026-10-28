.class public final Lay/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lay/z;
.implements Ld20/m;
.implements Lkz/o;


# instance fields
.field public a:Lj/d;


# direct methods
.method public constructor <init>(Lj/d;I)V
    .locals 0

    packed-switch p2, :pswitch_data_0

    const-string p2, "launcher"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lay/y;->a:Lj/d;

    return-void

    :pswitch_0
    const-string p2, "launcher"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lay/y;->a:Lj/d;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Lay/p;)V
    .locals 2

    iget-object v0, p0, Lay/y;->a:Lj/d;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Ld20/l;

    iget-object v0, p0, Lay/y;->a:Lj/d;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void
.end method

.method public c(Ljz/f;Ljz/e;)V
    .locals 2

    iget-object v0, p0, Lay/y;->a:Lj/d;

    new-instance v1, Lkz/b;

    invoke-direct {v1, p1, p2}, Lkz/b;-><init>(Ljz/f;Ljz/e;)V

    const/4 p1, 0x0

    invoke-virtual {v0, v1, p1}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void
.end method
