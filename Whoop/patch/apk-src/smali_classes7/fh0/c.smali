.class public final synthetic Lfh0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic K:Ll83/e;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZLc93/a;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lfh0/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfh0/c;->G:Ljava/lang/Object;

    iput-object p2, p0, Lfh0/c;->H:Ljava/lang/Object;

    iput-object p3, p0, Lfh0/c;->I:Ljava/lang/Object;

    iput-boolean p4, p0, Lfh0/c;->x:Z

    iput-boolean p5, p0, Lfh0/c;->y:Z

    iput-object p6, p0, Lfh0/c;->J:Ljava/lang/Object;

    iput-boolean p7, p0, Lfh0/c;->z:Z

    iput-object p8, p0, Lfh0/c;->K:Ll83/e;

    iput p9, p0, Lfh0/c;->E:I

    iput p10, p0, Lfh0/c;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Ll0/y;Lnl0/f;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZII)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lfh0/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfh0/c;->G:Ljava/lang/Object;

    iput-object p2, p0, Lfh0/c;->H:Ljava/lang/Object;

    iput-object p3, p0, Lfh0/c;->I:Ljava/lang/Object;

    iput-object p4, p0, Lfh0/c;->J:Ljava/lang/Object;

    iput-object p5, p0, Lfh0/c;->K:Ll83/e;

    iput-boolean p6, p0, Lfh0/c;->x:Z

    iput-boolean p7, p0, Lfh0/c;->y:Z

    iput-boolean p8, p0, Lfh0/c;->z:Z

    iput p9, p0, Lfh0/c;->E:I

    iput p10, p0, Lfh0/c;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lfh0/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfh0/c;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll0/y;

    iget-object v0, p0, Lfh0/c;->H:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lnl0/f;

    iget-object v0, p0, Lfh0/c;->I:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/m;

    iget-object v0, p0, Lfh0/c;->J:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lfh0/c;->K:Ll83/e;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-boolean v6, p0, Lfh0/c;->x:Z

    iget-boolean v7, p0, Lfh0/c;->y:Z

    iget-boolean v8, p0, Lfh0/c;->z:Z

    iget v9, p0, Lfh0/c;->E:I

    iget v10, p0, Lfh0/c;->F:I

    invoke-static/range {v1 .. v12}, Lsl0/s3;->d(Ll0/y;Lnl0/f;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lfh0/c;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lfh0/c;->H:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lfh0/c;->I:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lfh0/c;->J:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lfh0/c;->K:Ll83/e;

    move-object v8, v0

    check-cast v8, Lc93/a;

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-boolean v4, p0, Lfh0/c;->x:Z

    iget-boolean v5, p0, Lfh0/c;->y:Z

    iget-boolean v7, p0, Lfh0/c;->z:Z

    iget v9, p0, Lfh0/c;->E:I

    iget v10, p0, Lfh0/c;->F:I

    invoke-static/range {v1 .. v12}, Lfh0/d;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
