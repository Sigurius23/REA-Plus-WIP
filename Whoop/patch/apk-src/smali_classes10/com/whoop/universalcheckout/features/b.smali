.class final Lcom/whoop/universalcheckout/features/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\u0005\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/b;",
        "",
        "<init>",
        "()V",
        "",
        "b",
        "Ljava/lang/String;",
        "a",
        "()Ljava/lang/String;",
        "(Ljava/lang/String;)V",
        "source",
        "universal-checkout_release"
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
.field public static final a:Lcom/whoop/universalcheckout/features/b;

.field private static b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/universalcheckout/features/b;

    invoke-direct {v0}, Lcom/whoop/universalcheckout/features/b;-><init>()V

    sput-object v0, Lcom/whoop/universalcheckout/features/b;->a:Lcom/whoop/universalcheckout/features/b;

    const-string v0, ""

    sput-object v0, Lcom/whoop/universalcheckout/features/b;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/whoop/universalcheckout/features/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/whoop/universalcheckout/features/b;->b:Ljava/lang/String;

    return-void
.end method
