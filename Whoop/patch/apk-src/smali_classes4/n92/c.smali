.class public final Ln92/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/iterable/iterableapi/x0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Ln92/c;",
        "Lcom/iterable/iterableapi/x0;",
        "Ln92/d;",
        "inAppHandlerReporter",
        "<init>",
        "(Ln92/d;)V",
        "Lcom/iterable/iterableapi/j1;",
        "message",
        "Lcom/iterable/iterableapi/w0;",
        "a",
        "(Lcom/iterable/iterableapi/j1;)Lcom/iterable/iterableapi/w0;",
        "Ln92/d;",
        "app_prodStandardRelease"
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
.field private final a:Ln92/d;


# direct methods
.method public constructor <init>(Ln92/d;)V
    .locals 1

    const-string v0, "inAppHandlerReporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln92/c;->a:Ln92/d;

    return-void
.end method


# virtual methods
.method public a(Lcom/iterable/iterableapi/j1;)Lcom/iterable/iterableapi/w0;
    .locals 2

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ln92/c;->a:Ln92/d;

    invoke-virtual {p1}, Lcom/iterable/iterableapi/j1;->e()Lcom/iterable/iterableapi/e1;

    move-result-object p1

    iget-object p1, p1, Lcom/iterable/iterableapi/e1;->a:Ljava/lang/String;

    const-string v1, "html"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ln92/d;->b(Ljava/lang/String;)V

    sget-object p1, Lcom/iterable/iterableapi/w0;->w:Lcom/iterable/iterableapi/w0;

    return-object p1
.end method
