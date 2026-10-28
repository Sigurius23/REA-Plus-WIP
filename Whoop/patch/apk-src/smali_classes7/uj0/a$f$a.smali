.class final Luj0/a$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luj0/a$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Luj0/a;


# direct methods
.method public constructor <init>(Luj0/a;)V
    .locals 0

    iput-object p1, p0, Luj0/a$f$a;->w:Luj0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lik0/c;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Luj0/a$f$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Luj0/a$f$a$a;

    iget v1, v0, Luj0/a$f$a$a;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Luj0/a$f$a$a;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Luj0/a$f$a$a;

    invoke-direct {v0, p0, p2}, Luj0/a$f$a$a;-><init>(Luj0/a$f$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Luj0/a$f$a$a;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Luj0/a$f$a$a;->G:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Luj0/a$f$a$a;->y:Ljava/lang/Object;

    check-cast p1, Luj0/a;

    iget-object v1, v0, Luj0/a$f$a$a;->x:Ljava/lang/Object;

    check-cast v1, Lmc3/a;

    iget-object v0, v0, Luj0/a$f$a$a;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Luj0/a$f$a;->w:Luj0/a;

    invoke-static {p2}, Luj0/a;->j(Luj0/a;)Lmc3/a;

    move-result-object p2

    iget-object v2, p0, Luj0/a$f$a;->w:Luj0/a;

    iput-object p1, v0, Luj0/a$f$a$a;->w:Ljava/lang/Object;

    iput-object p2, v0, Luj0/a$f$a$a;->x:Ljava/lang/Object;

    iput-object v2, v0, Luj0/a$f$a$a;->y:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, v0, Luj0/a$f$a$a;->z:I

    iput v3, v0, Luj0/a$f$a$a;->G:I

    invoke-interface {p2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    move-object v1, p2

    move-object p1, v2

    :goto_1
    const/4 p2, 0x0

    :try_start_0
    invoke-static {p1, v0}, Luj0/a;->l(Luj0/a;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1, p2}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {v1, p2}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Luj0/a$f$a;->b(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
