.class public final Lcom/whoop/ai/chat/domain/formwidget/f$b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/ai/chat/domain/formwidget/f$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/ai/chat/domain/formwidget/f$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u00c7\n\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\u0008\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00d6\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/whoop/ai/chat/domain/formwidget/f$b$e;",
        "Lcom/whoop/ai/chat/domain/formwidget/f$b;",
        "<init>",
        "()V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "bot_release"
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
.field public static final a:Lcom/whoop/ai/chat/domain/formwidget/f$b$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/ai/chat/domain/formwidget/f$b$e;

    invoke-direct {v0}, Lcom/whoop/ai/chat/domain/formwidget/f$b$e;-><init>()V

    sput-object v0, Lcom/whoop/ai/chat/domain/formwidget/f$b$e;->a:Lcom/whoop/ai/chat/domain/formwidget/f$b$e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/whoop/ai/chat/domain/formwidget/f$b$e;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x68f386e5

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "PersistFailed"

    return-object v0
.end method
