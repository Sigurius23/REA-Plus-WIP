.class public final Lch3/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/f;


# instance fields
.field public final w:J

.field public final x:J

.field public final y:Ljava/util/concurrent/TimeUnit;

.field public final z:Lxg3/k;


# direct methods
.method public constructor <init>(JJLjava/util/concurrent/TimeUnit;Lxg3/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lch3/a0;->w:J

    iput-wide p3, p0, Lch3/a0;->x:J

    iput-object p5, p0, Lch3/a0;->y:Ljava/util/concurrent/TimeUnit;

    iput-object p6, p0, Lch3/a0;->z:Lxg3/k;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    check-cast p1, Lxg3/s;

    iget-object v0, p0, Lch3/a0;->z:Lxg3/k;

    invoke-virtual {v0}, Lxg3/k;->a()Lxg3/j;

    move-result-object v0

    new-instance v1, Lch3/o0;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lch3/o0;-><init>(Lxg3/s;Z)V

    iget-wide v2, p0, Lch3/a0;->w:J

    iget-wide v4, p0, Lch3/a0;->x:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    new-instance v2, Lch3/x;

    invoke-direct {v2, p0, v1, v0}, Lch3/x;-><init>(Lch3/a0;Lch3/o0;Lxg3/j;)V

    invoke-virtual {v2, v0}, Lxg3/s;->c(Lxg3/t;)V

    invoke-virtual {p1, v2}, Lxg3/s;->c(Lxg3/t;)V

    iget-object p1, v2, Lch3/x;->H:Lxg3/t;

    move-object v3, p1

    check-cast v3, Lxg3/j;

    new-instance v4, Lch3/w;

    const/4 p1, 0x0

    invoke-direct {v4, v2, p1}, Lch3/w;-><init>(Lxg3/s;I)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v5, p0, Lch3/a0;->w:J

    iget-object v9, p0, Lch3/a0;->y:Ljava/util/concurrent/TimeUnit;

    move-wide v7, v5

    invoke-static/range {v3 .. v9}, Leh3/m;->a(Lxg3/j;Lbh3/a;JJLjava/util/concurrent/TimeUnit;)Lfh3/a;

    return-object v2

    :cond_0
    new-instance v2, Lch3/z;

    invoke-direct {v2, p0, v1, v0}, Lch3/z;-><init>(Lch3/a0;Lch3/o0;Lxg3/j;)V

    invoke-virtual {v2, v0}, Lxg3/s;->c(Lxg3/t;)V

    invoke-virtual {p1, v2}, Lxg3/s;->c(Lxg3/t;)V

    invoke-virtual {v2}, Lch3/z;->g()V

    new-instance v4, Lch3/w;

    const/4 p1, 0x1

    invoke-direct {v4, v2, p1}, Lch3/w;-><init>(Lxg3/s;I)V

    iget-object v3, v2, Lch3/z;->F:Lxg3/j;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v5, p0, Lch3/a0;->x:J

    iget-object v9, p0, Lch3/a0;->y:Ljava/util/concurrent/TimeUnit;

    move-wide v7, v5

    invoke-static/range {v3 .. v9}, Leh3/m;->a(Lxg3/j;Lbh3/a;JJLjava/util/concurrent/TimeUnit;)Lfh3/a;

    return-object v2
.end method
