.class public final synthetic Lzq0/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Lzq0/a0;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Lw41/o;


# direct methods
.method public synthetic constructor <init>(Lzq0/a0;Landroidx/compose/ui/Modifier;Lw41/o;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    iput p6, p0, Lzq0/z;->w:I

    iput-object p1, p0, Lzq0/z;->x:Lzq0/a0;

    iput-object p2, p0, Lzq0/z;->y:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lzq0/z;->z:Lw41/o;

    iput-object p4, p0, Lzq0/z;->E:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Lzq0/z;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lzq0/z;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Lzq0/z;->x:Lzq0/a0;

    iget-object v2, p0, Lzq0/z;->y:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Lzq0/z;->z:Lw41/o;

    iget-object v4, p0, Lzq0/z;->E:Lkotlin/jvm/functions/Function1;

    iget v5, p0, Lzq0/z;->F:I

    invoke-static/range {v1 .. v7}, Lzq0/a0;->a(Lzq0/a0;Landroidx/compose/ui/Modifier;Lw41/o;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lzq0/z;->x:Lzq0/a0;

    iget-object v1, p0, Lzq0/z;->y:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lzq0/z;->z:Lw41/o;

    iget-object v3, p0, Lzq0/z;->E:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Lzq0/z;->F:I

    invoke-static/range {v0 .. v6}, Lzq0/a0;->b(Lzq0/a0;Landroidx/compose/ui/Modifier;Lw41/o;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
