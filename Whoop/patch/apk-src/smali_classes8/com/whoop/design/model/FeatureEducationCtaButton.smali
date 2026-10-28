.class public final Lcom/whoop/design/model/FeatureEducationCtaButton;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0087\u0008\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u001e\u001a\u0004\u0008\u001f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010 \u001a\u0004\u0008!\u0010\u000f\u00a8\u0006\""
    }
    d2 = {
        "Lcom/whoop/design/model/FeatureEducationCtaButton;",
        "",
        "Ly81/f;",
        "color",
        "Lcom/whoop/design/util/TextResource;",
        "text",
        "Lcom/whoop/design/model/CtaNavigationDestination;",
        "clickAction",
        "<init>",
        "(Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/model/CtaNavigationDestination;)V",
        "component1",
        "()Ly81/f;",
        "component2",
        "()Lcom/whoop/design/util/TextResource;",
        "component3",
        "()Lcom/whoop/design/model/CtaNavigationDestination;",
        "copy",
        "(Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/model/CtaNavigationDestination;)Lcom/whoop/design/model/FeatureEducationCtaButton;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ly81/f;",
        "getColor",
        "Lcom/whoop/design/util/TextResource;",
        "getText",
        "Lcom/whoop/design/model/CtaNavigationDestination;",
        "getClickAction",
        "design_release"
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
.field private final clickAction:Lcom/whoop/design/model/CtaNavigationDestination;

.field private final color:Ly81/f;

.field private final text:Lcom/whoop/design/util/TextResource;


# direct methods
.method public constructor <init>(Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/model/CtaNavigationDestination;)V
    .locals 1

    const-string v0, "color"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/design/model/FeatureEducationCtaButton;->color:Ly81/f;

    iput-object p2, p0, Lcom/whoop/design/model/FeatureEducationCtaButton;->text:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lcom/whoop/design/model/FeatureEducationCtaButton;->clickAction:Lcom/whoop/design/model/CtaNavigationDestination;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/model/FeatureEducationCtaButton;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/model/CtaNavigationDestination;ILjava/lang/Object;)Lcom/whoop/design/model/FeatureEducationCtaButton;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/design/model/FeatureEducationCtaButton;->color:Ly81/f;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/design/model/FeatureEducationCtaButton;->text:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/design/model/FeatureEducationCtaButton;->clickAction:Lcom/whoop/design/model/CtaNavigationDestination;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/design/model/FeatureEducationCtaButton;->copy(Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/model/CtaNavigationDestination;)Lcom/whoop/design/model/FeatureEducationCtaButton;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/model/FeatureEducationCtaButton;->color:Ly81/f;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/model/FeatureEducationCtaButton;->text:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/model/CtaNavigationDestination;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/model/FeatureEducationCtaButton;->clickAction:Lcom/whoop/design/model/CtaNavigationDestination;

    return-object v0
.end method

.method public final copy(Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/model/CtaNavigationDestination;)Lcom/whoop/design/model/FeatureEducationCtaButton;
    .locals 1

    const-string v0, "color"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/design/model/FeatureEducationCtaButton;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/design/model/FeatureEducationCtaButton;-><init>(Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/model/CtaNavigationDestination;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/model/FeatureEducationCtaButton;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/model/FeatureEducationCtaButton;

    iget-object v1, p0, Lcom/whoop/design/model/FeatureEducationCtaButton;->color:Ly81/f;

    iget-object v3, p1, Lcom/whoop/design/model/FeatureEducationCtaButton;->color:Ly81/f;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/model/FeatureEducationCtaButton;->text:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/model/FeatureEducationCtaButton;->text:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/model/FeatureEducationCtaButton;->clickAction:Lcom/whoop/design/model/CtaNavigationDestination;

    iget-object p1, p1, Lcom/whoop/design/model/FeatureEducationCtaButton;->clickAction:Lcom/whoop/design/model/CtaNavigationDestination;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getClickAction()Lcom/whoop/design/model/CtaNavigationDestination;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/model/FeatureEducationCtaButton;->clickAction:Lcom/whoop/design/model/CtaNavigationDestination;

    return-object v0
.end method

.method public final getColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/model/FeatureEducationCtaButton;->color:Ly81/f;

    return-object v0
.end method

.method public final getText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/model/FeatureEducationCtaButton;->text:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/model/FeatureEducationCtaButton;->color:Ly81/f;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/model/FeatureEducationCtaButton;->text:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/design/model/FeatureEducationCtaButton;->clickAction:Lcom/whoop/design/model/CtaNavigationDestination;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/design/model/FeatureEducationCtaButton;->color:Ly81/f;

    iget-object v1, p0, Lcom/whoop/design/model/FeatureEducationCtaButton;->text:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcom/whoop/design/model/FeatureEducationCtaButton;->clickAction:Lcom/whoop/design/model/CtaNavigationDestination;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "FeatureEducationCtaButton(color="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", text="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", clickAction="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
