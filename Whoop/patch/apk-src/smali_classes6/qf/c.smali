.class public final Lqf/c;
.super Lyf/s;
.source "SourceFile"

# interfaces
.implements Lpf/a;


# instance fields
.field public final y:Lpf/a;


# direct methods
.method public constructor <init>(Lpf/a;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lyf/s;-><init>(Ljava/io/Closeable;)V

    iput-object p1, p0, Lqf/c;->y:Lpf/a;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-object v0, p0, Lqf/c;->y:Lpf/a;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final getConfig()Lpf/i;
    .locals 1

    iget-object v0, p0, Lqf/c;->y:Lpf/a;

    invoke-interface {v0}, Lpf/a;->getConfig()Lpf/i;

    move-result-object v0

    return-object v0
.end method

.method public final getCoroutineContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lqf/c;->y:Lpf/a;

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    return-object v0
.end method

.method public final z0(Ldg/a;Lvf/h;Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lqf/c;->y:Lpf/a;

    invoke-interface {v0, p1, p2, p3}, Lpf/a;->z0(Ldg/a;Lvf/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
