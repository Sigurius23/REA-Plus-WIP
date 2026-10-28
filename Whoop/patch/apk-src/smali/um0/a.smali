.class public abstract Lum0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\n\u0010\u0008J\u0010\u0010\u000c\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\rJ&\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u0097@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u0017\u0010\u0008J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u0019\u0010\u0008J\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u00a5@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u00a5@\u00a2\u0006\u0004\u0008\u001f\u0010\u0008J\u001e\u0010 \u001a\u00020\u00142\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u00a5@\u00a2\u0006\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lum0/a;",
        "",
        "<init>",
        "()V",
        "",
        "uri",
        "Lum0/d;",
        "h",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "",
        "b",
        "",
        "g",
        "(Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lum0/c;",
        "entry",
        "",
        "Lum0/f;",
        "scopes",
        "Ll83/a0;",
        "j",
        "(Lum0/c;Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "e",
        "scope",
        "d",
        "keep",
        "c",
        "(ILq83/d;)Ljava/lang/Object;",
        "l",
        "(Lum0/c;Lq83/d;)Ljava/lang/Object;",
        "f",
        "i",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "cache_release"
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static k(Lum0/a;Lum0/c;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lum0/a;",
            "Lum0/c;",
            "Ljava/util/List<",
            "Lum0/f;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lum0/a$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lum0/a$a;

    iget v1, v0, Lum0/a$a;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lum0/a$a;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lum0/a$a;

    invoke-direct {v0, p0, p3}, Lum0/a$a;-><init>(Lum0/a;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lum0/a$a;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lum0/a$a;->F:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, Lum0/a$a;->y:Ljava/lang/Object;

    check-cast p0, Ljava/util/List;

    iget-object p0, v0, Lum0/a$a;->x:Ljava/lang/Object;

    check-cast p0, Lum0/c;

    iget-object p0, v0, Lum0/a$a;->w:Ljava/lang/Object;

    check-cast p0, Lum0/a;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lum0/a$a;->y:Ljava/lang/Object;

    check-cast p0, Ljava/util/List;

    iget-object p1, v0, Lum0/a$a;->x:Ljava/lang/Object;

    check-cast p1, Lum0/c;

    iget-object p1, v0, Lum0/a$a;->w:Ljava/lang/Object;

    check-cast p1, Lum0/a;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p0, v0, Lum0/a$a;->y:Ljava/lang/Object;

    move-object p2, p0

    check-cast p2, Ljava/util/List;

    iget-object p0, v0, Lum0/a$a;->x:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Lum0/c;

    iget-object p0, v0, Lum0/a$a;->w:Ljava/lang/Object;

    check-cast p0, Lum0/a;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lum0/a$a;->w:Ljava/lang/Object;

    iput-object p1, v0, Lum0/a$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lum0/a$a;->y:Ljava/lang/Object;

    iput v6, v0, Lum0/a$a;->F:I

    invoke-virtual {p0, p1, v0}, Lum0/a;->l(Lum0/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    invoke-virtual {p1}, Lum0/c;->c()Ljava/lang/String;

    move-result-object p1

    iput-object p0, v0, Lum0/a$a;->w:Ljava/lang/Object;

    iput-object v7, v0, Lum0/a$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lum0/a$a;->y:Ljava/lang/Object;

    iput v5, v0, Lum0/a$a;->F:I

    invoke-virtual {p0, p1, v0}, Lum0/a;->f(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_3

    :cond_6
    move-object p1, p0

    move-object p0, p2

    :goto_2
    move-object p2, p0

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_7

    iput-object v7, v0, Lum0/a$a;->w:Ljava/lang/Object;

    iput-object v7, v0, Lum0/a$a;->x:Ljava/lang/Object;

    iput-object v7, v0, Lum0/a$a;->y:Ljava/lang/Object;

    iput v4, v0, Lum0/a$a;->F:I

    invoke-virtual {p1, p0, v0}, Lum0/a;->i(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    :goto_4
    return-object v3
.end method


# virtual methods
.method public abstract a(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract c(ILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract d(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract e(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract f(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract g(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract h(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lum0/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract i(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lum0/f;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public j(Lum0/c;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lum0/c;",
            "Ljava/util/List<",
            "Lum0/f;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lum0/a;->k(Lum0/a;Lum0/c;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract l(Lum0/c;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lum0/c;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
