.class public final synthetic Lih0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Z

.field public final synthetic G:Z

.field public final synthetic H:Z

.field public final synthetic I:Z

.field public final synthetic J:Lkotlin/jvm/functions/Function1;

.field public final synthetic K:I

.field public final synthetic L:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lq3/y;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lq3/y;Lkotlin/jvm/functions/Function1;IZZZZLkotlin/jvm/functions/Function1;III)V
    .locals 0

    iput p12, p0, Lih0/f;->w:I

    iput-object p1, p0, Lih0/f;->x:Ljava/lang/String;

    iput-object p2, p0, Lih0/f;->y:Lq3/y;

    iput-object p3, p0, Lih0/f;->z:Lkotlin/jvm/functions/Function1;

    iput p4, p0, Lih0/f;->E:I

    iput-boolean p5, p0, Lih0/f;->F:Z

    iput-boolean p6, p0, Lih0/f;->G:Z

    iput-boolean p7, p0, Lih0/f;->H:Z

    iput-boolean p8, p0, Lih0/f;->I:Z

    iput-object p9, p0, Lih0/f;->J:Lkotlin/jvm/functions/Function1;

    iput p10, p0, Lih0/f;->K:I

    iput p11, p0, Lih0/f;->L:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget v0, p0, Lih0/f;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-object v1, p0, Lih0/f;->x:Ljava/lang/String;

    iget-object v2, p0, Lih0/f;->y:Lq3/y;

    iget-object v3, p0, Lih0/f;->z:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Lih0/f;->E:I

    iget-boolean v5, p0, Lih0/f;->F:Z

    iget-boolean v6, p0, Lih0/f;->G:Z

    iget-boolean v7, p0, Lih0/f;->H:Z

    iget-boolean v8, p0, Lih0/f;->I:Z

    iget-object v9, p0, Lih0/f;->J:Lkotlin/jvm/functions/Function1;

    iget v10, p0, Lih0/f;->K:I

    iget v11, p0, Lih0/f;->L:I

    invoke-static/range {v1 .. v13}, Lih0/l;->j(Ljava/lang/String;Lq3/y;Lkotlin/jvm/functions/Function1;IZZZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v0, p0, Lih0/f;->x:Ljava/lang/String;

    iget-object v1, p0, Lih0/f;->y:Lq3/y;

    iget-object v2, p0, Lih0/f;->z:Lkotlin/jvm/functions/Function1;

    iget v3, p0, Lih0/f;->E:I

    iget-boolean v4, p0, Lih0/f;->F:Z

    iget-boolean v5, p0, Lih0/f;->G:Z

    iget-boolean v6, p0, Lih0/f;->H:Z

    iget-boolean v7, p0, Lih0/f;->I:Z

    iget-object v8, p0, Lih0/f;->J:Lkotlin/jvm/functions/Function1;

    iget v9, p0, Lih0/f;->K:I

    iget v10, p0, Lih0/f;->L:I

    invoke-static/range {v0 .. v12}, Lih0/l;->a(Ljava/lang/String;Lq3/y;Lkotlin/jvm/functions/Function1;IZZZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
