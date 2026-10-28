.class public final Ld00/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ld00/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Z

.field public final F:Ljava/lang/String;

.field public final G:Ljava/lang/String;

.field public final H:Ljava/lang/String;

.field public final I:Z

.field public final J:Z

.field public final K:Z

.field public final L:Ld00/f;

.field public final M:Ljava/lang/String;

.field public final w:Lcom/stripe/android/model/ConsumerSession;

.field public final x:Ljava/lang/String;

.field public final y:Lcom/stripe/android/model/DisplayablePaymentDetails;

.field public final z:Ld00/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lay/b;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lay/b;-><init>(I)V

    sput-object v0, Ld00/l;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Ld00/m;Z)V
    .locals 2

    const-string v0, "consumerSession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld00/l;->w:Lcom/stripe/android/model/ConsumerSession;

    iput-object p2, p0, Ld00/l;->x:Ljava/lang/String;

    iput-object p3, p0, Ld00/l;->y:Lcom/stripe/android/model/DisplayablePaymentDetails;

    iput-object p4, p0, Ld00/l;->z:Ld00/m;

    iput-boolean p5, p0, Ld00/l;->E:Z

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getRedactedFormattedPhoneNumber()Ljava/lang/String;

    move-result-object p2

    const-string p3, "*"

    const-string p4, "\u2022"

    const/4 p5, 0x0

    invoke-static {p2, p3, p4, p5}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ld00/l;->F:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getClientSecret()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ld00/l;->G:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getEmailAddress()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ld00/l;->H:Ljava/lang/String;

    invoke-static {p1}, Ld00/l;->b(Lcom/stripe/android/model/ConsumerSession;)Z

    move-result p2

    iput-boolean p2, p0, Ld00/l;->I:Z

    invoke-static {p1}, Ld00/l;->b(Lcom/stripe/android/model/ConsumerSession;)Z

    move-result p2

    const/4 p3, 0x0

    if-nez p2, :cond_2

    invoke-static {p1}, Ld00/l;->h(Lcom/stripe/android/model/ConsumerSession;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getVerificationSessions()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object p4, p2

    check-cast p4, Lcom/stripe/android/model/ConsumerSession$VerificationSession;

    invoke-virtual {p4}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->getType()Lcom/stripe/android/model/v;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/model/v;->z:Lcom/stripe/android/model/v;

    if-ne v0, v1, :cond_0

    invoke-virtual {p4}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->getState()Lcom/stripe/android/model/s;

    move-result-object p4

    sget-object v0, Lcom/stripe/android/model/s;->E:Lcom/stripe/android/model/s;

    if-ne p4, v0, :cond_0

    goto :goto_0

    :cond_1
    move-object p2, p3

    :goto_0
    if-eqz p2, :cond_3

    :cond_2
    const/4 p5, 0x1

    :cond_3
    iput-boolean p5, p0, Ld00/l;->J:Z

    iget-object p1, p0, Ld00/l;->w:Lcom/stripe/android/model/ConsumerSession;

    invoke-static {p1}, Ld00/l;->h(Lcom/stripe/android/model/ConsumerSession;)Z

    move-result p1

    iput-boolean p1, p0, Ld00/l;->K:Z

    if-eqz p5, :cond_5

    new-instance p1, Ld00/e;

    iget-boolean p2, p0, Ld00/l;->I:Z

    iget-object p4, p0, Ld00/l;->z:Ld00/m;

    if-eqz p4, :cond_4

    iget-object p4, p4, Ld00/m;->x:Ld00/k;

    goto :goto_1

    :cond_4
    move-object p4, p3

    :goto_1
    invoke-direct {p1, p2, p4}, Ld00/e;-><init>(ZLd00/k;)V

    goto :goto_4

    :cond_5
    iget-object p1, p0, Ld00/l;->w:Lcom/stripe/android/model/ConsumerSession;

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getVerificationSessions()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object p4, p2

    check-cast p4, Lcom/stripe/android/model/ConsumerSession$VerificationSession;

    invoke-virtual {p4}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->getType()Lcom/stripe/android/model/v;

    move-result-object p5

    sget-object v0, Lcom/stripe/android/model/v;->F:Lcom/stripe/android/model/v;

    if-ne p5, v0, :cond_6

    invoke-virtual {p4}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->getState()Lcom/stripe/android/model/s;

    move-result-object p4

    sget-object p5, Lcom/stripe/android/model/s;->z:Lcom/stripe/android/model/s;

    if-ne p4, p5, :cond_6

    goto :goto_2

    :cond_7
    move-object p2, p3

    :goto_2
    if-eqz p2, :cond_8

    sget-object p1, Ld00/d;->a:Ld00/d;

    goto :goto_4

    :cond_8
    iget-object p1, p0, Ld00/l;->w:Lcom/stripe/android/model/ConsumerSession;

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getMobileFallbackWebviewParams()Lcom/stripe/android/model/MobileFallbackWebviewParams;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lcom/stripe/android/model/MobileFallbackWebviewParams;->getWebviewOpenUrl()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_9

    invoke-virtual {p1}, Lcom/stripe/android/model/MobileFallbackWebviewParams;->getWebViewRequirementType()Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

    move-result-object p1

    sget-object p4, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;->Required:Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

    if-ne p1, p4, :cond_9

    goto :goto_3

    :cond_9
    move-object p2, p3

    :goto_3
    new-instance p1, Ld00/b;

    invoke-direct {p1, p2}, Ld00/b;-><init>(Ljava/lang/String;)V

    :goto_4
    iput-object p1, p0, Ld00/l;->L:Ld00/f;

    iget-object p1, p0, Ld00/l;->w:Lcom/stripe/android/model/ConsumerSession;

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getMobileFallbackWebviewParams()Lcom/stripe/android/model/MobileFallbackWebviewParams;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lcom/stripe/android/model/MobileFallbackWebviewParams;->getWebviewOpenUrl()Ljava/lang/String;

    move-result-object p3

    :cond_a
    iput-object p3, p0, Ld00/l;->M:Ljava/lang/String;

    return-void
.end method

.method public static b(Lcom/stripe/android/model/ConsumerSession;)Z
    .locals 4

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerSession;->getVerificationSessions()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/model/ConsumerSession$VerificationSession;

    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->getType()Lcom/stripe/android/model/v;

    move-result-object v2

    sget-object v3, Lcom/stripe/android/model/v;->F:Lcom/stripe/android/model/v;

    if-ne v2, v3, :cond_0

    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->getState()Lcom/stripe/android/model/s;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/model/s;->E:Lcom/stripe/android/model/s;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static h(Lcom/stripe/android/model/ConsumerSession;)Z
    .locals 4

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerSession;->getVerificationSessions()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/model/ConsumerSession$VerificationSession;

    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->getType()Lcom/stripe/android/model/v;

    move-result-object v2

    sget-object v3, Lcom/stripe/android/model/v;->E:Lcom/stripe/android/model/v;

    if-ne v2, v3, :cond_0

    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->getState()Lcom/stripe/android/model/s;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/model/s;->z:Lcom/stripe/android/model/s;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
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
    instance-of v1, p1, Ld00/l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ld00/l;

    iget-object v1, p0, Ld00/l;->w:Lcom/stripe/android/model/ConsumerSession;

    iget-object v3, p1, Ld00/l;->w:Lcom/stripe/android/model/ConsumerSession;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ld00/l;->x:Ljava/lang/String;

    iget-object v3, p1, Ld00/l;->x:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ld00/l;->y:Lcom/stripe/android/model/DisplayablePaymentDetails;

    iget-object v3, p1, Ld00/l;->y:Lcom/stripe/android/model/DisplayablePaymentDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ld00/l;->z:Ld00/m;

    iget-object v3, p1, Ld00/l;->z:Ld00/m;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Ld00/l;->E:Z

    iget-boolean p1, p1, Ld00/l;->E:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Ld00/l;->w:Lcom/stripe/android/model/ConsumerSession;

    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerSession;->getUnredactedPhoneNumber()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerSession;->getPhoneNumberCountry()Ljava/lang/String;

    move-result-object v0

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    sget-object v2, Lg40/k2;->a:Li93/c;

    invoke-static {v0}, Lds/p;->E(Ljava/lang/String;)Lg40/k2;

    move-result-object v0

    invoke-virtual {v0, v1}, Lg40/k2;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Ld00/l;->w:Lcom/stripe/android/model/ConsumerSession;

    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerSession;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x0

    iget-object v2, p0, Ld00/l;->x:Ljava/lang/String;

    if-nez v2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Ld00/l;->y:Lcom/stripe/android/model/DisplayablePaymentDetails;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/stripe/android/model/DisplayablePaymentDetails;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Ld00/l;->z:Ld00/m;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ld00/m;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Ld00/l;->E:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LinkAccount(consumerSession="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ld00/l;->w:Lcom/stripe/android/model/ConsumerSession;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", consumerPublishableKey="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld00/l;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", displayablePaymentDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld00/l;->y:Lcom/stripe/android/model/DisplayablePaymentDetails;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", linkAuthIntentInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld00/l;->z:Ld00/m;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", viewedWebviewOpenUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    iget-boolean v2, p0, Ld00/l;->E:Z

    invoke-static {v0, v2, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld00/l;->w:Lcom/stripe/android/model/ConsumerSession;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Ld00/l;->x:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Ld00/l;->y:Lcom/stripe/android/model/DisplayablePaymentDetails;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Ld00/l;->z:Ld00/m;

    if-nez v0, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Ld00/m;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-boolean p2, p0, Ld00/l;->E:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
