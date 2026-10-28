.class public final Lgq/f;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lgq/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public w:J

.field public x:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgp/r0;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lgp/r0;-><init>(I)V

    sput-object v0, Lgq/f;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const/16 p2, 0x4f45

    invoke-static {p1, p2}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result p2

    iget-wide v0, p0, Lgq/f;->w:J

    const/4 v2, 0x2

    const/16 v3, 0x8

    invoke-static {p1, v2, v3}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lgq/f;->x:J

    const/4 v2, 0x3

    invoke-static {p1, v2, v3}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    invoke-static {p1, p2}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
