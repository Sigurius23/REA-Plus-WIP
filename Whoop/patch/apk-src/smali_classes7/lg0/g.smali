.class public final Llg0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llg0/f;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Llg0/g;",
        "Llg0/f;",
        "Lu02/c;",
        "apiClient",
        "Ljb1/a;",
        "reducer",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lu02/c;Ljb1/a;Ltr2/n;)V",
        "Ly71/o;",
        "a",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lu02/c;",
        "b",
        "Ljb1/a;",
        "c",
        "Ltr2/n;",
        "advanced-labs-management_release"
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
.field private final a:Lu02/c;

.field private final b:Ljb1/a;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lu02/c;Ljb1/a;Ltr2/n;)V
    .locals 1

    const-string v0, "apiClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Llg0/g;->a:Lu02/c;

    .line 3
    iput-object p2, p0, Llg0/g;->b:Ljb1/a;

    .line 4
    iput-object p3, p0, Llg0/g;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lu02/c;Ljb1/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    .line 5
    new-instance p2, Llc0/g;

    const/16 p4, 0x13

    invoke-direct {p2, p4}, Llc0/g;-><init>(I)V

    invoke-static {p2}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p2

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Llg0/g;-><init>(Lu02/c;Ljb1/a;Ltr2/n;)V

    return-void
.end method

.method public static synthetic b(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llg0/g;->c(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic d(Llg0/g;)Lu02/c;
    .locals 0

    iget-object p0, p0, Llg0/g;->a:Lu02/c;

    return-object p0
.end method


# virtual methods
.method public a(Lq83/d;)Ljava/lang/Object;
    .locals 22
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

    instance-of v2, v1, Llg0/g$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Llg0/g$a;

    iget v3, v2, Llg0/g$a;->E:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Llg0/g$a;->E:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Llg0/g$a;

    invoke-direct {v2, v0, v1}, Llg0/g$a;-><init>(Llg0/g;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v8, Llg0/g$a;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v8, Llg0/g$a;->E:I

    const/4 v11, 0x2

    const/4 v4, 0x1

    const/4 v12, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v4, :cond_2

    if-ne v3, v11, :cond_1

    iget-object v2, v8, Llg0/g$a;->x:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    iget-object v2, v8, Llg0/g$a;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/advancedlabsmanagement/domain/GetAdvancedLabsManagementMenuItemRequest;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v3, v8, Llg0/g$a;->w:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/advancedlabsmanagement/domain/GetAdvancedLabsManagementMenuItemRequest;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v1, Lcom/whoop/advancedlabsmanagement/domain/GetAdvancedLabsManagementMenuItemRequest;

    invoke-direct {v1}, Lcom/whoop/advancedlabsmanagement/domain/GetAdvancedLabsManagementMenuItemRequest;-><init>()V

    sget-object v3, Lu02/a;->a:Lu02/a$a;

    iget-object v5, v0, Llg0/g;->c:Ltr2/n;

    new-instance v7, Llg0/g$b;

    invoke-direct {v7, v0, v1, v12}, Llg0/g$b;-><init>(Llg0/g;Lcom/whoop/advancedlabsmanagement/domain/GetAdvancedLabsManagementMenuItemRequest;Lq83/d;)V

    iput-object v12, v8, Llg0/g$a;->w:Ljava/lang/Object;

    iput v4, v8, Llg0/g$a;->E:I

    move-object v4, v5

    const/4 v5, 0x0

    const-string v6, "Failed to fetch Advanced Labs Menu Item"

    const/4 v9, 0x2

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    check-cast v1, Lu02/a;

    instance-of v3, v1, Lu02/a$c;

    if-eqz v3, :cond_7

    check-cast v1, Lu02/a$c;

    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf63/c;

    invoke-virtual {v1}, Lf63/c;->a()Lw53/b;

    move-result-object v1

    const-class v3, Lcom/whoop/design/models/items/MenuItemModel;

    invoke-static {v3}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v4

    invoke-static {v4}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v5

    sget-object v6, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v6, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-static {v3, v4, v5}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v3

    iput-object v12, v8, Llg0/g$a;->w:Ljava/lang/Object;

    iput-object v12, v8, Llg0/g$a;->x:Ljava/lang/Object;

    iput v11, v8, Llg0/g$a;->E:I

    invoke-virtual {v1, v3, v8}, Lw53/b;->a(Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_5

    :goto_3
    return-object v2

    :cond_5
    :goto_4
    instance-of v2, v1, Lcom/whoop/design/models/items/MenuItemModel;

    if-eqz v2, :cond_6

    check-cast v1, Lcom/whoop/design/models/items/MenuItemModel;

    goto :goto_6

    :cond_6
    :goto_5
    move-object v1, v12

    goto :goto_6

    :cond_7
    instance-of v1, v1, Lu02/a$b;

    if-eqz v1, :cond_a

    goto :goto_5

    :goto_6
    if-eqz v1, :cond_9

    iget-object v2, v0, Llg0/g;->b:Ljb1/a;

    invoke-virtual {v2, v1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type com.whoop.design.atomic.organism.menuitem.MenuItemState"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v1

    check-cast v3, Ly71/o;

    invoke-virtual {v3}, Ly71/o;->c()Ly71/l;

    move-result-object v1

    instance-of v2, v1, Ly71/l$b;

    if-eqz v2, :cond_8

    move-object v4, v1

    check-cast v4, Ly71/l$b;

    sget-object v1, Llg0/g$c;->w:Llg0/g$c;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v8

    const/16 v17, 0xff7

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v4 .. v18}, Ly71/l$b;->b(Ly71/l$b;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZILjava/lang/Object;)Ly71/l$b;

    move-result-object v9

    const/16 v19, 0x7fdf

    const/16 v20, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v3 .. v20}, Ly71/o;->b(Ly71/o;Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLy71/l;ZLy81/e;Lf0/t;Lcom/whoop/navigation/e;ZLy71/q;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;ILjava/lang/Object;)Ly71/o;

    move-result-object v3

    :cond_8
    move-object v4, v3

    const/16 v20, 0x7bff

    const/16 v21, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v4 .. v21}, Ly71/o;->b(Ly71/o;Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLy71/l;ZLy81/e;Lf0/t;Lcom/whoop/navigation/e;ZLy71/q;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;ILjava/lang/Object;)Ly71/o;

    move-result-object v1

    return-object v1

    :cond_9
    return-object v12

    :cond_a
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
