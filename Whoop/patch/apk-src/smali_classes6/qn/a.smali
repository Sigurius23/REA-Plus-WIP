.class public final Lqn/a;
.super Lln/b;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lqn/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq30/j0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lq30/j0;-><init>(I)V

    sput-object v0, Lqn/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method
