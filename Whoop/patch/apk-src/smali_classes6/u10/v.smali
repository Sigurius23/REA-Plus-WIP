.class public final Lu10/v;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final w:Lh53/e;

.field public final x:Lbc3/c0;


# direct methods
.method public constructor <init>(Lh53/e;Lbc3/c0;)V
    .locals 1

    const-string v0, "customViewModelScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Lu10/v;->w:Lh53/e;

    iput-object p2, p0, Lu10/v;->x:Lbc3/c0;

    return-void
.end method


# virtual methods
.method public final onCleared()V
    .locals 2

    iget-object v0, p0, Lu10/v;->x:Lbc3/c0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method
