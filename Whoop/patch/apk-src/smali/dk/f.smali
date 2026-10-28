.class public final Ldk/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lik/b;


# instance fields
.field public final a:Lfk/a;

.field public final b:Landroid/content/SharedPreferences;

.field public final c:Lnk/i;

.field public final d:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lfk/a;Landroid/content/SharedPreferences;Ljava/io/File;Lwe/o;)V
    .locals 7

    const-string v0, "storageKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diagnostics"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ldk/f;->a:Lfk/a;

    iput-object p3, p0, Ldk/f;->b:Landroid/content/SharedPreferences;

    new-instance v1, Lnk/i;

    new-instance v4, Laj/d;

    invoke-direct {v4, p3}, Laj/d;-><init>(Ljava/lang/Object;)V

    move-object v3, p1

    move-object v5, p2

    move-object v2, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lnk/i;-><init>(Ljava/io/File;Ljava/lang/String;Laj/d;Lfk/a;Lwe/o;)V

    iput-object v1, p0, Ldk/f;->c:Lnk/i;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Ldk/f;->d:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 4

    iget-object v0, p0, Ldk/f;->c:Lnk/i;

    iget-object v1, v0, Lnk/i;->a:Ljava/io/File;

    new-instance v2, Lnk/b;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lnk/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/io/File;

    :cond_0
    new-instance v2, Lnk/e;

    invoke-direct {v2, v0}, Lnk/e;-><init>(Lnk/i;)V

    invoke-static {v1, v2}, Lm83/n;->Q0([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public final b(Lik/a;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Ldk/f;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object p1, p1, Lik/a;->w:Ljava/lang/String;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final c(Lik/a;)Ljava/lang/String;
    .locals 2

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lik/a;->w:Ljava/lang/String;

    const/4 v0, 0x0

    iget-object v1, p0, Ldk/f;->b:Landroid/content/SharedPreferences;

    invoke-interface {v1, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 1

    const-string v0, "null cannot be cast to non-null type kotlin.String"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ls83/c;

    iget-object v0, p0, Ldk/f;->c:Lnk/i;

    invoke-virtual {v0, p1, p2}, Lnk/i;->d(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljk/a;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Ldk/e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ldk/e;

    iget v1, v0, Ldk/e;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ldk/e;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Ldk/e;

    invoke-direct {v0, p0, p2}, Ldk/e;-><init>(Ldk/f;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Ldk/e;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ldk/e;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ldk/e;->x:Ljk/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p2, "event"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lge3/g;->v(Ljk/a;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v2, "eventToJsonObject(event).toString()"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p0, v0, Ldk/e;->w:Ldk/f;

    iput-object p1, v0, Ldk/e;->x:Ljk/a;

    iput v3, v0, Ldk/e;->E:I

    iget-object v2, p0, Ldk/f;->c:Lnk/i;

    invoke-virtual {v2, p2, v0}, Lnk/i;->i(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final f(Ls83/c;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ldk/f;->c:Lnk/i;

    invoke-virtual {v0, p1}, Lnk/i;->h(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final g(Lkk/b;Lgj/g;Lbc3/c0;Lbc3/z;)Lnk/m;
    .locals 8

    const-string v0, "scope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lnk/m;

    iget-object v7, p0, Ldk/f;->a:Lfk/a;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v7}, Lnk/m;-><init>(Ldk/f;Lkk/b;Lgj/g;Lbc3/c0;Lbc3/z;Lfk/a;)V

    return-object v1
.end method

.method public final h(Ljava/lang/String;)V
    .locals 1

    const-string v0, "filePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldk/f;->c:Lnk/i;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lnk/i;->h:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final i(Ljava/lang/String;)V
    .locals 1

    const-string v0, "filePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldk/f;->c:Lnk/i;

    invoke-virtual {v0, p1}, Lnk/i;->f(Ljava/lang/String;)Z

    return-void
.end method
