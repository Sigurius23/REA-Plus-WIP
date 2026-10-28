.class final Lzh2/f$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzh2/f;->a(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.straphistorysync.sink.PacketSinkImpl"
    f = "PacketSink.kt"
    l = {
        0x88,
        0x89,
        0x8a
    }
    m = "flush"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:I

.field I:I

.field J:I

.field K:Z

.field synthetic L:Ljava/lang/Object;

.field final synthetic M:Lzh2/f;

.field N:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lzh2/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzh2/f;",
            "Lq83/d<",
            "-",
            "Lzh2/f$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzh2/f$c;->M:Lzh2/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lzh2/f$c;->L:Ljava/lang/Object;

    iget p1, p0, Lzh2/f$c;->N:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lzh2/f$c;->N:I

    iget-object p1, p0, Lzh2/f$c;->M:Lzh2/f;

    invoke-virtual {p1, p0}, Lzh2/f;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
