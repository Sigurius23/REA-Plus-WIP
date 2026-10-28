.class public final Lh0/j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:F

.field public w:I

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lh0/k;

.field public final synthetic z:Lkotlin/jvm/internal/d0;


# direct methods
.method public constructor <init>(Lh0/k;Lkotlin/jvm/internal/d0;FLq83/d;)V
    .locals 0

    iput-object p1, p0, Lh0/j;->y:Lh0/k;

    iput-object p2, p0, Lh0/j;->z:Lkotlin/jvm/internal/d0;

    iput p3, p0, Lh0/j;->E:F

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Lh0/a;

    check-cast p2, Lh0/h1;

    check-cast p3, Lq83/d;

    new-instance p2, Lh0/j;

    iget-object v0, p0, Lh0/j;->z:Lkotlin/jvm/internal/d0;

    iget v1, p0, Lh0/j;->E:F

    iget-object v2, p0, Lh0/j;->y:Lh0/k;

    invoke-direct {p2, v2, v0, v1, p3}, Lh0/j;-><init>(Lh0/k;Lkotlin/jvm/internal/d0;FLq83/d;)V

    iput-object p1, p2, Lh0/j;->x:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p2, p1}, Lh0/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lh0/j;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lh0/j;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/d0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh0/j;->x:Ljava/lang/Object;

    check-cast p1, Lh0/a;

    new-instance v1, Lh0/i;

    const/4 v3, 0x0

    iget-object v4, p0, Lh0/j;->y:Lh0/k;

    invoke-direct {v1, v3, v4, p1}, Lh0/i;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, v4, Lh0/k;->c0:Lh0/o1;

    if-eqz p1, :cond_3

    iget-object v3, p0, Lh0/j;->z:Lkotlin/jvm/internal/d0;

    iput-object v3, p0, Lh0/j;->x:Ljava/lang/Object;

    iput v2, p0, Lh0/j;->w:I

    iget v2, p0, Lh0/j;->E:F

    invoke-interface {p1, v1, v2, p0}, Lh0/o1;->a(Lh0/k2;FLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, v3

    :goto_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iput p1, v0, Lkotlin/jvm/internal/d0;->w:F

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_3
    const-string p1, "resolvedFlingBehavior"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method
