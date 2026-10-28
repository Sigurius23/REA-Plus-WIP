.class public final synthetic Lb30/c5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:Lkotlin/jvm/functions/Function1;

.field public final synthetic I:Landroidx/compose/ui/Modifier;

.field public final synthetic J:I

.field public final synthetic w:I

.field public final synthetic x:Lh20/r0;

.field public final synthetic y:F

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lh20/r0;FZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;II)V
    .locals 0

    iput p10, p0, Lb30/c5;->w:I

    iput-object p1, p0, Lb30/c5;->x:Lh20/r0;

    iput p2, p0, Lb30/c5;->y:F

    iput-boolean p3, p0, Lb30/c5;->z:Z

    iput-boolean p4, p0, Lb30/c5;->E:Z

    iput-boolean p5, p0, Lb30/c5;->F:Z

    iput-object p6, p0, Lb30/c5;->G:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lb30/c5;->H:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lb30/c5;->I:Landroidx/compose/ui/Modifier;

    iput p9, p0, Lb30/c5;->J:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lb30/c5;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lb30/c5;->J:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v10

    iget-object v1, p0, Lb30/c5;->x:Lh20/r0;

    iget v2, p0, Lb30/c5;->y:F

    iget-boolean v3, p0, Lb30/c5;->z:Z

    iget-boolean v4, p0, Lb30/c5;->E:Z

    iget-boolean v5, p0, Lb30/c5;->F:Z

    iget-object v6, p0, Lb30/c5;->G:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lb30/c5;->H:Lkotlin/jvm/functions/Function1;

    iget-object v8, p0, Lb30/c5;->I:Landroidx/compose/ui/Modifier;

    invoke-static/range {v1 .. v10}, Lb30/o5;->e(Lh20/r0;FZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lb30/c5;->J:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v9

    iget-object v0, p0, Lb30/c5;->x:Lh20/r0;

    iget v1, p0, Lb30/c5;->y:F

    iget-boolean v2, p0, Lb30/c5;->z:Z

    iget-boolean v3, p0, Lb30/c5;->E:Z

    iget-boolean v4, p0, Lb30/c5;->F:Z

    iget-object v5, p0, Lb30/c5;->G:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lb30/c5;->H:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lb30/c5;->I:Landroidx/compose/ui/Modifier;

    invoke-static/range {v0 .. v9}, Lb30/o5;->e(Lh20/r0;FZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
