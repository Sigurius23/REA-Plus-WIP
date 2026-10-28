.class public final Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0017\n\u0002\u0010\u000e\n\u0000\u0008\u0081\u0008\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003JE\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0007H\u00c6\u0001J\u0014\u0010\u001d\u001a\u00020\t2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001f\u001a\u00020\u0005H\u00d6\u0081\u0004J\n\u0010 \u001a\u00020!H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0014R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0013\u00a8\u0006\""
    }
    d2 = {
        "Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;",
        "",
        "type",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;",
        "labelRes",
        "",
        "value",
        "Lcom/whoop/design/util/TextResource;",
        "isVisible",
        "",
        "isError",
        "errorMessage",
        "<init>",
        "(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;ILcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;)V",
        "getType",
        "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;",
        "getLabelRes",
        "()I",
        "getValue",
        "()Lcom/whoop/design/util/TextResource;",
        "()Z",
        "getErrorMessage",
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
        "toString",
        "",
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
.field private final errorMessage:Lcom/whoop/design/util/TextResource;

.field private final isError:Z

.field private final isVisible:Z

.field private final labelRes:I

.field private final type:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

.field private final value:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;ILcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorMessage"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->type:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    .line 3
    iput p2, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->labelRes:I

    .line 4
    iput-object p3, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->value:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-boolean p4, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->isVisible:Z

    .line 6
    iput-boolean p5, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->isError:Z

    .line 7
    iput-object p6, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->errorMessage:Lcom/whoop/design/util/TextResource;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;ILcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    const/4 p4, 0x1

    :cond_0
    move v4, p4

    and-int/lit8 p4, p7, 0x10

    if-eqz p4, :cond_1

    const/4 p5, 0x0

    :cond_1
    move v5, p5

    and-int/lit8 p4, p7, 0x20

    if-eqz p4, :cond_2

    .line 8
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p6

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v6, p6

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;ILcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;ILcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->type:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget p2, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->labelRes:I

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->value:Lcom/whoop/design/util/TextResource;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-boolean p4, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->isVisible:Z

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-boolean p5, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->isError:Z

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->errorMessage:Lcom/whoop/design/util/TextResource;

    :cond_5
    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->copy(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;ILcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;)Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->type:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->labelRes:I

    return v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->value:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->isVisible:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->isError:Z

    return v0
.end method

.method public final component6()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->errorMessage:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final copy(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;ILcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;)Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;
    .locals 8

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorMessage"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;ILcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->type:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->type:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->labelRes:I

    iget v3, p1, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->labelRes:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->value:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->value:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->isVisible:Z

    iget-boolean v3, p1, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->isVisible:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->isError:Z

    iget-boolean v3, p1, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->isError:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->errorMessage:Lcom/whoop/design/util/TextResource;

    iget-object p1, p1, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->errorMessage:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getErrorMessage()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->errorMessage:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getLabelRes()I
    .locals 1

    iget v0, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->labelRes:I

    return v0
.end method

.method public final getType()Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->type:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    return-object v0
.end method

.method public final getValue()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->value:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->type:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->labelRes:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->value:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->isVisible:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->isError:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->errorMessage:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isError()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->isError:Z

    return v0
.end method

.method public final isVisible()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->isVisible:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->type:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    iget v1, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->labelRes:I

    iget-object v2, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->value:Lcom/whoop/design/util/TextResource;

    iget-boolean v3, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->isVisible:Z

    iget-boolean v4, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->isError:Z

    iget-object v5, p0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->errorMessage:Lcom/whoop/design/util/TextResource;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "ClickableFieldConfig(type="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", labelRes="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", value="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isVisible="

    const-string v1, ", isError="

    invoke-static {v2, v0, v1, v6, v3}, Lte0/d;->w(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", errorMessage="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
