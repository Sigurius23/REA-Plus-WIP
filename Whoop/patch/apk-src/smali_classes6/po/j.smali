.class public final Lpo/j;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lpo/j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Landroid/net/Uri;

.field public final F:Ljava/lang/String;

.field public final G:Ljava/lang/String;

.field public final H:Ljava/lang/String;

.field public final I:Lgp/q;

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/String;

.field public final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpn/a;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lpn/a;-><init>(I)V

    sput-object v0, Lpo/j;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgp/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Luo/w;->f(Ljava/lang/Object;)V

    iput-object p1, p0, Lpo/j;->w:Ljava/lang/String;

    iput-object p2, p0, Lpo/j;->x:Ljava/lang/String;

    iput-object p3, p0, Lpo/j;->y:Ljava/lang/String;

    iput-object p4, p0, Lpo/j;->z:Ljava/lang/String;

    iput-object p5, p0, Lpo/j;->E:Landroid/net/Uri;

    iput-object p6, p0, Lpo/j;->F:Ljava/lang/String;

    iput-object p7, p0, Lpo/j;->G:Ljava/lang/String;

    iput-object p8, p0, Lpo/j;->H:Ljava/lang/String;

    iput-object p9, p0, Lpo/j;->I:Lgp/q;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lpo/j;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lpo/j;

    iget-object v0, p0, Lpo/j;->w:Ljava/lang/String;

    iget-object v2, p1, Lpo/j;->w:Ljava/lang/String;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lpo/j;->x:Ljava/lang/String;

    iget-object v2, p1, Lpo/j;->x:Ljava/lang/String;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lpo/j;->y:Ljava/lang/String;

    iget-object v2, p1, Lpo/j;->y:Ljava/lang/String;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lpo/j;->z:Ljava/lang/String;

    iget-object v2, p1, Lpo/j;->z:Ljava/lang/String;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lpo/j;->E:Landroid/net/Uri;

    iget-object v2, p1, Lpo/j;->E:Landroid/net/Uri;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lpo/j;->F:Ljava/lang/String;

    iget-object v2, p1, Lpo/j;->F:Ljava/lang/String;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lpo/j;->G:Ljava/lang/String;

    iget-object v2, p1, Lpo/j;->G:Ljava/lang/String;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lpo/j;->H:Ljava/lang/String;

    iget-object v2, p1, Lpo/j;->H:Ljava/lang/String;

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lpo/j;->I:Lgp/q;

    iget-object p1, p1, Lpo/j;->I:Lgp/q;

    invoke-static {v0, p1}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 9

    iget-object v7, p0, Lpo/j;->H:Ljava/lang/String;

    iget-object v8, p0, Lpo/j;->I:Lgp/q;

    iget-object v0, p0, Lpo/j;->w:Ljava/lang/String;

    iget-object v1, p0, Lpo/j;->x:Ljava/lang/String;

    iget-object v2, p0, Lpo/j;->y:Ljava/lang/String;

    iget-object v3, p0, Lpo/j;->z:Ljava/lang/String;

    iget-object v4, p0, Lpo/j;->E:Landroid/net/Uri;

    iget-object v5, p0, Lpo/j;->F:Ljava/lang/String;

    iget-object v6, p0, Lpo/j;->G:Ljava/lang/String;

    filled-new-array/range {v0 .. v8}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const/16 v0, 0x4f45

    invoke-static {p1, v0}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v0

    const/4 v1, 0x1

    iget-object v2, p0, Lpo/j;->w:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lpo/j;->x:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lpo/j;->y:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lpo/j;->z:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lpo/j;->E:Landroid/net/Uri;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 v1, 0x6

    iget-object v2, p0, Lpo/j;->F:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lpo/j;->G:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/16 v1, 0x8

    iget-object v2, p0, Lpo/j;->H:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/16 v1, 0x9

    iget-object v2, p0, Lpo/j;->I:Lgp/q;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    invoke-static {p1, v0}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
