.class public abstract Loq0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\"\u001c\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\u0003\"\u001c\u0010\u0006\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0003\u00a8\u0006\u0007"
    }
    d2 = {
        "Ljava/util/regex/Pattern;",
        "kotlin.jvm.PlatformType",
        "a",
        "Ljava/util/regex/Pattern;",
        "ELITE_LEGACY_INVITE_CODE_PATTERN",
        "b",
        "COMMUNITY_INVITE_CODE_PATTERN",
        "community_release"
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
.field private static final a:Ljava/util/regex/Pattern;

.field private static final b:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "[A-Za-z0-9]{4}-[A-Za-z0-9]{4}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Loq0/f;->a:Ljava/util/regex/Pattern;

    const-string v0, "COMM-[A-Za-z0-9]{6}"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Loq0/f;->b:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static final synthetic a()Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Loq0/f;->b:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method public static final synthetic b()Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Loq0/f;->a:Ljava/util/regex/Pattern;

    return-object v0
.end method
