.class public final Lf0/b0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public w:I

.field public synthetic x:Lh0/h2;

.field public synthetic y:J

.field public final synthetic z:Lf0/c0;


# direct methods
.method public constructor <init>(Lf0/c0;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lf0/b0;->z:Lf0/c0;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Lh0/h2;

    check-cast p2, Lh2/b;

    iget-wide v0, p2, Lh2/b;->a:J

    check-cast p3, Lq83/d;

    new-instance p2, Lf0/b0;

    iget-object v2, p0, Lf0/b0;->z:Lf0/c0;

    invoke-direct {p2, v2, p3}, Lf0/b0;-><init>(Lf0/c0;Lq83/d;)V

    iput-object p1, p2, Lf0/b0;->x:Lh0/h2;

    iput-wide v0, p2, Lf0/b0;->y:J

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p2, p1}, Lf0/b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lf0/b0;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v4, p0, Lf0/b0;->x:Lh0/h2;

    iget-wide v5, p0, Lf0/b0;->y:J

    iget-object v8, p0, Lf0/b0;->z:Lf0/c0;

    iget-boolean p1, v8, Lf0/h;->V:Z

    if-eqz p1, :cond_3

    iput v3, p0, Lf0/b0;->w:I

    iget-object v7, v8, Lf0/h;->Q:Lj0/i;

    if-eqz v7, :cond_2

    new-instance v3, Lf0/d;

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v9}, Lf0/d;-><init>(Lh0/h2;JLj0/i;Lf0/h;Lq83/d;)V

    invoke-static {v3, p0}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v2

    :goto_0
    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    return-object v2
.end method
