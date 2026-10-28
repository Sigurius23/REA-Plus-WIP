.class public final synthetic Lg40/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZIII)V
    .locals 0

    iput p6, p0, Lg40/j1;->w:I

    iput-object p1, p0, Lg40/j1;->x:Ljava/lang/String;

    iput-object p2, p0, Lg40/j1;->y:Landroidx/compose/ui/Modifier;

    iput-boolean p3, p0, Lg40/j1;->z:Z

    iput p4, p0, Lg40/j1;->E:I

    iput p5, p0, Lg40/j1;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lg40/j1;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg40/j1;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v5

    iget-object v1, p0, Lg40/j1;->x:Ljava/lang/String;

    iget-object v2, p0, Lg40/j1;->y:Landroidx/compose/ui/Modifier;

    iget-boolean v3, p0, Lg40/j1;->z:Z

    iget v6, p0, Lg40/j1;->F:I

    invoke-static/range {v1 .. v6}, Lrg/a;->f(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v3, p1

    check-cast v3, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg40/j1;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v4

    iget-object v0, p0, Lg40/j1;->x:Ljava/lang/String;

    iget-object v1, p0, Lg40/j1;->y:Landroidx/compose/ui/Modifier;

    iget-boolean v2, p0, Lg40/j1;->z:Z

    iget v5, p0, Lg40/j1;->F:I

    invoke-static/range {v0 .. v5}, Lds/q;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    goto :goto_0

    :pswitch_1
    move-object v3, p1

    check-cast v3, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg40/j1;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v4

    iget-object v0, p0, Lg40/j1;->x:Ljava/lang/String;

    iget-object v1, p0, Lg40/j1;->y:Landroidx/compose/ui/Modifier;

    iget-boolean v2, p0, Lg40/j1;->z:Z

    iget v5, p0, Lg40/j1;->F:I

    invoke-static/range {v0 .. v5}, Lcom/squareup/wire/n;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
