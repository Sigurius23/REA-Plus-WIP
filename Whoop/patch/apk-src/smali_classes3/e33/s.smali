.class public final Le33/s;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Le33/u;

.field public F:I

.field public w:Le33/u;

.field public x:Lorg/webrtc/SessionDescription;

.field public y:Lmc3/a;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Le33/u;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Le33/s;->E:Le33/u;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Le33/s;->z:Ljava/lang/Object;

    iget p1, p0, Le33/s;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Le33/s;->F:I

    iget-object p1, p0, Le33/s;->E:Le33/u;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Le33/u;->k(Lorg/webrtc/SessionDescription;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
