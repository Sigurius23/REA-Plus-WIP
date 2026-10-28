.class public final synthetic Llive/hms/video/sdk/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Llive/hms/video/sdk/SDKDelegate;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Llive/hms/video/sdk/SDKDelegate;Ljava/lang/Object;I)V
    .locals 0

    iput p3, p0, Llive/hms/video/sdk/e;->w:I

    iput-object p1, p0, Llive/hms/video/sdk/e;->x:Llive/hms/video/sdk/SDKDelegate;

    iput-object p2, p0, Llive/hms/video/sdk/e;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Llive/hms/video/sdk/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llive/hms/video/sdk/e;->y:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;

    iget-object v1, p0, Llive/hms/video/sdk/e;->x:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v1, v0}, Llive/hms/video/sdk/SDKDelegate;->j(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;)Llive/hms/video/transport/HMSTransport;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Llive/hms/video/sdk/e;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Llive/hms/video/sdk/e;->x:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v1, v0}, Llive/hms/video/sdk/SDKDelegate$preview$2$1;->h(Llive/hms/video/sdk/SDKDelegate;Lbc3/c0;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
