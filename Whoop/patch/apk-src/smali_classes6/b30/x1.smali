.class public final Lb30/x1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public w:I

.field public final synthetic x:Z

.field public final synthetic y:Ln0/u;

.field public final synthetic z:I


# direct methods
.method public constructor <init>(ZLn0/u;ILq83/d;)V
    .locals 0

    iput-boolean p1, p0, Lb30/x1;->x:Z

    iput-object p2, p0, Lb30/x1;->y:Ln0/u;

    iput p3, p0, Lb30/x1;->z:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    new-instance p1, Lb30/x1;

    iget-object v0, p0, Lb30/x1;->y:Ln0/u;

    iget v1, p0, Lb30/x1;->z:I

    iget-boolean v2, p0, Lb30/x1;->x:Z

    invoke-direct {p1, v2, v0, v1, p2}, Lb30/x1;-><init>(ZLn0/u;ILq83/d;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lb30/x1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/x1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/x1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lb30/x1;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lb30/x1;->x:Z

    const/4 v1, 0x0

    iget v4, p0, Lb30/x1;->z:I

    iget-object v5, p0, Lb30/x1;->y:Ln0/u;

    if-eqz p1, :cond_3

    iput v3, p0, Lb30/x1;->w:I

    sget-object p1, Ln0/u;->x:Lp0/n0;

    invoke-virtual {v5, v4, v1, p0}, Ln0/u;->j(IILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_1

    :cond_3
    iput v2, p0, Lb30/x1;->w:I

    sget-object p1, Ln0/u;->x:Lp0/n0;

    invoke-virtual {v5, v4, v1, p0}, Ln0/u;->f(IILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
