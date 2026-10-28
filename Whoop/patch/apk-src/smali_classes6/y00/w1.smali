.class public final Ly00/w1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly00/b2;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ly00/w1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Ljava/lang/String;

.field public final F:Ljava/lang/String;

.field public final G:Ljava/lang/String;

.field public final H:Ljava/lang/String;

.field public final I:Ljava/lang/String;

.field public final J:Ly00/z1;

.field public final K:Ly00/x1;

.field public final L:Ljava/lang/String;

.field public final w:Ljava/lang/String;

.field public final x:Ly00/a1;

.field public final y:Ljava/util/List;

.field public final z:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly00/x0;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Ly00/x0;-><init>(I)V

    sput-object v0, Ly00/w1;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ly00/a1;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/z1;Ly00/x1;Ljava/lang/String;)V
    .locals 1

    const-string v0, "deferredIntentParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customPaymentMethods"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "externalPaymentMethods"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appId"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "link"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ly00/w1;->w:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Ly00/w1;->x:Ly00/a1;

    .line 4
    iput-object p3, p0, Ly00/w1;->y:Ljava/util/List;

    .line 5
    iput-object p4, p0, Ly00/w1;->z:Ljava/util/List;

    .line 6
    iput-object p5, p0, Ly00/w1;->E:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Ly00/w1;->F:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Ly00/w1;->G:Ljava/lang/String;

    .line 9
    iput-object p8, p0, Ly00/w1;->H:Ljava/lang/String;

    .line 10
    iput-object p9, p0, Ly00/w1;->I:Ljava/lang/String;

    .line 11
    iput-object p10, p0, Ly00/w1;->J:Ly00/z1;

    .line 12
    iput-object p11, p0, Ly00/w1;->K:Ly00/x1;

    .line 13
    iput-object p12, p0, Ly00/w1;->L:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ly00/a1;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/z1;Ly00/x1;Ljava/lang/String;)V
    .locals 14

    .line 14
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v2

    move-object v1, p0

    move-object v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    .line 15
    invoke-direct/range {v1 .. v13}, Ly00/w1;-><init>(Ljava/lang/String;Ly00/a1;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/z1;Ly00/x1;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final E()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly00/w1;->F:Ljava/lang/String;

    return-object v0
.end method

.method public final Q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly00/w1;->H:Ljava/lang/String;

    return-object v0
.end method

.method public final U()Ly00/x1;
    .locals 1

    iget-object v0, p0, Ly00/w1;->K:Ly00/x1;

    return-object v0
.end method

.method public final W()Ly00/z1;
    .locals 1

    iget-object v0, p0, Ly00/w1;->J:Ly00/z1;

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
    instance-of v1, p1, Ly00/w1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly00/w1;

    iget-object v1, p0, Ly00/w1;->w:Ljava/lang/String;

    iget-object v3, p1, Ly00/w1;->w:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ly00/w1;->x:Ly00/a1;

    iget-object v3, p1, Ly00/w1;->x:Ly00/a1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ly00/w1;->y:Ljava/util/List;

    iget-object v3, p1, Ly00/w1;->y:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ly00/w1;->z:Ljava/util/List;

    iget-object v3, p1, Ly00/w1;->z:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ly00/w1;->E:Ljava/lang/String;

    iget-object v3, p1, Ly00/w1;->E:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Ly00/w1;->F:Ljava/lang/String;

    iget-object v3, p1, Ly00/w1;->F:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Ly00/w1;->G:Ljava/lang/String;

    iget-object v3, p1, Ly00/w1;->G:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Ly00/w1;->H:Ljava/lang/String;

    iget-object v3, p1, Ly00/w1;->H:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Ly00/w1;->I:Ljava/lang/String;

    iget-object v3, p1, Ly00/w1;->I:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Ly00/w1;->J:Ly00/z1;

    iget-object v3, p1, Ly00/w1;->J:Ly00/z1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Ly00/w1;->K:Ly00/x1;

    iget-object v3, p1, Ly00/w1;->K:Ly00/x1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Ly00/w1;->L:Ljava/lang/String;

    iget-object p1, p1, Ly00/w1;->L:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final f0()Ljava/util/List;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method

.method public final getClientSecret()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    const-string v0, "deferred_intent"

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Ly00/w1;->w:Ljava/lang/String;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/w1;->x:Ly00/a1;

    invoke-virtual {v3}, Ly00/a1;->hashCode()I

    move-result v3

    add-int/2addr v3, v1

    mul-int/2addr v3, v2

    iget-object v1, p0, Ly00/w1;->y:Ljava/util/List;

    invoke-static {v3, v2, v1}, Ldc/b;->b(IILjava/util/List;)I

    move-result v1

    iget-object v3, p0, Ly00/w1;->z:Ljava/util/List;

    invoke-static {v1, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v1

    iget-object v3, p0, Ly00/w1;->E:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/w1;->F:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v0

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/w1;->G:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v0

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/w1;->H:Ljava/lang/String;

    if-nez v3, :cond_4

    move v3, v0

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/w1;->I:Ljava/lang/String;

    invoke-static {v1, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v1

    iget-object v3, p0, Ly00/w1;->J:Ly00/z1;

    if-nez v3, :cond_5

    move v3, v0

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ly00/z1;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/w1;->K:Ly00/x1;

    iget-object v3, v3, Ly00/x1;->w:Ljava/util/Set;

    invoke-static {v3, v1, v2}, Lm4/a;->a(Ljava/util/Set;II)I

    move-result v1

    iget-object v2, p0, Ly00/w1;->L:Ljava/lang/String;

    if-nez v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_6
    add-int/2addr v1, v0

    return v1
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly00/w1;->G:Ljava/lang/String;

    return-object v0
.end method

.method public final r()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ly00/w1;->z:Ljava/util/List;

    return-object v0
.end method

.method public final r0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly00/w1;->I:Ljava/lang/String;

    return-object v0
.end method

.method public final s0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly00/w1;->w:Ljava/lang/String;

    return-object v0
.end method

.method public final t()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly00/w1;->E:Ljava/lang/String;

    return-object v0
.end method

.method public final t0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ly00/w1;->y:Ljava/util/List;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DeferredIntentType(locale="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ly00/w1;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", deferredIntentParams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/w1;->x:Ly00/a1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", customPaymentMethods="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", externalPaymentMethods="

    const-string v2, ", savedPaymentMethodSelectionId="

    iget-object v3, p0, Ly00/w1;->y:Ljava/util/List;

    iget-object v4, p0, Ly00/w1;->z:Ljava/util/List;

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    const-string v1, ", customerSessionClientSecret="

    const-string v2, ", legacyCustomerEphemeralKey="

    iget-object v3, p0, Ly00/w1;->E:Ljava/lang/String;

    iget-object v4, p0, Ly00/w1;->F:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", mobileSessionId="

    const-string v2, ", appId="

    iget-object v3, p0, Ly00/w1;->G:Ljava/lang/String;

    iget-object v4, p0, Ly00/w1;->H:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ly00/w1;->I:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sellerDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/w1;->J:Ly00/z1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", link="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/w1;->K:Ly00/x1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", countryOverride="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/w1;->L:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly00/w1;->L:Ljava/lang/String;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly00/w1;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Ly00/w1;->x:Ly00/a1;

    invoke-virtual {v0, p1, p2}, Ly00/a1;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Ly00/w1;->y:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object v0, p0, Ly00/w1;->z:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object v0, p0, Ly00/w1;->E:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Ly00/w1;->F:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Ly00/w1;->G:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Ly00/w1;->H:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Ly00/w1;->I:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Ly00/w1;->J:Ly00/z1;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Ly00/z1;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Ly00/w1;->K:Ly00/x1;

    invoke-virtual {v0, p1, p2}, Ly00/x1;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Ly00/w1;->L:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
