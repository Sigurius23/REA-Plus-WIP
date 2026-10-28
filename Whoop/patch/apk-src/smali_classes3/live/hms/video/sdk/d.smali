.class public final synthetic Llive/hms/video/sdk/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Llive/hms/video/sdk/SDKDelegate;


# direct methods
.method public synthetic constructor <init>(Llive/hms/video/sdk/SDKDelegate;I)V
    .locals 0

    iput p2, p0, Llive/hms/video/sdk/d;->w:I

    iput-object p1, p0, Llive/hms/video/sdk/d;->x:Llive/hms/video/sdk/SDKDelegate;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llive/hms/video/sdk/d;->x:Llive/hms/video/sdk/SDKDelegate;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Llive/hms/video/sdk/SDKDelegate;->a(Llive/hms/video/sdk/SDKDelegate;Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Llive/hms/video/sdk/d;->x:Llive/hms/video/sdk/SDKDelegate;

    check-cast p1, Llive/hms/video/sdk/transcripts/HmsTranscripts;

    invoke-static {v0, p1}, Llive/hms/video/sdk/SDKDelegate;->v(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/transcripts/HmsTranscripts;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Llive/hms/video/sdk/d;->x:Llive/hms/video/sdk/SDKDelegate;

    check-cast p1, Llive/hms/video/events/AnalyticsEvent;

    invoke-static {v0, p1}, Llive/hms/video/sdk/SDKDelegate;->u(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/events/AnalyticsEvent;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
