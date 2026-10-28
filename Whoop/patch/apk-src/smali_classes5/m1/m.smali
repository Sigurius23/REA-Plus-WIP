.class public final Lm1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ll1/x4;


# direct methods
.method public synthetic constructor <init>(Ll1/x4;I)V
    .locals 0

    iput p2, p0, Lm1/m;->w:I

    iput-object p1, p0, Lm1/m;->x:Ll1/x4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lm1/m;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lm1/l;

    const/4 v1, 0x0

    const/4 v2, 0x1

    iget-object v3, p0, Lm1/m;->x:Ll1/x4;

    invoke-direct {v0, p1, v3, v1, v2}, Lm1/l;-><init>(Lu2/v;Ll1/x4;Lq83/d;I)V

    invoke-static {v0, p2}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_0
    return-object p1

    :pswitch_0
    new-instance v0, Lm1/l;

    const/4 v1, 0x0

    const/4 v2, 0x0

    iget-object v3, p0, Lm1/m;->x:Ll1/x4;

    invoke-direct {v0, p1, v3, v1, v2}, Lm1/l;-><init>(Lu2/v;Ll1/x4;Lq83/d;I)V

    invoke-static {v0, p2}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

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
