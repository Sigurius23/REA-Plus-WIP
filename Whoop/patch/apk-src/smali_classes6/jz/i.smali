.class public final Ljz/i;
.super Ljz/k;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ljz/i;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

.field public final x:Ly00/g8;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljz/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljz/h;-><init>(I)V

    sput-object v0, Ljz/i;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Ly00/g8;)V
    .locals 1

    const-string v0, "financialConnectionsSession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "token"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljz/i;->w:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    iput-object p2, p0, Ljz/i;->x:Ly00/g8;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljz/i;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ljz/i;

    iget-object v1, p0, Ljz/i;->w:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    iget-object v3, p1, Ljz/i;->w:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ljz/i;->x:Ly00/g8;

    iget-object p1, p1, Ljz/i;->x:Ly00/g8;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Ljz/i;->w:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ljz/i;->x:Ly00/g8;

    invoke-virtual {v1}, Ly00/g8;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Completed(financialConnectionsSession="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ljz/i;->w:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", token="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ljz/i;->x:Ly00/g8;

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

    iget-object v0, p0, Ljz/i;->w:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Ljz/i;->x:Ly00/g8;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
