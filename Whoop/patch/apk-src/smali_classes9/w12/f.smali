.class public final synthetic Lw12/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Lv12/c;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Lv12/c;Landroidx/compose/ui/Modifier;FIII)V
    .locals 0

    iput p6, p0, Lw12/f;->w:I

    iput-object p1, p0, Lw12/f;->x:Lv12/c;

    iput-object p2, p0, Lw12/f;->y:Landroidx/compose/ui/Modifier;

    iput p3, p0, Lw12/f;->z:F

    iput p4, p0, Lw12/f;->E:I

    iput p5, p0, Lw12/f;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lw12/f;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Lw12/f;->x:Lv12/c;

    iget-object v2, p0, Lw12/f;->y:Landroidx/compose/ui/Modifier;

    iget v3, p0, Lw12/f;->z:F

    iget v4, p0, Lw12/f;->E:I

    iget v5, p0, Lw12/f;->F:I

    invoke-static/range {v1 .. v7}, Lw12/h;->d(Lv12/c;Landroidx/compose/ui/Modifier;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lw12/f;->x:Lv12/c;

    iget-object v1, p0, Lw12/f;->y:Landroidx/compose/ui/Modifier;

    iget v2, p0, Lw12/f;->z:F

    iget v3, p0, Lw12/f;->E:I

    iget v4, p0, Lw12/f;->F:I

    invoke-static/range {v0 .. v6}, Lw12/h;->c(Lv12/c;Landroidx/compose/ui/Modifier;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
