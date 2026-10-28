.class public final Lny/c;
.super Ln10/b;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lb20/f;Lk83/a;La30/h;)V
    .locals 1

    const-string v0, "errorReporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestOptionsProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createCardPresentSetupIntentCallbackProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Ln10/b;-><init>(Lb20/f;Lk83/a;)V

    return-void
.end method
