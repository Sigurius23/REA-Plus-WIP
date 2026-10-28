.class public final Lb20/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lyy/j;

.field public final b:Lyy/c;


# direct methods
.method public constructor <init>(Lyy/j;Lyy/c;)V
    .locals 1

    const-string v0, "analyticsRequestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb20/f;->a:Lyy/j;

    iput-object p2, p0, Lb20/f;->b:Lyy/c;

    return-void
.end method


# virtual methods
.method public final a(Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;)V
    .locals 1

    const-string v0, "errorEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalNonPiiParams"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    sget-object p2, Lm83/z;->w:Lm83/z;

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lb20/a;->b(Lcom/stripe/android/core/exception/StripeException;)Ljava/util/Map;

    move-result-object p2

    :goto_0
    invoke-static {p2, p3}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p2

    iget-object p3, p0, Lb20/f;->b:Lyy/c;

    invoke-virtual {p3, p1, p2}, Lyy/c;->a(Lyy/a;Ljava/util/Map;)Lyy/b;

    move-result-object p1

    iget-object p2, p0, Lb20/f;->a:Lyy/j;

    invoke-virtual {p2, p1}, Lyy/j;->a(Lyy/b;)V

    return-void
.end method
