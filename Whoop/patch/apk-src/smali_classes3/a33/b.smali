.class public final La33/b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final x:La33/b;

.field public static final y:La33/b;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, La33/b;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, La33/b;-><init>(II)V

    sput-object v0, La33/b;->x:La33/b;

    new-instance v0, La33/b;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, La33/b;-><init>(II)V

    sput-object v0, La33/b;->y:La33/b;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, La33/b;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, La33/b;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lio/getstream/android/video/generated/models/ClientEvent;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/ClientEvent;->toLog$stream_video_android_core_release()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lio/getstream/android/video/generated/models/ClientEvent;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/ClientEvent;->toLog$stream_video_android_core_release()Ljava/lang/String;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
