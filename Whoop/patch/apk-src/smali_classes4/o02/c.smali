.class public final Lo02/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo02/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B?\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0002\u0012(\u0008\u0002\u0010\t\u001a\"\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\u00080\u0004\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJE\u0010\u0010\u001a\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00022&\u0010\t\u001a\"\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\u00080\u0004H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0012R4\u0010\t\u001a\"\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\u00080\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0013R$\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lo02/c;",
        "Lo02/d;",
        "",
        "mappers",
        "",
        "Lj93/d;",
        "Lkotlin/Function1;",
        "Lj02/c;",
        "Lcom/whoop/navigation/reducer/NavigationScreenConfig;",
        "configs",
        "<init>",
        "(Ljava/util/List;Ljava/util/Map;)V",
        "Lcom/whoop/navigation/NavigationScreenModel;",
        "navigationScreenModel",
        "a",
        "(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;",
        "b",
        "(Ljava/util/List;Ljava/util/Map;)Lo02/d;",
        "Ljava/util/List;",
        "Ljava/util/Map;",
        "c",
        "Lkotlin/jvm/functions/Function1;",
        "default",
        "navigation_release"
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
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo02/d;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lj93/d;",
            "Lkotlin/jvm/functions/Function1;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lo02/d;",
            ">;",
            "Ljava/util/Map<",
            "Lj93/d;",
            "+",
            "Lkotlin/jvm/functions/Function1;",
            ">;)V"
        }
    .end annotation

    const-string v0, "mappers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lo02/c;->a:Ljava/util/List;

    .line 3
    iput-object p2, p0, Lo02/c;->b:Ljava/util/Map;

    .line 4
    new-instance p1, Lnm1/g;

    const/4 p2, 0x7

    invoke-direct {p1, p2}, Lnm1/g;-><init>(I)V

    iput-object p1, p0, Lo02/c;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 5
    sget-object p2, Lm83/z;->w:Lm83/z;

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Lo02/c;-><init>(Ljava/util/List;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic c(Lj02/c;)Lj02/c;
    .locals 0

    invoke-static {p0}, Lo02/c;->d(Lj02/c;)Lj02/c;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lj02/c;)Lj02/c;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;
    .locals 3

    const-string v0, "navigationScreenModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo02/c;->a:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo02/d;

    invoke-interface {v1, p1}, Lo02/d;->a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;

    move-result-object v1

    sget-object v2, Lj02/m0$j3;->b:Lj02/m0$j3;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object p1, p0, Lo02/c;->b:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    iget-object v2, p0, Lo02/c;->c:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0, v2}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj02/c;

    return-object p1

    :cond_1
    sget-object p1, Lj02/m0$j3;->b:Lj02/m0$j3;

    return-object p1
.end method

.method public b(Ljava/util/List;Ljava/util/Map;)Lo02/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lo02/d;",
            ">;",
            "Ljava/util/Map<",
            "Lj93/d;",
            "+",
            "Lkotlin/jvm/functions/Function1;",
            ">;)",
            "Lo02/d;"
        }
    .end annotation

    const-string v0, "mappers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v0

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, Ln83/c;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lo02/c;->a:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, Ln83/c;->addAll(Ljava/util/Collection;)Z

    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object p1

    new-instance v0, Ln83/f;

    invoke-direct {v0}, Ln83/f;-><init>()V

    iget-object v1, p0, Lo02/c;->b:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ln83/f;->putAll(Ljava/util/Map;)V

    invoke-virtual {v0, p2}, Ln83/f;->putAll(Ljava/util/Map;)V

    invoke-virtual {v0}, Ln83/f;->b()Ln83/f;

    move-result-object p2

    new-instance v0, Lo02/c;

    invoke-direct {v0, p1, p2}, Lo02/c;-><init>(Ljava/util/List;Ljava/util/Map;)V

    return-object v0
.end method
