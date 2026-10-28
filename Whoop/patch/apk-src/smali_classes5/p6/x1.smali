.class public final Lp6/x1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:I

.field public final c:Z

.field public final d:Lp6/z0;

.field public final e:I

.field public final f:Z

.field public final g:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final h:Lp6/x0;

.field public final i:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final j:J

.field public final k:I

.field public final l:Z

.field public final m:Ljava/lang/Integer;

.field public final n:Landroid/content/ComponentName;

.field public final o:Lp6/t0;


# direct methods
.method public constructor <init>(Landroid/content/Context;IZLp6/z0;IZLjava/util/concurrent/atomic/AtomicInteger;Lp6/x0;Ljava/util/concurrent/atomic/AtomicBoolean;JIZLjava/lang/Integer;Landroid/content/ComponentName;Lp6/t0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/x1;->a:Landroid/content/Context;

    iput p2, p0, Lp6/x1;->b:I

    iput-boolean p3, p0, Lp6/x1;->c:Z

    iput-object p4, p0, Lp6/x1;->d:Lp6/z0;

    iput p5, p0, Lp6/x1;->e:I

    iput-boolean p6, p0, Lp6/x1;->f:Z

    iput-object p7, p0, Lp6/x1;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p8, p0, Lp6/x1;->h:Lp6/x0;

    iput-object p9, p0, Lp6/x1;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-wide p10, p0, Lp6/x1;->j:J

    iput p12, p0, Lp6/x1;->k:I

    iput-boolean p13, p0, Lp6/x1;->l:Z

    iput-object p14, p0, Lp6/x1;->m:Ljava/lang/Integer;

    iput-object p15, p0, Lp6/x1;->n:Landroid/content/ComponentName;

    move-object/from16 p1, p16

    iput-object p1, p0, Lp6/x1;->o:Lp6/t0;

    return-void
.end method

.method public static a(Lp6/x1;ILjava/util/concurrent/atomic/AtomicInteger;Lp6/x0;Ljava/util/concurrent/atomic/AtomicBoolean;JLjava/lang/Integer;I)Lp6/x1;
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p8

    iget-object v2, v0, Lp6/x1;->a:Landroid/content/Context;

    move-object v3, v2

    iget v2, v0, Lp6/x1;->b:I

    move-object v4, v3

    iget-boolean v3, v0, Lp6/x1;->c:Z

    move-object v5, v4

    iget-object v4, v0, Lp6/x1;->d:Lp6/z0;

    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_0

    iget v6, v0, Lp6/x1;->e:I

    goto :goto_0

    :cond_0
    move/from16 v6, p1

    :goto_0
    and-int/lit8 v7, v1, 0x20

    const/4 v8, 0x1

    if-eqz v7, :cond_1

    iget-boolean v7, v0, Lp6/x1;->f:Z

    goto :goto_1

    :cond_1
    move v7, v8

    :goto_1
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_2

    iget-object v9, v0, Lp6/x1;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    goto :goto_2

    :cond_2
    move-object/from16 v9, p2

    :goto_2
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_3

    iget-object v10, v0, Lp6/x1;->h:Lp6/x0;

    goto :goto_3

    :cond_3
    move-object/from16 v10, p3

    :goto_3
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_4

    iget-object v11, v0, Lp6/x1;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    goto :goto_4

    :cond_4
    move-object/from16 v11, p4

    :goto_4
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_5

    iget-wide v12, v0, Lp6/x1;->j:J

    goto :goto_5

    :cond_5
    move-wide/from16 v12, p5

    :goto_5
    and-int/lit16 v14, v1, 0x400

    if-eqz v14, :cond_6

    iget v14, v0, Lp6/x1;->k:I

    goto :goto_6

    :cond_6
    const/4 v14, 0x0

    :goto_6
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_7

    iget-boolean v8, v0, Lp6/x1;->l:Z

    :cond_7
    and-int/lit16 v1, v1, 0x2000

    if-eqz v1, :cond_8

    iget-object v1, v0, Lp6/x1;->m:Ljava/lang/Integer;

    goto :goto_7

    :cond_8
    move-object/from16 v1, p7

    :goto_7
    iget-object v15, v0, Lp6/x1;->n:Landroid/content/ComponentName;

    iget-object v0, v0, Lp6/x1;->o:Lp6/t0;

    move-object/from16 v16, v0

    new-instance v0, Lp6/x1;

    move/from16 v17, v14

    move-object v14, v1

    move-object v1, v5

    move v5, v6

    move v6, v7

    move-object v7, v9

    move-object v9, v11

    move-wide/from16 v18, v12

    move v13, v8

    move-object v8, v10

    move-wide/from16 v10, v18

    move/from16 v12, v17

    invoke-direct/range {v0 .. v16}, Lp6/x1;-><init>(Landroid/content/Context;IZLp6/z0;IZLjava/util/concurrent/atomic/AtomicInteger;Lp6/x0;Ljava/util/concurrent/atomic/AtomicBoolean;JIZLjava/lang/Integer;Landroid/content/ComponentName;Lp6/t0;)V

    return-object v0
.end method


# virtual methods
.method public final b(Lp6/x0;I)Lp6/x1;
    .locals 9

    const/4 v7, 0x0

    const v8, 0xff6f

    const/4 v2, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-object v0, p0

    move-object v3, p1

    move v1, p2

    invoke-static/range {v0 .. v8}, Lp6/x1;->a(Lp6/x1;ILjava/util/concurrent/atomic/AtomicInteger;Lp6/x0;Ljava/util/concurrent/atomic/AtomicBoolean;JLjava/lang/Integer;I)Lp6/x1;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, Lp6/x1;

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Lp6/x1;

    iget-object v0, p0, Lp6/x1;->a:Landroid/content/Context;

    iget-object v1, p1, Lp6/x1;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    iget v0, p0, Lp6/x1;->b:I

    iget v1, p1, Lp6/x1;->b:I

    if-eq v0, v1, :cond_3

    goto/16 :goto_0

    :cond_3
    iget-boolean v0, p0, Lp6/x1;->c:Z

    iget-boolean v1, p1, Lp6/x1;->c:Z

    if-eq v0, v1, :cond_4

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lp6/x1;->d:Lp6/z0;

    iget-object v1, p1, Lp6/x1;->d:Lp6/z0;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    iget v0, p0, Lp6/x1;->e:I

    iget v1, p1, Lp6/x1;->e:I

    if-eq v0, v1, :cond_6

    goto/16 :goto_0

    :cond_6
    iget-boolean v0, p0, Lp6/x1;->f:Z

    iget-boolean v1, p1, Lp6/x1;->f:Z

    if-eq v0, v1, :cond_7

    goto :goto_0

    :cond_7
    iget-object v0, p0, Lp6/x1;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v1, p1, Lp6/x1;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    iget-object v0, p0, Lp6/x1;->h:Lp6/x0;

    iget-object v1, p1, Lp6/x1;->h:Lp6/x0;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    iget-object v0, p0, Lp6/x1;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v1, p1, Lp6/x1;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_0

    :cond_a
    iget-wide v0, p0, Lp6/x1;->j:J

    iget-wide v2, p1, Lp6/x1;->j:J

    invoke-static {v0, v1, v2, v3}, Ly3/h;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_0

    :cond_b
    iget v0, p0, Lp6/x1;->k:I

    iget v1, p1, Lp6/x1;->k:I

    if-eq v0, v1, :cond_c

    goto :goto_0

    :cond_c
    iget-boolean v0, p0, Lp6/x1;->l:Z

    iget-boolean v1, p1, Lp6/x1;->l:Z

    if-eq v0, v1, :cond_d

    goto :goto_0

    :cond_d
    iget-object v0, p0, Lp6/x1;->m:Ljava/lang/Integer;

    iget-object v1, p1, Lp6/x1;->m:Ljava/lang/Integer;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_0

    :cond_e
    iget-object v0, p0, Lp6/x1;->n:Landroid/content/ComponentName;

    iget-object v1, p1, Lp6/x1;->n:Landroid/content/ComponentName;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_0

    :cond_f
    iget-object v0, p0, Lp6/x1;->o:Lp6/t0;

    iget-object p1, p1, Lp6/x1;->o:Lp6/t0;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_10
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 5

    iget-object v0, p0, Lp6/x1;->a:Landroid/content/Context;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lp6/x1;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lp6/x1;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lp6/x1;->d:Lp6/z0;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lp6/x1;->e:I

    invoke-static {v0, v2, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lp6/x1;->f:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lp6/x1;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lp6/x1;->h:Lp6/x0;

    invoke-virtual {v0}, Lp6/x0;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lp6/x1;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-wide v3, p0, Lp6/x1;->j:J

    invoke-static {v2, v3, v4, v1}, Ld;->e(IJI)I

    move-result v0

    iget v2, p0, Lp6/x1;->k:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    const/4 v2, -0x1

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lp6/x1;->l:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Lp6/x1;->m:Ljava/lang/Integer;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lp6/x1;->n:Landroid/content/ComponentName;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Landroid/content/ComponentName;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lp6/x1;->o:Lp6/t0;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TranslationContext(context="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lp6/x1;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", appWidgetId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lp6/x1;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isRtl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lp6/x1;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", layoutConfiguration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lp6/x1;->d:Lp6/z0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", itemPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lp6/x1;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isLazyCollectionDescendant="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lp6/x1;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", lastViewId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lp6/x1;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", parentContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lp6/x1;->h:Lp6/x0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isBackgroundSpecified="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lp6/x1;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", layoutSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lp6/x1;->j:J

    invoke-static {v1, v2}, Ly3/h;->d(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", layoutCollectionViewId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lp6/x1;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", layoutCollectionItemId=-1, canUseSelectableGroup="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lp6/x1;->l:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", actionTargetId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lp6/x1;->m:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", actionBroadcastReceiver="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lp6/x1;->n:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", glanceComponents="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lp6/x1;->o:Lp6/t0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
