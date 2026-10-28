.class public final Lor2/j1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J#\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000c\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\r\u001a\u0004\u0008\u0011\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\r\u001a\u0004\u0008\u0014\u0010\u000eR\u0017\u0010\u0017\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\r\u001a\u0004\u0008\u0010\u0010\u000e\u00a8\u0006\u0018"
    }
    d2 = {
        "Lor2/j1;",
        "",
        "<init>",
        "()V",
        "",
        "text",
        "Lyb3/p;",
        "regex",
        "",
        "Li93/j;",
        "a",
        "(Ljava/lang/CharSequence;Lyb3/p;)Ljava/util/List;",
        "b",
        "Lyb3/p;",
        "()Lyb3/p;",
        "doubleAsteriskRegex",
        "c",
        "getParenthesisRegex",
        "parenthesisRegex",
        "d",
        "getBracketsRegex",
        "bracketsRegex",
        "e",
        "whitespaceRegex",
        "core_release"
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
.field public static final a:Lor2/j1;

.field private static final b:Lyb3/p;

.field private static final c:Lyb3/p;

.field private static final d:Lyb3/p;

.field private static final e:Lyb3/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lor2/j1;

    invoke-direct {v0}, Lor2/j1;-><init>()V

    sput-object v0, Lor2/j1;->a:Lor2/j1;

    new-instance v0, Lyb3/p;

    const-string v1, "\\*{2}(.*?)\\*{2}"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lor2/j1;->b:Lyb3/p;

    new-instance v0, Lyb3/p;

    const-string v1, "\\((.*?)\\)"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lor2/j1;->c:Lyb3/p;

    new-instance v0, Lyb3/p;

    const-string v1, "\\[(.*?)]"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lor2/j1;->d:Lyb3/p;

    new-instance v0, Lyb3/p;

    const-string v1, "\\s"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lor2/j1;->e:Lyb3/p;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;Lyb3/p;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Lyb3/p;",
            ")",
            "Ljava/util/List<",
            "Li93/j;",
            ">;"
        }
    .end annotation

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "regex"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1, p2}, Lyb3/p;->b(Ljava/lang/CharSequence;Lyb3/p;)Lx83/h;

    move-result-object p1

    new-instance p2, Lxb3/h;

    invoke-direct {p2, p1}, Lxb3/h;-><init>(Lx83/h;)V

    :goto_0
    invoke-virtual {p2}, Lxb3/h;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Lxb3/h;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lyb3/k;

    check-cast p1, Lyb3/n;

    invoke-virtual {p1}, Lyb3/n;->b()Li93/j;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final b()Lyb3/p;
    .locals 1

    sget-object v0, Lor2/j1;->b:Lyb3/p;

    return-object v0
.end method

.method public final c()Lyb3/p;
    .locals 1

    sget-object v0, Lor2/j1;->e:Lyb3/p;

    return-object v0
.end method
