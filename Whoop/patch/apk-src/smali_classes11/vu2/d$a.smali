.class final Lvu2/d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvu2/d;->m(Ljava/lang/String;)Lec3/l;
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
        "Lvu2/f;",
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
    c = "com.whoop.weightlifting.feature.builder.details.domain.ExerciseDetailsV2Interactor$deleteExerciseInternalActions$1"
    f = "ExerciseDetailsV2Interactor.kt"
    l = {
        0x54,
        0x58,
        0x55
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field final synthetic F:Lvu2/d;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lvu2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lvu2/d;",
            "Lq83/d<",
            "-",
            "Lvu2/d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvu2/d$a;->E:Ljava/lang/String;

    iput-object p2, p0, Lvu2/d$a;->F:Lvu2/d;

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

    new-instance v0, Lvu2/d$a;

    iget-object v1, p0, Lvu2/d$a;->E:Ljava/lang/String;

    iget-object v2, p0, Lvu2/d$a;->F:Lvu2/d;

    invoke-direct {v0, v1, v2, p2}, Lvu2/d$a;-><init>(Ljava/lang/String;Lvu2/d;Lq83/d;)V

    iput-object p1, v0, Lvu2/d$a;->z:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lvu2/d$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvu2/d$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvu2/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvu2/d$a;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lvu2/d$a;->z:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lvu2/d$a;->y:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lvu2/d$a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v2, p0, Lvu2/d$a;->w:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, v2

    move-object v2, v0

    move-object v0, v7

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lvu2/f$b;

    iget-object v2, p0, Lvu2/d$a;->E:Ljava/lang/String;

    invoke-direct {p1, v2}, Lvu2/f$b;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lvu2/d$a;->z:Ljava/lang/Object;

    iput v5, p0, Lvu2/d$a;->y:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    iget-object p1, p0, Lvu2/d$a;->E:Ljava/lang/String;

    iget-object v2, p0, Lvu2/d$a;->F:Lvu2/d;

    iput-object v6, p0, Lvu2/d$a;->z:Ljava/lang/Object;

    iput-object v0, p0, Lvu2/d$a;->w:Ljava/lang/Object;

    iput-object p1, p0, Lvu2/d$a;->x:Ljava/lang/Object;

    iput v4, p0, Lvu2/d$a;->y:I

    invoke-static {v2, p1, p0}, Lvu2/d;->d(Lvu2/d;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    goto :goto_2

    :cond_5
    move-object v7, v2

    move-object v2, p1

    move-object p1, v7

    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    new-instance v4, Lvu2/f$a;

    invoke-direct {v4, v2, p1}, Lvu2/f$a;-><init>(Ljava/lang/String;Z)V

    iput-object v6, p0, Lvu2/d$a;->z:Ljava/lang/Object;

    iput-object v6, p0, Lvu2/d$a;->w:Ljava/lang/Object;

    iput-object v6, p0, Lvu2/d$a;->x:Ljava/lang/Object;

    iput v3, p0, Lvu2/d$a;->y:I

    invoke-interface {v0, v4, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
