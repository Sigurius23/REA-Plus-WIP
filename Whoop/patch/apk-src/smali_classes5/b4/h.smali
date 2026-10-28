.class public final Lb4/h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public w:I

.field public final synthetic x:Z

.field public final synthetic y:Lb4/l;

.field public final synthetic z:J


# direct methods
.method public constructor <init>(ZLb4/l;JLq83/d;)V
    .locals 0

    iput-boolean p1, p0, Lb4/h;->x:Z

    iput-object p2, p0, Lb4/h;->y:Lb4/l;

    iput-wide p3, p0, Lb4/h;->z:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6

    new-instance v0, Lb4/h;

    iget-object v2, p0, Lb4/h;->y:Lb4/l;

    iget-wide v3, p0, Lb4/h;->z:J

    iget-boolean v1, p0, Lb4/h;->x:Z

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lb4/h;-><init>(ZLb4/l;JLq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lb4/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb4/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb4/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lb4/h;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, p0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lb4/h;->x:Z

    iget-object v1, p0, Lb4/h;->y:Lb4/l;

    if-nez p1, :cond_4

    iget-object v4, v1, Lb4/l;->w:Lt2/d;

    iput v3, p0, Lb4/h;->w:I

    const-wide/16 v5, 0x0

    iget-wide v7, p0, Lb4/h;->z:J

    move-object v9, p0

    invoke-virtual/range {v4 .. v9}, Lt2/d;->a(JJLs83/c;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, v9

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Ly3/q;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_3

    :cond_4
    move-object v6, p0

    iget-object v1, v1, Lb4/l;->w:Lt2/d;

    iput v2, v6, Lb4/h;->w:I

    iget-wide v2, v6, Lb4/h;->z:J

    const-wide/16 v4, 0x0

    invoke-virtual/range {v1 .. v6}, Lt2/d;->a(JJLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    check-cast p1, Ly3/q;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
