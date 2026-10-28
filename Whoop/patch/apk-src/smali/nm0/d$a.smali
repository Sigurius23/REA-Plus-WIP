.class public final Lnm0/d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnm0/d;->c(Ls63/a;Lec3/l;Lec3/l;)Lec3/l;
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
    c = "com.whoop.cache.api.CacheResultCombiner$combine$$inlined$flatMapLatest$1"
    f = "CacheResultCombiner.kt"
    l = {
        0xbe,
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lnm0/d;

.field final synthetic F:Ls63/a;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:Ljava/lang/Object;

.field K:I

.field L:I

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lec3/l;


# direct methods
.method public constructor <init>(Lq83/d;Lec3/l;Lnm0/d;Ls63/a;)V
    .locals 0

    iput-object p2, p0, Lnm0/d$a;->z:Lec3/l;

    iput-object p3, p0, Lnm0/d$a;->E:Lnm0/d;

    iput-object p4, p0, Lnm0/d$a;->F:Ls63/a;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lym0/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnm0/d$a;

    iget-object v1, p0, Lnm0/d$a;->z:Lec3/l;

    iget-object v2, p0, Lnm0/d$a;->E:Lnm0/d;

    iget-object v3, p0, Lnm0/d$a;->F:Ls63/a;

    invoke-direct {v0, p3, v1, v2, v3}, Lnm0/d$a;-><init>(Lq83/d;Lec3/l;Lnm0/d;Ls63/a;)V

    iput-object p1, v0, Lnm0/d$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lnm0/d$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lnm0/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lnm0/d$a;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lnm0/d$a;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lnm0/d$a;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lnm0/d$a;->J:Ljava/lang/Object;

    check-cast v1, Lym0/b$a;

    iget-object v1, p0, Lnm0/d$a;->I:Ljava/lang/Object;

    check-cast v1, Lym0/b;

    iget-object v1, p0, Lnm0/d$a;->H:Ljava/lang/Object;

    check-cast v1, Lq83/d;

    iget-object v1, p0, Lnm0/d$a;->G:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v3, p0, Lnm0/d$a;->x:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lnm0/d$a;->x:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lec3/m;

    iget-object p1, p0, Lnm0/d$a;->y:Ljava/lang/Object;

    check-cast p1, Lym0/b;

    instance-of v5, p1, Lym0/b$a;

    if-eqz v5, :cond_3

    check-cast p1, Lym0/b$a;

    goto :goto_0

    :cond_3
    move-object p1, v4

    :goto_0
    if-eqz p1, :cond_4

    iget-object v5, p0, Lnm0/d$a;->E:Lnm0/d;

    invoke-virtual {p1}, Lym0/b$a;->a()Lmm0/b;

    move-result-object p1

    iget-object v6, p0, Lnm0/d$a;->F:Ls63/a;

    iput-object v4, p0, Lnm0/d$a;->x:Ljava/lang/Object;

    iput-object v4, p0, Lnm0/d$a;->y:Ljava/lang/Object;

    iput-object v1, p0, Lnm0/d$a;->G:Ljava/lang/Object;

    iput-object v4, p0, Lnm0/d$a;->H:Ljava/lang/Object;

    iput-object v4, p0, Lnm0/d$a;->I:Ljava/lang/Object;

    iput-object v4, p0, Lnm0/d$a;->J:Ljava/lang/Object;

    const/4 v7, 0x0

    iput v7, p0, Lnm0/d$a;->K:I

    iput v7, p0, Lnm0/d$a;->L:I

    iput v3, p0, Lnm0/d$a;->w:I

    invoke-static {v5, p1, v6, p0}, Lnm0/d;->b(Lnm0/d;Lmm0/b;Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_2

    :cond_4
    move-object p1, v4

    :cond_5
    :goto_1
    iget-object v3, p0, Lnm0/d$a;->z:Lec3/l;

    new-instance v5, Lnm0/d$b;

    iget-object v6, p0, Lnm0/d$a;->E:Lnm0/d;

    invoke-direct {v5, v3, v6, p1}, Lnm0/d$b;-><init>(Lec3/l;Lnm0/d;Ljava/lang/Object;)V

    iput-object v4, p0, Lnm0/d$a;->x:Ljava/lang/Object;

    iput-object v4, p0, Lnm0/d$a;->y:Ljava/lang/Object;

    iput-object v4, p0, Lnm0/d$a;->G:Ljava/lang/Object;

    iput-object v4, p0, Lnm0/d$a;->H:Ljava/lang/Object;

    iput-object v4, p0, Lnm0/d$a;->I:Ljava/lang/Object;

    iput-object v4, p0, Lnm0/d$a;->J:Ljava/lang/Object;

    iput v2, p0, Lnm0/d$a;->w:I

    invoke-static {v1, v5, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_2
    return-object v0

    :cond_6
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
