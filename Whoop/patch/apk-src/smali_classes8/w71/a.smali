.class public abstract Lw71/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a!\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a!\u0010\u0006\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "",
        "prefix",
        "Lcom/whoop/design/util/TextResource;",
        "question",
        "b",
        "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;)Ljava/lang/String;",
        "c",
        "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;",
        "Ltr2/n;",
        "a",
        "Ltr2/n;",
        "logger",
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
.field private static final a:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "JournalAutomationTag"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Lw71/a;->a:Ltr2/n;

    return-void
.end method

.method public static final synthetic a()Ltr2/n;
    .locals 1

    sget-object v0, Lw71/a;->a:Ltr2/n;

    return-object v0
.end method

.method public static final b(Ljava/lang/String;Lcom/whoop/design/util/TextResource;)Ljava/lang/String;
    .locals 2

    const-string v0, "prefix"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "question"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/whoop/design/util/a;->b(Lcom/whoop/design/util/TextResource;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v0
.end method

.method public static final c(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;
    .locals 4

    const-string v0, "prefix"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "question"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lw71/a;->b(Ljava/lang/String;Lcom/whoop/design/util/TextResource;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_5

    check-cast p2, Lp1/q;

    const v2, 0x5be1c473

    invoke-virtual {p2, v2}, Lp1/q;->e0(I)V

    and-int/lit8 v2, p3, 0xe

    xor-int/lit8 v2, v2, 0x6

    const/4 v3, 0x4

    if-le v2, v3, :cond_0

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    and-int/lit8 p3, p3, 0x6

    if-ne p3, v3, :cond_2

    :cond_1
    const/4 p3, 0x1

    goto :goto_0

    :cond_2
    move p3, v1

    :goto_0
    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p3, :cond_3

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne v2, p3, :cond_4

    :cond_3
    new-instance v2, Lw71/a$a;

    const/4 p3, 0x0

    invoke-direct {v2, p0, p3}, Lw71/a$a;-><init>(Ljava/lang/String;Lq83/d;)V

    invoke-virtual {p2, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v2, Lc93/m;

    invoke-static {p0, p1, v2, p2}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {p2, v1}, Lp1/q;->q(Z)V

    return-object v0

    :cond_5
    check-cast p2, Lp1/q;

    const p0, 0x5be61b9b

    invoke-virtual {p2, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v1}, Lp1/q;->q(Z)V

    return-object v0
.end method
