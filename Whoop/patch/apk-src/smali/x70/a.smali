.class public final Lx70/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx70/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000f\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lx70/a;",
        "",
        "Lt70/a;",
        "analytics",
        "<init>",
        "(Lt70/a;)V",
        "Ly70/a$i;",
        "event",
        "Ly70/a;",
        "a",
        "(Ly70/a$i;)Ly70/a;",
        "Lcom/whoop/navigation/e;",
        "navAction",
        "b",
        "(Lcom/whoop/navigation/e;)Ly70/a;",
        "actionEvent",
        "c",
        "(Ly70/a;)Ly70/a;",
        "Lt70/a;",
        "activation_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Lx70/a$a;

.field public static final c:I


# instance fields
.field private final a:Lt70/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx70/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx70/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lx70/a;->b:Lx70/a$a;

    const/16 v0, 0x8

    sput v0, Lx70/a;->c:I

    return-void
.end method

.method public constructor <init>(Lt70/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx70/a;->a:Lt70/a;

    return-void
.end method

.method private final a(Ly70/a$i;)Ly70/a;
    .locals 10

    invoke-virtual {p1}, Ly70/a$i;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lu70/f;

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Ly70/a$i;->a()Lm91/u;

    move-result-object p1

    instance-of v1, p1, Ly71/o;

    if-eqz v1, :cond_2

    check-cast p1, Ly71/o;

    invoke-virtual {p1}, Ly71/o;->h()Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-direct {p0, p1}, Lx70/a;->b(Lcom/whoop/navigation/e;)Ly70/a;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    new-instance p1, Ly70/a$b;

    check-cast v0, Lm91/u;

    invoke-direct {p1, v0}, Ly70/a$b;-><init>(Lm91/u;)V

    return-object p1

    :cond_2
    new-instance p1, Ly70/a$b;

    check-cast v0, Lm91/u;

    invoke-direct {p1, v0}, Ly70/a$b;-><init>(Lm91/u;)V

    return-object p1

    :cond_3
    instance-of p1, v0, Lny0/h;

    if-eqz p1, :cond_4

    check-cast v0, Lny0/h;

    invoke-virtual {v0}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {p0, p1}, Lx70/a;->b(Lcom/whoop/navigation/e;)Ly70/a;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, v0, Lm91/u;

    if-eqz p1, :cond_5

    new-instance p1, Ly70/a$b;

    check-cast v0, Lm91/u;

    invoke-direct {p1, v0}, Ly70/a$b;-><init>(Lm91/u;)V

    return-object p1

    :cond_5
    instance-of p1, v0, Lcom/whoop/navigation/e;

    if-eqz p1, :cond_6

    check-cast v0, Lcom/whoop/navigation/e;

    invoke-direct {p0, v0}, Lx70/a;->b(Lcom/whoop/navigation/e;)Ly70/a;

    move-result-object p1

    return-object p1

    :cond_6
    instance-of p1, v0, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    if-eqz p1, :cond_9

    check-cast v0, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getType()Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/models/items/ArticleTileCarouselModelKt;->isVideo(Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;)Z

    move-result p1

    if-eqz p1, :cond_7

    new-instance p1, Ly70/a$d;

    new-instance v1, Lj02/m0$g3;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lj02/m0$g3;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v1}, Ly70/a$d;-><init>(Lj02/m0;)V

    return-object p1

    :cond_7
    invoke-virtual {v0}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getId()Ljava/lang/String;

    move-result-object p1

    const-string v1, "UTF-8"

    invoke-static {p1, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance p1, Ly70/a$d;

    new-instance v2, Lj02/m0$f3;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getTag()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_8

    const-string v0, ""

    :cond_8
    move-object v4, v0

    const/16 v8, 0x18

    const/4 v9, 0x0

    const-string v5, "Order Confirmation"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lj02/m0$f3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v2}, Ly70/a$d;-><init>(Lj02/m0;)V

    return-object p1

    :cond_9
    const/4 p1, 0x0

    return-object p1
.end method

.method private final b(Lcom/whoop/navigation/e;)Ly70/a;
    .locals 2

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    sget-object v1, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ly70/a$e;

    invoke-direct {v0, p1}, Ly70/a$e;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0

    :cond_0
    new-instance v0, Ly70/a$c;

    invoke-direct {v0, p1}, Ly70/a$c;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0
.end method


# virtual methods
.method public final c(Ly70/a;)Ly70/a;
    .locals 2

    const-string v0, "actionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ly70/a$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lx70/a;->a:Lt70/a;

    move-object v1, p1

    check-cast v1, Ly70/a$a;

    invoke-virtual {v0, v1}, Lt70/a;->b(Ly70/a$a;)V

    :cond_0
    instance-of v0, p1, Ly70/a$i;

    if-eqz v0, :cond_1

    check-cast p1, Ly70/a$i;

    invoke-direct {p0, p1}, Lx70/a;->a(Ly70/a$i;)Ly70/a;

    move-result-object p1

    :cond_1
    return-object p1
.end method
