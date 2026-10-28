.class public abstract Lg1/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:Ll0/l1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x4

    int-to-float v0, v0

    sput v0, Lg1/g0;->a:F

    sget v0, Lg1/n0;->b:F

    const/4 v1, 0x0

    const/16 v2, 0xa

    invoke-static {v0, v1, v0, v1, v2}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    move-result-object v0

    sput-object v0, Lg1/g0;->b:Ll0/l1;

    return-void
.end method
