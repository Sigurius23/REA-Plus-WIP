.class public final synthetic Lis0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Z

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lis0/s0;FIZLc93/a;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lis0/r;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lis0/r;->G:Ljava/lang/Object;

    iput p2, p0, Lis0/r;->x:F

    iput p3, p0, Lis0/r;->E:I

    iput-boolean p4, p0, Lis0/r;->y:Z

    iput-object p5, p0, Lis0/r;->z:Lc93/a;

    iput p6, p0, Lis0/r;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Ly21/b$a;FZLc93/a;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lis0/r;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lis0/r;->G:Ljava/lang/Object;

    iput p2, p0, Lis0/r;->x:F

    iput-boolean p3, p0, Lis0/r;->y:Z

    iput-object p4, p0, Lis0/r;->z:Lc93/a;

    iput p5, p0, Lis0/r;->E:I

    iput p6, p0, Lis0/r;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lis0/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lis0/r;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ly21/b$a;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v2, p0, Lis0/r;->x:F

    iget-boolean v3, p0, Lis0/r;->y:Z

    iget-object v4, p0, Lis0/r;->z:Lc93/a;

    iget v5, p0, Lis0/r;->E:I

    iget v6, p0, Lis0/r;->F:I

    invoke-static/range {v1 .. v8}, Ly21/i;->j(Ly21/b$a;FZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lis0/r;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lis0/s0;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v2, p0, Lis0/r;->x:F

    iget v3, p0, Lis0/r;->E:I

    iget-boolean v4, p0, Lis0/r;->y:Z

    iget-object v5, p0, Lis0/r;->z:Lc93/a;

    iget v6, p0, Lis0/r;->F:I

    invoke-static/range {v1 .. v8}, Lis0/x;->e(Lis0/s0;FIZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
