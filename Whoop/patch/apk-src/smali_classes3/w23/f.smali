.class public final Lw23/f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public w:I

.field public final synthetic x:Lec3/f2;

.field public final synthetic y:Lec3/f2;

.field public final synthetic z:Lio/sentry/android/replay/video/d;


# direct methods
.method public constructor <init>(Lec3/f2;Lec3/f2;Lio/sentry/android/replay/video/d;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lw23/f;->x:Lec3/f2;

    iput-object p2, p0, Lw23/f;->y:Lec3/f2;

    iput-object p3, p0, Lw23/f;->z:Lio/sentry/android/replay/video/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    new-instance p1, Lw23/f;

    iget-object v0, p0, Lw23/f;->y:Lec3/f2;

    iget-object v1, p0, Lw23/f;->z:Lio/sentry/android/replay/video/d;

    iget-object v2, p0, Lw23/f;->x:Lec3/f2;

    invoke-direct {p1, v2, v0, v1, p2}, Lw23/f;-><init>(Lec3/f2;Lec3/f2;Lio/sentry/android/replay/video/d;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lw23/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lw23/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lw23/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lw23/f;->w:I

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

    iget-object v3, p0, Lw23/f;->x:Lec3/f2;

    invoke-direct {p1, v3, v1}, Lch/i;-><init>(Lec3/l;I)V

    new-instance v1, Lt23/b;

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-direct {v1, v4, v3, v5}, Lt23/b;-><init>(IILq83/d;)V

    invoke-static {p1, v1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v1, Lt23/b;

    const/4 v3, 0x5

    invoke-direct {v1, v4, v3, v5}, Lt23/b;-><init>(IILq83/d;)V

    invoke-static {p1, v1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v1, Lbe/d;

    const/16 v3, 0x8

    iget-object v4, p0, Lw23/f;->y:Lec3/f2;

    invoke-direct {v1, v5, v4, v3}, Lbe/d;-><init>(Lq83/d;Ljava/lang/Object;I)V

    invoke-static {p1, v1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v1, Lu;

    iget-object v3, p0, Lw23/f;->z:Lio/sentry/android/replay/video/d;

    const/16 v4, 0x1b

    invoke-direct {v1, v3, v4}, Lu;-><init>(Ljava/lang/Object;I)V

    iput v2, p0, Lw23/f;->w:I

    invoke-interface {p1, v1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
