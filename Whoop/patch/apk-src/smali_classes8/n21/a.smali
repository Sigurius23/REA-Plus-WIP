.class public final synthetic Ln21/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Landroidx/compose/ui/Modifier;JIII)V
    .locals 0

    iput p7, p0, Ln21/a;->w:I

    iput-object p1, p0, Ln21/a;->x:Ljava/util/List;

    iput-object p2, p0, Ln21/a;->y:Landroidx/compose/ui/Modifier;

    iput-wide p3, p0, Ln21/a;->z:J

    iput p5, p0, Ln21/a;->E:I

    iput p6, p0, Ln21/a;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Ln21/a;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v1, p0, Ln21/a;->x:Ljava/util/List;

    iget-object v2, p0, Ln21/a;->y:Landroidx/compose/ui/Modifier;

    iget-wide v3, p0, Ln21/a;->z:J

    iget v5, p0, Ln21/a;->E:I

    iget v6, p0, Ln21/a;->F:I

    invoke-static/range {v1 .. v8}, Ln21/c;->b(Ljava/util/List;Landroidx/compose/ui/Modifier;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Ln21/a;->x:Ljava/util/List;

    iget-object v1, p0, Ln21/a;->y:Landroidx/compose/ui/Modifier;

    iget-wide v2, p0, Ln21/a;->z:J

    iget v4, p0, Ln21/a;->E:I

    iget v5, p0, Ln21/a;->F:I

    invoke-static/range {v0 .. v7}, Ln21/c;->c(Ljava/util/List;Landroidx/compose/ui/Modifier;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
