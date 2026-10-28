.class final Luj0/a$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luj0/a$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

    iput-object p1, p0, Luj0/a$g$a;->w:Luj0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p1, p2, Luj0/a$g$a$a;

    if-eqz p1, :cond_0

    move-object p1, p2

    check-cast p1, Luj0/a$g$a$a;

    iget v0, p1, Luj0/a$g$a$a;->G:I

    const/high16 v1, -0x80000000

    and-int v2, v0, v1

    if-eqz v2, :cond_0

    sub-int/2addr v0, v1

    iput v0, p1, Luj0/a$g$a$a;->G:I

    goto :goto_0

    :cond_0
    new-instance p1, Luj0/a$g$a$a;

    invoke-direct {p1, p0, p2}, Luj0/a$g$a$a;-><init>(Luj0/a$g$a;Lq83/d;)V

    :goto_0
    iget-object p2, p1, Luj0/a$g$a$a;->E:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p1, Luj0/a$g$a$a;->G:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object v0, p1, Luj0/a$g$a$a;->y:Ljava/lang/Object;

    check-cast v0, Luj0/a;

    iget-object v1, p1, Luj0/a$g$a$a;->x:Ljava/lang/Object;

    check-cast v1, Lmc3/a;

    iget-object p1, p1, Luj0/a$g$a$a;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Luj0/a$g$a;->w:Luj0/a;

    invoke-static {p2}, Luj0/a;->j(Luj0/a;)Lmc3/a;

    move-result-object v1

    iget-object p2, p0, Luj0/a$g$a;->w:Luj0/a;

    iput-object v3, p1, Luj0/a$g$a$a;->w:Ljava/lang/Object;

    iput-object v1, p1, Luj0/a$g$a$a;->x:Ljava/lang/Object;

    iput-object p2, p1, Luj0/a$g$a$a;->y:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, p1, Luj0/a$g$a$a;->z:I

    iput v2, p1, Luj0/a$g$a$a;->G:I

    invoke-interface {v1, p1}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    move-object v0, p2

    :goto_1
    :try_start_0
    invoke-static {v0}, Luj0/a;->m(Luj0/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1, v3}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {v1, v3}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmj0/d;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lmj0/d;->g()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1, p2}, Luj0/a$g$a;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
