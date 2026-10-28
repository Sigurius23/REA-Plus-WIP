.class public final synthetic Lio/getstream/chat/android/client/internal/state/utils/internal/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/d;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/d;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/d;->x:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/membership/management/navigation/b;

    invoke-static {v0, p1}, Lcom/whoop/membership/management/MembershipManagementFragment;->B(Ll83/h;Lcom/whoop/membership/management/navigation/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/d;->x:Ljava/lang/Object;

    return-object p1

    :pswitch_1
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/d;->x:Ljava/lang/Object;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
