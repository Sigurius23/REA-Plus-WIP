.class public final Lcom/whoop/entitlements/EntitlementResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/entitlements/EntitlementResponse$$serializer;,
        Lcom/whoop/entitlements/EntitlementResponse$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B#\u0008\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0004\u0010\nJ\'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00022\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010 \u001a\u0004\u0008!\u0010\u0015\u00a8\u0006%"
    }
    d2 = {
        "Lcom/whoop/entitlements/EntitlementResponse;",
        "",
        "",
        "entitled",
        "<init>",
        "(Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$entitlements_release",
        "(Lcom/whoop/entitlements/EntitlementResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Z",
        "copy",
        "(Z)Lcom/whoop/entitlements/EntitlementResponse;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "getEntitled",
        "Companion",
        "$serializer",
        "a",
        "entitlements_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final Companion:Lcom/whoop/entitlements/EntitlementResponse$a;


# instance fields
.field private final entitled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/entitlements/EntitlementResponse$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/entitlements/EntitlementResponse$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/entitlements/EntitlementResponse;->Companion:Lcom/whoop/entitlements/EntitlementResponse$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/whoop/entitlements/EntitlementResponse;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p1, p1, 0x1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/whoop/entitlements/EntitlementResponse;->entitled:Z

    return-void

    :cond_0
    iput-boolean p2, p0, Lcom/whoop/entitlements/EntitlementResponse;->entitled:Z

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-boolean p1, p0, Lcom/whoop/entitlements/EntitlementResponse;->entitled:Z

    return-void
.end method

.method public synthetic constructor <init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lcom/whoop/entitlements/EntitlementResponse;-><init>(Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/entitlements/EntitlementResponse;ZILjava/lang/Object;)Lcom/whoop/entitlements/EntitlementResponse;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-boolean p1, p0, Lcom/whoop/entitlements/EntitlementResponse;->entitled:Z

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/entitlements/EntitlementResponse;->copy(Z)Lcom/whoop/entitlements/EntitlementResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$entitlements_release(Lcom/whoop/entitlements/EntitlementResponse;Lzc3/c;Lyc3/g;)V
    .locals 2

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lcom/whoop/entitlements/EntitlementResponse;->entitled:Z

    if-eqz v1, :cond_1

    :goto_0
    iget-boolean p0, p0, Lcom/whoop/entitlements/EntitlementResponse;->entitled:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/entitlements/EntitlementResponse;->entitled:Z

    return v0
.end method

.method public final copy(Z)Lcom/whoop/entitlements/EntitlementResponse;
    .locals 1

    new-instance v0, Lcom/whoop/entitlements/EntitlementResponse;

    invoke-direct {v0, p1}, Lcom/whoop/entitlements/EntitlementResponse;-><init>(Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/entitlements/EntitlementResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/entitlements/EntitlementResponse;

    iget-boolean v1, p0, Lcom/whoop/entitlements/EntitlementResponse;->entitled:Z

    iget-boolean p1, p1, Lcom/whoop/entitlements/EntitlementResponse;->entitled:Z

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getEntitled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/entitlements/EntitlementResponse;->entitled:Z

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/entitlements/EntitlementResponse;->entitled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-boolean v0, p0, Lcom/whoop/entitlements/EntitlementResponse;->entitled:Z

    const-string v1, "EntitlementResponse(entitled="

    const-string v2, ")"

    invoke-static {v1, v2, v0}, Lc13/a;->k(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
