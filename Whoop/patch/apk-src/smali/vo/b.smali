.class public abstract Lvo/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lzt/q;


# direct methods
.method public static A(Landroid/os/Parcel;I)J
    .locals 1

    const/16 v0, 0x8

    invoke-static {p0, p1, v0}, Lvo/b;->G(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J

    move-result-wide p0

    return-wide p0
.end method

.method public static B(Landroid/os/Parcel;I)I
    .locals 2

    const/high16 v0, -0x10000

    and-int v1, p1, v0

    if-eq v1, v0, :cond_0

    shr-int/lit8 p0, p1, 0x10

    int-to-char p0, p0

    return p0

    :cond_0
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result p0

    return p0
.end method

.method public static final C(J)J
    .locals 6

    const/16 v0, 0x20

    shr-long v1, p0, v0

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    const-wide v2, 0xffffffffL

    and-long/2addr p0, v2

    long-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    int-to-long v4, v1

    shl-long v0, v4, v0

    int-to-long p0, p0

    and-long/2addr p0, v2

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public static final D(Lcd3/f;Lj93/a0;Z)Lwc3/c;
    .locals 6

    invoke-static {p1}, Lkotlinx/serialization/internal/Platform_commonKt;->kclass(Lj93/a0;)Lj93/d;

    move-result-object v0

    invoke-interface {p1}, Lj93/a0;->isMarkedNullable()Z

    move-result v1

    invoke-interface {p1}, Lj93/a0;->getArguments()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj93/d0;

    invoke-static {v3}, Lkotlinx/serialization/internal/Platform_commonKt;->typeOrThrow(Lj93/d0;)Lj93/a0;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    sget-object v3, Lm83/y;->w:Lm83/y;

    const/4 v4, 0x0

    if-eqz p1, :cond_2

    invoke-static {v0}, Lkotlinx/serialization/internal/PlatformKt;->isInterface(Lj93/d;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0, v0, v3}, Lcd3/f;->b(Lj93/d;Ljava/util/List;)Lwc3/c;

    move-result-object p1

    if-eqz p1, :cond_1

    :goto_1
    move-object p1, v4

    goto :goto_2

    :cond_1
    invoke-static {v0, v1}, Lwc3/k;->a(Lj93/d;Z)Lwc3/c;

    move-result-object p1

    goto :goto_2

    :cond_2
    move-object p1, p0

    check-cast p1, Lcd3/d;

    iget-boolean p1, p1, Lcd3/d;->f:Z

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {v0, v2, v1}, Lwc3/k;->b(Lj93/d;Ljava/util/ArrayList;Z)Ljava/lang/Object;

    move-result-object p1

    instance-of v5, p1, Ll83/m;

    if-eqz v5, :cond_4

    move-object p1, v4

    :cond_4
    check-cast p1, Lwc3/c;

    :goto_2
    if-eqz p1, :cond_5

    return-object p1

    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {v0}, Lvb/g;->j(Lj93/d;)Lwc3/c;

    move-result-object p1

    if-nez p1, :cond_a

    invoke-virtual {p0, v0, v3}, Lcd3/f;->b(Lj93/d;Ljava/util/List;)Lwc3/c;

    move-result-object p1

    if-nez p1, :cond_a

    invoke-static {v0}, Lkotlinx/serialization/internal/PlatformKt;->isInterface(Lj93/d;)Z

    move-result p0

    if-eqz p0, :cond_6

    new-instance p0, Lwc3/e;

    invoke-direct {p0, v0}, Lwc3/e;-><init>(Lj93/d;)V

    :goto_3
    move-object p1, p0

    goto :goto_4

    :cond_6
    move-object p1, v4

    goto :goto_4

    :cond_7
    invoke-static {p0, v2, p2}, Lvb/g;->k(Lcd3/f;Ljava/util/List;Z)Ljava/util/ArrayList;

    move-result-object p1

    if-nez p1, :cond_8

    goto :goto_5

    :cond_8
    new-instance p2, Lvv1/c;

    const/16 v3, 0xb

    invoke-direct {p2, v2, v3}, Lvv1/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, p1, p2}, Lvb/g;->g(Lj93/d;Ljava/util/ArrayList;Lc93/a;)Lwc3/c;

    move-result-object p2

    if-nez p2, :cond_9

    invoke-virtual {p0, v0, p1}, Lcd3/f;->b(Lj93/d;Ljava/util/List;)Lwc3/c;

    move-result-object p1

    if-nez p1, :cond_a

    invoke-static {v0}, Lkotlinx/serialization/internal/PlatformKt;->isInterface(Lj93/d;)Z

    move-result p0

    if-eqz p0, :cond_6

    new-instance p0, Lwc3/e;

    invoke-direct {p0, v0}, Lwc3/e;-><init>(Lj93/d;)V

    goto :goto_3

    :cond_9
    move-object p1, p2

    :cond_a
    :goto_4
    if-eqz p1, :cond_c

    if-eqz v1, :cond_b

    invoke-static {p1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object p0

    return-object p0

    :cond_b
    return-object p1

    :cond_c
    :goto_5
    return-object v4
.end method

.method public static E(Landroid/os/Parcel;I)V
    .locals 1

    invoke-static {p0, p1}, Lvo/b;->B(Landroid/os/Parcel;I)I

    move-result p1

    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    return-void
.end method

.method public static F(Landroid/os/Parcel;)I
    .locals 6

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {p0, v0}, Lvo/b;->B(Landroid/os/Parcel;I)I

    move-result v1

    int-to-char v2, v0

    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    const/16 v4, 0x4f45

    if-ne v2, v4, :cond_1

    add-int/2addr v1, v3

    if-lt v1, v3, :cond_0

    invoke-virtual {p0}, Landroid/os/Parcel;->dataSize()I

    move-result v0

    if-gt v1, v0, :cond_0

    return v1

    :cond_0
    new-instance v0, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException;

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v2, v2, 0x20

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    add-int/2addr v2, v4

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Size read is invalid start="

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " end="

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V

    throw v0

    :cond_1
    new-instance v1, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException;

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Expected object header. Got 0x"

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V

    throw v1
.end method

.method public static G(Landroid/os/Parcel;II)V
    .locals 5

    invoke-static {p0, p1}, Lvo/b;->B(Landroid/os/Parcel;I)I

    move-result p1

    if-ne p1, p2, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException;

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v2, v2, 0x13

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    add-int/2addr v2, v3

    add-int/lit8 v2, v2, 0x4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v3, v2

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Expected size "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " got "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " (0x"

    const-string p2, ")"

    invoke-static {v2, p1, v1, p2}, Lb9/y;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V

    throw v0
.end method

.method public static H(Landroid/os/Parcel;II)V
    .locals 5

    if-ne p1, p2, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException;

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v2, v2, 0x13

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    add-int/2addr v2, v3

    add-int/lit8 v2, v2, 0x4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v3, v2

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Expected size "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " got "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " (0x"

    const-string p2, ")"

    invoke-static {v2, p1, v1, p2}, Lb9/y;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V

    throw v0
.end method

.method public static final a(II)J
    .locals 4

    int-to-long v0, p0

    const/16 p0, 0x20

    shl-long/2addr v0, p0

    int-to-long p0, p1

    const-wide v2, 0xffffffffL

    and-long/2addr p0, v2

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public static c(Landroid/os/Parcel;I)Landroid/os/Bundle;
    .locals 2

    invoke-static {p0, p1}, Lvo/b;->B(Landroid/os/Parcel;I)I

    move-result p1

    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v1

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    return-object v1
.end method

.method public static d(Landroid/os/Parcel;I)[B
    .locals 2

    invoke-static {p0, p1}, Lvo/b;->B(Landroid/os/Parcel;I)I

    move-result p1

    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v1

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    return-object v1
.end method

.method public static e(Landroid/os/Parcel;I)[I
    .locals 2

    invoke-static {p0, p1}, Lvo/b;->B(Landroid/os/Parcel;I)I

    move-result p1

    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v1

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    return-object v1
.end method

.method public static f(Landroid/os/Parcel;I)Ljava/util/ArrayList;
    .locals 5

    invoke-static {p0, p1}, Lvo/b;->B(Landroid/os/Parcel;I)I

    move-result p1

    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    return-object v1
.end method

.method public static g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    .locals 1

    invoke-static {p0, p1}, Lvo/b;->B(Landroid/os/Parcel;I)I

    move-result p1

    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-interface {p2, p0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Parcelable;

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    return-object p2
.end method

.method public static h(Landroid/os/Parcel;I)Ljava/lang/String;
    .locals 2

    invoke-static {p0, p1}, Lvo/b;->B(Landroid/os/Parcel;I)I

    move-result p1

    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    return-object v1
.end method

.method public static i(Landroid/os/Parcel;I)[Ljava/lang/String;
    .locals 2

    invoke-static {p0, p1}, Lvo/b;->B(Landroid/os/Parcel;I)I

    move-result p1

    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v1

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    return-object v1
.end method

.method public static j(Landroid/os/Parcel;I)Ljava/util/ArrayList;
    .locals 2

    invoke-static {p0, p1}, Lvo/b;->B(Landroid/os/Parcel;I)I

    move-result p1

    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v1

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    return-object v1
.end method

.method public static k(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;
    .locals 1

    invoke-static {p0, p1}, Lvo/b;->B(Landroid/os/Parcel;I)I

    move-result p1

    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0, p2}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object p2

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    return-object p2
.end method

.method public static l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    .locals 1

    invoke-static {p0, p1}, Lvo/b;->B(Landroid/os/Parcel;I)I

    move-result p1

    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0, p2}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object p2

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    return-object p2
.end method

.method public static m(Landroid/os/Parcel;I)V
    .locals 3

    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1a

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Overread allowed size end="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V

    throw v0
.end method

.method public static q()Lzt/q;
    .locals 7

    sget-object v0, Lvo/b;->a:Lzt/q;

    if-nez v0, :cond_0

    const-class v0, Ljava/lang/Class;

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Lzt/q;

    const-string v3, "isSealed"

    invoke-virtual {v0, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const-string v4, "getPermittedSubclasses"

    invoke-virtual {v0, v4, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    const-string v5, "isRecord"

    invoke-virtual {v0, v5, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    const-string v6, "getRecordComponents"

    invoke-virtual {v0, v6, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-direct {v2, v3, v4, v5, v0}, Lzt/q;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance v2, Lzt/q;

    invoke-direct {v2, v1, v1, v1, v1}, Lzt/q;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    :goto_0
    sput-object v2, Lvo/b;->a:Lzt/q;

    return-object v2

    :cond_0
    return-object v0
.end method

.method public static final r(JJF)J
    .locals 4

    const/16 v0, 0x20

    shr-long v1, p0, v0

    long-to-int v1, v1

    shr-long v2, p2, v0

    long-to-int v2, v2

    invoke-static {p4, v1, v2}, Le93/b;->P(FII)I

    move-result v1

    const-wide v2, 0xffffffffL

    and-long/2addr p0, v2

    long-to-int p0, p0

    and-long p1, p2, v2

    long-to-int p1, p1

    invoke-static {p4, p0, p1}, Le93/b;->P(FII)I

    move-result p0

    int-to-long p1, v1

    shl-long/2addr p1, v0

    int-to-long p3, p0

    and-long/2addr p3, v2

    or-long p0, p1, p3

    return-wide p0
.end method

.method public static s(Ljava/lang/Class;)Ljava/lang/Boolean;
    .locals 2

    const-string v0, "clazz"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lvo/b;->q()Lzt/q;

    move-result-object v0

    iget-object v0, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type kotlin.Boolean"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method public static t(Landroid/os/Parcel;I)Z
    .locals 1

    const/4 v0, 0x4

    invoke-static {p0, p1, v0}, Lvo/b;->G(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static u(Landroid/os/Parcel;I)B
    .locals 1

    const/4 v0, 0x4

    invoke-static {p0, p1, v0}, Lvo/b;->G(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result p0

    int-to-byte p0, p0

    return p0
.end method

.method public static v(Landroid/os/Parcel;I)F
    .locals 1

    const/4 v0, 0x4

    invoke-static {p0, p1, v0}, Lvo/b;->G(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Landroid/os/Parcel;->readFloat()F

    move-result p0

    return p0
.end method

.method public static w(Landroid/os/Parcel;I)Ljava/lang/Float;
    .locals 1

    invoke-static {p0, p1}, Lvo/b;->B(Landroid/os/Parcel;I)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x4

    invoke-static {p0, p1, v0}, Lvo/b;->H(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Landroid/os/Parcel;->readFloat()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method public static x(Landroid/os/Parcel;I)Landroid/os/IBinder;
    .locals 2

    invoke-static {p0, p1}, Lvo/b;->B(Landroid/os/Parcel;I)I

    move-result p1

    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    return-object v1
.end method

.method public static y(Landroid/os/Parcel;I)I
    .locals 1

    const/4 v0, 0x4

    invoke-static {p0, p1, v0}, Lvo/b;->G(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result p0

    return p0
.end method

.method public static z(Landroid/os/Parcel;I)Ljava/lang/Integer;
    .locals 1

    invoke-static {p0, p1}, Lvo/b;->B(Landroid/os/Parcel;I)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x4

    invoke-static {p0, p1, v0}, Lvo/b;->H(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b()Lwb3/f;
.end method

.method public abstract n(Lwb3/f;)V
.end method

.method public abstract o(Lwb3/f;Ls/m2;Ls/m2;Lyd/a;)Ljava/lang/Object;
.end method

.method public p(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lyd/b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lyd/b;

    iget v1, v0, Lyd/b;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lyd/b;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lyd/b;

    invoke-direct {v0, p0, p2}, Lyd/b;-><init>(Lvo/b;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lyd/b;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lyd/b;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lyd/b;->x:Lrg/f;

    iget-object v0, v0, Lyd/b;->w:Lwb3/f;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    move-object p2, v0

    goto/16 :goto_7

    :catch_0
    move-exception v0

    move-object p2, v0

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lvo/b;->b()Lwb3/f;

    move-result-object v10

    invoke-virtual {v10}, Lwb3/f;->A()Lcf/j;

    move-result-object v7

    instance-of p2, v10, Lmg/e;

    const/4 v2, 0x0

    if-eqz p2, :cond_3

    move-object p2, v10

    check-cast p2, Lmg/e;

    goto :goto_1

    :cond_3
    move-object p2, v2

    :goto_1
    if-eqz p2, :cond_4

    invoke-interface {p2}, Lmg/e;->l()Lmg/h;

    move-result-object p2

    if-nez p2, :cond_5

    :cond_4
    sget-object p2, Lmg/h;->a:Lmg/g;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p2, Lmg/g;->b:Lmg/f;

    :cond_5
    invoke-interface {p2}, Lmg/h;->d()Lrg/n;

    move-result-object p2

    check-cast p2, Lrg/l;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p2, Lrg/d;->w:Lrg/d;

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v4

    invoke-static {v4}, Lds/q;->z(Lq83/j;)Lng/f;

    sget-object v4, Lrg/k;->a:Lrg/b;

    const-string v5, "fromEnvironment"

    sget-object v6, Lgf/i;->w:Lgf/i;

    invoke-virtual {v4, v5, v6, p2}, Lrg/b;->a(Ljava/lang/String;Lgf/b;Lrg/d;)Lrg/f;

    move-result-object v5

    :try_start_1
    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    sget-object v4, Lmg/i;->x:Lg73/d;

    invoke-interface {p2, v4}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p2

    check-cast p2, Lmg/i;

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lmg/i;->s()Lmg/h;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-interface {p2}, Lmg/h;->b()Lng/d;

    move-result-object p2

    if-eqz p2, :cond_6

    sget-object v2, Lng/a;->a:Lng/f;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p2, v0

    move-object p1, v5

    goto :goto_7

    :catch_1
    move-exception v0

    move-object p2, v0

    move-object p1, v5

    goto :goto_5

    :cond_6
    :goto_2
    sget-object p2, Lq83/k;->w:Lq83/k;

    if-eqz v2, :cond_7

    :try_start_2
    new-instance v4, Lng/h;

    invoke-direct {v4, v2}, Lng/h;-><init>(Lng/f;)V

    goto :goto_3

    :cond_7
    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    sget-object v4, Lng/h;->x:Lng/f;

    invoke-interface {v2, v4}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lng/h;

    if-eqz v4, :cond_8

    goto :goto_3

    :cond_8
    move-object v4, p2

    :goto_3
    new-instance v2, Lrg/i;

    invoke-direct {v2, v5}, Lrg/i;-><init>(Lrg/h;)V

    invoke-interface {v2, v4}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v2

    invoke-interface {v2, p2}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p2

    new-instance v4, Lyd/a;

    const/4 v6, 0x0

    move-object v9, p0

    move-object v8, p1

    invoke-direct/range {v4 .. v10}, Lyd/a;-><init>(Lrg/f;Lq83/d;Lcf/j;Lkotlin/jvm/functions/Function1;Lvo/b;Lwb3/f;)V

    iput-object v10, v0, Lyd/b;->w:Lwb3/f;

    iput-object v5, v0, Lyd/b;->x:Lrg/f;

    iput v3, v0, Lyd/b;->E:I

    invoke-static {p2, v4, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne p1, v1, :cond_9

    return-object v1

    :cond_9
    move-object p1, v5

    move-object v0, v10

    :goto_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Lwb3/f;->build()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :goto_5
    :try_start_3
    instance-of v0, p2, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_a

    const-string v0, "cancelled"

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0, v1}, Lrg/j;->n(Lrg/h;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_6

    :cond_a
    sget-object v0, Lrg/e;->w:[Lrg/e;

    invoke-virtual {p1}, Lrg/f;->b()V

    invoke-static {p1, p2}, Lrg/j;->m(Lrg/h;Ljava/lang/Exception;)V

    :goto_6
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw p2
.end method
