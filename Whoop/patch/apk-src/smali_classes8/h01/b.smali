.class public abstract Lh01/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "Li2/x;",
        "a",
        "J",
        "defaultBackgroundFillColor",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, 0xff202528L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Lh01/b;->a:J

    return-void
.end method

.method public static final synthetic a()J
    .locals 2

    sget-wide v0, Lh01/b;->a:J

    return-wide v0
.end method
