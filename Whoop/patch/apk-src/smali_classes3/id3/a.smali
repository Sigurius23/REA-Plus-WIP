.class public final synthetic Lid3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Llive/hms/video/polls/models/HmsPoll;


# direct methods
.method public synthetic constructor <init>(Llive/hms/video/polls/models/HmsPoll;I)V
    .locals 0

    iput p2, p0, Lid3/a;->w:I

    iput-object p1, p0, Lid3/a;->x:Llive/hms/video/polls/models/HmsPoll;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lid3/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lid3/a;->x:Llive/hms/video/polls/models/HmsPoll;

    invoke-static {v0}, Llive/hms/video/polls/models/HmsPoll;->c(Llive/hms/video/polls/models/HmsPoll;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lid3/a;->x:Llive/hms/video/polls/models/HmsPoll;

    invoke-static {v0}, Llive/hms/video/polls/models/HmsPoll;->b(Llive/hms/video/polls/models/HmsPoll;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lid3/a;->x:Llive/hms/video/polls/models/HmsPoll;

    invoke-static {v0}, Llive/hms/video/polls/models/HmsPoll;->a(Llive/hms/video/polls/models/HmsPoll;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
