.class public final Lvn1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvn1/j$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lvn1/j;",
        "",
        "<init>",
        "()V",
        "Lc0/q;",
        "Lm91/n;",
        "",
        "Lvn1/i;",
        "notificationCardDismissAnimation",
        "Lc0/l0;",
        "a",
        "(Lc0/q;Lvn1/i;)Lc0/l0;",
        "home-notifications-center_release"
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
.field public static final a:Lvn1/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvn1/j;

    invoke-direct {v0}, Lvn1/j;-><init>()V

    sput-object v0, Lvn1/j;->a:Lvn1/j;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lc0/q;Lvn1/i;)Lc0/l0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc0/q;",
            "Lvn1/i;",
            ")",
            "Lc0/l0;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationCardDismissAnimation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lvn1/j$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    const/4 v1, 0x4

    const/4 v2, 0x2

    const/4 v3, 0x6

    const/4 v4, 0x0

    const/16 v5, 0x1f4

    const/4 v6, 0x0

    if-eq p2, v0, :cond_2

    const v0, 0x3f6b851f    # 0.92f

    if-eq p2, v2, :cond_1

    const/4 p1, 0x3

    if-ne p2, p1, :cond_0

    invoke-static {v5, v4, v6, v3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object p1

    invoke-static {p1, v2}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object p1

    invoke-static {v5, v5, v6, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object p2

    invoke-static {p2, v0, v1}, Lc0/w0;->g(Ld0/e2;FI)Lc0/d1;

    move-result-object p2

    invoke-virtual {p1, p2}, Lc0/c1;->a(Lc0/c1;)Lc0/d1;

    move-result-object p1

    sget-object p2, Lc0/e1;->a:Lc0/f1;

    invoke-static {p1, p2}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-static {v5, v4, v6, v3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object p2

    invoke-static {p2, v2}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object p2

    invoke-static {v5, v5, v6, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v2

    invoke-static {v2, v0, v1}, Lc0/w0;->g(Ld0/e2;FI)Lc0/d1;

    move-result-object v0

    invoke-virtual {p2, v0}, Lc0/c1;->a(Lc0/c1;)Lc0/d1;

    move-result-object p2

    invoke-static {v5, v4, v6, v3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    invoke-static {p1, v1, v0, v1}, Lc0/q;->a(Lc0/q;ILd0/e2;I)Lc0/f1;

    move-result-object p1

    invoke-static {p2, p1}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 p1, 0x7

    const/4 p2, 0x0

    invoke-static {p2, p2, p1, v6}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object p1

    invoke-static {p1, v2}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object p1

    invoke-static {v5, v4, v6, v3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object p2

    const/high16 v0, 0x3fc00000    # 1.5f

    invoke-static {p2, v0, v1}, Lc0/w0;->g(Ld0/e2;FI)Lc0/d1;

    move-result-object p2

    invoke-virtual {p1, p2}, Lc0/c1;->a(Lc0/c1;)Lc0/d1;

    move-result-object p1

    invoke-static {v5, v4, v6, v3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object p2

    const-wide/16 v0, 0x0

    invoke-static {p2, v0, v1, v3}, Lc0/w0;->h(Ld0/e2;JI)Lc0/f1;

    move-result-object p2

    invoke-static {p1, p2}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object p1

    return-object p1
.end method
