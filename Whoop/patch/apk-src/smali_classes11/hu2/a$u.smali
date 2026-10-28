.class public final Lhu2/a$u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhu2/a$c0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhu2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "u"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u000cJ\u001a\u0010\u0019\u001a\u00020\u00062\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Lhu2/a$u;",
        "Lhu2/a$c0;",
        "Lcom/whoop/weightlifting/data/domain/StrapLocation;",
        "strapLocation",
        "Lcom/whoop/weightlifting/data/domain/StrapLaterality;",
        "strapLaterality",
        "",
        "isQuickStart",
        "<init>",
        "(Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Z)V",
        "",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "Ll83/a0;",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "w",
        "Lcom/whoop/weightlifting/data/domain/StrapLocation;",
        "f",
        "()Lcom/whoop/weightlifting/data/domain/StrapLocation;",
        "x",
        "Lcom/whoop/weightlifting/data/domain/StrapLaterality;",
        "b",
        "()Lcom/whoop/weightlifting/data/domain/StrapLaterality;",
        "y",
        "Z",
        "h",
        "()Z",
        "weightlifting_release"
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
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lhu2/a$u;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final w:Lcom/whoop/weightlifting/data/domain/StrapLocation;

.field private final x:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

.field private final y:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhu2/a$u$a;

    invoke-direct {v0}, Lhu2/a$u$a;-><init>()V

    sput-object v0, Lhu2/a$u;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Z)V
    .locals 1

    const-string v0, "strapLocation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapLaterality"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhu2/a$u;->w:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    iput-object p2, p0, Lhu2/a$u;->x:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    iput-boolean p3, p0, Lhu2/a$u;->y:Z

    return-void
.end method


# virtual methods
.method public final b()Lcom/whoop/weightlifting/data/domain/StrapLaterality;
    .locals 1

    iget-object v0, p0, Lhu2/a$u;->x:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lhu2/a$u;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lhu2/a$u;

    iget-object v1, p0, Lhu2/a$u;->w:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    iget-object v3, p1, Lhu2/a$u;->w:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lhu2/a$u;->x:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    iget-object v3, p1, Lhu2/a$u;->x:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lhu2/a$u;->y:Z

    iget-boolean p1, p1, Lhu2/a$u;->y:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final f()Lcom/whoop/weightlifting/data/domain/StrapLocation;
    .locals 1

    iget-object v0, p0, Lhu2/a$u;->w:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    return-object v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Lhu2/a$u;->y:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lhu2/a$u;->w:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lhu2/a$u;->x:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lhu2/a$u;->y:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lhu2/a$u;->w:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    iget-object v1, p0, Lhu2/a$u;->x:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    iget-boolean v2, p0, Lhu2/a$u;->y:Z

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "StartWorkout(strapLocation="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", strapLaterality="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isQuickStart="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lhu2/a$u;->w:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lhu2/a$u;->x:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lhu2/a$u;->y:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
