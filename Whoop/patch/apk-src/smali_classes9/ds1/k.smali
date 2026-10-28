.class public final Lds1/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u00002\u00020\u0001BE\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u0016\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0017\u001a\u0004\u0008\u001e\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0017\u001a\u0004\u0008\u001d\u0010\u0019R\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u0017\u001a\u0004\u0008\u001a\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u001f\u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lds1/k;",
        "",
        "",
        "isLoading",
        "Lds1/j;",
        "isError",
        "isSaving",
        "isJournalSaved",
        "isIntraday",
        "Lds1/e;",
        "isSuccess",
        "<init>",
        "(ZLds1/j;ZZZLds1/e;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Z",
        "d",
        "()Z",
        "b",
        "Lds1/j;",
        "()Lds1/j;",
        "c",
        "e",
        "f",
        "Lds1/e;",
        "()Lds1/e;",
        "journal_release"
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
.field private final a:Z

.field private final b:Lds1/j;

.field private final c:Z

.field private final d:Z

.field private final e:Z

.field private final f:Lds1/e;


# direct methods
.method public constructor <init>(ZLds1/j;ZZZLds1/e;)V
    .locals 1

    const-string v0, "isSuccess"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lds1/k;->a:Z

    .line 3
    iput-object p2, p0, Lds1/k;->b:Lds1/j;

    .line 4
    iput-boolean p3, p0, Lds1/k;->c:Z

    .line 5
    iput-boolean p4, p0, Lds1/k;->d:Z

    .line 6
    iput-boolean p5, p0, Lds1/k;->e:Z

    .line 7
    iput-object p6, p0, Lds1/k;->f:Lds1/e;

    return-void
.end method

.method public synthetic constructor <init>(ZLds1/j;ZZZLds1/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 31

    and-int/lit8 v0, p7, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move/from16 v0, p1

    :goto_0
    and-int/lit8 v2, p7, 0x2

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v3, p7, 0x4

    if-eqz v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    move/from16 v3, p3

    :goto_2
    and-int/lit8 v4, p7, 0x8

    if-eqz v4, :cond_3

    move v4, v1

    goto :goto_3

    :cond_3
    move/from16 v4, p4

    :goto_3
    and-int/lit8 v5, p7, 0x10

    if-eqz v5, :cond_4

    goto :goto_4

    :cond_4
    move/from16 v1, p5

    :goto_4
    and-int/lit8 v5, p7, 0x20

    if-eqz v5, :cond_5

    .line 8
    new-instance v6, Lds1/e;

    const v29, 0x3fffff

    const/16 v30, 0x0

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

    invoke-direct/range {v6 .. v30}, Lds1/e;-><init>(Lds1/c;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lds1/b;Lds1/d;ZZZLds1/o;Lds1/g;Lh91/b;Lds1/n;Lds1/f;ZZLm91/u;ZLjava/lang/String;Lcom/whoop/navigation/AiAction;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 p7, v6

    :goto_5
    move-object/from16 p1, p0

    move/from16 p2, v0

    move/from16 p6, v1

    move-object/from16 p3, v2

    move/from16 p4, v3

    move/from16 p5, v4

    goto :goto_6

    :cond_5
    move-object/from16 p7, p6

    goto :goto_5

    .line 9
    :goto_6
    invoke-direct/range {p1 .. p7}, Lds1/k;-><init>(ZLds1/j;ZZZLds1/e;)V

    return-void
.end method


# virtual methods
.method public final a()Lds1/j;
    .locals 1

    iget-object v0, p0, Lds1/k;->b:Lds1/j;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lds1/k;->e:Z

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lds1/k;->d:Z

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lds1/k;->a:Z

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lds1/k;->c:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lds1/k;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lds1/k;

    iget-boolean v1, p0, Lds1/k;->a:Z

    iget-boolean v3, p1, Lds1/k;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lds1/k;->b:Lds1/j;

    iget-object v3, p1, Lds1/k;->b:Lds1/j;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lds1/k;->c:Z

    iget-boolean v3, p1, Lds1/k;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lds1/k;->d:Z

    iget-boolean v3, p1, Lds1/k;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lds1/k;->e:Z

    iget-boolean v3, p1, Lds1/k;->e:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lds1/k;->f:Lds1/e;

    iget-object p1, p1, Lds1/k;->f:Lds1/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Lds1/e;
    .locals 1

    iget-object v0, p0, Lds1/k;->f:Lds1/e;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lds1/k;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lds1/k;->b:Lds1/j;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lds1/j;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lds1/k;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lds1/k;->d:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lds1/k;->e:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lds1/k;->f:Lds1/e;

    invoke-virtual {v1}, Lds1/e;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-boolean v0, p0, Lds1/k;->a:Z

    iget-object v1, p0, Lds1/k;->b:Lds1/j;

    iget-boolean v2, p0, Lds1/k;->c:Z

    iget-boolean v3, p0, Lds1/k;->d:Z

    iget-boolean v4, p0, Lds1/k;->e:Z

    iget-object v5, p0, Lds1/k;->f:Lds1/e;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "JournalViewState(isLoading="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isError="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isSaving="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isJournalSaved="

    const-string v1, ", isIntraday="

    invoke-static {v6, v2, v0, v3, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isSuccess="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
