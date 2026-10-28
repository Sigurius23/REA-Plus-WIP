.class public abstract Lrg2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a\u001f\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0000*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\"\u0014\u0010\u000c\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0007\"\u001a\u0010\u000f\u001a\u00020\u00058\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0007\u001a\u0004\u0008\u000e\u0010\t\"\u001a\u0010\u0015\u001a\u00020\u00108\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\"\u001a\u0010\u0018\u001a\u00020\u00108\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0012\u001a\u0004\u0008\u0017\u0010\u0014\u00a8\u0006\u0019"
    }
    d2 = {
        "",
        "Lrg2/h;",
        "Lm91/u;",
        "s",
        "(Ljava/util/List;)Ljava/util/List;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "getPreSessionRecentActivityIconDesignItemReducer",
        "()Ljb1/a;",
        "preSessionRecentActivityIconDesignItemReducer",
        "b",
        "recentActivityIconChildReducer",
        "c",
        "getPreSessionRecentActivitiesRowDesignItemReducer",
        "preSessionRecentActivitiesRowDesignItemReducer",
        "Lm91/p;",
        "d",
        "Lm91/p;",
        "getPreSessionRecentActivityIconDesignItemViewFactory",
        "()Lm91/p;",
        "preSessionRecentActivityIconDesignItemViewFactory",
        "e",
        "getPreSessionRecentActivitiesRowDesignItemViewFactory",
        "preSessionRecentActivitiesRowDesignItemViewFactory",
        "start-activity_release"
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

.field private static final b:Ljb1/a;

.field private static final c:Ljb1/a;

.field private static final d:Lm91/p;

.field private static final e:Lm91/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr61/h;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lr61/h;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lrg2/e;->a:Ljb1/a;

    new-instance v0, Lr61/h;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lr61/h;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lrg2/e;->b:Ljb1/a;

    new-instance v0, Lr61/h;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lr61/h;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lrg2/e;->c:Ljb1/a;

    new-instance v0, Lr61/h;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lr61/h;-><init>(I)V

    invoke-static {v0}, Lm91/m;->g(Lkotlin/jvm/functions/Function1;)Lm91/p;

    move-result-object v0

    sput-object v0, Lrg2/e;->d:Lm91/p;

    new-instance v0, Lr61/h;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lr61/h;-><init>(I)V

    invoke-static {v0}, Lm91/m;->g(Lkotlin/jvm/functions/Function1;)Lm91/p;

    move-result-object v0

    sput-object v0, Lrg2/e;->e:Lm91/p;

    return-void
.end method

.method public static synthetic a(Lm91/q;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lrg2/e;->m(Lm91/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lrg2/e;->j(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lm91/q;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lrg2/e;->q(Lm91/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lrg2/e;->n(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/startactivity/presession/domain/model/PreSessionRecentActivityIconModel;)Lrg2/i;
    .locals 0

    invoke-static {p0}, Lrg2/e;->p(Lcom/whoop/startactivity/presession/domain/model/PreSessionRecentActivityIconModel;)Lrg2/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lrg2/e;->r(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lrg2/e;->k(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/whoop/startactivity/presession/domain/model/PreSessionRecentActivitiesRowModel;)Lrg2/g;
    .locals 0

    invoke-static {p0}, Lrg2/e;->l(Lcom/whoop/startactivity/presession/domain/model/PreSessionRecentActivitiesRowModel;)Lrg2/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lrg2/e;->o(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr61/h;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lr61/h;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr61/h;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lr61/h;-><init>(I)V

    const-class v1, Lcom/whoop/startactivity/presession/domain/model/PreSessionRecentActivitiesRowModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lrg2/e$a;

    invoke-direct {v2, v0}, Lrg2/e$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lcom/whoop/startactivity/presession/domain/model/PreSessionRecentActivitiesRowModel;)Lrg2/g;
    .locals 2

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lrg2/g;

    sget-object v1, Lrg2/e;->b:Ljb1/a;

    invoke-virtual {p0}, Lcom/whoop/startactivity/presession/domain/model/PreSessionRecentActivitiesRowModel;->getItems()Ljava/util/List;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lrg2/g;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method private static final m(Lm91/q;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemViewFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object p0

    const-class v0, Lrg2/g;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lsg2/j;

    invoke-direct {v1}, Lsg2/j;-><init>()V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr61/h;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lr61/h;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr61/h;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lr61/h;-><init>(I)V

    const-class v1, Lcom/whoop/startactivity/presession/domain/model/PreSessionRecentActivityIconModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lrg2/e$b;

    invoke-direct {v2, v0}, Lrg2/e$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lcom/whoop/startactivity/presession/domain/model/PreSessionRecentActivityIconModel;)Lrg2/i;
    .locals 3

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lrg2/i;

    invoke-virtual {p0}, Lcom/whoop/startactivity/presession/domain/model/PreSessionRecentActivityIconModel;->getInternalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/startactivity/presession/domain/model/PreSessionRecentActivityIconModel;->getIconUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/startactivity/presession/domain/model/PreSessionRecentActivityIconModel;->isSelected()Z

    move-result p0

    invoke-direct {v0, v1, v2, p0}, Lrg2/i;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method

.method private static final q(Lm91/q;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemViewFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object p0

    const-class v0, Lrg2/i;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lsg2/m;

    invoke-direct {v1}, Lsg2/m;-><init>()V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lrg2/e;->a:Ljb1/a;

    invoke-virtual {v0}, Ljb1/a;->f()Llb1/y0;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljb1/b;->c(Llb1/y0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final s(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lrg2/h;",
            ">;)",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lrg2/h;

    invoke-virtual {v2}, Lrg2/h;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ltg2/k;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrg2/h;

    new-instance v2, Lrg2/i;

    invoke-virtual {v1}, Lrg2/h;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lrg2/h;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lrg2/h;->c()Z

    move-result v1

    invoke-direct {v2, v3, v4, v1}, Lrg2/i;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {p0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object p0
.end method
