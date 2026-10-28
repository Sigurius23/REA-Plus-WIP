.class public final synthetic Lb30/b5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Landroidx/compose/ui/Modifier;

.field public final synthetic G:I

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(FZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;II)V
    .locals 0

    iput p7, p0, Lb30/b5;->w:I

    iput p1, p0, Lb30/b5;->x:F

    iput-boolean p2, p0, Lb30/b5;->y:Z

    iput-boolean p3, p0, Lb30/b5;->z:Z

    iput-object p4, p0, Lb30/b5;->E:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lb30/b5;->F:Landroidx/compose/ui/Modifier;

    iput p6, p0, Lb30/b5;->G:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lb30/b5;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lb30/b5;->G:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget v1, p0, Lb30/b5;->x:F

    iget-boolean v2, p0, Lb30/b5;->y:Z

    iget-boolean v3, p0, Lb30/b5;->z:Z

    iget-object v4, p0, Lb30/b5;->E:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lb30/b5;->F:Landroidx/compose/ui/Modifier;

    invoke-static/range {v1 .. v7}, Lb30/o5;->d(FZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lb30/b5;->G:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget v0, p0, Lb30/b5;->x:F

    iget-boolean v1, p0, Lb30/b5;->y:Z

    iget-boolean v2, p0, Lb30/b5;->z:Z

    iget-object v3, p0, Lb30/b5;->E:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lb30/b5;->F:Landroidx/compose/ui/Modifier;

    invoke-static/range {v0 .. v6}, Lb30/o5;->c(FZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
