.class public final Lpo/e;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lpo/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:I

.field public final F:Lpo/c;

.field public final G:Lpo/b;

.field public final H:Z

.field public final w:Lpo/d;

.field public final x:Lpo/a;

.field public final y:Ljava/lang/String;

.field public final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpn/a;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lpn/a;-><init>(I)V

    sput-object v0, Lpo/e;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lpo/d;Lpo/a;Ljava/lang/String;ZILpo/c;Lpo/b;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Luo/w;->f(Ljava/lang/Object;)V

    iput-object p1, p0, Lpo/e;->w:Lpo/d;

    invoke-static {p2}, Luo/w;->f(Ljava/lang/Object;)V

    iput-object p2, p0, Lpo/e;->x:Lpo/a;

    iput-object p3, p0, Lpo/e;->y:Ljava/lang/String;

    iput-boolean p4, p0, Lpo/e;->z:Z

    iput p5, p0, Lpo/e;->E:I

    const/4 p1, 0x0

    const/4 p2, 0x0

    if-nez p6, :cond_0

    new-instance p6, Lpo/c;

    invoke-direct {p6, p2, p1, p1}, Lpo/c;-><init>(Z[BLjava/lang/String;)V

    :cond_0
    iput-object p6, p0, Lpo/e;->F:Lpo/c;

    if-nez p7, :cond_1

    new-instance p7, Lpo/b;

    invoke-direct {p7, p2, p1}, Lpo/b;-><init>(ZLjava/lang/String;)V

    :cond_1
    iput-object p7, p0, Lpo/e;->G:Lpo/b;

    iput-boolean p8, p0, Lpo/e;->H:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lpo/e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lpo/e;

    iget-object v0, p0, Lpo/e;->w:Lpo/d;

    iget-object v2, p1, Lpo/e;->w:Lpo/d;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lpo/e;->x:Lpo/a;

    iget-object v2, p1, Lpo/e;->x:Lpo/a;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lpo/e;->F:Lpo/c;

    iget-object v2, p1, Lpo/e;->F:Lpo/c;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lpo/e;->G:Lpo/b;

    iget-object v2, p1, Lpo/e;->G:Lpo/b;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lpo/e;->y:Ljava/lang/String;

    iget-object v2, p1, Lpo/e;->y:Ljava/lang/String;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lpo/e;->z:Z

    iget-boolean v2, p1, Lpo/e;->z:Z

    if-ne v0, v2, :cond_1

    iget v0, p0, Lpo/e;->E:I

    iget v2, p1, Lpo/e;->E:I

    if-ne v0, v2, :cond_1

    iget-boolean v0, p0, Lpo/e;->H:Z

    iget-boolean p1, p1, Lpo/e;->H:Z

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 9

    iget-boolean v0, p0, Lpo/e;->z:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    iget v0, p0, Lpo/e;->E:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iget-boolean v0, p0, Lpo/e;->H:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    iget-object v1, p0, Lpo/e;->w:Lpo/d;

    iget-object v2, p0, Lpo/e;->x:Lpo/a;

    iget-object v3, p0, Lpo/e;->F:Lpo/c;

    iget-object v4, p0, Lpo/e;->G:Lpo/b;

    iget-object v5, p0, Lpo/e;->y:Ljava/lang/String;

    filled-new-array/range {v1 .. v8}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const/16 v0, 0x4f45

    invoke-static {p1, v0}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v0

    const/4 v1, 0x1

    iget-object v2, p0, Lpo/e;->w:Lpo/d;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 v1, 0x2

    iget-object v2, p0, Lpo/e;->x:Lpo/a;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 v1, 0x3

    iget-object v2, p0, Lpo/e;->y:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x4

    invoke-static {p1, v1, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget-boolean v2, p0, Lpo/e;->z:Z

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v2, 0x5

    invoke-static {p1, v2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v2, p0, Lpo/e;->E:I

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v2, 0x6

    iget-object v3, p0, Lpo/e;->F:Lpo/c;

    invoke-static {p1, v2, v3, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 v2, 0x7

    iget-object v3, p0, Lpo/e;->G:Lpo/b;

    invoke-static {p1, v2, v3, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/16 p2, 0x8

    invoke-static {p1, p2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget-boolean p2, p0, Lpo/e;->H:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p1, v0}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
