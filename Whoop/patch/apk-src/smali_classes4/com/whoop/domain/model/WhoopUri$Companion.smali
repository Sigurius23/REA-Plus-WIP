.class public final Lcom/whoop/domain/model/WhoopUri$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/domain/model/WhoopUri;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u0004\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/domain/model/WhoopUri$Companion;",
        "",
        "<init>",
        "()V",
        "parse",
        "Lcom/whoop/domain/model/AndroidUri;",
        "uriString",
        "Landroid/net/Uri;",
        "Lcom/whoop/domain/model/WhoopUri;",
        "",
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
.field static final synthetic $$INSTANCE:Lcom/whoop/domain/model/WhoopUri$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/domain/model/WhoopUri$Companion;

    invoke-direct {v0}, Lcom/whoop/domain/model/WhoopUri$Companion;-><init>()V

    sput-object v0, Lcom/whoop/domain/model/WhoopUri$Companion;->$$INSTANCE:Lcom/whoop/domain/model/WhoopUri$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final parse(Landroid/net/Uri;)Lcom/whoop/domain/model/AndroidUri;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    new-instance v0, Lcom/whoop/domain/model/AndroidUri;

    invoke-direct {v0, p1}, Lcom/whoop/domain/model/AndroidUri;-><init>(Landroid/net/Uri;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final parse(Ljava/lang/String;)Lcom/whoop/domain/model/WhoopUri;
    .locals 1

    const-string v0, "uriString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/whoop/domain/model/AndroidUri;

    .line 3
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 4
    invoke-direct {v0, p1}, Lcom/whoop/domain/model/AndroidUri;-><init>(Landroid/net/Uri;)V

    return-object v0
.end method
