.class public final Lj81/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u000f\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000c\u001a\u0004\u0008\u0010\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u000c\u001a\u0004\u0008\u0005\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u000c\u001a\u0004\u0008\u0014\u0010\u000eR\u0017\u0010\u0017\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u000c\u001a\u0004\u0008\u000b\u0010\u000eR\u0017\u0010\u001d\u001a\u00020\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010 \u001a\u00020\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001a\u001a\u0004\u0008\u001f\u0010\u001cR\u0017\u0010#\u001a\u00020\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u001a\u001a\u0004\u0008\"\u0010\u001c\u00a8\u0006$"
    }
    d2 = {
        "Lj81/h;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/navigation/e;",
        "b",
        "Lcom/whoop/navigation/e;",
        "getNavigationAction",
        "()Lcom/whoop/navigation/e;",
        "navigationAction",
        "Lj81/i;",
        "c",
        "Lj81/i;",
        "d",
        "()Lj81/i;",
        "fakeStrainGauge",
        "e",
        "fakeStrainTargetReachedGauge",
        "fakeRecoveryGauge",
        "f",
        "a",
        "fakeRecoveryEmptyGauge",
        "g",
        "fakeSleepGauge",
        "Lj81/c;",
        "h",
        "Lj81/c;",
        "getFakeStrainCircularDialState",
        "()Lj81/c;",
        "fakeStrainCircularDialState",
        "i",
        "getFakeRecoveryCircularDialState",
        "fakeRecoveryCircularDialState",
        "j",
        "getFakeSleepCircularDialState",
        "fakeSleepCircularDialState",
        "design_release"
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
.field public static final a:Lj81/h;

.field private static final b:Lcom/whoop/navigation/e;

.field private static final c:Lj81/i;

.field private static final d:Lj81/i;

.field private static final e:Lj81/i;

.field private static final f:Lj81/i;

.field private static final g:Lj81/i;

.field private static final h:Lj81/c;

.field private static final i:Lj81/c;

.field private static final j:Lj81/c;

.field public static final k:I


# direct methods
.method static constructor <clinit>()V
    .locals 46

    new-instance v0, Lj81/h;

    invoke-direct {v0}, Lj81/h;-><init>()V

    sput-object v0, Lj81/h;->a:Lj81/h;

    new-instance v17, Lcom/whoop/navigation/e;

    sget-object v2, Lcom/whoop/navigation/AppScreen$a6;->w:Lcom/whoop/navigation/AppScreen$a6;

    new-instance v3, Lcom/whoop/navigation/TrendsScreenModel;

    const/16 v10, 0x38

    const/4 v11, 0x0

    const-string v4, "HR_ZONES_1_3"

    const/4 v5, 0x0

    const-string v6, "2024-11-27"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lcom/whoop/navigation/TrendsScreenModel;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, v17

    invoke-direct/range {v1 .. v6}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v17, Lj81/h;->b:Lcom/whoop/navigation/e;

    const-string v0, "14.2"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const-string v1, "STRAIN"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget-object v1, Lj81/h$g;->w:Lj81/h$g;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    invoke-static {v1}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v11

    sget-object v18, Ly81/f;->BRAND_WHITE:Ly81/f;

    new-instance v1, Lj81/i;

    const v2, 0x3f4ccccd    # 0.8f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    const v2, 0x3ecccccd    # 0.4f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    const v2, 0x3f333333    # 0.7f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    const v21, 0x67800

    const/16 v22, 0x0

    const-string v2, "STRAIN_SCORE_GAUGE"

    const-string v3, "StrainScoreGauge"

    const v8, 0x3f4ccccd    # 0.8f

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v1 .. v22}, Lj81/i;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;FLjava/lang/Float;Ljava/lang/Float;Li91/a;Ljava/util/List;FFFZLcom/whoop/navigation/e;Ly81/f;Ly81/f;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lj81/h;->c:Lj81/i;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const-string v0, "TARGET REACHED"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget-object v0, Lj81/h$h;->w:Lj81/h$h;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    invoke-static {v0}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v11

    sget-object v19, Ly81/f;->ACCENT_ACTION:Ly81/f;

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-static {v0}, Lb9/y;->c(Lx81/d;)I

    move-result v0

    new-instance v1, Lj81/i;

    const v2, 0x3f2bc6a8    # 0.671f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v20

    const/16 v21, 0x7800

    const-string v2, "STRAIN_SCORE_GAUGE"

    const-string v3, "StrainScoreGauge"

    const v8, 0x3f2d0e56    # 0.676f

    invoke-direct/range {v1 .. v22}, Lj81/i;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;FLjava/lang/Float;Ljava/lang/Float;Li91/a;Ljava/util/List;FFFZLcom/whoop/navigation/e;Ly81/f;Ly81/f;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lj81/h;->d:Lj81/i;

    const-string v0, "85"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const-string v0, "%"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const-string v23, "RECOVERY"

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget-object v1, Lj81/h$c;->w:Lj81/h$c;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    invoke-static {v1}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v11

    new-instance v1, Lj81/i;

    const v21, 0x67800

    const-string v2, "RECOVERY_SCORE_GAUGE"

    const-string v3, "RecoveryScoreGauge"

    const/4 v7, 0x0

    const v8, 0x3f59999a    # 0.85f

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v1 .. v22}, Lj81/i;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;FLjava/lang/Float;Ljava/lang/Float;Li91/a;Ljava/util/List;FFFZLcom/whoop/navigation/e;Ly81/f;Ly81/f;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lj81/h;->e:Lj81/i;

    const-string v1, "--"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v27

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v28

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v29

    sget-object v1, Lj81/h$b;->w:Lj81/h$b;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    invoke-static {v1}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v34

    sget-object v41, Ly81/f;->WHITE_20:Ly81/f;

    new-instance v24, Lj81/i;

    const v44, 0x67800

    const/16 v45, 0x0

    const-string v25, "RECOVERY_SCORE_GAUGE"

    const-string v26, "RecoveryScoreGauge"

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    invoke-direct/range {v24 .. v45}, Lj81/i;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;FLjava/lang/Float;Ljava/lang/Float;Li91/a;Ljava/util/List;FFFZLcom/whoop/navigation/e;Ly81/f;Ly81/f;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v24, Lj81/h;->f:Lj81/i;

    const-string v1, "74"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const-string v0, "SLEEP PERFORMANCE"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget-object v0, Lj81/h$e;->w:Lj81/h$e;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    invoke-static {v0}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v11

    sget-object v0, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    sget-object v1, Ly81/f;->WHITE_50:Ly81/f;

    sget-object v2, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    filled-new-array {v0, v1, v2}, [Ly81/f;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    new-instance v1, Lj81/i;

    const-string v2, "SLEEP_SCORE_GAUGE"

    const-string v3, "SleepScoreGauge"

    const v8, 0x3f3d70a4    # 0.74f

    invoke-direct/range {v1 .. v22}, Lj81/i;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;FLjava/lang/Float;Ljava/lang/Float;Li91/a;Ljava/util/List;FFFZLcom/whoop/navigation/e;Ly81/f;Ly81/f;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lj81/h;->g:Lj81/i;

    const/16 v0, 0x16

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float v3, v0, v1

    sget-object v0, Lj81/h$f;->w:Lj81/h$f;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    invoke-static {v0}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v5

    const/4 v0, 0x6

    int-to-float v10, v0

    new-instance v2, Lj81/c;

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    const v0, 0x3e99999a    # 0.3f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    const v0, 0x3f19999a    # 0.6f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    const/16 v14, 0x740

    const/4 v15, 0x0

    const v4, 0x3e4ccccd    # 0.2f

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v2 .. v15}, Lj81/c;-><init>(FFLi91/a;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;ZFFLy81/f;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lj81/h;->h:Lj81/c;

    new-instance v2, Lj81/c;

    sget-object v0, Lj81/h$a;->w:Lj81/h$a;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    invoke-static {v0}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v5

    const/16 v14, 0x778

    const v4, 0x3f333333    # 0.7f

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v15}, Lj81/c;-><init>(FFLi91/a;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;ZFFLy81/f;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lj81/h;->i:Lj81/c;

    new-instance v2, Lj81/c;

    sget-object v0, Lj81/h$d;->w:Lj81/h$d;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    invoke-static {v0}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v5

    const v4, 0x3f4ccccd    # 0.8f

    invoke-direct/range {v2 .. v15}, Lj81/c;-><init>(FFLi91/a;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;ZFFLy81/f;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lj81/h;->j:Lj81/c;

    const/16 v0, 0x8

    sput v0, Lj81/h;->k:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lj81/i;
    .locals 1

    sget-object v0, Lj81/h;->f:Lj81/i;

    return-object v0
.end method

.method public final b()Lj81/i;
    .locals 1

    sget-object v0, Lj81/h;->e:Lj81/i;

    return-object v0
.end method

.method public final c()Lj81/i;
    .locals 1

    sget-object v0, Lj81/h;->g:Lj81/i;

    return-object v0
.end method

.method public final d()Lj81/i;
    .locals 1

    sget-object v0, Lj81/h;->c:Lj81/i;

    return-object v0
.end method

.method public final e()Lj81/i;
    .locals 1

    sget-object v0, Lj81/h;->d:Lj81/i;

    return-object v0
.end method
