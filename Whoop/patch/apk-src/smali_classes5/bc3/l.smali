.class public final synthetic Lbc3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lbc3/l;->w:I

    iput-object p1, p0, Lbc3/l;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lmc3/c;Lmc3/b;)V
    .locals 0

    .line 2
    const/4 p2, 0x5

    iput p2, p0, Lbc3/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbc3/l;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lbc3/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbc3/l;->x:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    check-cast p1, Ll0/s1;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, p1, p2, p3}, Lvn1/s;->c(Lc93/m;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbc3/l;->x:Ljava/lang/Object;

    check-cast v0, Lk31/d;

    check-cast p1, Lc0/i0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, p1, p2, p3}, Lum1/b;->b(Lk31/d;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lbc3/l;->x:Ljava/lang/Object;

    check-cast v0, Lmc3/h;

    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Ll83/a0;

    check-cast p3, Lq83/j;

    invoke-virtual {v0}, Lmc3/h;->d()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lbc3/l;->x:Ljava/lang/Object;

    check-cast v0, Lmc3/c;

    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Ll83/a0;

    check-cast p3, Lq83/j;

    sget-object p1, Lmc3/c;->H:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 p2, 0x0

    invoke-virtual {p1, v0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, Lmc3/c;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lbc3/l;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    check-cast p1, Lm91/u;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, p1, p2, p3}, Lk71/j;->c(Ljava/lang/String;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lbc3/l;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Lio/getstream/chat/android/models/Channel;

    check-cast p3, Lio/getstream/chat/android/models/Message;

    invoke-static {v0, p1, p2, p3}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->d(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lbc3/l;->x:Ljava/lang/Object;

    check-cast v0, Li91/a;

    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, p1, p2, p3}, Li91/c;->a(Li91/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lbc3/l;->x:Ljava/lang/Object;

    check-cast v0, Ltr2/n;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/lang/Throwable;

    invoke-static {v0, p1, p2, p3}, Lcom/whoop/WhoopApplication;->d(Ltr2/n;ILjava/lang/String;Ljava/lang/Throwable;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object p2, p0, Lbc3/l;->x:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Throwable;

    check-cast p3, Lq83/j;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
