.class public final synthetic Lbu2/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:J

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IIJLandroidx/compose/ui/Modifier;)V
    .locals 0

    .line 1
    iput p2, p0, Lbu2/r;->w:I

    iput-object p5, p0, Lbu2/r;->x:Landroidx/compose/ui/Modifier;

    iput-wide p3, p0, Lbu2/r;->y:J

    iput p1, p0, Lbu2/r;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(JLandroidx/compose/ui/Modifier;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lbu2/r;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lbu2/r;->y:J

    iput-object p3, p0, Lbu2/r;->x:Landroidx/compose/ui/Modifier;

    iput p4, p0, Lbu2/r;->z:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lbu2/r;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-wide v1, p0, Lbu2/r;->y:J

    iget-object v3, p0, Lbu2/r;->x:Landroidx/compose/ui/Modifier;

    iget v4, p0, Lbu2/r;->z:I

    invoke-static/range {v1 .. v6}, Lhy0/y;->c(JLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-wide v0, p0, Lbu2/r;->y:J

    iget-object v2, p0, Lbu2/r;->x:Landroidx/compose/ui/Modifier;

    iget v3, p0, Lbu2/r;->z:I

    invoke-static/range {v0 .. v5}, Lc81/d;->b(JLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-wide v0, p0, Lbu2/r;->y:J

    iget-object v2, p0, Lbu2/r;->x:Landroidx/compose/ui/Modifier;

    iget v3, p0, Lbu2/r;->z:I

    invoke-static/range {v0 .. v5}, Lbu2/x;->g(JLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
