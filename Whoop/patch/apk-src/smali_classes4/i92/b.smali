.class public final Li92/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li92/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Li92/b;",
        "",
        "<init>",
        "()V",
        "Lme3/c;",
        "b",
        "()Lme3/c;",
        "a",
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
.field public static final a:Li92/b$a;

.field private static final b:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li92/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li92/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Li92/b;->a:Li92/b$a;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "HttpLog"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Li92/b;->b:Ltr2/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Li92/b;->c(Ljava/lang/String;)V

    return-void
.end method

.method private static final c(Ljava/lang/String;)V
    .locals 2

    const-string v0, "message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "password"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "access_token"

    invoke-static {p0, v0, v1}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "refresh_token"

    invoke-static {p0, v0, v1}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Li92/b;->b:Ltr2/n;

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p0, v1}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_0
    sget-object p0, Li92/b;->b:Ltr2/n;

    const-string v0, "Message removed"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p0, v0, v1}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method


# virtual methods
.method public final b()Lme3/c;
    .locals 4

    sget-object v0, Lme3/a;->x:Lme3/a;

    new-instance v1, Lme3/c;

    new-instance v2, Li5/c;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Li5/c;-><init>(I)V

    invoke-direct {v1, v2}, Lme3/c;-><init>(Lme3/b;)V

    iput-object v0, v1, Lme3/c;->z:Lme3/a;

    new-instance v0, Ljava/util/TreeSet;

    invoke-static {}, Lyb3/y;->G()V

    sget-object v2, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-direct {v0, v2}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    iget-object v2, v1, Lme3/c;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v0, v2}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    const-string v2, "Authorization"

    invoke-virtual {v0, v2}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    iput-object v0, v1, Lme3/c;->x:Ljava/lang/Object;

    return-object v1
.end method
