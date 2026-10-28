.class public final Lhu2/a$x;
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
    name = "x"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001d\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0008J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lhu2/a$x;",
        "Lhu2/a$c0;",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;",
        "undoSetPosition",
        "<init>",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;)V",
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
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "w",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;",
        "b",
        "()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;",
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
            "Lhu2/a$x;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final w:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhu2/a$x$a;

    invoke-direct {v0}, Lhu2/a$x$a;-><init>()V

    sput-object v0, Lhu2/a$x;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;)V
    .locals 1

    const-string v0, "undoSetPosition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhu2/a$x;->w:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    return-void
.end method


# virtual methods
.method public final b()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;
    .locals 1

    iget-object v0, p0, Lhu2/a$x;->w:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lhu2/a$x;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lhu2/a$x;

    iget-object v1, p0, Lhu2/a$x;->w:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    iget-object p1, p1, Lhu2/a$x;->w:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lhu2/a$x;->w:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lhu2/a$x;->w:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "UndoSet(undoSetPosition="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhu2/a$x;->w:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    invoke-virtual {v0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
