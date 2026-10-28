.class public final Lcs1/a$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcs1/a$f;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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
.field final synthetic w:Lec3/m;

.field final synthetic x:Lcs1/a;


# direct methods
.method public constructor <init>(Lec3/m;Lcs1/a;)V
    .locals 0

    iput-object p1, p0, Lcs1/a$f$a;->w:Lec3/m;

    iput-object p2, p0, Lcs1/a$f$a;->x:Lcs1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lcs1/a$f$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcs1/a$f$a$a;

    iget v1, v0, Lcs1/a$f$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcs1/a$f$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcs1/a$f$a$a;

    invoke-direct {v0, p0, p2}, Lcs1/a$f$a$a;-><init>(Lcs1/a$f$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcs1/a$f$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcs1/a$f$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcs1/a$f$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lcs1/a$f$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lcs1/a$f$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lcs1/a$f$a;->w:Lec3/m;

    check-cast p1, Lsr1/e;

    const/4 v2, 0x0

    :try_start_0
    iget-object v4, p0, Lcs1/a$f$a;->x:Lcs1/a;

    invoke-static {v4}, Lcs1/a;->o(Lcs1/a;)Lds1/l;

    move-result-object v4

    invoke-virtual {v4, p1}, Lds1/l;->s(Lsr1/e;)Lds1/k;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object v4, p0, Lcs1/a$f$a;->x:Lcs1/a;

    invoke-static {v4}, Lcs1/a;->n(Lcs1/a;)Ltr2/n;

    move-result-object v4

    const-string v5, "Failed to reduce domain state"

    new-array v6, v2, [Lqr2/a$a;

    invoke-interface {v4, v5, p1, v6}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object p1, p0, Lcs1/a$f$a;->x:Lcs1/a;

    invoke-static {p1}, Lcs1/a;->g(Lcs1/a;)Lds1/k;

    move-result-object p1

    :goto_1
    const/4 v4, 0x0

    iput-object v4, v0, Lcs1/a$f$a$a;->y:Ljava/lang/Object;

    iput-object v4, v0, Lcs1/a$f$a$a;->E:Ljava/lang/Object;

    iput-object v4, v0, Lcs1/a$f$a$a;->F:Ljava/lang/Object;

    iput-object v4, v0, Lcs1/a$f$a$a;->G:Ljava/lang/Object;

    iput v2, v0, Lcs1/a$f$a$a;->H:I

    iput v3, v0, Lcs1/a$f$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
