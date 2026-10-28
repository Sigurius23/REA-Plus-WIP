.class public final Ls10/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwz/l1;

.field public final b:Ls10/f;

.field public final c:Lzx/o;

.field public final d:Landroidx/lifecycle/k1;

.field public final e:Ljava/lang/String;

.field public final f:Lny/d;


# direct methods
.method public constructor <init>(Lwz/l1;Ls10/f;Lzx/o;Landroidx/lifecycle/k1;Ljava/lang/String;Lny/d;)V
    .locals 1

    const-string v0, "linkConfigurationCoordinator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "embeddedSelectionHolder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardAccountRangeRepositoryFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedPaymentMethodCode"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tapToAddCollectionHandler"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls10/e;->a:Lwz/l1;

    iput-object p2, p0, Ls10/e;->b:Ls10/f;

    iput-object p3, p0, Ls10/e;->c:Lzx/o;

    iput-object p4, p0, Ls10/e;->d:Landroidx/lifecycle/k1;

    iput-object p5, p0, Ls10/e;->e:Ljava/lang/String;

    iput-object p6, p0, Ls10/e;->f:Lny/d;

    return-void
.end method
