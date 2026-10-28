.class public final Lcom/whoop/ui/home/redesign/view/MainActivity$h;
.super Lg/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/home/redesign/view/MainActivity;->N0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "com/whoop/ui/home/redesign/view/MainActivity$h",
        "Lg/t;",
        "Ll83/a0;",
        "d",
        "()V",
        "app_prodStandardRelease"
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
.field final synthetic d:Lcom/whoop/ui/home/redesign/view/MainActivity;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/home/redesign/view/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$h;->d:Lcom/whoop/ui/home/redesign/view/MainActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lg/t;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$h;->d:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {v0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->F(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lvm2/d;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$h;->d:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {v1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->G(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lj02/e;

    move-result-object v1

    invoke-virtual {v1}, Lj02/e;->a()Lec3/f2;

    move-result-object v1

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj02/f;

    invoke-virtual {v1}, Lj02/f;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvm2/d;->B(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lg/t;->j(Z)V

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$h;->d:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-virtual {v0}, Lg/l;->getOnBackPressedDispatcher()Lg/z;

    move-result-object v0

    invoke-virtual {v0}, Lg/z;->d()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lg/t;->j(Z)V

    :cond_0
    return-void
.end method
