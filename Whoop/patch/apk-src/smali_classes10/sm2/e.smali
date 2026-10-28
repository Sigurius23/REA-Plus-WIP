.class public abstract Lsm2/e;
.super Landroidx/viewpager2/adapter/i;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\r\u0010\tR#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u001c\u0010!\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u001f\u001a\u0004\u0008\u001a\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lsm2/e;",
        "Landroidx/viewpager2/adapter/i;",
        "Landroidx/fragment/app/m0;",
        "fragment",
        "<init>",
        "(Landroidx/fragment/app/m0;)V",
        "",
        "position",
        "createFragment",
        "(I)Landroidx/fragment/app/m0;",
        "",
        "getItemId",
        "(I)J",
        "d",
        "",
        "a",
        "Ljava/util/Map;",
        "getFragmentMap",
        "()Ljava/util/Map;",
        "fragmentMap",
        "Ljava/lang/ref/WeakReference;",
        "",
        "b",
        "Ljava/lang/ref/WeakReference;",
        "listener",
        "Landroidx/fragment/app/o1;",
        "c",
        "Landroidx/fragment/app/o1;",
        "getFragmentManager",
        "()Landroidx/fragment/app/o1;",
        "fragmentManager",
        "Ljava/lang/Integer;",
        "()Ljava/lang/Integer;",
        "expectedItemCount",
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
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroidx/fragment/app/m0;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Landroidx/fragment/app/o1;

.field private final d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/m0;)V
    .locals 1

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/viewpager2/adapter/i;-><init>(Landroidx/fragment/app/m0;)V

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lsm2/e;->a:Ljava/util/Map;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getChildFragmentManager()Landroidx/fragment/app/o1;

    move-result-object p1

    const-string v0, "getChildFragmentManager(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lsm2/e;->c:Landroidx/fragment/app/o1;

    return-void
.end method


# virtual methods
.method public c()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lsm2/e;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public createFragment(I)Landroidx/fragment/app/m0;
    .locals 2

    invoke-virtual {p0, p1}, Lsm2/e;->d(I)Landroidx/fragment/app/m0;

    move-result-object v0

    iget-object v1, p0, Lsm2/e;->a:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lsm2/e;->a:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result p1

    invoke-virtual {p0}, Lsm2/e;->c()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne p1, v1, :cond_2

    iget-object p1, p0, Lsm2/e;->b:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    return-object v0
.end method

.method public abstract d(I)Landroidx/fragment/app/m0;
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method
