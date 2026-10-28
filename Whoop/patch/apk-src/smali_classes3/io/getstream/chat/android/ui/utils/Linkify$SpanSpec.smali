.class final Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/utils/Linkify;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SpanSpec"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0082\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000c\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;",
        "",
        "span",
        "Landroid/text/style/ClickableSpan;",
        "start",
        "",
        "end",
        "<init>",
        "(Landroid/text/style/ClickableSpan;II)V",
        "getSpan",
        "()Landroid/text/style/ClickableSpan;",
        "getStart",
        "()I",
        "getEnd",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final end:I

.field private final span:Landroid/text/style/ClickableSpan;

.field private final start:I


# direct methods
.method public constructor <init>(Landroid/text/style/ClickableSpan;II)V
    .locals 1

    const-string v0, "span"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->span:Landroid/text/style/ClickableSpan;

    iput p2, p0, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->start:I

    iput p3, p0, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->end:I

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;Landroid/text/style/ClickableSpan;IIILjava/lang/Object;)Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->span:Landroid/text/style/ClickableSpan;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->start:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->end:I

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->copy(Landroid/text/style/ClickableSpan;II)Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Landroid/text/style/ClickableSpan;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->span:Landroid/text/style/ClickableSpan;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->start:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->end:I

    return v0
.end method

.method public final copy(Landroid/text/style/ClickableSpan;II)Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;
    .locals 1

    const-string v0, "span"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;-><init>(Landroid/text/style/ClickableSpan;II)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;

    iget-object v1, p0, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->span:Landroid/text/style/ClickableSpan;

    iget-object v3, p1, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->span:Landroid/text/style/ClickableSpan;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->start:I

    iget v3, p1, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->start:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->end:I

    iget p1, p1, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->end:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getEnd()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->end:I

    return v0
.end method

.method public final getSpan()Landroid/text/style/ClickableSpan;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->span:Landroid/text/style/ClickableSpan;

    return-object v0
.end method

.method public final getStart()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->start:I

    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->span:Landroid/text/style/ClickableSpan;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->start:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->end:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->span:Landroid/text/style/ClickableSpan;

    iget v1, p0, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->start:I

    iget v2, p0, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->end:I

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "SpanSpec(span="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", start="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", end="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
