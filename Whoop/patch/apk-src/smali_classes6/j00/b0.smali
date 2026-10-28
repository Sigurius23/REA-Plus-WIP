.class public final Lj00/b0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lg2/s;

.field public final synthetic F:Lg2/s;

.field public final synthetic G:Lg2/s;

.field public final synthetic H:Z

.field public w:I

.field public final synthetic x:Lr0/a;

.field public final synthetic y:Lg40/m3;

.field public final synthetic z:Z


# direct methods
.method public constructor <init>(Lr0/a;Lg40/m3;ZLg2/s;Lg2/s;Lg2/s;ZLq83/d;)V
    .locals 0

    iput-object p1, p0, Lj00/b0;->x:Lr0/a;

    iput-object p2, p0, Lj00/b0;->y:Lg40/m3;

    iput-boolean p3, p0, Lj00/b0;->z:Z

    iput-object p4, p0, Lj00/b0;->E:Lg2/s;

    iput-object p5, p0, Lj00/b0;->F:Lg2/s;

    iput-object p6, p0, Lj00/b0;->G:Lg2/s;

    iput-boolean p7, p0, Lj00/b0;->H:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9

    new-instance v0, Lj00/b0;

    iget-object v6, p0, Lj00/b0;->G:Lg2/s;

    iget-boolean v7, p0, Lj00/b0;->H:Z

    iget-object v1, p0, Lj00/b0;->x:Lr0/a;

    iget-object v2, p0, Lj00/b0;->y:Lg40/m3;

    iget-boolean v3, p0, Lj00/b0;->z:Z

    iget-object v4, p0, Lj00/b0;->E:Lg2/s;

    iget-object v5, p0, Lj00/b0;->F:Lg2/s;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lj00/b0;-><init>(Lr0/a;Lg40/m3;ZLg2/s;Lg2/s;Lg2/s;ZLq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lj00/b0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj00/b0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj00/b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lj00/b0;->w:I

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

    iput v2, p0, Lj00/b0;->w:I

    iget-object p1, p0, Lj00/b0;->x:Lr0/a;

    invoke-static {p1, p0}, Lr0/a;->a(Lr0/a;Ls83/i;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lj00/b0;->y:Lg40/m3;

    invoke-interface {p1}, Lg40/m3;->l()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    move v0, v1

    goto :goto_2

    :cond_4
    :goto_1
    move v0, v2

    :goto_2
    invoke-interface {p1}, Lg40/m3;->l()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_3

    :cond_5
    move v2, v1

    :cond_6
    :goto_3
    iget-boolean p1, p0, Lj00/b0;->z:Z

    if-eqz p1, :cond_7

    if-eqz v0, :cond_7

    iget-object p1, p0, Lj00/b0;->E:Lg2/s;

    goto :goto_4

    :cond_7
    if-nez p1, :cond_8

    if-eqz v2, :cond_8

    iget-object p1, p0, Lj00/b0;->F:Lg2/s;

    goto :goto_4

    :cond_8
    iget-boolean p1, p0, Lj00/b0;->H:Z

    if-eqz p1, :cond_9

    iget-object p1, p0, Lj00/b0;->G:Lg2/s;

    goto :goto_4

    :cond_9
    const/4 p1, 0x0

    :goto_4
    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lg2/s;->b()V

    :cond_a
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
