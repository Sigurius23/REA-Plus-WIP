.class public final Lob/d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public w:I

.field public final synthetic x:Lq83/j;

.field public final synthetic y:Landroidx/room/z0;

.field public final synthetic z:Z


# direct methods
.method public constructor <init>(Lq83/j;Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lob/d;->x:Lq83/j;

    iput-object p2, p0, Lob/d;->y:Landroidx/room/z0;

    iput-boolean p3, p0, Lob/d;->z:Z

    iput-boolean p4, p0, Lob/d;->E:Z

    iput-object p5, p0, Lob/d;->F:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7

    new-instance v0, Lob/d;

    iget-boolean v4, p0, Lob/d;->E:Z

    iget-object v5, p0, Lob/d;->F:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lob/d;->x:Lq83/j;

    iget-object v2, p0, Lob/d;->y:Landroidx/room/z0;

    iget-boolean v3, p0, Lob/d;->z:Z

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lob/d;-><init>(Lq83/j;Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lob/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lob/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lob/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lob/d;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v3, Lob/c;

    iget-object v7, p0, Lob/d;->F:Lkotlin/jvm/functions/Function1;

    const/4 v8, 0x0

    iget-object v4, p0, Lob/d;->y:Landroidx/room/z0;

    iget-boolean v5, p0, Lob/d;->z:Z

    iget-boolean v6, p0, Lob/d;->E:Z

    invoke-direct/range {v3 .. v8}, Lob/c;-><init>(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)V

    iput v2, p0, Lob/d;->w:I

    iget-object p1, p0, Lob/d;->x:Lq83/j;

    invoke-static {p1, v3, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
