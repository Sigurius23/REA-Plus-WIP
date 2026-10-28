.class public final synthetic Lc41/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lc41/k0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/k0;->z:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lc41/k0;->x:Ljava/lang/String;

    iput-object p3, p0, Lc41/k0;->y:Lkotlin/jvm/functions/Function1;

    iput p4, p0, Lc41/k0;->E:I

    iput p5, p0, Lc41/k0;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lc41/k0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/k0;->x:Ljava/lang/String;

    iput-object p2, p0, Lc41/k0;->z:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lc41/k0;->y:Lkotlin/jvm/functions/Function1;

    iput p4, p0, Lc41/k0;->E:I

    iput p5, p0, Lc41/k0;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;II)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Lc41/k0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/k0;->x:Ljava/lang/String;

    iput-object p2, p0, Lc41/k0;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lc41/k0;->z:Landroidx/compose/ui/Modifier;

    iput p4, p0, Lc41/k0;->E:I

    iput p5, p0, Lc41/k0;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lc41/k0;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Lc41/k0;->z:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lc41/k0;->x:Ljava/lang/String;

    iget-object v3, p0, Lc41/k0;->y:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Lc41/k0;->E:I

    iget v5, p0, Lc41/k0;->F:I

    invoke-static/range {v1 .. v7}, Lgz2/h;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lc41/k0;->z:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lc41/k0;->x:Ljava/lang/String;

    iget-object v2, p0, Lc41/k0;->y:Lkotlin/jvm/functions/Function1;

    iget v3, p0, Lc41/k0;->E:I

    iget v4, p0, Lc41/k0;->F:I

    invoke-static/range {v0 .. v6}, Lf02/b;->b(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lc41/k0;->z:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lc41/k0;->x:Ljava/lang/String;

    iget-object v2, p0, Lc41/k0;->y:Lkotlin/jvm/functions/Function1;

    iget v3, p0, Lc41/k0;->E:I

    iget v4, p0, Lc41/k0;->F:I

    invoke-static/range {v0 .. v6}, Lc41/l0;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
