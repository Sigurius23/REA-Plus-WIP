.class public abstract Ln93/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/LinkedHashSet;

.field public static final b:Lva3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    sget-object v0, Lfa3/x;->a:Lva3/e;

    sget-object v1, Lfa3/x;->h:Lva3/e;

    sget-object v2, Lfa3/x;->i:Lva3/e;

    sget-object v3, Lfa3/x;->c:Lva3/e;

    sget-object v4, Lfa3/x;->d:Lva3/e;

    sget-object v5, Lfa3/x;->f:Lva3/e;

    filled-new-array/range {v0 .. v5}, [Lva3/e;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

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

    goto :goto_0

    :cond_0
    sput-object v1, Ln93/a;->a:Ljava/util/LinkedHashSet;

    sget-object v0, Lfa3/x;->g:Lva3/e;

    const-string v1, "REPEATABLE_ANNOTATION"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lva3/c;

    invoke-virtual {v0}, Lva3/e;->b()Lva3/e;

    move-result-object v2

    iget-object v0, v0, Lva3/e;->a:Lva3/f;

    invoke-virtual {v0}, Lva3/f;->g()Lva3/h;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    sput-object v1, Ln93/a;->b:Lva3/c;

    return-void
.end method
