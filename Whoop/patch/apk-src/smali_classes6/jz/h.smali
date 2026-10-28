.class public final Ljz/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ljz/h;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 14

    iget v0, p0, Ljz/h;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lm30/h;

    invoke-direct {v0, p1}, Lm30/h;-><init>(Landroid/os/Parcel;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lm30/g;

    invoke-direct {v0, p1}, Lm30/a;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lm30/g;->z:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lm30/g;->E:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lm30/g;->F:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lm30/g;->G:Ljava/lang/String;

    return-object v0

    :pswitch_1
    new-instance v0, Lm30/f;

    invoke-direct {v0, p1}, Lm30/a;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Lm30/f;->z:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lm30/f;->E:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Lm30/f;->F:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lm30/f;->G:Ljava/lang/String;

    return-object v0

    :pswitch_2
    new-instance v0, Lm30/e;

    invoke-direct {v0, p1}, Lm30/a;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lm30/e;->z:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lm30/e;->E:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, v0, Lm30/e;->F:I

    return-object v0

    :pswitch_3
    new-instance v0, Lm30/d;

    invoke-direct {v0, p1}, Lm30/a;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lm30/d;->z:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, v0, Lm30/d;->E:I

    return-object v0

    :pswitch_4
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llv/b;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    move v2, v3

    move v4, v2

    goto :goto_0

    :cond_0
    move v0, v2

    move v4, v3

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    move v5, v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v4

    move v6, v5

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v5

    move v7, v6

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v6

    move v8, v7

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v7

    move v9, v8

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v8

    move v10, v9

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v9

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v11

    if-eqz v11, :cond_1

    move v11, v10

    goto :goto_1

    :cond_1
    move v11, v10

    move v10, v0

    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v12

    if-eqz v12, :cond_2

    move v12, v11

    goto :goto_2

    :cond_2
    move v12, v11

    move v11, v0

    :goto_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v13

    if-eqz v13, :cond_3

    goto :goto_3

    :cond_3
    move v12, v0

    :goto_3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-nez v0, :cond_4

    const/4 p1, 0x0

    goto :goto_4

    :cond_4
    sget-object v0, Lcom/mapbox/maps/ImageHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    :goto_4
    move-object v13, p1

    check-cast v13, Lcom/mapbox/maps/ImageHolder;

    invoke-direct/range {v1 .. v13}, Llv/b;-><init>(ZIFFFFFFZZZLcom/mapbox/maps/ImageHolder;)V

    return-object v1

    :pswitch_5
    new-instance v0, Lln/b;

    invoke-direct {v0, p1}, Lln/b;-><init>(Landroid/os/Parcel;)V

    return-object v0

    :pswitch_6
    new-instance v0, Lln/a;

    invoke-direct {v0, p1}, Lln/a;-><init>(Landroid/os/Parcel;)V

    return-object v0

    :pswitch_7
    new-instance v0, Ll5/h;

    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, v0, Ll5/h;->w:I

    return-object v0

    :pswitch_8
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll30/o;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll30/n;->valueOf(Ljava/lang/String;)Ll30/n;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Ll30/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ll30/n;)V

    return-object v0

    :pswitch_9
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll30/a;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-direct {v0, v1, p1}, Ll30/a;-><init>(Ljava/lang/String;I)V

    return-object v0

    :pswitch_a
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll10/c;

    sget-object v1, Ll10/b;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll10/b;

    invoke-direct {v0, p1}, Ll10/c;-><init>(Ll10/b;)V

    return-object v0

    :pswitch_b
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ll10/b;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_5

    move-object v0, v2

    goto :goto_5

    :cond_5
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lh20/g2;->valueOf(Ljava/lang/String;)Lh20/g2;

    move-result-object v0

    :goto_5
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-nez v6, :cond_6

    :goto_6
    move-object v6, v2

    goto :goto_7

    :cond_6
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    goto :goto_6

    :goto_7
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    sget-object v2, Lh20/l1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lh20/l1;

    const-class v2, Ll10/b;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v9

    invoke-virtual {p1, v9}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v9

    check-cast v9, Lux/a;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lux/b;

    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v11

    move-object v2, v0

    invoke-direct/range {v1 .. v11}, Ll10/b;-><init>(Lh20/g2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lh20/l1;Lux/a;Lux/b;Ljava/util/List;)V

    return-object v1

    :pswitch_c
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkz/p;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_7

    const/4 p1, 0x1

    goto :goto_8

    :cond_7
    const/4 p1, 0x0

    :goto_8
    invoke-direct {v0, v1, v2, v3, p1}, Lkz/p;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0

    :pswitch_d
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkz/m;

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {v0, p1}, Lkz/m;-><init>(Ljava/lang/Throwable;)V

    return-object v0

    :pswitch_e
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkz/l;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_8

    const/4 p1, 0x1

    goto :goto_9

    :cond_8
    const/4 p1, 0x0

    :goto_9
    invoke-direct {v0, v1, v2, v3, p1}, Lkz/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0

    :pswitch_f
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    sget-object p1, Lkz/k;->w:Lkz/k;

    return-object p1

    :pswitch_10
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkz/g;

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {v0, p1}, Lkz/g;-><init>(Ljava/lang/Throwable;)V

    return-object v0

    :pswitch_11
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkz/f;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_9

    move-object v1, v2

    goto :goto_a

    :cond_9
    sget-object v1, Lkz/p;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    :goto_a
    check-cast v1, Lkz/p;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-nez v3, :cond_a

    goto :goto_b

    :cond_a
    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    :goto_b
    check-cast v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    const-class v3, Lkz/f;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Ly00/g8;

    invoke-direct {v0, v1, v2, p1}, Lkz/f;-><init>(Lkz/p;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Ly00/g8;)V

    return-object v0

    :pswitch_12
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    sget-object p1, Lkz/e;->w:Lkz/e;

    return-object p1

    :pswitch_13
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkz/c;

    sget-object v1, Ljz/f;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljz/f;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_b

    const/4 p1, 0x0

    goto :goto_c

    :cond_b
    sget-object v2, Ljz/e;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    :goto_c
    check-cast p1, Ljz/e;

    invoke-direct {v0, v1, p1}, Lkz/c;-><init>(Ljz/f;Ljz/e;)V

    return-object v0

    :pswitch_14
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkz/b;

    sget-object v1, Ljz/f;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljz/f;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_c

    const/4 p1, 0x0

    goto :goto_d

    :cond_c
    sget-object v2, Ljz/e;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    :goto_d
    check-cast p1, Ljz/e;

    invoke-direct {v0, v1, p1}, Lkz/b;-><init>(Ljz/f;Ljz/e;)V

    return-object v0

    :pswitch_15
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkz/a;

    sget-object v1, Ljz/f;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljz/f;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_d

    const/4 p1, 0x0

    goto :goto_e

    :cond_d
    sget-object v2, Ljz/e;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    :goto_e
    check-cast p1, Ljz/e;

    invoke-direct {v0, v1, p1}, Lkz/a;-><init>(Ljz/f;Ljz/e;)V

    return-object v0

    :pswitch_16
    new-instance v0, Lkn/a;

    invoke-direct {v0, p1}, Lkn/a;-><init>(Landroid/os/Parcel;)V

    return-object v0

    :pswitch_17
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk10/a;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lk10/a;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Ly00/v3;

    invoke-direct {v0, v1, p1}, Lk10/a;-><init>(Ljava/lang/String;Ly00/v3;)V

    return-object v0

    :pswitch_18
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljz/n;

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {v0, p1}, Ljz/n;-><init>(Ljava/lang/Throwable;)V

    return-object v0

    :pswitch_19
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljz/m;

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-direct {v0, p1}, Ljz/m;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V

    return-object v0

    :pswitch_1a
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    sget-object p1, Ljz/l;->w:Ljz/l;

    return-object p1

    :pswitch_1b
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljz/j;

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {v0, p1}, Ljz/j;-><init>(Ljava/lang/Throwable;)V

    return-object v0

    :pswitch_1c
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljz/i;

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    const-class v2, Ljz/i;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Ly00/g8;

    invoke-direct {v0, v1, p1}, Ljz/i;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Ly00/g8;)V

    return-object v0

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

    iget v0, p0, Ljz/h;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Lm30/h;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Lm30/g;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Lm30/f;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Lm30/e;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Lm30/d;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Llv/b;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Lln/b;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Lln/a;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Ll5/h;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Ll30/o;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Ll30/a;

    return-object p1

    :pswitch_a
    new-array p1, p1, [Ll10/c;

    return-object p1

    :pswitch_b
    new-array p1, p1, [Ll10/b;

    return-object p1

    :pswitch_c
    new-array p1, p1, [Lkz/p;

    return-object p1

    :pswitch_d
    new-array p1, p1, [Lkz/m;

    return-object p1

    :pswitch_e
    new-array p1, p1, [Lkz/l;

    return-object p1

    :pswitch_f
    new-array p1, p1, [Lkz/k;

    return-object p1

    :pswitch_10
    new-array p1, p1, [Lkz/g;

    return-object p1

    :pswitch_11
    new-array p1, p1, [Lkz/f;

    return-object p1

    :pswitch_12
    new-array p1, p1, [Lkz/e;

    return-object p1

    :pswitch_13
    new-array p1, p1, [Lkz/c;

    return-object p1

    :pswitch_14
    new-array p1, p1, [Lkz/b;

    return-object p1

    :pswitch_15
    new-array p1, p1, [Lkz/a;

    return-object p1

    :pswitch_16
    new-array p1, p1, [Lkn/a;

    return-object p1

    :pswitch_17
    new-array p1, p1, [Lk10/a;

    return-object p1

    :pswitch_18
    new-array p1, p1, [Ljz/n;

    return-object p1

    :pswitch_19
    new-array p1, p1, [Ljz/m;

    return-object p1

    :pswitch_1a
    new-array p1, p1, [Ljz/l;

    return-object p1

    :pswitch_1b
    new-array p1, p1, [Ljz/j;

    return-object p1

    :pswitch_1c
    new-array p1, p1, [Ljz/i;

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
