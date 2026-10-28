.class public abstract Ldf/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljf/a;

.field public static final b:Ljf/a;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    sget-object v0, Ljf/e;->b:Lg1/a7;

    const-string v1, "sdk.maxAttempts"

    const-string v2, "SDK_MAX_ATTEMPTS"

    invoke-virtual {v0, v1, v2}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljf/a;

    const/4 v1, 0x0

    sget-object v2, Ldf/a;->w:Ldf/a;

    const-string v3, "SDK_MIN_TLS"

    const-string v4, "sdk.minTls"

    invoke-direct {v0, v2, v3, v4, v1}, Ljf/a;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    sput-object v0, Ldf/b;->a:Ljf/a;

    new-instance v0, Ljf/a;

    new-instance v1, Landroidx/room/u;

    const/4 v7, 0x0

    const/16 v8, 0x9

    const/4 v2, 0x1

    sget-object v3, Lcf/e;->b:Lcf/b;

    const-class v4, Lcf/b;

    const-string v5, "fromString"

    const-string v6, "fromString(Ljava/lang/String;)Laws/smithy/kotlin/runtime/client/LogMode;"

    invoke-direct/range {v1 .. v8}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    const-string v2, "SDK_LOG_MODE"

    sget-object v3, Lcf/c;->d:Lcf/c;

    const-string v4, "sdk.logMode"

    invoke-direct {v0, v1, v4, v2, v3}, Ljf/a;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    sput-object v0, Ldf/b;->b:Ljf/a;

    return-void
.end method
