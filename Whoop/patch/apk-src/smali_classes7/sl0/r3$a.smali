.class final Lsl0/r3$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl0/r3;->m(Ll0/y;Lnl0/f;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
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


# instance fields
.field final synthetic w:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field final synthetic x:Lnl0/c;

.field final synthetic y:Lb3/x2;

.field final synthetic z:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lnl0/c;Lb3/x2;Lc93/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/FeatureFlagChecker;",
            "Lnl0/c;",
            "Lb3/x2;",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lsl0/r3$a;->w:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p2, p0, Lsl0/r3$a;->x:Lnl0/c;

    iput-object p3, p0, Lsl0/r3$a;->y:Lb3/x2;

    iput-object p4, p0, Lsl0/r3$a;->z:Lc93/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/bot/models/feedback/AiFeedbackType;)V
    .locals 3

    iget-object v0, p0, Lsl0/r3$a;->w:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "whoop-coach-feedback-v3"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    new-instance v0, Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    invoke-virtual {p1}, Lcom/whoop/bot/models/feedback/AiFeedbackType;->getValue()Ljava/lang/String;

    move-result-object p1

    const-string v1, ""

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-direct {v0, p1, v1, v2}, Lcom/whoop/bot/models/feedback/AiMessageFeedback;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lsl0/r3$a;->x:Lnl0/c;

    invoke-virtual {p1}, Lnl0/c;->c()Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    move-result-object v0

    :goto_0
    iget-object p1, p0, Lsl0/r3$a;->y:Lb3/x2;

    if-eqz p1, :cond_1

    check-cast p1, Lb3/x1;

    invoke-virtual {p1}, Lb3/x1;->a()V

    :cond_1
    iget-object p1, p0, Lsl0/r3$a;->z:Lc93/m;

    iget-object v1, p0, Lsl0/r3$a;->x:Lnl0/c;

    invoke-virtual {v1}, Lnl0/c;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/bot/models/feedback/AiFeedbackType;

    invoke-virtual {p0, p1}, Lsl0/r3$a;->a(Lcom/whoop/bot/models/feedback/AiFeedbackType;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
