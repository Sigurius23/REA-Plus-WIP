.class public final Lrk2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ!\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0008\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lrk2/a;",
        "",
        "<init>",
        "()V",
        "",
        "Lcom/whoop/addactivity/network/CreateActivityPauseSegment;",
        "segments",
        "",
        "b",
        "(Ljava/util/List;)Ljava/lang/String;",
        "value",
        "a",
        "(Ljava/lang/String;)Ljava/util/List;",
        "Lad3/c;",
        "Lad3/c;",
        "json",
        "Lwc3/c;",
        "Lwc3/c;",
        "serializer",
        "track-activity_release"
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
.field private final a:Lad3/c;

.field private final b:Lwc3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwc3/c;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object v0

    iput-object v0, p0, Lrk2/a;->a:Lad3/c;

    sget-object v0, Lcom/whoop/addactivity/network/CreateActivityPauseSegment;->Companion:Lcom/whoop/addactivity/network/CreateActivityPauseSegment$a;

    invoke-virtual {v0}, Lcom/whoop/addactivity/network/CreateActivityPauseSegment$a;->serializer()Lwc3/c;

    move-result-object v0

    invoke-static {v0}, Lxc3/a;->a(Lwc3/c;)Lkotlinx/serialization/internal/ArrayListSerializer;

    move-result-object v0

    iput-object v0, p0, Lrk2/a;->b:Lwc3/c;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/whoop/addactivity/network/CreateActivityPauseSegment;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    iget-object v1, p0, Lrk2/a;->a:Lad3/c;

    iget-object v2, p0, Lrk2/a;->b:Lwc3/c;

    check-cast v2, Lwc3/b;

    invoke-virtual {v1, v2, p1}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    check-cast p1, Ljava/util/List;
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :cond_2
    :goto_1
    return-object v0
.end method

.method public final b(Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/addactivity/network/CreateActivityPauseSegment;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lrk2/a;->a:Lad3/c;

    iget-object v1, p0, Lrk2/a;->b:Lwc3/c;

    check-cast v1, Lwc3/j;

    invoke-virtual {v0, v1, p1}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
