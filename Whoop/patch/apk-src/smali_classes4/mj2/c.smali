.class public final Lmj2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmj2/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ5\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\u0004\u0018\u0001`\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008\"\u0010!J!\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00080#2\u000c\u0010%\u001a\u0008\u0012\u0004\u0012\u00020$0#\u00a2\u0006\u0004\u0008&\u0010\'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)\u00a8\u0006*"
    }
    d2 = {
        "Lmj2/c;",
        "",
        "Ljb1/a;",
        "designItemReducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lcom/whoop/design/models/items/graph/StressGraphingCardModel;",
        "stressGraphingCardModel",
        "Lnj2/p;",
        "e",
        "(Lcom/whoop/design/models/items/graph/StressGraphingCardModel;)Lnj2/p;",
        "Lnj2/l$e;",
        "domainState",
        "Lcom/whoop/educationModels/FeatureEducationDto;",
        "stressEducation",
        "Lh91/b;",
        "Lcom/whoop/design/models/calendar/CalendarDateModel;",
        "Lcom/whoop/design/domain/calendar/CalendarDomainState;",
        "calendarDomainState",
        "l",
        "(Lnj2/l$e;Lcom/whoop/educationModels/FeatureEducationDto;Lh91/b;)Lnj2/p;",
        "Lnj2/n;",
        "i",
        "(Lnj2/l$e;)Lnj2/n;",
        "Lcom/whoop/design/models/items/graph/stress/StressState;",
        "stressState",
        "Ly81/e;",
        "j",
        "(Lcom/whoop/design/models/items/graph/stress/StressState;)Ly81/e;",
        "",
        "isCalibrating",
        "Li91/a;",
        "g",
        "(Z)Li91/a;",
        "h",
        "Lec3/l;",
        "Lkj2/g;",
        "upstream",
        "k",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Ljb1/a;",
        "stress_release"
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
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lmj2/c;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lmj2/c;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 3
    invoke-static {p1, p3, p1}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lmj2/c;-><init>(Ljb1/a;)V

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmj2/c;->m(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmj2/c;->f(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lmj2/c;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;)Lnj2/p;
    .locals 0

    invoke-direct {p0, p1}, Lmj2/c;->e(Lcom/whoop/design/models/items/graph/StressGraphingCardModel;)Lnj2/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lmj2/c;Lnj2/l$e;Lcom/whoop/educationModels/FeatureEducationDto;Lh91/b;)Lnj2/p;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lmj2/c;->l(Lnj2/l$e;Lcom/whoop/educationModels/FeatureEducationDto;Lh91/b;)Lnj2/p;

    move-result-object p0

    return-object p0
.end method

.method private final e(Lcom/whoop/design/models/items/graph/StressGraphingCardModel;)Lnj2/p;
    .locals 26

    new-instance v0, Lmj2/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lmj2/e;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    new-instance v1, Lnj2/p;

    move-object/from16 v2, p1

    invoke-virtual {v0, v2}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    instance-of v2, v0, Lk71/c0;

    if-eqz v2, :cond_0

    check-cast v0, Lk71/c0;

    :goto_0
    move-object v8, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    const v24, 0x3fffbf

    const/16 v25, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v1 .. v25}, Lnj2/p;-><init>(ZLnj2/m;Lnj2/a;Lnj2/n;Lk51/c;Ls01/d;Lk71/c0;Lh51/f;Lh51/f;Lh51/f;Lcom/whoop/design/util/TextResource;Lnj2/e;Lnj2/d;Lk71/c0;Lnj2/y;La11/r;Lnj2/f;Lh91/b;Lk71/c0;Ljava/util/List;Lv31/g;Lep0/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final f(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lk71/c0;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lmj2/c$b;

    invoke-direct {v1}, Lmj2/c$b;-><init>()V

    invoke-virtual {p0, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final g(Z)Li91/a;
    .locals 0

    if-eqz p1, :cond_0

    sget-object p1, Lmj2/c$c;->w:Lmj2/c$c;

    invoke-static {p1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lz71/a;->d()Li91/a;

    move-result-object p1

    return-object p1
.end method

.method private final h(Z)Li91/a;
    .locals 0

    if-eqz p1, :cond_0

    sget-object p1, Lmj2/c$d;->w:Lmj2/c$d;

    invoke-static {p1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lz71/a;->f()Li91/a;

    move-result-object p1

    return-object p1
.end method

.method private final i(Lnj2/l$e;)Lnj2/n;
    .locals 19

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->v()Lcom/whoop/design/models/items/graph/stress/StressState;

    move-result-object v1

    sget-object v2, Lmj2/c$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v3, 0x2

    if-eq v1, v3, :cond_0

    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->k()Lnj2/c;

    move-result-object v1

    new-instance v2, Lnj2/n;

    invoke-virtual {v1}, Lnj2/c;->e()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v1}, Lnj2/c;->f()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v1}, Lnj2/c;->a()F

    move-result v9

    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->v()Lcom/whoop/design/models/items/graph/stress/StressState;

    move-result-object v3

    invoke-direct {v0, v3}, Lmj2/c;->j(Lcom/whoop/design/models/items/graph/stress/StressState;)Ly81/e;

    move-result-object v10

    invoke-virtual {v1}, Lnj2/c;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v1}, Lnj2/c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    const/16 v16, 0x110f

    const/16 v17, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v2 .. v17}, Lnj2/n;-><init>(ZZLi91/a;Li91/a;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLy81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->k()Lnj2/c;

    move-result-object v1

    new-instance v3, Lnj2/n;

    invoke-direct {v0, v2}, Lmj2/c;->g(Z)Li91/a;

    move-result-object v6

    invoke-direct {v0, v2}, Lmj2/c;->h(Z)Li91/a;

    move-result-object v7

    invoke-virtual {v1}, Lnj2/c;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v1}, Lnj2/c;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v1}, Lnj2/c;->a()F

    move-result v10

    sget-object v2, Lmj2/c$e;->w:Lmj2/c$e;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v11

    invoke-virtual {v1}, Lnj2/c;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v1}, Lnj2/c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    const/16 v17, 0x1103

    const/16 v18, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v3 .. v18}, Lnj2/n;-><init>(ZZLi91/a;Li91/a;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLy81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_1
    sget-object v1, Lnj2/n;->n:Lnj2/n$e;

    invoke-virtual {v1}, Lnj2/n$e;->a()Lnj2/n;

    move-result-object v1

    return-object v1
.end method

.method private final j(Lcom/whoop/design/models/items/graph/stress/StressState;)Ly81/e;
    .locals 1

    sget-object v0, Lmj2/c$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    sget-object p1, Lmj2/c$h;->w:Lmj2/c$h;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lmj2/c$g;->w:Lmj2/c$g;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object p1, Lmj2/c$f;->w:Lmj2/c$f;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1
.end method

.method private final l(Lnj2/l$e;Lcom/whoop/educationModels/FeatureEducationDto;Lh91/b;)Lnj2/p;
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnj2/l$e;",
            "Lcom/whoop/educationModels/FeatureEducationDto;",
            "Lh91/b<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;)",
            "Lnj2/p;"
        }
    .end annotation

    move-object/from16 v0, p0

    invoke-static/range {p2 .. p2}, Loj2/c;->a(Lcom/whoop/educationModels/FeatureEducationDto;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->k()Lnj2/c;

    move-result-object v2

    invoke-virtual {v2}, Lnj2/c;->g()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_4

    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->v()Lcom/whoop/design/models/items/graph/stress/StressState;

    move-result-object v2

    sget-object v5, Lcom/whoop/design/models/items/graph/stress/StressState;->CALIBRATING:Lcom/whoop/design/models/items/graph/stress/StressState;

    if-ne v2, v5, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    invoke-direct {v0, v2}, Lmj2/c;->g(Z)Li91/a;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->v()Lcom/whoop/design/models/items/graph/stress/StressState;

    move-result-object v2

    if-ne v2, v5, :cond_1

    move v2, v4

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    invoke-direct {v0, v2}, Lmj2/c;->h(Z)Li91/a;

    move-result-object v10

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    sget-object v2, Lmj2/c$n;->w:Lmj2/c$n;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v14

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->k()Lnj2/c;

    move-result-object v2

    invoke-virtual {v2}, Lnj2/c;->b()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    move-object/from16 v19, v2

    goto :goto_4

    :cond_3
    :goto_3
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    goto :goto_2

    :goto_4
    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->i()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    new-instance v6, Lnj2/n;

    const/16 v20, 0x142

    const/16 v21, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v6 .. v21}, Lnj2/n;-><init>(ZZLi91/a;Li91/a;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLy81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_5
    move-object v11, v6

    goto :goto_6

    :cond_4
    invoke-direct/range {p0 .. p1}, Lmj2/c;->i(Lnj2/l$e;)Lnj2/n;

    move-result-object v6

    goto :goto_5

    :goto_6
    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->w()Lnj2/z;

    move-result-object v2

    const/4 v5, 0x0

    if-eqz v2, :cond_5

    new-instance v12, Lk51/c;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/u;->f()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v2}, Lnj2/z;->a()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v2}, Lnj2/z;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    const/16 v17, 0x8

    const/16 v18, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v12 .. v18}, Lk51/c;-><init>(Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/t0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_7

    :cond_5
    move-object v12, v5

    :goto_7
    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->z()Lcom/whoop/design/models/items/WhoopCoachVowModel;

    move-result-object v2

    if-eqz v2, :cond_7

    iget-object v6, v0, Lmj2/c;->a:Ljb1/a;

    invoke-virtual {v6, v2}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v2

    instance-of v6, v2, Ls01/d;

    if-eqz v6, :cond_6

    check-cast v2, Ls01/d;

    goto :goto_8

    :cond_6
    move-object v2, v5

    :goto_8
    move-object v13, v2

    goto :goto_9

    :cond_7
    move-object v13, v5

    :goto_9
    new-instance v2, Lmj2/e;

    const/4 v6, 0x2

    invoke-direct {v2, v6}, Lmj2/e;-><init>(I)V

    invoke-static {v2}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->u()Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    move-result-object v6

    if-eqz v6, :cond_9

    invoke-virtual {v2, v6}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v6

    instance-of v7, v6, Lk71/c0;

    if-eqz v7, :cond_8

    check-cast v6, Lk71/c0;

    goto :goto_a

    :cond_8
    move-object v6, v5

    :goto_a
    move-object v14, v6

    goto :goto_b

    :cond_9
    move-object v14, v5

    :goto_b
    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->l()Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    move-result-object v6

    if-eqz v6, :cond_a

    invoke-virtual {v2, v6}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v6

    instance-of v7, v6, Lh51/f;

    if-eqz v7, :cond_a

    check-cast v6, Lh51/f;

    goto :goto_c

    :cond_a
    move-object v6, v5

    :goto_c
    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->s()Z

    move-result v7

    if-eqz v7, :cond_b

    move-object v15, v6

    goto :goto_d

    :cond_b
    move-object v15, v5

    :goto_d
    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->q()Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    move-result-object v6

    if-eqz v6, :cond_d

    invoke-virtual {v2, v6}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v6

    instance-of v7, v6, Lh51/f;

    if-eqz v7, :cond_c

    check-cast v6, Lh51/f;

    goto :goto_e

    :cond_c
    move-object v6, v5

    :goto_e
    move-object/from16 v16, v6

    goto :goto_f

    :cond_d
    move-object/from16 v16, v5

    :goto_f
    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->g()Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    move-result-object v6

    if-eqz v6, :cond_f

    invoke-virtual {v2, v6}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v6

    instance-of v7, v6, Lh51/f;

    if-eqz v7, :cond_e

    check-cast v6, Lh51/f;

    goto :goto_10

    :cond_e
    move-object v6, v5

    :goto_10
    move-object/from16 v17, v6

    goto :goto_11

    :cond_f
    move-object/from16 v17, v5

    :goto_11
    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->p()Lcom/whoop/design/models/items/StepperComponentModel;

    move-result-object v6

    if-eqz v6, :cond_11

    invoke-virtual {v2, v6}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v6

    instance-of v7, v6, Lv31/g;

    if-eqz v7, :cond_10

    check-cast v6, Lv31/g;

    goto :goto_12

    :cond_10
    move-object v6, v5

    :goto_12
    move-object/from16 v28, v6

    goto :goto_13

    :cond_11
    move-object/from16 v28, v5

    :goto_13
    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->n()Lcom/whoop/stress/domain/model/PendingActivityDialogue;

    move-result-object v6

    if-eqz v6, :cond_12

    new-instance v7, Lnj2/e;

    invoke-virtual {v6}, Lcom/whoop/stress/domain/model/PendingActivityDialogue;->getTitle()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v6}, Lcom/whoop/stress/domain/model/PendingActivityDialogue;->getDescription()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v6}, Lcom/whoop/stress/domain/model/PendingActivityDialogue;->getButton()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-direct {v7, v8, v9, v6}, Lnj2/e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    move-object/from16 v19, v7

    goto :goto_14

    :cond_12
    move-object/from16 v19, v5

    :goto_14
    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->m()Lcom/whoop/stress/domain/model/OnboardingDismissDialog;

    move-result-object v6

    if-eqz v6, :cond_13

    new-instance v7, Lnj2/d;

    invoke-virtual {v6}, Lcom/whoop/stress/domain/model/OnboardingDismissDialog;->getTitle()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v6}, Lcom/whoop/stress/domain/model/OnboardingDismissDialog;->getBody()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v6}, Lcom/whoop/stress/domain/model/OnboardingDismissDialog;->getButtonText()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v6}, Lcom/whoop/stress/domain/model/OnboardingDismissDialog;->getDismissText()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-direct {v7, v8, v9, v10, v6}, Lnj2/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    move-object/from16 v20, v7

    goto :goto_15

    :cond_13
    move-object/from16 v20, v5

    :goto_15
    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->o()Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    move-result-object v6

    const-string v7, "null cannot be cast to non-null type com.whoop.design.atomic.organism.graphingcard.StressGraphingCardState"

    if-eqz v6, :cond_14

    invoke-virtual {v2, v6}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v6

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lk71/c0;

    move-object/from16 v21, v6

    goto :goto_16

    :cond_14
    move-object/from16 v21, v5

    :goto_16
    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->A()Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    move-result-object v6

    if-eqz v6, :cond_15

    invoke-virtual {v2, v6}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lk71/c0;

    move-object/from16 v26, v2

    goto :goto_17

    :cond_15
    move-object/from16 v26, v5

    :goto_17
    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->e()Lcom/whoop/stress/domain/model/StressDateSelector;

    move-result-object v2

    if-eqz v2, :cond_1a

    new-instance v29, Lnj2/f;

    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->f()Z

    move-result v30

    invoke-virtual {v2}, Lcom/whoop/stress/domain/model/StressDateSelector;->getDateText()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v31

    invoke-virtual {v2}, Lcom/whoop/stress/domain/model/StressDateSelector;->getPreviousButtonDate()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_16

    move/from16 v32, v4

    goto :goto_18

    :cond_16
    move/from16 v32, v3

    :goto_18
    invoke-virtual {v2}, Lcom/whoop/stress/domain/model/StressDateSelector;->getNextButtonDate()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_17

    move/from16 v33, v4

    goto :goto_19

    :cond_17
    move/from16 v33, v3

    :goto_19
    invoke-virtual {v2}, Lcom/whoop/stress/domain/model/StressDateSelector;->getPreviousButtonDate()Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    if-nez v3, :cond_18

    move-object/from16 v34, v4

    goto :goto_1a

    :cond_18
    move-object/from16 v34, v3

    :goto_1a
    invoke-virtual {v2}, Lcom/whoop/stress/domain/model/StressDateSelector;->getNextButtonDate()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_19

    move-object/from16 v35, v4

    goto :goto_1b

    :cond_19
    move-object/from16 v35, v2

    :goto_1b
    invoke-direct/range {v29 .. v35}, Lnj2/f;-><init>(ZLcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v24, v29

    goto :goto_1c

    :cond_1a
    move-object/from16 v24, v5

    :goto_1c
    new-instance v10, Lnj2/a;

    invoke-static/range {p2 .. p2}, Lcom/whoop/educationModels/EducationDtoToModelMapperKt;->toStressEducationSections(Lcom/whoop/educationModels/FeatureEducationDto;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v10, v1, v2}, Lnj2/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1c

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    if-nez v1, :cond_1b

    goto :goto_1e

    :cond_1b
    :goto_1d
    move-object/from16 v18, v1

    goto :goto_1f

    :cond_1c
    :goto_1e
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    goto :goto_1d

    :goto_1f
    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->d()Lca2/c;

    move-result-object v1

    if-eqz v1, :cond_1d

    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->h()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lmj2/b;->a(Lca2/c;Ljava/lang/String;)La11/r;

    move-result-object v1

    move-object/from16 v23, v1

    goto :goto_20

    :cond_1d
    move-object/from16 v23, v5

    :goto_20
    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->x()Lcom/whoop/stress/domain/model/StressTrend;

    move-result-object v1

    if-eqz v1, :cond_1f

    if-eqz p3, :cond_1e

    invoke-virtual/range {p3 .. p3}, Lh91/b;->k()Ljava/time/LocalDate;

    move-result-object v2

    goto :goto_21

    :cond_1e
    move-object v2, v5

    :goto_21
    invoke-static {v1, v2}, Lmj2/f;->f(Lcom/whoop/stress/domain/model/StressTrend;Ljava/time/LocalDate;)Lnj2/y;

    move-result-object v1

    move-object/from16 v22, v1

    goto :goto_22

    :cond_1f
    move-object/from16 v22, v5

    :goto_22
    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->y()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_22

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_23
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_21

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/stress/domain/model/StressTrend;

    if-eqz p3, :cond_20

    invoke-virtual/range {p3 .. p3}, Lh91/b;->k()Ljava/time/LocalDate;

    move-result-object v4

    goto :goto_24

    :cond_20
    move-object v4, v5

    :goto_24
    invoke-static {v3, v4}, Lmj2/f;->f(Lcom/whoop/stress/domain/model/StressTrend;Ljava/time/LocalDate;)Lnj2/y;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_23

    :cond_21
    move-object/from16 v27, v2

    goto :goto_25

    :cond_22
    move-object/from16 v27, v5

    :goto_25
    invoke-virtual/range {p1 .. p1}, Lnj2/l$e;->j()Lcom/whoop/stress/domain/model/MetaData;

    move-result-object v1

    if-eqz v1, :cond_23

    invoke-virtual {v1}, Lcom/whoop/stress/domain/model/MetaData;->getAiContextMetadata()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object v1

    if-eqz v1, :cond_23

    invoke-static {v1}, Lcom/whoop/coacheverywherecommon/models/a;->a(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lep0/j;

    move-result-object v5

    :cond_23
    move-object/from16 v29, v5

    new-instance v7, Lnj2/p;

    const/16 v30, 0x2

    const/16 v31, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v25, p3

    invoke-direct/range {v7 .. v31}, Lnj2/p;-><init>(ZLnj2/m;Lnj2/a;Lnj2/n;Lk51/c;Ls01/d;Lk71/c0;Lh51/f;Lh51/f;Lh51/f;Lcom/whoop/design/util/TextResource;Lnj2/e;Lnj2/d;Lk71/c0;Lnj2/y;La11/r;Lnj2/f;Lh91/b;Lk71/c0;Ljava/util/List;Lv31/g;Lep0/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method private static final m(Ljb1/b;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lk71/c0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lmj2/c$j;

    invoke-direct {v2}, Lmj2/c$j;-><init>()V

    invoke-virtual {p0, v1, v2}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    const-class v1, Lh51/f;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lmj2/c$k;

    invoke-direct {v2}, Lmj2/c$k;-><init>()V

    invoke-virtual {p0, v1, v2}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    const-class v1, Ld41/h;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lmj2/c$l;

    invoke-direct {v2}, Lmj2/c$l;-><init>()V

    invoke-virtual {p0, v1, v2}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    const-class v1, Lv31/g;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lmj2/c$m;

    invoke-direct {v1}, Lmj2/c$m;-><init>()V

    invoke-virtual {p0, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final k(Lec3/l;)Lec3/l;
    .locals 1
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

    new-instance v0, Lmj2/c$i;

    invoke-direct {v0, p1, p0}, Lmj2/c$i;-><init>(Lec3/l;Lmj2/c;)V

    return-object v0
.end method
