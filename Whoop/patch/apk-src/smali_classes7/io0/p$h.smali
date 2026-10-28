.class final Lio0/p$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio0/p;->G(Ljava/lang/String;Ljava/lang/String;)Lec3/l;
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
        "Lio0/p$a;",
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
    c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingIntakeInteractor$saveOnDemand$1"
    f = "ClinicianVideoSchedulingIntakeInteractor.kt"
    l = {
        0x26f,
        0x271,
        0x274,
        0x27e,
        0x27f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:Ljava/lang/String;

.field final synthetic G:Lio0/p;

.field final synthetic H:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio0/p;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio0/p;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio0/p$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio0/p$h;->F:Ljava/lang/String;

    iput-object p2, p0, Lio0/p$h;->G:Lio0/p;

    iput-object p3, p0, Lio0/p$h;->H:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lio0/p$h;

    iget-object v1, p0, Lio0/p$h;->F:Ljava/lang/String;

    iget-object v2, p0, Lio0/p$h;->G:Lio0/p;

    iget-object v3, p0, Lio0/p$h;->H:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Lio0/p$h;-><init>(Ljava/lang/String;Lio0/p;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lio0/p$h;->E:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lio0/p$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio0/p$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio0/p$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio0/p$h;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lio0/p$h;->E:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lio0/p$h;->z:I

    sget-object v10, Ll83/a0;->a:Ll83/a0;

    const/4 v11, 0x5

    const/4 v12, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v13, 0x0

    if-eqz v0, :cond_5

    if-eq v0, v3, :cond_4

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    if-eq v0, v12, :cond_0

    if-ne v0, v11, :cond_1

    :cond_0
    iget-object v0, p0, Lio0/p$h;->x:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, p0, Lio0/p$h;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v10

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, p0, Lio0/p$h;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lio0/p$h;->w:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    goto :goto_0

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Lio0/p$a$h;->a:Lio0/p$a$h;

    iput-object v8, p0, Lio0/p$h;->E:Ljava/lang/Object;

    iput v3, p0, Lio0/p$h;->z:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_6

    goto/16 :goto_3

    :cond_6
    :goto_1
    iget-object v0, p0, Lio0/p$h;->F:Ljava/lang/String;

    iget-object v3, p0, Lio0/p$h;->G:Lio0/p;

    invoke-static {v3}, Lio0/p;->h(Lio0/p;)Ltr2/n;

    move-result-object v3

    invoke-static {v0, v3}, Lio0/z;->a(Ljava/lang/String;Ltr2/n;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_7

    sget-object v0, Lio0/p$a$e;->a:Lio0/p$a$e;

    iput-object v13, p0, Lio0/p$h;->E:Ljava/lang/Object;

    iput-object v13, p0, Lio0/p$h;->w:Ljava/lang/Object;

    const/4 v1, 0x0

    iput v1, p0, Lio0/p$h;->y:I

    iput v2, p0, Lio0/p$h;->z:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_a

    goto :goto_3

    :cond_7
    sget-object v2, Lu02/a;->a:Lu02/a$a;

    iget-object v3, p0, Lio0/p$h;->G:Lio0/p;

    invoke-static {v3}, Lio0/p;->h(Lio0/p;)Ltr2/n;

    move-result-object v3

    new-instance v4, Lio0/p$h$a;

    iget-object v6, p0, Lio0/p$h;->G:Lio0/p;

    iget-object v7, p0, Lio0/p$h;->H:Ljava/lang/String;

    invoke-direct {v4, v6, v7, v0, v13}, Lio0/p$h$a;-><init>(Lio0/p;Ljava/lang/String;Ljava/util/List;Lq83/d;)V

    iput-object v8, p0, Lio0/p$h;->E:Ljava/lang/Object;

    iput-object v13, p0, Lio0/p$h;->w:Ljava/lang/Object;

    iput v1, p0, Lio0/p$h;->z:I

    move-object v0, v2

    const/4 v2, 0x0

    move-object v1, v3

    const-string v3, "Failed to save on-demand scheduling"

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_8

    goto :goto_3

    :cond_8
    :goto_2
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_9

    new-instance v1, Lio0/p$a$g;

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/navigation/e;

    invoke-direct {v1, v0}, Lio0/p$a$g;-><init>(Lcom/whoop/navigation/e;)V

    iput-object v13, p0, Lio0/p$h;->E:Ljava/lang/Object;

    iput-object v13, p0, Lio0/p$h;->w:Ljava/lang/Object;

    iput-object v13, p0, Lio0/p$h;->x:Ljava/lang/Object;

    iput v12, p0, Lio0/p$h;->z:I

    invoke-interface {v8, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_a

    goto :goto_3

    :cond_9
    instance-of v0, v0, Lu02/a$b;

    if-eqz v0, :cond_b

    sget-object v0, Lio0/p$a$e;->a:Lio0/p$a$e;

    iput-object v13, p0, Lio0/p$h;->E:Ljava/lang/Object;

    iput-object v13, p0, Lio0/p$h;->w:Ljava/lang/Object;

    iput-object v13, p0, Lio0/p$h;->x:Ljava/lang/Object;

    iput v11, p0, Lio0/p$h;->z:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_a

    :goto_3
    return-object v9

    :cond_a
    return-object v10

    :cond_b
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
