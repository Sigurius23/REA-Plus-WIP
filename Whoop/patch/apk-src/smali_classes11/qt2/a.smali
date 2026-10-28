.class public final synthetic Lqt2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lf41/a;


# direct methods
.method public synthetic constructor <init>(Lf41/a;I)V
    .locals 0

    iput p2, p0, Lqt2/a;->w:I

    iput-object p1, p0, Lqt2/a;->x:Lf41/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lqt2/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ll0/s0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget-object v0, p0, Lqt2/a;->x:Lf41/a;

    invoke-static {v0, p1, p2, p3}, Lqt2/b;->a(Lf41/a;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget-object v0, p0, Lqt2/a;->x:Lf41/a;

    invoke-static {v0, p1, p2, p3}, Lqt2/b;->d(Lf41/a;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
