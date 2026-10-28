.class public final Lnu1/d$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnu1/d;->g(Ljava/lang/String;)Lec3/l;
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
    c = "com.whoop.lastnightsleep.domain.LastNightSleepInteractor$loadLastNightSleepCache$$inlined$cacheAPI$1"
    f = "LastNightSleepInteractor.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lnm0/e;


# direct methods
.method public constructor <init>(Lq83/d;Lnm0/e;)V
    .locals 0

    iput-object p2, p0, Lnu1/d$f;->z:Lnm0/e;

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
            "Lnm0/c<",
            "Ll83/a0;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnu1/d$f;

    iget-object v1, p0, Lnu1/d$f;->z:Lnm0/e;

    invoke-direct {v0, p3, v1}, Lnu1/d$f;-><init>(Lq83/d;Lnm0/e;)V

    iput-object p1, v0, Lnu1/d$f;->x:Ljava/lang/Object;

    iput-object p2, v0, Lnu1/d$f;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lnu1/d$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lnu1/d$f;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lnu1/d$f;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lnu1/d$f;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lnu1/d$f;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lnu1/d$f;->y:Ljava/lang/Object;

    check-cast v1, Lnm0/c;

    iget-object v3, p0, Lnu1/d$f;->z:Lnm0/e;

    const-class v4, Ll83/a0;

    invoke-static {v4}, Lkotlin/jvm/internal/h0;->b(Ljava/lang/Class;)Lj93/a0;

    move-result-object v5

    invoke-static {v5}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v6

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v4, v5, v6}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v4

    const-class v5, Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;

    invoke-static {v5}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v6

    invoke-static {v6}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-virtual {v7, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v5, v6, v8}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v5

    invoke-interface {v3, v1, v4, v5}, Lnm0/e;->a(Lnm0/c;Ls63/a;Ls63/a;)Lec3/l;

    move-result-object v1

    const/4 v3, 0x0

    iput-object v3, p0, Lnu1/d$f;->x:Ljava/lang/Object;

    iput-object v3, p0, Lnu1/d$f;->y:Ljava/lang/Object;

    iput v2, p0, Lnu1/d$f;->w:I

    invoke-static {p1, v1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
