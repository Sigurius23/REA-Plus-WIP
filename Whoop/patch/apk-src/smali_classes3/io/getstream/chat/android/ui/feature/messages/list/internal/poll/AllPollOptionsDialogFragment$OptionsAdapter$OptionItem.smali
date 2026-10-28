.class final Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OptionItem"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0012\n\u0002\u0010\u000e\n\u0000\u0008\u0082\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u000fR\u0011\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000f\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;",
        "",
        "option",
        "Lio/getstream/chat/android/models/Option;",
        "votes",
        "",
        "isVotedByUser",
        "",
        "readonly",
        "<init>",
        "(Lio/getstream/chat/android/models/Option;IZZ)V",
        "getOption",
        "()Lio/getstream/chat/android/models/Option;",
        "getVotes",
        "()I",
        "()Z",
        "getReadonly",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
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
.field private final isVotedByUser:Z

.field private final option:Lio/getstream/chat/android/models/Option;

.field private final readonly:Z

.field private final votes:I


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Option;IZZ)V
    .locals 1

    const-string v0, "option"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->option:Lio/getstream/chat/android/models/Option;

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->votes:I

    iput-boolean p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->isVotedByUser:Z

    iput-boolean p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->readonly:Z

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;Lio/getstream/chat/android/models/Option;IZZILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->option:Lio/getstream/chat/android/models/Option;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->votes:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->isVotedByUser:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->readonly:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->copy(Lio/getstream/chat/android/models/Option;IZZ)Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/Option;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->option:Lio/getstream/chat/android/models/Option;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->votes:I

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->isVotedByUser:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->readonly:Z

    return v0
.end method

.method public final copy(Lio/getstream/chat/android/models/Option;IZZ)Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;
    .locals 1

    const-string v0, "option"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;-><init>(Lio/getstream/chat/android/models/Option;IZZ)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->option:Lio/getstream/chat/android/models/Option;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->option:Lio/getstream/chat/android/models/Option;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->votes:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->votes:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->isVotedByUser:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->isVotedByUser:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->readonly:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->readonly:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getOption()Lio/getstream/chat/android/models/Option;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->option:Lio/getstream/chat/android/models/Option;

    return-object v0
.end method

.method public final getReadonly()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->readonly:Z

    return v0
.end method

.method public final getVotes()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->votes:I

    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->option:Lio/getstream/chat/android/models/Option;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Option;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->votes:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->isVotedByUser:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->readonly:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isVotedByUser()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->isVotedByUser:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->option:Lio/getstream/chat/android/models/Option;

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->votes:I

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->isVotedByUser:Z

    iget-boolean v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;->readonly:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "OptionItem(option="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", votes="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", isVotedByUser="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", readonly="

    const-string v1, ")"

    invoke-static {v4, v2, v0, v3, v1}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
