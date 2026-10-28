.class public final Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0013\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\t\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto$Companion;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;",
        "timestamp",
        "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto;",
        "fromWhoopLabsStudyTag",
        "(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;)Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto;",
        "Lwc3/c;",
        "serializer",
        "()Lwc3/c;",
        "whooplabs_release"
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
    invoke-direct {p0}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromWhoopLabsStudyTag(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;)Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto;
    .locals 2

    const-string v0, "timestamp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto;

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;->getNote()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;->getTimestamp()Lorg/joda/time/LocalDateTime;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/LocalDateTime;->toDate()Ljava/util/Date;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto;-><init>(Ljava/lang/String;Ljava/util/Date;)V

    return-object v0
.end method

.method public final serializer()Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto$$serializer;

    return-object v0
.end method
