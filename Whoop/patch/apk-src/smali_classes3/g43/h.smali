.class public final Lg43/h;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lio/getstream/video/android/model/StreamCallId;

.field public F:Lio/getstream/video/android/model/StreamCallId;

.field public G:Lg43/j;

.field public H:Landroid/app/PendingIntent;

.field public I:Landroid/support/v4/media/session/p;

.field public synthetic J:Ljava/lang/Object;

.field public final synthetic K:Lg43/j;

.field public L:I

.field public w:Lg43/j;

.field public x:Lt23/c0;

.field public y:Ljava/lang/String;

.field public z:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lg43/j;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lg43/h;->K:Lg43/j;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lg43/h;->J:Ljava/lang/Object;

    iget p1, p0, Lg43/h;->L:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lg43/h;->L:I

    iget-object p1, p0, Lg43/h;->K:Lg43/j;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lg43/j;->r(Lg43/j;Lt23/c0;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
