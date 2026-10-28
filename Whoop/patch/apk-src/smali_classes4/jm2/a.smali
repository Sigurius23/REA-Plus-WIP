.class public final Ljm2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0013\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Ljm2/a;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lfm2/a$b;",
        "Lim2/c;",
        "c",
        "(Lfm2/a$b;)Lim2/c;",
        "Lfm2/c;",
        "d",
        "(Lfm2/c;)Lim2/c;",
        "",
        "spacing",
        "Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchSectionSpacingType;",
        "a",
        "(Ljava/lang/String;)Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchSectionSpacingType;",
        "domainResult",
        "b",
        "Ljb1/a;",
        "trends-mini-arch_release"
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

    sput v0, Ljm2/a;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ljm2/a;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Ljm2/b;->b()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Ljm2/a;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final a(Ljava/lang/String;)Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchSectionSpacingType;
    .locals 1

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "NORMAL"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchSectionSpacingType;->NORMAL:Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchSectionSpacingType;

    return-object p1

    :cond_0
    const-string v0, "COMPACT"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchSectionSpacingType;->COMPACT:Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchSectionSpacingType;

    return-object p1

    :cond_1
    sget-object p1, Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchSectionSpacingType;->COMPACT:Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchSectionSpacingType;

    return-object p1
.end method

.method private final c(Lfm2/a$b;)Lim2/c;
    .locals 9

    instance-of v0, p1, Lfm2/a$a;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance p1, Lim2/c;

    new-instance v3, Lim2/c$a;

    sget-object v0, Le31/d;->a:Le31/d;

    invoke-virtual {v0}, Le31/d;->a()Le31/c;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lim2/c$a;-><init>(Le31/c;Lim2/a;Lim2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v3, v2, v1, v2}, Lim2/c;-><init>(Lim2/c$a;Lim2/c$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_0
    instance-of v0, p1, Lfm2/a$c;

    if-eqz v0, :cond_1

    new-instance v0, Lim2/c;

    new-instance v3, Lim2/c$a;

    sget-object v4, Le31/d;->a:Le31/d;

    invoke-virtual {v4}, Le31/d;->c()Le31/c;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lim2/c$a;-><init>(Le31/c;Lim2/a;Lim2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lim2/a$e;

    check-cast p1, Lfm2/a$c;

    invoke-virtual {p1}, Lfm2/a$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v6, p1}, Lim2/a$e;-><init>(Ljava/lang/String;)V

    const/4 v7, 0x3

    const/4 v4, 0x0

    invoke-static/range {v3 .. v8}, Lim2/c$a;->b(Lim2/c$a;Le31/c;Lim2/a;Lim2/a;ILjava/lang/Object;)Lim2/c$a;

    move-result-object p1

    invoke-direct {v0, p1, v2, v1, v2}, Lim2/c;-><init>(Lim2/c$a;Lim2/c$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final d(Lfm2/c;)Lim2/c;
    .locals 4

    invoke-virtual {p1}, Lfm2/c;->b()Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;->getSections()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchSectionModel;

    iget-object v2, p0, Ljm2/a;->a:Ljb1/a;

    invoke-virtual {v1}, Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchSectionModel;->getItems()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchSectionModel;->getSectionType()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v1}, Ljm2/a;->a(Ljava/lang/String;)Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchSectionSpacingType;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    sget-object v1, Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchSectionSpacingType;->COMPACT:Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchSectionSpacingType;

    :cond_1
    new-instance v3, Lim2/c$c;

    invoke-direct {v3, v2, v1}, Lim2/c$c;-><init>(Ljava/util/List;Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchSectionSpacingType;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_3
    new-instance p1, Lim2/c$b;

    invoke-direct {p1, v0}, Lim2/c$b;-><init>(Ljava/util/List;)V

    new-instance v0, Lim2/c;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, p1, v2, v1}, Lim2/c;-><init>(Lim2/c$a;Lim2/c$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public final b(Lfm2/c;)Lim2/c;
    .locals 1

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lfm2/c;->a()Lfm2/a;

    move-result-object v0

    instance-of v0, v0, Lfm2/a$b;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lfm2/c;->a()Lfm2/a;

    move-result-object p1

    check-cast p1, Lfm2/a$b;

    invoke-direct {p0, p1}, Ljm2/a;->c(Lfm2/a$b;)Lim2/c;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Ljm2/a;->d(Lfm2/c;)Lim2/c;

    move-result-object p1

    return-object p1
.end method
