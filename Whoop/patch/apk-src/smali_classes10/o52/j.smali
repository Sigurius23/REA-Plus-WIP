.class public final synthetic Lo52/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/c;


# instance fields
.field public final synthetic E:J

.field public final synthetic w:I

.field public final synthetic x:Lix/a;

.field public final synthetic y:Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

.field public final synthetic z:Lp92/e;


# direct methods
.method public synthetic constructor <init>(Lix/a;Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;Lp92/e;JI)V
    .locals 0

    iput p6, p0, Lo52/j;->w:I

    iput-object p1, p0, Lo52/j;->x:Lix/a;

    iput-object p2, p0, Lo52/j;->y:Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

    iput-object p3, p0, Lo52/j;->z:Lp92/e;

    iput-wide p4, p0, Lo52/j;->E:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 16

    move-object/from16 v0, p0

    iget v1, v0, Lo52/j;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v7, p1

    check-cast v7, Ljava/lang/Throwable;

    move-object/from16 v8, p2

    check-cast v8, Lcom/whoop/ui/h;

    iget-object v2, v0, Lo52/j;->x:Lix/a;

    iget-object v3, v0, Lo52/j;->y:Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

    iget-object v4, v0, Lo52/j;->z:Lp92/e;

    iget-wide v5, v0, Lo52/j;->E:J

    invoke-static/range {v2 .. v8}, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;->F(Lix/a;Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;Lp92/e;JLjava/lang/Throwable;Lcom/whoop/ui/h;)V

    return-void

    :pswitch_0
    move-object/from16 v14, p1

    check-cast v14, Lod1/k;

    move-object/from16 v15, p2

    check-cast v15, Lcom/whoop/ui/h;

    iget-object v9, v0, Lo52/j;->x:Lix/a;

    iget-object v10, v0, Lo52/j;->y:Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

    iget-object v11, v0, Lo52/j;->z:Lp92/e;

    iget-wide v12, v0, Lo52/j;->E:J

    invoke-static/range {v9 .. v15}, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;->M(Lix/a;Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;Lp92/e;JLod1/k;Lcom/whoop/ui/h;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
