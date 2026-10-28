.class public final Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 B2\u00020\u0001:\u0001BB\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ#\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u000fH\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ3\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\'\u0010)\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\'\u0010(J\u0019\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010+\u001a\u00020*H\u0002\u00a2\u0006\u0004\u0008-\u0010.J\u0015\u00101\u001a\u0002002\u0006\u0010\u0007\u001a\u00020/\u00a2\u0006\u0004\u00081\u00102J\u0015\u00104\u001a\u00020*2\u0006\u00103\u001a\u00020,\u00a2\u0006\u0004\u00084\u00105J!\u00108\u001a\u0004\u0018\u0001072\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u00106\u001a\u00020\u001d\u00a2\u0006\u0004\u00088\u00109J!\u0010;\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020,0 2\u0006\u0010:\u001a\u00020,\u00a2\u0006\u0004\u0008;\u0010<J\u0015\u0010?\u001a\u00020>2\u0006\u0010=\u001a\u000200\u00a2\u0006\u0004\u0008?\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010A\u00a8\u0006C"
    }
    d2 = {
        "Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;",
        "",
        "Lc51/n;",
        "amoebaSettings",
        "<init>",
        "(Lc51/n;)V",
        "Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;",
        "domainResult",
        "Lc51/o;",
        "getAmoebaTextViewState",
        "(Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;)Lc51/o;",
        "Lc51/p;",
        "showTransitionAnimation",
        "",
        "paceOfAgingAnimationScore",
        "La51/d;",
        "getEmitterAnimationConfig",
        "(Lc51/p;D)La51/d;",
        "Li2/t;",
        "getCenterShadowBrush",
        "(D)Li2/t;",
        "emitterAnimationConfig",
        "Lc51/m;",
        "getAmoebaParticleViewState",
        "(DLa51/d;)Lc51/m;",
        "Lc51/l;",
        "getAmoebaOutlineViewState",
        "(D)Lc51/l;",
        "yearsDifferenceAnimationScore",
        "",
        "isOnboarding",
        "settings",
        "Ll83/k;",
        "Li2/x;",
        "getBlendedColors",
        "(DZLc51/n;)Ll83/k;",
        "colorA",
        "colorB",
        "ratio",
        "blendColors-2_19RoU",
        "(JJD)J",
        "blendColors",
        "Ly81/f;",
        "subtitleColor",
        "",
        "getStyleFromColor",
        "(Ly81/f;)Ljava/lang/String;",
        "Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult;",
        "Lc51/s;",
        "reduce",
        "(Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult;)Lc51/s;",
        "textStyle",
        "amoebaTextStyleToWhoopColor",
        "(Ljava/lang/String;)Ly81/f;",
        "didYearsDifferenceImprove",
        "Lc51/r;",
        "getTransitionViewState",
        "(Lc51/p;Z)Lc51/r;",
        "input",
        "extractFirstNumber",
        "(Ljava/lang/String;)Ll83/k;",
        "viewState",
        "Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;",
        "toWhoopAgeAmoeba",
        "(Lc51/s;)Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;",
        "Lc51/n;",
        "Companion",
        "design-models_release"
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer$Companion;

.field private static final textStyleMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lc51/b0;",
            "Ly81/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final amoebaSettings:Lc51/n;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->Companion:Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer$Companion;

    sget v0, Lc51/n;->m:I

    sput v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->$stable:I

    sget-object v0, Lc51/b0;->NEUTRAL:Lc51/b0;

    sget-object v1, Ly81/f;->HEALTH_NEUTRAL:Ly81/f;

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc51/b0;->YOUNGER:Lc51/b0;

    sget-object v1, Ly81/f;->HEALTH_YOUNG:Ly81/f;

    new-instance v3, Ll83/k;

    invoke-direct {v3, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc51/b0;->OLDER:Lc51/b0;

    sget-object v1, Ly81/f;->HEALTH_OLD:Ly81/f;

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc51/b0;->CALIBRATING:Lc51/b0;

    sget-object v1, Ly81/f;->HEALTH_CALIBRATING:Ly81/f;

    new-instance v5, Ll83/k;

    invoke-direct {v5, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3, v4, v5}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->textStyleMap:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;-><init>(Lc51/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lc51/n;)V
    .locals 1

    const-string v0, "amoebaSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    return-void
.end method

.method public synthetic constructor <init>(Lc51/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    .line 4
    new-instance v1, Lc51/n;

    const/16 v13, 0x7ff

    const/4 v14, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v1 .. v14}, Lc51/n;-><init>(FFLc51/w;Lc51/e;Lc51/y;Lc51/t;Ljava/util/List;Ll83/k;FLc51/x;Lc51/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    .line 5
    :goto_0
    invoke-direct {p0, v1}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;-><init>(Lc51/n;)V

    return-void
.end method

.method public static final synthetic access$getTextStyleMap$cp()Ljava/util/Map;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->textStyleMap:Ljava/util/Map;

    return-object v0
.end method

.method private final blendColors-2_19RoU(JJD)J
    .locals 0

    invoke-static {p1, p2}, Li2/w0;->H(J)I

    move-result p1

    invoke-static {p3, p4}, Li2/w0;->H(J)I

    move-result p2

    double-to-float p3, p5

    invoke-static {p3, p1, p2}, Lv4/a;->b(FII)I

    move-result p1

    invoke-static {p1}, Li2/w0;->c(I)J

    move-result-wide p1

    return-wide p1
.end method

.method private final getAmoebaOutlineViewState(D)Lc51/l;
    .locals 18

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    iget-object v3, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v3}, Lc51/n;->j()Lc51/w;

    move-result-object v3

    invoke-virtual {v3}, Lc51/w;->f()Li93/j;

    move-result-object v3

    invoke-static {v3, v1, v2}, Ld51/e;->c(Li93/j;D)I

    move-result v5

    iget-object v3, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v3}, Lc51/n;->j()Lc51/w;

    move-result-object v3

    invoke-virtual {v3}, Lc51/w;->f()Li93/j;

    move-result-object v7

    iget-object v3, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v3}, Lc51/n;->j()Lc51/w;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, Lc51/w;->i(D)Li93/f;

    move-result-object v6

    iget-object v1, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v1}, Lc51/n;->j()Lc51/w;

    move-result-object v1

    invoke-virtual {v1}, Lc51/w;->e()Ld51/d;

    move-result-object v8

    iget-object v1, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v1}, Lc51/n;->j()Lc51/w;

    move-result-object v1

    invoke-virtual {v1}, Lc51/w;->d()Ld51/d;

    move-result-object v9

    iget-object v1, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v1}, Lc51/n;->j()Lc51/w;

    move-result-object v1

    invoke-virtual {v1}, Lc51/w;->c()J

    move-result-wide v10

    iget-object v1, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v1}, Lc51/n;->j()Lc51/w;

    move-result-object v1

    invoke-virtual {v1}, Lc51/w;->h()D

    move-result-wide v12

    iget-object v1, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v1}, Lc51/n;->j()Lc51/w;

    move-result-object v1

    invoke-virtual {v1}, Lc51/w;->a()Ld0/z;

    move-result-object v14

    iget-object v1, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v1}, Lc51/n;->j()Lc51/w;

    move-result-object v1

    invoke-virtual {v1}, Lc51/w;->g()F

    move-result v15

    iget-object v1, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v1}, Lc51/n;->j()Lc51/w;

    move-result-object v1

    invoke-virtual {v1}, Lc51/w;->b()I

    move-result v16

    new-instance v4, Lc51/l;

    const/16 v17, 0x0

    invoke-direct/range {v4 .. v17}, Lc51/l;-><init>(ILi93/f;Li93/j;Ld51/d;Ld51/d;JDLd0/z;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method

.method private final getAmoebaParticleViewState(DLa51/d;)Lc51/m;
    .locals 28

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    new-instance v3, Lc51/m;

    iget-object v4, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v4}, Lc51/n;->l()Lc51/x;

    move-result-object v4

    invoke-virtual {v4}, Lc51/x;->g()Ld51/d;

    move-result-object v4

    invoke-virtual {v4, v1, v2}, Ld51/d;->c(D)D

    move-result-wide v4

    double-to-float v9, v4

    iget-object v4, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v4}, Lc51/n;->l()Lc51/x;

    move-result-object v4

    invoke-virtual {v4}, Lc51/x;->f()Ld51/d;

    move-result-object v4

    invoke-virtual {v4, v1, v2}, Ld51/d;->c(D)D

    move-result-wide v4

    double-to-float v10, v4

    iget-object v4, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v4}, Lc51/n;->l()Lc51/x;

    move-result-object v4

    invoke-virtual {v4}, Lc51/x;->c()Ld51/d;

    move-result-object v4

    invoke-virtual {v4, v1, v2}, Ld51/d;->c(D)D

    move-result-wide v4

    double-to-float v11, v4

    iget-object v4, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v4}, Lc51/n;->l()Lc51/x;

    move-result-object v4

    invoke-virtual {v4}, Lc51/x;->j()Ld51/d;

    move-result-object v4

    invoke-virtual {v4, v1, v2}, Ld51/d;->c(D)D

    move-result-wide v4

    double-to-float v4, v4

    iget-object v5, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v5}, Lc51/n;->l()Lc51/x;

    move-result-object v5

    invoke-virtual {v5}, Lc51/x;->k()Ld51/d;

    move-result-object v5

    invoke-virtual {v5, v1, v2}, Ld51/d;->c(D)D

    move-result-wide v5

    double-to-long v5, v5

    sget-object v7, Lb51/c$a;->a:Lb51/c$a;

    invoke-static {v7}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    const-wide v7, 0xefffffffL

    invoke-static {v7, v8}, Li2/w0;->e(J)J

    move-result-wide v7

    new-instance v12, Li2/x;

    invoke-direct {v12, v7, v8}, Li2/x;-><init>(J)V

    invoke-static {v12}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    new-instance v7, La51/f;

    iget-object v8, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v8}, Lc51/n;->l()Lc51/x;

    move-result-object v8

    invoke-virtual {v8}, Lc51/x;->h()Ld51/d;

    move-result-object v8

    move/from16 v22, v4

    move-wide v15, v5

    invoke-virtual {v8, v1, v2}, Ld51/d;->c(D)D

    move-result-wide v4

    double-to-float v4, v4

    const/4 v5, 0x0

    move-object/from16 v6, p3

    invoke-direct {v7, v5, v4, v6, v5}, La51/f;-><init>(Lkotlin/time/Duration;FLa51/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lz41/f;

    iget-object v4, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v4}, Lc51/n;->l()Lc51/x;

    move-result-object v4

    invoke-virtual {v4}, Lc51/x;->d()Ld51/d;

    move-result-object v4

    invoke-virtual {v4, v1, v2}, Ld51/d;->c(D)D

    move-result-wide v4

    double-to-float v4, v4

    sget-object v5, Ld0/b0;->c:Lb23/h;

    new-instance v6, Li93/e;

    const/high16 v8, 0x3f800000    # 1.0f

    move-object/from16 v23, v7

    const/high16 v7, 0x40900000    # 4.5f

    invoke-direct {v6, v8, v7}, Li93/e;-><init>(FF)V

    const v7, 0x3e3851ec    # 0.18f

    invoke-direct {v12, v7, v4, v5, v6}, Lz41/f;-><init>(FFLd0/z;Li93/f;)V

    iget-object v4, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v4}, Lc51/n;->l()Lc51/x;

    move-result-object v4

    invoke-virtual {v4}, Lc51/x;->i()Ld51/d;

    move-result-object v4

    invoke-virtual {v4, v1, v2}, Ld51/d;->c(D)D

    move-result-wide v4

    double-to-float v4, v4

    iget-object v5, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v5}, Lc51/n;->l()Lc51/x;

    move-result-object v5

    invoke-virtual {v5}, Lc51/x;->e()Ld51/d;

    move-result-object v5

    invoke-virtual {v5, v1, v2}, Ld51/d;->c(D)D

    move-result-wide v5

    double-to-float v5, v5

    new-instance v6, Lz41/g;

    const v26, 0x12a02

    const/16 v27, 0x0

    const/16 v7, 0x168

    const/4 v8, 0x0

    const/16 v17, 0x0

    const/high16 v18, 0x40000000    # 2.0f

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    move/from16 v20, v4

    move/from16 v25, v5

    invoke-direct/range {v6 .. v27}, Lz41/g;-><init>(IIFFFLz41/f;Ljava/util/List;Ljava/util/List;JZFLz41/k;FIFLa51/f;Lz41/k;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v4, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v4}, Lc51/n;->l()Lc51/x;

    move-result-object v4

    invoke-virtual {v4}, Lc51/x;->j()Ld51/d;

    move-result-object v4

    invoke-virtual {v4, v1, v2}, Ld51/d;->c(D)D

    move-result-wide v1

    double-to-float v1, v1

    invoke-direct {v3, v6, v1}, Lc51/m;-><init>(Lz41/g;F)V

    return-object v3
.end method

.method private final getAmoebaTextViewState(Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;)Lc51/o;
    .locals 12

    invoke-virtual {p1}, Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;->isOnboarding()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;->getWhoopAgeAmoeba()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->getAgeSubtitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->extractFirstNumber(Ljava/lang/String;)Ll83/k;

    move-result-object v0

    iget-object v1, v0, Ll83/k;->w:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Ljava/lang/String;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    invoke-virtual {p1}, Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;->getWhoopAgeAmoeba()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->getAgeValueDisplay()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;->getWhoopAgeAmoeba()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->getAgeTitleDisplay()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;->getWhoopAgeAmoeba()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->getAgeSubtitleStyle()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaTextStyleToWhoopColor(Ljava/lang/String;)Ly81/f;

    move-result-object v7

    new-instance v2, Lc51/o;

    const/16 v10, 0x60

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v11}, Lc51/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Lb91/c;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method private final getBlendedColors(DZLc51/n;)Ll83/k;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DZ",
            "Lc51/n;",
            ")",
            "Ll83/k;"
        }
    .end annotation

    if-eqz p3, :cond_0

    invoke-virtual {p4}, Lc51/n;->i()Ll83/k;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p3, p0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {p3}, Lc51/n;->f()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    int-to-double p3, p3

    mul-double/2addr p1, p3

    double-to-int p3, p1

    new-instance p4, Li93/j;

    iget-object v0, p0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v0}, Lc51/n;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    invoke-direct {p4, v2, v0, v1}, Li93/h;-><init>(III)V

    invoke-static {p3, p4}, Le93/b;->o(ILi93/g;)I

    move-result p3

    invoke-static {p1, p2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    invoke-static {v3, v4}, Le93/b;->W(D)I

    move-result p4

    new-instance v0, Li93/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v3}, Lc51/n;->f()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-direct {v0, v2, v3, v1}, Li93/h;-><init>(III)V

    invoke-static {p4, v0}, Le93/b;->o(ILi93/g;)I

    move-result p4

    iget-object v0, p0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v0}, Lc51/n;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll83/k;

    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v1}, Lc51/n;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll83/k;

    int-to-double v1, p3

    sub-double v8, p1, v1

    new-instance p1, Ll83/k;

    iget-object p2, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast p2, Li2/x;

    iget-wide v4, p2, Li2/x;->a:J

    iget-object p2, p4, Ll83/k;->w:Ljava/lang/Object;

    check-cast p2, Li2/x;

    iget-wide v6, p2, Li2/x;->a:J

    move-object v3, p0

    invoke-direct/range {v3 .. v9}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->blendColors-2_19RoU(JJD)J

    move-result-wide p2

    new-instance v1, Li2/x;

    invoke-direct {v1, p2, p3}, Li2/x;-><init>(J)V

    iget-object p2, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast p2, Li2/x;

    iget-wide v4, p2, Li2/x;->a:J

    iget-object p2, p4, Ll83/k;->x:Ljava/lang/Object;

    check-cast p2, Li2/x;

    iget-wide v6, p2, Li2/x;->a:J

    invoke-direct/range {v3 .. v9}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->blendColors-2_19RoU(JJD)J

    move-result-wide p2

    new-instance p4, Li2/x;

    invoke-direct {p4, p2, p3}, Li2/x;-><init>(J)V

    invoke-direct {p1, v1, p4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method private final getCenterShadowBrush(D)Li2/t;
    .locals 6

    sget-object v0, Li2/t;->b:Li2/s;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-object v2, p0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v2}, Lc51/n;->e()Lc51/t;

    move-result-object v2

    invoke-virtual {v2}, Lc51/t;->a()J

    move-result-wide v2

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v1, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v1}, Lc51/n;->e()Lc51/t;

    move-result-object v1

    invoke-virtual {v1}, Lc51/t;->b()Ld51/d;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ld51/d;->c(D)D

    move-result-wide v3

    double-to-float v1, v3

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-object v3, p0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v3}, Lc51/n;->e()Lc51/t;

    move-result-object v3

    invoke-virtual {v3}, Lc51/t;->a()J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v1}, Lc51/n;->e()Lc51/t;

    move-result-object v1

    invoke-virtual {v1}, Lc51/t;->c()Ld51/d;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ld51/d;->c(D)D

    move-result-wide p1

    double-to-float p1, p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p2}, Li2/w0;->c(I)J

    move-result-wide v4

    new-instance p2, Li2/x;

    invoke-direct {p2, v4, v5}, Li2/x;-><init>(J)V

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3, v1}, [Ll83/k;

    move-result-object v1

    const/4 v4, 0x0

    const/16 v5, 0xe

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v5}, Li2/s;->h(Li2/s;[Ll83/k;JFI)Li2/u0;

    move-result-object p1

    return-object p1
.end method

.method private final getEmitterAnimationConfig(Lc51/p;D)La51/d;
    .locals 17

    move-object/from16 v0, p0

    const/high16 v1, -0x3fe00000    # -2.5f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    new-instance v4, La51/d;

    new-instance v5, La51/g;

    new-instance v6, Lz41/k$b;

    const-wide/high16 v7, 0x3fe0000000000000L    # 0.5

    invoke-direct {v6, v7, v8, v7, v8}, Lz41/k$b;-><init>(DD)V

    new-instance v9, La51/c;

    iget-object v7, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v7}, Lc51/n;->o()Lc51/q;

    move-result-object v7

    invoke-virtual {v7}, Lc51/q;->b()J

    move-result-wide v7

    sget-object v10, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v7, v8, v10}, Lkotlin/time/Duration;->toDouble-impl(JLkotlin/time/DurationUnit;)D

    move-result-wide v7

    double-to-float v7, v7

    const v8, 0x3f866666    # 1.05f

    mul-float/2addr v7, v8

    new-instance v11, Li93/e;

    const/4 v8, 0x0

    invoke-direct {v11, v8, v7}, Li93/e;-><init>(FF)V

    new-instance v12, Ld51/d;

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    const/high16 v13, 0x3f000000    # 0.5f

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    new-instance v14, Ll83/k;

    invoke-direct {v14, v7, v13}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v7, 0x3f70a3d7    # 0.94f

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    new-instance v13, Ll83/k;

    invoke-direct {v13, v7, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v7, 0x3f733333    # 0.95f

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    new-instance v15, Ll83/k;

    invoke-direct {v15, v7, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Ll83/k;

    invoke-direct {v7, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v14, v13, v15, v7}, [Ll83/k;

    move-result-object v1

    const/4 v2, 0x2

    invoke-direct {v12, v1, v3, v2, v3}, Ld51/d;-><init>([Ll83/k;Ld0/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v14, 0x8

    const/4 v15, 0x0

    move-object v1, v10

    const/high16 v10, 0x3f800000    # 1.0f

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, La51/c;-><init>(FLi93/f;Ld51/d;Ld0/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v5, v6, v9}, La51/g;-><init>(Lz41/k;La51/c;)V

    new-instance v10, La51/c;

    iget-object v2, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v2}, Lc51/n;->e()Lc51/t;

    move-result-object v2

    invoke-virtual {v2}, Lc51/t;->b()Ld51/d;

    move-result-object v2

    move-wide/from16 v6, p2

    double-to-float v3, v6

    invoke-virtual {v2, v3}, Ld51/d;->d(F)F

    move-result v2

    const/16 v3, 0x258

    int-to-float v3, v3

    mul-float v11, v2, v3

    iget-object v2, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v2}, Lc51/n;->o()Lc51/q;

    move-result-object v2

    invoke-virtual {v2}, Lc51/q;->b()J

    move-result-wide v2

    invoke-static {v2, v3, v1}, Lkotlin/time/Duration;->toDouble-impl(JLkotlin/time/DurationUnit;)D

    move-result-wide v1

    double-to-float v1, v1

    new-instance v12, Li93/e;

    invoke-direct {v12, v8, v1}, Li93/e;-><init>(FF)V

    const/16 v15, 0xc

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v16}, La51/c;-><init>(FLi93/f;Ld51/d;Ld0/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v4, v5, v10}, La51/d;-><init>(La51/g;La51/c;)V

    return-object v4

    :cond_0
    return-object v3
.end method

.method private final getStyleFromColor(Ly81/f;)Ljava/lang/String;
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->textStyleMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly81/f;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, Ljava/util/Map$Entry;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc51/b0;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v2
.end method


# virtual methods
.method public final amoebaTextStyleToWhoopColor(Ljava/lang/String;)Ly81/f;
    .locals 6

    const-string v0, "textStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc51/b0;->NEUTRAL:Lc51/b0;

    invoke-static {}, Lc51/b0;->values()[Lc51/b0;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, v4

    :goto_2
    sget-object p1, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->textStyleMap:Ljava/util/Map;

    sget-object v1, Ly81/f;->HEALTH_NEUTRAL:Ly81/f;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly81/f;

    return-object p1
.end method

.method public final extractFirstNumber(Ljava/lang/String;)Ll83/k;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ll83/k;"
        }
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "[+-]?(\\d+(\\.\\d+)?|\\.\\d+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v1, "compile(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v1, "matcher(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Lva3/g;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lyb3/n;->c()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lyb3/n;->b()Li93/j;

    move-result-object v0

    const-string v2, "range"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v2, v0, Li93/h;->w:I

    iget v0, v0, Li93/h;->x:I

    add-int/lit8 v0, v0, 0x1

    invoke-static {v2, v0, p1}, Lyb3/r;->r0(IILjava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p1, v0

    :cond_2
    :goto_1
    new-instance v0, Ll83/k;

    invoke-direct {v0, p1, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final getTransitionViewState(Lc51/p;Z)Lc51/r;
    .locals 12

    if-eqz p1, :cond_1

    new-instance v0, Lc51/r;

    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v1}, Lc51/n;->o()Lc51/q;

    move-result-object v1

    invoke-virtual {v1}, Lc51/q;->b()J

    move-result-wide v2

    iget-object v1, p0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v1}, Lc51/n;->o()Lc51/q;

    move-result-object v1

    invoke-virtual {v1}, Lc51/q;->c()J

    move-result-wide v4

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {p2}, Lc51/n;->o()Lc51/q;

    move-result-object p2

    invoke-virtual {p2}, Lc51/q;->f()J

    move-result-wide v6

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {p2}, Lc51/n;->o()Lc51/q;

    move-result-object p2

    invoke-virtual {p2}, Lc51/q;->d()J

    move-result-wide v6

    :goto_0
    iget-object p2, p0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {p2}, Lc51/n;->o()Lc51/q;

    move-result-object p2

    invoke-virtual {p2}, Lc51/q;->e()F

    move-result v8

    iget-object p2, p0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {p2}, Lc51/n;->o()Lc51/q;

    move-result-object p2

    invoke-virtual {p2}, Lc51/q;->a()J

    move-result-wide v9

    const/4 v11, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v11}, Lc51/r;-><init>(Lc51/p;JJJFJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final reduce(Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult;)Lc51/s;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "domainResult"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;

    if-eqz v2, :cond_4

    check-cast v1, Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;->getWhoopAgeAmoeba()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->getStyleValues()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;->getPaceOfAgingAnimationScore()D

    move-result-wide v7

    invoke-virtual {v1}, Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;->getWhoopAgeAmoeba()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->getStyleValues()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;->getYearsDifferenceAnimationScore()D

    move-result-wide v9

    invoke-virtual {v1}, Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;->getPreviousWhoopAgeAmoeba()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;->getPlayTransition()Lc51/p;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;->getPreviousWhoopAgeAmoeba()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->getStyleValues()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;->getYearsDifference()D

    move-result-wide v3

    goto :goto_1

    :cond_1
    const-wide/16 v3, 0x0

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;->getWhoopAgeAmoeba()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->getStyleValues()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;->getYearsDifference()D

    move-result-wide v5

    cmpl-double v3, v3, v5

    const/4 v5, 0x1

    if-lez v3, :cond_2

    move v3, v5

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    invoke-virtual {v0, v2, v3}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->getTransitionViewState(Lc51/p;Z)Lc51/r;

    move-result-object v18

    invoke-direct {v0, v2, v7, v8}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->getEmitterAnimationConfig(Lc51/p;D)La51/d;

    move-result-object v2

    iget-object v3, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v3}, Lc51/n;->n()F

    move-result v3

    iget-object v6, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v6}, Lc51/n;->k()F

    move-result v6

    iget-object v11, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v11}, Lc51/n;->h()F

    move-result v11

    iget-object v12, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v12}, Lc51/n;->g()Lc51/e;

    move-result-object v15

    iget-object v12, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-virtual {v12}, Lc51/n;->m()Lc51/y;

    move-result-object v16

    invoke-virtual {v1}, Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;->isOnboarding()Z

    move-result v12

    iget-object v13, v0, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->amoebaSettings:Lc51/n;

    invoke-direct {v0, v9, v10, v12, v13}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->getBlendedColors(DZLc51/n;)Ll83/k;

    move-result-object v12

    invoke-direct {v0, v7, v8}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->getAmoebaOutlineViewState(D)Lc51/l;

    move-result-object v13

    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1f

    if-ge v14, v4, :cond_3

    move v14, v5

    goto :goto_3

    :cond_3
    const/4 v14, 0x0

    :goto_3
    invoke-direct {v0, v7, v8, v2}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->getAmoebaParticleViewState(DLa51/d;)Lc51/m;

    move-result-object v17

    move v5, v6

    move v6, v11

    move-object v11, v12

    invoke-direct {v0, v7, v8}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->getCenterShadowBrush(D)Li2/t;

    move-result-object v12

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->getAmoebaTextViewState(Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;)Lc51/o;

    move-result-object v19

    move v4, v3

    new-instance v3, Lc51/s;

    const/16 v20, 0x0

    invoke-direct/range {v3 .. v20}, Lc51/s;-><init>(FFFDDLl83/k;Li2/t;Lc51/l;ZLc51/e;Lc51/y;Lc51/m;Lc51/r;Lc51/o;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_4
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public final toWhoopAgeAmoeba(Lc51/s;)Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;
    .locals 13

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;

    invoke-virtual {p1}, Lc51/s;->k()D

    move-result-wide v4

    invoke-virtual {p1}, Lc51/s;->t()D

    move-result-wide v6

    invoke-virtual {p1}, Lc51/s;->t()D

    move-result-wide v8

    invoke-virtual {p1}, Lc51/s;->k()D

    move-result-wide v10

    const-wide/16 v2, 0x0

    invoke-direct/range {v1 .. v11}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;-><init>(DDDDD)V

    invoke-virtual {p1}, Lc51/s;->o()Lc51/o;

    move-result-object v0

    const-string v2, ""

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lc51/o;->f()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v0

    goto :goto_1

    :cond_1
    :goto_0
    move-object v3, v2

    :goto_1
    invoke-virtual {p1}, Lc51/s;->o()Lc51/o;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lc51/o;->e()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    move-object v4, v0

    goto :goto_3

    :cond_3
    :goto_2
    move-object v4, v2

    :goto_3
    invoke-virtual {p1}, Lc51/s;->o()Lc51/o;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lc51/o;->d()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    :cond_4
    move-object v0, v2

    :cond_5
    invoke-virtual {p1}, Lc51/s;->o()Lc51/o;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Lc51/o;->c()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_7

    :cond_6
    move-object v5, v2

    :cond_7
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lc51/s;->o()Lc51/o;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lc51/o;->i()Ly81/f;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-direct {p0, p1}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->getStyleFromColor(Ly81/f;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_8

    goto :goto_5

    :cond_8
    move-object v6, p1

    :goto_4
    move-object v2, v1

    goto :goto_6

    :cond_9
    :goto_5
    move-object v6, v2

    goto :goto_4

    :goto_6
    new-instance v1, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    const-string v11, ""

    const/4 v12, 0x0

    const-string v7, ""

    const-string v8, ""

    const-string v9, ""

    const-string v10, ""

    invoke-direct/range {v1 .. v12}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;-><init>(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v1
.end method
