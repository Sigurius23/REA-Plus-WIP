.class public final Lb30/z5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb30/a6;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lb30/z5;",
            ">;"
        }
    .end annotation
.end field

.field public static final w:Lb30/z5;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb30/z5;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb30/z5;->w:Lb30/z5;

    new-instance v0, Lb30/w5;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lb30/w5;-><init>(I)V

    sput-object v0, Lb30/z5;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
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
