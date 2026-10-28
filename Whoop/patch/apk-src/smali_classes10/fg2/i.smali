.class public final synthetic Lfg2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Landroidx/compose/ui/Modifier;

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lfg2/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfg2/i;->E:Landroidx/compose/ui/Modifier;

    iput-boolean p2, p0, Lfg2/i;->x:Z

    iput-boolean p3, p0, Lfg2/i;->y:Z

    iput-object p4, p0, Lfg2/i;->z:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Lfg2/i;->F:I

    iput p6, p0, Lfg2/i;->G:I

    return-void
.end method

.method public synthetic constructor <init>(ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;III)V
    .locals 0

    .line 2
    iput p7, p0, Lfg2/i;->w:I

    iput-boolean p1, p0, Lfg2/i;->x:Z

    iput-boolean p2, p0, Lfg2/i;->y:Z

    iput-object p3, p0, Lfg2/i;->z:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lfg2/i;->E:Landroidx/compose/ui/Modifier;

    iput p5, p0, Lfg2/i;->F:I

    iput p6, p0, Lfg2/i;->G:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lfg2/i;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v1, p0, Lfg2/i;->E:Landroidx/compose/ui/Modifier;

    iget-boolean v2, p0, Lfg2/i;->x:Z

    iget-boolean v3, p0, Lfg2/i;->y:Z

    iget-object v4, p0, Lfg2/i;->z:Lkotlin/jvm/functions/Function1;

    iget v5, p0, Lfg2/i;->F:I

    iget v6, p0, Lfg2/i;->G:I

    invoke-static/range {v1 .. v8}, Luz1/f;->a(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Lfg2/i;->E:Landroidx/compose/ui/Modifier;

    iget-boolean v1, p0, Lfg2/i;->x:Z

    iget-boolean v2, p0, Lfg2/i;->y:Z

    iget-object v3, p0, Lfg2/i;->z:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Lfg2/i;->F:I

    iget v5, p0, Lfg2/i;->G:I

    invoke-static/range {v0 .. v7}, Luz1/f;->d(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Lfg2/i;->E:Landroidx/compose/ui/Modifier;

    iget-boolean v1, p0, Lfg2/i;->x:Z

    iget-boolean v2, p0, Lfg2/i;->y:Z

    iget-object v3, p0, Lfg2/i;->z:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Lfg2/i;->F:I

    iget v5, p0, Lfg2/i;->G:I

    invoke-static/range {v0 .. v7}, Lfg2/j;->d(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
