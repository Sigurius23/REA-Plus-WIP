.class public abstract Lcom/whoop/design/util/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\r\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0013\u0010\r\u001a\u00020\t*\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u00020\u0002*\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u0011\u0010\u0015\u001a\u00020\u0014*\u00020\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\t\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u001a\u0011\u0010\u001c\u001a\u00020\u0019*\u00020\t\u00a2\u0006\u0004\u0008\u001c\u0010\u001b\u001a\u0013\u0010\u001d\u001a\u00020\t*\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u001a\u001b\u0010 \u001a\u00020\t*\u0004\u0018\u00010\t2\u0006\u0010\u001f\u001a\u00020\t\u00a2\u0006\u0004\u0008 \u0010!\u001a\u0011\u0010#\u001a\u00020\"*\u00020\t\u00a2\u0006\u0004\u0008#\u0010$\"\u0014\u0010&\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "",
        "resId",
        "",
        "g",
        "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;",
        "",
        "value",
        "i",
        "(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;",
        "Lcom/whoop/design/util/TextResource;",
        "resource",
        "h",
        "(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;",
        "l",
        "(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;",
        "Lcom/whoop/design/util/TextResource$e;",
        "m",
        "(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;",
        "b",
        "(Lcom/whoop/design/util/TextResource;)Ljava/lang/String;",
        "Lcom/whoop/design/util/TextResource$b;",
        "k",
        "(I)Lcom/whoop/design/util/TextResource$b;",
        "a",
        "()Lcom/whoop/design/util/TextResource;",
        "",
        "c",
        "(Lcom/whoop/design/util/TextResource;)Z",
        "d",
        "f",
        "(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/util/TextResource;",
        "default",
        "e",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/util/TextResource;",
        "Lcom/whoop/design/util/TextResource$d$c;",
        "j",
        "(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/util/TextResource$d$c;",
        "Lcom/whoop/design/util/TextResource$e;",
        "empty",
        "design_release"
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
.field private static final a:Lcom/whoop/design/util/TextResource$e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/util/TextResource$e;

    const-string v1, ""

    invoke-direct {v0, v1}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    sput-object v0, Lcom/whoop/design/util/b;->a:Lcom/whoop/design/util/TextResource$e;

    return-void
.end method

.method public static final a()Lcom/whoop/design/util/TextResource;
    .locals 1

    sget-object v0, Lcom/whoop/design/util/b;->a:Lcom/whoop/design/util/TextResource$e;

    return-object v0
.end method

.method public static final b(Lcom/whoop/design/util/TextResource;)Ljava/lang/String;
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {p0}, Lcom/whoop/design/util/TextResource$e;->a()Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/whoop/design/util/TextResource;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final d(Lcom/whoop/design/util/TextResource;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static final e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/util/TextResource;
    .locals 1

    const-string v0, "default"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_2

    invoke-static {p0}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    return-object p0

    :cond_2
    :goto_1
    return-object p1
.end method

.method public static final f(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/util/TextResource;
    .locals 1

    if-eqz p0, :cond_2

    invoke-static {p0}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    return-object p0

    :cond_2
    :goto_1
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p0

    return-object p0
.end method

.method public static final g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;
    .locals 2

    new-instance p2, Lcom/whoop/design/util/TextResource$b;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p2, p0, v0, v1, v0}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p0, 0x0

    invoke-static {p2, p1, p0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;
    .locals 0

    const-string p2, "resource"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1}, Lcom/whoop/design/util/TextResource;->resolve(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;
    .locals 0

    const-string p2, "value"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {p2, p0}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    const/4 p0, 0x0

    invoke-static {p2, p1, p0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/util/TextResource$d$c;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/design/util/TextResource$d$c;

    invoke-direct {v0, p0}, Lcom/whoop/design/util/TextResource$d$c;-><init>(Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method

.method public static final k(I)Lcom/whoop/design/util/TextResource$b;
    .locals 3

    new-instance v0, Lcom/whoop/design/util/TextResource$b;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, v2, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;
    .locals 1

    if-eqz p0, :cond_0

    new-instance v0, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v0, p0}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    return-object v0

    :cond_0
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;
    .locals 1

    if-eqz p0, :cond_0

    new-instance v0, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v0, p0}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    return-object v0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
