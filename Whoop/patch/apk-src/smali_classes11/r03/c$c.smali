.class final Lr03/c$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr03/c;->l(Lq83/d;)Ljava/lang/Object;
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
        0x8f,
        0x93,
        0x95
    }
    m = "removeOlderStrapLogs"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lr03/c;

.field F:I

.field w:J

.field x:Ljava/lang/Object;

.field y:I

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lr03/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr03/c;",
            "Lq83/d<",
            "-",
            "Lr03/c$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lr03/c$c;->E:Lr03/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lr03/c$c;->z:Ljava/lang/Object;

    iget p1, p0, Lr03/c$c;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lr03/c$c;->F:I

    iget-object p1, p0, Lr03/c$c;->E:Lr03/c;

    invoke-static {p1, p0}, Lr03/c;->g(Lr03/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
