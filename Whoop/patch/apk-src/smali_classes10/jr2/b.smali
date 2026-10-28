.class public abstract Ljr2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "Ljr2/d;",
        "background",
        "a",
        "(Landroidx/compose/ui/Modifier;Ljr2/d;)Landroidx/compose/ui/Modifier;",
        "user-journey_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Landroidx/compose/ui/Modifier;Ljr2/d;)Landroidx/compose/ui/Modifier;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "background"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljr2/d;->a()Li2/t;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljr2/d;->a()Li2/t;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p1}, Ljr2/d;->b()Li2/x;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljr2/d;->b()Li2/x;

    move-result-object p1

    iget-wide v0, p1, Li2/x;->a:J

    sget-object p1, Li2/w0;->a:Li2/v0;

    invoke-static {p0, v0, v1, p1}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    :cond_1
    return-object p0
.end method
