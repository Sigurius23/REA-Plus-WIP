.class final Lcj1/h$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcj1/h;->o(Lcj1/g$p;)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.health.presentation.HealthTabViewModel$sendViewEvent$1"
    f = "HealthTabViewModel.kt"
    l = {
        0x53,
        0x54,
        0x55
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcj1/g$p;

.field final synthetic y:Lcj1/h;


# direct methods
.method public constructor <init>(Lcj1/g$p;Lcj1/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcj1/g$p;",
            "Lcj1/h;",
            "Lq83/d<",
            "-",
            "Lcj1/h$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcj1/h$b;->x:Lcj1/g$p;

    iput-object p2, p0, Lcj1/h$b;->y:Lcj1/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Lcj1/h$b;

    iget-object v0, p0, Lcj1/h$b;->x:Lcj1/g$p;

    iget-object v1, p0, Lcj1/h$b;->y:Lcj1/h;

    invoke-direct {p1, v0, v1, p2}, Lcj1/h$b;-><init>(Lcj1/g$p;Lcj1/h;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcj1/h$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcj1/h$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcj1/h$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcj1/h$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcj1/h$b;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v5, :cond_1

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcj1/h$b;->x:Lcj1/g$p;

    instance-of v1, p1, Lcj1/g$h;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcj1/h$b;->y:Lcj1/h;

    check-cast p1, Lcj1/g$h;

    iput v5, p0, Lcj1/h$b;->w:I

    invoke-static {v1, p1, p0}, Lcj1/h;->l(Lcj1/h;Lcj1/g$h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_1

    :cond_3
    instance-of v1, p1, Lcj1/g$d;

    if-eqz v1, :cond_4

    iget-object p1, p0, Lcj1/h$b;->y:Lcj1/h;

    invoke-static {p1}, Lcj1/h;->g(Lcj1/h;)Lec3/p1;

    move-result-object p1

    iget-object v1, p0, Lcj1/h$b;->x:Lcj1/g$p;

    iput v4, p0, Lcj1/h$b;->w:I

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v1, p0}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v2, v0, :cond_5

    goto :goto_1

    :cond_4
    instance-of p1, p1, Lcj1/g$i;

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcj1/h$b;->y:Lcj1/h;

    invoke-static {p1}, Lcj1/h;->j(Lcj1/h;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Lcj1/h$b;->x:Lcj1/g$p;

    iput v3, p0, Lcj1/h$b;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    return-object v2
.end method
