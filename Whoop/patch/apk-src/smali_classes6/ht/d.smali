.class public final synthetic Lht/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lht/h;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:Ljava/util/concurrent/TimeUnit;

.field public final synthetic w:I

.field public final synthetic x:Lht/g;

.field public final synthetic y:Ljava/lang/Runnable;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Lht/g;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;I)V
    .locals 0

    iput p8, p0, Lht/d;->w:I

    iput-object p1, p0, Lht/d;->x:Lht/g;

    iput-object p2, p0, Lht/d;->y:Ljava/lang/Runnable;

    iput-wide p3, p0, Lht/d;->z:J

    iput-wide p5, p0, Lht/d;->E:J

    iput-object p7, p0, Lht/d;->F:Ljava/util/concurrent/TimeUnit;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lhm/d;)Ljava/util/concurrent/ScheduledFuture;
    .locals 8

    iget v0, p0, Lht/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lht/d;->x:Lht/g;

    iget-object v1, v0, Lht/g;->x:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lht/e;

    const/4 v3, 0x2

    iget-object v4, p0, Lht/d;->y:Ljava/lang/Runnable;

    invoke-direct {v2, v0, v4, p1, v3}, Lht/e;-><init>(Lht/g;Ljava/lang/Runnable;Lhm/d;I)V

    iget-wide v3, p0, Lht/d;->z:J

    iget-wide v5, p0, Lht/d;->E:J

    iget-object v7, p0, Lht/d;->F:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lht/d;->x:Lht/g;

    iget-object v1, v0, Lht/g;->x:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lht/e;

    const/4 v3, 0x0

    iget-object v4, p0, Lht/d;->y:Ljava/lang/Runnable;

    invoke-direct {v2, v0, v4, p1, v3}, Lht/e;-><init>(Lht/g;Ljava/lang/Runnable;Lhm/d;I)V

    iget-wide v3, p0, Lht/d;->z:J

    iget-wide v5, p0, Lht/d;->E:J

    iget-object v7, p0, Lht/d;->F:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
