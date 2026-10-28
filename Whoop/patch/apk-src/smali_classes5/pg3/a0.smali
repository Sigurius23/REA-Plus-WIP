.class public final Lpg3/a0;
.super Lud3/a1;
.source "SourceFile"


# instance fields
.field public final y:Lud3/h0;

.field public final z:J


# direct methods
.method public constructor <init>(Lud3/h0;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpg3/a0;->y:Lud3/h0;

    iput-wide p2, p0, Lpg3/a0;->z:J

    return-void
.end method


# virtual methods
.method public final d1()Lne3/j;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot read raw response body of a converted body."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final i()J
    .locals 2

    iget-wide v0, p0, Lpg3/a0;->z:J

    return-wide v0
.end method

.method public final k()Lud3/h0;
    .locals 1

    iget-object v0, p0, Lpg3/a0;->y:Lud3/h0;

    return-object v0
.end method
