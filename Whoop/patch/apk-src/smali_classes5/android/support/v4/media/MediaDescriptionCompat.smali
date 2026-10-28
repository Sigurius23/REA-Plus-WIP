.class public final Landroid/support/v4/media/MediaDescriptionCompat;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "BanParcelableUsage"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroid/support/v4/media/MediaDescriptionCompat;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Landroid/graphics/Bitmap;

.field public final F:Landroid/net/Uri;

.field public final G:Landroid/os/Bundle;

.field public final H:Landroid/net/Uri;

.field public I:Landroid/media/MediaDescription;

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/CharSequence;

.field public final y:Ljava/lang/CharSequence;

.field public final z:Ljava/lang/CharSequence;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La10/a;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, La10/a;-><init>(I)V

    sput-object v0, Landroid/support/v4/media/MediaDescriptionCompat;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/os/Bundle;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->w:Ljava/lang/String;

    iput-object p2, p0, Landroid/support/v4/media/MediaDescriptionCompat;->x:Ljava/lang/CharSequence;

    iput-object p3, p0, Landroid/support/v4/media/MediaDescriptionCompat;->y:Ljava/lang/CharSequence;

    iput-object p4, p0, Landroid/support/v4/media/MediaDescriptionCompat;->z:Ljava/lang/CharSequence;

    iput-object p5, p0, Landroid/support/v4/media/MediaDescriptionCompat;->E:Landroid/graphics/Bitmap;

    iput-object p6, p0, Landroid/support/v4/media/MediaDescriptionCompat;->F:Landroid/net/Uri;

    iput-object p7, p0, Landroid/support/v4/media/MediaDescriptionCompat;->G:Landroid/os/Bundle;

    iput-object p8, p0, Landroid/support/v4/media/MediaDescriptionCompat;->H:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->x:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroid/support/v4/media/MediaDescriptionCompat;->y:Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->z:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget-object v0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->I:Landroid/media/MediaDescription;

    if-nez v0, :cond_0

    invoke-static {}, Landroid/support/v4/media/a;->b()Landroid/media/MediaDescription$Builder;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->w:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/support/v4/media/a;->n(Landroid/media/MediaDescription$Builder;Ljava/lang/String;)V

    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->x:Ljava/lang/CharSequence;

    invoke-static {v0, v1}, Landroid/support/v4/media/a;->p(Landroid/media/MediaDescription$Builder;Ljava/lang/CharSequence;)V

    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->y:Ljava/lang/CharSequence;

    invoke-static {v0, v1}, Landroid/support/v4/media/a;->o(Landroid/media/MediaDescription$Builder;Ljava/lang/CharSequence;)V

    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->z:Ljava/lang/CharSequence;

    invoke-static {v0, v1}, Landroid/support/v4/media/a;->j(Landroid/media/MediaDescription$Builder;Ljava/lang/CharSequence;)V

    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->E:Landroid/graphics/Bitmap;

    invoke-static {v0, v1}, Landroid/support/v4/media/a;->l(Landroid/media/MediaDescription$Builder;Landroid/graphics/Bitmap;)V

    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->F:Landroid/net/Uri;

    invoke-static {v0, v1}, Landroid/support/v4/media/a;->m(Landroid/media/MediaDescription$Builder;Landroid/net/Uri;)V

    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->G:Landroid/os/Bundle;

    invoke-static {v0, v1}, Landroid/support/v4/media/a;->k(Landroid/media/MediaDescription$Builder;Landroid/os/Bundle;)V

    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->H:Landroid/net/Uri;

    invoke-static {v0, v1}, Landroid/support/v4/media/b;->b(Landroid/media/MediaDescription$Builder;Landroid/net/Uri;)V

    invoke-static {v0}, Landroid/support/v4/media/a;->a(Landroid/media/MediaDescription$Builder;)Landroid/media/MediaDescription;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->I:Landroid/media/MediaDescription;

    :cond_0
    invoke-virtual {v0, p1, p2}, Landroid/media/MediaDescription;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
