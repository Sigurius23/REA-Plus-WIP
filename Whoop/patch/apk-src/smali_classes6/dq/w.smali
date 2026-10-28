.class public final Ldq/w;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ldq/w;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:I

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lay/b;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lay/b;-><init>(I)V

    sput-object v0, Ldq/w;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldq/w;->w:Ljava/lang/String;

    iput-object p2, p0, Ldq/w;->x:Ljava/lang/String;

    iput p3, p0, Ldq/w;->y:I

    iput p4, p0, Ldq/w;->z:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const/16 p2, 0x4f45

    invoke-static {p1, p2}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result p2

    const/4 v0, 0x2

    iget-object v1, p0, Ldq/w;->w:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Ldq/w;->x:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v0, 0x4

    invoke-static {p1, v0, v0}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v1, p0, Ldq/w;->y:I

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v1, 0x5

    invoke-static {p1, v1, v0}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v0, p0, Ldq/w;->z:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p1, p2}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
