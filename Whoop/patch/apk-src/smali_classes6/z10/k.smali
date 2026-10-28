.class public final Lz10/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lz10/k;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lz10/k;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-eq v3, v1, :cond_0

    const-class v4, Lzy/d;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {p1, v4}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lzy/d;

    invoke-direct {p1, v0, v2}, Lzy/d;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object p1

    :pswitch_0
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    const-class v5, Lzy/b;

    if-eq v4, v1, :cond_1

    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {p1, v5}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    :goto_2
    if-eq v3, v1, :cond_2

    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    invoke-virtual {p1, v6}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    new-instance p1, Lzy/b;

    invoke-direct {p1, v0, v2, v4}, Lzy/b;-><init>(ILjava/util/List;Ljava/util/List;)V

    return-object p1

    :pswitch_1
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzy/a;

    const-class v1, Lzy/a;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lzy/c;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lzy/c;

    invoke-direct {v0, v2, p1}, Lzy/a;-><init>(Lzy/c;Lzy/c;)V

    return-object v0

    :pswitch_2
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzx/a;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lzx/a;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_3
    invoke-static {p1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    :goto_3
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    if-ge v2, v0, :cond_4

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    int-to-char v3, v2

    const/4 v4, 0x2

    if-eq v3, v4, :cond_3

    invoke-static {p1, v2}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_3

    :cond_3
    invoke-static {p1, v2}, Lvo/b;->c(Landroid/os/Parcel;I)Landroid/os/Bundle;

    move-result-object v1

    goto :goto_3

    :cond_4
    invoke-static {p1, v0}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance p1, Lzt/p;

    invoke-direct {p1, v1}, Lzt/p;-><init>(Landroid/os/Bundle;)V

    return-object p1

    :pswitch_4
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lz10/q;

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {v0, p1}, Lz10/q;-><init>(Ljava/lang/Throwable;)V

    return-object v0

    :pswitch_5
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lz10/p;

    sget-object v1, Lz10/n;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz10/n;

    invoke-direct {v0, p1}, Lz10/p;-><init>(Lz10/n;)V

    return-object v0

    :pswitch_6
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    sget-object p1, Lz10/o;->w:Lz10/o;

    return-object p1

    :pswitch_7
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lz10/m;

    const-class v1, Lz10/m;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-direct {v0, p1}, Lz10/m;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V

    return-object v0

    :pswitch_8
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lz10/l;

    sget-object v1, Ly00/o4;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly00/o4;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, 0x1

    goto :goto_4

    :cond_5
    const/4 p1, 0x0

    :goto_4
    invoke-direct {v0, v1, v2, v3, p1}, Lz10/l;-><init>(Ly00/o4;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
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

    iget v0, p0, Lz10/k;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Lzy/d;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Lzy/b;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Lzy/a;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Lzx/a;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Lzt/p;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Lz10/q;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Lz10/p;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Lz10/o;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Lz10/m;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Lz10/l;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
