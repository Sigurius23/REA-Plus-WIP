.class public final Lh20/v1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lh20/v1;",
            ">;"
        }
    .end annotation
.end field

.field public static final L:Lh20/v1;

.field public static final M:Lh20/v1;


# instance fields
.field public final E:I

.field public final F:I

.field public final G:I

.field public final H:I

.field public final I:I

.field public final J:I

.field public final K:I

.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 25

    new-instance v0, Lh20/n;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lh20/n;-><init>(I)V

    sput-object v0, Lh20/v1;->CREATOR:Landroid/os/Parcelable$Creator;

    sget-object v0, Ld40/q;->a:Ld40/n;

    iget-object v1, v0, Ld40/n;->i:Lg1/c1;

    invoke-virtual {v1}, Lg1/c1;->f()J

    move-result-wide v3

    iget-object v1, v0, Ld40/n;->i:Lg1/c1;

    invoke-virtual {v1}, Lg1/c1;->h()J

    move-result-wide v5

    new-instance v2, Lh20/v1;

    iget-wide v7, v0, Ld40/n;->a:J

    iget-wide v9, v0, Ld40/n;->b:J

    iget-wide v11, v0, Ld40/n;->c:J

    iget-wide v13, v0, Ld40/n;->d:J

    move-object v15, v1

    move-object/from16 v16, v2

    iget-wide v1, v0, Ld40/n;->e:J

    move-wide/from16 v17, v1

    iget-wide v1, v0, Ld40/n;->g:J

    invoke-virtual {v15}, Lg1/c1;->e()J

    move-result-wide v19

    move-wide/from16 v21, v1

    iget-wide v0, v0, Ld40/n;->h:J

    invoke-virtual {v15}, Lg1/c1;->c()J

    move-result-wide v23

    move-object/from16 v2, v16

    move-wide/from16 v15, v17

    move-wide/from16 v17, v21

    move-wide/from16 v21, v0

    invoke-direct/range {v2 .. v24}, Lh20/v1;-><init>(JJJJJJJJJJJ)V

    move-object/from16 v16, v2

    sput-object v16, Lh20/v1;->L:Lh20/v1;

    sget-object v0, Ld40/q;->b:Ld40/n;

    iget-object v1, v0, Ld40/n;->i:Lg1/c1;

    invoke-virtual {v1}, Lg1/c1;->f()J

    move-result-wide v3

    iget-object v1, v0, Ld40/n;->i:Lg1/c1;

    invoke-virtual {v1}, Lg1/c1;->h()J

    move-result-wide v5

    new-instance v2, Lh20/v1;

    iget-wide v7, v0, Ld40/n;->a:J

    iget-wide v9, v0, Ld40/n;->b:J

    iget-wide v11, v0, Ld40/n;->c:J

    iget-wide v13, v0, Ld40/n;->d:J

    move-object v15, v1

    move-object/from16 v16, v2

    iget-wide v1, v0, Ld40/n;->e:J

    move-wide/from16 v17, v1

    iget-wide v1, v0, Ld40/n;->g:J

    invoke-virtual {v15}, Lg1/c1;->e()J

    move-result-wide v19

    move-wide/from16 v21, v1

    iget-wide v0, v0, Ld40/n;->h:J

    invoke-virtual {v15}, Lg1/c1;->c()J

    move-result-wide v23

    move-object/from16 v2, v16

    move-wide/from16 v15, v17

    move-wide/from16 v17, v21

    move-wide/from16 v21, v0

    invoke-direct/range {v2 .. v24}, Lh20/v1;-><init>(JJJJJJJJJJJ)V

    move-object/from16 v16, v2

    sput-object v16, Lh20/v1;->M:Lh20/v1;

    return-void
.end method

.method public constructor <init>(IIIIIIIIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lh20/v1;->w:I

    .line 3
    iput p2, p0, Lh20/v1;->x:I

    .line 4
    iput p3, p0, Lh20/v1;->y:I

    .line 5
    iput p4, p0, Lh20/v1;->z:I

    .line 6
    iput p5, p0, Lh20/v1;->E:I

    .line 7
    iput p6, p0, Lh20/v1;->F:I

    .line 8
    iput p7, p0, Lh20/v1;->G:I

    .line 9
    iput p8, p0, Lh20/v1;->H:I

    .line 10
    iput p9, p0, Lh20/v1;->I:I

    .line 11
    iput p10, p0, Lh20/v1;->J:I

    .line 12
    iput p11, p0, Lh20/v1;->K:I

    return-void
.end method

.method public constructor <init>(JJJJJJJJJJJ)V
    .locals 7

    .line 13
    invoke-static {p1, p2}, Li2/w0;->H(J)I

    move-result p2

    .line 14
    invoke-static {p3, p4}, Li2/w0;->H(J)I

    move-result p3

    .line 15
    invoke-static {p5, p6}, Li2/w0;->H(J)I

    move-result p4

    .line 16
    invoke-static {p7, p8}, Li2/w0;->H(J)I

    move-result p1

    .line 17
    invoke-static/range {p9 .. p10}, Li2/w0;->H(J)I

    move-result v0

    .line 18
    invoke-static/range {p11 .. p12}, Li2/w0;->H(J)I

    move-result v1

    .line 19
    invoke-static/range {p13 .. p14}, Li2/w0;->H(J)I

    move-result v2

    .line 20
    invoke-static/range {p15 .. p16}, Li2/w0;->H(J)I

    move-result v3

    .line 21
    invoke-static/range {p17 .. p18}, Li2/w0;->H(J)I

    move-result v4

    .line 22
    invoke-static/range {p19 .. p20}, Li2/w0;->H(J)I

    move-result v5

    .line 23
    invoke-static/range {p21 .. p22}, Li2/w0;->H(J)I

    move-result v6

    move p5, p1

    move p6, v0

    move p7, v1

    move/from16 p9, v2

    move/from16 p10, v3

    move p8, v4

    move/from16 p11, v5

    move/from16 p12, v6

    move-object p1, p0

    .line 24
    invoke-direct/range {p1 .. p12}, Lh20/v1;-><init>(IIIIIIIIIII)V

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
    instance-of v1, p1, Lh20/v1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lh20/v1;

    iget v1, p0, Lh20/v1;->w:I

    iget v3, p1, Lh20/v1;->w:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lh20/v1;->x:I

    iget v3, p1, Lh20/v1;->x:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lh20/v1;->y:I

    iget v3, p1, Lh20/v1;->y:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lh20/v1;->z:I

    iget v3, p1, Lh20/v1;->z:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lh20/v1;->E:I

    iget v3, p1, Lh20/v1;->E:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lh20/v1;->F:I

    iget v3, p1, Lh20/v1;->F:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lh20/v1;->G:I

    iget v3, p1, Lh20/v1;->G:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lh20/v1;->H:I

    iget v3, p1, Lh20/v1;->H:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lh20/v1;->I:I

    iget v3, p1, Lh20/v1;->I:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lh20/v1;->J:I

    iget v3, p1, Lh20/v1;->J:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lh20/v1;->K:I

    iget p1, p1, Lh20/v1;->K:I

    if-eq v1, p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lh20/v1;->w:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lh20/v1;->x:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lh20/v1;->y:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lh20/v1;->z:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lh20/v1;->E:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lh20/v1;->F:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lh20/v1;->G:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lh20/v1;->H:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lh20/v1;->I:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lh20/v1;->J:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lh20/v1;->K:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", surface="

    const-string v1, ", component="

    iget v2, p0, Lh20/v1;->w:I

    iget v3, p0, Lh20/v1;->x:I

    const-string v4, "Colors(primary="

    invoke-static {v2, v3, v4, v0, v1}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", componentBorder="

    const-string v2, ", componentDivider="

    iget v3, p0, Lh20/v1;->y:I

    iget v4, p0, Lh20/v1;->z:I

    invoke-static {v0, v3, v1, v4, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", onComponent="

    const-string v2, ", onSurface="

    iget v3, p0, Lh20/v1;->E:I

    iget v4, p0, Lh20/v1;->F:I

    invoke-static {v0, v3, v1, v4, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", subtitle="

    const-string v2, ", placeholderText="

    iget v3, p0, Lh20/v1;->G:I

    iget v4, p0, Lh20/v1;->H:I

    invoke-static {v0, v3, v1, v4, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", appBarIcon="

    const-string v2, ", error="

    iget v3, p0, Lh20/v1;->I:I

    iget v4, p0, Lh20/v1;->J:I

    invoke-static {v0, v3, v1, v4, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ")"

    iget v2, p0, Lh20/v1;->K:I

    invoke-static {v0, v2, v1}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Lh20/v1;->w:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lh20/v1;->x:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lh20/v1;->y:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lh20/v1;->z:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lh20/v1;->E:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lh20/v1;->F:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lh20/v1;->G:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lh20/v1;->H:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lh20/v1;->I:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lh20/v1;->J:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lh20/v1;->K:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
