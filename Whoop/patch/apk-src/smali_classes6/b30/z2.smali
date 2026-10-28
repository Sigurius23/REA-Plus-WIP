.class public final synthetic Lb30/z2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Lc93/a;

.field public final synthetic G:I

.field public final synthetic w:I

.field public final synthetic x:Lb30/j3;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lb30/j3;ZZFLc93/a;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lb30/z2;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/z2;->x:Lb30/j3;

    iput-boolean p2, p0, Lb30/z2;->y:Z

    iput-boolean p3, p0, Lb30/z2;->z:Z

    iput p4, p0, Lb30/z2;->E:F

    iput-object p5, p0, Lb30/z2;->F:Lc93/a;

    iput p6, p0, Lb30/z2;->G:I

    return-void
.end method

.method public synthetic constructor <init>(Lb30/j3;ZZLc93/a;FI)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lb30/z2;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/z2;->x:Lb30/j3;

    iput-boolean p2, p0, Lb30/z2;->y:Z

    iput-boolean p3, p0, Lb30/z2;->z:Z

    iput-object p4, p0, Lb30/z2;->F:Lc93/a;

    iput p5, p0, Lb30/z2;->E:F

    iput p6, p0, Lb30/z2;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lb30/z2;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v3, p1

    check-cast v3, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p1, p0, Lb30/z2;->G:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v2

    iget v1, p0, Lb30/z2;->E:F

    iget-object v4, p0, Lb30/z2;->x:Lb30/j3;

    iget-object v5, p0, Lb30/z2;->F:Lc93/a;

    iget-boolean v6, p0, Lb30/z2;->y:Z

    iget-boolean v7, p0, Lb30/z2;->z:Z

    invoke-static/range {v1 .. v7}, Lb30/g3;->b(FILandroidx/compose/runtime/Composer;Lb30/j3;Lc93/a;ZZ)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v2, p1

    check-cast v2, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lb30/z2;->G:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v1

    iget v0, p0, Lb30/z2;->E:F

    iget-object v3, p0, Lb30/z2;->x:Lb30/j3;

    iget-object v4, p0, Lb30/z2;->F:Lc93/a;

    iget-boolean v5, p0, Lb30/z2;->y:Z

    iget-boolean v6, p0, Lb30/z2;->z:Z

    invoke-static/range {v0 .. v6}, Lb30/g3;->c(FILandroidx/compose/runtime/Composer;Lb30/j3;Lc93/a;ZZ)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
