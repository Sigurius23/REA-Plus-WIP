.class public final Lcom/whoop/membership/dunning/DunningBottomSheetFragment$a;
.super Lpq/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/membership/dunning/DunningBottomSheetFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "com/whoop/membership/dunning/DunningBottomSheetFragment$a",
        "Lpq/c;",
        "Landroid/view/View;",
        "bottomSheet",
        "",
        "newState",
        "Ll83/a0;",
        "c",
        "(Landroid/view/View;I)V",
        "",
        "slideOffset",
        "b",
        "(Landroid/view/View;F)V",
        "membership_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic a:Lcom/whoop/membership/dunning/DunningBottomSheetFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/membership/dunning/DunningBottomSheetFragment$a;->a:Lcom/whoop/membership/dunning/DunningBottomSheetFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;F)V
    .locals 0

    const-string p2, "bottomSheet"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public c(Landroid/view/View;I)V
    .locals 2

    const-string v0, "bottomSheet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x5

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lcom/whoop/membership/dunning/DunningBottomSheetFragment$a;->a:Lcom/whoop/membership/dunning/DunningBottomSheetFragment;

    invoke-static {p1}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->E(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;)Lwv1/b;

    move-result-object p1

    new-instance p2, Lwv1/a$b;

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-direct {p2, v1, v1, v0, v1}, Lwv1/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, p2}, Lwv1/b;->a(Lwv1/a;)V

    iget-object p1, p0, Lcom/whoop/membership/dunning/DunningBottomSheetFragment$a;->a:Lcom/whoop/membership/dunning/DunningBottomSheetFragment;

    invoke-static {p1}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->F(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;)Lvv1/a;

    move-result-object p1

    invoke-virtual {p1}, Lvv1/a;->q()Lbc3/k1;

    iget-object p1, p0, Lcom/whoop/membership/dunning/DunningBottomSheetFragment$a;->a:Lcom/whoop/membership/dunning/DunningBottomSheetFragment;

    invoke-virtual {p1}, Lpq/l;->dismiss()V

    :cond_0
    return-void
.end method
