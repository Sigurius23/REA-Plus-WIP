.class public final Lb00/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ly00/c8;

.field public final b:Z

.field public final c:Z

.field public final d:Z


# direct methods
.method public constructor <init>(Lwz/g0;)V
    .locals 3

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iget-object v0, p1, Lwz/g0;->w:Ly00/c8;

    .line 7
    iget-boolean v1, p1, Lwz/g0;->P:Z

    .line 8
    iget-boolean v2, p1, Lwz/g0;->Q:Z

    .line 9
    iget-boolean p1, p1, Lwz/g0;->R:Z

    .line 10
    invoke-direct {p0, v0, v1, v2, p1}, Lb00/a;-><init>(Ly00/c8;ZZZ)V

    return-void
.end method

.method public constructor <init>(Ly00/c8;ZZZ)V
    .locals 1

    const-string v0, "stripeIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lb00/a;->a:Ly00/c8;

    .line 3
    iput-boolean p2, p0, Lb00/a;->b:Z

    .line 4
    iput-boolean p3, p0, Lb00/a;->c:Z

    .line 5
    iput-boolean p4, p0, Lb00/a;->d:Z

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    iget-object v0, p0, Lb00/a;->a:Ly00/c8;

    invoke-interface {v0}, Ly00/c8;->q0()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lbz/d;->a:Lbz/d;

    sget-object v1, Lbz/f;->a:Lbz/f;

    invoke-virtual {v1, v0}, Lbz/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    sget-object v0, Lbz/e;->a:Lbz/e;

    invoke-virtual {v1, v0}, Lbz/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    invoke-virtual {v1, v1}, Lbz/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_0
    iget-boolean v0, p0, Lb00/a;->b:Z

    return v0

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public final b()Z
    .locals 2

    iget-object v0, p0, Lb00/a;->a:Ly00/c8;

    invoke-interface {v0}, Ly00/c8;->q0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lb00/a;->a()Z

    move-result v0

    return v0

    :cond_0
    sget-object v0, Lbz/d;->a:Lbz/d;

    sget-object v1, Lbz/f;->a:Lbz/f;

    invoke-virtual {v1, v0}, Lbz/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    sget-object v0, Lbz/e;->a:Lbz/e;

    invoke-virtual {v1, v0}, Lbz/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    invoke-virtual {v1, v1}, Lbz/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lb00/a;->a()Z

    move-result v0

    return v0

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
