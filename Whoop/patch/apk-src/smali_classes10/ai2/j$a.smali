.class final Lai2/j$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lai2/j;->a(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.straphistorysync.sink.collectors.PipCollector"
    f = "PipCollector.kt"
    l = {
        0x36
    }
    m = "flush"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lai2/j;

.field z:I


# direct methods
.method public constructor <init>(Lai2/j;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lai2/j;",
            "Lq83/d<",
            "-",
            "Lai2/j$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lai2/j$a;->y:Lai2/j;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lai2/j$a;->x:Ljava/lang/Object;

    iget p1, p0, Lai2/j$a;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lai2/j$a;->z:I

    iget-object p1, p0, Lai2/j$a;->y:Lai2/j;

    invoke-virtual {p1, p0}, Lai2/j;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
