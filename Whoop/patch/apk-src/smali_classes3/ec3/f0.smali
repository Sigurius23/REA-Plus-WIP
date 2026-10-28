.class public final Lec3/f0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public w:I

.field public synthetic x:Ljava/lang/Throwable;

.field public synthetic y:J

.field public final synthetic z:Lc93/m;


# direct methods
.method public constructor <init>(Lc93/m;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lec3/f0;->z:Lc93/m;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lec3/m;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    check-cast p4, Lq83/d;

    new-instance p1, Lec3/f0;

    iget-object p3, p0, Lec3/f0;->z:Lc93/m;

    invoke-direct {p1, p3, p4}, Lec3/f0;-><init>(Lc93/m;Lq83/d;)V

    iput-object p2, p1, Lec3/f0;->x:Ljava/lang/Throwable;

    iput-wide v0, p1, Lec3/f0;->y:J

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lec3/f0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lec3/f0;->w:I

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

    iget-object p1, p0, Lec3/f0;->x:Ljava/lang/Throwable;

    iget-wide v3, p0, Lec3/f0;->y:J

    const-wide v5, 0x7fffffffffffffffL

    cmp-long v1, v3, v5

    if-gez v1, :cond_3

    iput v2, p0, Lec3/f0;->w:I

    iget-object v1, p0, Lec3/f0;->z:Lc93/m;

    invoke-interface {v1, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
