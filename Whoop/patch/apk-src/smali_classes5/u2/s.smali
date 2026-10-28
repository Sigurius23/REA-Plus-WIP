.class public final Lu2/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Z


# direct methods
.method public constructor <init>(JZJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lu2/s;->a:J

    iput-wide p4, p0, Lu2/s;->b:J

    iput-boolean p3, p0, Lu2/s;->c:Z

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lu2/s;->c:Z

    return v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lu2/s;->b:J

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lu2/s;->a:J

    return-wide v0
.end method
