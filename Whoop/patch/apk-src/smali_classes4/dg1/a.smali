.class public final Ldg1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Ldg1/a;",
        "",
        "Ljb1/a;",
        "designItemReducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lag1/b;",
        "domainState",
        "Lu11/d;",
        "c",
        "(Lag1/b;)Lu11/d;",
        "a",
        "Ljb1/a;",
        "filtered-list-arch-mini_release"
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

    sput v0, Ldg1/a;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ldg1/a;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    new-instance p1, Ldc0/d;

    const/16 p2, 0x1d

    invoke-direct {p1, p2}, Ldc0/d;-><init>(I)V

    invoke-static {p1}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Ldg1/a;-><init>(Ljb1/a;)V

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ldg1/a;->b(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lsz0/m;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Ldg1/a$a;

    invoke-direct {v1}, Ldg1/a$a;-><init>()V

    invoke-virtual {p0, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final c(Lag1/b;)Lu11/d;
    .locals 21

    move-object/from16 v0, p0

    const-string v1, "domainState"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lag1/b;->d()Lcom/whoop/filteredlist/domain/model/FilteredListResponse;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/whoop/filteredlist/domain/model/FilteredListResponse;->getFilters()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_1

    iget-object v4, v0, Ldg1/a;->a:Ljb1/a;

    invoke-virtual {v4, v1}, Ljb1/a;->i(Lcom/whoop/design/models/DesignSystemModel;)Lm91/o;

    move-result-object v4

    move-object v9, v4

    goto :goto_1

    :cond_1
    move-object v9, v3

    :goto_1
    if-eqz v1, :cond_2

    invoke-static {v1}, Lcom/whoop/design/models/DesignSystemModelKt;->unwrap(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v3

    :goto_2
    instance-of v4, v1, Lcom/whoop/design/models/items/FlowRowModel;

    if-eqz v4, :cond_3

    check-cast v1, Lcom/whoop/design/models/items/FlowRowModel;

    goto :goto_3

    :cond_3
    move-object v1, v3

    :goto_3
    sget-object v4, Lm83/y;->w:Lm83/y;

    sget-object v5, Lm83/z;->w:Lm83/z;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/whoop/design/models/items/FlowRowModel;->getItems()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v6, v0, Ldg1/a;->a:Ljb1/a;

    invoke-virtual {v6, v1, v5}, Ljb1/a;->j(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_4

    move-object v10, v1

    goto :goto_4

    :cond_4
    move-object v10, v4

    :goto_4
    invoke-virtual {v2}, Lag1/b;->d()Lcom/whoop/filteredlist/domain/model/FilteredListResponse;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v6, v0, Ldg1/a;->a:Ljb1/a;

    invoke-virtual {v1}, Lcom/whoop/filteredlist/domain/model/FilteredListResponse;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v6, v1, v5}, Ljb1/a;->j(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    move-object v11, v1

    goto :goto_6

    :cond_6
    :goto_5
    move-object v11, v4

    :goto_6
    invoke-virtual {v2}, Lag1/b;->e()Lag1/d;

    move-result-object v1

    instance-of v4, v1, Lag1/d$a;

    if-eqz v4, :cond_7

    check-cast v1, Lag1/d$a;

    goto :goto_7

    :cond_7
    move-object v1, v3

    :goto_7
    new-instance v5, Lu11/d;

    invoke-virtual {v2}, Lag1/b;->m()Z

    move-result v6

    invoke-virtual {v2}, Lag1/b;->k()Z

    move-result v7

    invoke-virtual {v2}, Lag1/b;->l()Z

    move-result v8

    invoke-virtual {v2}, Lag1/b;->e()Lag1/d;

    move-result-object v4

    instance-of v12, v4, Lag1/d$b;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lag1/d$a;->b()Ljava/lang/String;

    move-result-object v4

    move-object v13, v4

    goto :goto_8

    :cond_8
    move-object v13, v3

    :goto_8
    if-eqz v1, :cond_9

    invoke-virtual {v1}, Lag1/d$a;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v3

    :cond_9
    move-object v14, v3

    invoke-virtual {v2}, Lag1/b;->g()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object v1

    if-eqz v1, :cond_a

    const/4 v1, 0x1

    :goto_9
    move v15, v1

    goto :goto_a

    :cond_a
    const/4 v1, 0x0

    goto :goto_9

    :goto_a
    invoke-virtual {v2}, Lag1/b;->j()Lag1/e;

    move-result-object v1

    instance-of v1, v1, Lag1/e$c;

    invoke-virtual {v2}, Lag1/b;->j()Lag1/e;

    move-result-object v3

    instance-of v3, v3, Lag1/e$a;

    invoke-virtual {v2}, Lag1/b;->h()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v2}, Lag1/b;->i()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v2}, Lag1/b;->f()I

    move-result v20

    move/from16 v16, v1

    move/from16 v17, v3

    invoke-direct/range {v5 .. v20}, Lu11/d;-><init>(ZZZLm91/o;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ZZZLjava/lang/String;Ljava/lang/String;I)V

    return-object v5
.end method
