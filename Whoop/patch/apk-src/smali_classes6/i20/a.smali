.class public final Li20/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Li20/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Li20/a;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li20/h0;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    sget-object v1, Lh20/x0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    check-cast p1, Lh20/x0;

    invoke-direct {v0, p1}, Li20/h0;-><init>(Lh20/x0;)V

    return-object v0

    :pswitch_0
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li20/g0;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    sget-object v1, Lh20/x0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    check-cast p1, Lh20/x0;

    invoke-direct {v0, p1}, Li20/g0;-><init>(Lh20/x0;)V

    return-object v0

    :pswitch_1
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li20/e0;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_2

    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    sget-object v2, Lh20/x0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    check-cast p1, Lh20/x0;

    invoke-direct {v0, v1, p1}, Li20/e0;-><init>(Ljava/lang/String;Lh20/x0;)V

    return-object v0

    :pswitch_2
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li20/d0;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_3

    const/4 p1, 0x0

    goto :goto_3

    :cond_3
    sget-object v2, Lh20/x0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    :goto_3
    check-cast p1, Lh20/x0;

    invoke-direct {v0, v1, p1}, Li20/d0;-><init>(Ljava/lang/String;Lh20/x0;)V

    return-object v0

    :pswitch_3
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li20/c0;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    const-class v4, Li20/c0;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {p1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Li20/b0;

    invoke-direct {v0, v1, v2, v3, p1}, Li20/c0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Li20/b0;)V

    return-object v0

    :pswitch_4
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li20/a0;

    sget-object v1, Lh20/h1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh20/h1;

    invoke-direct {v0, p1}, Li20/a0;-><init>(Lh20/h1;)V

    return-object v0

    :pswitch_5
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    sget-object p1, Li20/z;->w:Li20/z;

    return-object p1

    :pswitch_6
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li20/u;

    sget-object v1, Li20/b;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li20/b;

    invoke-direct {v0, p1}, Li20/u;-><init>(Li20/b;)V

    return-object v0

    :pswitch_7
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li20/t;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x1

    goto :goto_4

    :cond_4
    const/4 p1, 0x0

    :goto_4
    invoke-direct {v0, p1}, Li20/t;-><init>(Z)V

    return-object v0

    :pswitch_8
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lh20/h1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lh20/h1;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_5

    move-object v0, v1

    goto :goto_5

    :cond_5
    sget-object v0, Li20/b;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    :goto_5
    move-object v3, v0

    check-cast v3, Li20/b;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-direct {v4, v0}, Ljava/util/LinkedHashSet;-><init>(I)V

    const/4 v5, 0x0

    move v6, v5

    :goto_6
    const/4 v7, 0x1

    if-eq v6, v0, :cond_6

    invoke-static {p1, v4, v6, v7}, Lte0/d;->e(Landroid/os/Parcel;Ljava/util/LinkedHashSet;II)I

    move-result v6

    goto :goto_6

    :cond_6
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-nez v6, :cond_7

    move-object v6, v1

    goto :goto_7

    :cond_7
    sget-object v6, Li20/r;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v6, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v6

    :goto_7
    check-cast v6, Li20/r;

    move v8, v7

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    move v9, v8

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v10

    move v11, v9

    new-instance v9, Ljava/util/LinkedHashSet;

    invoke-direct {v9, v10}, Ljava/util/LinkedHashSet;-><init>(I)V

    :goto_8
    if-eq v5, v10, :cond_8

    invoke-static {p1, v9, v5, v11}, Lte0/d;->e(Landroid/os/Parcel;Ljava/util/LinkedHashSet;II)I

    move-result v5

    goto :goto_8

    :cond_8
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-nez v5, :cond_9

    goto :goto_9

    :cond_9
    sget-object v1, Lh20/i1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    :goto_9
    move-object v10, v1

    check-cast v10, Lh20/i1;

    new-instance v1, Li20/s;

    move-object v5, v0

    invoke-direct/range {v1 .. v10}, Li20/s;-><init>(Lh20/h1;Li20/b;Ljava/util/LinkedHashSet;Ljava/lang/String;Li20/r;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashSet;Lh20/i1;)V

    return-object v1

    :pswitch_9
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Li20/q;->valueOf(Ljava/lang/String;)Li20/q;

    move-result-object p1

    return-object p1

    :pswitch_a
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li20/r;

    sget-object v1, Li20/q;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li20/q;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Li20/r;-><init>(Li20/q;Ljava/lang/String;)V

    return-object v0

    :pswitch_b
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li20/l;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v1, :cond_a

    const/4 p1, 0x0

    goto :goto_a

    :cond_a
    sget-object v1, Lh20/x0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    :goto_a
    check-cast p1, Lh20/x0;

    invoke-direct {v0, p1}, Li20/l;-><init>(Lh20/x0;)V

    return-object v0

    :pswitch_c
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li20/k;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v1, :cond_b

    const/4 p1, 0x0

    goto :goto_b

    :cond_b
    sget-object v1, Lh20/x0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    :goto_b
    check-cast p1, Lh20/x0;

    invoke-direct {v0, p1}, Li20/k;-><init>(Lh20/x0;)V

    return-object v0

    :pswitch_d
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li20/i;

    const-class v1, Li20/i;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Li20/v;

    invoke-direct {v0, p1}, Li20/i;-><init>(Li20/v;)V

    return-object v0

    :pswitch_e
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li20/h;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_c

    const/4 p1, 0x0

    goto :goto_c

    :cond_c
    sget-object v2, Li20/s;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    :goto_c
    check-cast p1, Li20/s;

    invoke-direct {v0, v1, p1}, Li20/h;-><init>(Ljava/lang/String;Li20/s;)V

    return-object v0

    :pswitch_f
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li20/b;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_d

    move-object v2, v3

    goto :goto_d

    :cond_d
    sget-object v2, Lh20/x0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    :goto_d
    check-cast v2, Lh20/x0;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-nez v5, :cond_e

    goto :goto_f

    :cond_e
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_f

    const/4 p1, 0x1

    goto :goto_e

    :cond_f
    const/4 p1, 0x0

    :goto_e
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    :goto_f
    invoke-direct {v0, v1, v2, v4, v3}, Li20/b;-><init>(Ljava/lang/String;Lh20/x0;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

    iget v0, p0, Li20/a;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Li20/h0;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Li20/g0;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Li20/e0;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Li20/d0;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Li20/c0;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Li20/a0;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Li20/z;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Li20/u;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Li20/t;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Li20/s;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Li20/q;

    return-object p1

    :pswitch_a
    new-array p1, p1, [Li20/r;

    return-object p1

    :pswitch_b
    new-array p1, p1, [Li20/l;

    return-object p1

    :pswitch_c
    new-array p1, p1, [Li20/k;

    return-object p1

    :pswitch_d
    new-array p1, p1, [Li20/i;

    return-object p1

    :pswitch_e
    new-array p1, p1, [Li20/h;

    return-object p1

    :pswitch_f
    new-array p1, p1, [Li20/b;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
