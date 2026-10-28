.class public final Lfe0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfe0/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J3\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ)\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0004\u0008\u000f\u0010\u0010JG\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J3\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lfe0/a;",
        "",
        "<init>",
        "()V",
        "event",
        "Lkotlin/Function1;",
        "Lce0/b;",
        "Ll83/a0;",
        "onViewEvent",
        "",
        "searchQuery",
        "f",
        "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V",
        "Lbe0/a;",
        "onNavigationEvent",
        "e",
        "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V",
        "Lc31/c;",
        "buttonClickType",
        "Lde0/a;",
        "selectedAppointment",
        "episodeId",
        "biomarkerTestId",
        "d",
        "(Lc31/c;Lde0/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V",
        "Lsz0/q0;",
        "modalState",
        "Lcom/whoop/navigation/e;",
        "buttonDestination",
        "b",
        "(Lsz0/q0;Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;)Lsz0/q0;",
        "advanced-labs_release"
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
.field public static final a:Lfe0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfe0/a;

    invoke-direct {v0}, Lfe0/a;-><init>()V

    sput-object v0, Lfe0/a;->a:Lfe0/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lfe0/a;->c(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 1

    new-instance v0, Lbe0/a$b;

    invoke-direct {v0, p1}, Lbe0/a$b;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final b(Lsz0/q0;Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;)Lsz0/q0;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsz0/q0;",
            "Lcom/whoop/navigation/e;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lsz0/q0;"
        }
    .end annotation

    move-object/from16 v2, p3

    const-string v3, "modalState"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onNavigationEvent"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lsz0/q0;->n()Lsz0/p0;

    move-result-object v3

    instance-of v4, v3, Lsz0/p0$h;

    if-eqz v4, :cond_0

    if-eqz p2, :cond_0

    move-object v5, v3

    check-cast v5, Lsz0/p0$h;

    new-instance v9, Lck1/l;

    const/4 v3, 0x3

    invoke-direct {v9, v2, p2, v3}, Lck1/l;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;I)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    invoke-static/range {v5 .. v11}, Lsz0/p0$h;->g(Lsz0/p0$h;Lcom/whoop/design/util/TextResource;JLc93/a;ILjava/lang/Object;)Lsz0/p0$h;

    move-result-object v2

    const/16 v11, 0x3fd

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v12}, Lsz0/q0;->d(Lsz0/q0;Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILjava/lang/Object;)Lsz0/q0;

    move-result-object v0

    return-object v0

    :cond_0
    return-object p1
.end method

.method public final d(Lc31/c;Lde0/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc31/c;",
            "Lde0/a;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "buttonClickType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lfe0/a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    new-instance p1, Lce0/b$f;

    invoke-virtual {p2}, Lde0/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lde0/a;->a()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, v0, p2, p3, p4}, Lce0/b$f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    return-void
.end method

.method public final e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigationEvent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_0

    new-instance v0, Lbe0/a$b;

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-direct {v0, p1}, Lbe0/a$b;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final f(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/jvm/functions/Function1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "searchQuery"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Llf0/x1$a;

    if-eqz v0, :cond_1

    check-cast p1, Llf0/x1$a;

    invoke-virtual {p1}, Llf0/x1$a;->a()Llf0/e;

    move-result-object p3

    if-eqz p3, :cond_0

    new-instance v0, Lce0/b$b;

    invoke-virtual {p1}, Llf0/x1$a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Llf0/e;->a()Ljava/lang/String;

    move-result-object p3

    invoke-direct {v0, p1, p3}, Lce0/b$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    sget-object p1, Lce0/b$a;->a:Lce0/b$a;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    instance-of v0, p1, Lge0/b$c;

    if-eqz v0, :cond_2

    new-instance v0, Lce0/b$e;

    check-cast p1, Lge0/b$c;

    invoke-virtual {p1}, Lge0/b$c;->a()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, p3, p1, v1}, Lce0/b$e;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method
