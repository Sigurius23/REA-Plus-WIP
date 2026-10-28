.class public final Lhd2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t*\u00020\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lhd2/e;",
        "",
        "Ljb1/a;",
        "designItemReducer",
        "<init>",
        "(Ljb1/a;)V",
        "Led2/b;",
        "",
        "source",
        "Lhd2/d;",
        "d",
        "(Led2/b;Ljava/lang/String;)Lhd2/d;",
        "Lcom/whoop/share/model/ShareResponse;",
        "navigationSource",
        "Lhd2/d$a;",
        "b",
        "(Lcom/whoop/share/model/ShareResponse;Ljava/lang/String;)Lhd2/d$a;",
        "Lcom/whoop/share/model/ShareAsset;",
        "Lhd2/d$b;",
        "c",
        "(Lcom/whoop/share/model/ShareAsset;)Lhd2/d$b;",
        "domainResult",
        "a",
        "Ljb1/a;",
        "share_release"
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
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lhd2/e;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lhd2/e;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lhd2/f;->e()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lhd2/e;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final b(Lcom/whoop/share/model/ShareResponse;Ljava/lang/String;)Lhd2/d$a;
    .locals 3

    invoke-virtual {p1}, Lcom/whoop/share/model/ShareResponse;->getAssets()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/share/model/ShareResponse;->getAssets()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/share/model/ShareAsset;

    invoke-direct {p0, v2}, Lhd2/e;->c(Lcom/whoop/share/model/ShareAsset;)Lhd2/d$b;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_1
    const/4 p1, 0x0

    return-object p1

    :cond_3
    if-eqz p2, :cond_4

    const-string v0, "source"

    invoke-static {v0, p2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/share/model/ShareResponse;->getAnalyticProperties()Ljava/util/Map;

    move-result-object v0

    invoke-static {p2, v0}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p2

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lcom/whoop/share/model/ShareResponse;->getAnalyticProperties()Ljava/util/Map;

    move-result-object p2

    :goto_2
    new-instance v0, Lhd2/d$a;

    invoke-virtual {p1}, Lcom/whoop/share/model/ShareResponse;->getTitle()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2, v1}, Lhd2/d$a;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V

    return-object v0
.end method

.method private final c(Lcom/whoop/share/model/ShareAsset;)Lhd2/d$b;
    .locals 11

    iget-object v0, p0, Lhd2/e;->a:Ljb1/a;

    invoke-virtual {p1}, Lcom/whoop/share/model/ShareAsset;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/share/model/ShareAsset;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/share/model/ShareAsset;->getFileName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/share/model/ShareAsset;->getBackground()Lcom/whoop/share/model/ShareBackground;

    move-result-object v6

    invoke-virtual {p1}, Lcom/whoop/share/model/ShareAsset;->getStyle()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    sget-object v0, Lcom/whoop/share/model/StyleType;->DEFAULT:Lcom/whoop/share/model/StyleType;

    invoke-static {}, Lcom/whoop/share/model/StyleType;->values()[Lcom/whoop/share/model/StyleType;

    move-result-object v2

    array-length v7, v2

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_2

    aget-object v9, v2, v8

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    move-object v1, v9

    goto :goto_1

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    move-object v0, v1

    :goto_2
    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    :goto_3
    move-object v7, v0

    goto :goto_5

    :cond_5
    :goto_4
    sget-object v0, Lcom/whoop/share/model/StyleType;->DEFAULT:Lcom/whoop/share/model/StyleType;

    goto :goto_3

    :goto_5
    new-instance v2, Lhd2/d$b;

    invoke-direct/range {v2 .. v7}, Lhd2/d$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/share/model/ShareBackground;Lcom/whoop/share/model/StyleType;)V

    return-object v2
.end method

.method private final d(Led2/b;Ljava/lang/String;)Lhd2/d;
    .locals 4

    new-instance v0, Lhd2/d;

    invoke-virtual {p1}, Led2/b;->d()Z

    move-result v1

    invoke-virtual {p1}, Led2/b;->c()Z

    move-result v2

    invoke-virtual {p1}, Led2/b;->b()Z

    move-result v3

    invoke-virtual {p1}, Led2/b;->a()Lcom/whoop/share/model/ShareResponse;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p1, p2}, Lhd2/e;->b(Lcom/whoop/share/model/ShareResponse;Ljava/lang/String;)Lhd2/d$a;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v0, v1, v2, v3, p1}, Lhd2/d;-><init>(ZZZLhd2/d$a;)V

    return-object v0
.end method


# virtual methods
.method public final a(Led2/b;Ljava/lang/String;)Lhd2/d;
    .locals 1

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lhd2/e;->d(Led2/b;Ljava/lang/String;)Lhd2/d;

    move-result-object p1

    return-object p1
.end method
