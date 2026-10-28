.class final Lgh0/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgh0/e;->p(Lcom/whoop/bot/models/feedback/AiFeedbackType;ZLc93/a;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic w:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    iput-wide p1, p0, Lgh0/e$a;->w:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ly81/i;)J
    .locals 2

    const-string v0, "$this$whoopColor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Lgh0/e$a;->w:J

    return-wide v0
.end method

.method public synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ly81/i;

    invoke-virtual {p0, p1}, Lgh0/e$a;->a(Ly81/i;)J

    move-result-wide v0

    new-instance p1, Li2/x;

    invoke-direct {p1, v0, v1}, Li2/x;-><init>(J)V

    return-object p1
.end method
