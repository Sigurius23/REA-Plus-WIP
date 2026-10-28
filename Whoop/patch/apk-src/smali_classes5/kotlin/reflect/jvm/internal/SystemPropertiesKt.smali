.class public final Lkotlin/reflect/jvm/internal/SystemPropertiesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0003\u00a8\u0006\u0006"
    }
    d2 = {
        "useK1Implementation",
        "",
        "getUseK1Implementation",
        "()Z",
        "loadMetadataDirectly",
        "getLoadMetadataDirectly",
        "kotlin-reflection"
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
.field private static final loadMetadataDirectly:Z

.field private static final useK1Implementation:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    :try_start_0
    const-string v0, "kotlin.reflect.jvm.useK1Implementation"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Ll83/m;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v0, v2

    :cond_0
    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    if-ne v0, v3, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    sput-boolean v0, Lkotlin/reflect/jvm/internal/SystemPropertiesKt;->useK1Implementation:Z

    :try_start_1
    const-string v0, "kotlin.reflect.jvm.loadMetadataDirectly"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_2
    instance-of v4, v0, Ll83/m;

    if-eqz v4, :cond_2

    goto :goto_3

    :cond_2
    move-object v2, v0

    :goto_3
    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    if-ne v0, v3, :cond_3

    move v1, v3

    :cond_3
    sput-boolean v1, Lkotlin/reflect/jvm/internal/SystemPropertiesKt;->loadMetadataDirectly:Z

    return-void
.end method

.method public static final getLoadMetadataDirectly()Z
    .locals 1

    sget-boolean v0, Lkotlin/reflect/jvm/internal/SystemPropertiesKt;->loadMetadataDirectly:Z

    return v0
.end method

.method public static final getUseK1Implementation()Z
    .locals 1

    sget-boolean v0, Lkotlin/reflect/jvm/internal/SystemPropertiesKt;->useK1Implementation:Z

    return v0
.end method
