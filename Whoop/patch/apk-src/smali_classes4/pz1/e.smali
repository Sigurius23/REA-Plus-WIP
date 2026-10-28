.class public final Lpz1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lpz1/e;",
        "",
        "Lcom/whoop/nativestore/home/domain/api/NativeStoreApi;",
        "api",
        "Ljb1/a;",
        "reducer",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/nativestore/home/domain/api/NativeStoreApi;Ljb1/a;Ltr2/n;)V",
        "Ly71/o;",
        "d",
        "(Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lcom/whoop/nativestore/home/domain/api/NativeStoreApi;",
        "b",
        "Ljb1/a;",
        "c",
        "Ltr2/n;",
        "native-store_release"
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
.field private final a:Lcom/whoop/nativestore/home/domain/api/NativeStoreApi;

.field private final b:Ljb1/a;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/nativestore/home/domain/api/NativeStoreApi;Ljb1/a;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lpz1/e;->a:Lcom/whoop/nativestore/home/domain/api/NativeStoreApi;

    .line 3
    iput-object p2, p0, Lpz1/e;->b:Ljb1/a;

    .line 4
    iput-object p3, p0, Lpz1/e;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/nativestore/home/domain/api/NativeStoreApi;Ljb1/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 5
    new-instance p2, Lpt2/k;

    const/16 p5, 0xe

    invoke-direct {p2, p5}, Lpt2/k;-><init>(I)V

    invoke-static {p2}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 6
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "NativeStoreMenuItemRepository"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lpz1/e;-><init>(Lcom/whoop/nativestore/home/domain/api/NativeStoreApi;Ljb1/a;Ltr2/n;)V

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpz1/e;->b(Ljb1/b;)Ll83/a0;

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

.method public static final synthetic c(Lpz1/e;)Lcom/whoop/nativestore/home/domain/api/NativeStoreApi;
    .locals 0

    iget-object p0, p0, Lpz1/e;->a:Lcom/whoop/nativestore/home/domain/api/NativeStoreApi;

    return-object p0
.end method


# virtual methods
.method public final d(Lq83/d;)Ljava/lang/Object;
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ly71/o;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lpz1/e$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lpz1/e$a;

    iget v3, v2, Lpz1/e$a;->y:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lpz1/e$a;->y:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lpz1/e$a;

    invoke-direct {v2, v0, v1}, Lpz1/e$a;-><init>(Lpz1/e;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v8, Lpz1/e$a;->w:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v8, Lpz1/e$a;->y:I

    const/4 v4, 0x1

    const/4 v11, 0x0

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v3, Lu02/a;->a:Lu02/a$a;

    iget-object v1, v0, Lpz1/e;->c:Ltr2/n;

    new-instance v7, Lpz1/e$b;

    invoke-direct {v7, v0, v11}, Lpz1/e$b;-><init>(Lpz1/e;Lq83/d;)V

    iput v4, v8, Lpz1/e$a;->y:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x6

    const/4 v10, 0x0

    move-object v4, v1

    invoke-static/range {v3 .. v10}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_3

    return-object v2

    :cond_3
    :goto_2
    check-cast v1, Lu02/a;

    instance-of v2, v1, Lu02/a$c;

    if-eqz v2, :cond_6

    check-cast v1, Lu02/a$c;

    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/items/MenuItemModel;

    iget-object v2, v0, Lpz1/e;->b:Ljb1/a;

    invoke-virtual {v2, v1}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    instance-of v2, v1, Ly71/o;

    if-eqz v2, :cond_4

    check-cast v1, Ly71/o;

    move-object v12, v1

    goto :goto_3

    :cond_4
    move-object v12, v11

    :goto_3
    if-eqz v12, :cond_5

    const/16 v28, 0x7bff

    const/16 v29, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v12 .. v29}, Ly71/o;->b(Ly71/o;Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLy71/l;ZLy81/e;Lf0/t;Lcom/whoop/navigation/e;ZLy71/q;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;ILjava/lang/Object;)Ly71/o;

    move-result-object v1

    return-object v1

    :cond_5
    return-object v11

    :cond_6
    instance-of v1, v1, Lu02/a$b;

    if-eqz v1, :cond_7

    return-object v11

    :cond_7
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
