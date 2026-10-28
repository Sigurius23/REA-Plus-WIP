.class public abstract Lkg3/b;
.super Lmg3/a;
.source "SourceFile"

# interfaces
.implements Lng3/l;
.implements Ljava/lang/Comparable;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public g(Lng3/q;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lng3/p;->b:Lg73/d;

    if-ne p1, v0, :cond_0

    move-object p1, p0

    check-cast p1, Ljg3/e;

    iget-object p1, p1, Ljg3/e;->F:Ljg3/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lkg3/e;->w:Lkg3/e;

    return-object p1

    :cond_0
    sget-object v0, Lng3/p;->c:Lng3/n;

    if-ne p1, v0, :cond_1

    sget-object p1, Lng3/b;->x:Lng3/b;

    return-object p1

    :cond_1
    sget-object v0, Lng3/p;->f:Lng3/o;

    if-ne p1, v0, :cond_2

    move-object p1, p0

    check-cast p1, Ljg3/e;

    iget-object p1, p1, Ljg3/e;->F:Ljg3/d;

    invoke-virtual {p1}, Ljg3/d;->toEpochDay()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljg3/d;->u0(J)Ljg3/d;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object v0, Lng3/p;->g:Lng3/n;

    if-ne p1, v0, :cond_3

    move-object p1, p0

    check-cast p1, Ljg3/e;

    iget-object p1, p1, Ljg3/e;->G:Ljg3/f;

    return-object p1

    :cond_3
    sget-object v0, Lng3/p;->d:Lng3/o;

    if-eq p1, v0, :cond_5

    sget-object v0, Lng3/p;->a:Lg73/a;

    if-eq p1, v0, :cond_5

    sget-object v0, Lng3/p;->e:Lng3/n;

    if-ne p1, v0, :cond_4

    goto :goto_0

    :cond_4
    invoke-super {p0, p1}, Lce/w;->g(Lng3/q;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final o0(Ljg3/p;)J
    .locals 5

    const-string v0, "offset"

    invoke-static {p1, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Ljg3/e;

    iget-object v1, v0, Ljg3/e;->F:Ljg3/d;

    invoke-virtual {v1}, Ljg3/d;->toEpochDay()J

    move-result-wide v1

    const-wide/32 v3, 0x15180

    mul-long/2addr v1, v3

    iget-object v0, v0, Ljg3/e;->G:Ljg3/f;

    invoke-virtual {v0}, Ljg3/f;->D0()I

    move-result v0

    int-to-long v3, v0

    add-long/2addr v1, v3

    iget p1, p1, Ljg3/p;->x:I

    int-to-long v3, p1

    sub-long/2addr v1, v3

    return-wide v1
.end method
