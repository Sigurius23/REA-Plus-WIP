.class public final Lqp1/f$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqp1/f;->interact(Lec3/l;)Lec3/l;
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
    c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor$interact$$inlined$flatMapLatest$1"
    f = "HormonalSettingsInteractor.kt"
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

.field final synthetic z:Lqp1/f;


# direct methods
.method public constructor <init>(Lq83/d;Lqp1/f;)V
    .locals 0

    iput-object p2, p0, Lqp1/f$c;->z:Lqp1/f;

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
            "Lqp1/d;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lqp1/f$c;

    iget-object v1, p0, Lqp1/f$c;->z:Lqp1/f;

    invoke-direct {v0, p3, v1}, Lqp1/f$c;-><init>(Lq83/d;Lqp1/f;)V

    iput-object p1, v0, Lqp1/f$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Lqp1/f$c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lqp1/f$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lqp1/f$c;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lqp1/f$c;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lqp1/f$c;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lqp1/f$c;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lqp1/f$c;->y:Ljava/lang/Object;

    check-cast v1, Lqp1/d;

    instance-of v3, v1, Lqp1/d$b;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    new-instance v1, Lqp1/f$d;

    iget-object v3, p0, Lqp1/f$c;->z:Lqp1/f;

    invoke-direct {v1, v3, v4}, Lqp1/f$d;-><init>(Lqp1/f;Lq83/d;)V

    new-instance v3, Lec3/s1;

    invoke-direct {v3, v1}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_1

    :cond_2
    instance-of v3, v1, Lqp1/d$f;

    if-eqz v3, :cond_3

    new-instance v3, Lqp1/f$e;

    iget-object v5, p0, Lqp1/f$c;->z:Lqp1/f;

    invoke-direct {v3, v5, v1, v4}, Lqp1/f$e;-><init>(Lqp1/f;Lqp1/d;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    :goto_0
    move-object v3, v1

    goto :goto_1

    :cond_3
    instance-of v3, v1, Lqp1/d$c;

    if-eqz v3, :cond_4

    new-instance v3, Lqp1/f$f;

    iget-object v5, p0, Lqp1/f$c;->z:Lqp1/f;

    invoke-direct {v3, v5, v1, v4}, Lqp1/f$f;-><init>(Lqp1/f;Lqp1/d;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_0

    :cond_4
    instance-of v3, v1, Lqp1/d$d;

    if-eqz v3, :cond_5

    new-instance v3, Lqp1/f$g;

    iget-object v5, p0, Lqp1/f$c;->z:Lqp1/f;

    invoke-direct {v3, v5, v1, v4}, Lqp1/f$g;-><init>(Lqp1/f;Lqp1/d;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_0

    :cond_5
    instance-of v3, v1, Lqp1/d$e;

    if-eqz v3, :cond_6

    new-instance v3, Lqp1/f$h;

    iget-object v5, p0, Lqp1/f$c;->z:Lqp1/f;

    invoke-direct {v3, v5, v1, v4}, Lqp1/f$h;-><init>(Lqp1/f;Lqp1/d;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_0

    :cond_6
    instance-of v3, v1, Lqp1/d$a;

    if-eqz v3, :cond_7

    new-instance v1, Lqp1/f$i;

    iget-object v3, p0, Lqp1/f$c;->z:Lqp1/f;

    invoke-direct {v1, v3, v4}, Lqp1/f$i;-><init>(Lqp1/f;Lq83/d;)V

    new-instance v3, Lec3/s1;

    invoke-direct {v3, v1}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_1

    :cond_7
    instance-of v3, v1, Lqp1/d$g;

    if-eqz v3, :cond_9

    new-instance v3, Lqp1/f$j;

    iget-object v5, p0, Lqp1/f$c;->z:Lqp1/f;

    invoke-direct {v3, v5, v1, v4}, Lqp1/f$j;-><init>(Lqp1/f;Lqp1/d;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_0

    :goto_1
    iput-object v4, p0, Lqp1/f$c;->x:Ljava/lang/Object;

    iput-object v4, p0, Lqp1/f$c;->y:Ljava/lang/Object;

    iput v2, p0, Lqp1/f$c;->w:I

    invoke-static {p1, v3, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_8
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
