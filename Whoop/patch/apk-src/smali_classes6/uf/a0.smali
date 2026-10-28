.class public final synthetic Luf/a0;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# static fields
.field public static final w:Luf/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Luf/a0;

    const-string v4, "httpTraceMiddleware(Laws/smithy/kotlin/runtime/http/operation/OperationRequest;Laws/smithy/kotlin/runtime/io/Handler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    const/4 v5, 0x1

    const/4 v1, 0x3

    const-class v2, Luf/c0;

    const-string v3, "httpTraceMiddleware"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Luf/a0;->w:Luf/a0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Luf/u;

    check-cast p2, Lyf/e;

    check-cast p3, Lq83/d;

    invoke-static {p1, p2, p3}, Luf/c0;->z(Luf/u;Lyf/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
