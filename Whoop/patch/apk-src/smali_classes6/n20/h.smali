.class public final Ln20/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ln20/h;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:La30/f1;

.field public final x:Lh20/x1;

.field public final y:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmn/b;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lmn/b;-><init>(I)V

    sput-object v0, Ln20/h;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(La30/f1;Lh20/x1;Z)V
    .locals 1

    const-string v0, "paymentSheetState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln20/h;->w:La30/f1;

    iput-object p2, p0, Ln20/h;->x:Lh20/x1;

    iput-boolean p3, p0, Ln20/h;->y:Z

    return-void
.end method

.method public static b(Ln20/h;La30/f1;I)Ln20/h;
    .locals 1

    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    iget-object p1, p0, Ln20/h;->w:La30/f1;

    :cond_0
    iget-object v0, p0, Ln20/h;->x:Lh20/x1;

    and-int/lit8 p2, p2, 0x4

    if-eqz p2, :cond_1

    iget-boolean p2, p0, Ln20/h;->y:Z

    goto :goto_0

    :cond_1
    const/4 p2, 0x1

    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p0, "paymentSheetState"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "config"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ln20/h;

    invoke-direct {p0, p1, v0, p2}, Ln20/h;-><init>(La30/f1;Lh20/x1;Z)V

    return-object p0
.end method

.method public static f(Ln20/h;La30/a;Lv00/c0;I)Ln20/h;
    .locals 3

    iget-object v0, p0, Ln20/h;->w:La30/f1;

    iget-object v1, v0, La30/f1;->y:Lq20/y;

    and-int/lit8 v2, p3, 0x2

    if-eqz v2, :cond_0

    iget-object p1, v0, La30/f1;->x:La30/a;

    :cond_0
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_1

    iget-object p2, v0, La30/f1;->E:Lv00/c0;

    :cond_1
    const-string p3, "metadata"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p3, 0x9

    invoke-static {v0, p1, v1, p2, p3}, La30/f1;->b(La30/f1;La30/a;Lq20/y;Lv00/c0;I)La30/f1;

    move-result-object p1

    const/4 p2, 0x6

    invoke-static {p0, p1, p2}, Ln20/h;->b(Ln20/h;La30/f1;I)Ln20/h;

    move-result-object p0

    return-object p0
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
    instance-of v1, p1, Ln20/h;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ln20/h;

    iget-object v1, p0, Ln20/h;->w:La30/f1;

    iget-object v3, p1, Ln20/h;->w:La30/f1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ln20/h;->x:Lh20/x1;

    iget-object v3, p1, Ln20/h;->x:Lh20/x1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Ln20/h;->y:Z

    iget-boolean p1, p1, Ln20/h;->y:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Ln20/h;->w:La30/f1;

    invoke-virtual {v0}, La30/f1;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ln20/h;->x:Lh20/x1;

    invoke-virtual {v1}, Lh20/x1;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Ln20/h;->y:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "State(paymentSheetState="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ln20/h;->w:La30/f1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", config="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln20/h;->x:Lh20/x1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", declinedLink2FA="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    iget-boolean v2, p0, Ln20/h;->y:Z

    invoke-static {v0, v2, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ln20/h;->w:La30/f1;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Ln20/h;->x:Lh20/x1;

    invoke-virtual {v0, p1, p2}, Lh20/x1;->writeToParcel(Landroid/os/Parcel;I)V

    iget-boolean p2, p0, Ln20/h;->y:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
