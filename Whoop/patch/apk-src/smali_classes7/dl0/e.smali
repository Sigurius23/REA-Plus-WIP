.class public final Ldl0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldl0/e$a;,
        Ldl0/e$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c1\u0002\u0018\u00002\u00020\u0001:\u0002\u001b\u0007B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J%\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u001d\u0010\u000cJ!\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00060\u001e2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\"R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\"\u00a8\u0006%"
    }
    d2 = {
        "Ldl0/e;",
        "",
        "<init>",
        "()V",
        "La12/a;",
        "parsed",
        "",
        "a",
        "(La12/a;)Ljava/lang/String;",
        "s",
        "",
        "e",
        "(Ljava/lang/String;)Z",
        "basePath",
        "Ljy1/a;",
        "g",
        "(Ljava/lang/String;)Ljy1/a;",
        "Ldl0/e$b;",
        "reason",
        "f",
        "(Ljava/lang/String;Ldl0/e$b;)Ljy1/a;",
        "path",
        "h",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "Ldl0/e$a;",
        "formType",
        "formKey",
        "b",
        "(Ldl0/e$b;Ldl0/e$a;Ljava/lang/String;)Ljy1/a;",
        "d",
        "Ll83/k;",
        "c",
        "(La12/a;)Ll83/k;",
        "Lyb3/p;",
        "Lyb3/p;",
        "uuidPattern",
        "numericIdPattern",
        "bot_release"
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
.field public static final a:Ldl0/e;

.field private static final b:Lyb3/p;

.field private static final c:Lyb3/p;

.field public static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldl0/e;

    invoke-direct {v0}, Ldl0/e;-><init>()V

    sput-object v0, Ldl0/e;->a:Ldl0/e;

    new-instance v0, Lyb3/p;

    const-string v1, "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Ldl0/e;->b:Lyb3/p;

    new-instance v0, Lyb3/p;

    const-string v1, "[0-9]{3,}"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Ldl0/e;->c:Lyb3/p;

    const/16 v0, 0x8

    sput v0, Ldl0/e;->d:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(La12/a;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p1}, La12/a;->b()Ljava/util/Map;

    move-result-object v0

    const-string v1, "formKey"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p1}, La12/a;->a()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [C

    const/4 v2, 0x0

    const/16 v3, 0x2f

    aput-char v3, v0, v2

    invoke-static {p1, v0}, Lyb3/r;->R0(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object p1

    const-string v0, ""

    invoke-static {v3, p1, v0}, Lyb3/r;->F0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "form"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_1
    return-object v1

    :cond_3
    return-object p1
.end method

.method private final e(Ljava/lang/String;)Z
    .locals 0

    :try_start_0
    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_0
    instance-of p1, p1, Ll83/m;

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method


# virtual methods
.method public final b(Ldl0/e$b;Ldl0/e$a;Ljava/lang/String;)Ljy1/a;
    .locals 9

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formKey"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lcom/whoop/metrics/domain/models/MetricPostType;->COUNT:Lcom/whoop/metrics/domain/models/MetricPostType;

    invoke-virtual {p1}, Ldl0/e$b;->getRaw()Ljava/lang/String;

    move-result-object p1

    const-string v0, "reason:"

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ldl0/e$a;->getRaw()Ljava/lang/String;

    move-result-object p2

    const-string v0, "form_type:"

    invoke-static {v0, p2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "form_key:"

    invoke-virtual {v0, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const-string v0, "platform:android"

    filled-new-array {v0, p1, p2, p3}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    new-instance v1, Ljy1/a;

    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "whoop.ai.form.load_failed"

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final c(La12/a;)Ll83/k;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La12/a;",
            ")",
            "Ll83/k;"
        }
    .end annotation

    const-string v0, "parsed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ldl0/e;->a(La12/a;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Ldl0/e$a;->UNKNOWN:Ldl0/e$a;

    new-instance v0, Ll83/k;

    const-string v1, "unknown"

    invoke-direct {v0, p1, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_0
    invoke-direct {p0, p1}, Ldl0/e;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Ldl0/e$a;->AGENT:Ldl0/e$a;

    new-instance v0, Ll83/k;

    const-string v1, "redacted"

    invoke-direct {v0, p1, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_1
    sget-object v0, Ldl0/e$a;->STATIC:Ldl0/e$a;

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method public final d(Ljava/lang/String;)Z
    .locals 3

    const-string v0, "basePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "v1/form"

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v2, v1}, Lyb3/r;->g0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v0

    if-gez v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x7

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "substring(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "/"

    invoke-static {p1, v0, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    return v2
.end method

.method public final f(Ljava/lang/String;Ldl0/e$b;)Ljy1/a;
    .locals 9

    const-string v0, "basePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reason"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lcom/whoop/metrics/domain/models/MetricPostType;->COUNT:Lcom/whoop/metrics/domain/models/MetricPostType;

    invoke-virtual {p0, p1}, Ldl0/e;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "path:"

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ldl0/e$b;->getRaw()Ljava/lang/String;

    move-result-object p2

    const-string v0, "reason:"

    invoke-static {v0, p2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "platform:android"

    filled-new-array {v0, p1, p2}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    new-instance v1, Ljy1/a;

    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "whoop.ai.mini_arc.failure"

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final g(Ljava/lang/String;)Ljy1/a;
    .locals 9

    const-string v0, "basePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lcom/whoop/metrics/domain/models/MetricPostType;->COUNT:Lcom/whoop/metrics/domain/models/MetricPostType;

    invoke-virtual {p0, p1}, Ldl0/e;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "path:"

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "platform:android"

    filled-new-array {v0, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    new-instance v1, Ljy1/a;

    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "whoop.ai.mini_arc.success"

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final h(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x3f

    invoke-static {p1, v0}, Lyb3/r;->H0(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x23

    invoke-static {p1, v0}, Lyb3/r;->H0(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ldl0/e;->b:Lyb3/p;

    const-string v1, "uuid"

    invoke-virtual {v0, p1, v1}, Lyb3/p;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ldl0/e;->c:Lyb3/p;

    const-string v1, "123"

    invoke-virtual {v0, p1, v1}, Lyb3/p;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [C

    const/4 v1, 0x0

    const/16 v2, 0x2f

    aput-char v2, v0, v1

    const/4 v2, 0x6

    invoke-static {p1, v0, v1, v2}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    const/16 v5, 0x3e

    const-string v1, "/"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
