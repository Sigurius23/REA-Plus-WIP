.class public final Lh0/v2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public w:I

.field public synthetic x:J

.field public final synthetic y:Lh0/w2;


# direct methods
.method public constructor <init>(Lh0/w2;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lh0/v2;->y:Lh0/w2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    new-instance v0, Lh0/v2;

    iget-object v1, p0, Lh0/v2;->y:Lh0/w2;

    invoke-direct {v0, v1, p2}, Lh0/v2;-><init>(Lh0/w2;Lq83/d;)V

    check-cast p1, Lh2/b;

    iget-wide p1, p1, Lh2/b;->a:J

    iput-wide p1, v0, Lh0/v2;->x:J

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Lh2/b;

    iget-wide v0, p1, Lh2/b;->a:J

    check-cast p2, Lq83/d;

    new-instance p1, Lh0/v2;

    iget-object v2, p0, Lh0/v2;->y:Lh0/w2;

    invoke-direct {p1, v2, p2}, Lh0/v2;-><init>(Lh0/w2;Lq83/d;)V

    iput-wide v0, p1, Lh0/v2;->x:J

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/v2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lh0/v2;->w:I

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

    iget-wide v3, p0, Lh0/v2;->x:J

    iget-object p1, p0, Lh0/v2;->y:Lh0/w2;

    iget-object p1, p1, Lh0/w2;->e0:Lh0/c3;

    iput v2, p0, Lh0/v2;->w:I

    invoke-static {p1, v3, v4, p0}, Landroidx/compose/foundation/gestures/b;->a(Lh0/c3;JLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
