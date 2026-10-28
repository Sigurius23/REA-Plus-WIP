.class public final Lec3/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:Ls83/i;

.field public final synthetic x:Lec3/m;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function3;Lec3/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    check-cast p1, Ls83/i;

    iput-object p1, p0, Lec3/s0;->w:Ls83/i;

    iput-object p2, p0, Lec3/s0;->x:Lec3/m;

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lec3/r0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lec3/r0;

    iget v1, v0, Lec3/r0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/r0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lec3/r0;

    invoke-direct {v0, p0, p2}, Lec3/r0;-><init>(Lec3/s0;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lec3/r0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/r0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lec3/r0;->w:Lec3/s0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lec3/r0;->w:Lec3/s0;

    iput v3, v0, Lec3/r0;->y:I

    iget-object p2, p0, Lec3/s0;->w:Ls83/i;

    iget-object v2, p0, Lec3/s0;->x:Lec3/m;

    invoke-interface {p2, v2, p1, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_4

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_4
    new-instance p2, Lkotlinx/coroutines/flow/internal/AbortFlowException;

    invoke-direct {p2, p1}, Lkotlinx/coroutines/flow/internal/AbortFlowException;-><init>(Ljava/lang/Object;)V

    throw p2
.end method
