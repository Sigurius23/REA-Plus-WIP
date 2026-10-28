.class public final Le8/a;
.super Lw7/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Le8/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldq/x;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Ldq/x;-><init>(I)V

    sput-object v0, Le8/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Lw7/a;-><init>()V

    iput-object p1, p0, Le8/a;->x:Ljava/lang/Object;

    iput-object p2, p0, Le8/a;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b()Landroidx/health/platform/client/proto/a;
    .locals 3

    invoke-static {}, Landroidx/health/platform/client/proto/e2;->t()Landroidx/health/platform/client/proto/d2;

    move-result-object v0

    iget-object v1, p0, Le8/a;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Iterable;

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v2, v0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v2, Landroidx/health/platform/client/proto/e2;

    invoke-static {v2, v1}, Landroidx/health/platform/client/proto/e2;->p(Landroidx/health/platform/client/proto/e2;Ljava/lang/Iterable;)V

    iget-object v1, p0, Le8/a;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Iterable;

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v2, v0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v2, Landroidx/health/platform/client/proto/e2;

    invoke-static {v2, v1}, Landroidx/health/platform/client/proto/e2;->q(Landroidx/health/platform/client/proto/e2;Ljava/lang/Iterable;)V

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v0

    check-cast v0, Landroidx/health/platform/client/proto/e2;

    return-object v0
.end method
