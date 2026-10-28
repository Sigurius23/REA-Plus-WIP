.class public final Lw23/n;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/internal/m;

.field public final synthetic F:Lkotlin/jvm/internal/i;

.field public final synthetic G:Lb33/i;

.field public w:I

.field public final synthetic x:Lec3/f2;

.field public final synthetic y:Lkotlin/jvm/internal/m;

.field public final synthetic z:Lw23/p;


# direct methods
.method public constructor <init>(Lec3/f2;Lkotlin/jvm/functions/Function1;Lw23/p;Lc93/a;Lkotlin/jvm/functions/Function1;Lb33/i;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lw23/n;->x:Lec3/f2;

    check-cast p2, Lkotlin/jvm/internal/m;

    iput-object p2, p0, Lw23/n;->y:Lkotlin/jvm/internal/m;

    iput-object p3, p0, Lw23/n;->z:Lw23/p;

    check-cast p4, Lkotlin/jvm/internal/m;

    iput-object p4, p0, Lw23/n;->E:Lkotlin/jvm/internal/m;

    check-cast p5, Lkotlin/jvm/internal/i;

    iput-object p5, p0, Lw23/n;->F:Lkotlin/jvm/internal/i;

    iput-object p6, p0, Lw23/n;->G:Lb33/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8

    new-instance v0, Lw23/n;

    iget-object v5, p0, Lw23/n;->F:Lkotlin/jvm/internal/i;

    iget-object v6, p0, Lw23/n;->G:Lb33/i;

    iget-object v1, p0, Lw23/n;->x:Lec3/f2;

    iget-object v2, p0, Lw23/n;->y:Lkotlin/jvm/internal/m;

    iget-object v3, p0, Lw23/n;->z:Lw23/p;

    iget-object v4, p0, Lw23/n;->E:Lkotlin/jvm/internal/m;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lw23/n;-><init>(Lec3/f2;Lkotlin/jvm/functions/Function1;Lw23/p;Lc93/a;Lkotlin/jvm/functions/Function1;Lb33/i;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lw23/n;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lw23/n;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lw23/n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lw23/n;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lch/i;

    const/4 v1, 0x2

    iget-object v3, p0, Lw23/n;->x:Lec3/f2;

    invoke-direct {p1, v3, v1}, Lch/i;-><init>(Lec3/l;I)V

    new-instance v1, Lbe/d;

    const/4 v3, 0x0

    iget-object v4, p0, Lw23/n;->y:Lkotlin/jvm/internal/m;

    invoke-direct {v1, v3, v4}, Lbe/d;-><init>(Lq83/d;Lkotlin/jvm/functions/Function1;)V

    invoke-static {p1, v1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v1, Lrv/f;

    iget-object v4, p0, Lw23/n;->z:Lw23/p;

    iget-object v5, p0, Lw23/n;->E:Lkotlin/jvm/internal/m;

    invoke-direct {v1, v3, v4, v5}, Lrv/f;-><init>(Lq83/d;Lw23/p;Lc93/a;)V

    invoke-static {p1, v1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v1, Lw23/j;

    iget-object v3, p0, Lw23/n;->F:Lkotlin/jvm/internal/i;

    iget-object v5, p0, Lw23/n;->G:Lb33/i;

    invoke-direct {v1, v4, v3, v5}, Lw23/j;-><init>(Lw23/p;Lkotlin/jvm/functions/Function1;Lb33/i;)V

    iput v2, p0, Lw23/n;->w:I

    invoke-interface {p1, v1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
