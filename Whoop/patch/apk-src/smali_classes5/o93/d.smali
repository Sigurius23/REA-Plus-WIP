.class public abstract Lo93/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/LinkedHashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    sget-object v0, Lo93/j;->E:Ljava/util/Set;

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

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo93/j;

    const-string v3, "primitiveType"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lo93/n;->k:Lva3/e;

    iget-object v2, v2, Lo93/j;->w:Lva3/h;

    invoke-virtual {v3, v2}, Lva3/e;->a(Lva3/h;)Lva3/e;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object v0, Lo93/m;->f:Lva3/f;

    invoke-virtual {v0}, Lva3/f;->i()Lva3/e;

    move-result-object v0

    invoke-static {v0, v1}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    sget-object v1, Lo93/m;->h:Lva3/f;

    invoke-virtual {v1}, Lva3/f;->i()Lva3/e;

    move-result-object v1

    invoke-static {v1, v0}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    sget-object v1, Lo93/m;->j:Lva3/f;

    invoke-virtual {v1}, Lva3/f;->i()Lva3/e;

    move-result-object v1

    invoke-static {v1, v0}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lva3/e;

    const-string v3, "topLevelFqName"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lva3/c;

    invoke-virtual {v2}, Lva3/e;->b()Lva3/e;

    move-result-object v4

    iget-object v2, v2, Lva3/e;->a:Lva3/f;

    invoke-virtual {v2}, Lva3/f;->g()Lva3/h;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    sput-object v1, Lo93/d;->a:Ljava/util/LinkedHashSet;

    return-void
.end method
