.class final Lug0/b$t;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug0/b;->W(Lec3/m;Ltg0/b;Ltg0/a;Lq83/d;)Ljava/lang/Object;
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
        0x458,
        0x46b,
        0x48b,
        0x48d
    }
    m = "handleImageAction"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:Ljava/lang/Object;

.field synthetic K:Ljava/lang/Object;

.field final synthetic L:Lug0/b;

.field M:I

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
            "Lug0/b$t;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lug0/b$t;->L:Lug0/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lug0/b$t;->K:Ljava/lang/Object;

    iget p1, p0, Lug0/b$t;->M:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lug0/b$t;->M:I

    iget-object p1, p0, Lug0/b$t;->L:Lug0/b;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, v0, p0}, Lug0/b;->t(Lug0/b;Lec3/m;Ltg0/b;Ltg0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
