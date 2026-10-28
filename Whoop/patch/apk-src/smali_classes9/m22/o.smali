.class public final synthetic Lm22/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(FLandroidx/compose/ui/Modifier;III)V
    .locals 0

    iput p5, p0, Lm22/o;->w:I

    iput p1, p0, Lm22/o;->x:F

    iput-object p2, p0, Lm22/o;->y:Landroidx/compose/ui/Modifier;

    iput p3, p0, Lm22/o;->z:I

    iput p4, p0, Lm22/o;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lm22/o;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v1, p0, Lm22/o;->x:F

    iget-object v2, p0, Lm22/o;->y:Landroidx/compose/ui/Modifier;

    iget v3, p0, Lm22/o;->z:I

    iget v4, p0, Lm22/o;->E:I

    invoke-static/range {v1 .. v6}, Lo22/b;->a(FLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v0, p0, Lm22/o;->x:F

    iget-object v1, p0, Lm22/o;->y:Landroidx/compose/ui/Modifier;

    iget v2, p0, Lm22/o;->z:I

    iget v3, p0, Lm22/o;->E:I

    invoke-static/range {v0 .. v5}, Lm22/s;->a(FLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
