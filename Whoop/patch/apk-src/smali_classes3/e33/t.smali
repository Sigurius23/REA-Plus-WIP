.class public final Le33/t;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lkotlin/jvm/internal/g0;

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Le33/u;

.field public H:I

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Lkotlin/jvm/internal/g0;

.field public z:Lmc3/a;


# direct methods
.method public constructor <init>(Le33/u;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Le33/t;->G:Le33/u;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Le33/t;->F:Ljava/lang/Object;

    iget p1, p0, Le33/t;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Le33/t;->H:I

    iget-object p1, p0, Le33/t;->G:Le33/u;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Le33/u;->l(Lorg/webrtc/SessionDescription;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
