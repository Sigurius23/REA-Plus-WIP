.class public final Lt23/a0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lio/getstream/android/video/generated/models/Credentials;

.field public F:Ljava/util/List;

.field public G:Lstream/video/sfu/event/ReconnectDetails;

.field public synthetic H:Ljava/lang/Object;

.field public final synthetic I:Lt23/c0;

.field public J:I

.field public w:Lt23/c0;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ln23/h;


# direct methods
.method public constructor <init>(Lt23/c0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lt23/a0;->I:Lt23/c0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lt23/a0;->H:Ljava/lang/Object;

    iget p1, p0, Lt23/a0;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lt23/a0;->J:I

    iget-object p1, p0, Lt23/a0;->I:Lt23/c0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lt23/c0;->u(Lx23/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
