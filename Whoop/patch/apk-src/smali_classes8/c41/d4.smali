.class public final synthetic Lc41/d4;
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

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIII)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lc41/d4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/d4;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lc41/d4;->G:Ljava/lang/Object;

    iput-object p3, p0, Lc41/d4;->H:Ljava/lang/Object;

    iput p4, p0, Lc41/d4;->y:I

    iput p5, p0, Lc41/d4;->z:I

    iput p6, p0, Lc41/d4;->E:I

    iput p7, p0, Lc41/d4;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;IILjava/util/Map;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lc41/d4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/d4;->G:Ljava/lang/Object;

    iput-object p2, p0, Lc41/d4;->x:Landroidx/compose/ui/Modifier;

    iput p3, p0, Lc41/d4;->y:I

    iput p4, p0, Lc41/d4;->z:I

    iput-object p5, p0, Lc41/d4;->H:Ljava/lang/Object;

    iput p6, p0, Lc41/d4;->E:I

    iput p7, p0, Lc41/d4;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lc41/d4;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc41/d4;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lc41/d4;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/util/Map;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lc41/d4;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget-object v2, p0, Lc41/d4;->x:Landroidx/compose/ui/Modifier;

    iget v3, p0, Lc41/d4;->y:I

    iget v4, p0, Lc41/d4;->z:I

    iget v8, p0, Lc41/d4;->F:I

    invoke-static/range {v1 .. v8}, Ls2/a;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;IILjava/util/Map;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lc41/d4;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lc41/d4;->H:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/util/TextResource;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Lc41/d4;->x:Landroidx/compose/ui/Modifier;

    iget v4, p0, Lc41/d4;->y:I

    iget v5, p0, Lc41/d4;->z:I

    iget v6, p0, Lc41/d4;->E:I

    iget v7, p0, Lc41/d4;->F:I

    invoke-static/range {v1 .. v9}, Lc41/e4;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
