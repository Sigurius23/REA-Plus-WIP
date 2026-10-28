.class public abstract Lcom/whoop/ai/chat/domain/formwidget/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "Lad3/c;",
        "a",
        "Lad3/c;",
        "moderationJson",
        "bot_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lad3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcj2/a;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lcj2/a;-><init>(I)V

    sget-object v1, Lad3/c;->d:Lad3/b;

    invoke-static {v1, v0}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object v0

    sput-object v0, Lcom/whoop/ai/chat/domain/formwidget/g;->a:Lad3/c;

    return-void
.end method

.method public static synthetic a(Lad3/g;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/ai/chat/domain/formwidget/g;->c(Lad3/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()Lad3/c;
    .locals 1

    sget-object v0, Lcom/whoop/ai/chat/domain/formwidget/g;->a:Lad3/c;

    return-object v0
.end method

.method private static final c(Lad3/g;)Ll83/a0;
    .locals 1

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lad3/g;->c:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
