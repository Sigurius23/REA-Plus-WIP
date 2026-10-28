.class public abstract Lg1/r3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:Ld0/e2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x10

    int-to-float v0, v0

    sput v0, Lg1/r3;->a:F

    sget-object v0, Ld0/b0;->a:Ld0/v;

    const/4 v1, 0x2

    const/16 v2, 0x12c

    const/4 v3, 0x0

    invoke-static {v2, v3, v0, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    sput-object v0, Lg1/r3;->b:Ld0/e2;

    return-void
.end method
