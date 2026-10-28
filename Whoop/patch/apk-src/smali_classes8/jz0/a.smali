.class public final synthetic Ljz0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(IILandroidx/compose/ui/Modifier;JJII)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Ljz0/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ljz0/a;->x:I

    iput p2, p0, Ljz0/a;->y:I

    iput-object p3, p0, Ljz0/a;->H:Ljava/lang/Object;

    iput-wide p4, p0, Ljz0/a;->z:J

    iput-wide p6, p0, Ljz0/a;->E:J

    iput p8, p0, Ljz0/a;->F:I

    iput p9, p0, Ljz0/a;->G:I

    return-void
.end method

.method public synthetic constructor <init>(Ls21/i;IIJJII)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Ljz0/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljz0/a;->H:Ljava/lang/Object;

    iput p2, p0, Ljz0/a;->x:I

    iput p3, p0, Ljz0/a;->y:I

    iput-wide p4, p0, Ljz0/a;->z:J

    iput-wide p6, p0, Ljz0/a;->E:J

    iput p8, p0, Ljz0/a;->F:I

    iput p9, p0, Ljz0/a;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Ljz0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljz0/a;->H:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ls21/i;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget v2, p0, Ljz0/a;->x:I

    iget v3, p0, Ljz0/a;->y:I

    iget-wide v4, p0, Ljz0/a;->z:J

    iget-wide v6, p0, Ljz0/a;->E:J

    iget v8, p0, Ljz0/a;->F:I

    iget v9, p0, Ljz0/a;->G:I

    invoke-static/range {v1 .. v11}, Ls21/g;->e(Ls21/i;IIJJIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ljz0/a;->H:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget v1, p0, Ljz0/a;->x:I

    iget v2, p0, Ljz0/a;->y:I

    iget-wide v4, p0, Ljz0/a;->z:J

    iget-wide v6, p0, Ljz0/a;->E:J

    iget v8, p0, Ljz0/a;->F:I

    iget v9, p0, Ljz0/a;->G:I

    invoke-static/range {v1 .. v11}, Ljz0/c;->b(IILandroidx/compose/ui/Modifier;JJIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
