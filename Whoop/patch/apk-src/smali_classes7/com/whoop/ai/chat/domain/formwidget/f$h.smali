.class final Lcom/whoop/ai/chat/domain/formwidget/f$h;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ai/chat/domain/formwidget/f;->r(Lcom/whoop/ai/chat/domain/formwidget/c$h;Lcom/whoop/ai/chat/domain/formwidget/f$c;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.ai.chat.domain.formwidget.FormWidgetInteractor"
    f = "FormWidgetInteractor.kt"
    l = {
        0xc6,
        0xc9
    }
    m = "executeIntermediateSubmit"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/ai/chat/domain/formwidget/f;

.field F:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/ai/chat/domain/formwidget/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ai/chat/domain/formwidget/f;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/ai/chat/domain/formwidget/f$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/ai/chat/domain/formwidget/f$h;->E:Lcom/whoop/ai/chat/domain/formwidget/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/ai/chat/domain/formwidget/f$h;->z:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/ai/chat/domain/formwidget/f$h;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/ai/chat/domain/formwidget/f$h;->F:I

    iget-object p1, p0, Lcom/whoop/ai/chat/domain/formwidget/f$h;->E:Lcom/whoop/ai/chat/domain/formwidget/f;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lcom/whoop/ai/chat/domain/formwidget/f;->d(Lcom/whoop/ai/chat/domain/formwidget/f;Lcom/whoop/ai/chat/domain/formwidget/c$h;Lcom/whoop/ai/chat/domain/formwidget/f$c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
