.class public final Lvg2/c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg2/c;->g(Ljava/lang/String;)Lec3/l;
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
    c = "com.whoop.startactivity.targetscard.domain.TargetsCardInteractor$fetch$$inlined$flatMapLatest$1"
    f = "TargetsCardInteractor.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field final synthetic F:Lvg2/c;

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:La12/a;


# direct methods
.method public constructor <init>(Lq83/d;La12/a;Ljava/lang/String;Lvg2/c;)V
    .locals 0

    iput-object p2, p0, Lvg2/c$b;->z:La12/a;

    iput-object p3, p0, Lvg2/c$b;->E:Ljava/lang/String;

    iput-object p4, p0, Lvg2/c$b;->F:Lvg2/c;

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
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lvg2/c$b;

    iget-object v1, p0, Lvg2/c$b;->z:La12/a;

    iget-object v2, p0, Lvg2/c$b;->E:Ljava/lang/String;

    iget-object v3, p0, Lvg2/c$b;->F:Lvg2/c;

    invoke-direct {v0, p3, v1, v2, v3}, Lvg2/c$b;-><init>(Lq83/d;La12/a;Ljava/lang/String;Lvg2/c;)V

    iput-object p1, v0, Lvg2/c$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Lvg2/c$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lvg2/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lvg2/c$b;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvg2/c$b;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lvg2/c$b;->x:Ljava/lang/Object;

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

    iget-object p1, p0, Lvg2/c$b;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lvg2/c$b;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    new-instance v1, Lcom/whoop/startactivity/targetscard/domain/TargetsCardFetchRequest;

    iget-object v3, p0, Lvg2/c$b;->z:La12/a;

    invoke-virtual {v3}, La12/a;->a()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lvg2/c$b;->z:La12/a;

    invoke-virtual {v4}, La12/a;->b()Ljava/util/Map;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lcom/whoop/startactivity/targetscard/domain/TargetsCardFetchRequest;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    new-instance v3, La6/u;

    const/4 v4, 0x1

    invoke-direct {v3, v1, v4}, La6/u;-><init>(Ljava/lang/Object;I)V

    iget-object v1, p0, Lvg2/c$b;->E:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-static {v3, v4, v1, v2, v4}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v1

    iget-object v3, p0, Lvg2/c$b;->F:Lvg2/c;

    invoke-static {v3}, Lvg2/c;->d(Lvg2/c;)Lnm0/e;

    move-result-object v3

    new-instance v5, Lvg2/c$e;

    invoke-direct {v5, v4, v3}, Lvg2/c$e;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v1, v5}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v1

    new-instance v3, Lvg2/c$f;

    iget-object v5, p0, Lvg2/c$b;->F:Lvg2/c;

    invoke-direct {v3, v1, v5}, Lvg2/c$f;-><init>(Lec3/l;Lvg2/c;)V

    new-instance v1, Lvg2/c$d;

    iget-object v5, p0, Lvg2/c$b;->F:Lvg2/c;

    iget-object v6, p0, Lvg2/c$b;->E:Ljava/lang/String;

    invoke-direct {v1, v5, v6, v4}, Lvg2/c$d;-><init>(Lvg2/c;Ljava/lang/String;Lq83/d;)V

    new-instance v5, Lec3/a0;

    invoke-direct {v5, v3, v1}, Lec3/a0;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V

    iput-object v4, p0, Lvg2/c$b;->x:Ljava/lang/Object;

    iput-object v4, p0, Lvg2/c$b;->y:Ljava/lang/Object;

    iput v2, p0, Lvg2/c$b;->w:I

    invoke-static {p1, v5, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
