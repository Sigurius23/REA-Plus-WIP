.class public abstract Lg1/d7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld0/i1;

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ld0/i1;

    const/4 v1, 0x0

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Ld0/i1;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lg1/d7;->a:Ld0/i1;

    const/16 v0, 0x7d

    int-to-float v0, v0

    sput v0, Lg1/d7;->b:F

    return-void
.end method
