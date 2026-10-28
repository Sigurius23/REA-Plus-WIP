.class public abstract Lo1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:Lo1/t;

.field public static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    double-to-float v0, v0

    sput v0, Lo1/b;->a:F

    sget-object v0, Lo1/t;->E:Lo1/t;

    sput-object v0, Lo1/b;->b:Lo1/t;

    const-wide/high16 v0, 0x4020000000000000L    # 8.0

    double-to-float v0, v0

    sput v0, Lo1/b;->c:F

    return-void
.end method
