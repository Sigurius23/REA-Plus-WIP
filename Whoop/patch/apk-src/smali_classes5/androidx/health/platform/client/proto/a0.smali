.class public abstract Landroidx/health/platform/client/proto/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/health/platform/client/proto/i1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Landroidx/health/platform/client/proto/v3;->y:Landroidx/health/platform/client/proto/r3;

    sget-object v1, Landroidx/health/platform/client/proto/v3;->E:Landroidx/health/platform/client/proto/t3;

    invoke-static {}, Landroidx/health/platform/client/proto/g0;->v()Landroidx/health/platform/client/proto/g0;

    move-result-object v2

    new-instance v3, Landroidx/health/platform/client/proto/i1;

    invoke-direct {v3, v0, v1, v2}, Landroidx/health/platform/client/proto/i1;-><init>(Landroidx/health/platform/client/proto/v3;Landroidx/health/platform/client/proto/v3;Landroidx/health/platform/client/proto/u0;)V

    sput-object v3, Landroidx/health/platform/client/proto/a0;->a:Landroidx/health/platform/client/proto/i1;

    return-void
.end method
