.class public abstract Lo1/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo1/t;

.field public static final b:Lo1/f;

.field public static final c:F

.field public static final d:F

.field public static final e:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lo1/f;->Q:Lo1/f;

    sget-object v0, Lo1/t;->x:Lo1/t;

    sput-object v0, Lo1/v;->a:Lo1/t;

    sget-object v0, Lo1/f;->H:Lo1/f;

    sput-object v0, Lo1/v;->b:Lo1/f;

    const-wide/high16 v0, 0x4010000000000000L    # 4.0

    double-to-float v0, v0

    sput v0, Lo1/v;->c:F

    const-wide/high16 v0, 0x4040000000000000L    # 32.0

    double-to-float v0, v0

    sput v0, Lo1/v;->d:F

    sget v0, Lo1/j;->b:F

    sput v0, Lo1/v;->e:F

    return-void
.end method
