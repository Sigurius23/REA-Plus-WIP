.class public final synthetic Lc9/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/f;
.implements Lx8/d;


# instance fields
.field public final synthetic w:J

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lc9/a;IJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc9/f;->y:Ljava/lang/Object;

    iput p2, p0, Lc9/f;->x:I

    iput-wide p3, p0, Lc9/f;->w:J

    return-void
.end method

.method public synthetic constructor <init>(Lqa/m;JI)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc9/f;->y:Ljava/lang/Object;

    iput-wide p2, p0, Lc9/f;->w:J

    iput p4, p0, Lc9/f;->x:I

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lc9/f;->y:Ljava/lang/Object;

    check-cast v1, Lqa/m;

    move-object/from16 v2, p1

    check-cast v2, Lqa/a;

    iget-object v3, v1, Lqa/m;->h:Lu8/p;

    invoke-static {v3}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object v3, v2, Lqa/a;->a:Lzr/g0;

    iget-wide v4, v2, Lqa/a;->c:J

    invoke-static {v3, v4, v5}, Lng3/n;->h(Lzr/g0;J)[B

    move-result-object v3

    iget-object v4, v1, Lqa/m;->c:Lx8/n;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v5, v3

    invoke-virtual {v4, v5, v3}, Lx8/n;->D(I[B)V

    iget-object v5, v1, Lqa/m;->a:Lt9/k0;

    array-length v6, v3

    const/4 v7, 0x0

    invoke-interface {v5, v4, v6, v7}, Lt9/k0;->d(Lx8/n;II)V

    iget-wide v4, v2, Lqa/a;->b:J

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v4, v8

    iget-wide v8, v0, Lc9/f;->w:J

    const/4 v6, 0x1

    const-wide v10, 0x7fffffffffffffffL

    if-nez v2, :cond_1

    iget-object v2, v1, Lqa/m;->h:Lu8/p;

    iget-wide v4, v2, Lu8/p;->s:J

    cmp-long v2, v4, v10

    if-nez v2, :cond_0

    move v7, v6

    :cond_0
    invoke-static {v7}, Lva3/g;->i(Z)V

    :goto_0
    move-wide v11, v8

    goto :goto_1

    :cond_1
    iget-object v2, v1, Lqa/m;->h:Lu8/p;

    iget-wide v12, v2, Lu8/p;->s:J

    cmp-long v2, v12, v10

    if-nez v2, :cond_2

    add-long/2addr v8, v4

    goto :goto_0

    :cond_2
    add-long v8, v4, v12

    goto :goto_0

    :goto_1
    iget-object v10, v1, Lqa/m;->a:Lt9/k0;

    iget v1, v0, Lc9/f;->x:I

    or-int/lit8 v13, v1, 0x1

    array-length v14, v3

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-interface/range {v10 .. v16}, Lt9/k0;->b(JIIILt9/j0;)V

    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 10

    iget-object v0, p0, Lc9/f;->y:Ljava/lang/Object;

    check-cast v0, Lc9/a;

    check-cast p1, Lc9/b;

    check-cast p1, Lc9/l;

    iget-object v1, p1, Lc9/l;->h:Ljava/util/HashMap;

    iget-object v2, p1, Lc9/l;->i:Ljava/util/HashMap;

    iget-object v3, v0, Lc9/a;->d:Ll9/c0;

    if-eqz v3, :cond_2

    iget-object p1, p1, Lc9/l;->c:Lc9/j;

    iget-object v0, v0, Lc9/a;->b:Lu8/o0;

    invoke-virtual {p1, v0, v3}, Lc9/j;->c(Lu8/o0;Ll9/c0;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    const-wide/16 v4, 0x0

    if-nez v0, :cond_0

    move-wide v6, v4

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    :goto_0
    iget-wide v8, p0, Lc9/f;->w:J

    add-long/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    :goto_1
    iget v0, p0, Lc9/f;->x:I

    int-to-long v2, v0

    add-long/2addr v4, v2

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method
