.class public final Lgc0/d$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgc0/d;->interact(Lec3/l;)Lec3/l;
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
    c = "com.whoop.advancedlabs.feature.hormonalcontext.domain.HormonalContextInteractor$interact$$inlined$flatMapLatest$1"
    f = "HormonalContextInteractor.kt"
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

.field final synthetic z:Lgc0/d;


# direct methods
.method public constructor <init>(Lq83/d;Lgc0/d;)V
    .locals 0

    iput-object p2, p0, Lgc0/d$g;->z:Lgc0/d;

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
            "Lgc0/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lgc0/d$g;

    iget-object v1, p0, Lgc0/d$g;->z:Lgc0/d;

    invoke-direct {v0, p3, v1}, Lgc0/d$g;-><init>(Lq83/d;Lgc0/d;)V

    iput-object p1, v0, Lgc0/d$g;->x:Ljava/lang/Object;

    iput-object p2, v0, Lgc0/d$g;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lgc0/d$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lgc0/d$g;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lgc0/d$g;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lgc0/d$g;->x:Ljava/lang/Object;

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

    iget-object p1, p0, Lgc0/d$g;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lgc0/d$g;->y:Ljava/lang/Object;

    check-cast v1, Lgc0/a;

    instance-of v3, v1, Lgc0/a$c;

    if-eqz v3, :cond_2

    iget-object v3, p0, Lgc0/d$g;->z:Lgc0/d;

    check-cast v1, Lgc0/a$c;

    invoke-virtual {v1}, Lgc0/a$c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lgc0/d;->h(Lgc0/d;Ljava/lang/String;)Lec3/l;

    move-result-object v1

    new-instance v3, Lgc0/d$i;

    invoke-direct {v3, v1}, Lgc0/d$i;-><init>(Lec3/l;)V

    goto :goto_1

    :cond_2
    instance-of v3, v1, Lgc0/a$e;

    if-eqz v3, :cond_3

    new-instance v3, Lgc0/d$a$b;

    sget-object v4, Lgc0/a$f;->a:Lgc0/a$f;

    invoke-direct {v3, v4}, Lgc0/d$a$b;-><init>(Lgc0/a;)V

    new-instance v4, Lgc0/d$a$b;

    invoke-direct {v4, v1}, Lgc0/d$a$b;-><init>(Lgc0/a;)V

    filled-new-array {v3, v4}, [Lgc0/d$a$b;

    move-result-object v1

    new-instance v3, Lbm/g;

    const/4 v4, 0x3

    invoke-direct {v3, v1, v4}, Lbm/g;-><init>(Ljava/lang/Object;I)V

    goto :goto_1

    :cond_3
    instance-of v3, v1, Lgc0/a$b;

    if-eqz v3, :cond_5

    move-object v3, v1

    check-cast v3, Lgc0/a$b;

    invoke-virtual {v3}, Lgc0/a$b;->b()Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;

    move-result-object v3

    if-nez v3, :cond_4

    new-instance v3, Lgc0/d$a$b;

    sget-object v4, Lgc0/a$f;->a:Lgc0/a$f;

    invoke-direct {v3, v4}, Lgc0/d$a$b;-><init>(Lgc0/a;)V

    new-instance v4, Lgc0/d$a$b;

    invoke-direct {v4, v1}, Lgc0/d$a$b;-><init>(Lgc0/a;)V

    filled-new-array {v3, v4}, [Lgc0/d$a$b;

    move-result-object v1

    new-instance v3, Lbm/g;

    const/4 v4, 0x3

    invoke-direct {v3, v1, v4}, Lbm/g;-><init>(Ljava/lang/Object;I)V

    goto :goto_1

    :cond_4
    new-instance v3, Lgc0/d$a$b;

    invoke-direct {v3, v1}, Lgc0/d$a$b;-><init>(Lgc0/a;)V

    new-instance v1, La6/u;

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, La6/u;-><init>(Ljava/lang/Object;I)V

    :goto_0
    move-object v3, v1

    goto :goto_1

    :cond_5
    new-instance v3, Lgc0/d$a$b;

    invoke-direct {v3, v1}, Lgc0/d$a$b;-><init>(Lgc0/a;)V

    new-instance v1, La6/u;

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :goto_1
    const/4 v1, 0x0

    iput-object v1, p0, Lgc0/d$g;->x:Ljava/lang/Object;

    iput-object v1, p0, Lgc0/d$g;->y:Ljava/lang/Object;

    iput v2, p0, Lgc0/d$g;->w:I

    invoke-static {p1, v3, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
