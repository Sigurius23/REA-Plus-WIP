.class public final Lzu1/d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzu1/d;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.limitedtimeoffer.domain.LimitedTimeOfferInteractor$interact$$inlined$flatMapLatest$1"
    f = "LimitedTimeOfferInteractor.kt"
    l = {
        0xc0,
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:I

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lzu1/d;


# direct methods
.method public constructor <init>(Lq83/d;Lzu1/d;)V
    .locals 0

    iput-object p2, p0, Lzu1/d$a;->z:Lzu1/d;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lzu1/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lzu1/d$a;

    iget-object v1, p0, Lzu1/d$a;->z:Lzu1/d;

    invoke-direct {v0, p3, v1}, Lzu1/d$a;-><init>(Lq83/d;Lzu1/d;)V

    iput-object p1, v0, Lzu1/d$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lzu1/d$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lzu1/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lzu1/d$a;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lzu1/d$a;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lzu1/d$a;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p0

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lzu1/d$a;->G:Ljava/lang/Object;

    check-cast v1, Lzu1/b;

    iget-object v1, p0, Lzu1/d$a;->F:Ljava/lang/Object;

    check-cast v1, Lq83/d;

    iget-object v1, p0, Lzu1/d$a;->E:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v3, p0, Lzu1/d$a;->x:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lzu1/d$a;->x:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lec3/m;

    iget-object p1, p0, Lzu1/d$a;->y:Ljava/lang/Object;

    check-cast p1, Lzu1/b;

    instance-of v5, p1, Lzu1/b$b;

    if-eqz v5, :cond_4

    iget-object v6, p0, Lzu1/d$a;->z:Lzu1/d;

    check-cast p1, Lzu1/b$b;

    invoke-virtual {p1}, Lzu1/b$b;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lzu1/b$b;->b()Ljava/lang/String;

    move-result-object v9

    iput-object v4, p0, Lzu1/d$a;->x:Ljava/lang/Object;

    iput-object v4, p0, Lzu1/d$a;->y:Ljava/lang/Object;

    iput-object v1, p0, Lzu1/d$a;->E:Ljava/lang/Object;

    iput-object v4, p0, Lzu1/d$a;->F:Ljava/lang/Object;

    iput-object v4, p0, Lzu1/d$a;->G:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lzu1/d$a;->H:I

    iput v3, p0, Lzu1/d$a;->w:I

    const/4 v7, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    move-object v10, p0

    invoke-static/range {v6 .. v12}, Lzu1/d;->l(Lzu1/d;ZLjava/lang/String;Ljava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast p1, Lec3/l;

    new-instance v3, Lzu1/d$e;

    invoke-direct {v3, v4}, Lzu1/d$e;-><init>(Lq83/d;)V

    invoke-static {p1, v3}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    goto :goto_1

    :cond_4
    move-object v10, p0

    new-instance v3, Lzu1/d$c;

    invoke-direct {v3, p1, v4}, Lzu1/d$c;-><init>(Lzu1/b;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    :goto_1
    iput-object v4, v10, Lzu1/d$a;->x:Ljava/lang/Object;

    iput-object v4, v10, Lzu1/d$a;->y:Ljava/lang/Object;

    iput-object v4, v10, Lzu1/d$a;->E:Ljava/lang/Object;

    iput-object v4, v10, Lzu1/d$a;->F:Ljava/lang/Object;

    iput-object v4, v10, Lzu1/d$a;->G:Ljava/lang/Object;

    iput v2, v10, Lzu1/d$a;->w:I

    invoke-static {v1, p1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_2
    return-object v0

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
