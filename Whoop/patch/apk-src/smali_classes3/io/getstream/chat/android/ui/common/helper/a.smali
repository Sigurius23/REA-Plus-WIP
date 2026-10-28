.class public final synthetic Lio/getstream/chat/android/ui/common/helper/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/common/helper/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/helper/a;->x:Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/helper/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/a;->x:Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;

    invoke-static {v0}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->b(Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/a;->x:Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;

    invoke-static {v0}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->a(Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/a;->x:Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;

    invoke-static {v0}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;->c(Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
