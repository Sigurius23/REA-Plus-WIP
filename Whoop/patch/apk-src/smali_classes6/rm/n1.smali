.class public final Lrm/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrm/f;


# static fields
.field public static final R:Ljava/lang/Object;

.field public static final S:Ljava/lang/Object;

.field public static final T:Lrm/k0;


# instance fields
.field public E:J

.field public F:J

.field public G:J

.field public H:Z

.field public I:Z

.field public J:Z

.field public K:Lrm/h0;

.field public L:Z

.field public M:J

.field public N:J

.field public O:I

.field public P:I

.field public Q:J

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Lrm/k0;

.field public z:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lrm/n1;->R:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lrm/n1;->S:Ljava/lang/Object;

    new-instance v0, Lrm/e0;

    invoke-direct {v0}, Lrm/e0;-><init>()V

    sget-object v1, Lzr/g0;->x:Lzr/e0;

    sget-object v1, Lzr/w0;->E:Lzr/w0;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sget-object v2, Lzr/w0;->E:Lzr/w0;

    sget-object v3, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    new-instance v5, Lrm/i0;

    invoke-direct {v5, v3, v4, v1, v2}, Lrm/i0;-><init>(Landroid/net/Uri;Lrm/f1;Ljava/util/List;Lzr/g0;)V

    move-object v9, v5

    goto :goto_0

    :cond_0
    move-object v9, v4

    :goto_0
    new-instance v6, Lrm/k0;

    new-instance v8, Lrm/g0;

    invoke-direct {v8, v0}, Lrm/f0;-><init>(Lrm/e0;)V

    new-instance v10, Lrm/h0;

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    const v17, -0x800001

    move-wide v13, v11

    move-wide v15, v11

    move/from16 v18, v17

    invoke-direct/range {v10 .. v18}, Lrm/h0;-><init>(JJJFF)V

    sget-object v11, Lrm/m0;->h0:Lrm/m0;

    const-string v7, "com.google.android.exoplayer2.Timeline"

    invoke-direct/range {v6 .. v11}, Lrm/k0;-><init>(Ljava/lang/String;Lrm/g0;Lrm/i0;Lrm/h0;Lrm/m0;)V

    sput-object v6, Lrm/n1;->T:Lrm/k0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lrm/n1;->R:Ljava/lang/Object;

    iput-object v0, p0, Lrm/n1;->w:Ljava/lang/Object;

    sget-object v0, Lrm/n1;->T:Lrm/k0;

    iput-object v0, p0, Lrm/n1;->y:Lrm/k0;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 4

    iget-boolean v0, p0, Lrm/n1;->J:Z

    iget-object v1, p0, Lrm/n1;->K:Lrm/h0;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-ne v0, v1, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    invoke-static {v0}, Llo/a;->i(Z)V

    iget-object v0, p0, Lrm/n1;->K:Lrm/h0;

    if-eqz v0, :cond_2

    return v3

    :cond_2
    return v2
.end method

.method public final b(Ljava/lang/Object;Lrm/k0;Ljava/lang/Object;JJJZZLrm/h0;JJIIJ)V
    .locals 0

    iput-object p1, p0, Lrm/n1;->w:Ljava/lang/Object;

    if-eqz p2, :cond_0

    move-object p1, p2

    goto :goto_0

    :cond_0
    sget-object p1, Lrm/n1;->T:Lrm/k0;

    :goto_0
    iput-object p1, p0, Lrm/n1;->y:Lrm/k0;

    if-eqz p2, :cond_1

    iget-object p1, p2, Lrm/k0;->x:Lrm/i0;

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Lrm/n1;->x:Ljava/lang/Object;

    iput-object p3, p0, Lrm/n1;->z:Ljava/lang/Object;

    iput-wide p4, p0, Lrm/n1;->E:J

    iput-wide p6, p0, Lrm/n1;->F:J

    iput-wide p8, p0, Lrm/n1;->G:J

    iput-boolean p10, p0, Lrm/n1;->H:Z

    iput-boolean p11, p0, Lrm/n1;->I:Z

    const/4 p1, 0x0

    if-eqz p12, :cond_2

    const/4 p2, 0x1

    goto :goto_1

    :cond_2
    move p2, p1

    :goto_1
    iput-boolean p2, p0, Lrm/n1;->J:Z

    iput-object p12, p0, Lrm/n1;->K:Lrm/h0;

    iput-wide p13, p0, Lrm/n1;->M:J

    move-wide p2, p15

    iput-wide p2, p0, Lrm/n1;->N:J

    move/from16 p2, p17

    iput p2, p0, Lrm/n1;->O:I

    move/from16 p2, p18

    iput p2, p0, Lrm/n1;->P:I

    move-wide/from16 p2, p19

    iput-wide p2, p0, Lrm/n1;->Q:J

    iput-boolean p1, p0, Lrm/n1;->L:Z

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    const-class v2, Lrm/n1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Lrm/n1;

    iget-object v2, p0, Lrm/n1;->w:Ljava/lang/Object;

    iget-object v3, p1, Lrm/n1;->w:Ljava/lang/Object;

    invoke-static {v2, v3}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lrm/n1;->y:Lrm/k0;

    iget-object v3, p1, Lrm/n1;->y:Lrm/k0;

    invoke-static {v2, v3}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lrm/n1;->z:Ljava/lang/Object;

    iget-object v3, p1, Lrm/n1;->z:Ljava/lang/Object;

    invoke-static {v2, v3}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lrm/n1;->K:Lrm/h0;

    iget-object v3, p1, Lrm/n1;->K:Lrm/h0;

    invoke-static {v2, v3}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-wide v2, p0, Lrm/n1;->E:J

    iget-wide v4, p1, Lrm/n1;->E:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Lrm/n1;->F:J

    iget-wide v4, p1, Lrm/n1;->F:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Lrm/n1;->G:J

    iget-wide v4, p1, Lrm/n1;->G:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-boolean v2, p0, Lrm/n1;->H:Z

    iget-boolean v3, p1, Lrm/n1;->H:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lrm/n1;->I:Z

    iget-boolean v3, p1, Lrm/n1;->I:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lrm/n1;->L:Z

    iget-boolean v3, p1, Lrm/n1;->L:Z

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lrm/n1;->M:J

    iget-wide v4, p1, Lrm/n1;->M:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Lrm/n1;->N:J

    iget-wide v4, p1, Lrm/n1;->N:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget v2, p0, Lrm/n1;->O:I

    iget v3, p1, Lrm/n1;->O:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lrm/n1;->P:I

    iget v3, p1, Lrm/n1;->P:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lrm/n1;->Q:J

    iget-wide v4, p1, Lrm/n1;->Q:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 7

    iget-object v0, p0, Lrm/n1;->w:Ljava/lang/Object;

    const/16 v1, 0xd9

    const/16 v2, 0x1f

    invoke-static {v1, v2, v0}, Lte0/d;->c(IILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lrm/n1;->y:Lrm/k0;

    invoke-virtual {v1}, Lrm/k0;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    iget-object v0, p0, Lrm/n1;->z:Ljava/lang/Object;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    iget-object v0, p0, Lrm/n1;->K:Lrm/h0;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lrm/h0;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-wide v3, p0, Lrm/n1;->E:J

    const/16 v0, 0x20

    ushr-long v5, v3, v0

    xor-long/2addr v3, v5

    long-to-int v3, v3

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-wide v3, p0, Lrm/n1;->F:J

    ushr-long v5, v3, v0

    xor-long/2addr v3, v5

    long-to-int v3, v3

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-wide v3, p0, Lrm/n1;->G:J

    ushr-long v5, v3, v0

    xor-long/2addr v3, v5

    long-to-int v3, v3

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-boolean v3, p0, Lrm/n1;->H:Z

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-boolean v3, p0, Lrm/n1;->I:Z

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-boolean v3, p0, Lrm/n1;->L:Z

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-wide v3, p0, Lrm/n1;->M:J

    ushr-long v5, v3, v0

    xor-long/2addr v3, v5

    long-to-int v3, v3

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-wide v3, p0, Lrm/n1;->N:J

    ushr-long v5, v3, v0

    xor-long/2addr v3, v5

    long-to-int v3, v3

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget v3, p0, Lrm/n1;->O:I

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget v3, p0, Lrm/n1;->P:I

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-wide v2, p0, Lrm/n1;->Q:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v0, v2

    add-int/2addr v1, v0

    return v1
.end method
