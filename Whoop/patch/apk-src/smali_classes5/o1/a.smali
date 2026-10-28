.class public abstract Lo1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lo1/f;->w:Lo1/f;

    sget v0, Lo1/j;->a:F

    sget-object v0, Lo1/t;->w:Lo1/t;

    const-wide/high16 v0, 0x4038000000000000L    # 24.0

    double-to-float v0, v0

    sput v0, Lo1/a;->a:F

    sput v0, Lo1/a;->b:F

    return-void
.end method
