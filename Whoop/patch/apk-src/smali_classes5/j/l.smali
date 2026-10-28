.class public final Lj/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lj/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Landroid/content/IntentSender;

.field public final x:Landroid/content/Intent;

.field public final y:I

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgp/r0;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lgp/r0;-><init>(I)V

    sput-object v0, Lj/l;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V
    .locals 1

    const-string v0, "intentSender"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/l;->w:Landroid/content/IntentSender;

    iput-object p2, p0, Lj/l;->x:Landroid/content/Intent;

    iput p3, p0, Lj/l;->y:I

    iput p4, p0, Lj/l;->z:I

    return-void
.end method


# virtual methods
.method public final b()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lj/l;->x:Landroid/content/Intent;

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lj/l;->y:I

    return v0
.end method

.method public final h()I
    .locals 1

    iget v0, p0, Lj/l;->z:I

    return v0
.end method

.method public final i()Landroid/content/IntentSender;
    .locals 1

    iget-object v0, p0, Lj/l;->w:Landroid/content/IntentSender;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj/l;->w:Landroid/content/IntentSender;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lj/l;->x:Landroid/content/Intent;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget p2, p0, Lj/l;->y:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lj/l;->z:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
