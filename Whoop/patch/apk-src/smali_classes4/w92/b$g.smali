.class final Lw92/b$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw92/b;->k(IILq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "Lnu0/a;",
        "<anonymous>",
        "(Lbc3/c0;)Ljava/util/List;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.service.store.heartdata.HeartDataTableRoom$queryRoomDbForOldestDataByVersion$2"
    f = "HeartDataTableRoom.kt"
    l = {
        0x87
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lw92/b;

.field final synthetic y:I

.field final synthetic z:I


# direct methods
.method public constructor <init>(Lw92/b;IILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw92/b;",
            "II",
            "Lq83/d<",
            "-",
            "Lw92/b$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lw92/b$g;->x:Lw92/b;

    iput p2, p0, Lw92/b$g;->y:I

    iput p3, p0, Lw92/b$g;->z:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lw92/b$g;

    iget-object v0, p0, Lw92/b$g;->x:Lw92/b;

    iget v1, p0, Lw92/b$g;->y:I

    iget v2, p0, Lw92/b$g;->z:I

    invoke-direct {p1, v0, v1, v2, p2}, Lw92/b$g;-><init>(Lw92/b;IILq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lnu0/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lw92/b$g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lw92/b$g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lw92/b$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lw92/b$g;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lw92/b$g;->w:I

    const/4 v2, 0x0

    const-string v3, ") from Room"

    const-string v4, " packets with version "

    const/4 v5, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v5, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lw92/b$g;->x:Lw92/b;

    invoke-static {p1}, Lw92/b;->d(Lw92/b;)Lmu0/a;

    move-result-object p1

    iget v1, p0, Lw92/b$g;->y:I

    iget v6, p0, Lw92/b$g;->z:I

    iput v5, p0, Lw92/b$g;->w:I

    const v5, 0x9999

    invoke-interface {p1, v1, v6, v5, p0}, Lmu0/a;->j(IIILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/util/List;
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_1
    iget-object v0, p0, Lw92/b$g;->x:Lw92/b;

    invoke-static {v0}, Lw92/b;->c(Lw92/b;)Ltr2/n;

    move-result-object v0

    iget v1, p0, Lw92/b$g;->y:I

    iget v5, p0, Lw92/b$g;->z:I

    const-string v6, "Caught an exception when trying to fetch metrics data (R"

    invoke-static {v1, v5, v6, v4, v3}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_3

    :goto_2
    iget-object v0, p0, Lw92/b$g;->x:Lw92/b;

    invoke-static {v0}, Lw92/b;->c(Lw92/b;)Ltr2/n;

    move-result-object v0

    iget v1, p0, Lw92/b$g;->y:I

    iget v5, p0, Lw92/b$g;->z:I

    const-string v6, "Caught a SQLiteException when trying to fetch metrics data (R"

    invoke-static {v1, v5, v6, v4, v3}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_3
    const/4 p1, 0x0

    return-object p1
.end method
