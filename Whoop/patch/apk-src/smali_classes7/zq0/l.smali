.class public final Lzq0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/a0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\'\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u00ab\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u001a\u0010&\u001a\u00020%2\u0008\u0010$\u001a\u0004\u0018\u00010#H\u00d6\u0003\u00a2\u0006\u0004\u0008&\u0010\'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008+\u0010,\u001a\u0004\u0008-\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u0010,\u001a\u0004\u0008.\u0010\"R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008/\u00100\u001a\u0004\u00081\u00102R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u00083\u00100\u001a\u0004\u00083\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u00084\u00105\u001a\u0004\u00086\u00107R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u00086\u00108\u001a\u0004\u00089\u0010:R\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008;\u0010<\u001a\u0004\u0008=\u0010>R\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008?\u0010<\u001a\u0004\u0008@\u0010>R\u001d\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008@\u0010<\u001a\u0004\u0008?\u0010>R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008=\u0010A\u001a\u0004\u0008+\u0010BR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006\u00a2\u0006\u000c\n\u0004\u00081\u0010C\u001a\u0004\u00084\u0010DR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006\u00a2\u0006\u000c\n\u0004\u00089\u0010E\u001a\u0004\u0008(\u0010FR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010G\u001a\u0004\u0008H\u0010IR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008H\u0010J\u001a\u0004\u0008;\u0010K\u00a8\u0006L"
    }
    d2 = {
        "Lzq0/l;",
        "Lm91/a0;",
        "",
        "id",
        "",
        "progressSegmentCount",
        "activeSegmentIndex",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "nextAction",
        "backAction",
        "Lkd1/o;",
        "backgroundImage",
        "",
        "photoRevealFraction",
        "",
        "Lm91/u;",
        "items",
        "headerOverlayItems",
        "footerOverlayItems",
        "Lcom/whoop/design/models/AchievementsBackgroundStyle;",
        "achievementBackgroundStyle",
        "Lm51/a;",
        "background",
        "Ly81/e;",
        "accentColor",
        "Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;",
        "securityPolicy",
        "Lxq0/a;",
        "borderStyle",
        "<init>",
        "(Ljava/lang/String;IILcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lkd1/o;FLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Lm51/a;Ly81/e;Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;Lxq0/a;)V",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/String;",
        "getId",
        "b",
        "I",
        "n",
        "c",
        "d",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "l",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "e",
        "f",
        "Lkd1/o;",
        "g",
        "()Lkd1/o;",
        "F",
        "m",
        "()F",
        "h",
        "Ljava/util/List;",
        "k",
        "()Ljava/util/List;",
        "i",
        "j",
        "Lcom/whoop/design/models/AchievementsBackgroundStyle;",
        "()Lcom/whoop/design/models/AchievementsBackgroundStyle;",
        "Lm51/a;",
        "()Lm51/a;",
        "Ly81/e;",
        "()Ly81/e;",
        "Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;",
        "o",
        "()Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;",
        "Lxq0/a;",
        "()Lxq0/a;",
        "community-everyday-stats_release"
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
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:I

.field private final d:Lcom/whoop/navigation/models/GenericInteraction;

.field private final e:Lcom/whoop/navigation/models/GenericInteraction;

.field private final f:Lkd1/o;

.field private final g:F

.field private final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Lcom/whoop/design/models/AchievementsBackgroundStyle;

.field private final l:Lm51/a;

.field private final m:Ly81/e;

.field private final n:Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;

.field private final o:Lxq0/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;IILcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lkd1/o;FLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Lm51/a;Ly81/e;Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;Lxq0/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Lkd1/o;",
            "F",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;",
            "Lcom/whoop/design/models/AchievementsBackgroundStyle;",
            "Lm51/a;",
            "Ly81/e;",
            "Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;",
            "Lxq0/a;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p15

    const-string v1, "id"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "nextAction"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "items"

    invoke-static {p8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "headerOverlayItems"

    invoke-static {p9, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "footerOverlayItems"

    invoke-static {p10, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "borderStyle"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzq0/l;->a:Ljava/lang/String;

    iput p2, p0, Lzq0/l;->b:I

    iput p3, p0, Lzq0/l;->c:I

    iput-object p4, p0, Lzq0/l;->d:Lcom/whoop/navigation/models/GenericInteraction;

    iput-object p5, p0, Lzq0/l;->e:Lcom/whoop/navigation/models/GenericInteraction;

    iput-object p6, p0, Lzq0/l;->f:Lkd1/o;

    iput p7, p0, Lzq0/l;->g:F

    iput-object p8, p0, Lzq0/l;->h:Ljava/util/List;

    iput-object p9, p0, Lzq0/l;->i:Ljava/util/List;

    iput-object p10, p0, Lzq0/l;->j:Ljava/util/List;

    iput-object p11, p0, Lzq0/l;->k:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    iput-object p12, p0, Lzq0/l;->l:Lm51/a;

    move-object p1, p13

    iput-object p1, p0, Lzq0/l;->m:Ly81/e;

    move-object/from16 p1, p14

    iput-object p1, p0, Lzq0/l;->n:Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;

    iput-object v0, p0, Lzq0/l;->o:Lxq0/a;

    return-void
.end method


# virtual methods
.method public final a()Ly81/e;
    .locals 1

    iget-object v0, p0, Lzq0/l;->m:Ly81/e;

    return-object v0
.end method

.method public final b()Lcom/whoop/design/models/AchievementsBackgroundStyle;
    .locals 1

    iget-object v0, p0, Lzq0/l;->k:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lzq0/l;->c:I

    return v0
.end method

.method public final e()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lzq0/l;->e:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lzq0/l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lzq0/l;

    iget-object v1, p0, Lzq0/l;->a:Ljava/lang/String;

    iget-object v3, p1, Lzq0/l;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lzq0/l;->b:I

    iget v3, p1, Lzq0/l;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lzq0/l;->c:I

    iget v3, p1, Lzq0/l;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lzq0/l;->d:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lzq0/l;->d:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lzq0/l;->e:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lzq0/l;->e:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lzq0/l;->f:Lkd1/o;

    iget-object v3, p1, Lzq0/l;->f:Lkd1/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lzq0/l;->g:F

    iget v3, p1, Lzq0/l;->g:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lzq0/l;->h:Ljava/util/List;

    iget-object v3, p1, Lzq0/l;->h:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lzq0/l;->i:Ljava/util/List;

    iget-object v3, p1, Lzq0/l;->i:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lzq0/l;->j:Ljava/util/List;

    iget-object v3, p1, Lzq0/l;->j:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lzq0/l;->k:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    iget-object v3, p1, Lzq0/l;->k:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lzq0/l;->l:Lm51/a;

    iget-object v3, p1, Lzq0/l;->l:Lm51/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lzq0/l;->m:Ly81/e;

    iget-object v3, p1, Lzq0/l;->m:Ly81/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lzq0/l;->n:Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;

    iget-object v3, p1, Lzq0/l;->n:Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lzq0/l;->o:Lxq0/a;

    iget-object p1, p1, Lzq0/l;->o:Lxq0/a;

    if-eq v1, p1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public final f()Lm51/a;
    .locals 1

    iget-object v0, p0, Lzq0/l;->l:Lm51/a;

    return-object v0
.end method

.method public final g()Lkd1/o;
    .locals 1

    iget-object v0, p0, Lzq0/l;->f:Lkd1/o;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzq0/l;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Lxq0/a;
    .locals 1

    iget-object v0, p0, Lzq0/l;->o:Lxq0/a;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lzq0/l;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lzq0/l;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lzq0/l;->c:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lzq0/l;->d:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-virtual {v2}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lzq0/l;->e:Lcom/whoop/navigation/models/GenericInteraction;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lzq0/l;->f:Lkd1/o;

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lzq0/l;->g:F

    invoke-static {v0, v2, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lzq0/l;->h:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lzq0/l;->i:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lzq0/l;->j:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lzq0/l;->k:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lzq0/l;->l:Lm51/a;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lzq0/l;->m:Ly81/e;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lzq0/l;->n:Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lzq0/l;->o:Lxq0/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzq0/l;->j:Ljava/util/List;

    return-object v0
.end method

.method public final j()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzq0/l;->i:Ljava/util/List;

    return-object v0
.end method

.method public final k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzq0/l;->h:Ljava/util/List;

    return-object v0
.end method

.method public final l()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lzq0/l;->d:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final m()F
    .locals 1

    iget v0, p0, Lzq0/l;->g:F

    return v0
.end method

.method public final n()I
    .locals 1

    iget v0, p0, Lzq0/l;->b:I

    return v0
.end method

.method public final o()Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;
    .locals 1

    iget-object v0, p0, Lzq0/l;->n:Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lzq0/l;->a:Ljava/lang/String;

    iget v2, v0, Lzq0/l;->b:I

    iget v3, v0, Lzq0/l;->c:I

    iget-object v4, v0, Lzq0/l;->d:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v5, v0, Lzq0/l;->e:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v6, v0, Lzq0/l;->f:Lkd1/o;

    iget v7, v0, Lzq0/l;->g:F

    iget-object v8, v0, Lzq0/l;->h:Ljava/util/List;

    iget-object v9, v0, Lzq0/l;->i:Ljava/util/List;

    iget-object v10, v0, Lzq0/l;->j:Ljava/util/List;

    iget-object v11, v0, Lzq0/l;->k:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    iget-object v12, v0, Lzq0/l;->l:Lm51/a;

    iget-object v13, v0, Lzq0/l;->m:Ly81/e;

    iget-object v14, v0, Lzq0/l;->n:Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;

    iget-object v15, v0, Lzq0/l;->o:Lxq0/a;

    const-string v0, ", progressSegmentCount="

    move-object/from16 v16, v15

    const-string v15, ", activeSegmentIndex="

    move-object/from16 v17, v14

    const-string v14, "CommunitySnapshotContainerState(id="

    invoke-static {v2, v14, v1, v0, v15}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", nextAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", backAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", backgroundImage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", photoRevealFraction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", items="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", headerOverlayItems="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", footerOverlayItems="

    const-string v2, ", achievementBackgroundStyle="

    invoke-static {v0, v9, v1, v10, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", background="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", accentColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", securityPolicy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", borderStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
