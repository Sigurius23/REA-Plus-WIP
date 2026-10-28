.class final Lch0/o0$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch0/o0;->C(ZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.ai.chat.view.AiChatScrollBehavior"
    f = "AiChatScrollBehavior.kt"
    l = {
        0xfd,
        0x104,
        0x10e
    }
    m = "pinAfterSettle"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field G:I

.field H:I

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:Lch0/o0;

.field K:I

.field w:Z

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lch0/o0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lch0/o0;",
            "Lq83/d<",
            "-",
            "Lch0/o0$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lch0/o0$b;->J:Lch0/o0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lch0/o0$b;->I:Ljava/lang/Object;

    iget p1, p0, Lch0/o0$b;->K:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lch0/o0$b;->K:I

    iget-object p1, p0, Lch0/o0$b;->J:Lch0/o0;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, p0}, Lch0/o0;->f(Lch0/o0;ZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
