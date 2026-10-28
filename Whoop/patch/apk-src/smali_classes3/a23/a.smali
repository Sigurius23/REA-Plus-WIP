.class public final synthetic La23/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, La23/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La23/a;->z:Ljava/lang/String;

    iput-object p2, p0, La23/a;->x:Ljava/util/List;

    iput-object p3, p0, La23/a;->y:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, La23/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La23/a;->x:Ljava/util/List;

    iput-object p2, p0, La23/a;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La23/a;->z:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, La23/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La23/a;->z:Ljava/lang/String;

    check-cast p1, Ln0/q;

    iget-object v1, p0, La23/a;->x:Ljava/util/List;

    iget-object v2, p0, La23/a;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2, v0, p1}, Lio2/m0;->n(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, La23/a;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/lifecycle/w1;

    iget-object v1, p0, La23/a;->z:Ljava/lang/String;

    iget-object v2, p0, La23/a;->x:Ljava/util/List;

    invoke-static {v1, v2, v0, p1}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;->g(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/w1;)Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
