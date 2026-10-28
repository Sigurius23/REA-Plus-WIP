.class public final Lx20/x;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public w:J

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:J


# direct methods
.method public constructor <init>(JLq83/d;)V
    .locals 0

    iput-wide p1, p0, Lx20/x;->z:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    new-instance v0, Lx20/x;

    iget-wide v1, p0, Lx20/x;->z:J

    invoke-direct {v0, v1, v2, p2}, Lx20/x;-><init>(JLq83/d;)V

    iput-object p1, v0, Lx20/x;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lx20/x;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lx20/x;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lx20/x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lx20/x;->x:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-wide v5, p0, Lx20/x;->w:J

    iget-object v1, p0, Lx20/x;->y:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    :goto_0
    iget-wide v5, p0, Lx20/x;->w:J

    iget-object v1, p0, Lx20/x;->y:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lx20/x;->y:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lec3/m;

    iget-wide v5, p0, Lx20/x;->z:J

    invoke-static {v5, v6}, Lkotlin/time/Duration;->box-impl(J)Lkotlin/time/Duration;

    move-result-object p1

    iput-object v1, p0, Lx20/x;->y:Ljava/lang/Object;

    iput-wide v5, p0, Lx20/x;->w:J

    iput v4, p0, Lx20/x;->x:I

    invoke-interface {v1, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    sget-object p1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    invoke-virtual {p1}, Lkotlin/time/Duration$Companion;->getZERO-UwyO8pc()J

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Lkotlin/time/Duration;->compareTo-LRDsOJo(JJ)I

    move-result p1

    if-lez p1, :cond_6

    sget-object p1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v4, p1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v7

    iput-object v1, p0, Lx20/x;->y:Ljava/lang/Object;

    iput-wide v5, p0, Lx20/x;->w:J

    iput v3, p0, Lx20/x;->x:I

    invoke-static {v7, v8, p0}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    sget-object p1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object p1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v4, p1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Lkotlin/time/Duration;->minus-LRDsOJo(JJ)J

    move-result-wide v5

    invoke-static {v5, v6}, Lkotlin/time/Duration;->box-impl(J)Lkotlin/time/Duration;

    move-result-object p1

    iput-object v1, p0, Lx20/x;->y:Ljava/lang/Object;

    iput-wide v5, p0, Lx20/x;->w:J

    iput v2, p0, Lx20/x;->x:I

    invoke-interface {v1, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_3
    return-object v0

    :cond_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
