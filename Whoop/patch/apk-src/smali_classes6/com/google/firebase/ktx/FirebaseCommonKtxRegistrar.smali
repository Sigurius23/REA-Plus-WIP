.class public final Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00050\u0004H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;",
        "Lcom/google/firebase/components/ComponentRegistrar;",
        "<init>",
        "()V",
        "",
        "Lgt/b;",
        "getComponents",
        "()Ljava/util/List;",
        "com.google.firebase-firebase-common"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ll83/c;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgt/b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lgt/p;

    const-class v1, Lft/a;

    const-class v2, Lbc3/z;

    invoke-direct {v0, v1, v2}, Lgt/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    invoke-static {v0}, Lgt/b;->a(Lgt/p;)Lgt/a;

    move-result-object v0

    new-instance v3, Lgt/p;

    const-class v4, Ljava/util/concurrent/Executor;

    invoke-direct {v3, v1, v4}, Lgt/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    new-instance v1, Lgt/j;

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-direct {v1, v3, v5, v6}, Lgt/j;-><init>(Lgt/p;II)V

    invoke-virtual {v0, v1}, Lgt/a;->a(Lgt/j;)V

    sget-object v1, Lyt/a;->x:Lyt/a;

    iput-object v1, v0, Lgt/a;->f:Lgt/e;

    invoke-virtual {v0}, Lgt/a;->b()Lgt/b;

    move-result-object v0

    new-instance v1, Lgt/p;

    const-class v3, Lft/c;

    invoke-direct {v1, v3, v2}, Lgt/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    invoke-static {v1}, Lgt/b;->a(Lgt/p;)Lgt/a;

    move-result-object v1

    new-instance v7, Lgt/p;

    invoke-direct {v7, v3, v4}, Lgt/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    new-instance v3, Lgt/j;

    invoke-direct {v3, v7, v5, v6}, Lgt/j;-><init>(Lgt/p;II)V

    invoke-virtual {v1, v3}, Lgt/a;->a(Lgt/j;)V

    sget-object v3, Lyt/a;->y:Lyt/a;

    iput-object v3, v1, Lgt/a;->f:Lgt/e;

    invoke-virtual {v1}, Lgt/a;->b()Lgt/b;

    move-result-object v1

    new-instance v3, Lgt/p;

    const-class v7, Lft/b;

    invoke-direct {v3, v7, v2}, Lgt/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    invoke-static {v3}, Lgt/b;->a(Lgt/p;)Lgt/a;

    move-result-object v3

    new-instance v8, Lgt/p;

    invoke-direct {v8, v7, v4}, Lgt/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    new-instance v7, Lgt/j;

    invoke-direct {v7, v8, v5, v6}, Lgt/j;-><init>(Lgt/p;II)V

    invoke-virtual {v3, v7}, Lgt/a;->a(Lgt/j;)V

    sget-object v7, Lyt/a;->z:Lyt/a;

    iput-object v7, v3, Lgt/a;->f:Lgt/e;

    invoke-virtual {v3}, Lgt/a;->b()Lgt/b;

    move-result-object v3

    new-instance v7, Lgt/p;

    const-class v8, Lft/d;

    invoke-direct {v7, v8, v2}, Lgt/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    invoke-static {v7}, Lgt/b;->a(Lgt/p;)Lgt/a;

    move-result-object v2

    new-instance v7, Lgt/p;

    invoke-direct {v7, v8, v4}, Lgt/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    new-instance v4, Lgt/j;

    invoke-direct {v4, v7, v5, v6}, Lgt/j;-><init>(Lgt/p;II)V

    invoke-virtual {v2, v4}, Lgt/a;->a(Lgt/j;)V

    sget-object v4, Lyt/a;->E:Lyt/a;

    iput-object v4, v2, Lgt/a;->f:Lgt/e;

    invoke-virtual {v2}, Lgt/a;->b()Lgt/b;

    move-result-object v2

    filled-new-array {v0, v1, v3, v2}, [Lgt/b;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
