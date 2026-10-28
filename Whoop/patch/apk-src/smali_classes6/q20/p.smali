.class public final Lq20/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lq20/p;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lq20/p;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lq30/i0;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/security/KeyPair;

    sget-object v0, Lq30/l;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lq30/l;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    sget-object v0, Lq30/n0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lq30/n0;

    invoke-direct/range {v1 .. v6}, Lq30/i0;-><init>(Ljava/lang/String;Ljava/security/KeyPair;Lq30/l;ILq30/n0;)V

    return-object v1

    :pswitch_0
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq30/z;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lr30/j;->valueOf(Ljava/lang/String;)Lr30/j;

    move-result-object v2

    :goto_0
    sget-object v3, Lq30/n0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq30/n0;

    invoke-direct {v0, v1, v2, p1}, Lq30/z;-><init>(Ljava/lang/String;Lr30/j;Lq30/n0;)V

    return-object v0

    :pswitch_1
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq30/y;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lr30/j;->valueOf(Ljava/lang/String;)Lr30/j;

    move-result-object v2

    :goto_1
    sget-object v3, Lq30/n0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq30/n0;

    invoke-direct {v0, v1, v2, p1}, Lq30/y;-><init>(Ljava/lang/String;Lr30/j;Lq30/n0;)V

    return-object v0

    :pswitch_2
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq30/x;

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lr30/j;->valueOf(Ljava/lang/String;)Lr30/j;

    move-result-object v2

    :goto_2
    sget-object v3, Lq30/n0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq30/n0;

    invoke-direct {v0, v1, v2, p1}, Lq30/x;-><init>(Ljava/lang/Throwable;Lr30/j;Lq30/n0;)V

    return-object v0

    :pswitch_3
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq30/w;

    sget-object v1, Lr30/g;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr30/g;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lr30/j;->valueOf(Ljava/lang/String;)Lr30/j;

    move-result-object v2

    :goto_3
    sget-object v3, Lq30/n0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq30/n0;

    invoke-direct {v0, v1, v2, p1}, Lq30/w;-><init>(Lr30/g;Lr30/j;Lq30/n0;)V

    return-object v0

    :pswitch_4
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq30/v;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_4

    const/4 v2, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lr30/j;->valueOf(Ljava/lang/String;)Lr30/j;

    move-result-object v2

    :goto_4
    sget-object v3, Lq30/n0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq30/n0;

    invoke-direct {v0, v1, v2, p1}, Lq30/v;-><init>(Ljava/lang/String;Lr30/j;Lq30/n0;)V

    return-object v0

    :pswitch_5
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq30/u;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_5

    const/4 v2, 0x0

    goto :goto_5

    :cond_5
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lr30/j;->valueOf(Ljava/lang/String;)Lr30/j;

    move-result-object v2

    :goto_5
    sget-object v3, Lq30/n0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq30/n0;

    invoke-direct {v0, v1, v2, p1}, Lq30/u;-><init>(Ljava/lang/String;Lr30/j;Lq30/n0;)V

    return-object v0

    :pswitch_6
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq30/s;

    sget-object v1, Lr30/g;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr30/g;

    invoke-direct {v0, p1}, Lq30/s;-><init>(Lr30/g;)V

    return-object v0

    :pswitch_7
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq30/r;

    sget-object v1, Lr30/b;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr30/b;

    sget-object v2, Lr30/e;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr30/e;

    sget-object v3, Lq30/n;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq30/n;

    invoke-direct {v0, v1, v2, p1}, Lq30/r;-><init>(Lr30/b;Lr30/e;Lq30/n;)V

    return-object v0

    :pswitch_8
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq30/q;

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {v0, p1}, Lq30/q;-><init>(Ljava/lang/Throwable;)V

    return-object v0

    :pswitch_9
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq30/p;

    sget-object v1, Lr30/g;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr30/g;

    invoke-direct {v0, p1}, Lq30/p;-><init>(Lr30/g;)V

    return-object v0

    :pswitch_a
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq30/m;

    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lq30/m;-><init>([B[B)V

    return-object v0

    :pswitch_b
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lq30/n;

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo30/d;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    sget-object v0, Lr30/b;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lr30/b;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    sget-object v0, Lq30/m;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lq30/m;

    invoke-direct/range {v1 .. v6}, Lq30/n;-><init>(Lo30/d;Ljava/lang/String;Lr30/b;Ljava/lang/String;Lq30/m;)V

    return-object v1

    :pswitch_c
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lq30/l;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lq30/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :pswitch_d
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    sget-object p1, Lq30/g;->w:Lq30/g;

    return-object p1

    :pswitch_e
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq30/f;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v1, :cond_6

    const/4 p1, 0x0

    goto :goto_7

    :cond_6
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_7

    const/4 p1, 0x1

    goto :goto_6

    :cond_7
    const/4 p1, 0x0

    :goto_6
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    :goto_7
    invoke-direct {v0, p1}, Lq30/f;-><init>(Ljava/lang/Boolean;)V

    return-object v0

    :pswitch_f
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq30/e;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_8

    const/4 p1, 0x0

    goto :goto_9

    :cond_8
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_9

    const/4 p1, 0x1

    goto :goto_8

    :cond_9
    const/4 p1, 0x0

    :goto_8
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    :goto_9
    invoke-direct {v0, v1, p1}, Lq30/e;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-object v0

    :pswitch_10
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq30/d;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lq30/d;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_11
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    sget-object p1, Lq30/c;->w:Lq30/c;

    return-object p1

    :pswitch_12
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lq30/b;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    sget-object v0, Lq30/q0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lq30/q0;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-direct/range {v1 .. v7}, Lq30/b;-><init>(Ljava/lang/String;Lq30/q0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :pswitch_13
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq30/a;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/security/interfaces/ECPublicKey;

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Ljava/security/interfaces/ECPublicKey;

    invoke-direct {v0, v1, v2, p1}, Lq30/a;-><init>(Ljava/lang/String;Ljava/security/interfaces/ECPublicKey;Ljava/security/interfaces/ECPublicKey;)V

    return-object v0

    :pswitch_14
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq20/i0;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_a

    const/4 p1, 0x1

    goto :goto_a

    :cond_a
    const/4 p1, 0x0

    :goto_a
    invoke-direct {v0, v1, p1}, Lq20/i0;-><init>(Ljava/lang/String;Z)V

    return-object v0

    :pswitch_15
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    sget-object p1, Lq20/h0;->w:Lq20/h0;

    return-object p1

    :pswitch_16
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    sget-object p1, Lq20/g0;->w:Lq20/g0;

    return-object p1

    :pswitch_17
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    sget-object p1, Lq20/f0;->w:Lq20/f0;

    return-object p1

    :pswitch_18
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    sget-object p1, Lq20/x;->x:Lq20/x;

    return-object p1

    :pswitch_19
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq20/w;

    const-class v1, Lq20/w;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Ly00/o4;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-nez v3, :cond_b

    const/4 v3, 0x0

    goto :goto_b

    :cond_b
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lq20/u;->valueOf(Ljava/lang/String;)Lq20/u;

    move-result-object v3

    :goto_b
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Ly00/u5;

    invoke-direct {v0, v2, v3, p1}, Lq20/w;-><init>(Ly00/o4;Lq20/u;Ly00/u5;)V

    return-object v0

    :pswitch_1a
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq20/r;

    const-class v1, Lq20/r;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Ly00/o4;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_c

    const/4 p1, 0x0

    goto :goto_c

    :cond_c
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ly00/p2;->valueOf(Ljava/lang/String;)Ly00/p2;

    move-result-object p1

    :goto_c
    invoke-direct {v0, v1, p1}, Lq20/r;-><init>(Ly00/o4;Ly00/p2;)V

    return-object v0

    :pswitch_1b
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lq20/q;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    const-class v0, Lq20/q;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ly00/c;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_d

    const/4 p1, 0x1

    :goto_d
    move v6, p1

    goto :goto_e

    :cond_d
    const/4 p1, 0x0

    goto :goto_d

    :goto_e
    invoke-direct/range {v1 .. v6}, Lq20/q;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/c;Z)V

    return-object v1

    :pswitch_1c
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lq20/s;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    sget-object v0, Lq20/q;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lq20/q;

    const-class v0, Lq20/s;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {p1, v5}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Lt20/g;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-nez v6, :cond_e

    const/4 v6, 0x0

    goto :goto_f

    :cond_e
    sget-object v6, Lq20/r;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v6, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v6

    :goto_f
    check-cast v6, Lq20/r;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v7

    invoke-virtual {p1, v7}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v7

    check-cast v7, Ly00/d5;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lq20/h;->valueOf(Ljava/lang/String;)Lq20/h;

    move-result-object v8

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v9

    invoke-virtual {p1, v9}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v9

    check-cast v9, Ly00/u5;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    move-object v10, p1

    check-cast v10, Ly00/j5;

    invoke-direct/range {v1 .. v10}, Lq20/s;-><init>(Ljava/lang/String;ILq20/q;Lt20/g;Lq20/r;Ly00/d5;Lq20/h;Ly00/u5;Ly00/j5;)V

    return-object v1

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

    iget v0, p0, Lq20/p;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Lq30/i0;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Lq30/z;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Lq30/y;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Lq30/x;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Lq30/w;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Lq30/v;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Lq30/u;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Lq30/s;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Lq30/r;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Lq30/q;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Lq30/p;

    return-object p1

    :pswitch_a
    new-array p1, p1, [Lq30/m;

    return-object p1

    :pswitch_b
    new-array p1, p1, [Lq30/n;

    return-object p1

    :pswitch_c
    new-array p1, p1, [Lq30/l;

    return-object p1

    :pswitch_d
    new-array p1, p1, [Lq30/g;

    return-object p1

    :pswitch_e
    new-array p1, p1, [Lq30/f;

    return-object p1

    :pswitch_f
    new-array p1, p1, [Lq30/e;

    return-object p1

    :pswitch_10
    new-array p1, p1, [Lq30/d;

    return-object p1

    :pswitch_11
    new-array p1, p1, [Lq30/c;

    return-object p1

    :pswitch_12
    new-array p1, p1, [Lq30/b;

    return-object p1

    :pswitch_13
    new-array p1, p1, [Lq30/a;

    return-object p1

    :pswitch_14
    new-array p1, p1, [Lq20/i0;

    return-object p1

    :pswitch_15
    new-array p1, p1, [Lq20/h0;

    return-object p1

    :pswitch_16
    new-array p1, p1, [Lq20/g0;

    return-object p1

    :pswitch_17
    new-array p1, p1, [Lq20/f0;

    return-object p1

    :pswitch_18
    new-array p1, p1, [Lq20/x;

    return-object p1

    :pswitch_19
    new-array p1, p1, [Lq20/w;

    return-object p1

    :pswitch_1a
    new-array p1, p1, [Lq20/r;

    return-object p1

    :pswitch_1b
    new-array p1, p1, [Lq20/q;

    return-object p1

    :pswitch_1c
    new-array p1, p1, [Lq20/s;

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
