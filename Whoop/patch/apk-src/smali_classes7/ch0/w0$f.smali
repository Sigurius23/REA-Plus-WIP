.class public final Lch0/w0$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch0/w0;->i(Landroid/content/Context;Lsl0/n0;Landroidx/compose/runtime/Composer;I)Lch0/v0;
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
.field final synthetic w:Lld1/a;


# direct methods
.method public constructor <init>(Lld1/a;)V
    .locals 0

    iput-object p1, p0, Lch0/w0$f;->w:Lld1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljf3/a;
    .locals 3

    iget-object v0, p0, Lch0/w0$f;->w:Lld1/a;

    const-string v1, "storeOwner"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljf3/a;

    invoke-interface {v0}, Landroidx/lifecycle/f2;->getViewModelStore()Landroidx/lifecycle/e2;

    move-result-object v0

    const-string v2, "storeOwner.viewModelStore"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Ljf3/a;-><init>(Landroidx/lifecycle/e2;Lpb/f;)V

    return-object v1
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lch0/w0$f;->a()Ljf3/a;

    move-result-object v0

    return-object v0
.end method
