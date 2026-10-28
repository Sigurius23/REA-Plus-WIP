.class public final Ly00/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly00/e8;
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ly00/w;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Ly00/p;

.field public final F:Ly00/x2;

.field public final G:Ljava/lang/Boolean;

.field public final H:Ljava/lang/String;

.field public final I:Ly00/v;

.field public final J:Ly00/n;

.field public final w:Ljava/lang/String;

.field public final x:Ly00/d5;

.field public final y:Ljava/lang/String;

.field public final z:Ly00/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly00/k;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Ly00/k;-><init>(I)V

    sput-object v0, Ly00/w;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ly00/d5;Ljava/lang/String;Ly00/o;Ly00/p;Ly00/x2;Ljava/lang/Boolean;Ljava/lang/String;Ly00/v;Ly00/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly00/w;->w:Ljava/lang/String;

    iput-object p2, p0, Ly00/w;->x:Ly00/d5;

    iput-object p3, p0, Ly00/w;->y:Ljava/lang/String;

    iput-object p4, p0, Ly00/w;->z:Ly00/o;

    iput-object p5, p0, Ly00/w;->E:Ly00/p;

    iput-object p6, p0, Ly00/w;->F:Ly00/x2;

    iput-object p7, p0, Ly00/w;->G:Ljava/lang/Boolean;

    iput-object p8, p0, Ly00/w;->H:Ljava/lang/String;

    iput-object p9, p0, Ly00/w;->I:Ly00/v;

    iput-object p10, p0, Ly00/w;->J:Ly00/n;

    return-void
.end method


# virtual methods
.method public final c0()Ljava/util/Map;
    .locals 4

    new-instance v0, Ln83/f;

    invoke-direct {v0}, Ln83/f;-><init>()V

    iget-object v1, p0, Ly00/w;->w:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v2, "payment_method"

    invoke-virtual {v0, v2, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, Ly00/w;->x:Ly00/d5;

    if-eqz v1, :cond_1

    const-string v2, "payment_method_data"

    invoke-virtual {v1}, Ly00/d5;->c0()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v1, p0, Ly00/w;->y:Ljava/lang/String;

    if-eqz v1, :cond_2

    const-string v2, "return_url"

    invoke-virtual {v0, v2, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v1, p0, Ly00/w;->z:Ly00/o;

    if-eqz v1, :cond_3

    sget-object v2, Ly00/o;->z:Ly00/o;

    if-eq v1, v2, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_4

    const-string v2, "setup_future_usage"

    iget-object v1, v1, Ly00/o;->w:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    iget-object v1, p0, Ly00/w;->E:Ly00/p;

    if-eqz v1, :cond_5

    const-string v2, "shipping"

    invoke-virtual {v1}, Ly00/p;->c0()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iget-object v1, p0, Ly00/w;->F:Ly00/x2;

    if-eqz v1, :cond_6

    const-string v2, "mandate_data"

    invoke-virtual {v1}, Ly00/x2;->c0()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    iget-object v1, p0, Ly00/w;->G:Ljava/lang/Boolean;

    if-eqz v1, :cond_7

    const-string v2, "set_as_default_payment_method"

    invoke-virtual {v0, v2, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    iget-object v1, p0, Ly00/w;->H:Ljava/lang/String;

    if-eqz v1, :cond_8

    const-string v2, "cvc"

    invoke-static {v2, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    new-instance v2, Ll83/k;

    const-string v3, "card"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "payment_method_options"

    invoke-virtual {v0, v2, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    iget-object v1, p0, Ly00/w;->I:Ly00/v;

    if-eqz v1, :cond_9

    const-string v2, "client_context"

    invoke-virtual {v1}, Ly00/v;->c0()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    iget-object v1, p0, Ly00/w;->J:Ly00/n;

    if-eqz v1, :cond_a

    const-string v2, "client_attribution_metadata"

    invoke-virtual {v1}, Ly00/n;->c0()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    invoke-virtual {v0}, Ln83/f;->b()Ln83/f;

    move-result-object v0

    return-object v0
.end method

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
    instance-of v1, p1, Ly00/w;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly00/w;

    iget-object v1, p0, Ly00/w;->w:Ljava/lang/String;

    iget-object v3, p1, Ly00/w;->w:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ly00/w;->x:Ly00/d5;

    iget-object v3, p1, Ly00/w;->x:Ly00/d5;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ly00/w;->y:Ljava/lang/String;

    iget-object v3, p1, Ly00/w;->y:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ly00/w;->z:Ly00/o;

    iget-object v3, p1, Ly00/w;->z:Ly00/o;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ly00/w;->E:Ly00/p;

    iget-object v3, p1, Ly00/w;->E:Ly00/p;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Ly00/w;->F:Ly00/x2;

    iget-object v3, p1, Ly00/w;->F:Ly00/x2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Ly00/w;->G:Ljava/lang/Boolean;

    iget-object v3, p1, Ly00/w;->G:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Ly00/w;->H:Ljava/lang/String;

    iget-object v3, p1, Ly00/w;->H:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Ly00/w;->I:Ly00/v;

    iget-object v3, p1, Ly00/w;->I:Ly00/v;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Ly00/w;->J:Ly00/n;

    iget-object p1, p1, Ly00/w;->J:Ly00/n;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Ly00/w;->w:Ljava/lang/String;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ly00/w;->x:Ly00/d5;

    if-nez v2, :cond_1

    move v2, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ly00/d5;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ly00/w;->y:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ly00/w;->z:Ly00/o;

    if-nez v2, :cond_3

    move v2, v0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ly00/w;->E:Ly00/p;

    if-nez v2, :cond_4

    move v2, v0

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ly00/p;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ly00/w;->F:Ly00/x2;

    if-nez v2, :cond_5

    move v2, v0

    goto :goto_5

    :cond_5
    iget-object v2, v2, Ly00/x2;->w:Ly00/w2;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ly00/w;->G:Ljava/lang/Boolean;

    if-nez v2, :cond_6

    move v2, v0

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ly00/w;->H:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v0

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ly00/w;->I:Ly00/v;

    if-nez v2, :cond_8

    move v2, v0

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ly00/v;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ly00/w;->J:Ly00/n;

    if-nez v2, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ly00/n;->hashCode()I

    move-result v0

    :goto_9
    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ConfirmationTokenParams(paymentMethodId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ly00/w;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentMethodData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/w;->x:Ly00/d5;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", returnUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/w;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", setUpFutureUsage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/w;->z:Ly00/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shipping="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/w;->E:Ly00/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mandateDataParams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/w;->F:Ly00/x2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", setAsDefaultPaymentMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", cvc="

    const-string v2, ", clientContext="

    iget-object v3, p0, Ly00/w;->G:Ljava/lang/Boolean;

    iget-object v4, p0, Ly00/w;->H:Ljava/lang/String;

    invoke-static {v3, v1, v4, v2, v0}, Lev/n;->w(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v1, p0, Ly00/w;->I:Ly00/v;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clientAttributionMetadata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/w;->J:Ly00/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly00/w;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Ly00/w;->x:Ly00/d5;

    if-nez v2, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/d5;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v2, p0, Ly00/w;->y:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/w;->z:Ly00/o;

    if-nez v2, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_1
    iget-object v2, p0, Ly00/w;->E:Ly00/p;

    if-nez v2, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/p;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    iget-object v2, p0, Ly00/w;->F:Ly00/x2;

    if-nez v2, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/x2;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_3
    iget-object v2, p0, Ly00/w;->G:Ljava/lang/Boolean;

    if-nez v2, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_4

    :cond_4
    invoke-static {p1, v0, v2}, Lvl/b;->s(Landroid/os/Parcel;ILjava/lang/Boolean;)V

    :goto_4
    iget-object v2, p0, Ly00/w;->H:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/w;->I:Ly00/v;

    if-nez v2, :cond_5

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/v;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_5
    iget-object v2, p0, Ly00/w;->J:Ly00/n;

    if-nez v2, :cond_6

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_6
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/n;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
