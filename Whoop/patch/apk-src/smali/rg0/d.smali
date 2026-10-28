.class public final Lrg0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ;\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00082\u0014\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\'\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00082\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lrg0/d;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "",
        "isChatV2",
        "",
        "",
        "a",
        "(Z)Ljava/util/Map;",
        "properties",
        "e",
        "(Ljava/util/Map;Z)Ljava/util/Map;",
        "",
        "version",
        "d",
        "(Ljava/lang/Integer;)Ljava/util/Map;",
        "Lih0/b;",
        "event",
        "fingerprint",
        "Ll83/a0;",
        "b",
        "(Lih0/b;Ljava/lang/String;Z)V",
        "Lfi0/a;",
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


# instance fields
.field private final a:Lfi0/a;


# direct methods
.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrg0/d;->a:Lfi0/a;

    return-void
.end method

.method private final a(Z)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    const-string p1, "is_chat_v2"

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lvl/b;->p(Ljava/lang/Boolean;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lm83/z;->w:Lm83/z;

    return-object p1
.end method

.method public static synthetic c(Lrg0/d;Lih0/b;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lrg0/d;->b(Lih0/b;Ljava/lang/String;Z)V

    return-void
.end method

.method private final d(Ljava/lang/Integer;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v0, Ll83/k;

    const-string v1, "form_version"

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lm83/z;->w:Lm83/z;

    return-object p1
.end method

.method private final e(Ljava/util/Map;Z)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;Z)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-direct {p0, p2}, Lrg0/d;->a(Z)Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final b(Lih0/b;Ljava/lang/String;Z)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    const-string v4, "event"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "fingerprint"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v5, v1, Lih0/b$c;

    const-string v6, "form_key"

    const-string v7, "form_id"

    if-eqz v5, :cond_0

    iget-object v8, v0, Lrg0/d;->a:Lfi0/a;

    new-instance v5, Ll83/k;

    invoke-direct {v5, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    check-cast v1, Lih0/b$c;

    invoke-virtual {v1}, Lih0/b$c;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ll83/k;

    invoke-direct {v4, v7, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lih0/b$c;->b()Ljava/lang/String;

    move-result-object v2

    new-instance v7, Ll83/k;

    invoke-direct {v7, v6, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lih0/b$c;->d()Ljava/lang/String;

    move-result-object v2

    new-instance v6, Ll83/k;

    const-string v9, "question_id"

    invoke-direct {v6, v9, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lih0/b$c;->c()Ljava/lang/String;

    move-result-object v2

    new-instance v9, Ll83/k;

    const-string v10, "option_id"

    invoke-direct {v9, v10, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v4, v7, v6, v9}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1}, Lih0/b$c;->e()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lrg0/d;->d(Ljava/lang/Integer;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v2, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lrg0/d;->e(Ljava/util/Map;Z)Ljava/util/Map;

    move-result-object v14

    const/16 v15, 0x15

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "form_option_selected"

    const/4 v11, 0x0

    const-string v12, "AI Coach"

    const/4 v13, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_0
    instance-of v5, v1, Lih0/b$a;

    if-eqz v5, :cond_1

    iget-object v8, v0, Lrg0/d;->a:Lfi0/a;

    new-instance v5, Ll83/k;

    invoke-direct {v5, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    check-cast v1, Lih0/b$a;

    invoke-virtual {v1}, Lih0/b$a;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ll83/k;

    invoke-direct {v4, v7, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lih0/b$a;->b()Ljava/lang/String;

    move-result-object v2

    new-instance v7, Ll83/k;

    invoke-direct {v7, v6, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v4, v7}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1}, Lih0/b$a;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lrg0/d;->d(Ljava/lang/Integer;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v2, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lrg0/d;->e(Ljava/util/Map;Z)Ljava/util/Map;

    move-result-object v14

    const/16 v15, 0x15

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "form_background_tapped"

    const/4 v11, 0x0

    const-string v12, "AI Coach"

    const/4 v13, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_1
    instance-of v5, v1, Lih0/b$d;

    if-eqz v5, :cond_2

    iget-object v8, v0, Lrg0/d;->a:Lfi0/a;

    new-instance v5, Ll83/k;

    invoke-direct {v5, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    check-cast v1, Lih0/b$d;

    invoke-virtual {v1}, Lih0/b$d;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ll83/k;

    invoke-direct {v4, v7, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lih0/b$d;->b()Ljava/lang/String;

    move-result-object v2

    new-instance v7, Ll83/k;

    invoke-direct {v7, v6, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lih0/b$d;->c()Ljava/lang/String;

    move-result-object v2

    new-instance v6, Ll83/k;

    const-string v9, "selected_option_id"

    invoke-direct {v6, v9, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v4, v7, v6}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1}, Lih0/b$d;->d()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lrg0/d;->d(Ljava/lang/Integer;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v2, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lrg0/d;->e(Ljava/util/Map;Z)Ljava/util/Map;

    move-result-object v14

    const/16 v15, 0x15

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "form_submit_tapped"

    const/4 v11, 0x0

    const-string v12, "AI Coach"

    const/4 v13, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_2
    instance-of v5, v1, Lih0/b$e;

    if-eqz v5, :cond_3

    iget-object v8, v0, Lrg0/d;->a:Lfi0/a;

    new-instance v5, Ll83/k;

    invoke-direct {v5, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    check-cast v1, Lih0/b$e;

    invoke-virtual {v1}, Lih0/b$e;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ll83/k;

    invoke-direct {v4, v7, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lih0/b$e;->b()Ljava/lang/String;

    move-result-object v2

    new-instance v7, Ll83/k;

    invoke-direct {v7, v6, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v4, v7}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1}, Lih0/b$e;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lrg0/d;->d(Ljava/lang/Integer;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v2, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lrg0/d;->e(Ljava/util/Map;Z)Ljava/util/Map;

    move-result-object v14

    const/16 v15, 0x15

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "form_view_impression"

    const/4 v11, 0x0

    const-string v12, "AI Coach"

    const/4 v13, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_3
    instance-of v5, v1, Lih0/b$b;

    if-eqz v5, :cond_4

    iget-object v8, v0, Lrg0/d;->a:Lfi0/a;

    new-instance v5, Ll83/k;

    invoke-direct {v5, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    check-cast v1, Lih0/b$b;

    invoke-virtual {v1}, Lih0/b$b;->b()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ll83/k;

    invoke-direct {v4, v7, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lih0/b$b;->c()Ljava/lang/String;

    move-result-object v2

    new-instance v7, Ll83/k;

    invoke-direct {v7, v6, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lih0/b$b;->a()Lah0/e;

    move-result-object v2

    invoke-virtual {v2}, Lah0/e;->getAnalyticsValue()Ljava/lang/String;

    move-result-object v2

    new-instance v6, Ll83/k;

    const-string v9, "error_type"

    invoke-direct {v6, v9, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v4, v7, v6}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1}, Lih0/b$b;->d()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lrg0/d;->d(Ljava/lang/Integer;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v2, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lrg0/d;->e(Ljava/util/Map;Z)Ljava/util/Map;

    move-result-object v14

    const/16 v15, 0x15

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "form_error_impression"

    const/4 v11, 0x0

    const-string v12, "AI Coach"

    const/4 v13, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_4
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
