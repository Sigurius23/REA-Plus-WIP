.class public final Lx20/q;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:J

.field public final synthetic z:Lx20/w;


# direct methods
.method public constructor <init>(JLx20/w;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lx20/q;->w:I

    .line 1
    iput-wide p1, p0, Lx20/q;->y:J

    iput-object p3, p0, Lx20/q;->z:Lx20/w;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lx20/w;JLq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lx20/q;->w:I

    .line 2
    iput-object p1, p0, Lx20/q;->z:Lx20/w;

    iput-wide p2, p0, Lx20/q;->y:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget p1, p0, Lx20/q;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lx20/q;

    iget-wide v0, p0, Lx20/q;->y:J

    iget-object v2, p0, Lx20/q;->z:Lx20/w;

    invoke-direct {p1, v0, v1, v2, p2}, Lx20/q;-><init>(JLx20/w;Lq83/d;)V

    return-object p1

    :pswitch_0
    new-instance p1, Lx20/q;

    iget-object v0, p0, Lx20/q;->z:Lx20/w;

    iget-wide v1, p0, Lx20/q;->y:J

    invoke-direct {p1, v0, v1, v2, p2}, Lx20/q;-><init>(Lx20/w;JLq83/d;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lx20/q;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lx20/q;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lx20/q;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lx20/q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lx20/q;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lx20/q;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lx20/q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lx20/q;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lx20/q;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, p0, Lx20/q;->x:I

    iget-wide v3, p0, Lx20/q;->y:J

    invoke-static {v3, v4, p0}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    iput v2, p0, Lx20/q;->x:I

    iget-object p1, p0, Lx20/q;->z:Lx20/w;

    invoke-static {p1, p0}, Lx20/w;->g(Lx20/w;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_2
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lx20/q;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_7

    if-ne v1, v3, :cond_6

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_5
    move-object v0, v2

    goto :goto_4

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, p0, Lx20/q;->x:I

    new-instance p1, Lx20/x;

    const/4 v1, 0x0

    iget-wide v3, p0, Lx20/q;->y:J

    invoke-direct {p1, v3, v4, v1}, Lx20/x;-><init>(JLq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, p1}, Lec3/s1;-><init>(Lc93/m;)V

    new-instance p1, Lu;

    const/16 v3, 0x1d

    iget-object v4, p0, Lx20/q;->z:Lx20/w;

    invoke-direct {p1, v4, v3}, Lu;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, p1, p0}, Lec3/s1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_3

    :cond_8
    move-object p1, v2

    :goto_3
    if-ne p1, v0, :cond_5

    :goto_4
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
