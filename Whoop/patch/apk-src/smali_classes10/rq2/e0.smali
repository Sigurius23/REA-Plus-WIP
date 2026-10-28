.class public final Lrq2/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llr2/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001d\u001a\u0004\u0008\u0019\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\u0010R\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010 \u001a\u0004\u0008\"\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010\'\u001a\u0004\u0008#\u0010(\u00a8\u0006)"
    }
    d2 = {
        "Lrq2/e0;",
        "Llr2/d;",
        "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;",
        "footerStyle",
        "Llq2/e;",
        "backgroundStyle",
        "",
        "userJourneyStepName",
        "text",
        "",
        "fontSize",
        "Lkd1/o;",
        "backgroundImage",
        "<init>",
        "(Lcom/whoop/user/journey/model/UserJourneyFooterStyle;Llq2/e;Ljava/lang/String;Ljava/lang/String;FLkd1/o;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;",
        "b",
        "()Lcom/whoop/user/journey/model/UserJourneyFooterStyle;",
        "Llq2/e;",
        "()Llq2/e;",
        "c",
        "Ljava/lang/String;",
        "d",
        "g",
        "e",
        "F",
        "f",
        "()F",
        "Lkd1/o;",
        "()Lkd1/o;",
        "user-journey_release"
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
.field public static final g:I


# instance fields
.field private final a:Lcom/whoop/user/journey/model/UserJourneyFooterStyle;

.field private final b:Llq2/e;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:F

.field private final f:Lkd1/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lkd1/o;->a:I

    sput v0, Lrq2/e0;->g:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/user/journey/model/UserJourneyFooterStyle;Llq2/e;Ljava/lang/String;Ljava/lang/String;FLkd1/o;)V
    .locals 1

    const-string v0, "footerStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userJourneyStepName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lrq2/e0;->a:Lcom/whoop/user/journey/model/UserJourneyFooterStyle;

    .line 3
    iput-object p2, p0, Lrq2/e0;->b:Llq2/e;

    .line 4
    iput-object p3, p0, Lrq2/e0;->c:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lrq2/e0;->d:Ljava/lang/String;

    .line 6
    iput p5, p0, Lrq2/e0;->e:F

    .line 7
    iput-object p6, p0, Lrq2/e0;->f:Lkd1/o;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/user/journey/model/UserJourneyFooterStyle;Llq2/e;Ljava/lang/String;Ljava/lang/String;FLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_0

    const/high16 p5, 0x41700000    # 15.0f

    :cond_0
    move v5, p5

    and-int/lit8 p5, p7, 0x20

    if-eqz p5, :cond_1

    const/4 p6, 0x0

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p6

    .line 8
    invoke-direct/range {v0 .. v6}, Lrq2/e0;-><init>(Lcom/whoop/user/journey/model/UserJourneyFooterStyle;Llq2/e;Ljava/lang/String;Ljava/lang/String;FLkd1/o;)V

    return-void
.end method


# virtual methods
.method public a()Llq2/e;
    .locals 1

    iget-object v0, p0, Lrq2/e0;->b:Llq2/e;

    return-object v0
.end method

.method public b()Lcom/whoop/user/journey/model/UserJourneyFooterStyle;
    .locals 1

    iget-object v0, p0, Lrq2/e0;->a:Lcom/whoop/user/journey/model/UserJourneyFooterStyle;

    return-object v0
.end method

.method public bridge c()I
    .locals 1

    invoke-super {p0}, Llr2/d;->c()I

    move-result v0

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lrq2/e0;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Lkd1/o;
    .locals 1

    iget-object v0, p0, Lrq2/e0;->f:Lkd1/o;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lrq2/e0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lrq2/e0;

    iget-object v1, p0, Lrq2/e0;->a:Lcom/whoop/user/journey/model/UserJourneyFooterStyle;

    iget-object v3, p1, Lrq2/e0;->a:Lcom/whoop/user/journey/model/UserJourneyFooterStyle;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lrq2/e0;->b:Llq2/e;

    iget-object v3, p1, Lrq2/e0;->b:Llq2/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lrq2/e0;->c:Ljava/lang/String;

    iget-object v3, p1, Lrq2/e0;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lrq2/e0;->d:Ljava/lang/String;

    iget-object v3, p1, Lrq2/e0;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lrq2/e0;->e:F

    iget v3, p1, Lrq2/e0;->e:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lrq2/e0;->f:Lkd1/o;

    iget-object p1, p1, Lrq2/e0;->f:Lkd1/o;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()F
    .locals 1

    iget v0, p0, Lrq2/e0;->e:F

    return v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lrq2/e0;->d:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lrq2/e0;->a:Lcom/whoop/user/journey/model/UserJourneyFooterStyle;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lrq2/e0;->b:Llq2/e;

    invoke-static {v2, v0, v1}, Lq63/c;->d(Llq2/e;II)I

    move-result v0

    iget-object v2, p0, Lrq2/e0;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lrq2/e0;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lrq2/e0;->e:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v1, p0, Lrq2/e0;->f:Lkd1/o;

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
    .locals 8

    iget-object v0, p0, Lrq2/e0;->a:Lcom/whoop/user/journey/model/UserJourneyFooterStyle;

    iget-object v1, p0, Lrq2/e0;->b:Llq2/e;

    iget-object v2, p0, Lrq2/e0;->c:Ljava/lang/String;

    iget-object v3, p0, Lrq2/e0;->d:Ljava/lang/String;

    iget v4, p0, Lrq2/e0;->e:F

    iget-object v5, p0, Lrq2/e0;->f:Lkd1/o;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "PillarIntroStepState(footerStyle="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", backgroundStyle="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", userJourneyStepName="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", text="

    const-string v1, ", fontSize="

    invoke-static {v6, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", backgroundImage="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
