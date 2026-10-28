.class public final Lio/getstream/chat/android/ui/utils/MessageEllipsizeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "MAX_LINE_BREAKS",
        "",
        "ELLIPSIS",
        "",
        "ellipsizeText",
        "text",
        "textLimit",
        "maxLineBreaks",
        "textIsTooTall",
        "",
        "parseTooTallText",
        "stream-chat-android-ui-components_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final ELLIPSIS:Ljava/lang/String; = "..."

.field private static final MAX_LINE_BREAKS:I = 0x8


# direct methods
.method public static final ellipsizeText(Ljava/lang/String;II)Ljava/lang/String;
    .locals 2

    const-string v0, "text"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, p1, :cond_0

    new-instance p2, Li93/j;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p2, v0, p1, v1}, Li93/h;-><init>(III)V

    invoke-static {p0, p2}, Lyb3/r;->C0(Ljava/lang/String;Li93/j;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "..."

    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0, p2}, Lio/getstream/chat/android/ui/utils/MessageEllipsizeKt;->textIsTooTall(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0, p2}, Lio/getstream/chat/android/ui/utils/MessageEllipsizeKt;->parseTooTallText(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static synthetic ellipsizeText$default(Ljava/lang/String;IIILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    const/16 p2, 0x8

    :cond_0
    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/utils/MessageEllipsizeKt;->ellipsizeText(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final parseTooTallText(Ljava/lang/String;I)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ge v2, v3, :cond_1

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v4, 0xa

    if-ne v3, v4, :cond_0

    add-int/lit8 v1, v1, 0x1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const-string p0, "...\n"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final textIsTooTall(Ljava/lang/String;I)Z
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v1, v3, :cond_1

    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0xa

    if-ne v3, v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-le v2, p1, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    return v0
.end method
