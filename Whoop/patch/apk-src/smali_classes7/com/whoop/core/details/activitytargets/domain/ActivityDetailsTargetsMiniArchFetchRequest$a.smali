.class public final Lcom/whoop/core/details/activitytargets/domain/ActivityDetailsTargetsMiniArchFetchRequest$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/core/details/activitytargets/domain/ActivityDetailsTargetsMiniArchFetchRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/whoop/core/details/activitytargets/domain/ActivityDetailsTargetsMiniArchFetchRequest$a;",
        "",
        "<init>",
        "()V",
        "",
        "path",
        "Lcom/whoop/core/details/activitytargets/domain/ActivityDetailsTargetsMiniArchFetchRequest;",
        "a",
        "(Ljava/lang/String;)Lcom/whoop/core/details/activitytargets/domain/ActivityDetailsTargetsMiniArchFetchRequest;",
        "core-details_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/core/details/activitytargets/domain/ActivityDetailsTargetsMiniArchFetchRequest$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/whoop/core/details/activitytargets/domain/ActivityDetailsTargetsMiniArchFetchRequest;
    .locals 2

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lxv0/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, La12/b;->e(Ljava/lang/String;)La12/a;

    move-result-object p1

    new-instance v0, Lcom/whoop/core/details/activitytargets/domain/ActivityDetailsTargetsMiniArchFetchRequest;

    invoke-virtual {p1}, La12/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, La12/a;->b()Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/whoop/core/details/activitytargets/domain/ActivityDetailsTargetsMiniArchFetchRequest;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object v0
.end method
