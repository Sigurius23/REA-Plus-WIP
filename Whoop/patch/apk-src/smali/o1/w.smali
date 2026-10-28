.class public abstract Lo1/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:Lo1/t;

.field public static final c:F

.field public static final d:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    double-to-float v0, v0

    sput v0, Lo1/w;->a:F

    sget-object v0, Lo1/t;->E:Lo1/t;

    sput-object v0, Lo1/w;->b:Lo1/t;

    const-wide/high16 v0, 0x4020000000000000L    # 8.0

    double-to-float v0, v0

    sput v0, Lo1/w;->c:F

    const-wide/high16 v0, 0x4038000000000000L    # 24.0

    double-to-float v0, v0

    sput v0, Lo1/w;->d:F

    return-void
.end method
