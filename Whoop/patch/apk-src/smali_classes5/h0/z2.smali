.class public final Lh0/z2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lh0/c3;

.field public final synthetic G:Lkotlin/jvm/internal/f0;

.field public final synthetic H:J

.field public w:Lh0/c3;

.field public x:Lkotlin/jvm/internal/f0;

.field public y:J

.field public z:I


# direct methods
.method public constructor <init>(Lh0/c3;Lkotlin/jvm/internal/f0;JLq83/d;)V
    .locals 0

    iput-object p1, p0, Lh0/z2;->F:Lh0/c3;

    iput-object p2, p0, Lh0/z2;->G:Lkotlin/jvm/internal/f0;

    iput-wide p3, p0, Lh0/z2;->H:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6

    new-instance v0, Lh0/z2;

    iget-object v2, p0, Lh0/z2;->G:Lkotlin/jvm/internal/f0;

    iget-wide v3, p0, Lh0/z2;->H:J

    iget-object v1, p0, Lh0/z2;->F:Lh0/c3;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lh0/z2;-><init>(Lh0/c3;Lkotlin/jvm/internal/f0;JLq83/d;)V

    iput-object p1, v0, Lh0/z2;->E:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh0/a3;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh0/z2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/z2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/z2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lh0/z2;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-wide v0, p0, Lh0/z2;->y:J

    iget-object v3, p0, Lh0/z2;->x:Lkotlin/jvm/internal/f0;

    iget-object v4, p0, Lh0/z2;->w:Lh0/c3;

    iget-object v5, p0, Lh0/z2;->E:Ljava/lang/Object;

    check-cast v5, Lh0/c3;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh0/z2;->E:Ljava/lang/Object;

    check-cast p1, Lh0/a3;

    new-instance v1, Lh0/i;

    const/4 v3, 0x1

    iget-object v4, p0, Lh0/z2;->F:Lh0/c3;

    invoke-direct {v1, v3, v4, p1}, Lh0/i;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, v4, Lh0/c3;->c:Lh0/o1;

    iget-object v3, p0, Lh0/z2;->G:Lkotlin/jvm/internal/f0;

    iget-wide v5, v3, Lkotlin/jvm/internal/f0;->w:J

    iget-object v7, v4, Lh0/c3;->d:Lh0/d2;

    sget-object v8, Lh0/d2;->x:Lh0/d2;

    iget-wide v9, p0, Lh0/z2;->H:J

    if-ne v7, v8, :cond_2

    invoke-static {v9, v10}, Ly3/q;->d(J)F

    move-result v7

    goto :goto_0

    :cond_2
    invoke-static {v9, v10}, Ly3/q;->e(J)F

    move-result v7

    :goto_0
    invoke-virtual {v4, v7}, Lh0/c3;->d(F)F

    move-result v7

    iput-object v4, p0, Lh0/z2;->E:Ljava/lang/Object;

    iput-object v4, p0, Lh0/z2;->w:Lh0/c3;

    iput-object v3, p0, Lh0/z2;->x:Lkotlin/jvm/internal/f0;

    iput-wide v5, p0, Lh0/z2;->y:J

    iput v2, p0, Lh0/z2;->z:I

    invoke-interface {p1, v1, v7, p0}, Lh0/o1;->a(Lh0/k2;FLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    move-wide v0, v5

    move-object v5, v4

    :goto_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {v5, p1}, Lh0/c3;->d(F)F

    move-result p1

    iget-object v4, v4, Lh0/c3;->d:Lh0/d2;

    sget-object v5, Lh0/d2;->x:Lh0/d2;

    const/4 v6, 0x0

    if-ne v4, v5, :cond_4

    const/4 v2, 0x2

    invoke-static {p1, v6, v0, v1, v2}, Ly3/q;->b(FFJI)J

    move-result-wide v0

    goto :goto_2

    :cond_4
    invoke-static {v6, p1, v0, v1, v2}, Ly3/q;->b(FFJI)J

    move-result-wide v0

    :goto_2
    iput-wide v0, v3, Lkotlin/jvm/internal/f0;->w:J

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
