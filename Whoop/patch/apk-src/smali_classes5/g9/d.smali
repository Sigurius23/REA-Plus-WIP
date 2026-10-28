.class public final Lg9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Ll9/c0;

.field public final c:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILl9/c0;)V
    .locals 0

    iput-object p1, p0, Lg9/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput p2, p0, Lg9/d;->a:I

    iput-object p3, p0, Lg9/d;->b:Ll9/c0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lx8/d;)V
    .locals 5

    iget-object v0, p0, Lg9/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll9/h0;

    iget-object v2, v1, Ll9/h0;->b:Ljava/lang/Object;

    iget-object v1, v1, Ll9/h0;->a:Landroid/os/Handler;

    new-instance v3, Lio/sentry/android/core/r0;

    const/16 v4, 0xb

    invoke-direct {v3, v4, p1, v2}, Lio/sentry/android/core/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v3}, Lx8/t;->N(Landroid/os/Handler;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(ILu8/p;ILjava/lang/Object;J)V
    .locals 10

    new-instance v0, Ll9/y;

    invoke-static/range {p5 .. p6}, Lx8/t;->U(J)J

    move-result-wide v6

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v1, 0x1

    move v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v9}, Ll9/y;-><init>(IILjava/lang/Object;ILjava/lang/Object;JJ)V

    new-instance p1, Lc9/c;

    const/16 p2, 0x13

    invoke-direct {p1, p2, p0, v0}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lg9/d;->a(Lx8/d;)V

    return-void
.end method

.method public c(Ll9/t;IILu8/p;ILjava/lang/Object;JJ)V
    .locals 10

    new-instance v0, Ll9/y;

    invoke-static/range {p7 .. p8}, Lx8/t;->U(J)J

    move-result-wide v6

    invoke-static/range {p9 .. p10}, Lx8/t;->U(J)J

    move-result-wide v8

    move v1, p2

    move v2, p3

    move-object v3, p4

    move v4, p5

    move-object/from16 v5, p6

    invoke-direct/range {v0 .. v9}, Ll9/y;-><init>(IILjava/lang/Object;ILjava/lang/Object;JJ)V

    new-instance p2, Ll9/f0;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p1, v0, p3}, Ll9/f0;-><init>(Lg9/d;Ll9/t;Ll9/y;I)V

    invoke-virtual {p0, p2}, Lg9/d;->a(Lx8/d;)V

    return-void
.end method

.method public d(Ll9/t;IILu8/p;ILjava/lang/Object;JJ)V
    .locals 10

    new-instance v0, Ll9/y;

    invoke-static/range {p7 .. p8}, Lx8/t;->U(J)J

    move-result-wide v6

    invoke-static/range {p9 .. p10}, Lx8/t;->U(J)J

    move-result-wide v8

    move v1, p2

    move v2, p3

    move-object v3, p4

    move v4, p5

    move-object/from16 v5, p6

    invoke-direct/range {v0 .. v9}, Ll9/y;-><init>(IILjava/lang/Object;ILjava/lang/Object;JJ)V

    new-instance p2, Ll9/f0;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p1, v0, p3}, Ll9/f0;-><init>(Lg9/d;Ll9/t;Ll9/y;I)V

    invoke-virtual {p0, p2}, Lg9/d;->a(Lx8/d;)V

    return-void
.end method

.method public e(Ll9/t;IILu8/p;ILjava/lang/Object;JJLjava/io/IOException;Z)V
    .locals 10

    new-instance v0, Ll9/y;

    invoke-static/range {p7 .. p8}, Lx8/t;->U(J)J

    move-result-wide v6

    invoke-static/range {p9 .. p10}, Lx8/t;->U(J)J

    move-result-wide v8

    move v1, p2

    move v2, p3

    move-object v3, p4

    move v4, p5

    move-object/from16 v5, p6

    invoke-direct/range {v0 .. v9}, Ll9/y;-><init>(IILjava/lang/Object;ILjava/lang/Object;JJ)V

    move-object p5, v0

    new-instance p2, Ll9/g0;

    move-object p3, p0

    move-object p4, p1

    move-object/from16 p6, p11

    move/from16 p7, p12

    invoke-direct/range {p2 .. p7}, Ll9/g0;-><init>(Lg9/d;Ll9/t;Ll9/y;Ljava/io/IOException;Z)V

    invoke-virtual {p0, p2}, Lg9/d;->a(Lx8/d;)V

    return-void
.end method

.method public f(Ll9/t;IILu8/p;ILjava/lang/Object;JJI)V
    .locals 10

    new-instance v0, Ll9/y;

    invoke-static/range {p7 .. p8}, Lx8/t;->U(J)J

    move-result-wide v6

    invoke-static/range {p9 .. p10}, Lx8/t;->U(J)J

    move-result-wide v8

    move v1, p2

    move v2, p3

    move-object v3, p4

    move v4, p5

    move-object/from16 v5, p6

    invoke-direct/range {v0 .. v9}, Ll9/y;-><init>(IILjava/lang/Object;ILjava/lang/Object;JJ)V

    new-instance p2, Ll9/e0;

    move/from16 p3, p11

    invoke-direct {p2, p0, p1, v0, p3}, Ll9/e0;-><init>(Lg9/d;Ll9/t;Ll9/y;I)V

    invoke-virtual {p0, p2}, Lg9/d;->a(Lx8/d;)V

    return-void
.end method
