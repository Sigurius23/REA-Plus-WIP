.class public final Lg80/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfy1/k;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0081\u0008\u0018\u00002\u00020\u0001BG\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\n2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001d\u001a\u0004\u0008\u0019\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008\u001f\u0010)R\u0017\u0010\u000c\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008*\u0010(\u001a\u0004\u0008#\u0010)R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010-\u00a8\u0006/"
    }
    d2 = {
        "Lg80/d;",
        "Lfy1/k;",
        "Lf70/q0;",
        "memberInfo",
        "Lg80/g;",
        "bffScreenContainerState",
        "Lg80/i;",
        "loginErrorState",
        "Lg80/j;",
        "loginViewState",
        "",
        "isFullScreenError",
        "isFullScreenLoading",
        "<init>",
        "(Lf70/q0;Lg80/g;Lg80/i;Lg80/j;ZZ)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "b",
        "Lf70/q0;",
        "c",
        "()Lf70/q0;",
        "Lg80/g;",
        "()Lg80/g;",
        "d",
        "Lg80/i;",
        "getLoginErrorState",
        "()Lg80/i;",
        "e",
        "Lg80/j;",
        "getLoginViewState",
        "()Lg80/j;",
        "f",
        "Z",
        "()Z",
        "g",
        "Lcom/whoop/metrics/common/ScreenState;",
        "getState",
        "()Lcom/whoop/metrics/common/ScreenState;",
        "state",
        "activation_release"
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
.field private final b:Lf70/q0;

.field private final c:Lg80/g;

.field private final d:Lg80/i;

.field private final e:Lg80/j;

.field private final f:Z

.field private final g:Z


# direct methods
.method public constructor <init>(Lf70/q0;Lg80/g;Lg80/i;Lg80/j;ZZ)V
    .locals 1

    const-string v0, "memberInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loginViewState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lg80/d;->b:Lf70/q0;

    .line 3
    iput-object p2, p0, Lg80/d;->c:Lg80/g;

    .line 4
    iput-object p3, p0, Lg80/d;->d:Lg80/i;

    .line 5
    iput-object p4, p0, Lg80/d;->e:Lg80/j;

    .line 6
    iput-boolean p5, p0, Lg80/d;->f:Z

    .line 7
    iput-boolean p6, p0, Lg80/d;->g:Z

    return-void
.end method

.method public synthetic constructor <init>(Lf70/q0;Lg80/g;Lg80/i;Lg80/j;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 34

    and-int/lit8 v0, p7, 0x1

    if-eqz v0, :cond_0

    .line 8
    new-instance v1, Lf70/q0;

    const v32, 0x3fffffff    # 1.9999999f

    const/16 v33, 0x0

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

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v1 .. v33}, Lf70/q0;-><init>(Ld70/c;Ld70/e;Ld70/d;Ld70/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ld70/b;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp90/e;Lr80/a;Lcom/whoop/activation/domain/models/steps/CommitmentType;Ljava/lang/Integer;Ljava/util/List;ZZZLjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/domain/model/UnitSystem;IZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v0, p7, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    move-object v0, v2

    goto :goto_1

    :cond_1
    move-object/from16 v0, p2

    :goto_1
    and-int/lit8 v3, p7, 0x4

    if-eqz v3, :cond_2

    move-object v3, v2

    goto :goto_2

    :cond_2
    move-object/from16 v3, p3

    :goto_2
    and-int/lit8 v4, p7, 0x8

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    .line 9
    new-instance v4, Lg80/j;

    const/4 v6, 0x3

    invoke-direct {v4, v2, v5, v6, v2}, Lg80/j;-><init>(Lg80/i;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_3
    move-object/from16 v4, p4

    :goto_3
    and-int/lit8 v2, p7, 0x10

    if-eqz v2, :cond_4

    move v2, v5

    goto :goto_4

    :cond_4
    move/from16 v2, p5

    :goto_4
    and-int/lit8 v6, p7, 0x20

    if-eqz v6, :cond_5

    move/from16 p7, v5

    :goto_5
    move-object/from16 p1, p0

    move-object/from16 p3, v0

    move-object/from16 p2, v1

    move/from16 p6, v2

    move-object/from16 p4, v3

    move-object/from16 p5, v4

    goto :goto_6

    :cond_5
    move/from16 p7, p6

    goto :goto_5

    .line 10
    :goto_6
    invoke-direct/range {p1 .. p7}, Lg80/d;-><init>(Lf70/q0;Lg80/g;Lg80/i;Lg80/j;ZZ)V

    return-void
.end method


# virtual methods
.method public final b()Lg80/g;
    .locals 1

    iget-object v0, p0, Lg80/d;->c:Lg80/g;

    return-object v0
.end method

.method public final c()Lf70/q0;
    .locals 1

    iget-object v0, p0, Lg80/d;->b:Lf70/q0;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lg80/d;->f:Z

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lg80/d;->g:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lg80/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lg80/d;

    iget-object v1, p0, Lg80/d;->b:Lf70/q0;

    iget-object v3, p1, Lg80/d;->b:Lf70/q0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lg80/d;->c:Lg80/g;

    iget-object v3, p1, Lg80/d;->c:Lg80/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lg80/d;->d:Lg80/i;

    iget-object v3, p1, Lg80/d;->d:Lg80/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lg80/d;->e:Lg80/j;

    iget-object v3, p1, Lg80/d;->e:Lg80/j;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lg80/d;->f:Z

    iget-boolean v3, p1, Lg80/d;->f:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lg80/d;->g:Z

    iget-boolean p1, p1, Lg80/d;->g:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public getState()Lcom/whoop/metrics/common/ScreenState;
    .locals 2

    iget-boolean v0, p0, Lg80/d;->g:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->LOADING:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_0
    iget-object v1, p0, Lg80/d;->d:Lg80/i;

    if-nez v1, :cond_3

    iget-boolean v1, p0, Lg80/d;->f:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lg80/d;->c:Lg80/g;

    if-eqz v1, :cond_2

    if-nez v0, :cond_2

    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->SUCCESS:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_2
    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->UNKNOWN:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_3
    :goto_0
    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->ERROR:Lcom/whoop/metrics/common/ScreenState;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lg80/d;->b:Lf70/q0;

    invoke-virtual {v0}, Lf70/q0;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lg80/d;->c:Lg80/g;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lg80/g;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lg80/d;->d:Lg80/i;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lg80/i;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v2, p0, Lg80/d;->e:Lg80/j;

    invoke-virtual {v2}, Lg80/j;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lg80/d;->f:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lg80/d;->g:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lg80/d;->b:Lf70/q0;

    iget-object v1, p0, Lg80/d;->c:Lg80/g;

    iget-object v2, p0, Lg80/d;->d:Lg80/i;

    iget-object v3, p0, Lg80/d;->e:Lg80/j;

    iget-boolean v4, p0, Lg80/d;->f:Z

    iget-boolean v5, p0, Lg80/d;->g:Z

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "ActivationState(memberInfo="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bffScreenContainerState="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", loginErrorState="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", loginViewState="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isFullScreenError="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isFullScreenLoading="

    const-string v1, ")"

    invoke-static {v6, v4, v0, v5, v1}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
