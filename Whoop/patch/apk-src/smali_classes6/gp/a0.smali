.class public final Lgp/a0;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lgp/a0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Lgp/z;

.field public final x:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lgp/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lgp/k0;-><init>(I)V

    sput-object v0, Lgp/a0;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lgp/a0;

    const-string v1, "supported"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lgp/a0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lgp/a0;

    const-string v1, "not-supported"

    invoke-direct {v0, v1, v2}, Lgp/a0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Luo/w;->f(Ljava/lang/Object;)V

    :try_start_0
    invoke-static {p1}, Lgp/z;->b(Ljava/lang/String;)Lgp/z;

    move-result-object p1

    iput-object p1, p0, Lgp/a0;->w:Lgp/z;
    :try_end_0
    .catch Lcom/google/android/gms/fido/fido2/api/common/TokenBinding$UnsupportedTokenBindingStatusException; {:try_start_0 .. :try_end_0} :catch_0

    iput-object p2, p0, Lgp/a0;->x:Ljava/lang/String;

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lgp/a0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lgp/a0;

    iget-object v0, p0, Lgp/a0;->w:Lgp/z;

    iget-object v2, p1, Lgp/a0;->w:Lgp/z;

    invoke-static {v0, v2}, Lmp/b;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lgp/a0;->x:Ljava/lang/String;

    iget-object p1, p1, Lgp/a0;->x:Ljava/lang/String;

    invoke-static {v0, p1}, Lmp/b;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lgp/a0;->w:Lgp/z;

    iget-object v1, p0, Lgp/a0;->x:Ljava/lang/String;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const/16 p2, 0x4f45

    invoke-static {p1, p2}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result p2

    iget-object v0, p0, Lgp/a0;->w:Lgp/z;

    iget-object v0, v0, Lgp/z;->w:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lgp/a0;->x:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    invoke-static {p1, p2}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
