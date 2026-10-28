.class public final Landroidx/health/platform/client/exerciseroute/ExerciseRoute;
.super Lw7/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lw7/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Landroidx/health/platform/client/exerciseroute/ExerciseRoute;",
        "Lw7/a;",
        "Landroidx/health/platform/client/proto/r;",
        "connect-client_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/health/platform/client/exerciseroute/ExerciseRoute;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final x:Landroidx/health/platform/client/proto/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsp/e;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lsp/e;-><init>(I)V

    sput-object v0, Landroidx/health/platform/client/exerciseroute/ExerciseRoute;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroidx/health/platform/client/proto/r;)V
    .locals 0

    invoke-direct {p0}, Lw7/a;-><init>()V

    iput-object p1, p0, Landroidx/health/platform/client/exerciseroute/ExerciseRoute;->x:Landroidx/health/platform/client/proto/r;

    return-void
.end method


# virtual methods
.method public final b()Landroidx/health/platform/client/proto/a;
    .locals 1

    iget-object v0, p0, Landroidx/health/platform/client/exerciseroute/ExerciseRoute;->x:Landroidx/health/platform/client/proto/r;

    return-object v0
.end method
