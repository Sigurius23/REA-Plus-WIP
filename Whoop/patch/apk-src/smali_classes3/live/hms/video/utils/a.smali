.class public final synthetic Llive/hms/video/utils/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Llive/hms/video/utils/HMSAgentOs;


# direct methods
.method public synthetic constructor <init>(Llive/hms/video/utils/HMSAgentOs;I)V
    .locals 0

    iput p2, p0, Llive/hms/video/utils/a;->w:I

    iput-object p1, p0, Llive/hms/video/utils/a;->x:Llive/hms/video/utils/HMSAgentOs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llive/hms/video/utils/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llive/hms/video/utils/a;->x:Llive/hms/video/utils/HMSAgentOs;

    invoke-static {v0}, Llive/hms/video/utils/HMSAgentOs;->a(Llive/hms/video/utils/HMSAgentOs;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Llive/hms/video/utils/a;->x:Llive/hms/video/utils/HMSAgentOs;

    invoke-static {v0}, Llive/hms/video/utils/HMSAgentOs;->d(Llive/hms/video/utils/HMSAgentOs;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Llive/hms/video/utils/a;->x:Llive/hms/video/utils/HMSAgentOs;

    invoke-static {v0}, Llive/hms/video/utils/HMSAgentOs;->c(Llive/hms/video/utils/HMSAgentOs;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
