.class public final Lfr2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llr2/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001a\u001a\u0004\u0008\u001e\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u001a\u0010\u0008\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008\u001d\u0010%R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008!\u0010&\u001a\u0004\u0008\u0019\u0010\'R\u001a\u0010\u000c\u001a\u00020\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010(\u001a\u0004\u0008#\u0010\u0010\u00a8\u0006)"
    }
    d2 = {
        "Lfr2/b;",
        "Llr2/d;",
        "Lcom/whoop/design/util/TextResource;",
        "footerText",
        "footerSubText",
        "Lkd1/o;",
        "backgroundImage",
        "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;",
        "footerStyle",
        "Llq2/e;",
        "backgroundStyle",
        "",
        "userJourneyStepName",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/user/journey/model/UserJourneyFooterStyle;Llq2/e;Ljava/lang/String;)V",
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
        "Lcom/whoop/design/util/TextResource;",
        "g",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "f",
        "c",
        "Lkd1/o;",
        "e",
        "()Lkd1/o;",
        "d",
        "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;",
        "()Lcom/whoop/user/journey/model/UserJourneyFooterStyle;",
        "Llq2/e;",
        "()Llq2/e;",
        "Ljava/lang/String;",
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
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Lcom/whoop/design/util/TextResource;

.field private final c:Lkd1/o;

.field private final d:Lcom/whoop/user/journey/model/UserJourneyFooterStyle;

.field private final e:Llq2/e;

.field private final f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lkd1/o;->a:I

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/2addr v0, v1

    or-int/2addr v0, v1

    sput v0, Lfr2/b;->g:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/user/journey/model/UserJourneyFooterStyle;Llq2/e;Ljava/lang/String;)V
    .locals 1

    const-string v0, "footerText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "footerSubText"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundImage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "footerStyle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundStyle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userJourneyStepName"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfr2/b;->a:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lfr2/b;->b:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lfr2/b;->c:Lkd1/o;

    iput-object p4, p0, Lfr2/b;->d:Lcom/whoop/user/journey/model/UserJourneyFooterStyle;

    iput-object p5, p0, Lfr2/b;->e:Llq2/e;

    iput-object p6, p0, Lfr2/b;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Llq2/e;
    .locals 1

    iget-object v0, p0, Lfr2/b;->e:Llq2/e;

    return-object v0
.end method

.method public b()Lcom/whoop/user/journey/model/UserJourneyFooterStyle;
    .locals 1

    iget-object v0, p0, Lfr2/b;->d:Lcom/whoop/user/journey/model/UserJourneyFooterStyle;

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

    iget-object v0, p0, Lfr2/b;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Lkd1/o;
    .locals 1

    iget-object v0, p0, Lfr2/b;->c:Lkd1/o;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lfr2/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lfr2/b;

    iget-object v1, p0, Lfr2/b;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lfr2/b;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lfr2/b;->b:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lfr2/b;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lfr2/b;->c:Lkd1/o;

    iget-object v3, p1, Lfr2/b;->c:Lkd1/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lfr2/b;->d:Lcom/whoop/user/journey/model/UserJourneyFooterStyle;

    iget-object v3, p1, Lfr2/b;->d:Lcom/whoop/user/journey/model/UserJourneyFooterStyle;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lfr2/b;->e:Llq2/e;

    iget-object v3, p1, Lfr2/b;->e:Llq2/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lfr2/b;->f:Ljava/lang/String;

    iget-object p1, p1, Lfr2/b;->f:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lfr2/b;->b:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final g()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lfr2/b;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lfr2/b;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lfr2/b;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lfr2/b;->c:Lkd1/o;

    invoke-static {v2, v0, v1}, Lq63/c;->c(Lkd1/o;II)I

    move-result v0

    iget-object v2, p0, Lfr2/b;->d:Lcom/whoop/user/journey/model/UserJourneyFooterStyle;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lfr2/b;->e:Llq2/e;

    invoke-static {v0, v2, v1}, Lq63/c;->d(Llq2/e;II)I

    move-result v0

    iget-object v1, p0, Lfr2/b;->f:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lfr2/b;->a:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lfr2/b;->b:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lfr2/b;->c:Lkd1/o;

    iget-object v3, p0, Lfr2/b;->d:Lcom/whoop/user/journey/model/UserJourneyFooterStyle;

    iget-object v4, p0, Lfr2/b;->e:Llq2/e;

    iget-object v5, p0, Lfr2/b;->f:Ljava/lang/String;

    const-string v6, ", footerSubText="

    const-string v7, ", backgroundImage="

    const-string v8, "WirIntroStepState(footerText="

    invoke-static {v8, v0, v6, v1, v7}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", footerStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", backgroundStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", userJourneyStepName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
