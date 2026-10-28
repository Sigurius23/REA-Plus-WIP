.class public final Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/a;"
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
.field final synthetic w:Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;

.field final synthetic x:Lwn2/i;


# direct methods
.method public constructor <init>(Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;Lwn2/i;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d$a;->w:Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;

    iput-object p2, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d$a;->x:Lwn2/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll83/a0;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d$a;->w:Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;

    new-instance v1, Lwn2/e$e;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d$a;->x:Lwn2/i;

    check-cast v2, Lwn2/i$a;

    invoke-virtual {v2}, Lwn2/i$a;->a()Lcom/whoop/navigation/e;

    move-result-object v2

    invoke-direct {v1, v2}, Lwn2/e$e;-><init>(Lcom/whoop/navigation/e;)V

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment$d$a;->x:Lwn2/i;

    invoke-static {v0, v1, v2}, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;->I(Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;Ljava/lang/Object;Lwn2/i;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
