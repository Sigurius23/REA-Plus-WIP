.class public abstract Lew2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a6\u0010\n\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u001c\u0010\t\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0005H\u0086@\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0015\u0010\u000e\u001a\u00020\r*\u0006\u0012\u0002\u0008\u00030\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Landroidx/work/CoroutineWorker;",
        "Lic/u;",
        "c",
        "(Landroidx/work/CoroutineWorker;)Lic/u;",
        "errorResult",
        "Lkotlin/Function1;",
        "Lq83/d;",
        "Ll83/a0;",
        "",
        "onFailureErrorResult",
        "b",
        "(Lic/u;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;",
        "Lu02/a$b;",
        "",
        "a",
        "(Lu02/a$b;)Ljava/lang/String;",
        "weightlifting_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lu02/a$b;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu02/a$b<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lu02/a$b$a;

    if-eqz v0, :cond_0

    check-cast p0, Lu02/a$b$a;

    invoke-virtual {p0}, Lu02/a$b$a;->d()I

    move-result p0

    const-string v0, "error "

    invoke-static {p0, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of p0, p0, Lu02/a$b$b;

    if-eqz p0, :cond_1

    const-string p0, "noNetwork"

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final b(Lic/u;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lic/u;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Lic/u;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lew2/a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lew2/a$a;

    iget v1, v0, Lew2/a$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lew2/a$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lew2/a$a;

    invoke-direct {v0, p2}, Lew2/a$a;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lew2/a$a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lew2/a$a;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lew2/a$a;->x:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/functions/Function1;

    iget-object p0, v0, Lew2/a$a;->w:Ljava/lang/Object;

    check-cast p0, Lic/u;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lic/r;

    invoke-direct {p2}, Lic/r;-><init>()V

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    iput-object p0, v0, Lew2/a$a;->w:Ljava/lang/Object;

    const/4 p2, 0x0

    iput-object p2, v0, Lew2/a$a;->x:Ljava/lang/Object;

    iput v3, v0, Lew2/a$a;->z:I

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p0
.end method

.method public static final c(Landroidx/work/CoroutineWorker;)Lic/u;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lic/v;->getRunAttemptCount()I

    move-result p0

    const/16 v0, 0x64

    if-lt p0, v0, :cond_0

    new-instance p0, Lic/r;

    invoke-direct {p0}, Lic/r;-><init>()V

    return-object p0

    :cond_0
    new-instance p0, Lic/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0
.end method
