.class final Lzg0/l$a$a$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzg0/l$a$a;->b(Lzg0/i;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.ai.chat.presentation.TurnCompletionKt$turnCompletions$1$1"
    f = "TurnCompletion.kt"
    l = {
        0x47
    }
    m = "emit"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:I

.field H:I

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:Lzg0/l$a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzg0/l$a$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field K:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lzg0/l$a$a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzg0/l$a$a<",
            "-TT;>;",
            "Lq83/d<",
            "-",
            "Lzg0/l$a$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzg0/l$a$a$a;->J:Lzg0/l$a$a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lzg0/l$a$a$a;->I:Ljava/lang/Object;

    iget p1, p0, Lzg0/l$a$a$a;->K:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lzg0/l$a$a$a;->K:I

    iget-object p1, p0, Lzg0/l$a$a$a;->J:Lzg0/l$a$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lzg0/l$a$a;->b(Lzg0/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
