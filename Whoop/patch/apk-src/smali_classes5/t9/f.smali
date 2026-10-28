.class public final Lt9/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lt9/f;


# instance fields
.field public final a:I

.field public final b:J

.field public final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lt9/f;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v4, -0x1

    const/4 v1, -0x3

    invoke-direct/range {v0 .. v5}, Lt9/f;-><init>(IJJ)V

    sput-object v0, Lt9/f;->d:Lt9/f;

    return-void
.end method

.method public constructor <init>(IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lt9/f;->a:I

    iput-wide p2, p0, Lt9/f;->b:J

    iput-wide p4, p0, Lt9/f;->c:J

    return-void
.end method
