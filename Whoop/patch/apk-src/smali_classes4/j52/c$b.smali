.class final Lj52/c$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj52/c;->a(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.pulseinformationpacket.network.PipUploaderImpl"
    f = "PipUploader.kt"
    l = {
        0x2d,
        0x32
    }
    m = "upload"
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

.field L:S

.field synthetic M:Ljava/lang/Object;

.field final synthetic N:Lj52/c;

.field O:I

.field w:I

.field x:I

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lj52/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj52/c;",
            "Lq83/d<",
            "-",
            "Lj52/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lj52/c$b;->N:Lj52/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lj52/c$b;->M:Ljava/lang/Object;

    iget p1, p0, Lj52/c$b;->O:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lj52/c$b;->O:I

    iget-object p1, p0, Lj52/c$b;->N:Lj52/c;

    invoke-virtual {p1, p0}, Lj52/c;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
