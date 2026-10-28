.class public final Lbi0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lbi0/a;",
        "",
        "Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;",
        "amoebaViewStateReducer",
        "<init>",
        "(Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;)V",
        "Lyh0/e;",
        "healthspanState",
        "Lyh0/d;",
        "whoopAgeAmoeba",
        "Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;",
        "a",
        "(Lyh0/e;Lyh0/d;)Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;",
        "Ll83/k;",
        "",
        "b",
        "(Lyh0/e;)Ll83/k;",
        "yearsDifference",
        "c",
        "(F)F",
        "Lyh0/b;",
        "domainResult",
        "Lai0/c;",
        "d",
        "(Lyh0/b;)Lai0/c;",
        "Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;",
        "amoeba_release"
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
.field private final a:Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->$stable:I

    sput v0, Lbi0/a;->b:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;)V
    .locals 1

    const-string v0, "amoebaViewStateReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbi0/a;->a:Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;

    return-void
.end method

.method private final a(Lyh0/e;Lyh0/d;)Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;
    .locals 14

    invoke-direct/range {p0 .. p1}, Lbi0/a;->b(Lyh0/e;)Ll83/k;

    move-result-object v0

    iget-object v1, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    new-instance v2, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    new-instance v3, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;

    sget-object v4, Lyh0/c;->b:Lyh0/c$a;

    invoke-virtual {v4}, Lyh0/c$a;->a()F

    move-result v4

    float-to-double v4, v4

    invoke-virtual {p1}, Lyh0/e;->c()F

    move-result v6

    float-to-double v6, v6

    invoke-virtual {p1}, Lyh0/e;->d()F

    move-result v8

    float-to-double v8, v8

    float-to-double v10, v0

    float-to-double v12, v1

    invoke-direct/range {v3 .. v13}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;-><init>(DDDDD)V

    invoke-virtual/range {p2 .. p2}, Lyh0/d;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, Lyh0/d;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, Lyh0/d;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lyh0/e;->d()F

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lyh0/e;->c()F

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v11

    const-string v12, "PACE OF AGING"

    const/4 v13, 0x0

    const-string v7, "YOUNGER"

    const-string v9, "YOUNGER"

    const-string v10, "YEARS YOUNGER"

    invoke-direct/range {v2 .. v13}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;-><init>(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v2
.end method

.method private final b(Lyh0/e;)Ll83/k;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyh0/e;",
            ")",
            "Ll83/k;"
        }
    .end annotation

    sget-object v0, Lc51/n;->l:Lc51/n$a;

    invoke-virtual {v0}, Lc51/n$a;->b()Li93/f;

    move-result-object v0

    invoke-virtual {p1}, Lyh0/e;->c()F

    move-result v1

    invoke-static {v0, v1}, Ld51/e;->a(Li93/f;F)F

    move-result v0

    invoke-virtual {p1}, Lyh0/e;->d()F

    move-result p1

    invoke-direct {p0, p1}, Lbi0/a;->c(F)F

    move-result p1

    new-instance v1, Ll83/k;

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method private final c(F)F
    .locals 3

    const/4 v0, 0x1

    int-to-float v0, v0

    const v1, -0x40e66666    # -0.6f

    mul-float/2addr p1, v1

    float-to-double v1, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->exp(D)D

    move-result-wide v1

    double-to-float p1, v1

    add-float/2addr p1, v0

    div-float/2addr v0, p1

    return v0
.end method


# virtual methods
.method public final d(Lyh0/b;)Lai0/c;
    .locals 5

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lyh0/b$c;

    if-eqz v0, :cond_2

    check-cast p1, Lyh0/b$c;

    invoke-virtual {p1}, Lyh0/b$c;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lyh0/b$c;->b()Lyh0/e;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lc51/p;->PULSE_YEARS_DIFFERENCE:Lc51/p;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p1}, Lyh0/b$c;->a()Lyh0/e;

    move-result-object v2

    invoke-virtual {p1}, Lyh0/b$c;->d()Lyh0/d;

    move-result-object v3

    invoke-direct {p0, v2, v3}, Lbi0/a;->a(Lyh0/e;Lyh0/d;)Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    move-result-object v2

    invoke-virtual {p1}, Lyh0/b$c;->b()Lyh0/e;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {p1}, Lyh0/b$c;->d()Lyh0/d;

    move-result-object v1

    invoke-direct {p0, v3, v1}, Lbi0/a;->a(Lyh0/e;Lyh0/d;)Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    move-result-object v1

    :cond_1
    invoke-virtual {p1}, Lyh0/b$c;->a()Lyh0/e;

    move-result-object v3

    invoke-virtual {v3}, Lyh0/e;->e()Z

    move-result v3

    new-instance v4, Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;

    invoke-direct {v4, v2, v0, v1, v3}, Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;-><init>(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Lc51/p;Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Z)V

    new-instance v0, Lai0/c$c;

    iget-object v1, p0, Lbi0/a;->a:Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;

    invoke-virtual {v1, v4}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->reduce(Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult;)Lc51/s;

    move-result-object v1

    sget-object v2, Lc51/n;->l:Lc51/n$a;

    invoke-virtual {v2}, Lc51/n$a;->b()Li93/f;

    move-result-object v3

    invoke-virtual {p1}, Lyh0/b$c;->a()Lyh0/e;

    move-result-object v4

    invoke-virtual {v4}, Lyh0/e;->c()F

    move-result v4

    invoke-static {v3, v4}, Ld51/e;->a(Li93/f;F)F

    move-result v3

    invoke-virtual {v2}, Lc51/n$a;->a()Li93/f;

    move-result-object v2

    invoke-virtual {p1}, Lyh0/b$c;->a()Lyh0/e;

    move-result-object p1

    invoke-virtual {p1}, Lyh0/e;->d()F

    move-result p1

    invoke-static {v2, p1}, Ld51/e;->a(Li93/f;F)F

    move-result p1

    invoke-direct {v0, v1, v3, p1}, Lai0/c$c;-><init>(Lc51/s;FF)V

    return-object v0

    :cond_2
    instance-of v0, p1, Lyh0/b$a;

    if-eqz v0, :cond_3

    sget-object p1, Lai0/c$a;->a:Lai0/c$a;

    return-object p1

    :cond_3
    instance-of p1, p1, Lyh0/b$b;

    if-eqz p1, :cond_4

    sget-object p1, Lai0/c$b;->a:Lai0/c$b;

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
