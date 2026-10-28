.class final Lug0/b$o;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug0/b;->U(Lec3/m;Ltg0/b;Ltg0/a;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner"
    f = "AiChatConversationCombiner.kt"
    l = {
        0x4a3,
        0x4c3,
        0x4c6,
        0x4d4,
        0x4d5
    }
    m = "handleFileAction"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lug0/b;

.field J:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lug0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lug0/b;",
            "Lq83/d<",
            "-",
            "Lug0/b$o;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lug0/b$o;->I:Lug0/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lug0/b$o;->H:Ljava/lang/Object;

    iget p1, p0, Lug0/b$o;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lug0/b$o;->J:I

    iget-object p1, p0, Lug0/b$o;->I:Lug0/b;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, v0, p0}, Lug0/b;->r(Lug0/b;Lec3/m;Ltg0/b;Ltg0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
