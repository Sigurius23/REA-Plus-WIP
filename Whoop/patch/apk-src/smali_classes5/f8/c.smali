.class public final Lf8/c;
.super Lw7/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lf8/c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final x:Landroidx/health/platform/client/proto/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Leq/b;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Leq/b;-><init>(I)V

    sput-object v0, Lf8/c;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroidx/health/platform/client/proto/w0;)V
    .locals 0

    invoke-direct {p0}, Lw7/a;-><init>()V

    iput-object p1, p0, Lf8/c;->x:Landroidx/health/platform/client/proto/w0;

    return-void
.end method


# virtual methods
.method public final b()Landroidx/health/platform/client/proto/a;
    .locals 3

    invoke-static {}, Landroidx/health/platform/client/proto/s2;->r()Landroidx/health/platform/client/proto/r2;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v1, v0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v1, Landroidx/health/platform/client/proto/s2;

    iget-object v2, p0, Lf8/c;->x:Landroidx/health/platform/client/proto/w0;

    invoke-static {v1, v2}, Landroidx/health/platform/client/proto/s2;->p(Landroidx/health/platform/client/proto/s2;Landroidx/health/platform/client/proto/w0;)V

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v0

    check-cast v0, Landroidx/health/platform/client/proto/s2;

    return-object v0
.end method
