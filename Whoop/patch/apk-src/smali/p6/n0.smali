.class public final Lp6/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lp6/j0;

.field public static final e:Le6/a;

.field public static f:La6/g;

.field public static final g:Lf6/d;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/appwidget/AppWidgetManager;

.field public final c:Ll83/p;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lp6/j0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lp6/n0;->d:Lp6/j0;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "GlanceAppWidgetManager-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Landroid/app/Application;->getProcessName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ldc1/c;

    const/16 v2, 0x12

    invoke-direct {v1, v2}, Ldc1/c;-><init>(I)V

    sget-object v2, Lbc3/q0;->a:Lkc3/e;

    sget-object v2, Lkc3/d;->w:Lkc3/d;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v3

    invoke-virtual {v2, v3}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object v2

    invoke-static {v2}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v2

    const-string v3, "name"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Le6/a;

    invoke-direct {v3, v0, v2, v1}, Le6/a;-><init>(Ljava/lang/String;Lbc3/c0;Lkotlin/jvm/functions/Function1;)V

    sput-object v3, Lp6/n0;->e:Le6/a;

    const-string v0, "list::Providers"

    invoke-static {v0}, Lge3/g;->V(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    sput-object v0, Lp6/n0;->g:Lf6/d;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/n0;->a:Landroid/content/Context;

    invoke-static {p1}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object p1

    iput-object p1, p0, Lp6/n0;->b:Landroid/appwidget/AppWidgetManager;

    new-instance p1, Lm83/p;

    const/16 v0, 0x9

    invoke-direct {p1, p0, v0}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lp6/n0;->c:Ll83/p;

    return-void
.end method


# virtual methods
.method public final a(Ls83/i;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lp6/n0;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lp6/n0;->b:Landroid/appwidget/AppWidgetManager;

    invoke-virtual {v1}, Landroid/appwidget/AppWidgetManager;->getInstalledProviders()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Landroid/appwidget/AppWidgetProviderInfo;

    iget-object v4, v4, Landroid/appwidget/AppWidgetProviderInfo;->provider:Landroid/content/ComponentName;

    invoke-virtual {v4}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/appwidget/AppWidgetProviderInfo;

    iget-object v2, v2, Landroid/appwidget/AppWidgetProviderInfo;->provider:Landroid/content/ComponentName;

    invoke-virtual {v2}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lp6/n0;->c:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La6/g;

    new-instance v2, Lo23/p;

    const/4 v3, 0x0

    const/4 v4, 0x3

    invoke-direct {v2, v0, v3, v4}, Lo23/p;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-interface {v1, v2, p1}, La6/g;->a(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_3

    return-object p1

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final b(Ljava/lang/Class;Lq83/d;)Ljava/io/Serializable;
    .locals 6

    instance-of v0, p2, Lp6/l0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lp6/l0;

    iget v1, v0, Lp6/l0;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp6/l0;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp6/l0;

    invoke-direct {v0, p0, p2}, Lp6/l0;-><init>(Lp6/n0;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lp6/l0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp6/l0;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lp6/l0;->w:Ljava/lang/Class;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p1, v0, Lp6/l0;->w:Ljava/lang/Class;

    iput v3, v0, Lp6/l0;->z:I

    invoke-virtual {p0, v0}, Lp6/n0;->c(Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lp6/k0;

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    iget-object p2, p2, Lp6/k0;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_4

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_4
    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ComponentName;

    iget-object v1, p0, Lp6/n0;->b:Landroid/appwidget/AppWidgetManager;

    invoke-virtual {v1, v0}, Landroid/appwidget/AppWidgetManager;->getAppWidgetIds(Landroid/content/ComponentName;)[I

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_3
    if-ge v3, v2, :cond_5

    aget v4, v0, v3

    new-instance v5, Lp6/b;

    invoke-direct {v5, v4}, Lp6/b;-><init>(I)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_5
    invoke-static {p2, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_2

    :cond_6
    return-object p2

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "no canonical provider name"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(Ls83/c;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p1, Lp6/m0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lp6/m0;

    iget v1, v0, Lp6/m0;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp6/m0;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp6/m0;

    invoke-direct {v0, p0, p1}, Lp6/m0;-><init>(Lp6/n0;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lp6/m0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp6/m0;->z:I

    iget-object v3, p0, Lp6/n0;->c:Ll83/p;

    sget-object v4, Lp6/n0;->d:Lp6/j0;

    sget-object v5, Lp6/n0;->g:Lf6/d;

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v7, :cond_2

    if-ne v2, v6, :cond_1

    iget-object v0, v0, Lp6/m0;->w:Lp6/n0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lp6/m0;->w:Lp6/n0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La6/g;

    invoke-interface {p1}, La6/g;->getData()Lec3/l;

    move-result-object p1

    iput-object p0, v0, Lp6/m0;->w:Lp6/n0;

    iput v7, v0, Lp6/m0;->z:I

    invoke-static {p1, v0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto/16 :goto_6

    :cond_4
    move-object v2, p0

    :goto_1
    move-object v7, p1

    check-cast v7, Lf6/f;

    invoke-virtual {v7, v5}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_5

    goto :goto_2

    :cond_5
    move-object p1, v8

    :goto_2
    check-cast p1, Lf6/f;

    if-nez p1, :cond_c

    iput-object v2, v0, Lp6/m0;->w:Lp6/n0;

    iput v6, v0, Lp6/m0;->z:I

    iget-object p1, p0, Lp6/n0;->b:Landroid/appwidget/AppWidgetManager;

    invoke-virtual {p1}, Landroid/appwidget/AppWidgetManager;->getInstalledProviders()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v9, v7

    check-cast v9, Landroid/appwidget/AppWidgetProviderInfo;

    iget-object v9, v9, Landroid/appwidget/AppWidgetProviderInfo;->provider:Landroid/content/ComponentName;

    invoke-virtual {v9}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v9

    iget-object v10, p0, Lp6/n0;->a:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_8
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/appwidget/AppWidgetProviderInfo;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, v7, Landroid/appwidget/AppWidgetProviderInfo;->provider:Landroid/content/ComponentName;

    invoke-virtual {v7}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7, v8}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v7

    invoke-virtual {v7, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    instance-of v9, v7, Lp6/s0;

    if-eqz v9, :cond_9

    check-cast v7, Lp6/s0;

    goto :goto_5

    :cond_9
    move-object v7, v8

    :goto_5
    if-eqz v7, :cond_8

    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_a
    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La6/g;

    new-instance v6, Lo23/p;

    const/4 v7, 0x2

    invoke-direct {v6, p1, v8, v7}, Lo23/p;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-interface {v3, v6, v0}, La6/g;->a(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    :goto_6
    return-object v1

    :cond_b
    move-object v0, v2

    :goto_7
    check-cast p1, Lf6/f;

    move-object v2, v0

    :cond_c
    iget-object v0, v2, Lp6/n0;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v5}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    if-nez v1, :cond_d

    new-instance p1, Lp6/k0;

    sget-object v0, Lm83/z;->w:Lm83/z;

    invoke-direct {p1, v0, v0}, Lp6/k0;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    return-object p1

    :cond_d
    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_e
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    new-instance v5, Landroid/content/ComponentName;

    invoke-direct {v5, v0, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4, v3}, Lp6/j0;->a(Lp6/j0;Ljava/lang/String;)Lf6/d;

    move-result-object v3

    invoke-virtual {p1, v3}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_f

    move-object v6, v8

    goto :goto_9

    :cond_f
    new-instance v6, Ll83/k;

    invoke-direct {v6, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_9
    if-eqz v6, :cond_e

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_10
    invoke-static {v2}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    new-instance v0, Lp6/k0;

    invoke-static {p1}, Lx30/s0;->i(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lp6/k0;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    return-object v0
.end method

.method public final d(Lp6/s0;Lp6/g0;Ln20/j;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lp6/n0;->d:Lp6/j0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object v0, p0, Lp6/n0;->c:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La6/g;

    new-instance v1, Lay/u;

    const/4 v2, 0x0

    const/16 v3, 0x12

    invoke-direct {v1, p1, p2, v2, v3}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-interface {v0, v1, p3}, La6/g;->a(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "no provider name"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "no receiver name"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
