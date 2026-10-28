.class public final Lec3/d2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public w:I

.field public synthetic x:Lec3/m;

.field public synthetic y:I

.field public final synthetic z:Lec3/e2;


# direct methods
.method public constructor <init>(Lec3/e2;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lec3/d2;->z:Lec3/e2;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lec3/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Lq83/d;

    new-instance v0, Lec3/d2;

    iget-object v1, p0, Lec3/d2;->z:Lec3/e2;

    invoke-direct {v0, v1, p3}, Lec3/d2;-><init>(Lec3/e2;Lq83/d;)V

    iput-object p1, v0, Lec3/d2;->x:Lec3/m;

    iput p2, v0, Lec3/d2;->y:I

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lec3/d2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lec3/d2;->z:Lec3/e2;

    iget-wide v1, v0, Lec3/e2;->b:J

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, p0, Lec3/d2;->w:I

    const/4 v5, 0x5

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz v4, :cond_5

    if-eq v4, v9, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_2

    if-eq v4, v6, :cond_1

    if-ne v4, v5, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lec3/d2;->x:Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    iget-object v0, p0, Lec3/d2;->x:Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lec3/d2;->x:Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lec3/d2;->x:Lec3/m;

    iget v4, p0, Lec3/d2;->y:I

    if-lez v4, :cond_6

    sget-object v0, Lec3/y1;->w:Lec3/y1;

    iput v9, p0, Lec3/d2;->w:I

    invoke-interface {p1, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_a

    goto :goto_4

    :cond_6
    iget-wide v9, v0, Lec3/e2;->a:J

    iput-object p1, p0, Lec3/d2;->x:Lec3/m;

    iput v8, p0, Lec3/d2;->w:I

    invoke-static {v9, v10, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_7

    goto :goto_4

    :cond_7
    move-object v0, p1

    :goto_1
    const-wide/16 v8, 0x0

    cmp-long p1, v1, v8

    if-lez p1, :cond_9

    sget-object p1, Lec3/y1;->x:Lec3/y1;

    iput-object v0, p0, Lec3/d2;->x:Lec3/m;

    iput v7, p0, Lec3/d2;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_8

    goto :goto_4

    :cond_8
    :goto_2
    iput-object v0, p0, Lec3/d2;->x:Lec3/m;

    iput v6, p0, Lec3/d2;->w:I

    invoke-static {v1, v2, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_9

    goto :goto_4

    :cond_9
    :goto_3
    sget-object p1, Lec3/y1;->y:Lec3/y1;

    const/4 v1, 0x0

    iput-object v1, p0, Lec3/d2;->x:Lec3/m;

    iput v5, p0, Lec3/d2;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_a

    :goto_4
    return-object v3

    :cond_a
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
