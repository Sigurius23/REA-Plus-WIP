.class public Lfk2/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfk2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:J

.field private b:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lfk2/a$b;->a:J

    iput-wide p3, p0, Lfk2/a$b;->b:J

    return-void
.end method

.method public static bridge synthetic a(Lfk2/a$b;)J
    .locals 2

    iget-wide v0, p0, Lfk2/a$b;->a:J

    return-wide v0
.end method

.method public static bridge synthetic b(Lfk2/a$b;)J
    .locals 2

    iget-wide v0, p0, Lfk2/a$b;->b:J

    return-wide v0
.end method

.method public static bridge synthetic c(Lfk2/a$b;J)V
    .locals 0

    iput-wide p1, p0, Lfk2/a$b;->a:J

    return-void
.end method

.method public static bridge synthetic d(Lfk2/a$b;J)V
    .locals 0

    iput-wide p1, p0, Lfk2/a$b;->b:J

    return-void
.end method


# virtual methods
.method public e()V
    .locals 8

    iget-wide v0, p0, Lfk2/a$b;->b:J

    const-wide/32 v2, 0x8000

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    iget-wide v4, p0, Lfk2/a$b;->a:J

    long-to-double v4, v4

    long-to-double v0, v0

    const-wide/high16 v6, 0x40e0000000000000L    # 32768.0

    div-double/2addr v0, v6

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    add-double/2addr v0, v4

    double-to-long v0, v0

    iput-wide v0, p0, Lfk2/a$b;->a:J

    iget-wide v0, p0, Lfk2/a$b;->b:J

    rem-long/2addr v0, v2

    iput-wide v0, p0, Lfk2/a$b;->b:J

    :cond_0
    return-void
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Lfk2/a$b;->a:J

    return-wide v0
.end method

.method public g()J
    .locals 2

    iget-wide v0, p0, Lfk2/a$b;->b:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "seconds="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lfk2/a$b;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", sub-seconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lfk2/a$b;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
