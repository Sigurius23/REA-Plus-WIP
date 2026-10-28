.class public final synthetic La23/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    iput p3, p0, La23/b;->w:I

    iput-object p1, p0, La23/b;->x:Ljava/lang/String;

    iput-object p2, p0, La23/b;->y:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, La23/b;->w:I

    const-string v1, "$this$semantics"

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, p0, La23/b;->y:Ljava/lang/String;

    iget-object v4, p0, La23/b;->x:Ljava/lang/String;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Li3/z;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    return-object v2

    :pswitch_0
    check-cast p1, Ltb/a;

    invoke-static {v4, v3, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->g(Ljava/lang/String;Ljava/lang/String;Ltb/a;)V

    return-object v2

    :pswitch_1
    check-cast p1, Li3/z;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    sget-object v0, Li3/w;->a:[Lj93/z;

    sget-object v0, Li3/u;->K:Li3/y;

    check-cast p1, Li3/l;

    invoke-virtual {p1, v0, v3}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    return-object v2

    :pswitch_2
    check-cast p1, Li3/z;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, p1}, Li3/w;->k(Ljava/lang/String;Li3/z;)V

    sget-object v0, Li3/u;->b:Li3/y;

    sget-object v1, Li3/w;->a:[Lj93/z;

    const/4 v4, 0x0

    aget-object v1, v1, v4

    invoke-virtual {v0, p1, v3}, Li3/y;->a(Li3/z;Ljava/lang/Object;)V

    return-object v2

    :pswitch_3
    check-cast p1, Li3/z;

    invoke-static {v4, v3, p1}, Lau1/h;->d(Ljava/lang/String;Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Landroidx/lifecycle/w1;

    invoke-static {v4, v3, p1}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoMemberViewModel;->g(Ljava/lang/String;Ljava/lang/String;Landroidx/lifecycle/w1;)Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
