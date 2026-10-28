.class public final Ld0/r1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/t2;


# instance fields
.field public final w:Ld0/v1;

.field public x:Lkotlin/jvm/functions/Function1;

.field public y:Lkotlin/jvm/internal/m;

.field public final synthetic z:Ld0/s1;


# direct methods
.method public constructor <init>(Ld0/s1;Ld0/v1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/r1;->z:Ld0/s1;

    iput-object p2, p0, Ld0/r1;->w:Ld0/v1;

    iput-object p3, p0, Ld0/r1;->x:Lkotlin/jvm/functions/Function1;

    check-cast p4, Lkotlin/jvm/internal/m;

    iput-object p4, p0, Ld0/r1;->y:Lkotlin/jvm/internal/m;

    return-void
.end method


# virtual methods
.method public final a(Ld0/t1;)V
    .locals 4

    iget-object v0, p0, Ld0/r1;->y:Lkotlin/jvm/internal/m;

    invoke-interface {p1}, Ld0/t1;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Ld0/r1;->z:Ld0/s1;

    iget-object v1, v1, Ld0/s1;->c:Ld0/z1;

    invoke-virtual {v1}, Ld0/z1;->g()Z

    move-result v1

    iget-object v2, p0, Ld0/r1;->w:Ld0/v1;

    if-eqz v1, :cond_0

    iget-object v1, p0, Ld0/r1;->y:Lkotlin/jvm/internal/m;

    invoke-interface {p1}, Ld0/t1;->c()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-object v3, p0, Ld0/r1;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld0/c0;

    invoke-virtual {v2, v1, v0, p1}, Ld0/v1;->g(Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;)V

    return-void

    :cond_0
    iget-object v1, p0, Ld0/r1;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld0/c0;

    invoke-virtual {v2, v0, p1}, Ld0/v1;->j(Ljava/lang/Object;Ld0/c0;)V

    return-void
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ld0/r1;->z:Ld0/s1;

    iget-object v0, v0, Ld0/s1;->c:Ld0/z1;

    invoke-virtual {v0}, Ld0/z1;->f()Ld0/t1;

    move-result-object v0

    invoke-virtual {p0, v0}, Ld0/r1;->a(Ld0/t1;)V

    iget-object v0, p0, Ld0/r1;->w:Ld0/v1;

    iget-object v0, v0, Ld0/v1;->J:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
