.class public final synthetic La23/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    iput p3, p0, La23/c;->w:I

    iput-object p1, p0, La23/c;->y:Ljava/lang/String;

    iput-object p2, p0, La23/c;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;I)V
    .locals 0

    .line 2
    iput p3, p0, La23/c;->w:I

    iput-object p1, p0, La23/c;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La23/c;->y:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, La23/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La23/c;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, La23/c;->y:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Ly51/b;->d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, La23/c;->y:Ljava/lang/String;

    iget-object v1, p0, La23/c;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v1, v0}, Lvs2/e;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, La23/c;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, La23/c;->y:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lpq2/a;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, La23/c;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, La23/c;->y:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lpj2/i;->y(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, La23/c;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, La23/c;->y:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lmi2/c;->j(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, La23/c;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, La23/c;->y:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Ljr1/e;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, La23/c;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, La23/c;->y:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Liw0/x;->n(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, La23/c;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, La23/c;->y:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lfe0/e;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, La23/c;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/lifecycle/w1;

    iget-object v1, p0, La23/c;->y:Ljava/lang/String;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoViewModel;->g(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/w1;)Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    move-result-object p1

    return-object p1

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
