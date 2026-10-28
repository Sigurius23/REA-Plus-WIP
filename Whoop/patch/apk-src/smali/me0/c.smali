.class public final Lme0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lme0/a;",
        "Lme0/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003H\u0082@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J#\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00172\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0013H\u0000\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lme0/c;",
        "Lod1/g;",
        "Lme0/a;",
        "Lme0/b;",
        "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Ltr2/n;)V",
        "f",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lme0/b$c;",
        "previous",
        "",
        "nextToken",
        "g",
        "(Lme0/b$c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;",
        "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;",
        "next",
        "h",
        "(Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;)Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "oldSections",
        "newSections",
        "i",
        "(Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;)Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;",
        "a",
        "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;",
        "b",
        "Ltr2/n;",
        "advanced-labs_release"
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
.field private final a:Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lme0/c;->a:Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;

    .line 3
    iput-object p2, p0, Lme0/c;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "TestHistoryInteractor"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lme0/c;-><init>(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lme0/c;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lme0/c;->f(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lme0/c;Lme0/b$c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lme0/c;->g(Lme0/b$c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lme0/c;)Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;
    .locals 0

    iget-object p0, p0, Lme0/c;->a:Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;

    return-object p0
.end method

.method private final f(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lme0/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lme0/c$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lme0/c$a;

    iget v1, v0, Lme0/c$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lme0/c$a;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lme0/c$a;

    invoke-direct {v0, p0, p1}, Lme0/c$a;-><init>(Lme0/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lme0/c$a;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lme0/c$a;->y:I

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

    iget-object v2, p0, Lme0/c;->b:Ltr2/n;

    new-instance v5, Lme0/c$b;

    const/4 v3, 0x0

    invoke-direct {v5, p0, v3}, Lme0/c$b;-><init>(Lme0/c;Lq83/d;)V

    iput p1, v6, Lme0/c$a;->y:I

    const/4 v4, 0x0

    const/4 v7, 0x6

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

    new-instance v0, Lme0/b$d;

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;

    invoke-direct {v0, p1}, Lme0/b$d;-><init>(Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;)V

    return-object v0

    :cond_4
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_5

    sget-object p1, Lme0/b$a;->a:Lme0/b$a;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final g(Lme0/b$c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lme0/b$c;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lme0/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lme0/c$c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lme0/c$c;

    iget v1, v0, Lme0/c$c;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lme0/c$c;->E:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lme0/c$c;

    invoke-direct {v0, p0, p3}, Lme0/c$c;-><init>(Lme0/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p3, v6, Lme0/c$c;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lme0/c$c;->E:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lme0/c$c;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v6, Lme0/c$c;->w:Ljava/lang/Object;

    check-cast p1, Lme0/b$c;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p3, v2

    iget-object v2, p0, Lme0/c;->b:Ltr2/n;

    new-instance v5, Lme0/c$d;

    const/4 v3, 0x0

    invoke-direct {v5, p0, p2, v3}, Lme0/c$d;-><init>(Lme0/c;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v6, Lme0/c$c;->w:Ljava/lang/Object;

    iput-object v3, v6, Lme0/c$c;->x:Ljava/lang/Object;

    iput p3, v6, Lme0/c$c;->E:I

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p3, Lu02/a;

    instance-of p2, p3, Lu02/a$c;

    if-eqz p2, :cond_4

    invoke-virtual {p1}, Lme0/b$c;->a()Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;

    move-result-object p1

    check-cast p3, Lu02/a$c;

    invoke-virtual {p3}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;

    invoke-direct {p0, p1, p2}, Lme0/c;->h(Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;)Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;

    move-result-object p1

    new-instance p2, Lme0/b$d;

    invoke-direct {p2, p1}, Lme0/b$d;-><init>(Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;)V

    return-object p2

    :cond_4
    instance-of p2, p3, Lu02/a$b;

    if-eqz p2, :cond_5

    new-instance p2, Lme0/b$d;

    invoke-virtual {p1}, Lme0/b$c;->a()Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;

    move-result-object p1

    invoke-direct {p2, p1}, Lme0/b$d;-><init>(Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;)V

    return-object p2

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final h(Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;)Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;
    .locals 8

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->getPaginatedRecords()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lme0/c;->i(Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;)Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;

    move-result-object v5

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->copy$default(Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;ILjava/lang/Object;)Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final i(Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;)Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;
    .locals 6

    const-string v0, "oldSections"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newSections"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;->getSections()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;->getSections()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p1, v0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsTestHistorySection;

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsTestHistorySection;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsTestHistorySection;

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsTestHistorySection;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsTestHistorySection;

    invoke-virtual {v3}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsTestHistorySection;->getSectionHeader()Lcom/whoop/design/models/items/DividerModel;

    move-result-object v3

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsTestHistorySection;

    invoke-virtual {v5}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsTestHistorySection;->getItems()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v4, v5}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_2

    :cond_2
    invoke-static {v4}, Lm83/s;->y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    new-instance v4, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsTestHistorySection;

    invoke-direct {v4, v2, v3, v1}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsTestHistorySection;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;)V

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    new-instance v0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;

    invoke-virtual {p2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;->getNextToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;->getAnalytics()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object p2

    invoke-direct {v0, p1, v1, p2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;)V

    return-object v0
.end method

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

    new-instance v0, Lme0/c$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lme0/c$e;-><init>(Lq83/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    sget-object v0, Lme0/b$b;->a:Lme0/b$b;

    new-instance v2, Lme0/c$f;

    invoke-direct {v2, p0, v1}, Lme0/c$f;-><init>(Lme0/c;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v0, p1, v2}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
