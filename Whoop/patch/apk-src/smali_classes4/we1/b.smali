.class public interface abstract Lwe1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008g\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0097@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001e\u0010\u0008\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0016\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\n\u00a8\u0006\u000c\u00c0\u0006\u0003"
    }
    d2 = {
        "Lwe1/b;",
        "",
        "",
        "Lwe1/e;",
        "entitlements",
        "Ll83/a0;",
        "b",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "a",
        "deleteAll",
        "(Lq83/d;)Ljava/lang/Object;",
        "getEntitlements",
        "entitlements_release"
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
.method public static c(Lwe1/b;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwe1/b;",
            "Ljava/util/List<",
            "Lwe1/e;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lwe1/b$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwe1/b$a;

    iget v1, v0, Lwe1/b$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwe1/b$a;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwe1/b$a;

    invoke-direct {v0, p0, p2}, Lwe1/b$a;-><init>(Lwe1/b;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lwe1/b$a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwe1/b$a;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lwe1/b$a;->x:Ljava/lang/Object;

    check-cast p0, Ljava/util/List;

    iget-object p0, v0, Lwe1/b$a;->w:Ljava/lang/Object;

    check-cast p0, Lwe1/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lwe1/b$a;->x:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Ljava/util/List;

    iget-object p0, v0, Lwe1/b$a;->w:Ljava/lang/Object;

    check-cast p0, Lwe1/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lwe1/b$a;->w:Ljava/lang/Object;

    iput-object p1, v0, Lwe1/b$a;->x:Ljava/lang/Object;

    iput v4, v0, Lwe1/b$a;->E:I

    invoke-interface {p0, v0}, Lwe1/b;->deleteAll(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    const/4 p2, 0x0

    iput-object p2, v0, Lwe1/b$a;->w:Ljava/lang/Object;

    iput-object p2, v0, Lwe1/b$a;->x:Ljava/lang/Object;

    iput v3, v0, Lwe1/b$a;->E:I

    invoke-interface {p0, p1, v0}, Lwe1/b;->a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

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
.method public abstract a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lwe1/e;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public b(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lwe1/e;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lwe1/b;->c(Lwe1/b;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract deleteAll(Lq83/d;)Ljava/lang/Object;
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

.method public abstract getEntitlements(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lwe1/e;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
