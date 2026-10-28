.class public final Lr22/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnd1/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr22/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R \u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "Lr22/b;",
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
        "payments_release"
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
.field public static final b:Lr22/b$a;

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

    new-instance v0, Lr22/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr22/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lr22/b;->b:Lr22/b$a;

    const/16 v0, 0x8

    sput v0, Lr22/b;->c:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lb9/y;->u()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lr22/b;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic A(Lxf3/c;Luf3/a;)Lw22/c;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->L(Lxf3/c;Luf3/a;)Lw22/c;

    move-result-object p0

    return-object p0
.end method

.method private static final B(Ltf3/a;)Ll83/a0;
    .locals 13

    const-string v0, "$this$module"

    const-string v1, "PAYMENTS_MODEL_MAPPING"

    invoke-static {p0, v0, v1}, Lm4/a;->s(Ltf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object v5

    new-instance v6, Lqq1/a;

    const/16 v0, 0x16

    invoke-direct {v6, v0}, Lqq1/a;-><init>(I)V

    new-instance v2, Lqf3/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ljava/util/Map;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    sget-object v8, Lwf3/a;->e:Lvf3/c;

    const/4 v12, 0x1

    move-object v3, v8

    move v7, v12

    invoke-direct/range {v2 .. v7}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v4, v5, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "PAYMENTS_GSON"

    const/4 v4, 0x0

    invoke-static {v2, p0, v1, v4, v3}, Lih0/d0;->t(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v10

    new-instance v11, Lqq1/a;

    const/16 v1, 0x18

    invoke-direct {v11, v1}, Lqq1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/google/gson/Gson;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "PAYMENTS_JSON"

    invoke-static {v7, p0, v1, v4, v2}, Lih0/d0;->t(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v10

    new-instance v11, Lqq1/a;

    const/16 v1, 0x1d

    invoke-direct {v11, v1}, Lqq1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lad3/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "PAYMENTS_RETROFIT"

    invoke-static {v7, p0, v1, v4, v2}, Lih0/d0;->t(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v10

    new-instance v11, Lr22/a;

    const/4 v1, 0x0

    invoke-direct {v11, v1}, Lr22/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lpg3/y0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/d;

    invoke-direct {v2, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lr22/a;

    const/4 v1, 0x1

    invoke-direct {v11, v1}, Lr22/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/payments/domain/PaymentsApi;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/d;

    invoke-direct {v2, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lr22/a;

    const/4 v1, 0x2

    invoke-direct {v11, v1}, Lr22/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/payments/stripebottomsheettile/domain/StripeBottomSheetTileApi;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/d;

    invoke-direct {v2, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lr22/a;

    const/4 v1, 0x4

    invoke-direct {v11, v1}, Lr22/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, La32/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v1, v12

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lr22/a;

    const/4 v2, 0x5

    invoke-direct {v11, v2}, Lr22/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v2, Lg32/o;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    const/4 v12, 0x2

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lr22/a;

    const/4 v2, 0x6

    invoke-direct {v11, v2}, Lr22/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v2, Lb32/d;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lr22/a;

    const/4 v2, 0x7

    invoke-direct {v11, v2}, Lr22/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v2, Lf32/a;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lr22/a;

    const/4 v2, 0x3

    invoke-direct {v11, v2}, Lr22/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v2, Le32/e;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lr22/a;

    const/16 v2, 0x8

    invoke-direct {v11, v2}, Lr22/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v2, Lq22/e;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lr22/a;

    const/16 v2, 0x9

    invoke-direct {v11, v2}, Lr22/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v2, Lh32/a;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lr22/a;

    const/16 v2, 0xa

    invoke-direct {v11, v2}, Lr22/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v2, Lu22/e;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lr22/a;

    const/16 v2, 0xb

    invoke-direct {v11, v2}, Lr22/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v2, Ly22/a;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lr22/a;

    const/16 v2, 0xc

    invoke-direct {v11, v2}, Lr22/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v2, Lw22/c;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lr22/a;

    const/16 v2, 0xd

    invoke-direct {v11, v2}, Lr22/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v2, Lw22/a;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lr22/a;

    const/16 v2, 0xe

    invoke-direct {v11, v2}, Lr22/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v2, Lt22/b;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lr22/a;

    const/16 v2, 0xf

    invoke-direct {v11, v2}, Lr22/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v2, Lu22/h;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lqq1/a;

    const/16 v2, 0x17

    invoke-direct {v11, v2}, Lqq1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v2, Lx22/b;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v2, v12

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Lrf3/a;

    invoke-direct {v5, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v5, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lqq1/a;

    const/16 v3, 0x19

    invoke-direct {v11, v3}, Lqq1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v3, Lcom/whoop/payments/stripepaymentsheettileminiarch/domain/MiniArchStripePaymentSheetTileApi;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    move v12, v1

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lqq1/a;

    const/16 v1, 0x1a

    invoke-direct {v11, v1}, Lqq1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Li32/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    move v12, v2

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lqq1/a;

    const/16 v1, 0x1b

    invoke-direct {v11, v1}, Lqq1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lk32/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lqq1/a;

    const/16 v1, 0x1c

    invoke-direct {v11, v1}, Lqq1/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lj32/j;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, p0, v0, v4}, Lm4/a;->z(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lxf3/c;Luf3/a;)Ljava/util/Map;
    .locals 2

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class p1, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v0, Ll83/k;

    const-string v1, "STRIPE_PAYMENT_SHEET_TILE"

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/payments/stripepaymentsheettileminiarch/model/MiniArchStripePaymentSheetTileModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    new-instance p1, Ll83/k;

    const-string v1, "MINI_ARCH_STRIPE_PAYMENT_SHEET_TILE"

    invoke-direct {p1, v1, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, p1}, [Ll83/k;

    move-result-object p0

    invoke-static {p0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final D(Lxf3/c;Luf3/a;)Lcom/google/gson/Gson;
    .locals 6

    const-string v0, "it"

    const-string v1, "PAYMENTS_MODEL_MAPPING"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    const-class v0, Ljava/util/Map;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ljava/util/Map;

    new-instance v1, Lcom/google/gson/GsonBuilder;

    invoke-direct {v1}, Lcom/google/gson/GsonBuilder;-><init>()V

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/whoop/design/json/d;->g(Lxf3/c;Lcom/google/gson/GsonBuilder;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object p0

    return-object p0
.end method

.method private static final E(Lxf3/c;Luf3/a;)Le32/e;
    .locals 7

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Le32/e;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lb32/d;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb32/d;

    const-class v3, Lf32/a;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lf32/a;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Le32/e;-><init>(Lb32/d;Lf32/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final F(Lxf3/c;Luf3/a;)Lq22/e;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lq22/e;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lzr2/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzr2/a;

    new-instance v3, Lvf3/c;

    const-string v4, "userContext"

    invoke-direct {v3, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lod1/u;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lod1/u;

    invoke-virtual {p0}, Lod1/u;->f()Lcom/whoop/domain/model/User;

    move-result-object p0

    invoke-direct {p1, v1, p0}, Lq22/e;-><init>(Lzr2/a;Lcom/whoop/domain/model/User;)V

    return-object p1
.end method

.method private static final G(Lxf3/c;Luf3/a;)Lh32/a;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lh32/c;

    const-class p1, Lcom/whoop/payments/domain/PaymentsApi;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lcom/whoop/payments/domain/PaymentsApi;

    invoke-static {p0}, Lpf/c;->i(Lxf3/c;)Landroid/content/Context;

    move-result-object v3

    sget-object p0, Ltr2/n;->a:Ltr2/n$a;

    const-string p1, "StripeManager"

    invoke-virtual {p0, p1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lh32/c;-><init>(Lcom/whoop/payments/domain/PaymentsApi;Landroid/content/Context;Ltr2/n;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final H(Lxf3/c;Luf3/a;)Lu22/e;
    .locals 14

    const-string v0, "it"

    const-string v1, "PAYMENTS_MODEL_MAPPING"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ljava/util/Map;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    new-instance v1, Lvf3/c;

    const-string v3, "KotlinxDeserializer"

    invoke-direct {v1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v3, Lbh1/a;

    const/4 v4, 0x7

    invoke-direct {v3, p1, v4}, Lbh1/a;-><init>(Ljava/util/Map;I)V

    const-class v4, Lu82/a;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v3, v4, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu82/a;

    new-instance v3, Lu22/e;

    new-instance v4, Lbh1/b;

    const/16 v5, 0xd

    invoke-direct {v4, p1, v1, v5}, Lbh1/b;-><init>(Ljava/util/Map;Lu82/a;I)V

    const-class p1, Lnm0/e;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v4, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lnm0/e;

    const-class p1, Lqw2/c;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lqw2/c;

    const-class p1, Liy1/c;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Liy1/c;

    const-class p1, Lcom/whoop/payments/stripebottomsheettile/domain/StripeBottomSheetTileApi;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lcom/whoop/payments/stripebottomsheettile/domain/StripeBottomSheetTileApi;

    const-class p1, La32/a;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v8, p1

    check-cast v8, La32/a;

    const-class p1, Lu22/a;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->c(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu22/a;

    if-nez p1, :cond_0

    sget-object p1, Lr22/b$b;->a:Lr22/b$b;

    :cond_0
    move-object v9, p1

    const-class p1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v10, p0

    check-cast v10, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const/16 v12, 0x80

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v3 .. v13}, Lu22/e;-><init>(Lnm0/e;Lqw2/c;Liy1/c;Lcom/whoop/payments/stripebottomsheettile/domain/StripeBottomSheetTileApi;La32/a;Lu22/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method

.method private static final I(Ljava/util/Map;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final J(Ljava/util/Map;Lu82/a;)Luf3/a;
    .locals 0

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final K(Lxf3/c;Luf3/a;)Ly22/a;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ly22/a;

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p1}, Ly22/a;-><init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method private static final L(Lxf3/c;Luf3/a;)Lw22/c;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lw22/c;

    new-instance v1, Lon2/c;

    const/4 v2, 0x4

    invoke-direct {v1, p1, v2}, Lon2/c;-><init>(Luf3/a;I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lj02/o0;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {p0, v1, v3, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj02/o0;

    const-class v1, Leb/a0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p1, v3}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Leb/a0;

    invoke-direct {v0, p0, p1}, Lw22/c;-><init>(Lj02/o0;Leb/a0;)V

    return-object v0

    :cond_0
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "No value found for type \'"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x27

    invoke-static {v2, v1, p1, v0}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final M(Luf3/a;)Luf3/a;
    .locals 4

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {p0, v2}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "No value found for type \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v3, 0x27

    invoke-static {v0, v1, v2, v3}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final N(Lxf3/c;Luf3/a;)Lw22/a;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lw22/a;

    const-class v0, Lt22/b;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lt22/b;

    invoke-direct {p1, p0}, Lw22/a;-><init>(Lt22/b;)V

    return-object p1
.end method

.method private static final O(Lxf3/c;Luf3/a;)Lt22/b;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lt22/b;

    const-class v0, Lfi0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfi0/a;

    invoke-direct {p1, p0}, Lt22/b;-><init>(Lfi0/a;)V

    return-object p1
.end method

.method private static final P(Lxf3/c;Luf3/a;)Lu22/h;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lu22/i;

    const-class p1, Lu02/c;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lu02/c;

    sget-object p0, Ltr2/n;->a:Ltr2/n$a;

    const-string p1, "PaymentMethodMenuItemRepository"

    invoke-virtual {p0, p1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v4

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, Lu22/i;-><init>(Lu02/c;Ljb1/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final Q(Lxf3/c;Luf3/a;)Lx22/b;
    .locals 7

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lx22/b;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lu22/e;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu22/e;

    const-class v3, Ly22/a;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Ly22/a;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lx22/b;-><init>(Lu22/e;Ly22/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final R(Lxf3/c;Luf3/a;)Lad3/c;
    .locals 8

    const-string v0, "it"

    const-string v1, "PAYMENTS_MODEL_MAPPING"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    const-class v0, Ljava/util/Map;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/util/Map;

    const/16 v6, 0x1e

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v7}, Lcom/whoop/design/json/b;->e(Lxf3/c;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Liy1/c;Lrr2/c;ILjava/lang/Object;)Lad3/c;

    move-result-object p0

    return-object p0
.end method

.method private static final S(Lxf3/c;Luf3/a;)Lcom/whoop/payments/stripepaymentsheettileminiarch/domain/MiniArchStripePaymentSheetTileApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "PAYMENTS_RETROFIT"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    const-class v0, Lpg3/y0;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/payments/stripepaymentsheettileminiarch/domain/MiniArchStripePaymentSheetTileApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "create(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/whoop/payments/stripepaymentsheettileminiarch/domain/MiniArchStripePaymentSheetTileApi;

    return-object p0
.end method

.method private static final T(Lxf3/c;Luf3/a;)Li32/c;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Li32/c;

    const-class v0, Lcom/whoop/payments/stripepaymentsheettileminiarch/domain/MiniArchStripePaymentSheetTileApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/payments/stripepaymentsheettileminiarch/domain/MiniArchStripePaymentSheetTileApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Li32/c;-><init>(Lcom/whoop/payments/stripepaymentsheettileminiarch/domain/MiniArchStripePaymentSheetTileApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final U(Lxf3/c;Luf3/a;)Lk32/a;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lk32/a;

    invoke-direct {p0}, Lk32/a;-><init>()V

    return-object p0
.end method

.method private static final V(Lxf3/c;Luf3/a;)Lj32/j;
    .locals 7

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lj32/j;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Li32/c;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li32/c;

    const-class v3, Lk32/a;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lk32/a;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lj32/j;-><init>(Li32/c;Lk32/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final W(Lxf3/c;Luf3/a;)Lpg3/y0;
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

    const-string v3, "PAYMENTS_GSON"

    invoke-direct {v2, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lcom/google/gson/Gson;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v1, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/gson/Gson;

    new-instance v3, Lvf3/c;

    const-string v4, "PAYMENTS_JSON"

    invoke-direct {v3, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lad3/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v1, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lad3/c;

    const-string v4, "kt-serialization-payments-module"

    invoke-static {v4}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-virtual {v0, v2, v3, v4}, Lu82/e;->a(Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;)Lu82/d;

    move-result-object v0

    new-instance v2, Lvf3/c;

    const-string v3, "baseRetrofit"

    invoke-direct {v2, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lpg3/y0;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lpg3/x0;

    invoke-direct {p1, p0}, Lpg3/x0;-><init>(Lpg3/y0;)V

    invoke-virtual {p1, v0}, Lpg3/x0;->b(Lpg3/m;)V

    invoke-virtual {p1}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p0

    return-object p0
.end method

.method private static final X(Lxf3/c;Luf3/a;)Lcom/whoop/payments/domain/PaymentsApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "PAYMENTS_RETROFIT"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    const-class v0, Lpg3/y0;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/payments/domain/PaymentsApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "create(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/whoop/payments/domain/PaymentsApi;

    return-object p0
.end method

.method private static final Y(Lxf3/c;Luf3/a;)Lcom/whoop/payments/stripebottomsheettile/domain/StripeBottomSheetTileApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "PAYMENTS_RETROFIT"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    const-class v0, Lpg3/y0;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/payments/stripebottomsheettile/domain/StripeBottomSheetTileApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "create(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/whoop/payments/stripebottomsheettile/domain/StripeBottomSheetTileApi;

    return-object p0
.end method

.method private static final Z(Lxf3/c;Luf3/a;)La32/a;
    .locals 2

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, La32/a;

    const-class v0, Lfi0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfi0/a;

    invoke-direct {p1, p0}, La32/a;-><init>(Lfi0/a;)V

    return-object p1
.end method

.method public static synthetic a(Lxf3/c;Luf3/a;)La32/a;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->Z(Lxf3/c;Luf3/a;)La32/a;

    move-result-object p0

    return-object p0
.end method

.method private static final a0(Lxf3/c;Luf3/a;)Lg32/o;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lg32/o;

    const-class v0, Lor2/g;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lor2/g;

    invoke-direct {p1, p0}, Lg32/o;-><init>(Lor2/g;)V

    return-object p1
.end method

.method public static synthetic b(Lxf3/c;Luf3/a;)Lcom/whoop/payments/domain/PaymentsApi;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->X(Lxf3/c;Luf3/a;)Lcom/whoop/payments/domain/PaymentsApi;

    move-result-object p0

    return-object p0
.end method

.method private static final b0(Lxf3/c;Luf3/a;)Lb32/d;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lb32/d;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/payments/stripebottomsheettile/domain/StripeBottomSheetTileApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/payments/stripebottomsheettile/domain/StripeBottomSheetTileApi;

    const-class v3, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v4, Liy1/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Liy1/c;

    const-class v5, La32/a;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, La32/a;

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v8}, Lb32/d;-><init>(Lcom/whoop/payments/stripebottomsheettile/domain/StripeBottomSheetTileApi;Lcom/whoop/data/repositories/FeatureFlagChecker;Liy1/c;La32/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic c(Lxf3/c;Luf3/a;)Lu22/e;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->H(Lxf3/c;Luf3/a;)Lu22/e;

    move-result-object p0

    return-object p0
.end method

.method private static final c0(Lxf3/c;Luf3/a;)Lf32/a;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lf32/a;

    invoke-direct {p0}, Lf32/a;-><init>()V

    return-object p0
.end method

.method public static synthetic d(Lxf3/c;Luf3/a;)Le32/e;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->E(Lxf3/c;Luf3/a;)Le32/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lxf3/c;Luf3/a;)Lad3/c;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->R(Lxf3/c;Luf3/a;)Lad3/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lxf3/c;Luf3/a;)Lh32/a;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->G(Lxf3/c;Luf3/a;)Lh32/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lxf3/c;Luf3/a;)Lg32/o;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->a0(Lxf3/c;Luf3/a;)Lg32/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lxf3/c;Luf3/a;)Lw22/a;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->N(Lxf3/c;Luf3/a;)Lw22/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lxf3/c;Luf3/a;)Lq22/e;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->F(Lxf3/c;Luf3/a;)Lq22/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/util/Map;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lr22/b;->I(Ljava/util/Map;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lxf3/c;Luf3/a;)Ly22/a;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->K(Lxf3/c;Luf3/a;)Ly22/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lxf3/c;Luf3/a;)Ljava/util/Map;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->C(Lxf3/c;Luf3/a;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lxf3/c;Luf3/a;)Li32/c;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->T(Lxf3/c;Luf3/a;)Li32/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lxf3/c;Luf3/a;)Lx22/b;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->Q(Lxf3/c;Luf3/a;)Lx22/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lxf3/c;Luf3/a;)Lcom/whoop/payments/stripepaymentsheettileminiarch/domain/MiniArchStripePaymentSheetTileApi;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->S(Lxf3/c;Luf3/a;)Lcom/whoop/payments/stripepaymentsheettileminiarch/domain/MiniArchStripePaymentSheetTileApi;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lxf3/c;Luf3/a;)Lcom/google/gson/Gson;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->D(Lxf3/c;Luf3/a;)Lcom/google/gson/Gson;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Ljava/util/Map;Lu82/a;)Luf3/a;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->J(Ljava/util/Map;Lu82/a;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Luf3/a;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lr22/b;->M(Luf3/a;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lxf3/c;Luf3/a;)Lf32/a;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->c0(Lxf3/c;Luf3/a;)Lf32/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lxf3/c;Luf3/a;)Lt22/b;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->O(Lxf3/c;Luf3/a;)Lt22/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lxf3/c;Luf3/a;)Lk32/a;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->U(Lxf3/c;Luf3/a;)Lk32/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lxf3/c;Luf3/a;)Lu22/h;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->P(Lxf3/c;Luf3/a;)Lu22/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lxf3/c;Luf3/a;)Lb32/d;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->b0(Lxf3/c;Luf3/a;)Lb32/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Lxf3/c;Luf3/a;)Lj32/j;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->V(Lxf3/c;Luf3/a;)Lj32/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lxf3/c;Luf3/a;)Lcom/whoop/payments/stripebottomsheettile/domain/StripeBottomSheetTileApi;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->Y(Lxf3/c;Luf3/a;)Lcom/whoop/payments/stripebottomsheettile/domain/StripeBottomSheetTileApi;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lxf3/c;Luf3/a;)Lpg3/y0;
    .locals 0

    invoke-static {p0, p1}, Lr22/b;->W(Lxf3/c;Luf3/a;)Lpg3/y0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lr22/b;->B(Ltf3/a;)Ll83/a0;

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

    iget-object v0, p0, Lr22/b;->a:Ljava/util/List;

    return-object v0
.end method

.method public bridge getKey()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lnd1/j;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
