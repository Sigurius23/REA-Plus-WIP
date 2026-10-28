.class public final Lg1/l2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;I)V
    .locals 0

    iput p2, p0, Lg1/l2;->w:I

    iput-object p1, p0, Lg1/l2;->x:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lg1/l2;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v5, Lh0/l0;

    const/16 v0, 0xe

    iget-object v1, p0, Lg1/l2;->x:Lc93/a;

    invoke-direct {v5, v1, v0}, Lh0/l0;-><init>(Lc93/a;I)V

    const/4 v7, 0x7

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    move-object v6, p2

    invoke-static/range {v1 .. v7}, Lh0/o3;->e(Lu2/v;Lkotlin/jvm/functions/Function1;Lm12/c;Lg1/d6;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_0
    return-object p1

    :pswitch_0
    move-object v0, p1

    move-object v5, p2

    new-instance v4, Laz1/b;

    const/16 p1, 0x1c

    iget-object p2, p0, Lg1/l2;->x:Lc93/a;

    invoke-direct {v4, p2, p1}, Laz1/b;-><init>(Lc93/a;I)V

    const/4 v6, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lh0/o3;->e(Lu2/v;Lkotlin/jvm/functions/Function1;Lm12/c;Lg1/d6;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    goto :goto_1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object p1

    :pswitch_1
    move-object v0, p1

    move-object v5, p2

    new-instance v4, Laz1/b;

    const/16 p1, 0x1b

    iget-object p2, p0, Lg1/l2;->x:Lc93/a;

    invoke-direct {v4, p2, p1}, Laz1/b;-><init>(Lc93/a;I)V

    const/4 v6, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lh0/o3;->e(Lu2/v;Lkotlin/jvm/functions/Function1;Lm12/c;Lg1/d6;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    goto :goto_2

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_2
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
