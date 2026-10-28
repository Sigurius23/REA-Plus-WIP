.class public final Lcom/mapbox/maps/ImageHolder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/maps/ImageHolder$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B)\u0008\u0002\u0012\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0010J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010!\u001a\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lcom/mapbox/maps/ImageHolder;",
        "Landroid/os/Parcelable;",
        "",
        "drawableId",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "Lcom/mapbox/maps/Image;",
        "image",
        "<init>",
        "(Ljava/lang/Integer;Landroid/graphics/Bitmap;Lcom/mapbox/maps/Image;)V",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "()I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "describeContents",
        "Landroid/os/Parcel;",
        "parcel",
        "flags",
        "Ll83/a0;",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "Ljava/lang/Integer;",
        "getDrawableId",
        "()Ljava/lang/Integer;",
        "Landroid/graphics/Bitmap;",
        "getBitmap",
        "()Landroid/graphics/Bitmap;",
        "Lcom/mapbox/maps/Image;",
        "getImage",
        "()Lcom/mapbox/maps/Image;",
        "Companion",
        "sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/mapbox/maps/ImageHolder;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/mapbox/maps/ImageHolder$Companion;


# instance fields
.field private final bitmap:Landroid/graphics/Bitmap;

.field private final drawableId:Ljava/lang/Integer;

.field private final image:Lcom/mapbox/maps/Image;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/maps/ImageHolder$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/maps/ImageHolder$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/maps/ImageHolder;->Companion:Lcom/mapbox/maps/ImageHolder$Companion;

    new-instance v0, Lcom/mapbox/maps/ImageHolder$Creator;

    invoke-direct {v0}, Lcom/mapbox/maps/ImageHolder$Creator;-><init>()V

    sput-object v0, Lcom/mapbox/maps/ImageHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Integer;Landroid/graphics/Bitmap;Lcom/mapbox/maps/Image;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/mapbox/maps/ImageHolder;->drawableId:Ljava/lang/Integer;

    .line 4
    iput-object p2, p0, Lcom/mapbox/maps/ImageHolder;->bitmap:Landroid/graphics/Bitmap;

    .line 5
    iput-object p3, p0, Lcom/mapbox/maps/ImageHolder;->image:Lcom/mapbox/maps/Image;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Integer;Landroid/graphics/Bitmap;Lcom/mapbox/maps/Image;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/mapbox/maps/ImageHolder;-><init>(Ljava/lang/Integer;Landroid/graphics/Bitmap;Lcom/mapbox/maps/Image;)V

    return-void
.end method

.method public static final from(I)Lcom/mapbox/maps/ImageHolder;
    .locals 1

    .line 1
    sget-object v0, Lcom/mapbox/maps/ImageHolder;->Companion:Lcom/mapbox/maps/ImageHolder$Companion;

    invoke-virtual {v0, p0}, Lcom/mapbox/maps/ImageHolder$Companion;->from(I)Lcom/mapbox/maps/ImageHolder;

    move-result-object p0

    return-object p0
.end method

.method public static final from(Landroid/graphics/Bitmap;)Lcom/mapbox/maps/ImageHolder;
    .locals 1

    .line 2
    sget-object v0, Lcom/mapbox/maps/ImageHolder;->Companion:Lcom/mapbox/maps/ImageHolder$Companion;

    invoke-virtual {v0, p0}, Lcom/mapbox/maps/ImageHolder$Companion;->from(Landroid/graphics/Bitmap;)Lcom/mapbox/maps/ImageHolder;

    move-result-object p0

    return-object p0
.end method

.method public static final from(Lcom/mapbox/maps/Image;)Lcom/mapbox/maps/ImageHolder;
    .locals 1

    .line 3
    sget-object v0, Lcom/mapbox/maps/ImageHolder;->Companion:Lcom/mapbox/maps/ImageHolder$Companion;

    invoke-virtual {v0, p0}, Lcom/mapbox/maps/ImageHolder$Companion;->from(Lcom/mapbox/maps/Image;)Lcom/mapbox/maps/ImageHolder;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    const-class v2, Lcom/mapbox/maps/ImageHolder;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const-string v1, "null cannot be cast to non-null type com.mapbox.maps.ImageHolder"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/mapbox/maps/ImageHolder;

    iget-object v1, p0, Lcom/mapbox/maps/ImageHolder;->drawableId:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/mapbox/maps/ImageHolder;->drawableId:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/mapbox/maps/ImageHolder;->bitmap:Landroid/graphics/Bitmap;

    iget-object v3, p1, Lcom/mapbox/maps/ImageHolder;->bitmap:Landroid/graphics/Bitmap;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/mapbox/maps/ImageHolder;->image:Lcom/mapbox/maps/Image;

    iget-object p1, p1, Lcom/mapbox/maps/ImageHolder;->image:Lcom/mapbox/maps/Image;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v0

    :cond_3
    return v2
.end method

.method public final getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/ImageHolder;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final getDrawableId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/ImageHolder;->drawableId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getImage()Lcom/mapbox/maps/Image;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/ImageHolder;->image:Lcom/mapbox/maps/Image;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/mapbox/maps/ImageHolder;->drawableId:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/mapbox/maps/ImageHolder;->bitmap:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/mapbox/maps/ImageHolder;->image:Lcom/mapbox/maps/Image;

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ImageHolder(bitmap="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mapbox/maps/ImageHolder;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", drawableId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mapbox/maps/ImageHolder;->drawableId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", image="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mapbox/maps/ImageHolder;->image:Lcom/mapbox/maps/Image;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/ImageHolder;->drawableId:Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_0
    iget-object v0, p0, Lcom/mapbox/maps/ImageHolder;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/mapbox/maps/ImageHolder;->image:Lcom/mapbox/maps/Image;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    return-void
.end method
