.class public abstract Lp1/t1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lp1/t0;


# direct methods
.method public constructor <init>(Lc93/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp1/t0;

    invoke-direct {v0, p1}, Lp1/t0;-><init>(Lc93/a;)V

    iput-object v0, p0, Lp1/t1;->a:Lp1/t0;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;)Lp1/u1;
.end method

.method public b()Lp1/w2;
    .locals 1

    iget-object v0, p0, Lp1/t1;->a:Lp1/t0;

    return-object v0
.end method

.method public final c(Lp1/u1;Lp1/w2;)Lp1/w2;
    .locals 3

    instance-of v0, p2, Lp1/j0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Lp1/u1;->d:Z

    if-eqz v0, :cond_3

    move-object v1, p2

    check-cast v1, Lp1/j0;

    iget-object p2, v1, Lp1/j0;->a:Lp1/k1;

    invoke-virtual {p1}, Lp1/u1;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    instance-of v0, p2, Lp1/v2;

    if-eqz v0, :cond_2

    iget-boolean v0, p1, Lp1/u1;->b:Z

    if-nez v0, :cond_1

    iget-object v0, p1, Lp1/u1;->e:Ljava/lang/Object;

    if-eqz v0, :cond_3

    :cond_1
    iget-boolean v0, p1, Lp1/u1;->d:Z

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lp1/u1;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast p2, Lp1/v2;

    iget-object v2, p2, Lp1/v2;->a:Ljava/lang/Object;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    move-object v1, p2

    goto :goto_0

    :cond_2
    instance-of p2, p2, Lp1/c0;

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_3
    :goto_0
    if-nez v1, :cond_6

    iget-boolean p2, p1, Lp1/u1;->d:Z

    if-eqz p2, :cond_5

    new-instance p2, Lp1/j0;

    iget-object v0, p1, Lp1/u1;->e:Ljava/lang/Object;

    iget-object p1, p1, Lp1/u1;->c:Lp1/o2;

    if-nez p1, :cond_4

    sget-object p1, Lp1/v0;->F:Lp1/v0;

    :cond_4
    new-instance v1, Lp1/k1;

    invoke-direct {v1, v0, p1}, Lp1/k1;-><init>(Ljava/lang/Object;Lp1/o2;)V

    invoke-direct {p2, v1}, Lp1/j0;-><init>(Lp1/k1;)V

    return-object p2

    :cond_5
    new-instance p2, Lp1/v2;

    invoke-virtual {p1}, Lp1/u1;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p2, p1}, Lp1/v2;-><init>(Ljava/lang/Object;)V

    return-object p2

    :cond_6
    return-object v1
.end method
