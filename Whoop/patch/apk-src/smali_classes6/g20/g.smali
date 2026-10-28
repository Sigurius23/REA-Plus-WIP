.class public final Lg20/g;
.super Lg20/l;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lg20/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Ljava/lang/String;

.field public final F:Ljava/lang/Integer;

.field public final G:Ll83/p;

.field public final w:Ljava/lang/String;

.field public final x:Z

.field public final y:Ljava/util/LinkedHashSet;

.field public final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Leq/b;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Leq/b;-><init>(I)V

    sput-object v0, Lg20/g;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLjava/util/LinkedHashSet;ZLjava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "hashedValue"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg20/g;->w:Ljava/lang/String;

    iput-boolean p2, p0, Lg20/g;->x:Z

    iput-object p3, p0, Lg20/g;->y:Ljava/util/LinkedHashSet;

    iput-boolean p4, p0, Lg20/g;->z:Z

    iput-object p5, p0, Lg20/g;->E:Ljava/lang/String;

    iput-object p6, p0, Lg20/g;->F:Ljava/lang/Integer;

    new-instance p1, Ld1/i;

    const/16 p2, 0x17

    invoke-direct {p1, p0, p2}, Ld1/i;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lg20/g;->G:Ll83/p;

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lg20/g;->x:Z

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
    instance-of v0, p1, Lg20/g;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lg20/g;

    iget-object v0, p0, Lg20/g;->w:Ljava/lang/String;

    iget-object v1, p1, Lg20/g;->w:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, Lg20/g;->x:Z

    iget-boolean v1, p1, Lg20/g;->x:Z

    if-eq v0, v1, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lg20/g;->y:Ljava/util/LinkedHashSet;

    iget-object v1, p1, Lg20/g;->y:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-boolean v0, p0, Lg20/g;->z:Z

    iget-boolean v1, p1, Lg20/g;->z:Z

    if-eq v0, v1, :cond_5

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lg20/g;->E:Ljava/lang/String;

    iget-object v1, p1, Lg20/g;->E:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lg20/g;->F:Ljava/lang/Integer;

    iget-object p1, p1, Lg20/g;->F:Ljava/lang/Integer;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_7
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lg20/g;->z:Z

    return v0
.end method

.method public final h()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lg20/g;->y:Ljava/util/LinkedHashSet;

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lg20/g;->w:Ljava/lang/String;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v1, v2

    iget-boolean v3, p0, Lg20/g;->x:Z

    invoke-static {v1, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v1

    iget-object v3, p0, Lg20/g;->y:Ljava/util/LinkedHashSet;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v1

    mul-int/2addr v3, v2

    iget-boolean v1, p0, Lg20/g;->z:Z

    invoke-static {v3, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v1

    iget-object v3, p0, Lg20/g;->E:Ljava/lang/String;

    invoke-static {v1, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v1

    iget-object v2, p0, Lg20/g;->F:Ljava/lang/Integer;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v1, v0

    return v1
.end method

.method public final i()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lg20/g;->G:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    instance-of v1, v0, Ll83/m;

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Ll83/k;

    if-eqz v0, :cond_2

    iget-object v0, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    :goto_0
    const-string v0, "UNKNOWN"

    return-object v0
.end method

.method public final k()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lg20/g;->F:Ljava/lang/Integer;

    return-object v0
.end method

.method public final s()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg20/g;->w:Ljava/lang/String;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", enableLogging="

    const-string v1, ", productUsage="

    const-string v2, "HashedPaymentIntentNextActionArgs(stripeAccountId="

    iget-object v3, p0, Lg20/g;->w:Ljava/lang/String;

    iget-boolean v4, p0, Lg20/g;->x:Z

    invoke-static {v2, v3, v0, v1, v4}, Lm4/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lg20/g;->y:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", includePaymentSheetNextHandlers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lg20/g;->z:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", hashedValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg20/g;->E:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", statusBarColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg20/g;->F:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lg20/g;->w:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lg20/g;->x:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lg20/g;->y:Ljava/util/LinkedHashSet;

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
    iget-boolean p2, p0, Lg20/g;->z:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lg20/g;->E:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lg20/g;->F:Ljava/lang/Integer;

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
    .locals 2

    iget-object v0, p0, Lg20/g;->G:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    instance-of v1, v0, Ll83/m;

    if-nez v1, :cond_0

    check-cast v0, Ll83/k;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :cond_0
    return-object v0
.end method
