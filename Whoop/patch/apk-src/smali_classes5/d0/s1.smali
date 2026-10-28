.class public final Ld0/s1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ld0/f2;

.field public final b:Lp1/k1;

.field public final synthetic c:Ld0/z1;


# direct methods
.method public constructor <init>(Ld0/z1;Ld0/f2;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/s1;->c:Ld0/z1;

    iput-object p2, p0, Ld0/s1;->a:Ld0/f2;

    const/4 p1, 0x0

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Ld0/s1;->b:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ld0/r1;
    .locals 7

    invoke-virtual {p0}, Ld0/s1;->b()Ld0/r1;

    move-result-object v0

    iget-object v1, p0, Ld0/s1;->c:Ld0/z1;

    if-nez v0, :cond_0

    new-instance v0, Ld0/r1;

    new-instance v2, Ld0/v1;

    iget-object v3, v1, Ld0/z1;->a:Lal/a;

    invoke-virtual {v3}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, v1, Ld0/z1;->a:Lal/a;

    invoke-virtual {v4}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, Ld0/s1;->a:Ld0/f2;

    iget-object v6, v5, Ld0/f2;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {v6, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld0/r;

    invoke-virtual {v4}, Ld0/r;->d()V

    invoke-direct {v2, v1, v3, v4, v5}, Ld0/v1;-><init>(Ld0/z1;Ljava/lang/Object;Ld0/r;Ld0/f2;)V

    invoke-direct {v0, p0, v2, p1, p2}, Ld0/r1;-><init>(Ld0/s1;Ld0/v1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    iget-object v3, p0, Ld0/s1;->b:Lp1/k1;

    invoke-virtual {v3, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v3, v1, Ld0/z1;->i:Lz1/p;

    invoke-virtual {v3, v2}, Lz1/p;->add(Ljava/lang/Object;)Z

    :cond_0
    check-cast p2, Lkotlin/jvm/internal/m;

    iput-object p2, v0, Ld0/r1;->y:Lkotlin/jvm/internal/m;

    iput-object p1, v0, Ld0/r1;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1}, Ld0/z1;->f()Ld0/t1;

    move-result-object p1

    invoke-virtual {v0, p1}, Ld0/r1;->a(Ld0/t1;)V

    return-object v0
.end method

.method public final b()Ld0/r1;
    .locals 1

    iget-object v0, p0, Ld0/s1;->b:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld0/r1;

    return-object v0
.end method

.method public final c()V
    .locals 6

    invoke-virtual {p0}, Ld0/s1;->b()Ld0/r1;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, v0, Ld0/r1;->w:Ld0/v1;

    iget-object v2, v0, Ld0/r1;->y:Lkotlin/jvm/internal/m;

    iget-object v3, p0, Ld0/s1;->c:Ld0/z1;

    invoke-virtual {v3}, Ld0/z1;->f()Ld0/t1;

    move-result-object v4

    invoke-interface {v4}, Ld0/t1;->c()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v2, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iget-object v4, v0, Ld0/r1;->y:Lkotlin/jvm/internal/m;

    invoke-virtual {v3}, Ld0/z1;->f()Ld0/t1;

    move-result-object v5

    invoke-interface {v5}, Ld0/t1;->b()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iget-object v0, v0, Ld0/r1;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v3}, Ld0/z1;->f()Ld0/t1;

    move-result-object v3

    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld0/c0;

    invoke-virtual {v1, v2, v4, v0}, Ld0/v1;->g(Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;)V

    :cond_0
    return-void
.end method
