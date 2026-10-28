.class public final Ldq/r;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ldq/r;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public w:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lay/b;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lay/b;-><init>(I)V

    sput-object v0, Ldq/r;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const/16 p2, 0x4f45

    invoke-static {p1, p2}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result p2

    const/4 v0, 0x1

    iget-object v1, p0, Ldq/r;->w:Ljava/util/ArrayList;

    invoke-static {p1, v0, v1}, Lvo/c;->o(Landroid/os/Parcel;ILjava/util/List;)V

    invoke-static {p1, p2}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
