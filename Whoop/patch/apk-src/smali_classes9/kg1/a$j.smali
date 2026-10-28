.class final Lkg1/a$j;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkg1/a;->p(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lgt0/h;ZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.firmwareUpdateService.data.FirmwareUpdateManagerImpl"
    f = "FirmwareUpdateManagerImpl.kt"
    l = {
        0x71,
        0x77,
        0x79,
        0x7e,
        0x7f,
        0x80,
        0x83
    }
    m = "updateStateMachine"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Lkg1/a;

.field I:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Z


# direct methods
.method public constructor <init>(Lkg1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkg1/a;",
            "Lq83/d<",
            "-",
            "Lkg1/a$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkg1/a$j;->H:Lkg1/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lkg1/a$j;->G:Ljava/lang/Object;

    iget p1, p0, Lkg1/a$j;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lkg1/a$j;->I:I

    iget-object p1, p0, Lkg1/a$j;->H:Lkg1/a;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v0, v1, p0}, Lkg1/a;->m(Lkg1/a;Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lgt0/h;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
