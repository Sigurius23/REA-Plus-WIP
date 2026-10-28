.class public final La6/h0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:La6/i0;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Z

.field public w:Lkotlin/jvm/internal/e0;

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lkotlin/jvm/internal/e0;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/e0;La6/i0;Ljava/lang/Object;ZLq83/d;)V
    .locals 0

    iput-object p1, p0, La6/h0;->z:Lkotlin/jvm/internal/e0;

    iput-object p2, p0, La6/h0;->E:La6/i0;

    iput-object p3, p0, La6/h0;->F:Ljava/lang/Object;

    iput-boolean p4, p0, La6/h0;->G:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6

    new-instance v0, La6/h0;

    iget-object v3, p0, La6/h0;->F:Ljava/lang/Object;

    iget-boolean v4, p0, La6/h0;->G:Z

    iget-object v1, p0, La6/h0;->z:Lkotlin/jvm/internal/e0;

    iget-object v2, p0, La6/h0;->E:La6/i0;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, La6/h0;-><init>(Lkotlin/jvm/internal/e0;La6/i0;Ljava/lang/Object;ZLq83/d;)V

    iput-object p1, v0, La6/h0;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, La6/l1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/h0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/h0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/h0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La6/h0;->x:I

    iget-object v2, p0, La6/h0;->F:Ljava/lang/Object;

    iget-object v3, p0, La6/h0;->E:La6/i0;

    iget-object v4, p0, La6/h0;->z:Lkotlin/jvm/internal/e0;

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v6, :cond_1

    if-ne v1, v5, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, La6/h0;->w:Lkotlin/jvm/internal/e0;

    iget-object v6, p0, La6/h0;->y:Ljava/lang/Object;

    check-cast v6, La6/l1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/h0;->y:Ljava/lang/Object;

    check-cast p1, La6/l1;

    invoke-virtual {v3}, La6/i0;->h()La6/d1;

    move-result-object v1

    iput-object p1, p0, La6/h0;->y:Ljava/lang/Object;

    iput-object v4, p0, La6/h0;->w:Lkotlin/jvm/internal/e0;

    iput v6, p0, La6/h0;->x:I

    iget-object v1, v1, La6/d1;->b:Laj/d;

    iget-object v1, v1, Laj/d;->w:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v1

    new-instance v6, Ljava/lang/Integer;

    invoke-direct {v6, v1}, Ljava/lang/Integer;-><init>(I)V

    if-ne v6, v0, :cond_3

    goto :goto_1

    :cond_3
    move-object v1, v6

    move-object v6, p1

    move-object p1, v1

    move-object v1, v4

    :goto_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, v1, Lkotlin/jvm/internal/e0;->w:I

    const/4 p1, 0x0

    iput-object p1, p0, La6/h0;->y:Ljava/lang/Object;

    iput-object p1, p0, La6/h0;->w:Lkotlin/jvm/internal/e0;

    iput v5, p0, La6/h0;->x:I

    invoke-interface {v6, v2, p0}, La6/l1;->d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    iget-boolean p1, p0, La6/h0;->G:Z

    if-eqz p1, :cond_6

    iget-object p1, v3, La6/i0;->g:Lbu/c;

    new-instance v0, La6/b;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    :goto_3
    iget v3, v4, Lkotlin/jvm/internal/e0;->w:I

    invoke-direct {v0, v2, v1, v3}, La6/b;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {p1, v0}, Lbu/c;->J(La6/e1;)V

    :cond_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
