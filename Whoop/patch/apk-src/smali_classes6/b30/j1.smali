.class public final synthetic Lb30/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ILandroidx/compose/ui/Modifier;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lb30/j1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/j1;->x:Ljava/lang/String;

    iput-object p3, p0, Lb30/j1;->y:Landroidx/compose/ui/Modifier;

    iput p2, p0, Lb30/j1;->z:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;II)V
    .locals 0

    .line 2
    const/4 p3, 0x1

    iput p3, p0, Lb30/j1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/j1;->x:Ljava/lang/String;

    iput-object p2, p0, Lb30/j1;->y:Landroidx/compose/ui/Modifier;

    iput p4, p0, Lb30/j1;->z:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lb30/j1;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    packed-switch v0, :pswitch_data_0

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lb30/j1;->x:Ljava/lang/String;

    iget-object v1, p0, Lb30/j1;->y:Landroidx/compose/ui/Modifier;

    iget v2, p0, Lb30/j1;->z:I

    invoke-static {v0, v1, p1, p2, v2}, Lce/w;->o(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget p2, p0, Lb30/j1;->z:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lb30/j1;->x:Ljava/lang/String;

    iget-object v1, p0, Lb30/j1;->y:Landroidx/compose/ui/Modifier;

    invoke-static {v0, v1, p1, p2}, Lvd/f;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
