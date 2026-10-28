.class public final Lj22/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lj22/h;",
        "",
        "Landroidx/fragment/app/m0;",
        "fragment",
        "Leb/u0;",
        "navHostController",
        "Leb/a0;",
        "navController",
        "Lor2/y;",
        "externalLinkNavigator",
        "Ljs0/c;",
        "configurationRepository",
        "Lcom/whoop/data/repositories/LanguageRepository;",
        "languageRepository",
        "<init>",
        "(Landroidx/fragment/app/m0;Leb/u0;Leb/a0;Lor2/y;Ljs0/c;Lcom/whoop/data/repositories/LanguageRepository;)V",
        "Lj22/f;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lj22/f;)V",
        "Landroidx/fragment/app/m0;",
        "b",
        "Leb/u0;",
        "c",
        "Leb/a0;",
        "d",
        "Lor2/y;",
        "e",
        "Ljs0/c;",
        "f",
        "Lcom/whoop/data/repositories/LanguageRepository;",
        "pairing-ui_release"
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
.field private final a:Landroidx/fragment/app/m0;

.field private final b:Leb/u0;

.field private final c:Leb/a0;

.field private final d:Lor2/y;

.field private final e:Ljs0/c;

.field private final f:Lcom/whoop/data/repositories/LanguageRepository;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/m0;Leb/u0;Leb/a0;Lor2/y;Ljs0/c;Lcom/whoop/data/repositories/LanguageRepository;)V
    .locals 1

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navHostController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "externalLinkNavigator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configurationRepository"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "languageRepository"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj22/h;->a:Landroidx/fragment/app/m0;

    iput-object p2, p0, Lj22/h;->b:Leb/u0;

    iput-object p3, p0, Lj22/h;->c:Leb/a0;

    iput-object p4, p0, Lj22/h;->d:Lor2/y;

    iput-object p5, p0, Lj22/h;->e:Ljs0/c;

    iput-object p6, p0, Lj22/h;->f:Lcom/whoop/data/repositories/LanguageRepository;

    return-void
.end method


# virtual methods
.method public final a(Lj22/f;)V
    .locals 9

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lj22/f$b;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lj22/h;->b:Leb/u0;

    invoke-virtual {v0}, Leb/a0;->i()Leb/n0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Leb/n0;->I:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    check-cast p1, Lj22/f$b;

    invoke-virtual {p1}, Lj22/f$b;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    iget-object v0, p0, Lj22/h;->b:Leb/u0;

    invoke-virtual {p1}, Lj22/f$b;->a()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x6

    invoke-static {v0, p1, v1, v2}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void

    :cond_1
    instance-of v0, p1, Lj22/f$a;

    if-eqz v0, :cond_2

    iget-object p1, p0, Lj22/h;->b:Leb/u0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    move-result p1

    if-nez p1, :cond_e

    iget-object p1, p0, Lj22/h;->c:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_2
    instance-of v0, p1, Lj22/f$d;

    if-eqz v0, :cond_c

    iget-object p1, p0, Lj22/h;->f:Lcom/whoop/data/repositories/LanguageRepository;

    invoke-virtual {p1}, Lcom/whoop/data/repositories/LanguageRepository;->getAllowedLanguage()Ljava/util/Locale;

    move-result-object p1

    iget-object v2, p0, Lj22/h;->d:Lor2/y;

    iget-object v0, p0, Lj22/h;->a:Landroidx/fragment/app/m0;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v3

    const-string v0, "requireActivity(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj22/h;->e:Ljs0/c;

    new-instance v4, Lcom/whoop/data/repositories/TroubleConnectingSupportArticleUrl;

    invoke-direct {v4, p1}, Lcom/whoop/data/repositories/TroubleConnectingSupportArticleUrl;-><init>(Ljava/util/Locale;)V

    invoke-virtual {v0}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object p1

    invoke-virtual {v4}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v6, Ljava/lang/String;

    invoke-virtual {v5, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v5, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {p1, v0}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_9

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_1

    :cond_3
    sget-object v8, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v5, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-virtual {p1, v0}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_9

    invoke-static {p1}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    goto :goto_1

    :cond_4
    sget-object v8, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v5, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-virtual {p1, v0}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_9

    invoke-static {p1}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    goto :goto_1

    :cond_5
    sget-object v8, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v5, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-virtual {p1, v0}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_9

    invoke-static {p1}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    goto :goto_1

    :cond_6
    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v5, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-virtual {p1, v0}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_9

    invoke-static {p1}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_1

    :cond_7
    invoke-virtual {v5, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {p1, v0}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_1

    :cond_8
    move-object v1, v4

    :cond_9
    :goto_1
    if-nez v1, :cond_a

    goto :goto_2

    :cond_a
    move-object v4, v1

    :goto_2
    if-eqz v4, :cond_b

    check-cast v4, Ljava/lang/String;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lor2/y;->y(Lor2/y;Landroid/app/Activity;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void

    :cond_b
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlin.String"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    sget-object v0, Lj22/f$c;->a:Lj22/f$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object p1, p0, Lj22/h;->c:Leb/a0;

    iget-object p1, p1, Leb/a0;->a:Landroid/content/Context;

    invoke-static {p1}, Lj22/i;->a(Landroid/content/Context;)V

    return-void

    :cond_d
    sget-object v0, Lj22/f$e;->a:Lj22/f$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_f

    :cond_e
    return-void

    :cond_f
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
