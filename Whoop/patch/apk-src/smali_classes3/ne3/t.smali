.class public final Lne3/t;
.super Lne3/r0;
.source "SourceFile"


# instance fields
.field public e:Lne3/r0;


# direct methods
.method public constructor <init>(Lne3/r0;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lne3/t;->e:Lne3/r0;

    return-void
.end method


# virtual methods
.method public final a()Lne3/r0;
    .locals 1

    iget-object v0, p0, Lne3/t;->e:Lne3/r0;

    invoke-virtual {v0}, Lne3/r0;->a()Lne3/r0;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lne3/r0;
    .locals 1

    iget-object v0, p0, Lne3/t;->e:Lne3/r0;

    invoke-virtual {v0}, Lne3/r0;->b()Lne3/r0;

    move-result-object v0

    return-object v0
.end method

.method public final c()J
    .locals 2

    iget-object v0, p0, Lne3/t;->e:Lne3/r0;

    invoke-virtual {v0}, Lne3/r0;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d(J)Lne3/r0;
    .locals 1

    iget-object v0, p0, Lne3/t;->e:Lne3/r0;

    invoke-virtual {v0, p1, p2}, Lne3/r0;->d(J)Lne3/r0;

    move-result-object p1

    return-object p1
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lne3/t;->e:Lne3/r0;

    invoke-virtual {v0}, Lne3/r0;->e()Z

    move-result v0

    return v0
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Lne3/t;->e:Lne3/r0;

    invoke-virtual {v0}, Lne3/r0;->f()V

    return-void
.end method

.method public final g(JLjava/util/concurrent/TimeUnit;)Lne3/r0;
    .locals 1

    const-string v0, "unit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lne3/t;->e:Lne3/r0;

    invoke-virtual {v0, p1, p2, p3}, Lne3/r0;->g(JLjava/util/concurrent/TimeUnit;)Lne3/r0;

    move-result-object p1

    return-object p1
.end method

.method public final h()J
    .locals 2

    iget-object v0, p0, Lne3/t;->e:Lne3/r0;

    invoke-virtual {v0}, Lne3/r0;->h()J

    move-result-wide v0

    return-wide v0
.end method
