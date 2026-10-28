.class public final synthetic Lwo1/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lp1/c1;I)V
    .locals 0

    iput p3, p0, Lwo1/n;->w:I

    iput-object p1, p0, Lwo1/n;->x:Ljava/lang/Object;

    iput-object p2, p0, Lwo1/n;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lwo1/n;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lwo1/n;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, Lwo1/n;->y:Lp1/c1;

    move-object v2, v0

    check-cast v2, Lp1/a1;

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

    invoke-static/range {v1 .. v7}, Lz80/a;->g(Ljava/util/List;Lp1/a1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lwo1/n;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lso1/q;

    move-object v3, p1

    check-cast v3, Landroidx/compose/foundation/lazy/a;

    move-object v4, p2

    check-cast v4, Lso1/t;

    move-object v5, p3

    check-cast v5, Lf31/a;

    move-object v6, p4

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p5, Ljava/lang/Integer;

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v2, p0, Lwo1/n;->y:Lp1/c1;

    invoke-static/range {v1 .. v7}, Lwo1/o;->h(Lso1/q;Lp1/c1;Landroidx/compose/foundation/lazy/a;Lso1/t;Lf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
