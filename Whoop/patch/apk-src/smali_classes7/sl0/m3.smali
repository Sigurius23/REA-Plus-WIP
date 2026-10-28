.class public final synthetic Lsl0/m3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(FZLandroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lsl0/m3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lsl0/m3;->y:F

    iput-boolean p2, p0, Lsl0/m3;->E:Z

    iput-object p3, p0, Lsl0/m3;->x:Ljava/lang/Object;

    iput p4, p0, Lsl0/m3;->z:F

    iput-object p5, p0, Lsl0/m3;->H:Ljava/lang/Object;

    iput p6, p0, Lsl0/m3;->F:I

    iput p7, p0, Lsl0/m3;->G:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;FFZLjava/util/List;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lsl0/m3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl0/m3;->x:Ljava/lang/Object;

    iput p2, p0, Lsl0/m3;->y:F

    iput p3, p0, Lsl0/m3;->z:F

    iput-boolean p4, p0, Lsl0/m3;->E:Z

    iput-object p5, p0, Lsl0/m3;->H:Ljava/lang/Object;

    iput p6, p0, Lsl0/m3;->F:I

    iput p7, p0, Lsl0/m3;->G:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;IFFLn0/u;ZI)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput v0, p0, Lsl0/m3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl0/m3;->x:Ljava/lang/Object;

    iput p2, p0, Lsl0/m3;->F:I

    iput p3, p0, Lsl0/m3;->y:F

    iput p4, p0, Lsl0/m3;->z:F

    iput-object p5, p0, Lsl0/m3;->H:Ljava/lang/Object;

    iput-boolean p6, p0, Lsl0/m3;->E:Z

    iput p7, p0, Lsl0/m3;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lsl0/m3;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsl0/m3;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, Lsl0/m3;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ln0/u;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v2, p0, Lsl0/m3;->F:I

    iget v3, p0, Lsl0/m3;->y:F

    iget v4, p0, Lsl0/m3;->z:F

    iget-boolean v6, p0, Lsl0/m3;->E:Z

    iget v7, p0, Lsl0/m3;->G:I

    invoke-static/range {v1 .. v9}, Lxq2/c1;->j(Ljava/util/List;IFFLn0/u;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lsl0/m3;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lsl0/m3;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v2, p0, Lsl0/m3;->y:F

    iget v3, p0, Lsl0/m3;->z:F

    iget-boolean v4, p0, Lsl0/m3;->E:Z

    iget v6, p0, Lsl0/m3;->F:I

    iget v7, p0, Lsl0/m3;->G:I

    invoke-static/range {v1 .. v9}, Lst1/h;->a(Landroidx/compose/ui/Modifier;FFZLjava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lsl0/m3;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lsl0/m3;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v1, p0, Lsl0/m3;->y:F

    iget-boolean v2, p0, Lsl0/m3;->E:Z

    iget v4, p0, Lsl0/m3;->z:F

    iget v6, p0, Lsl0/m3;->F:I

    iget v7, p0, Lsl0/m3;->G:I

    invoke-static/range {v1 .. v9}, Lsl0/n3;->b(FZLandroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
