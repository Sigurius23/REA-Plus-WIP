.class public final Lgj0/a;
.super Lvd/e;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u0011\n\u0002\u0010%\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u0011\u001a\u00020\n2\u0010\u0010\u0010\u001a\u000c\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R$\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\u0004\u0018\u0001`\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00140&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(\u00a8\u0006*"
    }
    d2 = {
        "Lgj0/a;",
        "Lvd/e;",
        "Ltr2/n;",
        "logger",
        "Log/b;",
        "level",
        "<init>",
        "(Ltr2/n;Log/b;)V",
        "",
        "ex",
        "Ll83/a0;",
        "a",
        "(Ljava/lang/Throwable;)V",
        "Lkotlin/Function0;",
        "",
        "Laws/smithy/kotlin/runtime/telemetry/logging/MessageSupplier;",
        "message",
        "r",
        "(Lc93/a;)V",
        "key",
        "",
        "value",
        "c",
        "(Ljava/lang/String;Ljava/lang/Object;)V",
        "e",
        "()V",
        "w",
        "Ltr2/n;",
        "x",
        "Log/b;",
        "y",
        "Ljava/lang/Throwable;",
        "cause",
        "z",
        "Ljava/lang/String;",
        "E",
        "Lc93/a;",
        "messageSupplier",
        "",
        "F",
        "Ljava/util/Map;",
        "values",
        "auth_release"
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
.field private E:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final F:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final w:Ltr2/n;

.field private final x:Log/b;

.field private y:Ljava/lang/Throwable;

.field private z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ltr2/n;Log/b;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "level"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgj0/a;->w:Ltr2/n;

    iput-object p2, p0, Lgj0/a;->x:Log/b;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lgj0/a;->F:Ljava/util/Map;

    return-void
.end method

.method public static synthetic o0(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lgj0/a;->p0(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method private static final p0(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "ex"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lgj0/a;->y:Ljava/lang/Throwable;

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lgj0/a;->F:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public e()V
    .locals 7

    iget-object v0, p0, Lgj0/a;->F:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Lg40/y1;

    const/16 v0, 0x1c

    invoke-direct {v5, v0}, Lg40/y1;-><init>(I)V

    const/16 v6, 0x1f

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lgj0/a;->z:Ljava/lang/String;

    if-nez v2, :cond_1

    iget-object v2, p0, Lgj0/a;->E:Lc93/a;

    if-eqz v2, :cond_0

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_2

    const-string v2, " values: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lgj0/a;->x:Log/b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_b

    const/4 v3, 0x1

    if-eq v1, v3, :cond_9

    const/4 v3, 0x2

    if-eq v1, v3, :cond_7

    const/4 v3, 0x3

    if-eq v1, v3, :cond_5

    const/4 v3, 0x4

    if-ne v1, v3, :cond_4

    iget-object v1, p0, Lgj0/a;->y:Ljava/lang/Throwable;

    if-eqz v1, :cond_3

    iget-object v3, p0, Lgj0/a;->w:Ltr2/n;

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v3, v0, v1, v2}, Ltr2/n;->s(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-void

    :cond_3
    iget-object v1, p0, Lgj0/a;->w:Ltr2/n;

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_4
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_5
    iget-object v1, p0, Lgj0/a;->y:Ljava/lang/Throwable;

    if-eqz v1, :cond_6

    iget-object v3, p0, Lgj0/a;->w:Ltr2/n;

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v3, v0, v1, v2}, Ltr2/n;->i(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-void

    :cond_6
    iget-object v1, p0, Lgj0/a;->w:Ltr2/n;

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_7
    iget-object v1, p0, Lgj0/a;->y:Ljava/lang/Throwable;

    if-eqz v1, :cond_8

    iget-object v3, p0, Lgj0/a;->w:Ltr2/n;

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v3, v0, v1, v2}, Ltr2/n;->a(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-void

    :cond_8
    iget-object v1, p0, Lgj0/a;->w:Ltr2/n;

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_9
    iget-object v1, p0, Lgj0/a;->y:Ljava/lang/Throwable;

    if-eqz v1, :cond_a

    iget-object v3, p0, Lgj0/a;->w:Ltr2/n;

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v3, v0, v1, v2}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-void

    :cond_a
    iget-object v1, p0, Lgj0/a;->w:Ltr2/n;

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_b
    iget-object v1, p0, Lgj0/a;->y:Ljava/lang/Throwable;

    if-eqz v1, :cond_c

    iget-object v3, p0, Lgj0/a;->w:Ltr2/n;

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v3, v0, v1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-void

    :cond_c
    iget-object v1, p0, Lgj0/a;->w:Ltr2/n;

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public r(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lgj0/a;->E:Lc93/a;

    return-void
.end method
