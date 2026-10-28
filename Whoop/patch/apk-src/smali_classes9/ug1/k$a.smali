.class public final Lug1/k$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug1/k;->interact(Lec3/l;)Lec3/l;
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
    c = "com.whoop.firmwareUpdateService.strategy.UnifiedUpdateStrategy$interact$$inlined$flatMapLatest$1"
    f = "UnifiedUpdateStrategy.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lec3/l;

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lug1/k;


# direct methods
.method public constructor <init>(Lq83/d;Lug1/k;Lec3/l;)V
    .locals 0

    iput-object p2, p0, Lug1/k$a;->z:Lug1/k;

    iput-object p3, p0, Lug1/k$a;->E:Lec3/l;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lgt0/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lug1/k$a;

    iget-object v1, p0, Lug1/k$a;->z:Lug1/k;

    iget-object v2, p0, Lug1/k$a;->E:Lec3/l;

    invoke-direct {v0, p3, v1, v2}, Lug1/k$a;-><init>(Lq83/d;Lug1/k;Lec3/l;)V

    iput-object p1, v0, Lug1/k$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lug1/k$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lug1/k$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lug1/k$a;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lug1/k$a;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lug1/k$a;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lug1/k$a;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lug1/k$a;->y:Ljava/lang/Object;

    check-cast v1, Lgt0/h;

    instance-of v3, v1, Lgt0/h$e;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    iget-object v1, p0, Lug1/k$a;->z:Lug1/k;

    invoke-static {v1}, Lug1/k;->d(Lug1/k;)Lci2/b;

    move-result-object v1

    invoke-interface {v1}, Lci2/b;->b()Lec3/t1;

    move-result-object v1

    new-instance v3, Lch/i;

    const/4 v5, 0x2

    invoke-direct {v3, v1, v5}, Lch/i;-><init>(Lec3/l;I)V

    new-instance v1, Lug1/k$c;

    invoke-direct {v1, v3}, Lug1/k$c;-><init>(Lec3/l;)V

    invoke-static {v1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object v1

    sget-object v3, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/16 v3, 0x78

    sget-object v5, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v3, v5}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v5

    invoke-static {v1, v5, v6}, Lec3/v;->O(Lec3/l;J)La6/u;

    move-result-object v1

    new-instance v3, Lug1/k$d;

    iget-object v5, p0, Lug1/k$a;->z:Lug1/k;

    iget-object v6, p0, Lug1/k$a;->E:Lec3/l;

    invoke-direct {v3, v4, v5, v6}, Lug1/k$d;-><init>(Lq83/d;Lug1/k;Lec3/l;)V

    invoke-static {v1, v3}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v1

    new-instance v3, Lug1/k$b;

    iget-object v5, p0, Lug1/k$a;->z:Lug1/k;

    invoke-direct {v3, v5, v4}, Lug1/k$b;-><init>(Lug1/k;Lq83/d;)V

    new-instance v5, Lec3/a0;

    invoke-direct {v5, v1, v3}, Lec3/a0;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V

    goto :goto_0

    :cond_2
    new-instance v5, La6/u;

    invoke-direct {v5, v1, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    :goto_0
    iput-object v4, p0, Lug1/k$a;->x:Ljava/lang/Object;

    iput-object v4, p0, Lug1/k$a;->y:Ljava/lang/Object;

    iput v2, p0, Lug1/k$a;->w:I

    invoke-static {p1, v5, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
