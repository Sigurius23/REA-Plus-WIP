.class public final Le33/o;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Le33/u;

.field public x:Lorg/webrtc/IceCandidate;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Le33/u;


# direct methods
.method public constructor <init>(Le33/u;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Le33/o;->z:Le33/u;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Le33/o;->y:Ljava/lang/Object;

    iget p1, p0, Le33/o;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Le33/o;->E:I

    iget-object p1, p0, Le33/o;->z:Le33/u;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Le33/u;->a(Lio/getstream/video/android/core/model/IceCandidate;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
