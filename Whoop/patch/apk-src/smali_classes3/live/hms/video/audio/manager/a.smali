.class public final synthetic Llive/hms/video/audio/manager/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Llive/hms/video/audio/manager/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, Llive/hms/video/audio/manager/a;->a:I

    check-cast p1, Landroid/media/AudioDeviceInfo;

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Llive/hms/video/audio/manager/AudioManagerCompat;->b(Landroid/media/AudioDeviceInfo;)Z

    move-result p1

    return p1

    :pswitch_0
    invoke-static {p1}, Llive/hms/video/audio/manager/AudioManagerCompat;->a(Landroid/media/AudioDeviceInfo;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
