.class public interface abstract Lcom/whoop/domain/model/WhoopUri;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/domain/model/WhoopUriParser;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/domain/model/WhoopUri$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u0008\u0008f\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u0003H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0005R\u0018\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u0005\u00a8\u0006\u0011\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/domain/model/WhoopUri;",
        "Lcom/whoop/domain/model/WhoopUriParser;",
        "scheme",
        "",
        "getScheme",
        "()Ljava/lang/String;",
        "host",
        "getHost",
        "pathSegments",
        "",
        "getPathSegments",
        "()Ljava/util/List;",
        "query",
        "getQuery",
        "getQueryParameter",
        "key",
        "Companion",
        "essentials_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/whoop/domain/model/WhoopUri$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/whoop/domain/model/WhoopUri$Companion;->$$INSTANCE:Lcom/whoop/domain/model/WhoopUri$Companion;

    sput-object v0, Lcom/whoop/domain/model/WhoopUri;->Companion:Lcom/whoop/domain/model/WhoopUri$Companion;

    return-void
.end method


# virtual methods
.method public abstract getHost()Ljava/lang/String;
.end method

.method public abstract getPathSegments()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getQuery()Ljava/lang/String;
.end method

.method public abstract getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract getScheme()Ljava/lang/String;
.end method
