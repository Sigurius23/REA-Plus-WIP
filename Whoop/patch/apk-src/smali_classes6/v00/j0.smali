.class public final Lv00/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lux/a;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lv00/j0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Lh20/t1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv00/g0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lv00/g0;-><init>(I)V

    sput-object v0, Lv00/j0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lh20/t1;)V
    .locals 1

    const-string v0, "cardBrandAcceptance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv00/j0;->w:Lh20/t1;

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
    instance-of v1, p1, Lv00/j0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lv00/j0;

    iget-object v1, p0, Lv00/j0;->w:Lh20/t1;

    iget-object p1, p1, Lv00/j0;->w:Lh20/t1;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lv00/j0;->w:Lh20/t1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final l0(Ly00/o4;)Z
    .locals 3

    iget-object v0, p1, Ly00/o4;->H:Ly00/z3;

    if-eqz v0, :cond_1

    iget-object v1, v0, Ly00/z3;->L:Ljava/lang/String;

    if-eqz v1, :cond_1

    sget-object v2, Ly00/i;->M:Lt9/c0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lt9/c0;->i(Ljava/lang/String;)Ly00/i;

    move-result-object v1

    sget-object v2, Ly00/i;->X:Ly00/i;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    :cond_0
    if-nez v1, :cond_3

    :cond_1
    if-eqz v0, :cond_2

    iget-object v1, v0, Ly00/z3;->w:Ly00/i;

    goto :goto_0

    :cond_2
    sget-object v1, Ly00/i;->X:Ly00/i;

    :cond_3
    :goto_0
    iget-object p1, p1, Ly00/o4;->E:Ly00/f4;

    sget-object v0, Ly00/f4;->I:Ly00/f4;

    if-ne p1, v0, :cond_5

    invoke-virtual {p0, v1}, Lv00/j0;->o(Ly00/i;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    return p1

    :cond_5
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final o(Ly00/i;)Z
    .locals 2

    const-string v0, "cardBrand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    goto :goto_0

    :pswitch_0
    sget-object p1, Lh20/r1;->z:Lh20/r1;

    goto :goto_0

    :pswitch_1
    sget-object p1, Lh20/r1;->y:Lh20/r1;

    goto :goto_0

    :pswitch_2
    sget-object p1, Lh20/r1;->x:Lh20/r1;

    goto :goto_0

    :pswitch_3
    sget-object p1, Lh20/r1;->w:Lh20/r1;

    :goto_0
    iget-object v0, p0, Lv00/j0;->w:Lh20/t1;

    instance-of v1, v0, Lh20/p1;

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v1, v0, Lh20/q1;

    if-eqz v1, :cond_1

    if-eqz p1, :cond_2

    check-cast v0, Lh20/q1;

    iget-object v0, v0, Lh20/q1;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_1
    instance-of v1, v0, Lh20/s1;

    if-eqz v1, :cond_4

    if-eqz p1, :cond_3

    check-cast v0, Lh20/s1;

    iget-object v0, v0, Lh20/s1;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PaymentSheetCardBrandFilter(cardBrandAcceptance="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lv00/j0;->w:Lh20/t1;

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

    iget-object v0, p0, Lv00/j0;->w:Lh20/t1;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
