.class public abstract Lbe3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne3/p0;


# instance fields
.field public final w:Lud3/e0;

.field public final x:Lne3/t;

.field public y:Z

.field public final synthetic z:Lbe3/g;


# direct methods
.method public constructor <init>(Lbe3/g;Lud3/e0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lbe3/a;->z:Lbe3/g;

    iput-object p2, p0, Lbe3/a;->w:Lud3/e0;

    new-instance p2, Lne3/t;

    iget-object p1, p1, Lbe3/g;->c:Ls/m2;

    iget-object p1, p1, Ls/m2;->x:Ljava/lang/Object;

    check-cast p1, Lne3/j0;

    iget-object p1, p1, Lne3/j0;->w:Lne3/p0;

    invoke-interface {p1}, Lne3/p0;->timeout()Lne3/r0;

    move-result-object p1

    invoke-direct {p2, p1}, Lne3/t;-><init>(Lne3/r0;)V

    iput-object p2, p0, Lbe3/a;->x:Lne3/t;

    return-void
.end method


# virtual methods
.method public final b(Lud3/d0;)V
    .locals 5

    const-string v0, "trailers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbe3/a;->z:Lbe3/g;

    iget v1, v0, Lbe3/g;->d:I

    const/4 v2, 0x6

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x5

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Lbe3/a;->x:Lne3/t;

    iget-object v3, v1, Lne3/t;->e:Lne3/r0;

    sget-object v4, Lne3/r0;->d:Lne3/q0;

    iput-object v4, v1, Lne3/t;->e:Lne3/r0;

    invoke-virtual {v3}, Lne3/r0;->a()Lne3/r0;

    invoke-virtual {v3}, Lne3/r0;->b()Lne3/r0;

    iput v2, v0, Lbe3/g;->d:I

    invoke-virtual {p1}, Lud3/d0;->size()I

    move-result v1

    if-lez v1, :cond_1

    iget-object v0, v0, Lbe3/g;->a:Lud3/l0;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lud3/l0;->j:Lud3/t;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lbe3/a;->w:Lud3/e0;

    invoke-static {v0, v1, p1}, Lae3/h;->d(Lud3/t;Lud3/e0;Lud3/d0;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "state: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, v0, Lbe3/g;->d:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h1(Lne3/h;J)J
    .locals 2

    iget-object v0, p0, Lbe3/a;->z:Lbe3/g;

    const-string v1, "sink"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v1, v0, Lbe3/g;->c:Ls/m2;

    iget-object v1, v1, Ls/m2;->x:Ljava/lang/Object;

    check-cast v1, Lne3/j0;

    invoke-virtual {v1, p1, p2, p3}, Lne3/j0;->h1(Lne3/h;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    iget-object p2, v0, Lbe3/g;->b:Lae3/f;

    invoke-interface {p2}, Lae3/f;->c()V

    sget-object p2, Lbe3/g;->f:Lud3/d0;

    invoke-virtual {p0, p2}, Lbe3/a;->b(Lud3/d0;)V

    throw p1
.end method

.method public final timeout()Lne3/r0;
    .locals 1

    iget-object v0, p0, Lbe3/a;->x:Lne3/t;

    return-object v0
.end method
