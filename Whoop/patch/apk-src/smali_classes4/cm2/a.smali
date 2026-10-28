.class public final Lcm2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000c\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ-\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcm2/a;",
        "",
        "<init>",
        "()V",
        "Lvl2/f;",
        "Lam2/d0;",
        "metaData",
        "Ljb1/a;",
        "designItemReducer",
        "Lcm2/t;",
        "trendMenuSheetReducer",
        "Lcm2/r;",
        "b",
        "(Lvl2/f;Lam2/d0;Ljb1/a;Lcm2/t;)Lcm2/r;",
        "domainResult",
        "a",
        "(Lvl2/f;Ljb1/a;Lcm2/t;Lam2/d0;)Lcm2/r;",
        "trends_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Lvl2/f;Lam2/d0;Ljb1/a;Lcm2/t;)Lcm2/r;
    .locals 9

    invoke-virtual {p1}, Lvl2/f;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p1}, Lvl2/f;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p1}, Lvl2/f;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p1}, Lvl2/f;->a()Lvl2/m;

    move-result-object v0

    invoke-virtual {v0}, Lvl2/m;->c()Lcom/whoop/design/models/items/MenuItemModel;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object p3

    const-string v0, "null cannot be cast to non-null type com.whoop.design.atomic.organism.menuitem.MenuItemState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p3

    check-cast v5, Ly71/o;

    invoke-virtual {p1}, Lvl2/f;->c()Lvl2/g;

    move-result-object p3

    invoke-static {p3, p4}, Lcm2/b;->a(Lvl2/g;Lcm2/t;)Lcm2/o;

    move-result-object v6

    invoke-virtual {p1}, Lvl2/f;->a()Lvl2/m;

    move-result-object p1

    invoke-virtual {p1}, Lvl2/m;->a()Lvl2/i;

    move-result-object p1

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    const/4 v0, 0x2

    invoke-static {p4, p1, p3, v0, p3}, Lcm2/t;->g(Lcm2/t;Lvl2/i;Ljava/lang/String;ILjava/lang/Object;)Lhv1/e;

    move-result-object p3

    :cond_0
    move-object v8, p3

    new-instance v1, Lcm2/q;

    move-object v7, p2

    invoke-direct/range {v1 .. v8}, Lcm2/q;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/o;Lcm2/o;Lam2/d0;Lm91/u;)V

    new-instance p1, Lcm2/r$e;

    invoke-direct {p1, v1}, Lcm2/r$e;-><init>(Lcm2/q;)V

    return-object p1
.end method


# virtual methods
.method public final a(Lvl2/f;Ljb1/a;Lcm2/t;Lam2/d0;)Lcm2/r;
    .locals 1

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "designItemReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trendMenuSheetReducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metaData"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p4, p2, p3}, Lcm2/a;->b(Lvl2/f;Lam2/d0;Ljb1/a;Lcm2/t;)Lcm2/r;

    move-result-object p1

    return-object p1
.end method
