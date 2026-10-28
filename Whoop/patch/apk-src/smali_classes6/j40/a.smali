.class public final synthetic Lj40/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;ZZII)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lj40/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj40/a;->x:Landroidx/compose/ui/Modifier;

    iput-boolean p2, p0, Lj40/a;->y:Z

    iput-boolean p3, p0, Lj40/a;->z:Z

    iput p4, p0, Lj40/a;->E:I

    iput p5, p0, Lj40/a;->F:I

    return-void
.end method

.method public synthetic constructor <init>(ZLandroidx/compose/ui/Modifier;ZII)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lj40/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lj40/a;->y:Z

    iput-object p2, p0, Lj40/a;->x:Landroidx/compose/ui/Modifier;

    iput-boolean p3, p0, Lj40/a;->z:Z

    iput p4, p0, Lj40/a;->E:I

    iput p5, p0, Lj40/a;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lj40/a;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Lj40/a;->x:Landroidx/compose/ui/Modifier;

    iget-boolean v2, p0, Lj40/a;->y:Z

    iget-boolean v3, p0, Lj40/a;->z:Z

    iget v4, p0, Lj40/a;->E:I

    iget v5, p0, Lj40/a;->F:I

    invoke-static/range {v1 .. v7}, Lnq2/e;->h(Landroidx/compose/ui/Modifier;ZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v3, p1

    check-cast v3, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lj40/a;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v4

    iget-object v0, p0, Lj40/a;->x:Landroidx/compose/ui/Modifier;

    iget-boolean v1, p0, Lj40/a;->y:Z

    iget-boolean v2, p0, Lj40/a;->z:Z

    iget v5, p0, Lj40/a;->F:I

    invoke-static/range {v0 .. v5}, Lv8/b;->d(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
