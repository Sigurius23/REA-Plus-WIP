.class public final Lcom/whoop/community/data/network/ChatUnreadCountDto$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/community/data/network/ChatUnreadCountDto;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/whoop/community/data/network/ChatUnreadCountDto;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Parcel;)Lcom/whoop/community/data/network/ChatUnreadCountDto;
    .locals 1

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/community/data/network/ChatUnreadCountDto;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-direct {v0, p1}, Lcom/whoop/community/data/network/ChatUnreadCountDto;-><init>(I)V

    return-object v0
.end method

.method public final b(I)[Lcom/whoop/community/data/network/ChatUnreadCountDto;
    .locals 0

    new-array p1, p1, [Lcom/whoop/community/data/network/ChatUnreadCountDto;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/whoop/community/data/network/ChatUnreadCountDto$b;->a(Landroid/os/Parcel;)Lcom/whoop/community/data/network/ChatUnreadCountDto;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/whoop/community/data/network/ChatUnreadCountDto$b;->b(I)[Lcom/whoop/community/data/network/ChatUnreadCountDto;

    move-result-object p1

    return-object p1
.end method
