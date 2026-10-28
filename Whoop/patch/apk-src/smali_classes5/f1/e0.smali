.class public final Lf1/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lu0/d1;


# direct methods
.method public synthetic constructor <init>(Lu0/d1;I)V
    .locals 0

    iput p2, p0, Lf1/e0;->w:I

    iput-object p1, p0, Lf1/e0;->x:Lu0/d1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lf1/e0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf1/e0;->x:Lu0/d1;

    invoke-static {p1, v0, p2}, Lu0/n0;->k(Lu2/v;Lu0/d1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_0
    return-object p1

    :pswitch_0
    iget-object v0, p0, Lf1/e0;->x:Lu0/d1;

    invoke-static {p1, v0, p2}, Lu0/n0;->k(Lu2/v;Lu0/d1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    goto :goto_1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
