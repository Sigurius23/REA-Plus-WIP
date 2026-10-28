.class public final Lt23/v;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public w:I

.field public final synthetic x:Lt23/c0;


# direct methods
.method public constructor <init>(Lt23/c0;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lt23/v;->x:Lt23/c0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1

    new-instance p1, Lt23/v;

    iget-object v0, p0, Lt23/v;->x:Lt23/c0;

    invoke-direct {p1, v0, p2}, Lt23/v;-><init>(Lt23/c0;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lt23/v;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt23/v;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lt23/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lt23/v;->w:I

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

    iget-object p1, p0, Lt23/v;->x:Lt23/c0;

    iget-object v1, p1, Lt23/c0;->C:Lec3/h2;

    new-instance v3, Lch/i;

    const/4 v4, 0x2

    invoke-direct {v3, v1, v4}, Lch/i;-><init>(Lec3/l;I)V

    new-instance v1, Lt23/b;

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-direct {v1, v5, v4, v6}, Lt23/b;-><init>(IILq83/d;)V

    invoke-static {v3, v1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v1

    new-instance v3, Lt23/b;

    const/4 v4, 0x3

    invoke-direct {v3, v5, v4, v6}, Lt23/b;-><init>(IILq83/d;)V

    invoke-static {v1, v3}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v1

    new-instance v3, Lt23/t;

    invoke-direct {v3, p1}, Lt23/t;-><init>(Lt23/c0;)V

    iput v2, p0, Lt23/v;->w:I

    invoke-virtual {v1, v3, p0}, Lfc3/g;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
