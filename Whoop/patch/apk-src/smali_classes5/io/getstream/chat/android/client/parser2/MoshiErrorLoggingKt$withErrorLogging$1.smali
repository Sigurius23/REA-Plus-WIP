.class public final Lio/getstream/chat/android/client/parser2/MoshiErrorLoggingKt$withErrorLogging$1;
.super Lpg3/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/parser2/MoshiErrorLoggingKt;->withErrorLogging(Ltg3/a;)Lpg3/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J9\u0010\u000b\u001a\u000c\u0012\u0004\u0012\u00020\n\u0012\u0002\u0008\u00030\t2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00050\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJK\u0010\u0010\u001a\u000e\u0012\u0002\u0008\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\r\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00050\u00042\u000e\u0010\u000e\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00050\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J;\u0010\u0013\u001a\u000e\u0012\u0002\u0008\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00050\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u000c\u00a8\u0006\u0014"
    }
    d2 = {
        "io/getstream/chat/android/client/parser2/MoshiErrorLoggingKt$withErrorLogging$1",
        "Lpg3/m;",
        "Ljava/lang/reflect/Type;",
        "type",
        "",
        "",
        "annotations",
        "Lpg3/y0;",
        "retrofit",
        "Lpg3/n;",
        "Lud3/a1;",
        "responseBodyConverter",
        "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/n;",
        "parameterAnnotations",
        "methodAnnotations",
        "Lud3/v0;",
        "requestBodyConverter",
        "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/n;",
        "",
        "stringConverter",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $originalFactory:Ltg3/a;


# direct methods
.method public constructor <init>(Ltg3/a;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/MoshiErrorLoggingKt$withErrorLogging$1;->$originalFactory:Ltg3/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final responseBodyConverter$lambda$0(Lpg3/n;Lud3/a1;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0, p1}, Lpg3/n;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final requestBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Lpg3/y0;",
            ")",
            "Lpg3/n;"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameterAnnotations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "methodAnnotations"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retrofit"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/MoshiErrorLoggingKt$withErrorLogging$1;->$originalFactory:Ltg3/a;

    invoke-virtual {v0, p1, p2, p3, p4}, Ltg3/a;->requestBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/n;

    move-result-object p1

    return-object p1
.end method

.method public final responseBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Lpg3/y0;",
            ")",
            "Lpg3/n;"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retrofit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/MoshiErrorLoggingKt$withErrorLogging$1;->$originalFactory:Ltg3/a;

    invoke-virtual {v0, p1, p2, p3}, Ltg3/a;->responseBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/n;

    move-result-object p1

    new-instance p2, Lhn/p;

    check-cast p1, Ltg3/c;

    const/4 p3, 0x4

    invoke-direct {p2, p1, p3}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    return-object p2
.end method

.method public final stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Lpg3/y0;",
            ")",
            "Lpg3/n;"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retrofit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/MoshiErrorLoggingKt$withErrorLogging$1;->$originalFactory:Ltg3/a;

    invoke-virtual {v0, p1, p2, p3}, Lpg3/m;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/n;

    move-result-object p1

    return-object p1
.end method
