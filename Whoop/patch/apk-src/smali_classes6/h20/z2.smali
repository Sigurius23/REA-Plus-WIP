.class public final Lh20/z2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lh20/z2;",
            ">;"
        }
    .end annotation
.end field

.field public static final F:Lh20/z2;

.field public static final G:Lh20/z2;


# instance fields
.field public final E:I

.field public final w:Ljava/lang/Integer;

.field public final x:I

.field public final y:I

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lh20/f2;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lh20/f2;-><init>(I)V

    sput-object v0, Lh20/z2;->CREATOR:Landroid/os/Parcelable$Creator;

    sget-object v0, Ld40/q;->e:Ld40/k;

    iget-object v1, v0, Ld40/k;->a:Ld40/i;

    iget-wide v1, v1, Ld40/i;->b:J

    invoke-static {v1, v2}, Li2/w0;->H(J)I

    move-result v5

    iget-object v1, v0, Ld40/k;->a:Ld40/i;

    iget-wide v2, v1, Ld40/i;->c:J

    invoke-static {v2, v3}, Li2/w0;->H(J)I

    move-result v6

    iget-wide v2, v1, Ld40/i;->b:J

    invoke-static {v2, v3}, Li2/w0;->H(J)I

    move-result v7

    invoke-static {v2, v3}, Li2/w0;->H(J)I

    move-result v8

    new-instance v3, Lh20/z2;

    const/4 v4, 0x0

    invoke-direct/range {v3 .. v8}, Lh20/z2;-><init>(Ljava/lang/Integer;IIII)V

    sput-object v3, Lh20/z2;->F:Lh20/z2;

    iget-object v0, v0, Ld40/k;->b:Ld40/i;

    iget-wide v2, v0, Ld40/i;->b:J

    invoke-static {v2, v3}, Li2/w0;->H(J)I

    move-result v6

    iget-wide v2, v0, Ld40/i;->c:J

    invoke-static {v2, v3}, Li2/w0;->H(J)I

    move-result v7

    iget-wide v1, v1, Ld40/i;->b:J

    invoke-static {v1, v2}, Li2/w0;->H(J)I

    move-result v8

    iget-wide v0, v0, Ld40/i;->b:J

    invoke-static {v0, v1}, Li2/w0;->H(J)I

    move-result v9

    new-instance v4, Lh20/z2;

    const/4 v5, 0x0

    invoke-direct/range {v4 .. v9}, Lh20/z2;-><init>(Ljava/lang/Integer;IIII)V

    sput-object v4, Lh20/z2;->G:Lh20/z2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh20/z2;->w:Ljava/lang/Integer;

    iput p2, p0, Lh20/z2;->x:I

    iput p3, p0, Lh20/z2;->y:I

    iput p4, p0, Lh20/z2;->z:I

    iput p5, p0, Lh20/z2;->E:I

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
    instance-of v1, p1, Lh20/z2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lh20/z2;

    iget-object v1, p0, Lh20/z2;->w:Ljava/lang/Integer;

    iget-object v3, p1, Lh20/z2;->w:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lh20/z2;->x:I

    iget v3, p1, Lh20/z2;->x:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lh20/z2;->y:I

    iget v3, p1, Lh20/z2;->y:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lh20/z2;->z:I

    iget v3, p1, Lh20/z2;->z:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lh20/z2;->E:I

    iget p1, p1, Lh20/z2;->E:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lh20/z2;->w:Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lh20/z2;->x:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lh20/z2;->y:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lh20/z2;->z:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lh20/z2;->E:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PrimaryButtonColors(background="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lh20/z2;->w:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onBackground="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lh20/z2;->x:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", border="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", successBackgroundColor="

    const-string v2, ", onSuccessBackgroundColor="

    iget v3, p0, Lh20/z2;->y:I

    iget v4, p0, Lh20/z2;->z:I

    invoke-static {v0, v3, v1, v4, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ")"

    iget v2, p0, Lh20/z2;->E:I

    invoke-static {v0, v2, v1}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lh20/z2;->w:Ljava/lang/Integer;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, v0, p2}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_0
    iget p2, p0, Lh20/z2;->x:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lh20/z2;->y:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lh20/z2;->z:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lh20/z2;->E:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
