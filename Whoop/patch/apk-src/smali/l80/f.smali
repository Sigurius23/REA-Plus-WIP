.class public final synthetic Ll80/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lp1/t2;

.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Lp1/t2;I)V
    .locals 0

    .line 1
    iput p6, p0, Ll80/f;->w:I

    iput-object p1, p0, Ll80/f;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Ll80/f;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Ll80/f;->z:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Ll80/f;->E:Ljava/lang/Object;

    iput-object p5, p0, Ll80/f;->F:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/t2;Lp1/t2;)V
    .locals 1

    .line 2
    const/4 v0, 0x3

    iput v0, p0, Ll80/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll80/f;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Ll80/f;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Ll80/f;->z:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Ll80/f;->F:Lp1/t2;

    iput-object p5, p0, Ll80/f;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Ll80/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll80/f;->E:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/t2;

    move-object v6, p1

    check-cast v6, Lc0/o;

    move-object v7, p2

    check-cast v7, Leb/q;

    move-object v8, p3

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Ll80/f;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ll80/f;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Ll80/f;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Ll80/f;->F:Lp1/t2;

    invoke-static/range {v1 .. v9}, Ll80/n;->r(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/t2;Lp1/t2;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ll80/f;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/r;

    move-object v6, p1

    check-cast v6, Lc0/o;

    move-object v7, p2

    check-cast v7, Leb/q;

    move-object v8, p3

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Ll80/f;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ll80/f;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Ll80/f;->z:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Ll80/f;->F:Lp1/t2;

    invoke-static/range {v1 .. v9}, Ll80/n;->x(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Lp1/t2;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ll80/f;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/r;

    move-object v6, p1

    check-cast v6, Lc0/o;

    move-object v7, p2

    check-cast v7, Leb/q;

    move-object v8, p3

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Ll80/f;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ll80/f;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Ll80/f;->z:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Ll80/f;->F:Lp1/t2;

    invoke-static/range {v1 .. v9}, Ll80/n;->c(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Lp1/t2;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Ll80/f;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/r;

    move-object v6, p1

    check-cast v6, Lc0/o;

    move-object v7, p2

    check-cast v7, Leb/q;

    move-object v8, p3

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Ll80/f;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ll80/f;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Ll80/f;->z:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Ll80/f;->F:Lp1/t2;

    invoke-static/range {v1 .. v9}, Ll80/n;->e(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Lp1/t2;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
