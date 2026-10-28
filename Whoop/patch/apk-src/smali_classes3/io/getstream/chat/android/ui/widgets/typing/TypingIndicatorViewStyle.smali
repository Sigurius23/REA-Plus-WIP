.class public final Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/helper/ViewStyle;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;",
        "Lio/getstream/chat/android/ui/helper/ViewStyle;",
        "typingIndicatorAnimationView",
        "",
        "typingIndicatorUsersTextStyle",
        "Lio/getstream/chat/android/ui/font/TextStyle;",
        "<init>",
        "(ILio/getstream/chat/android/ui/font/TextStyle;)V",
        "getTypingIndicatorAnimationView",
        "()I",
        "getTypingIndicatorUsersTextStyle",
        "()Lio/getstream/chat/android/ui/font/TextStyle;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "Companion",
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


# static fields
.field public static final Companion:Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle$Companion;


# instance fields
.field private final typingIndicatorAnimationView:I

.field private final typingIndicatorUsersTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;->Companion:Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle$Companion;

    return-void
.end method

.method public constructor <init>(ILio/getstream/chat/android/ui/font/TextStyle;)V
    .locals 1

    const-string v0, "typingIndicatorUsersTextStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;->typingIndicatorAnimationView:I

    iput-object p2, p0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;->typingIndicatorUsersTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;ILio/getstream/chat/android/ui/font/TextStyle;ILjava/lang/Object;)Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;->typingIndicatorAnimationView:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;->typingIndicatorUsersTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;->copy(ILio/getstream/chat/android/ui/font/TextStyle;)Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;->typingIndicatorAnimationView:I

    return v0
.end method

.method public final component2()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;->typingIndicatorUsersTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final copy(ILio/getstream/chat/android/ui/font/TextStyle;)Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;
    .locals 1

    const-string v0, "typingIndicatorUsersTextStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;-><init>(ILio/getstream/chat/android/ui/font/TextStyle;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;

    iget v1, p0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;->typingIndicatorAnimationView:I

    iget v3, p1, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;->typingIndicatorAnimationView:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;->typingIndicatorUsersTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    iget-object p1, p1, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;->typingIndicatorUsersTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getTypingIndicatorAnimationView()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;->typingIndicatorAnimationView:I

    return v0
.end method

.method public final getTypingIndicatorUsersTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;->typingIndicatorUsersTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;->typingIndicatorAnimationView:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;->typingIndicatorUsersTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/font/TextStyle;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;->typingIndicatorAnimationView:I

    iget-object v1, p0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;->typingIndicatorUsersTextStyle:Lio/getstream/chat/android/ui/font/TextStyle;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "TypingIndicatorViewStyle(typingIndicatorAnimationView="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", typingIndicatorUsersTextStyle="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
