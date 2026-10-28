.class public abstract Lcom/whoop/ui/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a7\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "",
        "T",
        "Landroidx/fragment/app/m0;",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "cleanup",
        "Lcom/whoop/ui/b;",
        "b",
        "(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;)Lcom/whoop/ui/b;",
        "feature_release"
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
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/ui/c;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;)Lcom/whoop/ui/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/fragment/app/m0;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lcom/whoop/ui/b<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cleanup"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/ui/b;

    invoke-direct {v0, p0, p1}, Lcom/whoop/ui/b;-><init>(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public static synthetic c(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/whoop/ui/b;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    new-instance p1, Lcom/whoop/profile/view/edit/form/c;

    const/4 p2, 0x4

    invoke-direct {p1, p2}, Lcom/whoop/profile/view/edit/form/c;-><init>(I)V

    :cond_0
    invoke-static {p0, p1}, Lcom/whoop/ui/c;->b(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;)Lcom/whoop/ui/b;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
