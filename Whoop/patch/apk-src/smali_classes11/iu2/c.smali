.class public abstract Liu2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0001\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/domain/model/UnitSystem;",
        "a",
        "Lcom/whoop/domain/model/UnitSystem;",
        "()Lcom/whoop/domain/model/UnitSystem;",
        "DEFAULT_UNIT_SYSTEM",
        "weightlifting_release"
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
.field private static final a:Lcom/whoop/domain/model/UnitSystem;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/whoop/domain/model/UnitSystem;->METRIC:Lcom/whoop/domain/model/UnitSystem;

    sput-object v0, Liu2/c;->a:Lcom/whoop/domain/model/UnitSystem;

    return-void
.end method

.method public static final a()Lcom/whoop/domain/model/UnitSystem;
    .locals 1

    sget-object v0, Liu2/c;->a:Lcom/whoop/domain/model/UnitSystem;

    return-object v0
.end method
