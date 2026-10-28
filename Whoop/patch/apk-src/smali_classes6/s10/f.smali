.class public final Ls10/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/lifecycle/k1;

.field public final b:Lec3/r1;

.field public final c:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/k1;)V
    .locals 2

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls10/f;->a:Landroidx/lifecycle/k1;

    const/4 v0, 0x0

    const-string v1, "EMBEDDED_SELECTION_KEY"

    invoke-virtual {p1, v0, v1}, Landroidx/lifecycle/k1;->c(Ljava/lang/Object;Ljava/lang/String;)Lec3/r1;

    move-result-object v1

    iput-object v1, p0, Ls10/f;->b:Lec3/r1;

    const-string v1, "EMBEDDED_TEMPORARY_SELECTION_KEY"

    invoke-virtual {p1, v0, v1}, Landroidx/lifecycle/k1;->c(Ljava/lang/Object;Ljava/lang/String;)Lec3/r1;

    const-string v0, "EMBEDDED_PREVIOUS_SELECTIONS_KEY"

    invoke-virtual {p1, v0}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    if-nez p1, :cond_0

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    :cond_0
    iput-object p1, p0, Ls10/f;->c:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final a(Lq20/y;)V
    .locals 2

    iget-object v0, p0, Ls10/f;->a:Landroidx/lifecycle/k1;

    const-string v1, "EMBEDDED_SELECTION_KEY"

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    instance-of v0, p1, Lq20/t;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls10/f;->c:Landroid/os/Bundle;

    invoke-static {p1}, Lug/m;->D(Lq20/y;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    return-void
.end method
