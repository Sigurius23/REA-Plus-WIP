.class public final Lu2/x;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lu2/y;


# direct methods
.method public synthetic constructor <init>(Lu2/y;I)V
    .locals 0

    iput p2, p0, Lu2/x;->w:I

    iput-object p1, p0, Lu2/x;->x:Lu2/y;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lu2/x;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroid/view/MotionEvent;

    iget-object v0, p0, Lu2/x;->x:Lu2/y;

    iget-object v0, v0, Lu2/y;->w:Lb4/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lb4/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    const-string p1, "onTouchEvent"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_0
    check-cast p1, Landroid/view/MotionEvent;

    iget-object v0, p0, Lu2/x;->x:Lu2/y;

    iget-object v0, v0, Lu2/y;->w:Lb4/e;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lb4/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    const-string p1, "onTouchEvent"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
