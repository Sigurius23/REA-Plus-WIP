.class public final Lmu2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnd1/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmu2/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R \u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "Lmu2/f;",
        "Lnd1/j;",
        "<init>",
        "()V",
        "Ltf3/a;",
        "define",
        "()Ltf3/a;",
        "",
        "Lv82/a;",
        "a",
        "Ljava/util/List;",
        "getDependencies",
        "()Ljava/util/List;",
        "dependencies",
        "b",
        "weightlifting_release"
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
.field public static final b:Lmu2/f$a;

.field public static final c:I


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lv82/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmu2/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmu2/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmu2/f;->b:Lmu2/f$a;

    const/16 v0, 0x8

    sput v0, Lmu2/f;->c:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lb9/y;->u()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lmu2/f;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic A(Lxf3/c;Luf3/a;)Lnu2/f;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->M0(Lxf3/c;Luf3/a;)Lnu2/f;

    move-result-object p0

    return-object p0
.end method

.method private static final A0(Lxf3/c;Luf3/a;)Ldv2/f;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ldv2/f;

    const-class v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-direct {p1, p0}, Ldv2/f;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-object p1
.end method

.method public static synthetic B(Lxf3/c;Luf3/a;)Lzu2/d;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->w0(Lxf3/c;Luf3/a;)Lzu2/d;

    move-result-object p0

    return-object p0
.end method

.method private static final B0(Lxf3/c;Luf3/a;)Ldv2/c;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ldv2/c;

    invoke-direct {p0}, Ldv2/c;-><init>()V

    return-object p0
.end method

.method public static synthetic C(Lxf3/c;Luf3/a;)Lqi0/a;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->e1(Lxf3/c;Luf3/a;)Lqi0/a;

    move-result-object p0

    return-object p0
.end method

.method private static final C0(Lxf3/c;Luf3/a;)Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;

    const-class v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;-><init>(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public static synthetic D(Lxf3/c;Luf3/a;)Lu82/a;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->f1(Lxf3/c;Luf3/a;)Lu82/a;

    move-result-object p0

    return-object p0
.end method

.method private static final D0(Lxf3/c;Luf3/a;)Lnv2/d;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lnv2/d;

    invoke-direct {p0}, Lnv2/d;-><init>()V

    return-object p0
.end method

.method public static synthetic E(Lxf3/c;Luf3/a;)Llf1/m;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->q0(Lxf3/c;Luf3/a;)Llf1/m;

    move-result-object p0

    return-object p0
.end method

.method private static final E0(Lxf3/c;Luf3/a;)Llv2/a;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Llv2/a;

    const-class v0, Lfi0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfi0/a;

    invoke-direct {p1, p0}, Llv2/a;-><init>(Lfi0/a;)V

    return-object p1
.end method

.method public static synthetic F(Lxf3/c;Luf3/a;)Lpu2/d;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->Q0(Lxf3/c;Luf3/a;)Lpu2/d;

    move-result-object p0

    return-object p0
.end method

.method private static final F0(Lxf3/c;Luf3/a;)Lnv2/b;
    .locals 7

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lnv2/b;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;

    const-class v3, Lnv2/d;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lnv2/d;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lnv2/b;-><init>(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;Lnv2/d;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic G(Lxf3/c;Luf3/a;)Lfv2/d;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->o1(Lxf3/c;Luf3/a;)Lfv2/d;

    move-result-object p0

    return-object p0
.end method

.method private static final G0(Lxf3/c;Luf3/a;)Lwu2/c;
    .locals 10

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lwu2/c;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lfu2/i;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfu2/i;

    const-class v3, Lfu2/d;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfu2/d;

    const-class v4, Lcom/whoop/weightlifting/data/WeightliftingApi;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/weightlifting/data/WeightliftingApi;

    const-class v5, Lrr2/c;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lrr2/c;

    const-class v5, Lfi0/a;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Lfi0/a;

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v9}, Lwu2/c;-><init>(Lfu2/i;Lfu2/d;Lcom/whoop/weightlifting/data/WeightliftingApi;Ltr2/n;Lrr2/c;Lfi0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic H(Lxf3/c;Luf3/a;)Liv2/d;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->X0(Lxf3/c;Luf3/a;)Liv2/d;

    move-result-object p0

    return-object p0
.end method

.method private static final H0(Lxf3/c;Luf3/a;)Lfu2/d;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lfu2/d;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lz82/b;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lz82/b;

    const-class v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Lfu2/d;-><init>(Lor2/x1;Lz82/b;Lcom/whoop/data/repositories/FeatureFlagChecker;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic I(Lxf3/c;Luf3/a;)Ltv2/d;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->l1(Lxf3/c;Luf3/a;)Ltv2/d;

    move-result-object p0

    return-object p0
.end method

.method private static final I0(Lxf3/c;Luf3/a;)Lxu2/e;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lxu2/e;

    new-instance v0, Lvf3/c;

    const-string v1, "userContext"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lod1/u;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lod1/u;

    const-class v2, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-direct {p1, v0, p0}, Lxu2/e;-><init>(Lod1/u;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-object p1
.end method

.method public static synthetic J(Lxf3/c;Luf3/a;)Ldv2/c;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->B0(Lxf3/c;Luf3/a;)Ldv2/c;

    move-result-object p0

    return-object p0
.end method

.method private static final J0(Lxf3/c;Luf3/a;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;
    .locals 24

    move-object/from16 v0, p0

    const-string v1, "$this$factory"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lzr2/a;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lzr2/a;

    const-class v2, Lfu2/d;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lfu2/d;

    const-class v2, Liu2/b;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Liu2/b;

    const-class v2, Lcom/whoop/weightlifting/data/WeightliftingApi;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lcom/whoop/weightlifting/data/WeightliftingApi;

    const-class v2, Li92/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Li92/e;

    const-class v2, Lfu2/i;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Lfu2/i;

    const-class v2, Lwm0/a;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Lwm0/a;

    const-class v2, Lfi0/a;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Lfi0/a;

    new-instance v2, Lvf3/c;

    const-string v4, "mainPrefs"

    invoke-direct {v2, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lu92/d;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v0, v3, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Lu92/d;

    const-class v2, Lin2/d;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Lin2/d;

    const-class v2, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v2, Lmi1/d;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Lmi1/d;

    new-instance v2, Lvf3/c;

    const-string v4, "workManagerInstance"

    invoke-direct {v2, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lic/p0;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v0, v3, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Lic/p0;

    const-class v2, Llu2/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Llu2/e;

    const-class v2, Ldt0/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v20, v2

    check-cast v20, Ldt0/e;

    const-class v2, Llf1/m;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Llf1/m;

    new-instance v4, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    const/16 v22, 0x20

    const/16 v23, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v23}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;-><init>(Lzr2/a;Lfu2/d;Liu2/b;Lcom/whoop/weightlifting/data/WeightliftingApi;Li92/e;Ltr2/n;Lwm0/a;Lfu2/i;Lfi0/a;Lu92/d;Lin2/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Lmi1/d;Lic/p0;Llu2/e;Ldt0/e;Llf1/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method

.method public static synthetic K(Lxf3/c;Luf3/a;)Luu2/x;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->K0(Lxf3/c;Luf3/a;)Luu2/x;

    move-result-object p0

    return-object p0
.end method

.method private static final K0(Lxf3/c;Luf3/a;)Luu2/x;
    .locals 7

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Luu2/x;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lvu2/d;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvu2/d;

    const-class v3, Luu2/z;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Luu2/z;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Luu2/x;-><init>(Lvu2/d;Luu2/z;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic L(Lxf3/c;Luf3/a;)Lmu2/a;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->v1(Lxf3/c;Luf3/a;)Lmu2/a;

    move-result-object p0

    return-object p0
.end method

.method private static final L0(Lxf3/c;Luf3/a;)Lnu2/e;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lnu2/e;

    const-class v0, Lci2/b;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lci2/b;

    invoke-direct {p1, p0}, Lnu2/e;-><init>(Lci2/b;)V

    return-object p1
.end method

.method public static synthetic M(Lxf3/c;Luf3/a;)Lvu2/d;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->o0(Lxf3/c;Luf3/a;)Lvu2/d;

    move-result-object p0

    return-object p0
.end method

.method private static final M0(Lxf3/c;Luf3/a;)Lnu2/f;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lnu2/f;

    const-class v0, Lzr2/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzr2/a;

    invoke-direct {p1, p0}, Lnu2/f;-><init>(Lzr2/a;)V

    return-object p1
.end method

.method public static synthetic N(Lxf3/c;Luf3/a;)Lfu2/i;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->v0(Lxf3/c;Luf3/a;)Lfu2/i;

    move-result-object p0

    return-object p0
.end method

.method private static final N0(Lxf3/c;Luf3/a;)Lnu2/b;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lnu2/b;

    invoke-direct {p0}, Lnu2/b;-><init>()V

    return-object p0
.end method

.method public static synthetic O(Lxf3/c;Luf3/a;)Lmu2/c;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->s1(Lxf3/c;Luf3/a;)Lmu2/c;

    move-result-object p0

    return-object p0
.end method

.method private static final O0(Lxf3/c;Luf3/a;)Lpu2/i;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lpu2/i;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lzr2/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr2/a;

    new-instance v3, Lvf3/c;

    const-string v4, "userContext"

    invoke-direct {v3, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lod1/u;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lod1/u;

    const-class v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v5, Lz92/a;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lz92/a;

    const-class v6, Lpv2/b;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lpv2/b;

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lpu2/i;-><init>(Lzr2/a;Lod1/u;Lcom/whoop/data/repositories/FeatureFlagChecker;Lz92/a;Lpv2/b;)V

    return-object v1
.end method

.method public static synthetic P(Lxf3/c;Luf3/a;)Lnv2/b;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->F0(Lxf3/c;Luf3/a;)Lnv2/b;

    move-result-object p0

    return-object p0
.end method

.method private static final P0(Lxf3/c;Luf3/a;)Lou2/a;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lou2/a;

    invoke-direct {p0}, Lou2/a;-><init>()V

    return-object p0
.end method

.method public static synthetic Q(Lxf3/c;Luf3/a;)Lgv2/c;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->p1(Lxf3/c;Luf3/a;)Lgv2/c;

    move-result-object p0

    return-object p0
.end method

.method private static final Q0(Lxf3/c;Luf3/a;)Lpu2/d;
    .locals 3

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lpu2/d;

    new-instance v0, Lvf3/c;

    const-string v1, "userContext"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v1, Lod1/u;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lod1/u;

    invoke-direct {p1, p0}, Lpu2/d;-><init>(Lod1/u;)V

    return-object p1
.end method

.method public static synthetic R(Lad3/c;Lcd3/d;Lad3/g;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lmu2/f;->d1(Lad3/c;Lcd3/f;Lad3/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final R0(Lxf3/c;Luf3/a;)Liu2/b;
    .locals 19

    move-object/from16 v0, p0

    const-string v1, "$this$single"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lin2/d;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lin2/d;

    sget-object v2, Ltr2/n;->a:Ltr2/n$a;

    const-string v4, "WeightliftingRepository"

    invoke-virtual {v2, v4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v6

    const-class v2, Lcom/whoop/weightlifting/data/WeightliftingApi;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/whoop/weightlifting/data/WeightliftingApi;

    const-class v2, Lcom/whoop/service/network/ActivitiesApi;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lcom/whoop/service/network/ActivitiesApi;

    const-class v2, Lrr2/c;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lrr2/c;

    new-instance v2, Lvf3/c;

    const-string v4, "userContext"

    invoke-direct {v2, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lod1/u;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v0, v3, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lod1/u;

    new-instance v2, Lvf3/c;

    const-string v4, "mainPrefs"

    invoke-direct {v2, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lu92/d;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v0, v3, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Lu92/d;

    const-class v2, Lbc3/c0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Lbc3/c0;

    const-class v2, Llu2/d;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Llu2/d;

    const-class v2, Lfi0/a;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Lfi0/a;

    const-class v2, Landroid/content/Context;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Landroid/content/Context;

    const-class v2, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v2, Liu2/a;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Liu2/a;

    const-class v2, Lz92/a;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lz92/a;

    new-instance v4, Liu2/b;

    invoke-direct/range {v4 .. v18}, Liu2/b;-><init>(Lin2/d;Ltr2/n;Lcom/whoop/weightlifting/data/WeightliftingApi;Lcom/whoop/service/network/ActivitiesApi;Lrr2/c;Lod1/u;Lu92/d;Liu2/a;Lbc3/c0;Llu2/d;Lfi0/a;Landroid/content/Context;Lcom/whoop/data/repositories/FeatureFlagChecker;Lz92/a;)V

    return-object v4
.end method

.method public static synthetic S(Lxf3/c;Luf3/a;)Llu2/d;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->i1(Lxf3/c;Luf3/a;)Llu2/d;

    move-result-object p0

    return-object p0
.end method

.method private static final S0(Lxf3/c;Luf3/a;)Llu2/e;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Llu2/e;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Llu2/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llu2/d;

    const-class v3, Lrr2/c;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lrr2/c;

    invoke-direct {p1, v1, p0}, Llu2/e;-><init>(Llu2/d;Lrr2/c;)V

    return-object p1
.end method

.method public static synthetic T(Lxf3/c;Luf3/a;)Luv2/b;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->t0(Lxf3/c;Luf3/a;)Luv2/b;

    move-result-object p0

    return-object p0
.end method

.method private static final T0(Lxf3/c;Luf3/a;)Lfu2/f;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lfu2/f;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Liu2/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Liu2/a;

    new-instance v3, Lvf3/c;

    const-string v4, "mainPrefs"

    invoke-direct {v3, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lu92/d;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lu92/d;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "StrainStartupHandler"

    invoke-virtual {v0, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    invoke-direct {p1, v1, p0, v0}, Lfu2/f;-><init>(Liu2/a;Lu92/d;Ltr2/n;)V

    return-object p1
.end method

.method public static synthetic U(Lxf3/c;Luf3/a;)Lxu2/e;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->I0(Lxf3/c;Luf3/a;)Lxu2/e;

    move-result-object p0

    return-object p0
.end method

.method private static final U0(Lxf3/c;Luf3/a;)Lqv2/e;
    .locals 10

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/weightlifting/data/WeightliftingApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/whoop/weightlifting/data/WeightliftingApi;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "WorkoutLibraryInteractor"

    invoke-virtual {v0, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v5

    const-class v0, Lfu2/i;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lfu2/i;

    new-instance v0, Lvf3/c;

    const-string v2, "workManagerInstance"

    invoke-direct {v0, v2}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v2, Lic/p0;

    invoke-virtual {p1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lic/p0;

    const-class v0, Lfi0/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lfi0/a;

    const-class v0, Llf1/f;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Llf1/f;

    const-class v0, Lzr2/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v9, p0

    check-cast v9, Lzr2/a;

    new-instance v2, Lqv2/e;

    invoke-direct/range {v2 .. v9}, Lqv2/e;-><init>(Lfu2/i;Lcom/whoop/weightlifting/data/WeightliftingApi;Ltr2/n;Lic/p0;Lfi0/a;Llf1/f;Lzr2/a;)V

    return-object v2
.end method

.method public static synthetic V(Lxf3/c;Luf3/a;)Lrv2/g;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->r0(Lxf3/c;Luf3/a;)Lrv2/g;

    move-result-object p0

    return-object p0
.end method

.method private static final V0(Lxf3/c;Luf3/a;)Lcu2/t;
    .locals 5

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcu2/t;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ln92/e;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln92/e;

    const-class v3, Liu2/b;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Liu2/b;

    const-class v4, Llf1/f;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Llf1/f;

    invoke-direct {p1, v1, v3, p0}, Lcu2/t;-><init>(Ln92/e;Liu2/b;Llf1/f;)V

    return-object p1
.end method

.method public static synthetic W(Lxf3/c;Luf3/a;)Lou2/a;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->P0(Lxf3/c;Luf3/a;)Lou2/a;

    move-result-object p0

    return-object p0
.end method

.method private static final W0(Lxf3/c;Luf3/a;)Lrv2/e;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lrv2/e;

    invoke-direct {p0}, Lrv2/e;-><init>()V

    return-object p0
.end method

.method public static synthetic X(Lxf3/c;Luf3/a;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->J0(Lxf3/c;Luf3/a;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    move-result-object p0

    return-object p0
.end method

.method private static final X0(Lxf3/c;Luf3/a;)Liv2/d;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Liv2/d;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lfu2/i;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfu2/i;

    const-class v3, Lcom/whoop/weightlifting/data/WeightliftingApi;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/weightlifting/data/WeightliftingApi;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "WorkoutDetailsInteractor"

    invoke-virtual {v0, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    invoke-direct {p1, v1, p0, v0}, Liv2/d;-><init>(Lfu2/i;Lcom/whoop/weightlifting/data/WeightliftingApi;Ltr2/n;)V

    return-object p1
.end method

.method public static synthetic Y(Lxf3/c;Luf3/a;)Lnu2/b;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->N0(Lxf3/c;Luf3/a;)Lnu2/b;

    move-result-object p0

    return-object p0
.end method

.method private static final Y0(Lxf3/c;Luf3/a;)Ljv2/d;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljv2/d;

    const-class v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-direct {p1, p0}, Ljv2/d;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-object p1
.end method

.method public static synthetic Z(Ljava/util/List;)Lwc3/c;
    .locals 0

    invoke-static {p0}, Lmu2/f;->c1(Ljava/util/List;)Lwc3/c;

    move-result-object p0

    return-object p0
.end method

.method private static final Z0(Lxf3/c;Luf3/a;)Lcom/google/gson/Gson;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class p1, Lcom/whoop/exerciseprogressminiarch/domain/models/ArchMiniExerciseProgress;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v0, Ll83/k;

    const-string v1, "MINI_ARCH_EXERCISE_PROGRESS"

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/personalrecords/miniarch/domain/models/ArchMiniPersonalRecords;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v1, Ll83/k;

    const-string v2, "MINI_ARCH_ALL_PRS"

    invoke-direct {v1, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecords;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v2, Ll83/k;

    const-string v3, "MINI_ARCH_EXERCISE_RECORDS"

    invoke-direct {v2, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    new-instance p1, Ll83/k;

    const-string v3, "EXERCISE_INSTRUCTIONS"

    invoke-direct {p1, v3, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, v2, p1}, [Ll83/k;

    move-result-object p0

    invoke-static {p0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p0

    new-instance p1, Lcom/google/gson/GsonBuilder;

    invoke-direct {p1}, Lcom/google/gson/GsonBuilder;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, p0, v0, v1, v0}, Lcom/whoop/design/json/d;->f(Lcom/google/gson/GsonBuilder;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object p0

    const-string p1, "create(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic a(Lxf3/c;Luf3/a;)Luu2/a0;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->n0(Lxf3/c;Luf3/a;)Luu2/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a0(Lxf3/c;Luf3/a;)Lnv2/d;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->D0(Lxf3/c;Luf3/a;)Lnv2/d;

    move-result-object p0

    return-object p0
.end method

.method private static final a1(Lxf3/c;Luf3/a;)Lad3/c;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/exerciseprogressminiarch/domain/models/ArchMiniExerciseProgress;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "MINI_ARCH_EXERCISE_PROGRESS"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v0, Lcom/whoop/personalrecords/miniarch/domain/models/ArchMiniPersonalRecords;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v2, Ll83/k;

    const-string v3, "MINI_ARCH_ALL_PRS"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecords;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v3, Ll83/k;

    const-string v4, "MINI_ARCH_EXERCISE_RECORDS"

    invoke-direct {v3, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v4, Ll83/k;

    const-string v5, "EXERCISE_INSTRUCTIONS"

    invoke-direct {v4, v5, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2, v3, v4}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v2

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/json/b;->e(Lxf3/c;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Liy1/c;Lrr2/c;ILjava/lang/Object;)Lad3/c;

    move-result-object p0

    new-instance v0, Lcd3/g;

    invoke-direct {v0}, Lcd3/g;-><init>()V

    const-class v1, Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;

    invoke-virtual {p1, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lmm1/h;

    const/16 v3, 0x19

    invoke-direct {v2, v3}, Lmm1/h;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Lcd3/g;->o(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    const-class v1, Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    invoke-virtual {p1, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v1, Lmm1/h;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, Lmm1/h;-><init>(I)V

    invoke-virtual {v0, p1, v1}, Lcd3/g;->o(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lcd3/g;->r()Lcd3/d;

    move-result-object p1

    new-instance v0, Liq2/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Liq2/a;-><init>(Lad3/c;Lcd3/d;I)V

    invoke-static {p0, v0}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/util/List;)Lwc3/c;
    .locals 0

    invoke-static {p0}, Lmu2/f;->b1(Ljava/util/List;)Lwc3/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b0(Lxf3/c;Luf3/a;)Lad3/c;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->a1(Lxf3/c;Luf3/a;)Lad3/c;

    move-result-object p0

    return-object p0
.end method

.method private static final b1(Ljava/util/List;)Lwc3/c;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;->Unknown:Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;

    invoke-static {p0}, Lu82/j;->a(Ljava/lang/Enum;)Lwc3/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lxf3/c;Luf3/a;)Llf1/f;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->p0(Lxf3/c;Luf3/a;)Llf1/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c0(Lxf3/c;Luf3/a;)Lcu2/t;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->V0(Lxf3/c;Luf3/a;)Lcu2/t;

    move-result-object p0

    return-object p0
.end method

.method private static final c1(Ljava/util/List;)Lwc3/c;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;->Unknown:Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    invoke-static {p0}, Lu82/j;->a(Ljava/lang/Enum;)Lwc3/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lxf3/c;Luf3/a;)Lfu2/f;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->T0(Lxf3/c;Luf3/a;)Lfu2/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d0(Lxf3/c;Luf3/a;)Lpu2/f;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->y1(Lxf3/c;Luf3/a;)Lpu2/f;

    move-result-object p0

    return-object p0
.end method

.method private static final d1(Lad3/c;Lcd3/f;Lad3/g;)Ll83/a0;
    .locals 1

    const-string v0, "$this$Json"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lad3/c;->b:Lcd3/f;

    invoke-static {p0, p1}, Lcd3/i;->a(Lcd3/f;Lcd3/f;)Lcd3/d;

    move-result-object p0

    iput-object p0, p2, Lad3/g;->o:Lcd3/f;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic e(Lxf3/c;Luf3/a;)Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsApi;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->h1(Lxf3/c;Luf3/a;)Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsApi;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e0(Lxf3/c;Luf3/a;)Llu2/e;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->S0(Lxf3/c;Luf3/a;)Llu2/e;

    move-result-object p0

    return-object p0
.end method

.method private static final e1(Lxf3/c;Luf3/a;)Lqi0/a;
    .locals 10

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lqi0/a;

    new-instance v0, Loi0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lfi0/a;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfi0/a;

    invoke-direct {v0, v2}, Loi0/a;-><init>(Lfi0/a;)V

    new-instance v4, Lcom/whoop/analytics/ScreenAnalyticEventModel;

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/whoop/analytics/ScreenAnalyticEventModel;-><init>(Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lvf3/c;

    const-string v5, "weightlifting-json"

    invoke-direct {v2, v5}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v5, Lad3/c;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v3, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lad3/c;

    invoke-direct {p1, v0, v4, p0}, Lqi0/a;-><init>(Loi0/a;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lad3/c;)V

    return-object p1
.end method

.method public static synthetic f(Lxf3/c;Luf3/a;)Lav2/b;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->j1(Lxf3/c;Luf3/a;)Lav2/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f0(Lxf3/c;Luf3/a;)Ldv2/f;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->A0(Lxf3/c;Luf3/a;)Ldv2/f;

    move-result-object p0

    return-object p0
.end method

.method private static final f1(Lxf3/c;Luf3/a;)Lu82/a;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lu82/c;

    new-instance v0, Lvf3/c;

    const-string v1, "weightlifting-json"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lad3/c;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lad3/c;

    new-instance v2, Lvf3/c;

    const-string v4, "weightlifting-gson"

    invoke-direct {v2, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lcom/google/gson/Gson;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v3, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/gson/Gson;

    const-class v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "kt-serialization-weightlifting"

    invoke-static {v1}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {p1, v0, v2, p0, v1}, Lu82/c;-><init>(Lad3/c;Lcom/google/gson/Gson;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljava/util/Set;)V

    return-object p1
.end method

.method public static synthetic g(Lxf3/c;Luf3/a;)Lmu2/b;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->t1(Lxf3/c;Luf3/a;)Lmu2/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g0(Lxf3/c;Luf3/a;)Llv2/a;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->E0(Lxf3/c;Luf3/a;)Llv2/a;

    move-result-object p0

    return-object p0
.end method

.method private static final g1(Lxf3/c;Luf3/a;)Lcom/whoop/weightlifting/data/WeightliftingApi;
    .locals 5

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lu82/e;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu82/e;

    new-instance v2, Lvf3/c;

    const-string v3, "weightlifting-gson"

    invoke-direct {v2, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lcom/google/gson/Gson;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v1, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/gson/Gson;

    new-instance v3, Lvf3/c;

    const-string v4, "weightlifting-json"

    invoke-direct {v3, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lad3/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v1, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lad3/c;

    const-string v4, "kt-serialization-weightlifting"

    invoke-static {v4}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-virtual {v0, v2, v3, v4}, Lu82/e;->a(Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;)Lu82/d;

    move-result-object v0

    new-instance v2, Lpg3/x0;

    invoke-direct {v2}, Lpg3/x0;-><init>()V

    const-class v3, Lsr2/y;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v1, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsr2/y;

    const-string v4, "defaultOkHttpClient"

    invoke-static {v3, v2, v0, v4}, Lb9/y;->y(Lsr2/y;Lpg3/x0;Lu82/d;Ljava/lang/String;)Lvf3/c;

    move-result-object v0

    const-class v3, Lud3/l0;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lud3/l0;

    invoke-virtual {v2, p0}, Lpg3/x0;->e(Lud3/l0;)V

    invoke-virtual {v2}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p0

    const-class p1, Lcom/whoop/weightlifting/data/WeightliftingApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/weightlifting/data/WeightliftingApi;

    return-object p0
.end method

.method public static synthetic h(Lxf3/c;Luf3/a;)Ljava/util/Map;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->r1(Lxf3/c;Luf3/a;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h0(Lxf3/c;Luf3/a;)Ldv2/d;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->u1(Lxf3/c;Luf3/a;)Ldv2/d;

    move-result-object p0

    return-object p0
.end method

.method private static final h1(Lxf3/c;Luf3/a;)Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsApi;
    .locals 5

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lu82/e;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu82/e;

    new-instance v2, Lvf3/c;

    const-string v3, "weightlifting-gson"

    invoke-direct {v2, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lcom/google/gson/Gson;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v1, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/gson/Gson;

    new-instance v3, Lvf3/c;

    const-string v4, "weightlifting-json"

    invoke-direct {v3, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lad3/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v1, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lad3/c;

    const-string v4, "kt-serialization-weightlifting"

    invoke-static {v4}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-virtual {v0, v2, v3, v4}, Lu82/e;->a(Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;)Lu82/d;

    move-result-object v0

    new-instance v2, Lpg3/x0;

    invoke-direct {v2}, Lpg3/x0;-><init>()V

    const-class v3, Lsr2/y;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v1, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsr2/y;

    const-string v4, "defaultOkHttpClient"

    invoke-static {v3, v2, v0, v4}, Lb9/y;->y(Lsr2/y;Lpg3/x0;Lu82/d;Ljava/lang/String;)Lvf3/c;

    move-result-object v0

    const-class v3, Lud3/l0;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lud3/l0;

    const-class p1, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsApi;

    const-string v0, "create(...)"

    invoke-static {v2, p0, p1, v0}, Lb9/y;->f(Lpg3/x0;Lud3/l0;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsApi;

    return-object p0
.end method

.method public static synthetic i(Lxf3/c;Luf3/a;)Lqv2/e;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->U0(Lxf3/c;Luf3/a;)Lqv2/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i0(Lxf3/c;Luf3/a;)Ljv2/d;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->Y0(Lxf3/c;Luf3/a;)Ljv2/d;

    move-result-object p0

    return-object p0
.end method

.method private static final i1(Lxf3/c;Luf3/a;)Llu2/d;
    .locals 2

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Llu2/d;

    const-class v0, Lzr2/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzr2/a;

    invoke-direct {p1, p0}, Llu2/d;-><init>(Lzr2/a;)V

    return-object p1
.end method

.method public static synthetic j(Lxf3/c;Luf3/a;)Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->C0(Lxf3/c;Luf3/a;)Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j0(Lxf3/c;Luf3/a;)Lcom/whoop/weightlifting/data/WeightliftingApi;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->g1(Lxf3/c;Luf3/a;)Lcom/whoop/weightlifting/data/WeightliftingApi;

    move-result-object p0

    return-object p0
.end method

.method private static final j1(Lxf3/c;Luf3/a;)Lav2/b;
    .locals 7

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lav2/b;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lzu2/d;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzu2/d;

    const-class v3, Lav2/f;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lav2/f;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lav2/b;-><init>(Lzu2/d;Lav2/f;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic k(Lxf3/c;Luf3/a;)Lnu2/e;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->L0(Lxf3/c;Luf3/a;)Lnu2/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k0(Lxf3/c;Luf3/a;)Luv2/d;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->m1(Lxf3/c;Luf3/a;)Luv2/d;

    move-result-object p0

    return-object p0
.end method

.method private static final k1(Lxf3/c;Luf3/a;)Liu2/a;
    .locals 13

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Liu2/a;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lrt0/c;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrt0/c;

    const-class v3, Le82/a;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le82/a;

    const-class v4, Ltd1/b;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ltd1/b;

    const-class v5, Lci2/b;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lci2/b;

    const-class v6, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v2, v6, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v7, Lin2/d;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p0, v2, v7, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lin2/d;

    const-class v8, Lfi0/a;

    invoke-virtual {p1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {p0, v2, v8, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lfi0/a;

    new-instance v9, Lvf3/c;

    const-string v10, "mainPrefs"

    invoke-direct {v9, v10}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v10, Lu92/d;

    invoke-virtual {p1, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-virtual {p0, v2, v10, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lu92/d;

    const-class v10, Lbc3/c0;

    invoke-virtual {p1, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-virtual {p0, v2, v10, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lbc3/c0;

    sget-object v11, Ltr2/n;->a:Ltr2/n$a;

    const-string v12, "StrengthTrainerPacketManager"

    invoke-virtual {v11, v12}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v11

    const-class v12, Ljt0/a;

    invoke-virtual {p1, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v12, p0

    check-cast v12, Ljt0/a;

    move-object v2, v0

    invoke-direct/range {v1 .. v12}, Liu2/a;-><init>(Lrt0/c;Le82/a;Ltd1/b;Lci2/b;Lcom/whoop/data/repositories/FeatureFlagChecker;Lin2/d;Lfi0/a;Lu92/d;Lbc3/c0;Ltr2/n;Ljt0/a;)V

    return-object v1
.end method

.method public static synthetic l(Lxf3/c;Luf3/a;)Lav2/f;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->x0(Lxf3/c;Luf3/a;)Lav2/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l0(Lxf3/c;Luf3/a;)Lxu2/c;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->w1(Lxf3/c;Luf3/a;)Lxu2/c;

    move-result-object p0

    return-object p0
.end method

.method private static final l1(Lxf3/c;Luf3/a;)Ltv2/d;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ltv2/d;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lfu2/i;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfu2/i;

    const-class v3, Lcom/whoop/weightlifting/data/WeightliftingApi;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/weightlifting/data/WeightliftingApi;

    const-class v4, Ltr2/n;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ltr2/n;

    invoke-direct {p1, v1, v3, p0}, Ltv2/d;-><init>(Lfu2/i;Lcom/whoop/weightlifting/data/WeightliftingApi;Ltr2/n;)V

    return-object p1
.end method

.method public static synthetic m(Lxf3/c;Luf3/a;)Liu2/a;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->k1(Lxf3/c;Luf3/a;)Liu2/a;

    move-result-object p0

    return-object p0
.end method

.method private static final m0(Ltf3/a;)Ll83/a0;
    .locals 21

    move-object/from16 v0, p0

    const-string v1, "$this$module"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lmu1/a;

    const/16 v1, 0x8

    invoke-direct {v6, v1}, Lmu1/a;-><init>(I)V

    new-instance v2, Lqf3/b;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Luu2/a0;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    sget-object v8, Lwf3/a;->e:Lvf3/c;

    const/4 v5, 0x0

    const/4 v12, 0x2

    move-object v3, v8

    move v7, v12

    invoke-direct/range {v2 .. v7}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v2, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v5, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v2}, Lrf3/b;-><init>(Lqf3/b;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu1/a;

    const/16 v3, 0xa

    invoke-direct {v11, v3}, Lmu1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lvu2/d;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu1/a;

    const/16 v3, 0x16

    invoke-direct {v11, v3}, Lmu1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Luu2/z;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/d;

    const/4 v3, 0x4

    invoke-direct {v11, v3}, Lmu2/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Luu2/x;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/d;

    const/16 v3, 0x10

    invoke-direct {v11, v3}, Lmu2/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lcu2/t;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/d;

    const/16 v3, 0x1c

    invoke-direct {v11, v3}, Lmu2/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lav2/b;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/e;

    const/4 v3, 0x0

    invoke-direct {v11, v3}, Lmu2/e;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Ldv2/d;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/e;

    const/4 v3, 0x1

    invoke-direct {v11, v3}, Lmu2/e;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lxu2/c;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/e;

    const/4 v3, 0x2

    invoke-direct {v11, v3}, Lmu2/e;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lsu2/c;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/e;

    const/4 v3, 0x4

    invoke-direct {v11, v3}, Lmu2/e;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lpu2/f;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu1/a;

    const/16 v3, 0x13

    invoke-direct {v11, v3}, Lmu1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Llf1/f;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/d;

    const/4 v3, 0x0

    invoke-direct {v11, v3}, Lmu2/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Llf1/m;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/d;

    const/16 v3, 0xb

    invoke-direct {v11, v3}, Lmu2/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lrv2/g;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/d;

    const/16 v3, 0x16

    invoke-direct {v11, v3}, Lmu2/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Ljv2/b;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/e;

    const/4 v3, 0x3

    invoke-direct {v11, v3}, Lmu2/e;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Luv2/b;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/e;

    const/4 v3, 0x5

    invoke-direct {v11, v3}, Lmu2/e;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lgv2/b;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v14, v12

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/e;

    const/4 v3, 0x6

    invoke-direct {v11, v3}, Lmu2/e;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lfu2/i;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    const/4 v12, 0x1

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move/from16 v20, v12

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/e;

    const/4 v3, 0x7

    invoke-direct {v11, v3}, Lmu2/e;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lzu2/d;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    move v12, v14

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/e;

    const/16 v3, 0x8

    invoke-direct {v11, v3}, Lmu2/e;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lav2/f;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu1/a;

    const/16 v3, 0x9

    invoke-direct {v11, v3}, Lmu1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lcv2/h;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu1/a;

    const/16 v3, 0xb

    invoke-direct {v11, v3}, Lmu1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Ldv2/f;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu1/a;

    const/16 v3, 0xc

    invoke-direct {v11, v3}, Lmu1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Ldv2/c;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu1/a;

    const/16 v3, 0xd

    invoke-direct {v11, v3}, Lmu1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu1/a;

    const/16 v3, 0xe

    invoke-direct {v11, v3}, Lmu1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lnv2/d;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu1/a;

    const/16 v3, 0xf

    invoke-direct {v11, v3}, Lmu1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Llv2/a;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu1/a;

    const/16 v3, 0x10

    invoke-direct {v11, v3}, Lmu1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lnv2/b;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu1/a;

    const/16 v3, 0x11

    invoke-direct {v11, v3}, Lmu1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lwu2/c;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu1/a;

    const/16 v3, 0x12

    invoke-direct {v11, v3}, Lmu1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lfu2/d;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu1/a;

    const/16 v3, 0x14

    invoke-direct {v11, v3}, Lmu1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lxu2/e;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu1/a;

    const/16 v3, 0x15

    invoke-direct {v11, v3}, Lmu1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu1/a;

    const/16 v3, 0x17

    invoke-direct {v11, v3}, Lmu1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lnu2/e;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu1/a;

    const/16 v3, 0x18

    invoke-direct {v11, v3}, Lmu1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lnu2/f;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu1/a;

    const/16 v3, 0x19

    invoke-direct {v11, v3}, Lmu1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lnu2/b;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu1/a;

    const/16 v3, 0x1a

    invoke-direct {v11, v3}, Lmu1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lpu2/i;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu1/a;

    const/16 v3, 0x1b

    invoke-direct {v11, v3}, Lmu1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lou2/a;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu1/a;

    const/16 v3, 0x1c

    invoke-direct {v11, v3}, Lmu1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lpu2/d;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu1/a;

    const/16 v3, 0x1d

    invoke-direct {v11, v3}, Lmu1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Liu2/b;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    move/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/d;

    const/4 v3, 0x1

    invoke-direct {v11, v3}, Lmu2/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Llu2/e;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    move v12, v14

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/d;

    const/4 v3, 0x2

    invoke-direct {v11, v3}, Lmu2/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lfu2/f;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/d;

    const/4 v3, 0x3

    invoke-direct {v11, v3}, Lmu2/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lqv2/e;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/d;

    const/4 v3, 0x5

    invoke-direct {v11, v3}, Lmu2/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lrv2/e;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/d;

    const/4 v3, 0x6

    invoke-direct {v11, v3}, Lmu2/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Liv2/d;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/d;

    const/4 v3, 0x7

    invoke-direct {v11, v3}, Lmu2/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Ljv2/d;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "weightlifting-gson"

    invoke-static {v7, v0, v3, v2, v4}, Lm4/a;->r(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v10

    new-instance v11, Lmu2/d;

    const/16 v3, 0x8

    invoke-direct {v11, v3}, Lmu2/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lcom/google/gson/Gson;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "weightlifting-json"

    invoke-static {v7, v0, v3, v2, v4}, Lm4/a;->r(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v10

    new-instance v11, Lmu2/d;

    const/16 v3, 0x9

    invoke-direct {v11, v3}, Lmu2/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lad3/c;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "weightlifting-generic-action-router"

    invoke-static {v7, v0, v3, v2, v4}, Lm4/a;->r(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v10

    new-instance v11, Lmu2/d;

    const/16 v3, 0xa

    invoke-direct {v11, v3}, Lmu2/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lqi0/a;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "weightlifting-bff-cache-deserializer"

    invoke-static {v7, v0, v3, v2, v4}, Lm4/a;->r(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v10

    new-instance v11, Lmu2/d;

    const/16 v3, 0xc

    invoke-direct {v11, v3}, Lmu2/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lu82/a;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/d;

    const/16 v3, 0xd

    invoke-direct {v11, v3}, Lmu2/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lcom/whoop/weightlifting/data/WeightliftingApi;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    const/4 v10, 0x0

    move/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/d;

    const/16 v3, 0xe

    invoke-direct {v11, v3}, Lmu2/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsApi;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/d;

    const/16 v3, 0xf

    invoke-direct {v11, v3}, Lmu2/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Llu2/d;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/d;

    const/16 v3, 0x11

    invoke-direct {v11, v3}, Lmu2/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Liu2/a;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    move v12, v14

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v3, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v3, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {v0, v3, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lmu2/d;

    const/16 v2, 0x12

    invoke-direct {v11, v2}, Lmu2/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v2, Ltv2/d;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v13, Lmu2/d;

    const/16 v1, 0x13

    invoke-direct {v13, v1}, Lmu2/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    const-class v1, Luv2/d;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object v1, v12

    move v12, v14

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v2

    invoke-static {v2, v1, v10}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v9}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v13, Lmu2/d;

    const/16 v1, 0x14

    invoke-direct {v13, v1}, Lmu2/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    const-class v1, Lpu2/b;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object v1, v12

    move v12, v14

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v2

    invoke-static {v2, v1, v10}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v9}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v13, Lmu2/d;

    const/16 v1, 0x15

    invoke-direct {v13, v1}, Lmu2/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    const-class v1, Lfv2/d;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object v1, v12

    move v12, v14

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v2

    invoke-static {v2, v1, v10}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v9}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v13, Lmu2/d;

    const/16 v1, 0x17

    invoke-direct {v13, v1}, Lmu2/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    const-class v1, Lgv2/c;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object v1, v12

    move v12, v14

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v2

    invoke-static {v2, v1, v10}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v9}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v13, Lmu2/d;

    const/16 v1, 0x18

    invoke-direct {v13, v1}, Lmu2/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    const-class v1, Lpv2/b;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object v1, v12

    move v12, v14

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v2

    invoke-static {v2, v1, v10}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v9}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    const-string v1, "weightlifting-arch-v2-mapping"

    invoke-static {v1}, Lvf3/b;->f(Ljava/lang/String;)Lvf3/c;

    move-result-object v1

    new-instance v13, Lmu2/d;

    const/16 v2, 0x19

    invoke-direct {v13, v2}, Lmu2/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    const-class v2, Ljava/util/Map;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    move-object v12, v1

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v12, v10}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v9}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lmu2/d;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, Lmu2/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v16

    new-instance v15, Lqf3/b;

    const-class v2, Lmu2/c;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v17

    const/16 v18, 0x0

    move-object/from16 v19, v1

    invoke-direct/range {v15 .. v20}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v1, v18

    invoke-virtual {v15}, Lqf3/b;->a()Lj93/d;

    move-result-object v2

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v3

    invoke-static {v2, v1, v3}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v15, v0, v1}, Lb9/y;->x(Lqf3/b;Ltf3/a;Ljava/lang/String;)Lrf3/d;

    move-result-object v1

    const-class v2, Ljb1/e;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const-string v3, "clazz"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v1, Lrf3/b;->a:Lqf3/b;

    iget-object v5, v4, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v5, Ljava/util/Collection;

    invoke-static {v2, v5}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v5

    iput-object v5, v4, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v5, v4, Lqf3/b;->c:Lvf3/a;

    iget-object v4, v4, Lqf3/b;->a:Lvf3/a;

    invoke-static {v2, v5, v4}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x1

    invoke-virtual {v0, v2, v1, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v1, Lmu2/d;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Lmu2/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v16

    new-instance v15, Lqf3/b;

    const-class v2, Lmu2/b;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v17

    move-object/from16 v19, v1

    invoke-direct/range {v15 .. v20}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v1, v18

    invoke-virtual {v15}, Lqf3/b;->a()Lj93/d;

    move-result-object v2

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v5

    invoke-static {v2, v1, v5}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v15, v0, v1}, Lb9/y;->x(Lqf3/b;Ltf3/a;Ljava/lang/String;)Lrf3/d;

    move-result-object v1

    const-class v2, Ljb1/d;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v1, Lrf3/b;->a:Lqf3/b;

    iget-object v6, v5, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v6, Ljava/util/Collection;

    invoke-static {v2, v6}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v6

    iput-object v6, v5, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v6, v5, Lqf3/b;->c:Lvf3/a;

    iget-object v5, v5, Lqf3/b;->a:Lvf3/a;

    invoke-static {v2, v6, v5}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v1, Lmu2/d;

    const/16 v2, 0x1d

    invoke-direct {v1, v2}, Lmu2/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v16

    new-instance v15, Lqf3/b;

    const-class v2, Lmu2/a;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v17

    move-object/from16 v19, v1

    invoke-direct/range {v15 .. v20}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v1, v18

    invoke-virtual {v15}, Lqf3/b;->a()Lj93/d;

    move-result-object v2

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v5

    invoke-static {v2, v1, v5}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v15, v0, v1}, Lb9/y;->x(Lqf3/b;Ltf3/a;Ljava/lang/String;)Lrf3/d;

    move-result-object v1

    const-class v2, Lm91/s;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lrf3/b;->a:Lqf3/b;

    iget-object v5, v3, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v5, Ljava/util/Collection;

    invoke-static {v2, v5}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v5

    iput-object v5, v3, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v5, v3, Lqf3/b;->c:Lvf3/a;

    iget-object v3, v3, Lqf3/b;->a:Lvf3/a;

    invoke-static {v2, v5, v3}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final m1(Lxf3/c;Luf3/a;)Luv2/d;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Luv2/d;

    invoke-direct {p0}, Luv2/d;-><init>()V

    return-object p0
.end method

.method public static synthetic n(Lxf3/c;Luf3/a;)Lcv2/h;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->y0(Lxf3/c;Luf3/a;)Lcv2/h;

    move-result-object p0

    return-object p0
.end method

.method private static final n0(Lxf3/c;Luf3/a;)Luu2/a0;
    .locals 11

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Luu2/a0;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lfi0/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfi0/a;

    const-class v3, Lcom/whoop/weightlifting/data/WeightliftingApi;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/weightlifting/data/WeightliftingApi;

    sget-object v4, Ltr2/n;->a:Ltr2/n$a;

    const-string v5, "ExerciseDetailsViewModel"

    invoke-virtual {v4, v5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v4

    const-class v5, Lfu2/i;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lfu2/i;

    new-instance v6, Lvf3/c;

    const-string v7, "mainPrefs"

    invoke-direct {v6, v7}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v7, Lu92/d;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p0, v2, v7, v6}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lu92/d;

    const-class v7, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const/16 v9, 0x40

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v10}, Luu2/a0;-><init>(Lfi0/a;Lcom/whoop/weightlifting/data/WeightliftingApi;Ltr2/n;Lfu2/i;Lu92/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final n1(Lxf3/c;Luf3/a;)Lpu2/b;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lpu2/b;

    invoke-static {p0}, Lpf/c;->i(Lxf3/c;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object v0

    const-string v1, "from(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lpf/c;->i(Lxf3/c;)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v1, "getApplicationContext(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v0, p0}, Lpu2/b;-><init>(Landroidx/core/app/NotificationManagerCompat;Landroid/content/Context;)V

    return-object p1
.end method

.method public static synthetic o(Lxf3/c;Luf3/a;)Luu2/z;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->z0(Lxf3/c;Luf3/a;)Luu2/z;

    move-result-object p0

    return-object p0
.end method

.method private static final o0(Lxf3/c;Luf3/a;)Lvu2/d;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lvu2/d;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lfi0/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfi0/a;

    const-class v3, Lcom/whoop/weightlifting/data/WeightliftingApi;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/weightlifting/data/WeightliftingApi;

    const-class v4, Lqw2/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lqw2/c;

    const-class v5, Lwm0/a;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lwm0/a;

    sget-object p0, Ltr2/n;->a:Ltr2/n$a;

    const-string p1, "ExerciseDetailsV2Interactor"

    invoke-virtual {p0, p1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v6

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lvu2/d;-><init>(Lfi0/a;Lcom/whoop/weightlifting/data/WeightliftingApi;Lqw2/c;Lwm0/a;Ltr2/n;)V

    return-object v1
.end method

.method private static final o1(Lxf3/c;Luf3/a;)Lfv2/d;
    .locals 6

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lfv2/d;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/weightlifting/data/WeightliftingApi;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/weightlifting/data/WeightliftingApi;

    const-class v3, Lfu2/i;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfu2/i;

    sget-object v4, Ltr2/n;->a:Ltr2/n$a;

    const-string v5, "CustomExerciseInteractor"

    invoke-virtual {v4, v5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v4

    const-class v5, Lfi0/a;

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfi0/a;

    invoke-direct {p1, v1, v3, v4, p0}, Lfv2/d;-><init>(Lcom/whoop/weightlifting/data/WeightliftingApi;Lfu2/i;Ltr2/n;Lfi0/a;)V

    return-object p1
.end method

.method public static synthetic p(Lxf3/c;Luf3/a;)Lrv2/e;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->W0(Lxf3/c;Luf3/a;)Lrv2/e;

    move-result-object p0

    return-object p0
.end method

.method private static final p0(Lxf3/c;Luf3/a;)Llf1/f;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Llf1/f;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v3, Lhf1/b;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lhf1/b;

    invoke-direct {p1, v1, p0}, Llf1/f;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lhf1/b;)V

    return-object p1
.end method

.method private static final p1(Lxf3/c;Luf3/a;)Lgv2/c;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lgv2/c;

    invoke-direct {p0}, Lgv2/c;-><init>()V

    return-object p0
.end method

.method public static synthetic q(Lxf3/c;Luf3/a;)Ljv2/b;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->s0(Lxf3/c;Luf3/a;)Ljv2/b;

    move-result-object p0

    return-object p0
.end method

.method private static final q0(Lxf3/c;Luf3/a;)Llf1/m;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Llf1/m;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v3, Lhf1/b;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lhf1/b;

    invoke-direct {p1, v1, p0}, Llf1/m;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lhf1/b;)V

    return-object p1
.end method

.method private static final q1(Lxf3/c;Luf3/a;)Lpv2/b;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lpv2/b;

    invoke-direct {p0}, Lpv2/b;-><init>()V

    return-object p0
.end method

.method public static synthetic r(Lxf3/c;Luf3/a;)Lfu2/d;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->H0(Lxf3/c;Luf3/a;)Lfu2/d;

    move-result-object p0

    return-object p0
.end method

.method private static final r0(Lxf3/c;Luf3/a;)Lrv2/g;
    .locals 7

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lrv2/g;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lrv2/e;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrv2/e;

    const-class v3, Lqv2/e;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lqv2/e;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lrv2/g;-><init>(Lrv2/e;Lqv2/e;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final r1(Lxf3/c;Luf3/a;)Ljava/util/Map;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class p1, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v0, Ll83/k;

    const-string v1, "MEASUREMENT_ENTRY_ITEM"

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    new-instance p1, Ll83/k;

    const-string v1, "ONE_REP_MAX_MEASUREMENT"

    invoke-direct {p1, v1, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, p1}, [Ll83/k;

    move-result-object p0

    invoke-static {p0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lxf3/c;Luf3/a;)Liu2/b;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->R0(Lxf3/c;Luf3/a;)Liu2/b;

    move-result-object p0

    return-object p0
.end method

.method private static final s0(Lxf3/c;Luf3/a;)Ljv2/b;
    .locals 8

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Ljv2/d;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljv2/d;

    const-class v0, Liv2/d;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Liv2/d;

    new-instance v2, Ljv2/b;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Ljv2/b;-><init>(Liv2/d;Ljv2/d;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method private static final s1(Lxf3/c;Luf3/a;)Lmu2/c;
    .locals 3

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lmu2/c;

    new-instance v0, Lvf3/c;

    const-string v1, "weightlifting-arch-v2-mapping"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v1, Ljava/util/Map;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map;

    invoke-direct {p1, p0}, Lmu2/c;-><init>(Ljava/util/Map;)V

    return-object p1
.end method

.method public static synthetic t(Lxf3/c;Luf3/a;)Lpv2/b;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->q1(Lxf3/c;Luf3/a;)Lpv2/b;

    move-result-object p0

    return-object p0
.end method

.method private static final t0(Lxf3/c;Luf3/a;)Luv2/b;
    .locals 7

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Luv2/b;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Ltv2/d;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltv2/d;

    const-class v3, Luv2/d;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Luv2/d;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Luv2/b;-><init>(Ltv2/d;Luv2/d;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final t1(Lxf3/c;Luf3/a;)Lmu2/b;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lmu2/b;

    invoke-direct {p0}, Lmu2/b;-><init>()V

    return-object p0
.end method

.method public static synthetic u(Lxf3/c;Luf3/a;)Lgv2/b;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->u0(Lxf3/c;Luf3/a;)Lgv2/b;

    move-result-object p0

    return-object p0
.end method

.method private static final u0(Lxf3/c;Luf3/a;)Lgv2/b;
    .locals 7

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lgv2/b;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lfv2/d;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfv2/d;

    const-class v3, Lgv2/c;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lgv2/c;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lgv2/b;-><init>(Lfv2/d;Lgv2/c;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final u1(Lxf3/c;Luf3/a;)Ldv2/d;
    .locals 9

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ldv2/d;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcv2/h;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcv2/h;

    const-class v3, Ldv2/f;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldv2/f;

    const-class v4, Ldv2/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ldv2/c;

    const-class v5, Lfi0/a;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lfi0/a;

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v8}, Ldv2/d;-><init>(Lcv2/h;Ldv2/f;Ldv2/c;Lfi0/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic v(Lxf3/c;Luf3/a;)Lpu2/b;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->n1(Lxf3/c;Luf3/a;)Lpu2/b;

    move-result-object p0

    return-object p0
.end method

.method private static final v0(Lxf3/c;Luf3/a;)Lfu2/i;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lfu2/i;

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p1}, Lfu2/i;-><init>(Lor2/x1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method private static final v1(Lxf3/c;Luf3/a;)Lmu2/a;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lmu2/a;

    invoke-direct {p0}, Lmu2/a;-><init>()V

    return-object p0
.end method

.method public static synthetic w(Lxf3/c;Luf3/a;)Lwu2/c;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->G0(Lxf3/c;Luf3/a;)Lwu2/c;

    move-result-object p0

    return-object p0
.end method

.method private static final w0(Lxf3/c;Luf3/a;)Lzu2/d;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lzu2/d;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lfu2/i;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfu2/i;

    const-class v3, Lcom/whoop/weightlifting/data/WeightliftingApi;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/weightlifting/data/WeightliftingApi;

    sget-object v4, Ltr2/n;->a:Ltr2/n$a;

    const-string v5, "InputWorkoutNameInteractor"

    invoke-virtual {v4, v5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v4

    const-class v5, Lrr2/c;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lrr2/c;

    const-class v6, Lfi0/a;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lfi0/a;

    invoke-static {}, Ljava/time/Clock;->systemDefaultZone()Ljava/time/Clock;

    move-result-object v7

    const-string p0, "systemDefaultZone(...)"

    invoke-static {v7, p0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Lzu2/d;-><init>(Lfu2/i;Lcom/whoop/weightlifting/data/WeightliftingApi;Ltr2/n;Lrr2/c;Lfi0/a;Ljava/time/Clock;)V

    return-object v1
.end method

.method private static final w1(Lxf3/c;Luf3/a;)Lxu2/c;
    .locals 7

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lxu2/c;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lwu2/c;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwu2/c;

    const-class v3, Lxu2/e;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lxu2/e;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lxu2/c;-><init>(Lwu2/c;Lxu2/e;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic x(Lxf3/c;Luf3/a;)Lpu2/i;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->O0(Lxf3/c;Luf3/a;)Lpu2/i;

    move-result-object p0

    return-object p0
.end method

.method private static final x0(Lxf3/c;Luf3/a;)Lav2/f;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lav2/f;

    invoke-direct {p0}, Lav2/f;-><init>()V

    return-object p0
.end method

.method private static final x1(Lxf3/c;Luf3/a;)Lsu2/c;
    .locals 8

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lsu2/c;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Liu2/b;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Liu2/b;

    const-class v3, La6/g;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, La6/g;

    const-class v3, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Lsu2/c;-><init>(Liu2/b;Lbc3/c0;La6/g;Lcom/whoop/data/repositories/FeatureFlagChecker;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic y(Lxf3/c;Luf3/a;)Lcom/google/gson/Gson;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->Z0(Lxf3/c;Luf3/a;)Lcom/google/gson/Gson;

    move-result-object p0

    return-object p0
.end method

.method private static final y0(Lxf3/c;Luf3/a;)Lcv2/h;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcv2/h;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lfu2/i;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfu2/i;

    const-class v3, Lfi0/a;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfi0/a;

    const-class v4, Lcom/whoop/weightlifting/data/WeightliftingApi;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/weightlifting/data/WeightliftingApi;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "SelectExercisesInteractor"

    invoke-virtual {v0, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    invoke-direct {p1, v1, v3, p0, v0}, Lcv2/h;-><init>(Lfu2/i;Lfi0/a;Lcom/whoop/weightlifting/data/WeightliftingApi;Ltr2/n;)V

    return-object p1
.end method

.method private static final y1(Lxf3/c;Luf3/a;)Lpu2/f;
    .locals 22

    move-object/from16 v0, p0

    const-string v1, "$this$viewModel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    const-class v2, Lpu2/i;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lpu2/i;

    const-class v2, Lou2/a;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lou2/a;

    const-class v2, Lpu2/d;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lpu2/d;

    const-class v2, Lnu2/b;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lnu2/b;

    const-class v2, Liu2/a;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Liu2/a;

    const-class v2, Ltd1/b;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Ltd1/b;

    const-class v2, Lnu2/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Lnu2/e;

    const-class v2, Lnu2/f;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Lnu2/f;

    const-class v2, Landroidx/lifecycle/k1;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Landroidx/lifecycle/k1;

    const-class v2, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v2, Lpu2/b;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Lpu2/b;

    const-class v2, Leq1/a;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Leq1/a;

    const-class v2, Lus0/g;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lus0/g;

    new-instance v4, Lpu2/f;

    const/16 v20, 0x800

    const/16 v21, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v4 .. v21}, Lpu2/f;-><init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lpu2/i;Lou2/a;Lpu2/d;Lnu2/b;Liu2/a;Ltd1/b;Lnu2/e;Lnu2/f;Lcom/whoop/data/repositories/FeatureFlagChecker;Landroidx/lifecycle/k1;Lbc3/c0;Lpu2/b;Leq1/a;Lus0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method

.method public static synthetic z(Lxf3/c;Luf3/a;)Lsu2/c;
    .locals 0

    invoke-static {p0, p1}, Lmu2/f;->x1(Lxf3/c;Luf3/a;)Lsu2/c;

    move-result-object p0

    return-object p0
.end method

.method private static final z0(Lxf3/c;Luf3/a;)Luu2/z;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Luu2/z;

    invoke-direct {p0}, Luu2/z;-><init>()V

    return-object p0
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lmu2/f;->m0(Ltf3/a;)Ll83/a0;

    return-object v0
.end method

.method public getDependencies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lv82/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lmu2/f;->a:Ljava/util/List;

    return-object v0
.end method

.method public bridge getKey()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lnd1/j;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
