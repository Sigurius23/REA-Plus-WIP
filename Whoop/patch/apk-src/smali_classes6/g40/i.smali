.class public final Lg40/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lg40/i;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lg40/i;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lg40/v1;->valueOf(Ljava/lang/String;)Lg40/v1;

    move-result-object p1

    return-object p1

    :pswitch_0
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lg40/u1;->valueOf(Ljava/lang/String;)Lg40/u1;

    move-result-object p1

    return-object p1

    :pswitch_1
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-class v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lg40/w1;

    invoke-direct {v0, v1, v2, p1}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>(Ljava/lang/String;ZLg40/w1;)V

    return-object v0

    :pswitch_2
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lg40/l;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->valueOf(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->valueOf(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->valueOf(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lg40/l;-><init>(Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;)V

    return-object v0

    :pswitch_3
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    move-object v3, v0

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashSet;-><init>(I)V

    const/4 v3, 0x0

    :goto_1
    if-eq v3, v0, :cond_2

    const/4 v4, 0x1

    invoke-static {p1, v1, v3, v4}, Lte0/d;->e(Landroid/os/Parcel;Ljava/util/LinkedHashSet;II)I

    move-result v3

    goto :goto_1

    :cond_2
    move-object v3, v1

    :goto_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->valueOf(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->valueOf(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object v5

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->valueOf(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object v6

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lc93/a;

    new-instance v1, Lg40/k;

    invoke-direct/range {v1 .. v7}, Lg40/k;-><init>(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lc93/a;)V

    return-object v1

    :pswitch_4
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    move-object v3, v0

    goto :goto_4

    :cond_3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashSet;-><init>(I)V

    const/4 v3, 0x0

    :goto_3
    if-eq v3, v0, :cond_4

    const/4 v4, 0x1

    invoke-static {p1, v1, v3, v4}, Lte0/d;->e(Landroid/os/Parcel;Ljava/util/LinkedHashSet;II)I

    move-result v3

    goto :goto_3

    :cond_4
    move-object v3, v1

    :goto_4
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->valueOf(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->valueOf(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object v5

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->valueOf(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object v6

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lc93/a;

    new-instance v1, Lg40/j;

    invoke-direct/range {v1 .. v7}, Lg40/j;-><init>(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lc93/a;)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lg40/i;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Lg40/v1;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Lg40/u1;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Lg40/l;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Lg40/k;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Lg40/j;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
