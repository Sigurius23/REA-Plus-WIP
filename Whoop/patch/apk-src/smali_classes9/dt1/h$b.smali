.class final Ldt1/h$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldt1/h;->s(Ljava/time/Instant;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Ldt1/b;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$deleteLocal$1"
    f = "LabradorDetailsInteractor.kt"
    l = {
        0x10c,
        0x10e,
        0x10f,
        0x111
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ldt1/h;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Ljava/time/Instant;


# direct methods
.method public constructor <init>(Ljava/time/Instant;Ldt1/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/time/Instant;",
            "Ldt1/h;",
            "Lq83/d<",
            "-",
            "Ldt1/h$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldt1/h$b;->z:Ljava/time/Instant;

    iput-object p2, p0, Ldt1/h$b;->E:Ldt1/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Ldt1/h$b;

    iget-object v1, p0, Ldt1/h$b;->z:Ljava/time/Instant;

    iget-object v2, p0, Ldt1/h$b;->E:Ldt1/h;

    invoke-direct {v0, v1, v2, p2}, Ldt1/h$b;-><init>(Ljava/time/Instant;Ldt1/h;Lq83/d;)V

    iput-object p1, v0, Ldt1/h$b;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ldt1/h$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ldt1/h$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ldt1/h$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ldt1/h$b;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Ldt1/h$b;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ldt1/h$b;->x:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Ldt1/h$b;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Ldt1/b$b;

    iget-object v2, p0, Ldt1/h$b;->z:Ljava/time/Instant;

    invoke-direct {p1, v2}, Ldt1/b$b;-><init>(Ljava/time/Instant;)V

    iput-object v0, p0, Ldt1/h$b;->y:Ljava/lang/Object;

    iput v6, p0, Ldt1/h$b;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_0
    :try_start_1
    iget-object p1, p0, Ldt1/h$b;->E:Ldt1/h;

    invoke-static {p1}, Ldt1/h;->h(Ldt1/h;)Lqk1/b;

    move-result-object p1

    iget-object v2, p0, Ldt1/h$b;->z:Ljava/time/Instant;

    invoke-virtual {v2}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v6

    iput-object v0, p0, Ldt1/h$b;->y:Ljava/lang/Object;

    iput v5, p0, Ldt1/h$b;->x:I

    invoke-interface {p1, v6, v7, p0}, Lqk1/b;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_2

    :cond_6
    :goto_1
    sget-object p1, Ldt1/b$d;->a:Ldt1/b$d;

    iput-object v0, p0, Ldt1/h$b;->y:Ljava/lang/Object;

    iput v4, p0, Ldt1/h$b;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_7

    goto :goto_2

    :catch_0
    new-instance p1, Ldt1/b$c;

    iget-object v2, p0, Ldt1/h$b;->z:Ljava/time/Instant;

    invoke-direct {p1, v2}, Ldt1/b$c;-><init>(Ljava/time/Instant;)V

    const/4 v2, 0x0

    iput-object v2, p0, Ldt1/h$b;->y:Ljava/lang/Object;

    iput-object v2, p0, Ldt1/h$b;->w:Ljava/lang/Object;

    iput v3, p0, Ldt1/h$b;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
