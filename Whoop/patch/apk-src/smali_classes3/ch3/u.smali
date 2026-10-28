.class public final Lch3/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/e;


# instance fields
.field public final w:J

.field public final x:J

.field public final y:Ljava/util/concurrent/TimeUnit;

.field public final z:Lxg3/k;


# direct methods
.method public constructor <init>(JJLjava/util/concurrent/TimeUnit;Lxg3/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lch3/u;->w:J

    iput-wide p3, p0, Lch3/u;->x:J

    iput-object p5, p0, Lch3/u;->y:Ljava/util/concurrent/TimeUnit;

    iput-object p6, p0, Lch3/u;->z:Lxg3/k;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 8

    check-cast p1, Lxg3/s;

    iget-object v0, p0, Lch3/u;->z:Lxg3/k;

    invoke-virtual {v0}, Lxg3/k;->a()Lxg3/j;

    move-result-object v1

    invoke-virtual {p1, v1}, Lxg3/s;->c(Lxg3/t;)V

    new-instance v2, Lch3/t;

    invoke-direct {v2, p1, v1}, Lch3/t;-><init>(Lxg3/s;Lxg3/j;)V

    iget-wide v5, p0, Lch3/u;->x:J

    iget-object v7, p0, Lch3/u;->y:Ljava/util/concurrent/TimeUnit;

    iget-wide v3, p0, Lch3/u;->w:J

    invoke-static/range {v1 .. v7}, Leh3/m;->a(Lxg3/j;Lbh3/a;JJLjava/util/concurrent/TimeUnit;)Lfh3/a;

    return-void
.end method
