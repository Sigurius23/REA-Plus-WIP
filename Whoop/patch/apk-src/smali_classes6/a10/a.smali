.class public final La10/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, La10/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, La10/a;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move v3, v2

    move-object v2, v1

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v0, :cond_3

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    const/4 v6, 0x1

    if-eq v5, v6, :cond_2

    const/4 v6, 0x2

    if-eq v5, v6, :cond_1

    const/4 v6, 0x3

    if-eq v5, v6, :cond_0

    invoke-static {p1, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    sget-object v2, Luo/t;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v4, v2}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Luo/t;

    goto :goto_0

    :cond_1
    sget-object v1, Lcom/google/android/gms/common/a;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v4, v1}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/common/a;

    goto :goto_0

    :cond_2
    invoke-static {p1, v4}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v3

    goto :goto_0

    :cond_3
    invoke-static {p1, v0}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance p1, Laq/f;

    invoke-direct {p1, v3, v1, v2}, Laq/f;-><init>(ILcom/google/android/gms/common/a;Luo/t;)V

    return-object p1

    :pswitch_0
    invoke-static {p1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    move-object v2, v1

    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v0, :cond_6

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    const/4 v5, 0x1

    if-eq v4, v5, :cond_5

    const/4 v5, 0x2

    if-eq v4, v5, :cond_4

    invoke-static {p1, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_1

    :cond_4
    invoke-static {p1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_5
    invoke-static {p1, v3}, Lvo/b;->j(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    move-result-object v1

    goto :goto_1

    :cond_6
    invoke-static {p1, v0}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance p1, Laq/e;

    invoke-direct {p1, v2, v1}, Laq/e;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object p1

    :pswitch_1
    invoke-static {p1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move v3, v2

    :goto_2
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v0, :cond_a

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    const/4 v6, 0x1

    if-eq v5, v6, :cond_9

    const/4 v6, 0x2

    if-eq v5, v6, :cond_8

    const/4 v6, 0x3

    if-eq v5, v6, :cond_7

    invoke-static {p1, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_2

    :cond_7
    sget-object v1, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v4, v1}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/content/Intent;

    goto :goto_2

    :cond_8
    invoke-static {p1, v4}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v3

    goto :goto_2

    :cond_9
    invoke-static {p1, v4}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v2

    goto :goto_2

    :cond_a
    invoke-static {p1, v0}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance p1, Laq/b;

    invoke-direct {p1, v2, v3, v1}, Laq/b;-><init>(IILandroid/content/Intent;)V

    return-object p1

    :pswitch_2
    new-instance v0, Landroidx/fragment/app/i1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Landroidx/fragment/app/i1;->w:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, v0, Landroidx/fragment/app/i1;->x:I

    return-object v0

    :pswitch_3
    new-instance v0, Landroidx/fragment/app/c;

    invoke-direct {v0, p1}, Landroidx/fragment/app/c;-><init>(Landroid/os/Parcel;)V

    return-object v0

    :pswitch_4
    new-instance v0, Landroidx/fragment/app/b;

    invoke-direct {v0, p1}, Landroidx/fragment/app/b;-><init>(Landroid/os/Parcel;)V

    return-object v0

    :pswitch_5
    new-instance v0, Landroid/support/v4/media/RatingCompat;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result p1

    invoke-direct {v0, v1, p1}, Landroid/support/v4/media/RatingCompat;-><init>(IF)V

    return-object v0

    :pswitch_6
    new-instance v0, Landroid/support/v4/media/MediaMetadataCompat;

    invoke-direct {v0, p1}, Landroid/support/v4/media/MediaMetadataCompat;-><init>(Landroid/os/Parcel;)V

    return-object v0

    :pswitch_7
    sget-object v0, Landroid/media/MediaDescription;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_10

    check-cast p1, Landroid/media/MediaDescription;

    invoke-static {p1}, Landroid/support/v4/media/a;->g(Landroid/media/MediaDescription;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Landroid/support/v4/media/a;->i(Landroid/media/MediaDescription;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-static {p1}, Landroid/support/v4/media/a;->h(Landroid/media/MediaDescription;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {p1}, Landroid/support/v4/media/a;->c(Landroid/media/MediaDescription;)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-static {p1}, Landroid/support/v4/media/a;->e(Landroid/media/MediaDescription;)Landroid/graphics/Bitmap;

    move-result-object v6

    invoke-static {p1}, Landroid/support/v4/media/a;->f(Landroid/media/MediaDescription;)Landroid/net/Uri;

    move-result-object v7

    invoke-static {p1}, Landroid/support/v4/media/a;->d(Landroid/media/MediaDescription;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-static {v1}, Landroid/support/v4/media/session/p;->d(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v1

    :cond_b
    const-string v8, "android.support.v4.media.description.MEDIA_URI"

    if-eqz v1, :cond_c

    invoke-virtual {v1, v8}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v9

    check-cast v9, Landroid/net/Uri;

    goto :goto_3

    :cond_c
    move-object v9, v0

    :goto_3
    if-eqz v9, :cond_e

    const-string v10, "android.support.v4.media.description.NULL_BUNDLE_FLAG"

    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_d

    invoke-virtual {v1}, Landroid/os/BaseBundle;->size()I

    move-result v11

    const/4 v12, 0x2

    if-ne v11, v12, :cond_d

    move-object v8, v0

    goto :goto_4

    :cond_d
    invoke-virtual {v1, v8}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    invoke-virtual {v1, v10}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    :cond_e
    move-object v8, v1

    :goto_4
    if-eqz v9, :cond_f

    goto :goto_5

    :cond_f
    invoke-static {p1}, Landroid/support/v4/media/b;->a(Landroid/media/MediaDescription;)Landroid/net/Uri;

    move-result-object v9

    :goto_5
    new-instance v1, Landroid/support/v4/media/MediaDescriptionCompat;

    invoke-direct/range {v1 .. v9}, Landroid/support/v4/media/MediaDescriptionCompat;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/os/Bundle;Landroid/net/Uri;)V

    iput-object p1, v1, Landroid/support/v4/media/MediaDescriptionCompat;->I:Landroid/media/MediaDescription;

    move-object v0, v1

    :cond_10
    return-object v0

    :pswitch_8
    new-instance v0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    invoke-direct {v0, p1}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;-><init>(Landroid/os/Parcel;)V

    return-object v0

    :pswitch_9
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, La30/f1;

    const-class v0, La30/f1;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lmy/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, La30/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {p1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lq20/y;

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v5

    check-cast v5, La30/e1;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lv00/c0;

    invoke-direct/range {v1 .. v6}, La30/f1;-><init>(Lmy/a;La30/a;Lq20/y;La30/e1;Lv00/c0;)V

    return-object v1

    :pswitch_a
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, La30/v0;

    const-class v0, La30/v0;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lmy/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, La30/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lq20/y;

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, La30/e1;

    sget-object v0, Lv00/c0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lv00/c0;

    invoke-direct/range {v1 .. v6}, La30/v0;-><init>(Lmy/a;La30/a;Lq20/y;La30/e1;Lv00/c0;)V

    return-object v1

    :pswitch_b
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La30/s0;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, La30/s0;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_c
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La30/r0;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, La30/r0;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_d
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La30/q0;

    sget-object v1, Lh20/u2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh20/u2;

    invoke-direct {v0, p1}, La30/q0;-><init>(Lh20/u2;)V

    return-object v0

    :pswitch_e
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    sget-object p1, La30/p0;->w:La30/p0;

    return-object p1

    :pswitch_f
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La30/o0;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, La30/o0;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_10
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La30/l0;

    sget-object v1, Lwz/g0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwz/g0;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, La30/k0;->valueOf(Ljava/lang/String;)La30/k0;

    move-result-object v2

    const-class v3, La30/l0;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, La30/j0;

    invoke-direct {v0, v1, v2, p1}, La30/l0;-><init>(Lwz/g0;La30/k0;La30/j0;)V

    return-object v0

    :pswitch_11
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La30/i0;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lj00/d0;->valueOf(Ljava/lang/String;)Lj00/d0;

    move-result-object p1

    invoke-direct {v0, p1}, La30/i0;-><init>(Lj00/d0;)V

    return-object v0

    :pswitch_12
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_6
    if-eq v2, v0, :cond_11

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ly00/t2;->valueOf(Ljava/lang/String;)Ly00/t2;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_11
    new-instance p1, La30/h0;

    invoke-direct {p1, v1}, La30/h0;-><init>(Ljava/util/AbstractList;)V

    return-object p1

    :pswitch_13
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    sget-object p1, La30/g0;->w:La30/g0;

    return-object p1

    :pswitch_14
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_7
    if-eq v2, v0, :cond_12

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ly00/o2;->valueOf(Ljava/lang/String;)Ly00/o2;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_12
    new-instance p1, La30/f0;

    invoke-direct {p1, v1}, La30/f0;-><init>(Ljava/util/AbstractList;)V

    return-object p1

    :pswitch_15
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_8
    if-eq v2, v0, :cond_13

    const-class v3, La30/a;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_13
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, La30/a;

    invoke-direct {v0, v1, p1}, La30/a;-><init>(Ljava/util/List;Ljava/lang/String;)V

    return-object v0

    :pswitch_16
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, La10/i;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_14

    move-object v0, v2

    goto :goto_9

    :cond_14
    sget-object v0, Ly00/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    :goto_9
    check-cast v0, Ly00/c;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-nez v5, :cond_15

    goto :goto_a

    :cond_15
    sget-object v2, Ly00/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    :goto_a
    move-object v5, v2

    check-cast v5, Ly00/c;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, La10/i;-><init>(Ly00/c;Ljava/lang/String;Ljava/lang/String;Ly00/c;Ljava/lang/String;)V

    return-object v1

    :pswitch_17
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La10/g;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, La10/g;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_18
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La10/f;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_16

    move-object v1, v2

    goto :goto_b

    :cond_16
    sget-object v1, Ly00/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    :goto_b
    check-cast v1, Ly00/c;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-nez v5, :cond_17

    goto :goto_c

    :cond_17
    sget-object v2, Ly00/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    :goto_c
    check-cast v2, Ly00/c;

    invoke-direct {v0, v1, v3, v4, v2}, La10/f;-><init>(Ly00/c;Ljava/lang/String;Ljava/lang/String;Ly00/c;)V

    return-object v0

    :pswitch_19
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La10/e;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, La10/e;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_1a
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La10/d;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, La10/d;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_1b
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La10/c;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, La10/c;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_1c
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La10/b;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, La10/b;-><init>(Ljava/lang/String;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, La10/a;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Laq/f;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Laq/e;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Laq/b;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Landroidx/fragment/app/i1;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Landroidx/fragment/app/c;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Landroidx/fragment/app/b;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Landroid/support/v4/media/RatingCompat;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Landroid/support/v4/media/MediaMetadataCompat;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Landroid/support/v4/media/MediaDescriptionCompat;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    return-object p1

    :pswitch_9
    new-array p1, p1, [La30/f1;

    return-object p1

    :pswitch_a
    new-array p1, p1, [La30/v0;

    return-object p1

    :pswitch_b
    new-array p1, p1, [La30/s0;

    return-object p1

    :pswitch_c
    new-array p1, p1, [La30/r0;

    return-object p1

    :pswitch_d
    new-array p1, p1, [La30/q0;

    return-object p1

    :pswitch_e
    new-array p1, p1, [La30/p0;

    return-object p1

    :pswitch_f
    new-array p1, p1, [La30/o0;

    return-object p1

    :pswitch_10
    new-array p1, p1, [La30/l0;

    return-object p1

    :pswitch_11
    new-array p1, p1, [La30/i0;

    return-object p1

    :pswitch_12
    new-array p1, p1, [La30/h0;

    return-object p1

    :pswitch_13
    new-array p1, p1, [La30/g0;

    return-object p1

    :pswitch_14
    new-array p1, p1, [La30/f0;

    return-object p1

    :pswitch_15
    new-array p1, p1, [La30/a;

    return-object p1

    :pswitch_16
    new-array p1, p1, [La10/i;

    return-object p1

    :pswitch_17
    new-array p1, p1, [La10/g;

    return-object p1

    :pswitch_18
    new-array p1, p1, [La10/f;

    return-object p1

    :pswitch_19
    new-array p1, p1, [La10/e;

    return-object p1

    :pswitch_1a
    new-array p1, p1, [La10/d;

    return-object p1

    :pswitch_1b
    new-array p1, p1, [La10/c;

    return-object p1

    :pswitch_1c
    new-array p1, p1, [La10/b;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
