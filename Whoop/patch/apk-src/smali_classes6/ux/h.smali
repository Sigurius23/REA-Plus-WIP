.class public final Lux/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lux/b;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lux/h;",
            ">;"
        }
    .end annotation
.end field

.field public static final w:Lux/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lux/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lux/h;->w:Lux/h;

    new-instance v0, Lux/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lux/g;-><init>(I)V

    sput-object v0, Lux/h;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final bridge synthetic A()Ljava/lang/Integer;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final F(Ly00/j;)Z
    .locals 1

    const-string v0, "cardFunding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
