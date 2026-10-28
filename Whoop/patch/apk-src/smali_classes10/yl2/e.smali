.class public final synthetic Lyl2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lal1/c;Lzk1/c;Lkotlin/jvm/functions/Function1;Leb/s0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lyl2/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyl2/e;->y:Ljava/lang/Object;

    iput-object p2, p0, Lyl2/e;->z:Ljava/lang/Object;

    iput-object p4, p0, Lyl2/e;->E:Ljava/lang/Object;

    iput-object p3, p0, Lyl2/e;->x:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lcm2/a0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lyl2/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyl2/e;->y:Ljava/lang/Object;

    iput-object p2, p0, Lyl2/e;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lyl2/e;->z:Ljava/lang/Object;

    iput-object p4, p0, Lyl2/e;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lyl2/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lyl2/e;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lal1/c;

    iget-object v0, p0, Lyl2/e;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lzk1/c;

    iget-object v0, p0, Lyl2/e;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Leb/s0;

    move-object v5, p1

    check-cast v5, Leb/q;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v4, p0, Lyl2/e;->x:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v7}, Lzk1/a;->i(Lal1/c;Lzk1/c;Leb/s0;Lkotlin/jvm/functions/Function1;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lyl2/e;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcm2/a0;

    iget-object v0, p0, Lyl2/e;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lyl2/e;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Leb/q;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v2, p0, Lyl2/e;->x:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v7}, Lyl2/f;->a(Lcm2/a0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
