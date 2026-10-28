.class public final Lpn/b;
.super Lpn/c;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lpn/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:J

.field public final x:J

.field public final y:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpn/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpn/a;-><init>(I)V

    sput-object v0, Lpn/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(J[BJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p4, p0, Lpn/b;->w:J

    .line 3
    iput-wide p1, p0, Lpn/b;->x:J

    .line 4
    iput-object p3, p0, Lpn/b;->y:[B

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lpn/b;->w:J

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lpn/b;->x:J

    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p1

    sget v0, Llo/y;->a:I

    iput-object p1, p0, Lpn/b;->y:[B

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget-wide v0, p0, Lpn/b;->w:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lpn/b;->x:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p2, p0, Lpn/b;->y:[B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    return-void
.end method
