.class public final Lch3/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/a;


# instance fields
.field public w:J

.field public final synthetic x:Lxg3/s;

.field public final synthetic y:Lxg3/j;


# direct methods
.method public constructor <init>(Lxg3/s;Lxg3/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch3/t;->x:Lxg3/s;

    iput-object p2, p0, Lch3/t;->y:Lxg3/j;

    return-void
.end method


# virtual methods
.method public final call()V
    .locals 5

    iget-object v0, p0, Lch3/t;->x:Lxg3/s;

    :try_start_0
    iget-wide v1, p0, Lch3/t;->w:J

    const-wide/16 v3, 0x1

    add-long/2addr v3, v1

    iput-wide v3, p0, Lch3/t;->w:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Lxg3/h;->onNext(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    iget-object v2, p0, Lch3/t;->y:Lxg3/j;

    invoke-interface {v2}, Lxg3/t;->b()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-static {v1, v0}, Ldt/b;->W(Ljava/lang/Throwable;Lxg3/h;)V

    return-void

    :catchall_1
    move-exception v2

    invoke-static {v1, v0}, Ldt/b;->W(Ljava/lang/Throwable;Lxg3/h;)V

    throw v2
.end method
