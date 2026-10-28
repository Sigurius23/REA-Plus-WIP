.class public final Lcom/whoop/domain/model/WhoopUriParser$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/domain/model/WhoopUriParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0006R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/whoop/domain/model/WhoopUriParser$Companion;",
        "",
        "<init>",
        "()V",
        "parser",
        "Lcom/whoop/domain/model/WhoopUri;",
        "Lcom/whoop/domain/model/WhoopUriParser;",
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
.field static final synthetic $$INSTANCE:Lcom/whoop/domain/model/WhoopUriParser$Companion;

.field private static final parser:Lcom/whoop/domain/model/WhoopUri;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/domain/model/WhoopUriParser$Companion;

    invoke-direct {v0}, Lcom/whoop/domain/model/WhoopUriParser$Companion;-><init>()V

    sput-object v0, Lcom/whoop/domain/model/WhoopUriParser$Companion;->$$INSTANCE:Lcom/whoop/domain/model/WhoopUriParser$Companion;

    sget-object v0, Lcom/whoop/domain/model/WhoopUri;->Companion:Lcom/whoop/domain/model/WhoopUri$Companion;

    const-string v1, "https://example.com"

    invoke-virtual {v0, v1}, Lcom/whoop/domain/model/WhoopUri$Companion;->parse(Ljava/lang/String;)Lcom/whoop/domain/model/WhoopUri;

    move-result-object v0

    sput-object v0, Lcom/whoop/domain/model/WhoopUriParser$Companion;->parser:Lcom/whoop/domain/model/WhoopUri;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final parser()Lcom/whoop/domain/model/WhoopUriParser;
    .locals 1

    sget-object v0, Lcom/whoop/domain/model/WhoopUriParser$Companion;->parser:Lcom/whoop/domain/model/WhoopUri;

    return-object v0
.end method
