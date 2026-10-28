.class public final Lcom/whoop/profile/view/edit/form/FieldState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0016\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003JE\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u0007H\u00c6\u0001J\u0014\u0010\u001b\u001a\u00020\u00072\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eH\u00d6\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0011R\u0011\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0011\u00a8\u0006 "
    }
    d2 = {
        "Lcom/whoop/profile/view/edit/form/FieldState;",
        "",
        "value",
        "",
        "error",
        "Lcom/whoop/design/util/TextResource;",
        "isFocused",
        "",
        "hasBeenValidated",
        "hasBeenInteractedWith",
        "isValidating",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZ)V",
        "getValue",
        "()Ljava/lang/String;",
        "getError",
        "()Lcom/whoop/design/util/TextResource;",
        "()Z",
        "getHasBeenValidated",
        "getHasBeenInteractedWith",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "profile_release"
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


# instance fields
.field private final error:Lcom/whoop/design/util/TextResource;

.field private final hasBeenInteractedWith:Z

.field private final hasBeenValidated:Z

.field private final isFocused:Z

.field private final isValidating:Z

.field private final value:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/profile/view/edit/form/FieldState;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZ)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/profile/view/edit/form/FieldState;->value:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/whoop/profile/view/edit/form/FieldState;->error:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-boolean p3, p0, Lcom/whoop/profile/view/edit/form/FieldState;->isFocused:Z

    .line 5
    iput-boolean p4, p0, Lcom/whoop/profile/view/edit/form/FieldState;->hasBeenValidated:Z

    .line 6
    iput-boolean p5, p0, Lcom/whoop/profile/view/edit/form/FieldState;->hasBeenInteractedWith:Z

    .line 7
    iput-boolean p6, p0, Lcom/whoop/profile/view/edit/form/FieldState;->isValidating:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_0

    .line 8
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p7, 0x4

    const/4 p8, 0x0

    if-eqz p2, :cond_1

    move v3, p8

    goto :goto_0

    :cond_1
    move v3, p3

    :goto_0
    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_2

    move v4, p8

    goto :goto_1

    :cond_2
    move v4, p4

    :goto_1
    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_3

    move v5, p8

    goto :goto_2

    :cond_3
    move v5, p5

    :goto_2
    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_4

    move v6, p8

    :goto_3
    move-object v0, p0

    move-object v1, p1

    goto :goto_4

    :cond_4
    move v6, p6

    goto :goto_3

    .line 9
    :goto_4
    invoke-direct/range {v0 .. v6}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/view/edit/form/FieldState;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/view/edit/form/FieldState;->value:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/profile/view/edit/form/FieldState;->error:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-boolean p3, p0, Lcom/whoop/profile/view/edit/form/FieldState;->isFocused:Z

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-boolean p4, p0, Lcom/whoop/profile/view/edit/form/FieldState;->hasBeenValidated:Z

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-boolean p5, p0, Lcom/whoop/profile/view/edit/form/FieldState;->hasBeenInteractedWith:Z

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-boolean p6, p0, Lcom/whoop/profile/view/edit/form/FieldState;->isValidating:Z

    :cond_5
    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/profile/view/edit/form/FieldState;->copy(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZ)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/FieldState;->value:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/FieldState;->error:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/view/edit/form/FieldState;->isFocused:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/view/edit/form/FieldState;->hasBeenValidated:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/view/edit/form/FieldState;->hasBeenInteractedWith:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/view/edit/form/FieldState;->isValidating:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZ)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 8

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/profile/view/edit/form/FieldState;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/view/edit/form/FieldState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/FieldState;->value:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/form/FieldState;->value:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/FieldState;->error:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/form/FieldState;->error:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/profile/view/edit/form/FieldState;->isFocused:Z

    iget-boolean v3, p1, Lcom/whoop/profile/view/edit/form/FieldState;->isFocused:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/profile/view/edit/form/FieldState;->hasBeenValidated:Z

    iget-boolean v3, p1, Lcom/whoop/profile/view/edit/form/FieldState;->hasBeenValidated:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/profile/view/edit/form/FieldState;->hasBeenInteractedWith:Z

    iget-boolean v3, p1, Lcom/whoop/profile/view/edit/form/FieldState;->hasBeenInteractedWith:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/profile/view/edit/form/FieldState;->isValidating:Z

    iget-boolean p1, p1, Lcom/whoop/profile/view/edit/form/FieldState;->isValidating:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getError()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/FieldState;->error:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getHasBeenInteractedWith()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/view/edit/form/FieldState;->hasBeenInteractedWith:Z

    return v0
.end method

.method public final getHasBeenValidated()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/view/edit/form/FieldState;->hasBeenValidated:Z

    return v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/FieldState;->value:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/FieldState;->value:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/profile/view/edit/form/FieldState;->error:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/profile/view/edit/form/FieldState;->isFocused:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/profile/view/edit/form/FieldState;->hasBeenValidated:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/profile/view/edit/form/FieldState;->hasBeenInteractedWith:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/profile/view/edit/form/FieldState;->isValidating:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isFocused()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/view/edit/form/FieldState;->isFocused:Z

    return v0
.end method

.method public final isValidating()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/view/edit/form/FieldState;->isValidating:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/FieldState;->value:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/FieldState;->error:Lcom/whoop/design/util/TextResource;

    iget-boolean v2, p0, Lcom/whoop/profile/view/edit/form/FieldState;->isFocused:Z

    iget-boolean v3, p0, Lcom/whoop/profile/view/edit/form/FieldState;->hasBeenValidated:Z

    iget-boolean v4, p0, Lcom/whoop/profile/view/edit/form/FieldState;->hasBeenInteractedWith:Z

    iget-boolean v5, p0, Lcom/whoop/profile/view/edit/form/FieldState;->isValidating:Z

    const-string v6, ", error="

    const-string v7, ", isFocused="

    const-string v8, "FieldState(value="

    invoke-static {v8, v0, v6, v1, v7}, Lq63/c;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", hasBeenValidated="

    const-string v6, ", hasBeenInteractedWith="

    invoke-static {v0, v2, v1, v3, v6}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", isValidating="

    const-string v2, ")"

    invoke-static {v0, v4, v1, v5, v2}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
