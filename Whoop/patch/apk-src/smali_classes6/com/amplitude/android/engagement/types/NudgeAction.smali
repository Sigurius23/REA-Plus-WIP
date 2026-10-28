.class public final Lcom/amplitude/android/engagement/types/NudgeAction;
.super Lcom/amplitude/android/engagement/types/Action;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/amplitude/android/engagement/types/NudgeAction$$serializer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0087\u0008\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B#\u0008\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u00c7\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u0013J\u001a\u0010\u001d\u001a\u00020\u001c2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u001f\u001a\u0004\u0008 \u0010\u0013\u00a8\u0006$"
    }
    d2 = {
        "Lcom/amplitude/android/engagement/types/NudgeAction;",
        "Lcom/amplitude/android/engagement/types/Action;",
        "",
        "value",
        "<init>",
        "(I)V",
        "seen1",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self",
        "(Lcom/amplitude/android/engagement/types/NudgeAction;Lzc3/c;Lyc3/g;)V",
        "component1",
        "()I",
        "copy",
        "(I)Lcom/amplitude/android/engagement/types/NudgeAction;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getValue",
        "Companion",
        "$serializer",
        "com/amplitude/android/engagement/types/r0",
        "engagement_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/h;
    value = "nudge"
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/amplitude/android/engagement/types/r0;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/amplitude/android/engagement/types/r0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/amplitude/android/engagement/types/NudgeAction;->Companion:Lcom/amplitude/android/engagement/types/r0;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/amplitude/android/engagement/types/Action;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p1, p0, Lcom/amplitude/android/engagement/types/NudgeAction;->value:I

    return-void
.end method

.method public synthetic constructor <init>(IILkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2
    .annotation runtime Ll83/c;
    .end annotation

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/amplitude/android/engagement/types/NudgeAction$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/NudgeAction$$serializer;

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/NudgeAction$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0, p1, p3}, Lcom/amplitude/android/engagement/types/Action;-><init>(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V

    iput p2, p0, Lcom/amplitude/android/engagement/types/NudgeAction;->value:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/amplitude/android/engagement/types/NudgeAction;IILjava/lang/Object;)Lcom/amplitude/android/engagement/types/NudgeAction;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget p1, p0, Lcom/amplitude/android/engagement/types/NudgeAction;->value:I

    :cond_0
    invoke-virtual {p0, p1}, Lcom/amplitude/android/engagement/types/NudgeAction;->copy(I)Lcom/amplitude/android/engagement/types/NudgeAction;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self(Lcom/amplitude/android/engagement/types/NudgeAction;Lzc3/c;Lyc3/g;)V
    .locals 1

    invoke-static {p0, p1, p2}, Lcom/amplitude/android/engagement/types/Action;->write$Self(Lcom/amplitude/android/engagement/types/Action;Lzc3/c;Lyc3/g;)V

    const/4 v0, 0x0

    iget p0, p0, Lcom/amplitude/android/engagement/types/NudgeAction;->value:I

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/amplitude/android/engagement/types/NudgeAction;->value:I

    return v0
.end method

.method public final copy(I)Lcom/amplitude/android/engagement/types/NudgeAction;
    .locals 1

    new-instance v0, Lcom/amplitude/android/engagement/types/NudgeAction;

    invoke-direct {v0, p1}, Lcom/amplitude/android/engagement/types/NudgeAction;-><init>(I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/amplitude/android/engagement/types/NudgeAction;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/amplitude/android/engagement/types/NudgeAction;

    iget v1, p0, Lcom/amplitude/android/engagement/types/NudgeAction;->value:I

    iget p1, p1, Lcom/amplitude/android/engagement/types/NudgeAction;->value:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getValue()I
    .locals 1

    iget v0, p0, Lcom/amplitude/android/engagement/types/NudgeAction;->value:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/amplitude/android/engagement/types/NudgeAction;->value:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "NudgeAction(value="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/amplitude/android/engagement/types/NudgeAction;->value:I

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Ldc/b;->r(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
