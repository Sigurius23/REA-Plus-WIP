.class final Lr03/c$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr03/c;->a(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.workmanager.consolepacketworkmanager.ConsolePacketUploaderImpl"
    f = "ConsolePacketUploaderImpl.kt"
    l = {
        0x26,
        0x29,
        0x2b,
        0x32,
        0x4b
    }
    m = "uploadEvents"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:Ljava/lang/Object;

.field K:Ljava/lang/Object;

.field L:Ljava/lang/Object;

.field M:D

.field N:Z

.field O:J

.field synthetic P:Ljava/lang/Object;

.field final synthetic Q:Lr03/c;

.field R:I

.field w:I

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lr03/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr03/c;",
            "Lq83/d<",
            "-",
            "Lr03/c$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lr03/c$d;->Q:Lr03/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lr03/c$d;->P:Ljava/lang/Object;

    iget p1, p0, Lr03/c$d;->R:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lr03/c$d;->R:I

    iget-object p1, p0, Lr03/c$d;->Q:Lr03/c;

    invoke-virtual {p1, p0}, Lr03/c;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
