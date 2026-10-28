.class public final Lqc3/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc3/g;
.implements Lqc3/q0;
.implements Luc3/b;


# instance fields
.field public final a:Lqc3/s;

.field public final b:Lqc3/u;


# direct methods
.method public constructor <init>(Lqc3/s;Lqc3/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqc3/t;->a:Lqc3/s;

    iput-object p2, p0, Lqc3/t;->b:Lqc3/u;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 13

    new-instance v0, Lqc3/t;

    new-instance v1, Lqc3/s;

    iget-object v2, p0, Lqc3/t;->a:Lqc3/s;

    iget-object v3, v2, Lqc3/s;->a:Lqc3/w;

    new-instance v4, Lqc3/w;

    iget-object v5, v3, Lqc3/w;->a:Ljava/lang/Integer;

    iget-object v3, v3, Lqc3/w;->b:Ljava/lang/Integer;

    invoke-direct {v4, v5, v3}, Lqc3/w;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    iget-object v3, v2, Lqc3/s;->b:Ljava/lang/Integer;

    iget-object v5, v2, Lqc3/s;->c:Ljava/lang/Integer;

    iget-object v2, v2, Lqc3/s;->d:Ljava/lang/Integer;

    invoke-direct {v1, v4, v3, v5, v2}, Lqc3/s;-><init>(Lqc3/w;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    new-instance v6, Lqc3/u;

    iget-object v2, p0, Lqc3/t;->b:Lqc3/u;

    iget-object v7, v2, Lqc3/u;->a:Ljava/lang/Integer;

    iget-object v8, v2, Lqc3/u;->b:Ljava/lang/Integer;

    iget-object v9, v2, Lqc3/u;->c:Lqc3/f;

    iget-object v10, v2, Lqc3/u;->d:Ljava/lang/Integer;

    iget-object v11, v2, Lqc3/u;->e:Ljava/lang/Integer;

    iget-object v12, v2, Lqc3/u;->f:Ljava/lang/Integer;

    invoke-direct/range {v6 .. v12}, Lqc3/u;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lqc3/f;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    invoke-direct {v0, v1, v6}, Lqc3/t;-><init>(Lqc3/s;Lqc3/u;)V

    return-object v0
.end method

.method public final b(Lrc3/a;)V
    .locals 1

    iget-object v0, p0, Lqc3/t;->b:Lqc3/u;

    invoke-interface {v0, p1}, Lqc3/q0;->b(Lrc3/a;)V

    return-void
.end method

.method public final c()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lqc3/t;->b:Lqc3/u;

    iget-object v0, v0, Lqc3/u;->f:Ljava/lang/Integer;

    return-object v0
.end method

.method public final d()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lqc3/t;->b:Lqc3/u;

    iget-object v0, v0, Lqc3/u;->b:Ljava/lang/Integer;

    return-object v0
.end method

.method public final e(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Lqc3/t;->a:Lqc3/s;

    iput-object p1, v0, Lqc3/s;->b:Ljava/lang/Integer;

    return-void
.end method

.method public final f(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Lqc3/t;->a:Lqc3/s;

    iput-object p1, v0, Lqc3/s;->c:Ljava/lang/Integer;

    return-void
.end method

.method public final g()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lqc3/t;->b:Lqc3/u;

    iget-object v0, v0, Lqc3/u;->e:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getDayOfWeek()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lqc3/t;->a:Lqc3/s;

    iget-object v0, v0, Lqc3/s;->c:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getDayOfYear()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lqc3/t;->a:Lqc3/s;

    iget-object v0, v0, Lqc3/s;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getYear()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lqc3/t;->a:Lqc3/s;

    iget-object v0, v0, Lqc3/s;->a:Lqc3/w;

    iget-object v0, v0, Lqc3/w;->a:Ljava/lang/Integer;

    return-object v0
.end method

.method public final h(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Lqc3/t;->b:Lqc3/u;

    iput-object p1, v0, Lqc3/u;->e:Ljava/lang/Integer;

    return-void
.end method

.method public final i(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Lqc3/t;->a:Lqc3/s;

    iput-object p1, v0, Lqc3/s;->d:Ljava/lang/Integer;

    return-void
.end method

.method public final j()Lqc3/f;
    .locals 1

    iget-object v0, p0, Lqc3/t;->b:Lqc3/u;

    iget-object v0, v0, Lqc3/u;->c:Lqc3/f;

    return-object v0
.end method

.method public final k(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Lqc3/t;->b:Lqc3/u;

    iput-object p1, v0, Lqc3/u;->b:Ljava/lang/Integer;

    return-void
.end method

.method public final l(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Lqc3/t;->b:Lqc3/u;

    iput-object p1, v0, Lqc3/u;->f:Ljava/lang/Integer;

    return-void
.end method

.method public final m(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Lqc3/t;->a:Lqc3/s;

    iget-object v0, v0, Lqc3/s;->a:Lqc3/w;

    iput-object p1, v0, Lqc3/w;->b:Ljava/lang/Integer;

    return-void
.end method

.method public final n()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lqc3/t;->b:Lqc3/u;

    iget-object v0, v0, Lqc3/u;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public final o(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Lqc3/t;->b:Lqc3/u;

    iput-object p1, v0, Lqc3/u;->d:Ljava/lang/Integer;

    return-void
.end method

.method public final p()Lrc3/a;
    .locals 1

    iget-object v0, p0, Lqc3/t;->b:Lqc3/u;

    invoke-interface {v0}, Lqc3/q0;->p()Lrc3/a;

    move-result-object v0

    return-object v0
.end method

.method public final q()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lqc3/t;->a:Lqc3/s;

    iget-object v0, v0, Lqc3/s;->b:Ljava/lang/Integer;

    return-object v0
.end method

.method public final r(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Lqc3/t;->a:Lqc3/s;

    iget-object v0, v0, Lqc3/s;->a:Lqc3/w;

    iput-object p1, v0, Lqc3/w;->a:Ljava/lang/Integer;

    return-void
.end method

.method public final s()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lqc3/t;->a:Lqc3/s;

    iget-object v0, v0, Lqc3/s;->a:Lqc3/w;

    iget-object v0, v0, Lqc3/w;->b:Ljava/lang/Integer;

    return-object v0
.end method

.method public final t(Lqc3/f;)V
    .locals 1

    iget-object v0, p0, Lqc3/t;->b:Lqc3/u;

    iput-object p1, v0, Lqc3/u;->c:Lqc3/f;

    return-void
.end method

.method public final u(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Lqc3/t;->b:Lqc3/u;

    iput-object p1, v0, Lqc3/u;->a:Ljava/lang/Integer;

    return-void
.end method

.method public final v()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lqc3/t;->b:Lqc3/u;

    iget-object v0, v0, Lqc3/u;->a:Ljava/lang/Integer;

    return-object v0
.end method
