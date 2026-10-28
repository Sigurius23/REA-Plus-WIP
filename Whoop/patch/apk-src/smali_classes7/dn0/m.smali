.class public final synthetic Ldn0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/Object;I)V
    .locals 0

    iput p3, p0, Ldn0/m;->w:I

    iput-boolean p1, p0, Ldn0/m;->x:Z

    iput-object p2, p0, Ldn0/m;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Ldn0/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldn0/m;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    move-object v3, p1

    check-cast v3, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    move-object v5, p3

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v1, p0, Ldn0/m;->x:Z

    invoke-static/range {v1 .. v6}, Lev2/u;->R(ZLjava/lang/String;Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ldn0/m;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v3, p1

    check-cast v3, Lqy0/a;

    move-object v4, p2

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v5, p3

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v1, p0, Ldn0/m;->x:Z

    invoke-static/range {v1 .. v6}, Ldn0/p;->w(ZLkotlin/jvm/functions/Function1;Lqy0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
