.class public final Lui/d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Lui/i;

.field public w:I

.field public final synthetic x:I

.field public final synthetic y:Lbc3/k1;

.field public final synthetic z:I


# direct methods
.method public constructor <init>(ILbc3/k1;IILui/i;Lq83/d;)V
    .locals 0

    iput p1, p0, Lui/d;->x:I

    iput-object p2, p0, Lui/d;->y:Lbc3/k1;

    iput p3, p0, Lui/d;->z:I

    iput p4, p0, Lui/d;->E:I

    iput-object p5, p0, Lui/d;->F:Lui/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7

    new-instance v0, Lui/d;

    iget v4, p0, Lui/d;->E:I

    iget-object v5, p0, Lui/d;->F:Lui/i;

    iget v1, p0, Lui/d;->x:I

    iget-object v2, p0, Lui/d;->y:Lbc3/k1;

    iget v3, p0, Lui/d;->z:I

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lui/d;-><init>(ILbc3/k1;IILui/i;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lui/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lui/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lui/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lui/d;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_2
    sget-object p1, Lui/c;->a:[I

    iget v1, p0, Lui/d;->x:I

    invoke-static {v1}, Le4/p;->e(I)I

    move-result v1

    aget p1, p1, v1

    iget v1, p0, Lui/d;->z:I

    if-ne p1, v2, :cond_4

    iget-object p1, p0, Lui/d;->y:Lbc3/k1;

    invoke-interface {p1}, Lbc3/k1;->isActive()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    iget v1, p0, Lui/d;->E:I

    :cond_4
    :goto_0
    iput v2, p0, Lui/d;->w:I

    iget-object p1, p0, Lui/d;->F:Lui/i;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v3, 0x7fffffff

    if-ne v1, v3, :cond_5

    new-instance v3, Lui/f;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v1, v4}, Lui/f;-><init>(Lui/i;II)V

    invoke-static {v3, p0}, Ld0/f;->x(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_5
    new-instance v3, Lui/f;

    const/4 v4, 0x1

    invoke-direct {v3, p1, v1, v4}, Lui/f;-><init>(Lui/i;II)V

    invoke-interface {p0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lp1/x;->v(Lq83/j;)Lp1/w0;

    move-result-object p1

    invoke-interface {p1, v3, p0}, Lp1/w0;->k(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_2

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
