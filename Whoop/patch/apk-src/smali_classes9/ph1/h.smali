.class public final synthetic Lph1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IIILc93/a;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    iput v0, p0, Lph1/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lph1/h;->x:I

    iput p2, p0, Lph1/h;->z:I

    iput-object p5, p0, Lph1/h;->F:Ljava/lang/Object;

    iput-object p4, p0, Lph1/h;->y:Ljava/lang/Object;

    iput p3, p0, Lph1/h;->E:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lzz0/i;III)V
    .locals 1

    .line 2
    const/4 v0, 0x5

    iput v0, p0, Lph1/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lph1/h;->F:Ljava/lang/Object;

    iput-object p2, p0, Lph1/h;->y:Ljava/lang/Object;

    iput p3, p0, Lph1/h;->x:I

    iput p4, p0, Lph1/h;->z:I

    iput p5, p0, Lph1/h;->E:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;III)V
    .locals 0

    .line 3
    iput p6, p0, Lph1/h;->w:I

    iput-object p1, p0, Lph1/h;->F:Ljava/lang/Object;

    iput p2, p0, Lph1/h;->x:I

    iput-object p3, p0, Lph1/h;->y:Ljava/lang/Object;

    iput p4, p0, Lph1/h;->z:I

    iput p5, p0, Lph1/h;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll0/u;IILc93/a;I)V
    .locals 1

    .line 4
    const/4 v0, 0x2

    iput v0, p0, Lph1/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lph1/h;->F:Ljava/lang/Object;

    iput p2, p0, Lph1/h;->x:I

    iput p3, p0, Lph1/h;->z:I

    iput-object p4, p0, Lph1/h;->y:Ljava/lang/Object;

    iput p5, p0, Lph1/h;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lph1/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lph1/h;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lph1/h;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lzz0/i;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v3, p0, Lph1/h;->x:I

    iget v4, p0, Lph1/h;->z:I

    iget v5, p0, Lph1/h;->E:I

    invoke-static/range {v1 .. v7}, Lzz0/g;->h(Landroidx/compose/ui/Modifier;Lzz0/i;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lph1/h;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, Lph1/h;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v1, p0, Lph1/h;->x:I

    iget v2, p0, Lph1/h;->z:I

    iget v5, p0, Lph1/h;->E:I

    invoke-static/range {v1 .. v7}, Lzk2/o;->b(IILjava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lph1/h;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/navigation/models/ChatHeaderMetadata;

    iget-object v0, p0, Lph1/h;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v2, p0, Lph1/h;->x:I

    iget v4, p0, Lph1/h;->z:I

    iget v5, p0, Lph1/h;->E:I

    invoke-static/range {v1 .. v7}, Ly12/c;->f(Lcom/whoop/navigation/models/ChatHeaderMetadata;ILandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lph1/h;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll0/u;

    iget-object v0, p0, Lph1/h;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v2, p0, Lph1/h;->x:I

    iget v3, p0, Lph1/h;->z:I

    iget v5, p0, Lph1/h;->E:I

    invoke-static/range {v1 .. v7}, Lsl0/s3;->h(Ll0/u;IILc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lph1/h;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lq11/i;

    iget-object v0, p0, Lph1/h;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v2, p0, Lph1/h;->x:I

    iget v4, p0, Lph1/h;->z:I

    iget v5, p0, Lph1/h;->E:I

    invoke-static/range {v1 .. v7}, Lq11/h;->d(Lq11/i;ILkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lph1/h;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lnh1/c$e;

    iget-object v0, p0, Lph1/h;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v2, p0, Lph1/h;->x:I

    iget v4, p0, Lph1/h;->z:I

    iget v5, p0, Lph1/h;->E:I

    invoke-static/range {v1 .. v7}, Lph1/i;->r(Lnh1/c$e;ILkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
