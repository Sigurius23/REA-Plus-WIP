.class public final synthetic Lis0/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Lc93/a;

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Ljava/util/List;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/util/List;Lcom/whoop/design/util/TextResource;ILc93/a;III)V
    .locals 0

    iput p8, p0, Lis0/o0;->w:I

    iput-object p1, p0, Lis0/o0;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lis0/o0;->y:Ljava/util/List;

    iput-object p3, p0, Lis0/o0;->z:Lcom/whoop/design/util/TextResource;

    iput p4, p0, Lis0/o0;->E:I

    iput-object p5, p0, Lis0/o0;->F:Lc93/a;

    iput p6, p0, Lis0/o0;->G:I

    iput p7, p0, Lis0/o0;->H:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lis0/o0;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Lis0/o0;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lis0/o0;->y:Ljava/util/List;

    iget-object v3, p0, Lis0/o0;->z:Lcom/whoop/design/util/TextResource;

    iget v4, p0, Lis0/o0;->E:I

    iget-object v5, p0, Lis0/o0;->F:Lc93/a;

    iget v6, p0, Lis0/o0;->G:I

    iget v7, p0, Lis0/o0;->H:I

    invoke-static/range {v1 .. v9}, Lis0/q0;->g(Landroidx/compose/ui/Modifier;Ljava/util/List;Lcom/whoop/design/util/TextResource;ILc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Lis0/o0;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lis0/o0;->y:Ljava/util/List;

    iget-object v2, p0, Lis0/o0;->z:Lcom/whoop/design/util/TextResource;

    iget v3, p0, Lis0/o0;->E:I

    iget-object v4, p0, Lis0/o0;->F:Lc93/a;

    iget v5, p0, Lis0/o0;->G:I

    iget v6, p0, Lis0/o0;->H:I

    invoke-static/range {v0 .. v8}, Lis0/q0;->e(Landroidx/compose/ui/Modifier;Ljava/util/List;Lcom/whoop/design/util/TextResource;ILc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
