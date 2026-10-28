.class final Lql0/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/speech/RecognitionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lql0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0012\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u000b\u0008\u0083\u0004\u0018\u00002\u00020\u0001BW\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u000f\u001a\u00020\u00042\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00042\u0008\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00042\u0008\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00042\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u0016J\u0017\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\u0008\u0008\u0010 J!\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u001e2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\"\u0010#R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010%R \u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010%R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010%\u00a8\u0006)"
    }
    d2 = {
        "Lql0/a$a;",
        "Landroid/speech/RecognitionListener;",
        "Lkotlin/Function1;",
        "Lq3/y;",
        "Ll83/a0;",
        "onResult",
        "onPartialResult",
        "Lql0/b;",
        "onError",
        "",
        "onRmsChanged",
        "<init>",
        "(Lql0/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "Landroid/os/Bundle;",
        "results",
        "onResults",
        "(Landroid/os/Bundle;)V",
        "partialResults",
        "onPartialResults",
        "params",
        "onReadyForSpeech",
        "onBeginningOfSpeech",
        "()V",
        "rmsdB",
        "(F)V",
        "",
        "buffer",
        "onBufferReceived",
        "([B)V",
        "onEndOfSpeech",
        "",
        "error",
        "(I)V",
        "eventType",
        "onEvent",
        "(ILandroid/os/Bundle;)V",
        "a",
        "Lkotlin/jvm/functions/Function1;",
        "b",
        "c",
        "d",
        "bot_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final b:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final c:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final d:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic e:Lql0/a;


# direct methods
.method public constructor <init>(Lql0/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "onResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPartialResult"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onRmsChanged"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lql0/a$a;->e:Lql0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lql0/a$a;->a:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lql0/a$a;->b:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lql0/a$a;->c:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lql0/a$a;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public onBeginningOfSpeech()V
    .locals 0

    return-void
.end method

.method public onBufferReceived([B)V
    .locals 0

    return-void
.end method

.method public onEndOfSpeech()V
    .locals 0

    return-void
.end method

.method public onError(I)V
    .locals 3

    iget-object v0, p0, Lql0/a$a;->e:Lql0/a;

    invoke-static {v0}, Lql0/a;->f(Lql0/a;)Lec3/p1;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    const/4 v0, 0x5

    const/4 v1, 0x7

    if-eq p1, v0, :cond_2

    if-eq p1, v1, :cond_1

    const/16 v0, 0x9

    if-eq p1, v0, :cond_0

    new-instance v0, Lql0/b$d;

    invoke-direct {v0, p1}, Lql0/b$d;-><init>(I)V

    goto :goto_0

    :cond_0
    sget-object v0, Lql0/b$b;->a:Lql0/b$b;

    goto :goto_0

    :cond_1
    sget-object v0, Lql0/b$c;->a:Lql0/b$c;

    goto :goto_0

    :cond_2
    sget-object v0, Lql0/b$a;->a:Lql0/b$a;

    :goto_0
    iget-object v2, p0, Lql0/a$a;->c:Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x6

    if-eq p1, v0, :cond_3

    if-eq p1, v1, :cond_3

    iget-object p1, p0, Lql0/a$a;->e:Lql0/a;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lql0/a;->g(Lql0/a;Z)V

    :cond_3
    return-void
.end method

.method public onEvent(ILandroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onPartialResults(Landroid/os/Bundle;)V
    .locals 5

    iget-object v0, p0, Lql0/a$a;->e:Lql0/a;

    invoke-static {v0}, Lql0/a;->f(Lql0/a;)Lec3/p1;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lql0/a$a;->e:Lql0/a;

    invoke-static {v0}, Lql0/a;->e(Lql0/a;)Ltr2/n;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    if-eqz p1, :cond_1

    const-string v0, "results_recognition"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    iget-object v0, p0, Lql0/a$a;->b:Lkotlin/jvm/functions/Function1;

    new-instance v1, Lq3/y;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2, v2}, Lj93/l0;->f(II)J

    move-result-wide v2

    const/4 v4, 0x4

    invoke-direct {v1, v4, p1, v2, v3}, Lq3/y;-><init>(ILjava/lang/String;J)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_1
    return-void
.end method

.method public onReadyForSpeech(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onResults(Landroid/os/Bundle;)V
    .locals 6

    iget-object v0, p0, Lql0/a$a;->e:Lql0/a;

    invoke-static {v0}, Lql0/a;->f(Lql0/a;)Lec3/p1;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lql0/a$a;->e:Lql0/a;

    invoke-static {v0}, Lql0/a;->e(Lql0/a;)Ltr2/n;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    const-string v1, "results_recognition"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_2

    iget-object v1, p0, Lql0/a$a;->a:Lkotlin/jvm/functions/Function1;

    new-instance v2, Lq3/y;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v3, v3}, Lj93/l0;->f(II)J

    move-result-wide v3

    const/4 v5, 0x4

    invoke-direct {v2, v5, p1, v3, v4}, Lq3/y;-><init>(ILjava/lang/String;J)V

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lql0/a$a;->e:Lql0/a;

    invoke-static {p1}, Lql0/a;->f(Lql0/a;)Lec3/p1;

    move-result-object p1

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v0, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_2
    iget-object p1, p0, Lql0/a$a;->e:Lql0/a;

    invoke-static {p1}, Lql0/a;->f(Lql0/a;)Lec3/p1;

    move-result-object p1

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v0, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object p1, p0, Lql0/a$a;->c:Lkotlin/jvm/functions/Function1;

    sget-object v0, Lql0/b$c;->a:Lql0/b$c;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onRmsChanged(F)V
    .locals 2

    const/high16 v0, -0x40000000    # -2.0f

    sub-float/2addr p1, v0

    const/high16 v0, 0x41600000    # 14.0f

    div-float/2addr p1, v0

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p1, v0, v1}, Le93/b;->m(FFF)F

    move-result p1

    iget-object v0, p0, Lql0/a$a;->d:Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
