.class public final Lux/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lux/a;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lux/f;",
            ">;"
        }
    .end annotation
.end field

.field public static final w:Lux/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lux/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lux/f;->w:Lux/f;

    new-instance v0, Lsp/e;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lsp/e;-><init>(I)V

    sput-object v0, Lux/f;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final l0(Ly00/o4;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final o(Ly00/i;)Z
    .locals 1

    const-string v0, "cardBrand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
