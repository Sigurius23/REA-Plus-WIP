.class public abstract Lpj1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a2\u0010\u0008\u001a\u00020\u0007*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u00012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0082@\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a<\u0010\u000c\u001a\u00020\u0007\"\u0008\u0008\u0000\u0010\n*\u00020\u0002*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0008\u0001\u0012\u00028\u00000\u00012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004H\u0082@\u00a2\u0006\u0004\u0008\u000c\u0010\t\u00a8\u0006\r"
    }
    d2 = {
        "Lb7/b;",
        "Lj93/d;",
        "Lm7/r0;",
        "recordType",
        "",
        "",
        "clientRecordIdsList",
        "Ll83/a0;",
        "c",
        "(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "T",
        "records",
        "d",
        "health-connect_release"
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
.method public static final synthetic a(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpj1/d;->c(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpj1/d;->d(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb7/b;",
            "Lj93/d;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lpj1/d$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lpj1/d$a;

    iget v1, v0, Lpj1/d$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lpj1/d$a;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lpj1/d$a;

    invoke-direct {v0, p3}, Lpj1/d$a;-><init>(Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lpj1/d$a;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lpj1/d$a;->E:I

    const-string v3, ", reason: "

    const-string v4, "Failed to delete records of type "

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v5, :cond_1

    iget-object p0, v0, Lpj1/d$a;->y:Ljava/lang/Object;

    check-cast p0, Ljava/util/List;

    iget-object p0, v0, Lpj1/d$a;->x:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Lj93/d;

    iget-object p0, v0, Lpj1/d$a;->w:Ljava/lang/Object;

    check-cast p0, Lb7/b;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p3, p2

    check-cast p3, Ljava/util/Collection;

    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_4

    :try_start_1
    sget-object p3, Lm83/y;->w:Lm83/y;

    const/4 v2, 0x0

    iput-object v2, v0, Lpj1/d$a;->w:Ljava/lang/Object;

    iput-object p1, v0, Lpj1/d$a;->x:Ljava/lang/Object;

    iput-object v2, v0, Lpj1/d$a;->y:Ljava/lang/Object;

    iput v5, v0, Lpj1/d$a;->E:I

    invoke-interface {p0, p1, p3, p2, v0}, Lb7/b;->g(Lj93/d;Lm83/y;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p0, v1, :cond_4

    return-object v1

    :goto_1
    new-instance p2, Ljava/lang/Exception;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :goto_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string p3, "Request contains invalid UID."

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_3

    :cond_3
    new-instance p2, Ljava/lang/Exception;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_4
    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lm7/r0;",
            ">(",
            "Lb7/b;",
            "Lj93/d;",
            "Ljava/util/List<",
            "+TT;>;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lpj1/d$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lpj1/d$b;

    iget v1, v0, Lpj1/d$b;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lpj1/d$b;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lpj1/d$b;

    invoke-direct {v0, p3}, Lpj1/d$b;-><init>(Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lpj1/d$b;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lpj1/d$b;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lpj1/d$b;->y:Ljava/lang/Object;

    check-cast p0, Ljava/util/List;

    iget-object p0, v0, Lpj1/d$b;->x:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Lj93/d;

    iget-object p0, v0, Lpj1/d$b;->w:Ljava/lang/Object;

    check-cast p0, Lb7/b;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p3, p2

    check-cast p3, Ljava/util/Collection;

    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_4

    const/4 p3, 0x0

    :try_start_1
    iput-object p3, v0, Lpj1/d$b;->w:Ljava/lang/Object;

    iput-object p1, v0, Lpj1/d$b;->x:Ljava/lang/Object;

    iput-object p3, v0, Lpj1/d$b;->y:Ljava/lang/Object;

    iput v3, v0, Lpj1/d$b;->E:I

    invoke-interface {p0, p2, v0}, Lb7/b;->c(Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Lp7/b;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :goto_2
    new-instance p2, Ljava/lang/Exception;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to insert records of type "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " reason: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_4
    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
