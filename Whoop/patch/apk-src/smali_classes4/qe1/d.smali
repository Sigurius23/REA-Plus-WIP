.class public final Lqe1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lqe1/d;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/design/models/items/ArticleTileCarouselModel;",
        "Lqe1/c;",
        "b",
        "(Lcom/whoop/design/models/items/ArticleTileCarouselModel;)Lqe1/c;",
        "Lle1/b;",
        "result",
        "a",
        "(Lle1/b;)Lqe1/c;",
        "education_release"
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

.method private final b(Lcom/whoop/design/models/items/ArticleTileCarouselModel;)Lqe1/c;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v1, v0, v1}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object p1

    instance-of v0, p1, Lh51/f;

    if-eqz v0, :cond_0

    move-object v1, p1

    check-cast v1, Lh51/f;

    :cond_0
    if-eqz v1, :cond_1

    new-instance p1, Lqe1/c$b;

    invoke-direct {p1, v1}, Lqe1/c$b;-><init>(Lh51/f;)V

    return-object p1

    :cond_1
    sget-object p1, Lqe1/c$a;->a:Lqe1/c$a;

    return-object p1
.end method


# virtual methods
.method public final a(Lle1/b;)Lqe1/c;
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lle1/b$b;

    if-eqz v0, :cond_0

    check-cast p1, Lle1/b$b;

    invoke-virtual {p1}, Lle1/b$b;->a()Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    move-result-object p1

    invoke-direct {p0, p1}, Lqe1/d;->b(Lcom/whoop/design/models/items/ArticleTileCarouselModel;)Lqe1/c;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, p1, Lle1/b$a;

    if-eqz p1, :cond_1

    sget-object p1, Lqe1/c$a;->a:Lqe1/c$a;

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
