.class public final Lor2/x1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lor2/x1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lor2/x1$a;",
        "",
        "<init>",
        "()V",
        "Ljava/util/UUID;",
        "b",
        "Ljava/util/UUID;",
        "NAMESPACE",
        "core_release"
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
.field static final synthetic a:Lor2/x1$a;

.field private static final b:Ljava/util/UUID;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lor2/x1$a;

    invoke-direct {v0}, Lor2/x1$a;-><init>()V

    sput-object v0, Lor2/x1$a;->a:Lor2/x1$a;

    const-string v0, "01e7ec72-09ae-50ea-9912-a866422d6069"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    const-string v1, "fromString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lor2/x1$a;->b:Ljava/util/UUID;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Ljava/util/UUID;
    .locals 1

    sget-object v0, Lor2/x1$a;->b:Ljava/util/UUID;

    return-object v0
.end method
