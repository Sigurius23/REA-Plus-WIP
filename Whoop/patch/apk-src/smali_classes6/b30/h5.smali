.class public final synthetic Lb30/h5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:F

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(FZLc93/a;Landroidx/compose/ui/Modifier;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lb30/h5;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lb30/h5;->y:F

    iput-boolean p2, p0, Lb30/h5;->x:Z

    iput-object p3, p0, Lb30/h5;->z:Lc93/a;

    iput-object p4, p0, Lb30/h5;->F:Ljava/lang/Object;

    iput p5, p0, Lb30/h5;->E:I

    return-void
.end method

.method public synthetic constructor <init>(Lv51/c;ZFLc93/a;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lb30/h5;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/h5;->F:Ljava/lang/Object;

    iput-boolean p2, p0, Lb30/h5;->x:Z

    iput p3, p0, Lb30/h5;->y:F

    iput-object p4, p0, Lb30/h5;->z:Lc93/a;

    iput p5, p0, Lb30/h5;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lb30/h5;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb30/h5;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lv51/c;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lb30/h5;->x:Z

    iget v3, p0, Lb30/h5;->y:F

    iget-object v4, p0, Lb30/h5;->z:Lc93/a;

    iget v5, p0, Lb30/h5;->E:I

    invoke-static/range {v1 .. v7}, Lv51/b;->f(Lv51/c;ZFLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lb30/h5;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lb30/h5;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget v1, p0, Lb30/h5;->y:F

    iget-boolean v2, p0, Lb30/h5;->x:Z

    iget-object v3, p0, Lb30/h5;->z:Lc93/a;

    invoke-static/range {v1 .. v6}, Lb30/o5;->a(FZLc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
