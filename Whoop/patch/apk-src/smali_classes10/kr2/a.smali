.class public final synthetic Lkr2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Ld0/q0;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Lc93/m;


# direct methods
.method public synthetic constructor <init>(Ld0/q0;Landroidx/compose/ui/Modifier;Lc93/m;III)V
    .locals 0

    iput p6, p0, Lkr2/a;->w:I

    iput-object p1, p0, Lkr2/a;->x:Ld0/q0;

    iput-object p2, p0, Lkr2/a;->y:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lkr2/a;->z:Lc93/m;

    iput p4, p0, Lkr2/a;->E:I

    iput p5, p0, Lkr2/a;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lkr2/a;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Lkr2/a;->x:Ld0/q0;

    iget-object v2, p0, Lkr2/a;->y:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Lkr2/a;->z:Lc93/m;

    iget v4, p0, Lkr2/a;->E:I

    iget v5, p0, Lkr2/a;->F:I

    invoke-static/range {v1 .. v7}, Lkr2/b;->f(Ld0/q0;Landroidx/compose/ui/Modifier;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lkr2/a;->x:Ld0/q0;

    iget-object v1, p0, Lkr2/a;->y:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lkr2/a;->z:Lc93/m;

    iget v3, p0, Lkr2/a;->E:I

    iget v4, p0, Lkr2/a;->F:I

    invoke-static/range {v0 .. v6}, Lkr2/b;->b(Ld0/q0;Landroidx/compose/ui/Modifier;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
