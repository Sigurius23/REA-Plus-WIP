.class public final Lpn/k;
.super Lpn/c;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lpn/k;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:J

.field public final x:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpn/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lpn/a;-><init>(I)V

    sput-object v0, Lpn/k;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lpn/k;->w:J

    iput-wide p3, p0, Lpn/k;->x:J

    return-void
.end method

.method public static b(JLed3/a;)J
    .locals 6

    invoke-virtual {p2}, Led3/a;->y()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x80

    and-long/2addr v2, v0

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    const-wide/16 v2, 0x1

    and-long/2addr v0, v2

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    invoke-virtual {p2}, Led3/a;->z()J

    move-result-wide v2

    or-long/2addr v0, v2

    add-long/2addr v0, p0

    const-wide p0, 0x1ffffffffL

    and-long/2addr p0, v0

    return-wide p0

    :cond_0
    const-wide p0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide p0
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget-wide v0, p0, Lpn/k;->w:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lpn/k;->x:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method
