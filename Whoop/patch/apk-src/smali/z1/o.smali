.class public final Lz1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# direct methods
.method public static a(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lz1/p;
    .locals 3

    if-nez p1, :cond_0

    const-class p1, Lz1/o;

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    :cond_0
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-instance v1, Lx30/j1;

    const/16 v2, 0x11

    invoke-direct {v1, v2, p0, p1}, Lx30/j1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    if-nez v0, :cond_1

    new-instance p0, Lz1/p;

    invoke-direct {p0}, Lz1/p;-><init>()V

    return-object p0

    :cond_1
    sget-object p0, Lt1/j;->x:Lt1/j;

    invoke-virtual {p0}, Lt1/j;->g()Lt1/f;

    move-result-object p0

    const/4 p1, 0x0

    :goto_0
    if-ge p1, v0, :cond_2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lx30/j1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v2}, Lt1/f;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    new-instance p1, Lz1/p;

    invoke-virtual {p0}, Lt1/f;->d()Lt1/c;

    move-result-object p0

    invoke-direct {p1, p0}, Lz1/p;-><init>(Lt1/c;)V

    return-object p1
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0}, Lz1/o;->a(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lz1/p;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lz1/o;->a(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lz1/p;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lz1/p;

    return-object p1
.end method
