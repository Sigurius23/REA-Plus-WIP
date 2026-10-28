.class public final Lio/getstream/chat/android/extensions/StringExtensionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u0013\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007\"\u0014\u0010\u0008\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "",
        "snakeToLowerCamelCase",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "lowerCamelCaseToGetter",
        "camelCaseToSnakeCase",
        "Lyb3/p;",
        "snakeRegex",
        "Lyb3/p;",
        "camelRegex",
        "stream-chat-android-core"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final camelRegex:Lyb3/p;

.field private static final snakeRegex:Lyb3/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyb3/p;

    const-string v1, "_[a-zA-Z]"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/extensions/StringExtensionsKt;->snakeRegex:Lyb3/p;

    new-instance v0, Lyb3/p;

    const-string v1, "(?<=[a-zA-Z])[A-Z]"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/extensions/StringExtensionsKt;->camelRegex:Lyb3/p;

    return-void
.end method

.method public static synthetic a(Lyb3/k;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/extensions/StringExtensionsKt;->snakeToLowerCamelCase$lambda$0(Lyb3/k;)Ljava/lang/CharSequence;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic b(Lyb3/k;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/extensions/StringExtensionsKt;->camelCaseToSnakeCase$lambda$1(Lyb3/k;)Ljava/lang/CharSequence;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static final camelCaseToSnakeCase(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/extensions/StringExtensionsKt;->camelRegex:Lyb3/p;

    new-instance v1, Lmx1/o;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, Lmx1/o;-><init>(I)V

    invoke-virtual {v0, p0, v1}, Lyb3/p;->g(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toLowerCase(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final camelCaseToSnakeCase$lambda$1(Lyb3/k;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lyb3/n;

    invoke-virtual {p0}, Lyb3/n;->c()Ljava/lang/String;

    move-result-object p0

    const-string v0, "_"

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final lowerCamelCaseToGetter(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type java.lang.String"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toUpperCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const-string v1, "substring(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "get"

    invoke-static {v1, v0, p0}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final snakeToLowerCamelCase(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/extensions/StringExtensionsKt;->snakeRegex:Lyb3/p;

    new-instance v1, Lmx1/o;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Lmx1/o;-><init>(I)V

    invoke-virtual {v0, p0, v1}, Lyb3/p;->g(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final snakeToLowerCamelCase$lambda$0(Lyb3/k;)Ljava/lang/CharSequence;
    .locals 3

    const-string v0, "matchResult"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lyb3/n;

    invoke-virtual {p0}, Lyb3/n;->c()Ljava/lang/String;

    move-result-object p0

    const-string v0, ""

    const/4 v1, 0x0

    const-string v2, "_"

    invoke-static {p0, v2, v0, v1}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toUpperCase(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
