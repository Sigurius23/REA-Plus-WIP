.class public final synthetic Lw71/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Lp1/c1;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lp1/c1;I)V
    .locals 0

    iput p7, p0, Lw71/q;->w:I

    iput p1, p0, Lw71/q;->x:I

    iput p2, p0, Lw71/q;->y:I

    iput-object p3, p0, Lw71/q;->z:Ljava/lang/Integer;

    iput-boolean p4, p0, Lw71/q;->E:Z

    iput-object p5, p0, Lw71/q;->F:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lw71/q;->G:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lw71/q;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v1, p0, Lw71/q;->x:I

    iget v2, p0, Lw71/q;->y:I

    iget-object v3, p0, Lw71/q;->z:Ljava/lang/Integer;

    iget-boolean v4, p0, Lw71/q;->E:Z

    iget-object v5, p0, Lw71/q;->F:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lw71/q;->G:Lp1/c1;

    invoke-static/range {v1 .. v8}, Lw71/s;->a(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v0, p0, Lw71/q;->x:I

    iget v1, p0, Lw71/q;->y:I

    iget-object v2, p0, Lw71/q;->z:Ljava/lang/Integer;

    iget-boolean v3, p0, Lw71/q;->E:Z

    iget-object v4, p0, Lw71/q;->F:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lw71/q;->G:Lp1/c1;

    invoke-static/range {v0 .. v7}, Lw71/s;->d(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
