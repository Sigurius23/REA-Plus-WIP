.class public final Lcom/amplitude/android/engagement/types/ValidationConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/amplitude/android/engagement/types/ValidationConfig$$serializer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0087\u0008\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0013\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B%\u0008\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u00c7\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010 \u001a\u0004\u0008!\u0010\u0014\u00a8\u0006%"
    }
    d2 = {
        "Lcom/amplitude/android/engagement/types/ValidationConfig;",
        "",
        "Lcom/amplitude/android/engagement/types/Required;",
        "required",
        "<init>",
        "(Lcom/amplitude/android/engagement/types/Required;)V",
        "",
        "seen1",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/amplitude/android/engagement/types/Required;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self",
        "(Lcom/amplitude/android/engagement/types/ValidationConfig;Lzc3/c;Lyc3/g;)V",
        "component1",
        "()Lcom/amplitude/android/engagement/types/Required;",
        "copy",
        "(Lcom/amplitude/android/engagement/types/Required;)Lcom/amplitude/android/engagement/types/ValidationConfig;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/amplitude/android/engagement/types/Required;",
        "getRequired",
        "Companion",
        "$serializer",
        "com/amplitude/android/engagement/types/k2",
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

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/amplitude/android/engagement/types/k2;


# instance fields
.field private final required:Lcom/amplitude/android/engagement/types/Required;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/amplitude/android/engagement/types/k2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/amplitude/android/engagement/types/ValidationConfig;->Companion:Lcom/amplitude/android/engagement/types/k2;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/amplitude/android/engagement/types/ValidationConfig;-><init>(Lcom/amplitude/android/engagement/types/Required;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/amplitude/android/engagement/types/Required;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p1, p1, 0x1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/amplitude/android/engagement/types/ValidationConfig;->required:Lcom/amplitude/android/engagement/types/Required;

    return-void

    :cond_0
    iput-object p2, p0, Lcom/amplitude/android/engagement/types/ValidationConfig;->required:Lcom/amplitude/android/engagement/types/Required;

    return-void
.end method

.method public constructor <init>(Lcom/amplitude/android/engagement/types/Required;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/amplitude/android/engagement/types/ValidationConfig;->required:Lcom/amplitude/android/engagement/types/Required;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/amplitude/android/engagement/types/Required;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lcom/amplitude/android/engagement/types/ValidationConfig;-><init>(Lcom/amplitude/android/engagement/types/Required;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/amplitude/android/engagement/types/ValidationConfig;Lcom/amplitude/android/engagement/types/Required;ILjava/lang/Object;)Lcom/amplitude/android/engagement/types/ValidationConfig;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/amplitude/android/engagement/types/ValidationConfig;->required:Lcom/amplitude/android/engagement/types/Required;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/amplitude/android/engagement/types/ValidationConfig;->copy(Lcom/amplitude/android/engagement/types/Required;)Lcom/amplitude/android/engagement/types/ValidationConfig;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self(Lcom/amplitude/android/engagement/types/ValidationConfig;Lzc3/c;Lyc3/g;)V
    .locals 2

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/ValidationConfig;->required:Lcom/amplitude/android/engagement/types/Required;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/amplitude/android/engagement/types/Required$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/Required$$serializer;

    iget-object p0, p0, Lcom/amplitude/android/engagement/types/ValidationConfig;->required:Lcom/amplitude/android/engagement/types/Required;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Lcom/amplitude/android/engagement/types/Required;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/ValidationConfig;->required:Lcom/amplitude/android/engagement/types/Required;

    return-object v0
.end method

.method public final copy(Lcom/amplitude/android/engagement/types/Required;)Lcom/amplitude/android/engagement/types/ValidationConfig;
    .locals 1

    new-instance v0, Lcom/amplitude/android/engagement/types/ValidationConfig;

    invoke-direct {v0, p1}, Lcom/amplitude/android/engagement/types/ValidationConfig;-><init>(Lcom/amplitude/android/engagement/types/Required;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/amplitude/android/engagement/types/ValidationConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/amplitude/android/engagement/types/ValidationConfig;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/ValidationConfig;->required:Lcom/amplitude/android/engagement/types/Required;

    iget-object p1, p1, Lcom/amplitude/android/engagement/types/ValidationConfig;->required:Lcom/amplitude/android/engagement/types/Required;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getRequired()Lcom/amplitude/android/engagement/types/Required;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/ValidationConfig;->required:Lcom/amplitude/android/engagement/types/Required;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/ValidationConfig;->required:Lcom/amplitude/android/engagement/types/Required;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/Required;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ValidationConfig(required="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/ValidationConfig;->required:Lcom/amplitude/android/engagement/types/Required;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
