.class public abstract Lpc2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\r\"&\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0002\u0010\u0003\u0012\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0002\u0010\u0004\"&\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\u0003\u0012\u0004\u0008\n\u0010\u0006\u001a\u0004\u0008\t\u0010\u0004\"&\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\u0003\u0012\u0004\u0008\u000c\u0010\u0006\u001a\u0004\u0008\u0008\u0010\u0004\u00a8\u0006\u000e"
    }
    d2 = {
        "",
        "Lqc2/c;",
        "a",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "getREGULATORY_LABELS_GEN_4$annotations",
        "()V",
        "REGULATORY_LABELS_GEN_4",
        "b",
        "c",
        "getREGULATORY_LABELS_MAVERICK$annotations",
        "REGULATORY_LABELS_MAVERICK",
        "getREGULATORY_LABELS_GOOSE$annotations",
        "REGULATORY_LABELS_GOOSE",
        "settings_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lqc2/c;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lqc2/c;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lqc2/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 19

    new-instance v0, Lqc2/c$b;

    new-instance v1, Lcom/whoop/design/util/TextResource$b;

    sget v2, Lea2/s;->h0:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v1, v2, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lqc2/a$b;

    new-instance v5, Lcom/whoop/design/util/TextResource$b;

    sget v6, Lea2/s;->l0:I

    invoke-direct {v5, v6, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v7, Lea2/s;->i0:I

    invoke-direct {v6, v7, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v5, v6}, [Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct {v2, v5}, Lqc2/a$b;-><init>(Ljava/util/List;)V

    invoke-direct {v0, v1, v2}, Lqc2/c$b;-><init>(Ljava/util/List;Lqc2/a;)V

    new-instance v1, Lqc2/c$b;

    new-instance v2, Lcom/whoop/design/util/TextResource$b;

    sget v5, Lea2/s;->z0:I

    invoke-direct {v2, v5, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v5, Lqc2/a$b;

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v7, Lea2/s;->F0:I

    invoke-direct {v6, v7, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lcom/whoop/design/util/TextResource$b;

    sget v8, Lea2/s;->E0:I

    invoke-direct {v7, v8, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v6, v7}, [Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-direct {v5, v6}, Lqc2/a$b;-><init>(Ljava/util/List;)V

    invoke-direct {v1, v2, v5}, Lqc2/c$b;-><init>(Ljava/util/List;Lqc2/a;)V

    new-instance v2, Lqc2/c$b;

    new-instance v5, Lcom/whoop/design/util/TextResource$b;

    sget v6, Lea2/s;->Y:I

    invoke-direct {v5, v6, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    new-instance v6, Lqc2/a$b;

    new-instance v7, Lcom/whoop/design/util/TextResource$b;

    sget v8, Lea2/s;->e0:I

    invoke-direct {v7, v8, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lcom/whoop/design/util/TextResource$b;

    sget v9, Lea2/s;->d0:I

    invoke-direct {v8, v9, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v7, v8}, [Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    invoke-static {v7}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-direct {v6, v7}, Lqc2/a$b;-><init>(Ljava/util/List;)V

    invoke-direct {v2, v5, v6}, Lqc2/c$b;-><init>(Ljava/util/List;Lqc2/a;)V

    new-instance v5, Lqc2/c$b;

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v7, Lea2/s;->g0:I

    invoke-direct {v6, v7, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v6}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    new-instance v7, Lqc2/a$a;

    sget v8, Lea2/p;->c:I

    invoke-static {v8}, Lkd1/p;->k(I)Lkd1/o;

    move-result-object v8

    invoke-direct {v7, v8}, Lqc2/a$a;-><init>(Lkd1/o;)V

    invoke-direct {v5, v6, v7}, Lqc2/c$b;-><init>(Ljava/util/List;Lqc2/a;)V

    new-instance v6, Lqc2/c$b;

    new-instance v7, Lcom/whoop/design/util/TextResource$b;

    sget v8, Lea2/s;->X:I

    invoke-direct {v7, v8, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lcom/whoop/design/util/TextResource$b;

    sget v9, Lea2/s;->p0:I

    invoke-direct {v8, v9, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v7, v8}, [Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    invoke-static {v7}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    new-instance v8, Lqc2/a$a;

    sget v9, Lea2/p;->a:I

    invoke-static {v9}, Lkd1/p;->k(I)Lkd1/o;

    move-result-object v9

    invoke-direct {v8, v9}, Lqc2/a$a;-><init>(Lkd1/o;)V

    invoke-direct {v6, v7, v8}, Lqc2/c$b;-><init>(Ljava/util/List;Lqc2/a;)V

    new-instance v7, Lqc2/c$b;

    new-instance v8, Lcom/whoop/design/util/TextResource$b;

    sget v9, Lea2/s;->q0:I

    invoke-direct {v8, v9, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v8}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    new-instance v9, Lqc2/a$a;

    sget v10, Lea2/p;->f:I

    invoke-static {v10}, Lkd1/p;->k(I)Lkd1/o;

    move-result-object v10

    invoke-direct {v9, v10}, Lqc2/a$a;-><init>(Lkd1/o;)V

    invoke-direct {v7, v8, v9}, Lqc2/c$b;-><init>(Ljava/util/List;Lqc2/a;)V

    new-instance v8, Lqc2/c$b;

    new-instance v9, Lcom/whoop/design/util/TextResource$b;

    sget v10, Lea2/s;->s0:I

    invoke-direct {v9, v10, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v9}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    new-instance v10, Lqc2/a$c;

    new-instance v11, Lqc2/a$b;

    new-instance v12, Lcom/whoop/design/util/TextResource$b;

    sget v13, Lea2/s;->t0:I

    invoke-direct {v12, v13, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lcom/whoop/design/util/TextResource$b;

    sget v14, Lea2/s;->u0:I

    invoke-direct {v13, v14, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lcom/whoop/design/util/TextResource$b;

    sget v15, Lea2/s;->r0:I

    invoke-direct {v14, v15, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v12, v13, v14}, [Lcom/whoop/design/util/TextResource$b;

    move-result-object v12

    invoke-static {v12}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    invoke-direct {v11, v12}, Lqc2/a$b;-><init>(Ljava/util/List;)V

    new-instance v12, Lqc2/a$a;

    sget v13, Lea2/p;->h:I

    invoke-static {v13}, Lkd1/p;->k(I)Lkd1/o;

    move-result-object v13

    invoke-direct {v12, v13}, Lqc2/a$a;-><init>(Lkd1/o;)V

    new-array v13, v4, [Lqc2/a;

    const/4 v14, 0x0

    aput-object v11, v13, v14

    const/4 v11, 0x1

    aput-object v12, v13, v11

    invoke-static {v13}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    invoke-direct {v10, v12}, Lqc2/a$c;-><init>(Ljava/util/List;)V

    invoke-direct {v8, v9, v10}, Lqc2/c$b;-><init>(Ljava/util/List;Lqc2/a;)V

    new-instance v9, Lqc2/c$a;

    new-instance v10, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lea2/s;->H0:I

    invoke-direct {v10, v12, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v9, v10}, Lqc2/c$a;-><init>(Lcom/whoop/design/util/TextResource;)V

    const/16 v10, 0x8

    new-array v10, v10, [Lqc2/c;

    aput-object v0, v10, v14

    aput-object v1, v10, v11

    aput-object v2, v10, v4

    const/4 v0, 0x3

    aput-object v5, v10, v0

    const/4 v1, 0x4

    aput-object v6, v10, v1

    const/4 v2, 0x5

    aput-object v7, v10, v2

    const/4 v5, 0x6

    aput-object v8, v10, v5

    const/4 v6, 0x7

    aput-object v9, v10, v6

    invoke-static {v10}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    sput-object v7, Lpc2/h;->a:Ljava/util/List;

    new-instance v7, Lqc2/c$b;

    new-instance v8, Lcom/whoop/design/util/TextResource$b;

    sget v9, Lea2/s;->h0:I

    invoke-direct {v8, v9, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v8}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    new-instance v9, Lqc2/a$b;

    new-instance v10, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lea2/s;->n0:I

    invoke-direct {v10, v12, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lcom/whoop/design/util/TextResource$b;

    sget v13, Lea2/s;->o0:I

    invoke-direct {v12, v13, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lcom/whoop/design/util/TextResource$b;

    sget v15, Lea2/s;->j0:I

    invoke-direct {v13, v15, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Lcom/whoop/design/util/TextResource$b;

    move/from16 v16, v0

    sget v0, Lea2/s;->k0:I

    invoke-direct {v15, v0, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v10, v12, v13, v15}, [Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v9, v0}, Lqc2/a$b;-><init>(Ljava/util/List;)V

    invoke-direct {v7, v8, v9}, Lqc2/c$b;-><init>(Ljava/util/List;Lqc2/a;)V

    new-instance v0, Lqc2/c$b;

    new-instance v8, Lcom/whoop/design/util/TextResource$b;

    sget v9, Lea2/s;->z0:I

    invoke-direct {v8, v9, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v8}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    new-instance v9, Lqc2/a$b;

    new-instance v10, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lea2/s;->G0:I

    invoke-direct {v10, v12, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lcom/whoop/design/util/TextResource$b;

    sget v13, Lea2/s;->D0:I

    invoke-direct {v12, v13, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lcom/whoop/design/util/TextResource$b;

    sget v15, Lea2/s;->B0:I

    invoke-direct {v13, v15, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Lcom/whoop/design/util/TextResource$b;

    move/from16 v17, v1

    sget v1, Lea2/s;->A0:I

    invoke-direct {v15, v1, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v10, v12, v13, v15}, [Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v9, v1}, Lqc2/a$b;-><init>(Ljava/util/List;)V

    invoke-direct {v0, v8, v9}, Lqc2/c$b;-><init>(Ljava/util/List;Lqc2/a;)V

    new-instance v1, Lqc2/c$b;

    new-instance v8, Lcom/whoop/design/util/TextResource$b;

    sget v9, Lea2/s;->Y:I

    invoke-direct {v8, v9, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v8}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    new-instance v9, Lqc2/a$b;

    new-instance v10, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lea2/s;->f0:I

    invoke-direct {v10, v12, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lcom/whoop/design/util/TextResource$b;

    sget v13, Lea2/s;->c0:I

    invoke-direct {v12, v13, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lcom/whoop/design/util/TextResource$b;

    sget v15, Lea2/s;->a0:I

    invoke-direct {v13, v15, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Lcom/whoop/design/util/TextResource$b;

    move/from16 v18, v2

    sget v2, Lea2/s;->Z:I

    invoke-direct {v15, v2, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v10, v12, v13, v15}, [Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v9, v2}, Lqc2/a$b;-><init>(Ljava/util/List;)V

    invoke-direct {v1, v8, v9}, Lqc2/c$b;-><init>(Ljava/util/List;Lqc2/a;)V

    new-instance v2, Lqc2/c$b;

    new-instance v8, Lcom/whoop/design/util/TextResource$b;

    sget v9, Lea2/s;->g0:I

    invoke-direct {v8, v9, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v8}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    new-instance v9, Lqc2/a$a;

    sget v10, Lea2/p;->c:I

    invoke-static {v10}, Lkd1/p;->k(I)Lkd1/o;

    move-result-object v10

    invoke-direct {v9, v10}, Lqc2/a$a;-><init>(Lkd1/o;)V

    invoke-direct {v2, v8, v9}, Lqc2/c$b;-><init>(Ljava/util/List;Lqc2/a;)V

    new-instance v8, Lqc2/c$b;

    new-instance v9, Lcom/whoop/design/util/TextResource$b;

    sget v10, Lea2/s;->X:I

    invoke-direct {v9, v10, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lea2/s;->p0:I

    invoke-direct {v10, v12, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v9, v10}, [Lcom/whoop/design/util/TextResource$b;

    move-result-object v9

    invoke-static {v9}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    new-instance v10, Lqc2/a$a;

    sget v12, Lea2/p;->a:I

    invoke-static {v12}, Lkd1/p;->k(I)Lkd1/o;

    move-result-object v12

    invoke-direct {v10, v12}, Lqc2/a$a;-><init>(Lkd1/o;)V

    invoke-direct {v8, v9, v10}, Lqc2/c$b;-><init>(Ljava/util/List;Lqc2/a;)V

    new-instance v9, Lqc2/c$b;

    new-instance v10, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lea2/s;->q0:I

    invoke-direct {v10, v12, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v10}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    new-instance v12, Lqc2/a$a;

    sget v13, Lea2/p;->g:I

    invoke-static {v13}, Lkd1/p;->k(I)Lkd1/o;

    move-result-object v13

    invoke-direct {v12, v13}, Lqc2/a$a;-><init>(Lkd1/o;)V

    invoke-direct {v9, v10, v12}, Lqc2/c$b;-><init>(Ljava/util/List;Lqc2/a;)V

    new-instance v10, Lqc2/c$a;

    new-instance v12, Lcom/whoop/design/util/TextResource$b;

    sget v13, Lea2/s;->H0:I

    invoke-direct {v12, v13, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v10, v12}, Lqc2/c$a;-><init>(Lcom/whoop/design/util/TextResource;)V

    new-array v12, v6, [Lqc2/c;

    aput-object v7, v12, v14

    aput-object v0, v12, v11

    aput-object v1, v12, v4

    aput-object v2, v12, v16

    aput-object v8, v12, v17

    aput-object v9, v12, v18

    aput-object v10, v12, v5

    invoke-static {v12}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lpc2/h;->b:Ljava/util/List;

    new-instance v0, Lqc2/c$b;

    new-instance v1, Lcom/whoop/design/util/TextResource$b;

    sget v2, Lea2/s;->h0:I

    invoke-direct {v1, v2, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lqc2/a$b;

    new-instance v7, Lcom/whoop/design/util/TextResource$b;

    sget v8, Lea2/s;->m0:I

    invoke-direct {v7, v8, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lcom/whoop/design/util/TextResource$b;

    sget v9, Lea2/s;->j0:I

    invoke-direct {v8, v9, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lcom/whoop/design/util/TextResource$b;

    sget v10, Lea2/s;->k0:I

    invoke-direct {v9, v10, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v7, v8, v9}, [Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    invoke-static {v7}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-direct {v2, v7}, Lqc2/a$b;-><init>(Ljava/util/List;)V

    invoke-direct {v0, v1, v2}, Lqc2/c$b;-><init>(Ljava/util/List;Lqc2/a;)V

    new-instance v1, Lqc2/c$b;

    new-instance v2, Lcom/whoop/design/util/TextResource$b;

    sget v7, Lea2/s;->z0:I

    invoke-direct {v2, v7, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v7, Lqc2/a$b;

    new-instance v8, Lcom/whoop/design/util/TextResource$b;

    sget v9, Lea2/s;->C0:I

    invoke-direct {v8, v9, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lcom/whoop/design/util/TextResource$b;

    sget v10, Lea2/s;->B0:I

    invoke-direct {v9, v10, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lea2/s;->A0:I

    invoke-direct {v10, v12, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v8, v9, v10}, [Lcom/whoop/design/util/TextResource$b;

    move-result-object v8

    invoke-static {v8}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-direct {v7, v8}, Lqc2/a$b;-><init>(Ljava/util/List;)V

    invoke-direct {v1, v2, v7}, Lqc2/c$b;-><init>(Ljava/util/List;Lqc2/a;)V

    new-instance v2, Lqc2/c$b;

    new-instance v7, Lcom/whoop/design/util/TextResource$b;

    sget v8, Lea2/s;->Y:I

    invoke-direct {v7, v8, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v7}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    new-instance v8, Lqc2/a$b;

    new-instance v9, Lcom/whoop/design/util/TextResource$b;

    sget v10, Lea2/s;->b0:I

    invoke-direct {v9, v10, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lea2/s;->a0:I

    invoke-direct {v10, v12, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lcom/whoop/design/util/TextResource$b;

    sget v13, Lea2/s;->Z:I

    invoke-direct {v12, v13, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v9, v10, v12}, [Lcom/whoop/design/util/TextResource$b;

    move-result-object v9

    invoke-static {v9}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    invoke-direct {v8, v9}, Lqc2/a$b;-><init>(Ljava/util/List;)V

    invoke-direct {v2, v7, v8}, Lqc2/c$b;-><init>(Ljava/util/List;Lqc2/a;)V

    new-instance v7, Lqc2/c$b;

    new-instance v8, Lcom/whoop/design/util/TextResource$b;

    sget v9, Lea2/s;->g0:I

    invoke-direct {v8, v9, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v8}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    new-instance v9, Lqc2/a$a;

    sget v10, Lea2/p;->c:I

    invoke-static {v10}, Lkd1/p;->k(I)Lkd1/o;

    move-result-object v10

    invoke-direct {v9, v10}, Lqc2/a$a;-><init>(Lkd1/o;)V

    invoke-direct {v7, v8, v9}, Lqc2/c$b;-><init>(Ljava/util/List;Lqc2/a;)V

    new-instance v8, Lqc2/c$b;

    new-instance v9, Lcom/whoop/design/util/TextResource$b;

    sget v10, Lea2/s;->X:I

    invoke-direct {v9, v10, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lea2/s;->p0:I

    invoke-direct {v10, v12, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v9, v10}, [Lcom/whoop/design/util/TextResource$b;

    move-result-object v9

    invoke-static {v9}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    new-instance v10, Lqc2/a$a;

    sget v12, Lea2/p;->a:I

    invoke-static {v12}, Lkd1/p;->k(I)Lkd1/o;

    move-result-object v12

    invoke-direct {v10, v12}, Lqc2/a$a;-><init>(Lkd1/o;)V

    invoke-direct {v8, v9, v10}, Lqc2/c$b;-><init>(Ljava/util/List;Lqc2/a;)V

    new-instance v9, Lqc2/c$b;

    new-instance v10, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lea2/s;->q0:I

    invoke-direct {v10, v12, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v10}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    new-instance v12, Lqc2/a$a;

    sget v13, Lea2/p;->g:I

    invoke-static {v13}, Lkd1/p;->k(I)Lkd1/o;

    move-result-object v13

    invoke-direct {v12, v13}, Lqc2/a$a;-><init>(Lkd1/o;)V

    invoke-direct {v9, v10, v12}, Lqc2/c$b;-><init>(Ljava/util/List;Lqc2/a;)V

    new-instance v10, Lqc2/c$a;

    new-instance v12, Lcom/whoop/design/util/TextResource$b;

    sget v13, Lea2/s;->H0:I

    invoke-direct {v12, v13, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v10, v12}, Lqc2/c$a;-><init>(Lcom/whoop/design/util/TextResource;)V

    new-array v3, v6, [Lqc2/c;

    aput-object v0, v3, v14

    aput-object v1, v3, v11

    aput-object v2, v3, v4

    aput-object v7, v3, v16

    aput-object v8, v3, v17

    aput-object v9, v3, v18

    aput-object v10, v3, v5

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lpc2/h;->c:Ljava/util/List;

    return-void
.end method

.method public static final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lqc2/c;",
            ">;"
        }
    .end annotation

    sget-object v0, Lpc2/h;->a:Ljava/util/List;

    return-object v0
.end method

.method public static final b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lqc2/c;",
            ">;"
        }
    .end annotation

    sget-object v0, Lpc2/h;->c:Ljava/util/List;

    return-object v0
.end method

.method public static final c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lqc2/c;",
            ">;"
        }
    .end annotation

    sget-object v0, Lpc2/h;->b:Ljava/util/List;

    return-object v0
.end method
