.class public final Lib2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J!\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00162\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lib2/a;",
        "",
        "Ly92/a;",
        "authManger",
        "Ldj0/b;",
        "cognitoAuthApi",
        "Liy1/c;",
        "metricWriter",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ly92/a;Ldj0/b;Liy1/c;Ltr2/n;)V",
        "",
        "email",
        "",
        "f",
        "(Ljava/lang/String;)Z",
        "Lib2/c$d;",
        "event",
        "Lib2/e;",
        "d",
        "(Lib2/c$d;Lq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "Lib2/c;",
        "events",
        "e",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Ly92/a;",
        "b",
        "Ldj0/b;",
        "c",
        "Liy1/c;",
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
.field private final a:Ly92/a;

.field private final b:Ldj0/b;

.field private final c:Liy1/c;

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Ly92/a;Ldj0/b;Liy1/c;Ltr2/n;)V
    .locals 1

    const-string v0, "authManger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cognitoAuthApi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricWriter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lib2/a;->a:Ly92/a;

    .line 3
    iput-object p2, p0, Lib2/a;->b:Ldj0/b;

    .line 4
    iput-object p3, p0, Lib2/a;->c:Liy1/c;

    .line 5
    iput-object p4, p0, Lib2/a;->d:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Ly92/a;Ldj0/b;Liy1/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 6
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "EditEmailInteractor"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lib2/a;-><init>(Ly92/a;Ldj0/b;Liy1/c;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lib2/a;)Ly92/a;
    .locals 0

    iget-object p0, p0, Lib2/a;->a:Ly92/a;

    return-object p0
.end method

.method public static final synthetic b(Lib2/a;)Ldj0/b;
    .locals 0

    iget-object p0, p0, Lib2/a;->b:Ldj0/b;

    return-object p0
.end method

.method public static final synthetic c(Lib2/a;Lib2/c$d;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lib2/a;->d(Lib2/c$d;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final d(Lib2/c$d;Lq83/d;)Ljava/lang/Object;
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lib2/c$d;",
            "Lq83/d<",
            "-",
            "Lib2/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v4, p0

    move-object/from16 v0, p2

    instance-of v1, v0, Lib2/a$b;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lib2/a$b;

    iget v2, v1, Lib2/a$b;->J:I

    const/high16 v3, -0x80000000

    and-int v5, v2, v3

    if-eqz v5, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lib2/a$b;->J:I

    :goto_0
    move-object v7, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lib2/a$b;

    invoke-direct {v1, v4, v0}, Lib2/a$b;-><init>(Lib2/a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v0, v7, Lib2/a$b;->H:Ljava/lang/Object;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v1, v7, Lib2/a$b;->J:I

    const/4 v9, 0x5

    const/4 v10, 0x4

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v13, 0x2

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eqz v1, :cond_7

    if-eq v1, v14, :cond_5

    if-eq v1, v13, :cond_4

    if-eq v1, v11, :cond_3

    if-eq v1, v10, :cond_2

    if-ne v1, v9, :cond_1

    iget-object v1, v7, Lib2/a$b;->E:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/User;

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_2
    iget-object v1, v7, Lib2/a$b;->z:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/User;

    iget-object v1, v7, Lib2/a$b;->y:Ljava/lang/Object;

    check-cast v1, Ldj0/e;

    iget-object v1, v7, Lib2/a$b;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/AuthMaterial;

    iget-object v1, v7, Lib2/a$b;->w:Ljava/lang/Object;

    check-cast v1, Lib2/c$d;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_3
    iget-object v1, v7, Lib2/a$b;->y:Ljava/lang/Object;

    check-cast v1, Ldj0/e;

    iget-object v1, v7, Lib2/a$b;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/AuthMaterial;

    iget-object v1, v7, Lib2/a$b;->w:Ljava/lang/Object;

    check-cast v1, Lib2/c$d;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_4
    iget-object v1, v7, Lib2/a$b;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/AuthMaterial;

    iget-object v1, v7, Lib2/a$b;->w:Ljava/lang/Object;

    check-cast v1, Lib2/c$d;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_5
    iget-object v1, v7, Lib2/a$b;->w:Ljava/lang/Object;

    check-cast v1, Lib2/c$d;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_6
    move-object v6, v1

    goto :goto_3

    :cond_7
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lib2/c$d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Lib2/a;->f(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    new-instance v0, Lib2/e$a;

    invoke-virtual/range {p1 .. p1}, Lib2/c$d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lib2/c$d;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/whoop/design/util/TextResource$b;

    sget v5, Lea2/s;->S:I

    invoke-direct {v3, v5, v15, v13, v15}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v1, v2, v3, v12}, Lib2/e$a;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Z)V

    return-object v0

    :cond_8
    iget-object v0, v4, Lib2/a;->a:Ly92/a;

    move-object/from16 v1, p1

    iput-object v1, v7, Lib2/a$b;->w:Ljava/lang/Object;

    iput v14, v7, Lib2/a$b;->J:I

    invoke-virtual {v0, v7}, Ly92/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_6

    goto/16 :goto_8

    :goto_3
    move-object v5, v0

    check-cast v5, Lcom/whoop/domain/model/AuthMaterial;

    if-eqz v5, :cond_12

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v0, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v14, v0}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v1

    new-instance v0, Lib2/a$a;

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v6}, Lib2/a$a;-><init>(JLq83/d;Lib2/a;Lcom/whoop/domain/model/AuthMaterial;Lib2/c$d;)V

    iput-object v6, v7, Lib2/a$b;->w:Ljava/lang/Object;

    iput-object v15, v7, Lib2/a$b;->x:Ljava/lang/Object;

    iput-wide v1, v7, Lib2/a$b;->F:J

    iput v12, v7, Lib2/a$b;->G:I

    iput v13, v7, Lib2/a$b;->J:I

    invoke-static {v0, v7}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_9

    goto/16 :goto_8

    :cond_9
    move-object v1, v6

    :goto_4
    check-cast v0, Ldj0/e;

    instance-of v2, v0, Ldj0/c;

    if-eqz v2, :cond_c

    check-cast v0, Ldj0/c;

    invoke-virtual {v0}, Ldj0/c;->c()I

    move-result v0

    const/16 v2, 0x199

    if-ne v0, v2, :cond_a

    goto :goto_5

    :cond_a
    move v14, v12

    :goto_5
    new-instance v0, Lib2/e$b;

    invoke-virtual {v1}, Lib2/c$d;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v14, :cond_b

    new-instance v2, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lea2/s;->n:I

    invoke-direct {v2, v3, v15, v13, v15}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_6

    :cond_b
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    :goto_6
    invoke-direct {v0, v1, v2, v12}, Lib2/e$b;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Z)V

    return-object v0

    :cond_c
    instance-of v2, v0, Ldj0/d;

    if-eqz v2, :cond_d

    new-instance v16, Lib2/e$b;

    invoke-virtual {v1}, Lib2/c$d;->a()Ljava/lang/String;

    move-result-object v17

    const/16 v20, 0x6

    const/16 v21, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v16 .. v21}, Lib2/e$b;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v16

    :cond_d
    instance-of v0, v0, Ldj0/e$a;

    if-eqz v0, :cond_11

    iget-object v0, v4, Lib2/a;->a:Ly92/a;

    iput-object v1, v7, Lib2/a$b;->w:Ljava/lang/Object;

    iput-object v15, v7, Lib2/a$b;->x:Ljava/lang/Object;

    iput-object v15, v7, Lib2/a$b;->y:Ljava/lang/Object;

    iput v11, v7, Lib2/a$b;->J:I

    invoke-virtual {v0, v7}, Ly92/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_e

    goto :goto_8

    :cond_e
    :goto_7
    move-object/from16 v16, v0

    check-cast v16, Lcom/whoop/domain/model/User;

    if-nez v16, :cond_f

    iget-object v0, v4, Lib2/a;->c:Liy1/c;

    new-instance v16, Ljy1/a;

    const/16 v22, 0x15

    const/16 v23, 0x0

    const/16 v17, 0x0

    const-string v18, "edit_email.local_cache_failure"

    const/16 v19, 0x0

    sget-object v20, Lm83/y;->w:Lm83/y;

    const/16 v21, 0x0

    invoke-direct/range {v16 .. v23}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v16

    iput-object v15, v7, Lib2/a$b;->w:Ljava/lang/Object;

    iput-object v15, v7, Lib2/a$b;->x:Ljava/lang/Object;

    iput-object v15, v7, Lib2/a$b;->y:Ljava/lang/Object;

    iput-object v15, v7, Lib2/a$b;->z:Ljava/lang/Object;

    iput v10, v7, Lib2/a$b;->J:I

    invoke-interface {v0, v1, v7}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_10

    goto :goto_8

    :cond_f
    invoke-virtual {v1}, Lib2/c$d;->a()Ljava/lang/String;

    move-result-object v22

    const/16 v32, 0x7fdf

    const/16 v33, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-static/range {v16 .. v33}, Lcom/whoop/domain/model/User;->copy$default(Lcom/whoop/domain/model/User;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/UserProfile;Ljava/lang/Boolean;IILjava/lang/Object;)Lcom/whoop/domain/model/User;

    move-result-object v0

    iget-object v1, v4, Lib2/a;->a:Ly92/a;

    iput-object v15, v7, Lib2/a$b;->w:Ljava/lang/Object;

    iput-object v15, v7, Lib2/a$b;->x:Ljava/lang/Object;

    iput-object v15, v7, Lib2/a$b;->y:Ljava/lang/Object;

    iput-object v15, v7, Lib2/a$b;->z:Ljava/lang/Object;

    iput-object v15, v7, Lib2/a$b;->E:Ljava/lang/Object;

    iput v9, v7, Lib2/a$b;->J:I

    invoke-virtual {v1, v0, v7}, Ly92/a;->e(Lcom/whoop/domain/model/User;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_10

    :goto_8
    return-object v8

    :cond_10
    :goto_9
    sget-object v0, Lib2/e$d;->a:Lib2/e$d;

    return-object v0

    :cond_11
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Access token is required to change email"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final f(Ljava/lang/String;)Z
    .locals 2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x100

    if-ge v0, v1, :cond_0

    const-string v0, "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v1, "compile(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final e(Lec3/l;)Lec3/l;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "events"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lib2/f;

    sget-object v4, Lib2/c$c;->a:Lib2/c$c;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, Lib2/f;-><init>(Ljava/lang/String;Ljava/lang/String;Lib2/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lib2/a$d;

    invoke-direct {v0, p0, v2}, Lib2/a$d;-><init>(Lib2/a;Lq83/d;)V

    new-instance v3, Lec3/l1;

    invoke-direct {v3, v1, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance p1, Lib2/a$c;

    invoke-direct {p1, v2, p0}, Lib2/a$c;-><init>(Lq83/d;Lib2/a;)V

    invoke-static {v3, p1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
