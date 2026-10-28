.class public final synthetic Lsz0/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(IIILandroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lsz0/w0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p6, p0, Lsz0/w0;->G:Ljava/lang/Object;

    iput p1, p0, Lsz0/w0;->x:I

    iput-object p4, p0, Lsz0/w0;->z:Landroidx/compose/ui/Modifier;

    iput-object p5, p0, Lsz0/w0;->H:Ljava/lang/Object;

    iput-object p7, p0, Lsz0/w0;->y:Lkotlin/jvm/functions/Function1;

    iput p2, p0, Lsz0/w0;->E:I

    iput p3, p0, Lsz0/w0;->F:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Luz1/b;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lsz0/w0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lsz0/w0;->x:I

    iput-object p2, p0, Lsz0/w0;->G:Ljava/lang/Object;

    iput-object p3, p0, Lsz0/w0;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lsz0/w0;->z:Landroidx/compose/ui/Modifier;

    iput-object p5, p0, Lsz0/w0;->H:Ljava/lang/Object;

    iput p6, p0, Lsz0/w0;->E:I

    iput p7, p0, Lsz0/w0;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/util/List;ILkotlin/jvm/functions/Function1;Lb91/a;II)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput v0, p0, Lsz0/w0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsz0/w0;->z:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lsz0/w0;->G:Ljava/lang/Object;

    iput p3, p0, Lsz0/w0;->x:I

    iput-object p4, p0, Lsz0/w0;->y:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lsz0/w0;->H:Ljava/lang/Object;

    iput p6, p0, Lsz0/w0;->E:I

    iput p7, p0, Lsz0/w0;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lsz0/w0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsz0/w0;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    iget-object v0, p0, Lsz0/w0;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lb91/a;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Lsz0/w0;->z:Landroidx/compose/ui/Modifier;

    iget v3, p0, Lsz0/w0;->x:I

    iget-object v4, p0, Lsz0/w0;->y:Lkotlin/jvm/functions/Function1;

    iget v6, p0, Lsz0/w0;->E:I

    iget v7, p0, Lsz0/w0;->F:I

    invoke-static/range {v1 .. v9}, Lzv2/h;->a(Landroidx/compose/ui/Modifier;Ljava/util/List;ILkotlin/jvm/functions/Function1;Lb91/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lsz0/w0;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/navigation/e;

    iget-object v0, p0, Lsz0/w0;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Luz1/b;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v1, p0, Lsz0/w0;->x:I

    iget-object v3, p0, Lsz0/w0;->y:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lsz0/w0;->z:Landroidx/compose/ui/Modifier;

    iget v6, p0, Lsz0/w0;->E:I

    iget v7, p0, Lsz0/w0;->F:I

    invoke-static/range {v1 .. v9}, Luz1/a;->a(ILcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Luz1/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lsz0/w0;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, Lsz0/w0;->H:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v2, p0, Lsz0/w0;->x:I

    iget-object v3, p0, Lsz0/w0;->z:Landroidx/compose/ui/Modifier;

    iget-object v5, p0, Lsz0/w0;->y:Lkotlin/jvm/functions/Function1;

    iget v6, p0, Lsz0/w0;->E:I

    iget v7, p0, Lsz0/w0;->F:I

    invoke-static/range {v1 .. v9}, Lsz0/x0;->a(Ljava/util/List;ILandroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
