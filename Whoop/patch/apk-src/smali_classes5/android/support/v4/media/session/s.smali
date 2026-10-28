.class public final Landroid/support/v4/media/session/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:I

.field public c:J

.field public d:F

.field public e:J

.field public final f:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/media/session/s;->a:Ljava/util/ArrayList;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Landroid/support/v4/media/session/s;->f:J

    return-void
.end method
