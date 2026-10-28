.class public final Le8/f;
.super Lw7/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Le8/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final x:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldq/x;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Ldq/x;-><init>(I)V

    sput-object v0, Le8/f;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Lw7/a;-><init>()V

    iput-object p1, p0, Le8/f;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b()Landroidx/health/platform/client/proto/a;
    .locals 3

    invoke-static {}, Landroidx/health/platform/client/proto/o2;->r()Landroidx/health/platform/client/proto/n2;

    move-result-object v0

    iget-object v1, p0, Le8/f;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Iterable;

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v2, v0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v2, Landroidx/health/platform/client/proto/o2;

    invoke-static {v2, v1}, Landroidx/health/platform/client/proto/o2;->p(Landroidx/health/platform/client/proto/o2;Ljava/lang/Iterable;)V

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v0

    check-cast v0, Landroidx/health/platform/client/proto/o2;

    return-object v0
.end method
