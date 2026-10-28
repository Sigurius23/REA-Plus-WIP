.class public final Lf9/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:J

.field public c:J

.field public d:F

.field public e:F


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lf9/t;->a:J

    iput-wide v0, p0, Lf9/t;->b:J

    iput-wide v0, p0, Lf9/t;->c:J

    const v0, -0x800001

    iput v0, p0, Lf9/t;->d:F

    iput v0, p0, Lf9/t;->e:F

    return-void
.end method


# virtual methods
.method public a()Lrm/h0;
    .locals 9

    new-instance v0, Lrm/h0;

    iget-wide v1, p0, Lf9/t;->a:J

    iget-wide v3, p0, Lf9/t;->b:J

    iget-wide v5, p0, Lf9/t;->c:J

    iget v7, p0, Lf9/t;->d:F

    iget v8, p0, Lf9/t;->e:F

    invoke-direct/range {v0 .. v8}, Lrm/h0;-><init>(JJJFF)V

    return-object v0
.end method

.method public b()Lu8/t;
    .locals 1

    new-instance v0, Lu8/t;

    invoke-direct {v0, p0}, Lu8/t;-><init>(Lf9/t;)V

    return-object v0
.end method
