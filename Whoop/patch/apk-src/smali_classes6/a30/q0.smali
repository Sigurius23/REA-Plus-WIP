.class public final La30/q0;
.super La30/t0;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "La30/q0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Lh20/u2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La10/a;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, La10/a;-><init>(I)V

    sput-object v0, La30/q0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lh20/u2;)V
    .locals 1

    const-string v0, "intentConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La30/q0;->w:Lh20/u2;

    return-void
.end method


# virtual methods
.method public final b(Ld10/b;)Lv00/a0;
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p1, Ld10/b;->a:Lh20/b;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    new-instance p1, Lv00/w;

    iget-object v0, p0, La30/q0;->w:Lh20/u2;

    invoke-direct {p1, v0}, Lv00/w;-><init>(Lh20/u2;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No callback for deferred intent."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, La30/q0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, La30/q0;

    iget-object v1, p0, La30/q0;->w:Lh20/u2;

    iget-object p1, p1, La30/q0;->w:Lh20/u2;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final f()V
    .locals 4

    iget-object v0, p0, La30/q0;->w:Lh20/u2;

    iget-object v0, v0, Lh20/u2;->w:Lh20/r2;

    instance-of v1, v0, Lh20/p2;

    if-eqz v1, :cond_0

    check-cast v0, Lh20/p2;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-wide v0, v0, Lh20/p2;->w:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Payment IntentConfiguration requires a positive amount."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    return-void
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, La30/q0;->w:Lh20/u2;

    invoke-virtual {v0}, Lh20/u2;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DeferredIntent(intentConfiguration="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, La30/q0;->w:Lh20/u2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La30/q0;->w:Lh20/u2;

    invoke-virtual {v0, p1, p2}, Lh20/u2;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
