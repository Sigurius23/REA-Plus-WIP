.class public final Le33/q;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Le33/u;

.field public G:I

.field public w:Ljava/lang/Object;

.field public x:Lio/getstream/video/android/core/model/IceCandidate;

.field public y:Lmc3/a;

.field public z:Lmc3/c;


# direct methods
.method public constructor <init>(Le33/u;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Le33/q;->F:Le33/u;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Le33/q;->E:Ljava/lang/Object;

    iget p1, p0, Le33/q;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Le33/q;->G:I

    iget-object p1, p0, Le33/q;->F:Le33/u;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Le33/u;->g(Lio/getstream/video/android/core/model/IceCandidate;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
