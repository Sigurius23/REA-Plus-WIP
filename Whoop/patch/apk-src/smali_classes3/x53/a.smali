.class public final Lx53/a;
.super Lj63/c;
.source "SourceFile"


# instance fields
.field public final a:Lq83/j;

.field public final b:Lkotlin/jvm/functions/Function3;

.field public final c:Lio/ktor/utils/io/q;

.field public final d:Lj63/d;


# direct methods
.method public constructor <init>(Lj63/d;Lbc3/e2;Lkotlin/jvm/functions/Function3;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lx53/a;->a:Lq83/j;

    iput-object p3, p0, Lx53/a;->b:Lkotlin/jvm/functions/Function3;

    instance-of p2, p1, Lj63/b;

    if-eqz p2, :cond_0

    move-object p2, p1

    check-cast p2, Lj63/b;

    invoke-virtual {p2}, Lj63/b;->d()[B

    move-result-object p2

    invoke-static {p2}, Lge3/g;->a([B)Lio/ktor/utils/io/m;

    move-result-object p2

    goto :goto_0

    :cond_0
    instance-of p2, p1, Lg63/c;

    if-eqz p2, :cond_1

    sget-object p2, Lio/ktor/utils/io/q;->a:Lio/ktor/utils/io/p;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lio/ktor/utils/io/p;->a()Lio/ktor/utils/io/q;

    move-result-object p2

    goto :goto_0

    :cond_1
    instance-of p2, p1, Lj63/c;

    if-eqz p2, :cond_2

    move-object p2, p1

    check-cast p2, Lj63/c;

    invoke-virtual {p2}, Lj63/c;->d()Lio/ktor/utils/io/q;

    move-result-object p2

    :goto_0
    iput-object p2, p0, Lx53/a;->c:Lio/ktor/utils/io/q;

    iput-object p1, p0, Lx53/a;->d:Lj63/d;

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final a()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lx53/a;->d:Lj63/d;

    invoke-virtual {v0}, Lj63/d;->a()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public final b()Li63/d;
    .locals 1

    iget-object v0, p0, Lx53/a;->d:Lj63/d;

    invoke-virtual {v0}, Lj63/d;->b()Li63/d;

    move-result-object v0

    return-object v0
.end method

.method public final c()Li63/m;
    .locals 1

    iget-object v0, p0, Lx53/a;->d:Lj63/d;

    invoke-virtual {v0}, Lj63/d;->c()Li63/m;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lio/ktor/utils/io/q;
    .locals 4

    iget-object v0, p0, Lx53/a;->d:Lj63/d;

    invoke-virtual {v0}, Lj63/d;->a()Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Lx53/a;->b:Lkotlin/jvm/functions/Function3;

    iget-object v2, p0, Lx53/a;->c:Lio/ktor/utils/io/q;

    iget-object v3, p0, Lx53/a;->a:Lq83/j;

    invoke-static {v2, v3, v0, v1}, Lug/m;->I(Lio/ktor/utils/io/q;Lq83/j;Ljava/lang/Long;Lkotlin/jvm/functions/Function3;)Lio/ktor/utils/io/n;

    move-result-object v0

    return-object v0
.end method
