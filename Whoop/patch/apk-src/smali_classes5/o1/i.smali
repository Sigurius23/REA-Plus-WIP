.class public abstract Lo1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo1/f;

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lo1/f;->J:Lo1/f;

    sput-object v0, Lo1/i;->a:Lo1/f;

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    double-to-float v0, v0

    sput v0, Lo1/i;->b:F

    return-void
.end method
