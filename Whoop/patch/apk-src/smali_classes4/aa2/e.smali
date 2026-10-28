.class public interface abstract Laa2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008g\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000cJ\u0010\u0010\u000f\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u000f\u0010\u000cJ\u0010\u0010\u0010\u001a\u00020\u0004H\u0097@\u00a2\u0006\u0004\u0008\u0010\u0010\u000c\u00a8\u0006\u0011\u00c0\u0006\u0003"
    }
    d2 = {
        "Laa2/e;",
        "",
        "Laa2/g;",
        "user",
        "Ll83/a0;",
        "b",
        "(Laa2/g;Lq83/d;)Ljava/lang/Object;",
        "Laa2/i;",
        "profile",
        "e",
        "(Laa2/i;Lq83/d;)Ljava/lang/Object;",
        "d",
        "(Lq83/d;)Ljava/lang/Object;",
        "a",
        "f",
        "c",
        "h",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static g(Laa2/e;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa2/e;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Laa2/e$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Laa2/e$a;

    iget v1, v0, Laa2/e$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Laa2/e$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Laa2/e$a;

    invoke-direct {v0, p0, p1}, Laa2/e$a;-><init>(Laa2/e;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Laa2/e$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Laa2/e$a;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Laa2/e$a;->w:Ljava/lang/Object;

    check-cast p0, Laa2/e;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Laa2/e$a;->w:Ljava/lang/Object;

    check-cast p0, Laa2/e;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Laa2/e$a;->w:Ljava/lang/Object;

    iput v4, v0, Laa2/e$a;->z:I

    invoke-interface {p0, v0}, Laa2/e;->f(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    const/4 p1, 0x0

    iput-object p1, v0, Laa2/e$a;->w:Ljava/lang/Object;

    iput v3, v0, Laa2/e$a;->z:I

    invoke-interface {p0, v0}, Laa2/e;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public abstract a(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Laa2/i;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract b(Laa2/g;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa2/g;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract c(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract d(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Laa2/g;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract e(Laa2/i;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa2/i;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract f(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public h(Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1}, Laa2/e;->g(Laa2/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
