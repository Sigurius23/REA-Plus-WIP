.class public final Ln10/u;
.super Ln10/b;
.source "SourceFile"


# instance fields
.field public final c:Lk83/a;

.field public final d:Lk83/a;

.field public final e:Lk83/a;


# direct methods
.method public constructor <init>(Lk83/a;Lk83/a;Lk83/a;Lb20/f;Lk83/a;)V
    .locals 1

    const-string v0, "intentCreationCallbackProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentCreateIntentWithConfirmationTokenCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preparePaymentMethodHandlerProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestOptionsProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p4, p5}, Ln10/b;-><init>(Lb20/f;Lk83/a;)V

    iput-object p1, p0, Ln10/u;->c:Lk83/a;

    iput-object p2, p0, Ln10/u;->d:Lk83/a;

    iput-object p3, p0, Ln10/u;->e:Lk83/a;

    return-void
.end method
