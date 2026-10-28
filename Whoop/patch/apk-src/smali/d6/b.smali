.class public final Ld6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La6/q;

.field public final b:Le6/i;

.field public final c:Landroid/content/Context;

.field public final d:Ljava/lang/String;

.field public final e:Ll83/p;

.field public final f:Ljava/util/Set;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;La6/q;Le6/i;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keysToMigrate"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La11/l;

    const/16 v1, 0xf

    invoke-direct {v0, v1, p1, p2}, La11/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Ld6/b;->a:La6/q;

    iput-object p5, p0, Ld6/b;->b:Le6/i;

    iput-object p1, p0, Ld6/b;->c:Landroid/content/Context;

    iput-object p2, p0, Ld6/b;->d:Ljava/lang/String;

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Ld6/b;->e:Ll83/p;

    sget-object p1, Ld6/c;->a:Ljava/util/LinkedHashSet;

    if-ne p3, p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    check-cast p3, Ljava/lang/Iterable;

    invoke-static {p3}, Lm83/s;->H1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ld6/b;->f:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Ld6/a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ld6/a;

    iget v1, v0, Ld6/a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ld6/a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Ld6/a;

    invoke-direct {v0, p0, p2}, Ld6/a;-><init>(Ld6/b;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Ld6/a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ld6/a;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Ld6/a;->y:I

    iget-object p2, p0, Ld6/b;->a:La6/q;

    invoke-virtual {p2, p1, v0}, La6/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_4

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_4
    iget-object p1, p0, Ld6/b;->e:Ll83/p;

    const/4 p2, 0x0

    iget-object v0, p0, Ld6/b;->f:Ljava/util/Set;

    if-nez v0, :cond_6

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object p1

    const-string v0, "getAll(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    move v3, p2

    goto :goto_3

    :cond_6
    check-cast v0, Ljava/lang/Iterable;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/SharedPreferences;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_7

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_2

    :cond_7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p1, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    :goto_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
