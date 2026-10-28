.class public final Lt23/y;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lkotlin/jvm/internal/e0;

.field public F:J

.field public synthetic G:Ljava/lang/Object;

.field public final synthetic H:Lt23/c0;

.field public I:I

.field public w:Lt23/c0;

.field public x:Lstream/video/sfu/models/WebsocketReconnectStrategy;

.field public y:Ljava/lang/String;

.field public z:Lkotlin/jvm/internal/g0;


# direct methods
.method public constructor <init>(Lt23/c0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lt23/y;->H:Lt23/c0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lt23/y;->G:Ljava/lang/Object;

    iget p1, p0, Lt23/y;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lt23/y;->I:I

    iget-object p1, p0, Lt23/y;->H:Lt23/c0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lt23/c0;->s(Lstream/video/sfu/models/WebsocketReconnectStrategy;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
