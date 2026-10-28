.class public final Lp6/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq83/i;


# static fields
.field public static final synthetic w:Lp6/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp6/t;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lp6/t;->w:Lp6/t;

    return-void
.end method

.method public static final a(Ljava/lang/String;)Lp6/s0;
    .locals 2

    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of v1, p0, Lp6/s0;

    if-eqz v1, :cond_0

    check-cast p0, Lp6/s0;

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static b(Landroid/content/Context;Lp6/b;)V
    .locals 3

    if-eqz p1, :cond_1

    iget v0, p1, Lp6/b;->a:I

    const/high16 v1, -0x80000000

    if-gt v1, v0, :cond_0

    const/4 v1, -0x1

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "appWidgetLayout-"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lv63/h;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Could not delete LayoutConfiguration dataStoreFile when cleaning upold appwidget id "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "GlanceAppWidget"

    invoke-static {v0, p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    :goto_0
    return-void
.end method

.method public static c(I)V
    .locals 2

    sget-object v0, Landroidx/glance/appwidget/UnmanagedSessionReceiver;->a:Lp6/t;

    monitor-enter v0

    :try_start_0
    sget-object v1, Landroidx/glance/appwidget/UnmanagedSessionReceiver;->b:Ljava/util/LinkedHashMap;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p0, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    new-instance p0, Ljava/lang/ClassCastException;

    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public d(Landroid/content/Context;ILs83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p3, Lp6/y0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lp6/y0;

    iget v1, v0, Lp6/y0;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp6/y0;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp6/y0;

    invoke-direct {v0, p0, p3}, Lp6/y0;-><init>(Lp6/t;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lp6/y0;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp6/y0;->E:I

    const-string v3, "GlanceAppWidget"

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget p2, v0, Lp6/y0;->x:I

    iget-object p1, v0, Lp6/y0;->w:Landroid/content/Context;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/datastore/core/CorruptionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object p3, v0

    goto :goto_3

    :catch_1
    move-exception v0

    move-object p3, v0

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    sget-object p3, Ly6/f;->a:Ly6/f;

    sget-object v2, Lp6/f1;->a:Lp6/f1;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "appWidgetLayout-"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iput-object p1, v0, Lp6/y0;->w:Landroid/content/Context;

    iput p2, v0, Lp6/y0;->x:I

    iput v4, v0, Lp6/y0;->E:I

    invoke-virtual {p3, p1, v2, v5, v0}, Ly6/f;->c(Landroid/content/Context;Ly6/g;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Lr6/s;
    :try_end_1
    .catch Landroidx/datastore/core/CorruptionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_2
    move-object v1, p1

    move v4, p2

    goto :goto_5

    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "I/O error reading set of layout structures for App Widget id "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {}, Lr6/s;->q()Lr6/s;

    move-result-object p3

    goto :goto_2

    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Set of layout structures for App Widget id "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " is corrupted"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {}, Lr6/s;->q()Lr6/s;

    move-result-object p3

    goto :goto_2

    :goto_5
    invoke-virtual {p3}, Lr6/s;->r()Landroidx/glance/appwidget/protobuf/e0;

    move-result-object p1

    const/16 p2, 0xa

    invoke-static {p1, p2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-static {p2}, Lm83/g0;->W(I)I

    move-result p2

    const/16 v0, 0x10

    if-ge p2, v0, :cond_4

    move p2, v0

    :cond_4
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lr6/u;

    invoke-virtual {p2}, Lr6/u;->p()Lr6/w;

    move-result-object v2

    invoke-virtual {p2}, Lr6/u;->q()I

    move-result p2

    new-instance v3, Ljava/lang/Integer;

    invoke-direct {v3, p2}, Ljava/lang/Integer;-><init>(I)V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_5
    invoke-static {v0}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v2

    new-instance v0, Lp6/z0;

    invoke-virtual {p3}, Lr6/s;->s()I

    move-result v3

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->H1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lp6/z0;-><init>(Landroid/content/Context;Ljava/util/LinkedHashMap;IILjava/util/Set;)V

    return-object v0
.end method
