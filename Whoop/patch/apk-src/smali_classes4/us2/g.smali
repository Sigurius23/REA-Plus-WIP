.class public final Lus2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lus2/g;",
        "",
        "Ljb1/a;",
        "designItemReducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lss2/c$c;",
        "domainResult",
        "Lus2/f$c;",
        "a",
        "(Lss2/c$c;)Lus2/f$c;",
        "Lss2/d;",
        "header",
        "Lus2/b;",
        "b",
        "(Lss2/d;)Lus2/b;",
        "Lss2/c;",
        "Lus2/f;",
        "c",
        "(Lss2/c;)Lus2/f;",
        "Ljb1/a;",
        "weekly-plan_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lus2/g;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lus2/g;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lqs2/a;->o()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lus2/g;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final a(Lss2/c$c;)Lus2/f$c;
    .locals 12

    invoke-virtual {p1}, Lss2/c$c;->b()Lss2/a;

    move-result-object v0

    invoke-virtual {v0}, Lss2/a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v4, Lkd1/o$c;

    invoke-virtual {v0}, Lss2/a;->c()Ljava/lang/String;

    move-result-object v5

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lkd1/o$c;

    invoke-virtual {v0}, Lss2/a;->e()Ljava/lang/String;

    move-result-object v6

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lss2/a;->b()Lss2/d;

    move-result-object v1

    invoke-direct {p0, v1}, Lus2/g;->b(Lss2/d;)Lus2/b;

    move-result-object v6

    invoke-virtual {v0}, Lss2/a;->a()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v7, p0, Lus2/g;->a:Ljb1/a;

    invoke-virtual {v7, v1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    move-object v7, v1

    goto :goto_0

    :cond_0
    move-object v7, v2

    :goto_0
    iget-object v1, p0, Lus2/g;->a:Ljb1/a;

    invoke-virtual {v0}, Lss2/a;->d()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    invoke-virtual {p1}, Lss2/c$c;->a()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lcom/whoop/coacheverywherecommon/models/a;->a(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lep0/j;

    move-result-object v2

    :cond_1
    move-object v9, v2

    new-instance v2, Lus2/f$c;

    invoke-direct/range {v2 .. v9}, Lus2/f$c;-><init>(Lcom/whoop/design/util/TextResource;Lkd1/o;Lkd1/o;Lus2/b;Lm91/u;Ljava/util/List;Lep0/j;)V

    return-object v2
.end method

.method private final b(Lss2/d;)Lus2/b;
    .locals 3

    new-instance v0, Lus2/b;

    invoke-virtual {p1}, Lss2/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    iget-object v2, p0, Lus2/g;->a:Ljb1/a;

    invoke-virtual {p1}, Lss2/d;->a()Lcom/whoop/design/models/items/SecondaryButtonModel;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lus2/b;-><init>(Lcom/whoop/design/util/TextResource;Lm91/u;)V

    return-object v0
.end method


# virtual methods
.method public final c(Lss2/c;)Lus2/f;
    .locals 1

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lss2/c$b;

    if-eqz v0, :cond_0

    sget-object p1, Lus2/f$b;->a:Lus2/f$b;

    return-object p1

    :cond_0
    instance-of v0, p1, Lss2/c$a;

    if-eqz v0, :cond_1

    sget-object p1, Lus2/f$a;->a:Lus2/f$a;

    return-object p1

    :cond_1
    instance-of v0, p1, Lss2/c$c;

    if-eqz v0, :cond_2

    check-cast p1, Lss2/c$c;

    invoke-direct {p0, p1}, Lus2/g;->a(Lss2/c$c;)Lus2/f$c;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
