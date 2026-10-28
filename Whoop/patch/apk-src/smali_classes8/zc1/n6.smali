.class public final synthetic Lzc1/n6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:Landroid/content/Context;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Landroid/content/Context;Lp1/c1;I)V
    .locals 0

    iput p4, p0, Lzc1/n6;->w:I

    iput-object p1, p0, Lzc1/n6;->x:Ljava/util/List;

    iput-object p2, p0, Lzc1/n6;->y:Landroid/content/Context;

    iput-object p3, p0, Lzc1/n6;->z:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lzc1/n6;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    move-object v6, p3

    check-cast v6, Lf31/a;

    move-object v7, p4

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p5, Ljava/lang/Integer;

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v1, p0, Lzc1/n6;->x:Ljava/util/List;

    iget-object v2, p0, Lzc1/n6;->y:Landroid/content/Context;

    iget-object v3, p0, Lzc1/n6;->z:Lp1/c1;

    invoke-static/range {v1 .. v8}, Lzc1/p6;->i(Ljava/util/List;Landroid/content/Context;Lp1/c1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v3, p1

    check-cast v3, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    move-object v5, p3

    check-cast v5, Lf31/a;

    move-object v6, p4

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p5, Ljava/lang/Integer;

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Lzc1/n6;->x:Ljava/util/List;

    iget-object v1, p0, Lzc1/n6;->y:Landroid/content/Context;

    iget-object v2, p0, Lzc1/n6;->z:Lp1/c1;

    invoke-static/range {v0 .. v7}, Lzc1/p6;->b(Ljava/util/List;Landroid/content/Context;Lp1/c1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v3, p1

    check-cast v3, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    move-object v5, p3

    check-cast v5, Lf31/a;

    move-object v6, p4

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p5, Ljava/lang/Integer;

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Lzc1/n6;->x:Ljava/util/List;

    iget-object v1, p0, Lzc1/n6;->y:Landroid/content/Context;

    iget-object v2, p0, Lzc1/n6;->z:Lp1/c1;

    invoke-static/range {v0 .. v7}, Lzc1/p6;->e(Ljava/util/List;Landroid/content/Context;Lp1/c1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
