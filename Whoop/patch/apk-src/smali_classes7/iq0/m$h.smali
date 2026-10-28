.class final Liq0/m$h;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liq0/m;->A0(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.community.presentation.chat.CommunityChatViewModel"
    f = "CommunityChatViewModel.kt"
    l = {
        0x61,
        0x64,
        0x66,
        0x67,
        0x68,
        0x69
    }
    m = "getStreamUser"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field G:I

.field H:I

.field I:I

.field synthetic J:Ljava/lang/Object;

.field final synthetic K:Liq0/m;

.field L:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Liq0/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liq0/m;",
            "Lq83/d<",
            "-",
            "Liq0/m$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Liq0/m$h;->K:Liq0/m;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Liq0/m$h;->J:Ljava/lang/Object;

    iget p1, p0, Liq0/m$h;->L:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Liq0/m$h;->L:I

    iget-object p1, p0, Liq0/m$h;->K:Liq0/m;

    invoke-virtual {p1, p0}, Liq0/m;->A0(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
