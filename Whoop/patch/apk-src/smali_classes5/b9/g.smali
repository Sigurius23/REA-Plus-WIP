.class public final Lb9/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:J

.field public m:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lb9/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 28

    move-object/from16 v0, p0

    iget v1, v0, Lb9/g;->a:I

    const-string v2, "\n}"

    const-string v3, "\n videoFrameProcessingOffsetCount="

    const-string v4, "\n totalVideoFrameProcessingOffsetUs="

    const-string v5, "\n droppedToKeyframeEvents="

    const-string v6, "\n maxConsecutiveDroppedBuffers="

    const-string v7, "\n droppedInputBuffers="

    const-string v8, "\n droppedBuffers="

    const-string v9, "\n skippedOutputBuffers="

    const-string v10, "\n renderedOutputBuffers="

    const-string v11, "\n skippedInputBuffers="

    const-string v12, "\n queuedInputBuffers="

    const-string v13, ",\n decoderReleases="

    const-string v14, "DecoderCounters {\n decoderInits="

    packed-switch v1, :pswitch_data_0

    iget v1, v0, Lb9/g;->b:I

    iget v15, v0, Lb9/g;->c:I

    move-object/from16 v16, v2

    iget v2, v0, Lb9/g;->d:I

    move-object/from16 v17, v3

    iget v3, v0, Lb9/g;->e:I

    move-object/from16 v18, v4

    iget v4, v0, Lb9/g;->f:I

    move-object/from16 v19, v5

    iget v5, v0, Lb9/g;->g:I

    move-object/from16 v20, v6

    iget v6, v0, Lb9/g;->h:I

    move/from16 v21, v6

    iget v6, v0, Lb9/g;->i:I

    move/from16 v22, v6

    iget v6, v0, Lb9/g;->j:I

    move/from16 v23, v6

    iget v6, v0, Lb9/g;->k:I

    move/from16 v25, v6

    move-object/from16 v24, v7

    iget-wide v6, v0, Lb9/g;->l:J

    move-wide/from16 v26, v6

    iget v6, v0, Lb9/g;->m:I

    sget v7, Llo/y;->a:I

    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v1, v15, v14, v13, v12}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v2, v11, v3, v10}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    invoke-static {v1, v4, v9, v5, v8}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    move-object/from16 v4, v20

    move/from16 v2, v21

    move/from16 v3, v22

    move-object/from16 v5, v24

    invoke-static {v1, v2, v5, v3, v4}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    move-object/from16 v7, v18

    move-object/from16 v15, v19

    move/from16 v2, v23

    move/from16 v3, v25

    invoke-static {v1, v2, v15, v3, v7}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    move-wide/from16 v2, v26

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-object/from16 v2, v17

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v3, v16

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    :pswitch_0
    move-object v15, v3

    move-object v3, v2

    move-object v2, v15

    move-object v15, v5

    move-object v5, v7

    move-object v7, v4

    move-object v4, v6

    iget v1, v0, Lb9/g;->b:I

    iget v6, v0, Lb9/g;->c:I

    move-object/from16 v16, v3

    iget v3, v0, Lb9/g;->d:I

    move-object/from16 v17, v2

    iget v2, v0, Lb9/g;->e:I

    move-object/from16 v18, v7

    iget v7, v0, Lb9/g;->f:I

    move-object/from16 v19, v15

    iget v15, v0, Lb9/g;->g:I

    move-object/from16 v20, v4

    iget v4, v0, Lb9/g;->h:I

    move/from16 v21, v4

    iget v4, v0, Lb9/g;->i:I

    move/from16 v22, v4

    iget v4, v0, Lb9/g;->j:I

    move/from16 v23, v4

    iget v4, v0, Lb9/g;->k:I

    move/from16 v25, v4

    move-object/from16 v24, v5

    iget-wide v4, v0, Lb9/g;->l:J

    move-wide/from16 v26, v4

    iget v4, v0, Lb9/g;->m:I

    sget v5, Lx8/t;->a:I

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v1, v6, v14, v13, v12}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v3, v11, v2, v10}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    invoke-static {v1, v7, v9, v15, v8}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    move-object/from16 v5, v20

    move/from16 v2, v21

    move/from16 v3, v22

    move-object/from16 v6, v24

    invoke-static {v1, v2, v6, v3, v5}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    move-object/from16 v7, v18

    move-object/from16 v15, v19

    move/from16 v2, v23

    move/from16 v3, v25

    invoke-static {v1, v2, v15, v3, v7}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    move-wide/from16 v2, v26

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-object/from16 v2, v17

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v3, v16

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
