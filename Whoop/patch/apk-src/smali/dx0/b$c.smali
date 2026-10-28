.class final Ldx0/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldx0/b;->o(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Ldx0/b;


# direct methods
.method public constructor <init>(Ldx0/b;)V
    .locals 0

    iput-object p1, p0, Ldx0/b$c;->w:Ldx0/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lic/n0;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Ldx0/b$c$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ldx0/b$c$a;

    iget v1, v0, Ldx0/b$c$a;->K:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ldx0/b$c$a;->K:I

    goto :goto_0

    :cond_0
    new-instance v0, Ldx0/b$c$a;

    invoke-direct {v0, p0, p2}, Ldx0/b$c$a;-><init>(Ldx0/b$c;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ldx0/b$c$a;->I:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ldx0/b$c$a;->K:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_2

    :cond_1
    iget p1, v0, Ldx0/b$c$a;->G:I

    iget-object v2, v0, Ldx0/b$c$a;->F:Ljava/lang/Object;

    check-cast v2, Lic/n0;

    iget-object v2, v0, Ldx0/b$c$a;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v6, v0, Ldx0/b$c$a;->y:Ljava/lang/Object;

    check-cast v6, Ldx0/b;

    iget-object v7, v0, Ldx0/b$c$a;->x:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Iterable;

    iget-object v7, v0, Ldx0/b$c$a;->w:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    goto :goto_3

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Iterable;

    iget-object p2, p0, Ldx0/b$c;->w:Ldx0/b;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v2, p1

    move-object v6, p2

    move p1, v5

    :cond_4
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lic/n0;

    :try_start_1
    invoke-virtual {v6, p2}, Ldx0/b;->q(Lic/n0;)Z

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_5

    iget-object v7, p2, Lic/n0;->b:Lic/m0;

    invoke-virtual {v7}, Lic/m0;->a()Z

    move-result v7

    if-eqz v7, :cond_5

    iput-object v8, v0, Ldx0/b$c$a;->w:Ljava/lang/Object;

    iput-object v8, v0, Ldx0/b$c$a;->x:Ljava/lang/Object;

    iput-object v6, v0, Ldx0/b$c$a;->y:Ljava/lang/Object;

    iput-object v2, v0, Ldx0/b$c$a;->z:Ljava/lang/Object;

    iput-object v8, v0, Ldx0/b$c$a;->E:Ljava/lang/Object;

    iput-object v8, v0, Ldx0/b$c$a;->F:Ljava/lang/Object;

    iput p1, v0, Ldx0/b$c$a;->G:I

    iput v5, v0, Ldx0/b$c$a;->H:I

    iput v4, v0, Ldx0/b$c$a;->K:I

    invoke-static {v6, p2, v0}, Ldx0/b;->g(Ldx0/b;Lic/n0;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_5
    iget-object v7, p2, Lic/n0;->c:Ljava/util/HashSet;

    const-string v9, "DATA_SYNC_INTERVAL_TAG"

    invoke-virtual {v7, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    iput-object v8, v0, Ldx0/b$c$a;->w:Ljava/lang/Object;

    iput-object v8, v0, Ldx0/b$c$a;->x:Ljava/lang/Object;

    iput-object v6, v0, Ldx0/b$c$a;->y:Ljava/lang/Object;

    iput-object v2, v0, Ldx0/b$c$a;->z:Ljava/lang/Object;

    iput-object v8, v0, Ldx0/b$c$a;->E:Ljava/lang/Object;

    iput-object v8, v0, Ldx0/b$c$a;->F:Ljava/lang/Object;

    iput p1, v0, Ldx0/b$c$a;->G:I

    iput v5, v0, Ldx0/b$c$a;->H:I

    iput v3, v0, Ldx0/b$c$a;->K:I

    invoke-static {v6, p2, v0}, Ldx0/b;->f(Ldx0/b;Lic/n0;Lq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p2, v1, :cond_4

    :goto_2
    return-object v1

    :goto_3
    invoke-static {v6}, Ldx0/b;->e(Ldx0/b;)Ltr2/n;

    move-result-object v7

    const-string v8, "Error reading and/or writing to DataSyncWork DB"

    new-array v9, v5, [Lqr2/a$a;

    invoke-interface {v7, v8, p2, v9}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_1

    :cond_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Ldx0/b$c;->b(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
