.class public final synthetic Lw71/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Lw71/l;

.field public final synthetic y:Lw71/y;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lw71/l;Lw71/y;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    iput p5, p0, Lw71/h;->w:I

    iput-object p1, p0, Lw71/h;->x:Lw71/l;

    iput-object p2, p0, Lw71/h;->y:Lw71/y;

    iput-object p3, p0, Lw71/h;->z:Lkotlin/jvm/functions/Function1;

    iput p4, p0, Lw71/h;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lw71/h;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Lw71/h;->x:Lw71/l;

    iget-object v2, p0, Lw71/h;->y:Lw71/y;

    iget-object v3, p0, Lw71/h;->z:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Lw71/h;->E:I

    invoke-static/range {v1 .. v6}, Lw71/l;->B(Lw71/l;Lw71/y;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lw71/h;->x:Lw71/l;

    iget-object v1, p0, Lw71/h;->y:Lw71/y;

    iget-object v2, p0, Lw71/h;->z:Lkotlin/jvm/functions/Function1;

    iget v3, p0, Lw71/h;->E:I

    invoke-static/range {v0 .. v5}, Lw71/l;->y(Lw71/l;Lw71/y;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
