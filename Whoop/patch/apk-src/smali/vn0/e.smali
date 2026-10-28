.class public final Lvn0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvn0/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000cB\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J)\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00082\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lvn0/e;",
        "",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ltr2/n;)V",
        "",
        "password",
        "",
        "Lcom/whoop/service/network/model/PasswordRequirement;",
        "requirements",
        "Lwn0/g;",
        "a",
        "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;",
        "Ltr2/n;",
        "b",
        "change-password_release"
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
.field public static final b:Lvn0/e$a;

.field public static final c:I

.field private static final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvn0/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvn0/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lvn0/e;->b:Lvn0/e$a;

    const/16 v0, 0x8

    sput v0, Lvn0/e;->c:I

    const-string v0, "PasswordHistoryPolicy"

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lvn0/e;->d:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ltr2/n;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvn0/e;->a:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p2, "PasswordValidator"

    invoke-virtual {p1, p2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lvn0/e;-><init>(Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/PasswordRequirement;",
            ">;)",
            "Ljava/util/List<",
            "Lwn0/g;",
            ">;"
        }
    .end annotation

    const-string v0, "password"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requirements"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/whoop/service/network/model/PasswordRequirement;

    sget-object v3, Lvn0/e;->d:Ljava/util/List;

    invoke-virtual {v2}, Lcom/whoop/service/network/model/PasswordRequirement;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p2, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/service/network/model/PasswordRequirement;

    :try_start_0
    invoke-virtual {v1}, Lcom/whoop/service/network/model/PasswordRequirement;->getPolicyRegex()Ljava/lang/String;

    move-result-object v2

    const-string v3, "pattern"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    const-string v3, "compile(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    new-instance v3, Lwn0/g;

    invoke-virtual {v1}, Lcom/whoop/service/network/model/PasswordRequirement;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {v1}, Lcom/whoop/service/network/model/PasswordRequirement;->getErrorDescription()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v3, v4, v5, v2}, Lwn0/g;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Z)V
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v2

    iget-object v3, p0, Lvn0/e;->a:Ltr2/n;

    invoke-virtual {v1}, Lcom/whoop/service/network/model/PasswordRequirement;->getPolicyRegex()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Invalid regex pattern from server: "

    invoke-static {v5, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    new-array v6, v5, [Lqr2/a$a;

    invoke-interface {v3, v4, v2, v6}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance v3, Lwn0/g;

    invoke-virtual {v1}, Lcom/whoop/service/network/model/PasswordRequirement;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {v1}, Lcom/whoop/service/network/model/PasswordRequirement;->getErrorDescription()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v1}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v3, v2, v4, v5}, Lwn0/g;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Z)V

    :goto_2
    invoke-interface {p2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object p2
.end method
