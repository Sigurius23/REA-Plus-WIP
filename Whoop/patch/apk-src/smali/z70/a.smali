.class public final Lz70/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\u0008*\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0013\u0010\r\u001a\u00020\u000c*\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u0008*\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u001b2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00082\u0006\u0010 \u001a\u00020\u000f\u00a2\u0006\u0004\u0008!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010#R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lz70/a;",
        "",
        "Ljb1/a;",
        "reducer",
        "activationFlowReducer",
        "<init>",
        "(Ljb1/a;Ljb1/a;)V",
        "Lv70/b$b;",
        "Ly70/c;",
        "e",
        "(Lv70/b$b;)Ly70/c;",
        "Lv70/b$e;",
        "Ly70/c$c;",
        "d",
        "(Lv70/b$e;)Ly70/c$c;",
        "Lv70/d;",
        "dialog",
        "g",
        "(Lv70/d;Ly70/c$c;)Ly70/c;",
        "Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;",
        "domainState",
        "Ly70/c$d;",
        "f",
        "(Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;Lv70/d;Ljb1/a;)Ly70/c$d;",
        "",
        "backgroundImageUrl",
        "imageName",
        "Lkd1/o;",
        "c",
        "(Ljava/lang/String;Ljava/lang/String;)Lkd1/o;",
        "a",
        "(Ljava/lang/String;)Lkd1/o;",
        "domainResult",
        "b",
        "(Lv70/d;)Ly70/c;",
        "Ljb1/a;",
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
.field public static final c:I


# instance fields
.field private final a:Ljb1/a;

.field private final b:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lz70/a;->c:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activationFlowReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lz70/a;->a:Ljb1/a;

    .line 3
    iput-object p2, p0, Lz70/a;->b:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 4
    invoke-static {}, Lz70/b;->b()Ljb1/a;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 5
    invoke-static {}, Li80/b;->n0()Ljb1/a;

    move-result-object p2

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2}, Lz70/a;-><init>(Ljb1/a;Ljb1/a;)V

    return-void
.end method

.method private final a(Ljava/lang/String;)Lkd1/o;
    .locals 1

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "HIP_HERO"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lkd1/o$a;

    sget v0, Lgy0/a;->b:I

    invoke-direct {p1, v0}, Lkd1/o$a;-><init>(I)V

    return-object p1

    :cond_0
    const-string v0, "RUNNING_HERO"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lkd1/o$a;

    sget v0, Lgy0/a;->c:I

    invoke-direct {p1, v0}, Lkd1/o$a;-><init>(I)V

    return-object p1

    :cond_1
    new-instance p1, Lkd1/o$a;

    sget v0, Lgy0/a;->b:I

    invoke-direct {p1, v0}, Lkd1/o$a;-><init>(I)V

    return-object p1
.end method

.method private final c(Ljava/lang/String;Ljava/lang/String;)Lkd1/o;
    .locals 8

    if-eqz p1, :cond_1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget v3, Lgy0/a;->b:I

    new-instance v1, Lkd1/o$c;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move v4, v3

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    :goto_0
    invoke-direct {p0, p2}, Lz70/a;->a(Ljava/lang/String;)Lkd1/o;

    move-result-object p1

    return-object p1
.end method

.method private final d(Lv70/b$e;)Ly70/c$c;
    .locals 13

    instance-of p1, p1, Lv70/b$a;

    if-eqz p1, :cond_0

    const-string p1, "title"

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string p1, "description"

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const-string p1, "Confirm"

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string p1, "Cancel"

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget-object v8, Lj11/p;->LOTTIE:Lj11/p;

    new-instance v0, Ly70/c$c;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v0 .. v12}, Ly70/c$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Ly70/a;Ly70/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final e(Lv70/b$b;)Ly70/c;
    .locals 9

    instance-of v0, p1, Lv70/b$c;

    if-eqz v0, :cond_0

    new-instance v1, Ly70/c;

    new-instance v2, Ly70/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Ly70/c$b;-><init>(Lsz0/q0;Ly70/a;Ly70/a;Ly70/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    move-object v3, v2

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v6}, Ly70/c;-><init>(Ly70/c$c;Ly70/c$b;Ly70/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lv70/b$d;

    if-eqz v0, :cond_1

    new-instance v1, Ly70/c;

    new-instance v2, Ly70/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object v3

    sget-object v6, Ly70/a$f;->a:Ly70/a$f;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Ly70/c$b;-><init>(Lsz0/q0;Ly70/a;Ly70/a;Ly70/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    const/4 v6, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v6}, Ly70/c;-><init>(Ly70/c$c;Ly70/c$b;Ly70/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of p1, p1, Lv70/b$f;

    if-eqz p1, :cond_2

    new-instance v0, Ly70/c;

    new-instance v1, Ly70/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v2

    sget-object v5, Ly70/a$f;->a:Ly70/a$f;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v7}, Ly70/c$b;-><init>(Lsz0/q0;Ly70/a;Ly70/a;Ly70/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x5

    const/4 v5, 0x0

    move-object v2, v1

    const/4 v1, 0x0

    invoke-direct/range {v0 .. v5}, Ly70/c;-><init>(Ly70/c$c;Ly70/c$b;Ly70/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final f(Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;Lv70/d;Ljb1/a;)Ly70/c$d;
    .locals 35

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v2

    new-instance v3, Ly70/c$a;

    new-instance v4, Lu70/c;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->getBackgroundImageUrl()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->getImageName()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v5, v6}, Lz70/a;->c(Ljava/lang/String;Ljava/lang/String;)Lkd1/o;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->getHeader()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->getDescription()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lu70/c;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v3, v4}, Ly70/c$a;-><init>(Ljava/util/List;)V

    invoke-virtual {v2, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->getMenuItems()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v1, v4}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v4

    instance-of v6, v4, Ly71/o;

    if-eqz v6, :cond_1

    move-object v5, v4

    check-cast v5, Ly71/o;

    :cond_1
    if-eqz v5, :cond_0

    new-instance v4, Ly70/c$a;

    new-instance v6, Lu70/f;

    invoke-direct {v6, v5}, Lu70/f;-><init>(Ly71/o;)V

    invoke-static {v6}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct {v4, v5}, Ly70/c$a;-><init>(Ljava/util/List;)V

    invoke-virtual {v2, v4}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->getEducationContent()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v1, v3}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    instance-of v3, v1, Lh51/f;

    if-eqz v3, :cond_3

    check-cast v1, Lh51/f;

    goto :goto_1

    :cond_3
    move-object v1, v5

    :goto_1
    if-eqz v1, :cond_4

    new-instance v3, Ly70/c$a;

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v3, v1}, Ly70/c$a;-><init>(Ljava/util/List;)V

    invoke-virtual {v2, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-static {v2}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->getFooterButtons()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_8

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/DesignSystemModel;

    iget-object v6, v0, Lz70/a;->b:Ljb1/a;

    invoke-virtual {v6, v4}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v4

    if-nez v4, :cond_6

    move-object v4, v5

    goto :goto_3

    :cond_6
    instance-of v6, v4, Lny0/h;

    if-eqz v6, :cond_7

    move-object v7, v4

    check-cast v7, Lny0/h;

    sget-object v18, Lny0/g;->STANDARD:Lny0/g;

    const v33, 0x1ff9bff

    const/16 v34, 0x0

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

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-static/range {v7 .. v34}, Lny0/h;->b(Lny0/h;Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILjava/lang/Object;)Lny0/h;

    move-result-object v4

    :cond_7
    :goto_3
    if-eqz v4, :cond_5

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    sget-object v3, Lm83/y;->w:Lm83/y;

    :cond_9
    new-instance v2, Ly70/c$d;

    invoke-virtual/range {p2 .. p2}, Lv70/d;->d()Z

    move-result v4

    invoke-direct {v2, v1, v4, v3}, Ly70/c$d;-><init>(Ljava/util/List;ZLjava/util/List;)V

    return-object v2
.end method

.method private final g(Lv70/d;Ly70/c$c;)Ly70/c;
    .locals 6

    invoke-virtual {p1}, Lv70/d;->e()Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lz70/a;->a:Ljb1/a;

    invoke-direct {p0, v0, p1, v1}, Lz70/a;->f(Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;Lv70/d;Ljb1/a;)Ly70/c$d;

    move-result-object p1

    :goto_0
    move-object v3, p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    new-instance v0, Ly70/c;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Ly70/c;-><init>(Ly70/c$c;Ly70/c$b;Ly70/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public final b(Lv70/d;)Ly70/c;
    .locals 2

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lv70/d;->c()Lv70/b;

    move-result-object v0

    instance-of v1, v0, Lv70/b$b;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lv70/d;->c()Lv70/b;

    move-result-object p1

    check-cast p1, Lv70/b$b;

    invoke-direct {p0, p1}, Lz70/a;->e(Lv70/b$b;)Ly70/c;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, v0, Lv70/b$e;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lv70/d;->c()Lv70/b;

    move-result-object v0

    check-cast v0, Lv70/b$e;

    invoke-direct {p0, v0}, Lz70/a;->d(Lv70/b$e;)Ly70/c$c;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lz70/a;->g(Lv70/d;Ly70/c$c;)Ly70/c;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lz70/a;->g(Lv70/d;Ly70/c$c;)Ly70/c;

    move-result-object p1

    return-object p1
.end method
