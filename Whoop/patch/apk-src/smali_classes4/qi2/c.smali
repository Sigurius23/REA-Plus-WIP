.class public final Lqi2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lqi2/a;",
        "Lqi2/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003H\u0082@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ#\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00102\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lqi2/c;",
        "Lod1/g;",
        "Lqi2/a;",
        "Lqi2/b;",
        "Lcom/whoop/streaks/domain/StreaksApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/streaks/domain/StreaksApi;Ltr2/n;)V",
        "g",
        "(Lq83/d;)Ljava/lang/Object;",
        "previousResult",
        "h",
        "(Lqi2/b;)Lqi2/b;",
        "i",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/streaks/domain/StreaksApi;",
        "b",
        "Ltr2/n;",
        "streaks_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/whoop/streaks/domain/StreaksApi;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/streaks/domain/StreaksApi;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lqi2/c;->a:Lcom/whoop/streaks/domain/StreaksApi;

    .line 3
    iput-object p2, p0, Lqi2/c;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/streaks/domain/StreaksApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "StreaksInteractor"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lqi2/c;-><init>(Lcom/whoop/streaks/domain/StreaksApi;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lqi2/c;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lqi2/c;->g(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lqi2/c;)Lcom/whoop/streaks/domain/StreaksApi;
    .locals 0

    iget-object p0, p0, Lqi2/c;->a:Lcom/whoop/streaks/domain/StreaksApi;

    return-object p0
.end method

.method public static final synthetic e(Lqi2/c;Lqi2/b;)Lqi2/b;
    .locals 0

    invoke-direct {p0, p1}, Lqi2/c;->h(Lqi2/b;)Lqi2/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lqi2/c;Lqi2/b;)Lqi2/b;
    .locals 0

    invoke-direct {p0, p1}, Lqi2/c;->i(Lqi2/b;)Lqi2/b;

    move-result-object p0

    return-object p0
.end method

.method private final g(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lqi2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lqi2/c$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lqi2/c$a;

    iget v1, v0, Lqi2/c$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lqi2/c$a;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lqi2/c$a;

    invoke-direct {v0, p0, p1}, Lqi2/c$a;-><init>(Lqi2/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lqi2/c$a;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lqi2/c$a;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p1, v2

    iget-object v2, p0, Lqi2/c;->b:Ltr2/n;

    new-instance v5, Lqi2/c$b;

    const/4 v3, 0x0

    invoke-direct {v5, p0, v3}, Lqi2/c$b;-><init>(Lqi2/c;Lq83/d;)V

    iput p1, v6, Lqi2/c$a;->y:I

    const-string v4, "Failed to fetch streaks explainer page bff"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p1, Lu02/a;

    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_4

    new-instance v0, Lqi2/b$c;

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/streaks/domain/models/StreaksResponse;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, v1}, Lqi2/b$c;-><init>(Lcom/whoop/streaks/domain/models/StreaksResponse;ZZ)V

    return-object v0

    :cond_4
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_5

    sget-object p1, Lqi2/b$a;->a:Lqi2/b$a;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final h(Lqi2/b;)Lqi2/b;
    .locals 7

    instance-of v0, p1, Lqi2/b$c;

    if-eqz v0, :cond_1

    move-object v1, p1

    check-cast v1, Lqi2/b$c;

    invoke-virtual {v1}, Lqi2/b$c;->d()Z

    move-result p1

    xor-int/lit8 v3, p1, 0x1

    invoke-virtual {v1}, Lqi2/b$c;->d()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    :goto_0
    move v4, p1

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lqi2/b$c;->e()Z

    move-result p1

    goto :goto_0

    :goto_1
    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Lqi2/b$c;->b(Lqi2/b$c;Lcom/whoop/streaks/domain/models/StreaksResponse;ZZILjava/lang/Object;)Lqi2/b$c;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method private final i(Lqi2/b;)Lqi2/b;
    .locals 7

    instance-of v0, p1, Lqi2/b$c;

    if-eqz v0, :cond_1

    move-object v1, p1

    check-cast v1, Lqi2/b$c;

    invoke-virtual {v1}, Lqi2/b$c;->e()Z

    move-result p1

    xor-int/lit8 v4, p1, 0x1

    invoke-virtual {v1}, Lqi2/b$c;->e()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    :goto_0
    move v3, p1

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lqi2/b$c;->d()Z

    move-result p1

    goto :goto_0

    :goto_1
    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Lqi2/b$c;->b(Lqi2/b$c;Lcom/whoop/streaks/domain/models/StreaksResponse;ZZILjava/lang/Object;)Lqi2/b$c;

    move-result-object p1

    :cond_1
    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lqi2/b$b;->a:Lqi2/b$b;

    new-instance v1, Lqi2/c$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lqi2/c$c;-><init>(Lqi2/c;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
