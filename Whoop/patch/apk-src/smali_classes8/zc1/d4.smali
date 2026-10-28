.class public abstract Lzc1/d4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a/\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u000e\"\u0014\u0010\u0013\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000e\"\u001a\u0010\u0019\u001a\u00020\u00148\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u001a\u0010\u001c\u001a\u00020\u00148\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0016\u001a\u0004\u0008\u001b\u0010\u0018\"\u001a\u0010\u001f\u001a\u00020\u00148\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0016\u001a\u0004\u0008\u001e\u0010\u0018\u00a8\u0006 "
    }
    d2 = {
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "id",
        "title",
        "glyph",
        "Lm91/u;",
        "trailing",
        "Lh31/q;",
        "d",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;)Lh31/q;",
        "Lc41/w;",
        "a",
        "Lc41/w;",
        "sleepActivityTile",
        "runningActivityTile",
        "c",
        "weightliftingActivityTile",
        "napToProcessActivityTile",
        "Lv71/i;",
        "e",
        "Lv71/i;",
        "getStandardItemsCard",
        "()Lv71/i;",
        "standardItemsCard",
        "f",
        "getAiCoachItemsCard",
        "aiCoachItemsCard",
        "g",
        "getEducationCtaItemsCard",
        "educationCtaItemsCard",
        "design-showcase_release"
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
.field private static final a:Lc41/w;

.field private static final b:Lc41/w;

.field private static final c:Lc41/w;

.field private static final d:Lc41/w;

.field private static final e:Lv71/i;

.field private static final f:Lv71/i;

.field private static final g:Lv71/i;


# direct methods
.method static constructor <clinit>()V
    .locals 38

    new-instance v0, Lc41/w;

    const-string v1, "SLEEP"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v3, Lc41/o;

    sget-object v5, Ly81/f;->SLEEP:Ly81/f;

    new-instance v6, Lkd1/o$a;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->l()Lgz0/c0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/c0;->j()I

    move-result v1

    invoke-direct {v6, v1}, Lkd1/o$a;-><init>(I)V

    const-string v1, "7:42"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const/16 v9, 0x11

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Lc41/o;-><init>(ZLy81/f;Lkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lc41/x$c;

    const-string v1, "11:08pm"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string v6, "6:50am"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-direct {v4, v1, v6, v5}, Lc41/x$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    sget-object v5, Lcom/whoop/navigation/ActivityDetailType;->SLEEP:Lcom/whoop/navigation/ActivityDetailType;

    const/16 v15, 0x3fe1

    const/16 v16, 0x0

    const/4 v1, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v0 .. v16}, Lc41/w;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lc41/o;Lc41/x;Lcom/whoop/navigation/ActivityDetailType;Lcom/whoop/service/network/model/cycles/Period;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/cycles/Activity;Lc41/n1;ZLc41/g2;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzc1/d4;->a:Lc41/w;

    new-instance v6, Lc41/w;

    const-string v1, "RUNNING"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    new-instance v9, Lc41/o;

    sget-object v11, Ly81/f;->STRAIN:Ly81/f;

    new-instance v12, Lkd1/o$a;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->b()Lgz0/c;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/c;->e()I

    move-result v1

    invoke-direct {v12, v1}, Lkd1/o$a;-><init>(I)V

    const-string v1, "11.4"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/16 v15, 0x11

    const/4 v10, 0x0

    invoke-direct/range {v9 .. v16}, Lc41/o;-><init>(ZLy81/f;Lkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v11

    new-instance v10, Lc41/x$c;

    const-string v2, "7:15am"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v3, "7:58am"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v10, v2, v3, v1}, Lc41/x$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    sget-object v11, Lcom/whoop/navigation/ActivityDetailType;->CARDIO:Lcom/whoop/navigation/ActivityDetailType;

    const/16 v21, 0x3fe1

    const/16 v22, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v6 .. v22}, Lc41/w;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lc41/o;Lc41/x;Lcom/whoop/navigation/ActivityDetailType;Lcom/whoop/service/network/model/cycles/Period;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/cycles/Activity;Lc41/n1;ZLc41/g2;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v6, Lzc1/d4;->b:Lc41/w;

    new-instance v7, Lc41/w;

    const-string v2, "WEIGHTLIFTING"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    new-instance v10, Lc41/o;

    new-instance v13, Lkd1/o$a;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->b()Lgz0/c;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/c;->f()I

    move-result v2

    invoke-direct {v13, v2}, Lkd1/o$a;-><init>(I)V

    const-string v2, "8.6"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    const/16 v16, 0x11

    const/4 v11, 0x0

    move-object v12, v1

    invoke-direct/range {v10 .. v17}, Lc41/o;-><init>(ZLy81/f;Lkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Lc41/x$c;

    const-string v2, "12:30pm"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v3, "1:25pm"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v11, v2, v3, v1}, Lc41/x$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    sget-object v12, Lcom/whoop/navigation/ActivityDetailType;->WEIGHTLIFTING_MSK:Lcom/whoop/navigation/ActivityDetailType;

    const/16 v22, 0x3fe1

    const/16 v23, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v7 .. v23}, Lc41/w;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lc41/o;Lc41/x;Lcom/whoop/navigation/ActivityDetailType;Lcom/whoop/service/network/model/cycles/Period;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/cycles/Activity;Lc41/n1;ZLc41/g2;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v7

    sput-object v1, Lzc1/d4;->c:Lc41/w;

    new-instance v7, Lc41/w;

    const-string v2, "NAP"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    new-instance v10, Lc41/o;

    new-instance v13, Lkd1/o$a;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->l()Lgz0/c0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/c0;->i()I

    move-result v2

    invoke-direct {v13, v2}, Lkd1/o$a;-><init>(I)V

    const/16 v16, 0x1a

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-direct/range {v10 .. v17}, Lc41/o;-><init>(ZLy81/f;Lkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Lc41/x$a;

    const-string v2, "PROCESS"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    sget-object v14, Lc41/i;->PROCESS_NOW:Lc41/i;

    const/16 v17, 0x1a

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v11 .. v18}, Lc41/x$a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Object;Lc41/i;ZLi91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    move-object v12, v5

    invoke-direct/range {v7 .. v23}, Lc41/w;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lc41/o;Lc41/x;Lcom/whoop/navigation/ActivityDetailType;Lcom/whoop/service/network/model/cycles/Period;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/cycles/Activity;Lc41/n1;ZLc41/g2;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v7, Lzc1/d4;->d:Lc41/w;

    new-instance v8, Lv71/i;

    new-instance v9, Lv71/e;

    sget-object v2, Lgz0/m0;->TINY_EXPAND:Lgz0/m0;

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v12

    sget-object v3, Lgz0/m0;->ACTIVITY:Lgz0/m0;

    invoke-virtual {v3}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/16 v16, 0x2

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v13, "TODAY\'S ACTIVITIES"

    sget-object v24, Lm83/y;->w:Lm83/y;

    move-object/from16 v15, v24

    invoke-direct/range {v9 .. v17}, Lv71/e;-><init>(Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;ILjava/lang/String;Ljava/lang/Integer;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v0, v6, v7}, [Lc41/w;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    const/16 v15, 0x36

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v8 .. v16}, Lv71/i;-><init>(Lv71/e;Lv71/c;Lv71/a;Ljava/util/List;Ljava/util/List;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v8, Lzc1/d4;->e:Lv71/i;

    new-instance v18, Lv71/e;

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v21

    sget-object v4, Lgz0/m0;->AI_SPARKLE:Lgz0/m0;

    invoke-virtual {v4}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v23

    const/16 v25, 0x2

    const/16 v26, 0x0

    const/16 v19, 0x0

    const-string v22, "COACH MOMENT"

    invoke-direct/range {v18 .. v26}, Lv71/e;-><init>(Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;ILjava/lang/String;Ljava/lang/Integer;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lsz0/c0;

    sget-object v7, Lb91/c;->B1:Lb91/c;

    sget-object v8, Ly81/f;->WHITE_70:Ly81/f;

    const/16 v16, 0x3f0

    const-string v6, "Your HRV is up 12% this week. You\'re primed for a harder session today, so try to lock in your training before 6 pm."

    const/4 v9, 0x5

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v5 .. v17}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v5

    move-object/from16 v27, v7

    move-object/from16 v28, v8

    new-instance v5, Lny0/l;

    sget-object v7, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    const/16 v12, 0x3c

    const-string v6, "items-card-gallery-strength-chevron"

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v13}, Lny0/l;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;ZLi91/a;Lny0/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v2, "items-card-gallery-strength"

    const-string v3, "Full Body Strength Training"

    const-string v6, "\ud83c\udfcb\ufe0f"

    invoke-static {v2, v3, v6, v5}, Lzc1/d4;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;)Lh31/q;

    move-result-object v11

    new-instance v2, Lny0/l;

    const/16 v9, 0x3c

    const-string v3, "items-card-gallery-sleep-coach"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v10}, Lny0/l;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;ZLi91/a;Lny0/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v3, "items-card-gallery-sleep"

    const-string v4, "Asleep by 10:45 pm"

    const-string v5, "\ud83d\ude34"

    invoke-static {v3, v4, v5, v2}, Lzc1/d4;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;)Lh31/q;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Lm91/u;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v11, v3, v0

    const/4 v5, 0x2

    aput-object v2, v3, v5

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    sget-object v12, Lv71/a;->AI_COACH:Lv71/a;

    new-instance v9, Lv71/i;

    const/16 v16, 0x32

    const/4 v11, 0x0

    const/4 v14, 0x0

    move-object/from16 v10, v18

    invoke-direct/range {v9 .. v17}, Lv71/i;-><init>(Lv71/e;Lv71/c;Lv71/a;Ljava/util/List;Ljava/util/List;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v9, Lzc1/d4;->f:Lv71/i;

    new-instance v10, Lv71/i;

    new-instance v18, Lv71/e;

    new-instance v20, Lcom/whoop/navigation/models/GenericInteraction;

    const/16 v35, 0x1f

    const/16 v36, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    move-object/from16 v29, v20

    invoke-direct/range {v29 .. v36}, Lcom/whoop/navigation/models/GenericInteraction;-><init>(Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v2, Lgz0/m0;->EDUCATION:Lgz0/m0;

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v21

    const-string v22, "ONE REP MAX (1RM)"

    const/16 v23, 0x0

    invoke-direct/range {v18 .. v24}, Lv71/e;-><init>(Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;ILjava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V

    new-instance v25, Lsz0/c0;

    const/16 v36, 0x3f0

    const/16 v37, 0x0

    const-string v26, "Your 1RM is the most weight you can lift for a single rep. WHOOP estimates it from your logged sets so you can track strength gains over time."

    const/16 v29, 0x5

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-direct/range {v25 .. v37}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-array v2, v5, [Lm91/u;

    aput-object v25, v2, v4

    aput-object v1, v2, v0

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    const/16 v17, 0x36

    move-object/from16 v11, v18

    const/16 v18, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v10 .. v18}, Lv71/i;-><init>(Lv71/e;Lv71/c;Lv71/a;Ljava/util/List;Ljava/util/List;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v10, Lzc1/d4;->g:Lv71/i;

    return-void
.end method

.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/d4;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    move-object v4, p0

    check-cast v4, Lp1/q;

    const p0, 0x15a9e1bc

    invoke-virtual {v4, p0}, Lp1/q;->g0(I)Lp1/q;

    const/4 p0, 0x1

    if-eqz p1, :cond_0

    move v0, p0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x2

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x3

    int-to-float v1, v1

    mul-float/2addr v1, v2

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    sget-object v2, Lb2/e;->M:Lb2/k;

    const/4 v7, 0x6

    invoke-static {v1, v2, v4, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v2, v4, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {v4, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v4, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v4, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v4, Lp1/q;->S:Z

    if-nez v3, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    invoke-static {v2, v4, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v4, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v0, "Standard"

    invoke-static {v0, v4, v7}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lzc1/d4;->e:Lv71/i;

    sget v5, Lv71/i;->g:I

    const/16 v6, 0xe

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const-string v0, "AI Coach"

    invoke-static {v0, v4, v7}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lzc1/d4;->f:Lv71/i;

    invoke-static/range {v0 .. v6}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const-string v0, "Education CTA"

    invoke-static {v0, v4, v7}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lzc1/d4;->g:Lv71/i;

    invoke-static/range {v0 .. v6}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, p0}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_5

    new-instance v0, Lzc1/s3;

    const/16 v1, 0xb

    invoke-direct {v0, p1, v1}, Lzc1/s3;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/d4;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;)Lh31/q;
    .locals 17

    new-instance v0, Lh31/q;

    sget-object v2, Lh31/n;->UNCOMMITTED:Lh31/n;

    new-instance v3, Luy0/b;

    const-string v1, "-emoji"

    move-object/from16 v9, p0

    invoke-static {v9, v1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v1, 0x6

    int-to-float v1, v1

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float v6, v1, v5

    const/high16 v7, 0x41a20000    # 20.25f

    const/4 v8, 0x0

    move-object/from16 v5, p2

    invoke-direct/range {v3 .. v8}, Luy0/b;-><init>(Ljava/lang/String;Ljava/lang/String;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Li31/g;

    const/16 v15, 0x73c

    const/16 v16, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v5, p1

    move-object/from16 v10, p3

    move-object v11, v3

    move-object v3, v1

    invoke-direct/range {v3 .. v16}, Li31/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lm91/u;Lkd1/o;Ljava/util/List;Lm91/u;Lm91/u;ZZLcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v9, 0xd8

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v10}, Lh31/q;-><init>(Ljava/lang/String;Lh31/n;Lm91/u;Ljava/util/List;Lm91/u;ZZLh31/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
