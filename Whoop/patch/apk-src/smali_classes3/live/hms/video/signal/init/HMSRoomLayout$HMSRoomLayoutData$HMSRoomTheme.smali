.class public final Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "HMSRoomTheme"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0001\u001bB%\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J2\u0010\u0014\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000c\u001a\u0004\u0008\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001c"
    }
    d2 = {
        "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;",
        "",
        "default",
        "",
        "name",
        "",
        "palette",
        "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;",
        "<init>",
        "(Ljava/lang/Boolean;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;)V",
        "getDefault",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getName",
        "()Ljava/lang/String;",
        "getPalette",
        "()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;",
        "component1",
        "component2",
        "component3",
        "copy",
        "(Ljava/lang/Boolean;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;)Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "HMSColorPalette",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final default:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "default"
    .end annotation
.end field

.field private final name:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "name"
    .end annotation
.end field

.field private final palette:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "palette"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Boolean;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->default:Ljava/lang/Boolean;

    iput-object p2, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->name:Ljava/lang/String;

    iput-object p3, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->palette:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;Ljava/lang/Boolean;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;ILjava/lang/Object;)Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->default:Ljava/lang/Boolean;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->name:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->palette:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->copy(Ljava/lang/Boolean;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;)Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->default:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->palette:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;

    return-object v0
.end method

.method public final copy(Ljava/lang/Boolean;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;)Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;
    .locals 1

    new-instance v0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;

    invoke-direct {v0, p1, p2, p3}, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;-><init>(Ljava/lang/Boolean;Ljava/lang/String;Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;

    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->default:Ljava/lang/Boolean;

    iget-object v3, p1, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->default:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->name:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->palette:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;

    iget-object p1, p1, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->palette:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getDefault()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->default:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getPalette()Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->palette:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->default:Ljava/lang/Boolean;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->name:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->palette:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HMSRoomTheme(default="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->default:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", palette="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme;->palette:Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$HMSRoomTheme$HMSColorPalette;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
