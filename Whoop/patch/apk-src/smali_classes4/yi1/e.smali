.class public final Lyi1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ-\u0010\u0012\u001a\u00020\u00082\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lyi1/e;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lvi1/c$c;",
        "state",
        "Lyi1/d;",
        "c",
        "(Lvi1/c$c;)Lyi1/d;",
        "",
        "Lm91/u;",
        "items",
        "Lyi1/m;",
        "shepherdItem",
        "",
        "shepherdOnboarded",
        "a",
        "(Ljava/util/List;Lyi1/m;Z)Lyi1/d;",
        "Lvi1/c;",
        "domainState",
        "b",
        "(Lvi1/c;)Lyi1/d;",
        "Ljb1/a;",
        "kennel_release"
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

    sput v0, Lyi1/e;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lyi1/e;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lyi1/f;->s()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lyi1/e;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final a(Ljava/util/List;Lyi1/m;Z)Lyi1/d;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;",
            "Lyi1/m;",
            "Z)",
            "Lyi1/d;"
        }
    .end annotation

    new-instance v0, Lyi1/l;

    sget v1, Lti1/d;->o:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-eqz p3, :cond_0

    new-instance v3, Lcom/whoop/navigation/e;

    sget-object v4, Lcom/whoop/navigation/AppScreen$g5;->w:Lcom/whoop/navigation/AppScreen$g5;

    sget-object v5, Lcom/whoop/navigation/ShepherdAboutModel;->INSTANCE:Lcom/whoop/navigation/ShepherdAboutModel;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    sget-object v4, Lgz0/m0;->EDUCATION:Lgz0/m0;

    invoke-virtual {v4}, Lgz0/m0;->toWhoopIcon()I

    move-result v5

    const/4 v4, 0x1

    invoke-direct/range {v0 .. v5}, Lyi1/l;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;II)V

    sget v1, Lti1/d;->n:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    if-eqz p3, :cond_1

    new-instance v2, Lyi1/o;

    sget v3, Lti1/d;->m:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    sget-object v4, Lgz0/m0;->LIST:Lgz0/m0;

    invoke-virtual {v4}, Lgz0/m0;->toWhoopIcon()I

    move-result v5

    sget-object v4, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    invoke-virtual {v4}, Lgz0/m0;->toWhoopIcon()I

    move-result v6

    new-instance v7, Lcom/whoop/navigation/e;

    sget-object v8, Lcom/whoop/navigation/AppScreen$l5;->w:Lcom/whoop/navigation/AppScreen$l5;

    sget-object v9, Lcom/whoop/navigation/ShepherdSettingsModel;->INSTANCE:Lcom/whoop/navigation/ShepherdSettingsModel;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v7}, Lyi1/o;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILcom/whoop/navigation/e;)V

    new-instance v3, Lyi1/p;

    sget-object v4, Lyi1/n;->AllNotifications:Lyi1/n;

    invoke-direct {v3, v2, v4}, Lyi1/p;-><init>(Lyi1/o;Lyi1/n;)V

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    goto :goto_1

    :cond_1
    sget-object v2, Lm83/y;->w:Lm83/y;

    :goto_1
    invoke-virtual {p2, v0, v1, v2}, Lyi1/m;->a(Lyi1/l;Lcom/whoop/design/util/TextResource;Ljava/util/List;)Lyi1/m;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface/range {p1 .. p2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {v1, p1, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lyi1/d$c;

    invoke-direct {p1, v1}, Lyi1/d$c;-><init>(Ljava/util/List;)V

    return-object p1
.end method

.method private final c(Lvi1/c$c;)Lyi1/d;
    .locals 6

    iget-object v0, p0, Lyi1/e;->a:Ljb1/a;

    invoke-virtual {p1}, Lvi1/c$c;->c()Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lyi1/m;

    if-eqz v4, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyi1/m;

    if-nez v1, :cond_2

    new-instance p1, Lyi1/d$c;

    invoke-direct {p1, v0}, Lyi1/d$c;-><init>(Ljava/util/List;)V

    return-object p1

    :cond_2
    invoke-virtual {v1}, Lyi1/m;->c()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lyi1/p;

    if-eqz v5, :cond_3

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_2

    :cond_5
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lyi1/p;

    invoke-virtual {v3}, Lyi1/p;->a()Lyi1/n;

    move-result-object v3

    sget-object v4, Lyi1/n;->ErrorConnection:Lyi1/n;

    if-ne v3, v4, :cond_6

    invoke-virtual {p1}, Lvi1/c$c;->d()Z

    move-result p1

    invoke-direct {p0, v0, v1, p1}, Lyi1/e;->a(Ljava/util/List;Lyi1/m;Z)Lyi1/d;

    move-result-object p1

    return-object p1

    :cond_7
    :goto_2
    new-instance p1, Lyi1/d$c;

    invoke-direct {p1, v0}, Lyi1/d$c;-><init>(Ljava/util/List;)V

    return-object p1
.end method


# virtual methods
.method public final b(Lvi1/c;)Lyi1/d;
    .locals 7

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lvi1/c$a;->a:Lvi1/c$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lyi1/d$b;->a:Lyi1/d$b;

    return-object p1

    :cond_0
    sget-object v0, Lvi1/c$b;->a:Lvi1/c$b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v1, Lyi1/d$a;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lyi1/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of v0, p1, Lvi1/c$c;

    if-eqz v0, :cond_2

    check-cast p1, Lvi1/c$c;

    invoke-direct {p0, p1}, Lyi1/e;->c(Lvi1/c$c;)Lyi1/d;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
