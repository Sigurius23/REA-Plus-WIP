.class public abstract Lg1/e2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld0/e2;

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ld0/e2;

    const/4 v1, 0x0

    const/4 v2, 0x6

    const/16 v3, 0x100

    invoke-direct {v0, v3, v1, v2}, Ld0/e2;-><init>(ILd0/z;I)V

    sput-object v0, Lg1/e2;->a:Ld0/e2;

    const/16 v0, 0x10

    int-to-float v0, v0

    sput v0, Lg1/e2;->b:F

    return-void
.end method
