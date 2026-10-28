.class public final Lwp/g;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lwp/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv00/g0;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lv00/g0;-><init>(I)V

    sput-object v0, Lwp/g;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "json must not be null"

    invoke-static {p1, v0}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lwp/g;->w:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const/16 p2, 0x4f45

    invoke-static {p1, p2}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result p2

    const/4 v0, 0x2

    iget-object v1, p0, Lwp/g;->w:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    invoke-static {p1, p2}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
