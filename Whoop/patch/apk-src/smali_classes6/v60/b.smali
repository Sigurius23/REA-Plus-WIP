.class public abstract Lv60/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "Lm91/u;",
        "e",
        "(Lm91/u;)Lm91/u;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "itemReducer",
        "achievements_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv01/k;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lv01/k;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lv60/b;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lv60/b;->d(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()Ljb1/a;
    .locals 1

    sget-object v0, Lv60/b;->a:Ljb1/a;

    return-object v0
.end method

.method public static final synthetic c(Lm91/u;)Lm91/u;
    .locals 0

    invoke-static {p0}, Lv60/b;->e(Lm91/u;)Lm91/u;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lm91/u;)Lm91/u;
    .locals 13

    instance-of v0, p0, Li51/i;

    if-eqz v0, :cond_0

    move-object v1, p0

    check-cast v1, Li51/i;

    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static/range {v1 .. v9}, Li51/i;->b(Li51/i;Li51/h;Li51/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Li51/p;ZILjava/lang/Object;)Li51/i;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Lk81/e;

    if-eqz v0, :cond_2

    move-object v1, p0

    check-cast v1, Lk81/e;

    invoke-virtual {v1}, Lk81/e;->f()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p0, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm91/o;

    invoke-virtual {v0}, Lm91/o;->e()Lm91/u;

    move-result-object v2

    invoke-static {v2}, Lv60/b;->e(Lm91/u;)Lm91/u;

    move-result-object v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v2, v4, v3, v4}, Lm91/o;->b(Lm91/o;Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;ILjava/lang/Object;)Lm91/o;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/16 v11, 0x1f7

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v1 .. v12}, Lk81/e;->b(Lk81/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;FFFLk81/a;ZILjava/lang/Object;)Lk81/e;

    move-result-object p0

    :cond_2
    return-object p0
.end method
