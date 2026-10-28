.class public final Landroidx/compose/runtime/tooling/DiagnosticComposeException;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Landroidx/compose/runtime/tooling/DiagnosticComposeException;",
        "Ljava/lang/RuntimeException;",
        "Lkotlin/RuntimeException;",
        "runtime"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final w:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    iput-object p1, p0, Landroidx/compose/runtime/tooling/DiagnosticComposeException;->w:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final fillInStackTrace()Ljava/lang/Throwable;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/StackTraceElement;

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-object p0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Composition stack when thrown:\n"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/runtime/tooling/DiagnosticComposeException;->w:Ljava/util/List;

    invoke-static {v2}, Lm83/s;->q0(Ljava/util/List;)Lm83/j0;

    move-result-object v2

    invoke-virtual {v2}, Lm83/a;->a()I

    move-result v3

    const/4 v4, 0x0

    if-gtz v3, :cond_1

    invoke-static {v1}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->q0(Ljava/util/List;)Lm83/j0;

    move-result-object v1

    invoke-virtual {v1}, Lm83/a;->a()I

    move-result v2

    :goto_0
    if-ge v4, v2, :cond_0

    invoke-virtual {v1, v4}, Lm83/j0;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "\tat "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_1
    invoke-virtual {v2, v4}, Lm83/j0;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La2/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    throw v0
.end method
