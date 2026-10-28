.class public final Lh20/f2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lh20/f2;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lh20/f2;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh20/a4;

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {v0, p1}, Lh20/a4;-><init>(Ljava/lang/Throwable;)V

    return-object v0

    :pswitch_0
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh20/z3;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v0, p1}, Lh20/z3;-><init>(Z)V

    return-object v0

    :pswitch_1
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh20/y3;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    invoke-direct {v0, p1}, Lh20/y3;-><init>(Z)V

    return-object v0

    :pswitch_2
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh20/x3;

    const-class v1, Lh20/x3;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lh20/b4;

    invoke-direct {v0, p1}, Lh20/x3;-><init>(Lh20/b4;)V

    return-object v0

    :pswitch_3
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lh20/w3;

    const-class v0, Lh20/w3;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, La30/t0;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lh20/x1;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    :goto_2
    move-object v5, v0

    goto :goto_3

    :cond_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_2

    :goto_3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    :goto_4
    move v6, p1

    goto :goto_5

    :cond_3
    const/4 p1, 0x0

    goto :goto_4

    :goto_5
    invoke-direct/range {v1 .. v6}, Lh20/w3;-><init>(La30/t0;Lh20/x1;Ljava/lang/String;Ljava/lang/Integer;Z)V

    return-object v1

    :pswitch_4
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    const/4 v2, 0x0

    move v3, v2

    :goto_6
    if-eq v3, v0, :cond_4

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lh20/o3;->valueOf(Ljava/lang/String;)Lh20/o3;

    move-result-object v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lh20/m3;->valueOf(Ljava/lang/String;)Lh20/m3;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_4
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    :goto_7
    if-eq v2, v0, :cond_5

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lh20/o3;->valueOf(Ljava/lang/String;)Lh20/o3;

    move-result-object v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lh20/p3;->valueOf(Ljava/lang/String;)Lh20/p3;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_5
    new-instance p1, Lh20/n3;

    invoke-direct {p1, v1, v3}, Lh20/n3;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    return-object p1

    :pswitch_5
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh20/q3;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, 0x1

    goto :goto_8

    :cond_6
    const/4 v1, 0x0

    :goto_8
    sget-object v2, Lh20/n3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh20/n3;

    sget-object v3, Lh20/o1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh20/o1;

    invoke-direct {v0, v1, v2, p1}, Lh20/q3;-><init>(ZLh20/n3;Lh20/o1;)V

    return-object v0

    :pswitch_6
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh20/k3;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_7

    move-object v1, v2

    goto :goto_9

    :cond_7
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_9
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-nez v3, :cond_8

    move-object v3, v2

    goto :goto_a

    :cond_8
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    :goto_a
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-nez v4, :cond_9

    move-object v4, v2

    goto :goto_b

    :cond_9
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :goto_b
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-nez v5, :cond_a

    goto :goto_c

    :cond_a
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    :goto_c
    invoke-direct {v0, v1, v3, v4, v2}, Lh20/k3;-><init>(Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;)V

    return-object v0

    :pswitch_7
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh20/j3;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v1, :cond_b

    const/4 p1, 0x0

    goto :goto_d

    :cond_b
    sget-object v1, Lh20/k3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    :goto_d
    check-cast p1, Lh20/k3;

    invoke-direct {v0, p1}, Lh20/j3;-><init>(Lh20/k3;)V

    return-object v0

    :pswitch_8
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh20/l3;

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_c

    const/4 v2, 0x0

    goto :goto_e

    :cond_c
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_e
    sget-object v3, Lh20/j3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh20/j3;

    invoke-direct {v0, v1, v2, p1}, Lh20/l3;-><init>(FLjava/lang/Integer;Lh20/j3;)V

    return-object v0

    :pswitch_9
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh20/h3;

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result p1

    invoke-direct {v0, p1}, Lh20/h3;-><init>(F)V

    return-object v0

    :pswitch_a
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh20/f3;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    const-class v4, Lh20/f3;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {p1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lh20/d3;

    invoke-direct {v0, v1, v2, v3, p1}, Lh20/f3;-><init>(Ljava/lang/String;ILjava/lang/String;Lh20/d3;)V

    return-object v0

    :pswitch_b
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh20/e3;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lh20/e3;-><init>(Ljava/lang/String;I)V

    return-object v0

    :pswitch_c
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_d

    move v0, v3

    goto :goto_f

    :cond_d
    move v0, v3

    move v3, v1

    :goto_f
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-eqz v4, :cond_e

    move v4, v0

    goto :goto_10

    :cond_e
    move v4, v1

    :goto_10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-eqz v5, :cond_f

    move v5, v0

    goto :goto_11

    :cond_f
    move v5, v1

    :goto_11
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    move v8, v7

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    move v9, v1

    :goto_12
    if-eq v9, v8, :cond_10

    sget-object v10, Lh20/e3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v10, p1, v7, v9, v0}, Lnh3/a;->b(Landroid/os/Parcelable$Creator;Landroid/os/Parcel;Ljava/util/ArrayList;II)I

    move-result v9

    goto :goto_12

    :cond_10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v8

    move v9, v8

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    :goto_13
    if-eq v1, v9, :cond_11

    sget-object v10, Lh20/f3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v10, p1, v8, v1, v0}, Lnh3/a;->b(Landroid/os/Parcelable$Creator;Landroid/os/Parcel;Ljava/util/ArrayList;II)I

    move-result v1

    goto :goto_13

    :cond_11
    new-instance v1, Lh20/g3;

    invoke-direct/range {v1 .. v8}, Lh20/g3;-><init>(Ljava/lang/String;ZZZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-object v1

    :pswitch_d
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh20/c3;

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lh20/c3;-><init>(FFF)V

    return-object v0

    :pswitch_e
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh20/b3;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_12

    move-object v1, v2

    goto :goto_14

    :cond_12
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_14
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-nez v3, :cond_13

    goto :goto_15

    :cond_13
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    :goto_15
    invoke-direct {v0, v1, v2}, Lh20/b3;-><init>(Ljava/lang/Integer;Ljava/lang/Float;)V

    return-object v0

    :pswitch_f
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh20/a3;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_14

    move-object v1, v2

    goto :goto_16

    :cond_14
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    :goto_16
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-nez v3, :cond_15

    move-object v3, v2

    goto :goto_17

    :cond_15
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    :goto_17
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-nez v4, :cond_16

    goto :goto_18

    :cond_16
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    :goto_18
    invoke-direct {v0, v1, v3, v2}, Lh20/a3;-><init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V

    return-object v0

    :pswitch_10
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lh20/z2;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-nez v0, :cond_17

    const/4 v0, 0x0

    :goto_19
    move-object v2, v0

    goto :goto_1a

    :cond_17
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_19

    :goto_1a
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    invoke-direct/range {v1 .. v6}, Lh20/z2;-><init>(Ljava/lang/Integer;IIII)V

    return-object v1

    :pswitch_11
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh20/y2;

    sget-object v1, Lh20/z2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh20/z2;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh20/z2;

    sget-object v3, Lh20/a3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh20/a3;

    sget-object v4, Lh20/b3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v4, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh20/b3;

    invoke-direct {v0, v2, v1, v3, p1}, Lh20/y2;-><init>(Lh20/z2;Lh20/z2;Lh20/a3;Lh20/b3;)V

    return-object v0

    :pswitch_12
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lh20/v2;->valueOf(Ljava/lang/String;)Lh20/v2;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_18

    move v0, v3

    goto :goto_1b

    :cond_18
    move v0, v3

    move v3, v1

    :goto_1b
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-eqz v4, :cond_19

    move v4, v0

    goto :goto_1c

    :cond_19
    move v4, v1

    :goto_1c
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-eqz v5, :cond_1a

    move v5, v0

    goto :goto_1d

    :cond_1a
    move v5, v1

    :goto_1d
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    move v7, v6

    new-instance v6, Ljava/util/LinkedHashSet;

    invoke-direct {v6, v7}, Ljava/util/LinkedHashSet;-><init>(I)V

    :goto_1e
    if-eq v1, v7, :cond_1b

    invoke-static {p1, v6, v1, v0}, Lte0/d;->e(Landroid/os/Parcel;Ljava/util/LinkedHashSet;II)I

    move-result v1

    goto :goto_1e

    :cond_1b
    new-instance v1, Lh20/w2;

    invoke-direct/range {v1 .. v6}, Lh20/w2;-><init>(Lh20/v2;ZZZLjava/util/Set;)V

    return-object v1

    :pswitch_13
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh20/s2;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lh20/s2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_14
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh20/q2;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lh20/t2;->valueOf(Ljava/lang/String;)Lh20/t2;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lh20/q2;-><init>(Ljava/lang/String;Lh20/t2;)V

    return-object v0

    :pswitch_15
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    const/4 v2, 0x0

    :goto_1f
    if-eq v2, v0, :cond_1c

    const-class v3, Lh20/o2;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lh20/t2;->valueOf(Ljava/lang/String;)Lh20/t2;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1f

    :cond_1c
    new-instance p1, Lh20/o2;

    invoke-direct {p1, v1}, Lh20/o2;-><init>(Ljava/util/LinkedHashMap;)V

    return-object p1

    :pswitch_16
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lh20/p2;

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v5, 0x0

    if-nez v0, :cond_1d

    move-object v0, v5

    goto :goto_20

    :cond_1d
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lh20/t2;->valueOf(Ljava/lang/String;)Lh20/t2;

    move-result-object v0

    :goto_20
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lh20/k2;->valueOf(Ljava/lang/String;)Lh20/k2;

    move-result-object v6

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    if-nez v7, :cond_1e

    goto :goto_21

    :cond_1e
    sget-object v5, Lh20/o2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v5, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v5

    :goto_21
    move-object v7, v5

    check-cast v7, Lh20/o2;

    move-object v5, v0

    invoke-direct/range {v1 .. v7}, Lh20/p2;-><init>(JLjava/lang/String;Lh20/t2;Lh20/k2;Lh20/o2;)V

    return-object v1

    :pswitch_17
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh20/m2;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v1, :cond_1f

    const/4 p1, 0x0

    goto :goto_22

    :cond_1f
    sget-object v1, Lh20/s2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    :goto_22
    check-cast p1, Lh20/s2;

    invoke-direct {v0, p1}, Lh20/m2;-><init>(Lh20/s2;)V

    return-object v0

    :pswitch_18
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    sget-object p1, Lh20/l2;->w:Lh20/l2;

    return-object p1

    :pswitch_19
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lh20/u2;

    const-class v0, Lh20/u2;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lh20/r2;

    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-eqz v6, :cond_20

    const/4 v6, 0x1

    goto :goto_23

    :cond_20
    const/4 v6, 0x0

    :goto_23
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lh20/n2;

    invoke-direct/range {v1 .. v7}, Lh20/u2;-><init>(Lh20/r2;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLh20/n2;)V

    return-object v1

    :pswitch_1a
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh20/j2;

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Lh20/j2;-><init>(FFFF)V

    return-object v0

    :pswitch_1b
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lh20/h2;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lh20/g2;->valueOf(Ljava/lang/String;)Lh20/g2;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-nez v0, :cond_21

    const/4 v0, 0x0

    :goto_24
    move-object v5, v0

    goto :goto_25

    :cond_21
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_24

    :goto_25
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lh20/e2;->valueOf(Ljava/lang/String;)Lh20/e2;

    move-result-object v7

    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v8

    invoke-direct/range {v1 .. v8}, Lh20/h2;-><init>(Lh20/g2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lh20/e2;Ljava/util/List;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

    iget v0, p0, Lh20/f2;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Lh20/a4;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Lh20/z3;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Lh20/y3;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Lh20/x3;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Lh20/w3;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Lh20/n3;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Lh20/q3;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Lh20/k3;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Lh20/j3;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Lh20/l3;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Lh20/h3;

    return-object p1

    :pswitch_a
    new-array p1, p1, [Lh20/f3;

    return-object p1

    :pswitch_b
    new-array p1, p1, [Lh20/e3;

    return-object p1

    :pswitch_c
    new-array p1, p1, [Lh20/g3;

    return-object p1

    :pswitch_d
    new-array p1, p1, [Lh20/c3;

    return-object p1

    :pswitch_e
    new-array p1, p1, [Lh20/b3;

    return-object p1

    :pswitch_f
    new-array p1, p1, [Lh20/a3;

    return-object p1

    :pswitch_10
    new-array p1, p1, [Lh20/z2;

    return-object p1

    :pswitch_11
    new-array p1, p1, [Lh20/y2;

    return-object p1

    :pswitch_12
    new-array p1, p1, [Lh20/w2;

    return-object p1

    :pswitch_13
    new-array p1, p1, [Lh20/s2;

    return-object p1

    :pswitch_14
    new-array p1, p1, [Lh20/q2;

    return-object p1

    :pswitch_15
    new-array p1, p1, [Lh20/o2;

    return-object p1

    :pswitch_16
    new-array p1, p1, [Lh20/p2;

    return-object p1

    :pswitch_17
    new-array p1, p1, [Lh20/m2;

    return-object p1

    :pswitch_18
    new-array p1, p1, [Lh20/l2;

    return-object p1

    :pswitch_19
    new-array p1, p1, [Lh20/u2;

    return-object p1

    :pswitch_1a
    new-array p1, p1, [Lh20/j2;

    return-object p1

    :pswitch_1b
    new-array p1, p1, [Lh20/h2;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
