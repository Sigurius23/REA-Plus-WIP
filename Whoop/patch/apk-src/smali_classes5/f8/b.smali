.class public final Lf8/b;
.super Lw7/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lf8/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final x:Landroidx/health/platform/client/proto/q2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Leq/b;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Leq/b;-><init>(I)V

    sput-object v0, Lf8/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroidx/health/platform/client/proto/q2;)V
    .locals 0

    invoke-direct {p0}, Lw7/a;-><init>()V

    iput-object p1, p0, Lf8/b;->x:Landroidx/health/platform/client/proto/q2;

    return-void
.end method


# virtual methods
.method public final b()Landroidx/health/platform/client/proto/a;
    .locals 1

    iget-object v0, p0, Lf8/b;->x:Landroidx/health/platform/client/proto/q2;

    return-object v0
.end method
