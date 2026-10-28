.class public final Lfh1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0013\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lfh1/a;",
        "",
        "Lch1/b;",
        "analytics",
        "<init>",
        "(Lch1/b;)V",
        "Lgh1/b$f;",
        "event",
        "Lgh1/b;",
        "a",
        "(Lgh1/b$f;)Lgh1/b;",
        "Lm91/u;",
        "itemViewState",
        "b",
        "(Lm91/u;)Lgh1/b;",
        "Lcom/whoop/navigation/e;",
        "navAction",
        "c",
        "(Lcom/whoop/navigation/e;)Lgh1/b;",
        "actionEvent",
        "d",
        "(Lgh1/b;)Lgh1/b;",
        "Lch1/b;",
        "gifting_release"
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
.field private final a:Lch1/b;


# direct methods
.method public constructor <init>(Lch1/b;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfh1/a;->a:Lch1/b;

    return-void
.end method

.method private final a(Lgh1/b$f;)Lgh1/b;
    .locals 1

    invoke-virtual {p1}, Lgh1/b$f;->b()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lcom/whoop/whoopaction/domain/models/Action;

    if-eqz v0, :cond_0

    new-instance v0, Lgh1/b$h;

    check-cast p1, Lcom/whoop/whoopaction/domain/models/Action;

    invoke-direct {v0, p1}, Lgh1/b$h;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lm91/u;

    if-eqz v0, :cond_1

    check-cast p1, Lm91/u;

    invoke-direct {p0, p1}, Lfh1/a;->b(Lm91/u;)Lgh1/b;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-direct {p0, p1}, Lfh1/a;->c(Lcom/whoop/navigation/e;)Lgh1/b;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private final b(Lm91/u;)Lgh1/b;
    .locals 1

    instance-of v0, p1, Lny0/h;

    if-eqz v0, :cond_1

    check-cast p1, Lny0/h;

    invoke-virtual {p1}, Lny0/h;->c()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v0

    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz v0, :cond_0

    new-instance p1, Lgh1/b$h;

    invoke-direct {p1, v0}, Lgh1/b$h;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lfh1/a;->c(Lcom/whoop/navigation/e;)Lgh1/b;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private final c(Lcom/whoop/navigation/e;)Lgh1/b;
    .locals 2

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    sget-object v1, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lgh1/b$b;

    invoke-direct {v0, p1}, Lgh1/b$b;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0

    :cond_0
    sget-object p1, Lgh1/b$d;->a:Lgh1/b$d;

    return-object p1
.end method


# virtual methods
.method public final d(Lgh1/b;)Lgh1/b;
    .locals 2

    const-string v0, "actionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lgh1/b$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lfh1/a;->a:Lch1/b;

    move-object v1, p1

    check-cast v1, Lgh1/b$a;

    invoke-virtual {v0, v1}, Lch1/b;->c(Lgh1/b$a;)V

    :cond_0
    instance-of v0, p1, Lgh1/b$f;

    if-eqz v0, :cond_1

    check-cast p1, Lgh1/b$f;

    invoke-direct {p0, p1}, Lfh1/a;->a(Lgh1/b$f;)Lgh1/b;

    move-result-object p1

    :cond_1
    return-object p1
.end method
