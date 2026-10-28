.class public final synthetic Lc41/m5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/util/List;JLi2/a1;JII)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lc41/m5;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/m5;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lc41/m5;->G:Ljava/lang/Object;

    iput-wide p3, p0, Lc41/m5;->y:J

    iput-object p5, p0, Lc41/m5;->H:Ljava/lang/Object;

    iput-wide p6, p0, Lc41/m5;->z:J

    iput p8, p0, Lc41/m5;->E:I

    iput p9, p0, Lc41/m5;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ly71/g;JJLc93/a;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lc41/m5;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/m5;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lc41/m5;->G:Ljava/lang/Object;

    iput-wide p3, p0, Lc41/m5;->y:J

    iput-wide p5, p0, Lc41/m5;->z:J

    iput-object p7, p0, Lc41/m5;->H:Ljava/lang/Object;

    iput p8, p0, Lc41/m5;->E:I

    iput p9, p0, Lc41/m5;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lc41/m5;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc41/m5;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ly71/g;

    iget-object v0, p0, Lc41/m5;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lc93/a;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v1, p0, Lc41/m5;->x:Landroidx/compose/ui/Modifier;

    iget-wide v3, p0, Lc41/m5;->y:J

    iget-wide v5, p0, Lc41/m5;->z:J

    iget v8, p0, Lc41/m5;->E:I

    iget v9, p0, Lc41/m5;->F:I

    invoke-static/range {v1 .. v11}, Lvy0/x;->d(Landroidx/compose/ui/Modifier;Ly71/g;JJLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lc41/m5;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    iget-object v0, p0, Lc41/m5;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Li2/a1;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v1, p0, Lc41/m5;->x:Landroidx/compose/ui/Modifier;

    iget-wide v3, p0, Lc41/m5;->y:J

    iget-wide v6, p0, Lc41/m5;->z:J

    iget v8, p0, Lc41/m5;->E:I

    iget v9, p0, Lc41/m5;->F:I

    invoke-static/range {v1 .. v11}, Lc41/n5;->a(Landroidx/compose/ui/Modifier;Ljava/util/List;JLi2/a1;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
