.class public abstract Ll73/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "rx2.scheduler.use-nanotime"

    invoke-static {v0}, Ljava/lang/Boolean;->getBoolean(Ljava/lang/String;)Z

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-string v1, "rx2.scheduler.drift-tolerance"

    const-wide/16 v2, 0xf

    invoke-static {v1, v2, v3}, Ljava/lang/Long;->getLong(Ljava/lang/String;J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    return-void
.end method


# virtual methods
.method public abstract a()Ll73/f;
.end method

.method public b(Lu73/a;)Ln73/b;
    .locals 5

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0}, Ll73/g;->a()Ll73/f;

    move-result-object v1

    new-instance v2, Ll73/e;

    invoke-direct {v2, p1, v1}, Ll73/e;-><init>(Lu73/a;Ll73/f;)V

    const-wide/16 v3, 0x5

    invoke-virtual {v1, v2, v3, v4, v0}, Ll73/f;->a(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ln73/b;

    return-object v2
.end method
