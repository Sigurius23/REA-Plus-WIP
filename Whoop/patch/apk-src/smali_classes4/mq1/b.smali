.class public final Lmq1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0013\u0010\r\u001a\u00020\u0007*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000f\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lmq1/b;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Liq1/e$b;",
        "Liq1/a;",
        "e",
        "(Liq1/e$b;)Liq1/a;",
        "Liq1/f;",
        "f",
        "(Liq1/f;)Liq1/a;",
        "d",
        "domainState",
        "c",
        "a",
        "Ljb1/a;",
        "behavior-impact_release"
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

    sput v0, Lmq1/b;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lmq1/b;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    new-instance p1, Lmm1/h;

    const/16 p2, 0x16

    invoke-direct {p1, p2}, Lmm1/h;-><init>(I)V

    invoke-static {p1}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lmq1/b;-><init>(Ljb1/a;)V

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmq1/b;->b(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final d(Liq1/f;)Liq1/a;
    .locals 20

    invoke-direct/range {p0 .. p1}, Lmq1/b;->f(Liq1/f;)Liq1/a;

    move-result-object v0

    invoke-virtual {v0}, Liq1/a;->b()Liq1/a$b;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    new-instance v0, Liq1/a$b;

    invoke-direct {v0, v2, v1, v2}, Liq1/a$b;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    invoke-virtual {v0}, Liq1/a$b;->b()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Liq1/a$c;

    invoke-virtual {v6}, Liq1/a$c;->c()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v7, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lm91/u;

    instance-of v10, v9, Lzz0/m;

    if-eqz v10, :cond_1

    move-object v11, v9

    check-cast v11, Lzz0/m;

    const/16 v18, 0x3d

    const/16 v19, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v11 .. v19}, Lzz0/m;->b(Lzz0/m;Lcom/whoop/design/util/TextResource;ZLzz0/a;Ljava/util/List;Ljava/util/List;Ljava/lang/Object;ILjava/lang/Object;)Lzz0/m;

    move-result-object v9

    :cond_1
    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    const/4 v7, 0x2

    invoke-static {v6, v8, v2, v7, v2}, Liq1/a$c;->b(Liq1/a$c;Ljava/util/List;Ljava/lang/String;ILjava/lang/Object;)Liq1/a$c;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {v0, v4}, Liq1/a$b;->a(Ljava/util/List;)Liq1/a$b;

    move-result-object v0

    new-instance v3, Liq1/a;

    invoke-direct {v3, v2, v0, v1, v2}, Liq1/a;-><init>(Liq1/a$a;Liq1/a$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method

.method private final e(Liq1/e$b;)Liq1/a;
    .locals 9

    instance-of v0, p1, Liq1/e$a;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance p1, Liq1/a;

    new-instance v3, Liq1/a$a;

    sget-object v0, Le31/d;->a:Le31/d;

    invoke-virtual {v0}, Le31/d;->a()Le31/c;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Liq1/a$a;-><init>(Le31/c;Liq1/c;Liq1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v3, v2, v1, v2}, Liq1/a;-><init>(Liq1/a$a;Liq1/a$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_0
    instance-of v0, p1, Liq1/e$c;

    if-eqz v0, :cond_1

    new-instance p1, Liq1/a;

    new-instance v3, Liq1/a$a;

    sget-object v0, Le31/d;->a:Le31/d;

    invoke-virtual {v0}, Le31/d;->b()Le31/c;

    move-result-object v4

    sget-object v5, Liq1/c$e;->a:Liq1/c$e;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Liq1/a$a;-><init>(Le31/c;Liq1/c;Liq1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v3, v2, v1, v2}, Liq1/a;-><init>(Liq1/a$a;Liq1/a$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_1
    instance-of p1, p1, Liq1/e$d;

    if-eqz p1, :cond_2

    new-instance p1, Liq1/a;

    new-instance v3, Liq1/a$a;

    sget-object v0, Le31/d;->a:Le31/d;

    invoke-virtual {v0}, Le31/d;->c()Le31/c;

    move-result-object v4

    sget-object v6, Liq1/c$e;->a:Liq1/c$e;

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v3 .. v8}, Liq1/a$a;-><init>(Le31/c;Liq1/c;Liq1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v3, v2, v1, v2}, Liq1/a;-><init>(Liq1/a$a;Liq1/a$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final f(Liq1/f;)Liq1/a;
    .locals 5

    invoke-virtual {p1}, Liq1/f;->d()Lcom/whoop/impacts/details/domain/requests/JournalTrendsMiniArchResponse;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/impacts/details/domain/requests/JournalTrendsMiniArchResponse;->getSections()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

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

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/impacts/details/domain/requests/JournalTrendsSectionModel;

    new-instance v2, Liq1/a$c;

    iget-object v3, p0, Lmq1/b;->a:Ljb1/a;

    invoke-virtual {v1}, Lcom/whoop/impacts/details/domain/requests/JournalTrendsSectionModel;->getItems()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/impacts/details/domain/requests/JournalTrendsSectionModel;->getSectionType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Liq1/a$c;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_1
    new-instance p1, Liq1/a$b;

    invoke-direct {p1, v0}, Liq1/a$b;-><init>(Ljava/util/List;)V

    new-instance v0, Liq1/a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, p1, v2, v1}, Liq1/a;-><init>(Liq1/a$a;Liq1/a$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public final c(Liq1/f;)Liq1/a;
    .locals 1

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Liq1/f;->c()Liq1/e;

    move-result-object v0

    instance-of v0, v0, Liq1/e$a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Liq1/f;->d()Lcom/whoop/impacts/details/domain/requests/JournalTrendsMiniArchResponse;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lmq1/b;->d(Liq1/f;)Liq1/a;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Liq1/f;->c()Liq1/e;

    move-result-object v0

    instance-of v0, v0, Liq1/e$b;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Liq1/f;->c()Liq1/e;

    move-result-object p1

    check-cast p1, Liq1/e$b;

    invoke-direct {p0, p1}, Lmq1/b;->e(Liq1/e$b;)Liq1/a;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-direct {p0, p1}, Lmq1/b;->f(Liq1/f;)Liq1/a;

    move-result-object p1

    return-object p1
.end method
