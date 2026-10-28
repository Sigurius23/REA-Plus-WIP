.class public final Lt23/f3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lorg/webrtc/EglBase$Context;

.field public final b:Lec3/h2;

.field public final c:Lec3/h2;

.field public final d:Lec3/h2;

.field public e:Ljava/nio/ByteBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lstream/video/sfu/models/VideoDimension;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/16 v1, 0x780

    const/16 v2, 0x438

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lstream/video/sfu/models/VideoDimension;-><init>(IILne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lt23/x1;Lorg/webrtc/EglBase$Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lt23/f3;->a:Lorg/webrtc/EglBase$Context;

    const-string p1, "Media:ScreenShareManager"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    sget-object p1, Lt23/p1;->a:Lt23/p1;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lt23/f3;->b:Lec3/h2;

    iput-object p1, p0, Lt23/f3;->c:Lec3/h2;

    sget-object p2, Lt23/e3;->w:Lt23/e3;

    invoke-static {p1, p2}, Lx30/s0;->x(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lt23/f3;->d:Lec3/h2;

    return-void
.end method
