.class public final Lz10/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvy/b;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz10/m;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz10/k;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lz10/k;-><init>(I)V

    sput-object v0, Lz10/m;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V
    .locals 1

    const-string v0, "financialConnectionsSession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz10/m;->w:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    return-void
.end method


# virtual methods
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
    instance-of v1, p1, Lz10/m;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lz10/m;

    iget-object v1, p0, Lz10/m;->w:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    iget-object p1, p1, Lz10/m;->w:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lz10/m;->w:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "USBankAccountData(financialConnectionsSession="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lz10/m;->w:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

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

    iget-object v0, p0, Lz10/m;->w:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
