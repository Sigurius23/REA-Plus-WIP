.class public final Lxz/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/lifecycle/k1;

.field public final b:Lec3/r1;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/k1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxz/f0;->a:Landroidx/lifecycle/k1;

    new-instance v0, Lwz/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lwz/d;-><init>(Ld00/l;Lwz/c;)V

    const-string v1, "LINK_ACCOUNT_HOLDER_STATE"

    invoke-virtual {p1, v0, v1}, Landroidx/lifecycle/k1;->c(Ljava/lang/Object;Ljava/lang/String;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lxz/f0;->b:Lec3/r1;

    return-void
.end method


# virtual methods
.method public final a(Lwz/d;)V
    .locals 2

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxz/f0;->a:Landroidx/lifecycle/k1;

    const-string v1, "LINK_ACCOUNT_HOLDER_STATE"

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
