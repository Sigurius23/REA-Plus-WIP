.class public final Lfb2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lfb2/a;",
        "Lfb2/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\n\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0010*\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J#\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lfb2/b;",
        "Lod1/g;",
        "Lfb2/a;",
        "Lfb2/c;",
        "Lqw2/c;",
        "actionInteractor",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lqw2/c;Ltr2/n;)V",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "action",
        "Lec3/l;",
        "e",
        "(Lcom/whoop/whoopaction/domain/models/Action;)Lec3/l;",
        "Lqw2/b;",
        "",
        "f",
        "(Lqw2/b;)Ljava/util/List;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lqw2/c;",
        "b",
        "Ltr2/n;",
        "settings_release"
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
.field private final a:Lqw2/c;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lqw2/c;Ltr2/n;)V
    .locals 1

    const-string v0, "actionInteractor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lfb2/b;->a:Lqw2/c;

    .line 3
    iput-object p2, p0, Lfb2/b;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lqw2/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "UpsellModalInteractor"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lfb2/b;-><init>(Lqw2/c;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lfb2/b;Lcom/whoop/whoopaction/domain/models/Action;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lfb2/b;->e(Lcom/whoop/whoopaction/domain/models/Action;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lfb2/b;Lqw2/b;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1}, Lfb2/b;->f(Lqw2/b;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final e(Lcom/whoop/whoopaction/domain/models/Action;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lfb2/b;->a:Lqw2/c;

    new-instance v1, Lqw2/f;

    invoke-direct {v1, p1}, Lqw2/f;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    new-instance p1, La6/u;

    const/4 v2, 0x1

    invoke-direct {p1, v1, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p1}, Lqw2/c;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v0, Lfb2/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, p0}, Lfb2/b$b;-><init>(Lec3/l;Lq83/d;Lfb2/b;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final f(Lqw2/b;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqw2/b;",
            ")",
            "Ljava/util/List<",
            "Lfb2/c;",
            ">;"
        }
    .end annotation

    instance-of v0, p1, Lqw2/b$n;

    const/4 v1, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-nez v0, :cond_7

    instance-of v0, p1, Lqw2/b$f;

    if-nez v0, :cond_7

    instance-of v0, p1, Lqw2/b$g;

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, Lqw2/b$d;

    if-eqz v0, :cond_1

    new-instance v0, Lfb2/c$a;

    invoke-direct {v0, v4}, Lfb2/c$a;-><init>(Lcom/whoop/design/models/modal/AnyModal;)V

    new-instance v4, Lfb2/c$b;

    check-cast p1, Lqw2/b$d;

    invoke-virtual {p1}, Lqw2/b$d;->b()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v4, p1}, Lfb2/c$b;-><init>(Lcom/whoop/navigation/e;)V

    new-array p1, v2, [Lfb2/c;

    aput-object v0, p1, v3

    aput-object v4, p1, v1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Lqw2/b$a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lfb2/b;->b:Ltr2/n;

    check-cast p1, Lqw2/b$a;

    invoke-virtual {p1}, Lqw2/b$a;->c()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Upsell modal action failed: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lfb2/c$a;

    invoke-direct {p1, v4}, Lfb2/c$a;-><init>(Lcom/whoop/design/models/modal/AnyModal;)V

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of v0, p1, Lqw2/b$h;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lfb2/b;->b:Ltr2/n;

    check-cast p1, Lqw2/b$h;

    invoke-virtual {p1}, Lqw2/b$h;->c()Lcom/whoop/whoopaction/domain/models/PermissionType;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Upsell modal requested permission "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "; not supported on the settings banner"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lfb2/c$a;

    invoke-direct {p1, v4}, Lfb2/c$a;-><init>(Lcom/whoop/design/models/modal/AnyModal;)V

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of v0, p1, Lqw2/b$e;

    if-eqz v0, :cond_4

    iget-object p1, p0, Lfb2/b;->b:Ltr2/n;

    const-string v0, "Upsell modal requested a media pick; not supported on the settings banner"

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lfb2/c$a;

    invoke-direct {p1, v4}, Lfb2/c$a;-><init>(Lcom/whoop/design/models/modal/AnyModal;)V

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of v0, p1, Lqw2/b$c;

    if-nez v0, :cond_6

    instance-of v0, p1, Lqw2/b$i;

    if-nez v0, :cond_6

    instance-of v0, p1, Lqw2/b$b;

    if-nez v0, :cond_6

    instance-of v0, p1, Lqw2/b$m;

    if-nez v0, :cond_6

    instance-of v0, p1, Lqw2/b$l;

    if-nez v0, :cond_6

    instance-of v0, p1, Lqw2/b$k;

    if-nez v0, :cond_6

    instance-of p1, p1, Lqw2/b$j;

    if-eqz p1, :cond_5

    goto :goto_0

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    :goto_0
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_7
    :goto_1
    new-instance p1, Lfb2/c$a;

    invoke-direct {p1, v4}, Lfb2/c$a;-><init>(Lcom/whoop/design/models/modal/AnyModal;)V

    new-array v0, v2, [Lfb2/c;

    aput-object p1, v0, v3

    sget-object p1, Lfb2/c$c;->a:Lfb2/c$c;

    aput-object p1, v0, v1

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfb2/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lfb2/b$a;-><init>(Lq83/d;Lfb2/b;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
