.class public final Lcom/whoop/archv2/feature/domain/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lpi0/a;",
        "Lcom/whoop/archv2/feature/domain/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ#\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/whoop/archv2/feature/domain/k;",
        "Lod1/g;",
        "Lpi0/a;",
        "Lcom/whoop/archv2/feature/domain/f;",
        "Lcom/whoop/archv2/feature/domain/j;",
        "cachedInteractor",
        "Lcom/whoop/archv2/feature/domain/l;",
        "noCacheInteractor",
        "Lcom/whoop/navigation/CachePolicyModel;",
        "cachePolicyModel",
        "<init>",
        "(Lcom/whoop/archv2/feature/domain/j;Lcom/whoop/archv2/feature/domain/l;Lcom/whoop/navigation/CachePolicyModel;)V",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/archv2/feature/domain/j;",
        "b",
        "Lcom/whoop/archv2/feature/domain/l;",
        "c",
        "Lcom/whoop/navigation/CachePolicyModel;",
        "arch-v2_release"
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
.field private final a:Lcom/whoop/archv2/feature/domain/j;

.field private final b:Lcom/whoop/archv2/feature/domain/l;

.field private final c:Lcom/whoop/navigation/CachePolicyModel;


# direct methods
.method public constructor <init>(Lcom/whoop/archv2/feature/domain/j;Lcom/whoop/archv2/feature/domain/l;Lcom/whoop/navigation/CachePolicyModel;)V
    .locals 1

    const-string v0, "cachedInteractor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "noCacheInteractor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cachePolicyModel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/archv2/feature/domain/k;->a:Lcom/whoop/archv2/feature/domain/j;

    iput-object p2, p0, Lcom/whoop/archv2/feature/domain/k;->b:Lcom/whoop/archv2/feature/domain/l;

    iput-object p3, p0, Lcom/whoop/archv2/feature/domain/k;->c:Lcom/whoop/navigation/CachePolicyModel;

    return-void
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/k;->c:Lcom/whoop/navigation/CachePolicyModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/CachePolicyModel;->getEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/k;->a:Lcom/whoop/archv2/feature/domain/j;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/k;->b:Lcom/whoop/archv2/feature/domain/l;

    :goto_0
    invoke-interface {v0, p1}, Lod1/g;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method
