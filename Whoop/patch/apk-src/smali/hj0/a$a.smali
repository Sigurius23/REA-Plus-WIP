.class final Lhj0/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhj0/a;->a(Landroidx/fragment/app/m0;Lq83/d;)Ljava/lang/Object;
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
.field final synthetic w:Landroidx/fragment/app/m0;

.field final synthetic x:Landroidx/lifecycle/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/v0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/fragment/app/m0;Landroidx/lifecycle/v0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/m0;",
            "Landroidx/lifecycle/v0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lhj0/a$a;->w:Landroidx/fragment/app/m0;

    iput-object p2, p0, Lhj0/a$a;->x:Landroidx/lifecycle/v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lhj0/a$a;->w:Landroidx/fragment/app/m0;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getViewLifecycleOwnerLiveData()Landroidx/lifecycle/p0;

    move-result-object p1

    iget-object v0, p0, Lhj0/a$a;->x:Landroidx/lifecycle/v0;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/p0;->removeObserver(Landroidx/lifecycle/v0;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lhj0/a$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
