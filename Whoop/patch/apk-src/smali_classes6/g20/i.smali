.class public final Lg20/i;
.super Lg20/l;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lg20/i;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Z

.field public final F:Ljava/lang/String;

.field public final G:Ljava/lang/Integer;

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:Z

.field public final z:Ljava/util/LinkedHashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Leq/b;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Leq/b;-><init>(I)V

    sput-object v0, Lg20/i;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/LinkedHashSet;ZLjava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "publishableKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentIntentClientSecret"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg20/i;->w:Ljava/lang/String;

    iput-object p2, p0, Lg20/i;->x:Ljava/lang/String;

    iput-boolean p3, p0, Lg20/i;->y:Z

    iput-object p4, p0, Lg20/i;->z:Ljava/util/LinkedHashSet;

    iput-boolean p5, p0, Lg20/i;->E:Z

    iput-object p6, p0, Lg20/i;->F:Ljava/lang/String;

    iput-object p7, p0, Lg20/i;->G:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lg20/i;->y:Z

    return v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lg20/i;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lg20/i;

    iget-object v0, p0, Lg20/i;->w:Ljava/lang/String;

    iget-object v1, p1, Lg20/i;->w:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lg20/i;->x:Ljava/lang/String;

    iget-object v1, p1, Lg20/i;->x:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-boolean v0, p0, Lg20/i;->y:Z

    iget-boolean v1, p1, Lg20/i;->y:Z

    if-eq v0, v1, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lg20/i;->z:Ljava/util/LinkedHashSet;

    iget-object v1, p1, Lg20/i;->z:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    iget-boolean v0, p0, Lg20/i;->E:Z

    iget-boolean v1, p1, Lg20/i;->E:Z

    if-eq v0, v1, :cond_6

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lg20/i;->F:Ljava/lang/String;

    iget-object v1, p1, Lg20/i;->F:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    iget-object v0, p0, Lg20/i;->G:Ljava/lang/Integer;

    iget-object p1, p1, Lg20/i;->G:Ljava/lang/Integer;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_8
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lg20/i;->E:Z

    return v0
.end method

.method public final h()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lg20/i;->z:Ljava/util/LinkedHashSet;

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lg20/i;->w:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    const/4 v2, 0x0

    iget-object v3, p0, Lg20/i;->x:Ljava/lang/String;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v3, p0, Lg20/i;->y:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lg20/i;->z:Ljava/util/LinkedHashSet;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-boolean v0, p0, Lg20/i;->E:Z

    invoke-static {v3, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lg20/i;->F:Ljava/lang/String;

    invoke-static {v0, v1, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lg20/i;->G:Ljava/lang/Integer;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg20/i;->w:Ljava/lang/String;

    return-object v0
.end method

.method public final k()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lg20/i;->G:Ljava/lang/Integer;

    return-object v0
.end method

.method public final s()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg20/i;->x:Ljava/lang/String;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", stripeAccountId="

    const-string v1, ", enableLogging="

    const-string v2, "PaymentIntentNextActionArgs(publishableKey="

    iget-object v3, p0, Lg20/i;->w:Ljava/lang/String;

    iget-object v4, p0, Lg20/i;->x:Ljava/lang/String;

    invoke-static {v2, v3, v0, v4, v1}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lg20/i;->y:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", productUsage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg20/i;->z:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", includePaymentSheetNextHandlers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentIntentClientSecret="

    const-string v2, ", statusBarColor="

    iget-boolean v3, p0, Lg20/i;->E:Z

    iget-object v4, p0, Lg20/i;->F:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ")"

    iget-object v2, p0, Lg20/i;->G:Ljava/lang/Integer;

    invoke-static {v0, v2, v1}, Ld13/a;->k(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lg20/i;->w:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lg20/i;->x:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lg20/i;->y:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lg20/i;->z:Ljava/util/LinkedHashSet;

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-boolean p2, p0, Lg20/i;->E:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lg20/i;->F:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lg20/i;->G:Ljava/lang/Integer;

    if-nez p2, :cond_1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_1
    const/4 v0, 0x1

    invoke-static {p1, v0, p2}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    return-void
.end method

.method public final x()Ljava/lang/Object;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
