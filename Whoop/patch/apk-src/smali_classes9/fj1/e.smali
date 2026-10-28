.class public abstract Lfj1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfj1/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u000b*\u00020\nH\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\r\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\"\u001a\u0010\u0017\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\"\u001a\u0010\u001a\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0014\u001a\u0004\u0008\u0019\u0010\u0016\"\u001a\u0010\u001d\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0014\u001a\u0004\u0008\u001c\u0010\u0016\"\u001a\u0010 \u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u0014\u001a\u0004\u0008\u001f\u0010\u0016\"\u001a\u0010\"\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0014\u001a\u0004\u0008!\u0010\u0016\"\u001a\u0010%\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u0014\u001a\u0004\u0008$\u0010\u0016\"\u001a\u0010(\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008&\u0010\u0014\u001a\u0004\u0008\'\u0010\u0016\u00a8\u0006)"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcj1/r;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "f",
        "(Landroidx/compose/ui/Modifier;Lcj1/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lcj1/q;",
        "Li2/x;",
        "l",
        "(Lcj1/q;Landroidx/compose/runtime/Composer;I)J",
        "m",
        "Lkd1/o$a;",
        "a",
        "Lkd1/o$a;",
        "sampleBodyImage",
        "b",
        "Lcj1/r;",
        "getSampleOnboardingState",
        "()Lcj1/r;",
        "sampleOnboardingState",
        "c",
        "getSampleInitialConnectingState",
        "sampleInitialConnectingState",
        "d",
        "getSampleInitialConnectionErrState",
        "sampleInitialConnectionErrState",
        "e",
        "getSampleUpdatingPostInitState",
        "sampleUpdatingPostInitState",
        "getSampleUpdatingErrState",
        "sampleUpdatingErrState",
        "g",
        "getSampleEnabledState",
        "sampleEnabledState",
        "h",
        "getSampleEnabledNoRecordsState",
        "sampleEnabledNoRecordsState",
        "health_release"
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
.field private static final a:Lkd1/o$a;

.field private static final b:Lcj1/r;

.field private static final c:Lcj1/r;

.field private static final d:Lcj1/r;

.field private static final e:Lcj1/r;

.field private static final f:Lcj1/r;

.field private static final g:Lcj1/r;

.field private static final h:Lcj1/r;


# direct methods
.method static constructor <clinit>()V
    .locals 24

    new-instance v2, Lkd1/o$a;

    sget v0, Lgy0/a;->Q4:I

    invoke-direct {v2, v0}, Lkd1/o$a;-><init>(I)V

    sput-object v2, Lfj1/e;->a:Lkd1/o$a;

    new-instance v6, Lcj1/r;

    sget-object v10, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    new-instance v0, Lcj1/o;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "Securely connect your health records, including conditions, medications, and labs, to add deeper context to your insights."

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcj1/o;-><init>(Ljava/lang/String;Lkd1/o;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Lcom/whoop/navigation/e;

    const/4 v15, 0x7

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v11 .. v16}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v12, 0x30

    const-string v4, "HEALTH_RECORDS"

    const-string v5, "CONNECT HEALTH RECORDS"

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v3, v6

    move-object v6, v10

    const-string v10, "GET STARTED"

    move-object v7, v0

    invoke-direct/range {v3 .. v13}, Lcj1/r;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcj1/o;Ljava/lang/String;Lcj1/p;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v10, v6

    sput-object v3, Lfj1/e;->b:Lcj1/r;

    new-instance v7, Lcj1/r;

    new-instance v0, Lcj1/o;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "--"

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcj1/o;-><init>(Ljava/lang/String;Lkd1/o;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Lcj1/p;

    sget-object v14, Lgz0/m0;->TINY_ELLIPSE:Lgz0/m0;

    sget-object v16, Lcj1/q;->PENDING:Lcj1/q;

    move-object/from16 v15, v16

    const/16 v16, 0x2

    const/16 v17, 0x0

    const-string v12, "Updating records..."

    invoke-direct/range {v11 .. v17}, Lcj1/p;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcj1/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v14

    move-object/from16 v22, v15

    new-instance v12, Lcom/whoop/navigation/e;

    const/16 v16, 0x7

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v12 .. v17}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v16, 0x40

    const-string v8, "HEALTH_RECORDS"

    const-string v9, "HEALTH RECORDS"

    move-object v15, v12

    const-string v12, "INCLUDES"

    move-object v13, v11

    move-object v11, v0

    invoke-direct/range {v7 .. v17}, Lcj1/r;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcj1/o;Ljava/lang/String;Lcj1/p;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v7, Lfj1/e;->c:Lcj1/r;

    new-instance v0, Lcj1/p;

    sget-object v8, Lgz0/m0;->TINY_ATTENTION_ORANGE:Lgz0/m0;

    sget-object v9, Lcj1/q;->ERROR:Lcj1/q;

    const-string v1, "Unable to update."

    const-string v3, "Records may be incomplete."

    invoke-direct {v0, v1, v3, v8, v9}, Lcj1/p;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcj1/q;)V

    const/16 v20, 0xdf

    const/16 v21, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v17, v0

    move-object v11, v7

    invoke-static/range {v11 .. v21}, Lcj1/r;->b(Lcj1/r;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcj1/o;Ljava/lang/String;Lcj1/p;Ljava/lang/String;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcj1/r;

    move-result-object v0

    sput-object v0, Lfj1/e;->d:Lcj1/r;

    new-instance v11, Lcj1/r;

    new-instance v0, Lcj1/o;

    move-object v7, v1

    const-string v1, "0 connected providers"

    move-object v12, v3

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcj1/o;-><init>(Ljava/lang/String;Lkd1/o;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lcj1/p;

    const/16 v17, 0x2

    move-object v1, v12

    move-object v12, v13

    const-string v13, "Updating records..."

    move-object v15, v6

    move-object/from16 v16, v22

    invoke-direct/range {v12 .. v18}, Lcj1/p;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcj1/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lcom/whoop/navigation/e;

    const/16 v17, 0x7

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v13 .. v18}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v16, 0x40

    const/16 v17, 0x0

    move-object v3, v8

    const-string v8, "healthex"

    move-object v4, v9

    const-string v9, "HEALTH RECORDS"

    move-object v15, v13

    move-object v13, v12

    const-string v12, "INCLUDES"

    move-object/from16 v23, v11

    move-object v11, v0

    move-object v0, v7

    move-object/from16 v7, v23

    invoke-direct/range {v7 .. v17}, Lcj1/r;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcj1/o;Ljava/lang/String;Lcj1/p;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v11, v7

    sput-object v11, Lfj1/e;->e:Lcj1/r;

    invoke-virtual {v11}, Lcj1/r;->c()Lcj1/o;

    move-result-object v12

    const/16 v16, 0x6

    const-string v13, "3 providers, 23 visits, and 4 medications"

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Lcj1/o;->b(Lcj1/o;Ljava/lang/String;Lkd1/o;Ljava/lang/String;ILjava/lang/Object;)Lcj1/o;

    move-result-object v15

    new-instance v5, Lcj1/p;

    invoke-direct {v5, v0, v1, v3, v4}, Lcj1/p;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcj1/q;)V

    const/16 v20, 0xd7

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v5

    invoke-static/range {v11 .. v21}, Lcj1/r;->b(Lcj1/r;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcj1/o;Ljava/lang/String;Lcj1/p;Ljava/lang/String;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcj1/r;

    move-result-object v0

    sput-object v0, Lfj1/e;->f:Lcj1/r;

    invoke-virtual {v11}, Lcj1/r;->c()Lcj1/o;

    move-result-object v3

    const/4 v7, 0x6

    const/4 v8, 0x0

    const-string v4, "3 providers, 23 visits, and 4 medications"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcj1/o;->b(Lcj1/o;Ljava/lang/String;Lkd1/o;Ljava/lang/String;ILjava/lang/Object;)Lcj1/o;

    move-result-object v15

    new-instance v0, Lcj1/p;

    sget-object v1, Lgz0/m0;->TINY_CHECKMARK:Lgz0/m0;

    sget-object v3, Lcj1/q;->SUCCESS:Lcj1/q;

    const-string v4, "Last updated: April 23, 2026"

    const-string v5, "12 records added"

    invoke-direct {v0, v4, v5, v1, v3}, Lcj1/p;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcj1/q;)V

    move-object/from16 v17, v0

    invoke-static/range {v11 .. v21}, Lcj1/r;->b(Lcj1/r;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcj1/o;Ljava/lang/String;Lcj1/p;Ljava/lang/String;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcj1/r;

    move-result-object v0

    sput-object v0, Lfj1/e;->g:Lcj1/r;

    new-instance v7, Lcj1/r;

    new-instance v0, Lcj1/o;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "0 connected providers"

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcj1/o;-><init>(Ljava/lang/String;Lkd1/o;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Lcj1/p;

    sget-object v14, Lgz0/m0;->REMOVE:Lgz0/m0;

    sget-object v15, Lcj1/q;->NO_DATA:Lcj1/q;

    const/16 v16, 0x2

    const/16 v17, 0x0

    const-string v12, "Connect a medical provider to pull in medical records"

    invoke-direct/range {v11 .. v17}, Lcj1/p;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcj1/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcom/whoop/navigation/e;

    const/4 v5, 0x7

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v16, 0x40

    const-string v8, "healthex"

    const-string v9, "HEALTH RECORDS"

    const-string v12, "INCLUDES"

    const/4 v14, 0x0

    move-object v15, v1

    move-object v13, v11

    move-object v11, v0

    invoke-direct/range {v7 .. v17}, Lcj1/r;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcj1/o;Ljava/lang/String;Lcj1/p;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v7, Lfj1/e;->h:Lcj1/r;

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/Modifier;Lcj1/r;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lfj1/e;->k(Landroidx/compose/ui/Modifier;Lcj1/r;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ZLcj1/r;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lfj1/e;->i(ZLcj1/r;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcj1/p;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lfj1/e;->j(Lcj1/p;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lfj1/e;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lcj1/r;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lfj1/e;->h(Lkotlin/jvm/functions/Function1;Lcj1/r;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Lcj1/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lcj1/r;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v6, p1

    move/from16 v1, p4

    const-string v0, "state"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, 0x4afc3311    # 8264072.5f

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p5, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v4, v1, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v1

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v1

    :goto_1
    and-int/lit8 v7, v1, 0x30

    const/16 v8, 0x20

    if-nez v7, :cond_5

    and-int/lit8 v7, v1, 0x40

    if-nez v7, :cond_3

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_2
    if-eqz v7, :cond_4

    move v7, v8

    goto :goto_3

    :cond_4
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v5, v7

    :cond_5
    and-int/lit8 v7, p5, 0x4

    const/16 v9, 0x100

    if-eqz v7, :cond_7

    or-int/lit16 v5, v5, 0x180

    :cond_6
    move-object/from16 v10, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v10, v1, 0x180

    if-nez v10, :cond_6

    move-object/from16 v10, p2

    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    move v11, v9

    goto :goto_4

    :cond_8
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v5, v11

    :goto_5
    and-int/lit16 v11, v5, 0x93

    const/16 v12, 0x92

    const/4 v13, 0x0

    if-eq v11, v12, :cond_9

    const/4 v11, 0x1

    goto :goto_6

    :cond_9
    move v11, v13

    :goto_6
    and-int/lit8 v12, v5, 0x1

    invoke-virtual {v0, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_15

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_a

    move-object v4, v11

    :cond_a
    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_c

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v2, :cond_b

    new-instance v7, Lf41/f;

    const/16 v10, 0x15

    invoke-direct {v7, v10}, Lf41/f;-><init>(I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_c
    move-object v7, v10

    :goto_7
    invoke-virtual {v6}, Lcj1/r;->i()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_d

    invoke-virtual {v6}, Lcj1/r;->h()Lcj1/p;

    move-result-object v10

    if-nez v10, :cond_d

    const/4 v10, 0x1

    goto :goto_8

    :cond_d
    move v10, v13

    :goto_8
    if-eqz v10, :cond_e

    sget-object v12, Lrz0/f;->ONBOARDING_GRADIENT_FILL:Lrz0/f;

    goto :goto_9

    :cond_e
    sget-object v12, Lrz0/f;->DEFAULT:Lrz0/f;

    :goto_9
    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-virtual {v6}, Lcj1/r;->f()Lcom/whoop/navigation/e;

    move-result-object v16

    const/4 v14, 0x3

    if-eqz v16, :cond_14

    const v3, 0x1ac18f2a

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    and-int/lit16 v3, v5, 0x380

    if-ne v3, v9, :cond_f

    const/4 v3, 0x1

    goto :goto_a

    :cond_f
    move v3, v13

    :goto_a
    and-int/lit8 v9, v5, 0x70

    if-eq v9, v8, :cond_11

    and-int/lit8 v5, v5, 0x40

    if-eqz v5, :cond_10

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    goto :goto_b

    :cond_10
    move v5, v13

    goto :goto_c

    :cond_11
    :goto_b
    const/4 v5, 0x1

    :goto_c
    or-int/2addr v3, v5

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_12

    if-ne v5, v2, :cond_13

    :cond_12
    new-instance v5, Lf1/w1;

    const/4 v2, 0x6

    invoke-direct {v5, v2, v7, v6}, Lf1/w1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v5, Lc93/a;

    const/4 v2, 0x0

    invoke-static {v11, v13, v2, v5, v14}, Landroidx/room/c1;->i(Landroidx/compose/ui/Modifier;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v0, v13}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_14
    const v2, 0x1ac32ee1

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v13}, Lp1/q;->q(Z)V

    :goto_d
    invoke-interface {v15, v11}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v3, v14

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v3, v5

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v11

    new-instance v3, Lb30/t2;

    invoke-direct {v3, v10, v6}, Lb30/t2;-><init>(ZLcj1/r;)V

    const v5, -0xeb1a55f

    invoke-static {v5, v0, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v15

    const/high16 v17, 0xc00000

    const/16 v18, 0x74

    const-wide/16 v9, 0x0

    move-object v8, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v0

    move-object v0, v7

    move-object v7, v2

    invoke-static/range {v7 .. v18}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v0

    goto :goto_e

    :cond_15
    move-object/from16 v16, v0

    invoke-virtual/range {v16 .. v16}, Lp1/q;->X()V

    move-object v5, v10

    :goto_e
    invoke-virtual/range {v16 .. v16}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_16

    new-instance v0, Lf02/c;

    const/4 v3, 0x5

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lf02/c;-><init>(IIILandroidx/compose/ui/Modifier;Ll83/e;Lm91/u;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final g(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Lcj1/r;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lcj1/r;->f()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(ZLcj1/r;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 58

    and-int/lit8 v0, p3, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v4, p3, 0x1

    move-object/from16 v10, p2

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_23

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v3, v3

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float v7, v3, v6

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v7}, Ll0/m;->i(F)Ll0/k;

    move-result-object v8

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/4 v11, 0x6

    invoke-static {v8, v9, v10, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v12, v10, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v10, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-eqz v15, :cond_1

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_1
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v10, v15, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v10, v8, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-nez v11, :cond_2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v11, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    invoke-static {v12, v10, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v10, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v11, Lb2/e;->K:Lb2/l;

    sget-object v12, Ll0/m;->g:Ll0/h;

    move-object/from16 p3, v9

    const/16 v9, 0x36

    invoke-static {v12, v11, v10, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v12

    move/from16 v35, v3

    iget-wide v2, v10, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v10, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_4

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v10, v15, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v10, Lp1/q;->S:Z

    if-nez v3, :cond_5

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    invoke-static {v2, v10, v2, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v10, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcj1/r;->j()Ljava/lang/String;

    move-result-object v5

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v10, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->r()Lb91/a;

    move-result-object v25

    invoke-virtual {v2, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v17

    move-object v12, v5

    move v9, v6

    float-to-double v5, v0

    const-wide/16 v31, 0x0

    cmpl-double v5, v5, v31

    const-string v33, "invalid weight; must be greater than zero"

    if-lez v5, :cond_7

    goto :goto_3

    :cond_7
    invoke-static/range {v33 .. v33}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_3
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v34, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v5, v0, v34

    if-lez v5, :cond_8

    move/from16 v5, v34

    :goto_4
    const/4 v0, 0x1

    goto :goto_5

    :cond_8
    move v5, v0

    goto :goto_4

    :goto_5
    invoke-direct {v6, v5, v0}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v29, v0, 0x12

    const v30, 0x2fff8

    move v0, v9

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move-object v5, v11

    const/4 v11, 0x0

    move-object/from16 v19, v5

    move-object v5, v12

    const/4 v12, 0x0

    move-object/from16 v20, v13

    const/4 v13, 0x0

    move-object/from16 v21, v14

    move-object/from16 v22, v15

    const-wide/16 v14, 0x0

    const/16 v23, 0x36

    const/16 v16, 0x0

    move-object/from16 v24, v8

    move-wide/from16 v56, v17

    move/from16 v18, v7

    move-wide/from16 v7, v56

    const/16 v17, 0x0

    move/from16 v26, v18

    move-object/from16 v28, v19

    const-wide/16 v18, 0x0

    move-object/from16 v36, v20

    const/16 v20, 0x0

    move-object/from16 v37, v21

    const/16 v21, 0x0

    move-object/from16 v38, v22

    const/16 v22, 0x0

    move/from16 v39, v23

    const/16 v23, 0x0

    move-object/from16 v40, v24

    const/16 v24, 0x0

    move/from16 v41, v26

    const/16 v26, 0x0

    move-object/from16 v42, v28

    const/16 v28, 0x0

    move/from16 p2, v0

    move-object/from16 v44, v36

    move-object/from16 v43, v40

    const/4 v0, 0x6

    move-object/from16 v36, v1

    move-object/from16 v1, v42

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual/range {p1 .. p1}, Lcj1/r;->g()Lgz0/m0;

    move-result-object v5

    const/4 v13, 0x4

    if-nez v5, :cond_9

    const v5, -0x4f441ea7

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    const/4 v5, 0x0

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    :goto_6
    const/4 v5, 0x1

    goto :goto_7

    :cond_9
    const v6, -0x4f441ea6

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    int-to-float v6, v13

    mul-float/2addr v6, v6

    invoke-static {v6, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v5}, Lgz0/m0;->toWhoopIcon()I

    move-result v5

    invoke-static {v5, v10, v0}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    invoke-virtual {v2, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->b1()J

    move-result-wide v8

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    const/4 v6, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v5, 0x0

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    goto :goto_6

    :goto_7
    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v5, Ll0/m;->a:Ll0/e;

    const/16 v7, 0x30

    invoke-static {v5, v1, v10, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_a

    move-object/from16 v9, v37

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    :goto_8
    move-object/from16 v11, v38

    goto :goto_9

    :cond_a
    move-object/from16 v9, v37

    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_8

    :goto_9
    invoke-static {v10, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v5, v43

    invoke-static {v10, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-nez v8, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    :cond_b
    move-object/from16 v8, v44

    goto :goto_b

    :cond_c
    move-object/from16 v8, v44

    :goto_a
    move-object/from16 v7, v36

    goto :goto_c

    :goto_b
    invoke-static {v7, v10, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_a

    :goto_c
    invoke-static {v10, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v6, 0x3f800000    # 1.0f

    float-to-double v14, v6

    cmpl-double v12, v14, v31

    if-lez v12, :cond_d

    goto :goto_d

    :cond_d
    invoke-static/range {v33 .. v33}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_d
    new-instance v12, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v14, v6, v34

    if-lez v14, :cond_e

    move/from16 v6, v34

    :goto_e
    const/4 v14, 0x1

    goto :goto_f

    :cond_e
    const/high16 v6, 0x3f800000    # 1.0f

    goto :goto_e

    :goto_f
    invoke-direct {v12, v6, v14}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    int-to-float v6, v14

    mul-float v14, v6, p2

    invoke-static {v14}, Ll0/m;->i(F)Ll0/k;

    move-result-object v15

    move/from16 v16, v6

    move-object/from16 v6, p3

    invoke-static {v15, v6, v10, v0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v15

    move/from16 v17, v14

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v10, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-eqz v0, :cond_f

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_f
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_10
    invoke-static {v10, v11, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v5, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_10

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v0, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    :cond_10
    invoke-static {v13, v10, v13, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    invoke-static {v10, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v43, v5

    invoke-virtual/range {p1 .. p1}, Lcj1/r;->i()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_12

    const v0, 0x53f0750c

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    const/4 v5, 0x0

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    move-object/from16 p3, v6

    move-object/from16 v49, v7

    move-object/from16 v48, v8

    move-object/from16 v38, v9

    move-object/from16 v46, v11

    move/from16 v50, v16

    move/from16 v37, v17

    move/from16 v39, v29

    move-object/from16 v47, v43

    const/4 v0, 0x4

    goto/16 :goto_11

    :cond_12
    const v0, 0x53f0750d

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v10, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->s()Lb91/a;

    move-result-object v25

    invoke-virtual {v2, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b1()J

    move-result-wide v12

    const/16 v28, 0x0

    const v30, 0x2fffa

    move-object v0, v6

    const/4 v6, 0x0

    move-object/from16 v37, v9

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move-object/from16 v38, v11

    const/4 v11, 0x0

    move-object/from16 v44, v8

    move-wide/from16 v56, v12

    move-object v13, v7

    move-wide/from16 v7, v56

    const/4 v12, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    move-object/from16 v18, v14

    const-wide/16 v14, 0x0

    move/from16 v19, v16

    const/16 v16, 0x0

    move/from16 v20, v17

    const/16 v17, 0x0

    move-object/from16 v21, v18

    move/from16 v22, v19

    const-wide/16 v18, 0x0

    move/from16 v23, v20

    const/16 v20, 0x0

    move-object/from16 v24, v21

    const/16 v21, 0x0

    move/from16 v26, v22

    const/16 v22, 0x0

    move/from16 v31, v23

    const/16 v23, 0x0

    move-object/from16 v32, v24

    const/16 v24, 0x0

    move/from16 v33, v26

    const/16 v26, 0x0

    move-object/from16 p3, v0

    move-object/from16 v49, v32

    move/from16 v50, v33

    move-object/from16 v46, v38

    move-object/from16 v47, v43

    move-object/from16 v48, v44

    const/4 v0, 0x4

    move-object/from16 v38, v37

    move/from16 v37, v31

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    move/from16 v39, v29

    const/4 v5, 0x0

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual/range {p1 .. p1}, Lcj1/r;->c()Lcj1/o;

    move-result-object v6

    invoke-virtual {v6}, Lcj1/o;->e()Ljava/lang/String;

    move-result-object v6

    if-eqz p0, :cond_13

    const v7, 0xaf775ea

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v10, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->b()Lb91/a;

    move-result-object v7

    :goto_12
    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    move-object/from16 v25, v7

    goto :goto_13

    :cond_13
    const v7, 0xaf779aa    # 2.3831E-32f

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v10, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->r()Lb91/a;

    move-result-object v7

    goto :goto_12

    :goto_13
    if-eqz p0, :cond_14

    const v7, 0xaf782ef

    invoke-static {v10, v7, v2, v10, v3}, Lm4/a;->c(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v7

    :goto_14
    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    goto :goto_15

    :cond_14
    const v7, 0xaf786d2

    invoke-static {v10, v7, v2, v10, v3}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v7

    goto :goto_14

    :goto_15
    const/high16 v5, 0x3f000000    # 0.5f

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v27

    const v5, 0x6000c30

    or-int v30, v39, v5

    const v31, 0x2d7fa

    move-object v5, v6

    const/4 v6, 0x0

    move-object/from16 v28, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/16 v22, 0x2

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x0

    invoke-static/range {v5 .. v31}, Lfj1/h;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v28

    invoke-virtual/range {p1 .. p1}, Lcj1/r;->c()Lcj1/o;

    move-result-object v5

    invoke-virtual {v5}, Lcj1/o;->d()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_15

    const v5, 0x53fcda6e

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    const/4 v5, 0x0

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    :goto_16
    const/4 v14, 0x1

    goto :goto_17

    :cond_15
    const v6, 0x53fcda6f

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v2, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->W0()J

    move-result-wide v6

    invoke-virtual {v2, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v8

    sget v31, Lcom/whoop/design/util/TextResource;->$stable:I

    const/16 v33, 0x0

    const v34, 0x7ffff4

    move-object/from16 v27, v10

    move-wide v9, v8

    const/4 v8, 0x0

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

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v28, v27

    const/16 v27, 0x0

    move-object/from16 v30, v28

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v32, 0x0

    invoke-static/range {v5 .. v34}, Lhy0/g1;->j(Lcom/whoop/design/util/TextResource;JLi91/d;JLi2/t;ZLy71/g;Li2/t;FLhy0/o1;Li2/a1;FFLy71/g;Li2/x;FLhy0/c1;Lkd1/o;Ljava/util/List;IILandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v10, v30

    const/4 v5, 0x0

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    goto :goto_16

    :goto_17
    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Lcj1/r;->c()Lcj1/o;

    move-result-object v5

    invoke-virtual {v5}, Lcj1/o;->c()Lkd1/o;

    move-result-object v5

    sget-object v6, Lkd1/o$b;->b:Lkd1/o$b;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_16

    const v5, 0x579f6d93

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    move/from16 v14, v41

    invoke-static {v14, v4}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v10, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/16 v5, 0x18

    int-to-float v5, v5

    int-to-float v6, v0

    mul-float/2addr v5, v6

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/4 v15, 0x0

    const/16 v16, 0xb

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcj1/r;->c()Lcj1/o;

    move-result-object v5

    invoke-virtual {v5}, Lcj1/o;->c()Lkd1/o;

    move-result-object v5

    sget v9, Lkd1/o;->a:I

    move-object/from16 v27, v10

    const/4 v10, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v8, v27

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    move-object v10, v8

    const/16 v13, 0x1b0

    const/16 v14, 0x78

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v27, v10

    const/4 v10, 0x0

    move-object v7, v11

    const/4 v11, 0x0

    move-object/from16 v12, v27

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v12

    const/4 v5, 0x0

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    :goto_18
    const/4 v14, 0x1

    goto :goto_19

    :cond_16
    const/4 v5, 0x0

    const v6, 0x57a57bf0

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    goto :goto_18

    :goto_19
    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    if-eqz p0, :cond_1a

    invoke-virtual/range {p1 .. p1}, Lcj1/r;->e()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1a

    const v5, 0x22d1d5b6

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-static/range {v37 .. v37}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    const/16 v6, 0x36

    invoke-static {v5, v1, v10, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_17

    move-object/from16 v11, v38

    invoke-virtual {v10, v11}, Lp1/q;->l(Lc93/a;)V

    :goto_1a
    move-object/from16 v12, v46

    goto :goto_1b

    :cond_17
    move-object/from16 v11, v38

    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_1a

    :goto_1b
    invoke-static {v10, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v5, v47

    invoke-static {v10, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-nez v8, :cond_18

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v8, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_19

    :cond_18
    move-object/from16 v8, v48

    goto :goto_1d

    :cond_19
    move-object/from16 v8, v48

    :goto_1c
    move-object/from16 v7, v49

    goto :goto_1e

    :goto_1d
    invoke-static {v7, v10, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_1c

    :goto_1e
    invoke-static {v10, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v43, v5

    invoke-virtual/range {p1 .. p1}, Lcj1/r;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v10, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->L()Lb91/a;

    move-result-object v25

    invoke-virtual {v2, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->i()J

    move-result-wide v13

    const/16 v28, 0x0

    const v30, 0x2fffa

    move/from16 v16, v6

    const/4 v6, 0x0

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move-object/from16 v21, v11

    const/4 v11, 0x0

    move-object/from16 v38, v12

    const/4 v12, 0x0

    move-object/from16 v44, v8

    move-wide/from16 v56, v13

    move-object v14, v7

    move-wide/from16 v7, v56

    const/4 v13, 0x0

    move-object/from16 v32, v14

    const-wide/16 v14, 0x0

    move/from16 v45, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    move-object/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v23, v22

    const/16 v22, 0x0

    move-object/from16 v24, v23

    const/16 v23, 0x0

    move-object/from16 v26, v24

    const/16 v24, 0x0

    move-object/from16 v29, v26

    const/16 v26, 0x0

    move-object/from16 v51, v29

    move-object/from16 v55, v32

    move-object/from16 v52, v38

    move/from16 v29, v39

    move-object/from16 v53, v43

    move-object/from16 v54, v44

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    int-to-float v5, v0

    mul-float/2addr v5, v5

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v5, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    invoke-virtual {v5}, Lgz0/m0;->toWhoopIcon()I

    move-result v5

    const/4 v6, 0x6

    invoke-static {v5, v10, v6}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    invoke-virtual {v2, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->i()J

    move-result-wide v8

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    const/4 v6, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v14, 0x1

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    const/4 v5, 0x0

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    goto :goto_1f

    :cond_1a
    move-object/from16 v51, v38

    move-object/from16 v52, v46

    move-object/from16 v53, v47

    move-object/from16 v54, v48

    move-object/from16 v55, v49

    const/4 v5, 0x0

    const v6, 0x22dd25ab

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    :goto_1f
    invoke-virtual/range {p1 .. p1}, Lcj1/r;->h()Lcj1/p;

    move-result-object v13

    if-nez v13, :cond_1b

    const v0, 0x22deb6f8

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    const/4 v14, 0x1

    goto/16 :goto_2a

    :cond_1b
    const v5, 0x22deb6f9

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v0, v0

    move/from16 v6, v35

    invoke-static {v5, v6, v0}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v2, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->q()J

    move-result-wide v2

    sget-object v6, Li2/w0;->a:Li2/v0;

    invoke-static {v5, v2, v3, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-wide/high16 v7, 0x3ff8000000000000L    # 1.5

    double-to-float v3, v7

    mul-float v3, v3, p2

    invoke-static {v2, v3, v3}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static/range {v37 .. v37}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    const/16 v5, 0x36

    invoke-static {v3, v1, v10, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v10, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-eqz v7, :cond_1c

    move-object/from16 v9, v51

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    :goto_20
    move-object/from16 v12, v52

    goto :goto_21

    :cond_1c
    move-object/from16 v9, v51

    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_20

    :goto_21
    invoke-static {v10, v12, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v53

    invoke-static {v10, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v10, Lp1/q;->S:Z

    if-nez v5, :cond_1d

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1e

    :cond_1d
    move-object/from16 v8, v54

    goto :goto_23

    :cond_1e
    move-object/from16 v8, v54

    :goto_22
    move-object/from16 v14, v55

    goto :goto_24

    :goto_23
    invoke-static {v3, v10, v3, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_22

    :goto_24
    invoke-static {v10, v14, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v13}, Lcj1/p;->b()Lgz0/m0;

    move-result-object v2

    if-nez v2, :cond_1f

    const v0, -0x4a57e49d

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    const/4 v5, 0x0

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    move-object/from16 p0, v13

    const/4 v14, 0x1

    goto/16 :goto_29

    :cond_1f
    const/4 v5, 0x0

    const v3, -0x4a57e49c

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    const/4 v3, 0x5

    int-to-float v3, v3

    mul-float/2addr v3, v0

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move/from16 v7, v50

    invoke-static {v3, v7, v0}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v13}, Lcj1/p;->d()Lcj1/q;

    move-result-object v7

    move-object/from16 p0, v13

    move-object/from16 v18, v14

    invoke-static {v7, v10, v5}, Lfj1/e;->l(Lcj1/q;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v13

    invoke-static {v3, v13, v14, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Lb2/e;->E:Lb2/m;

    invoke-static {v6, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_20

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_25

    :cond_20
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_25
    invoke-static {v10, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_22

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    goto :goto_27

    :cond_21
    :goto_26
    move-object/from16 v14, v18

    goto :goto_28

    :cond_22
    :goto_27
    invoke-static {v5, v10, v5, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_26

    :goto_28
    invoke-static {v10, v14, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x3

    int-to-float v1, v1

    mul-float/2addr v1, v0

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    const/4 v6, 0x6

    invoke-static {v0, v10, v6}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcj1/p;->d()Lcj1/q;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v10, v1}, Lfj1/e;->m(Lcj1/q;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    const/4 v6, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v14, 0x1

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    :goto_29
    new-instance v7, Ld91/c$a;

    new-instance v0, Ly3/f;

    move/from16 v6, v37

    invoke-direct {v0, v6}, Ly3/f;-><init>(F)V

    const/4 v1, 0x0

    invoke-direct {v7, v1, v0, v14, v1}, Ld91/c$a;-><init>(Lb2/g;Ly3/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Ld91/c$b;

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    double-to-float v0, v2

    mul-float v0, v0, p2

    new-instance v2, Ly3/f;

    invoke-direct {v2, v0}, Ly3/f;-><init>(F)V

    move-object/from16 v0, p3

    invoke-direct {v8, v0, v2, v1}, Ld91/c$b;-><init>(Lb2/f;Ly3/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lej1/h;

    const/16 v1, 0xd

    move-object/from16 v2, p0

    invoke-direct {v0, v2, v1}, Lej1/h;-><init>(Ljava/lang/Object;I)V

    const v1, 0x182c196f

    invoke-static {v1, v10, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    sget v0, Ld91/c$a;->c:I

    const/16 v36, 0x6

    shl-int/lit8 v0, v0, 0x6

    or-int/lit16 v0, v0, 0x6006

    sget v1, Ld91/c$b;->c:I

    shl-int/lit8 v1, v1, 0x9

    or-int v11, v0, v1

    const/4 v12, 0x2

    const v5, 0x3fa66666    # 1.3f

    const/4 v6, 0x0

    invoke-static/range {v5 .. v12}, Ld91/d;->b(FLandroidx/compose/ui/Modifier;Ld91/c;Ld91/c;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    const/4 v14, 0x1

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    const/4 v5, 0x0

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    :goto_2a
    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    goto :goto_2b

    :cond_23
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_2b
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final j(Lcj1/p;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 31

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual/range {p0 .. p0}, Lcj1/p;->c()Ljava/lang/String;

    move-result-object v4

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v2, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->b()Lb91/a;

    move-result-object v24

    invoke-virtual/range {p0 .. p0}, Lcj1/p;->d()Lcj1/q;

    move-result-object v5

    sget-object v6, Lcj1/q;->ERROR:Lcj1/q;

    if-ne v5, v6, :cond_1

    const v5, -0x42746567

    invoke-static {v2, v5, v0, v2, v1}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v5

    :goto_1
    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    move-wide v6, v5

    goto :goto_2

    :cond_1
    const v5, -0x4274612a

    invoke-static {v2, v5, v0, v2, v1}, Lm4/a;->c(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v5

    goto :goto_1

    :goto_2
    sget v30, Lb91/a;->d:I

    shl-int/lit8 v28, v30, 0x12

    const v29, 0x2fffa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v2

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual/range {p0 .. p0}, Lcj1/p;->a()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_2

    const v0, -0xc167ed3    # -3.700028E31f

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_2
    const v5, -0xc167ed2    # -3.7000282E31f

    invoke-virtual {v2, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v2, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->b()Lb91/a;

    move-result-object v24

    invoke-virtual {v0, v2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b1()J

    move-result-wide v6

    shl-int/lit8 v28, v30, 0x12

    const v29, 0x2fffa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v2

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final k(Landroidx/compose/ui/Modifier;Lcj1/r;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lfj1/e;->f(Landroidx/compose/ui/Modifier;Lcj1/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lcj1/q;Landroidx/compose/runtime/Composer;I)J
    .locals 3

    sget-object p2, Lfj1/e$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p2, p0

    const/4 p2, 0x1

    const/4 v0, 0x0

    if-eq p0, p2, :cond_2

    const/4 p2, 0x2

    if-eq p0, p2, :cond_2

    const/4 p2, 0x3

    if-eq p0, p2, :cond_1

    const/4 p2, 0x4

    if-ne p0, p2, :cond_0

    check-cast p1, Lp1/q;

    const p0, -0x7029fdd7

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    sget p2, Lx81/d;->b:I

    invoke-static {p0, p1, p2, v0}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide p0

    goto :goto_0

    :cond_0
    const p0, -0x702a1e0b

    check-cast p1, Lp1/q;

    invoke-static {p0, p1, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_1
    check-cast p1, Lp1/q;

    const p0, -0x702a0829

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    sget p2, Lx81/d;->b:I

    invoke-virtual {p0, p1, p2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->g()J

    move-result-wide v1

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    move-wide p0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lp1/q;

    const p0, -0x702a1097

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    sget p2, Lx81/d;->b:I

    invoke-static {p0, p1, p2, v0}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide p0

    :goto_0
    return-wide p0
.end method

.method private static final m(Lcj1/q;Landroidx/compose/runtime/Composer;I)J
    .locals 3

    sget-object p2, Lfj1/e$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p2, p0

    const/4 p2, 0x1

    const/4 v0, 0x0

    if-eq p0, p2, :cond_2

    const/4 p2, 0x2

    if-eq p0, p2, :cond_2

    const/4 p2, 0x3

    if-eq p0, p2, :cond_1

    const/4 p2, 0x4

    if-ne p0, p2, :cond_0

    check-cast p1, Lp1/q;

    const p0, -0x431a5637

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    sget p2, Lx81/d;->b:I

    invoke-virtual {p0, p1, p2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->Z()J

    move-result-wide v1

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_0
    const p0, -0x431a762d

    check-cast p1, Lp1/q;

    invoke-static {p0, p1, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_1
    check-cast p1, Lp1/q;

    const p0, -0x431a6058

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    sget p2, Lx81/d;->b:I

    invoke-virtual {p0, p1, p2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->f()J

    move-result-wide v1

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_2
    check-cast p1, Lp1/q;

    const p0, -0x431a68c4

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    sget p2, Lx81/d;->b:I

    invoke-static {p0, p1, p2, v0}, Lih0/d0;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v1

    :goto_0
    return-wide v1
.end method
